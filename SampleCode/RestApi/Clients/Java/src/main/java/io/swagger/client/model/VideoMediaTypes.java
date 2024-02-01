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
 * Enum listing video media types.      The enum member names are matching exactly those that are used by ffmpeg. Exception: Items that are starting with a number are prefixed with an underscore here.  
 */
@JsonAdapter(VideoMediaTypes.Adapter.class)
public enum VideoMediaTypes {
  UNKNOWN("Unknown"),
  COPY("copy"),
  FLV1("flv1"),
  H263("h263"),
  H263P("h263p"),
  H264("h264"),
  HEVC("hevc"),
  MJPEG("mjpeg"),
  MPEG1VIDEO("mpeg1video"),
  MPEG2VIDEO("mpeg2video"),
  MPEG4("mpeg4"),
  MSVIDEO1("msvideo1"),
  THEORA("theora"),
  VC1IMAGE("vc1image"),
  VC1("vc1"),
  VP8("vp8"),
  VP9("vp9"),
  WMV1("wmv1"),
  WMV2("wmv2"),
  WMV3("wmv3"),
  _012V("_012v"),
  _4XM("_4xm"),
  _8BPS("_8bps"),
  A64_MULTI("a64_multi"),
  A64_MULTI5("a64_multi5"),
  AASC("aasc"),
  AIC("aic"),
  ALIAS_PIX("alias_pix"),
  AMV("amv"),
  ANM("anm"),
  ANSI("ansi"),
  APNG("apng"),
  ASV1("asv1"),
  ASV2("asv2"),
  AURA("aura"),
  AURA2("aura2"),
  AV1("av1"),
  AVRN("avrn"),
  AVRP("avrp"),
  AVS("avs"),
  AVUI("avui"),
  AYUV("ayuv"),
  BETHSOFTVID("bethsoftvid"),
  BFI("bfi"),
  BINKVIDEO("binkvideo"),
  BINTEXT("bintext"),
  BITPACKED("bitpacked"),
  BMP("bmp"),
  BMV_VIDEO("bmv_video"),
  BRENDER_PIX("brender_pix"),
  C93("c93"),
  CAVS("cavs"),
  CDGRAPHICS("cdgraphics"),
  CDXL("cdxl"),
  CFHD("cfhd"),
  CINEPAK("cinepak"),
  CLEARVIDEO("clearvideo"),
  CLJR("cljr"),
  CLLC("cllc"),
  CMV("cmv"),
  CPIA("cpia"),
  CSCD("cscd"),
  CYUV("cyuv"),
  DAALA("daala"),
  DDS("dds"),
  DFA("dfa"),
  DIRAC("dirac"),
  DNXHD("dnxhd"),
  DPX("dpx"),
  DSICINVIDEO("dsicinvideo"),
  DVVIDEO("dvvideo"),
  DXA("dxa"),
  DXTORY("dxtory"),
  DXV("dxv"),
  ESCAPE124("escape124"),
  ESCAPE130("escape130"),
  EXR("exr"),
  FFV1("ffv1"),
  FFVHUFF("ffvhuff"),
  FIC("fic"),
  FITS("fits"),
  FLASHSV("flashsv"),
  FLASHSV2("flashsv2"),
  FLIC("flic"),
  FMVC("fmvc"),
  FRAPS("fraps"),
  FRWU("frwu"),
  G2M("g2m"),
  GDV("gdv"),
  GIF("gif"),
  H261("h261"),
  H263I("h263i"),
  HAP("hap"),
  HNM4VIDEO("hnm4video"),
  HQ_HQA("hq_hqa"),
  HQX("hqx"),
  HUFFYUV("huffyuv"),
  IDCIN("idcin"),
  IDF("idf"),
  IFF_ILBM("iff_ilbm"),
  INDEO2("indeo2"),
  INDEO3("indeo3"),
  INDEO4("indeo4"),
  INDEO5("indeo5"),
  INTERPLAYVIDEO("interplayvideo"),
  JPEG2000("jpeg2000"),
  JPEGLS("jpegls"),
  JV("jv"),
  KGV1("kgv1"),
  KMVC("kmvc"),
  LAGARITH("lagarith"),
  LJPEG("ljpeg"),
  LOCO("loco"),
  M101("m101"),
  MAD("mad"),
  MAGICYUV("magicyuv"),
  MDEC("mdec"),
  MIMIC("mimic"),
  MJPEGB("mjpegb"),
  MMVIDEO("mmvideo"),
  MOTIONPIXELS("motionpixels"),
  MSA1("msa1"),
  MSCC("mscc"),
  MSMPEG4V1("msmpeg4v1"),
  MSMPEG4V2("msmpeg4v2"),
  MSMPEG4V3("msmpeg4v3"),
  MSRLE("msrle"),
  MSS1("mss1"),
  MSS2("mss2"),
  MSZH("mszh"),
  MTS2("mts2"),
  MVC1("mvc1"),
  MVC2("mvc2"),
  MXPEG("mxpeg"),
  NUV("nuv"),
  PAF_VIDEO("paf_video"),
  PAM("pam"),
  PBM("pbm"),
  PCX("pcx"),
  PGM("pgm"),
  PGMYUV("pgmyuv"),
  PICTOR("pictor"),
  PIXLET("pixlet"),
  PNG("png"),
  PPM("ppm"),
  PRORES("prores"),
  PSD("psd"),
  PTX("ptx"),
  QDRAW("qdraw"),
  QPEG("qpeg"),
  QTRLE("qtrle"),
  R10K("r10k"),
  R210("r210"),
  RAWVIDEO("rawvideo"),
  RL2("rl2"),
  ROQ("roq"),
  RPZA("rpza"),
  RSCC("rscc"),
  RV10("rv10"),
  RV20("rv20"),
  RV30("rv30"),
  RV40("rv40"),
  SANM("sanm"),
  SCPR("scpr"),
  SCREENPRESSO("screenpresso"),
  SGI("sgi"),
  SGIRLE("sgirle"),
  SHEERVIDEO("sheervideo"),
  SMACKVIDEO("smackvideo"),
  SMC("smc"),
  SMVJPEG("smvjpeg"),
  SNOW("snow"),
  SP5X("sp5x"),
  SPEEDHQ("speedhq"),
  SRGC("srgc"),
  SUNRAST("sunrast"),
  SVG("svg"),
  SVQ1("svq1"),
  SVQ3("svq3"),
  TARGA("targa"),
  TARGA_Y216("targa_y216"),
  TDSC("tdsc"),
  TGQ("tgq"),
  TGV("tgv"),
  THP("thp"),
  TIERTEXSEQVIDEO("tiertexseqvideo"),
  TIFF("tiff"),
  TMV("tmv"),
  TQI("tqi"),
  TRUEMOTION1("truemotion1"),
  TRUEMOTION2("truemotion2"),
  TRUEMOTION2RT("truemotion2rt"),
  TSCC("tscc"),
  TSCC2("tscc2"),
  TXD("txd"),
  ULTI("ulti"),
  UTVIDEO("utvideo"),
  V210("v210"),
  V210X("v210x"),
  V308("v308"),
  V408("v408"),
  V410("v410"),
  VB("vb"),
  VBLE("vble"),
  VCR1("vcr1"),
  VIXL("vixl"),
  VMDVIDEO("vmdvideo"),
  VMNC("vmnc"),
  VP3("vp3"),
  VP5("vp5"),
  VP6("vp6"),
  VP6A("vp6a"),
  VP6F("vp6f"),
  VP7("vp7"),
  WEBP("webp"),
  WMV3IMAGE("wmv3image"),
  WNV1("wnv1"),
  WRAPPED_AVFRAME("wrapped_avframe"),
  WS_VQA("ws_vqa"),
  XAN_WC3("xan_wc3"),
  XAN_WC4("xan_wc4"),
  XBIN("xbin"),
  XBM("xbm"),
  XFACE("xface"),
  XPM("xpm"),
  XWD("xwd"),
  Y41P("y41p"),
  YLC("ylc"),
  YOP("yop"),
  YUV4("yuv4"),
  ZEROCODEC("zerocodec"),
  ZLIB("zlib"),
  ZMBV("zmbv");

  private String value;

  VideoMediaTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VideoMediaTypes fromValue(String input) {
    for (VideoMediaTypes b : VideoMediaTypes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<VideoMediaTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final VideoMediaTypes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public VideoMediaTypes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return VideoMediaTypes.fromValue((String)(value));
    }
  }
}
