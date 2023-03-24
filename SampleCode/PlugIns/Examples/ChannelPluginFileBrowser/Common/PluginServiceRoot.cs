// <copyright file="PluginServiceRoot.cs" company="Emby LLC">
// Copyright © Emby LLC. All rights reserved.
// </copyright>

namespace EmbyFileBrowser.Common
{
    using System;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;

    using MediaBrowser.Controller;
    using MediaBrowser.Model.Logging;
    using MediaBrowser.Model.System;

    public class PluginServiceRoot : IServiceRoot, IDisposable
    {
        private readonly IServerApplicationHost appHost;

        private readonly Dictionary<Type, object> serviceDic;

        public PluginServiceRoot(IServerApplicationHost appHost, ILogManager logManager)
        {
            this.serviceDic = new Dictionary<Type, object>();

            this.LogManager = logManager;

            this.RegisterService<IServerApplicationHost>(appHost);
            this.RegisterService<ILogManager>(logManager);

            this.appHost = appHost;
        }

        public ILogManager LogManager { get; }

        public void Dispose()
        {
        }

        public T GetService<T>()
            where T : class
        {
            if (this.serviceDic.TryGetValue(typeof(T), out object value))
            {
                return (T)value;
            }

            return this.appHost.Resolve<T>();
        }

        public Task Initialize(CancellationToken token)
        {
            return Task.CompletedTask;
        }

        private void RegisterService<T>(object service)
        {
            this.serviceDic[typeof(T)] = service;
        }
    }
}