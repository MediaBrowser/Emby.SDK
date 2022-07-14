// <copyright file="DataGrid1.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Data.Demoset2.Demos
{
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.Linq;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Elements.Grid;
    using MediaBrowser.Controller;
    using MediaBrowser.Model.Attributes;
    using MediaBrowser.Model.Plugins;

    public class DataGrid1 : EditableOptionsBase
    {
        public DataGrid1()
        {
            this.Plugins = new List<PluginInfo>();
        }

        public override string EditorTitle => "DataGrid Display";

        public override string EditorDescription =>
            "This is a simple example for datagrid display. The available options are exhaustive. "
            + "More example will be added in a future update.";

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStrings { get; set; } = new CaptionItem("PlugIn List");

        [Browsable(false)]
        public IList<PluginInfo> Plugins { get; set; }

        [DisplayName("")]
        [GridDataSource(nameof(Plugins))]
        public GenericGrid TestGrid
        {
            get
            {
                var options = new GridOptions(new PluginInfo(), nameof(PluginInfo.Id), false, false, true, true);

                options.heightMode = GridOptions.GridHeightMode.medium;

                foreach (var column in options.columns)
                {
                    if (column.lookup?.dataSource != null)
                    {
                        column.editorOptions = new SelectBoxOptions { searchEnabled = false, applyValueMode = SelectBoxOptions.ApplyValueModes.instantly };
                    }
                }

                var indexColumn = options.columns.FirstOrDefault(e => e.dataField == nameof(PluginInfo.Id));
                if (indexColumn != null)
                {
                    ////indexColumn.@fixed = true;
                    indexColumn.visible = true;
                }

                var nameColumn = options.columns.FirstOrDefault(e => e.dataField == nameof(PluginInfo.Name));
                if (nameColumn != null)
                {
                    ////nameColumn.@fixed = true;
                    nameColumn.visible = true;
                }

                var grid = new GenericGrid(options);

                return grid;
            }
        }

        public void CreateListItems(IServerApplicationHost applicationHost)
        {
            this.Plugins.Clear();

            foreach (var plugin in applicationHost.Plugins)
            {
                var info = plugin.GetPluginInfo();
                this.Plugins.Add(info);
            }
        }
    }
}
