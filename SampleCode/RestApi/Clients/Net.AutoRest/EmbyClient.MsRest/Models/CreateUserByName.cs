// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class CreateUserByName
    {
        /// <summary>
        /// Initializes a new instance of the CreateUserByName class.
        /// </summary>
        public CreateUserByName()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the CreateUserByName class.
        /// </summary>
        public CreateUserByName(string name = default(string), string copyFromUserId = default(string), IList<string> userCopyOptions = default(IList<string>))
        {
            Name = name;
            CopyFromUserId = copyFromUserId;
            UserCopyOptions = userCopyOptions;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "CopyFromUserId")]
        public string CopyFromUserId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "UserCopyOptions")]
        public IList<string> UserCopyOptions { get; set; }

    }
}