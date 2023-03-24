/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EmbyWebGenericUIModelEnumsUIViewType from './EmbyWebGenericUIModelEnumsUIViewType';
import EmbyWebGenericUIModelUICommand from './EmbyWebGenericUIModelUICommand';
import EmbyWebGenericUIModelUITabPageInfo from './EmbyWebGenericUIModelUITabPageInfo';
import GenericEditIEditObjectContainer from './GenericEditIEditObjectContainer';

/**
* The EmbyWebGenericUIModelUIViewInfo model module.
* @module model/EmbyWebGenericUIModelUIViewInfo
* @version 4.8.0.25
*/
export default class EmbyWebGenericUIModelUIViewInfo {
    /**
    * Constructs a new <code>EmbyWebGenericUIModelUIViewInfo</code>.
    * @alias module:model/EmbyWebGenericUIModelUIViewInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyWebGenericUIModelUIViewInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyWebGenericUIModelUIViewInfo} obj Optional instance to populate.
    * @return {module:model/EmbyWebGenericUIModelUIViewInfo} The populated <code>EmbyWebGenericUIModelUIViewInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyWebGenericUIModelUIViewInfo();
                        
            
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
                obj['ViewType'] = EmbyWebGenericUIModelEnumsUIViewType.constructFromObject(data['ViewType']);
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
                obj['Commands'] = ApiClient.convertToType(data['Commands'], [EmbyWebGenericUIModelUICommand]);
            }
            if (data.hasOwnProperty('TabPageInfos')) {
                obj['TabPageInfos'] = ApiClient.convertToType(data['TabPageInfos'], [EmbyWebGenericUIModelUITabPageInfo]);
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
    * @member {module:model/EmbyWebGenericUIModelEnumsUIViewType} ViewType
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
    * @member {Array.<module:model/EmbyWebGenericUIModelUICommand>} Commands
    */
    'Commands' = undefined;
    /**
    * @member {Array.<module:model/EmbyWebGenericUIModelUITabPageInfo>} TabPageInfos
    */
    'TabPageInfos' = undefined;
    /**
    * @member {Boolean} IsPageChangeInfo
    */
    'IsPageChangeInfo' = undefined;




}
