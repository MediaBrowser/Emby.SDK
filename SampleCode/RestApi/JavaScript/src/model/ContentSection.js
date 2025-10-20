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
import BaseItemDto from './BaseItemDto';
import ScrollDirection from './ScrollDirection';
import TextSectionInfo from './TextSectionInfo';

/**
* The ContentSection model module.
* @module model/ContentSection
* @version 4.9.2.6
*/
export default class ContentSection {
    /**
    * Constructs a new <code>ContentSection</code>.
    * @alias module:model/ContentSection
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ContentSection</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ContentSection} obj Optional instance to populate.
    * @return {module:model/ContentSection} The populated <code>ContentSection</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContentSection();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Subtitle')) {
                obj['Subtitle'] = ApiClient.convertToType(data['Subtitle'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('SectionType')) {
                obj['SectionType'] = ApiClient.convertToType(data['SectionType'], 'String');
            }
            if (data.hasOwnProperty('CollectionType')) {
                obj['CollectionType'] = ApiClient.convertToType(data['CollectionType'], 'String');
            }
            if (data.hasOwnProperty('ViewType')) {
                obj['ViewType'] = ApiClient.convertToType(data['ViewType'], 'String');
            }
            if (data.hasOwnProperty('Monitor')) {
                obj['Monitor'] = ApiClient.convertToType(data['Monitor'], ['String']);
            }
            if (data.hasOwnProperty('CardSizeOffset')) {
                obj['CardSizeOffset'] = ApiClient.convertToType(data['CardSizeOffset'], 'Number');
            }
            if (data.hasOwnProperty('ScrollDirection')) {
                obj['ScrollDirection'] = ScrollDirection.constructFromObject(data['ScrollDirection']);
            }
            if (data.hasOwnProperty('ParentItem')) {
                obj['ParentItem'] = BaseItemDto.constructFromObject(data['ParentItem']);
            }
            if (data.hasOwnProperty('TextInfo')) {
                obj['TextInfo'] = TextSectionInfo.constructFromObject(data['TextInfo']);
            }
            if (data.hasOwnProperty('PremiumFeature')) {
                obj['PremiumFeature'] = ApiClient.convertToType(data['PremiumFeature'], 'String');
            }
            if (data.hasOwnProperty('PremiumMessage')) {
                obj['PremiumMessage'] = ApiClient.convertToType(data['PremiumMessage'], 'String');
            }
            if (data.hasOwnProperty('RefreshInterval')) {
                obj['RefreshInterval'] = ApiClient.convertToType(data['RefreshInterval'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Subtitle
    */
    'Subtitle' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} SectionType
    */
    'SectionType' = undefined;
    /**
    * @member {String} CollectionType
    */
    'CollectionType' = undefined;
    /**
    * @member {String} ViewType
    */
    'ViewType' = undefined;
    /**
    * @member {Array.<String>} Monitor
    */
    'Monitor' = undefined;
    /**
    * @member {Number} CardSizeOffset
    */
    'CardSizeOffset' = undefined;
    /**
    * @member {module:model/ScrollDirection} ScrollDirection
    */
    'ScrollDirection' = undefined;
    /**
    * @member {module:model/BaseItemDto} ParentItem
    */
    'ParentItem' = undefined;
    /**
    * @member {module:model/TextSectionInfo} TextInfo
    */
    'TextInfo' = undefined;
    /**
    * @member {String} PremiumFeature
    */
    'PremiumFeature' = undefined;
    /**
    * @member {String} PremiumMessage
    */
    'PremiumMessage' = undefined;
    /**
    * @member {Number} RefreshInterval
    */
    'RefreshInterval' = undefined;




}
