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
import ProcessRunMetricsProcessMetricPoint from './ProcessRunMetricsProcessMetricPoint';

/**
* The ProcessRunMetricsProcessStatistics model module.
* @module model/ProcessRunMetricsProcessStatistics
* @version 4.8.0.26
*/
export default class ProcessRunMetricsProcessStatistics {
    /**
    * Constructs a new <code>ProcessRunMetricsProcessStatistics</code>.
    * @alias module:model/ProcessRunMetricsProcessStatistics
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProcessRunMetricsProcessStatistics</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProcessRunMetricsProcessStatistics} obj Optional instance to populate.
    * @return {module:model/ProcessRunMetricsProcessStatistics} The populated <code>ProcessRunMetricsProcessStatistics</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProcessRunMetricsProcessStatistics();
                        
            
            if (data.hasOwnProperty('CurrentCpu')) {
                obj['CurrentCpu'] = ApiClient.convertToType(data['CurrentCpu'], 'Number');
            }
            if (data.hasOwnProperty('AverageCpu')) {
                obj['AverageCpu'] = ApiClient.convertToType(data['AverageCpu'], 'Number');
            }
            if (data.hasOwnProperty('CurrentVirtualMemory')) {
                obj['CurrentVirtualMemory'] = ApiClient.convertToType(data['CurrentVirtualMemory'], 'Number');
            }
            if (data.hasOwnProperty('CurrentWorkingSet')) {
                obj['CurrentWorkingSet'] = ApiClient.convertToType(data['CurrentWorkingSet'], 'Number');
            }
            if (data.hasOwnProperty('Metrics')) {
                obj['Metrics'] = ApiClient.convertToType(data['Metrics'], [ProcessRunMetricsProcessMetricPoint]);
            }
        }
        return obj;
    }

    /**
    * @member {Number} CurrentCpu
    */
    'CurrentCpu' = undefined;
    /**
    * @member {Number} AverageCpu
    */
    'AverageCpu' = undefined;
    /**
    * @member {Number} CurrentVirtualMemory
    */
    'CurrentVirtualMemory' = undefined;
    /**
    * @member {Number} CurrentWorkingSet
    */
    'CurrentWorkingSet' = undefined;
    /**
    * @member {Array.<module:model/ProcessRunMetricsProcessMetricPoint>} Metrics
    */
    'Metrics' = undefined;




}
