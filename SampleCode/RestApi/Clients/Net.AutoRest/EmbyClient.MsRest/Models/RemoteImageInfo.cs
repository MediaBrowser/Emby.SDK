// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class RemoteImageInfo
    {
        /// <summary>
        /// Initializes a new instance of the RemoteImageInfo class.
        /// </summary>
        public RemoteImageInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the RemoteImageInfo class.
        /// </summary>
        /// <param name="type">Possible values include: 'Primary', 'Art',
        /// 'Backdrop', 'Banner', 'Logo', 'Thumb', 'Disc', 'Box', 'Screenshot',
        /// 'Menu', 'Chapter', 'BoxRear', 'Thumbnail', 'LogoLight',
        /// 'LogoLightColor'</param>
        /// <param name="ratingType">Possible values include: 'Score',
        /// 'Likes'</param>
        public RemoteImageInfo(string providerName = default(string), string url = default(string), string thumbnailUrl = default(string), int? height = default(int?), int? width = default(int?), double? communityRating = default(double?), int? voteCount = default(int?), string language = default(string), string displayLanguage = default(string), string type = default(string), string ratingType = default(string))
        {
            ProviderName = providerName;
            Url = url;
            ThumbnailUrl = thumbnailUrl;
            Height = height;
            Width = width;
            CommunityRating = communityRating;
            VoteCount = voteCount;
            Language = language;
            DisplayLanguage = displayLanguage;
            Type = type;
            RatingType = ratingType;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ProviderName")]
        public string ProviderName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Url")]
        public string Url { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ThumbnailUrl")]
        public string ThumbnailUrl { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Height")]
        public int? Height { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Width")]
        public int? Width { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "CommunityRating")]
        public double? CommunityRating { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "VoteCount")]
        public int? VoteCount { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Language")]
        public string Language { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "DisplayLanguage")]
        public string DisplayLanguage { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'Primary', 'Art', 'Backdrop',
        /// 'Banner', 'Logo', 'Thumb', 'Disc', 'Box', 'Screenshot', 'Menu',
        /// 'Chapter', 'BoxRear', 'Thumbnail', 'LogoLight', 'LogoLightColor'
        /// </summary>
        [JsonProperty(PropertyName = "Type")]
        public string Type { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'Score', 'Likes'
        /// </summary>
        [JsonProperty(PropertyName = "RatingType")]
        public string RatingType { get; set; }

    }
}