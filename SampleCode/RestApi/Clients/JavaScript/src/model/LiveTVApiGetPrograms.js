/**
 * Emby REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
* The LiveTVApiGetPrograms model module.
* @module model/LiveTVApiGetPrograms
* @version 4.7.5.0
*/
export default class LiveTVApiGetPrograms {
    /**
    * Constructs a new <code>LiveTVApiGetPrograms</code>.
    * @alias module:model/LiveTVApiGetPrograms
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiGetPrograms</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiGetPrograms} obj Optional instance to populate.
    * @return {module:model/LiveTVApiGetPrograms} The populated <code>LiveTVApiGetPrograms</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiGetPrograms();
                        
            
            if (data.hasOwnProperty('IsAiring')) {
                obj['IsAiring'] = ApiClient.convertToType(data['IsAiring'], 'Boolean');
            }
            if (data.hasOwnProperty('TagIds')) {
                obj['TagIds'] = ApiClient.convertToType(data['TagIds'], 'String');
            }
            if (data.hasOwnProperty('ExcludeItemIds')) {
                obj['ExcludeItemIds'] = ApiClient.convertToType(data['ExcludeItemIds'], 'String');
            }
            if (data.hasOwnProperty('EnableTotalRecordCount')) {
                obj['EnableTotalRecordCount'] = ApiClient.convertToType(data['EnableTotalRecordCount'], 'Boolean');
            }
            if (data.hasOwnProperty('SeriesTimerId')) {
                obj['SeriesTimerId'] = ApiClient.convertToType(data['SeriesTimerId'], 'String');
            }
            if (data.hasOwnProperty('LibrarySeriesId')) {
                obj['LibrarySeriesId'] = ApiClient.convertToType(data['LibrarySeriesId'], 'String');
            }
            if (data.hasOwnProperty('SeriesFromProgramId')) {
                obj['SeriesFromProgramId'] = ApiClient.convertToType(data['SeriesFromProgramId'], 'String');
            }
            if (data.hasOwnProperty('ShowingsFromProgramId')) {
                obj['ShowingsFromProgramId'] = ApiClient.convertToType(data['ShowingsFromProgramId'], 'String');
            }
            if (data.hasOwnProperty('GroupProgramsBySeries')) {
                obj['GroupProgramsBySeries'] = ApiClient.convertToType(data['GroupProgramsBySeries'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} IsAiring
    */
    'IsAiring' = undefined;
    /**
    * @member {String} TagIds
    */
    'TagIds' = undefined;
    /**
    * @member {String} ExcludeItemIds
    */
    'ExcludeItemIds' = undefined;
    /**
    * @member {Boolean} EnableTotalRecordCount
    */
    'EnableTotalRecordCount' = undefined;
    /**
    * @member {String} SeriesTimerId
    */
    'SeriesTimerId' = undefined;
    /**
    * @member {String} LibrarySeriesId
    */
    'LibrarySeriesId' = undefined;
    /**
    * @member {String} SeriesFromProgramId
    */
    'SeriesFromProgramId' = undefined;
    /**
    * @member {String} ShowingsFromProgramId
    */
    'ShowingsFromProgramId' = undefined;
    /**
    * @member {Boolean} GroupProgramsBySeries
    */
    'GroupProgramsBySeries' = undefined;




}
