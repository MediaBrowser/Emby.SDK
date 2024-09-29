/**
 * Emby Server REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EnumsUIViewType from './EnumsUIViewType';
import GenericEditIEditObjectContainer from './GenericEditIEditObjectContainer';
import UICommand from './UICommand';
import UITabPageInfo from './UITabPageInfo';

/**
* The UIViewInfo model module.
* @module model/UIViewInfo
* @version 4.8.10.0
*/
export default class UIViewInfo {
    /**
    * Constructs a new <code>UIViewInfo</code>.
    * @alias module:model/UIViewInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UIViewInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UIViewInfo} obj Optional instance to populate.
    * @return {module:model/UIViewInfo} The populated <code>UIViewInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UIViewInfo();
                        
            
            if (data.hasOwnProperty('ViewId')) {
                obj['ViewId'] = ApiClient.convertToType(data['ViewId'], 'String');
            }
            if (data.hasOwnProperty('PageId')) {
                obj['PageId'] = ApiClient.convertToType(data['PageId'], 'String');
            }
            if (data.hasOwnProperty('Caption')) {
                obj['Caption'] = ApiClient.convertToType(data['Caption'], 'String');
            }
            if (data.hasOwnProperty('SubCaption')) {
                obj['SubCaption'] = ApiClient.convertToType(data['SubCaption'], 'String');
            }
            if (data.hasOwnProperty('PluginId')) {
                obj['PluginId'] = ApiClient.convertToType(data['PluginId'], 'String');
            }
            if (data.hasOwnProperty('ViewType')) {
                obj['ViewType'] = EnumsUIViewType.constructFromObject(data['ViewType']);
            }
            if (data.hasOwnProperty('ShowDialogFullScreen')) {
                obj['ShowDialogFullScreen'] = ApiClient.convertToType(data['ShowDialogFullScreen'], 'Boolean');
            }
            if (data.hasOwnProperty('IsInSequence')) {
                obj['IsInSequence'] = ApiClient.convertToType(data['IsInSequence'], 'Boolean');
            }
            if (data.hasOwnProperty('RedirectViewUrl')) {
                obj['RedirectViewUrl'] = ApiClient.convertToType(data['RedirectViewUrl'], 'String');
            }
            if (data.hasOwnProperty('EditObjectContainer')) {
                obj['EditObjectContainer'] = GenericEditIEditObjectContainer.constructFromObject(data['EditObjectContainer']);
            }
            if (data.hasOwnProperty('Commands')) {
                obj['Commands'] = ApiClient.convertToType(data['Commands'], [UICommand]);
            }
            if (data.hasOwnProperty('TabPageInfos')) {
                obj['TabPageInfos'] = ApiClient.convertToType(data['TabPageInfos'], [UITabPageInfo]);
            }
            if (data.hasOwnProperty('IsPageChangeInfo')) {
                obj['IsPageChangeInfo'] = ApiClient.convertToType(data['IsPageChangeInfo'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} ViewId
    */
    'ViewId' = undefined;
    /**
    * @member {String} PageId
    */
    'PageId' = undefined;
    /**
    * @member {String} Caption
    */
    'Caption' = undefined;
    /**
    * @member {String} SubCaption
    */
    'SubCaption' = undefined;
    /**
    * @member {String} PluginId
    */
    'PluginId' = undefined;
    /**
    * @member {module:model/EnumsUIViewType} ViewType
    */
    'ViewType' = undefined;
    /**
    * @member {Boolean} ShowDialogFullScreen
    */
    'ShowDialogFullScreen' = undefined;
    /**
    * @member {Boolean} IsInSequence
    */
    'IsInSequence' = undefined;
    /**
    * @member {String} RedirectViewUrl
    */
    'RedirectViewUrl' = undefined;
    /**
    * @member {module:model/GenericEditIEditObjectContainer} EditObjectContainer
    */
    'EditObjectContainer' = undefined;
    /**
    * @member {Array.<module:model/UICommand>} Commands
    */
    'Commands' = undefined;
    /**
    * @member {Array.<module:model/UITabPageInfo>} TabPageInfos
    */
    'TabPageInfos' = undefined;
    /**
    * @member {Boolean} IsPageChangeInfo
    */
    'IsPageChangeInfo' = undefined;




}
