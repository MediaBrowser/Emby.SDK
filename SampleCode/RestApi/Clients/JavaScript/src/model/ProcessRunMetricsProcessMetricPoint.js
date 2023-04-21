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
import TimeSpan from './TimeSpan';

/**
* The ProcessRunMetricsProcessMetricPoint model module.
* @module model/ProcessRunMetricsProcessMetricPoint
* @version 4.8.0.30
*/
export default class ProcessRunMetricsProcessMetricPoint {
    /**
    * Constructs a new <code>ProcessRunMetricsProcessMetricPoint</code>.
    * @alias module:model/ProcessRunMetricsProcessMetricPoint
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProcessRunMetricsProcessMetricPoint</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProcessRunMetricsProcessMetricPoint} obj Optional instance to populate.
    * @return {module:model/ProcessRunMetricsProcessMetricPoint} The populated <code>ProcessRunMetricsProcessMetricPoint</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProcessRunMetricsProcessMetricPoint();
                        
            
            if (data.hasOwnProperty('Time')) {
                obj['Time'] = TimeSpan.constructFromObject(data['Time']);
            }
            if (data.hasOwnProperty('CpuPercent')) {
                obj['CpuPercent'] = ApiClient.convertToType(data['CpuPercent'], 'Number');
            }
            if (data.hasOwnProperty('VirtualMemory')) {
                obj['VirtualMemory'] = ApiClient.convertToType(data['VirtualMemory'], 'Number');
            }
            if (data.hasOwnProperty('WorkingSet')) {
                obj['WorkingSet'] = ApiClient.convertToType(data['WorkingSet'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/TimeSpan} Time
    */
    'Time' = undefined;
    /**
    * @member {Number} CpuPercent
    */
    'CpuPercent' = undefined;
    /**
    * @member {Number} VirtualMemory
    */
    'VirtualMemory' = undefined;
    /**
    * @member {Number} WorkingSet
    */
    'WorkingSet' = undefined;




}
