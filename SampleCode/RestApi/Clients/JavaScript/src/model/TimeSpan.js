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

/**
* The TimeSpan model module.
* @module model/TimeSpan
* @version 4.8.0.19
*/
export default class TimeSpan {
    /**
    * Constructs a new <code>TimeSpan</code>.
    * @alias module:model/TimeSpan
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TimeSpan</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TimeSpan} obj Optional instance to populate.
    * @return {module:model/TimeSpan} The populated <code>TimeSpan</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TimeSpan();
                        
            
            if (data.hasOwnProperty('Ticks')) {
                obj['Ticks'] = ApiClient.convertToType(data['Ticks'], 'Number');
            }
            if (data.hasOwnProperty('Days')) {
                obj['Days'] = ApiClient.convertToType(data['Days'], 'Number');
            }
            if (data.hasOwnProperty('Hours')) {
                obj['Hours'] = ApiClient.convertToType(data['Hours'], 'Number');
            }
            if (data.hasOwnProperty('Milliseconds')) {
                obj['Milliseconds'] = ApiClient.convertToType(data['Milliseconds'], 'Number');
            }
            if (data.hasOwnProperty('Minutes')) {
                obj['Minutes'] = ApiClient.convertToType(data['Minutes'], 'Number');
            }
            if (data.hasOwnProperty('Seconds')) {
                obj['Seconds'] = ApiClient.convertToType(data['Seconds'], 'Number');
            }
            if (data.hasOwnProperty('TotalDays')) {
                obj['TotalDays'] = ApiClient.convertToType(data['TotalDays'], 'Number');
            }
            if (data.hasOwnProperty('TotalHours')) {
                obj['TotalHours'] = ApiClient.convertToType(data['TotalHours'], 'Number');
            }
            if (data.hasOwnProperty('TotalMilliseconds')) {
                obj['TotalMilliseconds'] = ApiClient.convertToType(data['TotalMilliseconds'], 'Number');
            }
            if (data.hasOwnProperty('TotalMinutes')) {
                obj['TotalMinutes'] = ApiClient.convertToType(data['TotalMinutes'], 'Number');
            }
            if (data.hasOwnProperty('TotalSeconds')) {
                obj['TotalSeconds'] = ApiClient.convertToType(data['TotalSeconds'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} Ticks
    */
    'Ticks' = undefined;
    /**
    * @member {Number} Days
    */
    'Days' = undefined;
    /**
    * @member {Number} Hours
    */
    'Hours' = undefined;
    /**
    * @member {Number} Milliseconds
    */
    'Milliseconds' = undefined;
    /**
    * @member {Number} Minutes
    */
    'Minutes' = undefined;
    /**
    * @member {Number} Seconds
    */
    'Seconds' = undefined;
    /**
    * @member {Number} TotalDays
    */
    'TotalDays' = undefined;
    /**
    * @member {Number} TotalHours
    */
    'TotalHours' = undefined;
    /**
    * @member {Number} TotalMilliseconds
    */
    'TotalMilliseconds' = undefined;
    /**
    * @member {Number} TotalMinutes
    */
    'TotalMinutes' = undefined;
    /**
    * @member {Number} TotalSeconds
    */
    'TotalSeconds' = undefined;




}
