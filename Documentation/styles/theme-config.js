/*
 * Site theme
 *
 * Keep this in sync with the main website's resources/theme-config.js.
 * Change the value below to "light", "dark", or "system".
 */
var EMBY_SITE_THEME = "light";

(function () {
    var theme = EMBY_SITE_THEME;
    if (theme === "system") {
        theme = window.matchMedia &&
            window.matchMedia("(prefers-color-scheme: light)").matches
            ? "light"
            : "dark";
    }
    document.documentElement.setAttribute("data-theme", theme === "light" ? "light" : "dark");
}());
