// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class AuthenticateUserByName
    {
        /// <summary>
        /// Initializes a new instance of the AuthenticateUserByName class.
        /// </summary>
        public AuthenticateUserByName()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AuthenticateUserByName class.
        /// </summary>
        public AuthenticateUserByName(string username = default(string), string pw = default(string))
        {
            Username = username;
            Pw = pw;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Username")]
        public string Username { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Pw")]
        public string Pw { get; set; }

    }
}