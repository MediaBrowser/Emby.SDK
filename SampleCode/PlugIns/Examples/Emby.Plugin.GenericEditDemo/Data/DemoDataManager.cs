// <copyright file="DemoDataManager.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Data
{
    using System;
    using Emby.Plugin.GenericEditDemo.Data.Demoset1;
    using Emby.Plugin.GenericEditDemo.Data.Demoset1.Demos;
    using Emby.Plugin.GenericEditDemo.Data.Demoset2;
    using Emby.Plugin.GenericEditDemo.Data.Demoset2.Demos;
    using Emby.Web.GenericEdit;
    using MediaBrowser.Controller;
    using MediaBrowser.Controller.Library;
    using MediaBrowser.Model.Activity;

    internal class DemoDataManager
    {
        private readonly IActivityManager activityManager;
        private readonly ILibraryManager libraryManager;
        private readonly IServerApplicationHost applicationHost;

        // DemoSet 1
        private BasicInput basicInput = new BasicInput();
        private SelectInput selectInput = new SelectInput();
        private ControlStates controlStates = new ControlStates();
        private Constraints constraints = new Constraints();
        private Nesting nesting = new Nesting();
        private Conditions conditions = new Conditions();
        private Validation validation = new Validation();

        // DemoSet 2
        private Lists lists = new Lists();
        private DataGrid1 dataGrid1 = new DataGrid1();
        private DataGrid2 dataGrid2 = new DataGrid2();

        /// <summary>Initializes a new instance of the <see cref="T:System.Object"></see> class.</summary>
        /// <param name="activityManager"></param>
        /// <param name="libraryManager"></param>
        /// <param name="applicationHost"></param>
        public DemoDataManager(IActivityManager activityManager, ILibraryManager libraryManager, IServerApplicationHost applicationHost)
        {
            this.activityManager = activityManager;
            this.libraryManager = libraryManager;
            this.applicationHost = applicationHost;
        }

        public EditableObjectBase GetDemoData(int demoSet, int demoType)
        {
            switch (demoSet)
            {
                case 1:
                    return this.GetSet1DemoData((Set1DemoTypes)demoType);
                case 2:
                    return this.GetSet2DemoData((Set2DemoTypes)demoType);
                default:
                    throw new ArgumentOutOfRangeException(nameof(demoSet), demoSet, null);
            }
        }

        public void UpdateDemoData(EditableObjectBase editableObject, int demoSet, int demoType)
        {
            switch (demoSet)
            {
                case 1:
                    this.UpdateSet1DemoData(editableObject, (Set1DemoTypes)demoType);
                    break;
                case 2:
                    this.UpdateSet2DemoData(editableObject, (Set2DemoTypes)demoType);
                    break;
                default:
                    throw new ArgumentOutOfRangeException(nameof(demoSet), demoSet, null);
            }
        }

        public EditableObjectBase GetSet1DemoData(Set1DemoTypes demoType)
        {
            switch (demoType)
            {
                case Set1DemoTypes.Basic:
                    return this.basicInput;
                case Set1DemoTypes.Select:
                    return this.selectInput;
                case Set1DemoTypes.ControlStates:
                    return this.controlStates;
                case Set1DemoTypes.Constraints:
                    return this.constraints;
                case Set1DemoTypes.Nesting:
                    return this.nesting;
                case Set1DemoTypes.Conditions:
                    return this.conditions;
                case Set1DemoTypes.Validation:
                    return this.validation;
                default:
                    throw new ArgumentOutOfRangeException(nameof(demoType), demoType, null);
            }
        }

        public EditableObjectBase GetSet2DemoData(Set2DemoTypes demoType)
        {
            switch (demoType)
            {
                case Set2DemoTypes.Lists:
                    this.lists.CreateListItems(this.activityManager, this.libraryManager);
                    return this.lists;
                case Set2DemoTypes.DataGrid1:
                    this.dataGrid1.CreateListItems(this.applicationHost);
                    return this.dataGrid1;
                case Set2DemoTypes.DataGrid2:
                    this.dataGrid2.CreateListItems(this.activityManager);
                    return this.dataGrid2;
                default:
                    throw new ArgumentOutOfRangeException(nameof(demoType), demoType, null);
            }
        }

        public void UpdateSet1DemoData(EditableObjectBase editableObject, Set1DemoTypes demoType)
        {
            switch (demoType)
            {
                case Set1DemoTypes.Basic:
                    this.basicInput = (BasicInput)editableObject;
                    break;
                case Set1DemoTypes.Select:
                    this.selectInput = (SelectInput)editableObject;
                    break;
                case Set1DemoTypes.ControlStates:
                    this.controlStates = (ControlStates)editableObject;
                    break;
                case Set1DemoTypes.Constraints:
                    this.constraints = (Constraints)editableObject;
                    break;
                case Set1DemoTypes.Nesting:
                    this.nesting = (Nesting)editableObject;
                    break;
                case Set1DemoTypes.Conditions:
                    this.conditions = (Conditions)editableObject;
                    break;
                case Set1DemoTypes.Validation:
                    var tmp = (Validation)editableObject;
                    tmp.Validate();
                    this.validation = tmp;
                    break;
                default:
                    throw new ArgumentOutOfRangeException(nameof(demoType), demoType, null);
            }
        }

        public void UpdateSet2DemoData(EditableObjectBase editableObject, Set2DemoTypes demoType)
        {
            switch (demoType)
            {
                case Set2DemoTypes.Lists:
                    this.lists = (Lists)editableObject;
                    break;
                case Set2DemoTypes.DataGrid1:
                    this.dataGrid1 = (DataGrid1)editableObject;
                    break;
                case Set2DemoTypes.DataGrid2:
                    this.dataGrid2 = (DataGrid2)editableObject;
                    break;
                default:
                    throw new ArgumentOutOfRangeException(nameof(demoType), demoType, null);
            }
        }
    }
}
