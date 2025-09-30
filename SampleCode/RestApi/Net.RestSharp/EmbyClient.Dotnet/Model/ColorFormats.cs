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
    /// Enum listing color formats.      The enum member names are matching those that are used by ffmpeg. (execute &#x27;ffmpeg \\-pix\\_fmts&#x27; to list them) Exception: Items that are starting with a number are prefixed with an underscore here. In ffmpeg code these are prefixed with &#x27;AV\\_PIX\\_FMT\\_&#x27; and all\\-caps.  
    /// </summary>
    /// <value>Enum listing color formats.      The enum member names are matching those that are used by ffmpeg. (execute &#x27;ffmpeg \\-pix\\_fmts&#x27; to list them) Exception: Items that are starting with a number are prefixed with an underscore here. In ffmpeg code these are prefixed with &#x27;AV\\_PIX\\_FMT\\_&#x27; and all\\-caps.  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ColorFormats
    {
        /// <summary>
        /// Enum Unknown for value: Unknown
        /// </summary>
        [EnumMember(Value = "Unknown")]
        Unknown = 1,
        /// <summary>
        /// Enum Yuv420p for value: yuv420p
        /// </summary>
        [EnumMember(Value = "yuv420p")]
        Yuv420p = 2,
        /// <summary>
        /// Enum Yuyv422 for value: yuyv422
        /// </summary>
        [EnumMember(Value = "yuyv422")]
        Yuyv422 = 3,
        /// <summary>
        /// Enum Rgb24 for value: rgb24
        /// </summary>
        [EnumMember(Value = "rgb24")]
        Rgb24 = 4,
        /// <summary>
        /// Enum Bgr24 for value: bgr24
        /// </summary>
        [EnumMember(Value = "bgr24")]
        Bgr24 = 5,
        /// <summary>
        /// Enum Yuv422p for value: yuv422p
        /// </summary>
        [EnumMember(Value = "yuv422p")]
        Yuv422p = 6,
        /// <summary>
        /// Enum Yuv444p for value: yuv444p
        /// </summary>
        [EnumMember(Value = "yuv444p")]
        Yuv444p = 7,
        /// <summary>
        /// Enum Yuv410p for value: yuv410p
        /// </summary>
        [EnumMember(Value = "yuv410p")]
        Yuv410p = 8,
        /// <summary>
        /// Enum Yuv411p for value: yuv411p
        /// </summary>
        [EnumMember(Value = "yuv411p")]
        Yuv411p = 9,
        /// <summary>
        /// Enum Gray for value: gray
        /// </summary>
        [EnumMember(Value = "gray")]
        Gray = 10,
        /// <summary>
        /// Enum Monow for value: monow
        /// </summary>
        [EnumMember(Value = "monow")]
        Monow = 11,
        /// <summary>
        /// Enum Monob for value: monob
        /// </summary>
        [EnumMember(Value = "monob")]
        Monob = 12,
        /// <summary>
        /// Enum Pal8 for value: pal8
        /// </summary>
        [EnumMember(Value = "pal8")]
        Pal8 = 13,
        /// <summary>
        /// Enum Yuvj420p for value: yuvj420p
        /// </summary>
        [EnumMember(Value = "yuvj420p")]
        Yuvj420p = 14,
        /// <summary>
        /// Enum Yuvj422p for value: yuvj422p
        /// </summary>
        [EnumMember(Value = "yuvj422p")]
        Yuvj422p = 15,
        /// <summary>
        /// Enum Yuvj444p for value: yuvj444p
        /// </summary>
        [EnumMember(Value = "yuvj444p")]
        Yuvj444p = 16,
        /// <summary>
        /// Enum Uyvy422 for value: uyvy422
        /// </summary>
        [EnumMember(Value = "uyvy422")]
        Uyvy422 = 17,
        /// <summary>
        /// Enum Uyyvyy411 for value: uyyvyy411
        /// </summary>
        [EnumMember(Value = "uyyvyy411")]
        Uyyvyy411 = 18,
        /// <summary>
        /// Enum Bgr8 for value: bgr8
        /// </summary>
        [EnumMember(Value = "bgr8")]
        Bgr8 = 19,
        /// <summary>
        /// Enum Bgr4 for value: bgr4
        /// </summary>
        [EnumMember(Value = "bgr4")]
        Bgr4 = 20,
        /// <summary>
        /// Enum Bgr4byte for value: bgr4_byte
        /// </summary>
        [EnumMember(Value = "bgr4_byte")]
        Bgr4byte = 21,
        /// <summary>
        /// Enum Rgb8 for value: rgb8
        /// </summary>
        [EnumMember(Value = "rgb8")]
        Rgb8 = 22,
        /// <summary>
        /// Enum Rgb4 for value: rgb4
        /// </summary>
        [EnumMember(Value = "rgb4")]
        Rgb4 = 23,
        /// <summary>
        /// Enum Rgb4byte for value: rgb4_byte
        /// </summary>
        [EnumMember(Value = "rgb4_byte")]
        Rgb4byte = 24,
        /// <summary>
        /// Enum Nv12 for value: nv12
        /// </summary>
        [EnumMember(Value = "nv12")]
        Nv12 = 25,
        /// <summary>
        /// Enum Nv21 for value: nv21
        /// </summary>
        [EnumMember(Value = "nv21")]
        Nv21 = 26,
        /// <summary>
        /// Enum Argb for value: argb
        /// </summary>
        [EnumMember(Value = "argb")]
        Argb = 27,
        /// <summary>
        /// Enum Rgba for value: rgba
        /// </summary>
        [EnumMember(Value = "rgba")]
        Rgba = 28,
        /// <summary>
        /// Enum Abgr for value: abgr
        /// </summary>
        [EnumMember(Value = "abgr")]
        Abgr = 29,
        /// <summary>
        /// Enum Bgra for value: bgra
        /// </summary>
        [EnumMember(Value = "bgra")]
        Bgra = 30,
        /// <summary>
        /// Enum Gray16 for value: gray16
        /// </summary>
        [EnumMember(Value = "gray16")]
        Gray16 = 31,
        /// <summary>
        /// Enum Yuv440p for value: yuv440p
        /// </summary>
        [EnumMember(Value = "yuv440p")]
        Yuv440p = 32,
        /// <summary>
        /// Enum Yuvj440p for value: yuvj440p
        /// </summary>
        [EnumMember(Value = "yuvj440p")]
        Yuvj440p = 33,
        /// <summary>
        /// Enum Yuva420p for value: yuva420p
        /// </summary>
        [EnumMember(Value = "yuva420p")]
        Yuva420p = 34,
        /// <summary>
        /// Enum Rgb48 for value: rgb48
        /// </summary>
        [EnumMember(Value = "rgb48")]
        Rgb48 = 35,
        /// <summary>
        /// Enum Rgb565 for value: rgb565
        /// </summary>
        [EnumMember(Value = "rgb565")]
        Rgb565 = 36,
        /// <summary>
        /// Enum Rgb555 for value: rgb555
        /// </summary>
        [EnumMember(Value = "rgb555")]
        Rgb555 = 37,
        /// <summary>
        /// Enum Bgr565 for value: bgr565
        /// </summary>
        [EnumMember(Value = "bgr565")]
        Bgr565 = 38,
        /// <summary>
        /// Enum Bgr555 for value: bgr555
        /// </summary>
        [EnumMember(Value = "bgr555")]
        Bgr555 = 39,
        /// <summary>
        /// Enum Vaapimoco for value: vaapi_moco
        /// </summary>
        [EnumMember(Value = "vaapi_moco")]
        Vaapimoco = 40,
        /// <summary>
        /// Enum Vaapiidct for value: vaapi_idct
        /// </summary>
        [EnumMember(Value = "vaapi_idct")]
        Vaapiidct = 41,
        /// <summary>
        /// Enum Vaapivld for value: vaapi_vld
        /// </summary>
        [EnumMember(Value = "vaapi_vld")]
        Vaapivld = 42,
        /// <summary>
        /// Enum Yuv420p16 for value: yuv420p16
        /// </summary>
        [EnumMember(Value = "yuv420p16")]
        Yuv420p16 = 43,
        /// <summary>
        /// Enum Yuv422p16 for value: yuv422p16
        /// </summary>
        [EnumMember(Value = "yuv422p16")]
        Yuv422p16 = 44,
        /// <summary>
        /// Enum Yuv444p16 for value: yuv444p16
        /// </summary>
        [EnumMember(Value = "yuv444p16")]
        Yuv444p16 = 45,
        /// <summary>
        /// Enum Dxva2vld for value: dxva2_vld
        /// </summary>
        [EnumMember(Value = "dxva2_vld")]
        Dxva2vld = 46,
        /// <summary>
        /// Enum Rgb444 for value: rgb444
        /// </summary>
        [EnumMember(Value = "rgb444")]
        Rgb444 = 47,
        /// <summary>
        /// Enum Bgr444 for value: bgr444
        /// </summary>
        [EnumMember(Value = "bgr444")]
        Bgr444 = 48,
        /// <summary>
        /// Enum Ya8 for value: ya8
        /// </summary>
        [EnumMember(Value = "ya8")]
        Ya8 = 49,
        /// <summary>
        /// Enum Bgr48 for value: bgr48
        /// </summary>
        [EnumMember(Value = "bgr48")]
        Bgr48 = 50,
        /// <summary>
        /// Enum Yuv420p9 for value: yuv420p9
        /// </summary>
        [EnumMember(Value = "yuv420p9")]
        Yuv420p9 = 51,
        /// <summary>
        /// Enum Yuv420p10 for value: yuv420p10
        /// </summary>
        [EnumMember(Value = "yuv420p10")]
        Yuv420p10 = 52,
        /// <summary>
        /// Enum Yuv422p10 for value: yuv422p10
        /// </summary>
        [EnumMember(Value = "yuv422p10")]
        Yuv422p10 = 53,
        /// <summary>
        /// Enum Yuv444p9 for value: yuv444p9
        /// </summary>
        [EnumMember(Value = "yuv444p9")]
        Yuv444p9 = 54,
        /// <summary>
        /// Enum Yuv444p10 for value: yuv444p10
        /// </summary>
        [EnumMember(Value = "yuv444p10")]
        Yuv444p10 = 55,
        /// <summary>
        /// Enum Yuv422p9 for value: yuv422p9
        /// </summary>
        [EnumMember(Value = "yuv422p9")]
        Yuv422p9 = 56,
        /// <summary>
        /// Enum Gbrp for value: gbrp
        /// </summary>
        [EnumMember(Value = "gbrp")]
        Gbrp = 57,
        /// <summary>
        /// Enum Gbrp9 for value: gbrp9
        /// </summary>
        [EnumMember(Value = "gbrp9")]
        Gbrp9 = 58,
        /// <summary>
        /// Enum Gbrp10 for value: gbrp10
        /// </summary>
        [EnumMember(Value = "gbrp10")]
        Gbrp10 = 59,
        /// <summary>
        /// Enum Gbrp16 for value: gbrp16
        /// </summary>
        [EnumMember(Value = "gbrp16")]
        Gbrp16 = 60,
        /// <summary>
        /// Enum Yuva422p for value: yuva422p
        /// </summary>
        [EnumMember(Value = "yuva422p")]
        Yuva422p = 61,
        /// <summary>
        /// Enum Yuva444p for value: yuva444p
        /// </summary>
        [EnumMember(Value = "yuva444p")]
        Yuva444p = 62,
        /// <summary>
        /// Enum Yuva420p9 for value: yuva420p9
        /// </summary>
        [EnumMember(Value = "yuva420p9")]
        Yuva420p9 = 63,
        /// <summary>
        /// Enum Yuva422p9 for value: yuva422p9
        /// </summary>
        [EnumMember(Value = "yuva422p9")]
        Yuva422p9 = 64,
        /// <summary>
        /// Enum Yuva444p9 for value: yuva444p9
        /// </summary>
        [EnumMember(Value = "yuva444p9")]
        Yuva444p9 = 65,
        /// <summary>
        /// Enum Yuva420p10 for value: yuva420p10
        /// </summary>
        [EnumMember(Value = "yuva420p10")]
        Yuva420p10 = 66,
        /// <summary>
        /// Enum Yuva422p10 for value: yuva422p10
        /// </summary>
        [EnumMember(Value = "yuva422p10")]
        Yuva422p10 = 67,
        /// <summary>
        /// Enum Yuva444p10 for value: yuva444p10
        /// </summary>
        [EnumMember(Value = "yuva444p10")]
        Yuva444p10 = 68,
        /// <summary>
        /// Enum Yuva420p16 for value: yuva420p16
        /// </summary>
        [EnumMember(Value = "yuva420p16")]
        Yuva420p16 = 69,
        /// <summary>
        /// Enum Yuva422p16 for value: yuva422p16
        /// </summary>
        [EnumMember(Value = "yuva422p16")]
        Yuva422p16 = 70,
        /// <summary>
        /// Enum Yuva444p16 for value: yuva444p16
        /// </summary>
        [EnumMember(Value = "yuva444p16")]
        Yuva444p16 = 71,
        /// <summary>
        /// Enum Vdpau for value: vdpau
        /// </summary>
        [EnumMember(Value = "vdpau")]
        Vdpau = 72,
        /// <summary>
        /// Enum Xyz12 for value: xyz12
        /// </summary>
        [EnumMember(Value = "xyz12")]
        Xyz12 = 73,
        /// <summary>
        /// Enum Nv16 for value: nv16
        /// </summary>
        [EnumMember(Value = "nv16")]
        Nv16 = 74,
        /// <summary>
        /// Enum Nv20 for value: nv20
        /// </summary>
        [EnumMember(Value = "nv20")]
        Nv20 = 75,
        /// <summary>
        /// Enum Rgba64 for value: rgba64
        /// </summary>
        [EnumMember(Value = "rgba64")]
        Rgba64 = 76,
        /// <summary>
        /// Enum Bgra64 for value: bgra64
        /// </summary>
        [EnumMember(Value = "bgra64")]
        Bgra64 = 77,
        /// <summary>
        /// Enum Yvyu422 for value: yvyu422
        /// </summary>
        [EnumMember(Value = "yvyu422")]
        Yvyu422 = 78,
        /// <summary>
        /// Enum Ya16 for value: ya16
        /// </summary>
        [EnumMember(Value = "ya16")]
        Ya16 = 79,
        /// <summary>
        /// Enum Gbrap for value: gbrap
        /// </summary>
        [EnumMember(Value = "gbrap")]
        Gbrap = 80,
        /// <summary>
        /// Enum Gbrap16 for value: gbrap16
        /// </summary>
        [EnumMember(Value = "gbrap16")]
        Gbrap16 = 81,
        /// <summary>
        /// Enum Qsv for value: qsv
        /// </summary>
        [EnumMember(Value = "qsv")]
        Qsv = 82,
        /// <summary>
        /// Enum Mmal for value: mmal
        /// </summary>
        [EnumMember(Value = "mmal")]
        Mmal = 83,
        /// <summary>
        /// Enum D3d11vavld for value: d3d11va_vld
        /// </summary>
        [EnumMember(Value = "d3d11va_vld")]
        D3d11vavld = 84,
        /// <summary>
        /// Enum Cuda for value: cuda
        /// </summary>
        [EnumMember(Value = "cuda")]
        Cuda = 85,
        /// <summary>
        /// Enum _0rgb for value: _0rgb
        /// </summary>
        [EnumMember(Value = "_0rgb")]
        _0rgb = 86,
        /// <summary>
        /// Enum Rgb0 for value: rgb0
        /// </summary>
        [EnumMember(Value = "rgb0")]
        Rgb0 = 87,
        /// <summary>
        /// Enum _0bgr for value: _0bgr
        /// </summary>
        [EnumMember(Value = "_0bgr")]
        _0bgr = 88,
        /// <summary>
        /// Enum Bgr0 for value: bgr0
        /// </summary>
        [EnumMember(Value = "bgr0")]
        Bgr0 = 89,
        /// <summary>
        /// Enum Yuv420p12 for value: yuv420p12
        /// </summary>
        [EnumMember(Value = "yuv420p12")]
        Yuv420p12 = 90,
        /// <summary>
        /// Enum Yuv420p14 for value: yuv420p14
        /// </summary>
        [EnumMember(Value = "yuv420p14")]
        Yuv420p14 = 91,
        /// <summary>
        /// Enum Yuv422p12 for value: yuv422p12
        /// </summary>
        [EnumMember(Value = "yuv422p12")]
        Yuv422p12 = 92,
        /// <summary>
        /// Enum Yuv422p14 for value: yuv422p14
        /// </summary>
        [EnumMember(Value = "yuv422p14")]
        Yuv422p14 = 93,
        /// <summary>
        /// Enum Yuv444p12 for value: yuv444p12
        /// </summary>
        [EnumMember(Value = "yuv444p12")]
        Yuv444p12 = 94,
        /// <summary>
        /// Enum Yuv444p14 for value: yuv444p14
        /// </summary>
        [EnumMember(Value = "yuv444p14")]
        Yuv444p14 = 95,
        /// <summary>
        /// Enum Gbrp12 for value: gbrp12
        /// </summary>
        [EnumMember(Value = "gbrp12")]
        Gbrp12 = 96,
        /// <summary>
        /// Enum Gbrp14 for value: gbrp14
        /// </summary>
        [EnumMember(Value = "gbrp14")]
        Gbrp14 = 97,
        /// <summary>
        /// Enum Yuvj411p for value: yuvj411p
        /// </summary>
        [EnumMember(Value = "yuvj411p")]
        Yuvj411p = 98,
        /// <summary>
        /// Enum Bayerbggr8 for value: bayer_bggr8
        /// </summary>
        [EnumMember(Value = "bayer_bggr8")]
        Bayerbggr8 = 99,
        /// <summary>
        /// Enum Bayerrggb8 for value: bayer_rggb8
        /// </summary>
        [EnumMember(Value = "bayer_rggb8")]
        Bayerrggb8 = 100,
        /// <summary>
        /// Enum Bayergbrg8 for value: bayer_gbrg8
        /// </summary>
        [EnumMember(Value = "bayer_gbrg8")]
        Bayergbrg8 = 101,
        /// <summary>
        /// Enum Bayergrbg8 for value: bayer_grbg8
        /// </summary>
        [EnumMember(Value = "bayer_grbg8")]
        Bayergrbg8 = 102,
        /// <summary>
        /// Enum Bayerbggr16 for value: bayer_bggr16
        /// </summary>
        [EnumMember(Value = "bayer_bggr16")]
        Bayerbggr16 = 103,
        /// <summary>
        /// Enum Bayerrggb16 for value: bayer_rggb16
        /// </summary>
        [EnumMember(Value = "bayer_rggb16")]
        Bayerrggb16 = 104,
        /// <summary>
        /// Enum Bayergbrg16 for value: bayer_gbrg16
        /// </summary>
        [EnumMember(Value = "bayer_gbrg16")]
        Bayergbrg16 = 105,
        /// <summary>
        /// Enum Bayergrbg16 for value: bayer_grbg16
        /// </summary>
        [EnumMember(Value = "bayer_grbg16")]
        Bayergrbg16 = 106,
        /// <summary>
        /// Enum Xvmc for value: xvmc
        /// </summary>
        [EnumMember(Value = "xvmc")]
        Xvmc = 107,
        /// <summary>
        /// Enum Yuv440p10 for value: yuv440p10
        /// </summary>
        [EnumMember(Value = "yuv440p10")]
        Yuv440p10 = 108,
        /// <summary>
        /// Enum Yuv440p12 for value: yuv440p12
        /// </summary>
        [EnumMember(Value = "yuv440p12")]
        Yuv440p12 = 109,
        /// <summary>
        /// Enum Ayuv64 for value: ayuv64
        /// </summary>
        [EnumMember(Value = "ayuv64")]
        Ayuv64 = 110,
        /// <summary>
        /// Enum Videotoolboxvld for value: videotoolbox_vld
        /// </summary>
        [EnumMember(Value = "videotoolbox_vld")]
        Videotoolboxvld = 111,
        /// <summary>
        /// Enum P010 for value: p010
        /// </summary>
        [EnumMember(Value = "p010")]
        P010 = 112,
        /// <summary>
        /// Enum Gbrap12 for value: gbrap12
        /// </summary>
        [EnumMember(Value = "gbrap12")]
        Gbrap12 = 113,
        /// <summary>
        /// Enum Gbrap10 for value: gbrap10
        /// </summary>
        [EnumMember(Value = "gbrap10")]
        Gbrap10 = 114,
        /// <summary>
        /// Enum Mediacodec for value: mediacodec
        /// </summary>
        [EnumMember(Value = "mediacodec")]
        Mediacodec = 115,
        /// <summary>
        /// Enum Gray12 for value: gray12
        /// </summary>
        [EnumMember(Value = "gray12")]
        Gray12 = 116,
        /// <summary>
        /// Enum Gray10 for value: gray10
        /// </summary>
        [EnumMember(Value = "gray10")]
        Gray10 = 117,
        /// <summary>
        /// Enum Gray14 for value: gray14
        /// </summary>
        [EnumMember(Value = "gray14")]
        Gray14 = 118,
        /// <summary>
        /// Enum P016 for value: p016
        /// </summary>
        [EnumMember(Value = "p016")]
        P016 = 119,
        /// <summary>
        /// Enum D3d11 for value: d3d11
        /// </summary>
        [EnumMember(Value = "d3d11")]
        D3d11 = 120,
        /// <summary>
        /// Enum Gray9 for value: gray9
        /// </summary>
        [EnumMember(Value = "gray9")]
        Gray9 = 121,
        /// <summary>
        /// Enum Gbrpf32 for value: gbrpf32
        /// </summary>
        [EnumMember(Value = "gbrpf32")]
        Gbrpf32 = 122,
        /// <summary>
        /// Enum Gbrapf32 for value: gbrapf32
        /// </summary>
        [EnumMember(Value = "gbrapf32")]
        Gbrapf32 = 123,
        /// <summary>
        /// Enum Drmprime for value: drm_prime
        /// </summary>
        [EnumMember(Value = "drm_prime")]
        Drmprime = 124,
        /// <summary>
        /// Enum Opencl for value: opencl
        /// </summary>
        [EnumMember(Value = "opencl")]
        Opencl = 125,
        /// <summary>
        /// Enum Grayf32 for value: grayf32
        /// </summary>
        [EnumMember(Value = "grayf32")]
        Grayf32 = 126,
        /// <summary>
        /// Enum Yuva422p12 for value: yuva422p12
        /// </summary>
        [EnumMember(Value = "yuva422p12")]
        Yuva422p12 = 127,
        /// <summary>
        /// Enum Yuva444p12 for value: yuva444p12
        /// </summary>
        [EnumMember(Value = "yuva444p12")]
        Yuva444p12 = 128,
        /// <summary>
        /// Enum Nv24 for value: nv24
        /// </summary>
        [EnumMember(Value = "nv24")]
        Nv24 = 129,
        /// <summary>
        /// Enum Nv42 for value: nv42
        /// </summary>
        [EnumMember(Value = "nv42")]
        Nv42 = 130    }
}
