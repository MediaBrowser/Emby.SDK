namespace EmbyPluginUiDemo.Model
{
    using System;
    using MediaBrowser.Controller.Entities;
    using MediaBrowser.Model.Entities;

    public class GridDataItem
    {
        /// <summary>
        /// Gets or sets the id.
        /// </summary>
        /// <value>The id.</value>
        public long InternalId { get; set; }

        /// <summary>
        /// Gets or sets the name.
        /// </summary>
        /// <value>The name.</value>
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the date created.
        /// </summary>
        /// <value>The date created.</value>
        public DateTimeOffset? DateCreated { get; set; }

        public ExtraType? ExtraType { get; set; }

        public string Container { get; set; }

        /// <summary>
        /// Gets or sets the critic rating.
        /// </summary>
        /// <value>The critic rating.</value>
        public float? CriticRating { get; set; }

        /// <summary>
        /// Gets or sets the path.
        /// </summary>
        /// <value>The path.</value>
        public string Path { get; set; }

        /// <summary>
        /// Gets or sets the genres.
        /// </summary>
        /// <value>The genres.</value>
        public string[] Genres { get; set; }

        public int? Bitrate { get; set; }

        /// <summary>
        /// Gets or sets the production year.
        /// </summary>
        /// <value>The production year.</value>
        public int? ProductionYear { get; set; }

        /// <summary>
        /// Gets or sets the type.
        /// </summary>
        /// <value>The type.</value>
        public string Type { get; set; }

        /// <summary>
        /// Gets or sets the tags.
        /// </summary>
        /// <value>The tags.</value>
        public string[] Tags { get; set; }

        /// <summary>
        /// Gets or sets the type of the location.
        /// </summary>
        /// <value>The type of the location.</value>
        public LocationType? LocationType { get; set; }

        /// <summary>
        /// Gets or sets the type of the media.
        /// </summary>
        /// <value>The type of the media.</value>
        public string MediaType { get; set; }

        public int? Width { get; set; }

        public int? Height { get; set; }

        public static GridDataItem FromBaseIte(BaseItem baseItem)
        {
            return new GridDataItem
            {
                Bitrate = baseItem.TotalBitrate,
                Container = baseItem.Container,
                CriticRating = baseItem.CriticRating,
                DateCreated = baseItem.DateCreated,
                ExtraType = baseItem.ExtraType,
                Genres = baseItem.Genres,
                Height = baseItem.Height,
                InternalId = baseItem.InternalId,
                LocationType = baseItem.LocationType,
                MediaType = baseItem.MediaType,
                Name = baseItem.Name,
                Path = baseItem.Path,
                ProductionYear = baseItem.ProductionYear,
                Tags = baseItem.Tags,
                Type = baseItem.MediaType,
                Width = baseItem.Width,
            };
        }
    }
}
