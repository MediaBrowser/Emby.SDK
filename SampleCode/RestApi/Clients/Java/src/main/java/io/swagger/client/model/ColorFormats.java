/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enum listing color formats.      The enum member names are matching those that are used by ffmpeg. (execute &#x27;ffmpeg \\-pix\\_fmts&#x27; to list them) Exception: Items that are starting with a number are prefixed with an underscore here. In ffmpeg code these are prefixed with &#x27;AV\\_PIX\\_FMT\\_&#x27; and all\\-caps.  
 */
@JsonAdapter(ColorFormats.Adapter.class)
public enum ColorFormats {
  UNKNOWN("Unknown"),
  YUV420P("yuv420p"),
  YUYV422("yuyv422"),
  RGB24("rgb24"),
  BGR24("bgr24"),
  YUV422P("yuv422p"),
  YUV444P("yuv444p"),
  YUV410P("yuv410p"),
  YUV411P("yuv411p"),
  GRAY("gray"),
  MONOW("monow"),
  MONOB("monob"),
  PAL8("pal8"),
  YUVJ420P("yuvj420p"),
  YUVJ422P("yuvj422p"),
  YUVJ444P("yuvj444p"),
  UYVY422("uyvy422"),
  UYYVYY411("uyyvyy411"),
  BGR8("bgr8"),
  BGR4("bgr4"),
  BGR4_BYTE("bgr4_byte"),
  RGB8("rgb8"),
  RGB4("rgb4"),
  RGB4_BYTE("rgb4_byte"),
  NV12("nv12"),
  NV21("nv21"),
  ARGB("argb"),
  RGBA("rgba"),
  ABGR("abgr"),
  BGRA("bgra"),
  GRAY16("gray16"),
  YUV440P("yuv440p"),
  YUVJ440P("yuvj440p"),
  YUVA420P("yuva420p"),
  RGB48("rgb48"),
  RGB565("rgb565"),
  RGB555("rgb555"),
  BGR565("bgr565"),
  BGR555("bgr555"),
  VAAPI_MOCO("vaapi_moco"),
  VAAPI_IDCT("vaapi_idct"),
  VAAPI_VLD("vaapi_vld"),
  YUV420P16("yuv420p16"),
  YUV422P16("yuv422p16"),
  YUV444P16("yuv444p16"),
  DXVA2_VLD("dxva2_vld"),
  RGB444("rgb444"),
  BGR444("bgr444"),
  YA8("ya8"),
  BGR48("bgr48"),
  YUV420P9("yuv420p9"),
  YUV420P10("yuv420p10"),
  YUV422P10("yuv422p10"),
  YUV444P9("yuv444p9"),
  YUV444P10("yuv444p10"),
  YUV422P9("yuv422p9"),
  GBRP("gbrp"),
  GBRP9("gbrp9"),
  GBRP10("gbrp10"),
  GBRP16("gbrp16"),
  YUVA422P("yuva422p"),
  YUVA444P("yuva444p"),
  YUVA420P9("yuva420p9"),
  YUVA422P9("yuva422p9"),
  YUVA444P9("yuva444p9"),
  YUVA420P10("yuva420p10"),
  YUVA422P10("yuva422p10"),
  YUVA444P10("yuva444p10"),
  YUVA420P16("yuva420p16"),
  YUVA422P16("yuva422p16"),
  YUVA444P16("yuva444p16"),
  VDPAU("vdpau"),
  XYZ12("xyz12"),
  NV16("nv16"),
  NV20("nv20"),
  RGBA64("rgba64"),
  BGRA64("bgra64"),
  YVYU422("yvyu422"),
  YA16("ya16"),
  GBRAP("gbrap"),
  GBRAP16("gbrap16"),
  QSV("qsv"),
  MMAL("mmal"),
  D3D11VA_VLD("d3d11va_vld"),
  CUDA("cuda"),
  _0RGB("_0rgb"),
  RGB0("rgb0"),
  _0BGR("_0bgr"),
  BGR0("bgr0"),
  YUV420P12("yuv420p12"),
  YUV420P14("yuv420p14"),
  YUV422P12("yuv422p12"),
  YUV422P14("yuv422p14"),
  YUV444P12("yuv444p12"),
  YUV444P14("yuv444p14"),
  GBRP12("gbrp12"),
  GBRP14("gbrp14"),
  YUVJ411P("yuvj411p"),
  BAYER_BGGR8("bayer_bggr8"),
  BAYER_RGGB8("bayer_rggb8"),
  BAYER_GBRG8("bayer_gbrg8"),
  BAYER_GRBG8("bayer_grbg8"),
  BAYER_BGGR16("bayer_bggr16"),
  BAYER_RGGB16("bayer_rggb16"),
  BAYER_GBRG16("bayer_gbrg16"),
  BAYER_GRBG16("bayer_grbg16"),
  XVMC("xvmc"),
  YUV440P10("yuv440p10"),
  YUV440P12("yuv440p12"),
  AYUV64("ayuv64"),
  VIDEOTOOLBOX_VLD("videotoolbox_vld"),
  P010("p010"),
  GBRAP12("gbrap12"),
  GBRAP10("gbrap10"),
  MEDIACODEC("mediacodec"),
  GRAY12("gray12"),
  GRAY10("gray10"),
  GRAY14("gray14"),
  P016("p016"),
  D3D11("d3d11"),
  GRAY9("gray9"),
  GBRPF32("gbrpf32"),
  GBRAPF32("gbrapf32"),
  DRM_PRIME("drm_prime"),
  OPENCL("opencl"),
  GRAYF32("grayf32"),
  YUVA422P12("yuva422p12"),
  YUVA444P12("yuva444p12"),
  NV24("nv24"),
  NV42("nv42");

  private String value;

  ColorFormats(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ColorFormats fromValue(String input) {
    for (ColorFormats b : ColorFormats.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ColorFormats> {
    @Override
    public void write(final JsonWriter jsonWriter, final ColorFormats enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ColorFormats read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ColorFormats.fromValue((String)(value));
    }
  }
}
