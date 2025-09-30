// <copyright file="Extensions.cs" company="Emby LLC">
// Copyright © Emby LLC. All rights reserved.
// </copyright>

namespace EmbyFileBrowser.Common
{
    internal static class Extensions
    {
        /// <summary>Checks whether the specified string is non-null and non-empty.</summary>
        /// <param name="value">The string to check.</param>
        /// <remarks>This is an inverted version of <see cref="string.IsNullOrEmpty(string)"/> to be used in Linq expressions.</remarks>
        /// <returns>A boolean.</returns>
        public static bool IsNotEmpty(this string value)
        {
            return !string.IsNullOrEmpty(value);
        }
    }
}
