// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class EmbyWebGenericEditConditionsPropertyCondition
    {
        /// <summary>
        /// Initializes a new instance of the
        /// EmbyWebGenericEditConditionsPropertyCondition class.
        /// </summary>
        public EmbyWebGenericEditConditionsPropertyCondition()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// EmbyWebGenericEditConditionsPropertyCondition class.
        /// </summary>
        /// <param name="conditionType">Possible values include: 'Visible',
        /// 'Enabled'</param>
        /// <param name="simpleCondition">Possible values include: 'IsTrue',
        /// 'IsFalse', 'IsNull', 'IsNotNullOrEmpty'</param>
        /// <param name="valueCondition">Possible values include: 'IsEqual',
        /// 'IsNotEqual', 'IsGreater', 'IsGreaterOrEqual', 'IsLess',
        /// 'IsLessOrEqual'</param>
        public EmbyWebGenericEditConditionsPropertyCondition(string affectedPropertyId = default(string), string conditionType = default(string), string targetPropertyId = default(string), string simpleCondition = default(string), string valueCondition = default(string), object value = default(object))
        {
            AffectedPropertyId = affectedPropertyId;
            ConditionType = conditionType;
            TargetPropertyId = targetPropertyId;
            SimpleCondition = simpleCondition;
            ValueCondition = valueCondition;
            Value = value;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AffectedPropertyId")]
        public string AffectedPropertyId { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'Visible', 'Enabled'
        /// </summary>
        [JsonProperty(PropertyName = "ConditionType")]
        public string ConditionType { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "TargetPropertyId")]
        public string TargetPropertyId { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'IsTrue', 'IsFalse',
        /// 'IsNull', 'IsNotNullOrEmpty'
        /// </summary>
        [JsonProperty(PropertyName = "SimpleCondition")]
        public string SimpleCondition { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'IsEqual', 'IsNotEqual',
        /// 'IsGreater', 'IsGreaterOrEqual', 'IsLess', 'IsLessOrEqual'
        /// </summary>
        [JsonProperty(PropertyName = "ValueCondition")]
        public string ValueCondition { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Value")]
        public object Value { get; set; }

    }
}