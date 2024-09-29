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

/**
* The ProcessRunMetricsProcessMetricPoint model module.
* @module model/ProcessRunMetricsProcessMetricPoint
* @version 4.8.10.0
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
                obj['Time'] = ApiClient.convertToType(data['Time'], 'String');
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
    * The time.
    * @member {String} Time
    */
    'Time' = undefined;
    /**
    * The cpu percent.
    * @member {Number} CpuPercent
    */
    'CpuPercent' = undefined;
    /**
    * The virtual memory.
    * @member {Number} VirtualMemory
    */
    'VirtualMemory' = undefined;
    /**
    * The working set.
    * @member {Number} WorkingSet
    */
    'WorkingSet' = undefined;




}
