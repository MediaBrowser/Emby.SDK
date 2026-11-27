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
    /// Enum for icons in &#x60;Emby.Web.GenericEdit.Elements.List.GenericListItem&#x60;, &#x60;Emby.Web.GenericEdit.Elements.ButtonItem&#x60;, &#x60;Emby.Web.GenericEdit.Elements.CaptionItem&#x60;, &#x60;Emby.Web.GenericEdit.Elements.LabelItem&#x60;  and &#x60;Emby.Web.GenericEdit.Elements.TagItem&#x60; elements.      &#x60;Emby.Web.GenericEdit.Elements.List.GenericListItem&#x60;      &#x60;Emby.Web.GenericEdit.Elements.ButtonItem&#x60;      &#x60;Emby.Web.GenericEdit.Elements.CaptionItem&#x60;      &#x60;Emby.Web.GenericEdit.Elements.LabelItem&#x60;      &#x60;Emby.Web.GenericEdit.Elements.TagItem&#x60;  
    /// </summary>
    /// <value>Enum for icons in &#x60;Emby.Web.GenericEdit.Elements.List.GenericListItem&#x60;, &#x60;Emby.Web.GenericEdit.Elements.ButtonItem&#x60;, &#x60;Emby.Web.GenericEdit.Elements.CaptionItem&#x60;, &#x60;Emby.Web.GenericEdit.Elements.LabelItem&#x60;  and &#x60;Emby.Web.GenericEdit.Elements.TagItem&#x60; elements.      &#x60;Emby.Web.GenericEdit.Elements.List.GenericListItem&#x60;      &#x60;Emby.Web.GenericEdit.Elements.ButtonItem&#x60;      &#x60;Emby.Web.GenericEdit.Elements.CaptionItem&#x60;      &#x60;Emby.Web.GenericEdit.Elements.LabelItem&#x60;      &#x60;Emby.Web.GenericEdit.Elements.TagItem&#x60;  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ElementsIconNames
    {
        /// <summary>
        /// Enum Loading for value: Loading
        /// </summary>
        [EnumMember(Value = "Loading")]
        Loading = 1,
        /// <summary>
        /// Enum _3drotation for value: _3d_rotation
        /// </summary>
        [EnumMember(Value = "_3d_rotation")]
        _3drotation = 2,
        /// <summary>
        /// Enum Acunit for value: ac_unit
        /// </summary>
        [EnumMember(Value = "ac_unit")]
        Acunit = 3,
        /// <summary>
        /// Enum Accessalarm for value: access_alarm
        /// </summary>
        [EnumMember(Value = "access_alarm")]
        Accessalarm = 4,
        /// <summary>
        /// Enum Accessalarms for value: access_alarms
        /// </summary>
        [EnumMember(Value = "access_alarms")]
        Accessalarms = 5,
        /// <summary>
        /// Enum Accesstime for value: access_time
        /// </summary>
        [EnumMember(Value = "access_time")]
        Accesstime = 6,
        /// <summary>
        /// Enum Accessibility for value: accessibility
        /// </summary>
        [EnumMember(Value = "accessibility")]
        Accessibility = 7,
        /// <summary>
        /// Enum Accessible for value: accessible
        /// </summary>
        [EnumMember(Value = "accessible")]
        Accessible = 8,
        /// <summary>
        /// Enum Accountbalance for value: account_balance
        /// </summary>
        [EnumMember(Value = "account_balance")]
        Accountbalance = 9,
        /// <summary>
        /// Enum Accountbalancewallet for value: account_balance_wallet
        /// </summary>
        [EnumMember(Value = "account_balance_wallet")]
        Accountbalancewallet = 10,
        /// <summary>
        /// Enum Accountbox for value: account_box
        /// </summary>
        [EnumMember(Value = "account_box")]
        Accountbox = 11,
        /// <summary>
        /// Enum Accountcircle for value: account_circle
        /// </summary>
        [EnumMember(Value = "account_circle")]
        Accountcircle = 12,
        /// <summary>
        /// Enum Accounttree for value: account_tree
        /// </summary>
        [EnumMember(Value = "account_tree")]
        Accounttree = 13,
        /// <summary>
        /// Enum Adb for value: adb
        /// </summary>
        [EnumMember(Value = "adb")]
        Adb = 14,
        /// <summary>
        /// Enum Add for value: add
        /// </summary>
        [EnumMember(Value = "add")]
        Add = 15,
        /// <summary>
        /// Enum Addaphoto for value: add_a_photo
        /// </summary>
        [EnumMember(Value = "add_a_photo")]
        Addaphoto = 16,
        /// <summary>
        /// Enum Addalarm for value: add_alarm
        /// </summary>
        [EnumMember(Value = "add_alarm")]
        Addalarm = 17,
        /// <summary>
        /// Enum Addalert for value: add_alert
        /// </summary>
        [EnumMember(Value = "add_alert")]
        Addalert = 18,
        /// <summary>
        /// Enum Addbox for value: add_box
        /// </summary>
        [EnumMember(Value = "add_box")]
        Addbox = 19,
        /// <summary>
        /// Enum Addcircle for value: add_circle
        /// </summary>
        [EnumMember(Value = "add_circle")]
        Addcircle = 20,
        /// <summary>
        /// Enum Addcircleoutline for value: add_circle_outline
        /// </summary>
        [EnumMember(Value = "add_circle_outline")]
        Addcircleoutline = 21,
        /// <summary>
        /// Enum Addlocation for value: add_location
        /// </summary>
        [EnumMember(Value = "add_location")]
        Addlocation = 22,
        /// <summary>
        /// Enum Addshoppingcart for value: add_shopping_cart
        /// </summary>
        [EnumMember(Value = "add_shopping_cart")]
        Addshoppingcart = 23,
        /// <summary>
        /// Enum Addtophotos for value: add_to_photos
        /// </summary>
        [EnumMember(Value = "add_to_photos")]
        Addtophotos = 24,
        /// <summary>
        /// Enum Addtoqueue for value: add_to_queue
        /// </summary>
        [EnumMember(Value = "add_to_queue")]
        Addtoqueue = 25,
        /// <summary>
        /// Enum Adjust for value: adjust
        /// </summary>
        [EnumMember(Value = "adjust")]
        Adjust = 26,
        /// <summary>
        /// Enum Airlineseatflat for value: airline_seat_flat
        /// </summary>
        [EnumMember(Value = "airline_seat_flat")]
        Airlineseatflat = 27,
        /// <summary>
        /// Enum Airlineseatflatangled for value: airline_seat_flat_angled
        /// </summary>
        [EnumMember(Value = "airline_seat_flat_angled")]
        Airlineseatflatangled = 28,
        /// <summary>
        /// Enum Airlineseatindividualsuite for value: airline_seat_individual_suite
        /// </summary>
        [EnumMember(Value = "airline_seat_individual_suite")]
        Airlineseatindividualsuite = 29,
        /// <summary>
        /// Enum Airlineseatlegroomextra for value: airline_seat_legroom_extra
        /// </summary>
        [EnumMember(Value = "airline_seat_legroom_extra")]
        Airlineseatlegroomextra = 30,
        /// <summary>
        /// Enum Airlineseatlegroomnormal for value: airline_seat_legroom_normal
        /// </summary>
        [EnumMember(Value = "airline_seat_legroom_normal")]
        Airlineseatlegroomnormal = 31,
        /// <summary>
        /// Enum Airlineseatlegroomreduced for value: airline_seat_legroom_reduced
        /// </summary>
        [EnumMember(Value = "airline_seat_legroom_reduced")]
        Airlineseatlegroomreduced = 32,
        /// <summary>
        /// Enum Airlineseatreclineextra for value: airline_seat_recline_extra
        /// </summary>
        [EnumMember(Value = "airline_seat_recline_extra")]
        Airlineseatreclineextra = 33,
        /// <summary>
        /// Enum Airlineseatreclinenormal for value: airline_seat_recline_normal
        /// </summary>
        [EnumMember(Value = "airline_seat_recline_normal")]
        Airlineseatreclinenormal = 34,
        /// <summary>
        /// Enum Airplanemodeactive for value: airplanemode_active
        /// </summary>
        [EnumMember(Value = "airplanemode_active")]
        Airplanemodeactive = 35,
        /// <summary>
        /// Enum Airplanemodeinactive for value: airplanemode_inactive
        /// </summary>
        [EnumMember(Value = "airplanemode_inactive")]
        Airplanemodeinactive = 36,
        /// <summary>
        /// Enum Airplay for value: airplay
        /// </summary>
        [EnumMember(Value = "airplay")]
        Airplay = 37,
        /// <summary>
        /// Enum Airportshuttle for value: airport_shuttle
        /// </summary>
        [EnumMember(Value = "airport_shuttle")]
        Airportshuttle = 38,
        /// <summary>
        /// Enum Alarm for value: alarm
        /// </summary>
        [EnumMember(Value = "alarm")]
        Alarm = 39,
        /// <summary>
        /// Enum Alarmadd for value: alarm_add
        /// </summary>
        [EnumMember(Value = "alarm_add")]
        Alarmadd = 40,
        /// <summary>
        /// Enum Alarmoff for value: alarm_off
        /// </summary>
        [EnumMember(Value = "alarm_off")]
        Alarmoff = 41,
        /// <summary>
        /// Enum Alarmon for value: alarm_on
        /// </summary>
        [EnumMember(Value = "alarm_on")]
        Alarmon = 42,
        /// <summary>
        /// Enum Album for value: album
        /// </summary>
        [EnumMember(Value = "album")]
        Album = 43,
        /// <summary>
        /// Enum Allinclusive for value: all_inclusive
        /// </summary>
        [EnumMember(Value = "all_inclusive")]
        Allinclusive = 44,
        /// <summary>
        /// Enum Allout for value: all_out
        /// </summary>
        [EnumMember(Value = "all_out")]
        Allout = 45,
        /// <summary>
        /// Enum Android for value: android
        /// </summary>
        [EnumMember(Value = "android")]
        Android = 46,
        /// <summary>
        /// Enum Announcement for value: announcement
        /// </summary>
        [EnumMember(Value = "announcement")]
        Announcement = 47,
        /// <summary>
        /// Enum Apps for value: apps
        /// </summary>
        [EnumMember(Value = "apps")]
        Apps = 48,
        /// <summary>
        /// Enum Archive for value: archive
        /// </summary>
        [EnumMember(Value = "archive")]
        Archive = 49,
        /// <summary>
        /// Enum Arrowback for value: arrow_back
        /// </summary>
        [EnumMember(Value = "arrow_back")]
        Arrowback = 50,
        /// <summary>
        /// Enum Arrowdownward for value: arrow_downward
        /// </summary>
        [EnumMember(Value = "arrow_downward")]
        Arrowdownward = 51,
        /// <summary>
        /// Enum Arrowdropdown for value: arrow_drop_down
        /// </summary>
        [EnumMember(Value = "arrow_drop_down")]
        Arrowdropdown = 52,
        /// <summary>
        /// Enum Arrowdropdowncircle for value: arrow_drop_down_circle
        /// </summary>
        [EnumMember(Value = "arrow_drop_down_circle")]
        Arrowdropdowncircle = 53,
        /// <summary>
        /// Enum Arrowdropup for value: arrow_drop_up
        /// </summary>
        [EnumMember(Value = "arrow_drop_up")]
        Arrowdropup = 54,
        /// <summary>
        /// Enum Arrowforward for value: arrow_forward
        /// </summary>
        [EnumMember(Value = "arrow_forward")]
        Arrowforward = 55,
        /// <summary>
        /// Enum Arrowupward for value: arrow_upward
        /// </summary>
        [EnumMember(Value = "arrow_upward")]
        Arrowupward = 56,
        /// <summary>
        /// Enum Arttrack for value: art_track
        /// </summary>
        [EnumMember(Value = "art_track")]
        Arttrack = 57,
        /// <summary>
        /// Enum Aspectratio for value: aspect_ratio
        /// </summary>
        [EnumMember(Value = "aspect_ratio")]
        Aspectratio = 58,
        /// <summary>
        /// Enum Assessment for value: assessment
        /// </summary>
        [EnumMember(Value = "assessment")]
        Assessment = 59,
        /// <summary>
        /// Enum Assignment for value: assignment
        /// </summary>
        [EnumMember(Value = "assignment")]
        Assignment = 60,
        /// <summary>
        /// Enum Assignmentind for value: assignment_ind
        /// </summary>
        [EnumMember(Value = "assignment_ind")]
        Assignmentind = 61,
        /// <summary>
        /// Enum Assignmentlate for value: assignment_late
        /// </summary>
        [EnumMember(Value = "assignment_late")]
        Assignmentlate = 62,
        /// <summary>
        /// Enum Assignmentreturn for value: assignment_return
        /// </summary>
        [EnumMember(Value = "assignment_return")]
        Assignmentreturn = 63,
        /// <summary>
        /// Enum Assignmentreturned for value: assignment_returned
        /// </summary>
        [EnumMember(Value = "assignment_returned")]
        Assignmentreturned = 64,
        /// <summary>
        /// Enum Assignmentturnedin for value: assignment_turned_in
        /// </summary>
        [EnumMember(Value = "assignment_turned_in")]
        Assignmentturnedin = 65,
        /// <summary>
        /// Enum Assistant for value: assistant
        /// </summary>
        [EnumMember(Value = "assistant")]
        Assistant = 66,
        /// <summary>
        /// Enum Assistantphoto for value: assistant_photo
        /// </summary>
        [EnumMember(Value = "assistant_photo")]
        Assistantphoto = 67,
        /// <summary>
        /// Enum Attachfile for value: attach_file
        /// </summary>
        [EnumMember(Value = "attach_file")]
        Attachfile = 68,
        /// <summary>
        /// Enum Attachmoney for value: attach_money
        /// </summary>
        [EnumMember(Value = "attach_money")]
        Attachmoney = 69,
        /// <summary>
        /// Enum Attachment for value: attachment
        /// </summary>
        [EnumMember(Value = "attachment")]
        Attachment = 70,
        /// <summary>
        /// Enum Audiotrack for value: audiotrack
        /// </summary>
        [EnumMember(Value = "audiotrack")]
        Audiotrack = 71,
        /// <summary>
        /// Enum Autorenew for value: autorenew
        /// </summary>
        [EnumMember(Value = "autorenew")]
        Autorenew = 72,
        /// <summary>
        /// Enum Avtimer for value: av_timer
        /// </summary>
        [EnumMember(Value = "av_timer")]
        Avtimer = 73,
        /// <summary>
        /// Enum Backspace for value: backspace
        /// </summary>
        [EnumMember(Value = "backspace")]
        Backspace = 74,
        /// <summary>
        /// Enum Backup for value: backup
        /// </summary>
        [EnumMember(Value = "backup")]
        Backup = 75,
        /// <summary>
        /// Enum Batteryalert for value: battery_alert
        /// </summary>
        [EnumMember(Value = "battery_alert")]
        Batteryalert = 76,
        /// <summary>
        /// Enum Batterychargingfull for value: battery_charging_full
        /// </summary>
        [EnumMember(Value = "battery_charging_full")]
        Batterychargingfull = 77,
        /// <summary>
        /// Enum Batteryfull for value: battery_full
        /// </summary>
        [EnumMember(Value = "battery_full")]
        Batteryfull = 78,
        /// <summary>
        /// Enum Batterystd for value: battery_std
        /// </summary>
        [EnumMember(Value = "battery_std")]
        Batterystd = 79,
        /// <summary>
        /// Enum Batteryunknown for value: battery_unknown
        /// </summary>
        [EnumMember(Value = "battery_unknown")]
        Batteryunknown = 80,
        /// <summary>
        /// Enum Beachaccess for value: beach_access
        /// </summary>
        [EnumMember(Value = "beach_access")]
        Beachaccess = 81,
        /// <summary>
        /// Enum Beenhere for value: beenhere
        /// </summary>
        [EnumMember(Value = "beenhere")]
        Beenhere = 82,
        /// <summary>
        /// Enum Block for value: block
        /// </summary>
        [EnumMember(Value = "block")]
        Block = 83,
        /// <summary>
        /// Enum Bluetooth for value: bluetooth
        /// </summary>
        [EnumMember(Value = "bluetooth")]
        Bluetooth = 84,
        /// <summary>
        /// Enum Bluetoothaudio for value: bluetooth_audio
        /// </summary>
        [EnumMember(Value = "bluetooth_audio")]
        Bluetoothaudio = 85,
        /// <summary>
        /// Enum Bluetoothconnected for value: bluetooth_connected
        /// </summary>
        [EnumMember(Value = "bluetooth_connected")]
        Bluetoothconnected = 86,
        /// <summary>
        /// Enum Bluetoothdisabled for value: bluetooth_disabled
        /// </summary>
        [EnumMember(Value = "bluetooth_disabled")]
        Bluetoothdisabled = 87,
        /// <summary>
        /// Enum Bluetoothsearching for value: bluetooth_searching
        /// </summary>
        [EnumMember(Value = "bluetooth_searching")]
        Bluetoothsearching = 88,
        /// <summary>
        /// Enum Blurcircular for value: blur_circular
        /// </summary>
        [EnumMember(Value = "blur_circular")]
        Blurcircular = 89,
        /// <summary>
        /// Enum Blurlinear for value: blur_linear
        /// </summary>
        [EnumMember(Value = "blur_linear")]
        Blurlinear = 90,
        /// <summary>
        /// Enum Bluroff for value: blur_off
        /// </summary>
        [EnumMember(Value = "blur_off")]
        Bluroff = 91,
        /// <summary>
        /// Enum Bluron for value: blur_on
        /// </summary>
        [EnumMember(Value = "blur_on")]
        Bluron = 92,
        /// <summary>
        /// Enum Book for value: book
        /// </summary>
        [EnumMember(Value = "book")]
        Book = 93,
        /// <summary>
        /// Enum Bookmark for value: bookmark
        /// </summary>
        [EnumMember(Value = "bookmark")]
        Bookmark = 94,
        /// <summary>
        /// Enum Bookmarkborder for value: bookmark_border
        /// </summary>
        [EnumMember(Value = "bookmark_border")]
        Bookmarkborder = 95,
        /// <summary>
        /// Enum Bookmarks for value: bookmarks
        /// </summary>
        [EnumMember(Value = "bookmarks")]
        Bookmarks = 96,
        /// <summary>
        /// Enum Borderall for value: border_all
        /// </summary>
        [EnumMember(Value = "border_all")]
        Borderall = 97,
        /// <summary>
        /// Enum Borderbottom for value: border_bottom
        /// </summary>
        [EnumMember(Value = "border_bottom")]
        Borderbottom = 98,
        /// <summary>
        /// Enum Borderclear for value: border_clear
        /// </summary>
        [EnumMember(Value = "border_clear")]
        Borderclear = 99,
        /// <summary>
        /// Enum Bordercolor for value: border_color
        /// </summary>
        [EnumMember(Value = "border_color")]
        Bordercolor = 100,
        /// <summary>
        /// Enum Borderhorizontal for value: border_horizontal
        /// </summary>
        [EnumMember(Value = "border_horizontal")]
        Borderhorizontal = 101,
        /// <summary>
        /// Enum Borderinner for value: border_inner
        /// </summary>
        [EnumMember(Value = "border_inner")]
        Borderinner = 102,
        /// <summary>
        /// Enum Borderleft for value: border_left
        /// </summary>
        [EnumMember(Value = "border_left")]
        Borderleft = 103,
        /// <summary>
        /// Enum Borderouter for value: border_outer
        /// </summary>
        [EnumMember(Value = "border_outer")]
        Borderouter = 104,
        /// <summary>
        /// Enum Borderright for value: border_right
        /// </summary>
        [EnumMember(Value = "border_right")]
        Borderright = 105,
        /// <summary>
        /// Enum Borderstyle for value: border_style
        /// </summary>
        [EnumMember(Value = "border_style")]
        Borderstyle = 106,
        /// <summary>
        /// Enum Bordertop for value: border_top
        /// </summary>
        [EnumMember(Value = "border_top")]
        Bordertop = 107,
        /// <summary>
        /// Enum Bordervertical for value: border_vertical
        /// </summary>
        [EnumMember(Value = "border_vertical")]
        Bordervertical = 108,
        /// <summary>
        /// Enum Brandingwatermark for value: branding_watermark
        /// </summary>
        [EnumMember(Value = "branding_watermark")]
        Brandingwatermark = 109,
        /// <summary>
        /// Enum Brightness1 for value: brightness_1
        /// </summary>
        [EnumMember(Value = "brightness_1")]
        Brightness1 = 110,
        /// <summary>
        /// Enum Brightness2 for value: brightness_2
        /// </summary>
        [EnumMember(Value = "brightness_2")]
        Brightness2 = 111,
        /// <summary>
        /// Enum Brightness3 for value: brightness_3
        /// </summary>
        [EnumMember(Value = "brightness_3")]
        Brightness3 = 112,
        /// <summary>
        /// Enum Brightness4 for value: brightness_4
        /// </summary>
        [EnumMember(Value = "brightness_4")]
        Brightness4 = 113,
        /// <summary>
        /// Enum Brightness5 for value: brightness_5
        /// </summary>
        [EnumMember(Value = "brightness_5")]
        Brightness5 = 114,
        /// <summary>
        /// Enum Brightness6 for value: brightness_6
        /// </summary>
        [EnumMember(Value = "brightness_6")]
        Brightness6 = 115,
        /// <summary>
        /// Enum Brightness7 for value: brightness_7
        /// </summary>
        [EnumMember(Value = "brightness_7")]
        Brightness7 = 116,
        /// <summary>
        /// Enum Brightnessauto for value: brightness_auto
        /// </summary>
        [EnumMember(Value = "brightness_auto")]
        Brightnessauto = 117,
        /// <summary>
        /// Enum Brightnesshigh for value: brightness_high
        /// </summary>
        [EnumMember(Value = "brightness_high")]
        Brightnesshigh = 118,
        /// <summary>
        /// Enum Brightnesslow for value: brightness_low
        /// </summary>
        [EnumMember(Value = "brightness_low")]
        Brightnesslow = 119,
        /// <summary>
        /// Enum Brightnessmedium for value: brightness_medium
        /// </summary>
        [EnumMember(Value = "brightness_medium")]
        Brightnessmedium = 120,
        /// <summary>
        /// Enum Brokenimage for value: broken_image
        /// </summary>
        [EnumMember(Value = "broken_image")]
        Brokenimage = 121,
        /// <summary>
        /// Enum Brush for value: brush
        /// </summary>
        [EnumMember(Value = "brush")]
        Brush = 122,
        /// <summary>
        /// Enum Bubblechart for value: bubble_chart
        /// </summary>
        [EnumMember(Value = "bubble_chart")]
        Bubblechart = 123,
        /// <summary>
        /// Enum Bugreport for value: bug_report
        /// </summary>
        [EnumMember(Value = "bug_report")]
        Bugreport = 124,
        /// <summary>
        /// Enum Build for value: build
        /// </summary>
        [EnumMember(Value = "build")]
        Build = 125,
        /// <summary>
        /// Enum Burstmode for value: burst_mode
        /// </summary>
        [EnumMember(Value = "burst_mode")]
        Burstmode = 126,
        /// <summary>
        /// Enum Business for value: business
        /// </summary>
        [EnumMember(Value = "business")]
        Business = 127,
        /// <summary>
        /// Enum Businesscenter for value: business_center
        /// </summary>
        [EnumMember(Value = "business_center")]
        Businesscenter = 128,
        /// <summary>
        /// Enum Cached for value: cached
        /// </summary>
        [EnumMember(Value = "cached")]
        Cached = 129,
        /// <summary>
        /// Enum Cake for value: cake
        /// </summary>
        [EnumMember(Value = "cake")]
        Cake = 130,
        /// <summary>
        /// Enum Calendartoday for value: calendar_today
        /// </summary>
        [EnumMember(Value = "calendar_today")]
        Calendartoday = 131,
        /// <summary>
        /// Enum Call for value: call
        /// </summary>
        [EnumMember(Value = "call")]
        Call = 132,
        /// <summary>
        /// Enum Callend for value: call_end
        /// </summary>
        [EnumMember(Value = "call_end")]
        Callend = 133,
        /// <summary>
        /// Enum Callmade for value: call_made
        /// </summary>
        [EnumMember(Value = "call_made")]
        Callmade = 134,
        /// <summary>
        /// Enum Callmerge for value: call_merge
        /// </summary>
        [EnumMember(Value = "call_merge")]
        Callmerge = 135,
        /// <summary>
        /// Enum Callmissed for value: call_missed
        /// </summary>
        [EnumMember(Value = "call_missed")]
        Callmissed = 136,
        /// <summary>
        /// Enum Callmissedoutgoing for value: call_missed_outgoing
        /// </summary>
        [EnumMember(Value = "call_missed_outgoing")]
        Callmissedoutgoing = 137,
        /// <summary>
        /// Enum Callreceived for value: call_received
        /// </summary>
        [EnumMember(Value = "call_received")]
        Callreceived = 138,
        /// <summary>
        /// Enum Callsplit for value: call_split
        /// </summary>
        [EnumMember(Value = "call_split")]
        Callsplit = 139,
        /// <summary>
        /// Enum Calltoaction for value: call_to_action
        /// </summary>
        [EnumMember(Value = "call_to_action")]
        Calltoaction = 140,
        /// <summary>
        /// Enum Camera for value: camera
        /// </summary>
        [EnumMember(Value = "camera")]
        Camera = 141,
        /// <summary>
        /// Enum Cameraalt for value: camera_alt
        /// </summary>
        [EnumMember(Value = "camera_alt")]
        Cameraalt = 142,
        /// <summary>
        /// Enum Cameraenhance for value: camera_enhance
        /// </summary>
        [EnumMember(Value = "camera_enhance")]
        Cameraenhance = 143,
        /// <summary>
        /// Enum Camerafront for value: camera_front
        /// </summary>
        [EnumMember(Value = "camera_front")]
        Camerafront = 144,
        /// <summary>
        /// Enum Camerarear for value: camera_rear
        /// </summary>
        [EnumMember(Value = "camera_rear")]
        Camerarear = 145,
        /// <summary>
        /// Enum Cameraroll for value: camera_roll
        /// </summary>
        [EnumMember(Value = "camera_roll")]
        Cameraroll = 146,
        /// <summary>
        /// Enum Cancel for value: cancel
        /// </summary>
        [EnumMember(Value = "cancel")]
        Cancel = 147,
        /// <summary>
        /// Enum Cardgiftcard for value: card_giftcard
        /// </summary>
        [EnumMember(Value = "card_giftcard")]
        Cardgiftcard = 148,
        /// <summary>
        /// Enum Cardmembership for value: card_membership
        /// </summary>
        [EnumMember(Value = "card_membership")]
        Cardmembership = 149,
        /// <summary>
        /// Enum Cardtravel for value: card_travel
        /// </summary>
        [EnumMember(Value = "card_travel")]
        Cardtravel = 150,
        /// <summary>
        /// Enum Casino for value: casino
        /// </summary>
        [EnumMember(Value = "casino")]
        Casino = 151,
        /// <summary>
        /// Enum Cast for value: cast
        /// </summary>
        [EnumMember(Value = "cast")]
        Cast = 152,
        /// <summary>
        /// Enum Castconnected for value: cast_connected
        /// </summary>
        [EnumMember(Value = "cast_connected")]
        Castconnected = 153,
        /// <summary>
        /// Enum Centerfocusstrong for value: center_focus_strong
        /// </summary>
        [EnumMember(Value = "center_focus_strong")]
        Centerfocusstrong = 154,
        /// <summary>
        /// Enum Centerfocusweak for value: center_focus_weak
        /// </summary>
        [EnumMember(Value = "center_focus_weak")]
        Centerfocusweak = 155,
        /// <summary>
        /// Enum Changehistory for value: change_history
        /// </summary>
        [EnumMember(Value = "change_history")]
        Changehistory = 156,
        /// <summary>
        /// Enum Chat for value: chat
        /// </summary>
        [EnumMember(Value = "chat")]
        Chat = 157,
        /// <summary>
        /// Enum Chatbubble for value: chat_bubble
        /// </summary>
        [EnumMember(Value = "chat_bubble")]
        Chatbubble = 158,
        /// <summary>
        /// Enum Chatbubbleoutline for value: chat_bubble_outline
        /// </summary>
        [EnumMember(Value = "chat_bubble_outline")]
        Chatbubbleoutline = 159,
        /// <summary>
        /// Enum Check for value: check
        /// </summary>
        [EnumMember(Value = "check")]
        Check = 160,
        /// <summary>
        /// Enum Checkbox for value: check_box
        /// </summary>
        [EnumMember(Value = "check_box")]
        Checkbox = 161,
        /// <summary>
        /// Enum Checkboxoutlineblank for value: check_box_outline_blank
        /// </summary>
        [EnumMember(Value = "check_box_outline_blank")]
        Checkboxoutlineblank = 162,
        /// <summary>
        /// Enum Checkcircle for value: check_circle
        /// </summary>
        [EnumMember(Value = "check_circle")]
        Checkcircle = 163,
        /// <summary>
        /// Enum Checkcircleoutline for value: check_circle_outline
        /// </summary>
        [EnumMember(Value = "check_circle_outline")]
        Checkcircleoutline = 164,
        /// <summary>
        /// Enum Chevronleft for value: chevron_left
        /// </summary>
        [EnumMember(Value = "chevron_left")]
        Chevronleft = 165,
        /// <summary>
        /// Enum Chevronright for value: chevron_right
        /// </summary>
        [EnumMember(Value = "chevron_right")]
        Chevronright = 166,
        /// <summary>
        /// Enum Childcare for value: child_care
        /// </summary>
        [EnumMember(Value = "child_care")]
        Childcare = 167,
        /// <summary>
        /// Enum Childfriendly for value: child_friendly
        /// </summary>
        [EnumMember(Value = "child_friendly")]
        Childfriendly = 168,
        /// <summary>
        /// Enum Chromereadermode for value: chrome_reader_mode
        /// </summary>
        [EnumMember(Value = "chrome_reader_mode")]
        Chromereadermode = 169,
        /// <summary>
        /// Enum Class for value: class
        /// </summary>
        [EnumMember(Value = "class")]
        Class = 170,
        /// <summary>
        /// Enum Clear for value: clear
        /// </summary>
        [EnumMember(Value = "clear")]
        Clear = 171,
        /// <summary>
        /// Enum Clearall for value: clear_all
        /// </summary>
        [EnumMember(Value = "clear_all")]
        Clearall = 172,
        /// <summary>
        /// Enum Close for value: close
        /// </summary>
        [EnumMember(Value = "close")]
        Close = 173,
        /// <summary>
        /// Enum Closedcaption for value: closed_caption
        /// </summary>
        [EnumMember(Value = "closed_caption")]
        Closedcaption = 174,
        /// <summary>
        /// Enum Cloud for value: cloud
        /// </summary>
        [EnumMember(Value = "cloud")]
        Cloud = 175,
        /// <summary>
        /// Enum Cloudcircle for value: cloud_circle
        /// </summary>
        [EnumMember(Value = "cloud_circle")]
        Cloudcircle = 176,
        /// <summary>
        /// Enum Clouddone for value: cloud_done
        /// </summary>
        [EnumMember(Value = "cloud_done")]
        Clouddone = 177,
        /// <summary>
        /// Enum Clouddownload for value: cloud_download
        /// </summary>
        [EnumMember(Value = "cloud_download")]
        Clouddownload = 178,
        /// <summary>
        /// Enum Cloudoff for value: cloud_off
        /// </summary>
        [EnumMember(Value = "cloud_off")]
        Cloudoff = 179,
        /// <summary>
        /// Enum Cloudqueue for value: cloud_queue
        /// </summary>
        [EnumMember(Value = "cloud_queue")]
        Cloudqueue = 180,
        /// <summary>
        /// Enum Cloudupload for value: cloud_upload
        /// </summary>
        [EnumMember(Value = "cloud_upload")]
        Cloudupload = 181,
        /// <summary>
        /// Enum Code for value: code
        /// </summary>
        [EnumMember(Value = "code")]
        Code = 182,
        /// <summary>
        /// Enum Collections for value: collections
        /// </summary>
        [EnumMember(Value = "collections")]
        Collections = 183,
        /// <summary>
        /// Enum Collectionsbookmark for value: collections_bookmark
        /// </summary>
        [EnumMember(Value = "collections_bookmark")]
        Collectionsbookmark = 184,
        /// <summary>
        /// Enum Colorlens for value: color_lens
        /// </summary>
        [EnumMember(Value = "color_lens")]
        Colorlens = 185,
        /// <summary>
        /// Enum Colorize for value: colorize
        /// </summary>
        [EnumMember(Value = "colorize")]
        Colorize = 186,
        /// <summary>
        /// Enum Comment for value: comment
        /// </summary>
        [EnumMember(Value = "comment")]
        Comment = 187,
        /// <summary>
        /// Enum Compare for value: compare
        /// </summary>
        [EnumMember(Value = "compare")]
        Compare = 188,
        /// <summary>
        /// Enum Comparearrows for value: compare_arrows
        /// </summary>
        [EnumMember(Value = "compare_arrows")]
        Comparearrows = 189,
        /// <summary>
        /// Enum Computer for value: computer
        /// </summary>
        [EnumMember(Value = "computer")]
        Computer = 190,
        /// <summary>
        /// Enum Confirmationnumber for value: confirmation_number
        /// </summary>
        [EnumMember(Value = "confirmation_number")]
        Confirmationnumber = 191,
        /// <summary>
        /// Enum Contactmail for value: contact_mail
        /// </summary>
        [EnumMember(Value = "contact_mail")]
        Contactmail = 192,
        /// <summary>
        /// Enum Contactphone for value: contact_phone
        /// </summary>
        [EnumMember(Value = "contact_phone")]
        Contactphone = 193,
        /// <summary>
        /// Enum Contacts for value: contacts
        /// </summary>
        [EnumMember(Value = "contacts")]
        Contacts = 194,
        /// <summary>
        /// Enum Contentcopy for value: content_copy
        /// </summary>
        [EnumMember(Value = "content_copy")]
        Contentcopy = 195,
        /// <summary>
        /// Enum Contentcut for value: content_cut
        /// </summary>
        [EnumMember(Value = "content_cut")]
        Contentcut = 196,
        /// <summary>
        /// Enum Contentpaste for value: content_paste
        /// </summary>
        [EnumMember(Value = "content_paste")]
        Contentpaste = 197,
        /// <summary>
        /// Enum Controlpoint for value: control_point
        /// </summary>
        [EnumMember(Value = "control_point")]
        Controlpoint = 198,
        /// <summary>
        /// Enum Controlpointduplicate for value: control_point_duplicate
        /// </summary>
        [EnumMember(Value = "control_point_duplicate")]
        Controlpointduplicate = 199,
        /// <summary>
        /// Enum Copyright for value: copyright
        /// </summary>
        [EnumMember(Value = "copyright")]
        Copyright = 200,
        /// <summary>
        /// Enum Create for value: create
        /// </summary>
        [EnumMember(Value = "create")]
        Create = 201,
        /// <summary>
        /// Enum Createnewfolder for value: create_new_folder
        /// </summary>
        [EnumMember(Value = "create_new_folder")]
        Createnewfolder = 202,
        /// <summary>
        /// Enum Creditcard for value: credit_card
        /// </summary>
        [EnumMember(Value = "credit_card")]
        Creditcard = 203,
        /// <summary>
        /// Enum Crop for value: crop
        /// </summary>
        [EnumMember(Value = "crop")]
        Crop = 204,
        /// <summary>
        /// Enum Crop169 for value: crop_16_9
        /// </summary>
        [EnumMember(Value = "crop_16_9")]
        Crop169 = 205,
        /// <summary>
        /// Enum Crop32 for value: crop_3_2
        /// </summary>
        [EnumMember(Value = "crop_3_2")]
        Crop32 = 206,
        /// <summary>
        /// Enum Crop54 for value: crop_5_4
        /// </summary>
        [EnumMember(Value = "crop_5_4")]
        Crop54 = 207,
        /// <summary>
        /// Enum Crop75 for value: crop_7_5
        /// </summary>
        [EnumMember(Value = "crop_7_5")]
        Crop75 = 208,
        /// <summary>
        /// Enum Cropdin for value: crop_din
        /// </summary>
        [EnumMember(Value = "crop_din")]
        Cropdin = 209,
        /// <summary>
        /// Enum Cropfree for value: crop_free
        /// </summary>
        [EnumMember(Value = "crop_free")]
        Cropfree = 210,
        /// <summary>
        /// Enum Croplandscape for value: crop_landscape
        /// </summary>
        [EnumMember(Value = "crop_landscape")]
        Croplandscape = 211,
        /// <summary>
        /// Enum Croporiginal for value: crop_original
        /// </summary>
        [EnumMember(Value = "crop_original")]
        Croporiginal = 212,
        /// <summary>
        /// Enum Cropportrait for value: crop_portrait
        /// </summary>
        [EnumMember(Value = "crop_portrait")]
        Cropportrait = 213,
        /// <summary>
        /// Enum Croprotate for value: crop_rotate
        /// </summary>
        [EnumMember(Value = "crop_rotate")]
        Croprotate = 214,
        /// <summary>
        /// Enum Cropsquare for value: crop_square
        /// </summary>
        [EnumMember(Value = "crop_square")]
        Cropsquare = 215,
        /// <summary>
        /// Enum Dashboard for value: dashboard
        /// </summary>
        [EnumMember(Value = "dashboard")]
        Dashboard = 216,
        /// <summary>
        /// Enum Datausage for value: data_usage
        /// </summary>
        [EnumMember(Value = "data_usage")]
        Datausage = 217,
        /// <summary>
        /// Enum Daterange for value: date_range
        /// </summary>
        [EnumMember(Value = "date_range")]
        Daterange = 218,
        /// <summary>
        /// Enum Dehaze for value: dehaze
        /// </summary>
        [EnumMember(Value = "dehaze")]
        Dehaze = 219,
        /// <summary>
        /// Enum Delete for value: delete
        /// </summary>
        [EnumMember(Value = "delete")]
        Delete = 220,
        /// <summary>
        /// Enum Deleteforever for value: delete_forever
        /// </summary>
        [EnumMember(Value = "delete_forever")]
        Deleteforever = 221,
        /// <summary>
        /// Enum Deleteoutline for value: delete_outline
        /// </summary>
        [EnumMember(Value = "delete_outline")]
        Deleteoutline = 222,
        /// <summary>
        /// Enum Deletesweep for value: delete_sweep
        /// </summary>
        [EnumMember(Value = "delete_sweep")]
        Deletesweep = 223,
        /// <summary>
        /// Enum Description for value: description
        /// </summary>
        [EnumMember(Value = "description")]
        Description = 224,
        /// <summary>
        /// Enum Desktopmac for value: desktop_mac
        /// </summary>
        [EnumMember(Value = "desktop_mac")]
        Desktopmac = 225,
        /// <summary>
        /// Enum Desktopwindows for value: desktop_windows
        /// </summary>
        [EnumMember(Value = "desktop_windows")]
        Desktopwindows = 226,
        /// <summary>
        /// Enum Details for value: details
        /// </summary>
        [EnumMember(Value = "details")]
        Details = 227,
        /// <summary>
        /// Enum Developerboard for value: developer_board
        /// </summary>
        [EnumMember(Value = "developer_board")]
        Developerboard = 228,
        /// <summary>
        /// Enum Developermode for value: developer_mode
        /// </summary>
        [EnumMember(Value = "developer_mode")]
        Developermode = 229,
        /// <summary>
        /// Enum Devicehub for value: device_hub
        /// </summary>
        [EnumMember(Value = "device_hub")]
        Devicehub = 230,
        /// <summary>
        /// Enum Devices for value: devices
        /// </summary>
        [EnumMember(Value = "devices")]
        Devices = 231,
        /// <summary>
        /// Enum Devicesother for value: devices_other
        /// </summary>
        [EnumMember(Value = "devices_other")]
        Devicesother = 232,
        /// <summary>
        /// Enum Dialersip for value: dialer_sip
        /// </summary>
        [EnumMember(Value = "dialer_sip")]
        Dialersip = 233,
        /// <summary>
        /// Enum Dialpad for value: dialpad
        /// </summary>
        [EnumMember(Value = "dialpad")]
        Dialpad = 234,
        /// <summary>
        /// Enum Directions for value: directions
        /// </summary>
        [EnumMember(Value = "directions")]
        Directions = 235,
        /// <summary>
        /// Enum Directionsbike for value: directions_bike
        /// </summary>
        [EnumMember(Value = "directions_bike")]
        Directionsbike = 236,
        /// <summary>
        /// Enum Directionsboat for value: directions_boat
        /// </summary>
        [EnumMember(Value = "directions_boat")]
        Directionsboat = 237,
        /// <summary>
        /// Enum Directionsbus for value: directions_bus
        /// </summary>
        [EnumMember(Value = "directions_bus")]
        Directionsbus = 238,
        /// <summary>
        /// Enum Directionscar for value: directions_car
        /// </summary>
        [EnumMember(Value = "directions_car")]
        Directionscar = 239,
        /// <summary>
        /// Enum Directionsrailway for value: directions_railway
        /// </summary>
        [EnumMember(Value = "directions_railway")]
        Directionsrailway = 240,
        /// <summary>
        /// Enum Directionsrun for value: directions_run
        /// </summary>
        [EnumMember(Value = "directions_run")]
        Directionsrun = 241,
        /// <summary>
        /// Enum Directionssubway for value: directions_subway
        /// </summary>
        [EnumMember(Value = "directions_subway")]
        Directionssubway = 242,
        /// <summary>
        /// Enum Directionstransit for value: directions_transit
        /// </summary>
        [EnumMember(Value = "directions_transit")]
        Directionstransit = 243,
        /// <summary>
        /// Enum Directionswalk for value: directions_walk
        /// </summary>
        [EnumMember(Value = "directions_walk")]
        Directionswalk = 244,
        /// <summary>
        /// Enum Discfull for value: disc_full
        /// </summary>
        [EnumMember(Value = "disc_full")]
        Discfull = 245,
        /// <summary>
        /// Enum Dns for value: dns
        /// </summary>
        [EnumMember(Value = "dns")]
        Dns = 246,
        /// <summary>
        /// Enum Donotdisturb for value: do_not_disturb
        /// </summary>
        [EnumMember(Value = "do_not_disturb")]
        Donotdisturb = 247,
        /// <summary>
        /// Enum Donotdisturbalt for value: do_not_disturb_alt
        /// </summary>
        [EnumMember(Value = "do_not_disturb_alt")]
        Donotdisturbalt = 248,
        /// <summary>
        /// Enum Donotdisturboff for value: do_not_disturb_off
        /// </summary>
        [EnumMember(Value = "do_not_disturb_off")]
        Donotdisturboff = 249,
        /// <summary>
        /// Enum Donotdisturbon for value: do_not_disturb_on
        /// </summary>
        [EnumMember(Value = "do_not_disturb_on")]
        Donotdisturbon = 250,
        /// <summary>
        /// Enum Dock for value: dock
        /// </summary>
        [EnumMember(Value = "dock")]
        Dock = 251,
        /// <summary>
        /// Enum Domain for value: domain
        /// </summary>
        [EnumMember(Value = "domain")]
        Domain = 252,
        /// <summary>
        /// Enum Done for value: done
        /// </summary>
        [EnumMember(Value = "done")]
        Done = 253,
        /// <summary>
        /// Enum Doneall for value: done_all
        /// </summary>
        [EnumMember(Value = "done_all")]
        Doneall = 254,
        /// <summary>
        /// Enum Donutlarge for value: donut_large
        /// </summary>
        [EnumMember(Value = "donut_large")]
        Donutlarge = 255,
        /// <summary>
        /// Enum Donutsmall for value: donut_small
        /// </summary>
        [EnumMember(Value = "donut_small")]
        Donutsmall = 256,
        /// <summary>
        /// Enum Drafts for value: drafts
        /// </summary>
        [EnumMember(Value = "drafts")]
        Drafts = 257,
        /// <summary>
        /// Enum Draghandle for value: drag_handle
        /// </summary>
        [EnumMember(Value = "drag_handle")]
        Draghandle = 258,
        /// <summary>
        /// Enum Driveeta for value: drive_eta
        /// </summary>
        [EnumMember(Value = "drive_eta")]
        Driveeta = 259,
        /// <summary>
        /// Enum Dvr for value: dvr
        /// </summary>
        [EnumMember(Value = "dvr")]
        Dvr = 260,
        /// <summary>
        /// Enum Edit for value: edit
        /// </summary>
        [EnumMember(Value = "edit")]
        Edit = 261,
        /// <summary>
        /// Enum Editlocation for value: edit_location
        /// </summary>
        [EnumMember(Value = "edit_location")]
        Editlocation = 262,
        /// <summary>
        /// Enum Eject for value: eject
        /// </summary>
        [EnumMember(Value = "eject")]
        Eject = 263,
        /// <summary>
        /// Enum Email for value: email
        /// </summary>
        [EnumMember(Value = "email")]
        Email = 264,
        /// <summary>
        /// Enum Enhancedencryption for value: enhanced_encryption
        /// </summary>
        [EnumMember(Value = "enhanced_encryption")]
        Enhancedencryption = 265,
        /// <summary>
        /// Enum Equalizer for value: equalizer
        /// </summary>
        [EnumMember(Value = "equalizer")]
        Equalizer = 266,
        /// <summary>
        /// Enum Error for value: error
        /// </summary>
        [EnumMember(Value = "error")]
        Error = 267,
        /// <summary>
        /// Enum Erroroutline for value: error_outline
        /// </summary>
        [EnumMember(Value = "error_outline")]
        Erroroutline = 268,
        /// <summary>
        /// Enum Eurosymbol for value: euro_symbol
        /// </summary>
        [EnumMember(Value = "euro_symbol")]
        Eurosymbol = 269,
        /// <summary>
        /// Enum Evstation for value: ev_station
        /// </summary>
        [EnumMember(Value = "ev_station")]
        Evstation = 270,
        /// <summary>
        /// Enum Event for value: event
        /// </summary>
        [EnumMember(Value = "event")]
        Event = 271,
        /// <summary>
        /// Enum Eventavailable for value: event_available
        /// </summary>
        [EnumMember(Value = "event_available")]
        Eventavailable = 272,
        /// <summary>
        /// Enum Eventbusy for value: event_busy
        /// </summary>
        [EnumMember(Value = "event_busy")]
        Eventbusy = 273,
        /// <summary>
        /// Enum Eventnote for value: event_note
        /// </summary>
        [EnumMember(Value = "event_note")]
        Eventnote = 274,
        /// <summary>
        /// Enum Eventseat for value: event_seat
        /// </summary>
        [EnumMember(Value = "event_seat")]
        Eventseat = 275,
        /// <summary>
        /// Enum Exittoapp for value: exit_to_app
        /// </summary>
        [EnumMember(Value = "exit_to_app")]
        Exittoapp = 276,
        /// <summary>
        /// Enum Expandless for value: expand_less
        /// </summary>
        [EnumMember(Value = "expand_less")]
        Expandless = 277,
        /// <summary>
        /// Enum Expandmore for value: expand_more
        /// </summary>
        [EnumMember(Value = "expand_more")]
        Expandmore = 278,
        /// <summary>
        /// Enum Explicit for value: explicit
        /// </summary>
        [EnumMember(Value = "explicit")]
        Explicit = 279,
        /// <summary>
        /// Enum Explore for value: explore
        /// </summary>
        [EnumMember(Value = "explore")]
        Explore = 280,
        /// <summary>
        /// Enum Exposure for value: exposure
        /// </summary>
        [EnumMember(Value = "exposure")]
        Exposure = 281,
        /// <summary>
        /// Enum Exposureneg1 for value: exposure_neg_1
        /// </summary>
        [EnumMember(Value = "exposure_neg_1")]
        Exposureneg1 = 282,
        /// <summary>
        /// Enum Exposureneg2 for value: exposure_neg_2
        /// </summary>
        [EnumMember(Value = "exposure_neg_2")]
        Exposureneg2 = 283,
        /// <summary>
        /// Enum Exposureplus1 for value: exposure_plus_1
        /// </summary>
        [EnumMember(Value = "exposure_plus_1")]
        Exposureplus1 = 284,
        /// <summary>
        /// Enum Exposureplus2 for value: exposure_plus_2
        /// </summary>
        [EnumMember(Value = "exposure_plus_2")]
        Exposureplus2 = 285,
        /// <summary>
        /// Enum Exposurezero for value: exposure_zero
        /// </summary>
        [EnumMember(Value = "exposure_zero")]
        Exposurezero = 286,
        /// <summary>
        /// Enum Extension for value: extension
        /// </summary>
        [EnumMember(Value = "extension")]
        Extension = 287,
        /// <summary>
        /// Enum Face for value: face
        /// </summary>
        [EnumMember(Value = "face")]
        Face = 288,
        /// <summary>
        /// Enum Fastforward for value: fast_forward
        /// </summary>
        [EnumMember(Value = "fast_forward")]
        Fastforward = 289,
        /// <summary>
        /// Enum Fastrewind for value: fast_rewind
        /// </summary>
        [EnumMember(Value = "fast_rewind")]
        Fastrewind = 290,
        /// <summary>
        /// Enum Favorite for value: favorite
        /// </summary>
        [EnumMember(Value = "favorite")]
        Favorite = 291,
        /// <summary>
        /// Enum Favoriteborder for value: favorite_border
        /// </summary>
        [EnumMember(Value = "favorite_border")]
        Favoriteborder = 292,
        /// <summary>
        /// Enum Featuredplaylist for value: featured_play_list
        /// </summary>
        [EnumMember(Value = "featured_play_list")]
        Featuredplaylist = 293,
        /// <summary>
        /// Enum Featuredvideo for value: featured_video
        /// </summary>
        [EnumMember(Value = "featured_video")]
        Featuredvideo = 294,
        /// <summary>
        /// Enum Feedback for value: feedback
        /// </summary>
        [EnumMember(Value = "feedback")]
        Feedback = 295,
        /// <summary>
        /// Enum Fiberdvr for value: fiber_dvr
        /// </summary>
        [EnumMember(Value = "fiber_dvr")]
        Fiberdvr = 296,
        /// <summary>
        /// Enum Fibermanualrecord for value: fiber_manual_record
        /// </summary>
        [EnumMember(Value = "fiber_manual_record")]
        Fibermanualrecord = 297,
        /// <summary>
        /// Enum Fibernew for value: fiber_new
        /// </summary>
        [EnumMember(Value = "fiber_new")]
        Fibernew = 298,
        /// <summary>
        /// Enum Fiberpin for value: fiber_pin
        /// </summary>
        [EnumMember(Value = "fiber_pin")]
        Fiberpin = 299,
        /// <summary>
        /// Enum Fibersmartrecord for value: fiber_smart_record
        /// </summary>
        [EnumMember(Value = "fiber_smart_record")]
        Fibersmartrecord = 300,
        /// <summary>
        /// Enum Filedownload for value: file_download
        /// </summary>
        [EnumMember(Value = "file_download")]
        Filedownload = 301,
        /// <summary>
        /// Enum Fileupload for value: file_upload
        /// </summary>
        [EnumMember(Value = "file_upload")]
        Fileupload = 302,
        /// <summary>
        /// Enum Filter for value: filter
        /// </summary>
        [EnumMember(Value = "filter")]
        Filter = 303,
        /// <summary>
        /// Enum Filter1 for value: filter_1
        /// </summary>
        [EnumMember(Value = "filter_1")]
        Filter1 = 304,
        /// <summary>
        /// Enum Filter2 for value: filter_2
        /// </summary>
        [EnumMember(Value = "filter_2")]
        Filter2 = 305,
        /// <summary>
        /// Enum Filter3 for value: filter_3
        /// </summary>
        [EnumMember(Value = "filter_3")]
        Filter3 = 306,
        /// <summary>
        /// Enum Filter4 for value: filter_4
        /// </summary>
        [EnumMember(Value = "filter_4")]
        Filter4 = 307,
        /// <summary>
        /// Enum Filter5 for value: filter_5
        /// </summary>
        [EnumMember(Value = "filter_5")]
        Filter5 = 308,
        /// <summary>
        /// Enum Filter6 for value: filter_6
        /// </summary>
        [EnumMember(Value = "filter_6")]
        Filter6 = 309,
        /// <summary>
        /// Enum Filter7 for value: filter_7
        /// </summary>
        [EnumMember(Value = "filter_7")]
        Filter7 = 310,
        /// <summary>
        /// Enum Filter8 for value: filter_8
        /// </summary>
        [EnumMember(Value = "filter_8")]
        Filter8 = 311,
        /// <summary>
        /// Enum Filter9 for value: filter_9
        /// </summary>
        [EnumMember(Value = "filter_9")]
        Filter9 = 312,
        /// <summary>
        /// Enum Filter9plus for value: filter_9_plus
        /// </summary>
        [EnumMember(Value = "filter_9_plus")]
        Filter9plus = 313,
        /// <summary>
        /// Enum Filterbandw for value: filter_b_and_w
        /// </summary>
        [EnumMember(Value = "filter_b_and_w")]
        Filterbandw = 314,
        /// <summary>
        /// Enum Filtercenterfocus for value: filter_center_focus
        /// </summary>
        [EnumMember(Value = "filter_center_focus")]
        Filtercenterfocus = 315,
        /// <summary>
        /// Enum Filterdrama for value: filter_drama
        /// </summary>
        [EnumMember(Value = "filter_drama")]
        Filterdrama = 316,
        /// <summary>
        /// Enum Filterframes for value: filter_frames
        /// </summary>
        [EnumMember(Value = "filter_frames")]
        Filterframes = 317,
        /// <summary>
        /// Enum Filterhdr for value: filter_hdr
        /// </summary>
        [EnumMember(Value = "filter_hdr")]
        Filterhdr = 318,
        /// <summary>
        /// Enum Filterlist for value: filter_list
        /// </summary>
        [EnumMember(Value = "filter_list")]
        Filterlist = 319,
        /// <summary>
        /// Enum Filternone for value: filter_none
        /// </summary>
        [EnumMember(Value = "filter_none")]
        Filternone = 320,
        /// <summary>
        /// Enum Filtertiltshift for value: filter_tilt_shift
        /// </summary>
        [EnumMember(Value = "filter_tilt_shift")]
        Filtertiltshift = 321,
        /// <summary>
        /// Enum Filtervintage for value: filter_vintage
        /// </summary>
        [EnumMember(Value = "filter_vintage")]
        Filtervintage = 322,
        /// <summary>
        /// Enum Findinpage for value: find_in_page
        /// </summary>
        [EnumMember(Value = "find_in_page")]
        Findinpage = 323,
        /// <summary>
        /// Enum Findreplace for value: find_replace
        /// </summary>
        [EnumMember(Value = "find_replace")]
        Findreplace = 324,
        /// <summary>
        /// Enum Fingerprint for value: fingerprint
        /// </summary>
        [EnumMember(Value = "fingerprint")]
        Fingerprint = 325,
        /// <summary>
        /// Enum Firstpage for value: first_page
        /// </summary>
        [EnumMember(Value = "first_page")]
        Firstpage = 326,
        /// <summary>
        /// Enum Fitnesscenter for value: fitness_center
        /// </summary>
        [EnumMember(Value = "fitness_center")]
        Fitnesscenter = 327,
        /// <summary>
        /// Enum Flag for value: flag
        /// </summary>
        [EnumMember(Value = "flag")]
        Flag = 328,
        /// <summary>
        /// Enum Flare for value: flare
        /// </summary>
        [EnumMember(Value = "flare")]
        Flare = 329,
        /// <summary>
        /// Enum Flashauto for value: flash_auto
        /// </summary>
        [EnumMember(Value = "flash_auto")]
        Flashauto = 330,
        /// <summary>
        /// Enum Flashoff for value: flash_off
        /// </summary>
        [EnumMember(Value = "flash_off")]
        Flashoff = 331,
        /// <summary>
        /// Enum Flashon for value: flash_on
        /// </summary>
        [EnumMember(Value = "flash_on")]
        Flashon = 332,
        /// <summary>
        /// Enum Flight for value: flight
        /// </summary>
        [EnumMember(Value = "flight")]
        Flight = 333,
        /// <summary>
        /// Enum Flightland for value: flight_land
        /// </summary>
        [EnumMember(Value = "flight_land")]
        Flightland = 334,
        /// <summary>
        /// Enum Flighttakeoff for value: flight_takeoff
        /// </summary>
        [EnumMember(Value = "flight_takeoff")]
        Flighttakeoff = 335,
        /// <summary>
        /// Enum Flip for value: flip
        /// </summary>
        [EnumMember(Value = "flip")]
        Flip = 336,
        /// <summary>
        /// Enum Fliptoback for value: flip_to_back
        /// </summary>
        [EnumMember(Value = "flip_to_back")]
        Fliptoback = 337,
        /// <summary>
        /// Enum Fliptofront for value: flip_to_front
        /// </summary>
        [EnumMember(Value = "flip_to_front")]
        Fliptofront = 338,
        /// <summary>
        /// Enum Folder for value: folder
        /// </summary>
        [EnumMember(Value = "folder")]
        Folder = 339,
        /// <summary>
        /// Enum Folderopen for value: folder_open
        /// </summary>
        [EnumMember(Value = "folder_open")]
        Folderopen = 340,
        /// <summary>
        /// Enum Foldershared for value: folder_shared
        /// </summary>
        [EnumMember(Value = "folder_shared")]
        Foldershared = 341,
        /// <summary>
        /// Enum Folderspecial for value: folder_special
        /// </summary>
        [EnumMember(Value = "folder_special")]
        Folderspecial = 342,
        /// <summary>
        /// Enum Fontdownload for value: font_download
        /// </summary>
        [EnumMember(Value = "font_download")]
        Fontdownload = 343,
        /// <summary>
        /// Enum Formataligncenter for value: format_align_center
        /// </summary>
        [EnumMember(Value = "format_align_center")]
        Formataligncenter = 344,
        /// <summary>
        /// Enum Formatalignjustify for value: format_align_justify
        /// </summary>
        [EnumMember(Value = "format_align_justify")]
        Formatalignjustify = 345,
        /// <summary>
        /// Enum Formatalignleft for value: format_align_left
        /// </summary>
        [EnumMember(Value = "format_align_left")]
        Formatalignleft = 346,
        /// <summary>
        /// Enum Formatalignright for value: format_align_right
        /// </summary>
        [EnumMember(Value = "format_align_right")]
        Formatalignright = 347,
        /// <summary>
        /// Enum Formatbold for value: format_bold
        /// </summary>
        [EnumMember(Value = "format_bold")]
        Formatbold = 348,
        /// <summary>
        /// Enum Formatclear for value: format_clear
        /// </summary>
        [EnumMember(Value = "format_clear")]
        Formatclear = 349,
        /// <summary>
        /// Enum Formatcolorfill for value: format_color_fill
        /// </summary>
        [EnumMember(Value = "format_color_fill")]
        Formatcolorfill = 350,
        /// <summary>
        /// Enum Formatcolorreset for value: format_color_reset
        /// </summary>
        [EnumMember(Value = "format_color_reset")]
        Formatcolorreset = 351,
        /// <summary>
        /// Enum Formatcolortext for value: format_color_text
        /// </summary>
        [EnumMember(Value = "format_color_text")]
        Formatcolortext = 352,
        /// <summary>
        /// Enum Formatindentdecrease for value: format_indent_decrease
        /// </summary>
        [EnumMember(Value = "format_indent_decrease")]
        Formatindentdecrease = 353,
        /// <summary>
        /// Enum Formatindentincrease for value: format_indent_increase
        /// </summary>
        [EnumMember(Value = "format_indent_increase")]
        Formatindentincrease = 354,
        /// <summary>
        /// Enum Formatitalic for value: format_italic
        /// </summary>
        [EnumMember(Value = "format_italic")]
        Formatitalic = 355,
        /// <summary>
        /// Enum Formatlinespacing for value: format_line_spacing
        /// </summary>
        [EnumMember(Value = "format_line_spacing")]
        Formatlinespacing = 356,
        /// <summary>
        /// Enum Formatlistbulleted for value: format_list_bulleted
        /// </summary>
        [EnumMember(Value = "format_list_bulleted")]
        Formatlistbulleted = 357,
        /// <summary>
        /// Enum Formatlistnumbered for value: format_list_numbered
        /// </summary>
        [EnumMember(Value = "format_list_numbered")]
        Formatlistnumbered = 358,
        /// <summary>
        /// Enum Formatpaint for value: format_paint
        /// </summary>
        [EnumMember(Value = "format_paint")]
        Formatpaint = 359,
        /// <summary>
        /// Enum Formatquote for value: format_quote
        /// </summary>
        [EnumMember(Value = "format_quote")]
        Formatquote = 360,
        /// <summary>
        /// Enum Formatshapes for value: format_shapes
        /// </summary>
        [EnumMember(Value = "format_shapes")]
        Formatshapes = 361,
        /// <summary>
        /// Enum Formatsize for value: format_size
        /// </summary>
        [EnumMember(Value = "format_size")]
        Formatsize = 362,
        /// <summary>
        /// Enum Formatstrikethrough for value: format_strikethrough
        /// </summary>
        [EnumMember(Value = "format_strikethrough")]
        Formatstrikethrough = 363,
        /// <summary>
        /// Enum Formattextdirectionltor for value: format_textdirection_l_to_r
        /// </summary>
        [EnumMember(Value = "format_textdirection_l_to_r")]
        Formattextdirectionltor = 364,
        /// <summary>
        /// Enum Formattextdirectionrtol for value: format_textdirection_r_to_l
        /// </summary>
        [EnumMember(Value = "format_textdirection_r_to_l")]
        Formattextdirectionrtol = 365,
        /// <summary>
        /// Enum Formatunderlined for value: format_underlined
        /// </summary>
        [EnumMember(Value = "format_underlined")]
        Formatunderlined = 366,
        /// <summary>
        /// Enum Forum for value: forum
        /// </summary>
        [EnumMember(Value = "forum")]
        Forum = 367,
        /// <summary>
        /// Enum Forward for value: forward
        /// </summary>
        [EnumMember(Value = "forward")]
        Forward = 368,
        /// <summary>
        /// Enum Forward10 for value: forward_10
        /// </summary>
        [EnumMember(Value = "forward_10")]
        Forward10 = 369,
        /// <summary>
        /// Enum Forward30 for value: forward_30
        /// </summary>
        [EnumMember(Value = "forward_30")]
        Forward30 = 370,
        /// <summary>
        /// Enum Forward5 for value: forward_5
        /// </summary>
        [EnumMember(Value = "forward_5")]
        Forward5 = 371,
        /// <summary>
        /// Enum Freebreakfast for value: free_breakfast
        /// </summary>
        [EnumMember(Value = "free_breakfast")]
        Freebreakfast = 372,
        /// <summary>
        /// Enum Fullscreen for value: fullscreen
        /// </summary>
        [EnumMember(Value = "fullscreen")]
        Fullscreen = 373,
        /// <summary>
        /// Enum Fullscreenexit for value: fullscreen_exit
        /// </summary>
        [EnumMember(Value = "fullscreen_exit")]
        Fullscreenexit = 374,
        /// <summary>
        /// Enum Functions for value: functions
        /// </summary>
        [EnumMember(Value = "functions")]
        Functions = 375,
        /// <summary>
        /// Enum Gtranslate for value: g_translate
        /// </summary>
        [EnumMember(Value = "g_translate")]
        Gtranslate = 376,
        /// <summary>
        /// Enum Gamepad for value: gamepad
        /// </summary>
        [EnumMember(Value = "gamepad")]
        Gamepad = 377,
        /// <summary>
        /// Enum Games for value: games
        /// </summary>
        [EnumMember(Value = "games")]
        Games = 378,
        /// <summary>
        /// Enum Gavel for value: gavel
        /// </summary>
        [EnumMember(Value = "gavel")]
        Gavel = 379,
        /// <summary>
        /// Enum Gesture for value: gesture
        /// </summary>
        [EnumMember(Value = "gesture")]
        Gesture = 380,
        /// <summary>
        /// Enum Getapp for value: get_app
        /// </summary>
        [EnumMember(Value = "get_app")]
        Getapp = 381,
        /// <summary>
        /// Enum Gif for value: gif
        /// </summary>
        [EnumMember(Value = "gif")]
        Gif = 382,
        /// <summary>
        /// Enum Golfcourse for value: golf_course
        /// </summary>
        [EnumMember(Value = "golf_course")]
        Golfcourse = 383,
        /// <summary>
        /// Enum Gpsfixed for value: gps_fixed
        /// </summary>
        [EnumMember(Value = "gps_fixed")]
        Gpsfixed = 384,
        /// <summary>
        /// Enum Gpsnotfixed for value: gps_not_fixed
        /// </summary>
        [EnumMember(Value = "gps_not_fixed")]
        Gpsnotfixed = 385,
        /// <summary>
        /// Enum Gpsoff for value: gps_off
        /// </summary>
        [EnumMember(Value = "gps_off")]
        Gpsoff = 386,
        /// <summary>
        /// Enum Grade for value: grade
        /// </summary>
        [EnumMember(Value = "grade")]
        Grade = 387,
        /// <summary>
        /// Enum Gradient for value: gradient
        /// </summary>
        [EnumMember(Value = "gradient")]
        Gradient = 388,
        /// <summary>
        /// Enum Grain for value: grain
        /// </summary>
        [EnumMember(Value = "grain")]
        Grain = 389,
        /// <summary>
        /// Enum Graphiceq for value: graphic_eq
        /// </summary>
        [EnumMember(Value = "graphic_eq")]
        Graphiceq = 390,
        /// <summary>
        /// Enum Gridoff for value: grid_off
        /// </summary>
        [EnumMember(Value = "grid_off")]
        Gridoff = 391,
        /// <summary>
        /// Enum Gridon for value: grid_on
        /// </summary>
        [EnumMember(Value = "grid_on")]
        Gridon = 392,
        /// <summary>
        /// Enum Group for value: group
        /// </summary>
        [EnumMember(Value = "group")]
        Group = 393,
        /// <summary>
        /// Enum Groupadd for value: group_add
        /// </summary>
        [EnumMember(Value = "group_add")]
        Groupadd = 394,
        /// <summary>
        /// Enum Groupwork for value: group_work
        /// </summary>
        [EnumMember(Value = "group_work")]
        Groupwork = 395,
        /// <summary>
        /// Enum Hd for value: hd
        /// </summary>
        [EnumMember(Value = "hd")]
        Hd = 396,
        /// <summary>
        /// Enum Hdroff for value: hdr_off
        /// </summary>
        [EnumMember(Value = "hdr_off")]
        Hdroff = 397,
        /// <summary>
        /// Enum Hdron for value: hdr_on
        /// </summary>
        [EnumMember(Value = "hdr_on")]
        Hdron = 398,
        /// <summary>
        /// Enum Hdrstrong for value: hdr_strong
        /// </summary>
        [EnumMember(Value = "hdr_strong")]
        Hdrstrong = 399,
        /// <summary>
        /// Enum Hdrweak for value: hdr_weak
        /// </summary>
        [EnumMember(Value = "hdr_weak")]
        Hdrweak = 400,
        /// <summary>
        /// Enum Headset for value: headset
        /// </summary>
        [EnumMember(Value = "headset")]
        Headset = 401,
        /// <summary>
        /// Enum Headsetmic for value: headset_mic
        /// </summary>
        [EnumMember(Value = "headset_mic")]
        Headsetmic = 402,
        /// <summary>
        /// Enum Healing for value: healing
        /// </summary>
        [EnumMember(Value = "healing")]
        Healing = 403,
        /// <summary>
        /// Enum Hearing for value: hearing
        /// </summary>
        [EnumMember(Value = "hearing")]
        Hearing = 404,
        /// <summary>
        /// Enum Help for value: help
        /// </summary>
        [EnumMember(Value = "help")]
        Help = 405,
        /// <summary>
        /// Enum Helpoutline for value: help_outline
        /// </summary>
        [EnumMember(Value = "help_outline")]
        Helpoutline = 406,
        /// <summary>
        /// Enum Highquality for value: high_quality
        /// </summary>
        [EnumMember(Value = "high_quality")]
        Highquality = 407,
        /// <summary>
        /// Enum Highlight for value: highlight
        /// </summary>
        [EnumMember(Value = "highlight")]
        Highlight = 408,
        /// <summary>
        /// Enum Highlightoff for value: highlight_off
        /// </summary>
        [EnumMember(Value = "highlight_off")]
        Highlightoff = 409,
        /// <summary>
        /// Enum History for value: history
        /// </summary>
        [EnumMember(Value = "history")]
        History = 410,
        /// <summary>
        /// Enum Historytoggleoff for value: history_toggle_off
        /// </summary>
        [EnumMember(Value = "history_toggle_off")]
        Historytoggleoff = 411,
        /// <summary>
        /// Enum Home for value: home
        /// </summary>
        [EnumMember(Value = "home")]
        Home = 412,
        /// <summary>
        /// Enum Hottub for value: hot_tub
        /// </summary>
        [EnumMember(Value = "hot_tub")]
        Hottub = 413,
        /// <summary>
        /// Enum Hotel for value: hotel
        /// </summary>
        [EnumMember(Value = "hotel")]
        Hotel = 414,
        /// <summary>
        /// Enum Hourglassempty for value: hourglass_empty
        /// </summary>
        [EnumMember(Value = "hourglass_empty")]
        Hourglassempty = 415,
        /// <summary>
        /// Enum Hourglassfull for value: hourglass_full
        /// </summary>
        [EnumMember(Value = "hourglass_full")]
        Hourglassfull = 416,
        /// <summary>
        /// Enum Http for value: http
        /// </summary>
        [EnumMember(Value = "http")]
        Http = 417,
        /// <summary>
        /// Enum Https for value: https
        /// </summary>
        [EnumMember(Value = "https")]
        Https = 418,
        /// <summary>
        /// Enum Image for value: image
        /// </summary>
        [EnumMember(Value = "image")]
        Image = 419,
        /// <summary>
        /// Enum Imageaspectratio for value: image_aspect_ratio
        /// </summary>
        [EnumMember(Value = "image_aspect_ratio")]
        Imageaspectratio = 420,
        /// <summary>
        /// Enum Importcontacts for value: import_contacts
        /// </summary>
        [EnumMember(Value = "import_contacts")]
        Importcontacts = 421,
        /// <summary>
        /// Enum Importexport for value: import_export
        /// </summary>
        [EnumMember(Value = "import_export")]
        Importexport = 422,
        /// <summary>
        /// Enum Importantdevices for value: important_devices
        /// </summary>
        [EnumMember(Value = "important_devices")]
        Importantdevices = 423,
        /// <summary>
        /// Enum Inbox for value: inbox
        /// </summary>
        [EnumMember(Value = "inbox")]
        Inbox = 424,
        /// <summary>
        /// Enum Indeterminatecheckbox for value: indeterminate_check_box
        /// </summary>
        [EnumMember(Value = "indeterminate_check_box")]
        Indeterminatecheckbox = 425,
        /// <summary>
        /// Enum Info for value: info
        /// </summary>
        [EnumMember(Value = "info")]
        Info = 426,
        /// <summary>
        /// Enum Infooutline for value: info_outline
        /// </summary>
        [EnumMember(Value = "info_outline")]
        Infooutline = 427,
        /// <summary>
        /// Enum Input for value: input
        /// </summary>
        [EnumMember(Value = "input")]
        Input = 428,
        /// <summary>
        /// Enum Insertchart for value: insert_chart
        /// </summary>
        [EnumMember(Value = "insert_chart")]
        Insertchart = 429,
        /// <summary>
        /// Enum Insertcomment for value: insert_comment
        /// </summary>
        [EnumMember(Value = "insert_comment")]
        Insertcomment = 430,
        /// <summary>
        /// Enum Insertdrivefile for value: insert_drive_file
        /// </summary>
        [EnumMember(Value = "insert_drive_file")]
        Insertdrivefile = 431,
        /// <summary>
        /// Enum Insertemoticon for value: insert_emoticon
        /// </summary>
        [EnumMember(Value = "insert_emoticon")]
        Insertemoticon = 432,
        /// <summary>
        /// Enum Insertinvitation for value: insert_invitation
        /// </summary>
        [EnumMember(Value = "insert_invitation")]
        Insertinvitation = 433,
        /// <summary>
        /// Enum Insertlink for value: insert_link
        /// </summary>
        [EnumMember(Value = "insert_link")]
        Insertlink = 434,
        /// <summary>
        /// Enum Insertphoto for value: insert_photo
        /// </summary>
        [EnumMember(Value = "insert_photo")]
        Insertphoto = 435,
        /// <summary>
        /// Enum Invertcolors for value: invert_colors
        /// </summary>
        [EnumMember(Value = "invert_colors")]
        Invertcolors = 436,
        /// <summary>
        /// Enum Invertcolorsoff for value: invert_colors_off
        /// </summary>
        [EnumMember(Value = "invert_colors_off")]
        Invertcolorsoff = 437,
        /// <summary>
        /// Enum Iso for value: iso
        /// </summary>
        [EnumMember(Value = "iso")]
        Iso = 438,
        /// <summary>
        /// Enum Keyboard for value: keyboard
        /// </summary>
        [EnumMember(Value = "keyboard")]
        Keyboard = 439,
        /// <summary>
        /// Enum Keyboardarrowdown for value: keyboard_arrow_down
        /// </summary>
        [EnumMember(Value = "keyboard_arrow_down")]
        Keyboardarrowdown = 440,
        /// <summary>
        /// Enum Keyboardarrowleft for value: keyboard_arrow_left
        /// </summary>
        [EnumMember(Value = "keyboard_arrow_left")]
        Keyboardarrowleft = 441,
        /// <summary>
        /// Enum Keyboardarrowright for value: keyboard_arrow_right
        /// </summary>
        [EnumMember(Value = "keyboard_arrow_right")]
        Keyboardarrowright = 442,
        /// <summary>
        /// Enum Keyboardarrowup for value: keyboard_arrow_up
        /// </summary>
        [EnumMember(Value = "keyboard_arrow_up")]
        Keyboardarrowup = 443,
        /// <summary>
        /// Enum Keyboardbackspace for value: keyboard_backspace
        /// </summary>
        [EnumMember(Value = "keyboard_backspace")]
        Keyboardbackspace = 444,
        /// <summary>
        /// Enum Keyboardcapslock for value: keyboard_capslock
        /// </summary>
        [EnumMember(Value = "keyboard_capslock")]
        Keyboardcapslock = 445,
        /// <summary>
        /// Enum Keyboardhide for value: keyboard_hide
        /// </summary>
        [EnumMember(Value = "keyboard_hide")]
        Keyboardhide = 446,
        /// <summary>
        /// Enum Keyboardreturn for value: keyboard_return
        /// </summary>
        [EnumMember(Value = "keyboard_return")]
        Keyboardreturn = 447,
        /// <summary>
        /// Enum Keyboardtab for value: keyboard_tab
        /// </summary>
        [EnumMember(Value = "keyboard_tab")]
        Keyboardtab = 448,
        /// <summary>
        /// Enum Keyboardvoice for value: keyboard_voice
        /// </summary>
        [EnumMember(Value = "keyboard_voice")]
        Keyboardvoice = 449,
        /// <summary>
        /// Enum Kitchen for value: kitchen
        /// </summary>
        [EnumMember(Value = "kitchen")]
        Kitchen = 450,
        /// <summary>
        /// Enum Label for value: label
        /// </summary>
        [EnumMember(Value = "label")]
        Label = 451,
        /// <summary>
        /// Enum Labeloutline for value: label_outline
        /// </summary>
        [EnumMember(Value = "label_outline")]
        Labeloutline = 452,
        /// <summary>
        /// Enum Landscape for value: landscape
        /// </summary>
        [EnumMember(Value = "landscape")]
        Landscape = 453,
        /// <summary>
        /// Enum Language for value: language
        /// </summary>
        [EnumMember(Value = "language")]
        Language = 454,
        /// <summary>
        /// Enum Laptop for value: laptop
        /// </summary>
        [EnumMember(Value = "laptop")]
        Laptop = 455,
        /// <summary>
        /// Enum Laptopchromebook for value: laptop_chromebook
        /// </summary>
        [EnumMember(Value = "laptop_chromebook")]
        Laptopchromebook = 456,
        /// <summary>
        /// Enum Laptopmac for value: laptop_mac
        /// </summary>
        [EnumMember(Value = "laptop_mac")]
        Laptopmac = 457,
        /// <summary>
        /// Enum Laptopwindows for value: laptop_windows
        /// </summary>
        [EnumMember(Value = "laptop_windows")]
        Laptopwindows = 458,
        /// <summary>
        /// Enum Lastpage for value: last_page
        /// </summary>
        [EnumMember(Value = "last_page")]
        Lastpage = 459,
        /// <summary>
        /// Enum Launch for value: launch
        /// </summary>
        [EnumMember(Value = "launch")]
        Launch = 460,
        /// <summary>
        /// Enum Layers for value: layers
        /// </summary>
        [EnumMember(Value = "layers")]
        Layers = 461,
        /// <summary>
        /// Enum Layersclear for value: layers_clear
        /// </summary>
        [EnumMember(Value = "layers_clear")]
        Layersclear = 462,
        /// <summary>
        /// Enum Leakadd for value: leak_add
        /// </summary>
        [EnumMember(Value = "leak_add")]
        Leakadd = 463,
        /// <summary>
        /// Enum Leakremove for value: leak_remove
        /// </summary>
        [EnumMember(Value = "leak_remove")]
        Leakremove = 464,
        /// <summary>
        /// Enum Lens for value: lens
        /// </summary>
        [EnumMember(Value = "lens")]
        Lens = 465,
        /// <summary>
        /// Enum Libraryadd for value: library_add
        /// </summary>
        [EnumMember(Value = "library_add")]
        Libraryadd = 466,
        /// <summary>
        /// Enum Librarybooks for value: library_books
        /// </summary>
        [EnumMember(Value = "library_books")]
        Librarybooks = 467,
        /// <summary>
        /// Enum Librarymusic for value: library_music
        /// </summary>
        [EnumMember(Value = "library_music")]
        Librarymusic = 468,
        /// <summary>
        /// Enum Lightbulboutline for value: lightbulb_outline
        /// </summary>
        [EnumMember(Value = "lightbulb_outline")]
        Lightbulboutline = 469,
        /// <summary>
        /// Enum Linestyle for value: line_style
        /// </summary>
        [EnumMember(Value = "line_style")]
        Linestyle = 470,
        /// <summary>
        /// Enum Lineweight for value: line_weight
        /// </summary>
        [EnumMember(Value = "line_weight")]
        Lineweight = 471,
        /// <summary>
        /// Enum Linearscale for value: linear_scale
        /// </summary>
        [EnumMember(Value = "linear_scale")]
        Linearscale = 472,
        /// <summary>
        /// Enum Link for value: link
        /// </summary>
        [EnumMember(Value = "link")]
        Link = 473,
        /// <summary>
        /// Enum Linkedcamera for value: linked_camera
        /// </summary>
        [EnumMember(Value = "linked_camera")]
        Linkedcamera = 474,
        /// <summary>
        /// Enum List for value: list
        /// </summary>
        [EnumMember(Value = "list")]
        List = 475,
        /// <summary>
        /// Enum Listalt for value: list_alt
        /// </summary>
        [EnumMember(Value = "list_alt")]
        Listalt = 476,
        /// <summary>
        /// Enum Livehelp for value: live_help
        /// </summary>
        [EnumMember(Value = "live_help")]
        Livehelp = 477,
        /// <summary>
        /// Enum Livetv for value: live_tv
        /// </summary>
        [EnumMember(Value = "live_tv")]
        Livetv = 478,
        /// <summary>
        /// Enum Login for value: login
        /// </summary>
        [EnumMember(Value = "login")]
        Login = 479,
        /// <summary>
        /// Enum Localactivity for value: local_activity
        /// </summary>
        [EnumMember(Value = "local_activity")]
        Localactivity = 480,
        /// <summary>
        /// Enum Localairport for value: local_airport
        /// </summary>
        [EnumMember(Value = "local_airport")]
        Localairport = 481,
        /// <summary>
        /// Enum Localatm for value: local_atm
        /// </summary>
        [EnumMember(Value = "local_atm")]
        Localatm = 482,
        /// <summary>
        /// Enum Localbar for value: local_bar
        /// </summary>
        [EnumMember(Value = "local_bar")]
        Localbar = 483,
        /// <summary>
        /// Enum Localcafe for value: local_cafe
        /// </summary>
        [EnumMember(Value = "local_cafe")]
        Localcafe = 484,
        /// <summary>
        /// Enum Localcarwash for value: local_car_wash
        /// </summary>
        [EnumMember(Value = "local_car_wash")]
        Localcarwash = 485,
        /// <summary>
        /// Enum Localconveniencestore for value: local_convenience_store
        /// </summary>
        [EnumMember(Value = "local_convenience_store")]
        Localconveniencestore = 486,
        /// <summary>
        /// Enum Localdining for value: local_dining
        /// </summary>
        [EnumMember(Value = "local_dining")]
        Localdining = 487,
        /// <summary>
        /// Enum Localdrink for value: local_drink
        /// </summary>
        [EnumMember(Value = "local_drink")]
        Localdrink = 488,
        /// <summary>
        /// Enum Localflorist for value: local_florist
        /// </summary>
        [EnumMember(Value = "local_florist")]
        Localflorist = 489,
        /// <summary>
        /// Enum Localgasstation for value: local_gas_station
        /// </summary>
        [EnumMember(Value = "local_gas_station")]
        Localgasstation = 490,
        /// <summary>
        /// Enum Localgrocerystore for value: local_grocery_store
        /// </summary>
        [EnumMember(Value = "local_grocery_store")]
        Localgrocerystore = 491,
        /// <summary>
        /// Enum Localhospital for value: local_hospital
        /// </summary>
        [EnumMember(Value = "local_hospital")]
        Localhospital = 492,
        /// <summary>
        /// Enum Localhotel for value: local_hotel
        /// </summary>
        [EnumMember(Value = "local_hotel")]
        Localhotel = 493,
        /// <summary>
        /// Enum Locallaundryservice for value: local_laundry_service
        /// </summary>
        [EnumMember(Value = "local_laundry_service")]
        Locallaundryservice = 494,
        /// <summary>
        /// Enum Locallibrary for value: local_library
        /// </summary>
        [EnumMember(Value = "local_library")]
        Locallibrary = 495,
        /// <summary>
        /// Enum Localmall for value: local_mall
        /// </summary>
        [EnumMember(Value = "local_mall")]
        Localmall = 496,
        /// <summary>
        /// Enum Localmovies for value: local_movies
        /// </summary>
        [EnumMember(Value = "local_movies")]
        Localmovies = 497,
        /// <summary>
        /// Enum Localoffer for value: local_offer
        /// </summary>
        [EnumMember(Value = "local_offer")]
        Localoffer = 498,
        /// <summary>
        /// Enum Localparking for value: local_parking
        /// </summary>
        [EnumMember(Value = "local_parking")]
        Localparking = 499,
        /// <summary>
        /// Enum Localpharmacy for value: local_pharmacy
        /// </summary>
        [EnumMember(Value = "local_pharmacy")]
        Localpharmacy = 500,
        /// <summary>
        /// Enum Localphone for value: local_phone
        /// </summary>
        [EnumMember(Value = "local_phone")]
        Localphone = 501,
        /// <summary>
        /// Enum Localpizza for value: local_pizza
        /// </summary>
        [EnumMember(Value = "local_pizza")]
        Localpizza = 502,
        /// <summary>
        /// Enum Localplay for value: local_play
        /// </summary>
        [EnumMember(Value = "local_play")]
        Localplay = 503,
        /// <summary>
        /// Enum Localpostoffice for value: local_post_office
        /// </summary>
        [EnumMember(Value = "local_post_office")]
        Localpostoffice = 504,
        /// <summary>
        /// Enum Localprintshop for value: local_printshop
        /// </summary>
        [EnumMember(Value = "local_printshop")]
        Localprintshop = 505,
        /// <summary>
        /// Enum Localsee for value: local_see
        /// </summary>
        [EnumMember(Value = "local_see")]
        Localsee = 506,
        /// <summary>
        /// Enum Localshipping for value: local_shipping
        /// </summary>
        [EnumMember(Value = "local_shipping")]
        Localshipping = 507,
        /// <summary>
        /// Enum Localtaxi for value: local_taxi
        /// </summary>
        [EnumMember(Value = "local_taxi")]
        Localtaxi = 508,
        /// <summary>
        /// Enum Locationcity for value: location_city
        /// </summary>
        [EnumMember(Value = "location_city")]
        Locationcity = 509,
        /// <summary>
        /// Enum Locationdisabled for value: location_disabled
        /// </summary>
        [EnumMember(Value = "location_disabled")]
        Locationdisabled = 510,
        /// <summary>
        /// Enum Locationoff for value: location_off
        /// </summary>
        [EnumMember(Value = "location_off")]
        Locationoff = 511,
        /// <summary>
        /// Enum Locationon for value: location_on
        /// </summary>
        [EnumMember(Value = "location_on")]
        Locationon = 512,
        /// <summary>
        /// Enum Locationsearching for value: location_searching
        /// </summary>
        [EnumMember(Value = "location_searching")]
        Locationsearching = 513,
        /// <summary>
        /// Enum Lock for value: lock
        /// </summary>
        [EnumMember(Value = "lock")]
        Lock = 514,
        /// <summary>
        /// Enum Lockopen for value: lock_open
        /// </summary>
        [EnumMember(Value = "lock_open")]
        Lockopen = 515,
        /// <summary>
        /// Enum Lockoutline for value: lock_outline
        /// </summary>
        [EnumMember(Value = "lock_outline")]
        Lockoutline = 516,
        /// <summary>
        /// Enum Looks for value: looks
        /// </summary>
        [EnumMember(Value = "looks")]
        Looks = 517,
        /// <summary>
        /// Enum Looks3 for value: looks_3
        /// </summary>
        [EnumMember(Value = "looks_3")]
        Looks3 = 518,
        /// <summary>
        /// Enum Looks4 for value: looks_4
        /// </summary>
        [EnumMember(Value = "looks_4")]
        Looks4 = 519,
        /// <summary>
        /// Enum Looks5 for value: looks_5
        /// </summary>
        [EnumMember(Value = "looks_5")]
        Looks5 = 520,
        /// <summary>
        /// Enum Looks6 for value: looks_6
        /// </summary>
        [EnumMember(Value = "looks_6")]
        Looks6 = 521,
        /// <summary>
        /// Enum Looksone for value: looks_one
        /// </summary>
        [EnumMember(Value = "looks_one")]
        Looksone = 522,
        /// <summary>
        /// Enum Lookstwo for value: looks_two
        /// </summary>
        [EnumMember(Value = "looks_two")]
        Lookstwo = 523,
        /// <summary>
        /// Enum Loop for value: loop
        /// </summary>
        [EnumMember(Value = "loop")]
        Loop = 524,
        /// <summary>
        /// Enum Loupe for value: loupe
        /// </summary>
        [EnumMember(Value = "loupe")]
        Loupe = 525,
        /// <summary>
        /// Enum Lowpriority for value: low_priority
        /// </summary>
        [EnumMember(Value = "low_priority")]
        Lowpriority = 526,
        /// <summary>
        /// Enum Loyalty for value: loyalty
        /// </summary>
        [EnumMember(Value = "loyalty")]
        Loyalty = 527,
        /// <summary>
        /// Enum Mail for value: mail
        /// </summary>
        [EnumMember(Value = "mail")]
        Mail = 528,
        /// <summary>
        /// Enum Mailoutline for value: mail_outline
        /// </summary>
        [EnumMember(Value = "mail_outline")]
        Mailoutline = 529,
        /// <summary>
        /// Enum Map for value: map
        /// </summary>
        [EnumMember(Value = "map")]
        Map = 530,
        /// <summary>
        /// Enum Markunread for value: markunread
        /// </summary>
        [EnumMember(Value = "markunread")]
        Markunread = 531,
        /// <summary>
        /// Enum Markunreadmailbox for value: markunread_mailbox
        /// </summary>
        [EnumMember(Value = "markunread_mailbox")]
        Markunreadmailbox = 532,
        /// <summary>
        /// Enum Memory for value: memory
        /// </summary>
        [EnumMember(Value = "memory")]
        Memory = 533,
        /// <summary>
        /// Enum Menu for value: menu
        /// </summary>
        [EnumMember(Value = "menu")]
        Menu = 534,
        /// <summary>
        /// Enum Mergetype for value: merge_type
        /// </summary>
        [EnumMember(Value = "merge_type")]
        Mergetype = 535,
        /// <summary>
        /// Enum Message for value: message
        /// </summary>
        [EnumMember(Value = "message")]
        Message = 536,
        /// <summary>
        /// Enum Mic for value: mic
        /// </summary>
        [EnumMember(Value = "mic")]
        Mic = 537,
        /// <summary>
        /// Enum Micnone for value: mic_none
        /// </summary>
        [EnumMember(Value = "mic_none")]
        Micnone = 538,
        /// <summary>
        /// Enum Micoff for value: mic_off
        /// </summary>
        [EnumMember(Value = "mic_off")]
        Micoff = 539,
        /// <summary>
        /// Enum Mms for value: mms
        /// </summary>
        [EnumMember(Value = "mms")]
        Mms = 540,
        /// <summary>
        /// Enum Modecomment for value: mode_comment
        /// </summary>
        [EnumMember(Value = "mode_comment")]
        Modecomment = 541,
        /// <summary>
        /// Enum Modeedit for value: mode_edit
        /// </summary>
        [EnumMember(Value = "mode_edit")]
        Modeedit = 542,
        /// <summary>
        /// Enum Monetizationon for value: monetization_on
        /// </summary>
        [EnumMember(Value = "monetization_on")]
        Monetizationon = 543,
        /// <summary>
        /// Enum Moneyoff for value: money_off
        /// </summary>
        [EnumMember(Value = "money_off")]
        Moneyoff = 544,
        /// <summary>
        /// Enum Monochromephotos for value: monochrome_photos
        /// </summary>
        [EnumMember(Value = "monochrome_photos")]
        Monochromephotos = 545,
        /// <summary>
        /// Enum Mood for value: mood
        /// </summary>
        [EnumMember(Value = "mood")]
        Mood = 546,
        /// <summary>
        /// Enum Moodbad for value: mood_bad
        /// </summary>
        [EnumMember(Value = "mood_bad")]
        Moodbad = 547,
        /// <summary>
        /// Enum More for value: more
        /// </summary>
        [EnumMember(Value = "more")]
        More = 548,
        /// <summary>
        /// Enum Morehoriz for value: more_horiz
        /// </summary>
        [EnumMember(Value = "more_horiz")]
        Morehoriz = 549,
        /// <summary>
        /// Enum Morevert for value: more_vert
        /// </summary>
        [EnumMember(Value = "more_vert")]
        Morevert = 550,
        /// <summary>
        /// Enum Motorcycle for value: motorcycle
        /// </summary>
        [EnumMember(Value = "motorcycle")]
        Motorcycle = 551,
        /// <summary>
        /// Enum Mouse for value: mouse
        /// </summary>
        [EnumMember(Value = "mouse")]
        Mouse = 552,
        /// <summary>
        /// Enum Movetoinbox for value: move_to_inbox
        /// </summary>
        [EnumMember(Value = "move_to_inbox")]
        Movetoinbox = 553,
        /// <summary>
        /// Enum Movie for value: movie
        /// </summary>
        [EnumMember(Value = "movie")]
        Movie = 554,
        /// <summary>
        /// Enum Moviecreation for value: movie_creation
        /// </summary>
        [EnumMember(Value = "movie_creation")]
        Moviecreation = 555,
        /// <summary>
        /// Enum Moviefilter for value: movie_filter
        /// </summary>
        [EnumMember(Value = "movie_filter")]
        Moviefilter = 556,
        /// <summary>
        /// Enum Multilinechart for value: multiline_chart
        /// </summary>
        [EnumMember(Value = "multiline_chart")]
        Multilinechart = 557,
        /// <summary>
        /// Enum Musicnote for value: music_note
        /// </summary>
        [EnumMember(Value = "music_note")]
        Musicnote = 558,
        /// <summary>
        /// Enum Musicvideo for value: music_video
        /// </summary>
        [EnumMember(Value = "music_video")]
        Musicvideo = 559,
        /// <summary>
        /// Enum Mylocation for value: my_location
        /// </summary>
        [EnumMember(Value = "my_location")]
        Mylocation = 560,
        /// <summary>
        /// Enum Nature for value: nature
        /// </summary>
        [EnumMember(Value = "nature")]
        Nature = 561,
        /// <summary>
        /// Enum Naturepeople for value: nature_people
        /// </summary>
        [EnumMember(Value = "nature_people")]
        Naturepeople = 562,
        /// <summary>
        /// Enum Navigatebefore for value: navigate_before
        /// </summary>
        [EnumMember(Value = "navigate_before")]
        Navigatebefore = 563,
        /// <summary>
        /// Enum Navigatenext for value: navigate_next
        /// </summary>
        [EnumMember(Value = "navigate_next")]
        Navigatenext = 564,
        /// <summary>
        /// Enum Navigation for value: navigation
        /// </summary>
        [EnumMember(Value = "navigation")]
        Navigation = 565,
        /// <summary>
        /// Enum Nearme for value: near_me
        /// </summary>
        [EnumMember(Value = "near_me")]
        Nearme = 566,
        /// <summary>
        /// Enum Networkcell for value: network_cell
        /// </summary>
        [EnumMember(Value = "network_cell")]
        Networkcell = 567,
        /// <summary>
        /// Enum Networkcheck for value: network_check
        /// </summary>
        [EnumMember(Value = "network_check")]
        Networkcheck = 568,
        /// <summary>
        /// Enum Networklocked for value: network_locked
        /// </summary>
        [EnumMember(Value = "network_locked")]
        Networklocked = 569,
        /// <summary>
        /// Enum Networkwifi for value: network_wifi
        /// </summary>
        [EnumMember(Value = "network_wifi")]
        Networkwifi = 570,
        /// <summary>
        /// Enum Newreleases for value: new_releases
        /// </summary>
        [EnumMember(Value = "new_releases")]
        Newreleases = 571,
        /// <summary>
        /// Enum Nextweek for value: next_week
        /// </summary>
        [EnumMember(Value = "next_week")]
        Nextweek = 572,
        /// <summary>
        /// Enum Nfc for value: nfc
        /// </summary>
        [EnumMember(Value = "nfc")]
        Nfc = 573,
        /// <summary>
        /// Enum Noencryption for value: no_encryption
        /// </summary>
        [EnumMember(Value = "no_encryption")]
        Noencryption = 574,
        /// <summary>
        /// Enum Nosim for value: no_sim
        /// </summary>
        [EnumMember(Value = "no_sim")]
        Nosim = 575,
        /// <summary>
        /// Enum Notinterested for value: not_interested
        /// </summary>
        [EnumMember(Value = "not_interested")]
        Notinterested = 576,
        /// <summary>
        /// Enum Note for value: note
        /// </summary>
        [EnumMember(Value = "note")]
        Note = 577,
        /// <summary>
        /// Enum Noteadd for value: note_add
        /// </summary>
        [EnumMember(Value = "note_add")]
        Noteadd = 578,
        /// <summary>
        /// Enum Notifications for value: notifications
        /// </summary>
        [EnumMember(Value = "notifications")]
        Notifications = 579,
        /// <summary>
        /// Enum Notificationsactive for value: notifications_active
        /// </summary>
        [EnumMember(Value = "notifications_active")]
        Notificationsactive = 580,
        /// <summary>
        /// Enum Notificationsnone for value: notifications_none
        /// </summary>
        [EnumMember(Value = "notifications_none")]
        Notificationsnone = 581,
        /// <summary>
        /// Enum Notificationsoff for value: notifications_off
        /// </summary>
        [EnumMember(Value = "notifications_off")]
        Notificationsoff = 582,
        /// <summary>
        /// Enum Notificationspaused for value: notifications_paused
        /// </summary>
        [EnumMember(Value = "notifications_paused")]
        Notificationspaused = 583,
        /// <summary>
        /// Enum Offlinepin for value: offline_pin
        /// </summary>
        [EnumMember(Value = "offline_pin")]
        Offlinepin = 584,
        /// <summary>
        /// Enum Ondemandvideo for value: ondemand_video
        /// </summary>
        [EnumMember(Value = "ondemand_video")]
        Ondemandvideo = 585,
        /// <summary>
        /// Enum Opacity for value: opacity
        /// </summary>
        [EnumMember(Value = "opacity")]
        Opacity = 586,
        /// <summary>
        /// Enum Openinbrowser for value: open_in_browser
        /// </summary>
        [EnumMember(Value = "open_in_browser")]
        Openinbrowser = 587,
        /// <summary>
        /// Enum Openinnew for value: open_in_new
        /// </summary>
        [EnumMember(Value = "open_in_new")]
        Openinnew = 588,
        /// <summary>
        /// Enum Openwith for value: open_with
        /// </summary>
        [EnumMember(Value = "open_with")]
        Openwith = 589,
        /// <summary>
        /// Enum Pages for value: pages
        /// </summary>
        [EnumMember(Value = "pages")]
        Pages = 590,
        /// <summary>
        /// Enum Pageview for value: pageview
        /// </summary>
        [EnumMember(Value = "pageview")]
        Pageview = 591,
        /// <summary>
        /// Enum Palette for value: palette
        /// </summary>
        [EnumMember(Value = "palette")]
        Palette = 592,
        /// <summary>
        /// Enum Pantool for value: pan_tool
        /// </summary>
        [EnumMember(Value = "pan_tool")]
        Pantool = 593,
        /// <summary>
        /// Enum Panorama for value: panorama
        /// </summary>
        [EnumMember(Value = "panorama")]
        Panorama = 594,
        /// <summary>
        /// Enum Panoramafisheye for value: panorama_fish_eye
        /// </summary>
        [EnumMember(Value = "panorama_fish_eye")]
        Panoramafisheye = 595,
        /// <summary>
        /// Enum Panoramahorizontal for value: panorama_horizontal
        /// </summary>
        [EnumMember(Value = "panorama_horizontal")]
        Panoramahorizontal = 596,
        /// <summary>
        /// Enum Panoramavertical for value: panorama_vertical
        /// </summary>
        [EnumMember(Value = "panorama_vertical")]
        Panoramavertical = 597,
        /// <summary>
        /// Enum Panoramawideangle for value: panorama_wide_angle
        /// </summary>
        [EnumMember(Value = "panorama_wide_angle")]
        Panoramawideangle = 598,
        /// <summary>
        /// Enum Partymode for value: party_mode
        /// </summary>
        [EnumMember(Value = "party_mode")]
        Partymode = 599,
        /// <summary>
        /// Enum Pause for value: pause
        /// </summary>
        [EnumMember(Value = "pause")]
        Pause = 600,
        /// <summary>
        /// Enum Pausecirclefilled for value: pause_circle_filled
        /// </summary>
        [EnumMember(Value = "pause_circle_filled")]
        Pausecirclefilled = 601,
        /// <summary>
        /// Enum Pausecircleoutline for value: pause_circle_outline
        /// </summary>
        [EnumMember(Value = "pause_circle_outline")]
        Pausecircleoutline = 602,
        /// <summary>
        /// Enum Payment for value: payment
        /// </summary>
        [EnumMember(Value = "payment")]
        Payment = 603,
        /// <summary>
        /// Enum People for value: people
        /// </summary>
        [EnumMember(Value = "people")]
        People = 604,
        /// <summary>
        /// Enum Peopleoutline for value: people_outline
        /// </summary>
        [EnumMember(Value = "people_outline")]
        Peopleoutline = 605,
        /// <summary>
        /// Enum Permcameramic for value: perm_camera_mic
        /// </summary>
        [EnumMember(Value = "perm_camera_mic")]
        Permcameramic = 606,
        /// <summary>
        /// Enum Permcontactcalendar for value: perm_contact_calendar
        /// </summary>
        [EnumMember(Value = "perm_contact_calendar")]
        Permcontactcalendar = 607,
        /// <summary>
        /// Enum Permdatasetting for value: perm_data_setting
        /// </summary>
        [EnumMember(Value = "perm_data_setting")]
        Permdatasetting = 608,
        /// <summary>
        /// Enum Permdeviceinformation for value: perm_device_information
        /// </summary>
        [EnumMember(Value = "perm_device_information")]
        Permdeviceinformation = 609,
        /// <summary>
        /// Enum Permidentity for value: perm_identity
        /// </summary>
        [EnumMember(Value = "perm_identity")]
        Permidentity = 610,
        /// <summary>
        /// Enum Permmedia for value: perm_media
        /// </summary>
        [EnumMember(Value = "perm_media")]
        Permmedia = 611,
        /// <summary>
        /// Enum Permphonemsg for value: perm_phone_msg
        /// </summary>
        [EnumMember(Value = "perm_phone_msg")]
        Permphonemsg = 612,
        /// <summary>
        /// Enum Permscanwifi for value: perm_scan_wifi
        /// </summary>
        [EnumMember(Value = "perm_scan_wifi")]
        Permscanwifi = 613,
        /// <summary>
        /// Enum Person for value: person
        /// </summary>
        [EnumMember(Value = "person")]
        Person = 614,
        /// <summary>
        /// Enum Personadd for value: person_add
        /// </summary>
        [EnumMember(Value = "person_add")]
        Personadd = 615,
        /// <summary>
        /// Enum Personoutline for value: person_outline
        /// </summary>
        [EnumMember(Value = "person_outline")]
        Personoutline = 616,
        /// <summary>
        /// Enum Personpin for value: person_pin
        /// </summary>
        [EnumMember(Value = "person_pin")]
        Personpin = 617,
        /// <summary>
        /// Enum Personpincircle for value: person_pin_circle
        /// </summary>
        [EnumMember(Value = "person_pin_circle")]
        Personpincircle = 618,
        /// <summary>
        /// Enum Personalvideo for value: personal_video
        /// </summary>
        [EnumMember(Value = "personal_video")]
        Personalvideo = 619,
        /// <summary>
        /// Enum Pets for value: pets
        /// </summary>
        [EnumMember(Value = "pets")]
        Pets = 620,
        /// <summary>
        /// Enum Phone for value: phone
        /// </summary>
        [EnumMember(Value = "phone")]
        Phone = 621,
        /// <summary>
        /// Enum Phoneandroid for value: phone_android
        /// </summary>
        [EnumMember(Value = "phone_android")]
        Phoneandroid = 622,
        /// <summary>
        /// Enum Phonebluetoothspeaker for value: phone_bluetooth_speaker
        /// </summary>
        [EnumMember(Value = "phone_bluetooth_speaker")]
        Phonebluetoothspeaker = 623,
        /// <summary>
        /// Enum Phoneforwarded for value: phone_forwarded
        /// </summary>
        [EnumMember(Value = "phone_forwarded")]
        Phoneforwarded = 624,
        /// <summary>
        /// Enum Phoneintalk for value: phone_in_talk
        /// </summary>
        [EnumMember(Value = "phone_in_talk")]
        Phoneintalk = 625,
        /// <summary>
        /// Enum Phoneiphone for value: phone_iphone
        /// </summary>
        [EnumMember(Value = "phone_iphone")]
        Phoneiphone = 626,
        /// <summary>
        /// Enum Phonelocked for value: phone_locked
        /// </summary>
        [EnumMember(Value = "phone_locked")]
        Phonelocked = 627,
        /// <summary>
        /// Enum Phonemissed for value: phone_missed
        /// </summary>
        [EnumMember(Value = "phone_missed")]
        Phonemissed = 628,
        /// <summary>
        /// Enum Phonepaused for value: phone_paused
        /// </summary>
        [EnumMember(Value = "phone_paused")]
        Phonepaused = 629,
        /// <summary>
        /// Enum Phonelink for value: phonelink
        /// </summary>
        [EnumMember(Value = "phonelink")]
        Phonelink = 630,
        /// <summary>
        /// Enum Phonelinkerase for value: phonelink_erase
        /// </summary>
        [EnumMember(Value = "phonelink_erase")]
        Phonelinkerase = 631,
        /// <summary>
        /// Enum Phonelinklock for value: phonelink_lock
        /// </summary>
        [EnumMember(Value = "phonelink_lock")]
        Phonelinklock = 632,
        /// <summary>
        /// Enum Phonelinkoff for value: phonelink_off
        /// </summary>
        [EnumMember(Value = "phonelink_off")]
        Phonelinkoff = 633,
        /// <summary>
        /// Enum Phonelinkring for value: phonelink_ring
        /// </summary>
        [EnumMember(Value = "phonelink_ring")]
        Phonelinkring = 634,
        /// <summary>
        /// Enum Phonelinksetup for value: phonelink_setup
        /// </summary>
        [EnumMember(Value = "phonelink_setup")]
        Phonelinksetup = 635,
        /// <summary>
        /// Enum Photo for value: photo
        /// </summary>
        [EnumMember(Value = "photo")]
        Photo = 636,
        /// <summary>
        /// Enum Photoalbum for value: photo_album
        /// </summary>
        [EnumMember(Value = "photo_album")]
        Photoalbum = 637,
        /// <summary>
        /// Enum Photocamera for value: photo_camera
        /// </summary>
        [EnumMember(Value = "photo_camera")]
        Photocamera = 638,
        /// <summary>
        /// Enum Photofilter for value: photo_filter
        /// </summary>
        [EnumMember(Value = "photo_filter")]
        Photofilter = 639,
        /// <summary>
        /// Enum Photolibrary for value: photo_library
        /// </summary>
        [EnumMember(Value = "photo_library")]
        Photolibrary = 640,
        /// <summary>
        /// Enum Photosizeselectactual for value: photo_size_select_actual
        /// </summary>
        [EnumMember(Value = "photo_size_select_actual")]
        Photosizeselectactual = 641,
        /// <summary>
        /// Enum Photosizeselectlarge for value: photo_size_select_large
        /// </summary>
        [EnumMember(Value = "photo_size_select_large")]
        Photosizeselectlarge = 642,
        /// <summary>
        /// Enum Photosizeselectsmall for value: photo_size_select_small
        /// </summary>
        [EnumMember(Value = "photo_size_select_small")]
        Photosizeselectsmall = 643,
        /// <summary>
        /// Enum Pictureaspdf for value: picture_as_pdf
        /// </summary>
        [EnumMember(Value = "picture_as_pdf")]
        Pictureaspdf = 644,
        /// <summary>
        /// Enum Pictureinpicture for value: picture_in_picture
        /// </summary>
        [EnumMember(Value = "picture_in_picture")]
        Pictureinpicture = 645,
        /// <summary>
        /// Enum Pictureinpicturealt for value: picture_in_picture_alt
        /// </summary>
        [EnumMember(Value = "picture_in_picture_alt")]
        Pictureinpicturealt = 646,
        /// <summary>
        /// Enum Piechart for value: pie_chart
        /// </summary>
        [EnumMember(Value = "pie_chart")]
        Piechart = 647,
        /// <summary>
        /// Enum Piechartoutlined for value: pie_chart_outlined
        /// </summary>
        [EnumMember(Value = "pie_chart_outlined")]
        Piechartoutlined = 648,
        /// <summary>
        /// Enum Pindrop for value: pin_drop
        /// </summary>
        [EnumMember(Value = "pin_drop")]
        Pindrop = 649,
        /// <summary>
        /// Enum Place for value: place
        /// </summary>
        [EnumMember(Value = "place")]
        Place = 650,
        /// <summary>
        /// Enum Playarrow for value: play_arrow
        /// </summary>
        [EnumMember(Value = "play_arrow")]
        Playarrow = 651,
        /// <summary>
        /// Enum Playcirclefilled for value: play_circle_filled
        /// </summary>
        [EnumMember(Value = "play_circle_filled")]
        Playcirclefilled = 652,
        /// <summary>
        /// Enum Playcircleoutline for value: play_circle_outline
        /// </summary>
        [EnumMember(Value = "play_circle_outline")]
        Playcircleoutline = 653,
        /// <summary>
        /// Enum Playforwork for value: play_for_work
        /// </summary>
        [EnumMember(Value = "play_for_work")]
        Playforwork = 654,
        /// <summary>
        /// Enum Playlistadd for value: playlist_add
        /// </summary>
        [EnumMember(Value = "playlist_add")]
        Playlistadd = 655,
        /// <summary>
        /// Enum Playlistaddcheck for value: playlist_add_check
        /// </summary>
        [EnumMember(Value = "playlist_add_check")]
        Playlistaddcheck = 656,
        /// <summary>
        /// Enum Playlistplay for value: playlist_play
        /// </summary>
        [EnumMember(Value = "playlist_play")]
        Playlistplay = 657,
        /// <summary>
        /// Enum Plusone for value: plus_one
        /// </summary>
        [EnumMember(Value = "plus_one")]
        Plusone = 658,
        /// <summary>
        /// Enum Poll for value: poll
        /// </summary>
        [EnumMember(Value = "poll")]
        Poll = 659,
        /// <summary>
        /// Enum Polymer for value: polymer
        /// </summary>
        [EnumMember(Value = "polymer")]
        Polymer = 660,
        /// <summary>
        /// Enum Pool for value: pool
        /// </summary>
        [EnumMember(Value = "pool")]
        Pool = 661,
        /// <summary>
        /// Enum Portablewifioff for value: portable_wifi_off
        /// </summary>
        [EnumMember(Value = "portable_wifi_off")]
        Portablewifioff = 662,
        /// <summary>
        /// Enum Portrait for value: portrait
        /// </summary>
        [EnumMember(Value = "portrait")]
        Portrait = 663,
        /// <summary>
        /// Enum Power for value: power
        /// </summary>
        [EnumMember(Value = "power")]
        Power = 664,
        /// <summary>
        /// Enum Powerinput for value: power_input
        /// </summary>
        [EnumMember(Value = "power_input")]
        Powerinput = 665,
        /// <summary>
        /// Enum Powersettingsnew for value: power_settings_new
        /// </summary>
        [EnumMember(Value = "power_settings_new")]
        Powersettingsnew = 666,
        /// <summary>
        /// Enum Pregnantwoman for value: pregnant_woman
        /// </summary>
        [EnumMember(Value = "pregnant_woman")]
        Pregnantwoman = 667,
        /// <summary>
        /// Enum Presenttoall for value: present_to_all
        /// </summary>
        [EnumMember(Value = "present_to_all")]
        Presenttoall = 668,
        /// <summary>
        /// Enum Print for value: print
        /// </summary>
        [EnumMember(Value = "print")]
        Print = 669,
        /// <summary>
        /// Enum Priorityhigh for value: priority_high
        /// </summary>
        [EnumMember(Value = "priority_high")]
        Priorityhigh = 670,
        /// <summary>
        /// Enum Public for value: public
        /// </summary>
        [EnumMember(Value = "public")]
        Public = 671,
        /// <summary>
        /// Enum Publish for value: publish
        /// </summary>
        [EnumMember(Value = "publish")]
        Publish = 672,
        /// <summary>
        /// Enum Querybuilder for value: query_builder
        /// </summary>
        [EnumMember(Value = "query_builder")]
        Querybuilder = 673,
        /// <summary>
        /// Enum Questionanswer for value: question_answer
        /// </summary>
        [EnumMember(Value = "question_answer")]
        Questionanswer = 674,
        /// <summary>
        /// Enum Queue for value: queue
        /// </summary>
        [EnumMember(Value = "queue")]
        Queue = 675,
        /// <summary>
        /// Enum Queuemusic for value: queue_music
        /// </summary>
        [EnumMember(Value = "queue_music")]
        Queuemusic = 676,
        /// <summary>
        /// Enum Queueplaynext for value: queue_play_next
        /// </summary>
        [EnumMember(Value = "queue_play_next")]
        Queueplaynext = 677,
        /// <summary>
        /// Enum Radio for value: radio
        /// </summary>
        [EnumMember(Value = "radio")]
        Radio = 678,
        /// <summary>
        /// Enum Radiobuttonchecked for value: radio_button_checked
        /// </summary>
        [EnumMember(Value = "radio_button_checked")]
        Radiobuttonchecked = 679,
        /// <summary>
        /// Enum Radiobuttonunchecked for value: radio_button_unchecked
        /// </summary>
        [EnumMember(Value = "radio_button_unchecked")]
        Radiobuttonunchecked = 680,
        /// <summary>
        /// Enum Ratereview for value: rate_review
        /// </summary>
        [EnumMember(Value = "rate_review")]
        Ratereview = 681,
        /// <summary>
        /// Enum Receipt for value: receipt
        /// </summary>
        [EnumMember(Value = "receipt")]
        Receipt = 682,
        /// <summary>
        /// Enum Recentactors for value: recent_actors
        /// </summary>
        [EnumMember(Value = "recent_actors")]
        Recentactors = 683,
        /// <summary>
        /// Enum Recordvoiceover for value: record_voice_over
        /// </summary>
        [EnumMember(Value = "record_voice_over")]
        Recordvoiceover = 684,
        /// <summary>
        /// Enum Redeem for value: redeem
        /// </summary>
        [EnumMember(Value = "redeem")]
        Redeem = 685,
        /// <summary>
        /// Enum Redo for value: redo
        /// </summary>
        [EnumMember(Value = "redo")]
        Redo = 686,
        /// <summary>
        /// Enum Refresh for value: refresh
        /// </summary>
        [EnumMember(Value = "refresh")]
        Refresh = 687,
        /// <summary>
        /// Enum Remove for value: remove
        /// </summary>
        [EnumMember(Value = "remove")]
        Remove = 688,
        /// <summary>
        /// Enum Removecircle for value: remove_circle
        /// </summary>
        [EnumMember(Value = "remove_circle")]
        Removecircle = 689,
        /// <summary>
        /// Enum Removecircleoutline for value: remove_circle_outline
        /// </summary>
        [EnumMember(Value = "remove_circle_outline")]
        Removecircleoutline = 690,
        /// <summary>
        /// Enum Removefromqueue for value: remove_from_queue
        /// </summary>
        [EnumMember(Value = "remove_from_queue")]
        Removefromqueue = 691,
        /// <summary>
        /// Enum Removeredeye for value: remove_red_eye
        /// </summary>
        [EnumMember(Value = "remove_red_eye")]
        Removeredeye = 692,
        /// <summary>
        /// Enum Removeshoppingcart for value: remove_shopping_cart
        /// </summary>
        [EnumMember(Value = "remove_shopping_cart")]
        Removeshoppingcart = 693,
        /// <summary>
        /// Enum Reorder for value: reorder
        /// </summary>
        [EnumMember(Value = "reorder")]
        Reorder = 694,
        /// <summary>
        /// Enum Repeat for value: repeat
        /// </summary>
        [EnumMember(Value = "repeat")]
        Repeat = 695,
        /// <summary>
        /// Enum Repeatone for value: repeat_one
        /// </summary>
        [EnumMember(Value = "repeat_one")]
        Repeatone = 696,
        /// <summary>
        /// Enum Replay for value: replay
        /// </summary>
        [EnumMember(Value = "replay")]
        Replay = 697,
        /// <summary>
        /// Enum Replay10 for value: replay_10
        /// </summary>
        [EnumMember(Value = "replay_10")]
        Replay10 = 698,
        /// <summary>
        /// Enum Replay30 for value: replay_30
        /// </summary>
        [EnumMember(Value = "replay_30")]
        Replay30 = 699,
        /// <summary>
        /// Enum Replay5 for value: replay_5
        /// </summary>
        [EnumMember(Value = "replay_5")]
        Replay5 = 700,
        /// <summary>
        /// Enum Reply for value: reply
        /// </summary>
        [EnumMember(Value = "reply")]
        Reply = 701,
        /// <summary>
        /// Enum Replyall for value: reply_all
        /// </summary>
        [EnumMember(Value = "reply_all")]
        Replyall = 702,
        /// <summary>
        /// Enum Report for value: report
        /// </summary>
        [EnumMember(Value = "report")]
        Report = 703,
        /// <summary>
        /// Enum Reportproblem for value: report_problem
        /// </summary>
        [EnumMember(Value = "report_problem")]
        Reportproblem = 704,
        /// <summary>
        /// Enum Restaurant for value: restaurant
        /// </summary>
        [EnumMember(Value = "restaurant")]
        Restaurant = 705,
        /// <summary>
        /// Enum Restaurantmenu for value: restaurant_menu
        /// </summary>
        [EnumMember(Value = "restaurant_menu")]
        Restaurantmenu = 706,
        /// <summary>
        /// Enum Restore for value: restore
        /// </summary>
        [EnumMember(Value = "restore")]
        Restore = 707,
        /// <summary>
        /// Enum Restorepage for value: restore_page
        /// </summary>
        [EnumMember(Value = "restore_page")]
        Restorepage = 708,
        /// <summary>
        /// Enum Ringvolume for value: ring_volume
        /// </summary>
        [EnumMember(Value = "ring_volume")]
        Ringvolume = 709,
        /// <summary>
        /// Enum Room for value: room
        /// </summary>
        [EnumMember(Value = "room")]
        Room = 710,
        /// <summary>
        /// Enum Roomservice for value: room_service
        /// </summary>
        [EnumMember(Value = "room_service")]
        Roomservice = 711,
        /// <summary>
        /// Enum Rotate90degreesccw for value: rotate_90_degrees_ccw
        /// </summary>
        [EnumMember(Value = "rotate_90_degrees_ccw")]
        Rotate90degreesccw = 712,
        /// <summary>
        /// Enum Rotateleft for value: rotate_left
        /// </summary>
        [EnumMember(Value = "rotate_left")]
        Rotateleft = 713,
        /// <summary>
        /// Enum Rotateright for value: rotate_right
        /// </summary>
        [EnumMember(Value = "rotate_right")]
        Rotateright = 714,
        /// <summary>
        /// Enum Roundedcorner for value: rounded_corner
        /// </summary>
        [EnumMember(Value = "rounded_corner")]
        Roundedcorner = 715,
        /// <summary>
        /// Enum Router for value: router
        /// </summary>
        [EnumMember(Value = "router")]
        Router = 716,
        /// <summary>
        /// Enum Rowing for value: rowing
        /// </summary>
        [EnumMember(Value = "rowing")]
        Rowing = 717,
        /// <summary>
        /// Enum Rssfeed for value: rss_feed
        /// </summary>
        [EnumMember(Value = "rss_feed")]
        Rssfeed = 718,
        /// <summary>
        /// Enum Rvhookup for value: rv_hookup
        /// </summary>
        [EnumMember(Value = "rv_hookup")]
        Rvhookup = 719,
        /// <summary>
        /// Enum Satellite for value: satellite
        /// </summary>
        [EnumMember(Value = "satellite")]
        Satellite = 720,
        /// <summary>
        /// Enum Save for value: save
        /// </summary>
        [EnumMember(Value = "save")]
        Save = 721,
        /// <summary>
        /// Enum Scanner for value: scanner
        /// </summary>
        [EnumMember(Value = "scanner")]
        Scanner = 722,
        /// <summary>
        /// Enum Schedule for value: schedule
        /// </summary>
        [EnumMember(Value = "schedule")]
        Schedule = 723,
        /// <summary>
        /// Enum School for value: school
        /// </summary>
        [EnumMember(Value = "school")]
        School = 724,
        /// <summary>
        /// Enum Screenlocklandscape for value: screen_lock_landscape
        /// </summary>
        [EnumMember(Value = "screen_lock_landscape")]
        Screenlocklandscape = 725,
        /// <summary>
        /// Enum Screenlockportrait for value: screen_lock_portrait
        /// </summary>
        [EnumMember(Value = "screen_lock_portrait")]
        Screenlockportrait = 726,
        /// <summary>
        /// Enum Screenlockrotation for value: screen_lock_rotation
        /// </summary>
        [EnumMember(Value = "screen_lock_rotation")]
        Screenlockrotation = 727,
        /// <summary>
        /// Enum Screenrotation for value: screen_rotation
        /// </summary>
        [EnumMember(Value = "screen_rotation")]
        Screenrotation = 728,
        /// <summary>
        /// Enum Screenshare for value: screen_share
        /// </summary>
        [EnumMember(Value = "screen_share")]
        Screenshare = 729,
        /// <summary>
        /// Enum Sdcard for value: sd_card
        /// </summary>
        [EnumMember(Value = "sd_card")]
        Sdcard = 730,
        /// <summary>
        /// Enum Sdstorage for value: sd_storage
        /// </summary>
        [EnumMember(Value = "sd_storage")]
        Sdstorage = 731,
        /// <summary>
        /// Enum Search for value: search
        /// </summary>
        [EnumMember(Value = "search")]
        Search = 732,
        /// <summary>
        /// Enum Security for value: security
        /// </summary>
        [EnumMember(Value = "security")]
        Security = 733,
        /// <summary>
        /// Enum Selectall for value: select_all
        /// </summary>
        [EnumMember(Value = "select_all")]
        Selectall = 734,
        /// <summary>
        /// Enum Send for value: send
        /// </summary>
        [EnumMember(Value = "send")]
        Send = 735,
        /// <summary>
        /// Enum Sentimentdissatisfied for value: sentiment_dissatisfied
        /// </summary>
        [EnumMember(Value = "sentiment_dissatisfied")]
        Sentimentdissatisfied = 736,
        /// <summary>
        /// Enum Sentimentneutral for value: sentiment_neutral
        /// </summary>
        [EnumMember(Value = "sentiment_neutral")]
        Sentimentneutral = 737,
        /// <summary>
        /// Enum Sentimentsatisfied for value: sentiment_satisfied
        /// </summary>
        [EnumMember(Value = "sentiment_satisfied")]
        Sentimentsatisfied = 738,
        /// <summary>
        /// Enum Sentimentverydissatisfied for value: sentiment_very_dissatisfied
        /// </summary>
        [EnumMember(Value = "sentiment_very_dissatisfied")]
        Sentimentverydissatisfied = 739,
        /// <summary>
        /// Enum Sentimentverysatisfied for value: sentiment_very_satisfied
        /// </summary>
        [EnumMember(Value = "sentiment_very_satisfied")]
        Sentimentverysatisfied = 740,
        /// <summary>
        /// Enum Settings for value: settings
        /// </summary>
        [EnumMember(Value = "settings")]
        Settings = 741,
        /// <summary>
        /// Enum Settingsapplications for value: settings_applications
        /// </summary>
        [EnumMember(Value = "settings_applications")]
        Settingsapplications = 742,
        /// <summary>
        /// Enum Settingsbackuprestore for value: settings_backup_restore
        /// </summary>
        [EnumMember(Value = "settings_backup_restore")]
        Settingsbackuprestore = 743,
        /// <summary>
        /// Enum Settingsbluetooth for value: settings_bluetooth
        /// </summary>
        [EnumMember(Value = "settings_bluetooth")]
        Settingsbluetooth = 744,
        /// <summary>
        /// Enum Settingsbrightness for value: settings_brightness
        /// </summary>
        [EnumMember(Value = "settings_brightness")]
        Settingsbrightness = 745,
        /// <summary>
        /// Enum Settingscell for value: settings_cell
        /// </summary>
        [EnumMember(Value = "settings_cell")]
        Settingscell = 746,
        /// <summary>
        /// Enum Settingsethernet for value: settings_ethernet
        /// </summary>
        [EnumMember(Value = "settings_ethernet")]
        Settingsethernet = 747,
        /// <summary>
        /// Enum Settingsinputantenna for value: settings_input_antenna
        /// </summary>
        [EnumMember(Value = "settings_input_antenna")]
        Settingsinputantenna = 748,
        /// <summary>
        /// Enum Settingsinputcomponent for value: settings_input_component
        /// </summary>
        [EnumMember(Value = "settings_input_component")]
        Settingsinputcomponent = 749,
        /// <summary>
        /// Enum Settingsinputcomposite for value: settings_input_composite
        /// </summary>
        [EnumMember(Value = "settings_input_composite")]
        Settingsinputcomposite = 750,
        /// <summary>
        /// Enum Settingsinputhdmi for value: settings_input_hdmi
        /// </summary>
        [EnumMember(Value = "settings_input_hdmi")]
        Settingsinputhdmi = 751,
        /// <summary>
        /// Enum Settingsinputsvideo for value: settings_input_svideo
        /// </summary>
        [EnumMember(Value = "settings_input_svideo")]
        Settingsinputsvideo = 752,
        /// <summary>
        /// Enum Settingsoverscan for value: settings_overscan
        /// </summary>
        [EnumMember(Value = "settings_overscan")]
        Settingsoverscan = 753,
        /// <summary>
        /// Enum Settingsphone for value: settings_phone
        /// </summary>
        [EnumMember(Value = "settings_phone")]
        Settingsphone = 754,
        /// <summary>
        /// Enum Settingspower for value: settings_power
        /// </summary>
        [EnumMember(Value = "settings_power")]
        Settingspower = 755,
        /// <summary>
        /// Enum Settingsremote for value: settings_remote
        /// </summary>
        [EnumMember(Value = "settings_remote")]
        Settingsremote = 756,
        /// <summary>
        /// Enum Settingssystemdaydream for value: settings_system_daydream
        /// </summary>
        [EnumMember(Value = "settings_system_daydream")]
        Settingssystemdaydream = 757,
        /// <summary>
        /// Enum Settingsvoice for value: settings_voice
        /// </summary>
        [EnumMember(Value = "settings_voice")]
        Settingsvoice = 758,
        /// <summary>
        /// Enum Share for value: share
        /// </summary>
        [EnumMember(Value = "share")]
        Share = 759,
        /// <summary>
        /// Enum Shop for value: shop
        /// </summary>
        [EnumMember(Value = "shop")]
        Shop = 760,
        /// <summary>
        /// Enum Shoptwo for value: shop_two
        /// </summary>
        [EnumMember(Value = "shop_two")]
        Shoptwo = 761,
        /// <summary>
        /// Enum Shoppingbasket for value: shopping_basket
        /// </summary>
        [EnumMember(Value = "shopping_basket")]
        Shoppingbasket = 762,
        /// <summary>
        /// Enum Shoppingcart for value: shopping_cart
        /// </summary>
        [EnumMember(Value = "shopping_cart")]
        Shoppingcart = 763,
        /// <summary>
        /// Enum Shorttext for value: short_text
        /// </summary>
        [EnumMember(Value = "short_text")]
        Shorttext = 764,
        /// <summary>
        /// Enum Showchart for value: show_chart
        /// </summary>
        [EnumMember(Value = "show_chart")]
        Showchart = 765,
        /// <summary>
        /// Enum Shuffle for value: shuffle
        /// </summary>
        [EnumMember(Value = "shuffle")]
        Shuffle = 766,
        /// <summary>
        /// Enum Signalcellular4bar for value: signal_cellular_4_bar
        /// </summary>
        [EnumMember(Value = "signal_cellular_4_bar")]
        Signalcellular4bar = 767,
        /// <summary>
        /// Enum Signalcellularconnectednointernet4bar for value: signal_cellular_connected_no_internet_4_bar
        /// </summary>
        [EnumMember(Value = "signal_cellular_connected_no_internet_4_bar")]
        Signalcellularconnectednointernet4bar = 768,
        /// <summary>
        /// Enum Signalcellularnosim for value: signal_cellular_no_sim
        /// </summary>
        [EnumMember(Value = "signal_cellular_no_sim")]
        Signalcellularnosim = 769,
        /// <summary>
        /// Enum Signalcellularnull for value: signal_cellular_null
        /// </summary>
        [EnumMember(Value = "signal_cellular_null")]
        Signalcellularnull = 770,
        /// <summary>
        /// Enum Signalcellularoff for value: signal_cellular_off
        /// </summary>
        [EnumMember(Value = "signal_cellular_off")]
        Signalcellularoff = 771,
        /// <summary>
        /// Enum Signalwifi4bar for value: signal_wifi_4_bar
        /// </summary>
        [EnumMember(Value = "signal_wifi_4_bar")]
        Signalwifi4bar = 772,
        /// <summary>
        /// Enum Signalwifi4barlock for value: signal_wifi_4_bar_lock
        /// </summary>
        [EnumMember(Value = "signal_wifi_4_bar_lock")]
        Signalwifi4barlock = 773,
        /// <summary>
        /// Enum Signalwifioff for value: signal_wifi_off
        /// </summary>
        [EnumMember(Value = "signal_wifi_off")]
        Signalwifioff = 774,
        /// <summary>
        /// Enum Simcard for value: sim_card
        /// </summary>
        [EnumMember(Value = "sim_card")]
        Simcard = 775,
        /// <summary>
        /// Enum Simcardalert for value: sim_card_alert
        /// </summary>
        [EnumMember(Value = "sim_card_alert")]
        Simcardalert = 776,
        /// <summary>
        /// Enum Skipnext for value: skip_next
        /// </summary>
        [EnumMember(Value = "skip_next")]
        Skipnext = 777,
        /// <summary>
        /// Enum Skipprevious for value: skip_previous
        /// </summary>
        [EnumMember(Value = "skip_previous")]
        Skipprevious = 778,
        /// <summary>
        /// Enum Slideshow for value: slideshow
        /// </summary>
        [EnumMember(Value = "slideshow")]
        Slideshow = 779,
        /// <summary>
        /// Enum Slowmotionvideo for value: slow_motion_video
        /// </summary>
        [EnumMember(Value = "slow_motion_video")]
        Slowmotionvideo = 780,
        /// <summary>
        /// Enum Smartphone for value: smartphone
        /// </summary>
        [EnumMember(Value = "smartphone")]
        Smartphone = 781,
        /// <summary>
        /// Enum Smokefree for value: smoke_free
        /// </summary>
        [EnumMember(Value = "smoke_free")]
        Smokefree = 782,
        /// <summary>
        /// Enum Smokingrooms for value: smoking_rooms
        /// </summary>
        [EnumMember(Value = "smoking_rooms")]
        Smokingrooms = 783,
        /// <summary>
        /// Enum Sms for value: sms
        /// </summary>
        [EnumMember(Value = "sms")]
        Sms = 784,
        /// <summary>
        /// Enum Smsfailed for value: sms_failed
        /// </summary>
        [EnumMember(Value = "sms_failed")]
        Smsfailed = 785,
        /// <summary>
        /// Enum Snooze for value: snooze
        /// </summary>
        [EnumMember(Value = "snooze")]
        Snooze = 786,
        /// <summary>
        /// Enum Sort for value: sort
        /// </summary>
        [EnumMember(Value = "sort")]
        Sort = 787,
        /// <summary>
        /// Enum Sortbyalpha for value: sort_by_alpha
        /// </summary>
        [EnumMember(Value = "sort_by_alpha")]
        Sortbyalpha = 788,
        /// <summary>
        /// Enum Spa for value: spa
        /// </summary>
        [EnumMember(Value = "spa")]
        Spa = 789,
        /// <summary>
        /// Enum Spacebar for value: space_bar
        /// </summary>
        [EnumMember(Value = "space_bar")]
        Spacebar = 790,
        /// <summary>
        /// Enum Speaker for value: speaker
        /// </summary>
        [EnumMember(Value = "speaker")]
        Speaker = 791,
        /// <summary>
        /// Enum Speakergroup for value: speaker_group
        /// </summary>
        [EnumMember(Value = "speaker_group")]
        Speakergroup = 792,
        /// <summary>
        /// Enum Speakernotes for value: speaker_notes
        /// </summary>
        [EnumMember(Value = "speaker_notes")]
        Speakernotes = 793,
        /// <summary>
        /// Enum Speakernotesoff for value: speaker_notes_off
        /// </summary>
        [EnumMember(Value = "speaker_notes_off")]
        Speakernotesoff = 794,
        /// <summary>
        /// Enum Speakerphone for value: speaker_phone
        /// </summary>
        [EnumMember(Value = "speaker_phone")]
        Speakerphone = 795,
        /// <summary>
        /// Enum Spellcheck for value: spellcheck
        /// </summary>
        [EnumMember(Value = "spellcheck")]
        Spellcheck = 796,
        /// <summary>
        /// Enum Star for value: star
        /// </summary>
        [EnumMember(Value = "star")]
        Star = 797,
        /// <summary>
        /// Enum Starborder for value: star_border
        /// </summary>
        [EnumMember(Value = "star_border")]
        Starborder = 798,
        /// <summary>
        /// Enum Starhalf for value: star_half
        /// </summary>
        [EnumMember(Value = "star_half")]
        Starhalf = 799,
        /// <summary>
        /// Enum Stars for value: stars
        /// </summary>
        [EnumMember(Value = "stars")]
        Stars = 800,
        /// <summary>
        /// Enum Staycurrentlandscape for value: stay_current_landscape
        /// </summary>
        [EnumMember(Value = "stay_current_landscape")]
        Staycurrentlandscape = 801,
        /// <summary>
        /// Enum Staycurrentportrait for value: stay_current_portrait
        /// </summary>
        [EnumMember(Value = "stay_current_portrait")]
        Staycurrentportrait = 802,
        /// <summary>
        /// Enum Stayprimarylandscape for value: stay_primary_landscape
        /// </summary>
        [EnumMember(Value = "stay_primary_landscape")]
        Stayprimarylandscape = 803,
        /// <summary>
        /// Enum Stayprimaryportrait for value: stay_primary_portrait
        /// </summary>
        [EnumMember(Value = "stay_primary_portrait")]
        Stayprimaryportrait = 804,
        /// <summary>
        /// Enum Stop for value: stop
        /// </summary>
        [EnumMember(Value = "stop")]
        Stop = 805,
        /// <summary>
        /// Enum Stopscreenshare for value: stop_screen_share
        /// </summary>
        [EnumMember(Value = "stop_screen_share")]
        Stopscreenshare = 806,
        /// <summary>
        /// Enum Storage for value: storage
        /// </summary>
        [EnumMember(Value = "storage")]
        Storage = 807,
        /// <summary>
        /// Enum Store for value: store
        /// </summary>
        [EnumMember(Value = "store")]
        Store = 808,
        /// <summary>
        /// Enum Storemalldirectory for value: store_mall_directory
        /// </summary>
        [EnumMember(Value = "store_mall_directory")]
        Storemalldirectory = 809,
        /// <summary>
        /// Enum Straighten for value: straighten
        /// </summary>
        [EnumMember(Value = "straighten")]
        Straighten = 810,
        /// <summary>
        /// Enum Streetview for value: streetview
        /// </summary>
        [EnumMember(Value = "streetview")]
        Streetview = 811,
        /// <summary>
        /// Enum Strikethroughs for value: strikethrough_s
        /// </summary>
        [EnumMember(Value = "strikethrough_s")]
        Strikethroughs = 812,
        /// <summary>
        /// Enum Style for value: style
        /// </summary>
        [EnumMember(Value = "style")]
        Style = 813,
        /// <summary>
        /// Enum Subdirectoryarrowleft for value: subdirectory_arrow_left
        /// </summary>
        [EnumMember(Value = "subdirectory_arrow_left")]
        Subdirectoryarrowleft = 814,
        /// <summary>
        /// Enum Subdirectoryarrowright for value: subdirectory_arrow_right
        /// </summary>
        [EnumMember(Value = "subdirectory_arrow_right")]
        Subdirectoryarrowright = 815,
        /// <summary>
        /// Enum Subject for value: subject
        /// </summary>
        [EnumMember(Value = "subject")]
        Subject = 816,
        /// <summary>
        /// Enum Subscriptions for value: subscriptions
        /// </summary>
        [EnumMember(Value = "subscriptions")]
        Subscriptions = 817,
        /// <summary>
        /// Enum Subtitles for value: subtitles
        /// </summary>
        [EnumMember(Value = "subtitles")]
        Subtitles = 818,
        /// <summary>
        /// Enum Subway for value: subway
        /// </summary>
        [EnumMember(Value = "subway")]
        Subway = 819,
        /// <summary>
        /// Enum Supervisoraccount for value: supervisor_account
        /// </summary>
        [EnumMember(Value = "supervisor_account")]
        Supervisoraccount = 820,
        /// <summary>
        /// Enum Surroundsound for value: surround_sound
        /// </summary>
        [EnumMember(Value = "surround_sound")]
        Surroundsound = 821,
        /// <summary>
        /// Enum Swapcalls for value: swap_calls
        /// </summary>
        [EnumMember(Value = "swap_calls")]
        Swapcalls = 822,
        /// <summary>
        /// Enum Swaphoriz for value: swap_horiz
        /// </summary>
        [EnumMember(Value = "swap_horiz")]
        Swaphoriz = 823,
        /// <summary>
        /// Enum Swapvert for value: swap_vert
        /// </summary>
        [EnumMember(Value = "swap_vert")]
        Swapvert = 824,
        /// <summary>
        /// Enum Swapverticalcircle for value: swap_vertical_circle
        /// </summary>
        [EnumMember(Value = "swap_vertical_circle")]
        Swapverticalcircle = 825,
        /// <summary>
        /// Enum Switchcamera for value: switch_camera
        /// </summary>
        [EnumMember(Value = "switch_camera")]
        Switchcamera = 826,
        /// <summary>
        /// Enum Switchvideo for value: switch_video
        /// </summary>
        [EnumMember(Value = "switch_video")]
        Switchvideo = 827,
        /// <summary>
        /// Enum Sync for value: sync
        /// </summary>
        [EnumMember(Value = "sync")]
        Sync = 828,
        /// <summary>
        /// Enum Syncalt for value: sync_alt
        /// </summary>
        [EnumMember(Value = "sync_alt")]
        Syncalt = 829,
        /// <summary>
        /// Enum Syncdisabled for value: sync_disabled
        /// </summary>
        [EnumMember(Value = "sync_disabled")]
        Syncdisabled = 830,
        /// <summary>
        /// Enum Syncproblem for value: sync_problem
        /// </summary>
        [EnumMember(Value = "sync_problem")]
        Syncproblem = 831,
        /// <summary>
        /// Enum Systemupdate for value: system_update
        /// </summary>
        [EnumMember(Value = "system_update")]
        Systemupdate = 832,
        /// <summary>
        /// Enum Systemupdatealt for value: system_update_alt
        /// </summary>
        [EnumMember(Value = "system_update_alt")]
        Systemupdatealt = 833,
        /// <summary>
        /// Enum Tab for value: tab
        /// </summary>
        [EnumMember(Value = "tab")]
        Tab = 834,
        /// <summary>
        /// Enum Tabunselected for value: tab_unselected
        /// </summary>
        [EnumMember(Value = "tab_unselected")]
        Tabunselected = 835,
        /// <summary>
        /// Enum Tablet for value: tablet
        /// </summary>
        [EnumMember(Value = "tablet")]
        Tablet = 836,
        /// <summary>
        /// Enum Tabletandroid for value: tablet_android
        /// </summary>
        [EnumMember(Value = "tablet_android")]
        Tabletandroid = 837,
        /// <summary>
        /// Enum Tabletmac for value: tablet_mac
        /// </summary>
        [EnumMember(Value = "tablet_mac")]
        Tabletmac = 838,
        /// <summary>
        /// Enum Tagfaces for value: tag_faces
        /// </summary>
        [EnumMember(Value = "tag_faces")]
        Tagfaces = 839,
        /// <summary>
        /// Enum Tapandplay for value: tap_and_play
        /// </summary>
        [EnumMember(Value = "tap_and_play")]
        Tapandplay = 840,
        /// <summary>
        /// Enum Terrain for value: terrain
        /// </summary>
        [EnumMember(Value = "terrain")]
        Terrain = 841,
        /// <summary>
        /// Enum Textfields for value: text_fields
        /// </summary>
        [EnumMember(Value = "text_fields")]
        Textfields = 842,
        /// <summary>
        /// Enum Textformat for value: text_format
        /// </summary>
        [EnumMember(Value = "text_format")]
        Textformat = 843,
        /// <summary>
        /// Enum Textsms for value: textsms
        /// </summary>
        [EnumMember(Value = "textsms")]
        Textsms = 844,
        /// <summary>
        /// Enum Texture for value: texture
        /// </summary>
        [EnumMember(Value = "texture")]
        Texture = 845,
        /// <summary>
        /// Enum Theaters for value: theaters
        /// </summary>
        [EnumMember(Value = "theaters")]
        Theaters = 846,
        /// <summary>
        /// Enum Thumbdown for value: thumb_down
        /// </summary>
        [EnumMember(Value = "thumb_down")]
        Thumbdown = 847,
        /// <summary>
        /// Enum Thumbup for value: thumb_up
        /// </summary>
        [EnumMember(Value = "thumb_up")]
        Thumbup = 848,
        /// <summary>
        /// Enum Thumbsupdown for value: thumbs_up_down
        /// </summary>
        [EnumMember(Value = "thumbs_up_down")]
        Thumbsupdown = 849,
        /// <summary>
        /// Enum Timetoleave for value: time_to_leave
        /// </summary>
        [EnumMember(Value = "time_to_leave")]
        Timetoleave = 850,
        /// <summary>
        /// Enum Timelapse for value: timelapse
        /// </summary>
        [EnumMember(Value = "timelapse")]
        Timelapse = 851,
        /// <summary>
        /// Enum Timeline for value: timeline
        /// </summary>
        [EnumMember(Value = "timeline")]
        Timeline = 852,
        /// <summary>
        /// Enum Timer for value: timer
        /// </summary>
        [EnumMember(Value = "timer")]
        Timer = 853,
        /// <summary>
        /// Enum Timer10 for value: timer_10
        /// </summary>
        [EnumMember(Value = "timer_10")]
        Timer10 = 854,
        /// <summary>
        /// Enum Timer3 for value: timer_3
        /// </summary>
        [EnumMember(Value = "timer_3")]
        Timer3 = 855,
        /// <summary>
        /// Enum Timeroff for value: timer_off
        /// </summary>
        [EnumMember(Value = "timer_off")]
        Timeroff = 856,
        /// <summary>
        /// Enum Title for value: title
        /// </summary>
        [EnumMember(Value = "title")]
        Title = 857,
        /// <summary>
        /// Enum Toc for value: toc
        /// </summary>
        [EnumMember(Value = "toc")]
        Toc = 858,
        /// <summary>
        /// Enum Today for value: today
        /// </summary>
        [EnumMember(Value = "today")]
        Today = 859,
        /// <summary>
        /// Enum Toll for value: toll
        /// </summary>
        [EnumMember(Value = "toll")]
        Toll = 860,
        /// <summary>
        /// Enum Tonality for value: tonality
        /// </summary>
        [EnumMember(Value = "tonality")]
        Tonality = 861,
        /// <summary>
        /// Enum Touchapp for value: touch_app
        /// </summary>
        [EnumMember(Value = "touch_app")]
        Touchapp = 862,
        /// <summary>
        /// Enum Toys for value: toys
        /// </summary>
        [EnumMember(Value = "toys")]
        Toys = 863,
        /// <summary>
        /// Enum Trackchanges for value: track_changes
        /// </summary>
        [EnumMember(Value = "track_changes")]
        Trackchanges = 864,
        /// <summary>
        /// Enum Traffic for value: traffic
        /// </summary>
        [EnumMember(Value = "traffic")]
        Traffic = 865,
        /// <summary>
        /// Enum Train for value: train
        /// </summary>
        [EnumMember(Value = "train")]
        Train = 866,
        /// <summary>
        /// Enum Tram for value: tram
        /// </summary>
        [EnumMember(Value = "tram")]
        Tram = 867,
        /// <summary>
        /// Enum Transferwithinastation for value: transfer_within_a_station
        /// </summary>
        [EnumMember(Value = "transfer_within_a_station")]
        Transferwithinastation = 868,
        /// <summary>
        /// Enum Transform for value: transform
        /// </summary>
        [EnumMember(Value = "transform")]
        Transform = 869,
        /// <summary>
        /// Enum Translate for value: translate
        /// </summary>
        [EnumMember(Value = "translate")]
        Translate = 870,
        /// <summary>
        /// Enum Trendingdown for value: trending_down
        /// </summary>
        [EnumMember(Value = "trending_down")]
        Trendingdown = 871,
        /// <summary>
        /// Enum Trendingflat for value: trending_flat
        /// </summary>
        [EnumMember(Value = "trending_flat")]
        Trendingflat = 872,
        /// <summary>
        /// Enum Trendingup for value: trending_up
        /// </summary>
        [EnumMember(Value = "trending_up")]
        Trendingup = 873,
        /// <summary>
        /// Enum Triporigin for value: trip_origin
        /// </summary>
        [EnumMember(Value = "trip_origin")]
        Triporigin = 874,
        /// <summary>
        /// Enum Tune for value: tune
        /// </summary>
        [EnumMember(Value = "tune")]
        Tune = 875,
        /// <summary>
        /// Enum Turnedin for value: turned_in
        /// </summary>
        [EnumMember(Value = "turned_in")]
        Turnedin = 876,
        /// <summary>
        /// Enum Turnedinnot for value: turned_in_not
        /// </summary>
        [EnumMember(Value = "turned_in_not")]
        Turnedinnot = 877,
        /// <summary>
        /// Enum Tv for value: tv
        /// </summary>
        [EnumMember(Value = "tv")]
        Tv = 878,
        /// <summary>
        /// Enum Unarchive for value: unarchive
        /// </summary>
        [EnumMember(Value = "unarchive")]
        Unarchive = 879,
        /// <summary>
        /// Enum Undo for value: undo
        /// </summary>
        [EnumMember(Value = "undo")]
        Undo = 880,
        /// <summary>
        /// Enum Unfoldless for value: unfold_less
        /// </summary>
        [EnumMember(Value = "unfold_less")]
        Unfoldless = 881,
        /// <summary>
        /// Enum Unfoldmore for value: unfold_more
        /// </summary>
        [EnumMember(Value = "unfold_more")]
        Unfoldmore = 882,
        /// <summary>
        /// Enum Update for value: update
        /// </summary>
        [EnumMember(Value = "update")]
        Update = 883,
        /// <summary>
        /// Enum Usb for value: usb
        /// </summary>
        [EnumMember(Value = "usb")]
        Usb = 884,
        /// <summary>
        /// Enum Verifieduser for value: verified_user
        /// </summary>
        [EnumMember(Value = "verified_user")]
        Verifieduser = 885,
        /// <summary>
        /// Enum Verticalalignbottom for value: vertical_align_bottom
        /// </summary>
        [EnumMember(Value = "vertical_align_bottom")]
        Verticalalignbottom = 886,
        /// <summary>
        /// Enum Verticalaligncenter for value: vertical_align_center
        /// </summary>
        [EnumMember(Value = "vertical_align_center")]
        Verticalaligncenter = 887,
        /// <summary>
        /// Enum Verticalaligntop for value: vertical_align_top
        /// </summary>
        [EnumMember(Value = "vertical_align_top")]
        Verticalaligntop = 888,
        /// <summary>
        /// Enum Vibration for value: vibration
        /// </summary>
        [EnumMember(Value = "vibration")]
        Vibration = 889,
        /// <summary>
        /// Enum Videocall for value: video_call
        /// </summary>
        [EnumMember(Value = "video_call")]
        Videocall = 890,
        /// <summary>
        /// Enum Videolabel for value: video_label
        /// </summary>
        [EnumMember(Value = "video_label")]
        Videolabel = 891,
        /// <summary>
        /// Enum Videolibrary for value: video_library
        /// </summary>
        [EnumMember(Value = "video_library")]
        Videolibrary = 892,
        /// <summary>
        /// Enum Videocam for value: videocam
        /// </summary>
        [EnumMember(Value = "videocam")]
        Videocam = 893,
        /// <summary>
        /// Enum Videocamoff for value: videocam_off
        /// </summary>
        [EnumMember(Value = "videocam_off")]
        Videocamoff = 894,
        /// <summary>
        /// Enum Videogameasset for value: videogame_asset
        /// </summary>
        [EnumMember(Value = "videogame_asset")]
        Videogameasset = 895,
        /// <summary>
        /// Enum Viewagenda for value: view_agenda
        /// </summary>
        [EnumMember(Value = "view_agenda")]
        Viewagenda = 896,
        /// <summary>
        /// Enum Viewarray for value: view_array
        /// </summary>
        [EnumMember(Value = "view_array")]
        Viewarray = 897,
        /// <summary>
        /// Enum Viewcarousel for value: view_carousel
        /// </summary>
        [EnumMember(Value = "view_carousel")]
        Viewcarousel = 898,
        /// <summary>
        /// Enum Viewcolumn for value: view_column
        /// </summary>
        [EnumMember(Value = "view_column")]
        Viewcolumn = 899,
        /// <summary>
        /// Enum Viewcomfy for value: view_comfy
        /// </summary>
        [EnumMember(Value = "view_comfy")]
        Viewcomfy = 900,
        /// <summary>
        /// Enum Viewcompact for value: view_compact
        /// </summary>
        [EnumMember(Value = "view_compact")]
        Viewcompact = 901,
        /// <summary>
        /// Enum Viewday for value: view_day
        /// </summary>
        [EnumMember(Value = "view_day")]
        Viewday = 902,
        /// <summary>
        /// Enum Viewheadline for value: view_headline
        /// </summary>
        [EnumMember(Value = "view_headline")]
        Viewheadline = 903,
        /// <summary>
        /// Enum Viewlist for value: view_list
        /// </summary>
        [EnumMember(Value = "view_list")]
        Viewlist = 904,
        /// <summary>
        /// Enum Viewmodule for value: view_module
        /// </summary>
        [EnumMember(Value = "view_module")]
        Viewmodule = 905,
        /// <summary>
        /// Enum Viewquilt for value: view_quilt
        /// </summary>
        [EnumMember(Value = "view_quilt")]
        Viewquilt = 906,
        /// <summary>
        /// Enum Viewstream for value: view_stream
        /// </summary>
        [EnumMember(Value = "view_stream")]
        Viewstream = 907,
        /// <summary>
        /// Enum Viewweek for value: view_week
        /// </summary>
        [EnumMember(Value = "view_week")]
        Viewweek = 908,
        /// <summary>
        /// Enum Vignette for value: vignette
        /// </summary>
        [EnumMember(Value = "vignette")]
        Vignette = 909,
        /// <summary>
        /// Enum Visibility for value: visibility
        /// </summary>
        [EnumMember(Value = "visibility")]
        Visibility = 910,
        /// <summary>
        /// Enum Visibilityoff for value: visibility_off
        /// </summary>
        [EnumMember(Value = "visibility_off")]
        Visibilityoff = 911,
        /// <summary>
        /// Enum Voicechat for value: voice_chat
        /// </summary>
        [EnumMember(Value = "voice_chat")]
        Voicechat = 912,
        /// <summary>
        /// Enum Voicemail for value: voicemail
        /// </summary>
        [EnumMember(Value = "voicemail")]
        Voicemail = 913,
        /// <summary>
        /// Enum Volumedown for value: volume_down
        /// </summary>
        [EnumMember(Value = "volume_down")]
        Volumedown = 914,
        /// <summary>
        /// Enum Volumemute for value: volume_mute
        /// </summary>
        [EnumMember(Value = "volume_mute")]
        Volumemute = 915,
        /// <summary>
        /// Enum Volumeoff for value: volume_off
        /// </summary>
        [EnumMember(Value = "volume_off")]
        Volumeoff = 916,
        /// <summary>
        /// Enum Volumeup for value: volume_up
        /// </summary>
        [EnumMember(Value = "volume_up")]
        Volumeup = 917,
        /// <summary>
        /// Enum Vpnkey for value: vpn_key
        /// </summary>
        [EnumMember(Value = "vpn_key")]
        Vpnkey = 918,
        /// <summary>
        /// Enum Vpnlock for value: vpn_lock
        /// </summary>
        [EnumMember(Value = "vpn_lock")]
        Vpnlock = 919,
        /// <summary>
        /// Enum Wallpaper for value: wallpaper
        /// </summary>
        [EnumMember(Value = "wallpaper")]
        Wallpaper = 920,
        /// <summary>
        /// Enum Warning for value: warning
        /// </summary>
        [EnumMember(Value = "warning")]
        Warning = 921,
        /// <summary>
        /// Enum Watch for value: watch
        /// </summary>
        [EnumMember(Value = "watch")]
        Watch = 922,
        /// <summary>
        /// Enum Watchlater for value: watch_later
        /// </summary>
        [EnumMember(Value = "watch_later")]
        Watchlater = 923,
        /// <summary>
        /// Enum Wbauto for value: wb_auto
        /// </summary>
        [EnumMember(Value = "wb_auto")]
        Wbauto = 924,
        /// <summary>
        /// Enum Wbcloudy for value: wb_cloudy
        /// </summary>
        [EnumMember(Value = "wb_cloudy")]
        Wbcloudy = 925,
        /// <summary>
        /// Enum Wbincandescent for value: wb_incandescent
        /// </summary>
        [EnumMember(Value = "wb_incandescent")]
        Wbincandescent = 926,
        /// <summary>
        /// Enum Wbiridescent for value: wb_iridescent
        /// </summary>
        [EnumMember(Value = "wb_iridescent")]
        Wbiridescent = 927,
        /// <summary>
        /// Enum Wbsunny for value: wb_sunny
        /// </summary>
        [EnumMember(Value = "wb_sunny")]
        Wbsunny = 928,
        /// <summary>
        /// Enum Wc for value: wc
        /// </summary>
        [EnumMember(Value = "wc")]
        Wc = 929,
        /// <summary>
        /// Enum Web for value: web
        /// </summary>
        [EnumMember(Value = "web")]
        Web = 930,
        /// <summary>
        /// Enum Webasset for value: web_asset
        /// </summary>
        [EnumMember(Value = "web_asset")]
        Webasset = 931,
        /// <summary>
        /// Enum Weekend for value: weekend
        /// </summary>
        [EnumMember(Value = "weekend")]
        Weekend = 932,
        /// <summary>
        /// Enum Whatshot for value: whatshot
        /// </summary>
        [EnumMember(Value = "whatshot")]
        Whatshot = 933,
        /// <summary>
        /// Enum Widgets for value: widgets
        /// </summary>
        [EnumMember(Value = "widgets")]
        Widgets = 934,
        /// <summary>
        /// Enum Wifi for value: wifi
        /// </summary>
        [EnumMember(Value = "wifi")]
        Wifi = 935,
        /// <summary>
        /// Enum Wifilock for value: wifi_lock
        /// </summary>
        [EnumMember(Value = "wifi_lock")]
        Wifilock = 936,
        /// <summary>
        /// Enum Wifitethering for value: wifi_tethering
        /// </summary>
        [EnumMember(Value = "wifi_tethering")]
        Wifitethering = 937,
        /// <summary>
        /// Enum Work for value: work
        /// </summary>
        [EnumMember(Value = "work")]
        Work = 938,
        /// <summary>
        /// Enum Workhistory for value: work_history
        /// </summary>
        [EnumMember(Value = "work_history")]
        Workhistory = 939,
        /// <summary>
        /// Enum Wraptext for value: wrap_text
        /// </summary>
        [EnumMember(Value = "wrap_text")]
        Wraptext = 940,
        /// <summary>
        /// Enum Youtubesearchedfor for value: youtube_searched_for
        /// </summary>
        [EnumMember(Value = "youtube_searched_for")]
        Youtubesearchedfor = 941,
        /// <summary>
        /// Enum Zoomin for value: zoom_in
        /// </summary>
        [EnumMember(Value = "zoom_in")]
        Zoomin = 942,
        /// <summary>
        /// Enum Zoomout for value: zoom_out
        /// </summary>
        [EnumMember(Value = "zoom_out")]
        Zoomout = 943,
        /// <summary>
        /// Enum Zoomoutmap for value: zoom_out_map
        /// </summary>
        [EnumMember(Value = "zoom_out_map")]
        Zoomoutmap = 944,
        /// <summary>
        /// Enum _10k for value: _10k
        /// </summary>
        [EnumMember(Value = "_10k")]
        _10k = 945,
        /// <summary>
        /// Enum _10mp for value: _10mp
        /// </summary>
        [EnumMember(Value = "_10mp")]
        _10mp = 946,
        /// <summary>
        /// Enum _11mp for value: _11mp
        /// </summary>
        [EnumMember(Value = "_11mp")]
        _11mp = 947,
        /// <summary>
        /// Enum _123 for value: _123
        /// </summary>
        [EnumMember(Value = "_123")]
        _123 = 948,
        /// <summary>
        /// Enum _12mp for value: _12mp
        /// </summary>
        [EnumMember(Value = "_12mp")]
        _12mp = 949,
        /// <summary>
        /// Enum _13mp for value: _13mp
        /// </summary>
        [EnumMember(Value = "_13mp")]
        _13mp = 950,
        /// <summary>
        /// Enum _14mp for value: _14mp
        /// </summary>
        [EnumMember(Value = "_14mp")]
        _14mp = 951,
        /// <summary>
        /// Enum _15mp for value: _15mp
        /// </summary>
        [EnumMember(Value = "_15mp")]
        _15mp = 952,
        /// <summary>
        /// Enum _16mp for value: _16mp
        /// </summary>
        [EnumMember(Value = "_16mp")]
        _16mp = 953,
        /// <summary>
        /// Enum _17mp for value: _17mp
        /// </summary>
        [EnumMember(Value = "_17mp")]
        _17mp = 954,
        /// <summary>
        /// Enum _18uprating for value: _18_up_rating
        /// </summary>
        [EnumMember(Value = "_18_up_rating")]
        _18uprating = 955,
        /// <summary>
        /// Enum _18mp for value: _18mp
        /// </summary>
        [EnumMember(Value = "_18mp")]
        _18mp = 956,
        /// <summary>
        /// Enum _19mp for value: _19mp
        /// </summary>
        [EnumMember(Value = "_19mp")]
        _19mp = 957,
        /// <summary>
        /// Enum _1k for value: _1k
        /// </summary>
        [EnumMember(Value = "_1k")]
        _1k = 958,
        /// <summary>
        /// Enum _1kplus for value: _1k_plus
        /// </summary>
        [EnumMember(Value = "_1k_plus")]
        _1kplus = 959,
        /// <summary>
        /// Enum _1xmobiledata for value: _1x_mobiledata
        /// </summary>
        [EnumMember(Value = "_1x_mobiledata")]
        _1xmobiledata = 960,
        /// <summary>
        /// Enum _20mp for value: _20mp
        /// </summary>
        [EnumMember(Value = "_20mp")]
        _20mp = 961,
        /// <summary>
        /// Enum _21mp for value: _21mp
        /// </summary>
        [EnumMember(Value = "_21mp")]
        _21mp = 962,
        /// <summary>
        /// Enum _22mp for value: _22mp
        /// </summary>
        [EnumMember(Value = "_22mp")]
        _22mp = 963,
        /// <summary>
        /// Enum _23mp for value: _23mp
        /// </summary>
        [EnumMember(Value = "_23mp")]
        _23mp = 964,
        /// <summary>
        /// Enum _24mp for value: _24mp
        /// </summary>
        [EnumMember(Value = "_24mp")]
        _24mp = 965,
        /// <summary>
        /// Enum _2k for value: _2k
        /// </summary>
        [EnumMember(Value = "_2k")]
        _2k = 966,
        /// <summary>
        /// Enum _2kplus for value: _2k_plus
        /// </summary>
        [EnumMember(Value = "_2k_plus")]
        _2kplus = 967,
        /// <summary>
        /// Enum _2mp for value: _2mp
        /// </summary>
        [EnumMember(Value = "_2mp")]
        _2mp = 968,
        /// <summary>
        /// Enum _30fps for value: _30fps
        /// </summary>
        [EnumMember(Value = "_30fps")]
        _30fps = 969,
        /// <summary>
        /// Enum _30fpsselect for value: _30fps_select
        /// </summary>
        [EnumMember(Value = "_30fps_select")]
        _30fpsselect = 970,
        /// <summary>
        /// Enum _360 for value: _360
        /// </summary>
        [EnumMember(Value = "_360")]
        _360 = 971,
        /// <summary>
        /// Enum _3gmobiledata for value: _3g_mobiledata
        /// </summary>
        [EnumMember(Value = "_3g_mobiledata")]
        _3gmobiledata = 972,
        /// <summary>
        /// Enum _3k for value: _3k
        /// </summary>
        [EnumMember(Value = "_3k")]
        _3k = 973,
        /// <summary>
        /// Enum _3kplus for value: _3k_plus
        /// </summary>
        [EnumMember(Value = "_3k_plus")]
        _3kplus = 974,
        /// <summary>
        /// Enum _3mp for value: _3mp
        /// </summary>
        [EnumMember(Value = "_3mp")]
        _3mp = 975,
        /// <summary>
        /// Enum _3p for value: _3p
        /// </summary>
        [EnumMember(Value = "_3p")]
        _3p = 976,
        /// <summary>
        /// Enum _4gmobiledata for value: _4g_mobiledata
        /// </summary>
        [EnumMember(Value = "_4g_mobiledata")]
        _4gmobiledata = 977,
        /// <summary>
        /// Enum _4gplusmobiledata for value: _4g_plus_mobiledata
        /// </summary>
        [EnumMember(Value = "_4g_plus_mobiledata")]
        _4gplusmobiledata = 978,
        /// <summary>
        /// Enum _4k for value: _4k
        /// </summary>
        [EnumMember(Value = "_4k")]
        _4k = 979,
        /// <summary>
        /// Enum _4kplus for value: _4k_plus
        /// </summary>
        [EnumMember(Value = "_4k_plus")]
        _4kplus = 980,
        /// <summary>
        /// Enum _4mp for value: _4mp
        /// </summary>
        [EnumMember(Value = "_4mp")]
        _4mp = 981,
        /// <summary>
        /// Enum _5g for value: _5g
        /// </summary>
        [EnumMember(Value = "_5g")]
        _5g = 982,
        /// <summary>
        /// Enum _5k for value: _5k
        /// </summary>
        [EnumMember(Value = "_5k")]
        _5k = 983,
        /// <summary>
        /// Enum _5kplus for value: _5k_plus
        /// </summary>
        [EnumMember(Value = "_5k_plus")]
        _5kplus = 984,
        /// <summary>
        /// Enum _5mp for value: _5mp
        /// </summary>
        [EnumMember(Value = "_5mp")]
        _5mp = 985,
        /// <summary>
        /// Enum _60fps for value: _60fps
        /// </summary>
        [EnumMember(Value = "_60fps")]
        _60fps = 986,
        /// <summary>
        /// Enum _60fpsselect for value: _60fps_select
        /// </summary>
        [EnumMember(Value = "_60fps_select")]
        _60fpsselect = 987,
        /// <summary>
        /// Enum _6ftapart for value: _6_ft_apart
        /// </summary>
        [EnumMember(Value = "_6_ft_apart")]
        _6ftapart = 988,
        /// <summary>
        /// Enum _6k for value: _6k
        /// </summary>
        [EnumMember(Value = "_6k")]
        _6k = 989,
        /// <summary>
        /// Enum _6kplus for value: _6k_plus
        /// </summary>
        [EnumMember(Value = "_6k_plus")]
        _6kplus = 990,
        /// <summary>
        /// Enum _6mp for value: _6mp
        /// </summary>
        [EnumMember(Value = "_6mp")]
        _6mp = 991,
        /// <summary>
        /// Enum _7k for value: _7k
        /// </summary>
        [EnumMember(Value = "_7k")]
        _7k = 992,
        /// <summary>
        /// Enum _7kplus for value: _7k_plus
        /// </summary>
        [EnumMember(Value = "_7k_plus")]
        _7kplus = 993,
        /// <summary>
        /// Enum _7mp for value: _7mp
        /// </summary>
        [EnumMember(Value = "_7mp")]
        _7mp = 994,
        /// <summary>
        /// Enum _8k for value: _8k
        /// </summary>
        [EnumMember(Value = "_8k")]
        _8k = 995,
        /// <summary>
        /// Enum _8kplus for value: _8k_plus
        /// </summary>
        [EnumMember(Value = "_8k_plus")]
        _8kplus = 996,
        /// <summary>
        /// Enum _8mp for value: _8mp
        /// </summary>
        [EnumMember(Value = "_8mp")]
        _8mp = 997,
        /// <summary>
        /// Enum _9k for value: _9k
        /// </summary>
        [EnumMember(Value = "_9k")]
        _9k = 998,
        /// <summary>
        /// Enum _9kplus for value: _9k_plus
        /// </summary>
        [EnumMember(Value = "_9k_plus")]
        _9kplus = 999,
        /// <summary>
        /// Enum _9mp for value: _9mp
        /// </summary>
        [EnumMember(Value = "_9mp")]
        _9mp = 1000,
        /// <summary>
        /// Enum Abc for value: abc
        /// </summary>
        [EnumMember(Value = "abc")]
        Abc = 1001,
        /// <summary>
        /// Enum Accesstimefilled for value: access_time_filled
        /// </summary>
        [EnumMember(Value = "access_time_filled")]
        Accesstimefilled = 1002,
        /// <summary>
        /// Enum Accessibilitynew for value: accessibility_new
        /// </summary>
        [EnumMember(Value = "accessibility_new")]
        Accessibilitynew = 1003,
        /// <summary>
        /// Enum Accessibleforward for value: accessible_forward
        /// </summary>
        [EnumMember(Value = "accessible_forward")]
        Accessibleforward = 1004,
        /// <summary>
        /// Enum Adunits for value: ad_units
        /// </summary>
        [EnumMember(Value = "ad_units")]
        Adunits = 1005,
        /// <summary>
        /// Enum Addbusiness for value: add_business
        /// </summary>
        [EnumMember(Value = "add_business")]
        Addbusiness = 1006,
        /// <summary>
        /// Enum Addcard for value: add_card
        /// </summary>
        [EnumMember(Value = "add_card")]
        Addcard = 1007,
        /// <summary>
        /// Enum Addchart for value: add_chart
        /// </summary>
        [EnumMember(Value = "add_chart")]
        Addchart = 1008,
        /// <summary>
        /// Enum Addcomment for value: add_comment
        /// </summary>
        [EnumMember(Value = "add_comment")]
        Addcomment = 1009,
        /// <summary>
        /// Enum Addhome for value: add_home
        /// </summary>
        [EnumMember(Value = "add_home")]
        Addhome = 1010,
        /// <summary>
        /// Enum Addhomework for value: add_home_work
        /// </summary>
        [EnumMember(Value = "add_home_work")]
        Addhomework = 1011,
        /// <summary>
        /// Enum Addiccall for value: add_ic_call
        /// </summary>
        [EnumMember(Value = "add_ic_call")]
        Addiccall = 1012,
        /// <summary>
        /// Enum Addlink for value: add_link
        /// </summary>
        [EnumMember(Value = "add_link")]
        Addlink = 1013,
        /// <summary>
        /// Enum Addlocationalt for value: add_location_alt
        /// </summary>
        [EnumMember(Value = "add_location_alt")]
        Addlocationalt = 1014,
        /// <summary>
        /// Enum Addmoderator for value: add_moderator
        /// </summary>
        [EnumMember(Value = "add_moderator")]
        Addmoderator = 1015,
        /// <summary>
        /// Enum Addphotoalternate for value: add_photo_alternate
        /// </summary>
        [EnumMember(Value = "add_photo_alternate")]
        Addphotoalternate = 1016,
        /// <summary>
        /// Enum Addreaction for value: add_reaction
        /// </summary>
        [EnumMember(Value = "add_reaction")]
        Addreaction = 1017,
        /// <summary>
        /// Enum Addroad for value: add_road
        /// </summary>
        [EnumMember(Value = "add_road")]
        Addroad = 1018,
        /// <summary>
        /// Enum Addtask for value: add_task
        /// </summary>
        [EnumMember(Value = "add_task")]
        Addtask = 1019,
        /// <summary>
        /// Enum Addtodrive for value: add_to_drive
        /// </summary>
        [EnumMember(Value = "add_to_drive")]
        Addtodrive = 1020,
        /// <summary>
        /// Enum Addtohomescreen for value: add_to_home_screen
        /// </summary>
        [EnumMember(Value = "add_to_home_screen")]
        Addtohomescreen = 1021,
        /// <summary>
        /// Enum Addchart for value: addchart
        /// </summary>
        [EnumMember(Value = "addchart")]
        Addchart = 1022,
        /// <summary>
        /// Enum Adfscanner for value: adf_scanner
        /// </summary>
        [EnumMember(Value = "adf_scanner")]
        Adfscanner = 1023,
        /// <summary>
        /// Enum Adminpanelsettings for value: admin_panel_settings
        /// </summary>
        [EnumMember(Value = "admin_panel_settings")]
        Adminpanelsettings = 1024,
        /// <summary>
        /// Enum Adobe for value: adobe
        /// </summary>
        [EnumMember(Value = "adobe")]
        Adobe = 1025,
        /// <summary>
        /// Enum Adsclick for value: ads_click
        /// </summary>
        [EnumMember(Value = "ads_click")]
        Adsclick = 1026,
        /// <summary>
        /// Enum Agriculture for value: agriculture
        /// </summary>
        [EnumMember(Value = "agriculture")]
        Agriculture = 1027,
        /// <summary>
        /// Enum Air for value: air
        /// </summary>
        [EnumMember(Value = "air")]
        Air = 1028,
        /// <summary>
        /// Enum Airlinestops for value: airline_stops
        /// </summary>
        [EnumMember(Value = "airline_stops")]
        Airlinestops = 1029,
        /// <summary>
        /// Enum Airlines for value: airlines
        /// </summary>
        [EnumMember(Value = "airlines")]
        Airlines = 1030,
        /// <summary>
        /// Enum Airplaneticket for value: airplane_ticket
        /// </summary>
        [EnumMember(Value = "airplane_ticket")]
        Airplaneticket = 1031,
        /// <summary>
        /// Enum Airplanemodeoff for value: airplanemode_off
        /// </summary>
        [EnumMember(Value = "airplanemode_off")]
        Airplanemodeoff = 1032,
        /// <summary>
        /// Enum Airplanemodeon for value: airplanemode_on
        /// </summary>
        [EnumMember(Value = "airplanemode_on")]
        Airplanemodeon = 1033,
        /// <summary>
        /// Enum Alignhorizontalcenter for value: align_horizontal_center
        /// </summary>
        [EnumMember(Value = "align_horizontal_center")]
        Alignhorizontalcenter = 1034,
        /// <summary>
        /// Enum Alignhorizontalleft for value: align_horizontal_left
        /// </summary>
        [EnumMember(Value = "align_horizontal_left")]
        Alignhorizontalleft = 1035,
        /// <summary>
        /// Enum Alignhorizontalright for value: align_horizontal_right
        /// </summary>
        [EnumMember(Value = "align_horizontal_right")]
        Alignhorizontalright = 1036,
        /// <summary>
        /// Enum Alignverticalbottom for value: align_vertical_bottom
        /// </summary>
        [EnumMember(Value = "align_vertical_bottom")]
        Alignverticalbottom = 1037,
        /// <summary>
        /// Enum Alignverticalcenter for value: align_vertical_center
        /// </summary>
        [EnumMember(Value = "align_vertical_center")]
        Alignverticalcenter = 1038,
        /// <summary>
        /// Enum Alignverticaltop for value: align_vertical_top
        /// </summary>
        [EnumMember(Value = "align_vertical_top")]
        Alignverticaltop = 1039,
        /// <summary>
        /// Enum Allinbox for value: all_inbox
        /// </summary>
        [EnumMember(Value = "all_inbox")]
        Allinbox = 1040,
        /// <summary>
        /// Enum Altroute for value: alt_route
        /// </summary>
        [EnumMember(Value = "alt_route")]
        Altroute = 1041,
        /// <summary>
        /// Enum Alternateemail for value: alternate_email
        /// </summary>
        [EnumMember(Value = "alternate_email")]
        Alternateemail = 1042,
        /// <summary>
        /// Enum Ampstories for value: amp_stories
        /// </summary>
        [EnumMember(Value = "amp_stories")]
        Ampstories = 1043,
        /// <summary>
        /// Enum Analytics for value: analytics
        /// </summary>
        [EnumMember(Value = "analytics")]
        Analytics = 1044,
        /// <summary>
        /// Enum Anchor for value: anchor
        /// </summary>
        [EnumMember(Value = "anchor")]
        Anchor = 1045,
        /// <summary>
        /// Enum Animation for value: animation
        /// </summary>
        [EnumMember(Value = "animation")]
        Animation = 1046,
        /// <summary>
        /// Enum Aod for value: aod
        /// </summary>
        [EnumMember(Value = "aod")]
        Aod = 1047,
        /// <summary>
        /// Enum Apartment for value: apartment
        /// </summary>
        [EnumMember(Value = "apartment")]
        Apartment = 1048,
        /// <summary>
        /// Enum Api for value: api
        /// </summary>
        [EnumMember(Value = "api")]
        Api = 1049,
        /// <summary>
        /// Enum Appblocking for value: app_blocking
        /// </summary>
        [EnumMember(Value = "app_blocking")]
        Appblocking = 1050,
        /// <summary>
        /// Enum Appregistration for value: app_registration
        /// </summary>
        [EnumMember(Value = "app_registration")]
        Appregistration = 1051,
        /// <summary>
        /// Enum Appsettingsalt for value: app_settings_alt
        /// </summary>
        [EnumMember(Value = "app_settings_alt")]
        Appsettingsalt = 1052,
        /// <summary>
        /// Enum Appshortcut for value: app_shortcut
        /// </summary>
        [EnumMember(Value = "app_shortcut")]
        Appshortcut = 1053,
        /// <summary>
        /// Enum Apple for value: apple
        /// </summary>
        [EnumMember(Value = "apple")]
        Apple = 1054,
        /// <summary>
        /// Enum Approval for value: approval
        /// </summary>
        [EnumMember(Value = "approval")]
        Approval = 1055,
        /// <summary>
        /// Enum Appsoutage for value: apps_outage
        /// </summary>
        [EnumMember(Value = "apps_outage")]
        Appsoutage = 1056,
        /// <summary>
        /// Enum Architecture for value: architecture
        /// </summary>
        [EnumMember(Value = "architecture")]
        Architecture = 1057,
        /// <summary>
        /// Enum Areachart for value: area_chart
        /// </summary>
        [EnumMember(Value = "area_chart")]
        Areachart = 1058,
        /// <summary>
        /// Enum Arrowbackios for value: arrow_back_ios
        /// </summary>
        [EnumMember(Value = "arrow_back_ios")]
        Arrowbackios = 1059,
        /// <summary>
        /// Enum Arrowbackiosnew for value: arrow_back_ios_new
        /// </summary>
        [EnumMember(Value = "arrow_back_ios_new")]
        Arrowbackiosnew = 1060,
        /// <summary>
        /// Enum Arrowcircledown for value: arrow_circle_down
        /// </summary>
        [EnumMember(Value = "arrow_circle_down")]
        Arrowcircledown = 1061,
        /// <summary>
        /// Enum Arrowcircleleft for value: arrow_circle_left
        /// </summary>
        [EnumMember(Value = "arrow_circle_left")]
        Arrowcircleleft = 1062,
        /// <summary>
        /// Enum Arrowcircleright for value: arrow_circle_right
        /// </summary>
        [EnumMember(Value = "arrow_circle_right")]
        Arrowcircleright = 1063,
        /// <summary>
        /// Enum Arrowcircleup for value: arrow_circle_up
        /// </summary>
        [EnumMember(Value = "arrow_circle_up")]
        Arrowcircleup = 1064,
        /// <summary>
        /// Enum Arrowforwardios for value: arrow_forward_ios
        /// </summary>
        [EnumMember(Value = "arrow_forward_ios")]
        Arrowforwardios = 1065,
        /// <summary>
        /// Enum Arrowleft for value: arrow_left
        /// </summary>
        [EnumMember(Value = "arrow_left")]
        Arrowleft = 1066,
        /// <summary>
        /// Enum Arrowoutward for value: arrow_outward
        /// </summary>
        [EnumMember(Value = "arrow_outward")]
        Arrowoutward = 1067,
        /// <summary>
        /// Enum Arrowright for value: arrow_right
        /// </summary>
        [EnumMember(Value = "arrow_right")]
        Arrowright = 1068,
        /// <summary>
        /// Enum Arrowrightalt for value: arrow_right_alt
        /// </summary>
        [EnumMember(Value = "arrow_right_alt")]
        Arrowrightalt = 1069,
        /// <summary>
        /// Enum Article for value: article
        /// </summary>
        [EnumMember(Value = "article")]
        Article = 1070,
        /// <summary>
        /// Enum Assistwalker for value: assist_walker
        /// </summary>
        [EnumMember(Value = "assist_walker")]
        Assistwalker = 1071,
        /// <summary>
        /// Enum Assistantdirection for value: assistant_direction
        /// </summary>
        [EnumMember(Value = "assistant_direction")]
        Assistantdirection = 1072,
        /// <summary>
        /// Enum Assuredworkload for value: assured_workload
        /// </summary>
        [EnumMember(Value = "assured_workload")]
        Assuredworkload = 1073,
        /// <summary>
        /// Enum Atm for value: atm
        /// </summary>
        [EnumMember(Value = "atm")]
        Atm = 1074,
        /// <summary>
        /// Enum Attachemail for value: attach_email
        /// </summary>
        [EnumMember(Value = "attach_email")]
        Attachemail = 1075,
        /// <summary>
        /// Enum Attractions for value: attractions
        /// </summary>
        [EnumMember(Value = "attractions")]
        Attractions = 1076,
        /// <summary>
        /// Enum Attribution for value: attribution
        /// </summary>
        [EnumMember(Value = "attribution")]
        Attribution = 1077,
        /// <summary>
        /// Enum Audiofile for value: audio_file
        /// </summary>
        [EnumMember(Value = "audio_file")]
        Audiofile = 1078,
        /// <summary>
        /// Enum Autoawesome for value: auto_awesome
        /// </summary>
        [EnumMember(Value = "auto_awesome")]
        Autoawesome = 1079,
        /// <summary>
        /// Enum Autoawesomemosaic for value: auto_awesome_mosaic
        /// </summary>
        [EnumMember(Value = "auto_awesome_mosaic")]
        Autoawesomemosaic = 1080,
        /// <summary>
        /// Enum Autoawesomemotion for value: auto_awesome_motion
        /// </summary>
        [EnumMember(Value = "auto_awesome_motion")]
        Autoawesomemotion = 1081,
        /// <summary>
        /// Enum Autodelete for value: auto_delete
        /// </summary>
        [EnumMember(Value = "auto_delete")]
        Autodelete = 1082,
        /// <summary>
        /// Enum Autofixhigh for value: auto_fix_high
        /// </summary>
        [EnumMember(Value = "auto_fix_high")]
        Autofixhigh = 1083,
        /// <summary>
        /// Enum Autofixnormal for value: auto_fix_normal
        /// </summary>
        [EnumMember(Value = "auto_fix_normal")]
        Autofixnormal = 1084,
        /// <summary>
        /// Enum Autofixoff for value: auto_fix_off
        /// </summary>
        [EnumMember(Value = "auto_fix_off")]
        Autofixoff = 1085,
        /// <summary>
        /// Enum Autograph for value: auto_graph
        /// </summary>
        [EnumMember(Value = "auto_graph")]
        Autograph = 1086,
        /// <summary>
        /// Enum Automode for value: auto_mode
        /// </summary>
        [EnumMember(Value = "auto_mode")]
        Automode = 1087,
        /// <summary>
        /// Enum Autostories for value: auto_stories
        /// </summary>
        [EnumMember(Value = "auto_stories")]
        Autostories = 1088,
        /// <summary>
        /// Enum Autofpsselect for value: autofps_select
        /// </summary>
        [EnumMember(Value = "autofps_select")]
        Autofpsselect = 1089,
        /// <summary>
        /// Enum Babychangingstation for value: baby_changing_station
        /// </summary>
        [EnumMember(Value = "baby_changing_station")]
        Babychangingstation = 1090,
        /// <summary>
        /// Enum Backhand for value: back_hand
        /// </summary>
        [EnumMember(Value = "back_hand")]
        Backhand = 1091,
        /// <summary>
        /// Enum Backpack for value: backpack
        /// </summary>
        [EnumMember(Value = "backpack")]
        Backpack = 1092,
        /// <summary>
        /// Enum Backuptable for value: backup_table
        /// </summary>
        [EnumMember(Value = "backup_table")]
        Backuptable = 1093,
        /// <summary>
        /// Enum Badge for value: badge
        /// </summary>
        [EnumMember(Value = "badge")]
        Badge = 1094,
        /// <summary>
        /// Enum Bakerydining for value: bakery_dining
        /// </summary>
        [EnumMember(Value = "bakery_dining")]
        Bakerydining = 1095,
        /// <summary>
        /// Enum Balance for value: balance
        /// </summary>
        [EnumMember(Value = "balance")]
        Balance = 1096,
        /// <summary>
        /// Enum Balcony for value: balcony
        /// </summary>
        [EnumMember(Value = "balcony")]
        Balcony = 1097,
        /// <summary>
        /// Enum Ballot for value: ballot
        /// </summary>
        [EnumMember(Value = "ballot")]
        Ballot = 1098,
        /// <summary>
        /// Enum Barchart for value: bar_chart
        /// </summary>
        [EnumMember(Value = "bar_chart")]
        Barchart = 1099,
        /// <summary>
        /// Enum Batchprediction for value: batch_prediction
        /// </summary>
        [EnumMember(Value = "batch_prediction")]
        Batchprediction = 1100,
        /// <summary>
        /// Enum Bathroom for value: bathroom
        /// </summary>
        [EnumMember(Value = "bathroom")]
        Bathroom = 1101,
        /// <summary>
        /// Enum Bathtub for value: bathtub
        /// </summary>
        [EnumMember(Value = "bathtub")]
        Bathtub = 1102,
        /// <summary>
        /// Enum Battery0bar for value: battery_0_bar
        /// </summary>
        [EnumMember(Value = "battery_0_bar")]
        Battery0bar = 1103,
        /// <summary>
        /// Enum Battery1bar for value: battery_1_bar
        /// </summary>
        [EnumMember(Value = "battery_1_bar")]
        Battery1bar = 1104,
        /// <summary>
        /// Enum Battery2bar for value: battery_2_bar
        /// </summary>
        [EnumMember(Value = "battery_2_bar")]
        Battery2bar = 1105,
        /// <summary>
        /// Enum Battery3bar for value: battery_3_bar
        /// </summary>
        [EnumMember(Value = "battery_3_bar")]
        Battery3bar = 1106,
        /// <summary>
        /// Enum Battery4bar for value: battery_4_bar
        /// </summary>
        [EnumMember(Value = "battery_4_bar")]
        Battery4bar = 1107,
        /// <summary>
        /// Enum Battery5bar for value: battery_5_bar
        /// </summary>
        [EnumMember(Value = "battery_5_bar")]
        Battery5bar = 1108,
        /// <summary>
        /// Enum Battery6bar for value: battery_6_bar
        /// </summary>
        [EnumMember(Value = "battery_6_bar")]
        Battery6bar = 1109,
        /// <summary>
        /// Enum Batterysaver for value: battery_saver
        /// </summary>
        [EnumMember(Value = "battery_saver")]
        Batterysaver = 1110,
        /// <summary>
        /// Enum Bed for value: bed
        /// </summary>
        [EnumMember(Value = "bed")]
        Bed = 1111,
        /// <summary>
        /// Enum Bedroombaby for value: bedroom_baby
        /// </summary>
        [EnumMember(Value = "bedroom_baby")]
        Bedroombaby = 1112,
        /// <summary>
        /// Enum Bedroomchild for value: bedroom_child
        /// </summary>
        [EnumMember(Value = "bedroom_child")]
        Bedroomchild = 1113,
        /// <summary>
        /// Enum Bedroomparent for value: bedroom_parent
        /// </summary>
        [EnumMember(Value = "bedroom_parent")]
        Bedroomparent = 1114,
        /// <summary>
        /// Enum Bedtime for value: bedtime
        /// </summary>
        [EnumMember(Value = "bedtime")]
        Bedtime = 1115,
        /// <summary>
        /// Enum Bedtimeoff for value: bedtime_off
        /// </summary>
        [EnumMember(Value = "bedtime_off")]
        Bedtimeoff = 1116,
        /// <summary>
        /// Enum Bento for value: bento
        /// </summary>
        [EnumMember(Value = "bento")]
        Bento = 1117,
        /// <summary>
        /// Enum Bikescooter for value: bike_scooter
        /// </summary>
        [EnumMember(Value = "bike_scooter")]
        Bikescooter = 1118,
        /// <summary>
        /// Enum Biotech for value: biotech
        /// </summary>
        [EnumMember(Value = "biotech")]
        Biotech = 1119,
        /// <summary>
        /// Enum Blender for value: blender
        /// </summary>
        [EnumMember(Value = "blender")]
        Blender = 1120,
        /// <summary>
        /// Enum Blind for value: blind
        /// </summary>
        [EnumMember(Value = "blind")]
        Blind = 1121,
        /// <summary>
        /// Enum Blinds for value: blinds
        /// </summary>
        [EnumMember(Value = "blinds")]
        Blinds = 1122,
        /// <summary>
        /// Enum Blindsclosed for value: blinds_closed
        /// </summary>
        [EnumMember(Value = "blinds_closed")]
        Blindsclosed = 1123,
        /// <summary>
        /// Enum Bloodtype for value: bloodtype
        /// </summary>
        [EnumMember(Value = "bloodtype")]
        Bloodtype = 1124,
        /// <summary>
        /// Enum Bluetoothdrive for value: bluetooth_drive
        /// </summary>
        [EnumMember(Value = "bluetooth_drive")]
        Bluetoothdrive = 1125,
        /// <summary>
        /// Enum Bolt for value: bolt
        /// </summary>
        [EnumMember(Value = "bolt")]
        Bolt = 1126,
        /// <summary>
        /// Enum Bookonline for value: book_online
        /// </summary>
        [EnumMember(Value = "book_online")]
        Bookonline = 1127,
        /// <summary>
        /// Enum Bookmarkadd for value: bookmark_add
        /// </summary>
        [EnumMember(Value = "bookmark_add")]
        Bookmarkadd = 1128,
        /// <summary>
        /// Enum Bookmarkadded for value: bookmark_added
        /// </summary>
        [EnumMember(Value = "bookmark_added")]
        Bookmarkadded = 1129,
        /// <summary>
        /// Enum Bookmarkoutline for value: bookmark_outline
        /// </summary>
        [EnumMember(Value = "bookmark_outline")]
        Bookmarkoutline = 1130,
        /// <summary>
        /// Enum Bookmarkremove for value: bookmark_remove
        /// </summary>
        [EnumMember(Value = "bookmark_remove")]
        Bookmarkremove = 1131,
        /// <summary>
        /// Enum Boy for value: boy
        /// </summary>
        [EnumMember(Value = "boy")]
        Boy = 1132,
        /// <summary>
        /// Enum Breakfastdining for value: breakfast_dining
        /// </summary>
        [EnumMember(Value = "breakfast_dining")]
        Breakfastdining = 1133,
        /// <summary>
        /// Enum Broadcastonhome for value: broadcast_on_home
        /// </summary>
        [EnumMember(Value = "broadcast_on_home")]
        Broadcastonhome = 1134,
        /// <summary>
        /// Enum Broadcastonpersonal for value: broadcast_on_personal
        /// </summary>
        [EnumMember(Value = "broadcast_on_personal")]
        Broadcastonpersonal = 1135,
        /// <summary>
        /// Enum Browsegallery for value: browse_gallery
        /// </summary>
        [EnumMember(Value = "browse_gallery")]
        Browsegallery = 1136,
        /// <summary>
        /// Enum Browsernotsupported for value: browser_not_supported
        /// </summary>
        [EnumMember(Value = "browser_not_supported")]
        Browsernotsupported = 1137,
        /// <summary>
        /// Enum Browserupdated for value: browser_updated
        /// </summary>
        [EnumMember(Value = "browser_updated")]
        Browserupdated = 1138,
        /// <summary>
        /// Enum Brunchdining for value: brunch_dining
        /// </summary>
        [EnumMember(Value = "brunch_dining")]
        Brunchdining = 1139,
        /// <summary>
        /// Enum Buildcircle for value: build_circle
        /// </summary>
        [EnumMember(Value = "build_circle")]
        Buildcircle = 1140,
        /// <summary>
        /// Enum Bungalow for value: bungalow
        /// </summary>
        [EnumMember(Value = "bungalow")]
        Bungalow = 1141,
        /// <summary>
        /// Enum Busalert for value: bus_alert
        /// </summary>
        [EnumMember(Value = "bus_alert")]
        Busalert = 1142,
        /// <summary>
        /// Enum Cabin for value: cabin
        /// </summary>
        [EnumMember(Value = "cabin")]
        Cabin = 1143,
        /// <summary>
        /// Enum Cable for value: cable
        /// </summary>
        [EnumMember(Value = "cable")]
        Cable = 1144,
        /// <summary>
        /// Enum Calculate for value: calculate
        /// </summary>
        [EnumMember(Value = "calculate")]
        Calculate = 1145,
        /// <summary>
        /// Enum Calendarmonth for value: calendar_month
        /// </summary>
        [EnumMember(Value = "calendar_month")]
        Calendarmonth = 1146,
        /// <summary>
        /// Enum Calendarviewday for value: calendar_view_day
        /// </summary>
        [EnumMember(Value = "calendar_view_day")]
        Calendarviewday = 1147,
        /// <summary>
        /// Enum Calendarviewmonth for value: calendar_view_month
        /// </summary>
        [EnumMember(Value = "calendar_view_month")]
        Calendarviewmonth = 1148,
        /// <summary>
        /// Enum Calendarviewweek for value: calendar_view_week
        /// </summary>
        [EnumMember(Value = "calendar_view_week")]
        Calendarviewweek = 1149,
        /// <summary>
        /// Enum Cameraindoor for value: camera_indoor
        /// </summary>
        [EnumMember(Value = "camera_indoor")]
        Cameraindoor = 1150,
        /// <summary>
        /// Enum Cameraoutdoor for value: camera_outdoor
        /// </summary>
        [EnumMember(Value = "camera_outdoor")]
        Cameraoutdoor = 1151,
        /// <summary>
        /// Enum Cameraswitch for value: cameraswitch
        /// </summary>
        [EnumMember(Value = "cameraswitch")]
        Cameraswitch = 1152,
        /// <summary>
        /// Enum Campaign for value: campaign
        /// </summary>
        [EnumMember(Value = "campaign")]
        Campaign = 1153,
        /// <summary>
        /// Enum Cancelpresentation for value: cancel_presentation
        /// </summary>
        [EnumMember(Value = "cancel_presentation")]
        Cancelpresentation = 1154,
        /// <summary>
        /// Enum Cancelschedulesend for value: cancel_schedule_send
        /// </summary>
        [EnumMember(Value = "cancel_schedule_send")]
        Cancelschedulesend = 1155,
        /// <summary>
        /// Enum Candlestickchart for value: candlestick_chart
        /// </summary>
        [EnumMember(Value = "candlestick_chart")]
        Candlestickchart = 1156,
        /// <summary>
        /// Enum Carcrash for value: car_crash
        /// </summary>
        [EnumMember(Value = "car_crash")]
        Carcrash = 1157,
        /// <summary>
        /// Enum Carrental for value: car_rental
        /// </summary>
        [EnumMember(Value = "car_rental")]
        Carrental = 1158,
        /// <summary>
        /// Enum Carrepair for value: car_repair
        /// </summary>
        [EnumMember(Value = "car_repair")]
        Carrepair = 1159,
        /// <summary>
        /// Enum Carpenter for value: carpenter
        /// </summary>
        [EnumMember(Value = "carpenter")]
        Carpenter = 1160,
        /// <summary>
        /// Enum Cases for value: cases
        /// </summary>
        [EnumMember(Value = "cases")]
        Cases = 1161,
        /// <summary>
        /// Enum Castforeducation for value: cast_for_education
        /// </summary>
        [EnumMember(Value = "cast_for_education")]
        Castforeducation = 1162,
        /// <summary>
        /// Enum Castle for value: castle
        /// </summary>
        [EnumMember(Value = "castle")]
        Castle = 1163,
        /// <summary>
        /// Enum Catchingpokemon for value: catching_pokemon
        /// </summary>
        [EnumMember(Value = "catching_pokemon")]
        Catchingpokemon = 1164,
        /// <summary>
        /// Enum Category for value: category
        /// </summary>
        [EnumMember(Value = "category")]
        Category = 1165,
        /// <summary>
        /// Enum Celebration for value: celebration
        /// </summary>
        [EnumMember(Value = "celebration")]
        Celebration = 1166,
        /// <summary>
        /// Enum Celltower for value: cell_tower
        /// </summary>
        [EnumMember(Value = "cell_tower")]
        Celltower = 1167,
        /// <summary>
        /// Enum Cellwifi for value: cell_wifi
        /// </summary>
        [EnumMember(Value = "cell_wifi")]
        Cellwifi = 1168,
        /// <summary>
        /// Enum Chair for value: chair
        /// </summary>
        [EnumMember(Value = "chair")]
        Chair = 1169,
        /// <summary>
        /// Enum Chairalt for value: chair_alt
        /// </summary>
        [EnumMember(Value = "chair_alt")]
        Chairalt = 1170,
        /// <summary>
        /// Enum Chalet for value: chalet
        /// </summary>
        [EnumMember(Value = "chalet")]
        Chalet = 1171,
        /// <summary>
        /// Enum Changecircle for value: change_circle
        /// </summary>
        [EnumMember(Value = "change_circle")]
        Changecircle = 1172,
        /// <summary>
        /// Enum Chargingstation for value: charging_station
        /// </summary>
        [EnumMember(Value = "charging_station")]
        Chargingstation = 1173,
        /// <summary>
        /// Enum Checklist for value: checklist
        /// </summary>
        [EnumMember(Value = "checklist")]
        Checklist = 1174,
        /// <summary>
        /// Enum Checklistrtl for value: checklist_rtl
        /// </summary>
        [EnumMember(Value = "checklist_rtl")]
        Checklistrtl = 1175,
        /// <summary>
        /// Enum Checkroom for value: checkroom
        /// </summary>
        [EnumMember(Value = "checkroom")]
        Checkroom = 1176,
        /// <summary>
        /// Enum Church for value: church
        /// </summary>
        [EnumMember(Value = "church")]
        Church = 1177,
        /// <summary>
        /// Enum Circle for value: circle
        /// </summary>
        [EnumMember(Value = "circle")]
        Circle = 1178,
        /// <summary>
        /// Enum Circlenotifications for value: circle_notifications
        /// </summary>
        [EnumMember(Value = "circle_notifications")]
        Circlenotifications = 1179,
        /// <summary>
        /// Enum Cleanhands for value: clean_hands
        /// </summary>
        [EnumMember(Value = "clean_hands")]
        Cleanhands = 1180,
        /// <summary>
        /// Enum Cleaningservices for value: cleaning_services
        /// </summary>
        [EnumMember(Value = "cleaning_services")]
        Cleaningservices = 1181,
        /// <summary>
        /// Enum Closefullscreen for value: close_fullscreen
        /// </summary>
        [EnumMember(Value = "close_fullscreen")]
        Closefullscreen = 1182,
        /// <summary>
        /// Enum Closedcaptiondisabled for value: closed_caption_disabled
        /// </summary>
        [EnumMember(Value = "closed_caption_disabled")]
        Closedcaptiondisabled = 1183,
        /// <summary>
        /// Enum Closedcaptionoff for value: closed_caption_off
        /// </summary>
        [EnumMember(Value = "closed_caption_off")]
        Closedcaptionoff = 1184,
        /// <summary>
        /// Enum Cloudsync for value: cloud_sync
        /// </summary>
        [EnumMember(Value = "cloud_sync")]
        Cloudsync = 1185,
        /// <summary>
        /// Enum Co2 for value: co2
        /// </summary>
        [EnumMember(Value = "co2")]
        Co2 = 1186,
        /// <summary>
        /// Enum Copresent for value: co_present
        /// </summary>
        [EnumMember(Value = "co_present")]
        Copresent = 1187,
        /// <summary>
        /// Enum Codeoff for value: code_off
        /// </summary>
        [EnumMember(Value = "code_off")]
        Codeoff = 1188,
        /// <summary>
        /// Enum Coffee for value: coffee
        /// </summary>
        [EnumMember(Value = "coffee")]
        Coffee = 1189,
        /// <summary>
        /// Enum Coffeemaker for value: coffee_maker
        /// </summary>
        [EnumMember(Value = "coffee_maker")]
        Coffeemaker = 1190,
        /// <summary>
        /// Enum Commentbank for value: comment_bank
        /// </summary>
        [EnumMember(Value = "comment_bank")]
        Commentbank = 1191,
        /// <summary>
        /// Enum Commentsdisabled for value: comments_disabled
        /// </summary>
        [EnumMember(Value = "comments_disabled")]
        Commentsdisabled = 1192,
        /// <summary>
        /// Enum Commit for value: commit
        /// </summary>
        [EnumMember(Value = "commit")]
        Commit = 1193,
        /// <summary>
        /// Enum Commute for value: commute
        /// </summary>
        [EnumMember(Value = "commute")]
        Commute = 1194,
        /// <summary>
        /// Enum Compasscalibration for value: compass_calibration
        /// </summary>
        [EnumMember(Value = "compass_calibration")]
        Compasscalibration = 1195,
        /// <summary>
        /// Enum Compost for value: compost
        /// </summary>
        [EnumMember(Value = "compost")]
        Compost = 1196,
        /// <summary>
        /// Enum Compress for value: compress
        /// </summary>
        [EnumMember(Value = "compress")]
        Compress = 1197,
        /// <summary>
        /// Enum Confirmationnum for value: confirmation_num
        /// </summary>
        [EnumMember(Value = "confirmation_num")]
        Confirmationnum = 1198,
        /// <summary>
        /// Enum Connectwithoutcontact for value: connect_without_contact
        /// </summary>
        [EnumMember(Value = "connect_without_contact")]
        Connectwithoutcontact = 1199,
        /// <summary>
        /// Enum Connectedtv for value: connected_tv
        /// </summary>
        [EnumMember(Value = "connected_tv")]
        Connectedtv = 1200,
        /// <summary>
        /// Enum Connectingairports for value: connecting_airports
        /// </summary>
        [EnumMember(Value = "connecting_airports")]
        Connectingairports = 1201,
        /// <summary>
        /// Enum Construction for value: construction
        /// </summary>
        [EnumMember(Value = "construction")]
        Construction = 1202,
        /// <summary>
        /// Enum Contactemergency for value: contact_emergency
        /// </summary>
        [EnumMember(Value = "contact_emergency")]
        Contactemergency = 1203,
        /// <summary>
        /// Enum Contactpage for value: contact_page
        /// </summary>
        [EnumMember(Value = "contact_page")]
        Contactpage = 1204,
        /// <summary>
        /// Enum Contactsupport for value: contact_support
        /// </summary>
        [EnumMember(Value = "contact_support")]
        Contactsupport = 1205,
        /// <summary>
        /// Enum Contactless for value: contactless
        /// </summary>
        [EnumMember(Value = "contactless")]
        Contactless = 1206,
        /// <summary>
        /// Enum Contentpastego for value: content_paste_go
        /// </summary>
        [EnumMember(Value = "content_paste_go")]
        Contentpastego = 1207,
        /// <summary>
        /// Enum Contentpasteoff for value: content_paste_off
        /// </summary>
        [EnumMember(Value = "content_paste_off")]
        Contentpasteoff = 1208,
        /// <summary>
        /// Enum Contentpastesearch for value: content_paste_search
        /// </summary>
        [EnumMember(Value = "content_paste_search")]
        Contentpastesearch = 1209,
        /// <summary>
        /// Enum Contrast for value: contrast
        /// </summary>
        [EnumMember(Value = "contrast")]
        Contrast = 1210,
        /// <summary>
        /// Enum Controlcamera for value: control_camera
        /// </summary>
        [EnumMember(Value = "control_camera")]
        Controlcamera = 1211,
        /// <summary>
        /// Enum Cookie for value: cookie
        /// </summary>
        [EnumMember(Value = "cookie")]
        Cookie = 1212,
        /// <summary>
        /// Enum Copy for value: copy
        /// </summary>
        [EnumMember(Value = "copy")]
        Copy = 1213,
        /// <summary>
        /// Enum Copyall for value: copy_all
        /// </summary>
        [EnumMember(Value = "copy_all")]
        Copyall = 1214,
        /// <summary>
        /// Enum Coronavirus for value: coronavirus
        /// </summary>
        [EnumMember(Value = "coronavirus")]
        Coronavirus = 1215,
        /// <summary>
        /// Enum Corporatefare for value: corporate_fare
        /// </summary>
        [EnumMember(Value = "corporate_fare")]
        Corporatefare = 1216,
        /// <summary>
        /// Enum Cottage for value: cottage
        /// </summary>
        [EnumMember(Value = "cottage")]
        Cottage = 1217,
        /// <summary>
        /// Enum Countertops for value: countertops
        /// </summary>
        [EnumMember(Value = "countertops")]
        Countertops = 1218,
        /// <summary>
        /// Enum Creditcardoff for value: credit_card_off
        /// </summary>
        [EnumMember(Value = "credit_card_off")]
        Creditcardoff = 1219,
        /// <summary>
        /// Enum Creditscore for value: credit_score
        /// </summary>
        [EnumMember(Value = "credit_score")]
        Creditscore = 1220,
        /// <summary>
        /// Enum Crib for value: crib
        /// </summary>
        [EnumMember(Value = "crib")]
        Crib = 1221,
        /// <summary>
        /// Enum Crisisalert for value: crisis_alert
        /// </summary>
        [EnumMember(Value = "crisis_alert")]
        Crisisalert = 1222,
        /// <summary>
        /// Enum Crueltyfree for value: cruelty_free
        /// </summary>
        [EnumMember(Value = "cruelty_free")]
        Crueltyfree = 1223,
        /// <summary>
        /// Enum Css for value: css
        /// </summary>
        [EnumMember(Value = "css")]
        Css = 1224,
        /// <summary>
        /// Enum Currencybitcoin for value: currency_bitcoin
        /// </summary>
        [EnumMember(Value = "currency_bitcoin")]
        Currencybitcoin = 1225,
        /// <summary>
        /// Enum Currencyexchange for value: currency_exchange
        /// </summary>
        [EnumMember(Value = "currency_exchange")]
        Currencyexchange = 1226,
        /// <summary>
        /// Enum Currencyfranc for value: currency_franc
        /// </summary>
        [EnumMember(Value = "currency_franc")]
        Currencyfranc = 1227,
        /// <summary>
        /// Enum Currencylira for value: currency_lira
        /// </summary>
        [EnumMember(Value = "currency_lira")]
        Currencylira = 1228,
        /// <summary>
        /// Enum Currencypound for value: currency_pound
        /// </summary>
        [EnumMember(Value = "currency_pound")]
        Currencypound = 1229,
        /// <summary>
        /// Enum Currencyruble for value: currency_ruble
        /// </summary>
        [EnumMember(Value = "currency_ruble")]
        Currencyruble = 1230,
        /// <summary>
        /// Enum Currencyrupee for value: currency_rupee
        /// </summary>
        [EnumMember(Value = "currency_rupee")]
        Currencyrupee = 1231,
        /// <summary>
        /// Enum Currencyyen for value: currency_yen
        /// </summary>
        [EnumMember(Value = "currency_yen")]
        Currencyyen = 1232,
        /// <summary>
        /// Enum Currencyyuan for value: currency_yuan
        /// </summary>
        [EnumMember(Value = "currency_yuan")]
        Currencyyuan = 1233,
        /// <summary>
        /// Enum Curtains for value: curtains
        /// </summary>
        [EnumMember(Value = "curtains")]
        Curtains = 1234,
        /// <summary>
        /// Enum Curtainsclosed for value: curtains_closed
        /// </summary>
        [EnumMember(Value = "curtains_closed")]
        Curtainsclosed = 1235,
        /// <summary>
        /// Enum Cut for value: cut
        /// </summary>
        [EnumMember(Value = "cut")]
        Cut = 1236,
        /// <summary>
        /// Enum Cyclone for value: cyclone
        /// </summary>
        [EnumMember(Value = "cyclone")]
        Cyclone = 1237,
        /// <summary>
        /// Enum Dangerous for value: dangerous
        /// </summary>
        [EnumMember(Value = "dangerous")]
        Dangerous = 1238,
        /// <summary>
        /// Enum Darkmode for value: dark_mode
        /// </summary>
        [EnumMember(Value = "dark_mode")]
        Darkmode = 1239,
        /// <summary>
        /// Enum Dashboardcustomize for value: dashboard_customize
        /// </summary>
        [EnumMember(Value = "dashboard_customize")]
        Dashboardcustomize = 1240,
        /// <summary>
        /// Enum Dataarray for value: data_array
        /// </summary>
        [EnumMember(Value = "data_array")]
        Dataarray = 1241,
        /// <summary>
        /// Enum Dataexploration for value: data_exploration
        /// </summary>
        [EnumMember(Value = "data_exploration")]
        Dataexploration = 1242,
        /// <summary>
        /// Enum Dataobject for value: data_object
        /// </summary>
        [EnumMember(Value = "data_object")]
        Dataobject = 1243,
        /// <summary>
        /// Enum Datasaveroff for value: data_saver_off
        /// </summary>
        [EnumMember(Value = "data_saver_off")]
        Datasaveroff = 1244,
        /// <summary>
        /// Enum Datasaveron for value: data_saver_on
        /// </summary>
        [EnumMember(Value = "data_saver_on")]
        Datasaveron = 1245,
        /// <summary>
        /// Enum Datathresholding for value: data_thresholding
        /// </summary>
        [EnumMember(Value = "data_thresholding")]
        Datathresholding = 1246,
        /// <summary>
        /// Enum Dataset for value: dataset
        /// </summary>
        [EnumMember(Value = "dataset")]
        Dataset = 1247,
        /// <summary>
        /// Enum Datasetlinked for value: dataset_linked
        /// </summary>
        [EnumMember(Value = "dataset_linked")]
        Datasetlinked = 1248,
        /// <summary>
        /// Enum Deblur for value: deblur
        /// </summary>
        [EnumMember(Value = "deblur")]
        Deblur = 1249,
        /// <summary>
        /// Enum Deck for value: deck
        /// </summary>
        [EnumMember(Value = "deck")]
        Deck = 1250,
        /// <summary>
        /// Enum Deliverydining for value: delivery_dining
        /// </summary>
        [EnumMember(Value = "delivery_dining")]
        Deliverydining = 1251,
        /// <summary>
        /// Enum Densitylarge for value: density_large
        /// </summary>
        [EnumMember(Value = "density_large")]
        Densitylarge = 1252,
        /// <summary>
        /// Enum Densitymedium for value: density_medium
        /// </summary>
        [EnumMember(Value = "density_medium")]
        Densitymedium = 1253,
        /// <summary>
        /// Enum Densitysmall for value: density_small
        /// </summary>
        [EnumMember(Value = "density_small")]
        Densitysmall = 1254,
        /// <summary>
        /// Enum Departureboard for value: departure_board
        /// </summary>
        [EnumMember(Value = "departure_board")]
        Departureboard = 1255,
        /// <summary>
        /// Enum Deselect for value: deselect
        /// </summary>
        [EnumMember(Value = "deselect")]
        Deselect = 1256,
        /// <summary>
        /// Enum Designservices for value: design_services
        /// </summary>
        [EnumMember(Value = "design_services")]
        Designservices = 1257,
        /// <summary>
        /// Enum Desk for value: desk
        /// </summary>
        [EnumMember(Value = "desk")]
        Desk = 1258,
        /// <summary>
        /// Enum Desktopaccessdisabled for value: desktop_access_disabled
        /// </summary>
        [EnumMember(Value = "desktop_access_disabled")]
        Desktopaccessdisabled = 1259,
        /// <summary>
        /// Enum Developerboardoff for value: developer_board_off
        /// </summary>
        [EnumMember(Value = "developer_board_off")]
        Developerboardoff = 1260,
        /// <summary>
        /// Enum Devicethermostat for value: device_thermostat
        /// </summary>
        [EnumMember(Value = "device_thermostat")]
        Devicethermostat = 1261,
        /// <summary>
        /// Enum Deviceunknown for value: device_unknown
        /// </summary>
        [EnumMember(Value = "device_unknown")]
        Deviceunknown = 1262,
        /// <summary>
        /// Enum Devicesfold for value: devices_fold
        /// </summary>
        [EnumMember(Value = "devices_fold")]
        Devicesfold = 1263,
        /// <summary>
        /// Enum Diamond for value: diamond
        /// </summary>
        [EnumMember(Value = "diamond")]
        Diamond = 1264,
        /// <summary>
        /// Enum Difference for value: difference
        /// </summary>
        [EnumMember(Value = "difference")]
        Difference = 1265,
        /// <summary>
        /// Enum Dining for value: dining
        /// </summary>
        [EnumMember(Value = "dining")]
        Dining = 1266,
        /// <summary>
        /// Enum Dinnerdining for value: dinner_dining
        /// </summary>
        [EnumMember(Value = "dinner_dining")]
        Dinnerdining = 1267,
        /// <summary>
        /// Enum Directionsboatfilled for value: directions_boat_filled
        /// </summary>
        [EnumMember(Value = "directions_boat_filled")]
        Directionsboatfilled = 1268,
        /// <summary>
        /// Enum Directionsbusfilled for value: directions_bus_filled
        /// </summary>
        [EnumMember(Value = "directions_bus_filled")]
        Directionsbusfilled = 1269,
        /// <summary>
        /// Enum Directionscarfilled for value: directions_car_filled
        /// </summary>
        [EnumMember(Value = "directions_car_filled")]
        Directionscarfilled = 1270,
        /// <summary>
        /// Enum Directionsferry for value: directions_ferry
        /// </summary>
        [EnumMember(Value = "directions_ferry")]
        Directionsferry = 1271,
        /// <summary>
        /// Enum Directionsoff for value: directions_off
        /// </summary>
        [EnumMember(Value = "directions_off")]
        Directionsoff = 1272,
        /// <summary>
        /// Enum Directionsrailwayfilled for value: directions_railway_filled
        /// </summary>
        [EnumMember(Value = "directions_railway_filled")]
        Directionsrailwayfilled = 1273,
        /// <summary>
        /// Enum Directionssubwayfilled for value: directions_subway_filled
        /// </summary>
        [EnumMember(Value = "directions_subway_filled")]
        Directionssubwayfilled = 1274,
        /// <summary>
        /// Enum Directionstrain for value: directions_train
        /// </summary>
        [EnumMember(Value = "directions_train")]
        Directionstrain = 1275,
        /// <summary>
        /// Enum Directionstransitfilled for value: directions_transit_filled
        /// </summary>
        [EnumMember(Value = "directions_transit_filled")]
        Directionstransitfilled = 1276,
        /// <summary>
        /// Enum Dirtylens for value: dirty_lens
        /// </summary>
        [EnumMember(Value = "dirty_lens")]
        Dirtylens = 1277,
        /// <summary>
        /// Enum Disabledbydefault for value: disabled_by_default
        /// </summary>
        [EnumMember(Value = "disabled_by_default")]
        Disabledbydefault = 1278,
        /// <summary>
        /// Enum Disabledvisible for value: disabled_visible
        /// </summary>
        [EnumMember(Value = "disabled_visible")]
        Disabledvisible = 1279,
        /// <summary>
        /// Enum Discord for value: discord
        /// </summary>
        [EnumMember(Value = "discord")]
        Discord = 1280,
        /// <summary>
        /// Enum Discount for value: discount
        /// </summary>
        [EnumMember(Value = "discount")]
        Discount = 1281,
        /// <summary>
        /// Enum Displaysettings for value: display_settings
        /// </summary>
        [EnumMember(Value = "display_settings")]
        Displaysettings = 1282,
        /// <summary>
        /// Enum Diversity1 for value: diversity_1
        /// </summary>
        [EnumMember(Value = "diversity_1")]
        Diversity1 = 1283,
        /// <summary>
        /// Enum Diversity2 for value: diversity_2
        /// </summary>
        [EnumMember(Value = "diversity_2")]
        Diversity2 = 1284,
        /// <summary>
        /// Enum Diversity3 for value: diversity_3
        /// </summary>
        [EnumMember(Value = "diversity_3")]
        Diversity3 = 1285,
        /// <summary>
        /// Enum Dndforwardslash for value: dnd_forwardslash
        /// </summary>
        [EnumMember(Value = "dnd_forwardslash")]
        Dndforwardslash = 1286,
        /// <summary>
        /// Enum Dodisturb for value: do_disturb
        /// </summary>
        [EnumMember(Value = "do_disturb")]
        Dodisturb = 1287,
        /// <summary>
        /// Enum Dodisturbalt for value: do_disturb_alt
        /// </summary>
        [EnumMember(Value = "do_disturb_alt")]
        Dodisturbalt = 1288,
        /// <summary>
        /// Enum Dodisturboff for value: do_disturb_off
        /// </summary>
        [EnumMember(Value = "do_disturb_off")]
        Dodisturboff = 1289,
        /// <summary>
        /// Enum Dodisturbon for value: do_disturb_on
        /// </summary>
        [EnumMember(Value = "do_disturb_on")]
        Dodisturbon = 1290,
        /// <summary>
        /// Enum Donotdisturbontotalsilence for value: do_not_disturb_on_total_silence
        /// </summary>
        [EnumMember(Value = "do_not_disturb_on_total_silence")]
        Donotdisturbontotalsilence = 1291,
        /// <summary>
        /// Enum Donotstep for value: do_not_step
        /// </summary>
        [EnumMember(Value = "do_not_step")]
        Donotstep = 1292,
        /// <summary>
        /// Enum Donottouch for value: do_not_touch
        /// </summary>
        [EnumMember(Value = "do_not_touch")]
        Donottouch = 1293,
        /// <summary>
        /// Enum Documentscanner for value: document_scanner
        /// </summary>
        [EnumMember(Value = "document_scanner")]
        Documentscanner = 1294,
        /// <summary>
        /// Enum Domainadd for value: domain_add
        /// </summary>
        [EnumMember(Value = "domain_add")]
        Domainadd = 1295,
        /// <summary>
        /// Enum Domaindisabled for value: domain_disabled
        /// </summary>
        [EnumMember(Value = "domain_disabled")]
        Domaindisabled = 1296,
        /// <summary>
        /// Enum Domainverification for value: domain_verification
        /// </summary>
        [EnumMember(Value = "domain_verification")]
        Domainverification = 1297,
        /// <summary>
        /// Enum Doneoutline for value: done_outline
        /// </summary>
        [EnumMember(Value = "done_outline")]
        Doneoutline = 1298,
        /// <summary>
        /// Enum Doorback for value: door_back
        /// </summary>
        [EnumMember(Value = "door_back")]
        Doorback = 1299,
        /// <summary>
        /// Enum Doorfront for value: door_front
        /// </summary>
        [EnumMember(Value = "door_front")]
        Doorfront = 1300,
        /// <summary>
        /// Enum Doorsliding for value: door_sliding
        /// </summary>
        [EnumMember(Value = "door_sliding")]
        Doorsliding = 1301,
        /// <summary>
        /// Enum Doorbell for value: doorbell
        /// </summary>
        [EnumMember(Value = "doorbell")]
        Doorbell = 1302,
        /// <summary>
        /// Enum Doublearrow for value: double_arrow
        /// </summary>
        [EnumMember(Value = "double_arrow")]
        Doublearrow = 1303,
        /// <summary>
        /// Enum Downhillskiing for value: downhill_skiing
        /// </summary>
        [EnumMember(Value = "downhill_skiing")]
        Downhillskiing = 1304,
        /// <summary>
        /// Enum Download for value: download
        /// </summary>
        [EnumMember(Value = "download")]
        Download = 1305,
        /// <summary>
        /// Enum Downloaddone for value: download_done
        /// </summary>
        [EnumMember(Value = "download_done")]
        Downloaddone = 1306,
        /// <summary>
        /// Enum Downloadforoffline for value: download_for_offline
        /// </summary>
        [EnumMember(Value = "download_for_offline")]
        Downloadforoffline = 1307,
        /// <summary>
        /// Enum Downloading for value: downloading
        /// </summary>
        [EnumMember(Value = "downloading")]
        Downloading = 1308,
        /// <summary>
        /// Enum Dragindicator for value: drag_indicator
        /// </summary>
        [EnumMember(Value = "drag_indicator")]
        Dragindicator = 1309,
        /// <summary>
        /// Enum Draw for value: draw
        /// </summary>
        [EnumMember(Value = "draw")]
        Draw = 1310,
        /// <summary>
        /// Enum Drivefilemove for value: drive_file_move
        /// </summary>
        [EnumMember(Value = "drive_file_move")]
        Drivefilemove = 1311,
        /// <summary>
        /// Enum Drivefilemovertl for value: drive_file_move_rtl
        /// </summary>
        [EnumMember(Value = "drive_file_move_rtl")]
        Drivefilemovertl = 1312,
        /// <summary>
        /// Enum Drivefilerenameoutline for value: drive_file_rename_outline
        /// </summary>
        [EnumMember(Value = "drive_file_rename_outline")]
        Drivefilerenameoutline = 1313,
        /// <summary>
        /// Enum Drivefolderupload for value: drive_folder_upload
        /// </summary>
        [EnumMember(Value = "drive_folder_upload")]
        Drivefolderupload = 1314,
        /// <summary>
        /// Enum Dry for value: dry
        /// </summary>
        [EnumMember(Value = "dry")]
        Dry = 1315,
        /// <summary>
        /// Enum Drycleaning for value: dry_cleaning
        /// </summary>
        [EnumMember(Value = "dry_cleaning")]
        Drycleaning = 1316,
        /// <summary>
        /// Enum Duo for value: duo
        /// </summary>
        [EnumMember(Value = "duo")]
        Duo = 1317,
        /// <summary>
        /// Enum Dynamicfeed for value: dynamic_feed
        /// </summary>
        [EnumMember(Value = "dynamic_feed")]
        Dynamicfeed = 1318,
        /// <summary>
        /// Enum Dynamicform for value: dynamic_form
        /// </summary>
        [EnumMember(Value = "dynamic_form")]
        Dynamicform = 1319,
        /// <summary>
        /// Enum Emobiledata for value: e_mobiledata
        /// </summary>
        [EnumMember(Value = "e_mobiledata")]
        Emobiledata = 1320,
        /// <summary>
        /// Enum Earbuds for value: earbuds
        /// </summary>
        [EnumMember(Value = "earbuds")]
        Earbuds = 1321,
        /// <summary>
        /// Enum Earbudsbattery for value: earbuds_battery
        /// </summary>
        [EnumMember(Value = "earbuds_battery")]
        Earbudsbattery = 1322,
        /// <summary>
        /// Enum East for value: east
        /// </summary>
        [EnumMember(Value = "east")]
        East = 1323,
        /// <summary>
        /// Enum Eco for value: eco
        /// </summary>
        [EnumMember(Value = "eco")]
        Eco = 1324,
        /// <summary>
        /// Enum Edgesensorhigh for value: edgesensor_high
        /// </summary>
        [EnumMember(Value = "edgesensor_high")]
        Edgesensorhigh = 1325,
        /// <summary>
        /// Enum Edgesensorlow for value: edgesensor_low
        /// </summary>
        [EnumMember(Value = "edgesensor_low")]
        Edgesensorlow = 1326,
        /// <summary>
        /// Enum Editattributes for value: edit_attributes
        /// </summary>
        [EnumMember(Value = "edit_attributes")]
        Editattributes = 1327,
        /// <summary>
        /// Enum Editcalendar for value: edit_calendar
        /// </summary>
        [EnumMember(Value = "edit_calendar")]
        Editcalendar = 1328,
        /// <summary>
        /// Enum Editlocationalt for value: edit_location_alt
        /// </summary>
        [EnumMember(Value = "edit_location_alt")]
        Editlocationalt = 1329,
        /// <summary>
        /// Enum Editnote for value: edit_note
        /// </summary>
        [EnumMember(Value = "edit_note")]
        Editnote = 1330,
        /// <summary>
        /// Enum Editnotifications for value: edit_notifications
        /// </summary>
        [EnumMember(Value = "edit_notifications")]
        Editnotifications = 1331,
        /// <summary>
        /// Enum Editoff for value: edit_off
        /// </summary>
        [EnumMember(Value = "edit_off")]
        Editoff = 1332,
        /// <summary>
        /// Enum Editroad for value: edit_road
        /// </summary>
        [EnumMember(Value = "edit_road")]
        Editroad = 1333,
        /// <summary>
        /// Enum Egg for value: egg
        /// </summary>
        [EnumMember(Value = "egg")]
        Egg = 1334,
        /// <summary>
        /// Enum Eggalt for value: egg_alt
        /// </summary>
        [EnumMember(Value = "egg_alt")]
        Eggalt = 1335,
        /// <summary>
        /// Enum Elderly for value: elderly
        /// </summary>
        [EnumMember(Value = "elderly")]
        Elderly = 1336,
        /// <summary>
        /// Enum Elderlywoman for value: elderly_woman
        /// </summary>
        [EnumMember(Value = "elderly_woman")]
        Elderlywoman = 1337,
        /// <summary>
        /// Enum Electricbike for value: electric_bike
        /// </summary>
        [EnumMember(Value = "electric_bike")]
        Electricbike = 1338,
        /// <summary>
        /// Enum Electricbolt for value: electric_bolt
        /// </summary>
        [EnumMember(Value = "electric_bolt")]
        Electricbolt = 1339,
        /// <summary>
        /// Enum Electriccar for value: electric_car
        /// </summary>
        [EnumMember(Value = "electric_car")]
        Electriccar = 1340,
        /// <summary>
        /// Enum Electricmeter for value: electric_meter
        /// </summary>
        [EnumMember(Value = "electric_meter")]
        Electricmeter = 1341,
        /// <summary>
        /// Enum Electricmoped for value: electric_moped
        /// </summary>
        [EnumMember(Value = "electric_moped")]
        Electricmoped = 1342,
        /// <summary>
        /// Enum Electricrickshaw for value: electric_rickshaw
        /// </summary>
        [EnumMember(Value = "electric_rickshaw")]
        Electricrickshaw = 1343,
        /// <summary>
        /// Enum Electricscooter for value: electric_scooter
        /// </summary>
        [EnumMember(Value = "electric_scooter")]
        Electricscooter = 1344,
        /// <summary>
        /// Enum Electricalservices for value: electrical_services
        /// </summary>
        [EnumMember(Value = "electrical_services")]
        Electricalservices = 1345,
        /// <summary>
        /// Enum Elevator for value: elevator
        /// </summary>
        [EnumMember(Value = "elevator")]
        Elevator = 1346,
        /// <summary>
        /// Enum Emergency for value: emergency
        /// </summary>
        [EnumMember(Value = "emergency")]
        Emergency = 1347,
        /// <summary>
        /// Enum Emergencyrecording for value: emergency_recording
        /// </summary>
        [EnumMember(Value = "emergency_recording")]
        Emergencyrecording = 1348,
        /// <summary>
        /// Enum Emergencyshare for value: emergency_share
        /// </summary>
        [EnumMember(Value = "emergency_share")]
        Emergencyshare = 1349,
        /// <summary>
        /// Enum Emojiemotions for value: emoji_emotions
        /// </summary>
        [EnumMember(Value = "emoji_emotions")]
        Emojiemotions = 1350,
        /// <summary>
        /// Enum Emojievents for value: emoji_events
        /// </summary>
        [EnumMember(Value = "emoji_events")]
        Emojievents = 1351,
        /// <summary>
        /// Enum Emojiflags for value: emoji_flags
        /// </summary>
        [EnumMember(Value = "emoji_flags")]
        Emojiflags = 1352,
        /// <summary>
        /// Enum Emojifoodbeverage for value: emoji_food_beverage
        /// </summary>
        [EnumMember(Value = "emoji_food_beverage")]
        Emojifoodbeverage = 1353,
        /// <summary>
        /// Enum Emojinature for value: emoji_nature
        /// </summary>
        [EnumMember(Value = "emoji_nature")]
        Emojinature = 1354,
        /// <summary>
        /// Enum Emojiobjects for value: emoji_objects
        /// </summary>
        [EnumMember(Value = "emoji_objects")]
        Emojiobjects = 1355,
        /// <summary>
        /// Enum Emojipeople for value: emoji_people
        /// </summary>
        [EnumMember(Value = "emoji_people")]
        Emojipeople = 1356,
        /// <summary>
        /// Enum Emojisymbols for value: emoji_symbols
        /// </summary>
        [EnumMember(Value = "emoji_symbols")]
        Emojisymbols = 1357,
        /// <summary>
        /// Enum Emojitransportation for value: emoji_transportation
        /// </summary>
        [EnumMember(Value = "emoji_transportation")]
        Emojitransportation = 1358,
        /// <summary>
        /// Enum Energysavingsleaf for value: energy_savings_leaf
        /// </summary>
        [EnumMember(Value = "energy_savings_leaf")]
        Energysavingsleaf = 1359,
        /// <summary>
        /// Enum Engineering for value: engineering
        /// </summary>
        [EnumMember(Value = "engineering")]
        Engineering = 1360,
        /// <summary>
        /// Enum Enhancephototranslate for value: enhance_photo_translate
        /// </summary>
        [EnumMember(Value = "enhance_photo_translate")]
        Enhancephototranslate = 1361,
        /// <summary>
        /// Enum Escalator for value: escalator
        /// </summary>
        [EnumMember(Value = "escalator")]
        Escalator = 1362,
        /// <summary>
        /// Enum Escalatorwarning for value: escalator_warning
        /// </summary>
        [EnumMember(Value = "escalator_warning")]
        Escalatorwarning = 1363,
        /// <summary>
        /// Enum Euro for value: euro
        /// </summary>
        [EnumMember(Value = "euro")]
        Euro = 1364,
        /// <summary>
        /// Enum Eventrepeat for value: event_repeat
        /// </summary>
        [EnumMember(Value = "event_repeat")]
        Eventrepeat = 1365,
        /// <summary>
        /// Enum Expand for value: expand
        /// </summary>
        [EnumMember(Value = "expand")]
        Expand = 1366,
        /// <summary>
        /// Enum Expandcircledown for value: expand_circle_down
        /// </summary>
        [EnumMember(Value = "expand_circle_down")]
        Expandcircledown = 1367,
        /// <summary>
        /// Enum Exploreoff for value: explore_off
        /// </summary>
        [EnumMember(Value = "explore_off")]
        Exploreoff = 1368,
        /// <summary>
        /// Enum Exposureminus1 for value: exposure_minus_1
        /// </summary>
        [EnumMember(Value = "exposure_minus_1")]
        Exposureminus1 = 1369,
        /// <summary>
        /// Enum Exposureminus2 for value: exposure_minus_2
        /// </summary>
        [EnumMember(Value = "exposure_minus_2")]
        Exposureminus2 = 1370,
        /// <summary>
        /// Enum Extensionoff for value: extension_off
        /// </summary>
        [EnumMember(Value = "extension_off")]
        Extensionoff = 1371,
        /// <summary>
        /// Enum Face2 for value: face_2
        /// </summary>
        [EnumMember(Value = "face_2")]
        Face2 = 1372,
        /// <summary>
        /// Enum Face3 for value: face_3
        /// </summary>
        [EnumMember(Value = "face_3")]
        Face3 = 1373,
        /// <summary>
        /// Enum Face4 for value: face_4
        /// </summary>
        [EnumMember(Value = "face_4")]
        Face4 = 1374,
        /// <summary>
        /// Enum Face5 for value: face_5
        /// </summary>
        [EnumMember(Value = "face_5")]
        Face5 = 1375,
        /// <summary>
        /// Enum Face6 for value: face_6
        /// </summary>
        [EnumMember(Value = "face_6")]
        Face6 = 1376,
        /// <summary>
        /// Enum Faceretouchingnatural for value: face_retouching_natural
        /// </summary>
        [EnumMember(Value = "face_retouching_natural")]
        Faceretouchingnatural = 1377,
        /// <summary>
        /// Enum Faceretouchingoff for value: face_retouching_off
        /// </summary>
        [EnumMember(Value = "face_retouching_off")]
        Faceretouchingoff = 1378,
        /// <summary>
        /// Enum Faceunlock for value: face_unlock
        /// </summary>
        [EnumMember(Value = "face_unlock")]
        Faceunlock = 1379,
        /// <summary>
        /// Enum Facebook for value: facebook
        /// </summary>
        [EnumMember(Value = "facebook")]
        Facebook = 1380,
        /// <summary>
        /// Enum Factcheck for value: fact_check
        /// </summary>
        [EnumMember(Value = "fact_check")]
        Factcheck = 1381,
        /// <summary>
        /// Enum Factory for value: factory
        /// </summary>
        [EnumMember(Value = "factory")]
        Factory = 1382,
        /// <summary>
        /// Enum Familyrestroom for value: family_restroom
        /// </summary>
        [EnumMember(Value = "family_restroom")]
        Familyrestroom = 1383,
        /// <summary>
        /// Enum Fastfood for value: fastfood
        /// </summary>
        [EnumMember(Value = "fastfood")]
        Fastfood = 1384,
        /// <summary>
        /// Enum Favoriteoutline for value: favorite_outline
        /// </summary>
        [EnumMember(Value = "favorite_outline")]
        Favoriteoutline = 1385,
        /// <summary>
        /// Enum Fax for value: fax
        /// </summary>
        [EnumMember(Value = "fax")]
        Fax = 1386,
        /// <summary>
        /// Enum Feed for value: feed
        /// </summary>
        [EnumMember(Value = "feed")]
        Feed = 1387,
        /// <summary>
        /// Enum Female for value: female
        /// </summary>
        [EnumMember(Value = "female")]
        Female = 1388,
        /// <summary>
        /// Enum Fence for value: fence
        /// </summary>
        [EnumMember(Value = "fence")]
        Fence = 1389,
        /// <summary>
        /// Enum Festival for value: festival
        /// </summary>
        [EnumMember(Value = "festival")]
        Festival = 1390,
        /// <summary>
        /// Enum Filecopy for value: file_copy
        /// </summary>
        [EnumMember(Value = "file_copy")]
        Filecopy = 1391,
        /// <summary>
        /// Enum Filedownloaddone for value: file_download_done
        /// </summary>
        [EnumMember(Value = "file_download_done")]
        Filedownloaddone = 1392,
        /// <summary>
        /// Enum Filedownloadoff for value: file_download_off
        /// </summary>
        [EnumMember(Value = "file_download_off")]
        Filedownloadoff = 1393,
        /// <summary>
        /// Enum Fileopen for value: file_open
        /// </summary>
        [EnumMember(Value = "file_open")]
        Fileopen = 1394,
        /// <summary>
        /// Enum Filepresent for value: file_present
        /// </summary>
        [EnumMember(Value = "file_present")]
        Filepresent = 1395,
        /// <summary>
        /// Enum Filteralt for value: filter_alt
        /// </summary>
        [EnumMember(Value = "filter_alt")]
        Filteralt = 1396,
        /// <summary>
        /// Enum Filteraltoff for value: filter_alt_off
        /// </summary>
        [EnumMember(Value = "filter_alt_off")]
        Filteraltoff = 1397,
        /// <summary>
        /// Enum Filterlistoff for value: filter_list_off
        /// </summary>
        [EnumMember(Value = "filter_list_off")]
        Filterlistoff = 1398,
        /// <summary>
        /// Enum Fireextinguisher for value: fire_extinguisher
        /// </summary>
        [EnumMember(Value = "fire_extinguisher")]
        Fireextinguisher = 1399,
        /// <summary>
        /// Enum Firehydrantalt for value: fire_hydrant_alt
        /// </summary>
        [EnumMember(Value = "fire_hydrant_alt")]
        Firehydrantalt = 1400,
        /// <summary>
        /// Enum Firetruck for value: fire_truck
        /// </summary>
        [EnumMember(Value = "fire_truck")]
        Firetruck = 1401,
        /// <summary>
        /// Enum Fireplace for value: fireplace
        /// </summary>
        [EnumMember(Value = "fireplace")]
        Fireplace = 1402,
        /// <summary>
        /// Enum Fitscreen for value: fit_screen
        /// </summary>
        [EnumMember(Value = "fit_screen")]
        Fitscreen = 1403,
        /// <summary>
        /// Enum Fitbit for value: fitbit
        /// </summary>
        [EnumMember(Value = "fitbit")]
        Fitbit = 1404,
        /// <summary>
        /// Enum Flagcircle for value: flag_circle
        /// </summary>
        [EnumMember(Value = "flag_circle")]
        Flagcircle = 1405,
        /// <summary>
        /// Enum Flaky for value: flaky
        /// </summary>
        [EnumMember(Value = "flaky")]
        Flaky = 1406,
        /// <summary>
        /// Enum Flashlightoff for value: flashlight_off
        /// </summary>
        [EnumMember(Value = "flashlight_off")]
        Flashlightoff = 1407,
        /// <summary>
        /// Enum Flashlighton for value: flashlight_on
        /// </summary>
        [EnumMember(Value = "flashlight_on")]
        Flashlighton = 1408,
        /// <summary>
        /// Enum Flatware for value: flatware
        /// </summary>
        [EnumMember(Value = "flatware")]
        Flatware = 1409,
        /// <summary>
        /// Enum Flightclass for value: flight_class
        /// </summary>
        [EnumMember(Value = "flight_class")]
        Flightclass = 1410,
        /// <summary>
        /// Enum Flipcameraandroid for value: flip_camera_android
        /// </summary>
        [EnumMember(Value = "flip_camera_android")]
        Flipcameraandroid = 1411,
        /// <summary>
        /// Enum Flipcameraios for value: flip_camera_ios
        /// </summary>
        [EnumMember(Value = "flip_camera_ios")]
        Flipcameraios = 1412,
        /// <summary>
        /// Enum Flood for value: flood
        /// </summary>
        [EnumMember(Value = "flood")]
        Flood = 1413,
        /// <summary>
        /// Enum Flourescent for value: flourescent
        /// </summary>
        [EnumMember(Value = "flourescent")]
        Flourescent = 1414,
        /// <summary>
        /// Enum Fluorescent for value: fluorescent
        /// </summary>
        [EnumMember(Value = "fluorescent")]
        Fluorescent = 1415,
        /// <summary>
        /// Enum Flutterdash for value: flutter_dash
        /// </summary>
        [EnumMember(Value = "flutter_dash")]
        Flutterdash = 1416,
        /// <summary>
        /// Enum Fmdbad for value: fmd_bad
        /// </summary>
        [EnumMember(Value = "fmd_bad")]
        Fmdbad = 1417,
        /// <summary>
        /// Enum Fmdgood for value: fmd_good
        /// </summary>
        [EnumMember(Value = "fmd_good")]
        Fmdgood = 1418,
        /// <summary>
        /// Enum Foldercopy for value: folder_copy
        /// </summary>
        [EnumMember(Value = "folder_copy")]
        Foldercopy = 1419,
        /// <summary>
        /// Enum Folderdelete for value: folder_delete
        /// </summary>
        [EnumMember(Value = "folder_delete")]
        Folderdelete = 1420,
        /// <summary>
        /// Enum Folderoff for value: folder_off
        /// </summary>
        [EnumMember(Value = "folder_off")]
        Folderoff = 1421,
        /// <summary>
        /// Enum Folderzip for value: folder_zip
        /// </summary>
        [EnumMember(Value = "folder_zip")]
        Folderzip = 1422,
        /// <summary>
        /// Enum Followthesigns for value: follow_the_signs
        /// </summary>
        [EnumMember(Value = "follow_the_signs")]
        Followthesigns = 1423,
        /// <summary>
        /// Enum Fontdownloadoff for value: font_download_off
        /// </summary>
        [EnumMember(Value = "font_download_off")]
        Fontdownloadoff = 1424,
        /// <summary>
        /// Enum Foodbank for value: food_bank
        /// </summary>
        [EnumMember(Value = "food_bank")]
        Foodbank = 1425,
        /// <summary>
        /// Enum Forest for value: forest
        /// </summary>
        [EnumMember(Value = "forest")]
        Forest = 1426,
        /// <summary>
        /// Enum Forkleft for value: fork_left
        /// </summary>
        [EnumMember(Value = "fork_left")]
        Forkleft = 1427,
        /// <summary>
        /// Enum Forkright for value: fork_right
        /// </summary>
        [EnumMember(Value = "fork_right")]
        Forkright = 1428,
        /// <summary>
        /// Enum Formatlistnumberedrtl for value: format_list_numbered_rtl
        /// </summary>
        [EnumMember(Value = "format_list_numbered_rtl")]
        Formatlistnumberedrtl = 1429,
        /// <summary>
        /// Enum Formatoverline for value: format_overline
        /// </summary>
        [EnumMember(Value = "format_overline")]
        Formatoverline = 1430,
        /// <summary>
        /// Enum Formatunderline for value: format_underline
        /// </summary>
        [EnumMember(Value = "format_underline")]
        Formatunderline = 1431,
        /// <summary>
        /// Enum Fort for value: fort
        /// </summary>
        [EnumMember(Value = "fort")]
        Fort = 1432,
        /// <summary>
        /// Enum Forwardtoinbox for value: forward_to_inbox
        /// </summary>
        [EnumMember(Value = "forward_to_inbox")]
        Forwardtoinbox = 1433,
        /// <summary>
        /// Enum Foundation for value: foundation
        /// </summary>
        [EnumMember(Value = "foundation")]
        Foundation = 1434,
        /// <summary>
        /// Enum Freecancellation for value: free_cancellation
        /// </summary>
        [EnumMember(Value = "free_cancellation")]
        Freecancellation = 1435,
        /// <summary>
        /// Enum Fronthand for value: front_hand
        /// </summary>
        [EnumMember(Value = "front_hand")]
        Fronthand = 1436,
        /// <summary>
        /// Enum Gmobiledata for value: g_mobiledata
        /// </summary>
        [EnumMember(Value = "g_mobiledata")]
        Gmobiledata = 1437,
        /// <summary>
        /// Enum Garage for value: garage
        /// </summary>
        [EnumMember(Value = "garage")]
        Garage = 1438,
        /// <summary>
        /// Enum Gasmeter for value: gas_meter
        /// </summary>
        [EnumMember(Value = "gas_meter")]
        Gasmeter = 1439,
        /// <summary>
        /// Enum Generatingtokens for value: generating_tokens
        /// </summary>
        [EnumMember(Value = "generating_tokens")]
        Generatingtokens = 1440,
        /// <summary>
        /// Enum Gifbox for value: gif_box
        /// </summary>
        [EnumMember(Value = "gif_box")]
        Gifbox = 1441,
        /// <summary>
        /// Enum Girl for value: girl
        /// </summary>
        [EnumMember(Value = "girl")]
        Girl = 1442,
        /// <summary>
        /// Enum Gite for value: gite
        /// </summary>
        [EnumMember(Value = "gite")]
        Gite = 1443,
        /// <summary>
        /// Enum Gppbad for value: gpp_bad
        /// </summary>
        [EnumMember(Value = "gpp_bad")]
        Gppbad = 1444,
        /// <summary>
        /// Enum Gppgood for value: gpp_good
        /// </summary>
        [EnumMember(Value = "gpp_good")]
        Gppgood = 1445,
        /// <summary>
        /// Enum Gppmaybe for value: gpp_maybe
        /// </summary>
        [EnumMember(Value = "gpp_maybe")]
        Gppmaybe = 1446,
        /// <summary>
        /// Enum Grading for value: grading
        /// </summary>
        [EnumMember(Value = "grading")]
        Grading = 1447,
        /// <summary>
        /// Enum Grass for value: grass
        /// </summary>
        [EnumMember(Value = "grass")]
        Grass = 1448,
        /// <summary>
        /// Enum Grid3x3 for value: grid_3x3
        /// </summary>
        [EnumMember(Value = "grid_3x3")]
        Grid3x3 = 1449,
        /// <summary>
        /// Enum Grid4x4 for value: grid_4x4
        /// </summary>
        [EnumMember(Value = "grid_4x4")]
        Grid4x4 = 1450,
        /// <summary>
        /// Enum Gridgoldenratio for value: grid_goldenratio
        /// </summary>
        [EnumMember(Value = "grid_goldenratio")]
        Gridgoldenratio = 1451,
        /// <summary>
        /// Enum Gridview for value: grid_view
        /// </summary>
        [EnumMember(Value = "grid_view")]
        Gridview = 1452,
        /// <summary>
        /// Enum Groupoff for value: group_off
        /// </summary>
        [EnumMember(Value = "group_off")]
        Groupoff = 1453,
        /// <summary>
        /// Enum Groupremove for value: group_remove
        /// </summary>
        [EnumMember(Value = "group_remove")]
        Groupremove = 1454,
        /// <summary>
        /// Enum Groups for value: groups
        /// </summary>
        [EnumMember(Value = "groups")]
        Groups = 1455,
        /// <summary>
        /// Enum Groups2 for value: groups_2
        /// </summary>
        [EnumMember(Value = "groups_2")]
        Groups2 = 1456,
        /// <summary>
        /// Enum Groups3 for value: groups_3
        /// </summary>
        [EnumMember(Value = "groups_3")]
        Groups3 = 1457,
        /// <summary>
        /// Enum Hmobiledata for value: h_mobiledata
        /// </summary>
        [EnumMember(Value = "h_mobiledata")]
        Hmobiledata = 1458,
        /// <summary>
        /// Enum Hplusmobiledata for value: h_plus_mobiledata
        /// </summary>
        [EnumMember(Value = "h_plus_mobiledata")]
        Hplusmobiledata = 1459,
        /// <summary>
        /// Enum Hail for value: hail
        /// </summary>
        [EnumMember(Value = "hail")]
        Hail = 1460,
        /// <summary>
        /// Enum Handshake for value: handshake
        /// </summary>
        [EnumMember(Value = "handshake")]
        Handshake = 1461,
        /// <summary>
        /// Enum Handyman for value: handyman
        /// </summary>
        [EnumMember(Value = "handyman")]
        Handyman = 1462,
        /// <summary>
        /// Enum Hardware for value: hardware
        /// </summary>
        [EnumMember(Value = "hardware")]
        Hardware = 1463,
        /// <summary>
        /// Enum Hdrauto for value: hdr_auto
        /// </summary>
        [EnumMember(Value = "hdr_auto")]
        Hdrauto = 1464,
        /// <summary>
        /// Enum Hdrautoselect for value: hdr_auto_select
        /// </summary>
        [EnumMember(Value = "hdr_auto_select")]
        Hdrautoselect = 1465,
        /// <summary>
        /// Enum Hdrenhancedselect for value: hdr_enhanced_select
        /// </summary>
        [EnumMember(Value = "hdr_enhanced_select")]
        Hdrenhancedselect = 1466,
        /// <summary>
        /// Enum Hdroffselect for value: hdr_off_select
        /// </summary>
        [EnumMember(Value = "hdr_off_select")]
        Hdroffselect = 1467,
        /// <summary>
        /// Enum Hdronselect for value: hdr_on_select
        /// </summary>
        [EnumMember(Value = "hdr_on_select")]
        Hdronselect = 1468,
        /// <summary>
        /// Enum Hdrplus for value: hdr_plus
        /// </summary>
        [EnumMember(Value = "hdr_plus")]
        Hdrplus = 1469,
        /// <summary>
        /// Enum Headphones for value: headphones
        /// </summary>
        [EnumMember(Value = "headphones")]
        Headphones = 1470,
        /// <summary>
        /// Enum Headphonesbattery for value: headphones_battery
        /// </summary>
        [EnumMember(Value = "headphones_battery")]
        Headphonesbattery = 1471,
        /// <summary>
        /// Enum Headsetoff for value: headset_off
        /// </summary>
        [EnumMember(Value = "headset_off")]
        Headsetoff = 1472,
        /// <summary>
        /// Enum Healthandsafety for value: health_and_safety
        /// </summary>
        [EnumMember(Value = "health_and_safety")]
        Healthandsafety = 1473,
        /// <summary>
        /// Enum Hearingdisabled for value: hearing_disabled
        /// </summary>
        [EnumMember(Value = "hearing_disabled")]
        Hearingdisabled = 1474,
        /// <summary>
        /// Enum Heartbroken for value: heart_broken
        /// </summary>
        [EnumMember(Value = "heart_broken")]
        Heartbroken = 1475,
        /// <summary>
        /// Enum Heatpump for value: heat_pump
        /// </summary>
        [EnumMember(Value = "heat_pump")]
        Heatpump = 1476,
        /// <summary>
        /// Enum Height for value: height
        /// </summary>
        [EnumMember(Value = "height")]
        Height = 1477,
        /// <summary>
        /// Enum Helpcenter for value: help_center
        /// </summary>
        [EnumMember(Value = "help_center")]
        Helpcenter = 1478,
        /// <summary>
        /// Enum Hevc for value: hevc
        /// </summary>
        [EnumMember(Value = "hevc")]
        Hevc = 1479,
        /// <summary>
        /// Enum Hexagon for value: hexagon
        /// </summary>
        [EnumMember(Value = "hexagon")]
        Hexagon = 1480,
        /// <summary>
        /// Enum Hideimage for value: hide_image
        /// </summary>
        [EnumMember(Value = "hide_image")]
        Hideimage = 1481,
        /// <summary>
        /// Enum Hidesource for value: hide_source
        /// </summary>
        [EnumMember(Value = "hide_source")]
        Hidesource = 1482,
        /// <summary>
        /// Enum Highlightalt for value: highlight_alt
        /// </summary>
        [EnumMember(Value = "highlight_alt")]
        Highlightalt = 1483,
        /// <summary>
        /// Enum Highlightremove for value: highlight_remove
        /// </summary>
        [EnumMember(Value = "highlight_remove")]
        Highlightremove = 1484,
        /// <summary>
        /// Enum Hiking for value: hiking
        /// </summary>
        [EnumMember(Value = "hiking")]
        Hiking = 1485,
        /// <summary>
        /// Enum Historyedu for value: history_edu
        /// </summary>
        [EnumMember(Value = "history_edu")]
        Historyedu = 1486,
        /// <summary>
        /// Enum Hive for value: hive
        /// </summary>
        [EnumMember(Value = "hive")]
        Hive = 1487,
        /// <summary>
        /// Enum Hls for value: hls
        /// </summary>
        [EnumMember(Value = "hls")]
        Hls = 1488,
        /// <summary>
        /// Enum Hlsoff for value: hls_off
        /// </summary>
        [EnumMember(Value = "hls_off")]
        Hlsoff = 1489,
        /// <summary>
        /// Enum Holidayvillage for value: holiday_village
        /// </summary>
        [EnumMember(Value = "holiday_village")]
        Holidayvillage = 1490,
        /// <summary>
        /// Enum Homemax for value: home_max
        /// </summary>
        [EnumMember(Value = "home_max")]
        Homemax = 1491,
        /// <summary>
        /// Enum Homemini for value: home_mini
        /// </summary>
        [EnumMember(Value = "home_mini")]
        Homemini = 1492,
        /// <summary>
        /// Enum Homerepairservice for value: home_repair_service
        /// </summary>
        [EnumMember(Value = "home_repair_service")]
        Homerepairservice = 1493,
        /// <summary>
        /// Enum Homework for value: home_work
        /// </summary>
        [EnumMember(Value = "home_work")]
        Homework = 1494,
        /// <summary>
        /// Enum Horizontaldistribute for value: horizontal_distribute
        /// </summary>
        [EnumMember(Value = "horizontal_distribute")]
        Horizontaldistribute = 1495,
        /// <summary>
        /// Enum Horizontalrule for value: horizontal_rule
        /// </summary>
        [EnumMember(Value = "horizontal_rule")]
        Horizontalrule = 1496,
        /// <summary>
        /// Enum Horizontalsplit for value: horizontal_split
        /// </summary>
        [EnumMember(Value = "horizontal_split")]
        Horizontalsplit = 1497,
        /// <summary>
        /// Enum Hotelclass for value: hotel_class
        /// </summary>
        [EnumMember(Value = "hotel_class")]
        Hotelclass = 1498,
        /// <summary>
        /// Enum Hourglassbottom for value: hourglass_bottom
        /// </summary>
        [EnumMember(Value = "hourglass_bottom")]
        Hourglassbottom = 1499,
        /// <summary>
        /// Enum Hourglassdisabled for value: hourglass_disabled
        /// </summary>
        [EnumMember(Value = "hourglass_disabled")]
        Hourglassdisabled = 1500,
        /// <summary>
        /// Enum Hourglasstop for value: hourglass_top
        /// </summary>
        [EnumMember(Value = "hourglass_top")]
        Hourglasstop = 1501,
        /// <summary>
        /// Enum House for value: house
        /// </summary>
        [EnumMember(Value = "house")]
        House = 1502,
        /// <summary>
        /// Enum Housesiding for value: house_siding
        /// </summary>
        [EnumMember(Value = "house_siding")]
        Housesiding = 1503,
        /// <summary>
        /// Enum Houseboat for value: houseboat
        /// </summary>
        [EnumMember(Value = "houseboat")]
        Houseboat = 1504,
        /// <summary>
        /// Enum Howtoreg for value: how_to_reg
        /// </summary>
        [EnumMember(Value = "how_to_reg")]
        Howtoreg = 1505,
        /// <summary>
        /// Enum Howtovote for value: how_to_vote
        /// </summary>
        [EnumMember(Value = "how_to_vote")]
        Howtovote = 1506,
        /// <summary>
        /// Enum Html for value: html
        /// </summary>
        [EnumMember(Value = "html")]
        Html = 1507,
        /// <summary>
        /// Enum Hub for value: hub
        /// </summary>
        [EnumMember(Value = "hub")]
        Hub = 1508,
        /// <summary>
        /// Enum Hvac for value: hvac
        /// </summary>
        [EnumMember(Value = "hvac")]
        Hvac = 1509,
        /// <summary>
        /// Enum Iceskating for value: ice_skating
        /// </summary>
        [EnumMember(Value = "ice_skating")]
        Iceskating = 1510,
        /// <summary>
        /// Enum Icecream for value: icecream
        /// </summary>
        [EnumMember(Value = "icecream")]
        Icecream = 1511,
        /// <summary>
        /// Enum Imagenotsupported for value: image_not_supported
        /// </summary>
        [EnumMember(Value = "image_not_supported")]
        Imagenotsupported = 1512,
        /// <summary>
        /// Enum Imagesearch for value: image_search
        /// </summary>
        [EnumMember(Value = "image_search")]
        Imagesearch = 1513,
        /// <summary>
        /// Enum Imagesearchroller for value: imagesearch_roller
        /// </summary>
        [EnumMember(Value = "imagesearch_roller")]
        Imagesearchroller = 1514,
        /// <summary>
        /// Enum Incompletecircle for value: incomplete_circle
        /// </summary>
        [EnumMember(Value = "incomplete_circle")]
        Incompletecircle = 1515,
        /// <summary>
        /// Enum Insertchartoutlined for value: insert_chart_outlined
        /// </summary>
        [EnumMember(Value = "insert_chart_outlined")]
        Insertchartoutlined = 1516,
        /// <summary>
        /// Enum Insertpagebreak for value: insert_page_break
        /// </summary>
        [EnumMember(Value = "insert_page_break")]
        Insertpagebreak = 1517,
        /// <summary>
        /// Enum Insights for value: insights
        /// </summary>
        [EnumMember(Value = "insights")]
        Insights = 1518,
        /// <summary>
        /// Enum Installdesktop for value: install_desktop
        /// </summary>
        [EnumMember(Value = "install_desktop")]
        Installdesktop = 1519,
        /// <summary>
        /// Enum Installmobile for value: install_mobile
        /// </summary>
        [EnumMember(Value = "install_mobile")]
        Installmobile = 1520,
        /// <summary>
        /// Enum Integrationinstructions for value: integration_instructions
        /// </summary>
        [EnumMember(Value = "integration_instructions")]
        Integrationinstructions = 1521,
        /// <summary>
        /// Enum Interests for value: interests
        /// </summary>
        [EnumMember(Value = "interests")]
        Interests = 1522,
        /// <summary>
        /// Enum Interpretermode for value: interpreter_mode
        /// </summary>
        [EnumMember(Value = "interpreter_mode")]
        Interpretermode = 1523,
        /// <summary>
        /// Enum Inventory for value: inventory
        /// </summary>
        [EnumMember(Value = "inventory")]
        Inventory = 1524,
        /// <summary>
        /// Enum Inventory2 for value: inventory_2
        /// </summary>
        [EnumMember(Value = "inventory_2")]
        Inventory2 = 1525,
        /// <summary>
        /// Enum Invertcolorson for value: invert_colors_on
        /// </summary>
        [EnumMember(Value = "invert_colors_on")]
        Invertcolorson = 1526,
        /// <summary>
        /// Enum Iosshare for value: ios_share
        /// </summary>
        [EnumMember(Value = "ios_share")]
        Iosshare = 1527,
        /// <summary>
        /// Enum Iron for value: iron
        /// </summary>
        [EnumMember(Value = "iron")]
        Iron = 1528,
        /// <summary>
        /// Enum Javascript for value: javascript
        /// </summary>
        [EnumMember(Value = "javascript")]
        Javascript = 1529,
        /// <summary>
        /// Enum Joinfull for value: join_full
        /// </summary>
        [EnumMember(Value = "join_full")]
        Joinfull = 1530,
        /// <summary>
        /// Enum Joininner for value: join_inner
        /// </summary>
        [EnumMember(Value = "join_inner")]
        Joininner = 1531,
        /// <summary>
        /// Enum Joinleft for value: join_left
        /// </summary>
        [EnumMember(Value = "join_left")]
        Joinleft = 1532,
        /// <summary>
        /// Enum Joinright for value: join_right
        /// </summary>
        [EnumMember(Value = "join_right")]
        Joinright = 1533,
        /// <summary>
        /// Enum Kayaking for value: kayaking
        /// </summary>
        [EnumMember(Value = "kayaking")]
        Kayaking = 1534,
        /// <summary>
        /// Enum Kebabdining for value: kebab_dining
        /// </summary>
        [EnumMember(Value = "kebab_dining")]
        Kebabdining = 1535,
        /// <summary>
        /// Enum Key for value: key
        /// </summary>
        [EnumMember(Value = "key")]
        Key = 1536,
        /// <summary>
        /// Enum Keyoff for value: key_off
        /// </summary>
        [EnumMember(Value = "key_off")]
        Keyoff = 1537,
        /// <summary>
        /// Enum Keyboardalt for value: keyboard_alt
        /// </summary>
        [EnumMember(Value = "keyboard_alt")]
        Keyboardalt = 1538,
        /// <summary>
        /// Enum Keyboardcommandkey for value: keyboard_command_key
        /// </summary>
        [EnumMember(Value = "keyboard_command_key")]
        Keyboardcommandkey = 1539,
        /// <summary>
        /// Enum Keyboardcontrol for value: keyboard_control
        /// </summary>
        [EnumMember(Value = "keyboard_control")]
        Keyboardcontrol = 1540,
        /// <summary>
        /// Enum Keyboardcontrolkey for value: keyboard_control_key
        /// </summary>
        [EnumMember(Value = "keyboard_control_key")]
        Keyboardcontrolkey = 1541,
        /// <summary>
        /// Enum Keyboarddoublearrowdown for value: keyboard_double_arrow_down
        /// </summary>
        [EnumMember(Value = "keyboard_double_arrow_down")]
        Keyboarddoublearrowdown = 1542,
        /// <summary>
        /// Enum Keyboarddoublearrowleft for value: keyboard_double_arrow_left
        /// </summary>
        [EnumMember(Value = "keyboard_double_arrow_left")]
        Keyboarddoublearrowleft = 1543,
        /// <summary>
        /// Enum Keyboarddoublearrowright for value: keyboard_double_arrow_right
        /// </summary>
        [EnumMember(Value = "keyboard_double_arrow_right")]
        Keyboarddoublearrowright = 1544,
        /// <summary>
        /// Enum Keyboarddoublearrowup for value: keyboard_double_arrow_up
        /// </summary>
        [EnumMember(Value = "keyboard_double_arrow_up")]
        Keyboarddoublearrowup = 1545,
        /// <summary>
        /// Enum Keyboardoptionkey for value: keyboard_option_key
        /// </summary>
        [EnumMember(Value = "keyboard_option_key")]
        Keyboardoptionkey = 1546,
        /// <summary>
        /// Enum Kingbed for value: king_bed
        /// </summary>
        [EnumMember(Value = "king_bed")]
        Kingbed = 1547,
        /// <summary>
        /// Enum Kitesurfing for value: kitesurfing
        /// </summary>
        [EnumMember(Value = "kitesurfing")]
        Kitesurfing = 1548,
        /// <summary>
        /// Enum Labelimportant for value: label_important
        /// </summary>
        [EnumMember(Value = "label_important")]
        Labelimportant = 1549,
        /// <summary>
        /// Enum Labelimportantoutline for value: label_important_outline
        /// </summary>
        [EnumMember(Value = "label_important_outline")]
        Labelimportantoutline = 1550,
        /// <summary>
        /// Enum Labeloff for value: label_off
        /// </summary>
        [EnumMember(Value = "label_off")]
        Labeloff = 1551,
        /// <summary>
        /// Enum Lan for value: lan
        /// </summary>
        [EnumMember(Value = "lan")]
        Lan = 1552,
        /// <summary>
        /// Enum Landslide for value: landslide
        /// </summary>
        [EnumMember(Value = "landslide")]
        Landslide = 1553,
        /// <summary>
        /// Enum Leaderboard for value: leaderboard
        /// </summary>
        [EnumMember(Value = "leaderboard")]
        Leaderboard = 1554,
        /// <summary>
        /// Enum Leavebagsathome for value: leave_bags_at_home
        /// </summary>
        [EnumMember(Value = "leave_bags_at_home")]
        Leavebagsathome = 1555,
        /// <summary>
        /// Enum Legendtoggle for value: legend_toggle
        /// </summary>
        [EnumMember(Value = "legend_toggle")]
        Legendtoggle = 1556,
        /// <summary>
        /// Enum Lensblur for value: lens_blur
        /// </summary>
        [EnumMember(Value = "lens_blur")]
        Lensblur = 1557,
        /// <summary>
        /// Enum Libraryaddcheck for value: library_add_check
        /// </summary>
        [EnumMember(Value = "library_add_check")]
        Libraryaddcheck = 1558,
        /// <summary>
        /// Enum Light for value: light
        /// </summary>
        [EnumMember(Value = "light")]
        Light = 1559,
        /// <summary>
        /// Enum Lightmode for value: light_mode
        /// </summary>
        [EnumMember(Value = "light_mode")]
        Lightmode = 1560,
        /// <summary>
        /// Enum Lightbulb for value: lightbulb
        /// </summary>
        [EnumMember(Value = "lightbulb")]
        Lightbulb = 1561,
        /// <summary>
        /// Enum Lightbulbcircle for value: lightbulb_circle
        /// </summary>
        [EnumMember(Value = "lightbulb_circle")]
        Lightbulbcircle = 1562,
        /// <summary>
        /// Enum Lineaxis for value: line_axis
        /// </summary>
        [EnumMember(Value = "line_axis")]
        Lineaxis = 1563,
        /// <summary>
        /// Enum Linkoff for value: link_off
        /// </summary>
        [EnumMember(Value = "link_off")]
        Linkoff = 1564,
        /// <summary>
        /// Enum Liquor for value: liquor
        /// </summary>
        [EnumMember(Value = "liquor")]
        Liquor = 1565,
        /// <summary>
        /// Enum Living for value: living
        /// </summary>
        [EnumMember(Value = "living")]
        Living = 1566,
        /// <summary>
        /// Enum Localattraction for value: local_attraction
        /// </summary>
        [EnumMember(Value = "local_attraction")]
        Localattraction = 1567,
        /// <summary>
        /// Enum Localfiredepartment for value: local_fire_department
        /// </summary>
        [EnumMember(Value = "local_fire_department")]
        Localfiredepartment = 1568,
        /// <summary>
        /// Enum Localpolice for value: local_police
        /// </summary>
        [EnumMember(Value = "local_police")]
        Localpolice = 1569,
        /// <summary>
        /// Enum Localprintshop for value: local_print_shop
        /// </summary>
        [EnumMember(Value = "local_print_shop")]
        Localprintshop = 1570,
        /// <summary>
        /// Enum Localrestaurant for value: local_restaurant
        /// </summary>
        [EnumMember(Value = "local_restaurant")]
        Localrestaurant = 1571,
        /// <summary>
        /// Enum Locationhistory for value: location_history
        /// </summary>
        [EnumMember(Value = "location_history")]
        Locationhistory = 1572,
        /// <summary>
        /// Enum Lockclock for value: lock_clock
        /// </summary>
        [EnumMember(Value = "lock_clock")]
        Lockclock = 1573,
        /// <summary>
        /// Enum Lockperson for value: lock_person
        /// </summary>
        [EnumMember(Value = "lock_person")]
        Lockperson = 1574,
        /// <summary>
        /// Enum Lockreset for value: lock_reset
        /// </summary>
        [EnumMember(Value = "lock_reset")]
        Lockreset = 1575,
        /// <summary>
        /// Enum Logodev for value: logo_dev
        /// </summary>
        [EnumMember(Value = "logo_dev")]
        Logodev = 1576,
        /// <summary>
        /// Enum Logout for value: logout
        /// </summary>
        [EnumMember(Value = "logout")]
        Logout = 1577,
        /// <summary>
        /// Enum Ltemobiledata for value: lte_mobiledata
        /// </summary>
        [EnumMember(Value = "lte_mobiledata")]
        Ltemobiledata = 1578,
        /// <summary>
        /// Enum Lteplusmobiledata for value: lte_plus_mobiledata
        /// </summary>
        [EnumMember(Value = "lte_plus_mobiledata")]
        Lteplusmobiledata = 1579,
        /// <summary>
        /// Enum Luggage for value: luggage
        /// </summary>
        [EnumMember(Value = "luggage")]
        Luggage = 1580,
        /// <summary>
        /// Enum Lunchdining for value: lunch_dining
        /// </summary>
        [EnumMember(Value = "lunch_dining")]
        Lunchdining = 1581,
        /// <summary>
        /// Enum Lyrics for value: lyrics
        /// </summary>
        [EnumMember(Value = "lyrics")]
        Lyrics = 1582,
        /// <summary>
        /// Enum Macrooff for value: macro_off
        /// </summary>
        [EnumMember(Value = "macro_off")]
        Macrooff = 1583,
        /// <summary>
        /// Enum Maillock for value: mail_lock
        /// </summary>
        [EnumMember(Value = "mail_lock")]
        Maillock = 1584,
        /// <summary>
        /// Enum Male for value: male
        /// </summary>
        [EnumMember(Value = "male")]
        Male = 1585,
        /// <summary>
        /// Enum Man for value: man
        /// </summary>
        [EnumMember(Value = "man")]
        Man = 1586,
        /// <summary>
        /// Enum Man2 for value: man_2
        /// </summary>
        [EnumMember(Value = "man_2")]
        Man2 = 1587,
        /// <summary>
        /// Enum Man3 for value: man_3
        /// </summary>
        [EnumMember(Value = "man_3")]
        Man3 = 1588,
        /// <summary>
        /// Enum Man4 for value: man_4
        /// </summary>
        [EnumMember(Value = "man_4")]
        Man4 = 1589,
        /// <summary>
        /// Enum Manageaccounts for value: manage_accounts
        /// </summary>
        [EnumMember(Value = "manage_accounts")]
        Manageaccounts = 1590,
        /// <summary>
        /// Enum Managehistory for value: manage_history
        /// </summary>
        [EnumMember(Value = "manage_history")]
        Managehistory = 1591,
        /// <summary>
        /// Enum Managesearch for value: manage_search
        /// </summary>
        [EnumMember(Value = "manage_search")]
        Managesearch = 1592,
        /// <summary>
        /// Enum Mapshomework for value: maps_home_work
        /// </summary>
        [EnumMember(Value = "maps_home_work")]
        Mapshomework = 1593,
        /// <summary>
        /// Enum Mapsugc for value: maps_ugc
        /// </summary>
        [EnumMember(Value = "maps_ugc")]
        Mapsugc = 1594,
        /// <summary>
        /// Enum Margin for value: margin
        /// </summary>
        [EnumMember(Value = "margin")]
        Margin = 1595,
        /// <summary>
        /// Enum Markasunread for value: mark_as_unread
        /// </summary>
        [EnumMember(Value = "mark_as_unread")]
        Markasunread = 1596,
        /// <summary>
        /// Enum Markchatread for value: mark_chat_read
        /// </summary>
        [EnumMember(Value = "mark_chat_read")]
        Markchatread = 1597,
        /// <summary>
        /// Enum Markchatunread for value: mark_chat_unread
        /// </summary>
        [EnumMember(Value = "mark_chat_unread")]
        Markchatunread = 1598,
        /// <summary>
        /// Enum Markemailread for value: mark_email_read
        /// </summary>
        [EnumMember(Value = "mark_email_read")]
        Markemailread = 1599,
        /// <summary>
        /// Enum Markemailunread for value: mark_email_unread
        /// </summary>
        [EnumMember(Value = "mark_email_unread")]
        Markemailunread = 1600,
        /// <summary>
        /// Enum Markunreadchatalt for value: mark_unread_chat_alt
        /// </summary>
        [EnumMember(Value = "mark_unread_chat_alt")]
        Markunreadchatalt = 1601,
        /// <summary>
        /// Enum Masks for value: masks
        /// </summary>
        [EnumMember(Value = "masks")]
        Masks = 1602,
        /// <summary>
        /// Enum Maximize for value: maximize
        /// </summary>
        [EnumMember(Value = "maximize")]
        Maximize = 1603,
        /// <summary>
        /// Enum Mediabluetoothoff for value: media_bluetooth_off
        /// </summary>
        [EnumMember(Value = "media_bluetooth_off")]
        Mediabluetoothoff = 1604,
        /// <summary>
        /// Enum Mediabluetoothon for value: media_bluetooth_on
        /// </summary>
        [EnumMember(Value = "media_bluetooth_on")]
        Mediabluetoothon = 1605,
        /// <summary>
        /// Enum Mediation for value: mediation
        /// </summary>
        [EnumMember(Value = "mediation")]
        Mediation = 1606,
        /// <summary>
        /// Enum Medicalinformation for value: medical_information
        /// </summary>
        [EnumMember(Value = "medical_information")]
        Medicalinformation = 1607,
        /// <summary>
        /// Enum Medicalservices for value: medical_services
        /// </summary>
        [EnumMember(Value = "medical_services")]
        Medicalservices = 1608,
        /// <summary>
        /// Enum Medication for value: medication
        /// </summary>
        [EnumMember(Value = "medication")]
        Medication = 1609,
        /// <summary>
        /// Enum Medicationliquid for value: medication_liquid
        /// </summary>
        [EnumMember(Value = "medication_liquid")]
        Medicationliquid = 1610,
        /// <summary>
        /// Enum Meetingroom for value: meeting_room
        /// </summary>
        [EnumMember(Value = "meeting_room")]
        Meetingroom = 1611,
        /// <summary>
        /// Enum Menubook for value: menu_book
        /// </summary>
        [EnumMember(Value = "menu_book")]
        Menubook = 1612,
        /// <summary>
        /// Enum Menuopen for value: menu_open
        /// </summary>
        [EnumMember(Value = "menu_open")]
        Menuopen = 1613,
        /// <summary>
        /// Enum Merge for value: merge
        /// </summary>
        [EnumMember(Value = "merge")]
        Merge = 1614,
        /// <summary>
        /// Enum Messenger for value: messenger
        /// </summary>
        [EnumMember(Value = "messenger")]
        Messenger = 1615,
        /// <summary>
        /// Enum Messengeroutline for value: messenger_outline
        /// </summary>
        [EnumMember(Value = "messenger_outline")]
        Messengeroutline = 1616,
        /// <summary>
        /// Enum Micexternaloff for value: mic_external_off
        /// </summary>
        [EnumMember(Value = "mic_external_off")]
        Micexternaloff = 1617,
        /// <summary>
        /// Enum Micexternalon for value: mic_external_on
        /// </summary>
        [EnumMember(Value = "mic_external_on")]
        Micexternalon = 1618,
        /// <summary>
        /// Enum Microwave for value: microwave
        /// </summary>
        [EnumMember(Value = "microwave")]
        Microwave = 1619,
        /// <summary>
        /// Enum Militarytech for value: military_tech
        /// </summary>
        [EnumMember(Value = "military_tech")]
        Militarytech = 1620,
        /// <summary>
        /// Enum Minimize for value: minimize
        /// </summary>
        [EnumMember(Value = "minimize")]
        Minimize = 1621,
        /// <summary>
        /// Enum Minorcrash for value: minor_crash
        /// </summary>
        [EnumMember(Value = "minor_crash")]
        Minorcrash = 1622,
        /// <summary>
        /// Enum Miscellaneousservices for value: miscellaneous_services
        /// </summary>
        [EnumMember(Value = "miscellaneous_services")]
        Miscellaneousservices = 1623,
        /// <summary>
        /// Enum Missedvideocall for value: missed_video_call
        /// </summary>
        [EnumMember(Value = "missed_video_call")]
        Missedvideocall = 1624,
        /// <summary>
        /// Enum Mobilefriendly for value: mobile_friendly
        /// </summary>
        [EnumMember(Value = "mobile_friendly")]
        Mobilefriendly = 1625,
        /// <summary>
        /// Enum Mobileoff for value: mobile_off
        /// </summary>
        [EnumMember(Value = "mobile_off")]
        Mobileoff = 1626,
        /// <summary>
        /// Enum Mobilescreenshare for value: mobile_screen_share
        /// </summary>
        [EnumMember(Value = "mobile_screen_share")]
        Mobilescreenshare = 1627,
        /// <summary>
        /// Enum Mobiledataoff for value: mobiledata_off
        /// </summary>
        [EnumMember(Value = "mobiledata_off")]
        Mobiledataoff = 1628,
        /// <summary>
        /// Enum Mode for value: mode
        /// </summary>
        [EnumMember(Value = "mode")]
        Mode = 1629,
        /// <summary>
        /// Enum Modeeditoutline for value: mode_edit_outline
        /// </summary>
        [EnumMember(Value = "mode_edit_outline")]
        Modeeditoutline = 1630,
        /// <summary>
        /// Enum Modefanoff for value: mode_fan_off
        /// </summary>
        [EnumMember(Value = "mode_fan_off")]
        Modefanoff = 1631,
        /// <summary>
        /// Enum Modenight for value: mode_night
        /// </summary>
        [EnumMember(Value = "mode_night")]
        Modenight = 1632,
        /// <summary>
        /// Enum Modeoftravel for value: mode_of_travel
        /// </summary>
        [EnumMember(Value = "mode_of_travel")]
        Modeoftravel = 1633,
        /// <summary>
        /// Enum Modestandby for value: mode_standby
        /// </summary>
        [EnumMember(Value = "mode_standby")]
        Modestandby = 1634,
        /// <summary>
        /// Enum Modeltraining for value: model_training
        /// </summary>
        [EnumMember(Value = "model_training")]
        Modeltraining = 1635,
        /// <summary>
        /// Enum Money for value: money
        /// </summary>
        [EnumMember(Value = "money")]
        Money = 1636,
        /// <summary>
        /// Enum Moneyoffcsred for value: money_off_csred
        /// </summary>
        [EnumMember(Value = "money_off_csred")]
        Moneyoffcsred = 1637,
        /// <summary>
        /// Enum Monitor for value: monitor
        /// </summary>
        [EnumMember(Value = "monitor")]
        Monitor = 1638,
        /// <summary>
        /// Enum Monitorheart for value: monitor_heart
        /// </summary>
        [EnumMember(Value = "monitor_heart")]
        Monitorheart = 1639,
        /// <summary>
        /// Enum Monitorweight for value: monitor_weight
        /// </summary>
        [EnumMember(Value = "monitor_weight")]
        Monitorweight = 1640,
        /// <summary>
        /// Enum Moped for value: moped
        /// </summary>
        [EnumMember(Value = "moped")]
        Moped = 1641,
        /// <summary>
        /// Enum Moretime for value: more_time
        /// </summary>
        [EnumMember(Value = "more_time")]
        Moretime = 1642,
        /// <summary>
        /// Enum Mosque for value: mosque
        /// </summary>
        [EnumMember(Value = "mosque")]
        Mosque = 1643,
        /// <summary>
        /// Enum Motionphotosauto for value: motion_photos_auto
        /// </summary>
        [EnumMember(Value = "motion_photos_auto")]
        Motionphotosauto = 1644,
        /// <summary>
        /// Enum Motionphotosoff for value: motion_photos_off
        /// </summary>
        [EnumMember(Value = "motion_photos_off")]
        Motionphotosoff = 1645,
        /// <summary>
        /// Enum Motionphotoson for value: motion_photos_on
        /// </summary>
        [EnumMember(Value = "motion_photos_on")]
        Motionphotoson = 1646,
        /// <summary>
        /// Enum Motionphotospause for value: motion_photos_pause
        /// </summary>
        [EnumMember(Value = "motion_photos_pause")]
        Motionphotospause = 1647,
        /// <summary>
        /// Enum Motionphotospaused for value: motion_photos_paused
        /// </summary>
        [EnumMember(Value = "motion_photos_paused")]
        Motionphotospaused = 1648,
        /// <summary>
        /// Enum Movedown for value: move_down
        /// </summary>
        [EnumMember(Value = "move_down")]
        Movedown = 1649,
        /// <summary>
        /// Enum Moveup for value: move_up
        /// </summary>
        [EnumMember(Value = "move_up")]
        Moveup = 1650,
        /// <summary>
        /// Enum Moving for value: moving
        /// </summary>
        [EnumMember(Value = "moving")]
        Moving = 1651,
        /// <summary>
        /// Enum Mp for value: mp
        /// </summary>
        [EnumMember(Value = "mp")]
        Mp = 1652,
        /// <summary>
        /// Enum Multiplestop for value: multiple_stop
        /// </summary>
        [EnumMember(Value = "multiple_stop")]
        Multiplestop = 1653,
        /// <summary>
        /// Enum Multitrackaudio for value: multitrack_audio
        /// </summary>
        [EnumMember(Value = "multitrack_audio")]
        Multitrackaudio = 1654,
        /// <summary>
        /// Enum Museum for value: museum
        /// </summary>
        [EnumMember(Value = "museum")]
        Museum = 1655,
        /// <summary>
        /// Enum Musicoff for value: music_off
        /// </summary>
        [EnumMember(Value = "music_off")]
        Musicoff = 1656,
        /// <summary>
        /// Enum Mylibraryadd for value: my_library_add
        /// </summary>
        [EnumMember(Value = "my_library_add")]
        Mylibraryadd = 1657,
        /// <summary>
        /// Enum Mylibrarybooks for value: my_library_books
        /// </summary>
        [EnumMember(Value = "my_library_books")]
        Mylibrarybooks = 1658,
        /// <summary>
        /// Enum Mylibrarymusic for value: my_library_music
        /// </summary>
        [EnumMember(Value = "my_library_music")]
        Mylibrarymusic = 1659,
        /// <summary>
        /// Enum Nat for value: nat
        /// </summary>
        [EnumMember(Value = "nat")]
        Nat = 1660,
        /// <summary>
        /// Enum Nearmedisabled for value: near_me_disabled
        /// </summary>
        [EnumMember(Value = "near_me_disabled")]
        Nearmedisabled = 1661,
        /// <summary>
        /// Enum Nearbyerror for value: nearby_error
        /// </summary>
        [EnumMember(Value = "nearby_error")]
        Nearbyerror = 1662,
        /// <summary>
        /// Enum Nearbyoff for value: nearby_off
        /// </summary>
        [EnumMember(Value = "nearby_off")]
        Nearbyoff = 1663,
        /// <summary>
        /// Enum Nestcamwiredstand for value: nest_cam_wired_stand
        /// </summary>
        [EnumMember(Value = "nest_cam_wired_stand")]
        Nestcamwiredstand = 1664,
        /// <summary>
        /// Enum Networkping for value: network_ping
        /// </summary>
        [EnumMember(Value = "network_ping")]
        Networkping = 1665,
        /// <summary>
        /// Enum Networkwifi1bar for value: network_wifi_1_bar
        /// </summary>
        [EnumMember(Value = "network_wifi_1_bar")]
        Networkwifi1bar = 1666,
        /// <summary>
        /// Enum Networkwifi2bar for value: network_wifi_2_bar
        /// </summary>
        [EnumMember(Value = "network_wifi_2_bar")]
        Networkwifi2bar = 1667,
        /// <summary>
        /// Enum Networkwifi3bar for value: network_wifi_3_bar
        /// </summary>
        [EnumMember(Value = "network_wifi_3_bar")]
        Networkwifi3bar = 1668,
        /// <summary>
        /// Enum Newlabel for value: new_label
        /// </summary>
        [EnumMember(Value = "new_label")]
        Newlabel = 1669,
        /// <summary>
        /// Enum Newspaper for value: newspaper
        /// </summary>
        [EnumMember(Value = "newspaper")]
        Newspaper = 1670,
        /// <summary>
        /// Enum Nextplan for value: next_plan
        /// </summary>
        [EnumMember(Value = "next_plan")]
        Nextplan = 1671,
        /// <summary>
        /// Enum Nightshelter for value: night_shelter
        /// </summary>
        [EnumMember(Value = "night_shelter")]
        Nightshelter = 1672,
        /// <summary>
        /// Enum Nightlife for value: nightlife
        /// </summary>
        [EnumMember(Value = "nightlife")]
        Nightlife = 1673,
        /// <summary>
        /// Enum Nightlight for value: nightlight
        /// </summary>
        [EnumMember(Value = "nightlight")]
        Nightlight = 1674,
        /// <summary>
        /// Enum Nightlightround for value: nightlight_round
        /// </summary>
        [EnumMember(Value = "nightlight_round")]
        Nightlightround = 1675,
        /// <summary>
        /// Enum Nightsstay for value: nights_stay
        /// </summary>
        [EnumMember(Value = "nights_stay")]
        Nightsstay = 1676,
        /// <summary>
        /// Enum Noaccounts for value: no_accounts
        /// </summary>
        [EnumMember(Value = "no_accounts")]
        Noaccounts = 1677,
        /// <summary>
        /// Enum Noadultcontent for value: no_adult_content
        /// </summary>
        [EnumMember(Value = "no_adult_content")]
        Noadultcontent = 1678,
        /// <summary>
        /// Enum Nobackpack for value: no_backpack
        /// </summary>
        [EnumMember(Value = "no_backpack")]
        Nobackpack = 1679,
        /// <summary>
        /// Enum Nocell for value: no_cell
        /// </summary>
        [EnumMember(Value = "no_cell")]
        Nocell = 1680,
        /// <summary>
        /// Enum Nocrash for value: no_crash
        /// </summary>
        [EnumMember(Value = "no_crash")]
        Nocrash = 1681,
        /// <summary>
        /// Enum Nodrinks for value: no_drinks
        /// </summary>
        [EnumMember(Value = "no_drinks")]
        Nodrinks = 1682,
        /// <summary>
        /// Enum Noencryptiongmailerrorred for value: no_encryption_gmailerrorred
        /// </summary>
        [EnumMember(Value = "no_encryption_gmailerrorred")]
        Noencryptiongmailerrorred = 1683,
        /// <summary>
        /// Enum Noflash for value: no_flash
        /// </summary>
        [EnumMember(Value = "no_flash")]
        Noflash = 1684,
        /// <summary>
        /// Enum Nofood for value: no_food
        /// </summary>
        [EnumMember(Value = "no_food")]
        Nofood = 1685,
        /// <summary>
        /// Enum Noluggage for value: no_luggage
        /// </summary>
        [EnumMember(Value = "no_luggage")]
        Noluggage = 1686,
        /// <summary>
        /// Enum Nomeals for value: no_meals
        /// </summary>
        [EnumMember(Value = "no_meals")]
        Nomeals = 1687,
        /// <summary>
        /// Enum Nomeetingroom for value: no_meeting_room
        /// </summary>
        [EnumMember(Value = "no_meeting_room")]
        Nomeetingroom = 1688,
        /// <summary>
        /// Enum Nophotography for value: no_photography
        /// </summary>
        [EnumMember(Value = "no_photography")]
        Nophotography = 1689,
        /// <summary>
        /// Enum Nostroller for value: no_stroller
        /// </summary>
        [EnumMember(Value = "no_stroller")]
        Nostroller = 1690,
        /// <summary>
        /// Enum Notransfer for value: no_transfer
        /// </summary>
        [EnumMember(Value = "no_transfer")]
        Notransfer = 1691,
        /// <summary>
        /// Enum Noiseaware for value: noise_aware
        /// </summary>
        [EnumMember(Value = "noise_aware")]
        Noiseaware = 1692,
        /// <summary>
        /// Enum Noisecontroloff for value: noise_control_off
        /// </summary>
        [EnumMember(Value = "noise_control_off")]
        Noisecontroloff = 1693,
        /// <summary>
        /// Enum Nordicwalking for value: nordic_walking
        /// </summary>
        [EnumMember(Value = "nordic_walking")]
        Nordicwalking = 1694,
        /// <summary>
        /// Enum North for value: north
        /// </summary>
        [EnumMember(Value = "north")]
        North = 1695,
        /// <summary>
        /// Enum Northeast for value: north_east
        /// </summary>
        [EnumMember(Value = "north_east")]
        Northeast = 1696,
        /// <summary>
        /// Enum Northwest for value: north_west
        /// </summary>
        [EnumMember(Value = "north_west")]
        Northwest = 1697,
        /// <summary>
        /// Enum Notaccessible for value: not_accessible
        /// </summary>
        [EnumMember(Value = "not_accessible")]
        Notaccessible = 1698,
        /// <summary>
        /// Enum Notlistedlocation for value: not_listed_location
        /// </summary>
        [EnumMember(Value = "not_listed_location")]
        Notlistedlocation = 1699,
        /// <summary>
        /// Enum Notstarted for value: not_started
        /// </summary>
        [EnumMember(Value = "not_started")]
        Notstarted = 1700,
        /// <summary>
        /// Enum Notealt for value: note_alt
        /// </summary>
        [EnumMember(Value = "note_alt")]
        Notealt = 1701,
        /// <summary>
        /// Enum Notes for value: notes
        /// </summary>
        [EnumMember(Value = "notes")]
        Notes = 1702,
        /// <summary>
        /// Enum Notificationadd for value: notification_add
        /// </summary>
        [EnumMember(Value = "notification_add")]
        Notificationadd = 1703,
        /// <summary>
        /// Enum Notificationimportant for value: notification_important
        /// </summary>
        [EnumMember(Value = "notification_important")]
        Notificationimportant = 1704,
        /// <summary>
        /// Enum Notificationson for value: notifications_on
        /// </summary>
        [EnumMember(Value = "notifications_on")]
        Notificationson = 1705,
        /// <summary>
        /// Enum Nowwallpaper for value: now_wallpaper
        /// </summary>
        [EnumMember(Value = "now_wallpaper")]
        Nowwallpaper = 1706,
        /// <summary>
        /// Enum Nowwidgets for value: now_widgets
        /// </summary>
        [EnumMember(Value = "now_widgets")]
        Nowwidgets = 1707,
        /// <summary>
        /// Enum Numbers for value: numbers
        /// </summary>
        [EnumMember(Value = "numbers")]
        Numbers = 1708,
        /// <summary>
        /// Enum Offlinebolt for value: offline_bolt
        /// </summary>
        [EnumMember(Value = "offline_bolt")]
        Offlinebolt = 1709,
        /// <summary>
        /// Enum Offlineshare for value: offline_share
        /// </summary>
        [EnumMember(Value = "offline_share")]
        Offlineshare = 1710,
        /// <summary>
        /// Enum Oilbarrel for value: oil_barrel
        /// </summary>
        [EnumMember(Value = "oil_barrel")]
        Oilbarrel = 1711,
        /// <summary>
        /// Enum Ondevicetraining for value: on_device_training
        /// </summary>
        [EnumMember(Value = "on_device_training")]
        Ondevicetraining = 1712,
        /// <summary>
        /// Enum Onlineprediction for value: online_prediction
        /// </summary>
        [EnumMember(Value = "online_prediction")]
        Onlineprediction = 1713,
        /// <summary>
        /// Enum Openinfull for value: open_in_full
        /// </summary>
        [EnumMember(Value = "open_in_full")]
        Openinfull = 1714,
        /// <summary>
        /// Enum Openinnewoff for value: open_in_new_off
        /// </summary>
        [EnumMember(Value = "open_in_new_off")]
        Openinnewoff = 1715,
        /// <summary>
        /// Enum Otherhouses for value: other_houses
        /// </summary>
        [EnumMember(Value = "other_houses")]
        Otherhouses = 1716,
        /// <summary>
        /// Enum Outbond for value: outbond
        /// </summary>
        [EnumMember(Value = "outbond")]
        Outbond = 1717,
        /// <summary>
        /// Enum Outbound for value: outbound
        /// </summary>
        [EnumMember(Value = "outbound")]
        Outbound = 1718,
        /// <summary>
        /// Enum Outbox for value: outbox
        /// </summary>
        [EnumMember(Value = "outbox")]
        Outbox = 1719,
        /// <summary>
        /// Enum Outdoorgrill for value: outdoor_grill
        /// </summary>
        [EnumMember(Value = "outdoor_grill")]
        Outdoorgrill = 1720,
        /// <summary>
        /// Enum Outlet for value: outlet
        /// </summary>
        [EnumMember(Value = "outlet")]
        Outlet = 1721,
        /// <summary>
        /// Enum Outlinedflag for value: outlined_flag
        /// </summary>
        [EnumMember(Value = "outlined_flag")]
        Outlinedflag = 1722,
        /// <summary>
        /// Enum Output for value: output
        /// </summary>
        [EnumMember(Value = "output")]
        Output = 1723,
        /// <summary>
        /// Enum Padding for value: padding
        /// </summary>
        [EnumMember(Value = "padding")]
        Padding = 1724,
        /// <summary>
        /// Enum Paid for value: paid
        /// </summary>
        [EnumMember(Value = "paid")]
        Paid = 1725,
        /// <summary>
        /// Enum Pantoolalt for value: pan_tool_alt
        /// </summary>
        [EnumMember(Value = "pan_tool_alt")]
        Pantoolalt = 1726,
        /// <summary>
        /// Enum Panoramafisheye for value: panorama_fisheye
        /// </summary>
        [EnumMember(Value = "panorama_fisheye")]
        Panoramafisheye = 1727,
        /// <summary>
        /// Enum Panoramahorizontalselect for value: panorama_horizontal_select
        /// </summary>
        [EnumMember(Value = "panorama_horizontal_select")]
        Panoramahorizontalselect = 1728,
        /// <summary>
        /// Enum Panoramaphotosphere for value: panorama_photosphere
        /// </summary>
        [EnumMember(Value = "panorama_photosphere")]
        Panoramaphotosphere = 1729,
        /// <summary>
        /// Enum Panoramaphotosphereselect for value: panorama_photosphere_select
        /// </summary>
        [EnumMember(Value = "panorama_photosphere_select")]
        Panoramaphotosphereselect = 1730,
        /// <summary>
        /// Enum Panoramaverticalselect for value: panorama_vertical_select
        /// </summary>
        [EnumMember(Value = "panorama_vertical_select")]
        Panoramaverticalselect = 1731,
        /// <summary>
        /// Enum Panoramawideangleselect for value: panorama_wide_angle_select
        /// </summary>
        [EnumMember(Value = "panorama_wide_angle_select")]
        Panoramawideangleselect = 1732,
        /// <summary>
        /// Enum Paragliding for value: paragliding
        /// </summary>
        [EnumMember(Value = "paragliding")]
        Paragliding = 1733,
        /// <summary>
        /// Enum Park for value: park
        /// </summary>
        [EnumMember(Value = "park")]
        Park = 1734,
        /// <summary>
        /// Enum Password for value: password
        /// </summary>
        [EnumMember(Value = "password")]
        Password = 1735,
        /// <summary>
        /// Enum Paste for value: paste
        /// </summary>
        [EnumMember(Value = "paste")]
        Paste = 1736,
        /// <summary>
        /// Enum Pattern for value: pattern
        /// </summary>
        [EnumMember(Value = "pattern")]
        Pattern = 1737,
        /// <summary>
        /// Enum Pausecircle for value: pause_circle
        /// </summary>
        [EnumMember(Value = "pause_circle")]
        Pausecircle = 1738,
        /// <summary>
        /// Enum Pausepresentation for value: pause_presentation
        /// </summary>
        [EnumMember(Value = "pause_presentation")]
        Pausepresentation = 1739,
        /// <summary>
        /// Enum Payments for value: payments
        /// </summary>
        [EnumMember(Value = "payments")]
        Payments = 1740,
        /// <summary>
        /// Enum Paypal for value: paypal
        /// </summary>
        [EnumMember(Value = "paypal")]
        Paypal = 1741,
        /// <summary>
        /// Enum Pedalbike for value: pedal_bike
        /// </summary>
        [EnumMember(Value = "pedal_bike")]
        Pedalbike = 1742,
        /// <summary>
        /// Enum Pending for value: pending
        /// </summary>
        [EnumMember(Value = "pending")]
        Pending = 1743,
        /// <summary>
        /// Enum Pendingactions for value: pending_actions
        /// </summary>
        [EnumMember(Value = "pending_actions")]
        Pendingactions = 1744,
        /// <summary>
        /// Enum Pentagon for value: pentagon
        /// </summary>
        [EnumMember(Value = "pentagon")]
        Pentagon = 1745,
        /// <summary>
        /// Enum Peoplealt for value: people_alt
        /// </summary>
        [EnumMember(Value = "people_alt")]
        Peoplealt = 1746,
        /// <summary>
        /// Enum Percent for value: percent
        /// </summary>
        [EnumMember(Value = "percent")]
        Percent = 1747,
        /// <summary>
        /// Enum Permcontactcal for value: perm_contact_cal
        /// </summary>
        [EnumMember(Value = "perm_contact_cal")]
        Permcontactcal = 1748,
        /// <summary>
        /// Enum Permdeviceinfo for value: perm_device_info
        /// </summary>
        [EnumMember(Value = "perm_device_info")]
        Permdeviceinfo = 1749,
        /// <summary>
        /// Enum Person2 for value: person_2
        /// </summary>
        [EnumMember(Value = "person_2")]
        Person2 = 1750,
        /// <summary>
        /// Enum Person3 for value: person_3
        /// </summary>
        [EnumMember(Value = "person_3")]
        Person3 = 1751,
        /// <summary>
        /// Enum Person4 for value: person_4
        /// </summary>
        [EnumMember(Value = "person_4")]
        Person4 = 1752,
        /// <summary>
        /// Enum Personaddalt for value: person_add_alt
        /// </summary>
        [EnumMember(Value = "person_add_alt")]
        Personaddalt = 1753,
        /// <summary>
        /// Enum Personaddalt1 for value: person_add_alt_1
        /// </summary>
        [EnumMember(Value = "person_add_alt_1")]
        Personaddalt1 = 1754,
        /// <summary>
        /// Enum Personadddisabled for value: person_add_disabled
        /// </summary>
        [EnumMember(Value = "person_add_disabled")]
        Personadddisabled = 1755,
        /// <summary>
        /// Enum Personoff for value: person_off
        /// </summary>
        [EnumMember(Value = "person_off")]
        Personoff = 1756,
        /// <summary>
        /// Enum Personremove for value: person_remove
        /// </summary>
        [EnumMember(Value = "person_remove")]
        Personremove = 1757,
        /// <summary>
        /// Enum Personremovealt1 for value: person_remove_alt_1
        /// </summary>
        [EnumMember(Value = "person_remove_alt_1")]
        Personremovealt1 = 1758,
        /// <summary>
        /// Enum Personsearch for value: person_search
        /// </summary>
        [EnumMember(Value = "person_search")]
        Personsearch = 1759,
        /// <summary>
        /// Enum Personalinjury for value: personal_injury
        /// </summary>
        [EnumMember(Value = "personal_injury")]
        Personalinjury = 1760,
        /// <summary>
        /// Enum Pestcontrol for value: pest_control
        /// </summary>
        [EnumMember(Value = "pest_control")]
        Pestcontrol = 1761,
        /// <summary>
        /// Enum Pestcontrolrodent for value: pest_control_rodent
        /// </summary>
        [EnumMember(Value = "pest_control_rodent")]
        Pestcontrolrodent = 1762,
        /// <summary>
        /// Enum Phishing for value: phishing
        /// </summary>
        [EnumMember(Value = "phishing")]
        Phishing = 1763,
        /// <summary>
        /// Enum Phonecallback for value: phone_callback
        /// </summary>
        [EnumMember(Value = "phone_callback")]
        Phonecallback = 1764,
        /// <summary>
        /// Enum Phonedisabled for value: phone_disabled
        /// </summary>
        [EnumMember(Value = "phone_disabled")]
        Phonedisabled = 1765,
        /// <summary>
        /// Enum Phoneenabled for value: phone_enabled
        /// </summary>
        [EnumMember(Value = "phone_enabled")]
        Phoneenabled = 1766,
        /// <summary>
        /// Enum Photocameraback for value: photo_camera_back
        /// </summary>
        [EnumMember(Value = "photo_camera_back")]
        Photocameraback = 1767,
        /// <summary>
        /// Enum Photocamerafront for value: photo_camera_front
        /// </summary>
        [EnumMember(Value = "photo_camera_front")]
        Photocamerafront = 1768,
        /// <summary>
        /// Enum Php for value: php
        /// </summary>
        [EnumMember(Value = "php")]
        Php = 1769,
        /// <summary>
        /// Enum Piano for value: piano
        /// </summary>
        [EnumMember(Value = "piano")]
        Piano = 1770,
        /// <summary>
        /// Enum Pianooff for value: piano_off
        /// </summary>
        [EnumMember(Value = "piano_off")]
        Pianooff = 1771,
        /// <summary>
        /// Enum Piechartoutline for value: pie_chart_outline
        /// </summary>
        [EnumMember(Value = "pie_chart_outline")]
        Piechartoutline = 1772,
        /// <summary>
        /// Enum Pin for value: pin
        /// </summary>
        [EnumMember(Value = "pin")]
        Pin = 1773,
        /// <summary>
        /// Enum Pinend for value: pin_end
        /// </summary>
        [EnumMember(Value = "pin_end")]
        Pinend = 1774,
        /// <summary>
        /// Enum Pininvoke for value: pin_invoke
        /// </summary>
        [EnumMember(Value = "pin_invoke")]
        Pininvoke = 1775,
        /// <summary>
        /// Enum Pinch for value: pinch
        /// </summary>
        [EnumMember(Value = "pinch")]
        Pinch = 1776,
        /// <summary>
        /// Enum Pivottablechart for value: pivot_table_chart
        /// </summary>
        [EnumMember(Value = "pivot_table_chart")]
        Pivottablechart = 1777,
        /// <summary>
        /// Enum Pix for value: pix
        /// </summary>
        [EnumMember(Value = "pix")]
        Pix = 1778,
        /// <summary>
        /// Enum Plagiarism for value: plagiarism
        /// </summary>
        [EnumMember(Value = "plagiarism")]
        Plagiarism = 1779,
        /// <summary>
        /// Enum Playcircle for value: play_circle
        /// </summary>
        [EnumMember(Value = "play_circle")]
        Playcircle = 1780,
        /// <summary>
        /// Enum Playcirclefill for value: play_circle_fill
        /// </summary>
        [EnumMember(Value = "play_circle_fill")]
        Playcirclefill = 1781,
        /// <summary>
        /// Enum Playdisabled for value: play_disabled
        /// </summary>
        [EnumMember(Value = "play_disabled")]
        Playdisabled = 1782,
        /// <summary>
        /// Enum Playlesson for value: play_lesson
        /// </summary>
        [EnumMember(Value = "play_lesson")]
        Playlesson = 1783,
        /// <summary>
        /// Enum Playlistaddcheckcircle for value: playlist_add_check_circle
        /// </summary>
        [EnumMember(Value = "playlist_add_check_circle")]
        Playlistaddcheckcircle = 1784,
        /// <summary>
        /// Enum Playlistaddcircle for value: playlist_add_circle
        /// </summary>
        [EnumMember(Value = "playlist_add_circle")]
        Playlistaddcircle = 1785,
        /// <summary>
        /// Enum Playlistremove for value: playlist_remove
        /// </summary>
        [EnumMember(Value = "playlist_remove")]
        Playlistremove = 1786,
        /// <summary>
        /// Enum Plumbing for value: plumbing
        /// </summary>
        [EnumMember(Value = "plumbing")]
        Plumbing = 1787,
        /// <summary>
        /// Enum Podcasts for value: podcasts
        /// </summary>
        [EnumMember(Value = "podcasts")]
        Podcasts = 1788,
        /// <summary>
        /// Enum Pointofsale for value: point_of_sale
        /// </summary>
        [EnumMember(Value = "point_of_sale")]
        Pointofsale = 1789,
        /// <summary>
        /// Enum Policy for value: policy
        /// </summary>
        [EnumMember(Value = "policy")]
        Policy = 1790,
        /// <summary>
        /// Enum Polyline for value: polyline
        /// </summary>
        [EnumMember(Value = "polyline")]
        Polyline = 1791,
        /// <summary>
        /// Enum Postadd for value: post_add
        /// </summary>
        [EnumMember(Value = "post_add")]
        Postadd = 1792,
        /// <summary>
        /// Enum Poweroff for value: power_off
        /// </summary>
        [EnumMember(Value = "power_off")]
        Poweroff = 1793,
        /// <summary>
        /// Enum Precisionmanufacturing for value: precision_manufacturing
        /// </summary>
        [EnumMember(Value = "precision_manufacturing")]
        Precisionmanufacturing = 1794,
        /// <summary>
        /// Enum Preview for value: preview
        /// </summary>
        [EnumMember(Value = "preview")]
        Preview = 1795,
        /// <summary>
        /// Enum Pricechange for value: price_change
        /// </summary>
        [EnumMember(Value = "price_change")]
        Pricechange = 1796,
        /// <summary>
        /// Enum Pricecheck for value: price_check
        /// </summary>
        [EnumMember(Value = "price_check")]
        Pricecheck = 1797,
        /// <summary>
        /// Enum Printdisabled for value: print_disabled
        /// </summary>
        [EnumMember(Value = "print_disabled")]
        Printdisabled = 1798,
        /// <summary>
        /// Enum Privacytip for value: privacy_tip
        /// </summary>
        [EnumMember(Value = "privacy_tip")]
        Privacytip = 1799,
        /// <summary>
        /// Enum Privateconnectivity for value: private_connectivity
        /// </summary>
        [EnumMember(Value = "private_connectivity")]
        Privateconnectivity = 1800,
        /// <summary>
        /// Enum Productionquantitylimits for value: production_quantity_limits
        /// </summary>
        [EnumMember(Value = "production_quantity_limits")]
        Productionquantitylimits = 1801,
        /// <summary>
        /// Enum Propane for value: propane
        /// </summary>
        [EnumMember(Value = "propane")]
        Propane = 1802,
        /// <summary>
        /// Enum Propanetank for value: propane_tank
        /// </summary>
        [EnumMember(Value = "propane_tank")]
        Propanetank = 1803,
        /// <summary>
        /// Enum Psychology for value: psychology
        /// </summary>
        [EnumMember(Value = "psychology")]
        Psychology = 1804,
        /// <summary>
        /// Enum Psychologyalt for value: psychology_alt
        /// </summary>
        [EnumMember(Value = "psychology_alt")]
        Psychologyalt = 1805,
        /// <summary>
        /// Enum Publicoff for value: public_off
        /// </summary>
        [EnumMember(Value = "public_off")]
        Publicoff = 1806,
        /// <summary>
        /// Enum Publishedwithchanges for value: published_with_changes
        /// </summary>
        [EnumMember(Value = "published_with_changes")]
        Publishedwithchanges = 1807,
        /// <summary>
        /// Enum Punchclock for value: punch_clock
        /// </summary>
        [EnumMember(Value = "punch_clock")]
        Punchclock = 1808,
        /// <summary>
        /// Enum Pushpin for value: push_pin
        /// </summary>
        [EnumMember(Value = "push_pin")]
        Pushpin = 1809,
        /// <summary>
        /// Enum Qrcode for value: qr_code
        /// </summary>
        [EnumMember(Value = "qr_code")]
        Qrcode = 1810,
        /// <summary>
        /// Enum Qrcode2 for value: qr_code_2
        /// </summary>
        [EnumMember(Value = "qr_code_2")]
        Qrcode2 = 1811,
        /// <summary>
        /// Enum Qrcodescanner for value: qr_code_scanner
        /// </summary>
        [EnumMember(Value = "qr_code_scanner")]
        Qrcodescanner = 1812,
        /// <summary>
        /// Enum Querystats for value: query_stats
        /// </summary>
        [EnumMember(Value = "query_stats")]
        Querystats = 1813,
        /// <summary>
        /// Enum Questionmark for value: question_mark
        /// </summary>
        [EnumMember(Value = "question_mark")]
        Questionmark = 1814,
        /// <summary>
        /// Enum Quickcontactsdialer for value: quick_contacts_dialer
        /// </summary>
        [EnumMember(Value = "quick_contacts_dialer")]
        Quickcontactsdialer = 1815,
        /// <summary>
        /// Enum Quickcontactsmail for value: quick_contacts_mail
        /// </summary>
        [EnumMember(Value = "quick_contacts_mail")]
        Quickcontactsmail = 1816,
        /// <summary>
        /// Enum Quickreply for value: quickreply
        /// </summary>
        [EnumMember(Value = "quickreply")]
        Quickreply = 1817,
        /// <summary>
        /// Enum Quiz for value: quiz
        /// </summary>
        [EnumMember(Value = "quiz")]
        Quiz = 1818,
        /// <summary>
        /// Enum Quora for value: quora
        /// </summary>
        [EnumMember(Value = "quora")]
        Quora = 1819,
        /// <summary>
        /// Enum Rmobiledata for value: r_mobiledata
        /// </summary>
        [EnumMember(Value = "r_mobiledata")]
        Rmobiledata = 1820,
        /// <summary>
        /// Enum Radar for value: radar
        /// </summary>
        [EnumMember(Value = "radar")]
        Radar = 1821,
        /// <summary>
        /// Enum Radiobuttonoff for value: radio_button_off
        /// </summary>
        [EnumMember(Value = "radio_button_off")]
        Radiobuttonoff = 1822,
        /// <summary>
        /// Enum Radiobuttonon for value: radio_button_on
        /// </summary>
        [EnumMember(Value = "radio_button_on")]
        Radiobuttonon = 1823,
        /// <summary>
        /// Enum Railwayalert for value: railway_alert
        /// </summary>
        [EnumMember(Value = "railway_alert")]
        Railwayalert = 1824,
        /// <summary>
        /// Enum Ramendining for value: ramen_dining
        /// </summary>
        [EnumMember(Value = "ramen_dining")]
        Ramendining = 1825,
        /// <summary>
        /// Enum Rampleft for value: ramp_left
        /// </summary>
        [EnumMember(Value = "ramp_left")]
        Rampleft = 1826,
        /// <summary>
        /// Enum Rampright for value: ramp_right
        /// </summary>
        [EnumMember(Value = "ramp_right")]
        Rampright = 1827,
        /// <summary>
        /// Enum Rawoff for value: raw_off
        /// </summary>
        [EnumMember(Value = "raw_off")]
        Rawoff = 1828,
        /// <summary>
        /// Enum Rawon for value: raw_on
        /// </summary>
        [EnumMember(Value = "raw_on")]
        Rawon = 1829,
        /// <summary>
        /// Enum Readmore for value: read_more
        /// </summary>
        [EnumMember(Value = "read_more")]
        Readmore = 1830,
        /// <summary>
        /// Enum Realestateagent for value: real_estate_agent
        /// </summary>
        [EnumMember(Value = "real_estate_agent")]
        Realestateagent = 1831,
        /// <summary>
        /// Enum Receiptlong for value: receipt_long
        /// </summary>
        [EnumMember(Value = "receipt_long")]
        Receiptlong = 1832,
        /// <summary>
        /// Enum Recommend for value: recommend
        /// </summary>
        [EnumMember(Value = "recommend")]
        Recommend = 1833,
        /// <summary>
        /// Enum Rectangle for value: rectangle
        /// </summary>
        [EnumMember(Value = "rectangle")]
        Rectangle = 1834,
        /// <summary>
        /// Enum Recycling for value: recycling
        /// </summary>
        [EnumMember(Value = "recycling")]
        Recycling = 1835,
        /// <summary>
        /// Enum Reddit for value: reddit
        /// </summary>
        [EnumMember(Value = "reddit")]
        Reddit = 1836,
        /// <summary>
        /// Enum Reducecapacity for value: reduce_capacity
        /// </summary>
        [EnumMember(Value = "reduce_capacity")]
        Reducecapacity = 1837,
        /// <summary>
        /// Enum Rememberme for value: remember_me
        /// </summary>
        [EnumMember(Value = "remember_me")]
        Rememberme = 1838,
        /// <summary>
        /// Enum Removedone for value: remove_done
        /// </summary>
        [EnumMember(Value = "remove_done")]
        Removedone = 1839,
        /// <summary>
        /// Enum Removemoderator for value: remove_moderator
        /// </summary>
        [EnumMember(Value = "remove_moderator")]
        Removemoderator = 1840,
        /// <summary>
        /// Enum Removeroad for value: remove_road
        /// </summary>
        [EnumMember(Value = "remove_road")]
        Removeroad = 1841,
        /// <summary>
        /// Enum Repartition for value: repartition
        /// </summary>
        [EnumMember(Value = "repartition")]
        Repartition = 1842,
        /// <summary>
        /// Enum Repeaton for value: repeat_on
        /// </summary>
        [EnumMember(Value = "repeat_on")]
        Repeaton = 1843,
        /// <summary>
        /// Enum Repeatoneon for value: repeat_one_on
        /// </summary>
        [EnumMember(Value = "repeat_one_on")]
        Repeatoneon = 1844,
        /// <summary>
        /// Enum Replaycirclefilled for value: replay_circle_filled
        /// </summary>
        [EnumMember(Value = "replay_circle_filled")]
        Replaycirclefilled = 1845,
        /// <summary>
        /// Enum Reportgmailerrorred for value: report_gmailerrorred
        /// </summary>
        [EnumMember(Value = "report_gmailerrorred")]
        Reportgmailerrorred = 1846,
        /// <summary>
        /// Enum Reportoff for value: report_off
        /// </summary>
        [EnumMember(Value = "report_off")]
        Reportoff = 1847,
        /// <summary>
        /// Enum Requestpage for value: request_page
        /// </summary>
        [EnumMember(Value = "request_page")]
        Requestpage = 1848,
        /// <summary>
        /// Enum Requestquote for value: request_quote
        /// </summary>
        [EnumMember(Value = "request_quote")]
        Requestquote = 1849,
        /// <summary>
        /// Enum Resettv for value: reset_tv
        /// </summary>
        [EnumMember(Value = "reset_tv")]
        Resettv = 1850,
        /// <summary>
        /// Enum Restartalt for value: restart_alt
        /// </summary>
        [EnumMember(Value = "restart_alt")]
        Restartalt = 1851,
        /// <summary>
        /// Enum Restorefromtrash for value: restore_from_trash
        /// </summary>
        [EnumMember(Value = "restore_from_trash")]
        Restorefromtrash = 1852,
        /// <summary>
        /// Enum Reviews for value: reviews
        /// </summary>
        [EnumMember(Value = "reviews")]
        Reviews = 1853,
        /// <summary>
        /// Enum Ricebowl for value: rice_bowl
        /// </summary>
        [EnumMember(Value = "rice_bowl")]
        Ricebowl = 1854,
        /// <summary>
        /// Enum Rocket for value: rocket
        /// </summary>
        [EnumMember(Value = "rocket")]
        Rocket = 1855,
        /// <summary>
        /// Enum Rocketlaunch for value: rocket_launch
        /// </summary>
        [EnumMember(Value = "rocket_launch")]
        Rocketlaunch = 1856,
        /// <summary>
        /// Enum Rollershades for value: roller_shades
        /// </summary>
        [EnumMember(Value = "roller_shades")]
        Rollershades = 1857,
        /// <summary>
        /// Enum Rollershadesclosed for value: roller_shades_closed
        /// </summary>
        [EnumMember(Value = "roller_shades_closed")]
        Rollershadesclosed = 1858,
        /// <summary>
        /// Enum Rollerskating for value: roller_skating
        /// </summary>
        [EnumMember(Value = "roller_skating")]
        Rollerskating = 1859,
        /// <summary>
        /// Enum Roofing for value: roofing
        /// </summary>
        [EnumMember(Value = "roofing")]
        Roofing = 1860,
        /// <summary>
        /// Enum Roompreferences for value: room_preferences
        /// </summary>
        [EnumMember(Value = "room_preferences")]
        Roompreferences = 1861,
        /// <summary>
        /// Enum Rotate90degreescw for value: rotate_90_degrees_cw
        /// </summary>
        [EnumMember(Value = "rotate_90_degrees_cw")]
        Rotate90degreescw = 1862,
        /// <summary>
        /// Enum Roundaboutleft for value: roundabout_left
        /// </summary>
        [EnumMember(Value = "roundabout_left")]
        Roundaboutleft = 1863,
        /// <summary>
        /// Enum Roundaboutright for value: roundabout_right
        /// </summary>
        [EnumMember(Value = "roundabout_right")]
        Roundaboutright = 1864,
        /// <summary>
        /// Enum Route for value: route
        /// </summary>
        [EnumMember(Value = "route")]
        Route = 1865,
        /// <summary>
        /// Enum Rsvp for value: rsvp
        /// </summary>
        [EnumMember(Value = "rsvp")]
        Rsvp = 1866,
        /// <summary>
        /// Enum Rtt for value: rtt
        /// </summary>
        [EnumMember(Value = "rtt")]
        Rtt = 1867,
        /// <summary>
        /// Enum Rule for value: rule
        /// </summary>
        [EnumMember(Value = "rule")]
        Rule = 1868,
        /// <summary>
        /// Enum Rulefolder for value: rule_folder
        /// </summary>
        [EnumMember(Value = "rule_folder")]
        Rulefolder = 1869,
        /// <summary>
        /// Enum Runcircle for value: run_circle
        /// </summary>
        [EnumMember(Value = "run_circle")]
        Runcircle = 1870,
        /// <summary>
        /// Enum Runningwitherrors for value: running_with_errors
        /// </summary>
        [EnumMember(Value = "running_with_errors")]
        Runningwitherrors = 1871,
        /// <summary>
        /// Enum Safetycheck for value: safety_check
        /// </summary>
        [EnumMember(Value = "safety_check")]
        Safetycheck = 1872,
        /// <summary>
        /// Enum Safetydivider for value: safety_divider
        /// </summary>
        [EnumMember(Value = "safety_divider")]
        Safetydivider = 1873,
        /// <summary>
        /// Enum Sailing for value: sailing
        /// </summary>
        [EnumMember(Value = "sailing")]
        Sailing = 1874,
        /// <summary>
        /// Enum Sanitizer for value: sanitizer
        /// </summary>
        [EnumMember(Value = "sanitizer")]
        Sanitizer = 1875,
        /// <summary>
        /// Enum Satellitealt for value: satellite_alt
        /// </summary>
        [EnumMember(Value = "satellite_alt")]
        Satellitealt = 1876,
        /// <summary>
        /// Enum Savealt for value: save_alt
        /// </summary>
        [EnumMember(Value = "save_alt")]
        Savealt = 1877,
        /// <summary>
        /// Enum Saveas for value: save_as
        /// </summary>
        [EnumMember(Value = "save_as")]
        Saveas = 1878,
        /// <summary>
        /// Enum Savedsearch for value: saved_search
        /// </summary>
        [EnumMember(Value = "saved_search")]
        Savedsearch = 1879,
        /// <summary>
        /// Enum Savings for value: savings
        /// </summary>
        [EnumMember(Value = "savings")]
        Savings = 1880,
        /// <summary>
        /// Enum Scale for value: scale
        /// </summary>
        [EnumMember(Value = "scale")]
        Scale = 1881,
        /// <summary>
        /// Enum Scatterplot for value: scatter_plot
        /// </summary>
        [EnumMember(Value = "scatter_plot")]
        Scatterplot = 1882,
        /// <summary>
        /// Enum Schedulesend for value: schedule_send
        /// </summary>
        [EnumMember(Value = "schedule_send")]
        Schedulesend = 1883,
        /// <summary>
        /// Enum Schema for value: schema
        /// </summary>
        [EnumMember(Value = "schema")]
        Schema = 1884,
        /// <summary>
        /// Enum Science for value: science
        /// </summary>
        [EnumMember(Value = "science")]
        Science = 1885,
        /// <summary>
        /// Enum Score for value: score
        /// </summary>
        [EnumMember(Value = "score")]
        Score = 1886,
        /// <summary>
        /// Enum Scoreboard for value: scoreboard
        /// </summary>
        [EnumMember(Value = "scoreboard")]
        Scoreboard = 1887,
        /// <summary>
        /// Enum Screenrotationalt for value: screen_rotation_alt
        /// </summary>
        [EnumMember(Value = "screen_rotation_alt")]
        Screenrotationalt = 1888,
        /// <summary>
        /// Enum Screensearchdesktop for value: screen_search_desktop
        /// </summary>
        [EnumMember(Value = "screen_search_desktop")]
        Screensearchdesktop = 1889,
        /// <summary>
        /// Enum Screenshot for value: screenshot
        /// </summary>
        [EnumMember(Value = "screenshot")]
        Screenshot = 1890,
        /// <summary>
        /// Enum Screenshotmonitor for value: screenshot_monitor
        /// </summary>
        [EnumMember(Value = "screenshot_monitor")]
        Screenshotmonitor = 1891,
        /// <summary>
        /// Enum Scubadiving for value: scuba_diving
        /// </summary>
        [EnumMember(Value = "scuba_diving")]
        Scubadiving = 1892,
        /// <summary>
        /// Enum Sd for value: sd
        /// </summary>
        [EnumMember(Value = "sd")]
        Sd = 1893,
        /// <summary>
        /// Enum Sdcardalert for value: sd_card_alert
        /// </summary>
        [EnumMember(Value = "sd_card_alert")]
        Sdcardalert = 1894,
        /// <summary>
        /// Enum Searchoff for value: search_off
        /// </summary>
        [EnumMember(Value = "search_off")]
        Searchoff = 1895,
        /// <summary>
        /// Enum Securityupdate for value: security_update
        /// </summary>
        [EnumMember(Value = "security_update")]
        Securityupdate = 1896,
        /// <summary>
        /// Enum Securityupdategood for value: security_update_good
        /// </summary>
        [EnumMember(Value = "security_update_good")]
        Securityupdategood = 1897,
        /// <summary>
        /// Enum Securityupdatewarning for value: security_update_warning
        /// </summary>
        [EnumMember(Value = "security_update_warning")]
        Securityupdatewarning = 1898,
        /// <summary>
        /// Enum Segment for value: segment
        /// </summary>
        [EnumMember(Value = "segment")]
        Segment = 1899,
        /// <summary>
        /// Enum Selfimprovement for value: self_improvement
        /// </summary>
        [EnumMember(Value = "self_improvement")]
        Selfimprovement = 1900,
        /// <summary>
        /// Enum Sell for value: sell
        /// </summary>
        [EnumMember(Value = "sell")]
        Sell = 1901,
        /// <summary>
        /// Enum Sendandarchive for value: send_and_archive
        /// </summary>
        [EnumMember(Value = "send_and_archive")]
        Sendandarchive = 1902,
        /// <summary>
        /// Enum Sendtimeextension for value: send_time_extension
        /// </summary>
        [EnumMember(Value = "send_time_extension")]
        Sendtimeextension = 1903,
        /// <summary>
        /// Enum Sendtomobile for value: send_to_mobile
        /// </summary>
        [EnumMember(Value = "send_to_mobile")]
        Sendtomobile = 1904,
        /// <summary>
        /// Enum Sensordoor for value: sensor_door
        /// </summary>
        [EnumMember(Value = "sensor_door")]
        Sensordoor = 1905,
        /// <summary>
        /// Enum Sensoroccupied for value: sensor_occupied
        /// </summary>
        [EnumMember(Value = "sensor_occupied")]
        Sensoroccupied = 1906,
        /// <summary>
        /// Enum Sensorwindow for value: sensor_window
        /// </summary>
        [EnumMember(Value = "sensor_window")]
        Sensorwindow = 1907,
        /// <summary>
        /// Enum Sensors for value: sensors
        /// </summary>
        [EnumMember(Value = "sensors")]
        Sensors = 1908,
        /// <summary>
        /// Enum Sensorsoff for value: sensors_off
        /// </summary>
        [EnumMember(Value = "sensors_off")]
        Sensorsoff = 1909,
        /// <summary>
        /// Enum Sentimentsatisfiedalt for value: sentiment_satisfied_alt
        /// </summary>
        [EnumMember(Value = "sentiment_satisfied_alt")]
        Sentimentsatisfiedalt = 1910,
        /// <summary>
        /// Enum Setmeal for value: set_meal
        /// </summary>
        [EnumMember(Value = "set_meal")]
        Setmeal = 1911,
        /// <summary>
        /// Enum Settingsaccessibility for value: settings_accessibility
        /// </summary>
        [EnumMember(Value = "settings_accessibility")]
        Settingsaccessibility = 1912,
        /// <summary>
        /// Enum Settingsdisplay for value: settings_display
        /// </summary>
        [EnumMember(Value = "settings_display")]
        Settingsdisplay = 1913,
        /// <summary>
        /// Enum Settingssuggest for value: settings_suggest
        /// </summary>
        [EnumMember(Value = "settings_suggest")]
        Settingssuggest = 1914,
        /// <summary>
        /// Enum Severecold for value: severe_cold
        /// </summary>
        [EnumMember(Value = "severe_cold")]
        Severecold = 1915,
        /// <summary>
        /// Enum Shapeline for value: shape_line
        /// </summary>
        [EnumMember(Value = "shape_line")]
        Shapeline = 1916,
        /// <summary>
        /// Enum Sharearrivaltime for value: share_arrival_time
        /// </summary>
        [EnumMember(Value = "share_arrival_time")]
        Sharearrivaltime = 1917,
        /// <summary>
        /// Enum Sharelocation for value: share_location
        /// </summary>
        [EnumMember(Value = "share_location")]
        Sharelocation = 1918,
        /// <summary>
        /// Enum Shield for value: shield
        /// </summary>
        [EnumMember(Value = "shield")]
        Shield = 1919,
        /// <summary>
        /// Enum Shieldmoon for value: shield_moon
        /// </summary>
        [EnumMember(Value = "shield_moon")]
        Shieldmoon = 1920,
        /// <summary>
        /// Enum Shop2 for value: shop_2
        /// </summary>
        [EnumMember(Value = "shop_2")]
        Shop2 = 1921,
        /// <summary>
        /// Enum Shopify for value: shopify
        /// </summary>
        [EnumMember(Value = "shopify")]
        Shopify = 1922,
        /// <summary>
        /// Enum Shoppingbag for value: shopping_bag
        /// </summary>
        [EnumMember(Value = "shopping_bag")]
        Shoppingbag = 1923,
        /// <summary>
        /// Enum Shoppingcartcheckout for value: shopping_cart_checkout
        /// </summary>
        [EnumMember(Value = "shopping_cart_checkout")]
        Shoppingcartcheckout = 1924,
        /// <summary>
        /// Enum Shortcut for value: shortcut
        /// </summary>
        [EnumMember(Value = "shortcut")]
        Shortcut = 1925,
        /// <summary>
        /// Enum Shower for value: shower
        /// </summary>
        [EnumMember(Value = "shower")]
        Shower = 1926,
        /// <summary>
        /// Enum Shuffleon for value: shuffle_on
        /// </summary>
        [EnumMember(Value = "shuffle_on")]
        Shuffleon = 1927,
        /// <summary>
        /// Enum Shutterspeed for value: shutter_speed
        /// </summary>
        [EnumMember(Value = "shutter_speed")]
        Shutterspeed = 1928,
        /// <summary>
        /// Enum Sick for value: sick
        /// </summary>
        [EnumMember(Value = "sick")]
        Sick = 1929,
        /// <summary>
        /// Enum Signlanguage for value: sign_language
        /// </summary>
        [EnumMember(Value = "sign_language")]
        Signlanguage = 1930,
        /// <summary>
        /// Enum Signalcellular0bar for value: signal_cellular_0_bar
        /// </summary>
        [EnumMember(Value = "signal_cellular_0_bar")]
        Signalcellular0bar = 1931,
        /// <summary>
        /// Enum Signalcellularalt for value: signal_cellular_alt
        /// </summary>
        [EnumMember(Value = "signal_cellular_alt")]
        Signalcellularalt = 1932,
        /// <summary>
        /// Enum Signalcellularalt1bar for value: signal_cellular_alt_1_bar
        /// </summary>
        [EnumMember(Value = "signal_cellular_alt_1_bar")]
        Signalcellularalt1bar = 1933,
        /// <summary>
        /// Enum Signalcellularalt2bar for value: signal_cellular_alt_2_bar
        /// </summary>
        [EnumMember(Value = "signal_cellular_alt_2_bar")]
        Signalcellularalt2bar = 1934,
        /// <summary>
        /// Enum Signalcellularconnectednointernet0bar for value: signal_cellular_connected_no_internet_0_bar
        /// </summary>
        [EnumMember(Value = "signal_cellular_connected_no_internet_0_bar")]
        Signalcellularconnectednointernet0bar = 1935,
        /// <summary>
        /// Enum Signalcellularnodata for value: signal_cellular_nodata
        /// </summary>
        [EnumMember(Value = "signal_cellular_nodata")]
        Signalcellularnodata = 1936,
        /// <summary>
        /// Enum Signalwifi0bar for value: signal_wifi_0_bar
        /// </summary>
        [EnumMember(Value = "signal_wifi_0_bar")]
        Signalwifi0bar = 1937,
        /// <summary>
        /// Enum Signalwifibad for value: signal_wifi_bad
        /// </summary>
        [EnumMember(Value = "signal_wifi_bad")]
        Signalwifibad = 1938,
        /// <summary>
        /// Enum Signalwificonnectednointernet4 for value: signal_wifi_connected_no_internet_4
        /// </summary>
        [EnumMember(Value = "signal_wifi_connected_no_internet_4")]
        Signalwificonnectednointernet4 = 1939,
        /// <summary>
        /// Enum Signalwifistatusbar4bar for value: signal_wifi_statusbar_4_bar
        /// </summary>
        [EnumMember(Value = "signal_wifi_statusbar_4_bar")]
        Signalwifistatusbar4bar = 1940,
        /// <summary>
        /// Enum Signalwifistatusbarnull for value: signal_wifi_statusbar_null
        /// </summary>
        [EnumMember(Value = "signal_wifi_statusbar_null")]
        Signalwifistatusbarnull = 1941,
        /// <summary>
        /// Enum Signpost for value: signpost
        /// </summary>
        [EnumMember(Value = "signpost")]
        Signpost = 1942,
        /// <summary>
        /// Enum Simcarddownload for value: sim_card_download
        /// </summary>
        [EnumMember(Value = "sim_card_download")]
        Simcarddownload = 1943,
        /// <summary>
        /// Enum Singlebed for value: single_bed
        /// </summary>
        [EnumMember(Value = "single_bed")]
        Singlebed = 1944,
        /// <summary>
        /// Enum Sip for value: sip
        /// </summary>
        [EnumMember(Value = "sip")]
        Sip = 1945,
        /// <summary>
        /// Enum Skateboarding for value: skateboarding
        /// </summary>
        [EnumMember(Value = "skateboarding")]
        Skateboarding = 1946,
        /// <summary>
        /// Enum Sledding for value: sledding
        /// </summary>
        [EnumMember(Value = "sledding")]
        Sledding = 1947,
        /// <summary>
        /// Enum Smartbutton for value: smart_button
        /// </summary>
        [EnumMember(Value = "smart_button")]
        Smartbutton = 1948,
        /// <summary>
        /// Enum Smartdisplay for value: smart_display
        /// </summary>
        [EnumMember(Value = "smart_display")]
        Smartdisplay = 1949,
        /// <summary>
        /// Enum Smartscreen for value: smart_screen
        /// </summary>
        [EnumMember(Value = "smart_screen")]
        Smartscreen = 1950,
        /// <summary>
        /// Enum Smarttoy for value: smart_toy
        /// </summary>
        [EnumMember(Value = "smart_toy")]
        Smarttoy = 1951,
        /// <summary>
        /// Enum Snapchat for value: snapchat
        /// </summary>
        [EnumMember(Value = "snapchat")]
        Snapchat = 1952,
        /// <summary>
        /// Enum Snippetfolder for value: snippet_folder
        /// </summary>
        [EnumMember(Value = "snippet_folder")]
        Snippetfolder = 1953,
        /// <summary>
        /// Enum Snowboarding for value: snowboarding
        /// </summary>
        [EnumMember(Value = "snowboarding")]
        Snowboarding = 1954,
        /// <summary>
        /// Enum Snowmobile for value: snowmobile
        /// </summary>
        [EnumMember(Value = "snowmobile")]
        Snowmobile = 1955,
        /// <summary>
        /// Enum Snowshoeing for value: snowshoeing
        /// </summary>
        [EnumMember(Value = "snowshoeing")]
        Snowshoeing = 1956,
        /// <summary>
        /// Enum Soap for value: soap
        /// </summary>
        [EnumMember(Value = "soap")]
        Soap = 1957,
        /// <summary>
        /// Enum Socialdistance for value: social_distance
        /// </summary>
        [EnumMember(Value = "social_distance")]
        Socialdistance = 1958,
        /// <summary>
        /// Enum Solarpower for value: solar_power
        /// </summary>
        [EnumMember(Value = "solar_power")]
        Solarpower = 1959,
        /// <summary>
        /// Enum Sos for value: sos
        /// </summary>
        [EnumMember(Value = "sos")]
        Sos = 1960,
        /// <summary>
        /// Enum Soupkitchen for value: soup_kitchen
        /// </summary>
        [EnumMember(Value = "soup_kitchen")]
        Soupkitchen = 1961,
        /// <summary>
        /// Enum Source for value: source
        /// </summary>
        [EnumMember(Value = "source")]
        Source = 1962,
        /// <summary>
        /// Enum South for value: south
        /// </summary>
        [EnumMember(Value = "south")]
        South = 1963,
        /// <summary>
        /// Enum Southamerica for value: south_america
        /// </summary>
        [EnumMember(Value = "south_america")]
        Southamerica = 1964,
        /// <summary>
        /// Enum Southeast for value: south_east
        /// </summary>
        [EnumMember(Value = "south_east")]
        Southeast = 1965,
        /// <summary>
        /// Enum Southwest for value: south_west
        /// </summary>
        [EnumMember(Value = "south_west")]
        Southwest = 1966,
        /// <summary>
        /// Enum Spacedashboard for value: space_dashboard
        /// </summary>
        [EnumMember(Value = "space_dashboard")]
        Spacedashboard = 1967,
        /// <summary>
        /// Enum Spatialaudio for value: spatial_audio
        /// </summary>
        [EnumMember(Value = "spatial_audio")]
        Spatialaudio = 1968,
        /// <summary>
        /// Enum Spatialaudiooff for value: spatial_audio_off
        /// </summary>
        [EnumMember(Value = "spatial_audio_off")]
        Spatialaudiooff = 1969,
        /// <summary>
        /// Enum Spatialtracking for value: spatial_tracking
        /// </summary>
        [EnumMember(Value = "spatial_tracking")]
        Spatialtracking = 1970,
        /// <summary>
        /// Enum Speed for value: speed
        /// </summary>
        [EnumMember(Value = "speed")]
        Speed = 1971,
        /// <summary>
        /// Enum Splitscreen for value: splitscreen
        /// </summary>
        [EnumMember(Value = "splitscreen")]
        Splitscreen = 1972,
        /// <summary>
        /// Enum Spoke for value: spoke
        /// </summary>
        [EnumMember(Value = "spoke")]
        Spoke = 1973,
        /// <summary>
        /// Enum Sports for value: sports
        /// </summary>
        [EnumMember(Value = "sports")]
        Sports = 1974,
        /// <summary>
        /// Enum Sportsbar for value: sports_bar
        /// </summary>
        [EnumMember(Value = "sports_bar")]
        Sportsbar = 1975,
        /// <summary>
        /// Enum Sportsbaseball for value: sports_baseball
        /// </summary>
        [EnumMember(Value = "sports_baseball")]
        Sportsbaseball = 1976,
        /// <summary>
        /// Enum Sportsbasketball for value: sports_basketball
        /// </summary>
        [EnumMember(Value = "sports_basketball")]
        Sportsbasketball = 1977,
        /// <summary>
        /// Enum Sportscricket for value: sports_cricket
        /// </summary>
        [EnumMember(Value = "sports_cricket")]
        Sportscricket = 1978,
        /// <summary>
        /// Enum Sportsesports for value: sports_esports
        /// </summary>
        [EnumMember(Value = "sports_esports")]
        Sportsesports = 1979,
        /// <summary>
        /// Enum Sportsfootball for value: sports_football
        /// </summary>
        [EnumMember(Value = "sports_football")]
        Sportsfootball = 1980,
        /// <summary>
        /// Enum Sportsgolf for value: sports_golf
        /// </summary>
        [EnumMember(Value = "sports_golf")]
        Sportsgolf = 1981,
        /// <summary>
        /// Enum Sportsgymnastics for value: sports_gymnastics
        /// </summary>
        [EnumMember(Value = "sports_gymnastics")]
        Sportsgymnastics = 1982,
        /// <summary>
        /// Enum Sportshandball for value: sports_handball
        /// </summary>
        [EnumMember(Value = "sports_handball")]
        Sportshandball = 1983,
        /// <summary>
        /// Enum Sportshockey for value: sports_hockey
        /// </summary>
        [EnumMember(Value = "sports_hockey")]
        Sportshockey = 1984,
        /// <summary>
        /// Enum Sportskabaddi for value: sports_kabaddi
        /// </summary>
        [EnumMember(Value = "sports_kabaddi")]
        Sportskabaddi = 1985,
        /// <summary>
        /// Enum Sportsmartialarts for value: sports_martial_arts
        /// </summary>
        [EnumMember(Value = "sports_martial_arts")]
        Sportsmartialarts = 1986,
        /// <summary>
        /// Enum Sportsmma for value: sports_mma
        /// </summary>
        [EnumMember(Value = "sports_mma")]
        Sportsmma = 1987,
        /// <summary>
        /// Enum Sportsmotorsports for value: sports_motorsports
        /// </summary>
        [EnumMember(Value = "sports_motorsports")]
        Sportsmotorsports = 1988,
        /// <summary>
        /// Enum Sportsrugby for value: sports_rugby
        /// </summary>
        [EnumMember(Value = "sports_rugby")]
        Sportsrugby = 1989,
        /// <summary>
        /// Enum Sportsscore for value: sports_score
        /// </summary>
        [EnumMember(Value = "sports_score")]
        Sportsscore = 1990,
        /// <summary>
        /// Enum Sportssoccer for value: sports_soccer
        /// </summary>
        [EnumMember(Value = "sports_soccer")]
        Sportssoccer = 1991,
        /// <summary>
        /// Enum Sportstennis for value: sports_tennis
        /// </summary>
        [EnumMember(Value = "sports_tennis")]
        Sportstennis = 1992,
        /// <summary>
        /// Enum Sportsvolleyball for value: sports_volleyball
        /// </summary>
        [EnumMember(Value = "sports_volleyball")]
        Sportsvolleyball = 1993,
        /// <summary>
        /// Enum Square for value: square
        /// </summary>
        [EnumMember(Value = "square")]
        Square = 1994,
        /// <summary>
        /// Enum Squarefoot for value: square_foot
        /// </summary>
        [EnumMember(Value = "square_foot")]
        Squarefoot = 1995,
        /// <summary>
        /// Enum Ssidchart for value: ssid_chart
        /// </summary>
        [EnumMember(Value = "ssid_chart")]
        Ssidchart = 1996,
        /// <summary>
        /// Enum Stackedbarchart for value: stacked_bar_chart
        /// </summary>
        [EnumMember(Value = "stacked_bar_chart")]
        Stackedbarchart = 1997,
        /// <summary>
        /// Enum Stackedlinechart for value: stacked_line_chart
        /// </summary>
        [EnumMember(Value = "stacked_line_chart")]
        Stackedlinechart = 1998,
        /// <summary>
        /// Enum Stadium for value: stadium
        /// </summary>
        [EnumMember(Value = "stadium")]
        Stadium = 1999,
        /// <summary>
        /// Enum Stairs for value: stairs
        /// </summary>
        [EnumMember(Value = "stairs")]
        Stairs = 2000,
        /// <summary>
        /// Enum Starborderpurple500 for value: star_border_purple500
        /// </summary>
        [EnumMember(Value = "star_border_purple500")]
        Starborderpurple500 = 2001,
        /// <summary>
        /// Enum Staroutline for value: star_outline
        /// </summary>
        [EnumMember(Value = "star_outline")]
        Staroutline = 2002,
        /// <summary>
        /// Enum Starpurple500 for value: star_purple500
        /// </summary>
        [EnumMember(Value = "star_purple500")]
        Starpurple500 = 2003,
        /// <summary>
        /// Enum Starrate for value: star_rate
        /// </summary>
        [EnumMember(Value = "star_rate")]
        Starrate = 2004,
        /// <summary>
        /// Enum Start for value: start
        /// </summary>
        [EnumMember(Value = "start")]
        Start = 2005,
        /// <summary>
        /// Enum Stickynote2 for value: sticky_note_2
        /// </summary>
        [EnumMember(Value = "sticky_note_2")]
        Stickynote2 = 2006,
        /// <summary>
        /// Enum Stopcircle for value: stop_circle
        /// </summary>
        [EnumMember(Value = "stop_circle")]
        Stopcircle = 2007,
        /// <summary>
        /// Enum Storefront for value: storefront
        /// </summary>
        [EnumMember(Value = "storefront")]
        Storefront = 2008,
        /// <summary>
        /// Enum Storm for value: storm
        /// </summary>
        [EnumMember(Value = "storm")]
        Storm = 2009,
        /// <summary>
        /// Enum Straight for value: straight
        /// </summary>
        [EnumMember(Value = "straight")]
        Straight = 2010,
        /// <summary>
        /// Enum Stream for value: stream
        /// </summary>
        [EnumMember(Value = "stream")]
        Stream = 2011,
        /// <summary>
        /// Enum Stroller for value: stroller
        /// </summary>
        [EnumMember(Value = "stroller")]
        Stroller = 2012,
        /// <summary>
        /// Enum Subscript for value: subscript
        /// </summary>
        [EnumMember(Value = "subscript")]
        Subscript = 2013,
        /// <summary>
        /// Enum Subtitlesoff for value: subtitles_off
        /// </summary>
        [EnumMember(Value = "subtitles_off")]
        Subtitlesoff = 2014,
        /// <summary>
        /// Enum Summarize for value: summarize
        /// </summary>
        [EnumMember(Value = "summarize")]
        Summarize = 2015,
        /// <summary>
        /// Enum Superscript for value: superscript
        /// </summary>
        [EnumMember(Value = "superscript")]
        Superscript = 2016,
        /// <summary>
        /// Enum Supervisedusercircle for value: supervised_user_circle
        /// </summary>
        [EnumMember(Value = "supervised_user_circle")]
        Supervisedusercircle = 2017,
        /// <summary>
        /// Enum Support for value: support
        /// </summary>
        [EnumMember(Value = "support")]
        Support = 2018,
        /// <summary>
        /// Enum Supportagent for value: support_agent
        /// </summary>
        [EnumMember(Value = "support_agent")]
        Supportagent = 2019,
        /// <summary>
        /// Enum Surfing for value: surfing
        /// </summary>
        [EnumMember(Value = "surfing")]
        Surfing = 2020,
        /// <summary>
        /// Enum Swaphorizontalcircle for value: swap_horizontal_circle
        /// </summary>
        [EnumMember(Value = "swap_horizontal_circle")]
        Swaphorizontalcircle = 2021,
        /// <summary>
        /// Enum Swapvertcircle for value: swap_vert_circle
        /// </summary>
        [EnumMember(Value = "swap_vert_circle")]
        Swapvertcircle = 2022,
        /// <summary>
        /// Enum Swipe for value: swipe
        /// </summary>
        [EnumMember(Value = "swipe")]
        Swipe = 2023,
        /// <summary>
        /// Enum Swipedown for value: swipe_down
        /// </summary>
        [EnumMember(Value = "swipe_down")]
        Swipedown = 2024,
        /// <summary>
        /// Enum Swipedownalt for value: swipe_down_alt
        /// </summary>
        [EnumMember(Value = "swipe_down_alt")]
        Swipedownalt = 2025,
        /// <summary>
        /// Enum Swipeleft for value: swipe_left
        /// </summary>
        [EnumMember(Value = "swipe_left")]
        Swipeleft = 2026,
        /// <summary>
        /// Enum Swipeleftalt for value: swipe_left_alt
        /// </summary>
        [EnumMember(Value = "swipe_left_alt")]
        Swipeleftalt = 2027,
        /// <summary>
        /// Enum Swiperight for value: swipe_right
        /// </summary>
        [EnumMember(Value = "swipe_right")]
        Swiperight = 2028,
        /// <summary>
        /// Enum Swiperightalt for value: swipe_right_alt
        /// </summary>
        [EnumMember(Value = "swipe_right_alt")]
        Swiperightalt = 2029,
        /// <summary>
        /// Enum Swipeup for value: swipe_up
        /// </summary>
        [EnumMember(Value = "swipe_up")]
        Swipeup = 2030,
        /// <summary>
        /// Enum Swipeupalt for value: swipe_up_alt
        /// </summary>
        [EnumMember(Value = "swipe_up_alt")]
        Swipeupalt = 2031,
        /// <summary>
        /// Enum Swipevertical for value: swipe_vertical
        /// </summary>
        [EnumMember(Value = "swipe_vertical")]
        Swipevertical = 2032,
        /// <summary>
        /// Enum Switchaccessshortcut for value: switch_access_shortcut
        /// </summary>
        [EnumMember(Value = "switch_access_shortcut")]
        Switchaccessshortcut = 2033,
        /// <summary>
        /// Enum Switchaccessshortcutadd for value: switch_access_shortcut_add
        /// </summary>
        [EnumMember(Value = "switch_access_shortcut_add")]
        Switchaccessshortcutadd = 2034,
        /// <summary>
        /// Enum Switchaccount for value: switch_account
        /// </summary>
        [EnumMember(Value = "switch_account")]
        Switchaccount = 2035,
        /// <summary>
        /// Enum Switchleft for value: switch_left
        /// </summary>
        [EnumMember(Value = "switch_left")]
        Switchleft = 2036,
        /// <summary>
        /// Enum Switchright for value: switch_right
        /// </summary>
        [EnumMember(Value = "switch_right")]
        Switchright = 2037,
        /// <summary>
        /// Enum Synagogue for value: synagogue
        /// </summary>
        [EnumMember(Value = "synagogue")]
        Synagogue = 2038,
        /// <summary>
        /// Enum Synclock for value: sync_lock
        /// </summary>
        [EnumMember(Value = "sync_lock")]
        Synclock = 2039,
        /// <summary>
        /// Enum Systemsecurityupdate for value: system_security_update
        /// </summary>
        [EnumMember(Value = "system_security_update")]
        Systemsecurityupdate = 2040,
        /// <summary>
        /// Enum Systemsecurityupdategood for value: system_security_update_good
        /// </summary>
        [EnumMember(Value = "system_security_update_good")]
        Systemsecurityupdategood = 2041,
        /// <summary>
        /// Enum Systemsecurityupdatewarning for value: system_security_update_warning
        /// </summary>
        [EnumMember(Value = "system_security_update_warning")]
        Systemsecurityupdatewarning = 2042,
        /// <summary>
        /// Enum Systemupdatetv for value: system_update_tv
        /// </summary>
        [EnumMember(Value = "system_update_tv")]
        Systemupdatetv = 2043,
        /// <summary>
        /// Enum Tablebar for value: table_bar
        /// </summary>
        [EnumMember(Value = "table_bar")]
        Tablebar = 2044,
        /// <summary>
        /// Enum Tablechart for value: table_chart
        /// </summary>
        [EnumMember(Value = "table_chart")]
        Tablechart = 2045,
        /// <summary>
        /// Enum Tablerestaurant for value: table_restaurant
        /// </summary>
        [EnumMember(Value = "table_restaurant")]
        Tablerestaurant = 2046,
        /// <summary>
        /// Enum Tablerows for value: table_rows
        /// </summary>
        [EnumMember(Value = "table_rows")]
        Tablerows = 2047,
        /// <summary>
        /// Enum Tableview for value: table_view
        /// </summary>
        [EnumMember(Value = "table_view")]
        Tableview = 2048,
        /// <summary>
        /// Enum Tag for value: tag
        /// </summary>
        [EnumMember(Value = "tag")]
        Tag = 2049,
        /// <summary>
        /// Enum Takeoutdining for value: takeout_dining
        /// </summary>
        [EnumMember(Value = "takeout_dining")]
        Takeoutdining = 2050,
        /// <summary>
        /// Enum Tapas for value: tapas
        /// </summary>
        [EnumMember(Value = "tapas")]
        Tapas = 2051,
        /// <summary>
        /// Enum Task for value: task
        /// </summary>
        [EnumMember(Value = "task")]
        Task = 2052,
        /// <summary>
        /// Enum Taskalt for value: task_alt
        /// </summary>
        [EnumMember(Value = "task_alt")]
        Taskalt = 2053,
        /// <summary>
        /// Enum Taxialert for value: taxi_alert
        /// </summary>
        [EnumMember(Value = "taxi_alert")]
        Taxialert = 2054,
        /// <summary>
        /// Enum Telegram for value: telegram
        /// </summary>
        [EnumMember(Value = "telegram")]
        Telegram = 2055,
        /// <summary>
        /// Enum Templebuddhist for value: temple_buddhist
        /// </summary>
        [EnumMember(Value = "temple_buddhist")]
        Templebuddhist = 2056,
        /// <summary>
        /// Enum Templehindu for value: temple_hindu
        /// </summary>
        [EnumMember(Value = "temple_hindu")]
        Templehindu = 2057,
        /// <summary>
        /// Enum Terminal for value: terminal
        /// </summary>
        [EnumMember(Value = "terminal")]
        Terminal = 2058,
        /// <summary>
        /// Enum Textdecrease for value: text_decrease
        /// </summary>
        [EnumMember(Value = "text_decrease")]
        Textdecrease = 2059,
        /// <summary>
        /// Enum Textincrease for value: text_increase
        /// </summary>
        [EnumMember(Value = "text_increase")]
        Textincrease = 2060,
        /// <summary>
        /// Enum Textrotateup for value: text_rotate_up
        /// </summary>
        [EnumMember(Value = "text_rotate_up")]
        Textrotateup = 2061,
        /// <summary>
        /// Enum Textrotatevertical for value: text_rotate_vertical
        /// </summary>
        [EnumMember(Value = "text_rotate_vertical")]
        Textrotatevertical = 2062,
        /// <summary>
        /// Enum Textrotationangledown for value: text_rotation_angledown
        /// </summary>
        [EnumMember(Value = "text_rotation_angledown")]
        Textrotationangledown = 2063,
        /// <summary>
        /// Enum Textrotationangleup for value: text_rotation_angleup
        /// </summary>
        [EnumMember(Value = "text_rotation_angleup")]
        Textrotationangleup = 2064,
        /// <summary>
        /// Enum Textrotationdown for value: text_rotation_down
        /// </summary>
        [EnumMember(Value = "text_rotation_down")]
        Textrotationdown = 2065,
        /// <summary>
        /// Enum Textrotationnone for value: text_rotation_none
        /// </summary>
        [EnumMember(Value = "text_rotation_none")]
        Textrotationnone = 2066,
        /// <summary>
        /// Enum Textsnippet for value: text_snippet
        /// </summary>
        [EnumMember(Value = "text_snippet")]
        Textsnippet = 2067,
        /// <summary>
        /// Enum Theatercomedy for value: theater_comedy
        /// </summary>
        [EnumMember(Value = "theater_comedy")]
        Theatercomedy = 2068,
        /// <summary>
        /// Enum Thermostat for value: thermostat
        /// </summary>
        [EnumMember(Value = "thermostat")]
        Thermostat = 2069,
        /// <summary>
        /// Enum Thermostatauto for value: thermostat_auto
        /// </summary>
        [EnumMember(Value = "thermostat_auto")]
        Thermostatauto = 2070,
        /// <summary>
        /// Enum Thumbdownalt for value: thumb_down_alt
        /// </summary>
        [EnumMember(Value = "thumb_down_alt")]
        Thumbdownalt = 2071,
        /// <summary>
        /// Enum Thumbdownoffalt for value: thumb_down_off_alt
        /// </summary>
        [EnumMember(Value = "thumb_down_off_alt")]
        Thumbdownoffalt = 2072,
        /// <summary>
        /// Enum Thumbupalt for value: thumb_up_alt
        /// </summary>
        [EnumMember(Value = "thumb_up_alt")]
        Thumbupalt = 2073,
        /// <summary>
        /// Enum Thumbupoffalt for value: thumb_up_off_alt
        /// </summary>
        [EnumMember(Value = "thumb_up_off_alt")]
        Thumbupoffalt = 2074,
        /// <summary>
        /// Enum Thunderstorm for value: thunderstorm
        /// </summary>
        [EnumMember(Value = "thunderstorm")]
        Thunderstorm = 2075,
        /// <summary>
        /// Enum Tiktok for value: tiktok
        /// </summary>
        [EnumMember(Value = "tiktok")]
        Tiktok = 2076,
        /// <summary>
        /// Enum Timer10select for value: timer_10_select
        /// </summary>
        [EnumMember(Value = "timer_10_select")]
        Timer10select = 2077,
        /// <summary>
        /// Enum Timer3select for value: timer_3_select
        /// </summary>
        [EnumMember(Value = "timer_3_select")]
        Timer3select = 2078,
        /// <summary>
        /// Enum Tipsandupdates for value: tips_and_updates
        /// </summary>
        [EnumMember(Value = "tips_and_updates")]
        Tipsandupdates = 2079,
        /// <summary>
        /// Enum Tirerepair for value: tire_repair
        /// </summary>
        [EnumMember(Value = "tire_repair")]
        Tirerepair = 2080,
        /// <summary>
        /// Enum Toggleoff for value: toggle_off
        /// </summary>
        [EnumMember(Value = "toggle_off")]
        Toggleoff = 2081,
        /// <summary>
        /// Enum Toggleon for value: toggle_on
        /// </summary>
        [EnumMember(Value = "toggle_on")]
        Toggleon = 2082,
        /// <summary>
        /// Enum Token for value: token
        /// </summary>
        [EnumMember(Value = "token")]
        Token = 2083,
        /// <summary>
        /// Enum Topic for value: topic
        /// </summary>
        [EnumMember(Value = "topic")]
        Topic = 2084,
        /// <summary>
        /// Enum Tornado for value: tornado
        /// </summary>
        [EnumMember(Value = "tornado")]
        Tornado = 2085,
        /// <summary>
        /// Enum Tour for value: tour
        /// </summary>
        [EnumMember(Value = "tour")]
        Tour = 2086,
        /// <summary>
        /// Enum Transcribe for value: transcribe
        /// </summary>
        [EnumMember(Value = "transcribe")]
        Transcribe = 2087,
        /// <summary>
        /// Enum Transgender for value: transgender
        /// </summary>
        [EnumMember(Value = "transgender")]
        Transgender = 2088,
        /// <summary>
        /// Enum Transitenterexit for value: transit_enterexit
        /// </summary>
        [EnumMember(Value = "transit_enterexit")]
        Transitenterexit = 2089,
        /// <summary>
        /// Enum Travelexplore for value: travel_explore
        /// </summary>
        [EnumMember(Value = "travel_explore")]
        Travelexplore = 2090,
        /// <summary>
        /// Enum Trendingneutral for value: trending_neutral
        /// </summary>
        [EnumMember(Value = "trending_neutral")]
        Trendingneutral = 2091,
        /// <summary>
        /// Enum Troubleshoot for value: troubleshoot
        /// </summary>
        [EnumMember(Value = "troubleshoot")]
        Troubleshoot = 2092,
        /// <summary>
        /// Enum Try for value: try
        /// </summary>
        [EnumMember(Value = "try")]
        Try = 2093,
        /// <summary>
        /// Enum Tsunami for value: tsunami
        /// </summary>
        [EnumMember(Value = "tsunami")]
        Tsunami = 2094,
        /// <summary>
        /// Enum Tty for value: tty
        /// </summary>
        [EnumMember(Value = "tty")]
        Tty = 2095,
        /// <summary>
        /// Enum Tungsten for value: tungsten
        /// </summary>
        [EnumMember(Value = "tungsten")]
        Tungsten = 2096,
        /// <summary>
        /// Enum Turnleft for value: turn_left
        /// </summary>
        [EnumMember(Value = "turn_left")]
        Turnleft = 2097,
        /// <summary>
        /// Enum Turnright for value: turn_right
        /// </summary>
        [EnumMember(Value = "turn_right")]
        Turnright = 2098,
        /// <summary>
        /// Enum Turnsharpleft for value: turn_sharp_left
        /// </summary>
        [EnumMember(Value = "turn_sharp_left")]
        Turnsharpleft = 2099,
        /// <summary>
        /// Enum Turnsharpright for value: turn_sharp_right
        /// </summary>
        [EnumMember(Value = "turn_sharp_right")]
        Turnsharpright = 2100,
        /// <summary>
        /// Enum Turnslightleft for value: turn_slight_left
        /// </summary>
        [EnumMember(Value = "turn_slight_left")]
        Turnslightleft = 2101,
        /// <summary>
        /// Enum Turnslightright for value: turn_slight_right
        /// </summary>
        [EnumMember(Value = "turn_slight_right")]
        Turnslightright = 2102,
        /// <summary>
        /// Enum Tvoff for value: tv_off
        /// </summary>
        [EnumMember(Value = "tv_off")]
        Tvoff = 2103,
        /// <summary>
        /// Enum Twowheeler for value: two_wheeler
        /// </summary>
        [EnumMember(Value = "two_wheeler")]
        Twowheeler = 2104,
        /// <summary>
        /// Enum Typespecimen for value: type_specimen
        /// </summary>
        [EnumMember(Value = "type_specimen")]
        Typespecimen = 2105,
        /// <summary>
        /// Enum Uturnleft for value: u_turn_left
        /// </summary>
        [EnumMember(Value = "u_turn_left")]
        Uturnleft = 2106,
        /// <summary>
        /// Enum Uturnright for value: u_turn_right
        /// </summary>
        [EnumMember(Value = "u_turn_right")]
        Uturnright = 2107,
        /// <summary>
        /// Enum Umbrella for value: umbrella
        /// </summary>
        [EnumMember(Value = "umbrella")]
        Umbrella = 2108,
        /// <summary>
        /// Enum Unfoldlessdouble for value: unfold_less_double
        /// </summary>
        [EnumMember(Value = "unfold_less_double")]
        Unfoldlessdouble = 2109,
        /// <summary>
        /// Enum Unfoldmoredouble for value: unfold_more_double
        /// </summary>
        [EnumMember(Value = "unfold_more_double")]
        Unfoldmoredouble = 2110,
        /// <summary>
        /// Enum Unpublished for value: unpublished
        /// </summary>
        [EnumMember(Value = "unpublished")]
        Unpublished = 2111,
        /// <summary>
        /// Enum Unsubscribe for value: unsubscribe
        /// </summary>
        [EnumMember(Value = "unsubscribe")]
        Unsubscribe = 2112,
        /// <summary>
        /// Enum Upcoming for value: upcoming
        /// </summary>
        [EnumMember(Value = "upcoming")]
        Upcoming = 2113,
        /// <summary>
        /// Enum Updatedisabled for value: update_disabled
        /// </summary>
        [EnumMember(Value = "update_disabled")]
        Updatedisabled = 2114,
        /// <summary>
        /// Enum Upgrade for value: upgrade
        /// </summary>
        [EnumMember(Value = "upgrade")]
        Upgrade = 2115,
        /// <summary>
        /// Enum Upload for value: upload
        /// </summary>
        [EnumMember(Value = "upload")]
        Upload = 2116,
        /// <summary>
        /// Enum Uploadfile for value: upload_file
        /// </summary>
        [EnumMember(Value = "upload_file")]
        Uploadfile = 2117,
        /// <summary>
        /// Enum Usboff for value: usb_off
        /// </summary>
        [EnumMember(Value = "usb_off")]
        Usboff = 2118,
        /// <summary>
        /// Enum Vaccines for value: vaccines
        /// </summary>
        [EnumMember(Value = "vaccines")]
        Vaccines = 2119,
        /// <summary>
        /// Enum Vapefree for value: vape_free
        /// </summary>
        [EnumMember(Value = "vape_free")]
        Vapefree = 2120,
        /// <summary>
        /// Enum Vapingrooms for value: vaping_rooms
        /// </summary>
        [EnumMember(Value = "vaping_rooms")]
        Vapingrooms = 2121,
        /// <summary>
        /// Enum Verified for value: verified
        /// </summary>
        [EnumMember(Value = "verified")]
        Verified = 2122,
        /// <summary>
        /// Enum Verticaldistribute for value: vertical_distribute
        /// </summary>
        [EnumMember(Value = "vertical_distribute")]
        Verticaldistribute = 2123,
        /// <summary>
        /// Enum Verticalshades for value: vertical_shades
        /// </summary>
        [EnumMember(Value = "vertical_shades")]
        Verticalshades = 2124,
        /// <summary>
        /// Enum Verticalshadesclosed for value: vertical_shades_closed
        /// </summary>
        [EnumMember(Value = "vertical_shades_closed")]
        Verticalshadesclosed = 2125,
        /// <summary>
        /// Enum Verticalsplit for value: vertical_split
        /// </summary>
        [EnumMember(Value = "vertical_split")]
        Verticalsplit = 2126,
        /// <summary>
        /// Enum Videocameraback for value: video_camera_back
        /// </summary>
        [EnumMember(Value = "video_camera_back")]
        Videocameraback = 2127,
        /// <summary>
        /// Enum Videocamerafront for value: video_camera_front
        /// </summary>
        [EnumMember(Value = "video_camera_front")]
        Videocamerafront = 2128,
        /// <summary>
        /// Enum Videochat for value: video_chat
        /// </summary>
        [EnumMember(Value = "video_chat")]
        Videochat = 2129,
        /// <summary>
        /// Enum Videocollection for value: video_collection
        /// </summary>
        [EnumMember(Value = "video_collection")]
        Videocollection = 2130,
        /// <summary>
        /// Enum Videofile for value: video_file
        /// </summary>
        [EnumMember(Value = "video_file")]
        Videofile = 2131,
        /// <summary>
        /// Enum Videosettings for value: video_settings
        /// </summary>
        [EnumMember(Value = "video_settings")]
        Videosettings = 2132,
        /// <summary>
        /// Enum Videostable for value: video_stable
        /// </summary>
        [EnumMember(Value = "video_stable")]
        Videostable = 2133,
        /// <summary>
        /// Enum Videogameassetoff for value: videogame_asset_off
        /// </summary>
        [EnumMember(Value = "videogame_asset_off")]
        Videogameassetoff = 2134,
        /// <summary>
        /// Enum Viewcomfortable for value: view_comfortable
        /// </summary>
        [EnumMember(Value = "view_comfortable")]
        Viewcomfortable = 2135,
        /// <summary>
        /// Enum Viewcomfyalt for value: view_comfy_alt
        /// </summary>
        [EnumMember(Value = "view_comfy_alt")]
        Viewcomfyalt = 2136,
        /// <summary>
        /// Enum Viewcompactalt for value: view_compact_alt
        /// </summary>
        [EnumMember(Value = "view_compact_alt")]
        Viewcompactalt = 2137,
        /// <summary>
        /// Enum Viewcozy for value: view_cozy
        /// </summary>
        [EnumMember(Value = "view_cozy")]
        Viewcozy = 2138,
        /// <summary>
        /// Enum Viewinar for value: view_in_ar
        /// </summary>
        [EnumMember(Value = "view_in_ar")]
        Viewinar = 2139,
        /// <summary>
        /// Enum Viewkanban for value: view_kanban
        /// </summary>
        [EnumMember(Value = "view_kanban")]
        Viewkanban = 2140,
        /// <summary>
        /// Enum Viewsidebar for value: view_sidebar
        /// </summary>
        [EnumMember(Value = "view_sidebar")]
        Viewsidebar = 2141,
        /// <summary>
        /// Enum Viewtimeline for value: view_timeline
        /// </summary>
        [EnumMember(Value = "view_timeline")]
        Viewtimeline = 2142,
        /// <summary>
        /// Enum Villa for value: villa
        /// </summary>
        [EnumMember(Value = "villa")]
        Villa = 2143,
        /// <summary>
        /// Enum Voiceoveroff for value: voice_over_off
        /// </summary>
        [EnumMember(Value = "voice_over_off")]
        Voiceoveroff = 2144,
        /// <summary>
        /// Enum Volcano for value: volcano
        /// </summary>
        [EnumMember(Value = "volcano")]
        Volcano = 2145,
        /// <summary>
        /// Enum Volunteeractivism for value: volunteer_activism
        /// </summary>
        [EnumMember(Value = "volunteer_activism")]
        Volunteeractivism = 2146,
        /// <summary>
        /// Enum Vpnkeyoff for value: vpn_key_off
        /// </summary>
        [EnumMember(Value = "vpn_key_off")]
        Vpnkeyoff = 2147,
        /// <summary>
        /// Enum Vrpano for value: vrpano
        /// </summary>
        [EnumMember(Value = "vrpano")]
        Vrpano = 2148,
        /// <summary>
        /// Enum Wallet for value: wallet
        /// </summary>
        [EnumMember(Value = "wallet")]
        Wallet = 2149,
        /// <summary>
        /// Enum Walletgiftcard for value: wallet_giftcard
        /// </summary>
        [EnumMember(Value = "wallet_giftcard")]
        Walletgiftcard = 2150,
        /// <summary>
        /// Enum Walletmembership for value: wallet_membership
        /// </summary>
        [EnumMember(Value = "wallet_membership")]
        Walletmembership = 2151,
        /// <summary>
        /// Enum Wallettravel for value: wallet_travel
        /// </summary>
        [EnumMember(Value = "wallet_travel")]
        Wallettravel = 2152,
        /// <summary>
        /// Enum Warehouse for value: warehouse
        /// </summary>
        [EnumMember(Value = "warehouse")]
        Warehouse = 2153,
        /// <summary>
        /// Enum Warningamber for value: warning_amber
        /// </summary>
        [EnumMember(Value = "warning_amber")]
        Warningamber = 2154,
        /// <summary>
        /// Enum Wash for value: wash
        /// </summary>
        [EnumMember(Value = "wash")]
        Wash = 2155,
        /// <summary>
        /// Enum Watchoff for value: watch_off
        /// </summary>
        [EnumMember(Value = "watch_off")]
        Watchoff = 2156,
        /// <summary>
        /// Enum Water for value: water
        /// </summary>
        [EnumMember(Value = "water")]
        Water = 2157,
        /// <summary>
        /// Enum Waterdamage for value: water_damage
        /// </summary>
        [EnumMember(Value = "water_damage")]
        Waterdamage = 2158,
        /// <summary>
        /// Enum Waterdrop for value: water_drop
        /// </summary>
        [EnumMember(Value = "water_drop")]
        Waterdrop = 2159,
        /// <summary>
        /// Enum Waterfallchart for value: waterfall_chart
        /// </summary>
        [EnumMember(Value = "waterfall_chart")]
        Waterfallchart = 2160,
        /// <summary>
        /// Enum Waves for value: waves
        /// </summary>
        [EnumMember(Value = "waves")]
        Waves = 2161,
        /// <summary>
        /// Enum Wavinghand for value: waving_hand
        /// </summary>
        [EnumMember(Value = "waving_hand")]
        Wavinghand = 2162,
        /// <summary>
        /// Enum Wbshade for value: wb_shade
        /// </summary>
        [EnumMember(Value = "wb_shade")]
        Wbshade = 2163,
        /// <summary>
        /// Enum Wbtwilight for value: wb_twilight
        /// </summary>
        [EnumMember(Value = "wb_twilight")]
        Wbtwilight = 2164,
        /// <summary>
        /// Enum Webassetoff for value: web_asset_off
        /// </summary>
        [EnumMember(Value = "web_asset_off")]
        Webassetoff = 2165,
        /// <summary>
        /// Enum Webstories for value: web_stories
        /// </summary>
        [EnumMember(Value = "web_stories")]
        Webstories = 2166,
        /// <summary>
        /// Enum Webhook for value: webhook
        /// </summary>
        [EnumMember(Value = "webhook")]
        Webhook = 2167,
        /// <summary>
        /// Enum Wechat for value: wechat
        /// </summary>
        [EnumMember(Value = "wechat")]
        Wechat = 2168,
        /// <summary>
        /// Enum West for value: west
        /// </summary>
        [EnumMember(Value = "west")]
        West = 2169,
        /// <summary>
        /// Enum Wheelchairpickup for value: wheelchair_pickup
        /// </summary>
        [EnumMember(Value = "wheelchair_pickup")]
        Wheelchairpickup = 2170,
        /// <summary>
        /// Enum Wheretovote for value: where_to_vote
        /// </summary>
        [EnumMember(Value = "where_to_vote")]
        Wheretovote = 2171,
        /// <summary>
        /// Enum Widthfull for value: width_full
        /// </summary>
        [EnumMember(Value = "width_full")]
        Widthfull = 2172,
        /// <summary>
        /// Enum Widthnormal for value: width_normal
        /// </summary>
        [EnumMember(Value = "width_normal")]
        Widthnormal = 2173,
        /// <summary>
        /// Enum Widthwide for value: width_wide
        /// </summary>
        [EnumMember(Value = "width_wide")]
        Widthwide = 2174,
        /// <summary>
        /// Enum Wifi1bar for value: wifi_1_bar
        /// </summary>
        [EnumMember(Value = "wifi_1_bar")]
        Wifi1bar = 2175,
        /// <summary>
        /// Enum Wifi2bar for value: wifi_2_bar
        /// </summary>
        [EnumMember(Value = "wifi_2_bar")]
        Wifi2bar = 2176,
        /// <summary>
        /// Enum Wificalling for value: wifi_calling
        /// </summary>
        [EnumMember(Value = "wifi_calling")]
        Wificalling = 2177,
        /// <summary>
        /// Enum Wificalling3 for value: wifi_calling_3
        /// </summary>
        [EnumMember(Value = "wifi_calling_3")]
        Wificalling3 = 2178,
        /// <summary>
        /// Enum Wifichannel for value: wifi_channel
        /// </summary>
        [EnumMember(Value = "wifi_channel")]
        Wifichannel = 2179,
        /// <summary>
        /// Enum Wififind for value: wifi_find
        /// </summary>
        [EnumMember(Value = "wifi_find")]
        Wififind = 2180,
        /// <summary>
        /// Enum Wifioff for value: wifi_off
        /// </summary>
        [EnumMember(Value = "wifi_off")]
        Wifioff = 2181,
        /// <summary>
        /// Enum Wifipassword for value: wifi_password
        /// </summary>
        [EnumMember(Value = "wifi_password")]
        Wifipassword = 2182,
        /// <summary>
        /// Enum Wifiprotectedsetup for value: wifi_protected_setup
        /// </summary>
        [EnumMember(Value = "wifi_protected_setup")]
        Wifiprotectedsetup = 2183,
        /// <summary>
        /// Enum Wifitetheringerror for value: wifi_tethering_error
        /// </summary>
        [EnumMember(Value = "wifi_tethering_error")]
        Wifitetheringerror = 2184,
        /// <summary>
        /// Enum Wifitetheringerrorrounded for value: wifi_tethering_error_rounded
        /// </summary>
        [EnumMember(Value = "wifi_tethering_error_rounded")]
        Wifitetheringerrorrounded = 2185,
        /// <summary>
        /// Enum Wifitetheringoff for value: wifi_tethering_off
        /// </summary>
        [EnumMember(Value = "wifi_tethering_off")]
        Wifitetheringoff = 2186,
        /// <summary>
        /// Enum Windpower for value: wind_power
        /// </summary>
        [EnumMember(Value = "wind_power")]
        Windpower = 2187,
        /// <summary>
        /// Enum Window for value: window
        /// </summary>
        [EnumMember(Value = "window")]
        Window = 2188,
        /// <summary>
        /// Enum Winebar for value: wine_bar
        /// </summary>
        [EnumMember(Value = "wine_bar")]
        Winebar = 2189,
        /// <summary>
        /// Enum Woman for value: woman
        /// </summary>
        [EnumMember(Value = "woman")]
        Woman = 2190,
        /// <summary>
        /// Enum Woman2 for value: woman_2
        /// </summary>
        [EnumMember(Value = "woman_2")]
        Woman2 = 2191,
        /// <summary>
        /// Enum Woocommerce for value: woo_commerce
        /// </summary>
        [EnumMember(Value = "woo_commerce")]
        Woocommerce = 2192,
        /// <summary>
        /// Enum Wordpress for value: wordpress
        /// </summary>
        [EnumMember(Value = "wordpress")]
        Wordpress = 2193,
        /// <summary>
        /// Enum Workoff for value: work_off
        /// </summary>
        [EnumMember(Value = "work_off")]
        Workoff = 2194,
        /// <summary>
        /// Enum Workoutline for value: work_outline
        /// </summary>
        [EnumMember(Value = "work_outline")]
        Workoutline = 2195,
        /// <summary>
        /// Enum Workspacepremium for value: workspace_premium
        /// </summary>
        [EnumMember(Value = "workspace_premium")]
        Workspacepremium = 2196,
        /// <summary>
        /// Enum Workspaces for value: workspaces
        /// </summary>
        [EnumMember(Value = "workspaces")]
        Workspaces = 2197,
        /// <summary>
        /// Enum Wronglocation for value: wrong_location
        /// </summary>
        [EnumMember(Value = "wrong_location")]
        Wronglocation = 2198,
        /// <summary>
        /// Enum Wysiwyg for value: wysiwyg
        /// </summary>
        [EnumMember(Value = "wysiwyg")]
        Wysiwyg = 2199,
        /// <summary>
        /// Enum Yard for value: yard
        /// </summary>
        [EnumMember(Value = "yard")]
        Yard = 2200,
        /// <summary>
        /// Enum Zoominmap for value: zoom_in_map
        /// </summary>
        [EnumMember(Value = "zoom_in_map")]
        Zoominmap = 2201    }
}
