define(['loading', 'mainTabsManager', 'globalize', 'genericedit', 'formHelper', 'emby-checkbox', 'emby-select'], 
    function (loading, mainTabsManager, globalize, genericEdit, formHelper) {

    'use strict';

    return function (view, params) {

        var self = this;

        function getTabsFromDemoList(tabs, demoSet) {

            let url = Dashboard.getConfigurationPageUrl('GenericEditDemo' + demoSet);

            for (let i = 0; i < tabs.length; i++) {
                tabs[i].name = tabs[i].Name;
                tabs[i].href = url + '&mode=' + i;
                tabs[i].apiUrl = 'GenericEditDemo/Demo?DemoSet=' + demoSet + '&DemoType=' + i;
                tabs[i].set = demoSet;
                tabs[i].index = i;
            }

            return tabs;
        }

        function displayError(error) {

            if (!error) {
                return;
            }

            loading.hide();

            var msg = 'Error ' + error.status + ' - ' + error.statusText;

            var keys = ['redirected', 'url'];

            keys.forEach(function (key, index) {
                if (this[key]) {
                    msg += '\n' + this[key];
                }
            }, error);

            if (error.text) {

                error.text().then(function (text) {

                    if (error.status === 500 && text && text.length > 0) {
                        Dashboard.alert({
                            title: 'An Error has Occurred',
                            message: text
                        });
                    } else {

                        if (text && text.length > 0) {
                            msg += '\n\n' + text;
                        }

                        Dashboard.alert({
                            title: error.status,
                            message: msg
                        });
                    }
                });
            } else {

                Dashboard.alert({
                    title: error.status,
                    message: msg
                });
            }
        }

        function loadPage(page, editObjectContainer, tabInfo) {

            let editContainer = page.querySelector('.editSection');
            let apiUrl = tabInfo.apiUrl;

            genericEdit.renderForm(editObjectContainer, editContainer);

            genericEdit.setFormValues(editObjectContainer, editContainer);
            let editors = editObjectContainer.EditorRoot.EditorItems;

            loading.hide();

            let form = view.querySelector('.optionsEditForm');
            var btnSave = page.querySelector('#btnSave');

            if (tabInfo.set !== '2' && tabInfo.DemoType !== 2) {
                btnSave.classList.remove('hide');
            }

            if (tabInfo.set === '1') {
                var btnReset = page.querySelector('#btnReset');
                btnReset.classList.remove('hide');

                var btnUndo = page.querySelector('#btnUndo');
                btnUndo.classList.remove('hide');

                btnUndo.addEventListener('click',
                    function() {
                        genericEdit.setFormValues(editObjectContainer, editContainer);
                    });

                btnReset.addEventListener('click',
                    function() {
                        genericEdit.resetToDefaults(editObjectContainer, editContainer);
                        genericEdit.setFormValues(editObjectContainer, editContainer);
                    });
            } else {
                form.style.maxWidth = 'unset';
            }

            form.addEventListener('submit', function(e) {

                genericEdit.getItemValues(editObjectContainer, editContainer);

                var url = ApiClient.getUrl(apiUrl);
                ApiClient.ajax({
                    type: 'POST',
                    url: url,
                    data: JSON.stringify(editObjectContainer.Object),
                    contentType: 'application/json'
                }).then(Dashboard.processServerConfigurationUpdateResult, displayError);

                e.preventDefault();
                return false;
            });
        }

        view.addEventListener('viewshow', function (e) {
            loading.show();

            let mode = (params ? params.mode : null) || 0;
            let demoSet = ((params ? params.name : null) || '1').slice(-1);

            let listUrl = ApiClient.getUrl('GenericEditDemo/DemoTypes?DemoSet=' + demoSet);
            ApiClient.getJSON(listUrl).then(function (demoList) {

                let tabList = getTabsFromDemoList(demoList, demoSet);
                let tabInfo = tabList[mode];

                function getTabs() {
                    return tabList;
                }

                mainTabsManager.setTabs(view, mode, getTabs);

                let url = ApiClient.getUrl(tabInfo.apiUrl);
                ApiClient.getJSON(url).then(function (editObjectContainer) {

                    loadPage(view, editObjectContainer, tabInfo);

                }, displayError);
            }, displayError);
        });
    };
});