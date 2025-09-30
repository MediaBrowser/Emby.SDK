/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// BrandingBrandingOptions
    /// </summary>
    [DataContract]
        public partial class BrandingBrandingOptions :  IEquatable<BrandingBrandingOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BrandingBrandingOptions" /> class.
        /// </summary>
        /// <param name="loginDisclaimer">The login disclaimer..</param>
        /// <param name="customCss">The custom CSS..</param>
        public BrandingBrandingOptions(string loginDisclaimer = default(string), string customCss = default(string))
        {
            this.LoginDisclaimer = loginDisclaimer;
            this.CustomCss = customCss;
        }
        
        /// <summary>
        /// The login disclaimer.
        /// </summary>
        /// <value>The login disclaimer.</value>
        [DataMember(Name="LoginDisclaimer", EmitDefaultValue=false)]
        public string LoginDisclaimer { get; set; }

        /// <summary>
        /// The custom CSS.
        /// </summary>
        /// <value>The custom CSS.</value>
        [DataMember(Name="CustomCss", EmitDefaultValue=false)]
        public string CustomCss { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BrandingBrandingOptions {\n");
            sb.Append("  LoginDisclaimer: ").Append(LoginDisclaimer).Append("\n");
            sb.Append("  CustomCss: ").Append(CustomCss).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BrandingBrandingOptions);
        }

        /// <summary>
        /// Returns true if BrandingBrandingOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of BrandingBrandingOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BrandingBrandingOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.LoginDisclaimer == input.LoginDisclaimer ||
                    (this.LoginDisclaimer != null &&
                    this.LoginDisclaimer.Equals(input.LoginDisclaimer))
                ) && 
                (
                    this.CustomCss == input.CustomCss ||
                    (this.CustomCss != null &&
                    this.CustomCss.Equals(input.CustomCss))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.LoginDisclaimer != null)
                    hashCode = hashCode * 59 + this.LoginDisclaimer.GetHashCode();
                if (this.CustomCss != null)
                    hashCode = hashCode * 59 + this.CustomCss.GetHashCode();
                return hashCode;
            }
        }

    }
}
