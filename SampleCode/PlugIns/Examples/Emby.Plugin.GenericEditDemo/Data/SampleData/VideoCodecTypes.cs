// <copyright file="VideoCodecTypes.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

// ReSharper disable InconsistentNaming
namespace Emby.Plugin.GenericEditDemo.Data.SampleData
{
    using System.ComponentModel;
    using MediaBrowser.Model.Attributes;

    public enum VideoCodecTypes
    {
        [Description("FLV (H.263)"), Details("FLV / Sorenson Spark / Sorenson H.263 (Flash Video)"), Compression(CompressionKinds.Lossy)]
        flv1,

        [Description("H.263"), Details("H.263 / H.263-1996, H.263+ / H.263-1998 / H.263 version 2"), Compression(CompressionKinds.Lossy)]
        h263,

        [Description("H.264 (AVC)"), Color("green"), Details("H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10"), Aliases("avc"), Compression(CompressionKinds.Variable)]
        h264,

        [Description("H.265 (HEVC)"), Details("H.265 / HEVC (High Efficiency Video Coding)"), Aliases("h265"), Compression(CompressionKinds.Lossy)]
        hevc,

        [Description("Motion JPEG"), Compression(CompressionKinds.Lossy)]
        mjpeg,

        [Description("MPEG-1"), Details("MPEG-1 video"), Compression(CompressionKinds.Lossy)]
        mpeg1video,

        [Description("MPEG-2"), Details("MPEG-2 video"), Compression(CompressionKinds.Lossy)]
        mpeg2video,

        [Description("MPEG-4"), Details("MPEG-4 part 2"), Compression(CompressionKinds.Lossy)]
        mpeg4,

        [Description("MS Video-1"), Details("Microsoft Video 1"), Compression(CompressionKinds.Lossy)]
        msvideo1,

        [Description("Theora"), Compression(CompressionKinds.Lossy)]
        theora,

        [Description("WMV 9 Image"), Details("Windows Media Video 9 Image v2"), Compression(CompressionKinds.Lossy)]
        vc1image,

        [Description("VC-1"), Details("SMPTE VC-1"), Compression(CompressionKinds.Lossy)]
        vc1,

        [Description("VP8"), Details("Google/ON2 VP8"), Aliases("vpx", "libvpx"), Compression(CompressionKinds.Lossy)]
        vp8,

        [Description("VP9"), Details("Google VP9"), Aliases("libvpx-vp9"), Compression(CompressionKinds.Lossy)]
        vp9,

        [Description("WMV 7"), Details("Windows Media Video 7"), Compression(CompressionKinds.Lossy)]
        wmv1,

        [Description("WMV 8"), Details("Windows Media Video 8"), Compression(CompressionKinds.Lossy)]
        wmv2,

        [Description("WMV 9"), Details("Windows Media Video 9"), Compression(CompressionKinds.Lossy)]
        wmv3,

        [Description("Uncompressed 4:2:2 10-bit"), Compression(CompressionKinds.LossLess)]
        _012v,

        [Description("4X Movie"), Compression(CompressionKinds.Lossy)]
        _4xm,

        [Description("QuickTime 8BPS video"), Compression(CompressionKinds.LossLess)]
        _8bps,

        [Description("Multicolor charset for Commodore 64"), Compression(CompressionKinds.Lossy)]
        a64_multi,

        [Description("Multicolor charset for Commodore 64, extended with 5th color (colram)"), Compression(CompressionKinds.Lossy)]
        a64_multi5,

        [Description("Autodesk RLE"), Compression(CompressionKinds.LossLess)]
        aasc,

        [Description("Apple Intermediate Codec"), Compression(CompressionKinds.Lossy)]
        aic,

        [Description("Alias/Wavefront PIX image"), Compression(CompressionKinds.LossLess)]
        alias_pix,

        [Description("AMV Video"), Compression(CompressionKinds.Lossy)]
        amv,

        [Description("Deluxe Paint Animation"), Compression(CompressionKinds.Lossy)]
        anm,

        [Description("ASCII/ANSI art"), Compression(CompressionKinds.Lossy)]
        ansi,

        [Description("APNG (Animated Portable Network Graphics) image"), Compression(CompressionKinds.LossLess)]
        apng,

        [Description("ASUS V1"), Compression(CompressionKinds.Lossy)]
        asv1,

        [Description("ASUS V2"), Compression(CompressionKinds.Lossy)]
        asv2,

        [Description("Auravision AURA"), Compression(CompressionKinds.Lossy)]
        aura,

        [Description("Auravision Aura 2"), Compression(CompressionKinds.Lossy)]
        aura2,

        [Description("Alliance for Open Media AV1"), Compression(CompressionKinds.Lossy)]
        av1,

        [Description("Avid AVI Codec")]
        avrn,

        [Description("Avid 1:1 10-bit RGB Packer"), Compression(CompressionKinds.LossLess)]
        avrp,

        [Description("AVS (Audio Video Standard) video"), Compression(CompressionKinds.Lossy)]
        avs,

        [Description("Avid Meridien Uncompressed"), Compression(CompressionKinds.LossLess)]
        avui,

        [Description("Uncompressed packed MS 4:4:4:4"), Compression(CompressionKinds.LossLess)]
        ayuv,

        [Description("Bethesda VID video"), Compression(CompressionKinds.Lossy)]
        bethsoftvid,

        [Description("Brute Force & Ignorance"), Compression(CompressionKinds.Lossy)]
        bfi,

        [Description("Bink video"), Compression(CompressionKinds.Lossy)]
        binkvideo,

        [Description("Binary text")]
        bintext,

        [Description("Bitpacked"), Compression(CompressionKinds.LossLess)]
        bitpacked,

        [Description("BMP (Windows and OS/2 bitmap)"), Compression(CompressionKinds.LossLess)]
        bmp,

        [Description("Discworld II BMV video"), Compression(CompressionKinds.LossLess)]
        bmv_video,

        [Description("BRender PIX image"), Compression(CompressionKinds.LossLess)]
        brender_pix,

        [Description("Interplay C93"), Compression(CompressionKinds.Lossy)]
        c93,

        [Description("Chinese AVS (Audio Video Standard) (AVS1-P2, JiZhun profile)"), Compression(CompressionKinds.Lossy)]
        cavs,

        [Description("CD Graphics video"), Compression(CompressionKinds.Lossy)]
        cdgraphics,

        [Description("Commodore CDXL video"), Compression(CompressionKinds.Lossy)]
        cdxl,

        [Description("Cineform HD"), Compression(CompressionKinds.Lossy)]
        cfhd,

        [Description("Cinepak"), Compression(CompressionKinds.Lossy)]
        cinepak,

        [Description("Iterated Systems ClearVideo"), Compression(CompressionKinds.Lossy)]
        clearvideo,

        [Description("Cirrus Logic AccuPak"), Compression(CompressionKinds.Lossy)]
        cljr,

        [Description("Canopus LossLess Codec"), Compression(CompressionKinds.LossLess)]
        cllc,

        [Description("Electronic Arts CMV video"), Compression(CompressionKinds.Lossy)]
        cmv,

        [Description("CPiA video format")] cpia,

        [Description("CamStudio"), Compression(CompressionKinds.LossLess)]
        cscd,

        [Description("Creative YUV (CYUV)"), Compression(CompressionKinds.Lossy)]
        cyuv,

        [Description("Daala"), Compression(CompressionKinds.Variable)]
        daala,

        [Description("DirectDraw Surface image decoder"), Compression(CompressionKinds.Variable)]
        dds,

        [Description("Chronomaster DFA"), Compression(CompressionKinds.Lossy)]
        dfa,

        [Description("Dirac"), Compression(CompressionKinds.Variable)]
        dirac,

        [Description("VC3/DNxHD"), Compression(CompressionKinds.Lossy)]
        dnxhd,

        [Description("DPX (Digital Picture Exchange) image"), Compression(CompressionKinds.LossLess)]
        dpx,

        [Description("Delphine Software International CIN video"), Compression(CompressionKinds.Lossy)]
        dsicinvideo,

        [Description("DV (Digital Video)"), Compression(CompressionKinds.Lossy)]
        dvvideo,

        [Description("Feeble Files/ScummVM DXA"), Compression(CompressionKinds.LossLess)]
        dxa,

        [Description("Dxtory"), Compression(CompressionKinds.LossLess)]
        dxtory,

        [Description("Resolume DXV"), Compression(CompressionKinds.Lossy)]
        dxv,

        [Description("Escape 124"), Compression(CompressionKinds.Lossy)]
        escape124,

        [Description("Escape 130"), Compression(CompressionKinds.Lossy)]
        escape130,

        [Description("OpenEXR image"), Compression(CompressionKinds.Variable)]
        exr,

        [Description("FFmpeg video codec #1"), Compression(CompressionKinds.LossLess)]
        ffv1,

        [Description("Huffyuv FFmpeg variant"), Compression(CompressionKinds.LossLess)]
        ffvhuff,

        [Description("Mirillis FIC"), Compression(CompressionKinds.Lossy)]
        fic,

        [Description("FITS (Flexible Image Transport System)"), Compression(CompressionKinds.LossLess)]
        fits,

        [Description("Flash Screen Video v1"), Compression(CompressionKinds.LossLess)]
        flashsv,

        [Description("Flash Screen Video v2"), Compression(CompressionKinds.Lossy)]
        flashsv2,

        [Description("Autodesk Animator Flic video"), Compression(CompressionKinds.LossLess)]
        flic,

        [Description("FM Screen Capture Codec"), Compression(CompressionKinds.LossLess)]
        fmvc,

        [Description("Fraps"), Compression(CompressionKinds.LossLess)]
        fraps,

        [Description("Forward Uncompressed"), Compression(CompressionKinds.LossLess)]
        frwu,

        [Description("Go2Meeting"), Compression(CompressionKinds.Lossy)]
        g2m,

        [Description("Gremlin Digital Video"), Compression(CompressionKinds.Lossy)]
        gdv,

        [Description("GIF (Graphics Interchange Format)"), Compression(CompressionKinds.LossLess)]
        gif,

        [Description("H.261"), Compression(CompressionKinds.Lossy)]
        h261,

        [Description("Intel H.263"), Compression(CompressionKinds.Lossy)]
        h263i,

        [Description("Vidvox Hap"), Compression(CompressionKinds.Lossy)]
        hap,

        [Description("HNM 4 video"), Compression(CompressionKinds.Lossy)]
        hnm4video,

        [Description("Canopus HQ/HQA"), Compression(CompressionKinds.Lossy)]
        hq_hqa,

        [Description("Canopus HQX"), Compression(CompressionKinds.Lossy)]
        hqx,

        [Description("HuffYUV"), Compression(CompressionKinds.LossLess)]
        huffyuv,

        [Description("id Quake II CIN video"), Compression(CompressionKinds.Lossy)]
        idcin,

        [Description("iCEDraw text")]
        idf,

        [Description("IFF ACBM/ANIM/DEEP/ILBM/PBM/RGB8/RGBN"), Compression(CompressionKinds.Lossy)]
        iff_ilbm,

        [Description("Intel Indeo 2"), Compression(CompressionKinds.Lossy)]
        indeo2,

        [Description("Intel Indeo 3"), Compression(CompressionKinds.Lossy)]
        indeo3,

        [Description("Intel Indeo Video Interactive 4"), Compression(CompressionKinds.Lossy)]
        indeo4,

        [Description("Intel Indeo Video Interactive 5"), Compression(CompressionKinds.Lossy)]
        indeo5,

        [Description("Interplay MVE video"), Compression(CompressionKinds.Lossy)]
        interplayvideo,

        [Description("JPEG 2000"), Compression(CompressionKinds.Variable)]
        jpeg2000,

        [Description("JPEG-LS"), Compression(CompressionKinds.Variable)]
        jpegls,

        [Description("Bitmap Brothers JV video"), Compression(CompressionKinds.Lossy)]
        jv,

        [Description("Kega Game Video"), Compression(CompressionKinds.Lossy)]
        kgv1,

        [Description("Karl Morton's video codec"), Compression(CompressionKinds.Lossy)]
        kmvc,

        [Description("Lagarith LossLess"), Compression(CompressionKinds.LossLess)]
        lagarith,

        [Description("LossLess JPEG"), Compression(CompressionKinds.LossLess)]
        ljpeg,

        [Description("LOCO"), Compression(CompressionKinds.LossLess)]
        loco,

        [Description("Matrox Uncompressed SD"), Compression(CompressionKinds.LossLess)]
        m101,

        [Description("Electronic Arts Madcow Video"), Compression(CompressionKinds.Lossy)]
        mad,

        [Description("MagicYUV video"), Compression(CompressionKinds.LossLess)]
        magicyuv,

        [Description("Sony PlayStation MDEC (Motion DECoder)"), Compression(CompressionKinds.Lossy)]
        mdec,

        [Description("Mimic"), Compression(CompressionKinds.Lossy)]
        mimic,

        [Description("Apple MJPEG-B"), Compression(CompressionKinds.Lossy)]
        mjpegb,

        [Description("American Laser Games MM Video"), Compression(CompressionKinds.Lossy)]
        mmvideo,

        [Description("Motion Pixels video"), Compression(CompressionKinds.Lossy)]
        motionpixels,

        [Description("MS ATC Screen"), Compression(CompressionKinds.Lossy)]
        msa1,

        [Description("Mandsoft Screen Capture Codec"), Compression(CompressionKinds.LossLess)]
        mscc,

        [Description("MPEG-4 part 2 Microsoft variant version 1"), Compression(CompressionKinds.Lossy)]
        msmpeg4v1,

        [Description("MPEG-4 part 2 Microsoft variant version 2"), Compression(CompressionKinds.Lossy)]
        msmpeg4v2,

        [Description("MPEG-4 part 2 Microsoft variant version 3"), Aliases("msmpeg4"), Compression(CompressionKinds.Lossy)]
        msmpeg4v3,

        [Description("Microsoft RLE"), Compression(CompressionKinds.LossLess)]
        msrle,

        [Description("MS Screen 1"), Compression(CompressionKinds.Lossy)]
        mss1,

        [Description("MS Windows Media Video V9 Screen"), Compression(CompressionKinds.Lossy)]
        mss2,

        [Description("LCL (LossLess Codec Library) MSZH"), Compression(CompressionKinds.LossLess)]
        mszh,

        [Description("MS Expression Encoder Screen"), Compression(CompressionKinds.Lossy)]
        mts2,

        [Description("Silicon Graphics Motion Video Compressor 1"), Compression(CompressionKinds.Lossy)]
        mvc1,

        [Description("Silicon Graphics Motion Video Compressor 2"), Compression(CompressionKinds.Lossy)]
        mvc2,

        [Description("Mobotix MxPEG video"), Compression(CompressionKinds.Lossy)]
        mxpeg,

        [Description("NuppelVideo/RTJPEG"), Compression(CompressionKinds.Lossy)]
        nuv,

        [Description("Amazing Studio Packed Animation File Video"), Compression(CompressionKinds.Lossy)]
        paf_video,

        [Description("PAM (Portable AnyMap) image"), Compression(CompressionKinds.LossLess)]
        pam,

        [Description("PBM (Portable BitMap) image"), Compression(CompressionKinds.LossLess)]
        pbm,

        [Description("PC Paintbrush PCX image"), Compression(CompressionKinds.LossLess)]
        pcx,

        [Description("PGM (Portable GrayMap) image"), Compression(CompressionKinds.LossLess)]
        pgm,

        [Description("PGMYUV (Portable GrayMap YUV) image"), Compression(CompressionKinds.LossLess)]
        pgmyuv,

        [Description("Pictor/PC Paint"), Compression(CompressionKinds.Lossy)]
        pictor,

        [Description("Apple Pixlet"), Compression(CompressionKinds.Lossy)]
        pixlet,

        [Description("PNG (Portable Network Graphics) image"), Compression(CompressionKinds.LossLess)]
        png,

        [Description("PPM (Portable PixelMap) image"), Compression(CompressionKinds.LossLess)]
        ppm,

        [Description("Apple ProRes (iCodec Pro)"), Compression(CompressionKinds.Lossy)]
        prores,

        [Description("Photoshop PSD file"), Compression(CompressionKinds.LossLess)]
        psd,

        [Description("V.Flash PTX image"), Compression(CompressionKinds.Lossy)]
        ptx,

        [Description("Apple QuickDraw"), Compression(CompressionKinds.LossLess)]
        qdraw,

        [Description("Q-team QPEG"), Compression(CompressionKinds.Lossy)]
        qpeg,

        [Description("QuickTime Animation (RLE) video"), Compression(CompressionKinds.LossLess)]
        qtrle,

        [Description("AJA Kona 10-bit RGB Codec"), Compression(CompressionKinds.LossLess)]
        r10k,

        [Description("Uncompressed RGB 10-bit"), Compression(CompressionKinds.LossLess)]
        r210,

        [Description("raw video"), Compression(CompressionKinds.LossLess)]
        rawvideo,

        [Description("RL2 video"), Compression(CompressionKinds.Lossy)]
        rl2,

        [Description("id RoQ video"), Compression(CompressionKinds.Lossy)]
        roq,

        [Description("QuickTime video (RPZA)"), Compression(CompressionKinds.Lossy)]
        rpza,

        [Description("innoHeim/Rsupport Screen Capture Codec"), Compression(CompressionKinds.LossLess)]
        rscc,

        [Description("RealVideo 1.0"), Compression(CompressionKinds.Lossy)]
        rv10,

        [Description("RealVideo 2.0"), Compression(CompressionKinds.Lossy)]
        rv20,

        [Description("RealVideo 3.0"), Compression(CompressionKinds.Lossy)]
        rv30,

        [Description("RealVideo 4.0"), Compression(CompressionKinds.Lossy)]
        rv40,

        [Description("LucasArts SANM/SMUSH video"), Compression(CompressionKinds.Lossy)]
        sanm,

        [Description("ScreenPressor"), Compression(CompressionKinds.Variable)]
        scpr,

        [Description("Screenpresso"), Compression(CompressionKinds.LossLess)]
        screenpresso,

        [Description("SGI image"), Compression(CompressionKinds.LossLess)]
        sgi,

        [Description("SGI RLE 8-bit"), Compression(CompressionKinds.LossLess)]
        sgirle,

        [Description("BitJazz SheerVideo"), Compression(CompressionKinds.LossLess)]
        sheervideo,

        [Description("Smacker video"), Compression(CompressionKinds.Lossy)]
        smackvideo,

        [Description("QuickTime Graphics (SMC)"), Compression(CompressionKinds.Lossy)]
        smc,

        [Description("Sigmatel Motion Video")]
        smvjpeg,

        [Description("Snow"), Compression(CompressionKinds.Variable)]
        snow,

        [Description("Sunplus JPEG (SP5X)"), Compression(CompressionKinds.Lossy)]
        sp5x,

        [Description("NewTek SpeedHQ"), Compression(CompressionKinds.Lossy)]
        speedhq,

        [Description("Screen Recorder Gold Codec"), Compression(CompressionKinds.LossLess)]
        srgc,

        [Description("Sun Rasterfile image"), Compression(CompressionKinds.LossLess)]
        sunrast,

        [Description("Scalable Vector Graphics"), Compression(CompressionKinds.LossLess)]
        svg,

        [Description("Sorenson Vector Quantizer 1 / Sorenson Video 1 / SVQ1"), Compression(CompressionKinds.Lossy)]
        svq1,

        [Description("Sorenson Vector Quantizer 3 / Sorenson Video 3 / SVQ3"), Compression(CompressionKinds.Lossy)]
        svq3,

        [Description("Truevision Targa image"), Compression(CompressionKinds.LossLess)]
        targa,

        [Description("Pinnacle TARGA CineWave YUV16"), Compression(CompressionKinds.LossLess)]
        targa_y216,

        [Description("TDSC"), Compression(CompressionKinds.Lossy)]
        tdsc,

        [Description("Electronic Arts TGQ video"), Compression(CompressionKinds.Lossy)]
        tgq,

        [Description("Electronic Arts TGV video"), Compression(CompressionKinds.Lossy)]
        tgv,

        [Description("Nintendo Gamecube THP video"), Compression(CompressionKinds.Lossy)]
        thp,

        [Description("Tiertex Limited SEQ video"), Compression(CompressionKinds.Lossy)]
        tiertexseqvideo,

        [Description("TIFF image"), Compression(CompressionKinds.LossLess)]
        tiff,

        [Description("8088flex TMV"), Compression(CompressionKinds.Lossy)]
        tmv,

        [Description("Electronic Arts TQI video"), Compression(CompressionKinds.Lossy)]
        tqi,

        [Description("Duck TrueMotion 1.0"), Compression(CompressionKinds.Lossy)]
        truemotion1,

        [Description("Duck TrueMotion 2.0"), Compression(CompressionKinds.Lossy)]
        truemotion2,

        [Description("Duck TrueMotion 2.0 Real Time"), Compression(CompressionKinds.Lossy)]
        truemotion2rt,

        [Description("TechSmith Screen Capture Codec"), Compression(CompressionKinds.LossLess)]
        tscc,

        [Description("TechSmith Screen Codec 2"), Compression(CompressionKinds.Lossy)]
        tscc2,

        [Description("Renderware TXD (TeXture Dictionary) image"), Compression(CompressionKinds.Lossy)]
        txd,

        [Description("IBM UltiMotion"), Compression(CompressionKinds.Lossy)]
        ulti,

        [Description("Ut Video"), Compression(CompressionKinds.LossLess)]
        utvideo,

        [Description("Uncompressed 4:2:2 10-bit"), Compression(CompressionKinds.LossLess)]
        v210,

        [Description("Uncompressed 4:2:2 10-bit"), Compression(CompressionKinds.LossLess)]
        v210x,

        [Description("Uncompressed packed 4:4:4"), Compression(CompressionKinds.LossLess)]
        v308,

        [Description("Uncompressed packed QT 4:4:4:4"), Compression(CompressionKinds.LossLess)]
        v408,

        [Description("Uncompressed 4:4:4 10-bit"), Compression(CompressionKinds.LossLess)]
        v410,

        [Description("Beam Software VB"), Compression(CompressionKinds.Lossy)]
        vb,

        [Description("VBLE LossLess Codec"), Compression(CompressionKinds.LossLess)]
        vble,

        [Description("ATI VCR1"), Compression(CompressionKinds.Lossy)]
        vcr1,

        [Description("Miro VideoXL"), Compression(CompressionKinds.Lossy)]
        vixl,

        [Description("Sierra VMD video"), Compression(CompressionKinds.Lossy)]
        vmdvideo,

        [Description("VMware Screen Codec / VMware Video"), Compression(CompressionKinds.LossLess)]
        vmnc,

        [Description("On2 VP3"), Compression(CompressionKinds.Lossy)]
        vp3,

        [Description("On2 VP5"), Compression(CompressionKinds.Lossy)]
        vp5,

        [Description("On2 VP6"), Compression(CompressionKinds.Lossy)]
        vp6,

        [Description("On2 VP6 (Flash version, with alpha channel)"), Compression(CompressionKinds.Lossy)]
        vp6a,

        [Description("On2 VP6 (Flash version)"), Compression(CompressionKinds.Lossy)]
        vp6f,

        [Description("On2 VP7"), Compression(CompressionKinds.Lossy)]
        vp7,

        [Description("WebP"), Compression(CompressionKinds.Variable)]
        webp,

        [Description("Windows Media Video 9 Image"), Compression(CompressionKinds.Lossy)]
        wmv3image,

        [Description("Winnov WNV1"), Compression(CompressionKinds.Lossy)]
        wnv1,

        [Description("AVFrame to AVPacket passthrough"), Compression(CompressionKinds.LossLess)]
        wrapped_avframe,

        [Description("Westwood Studios VQA (Vector Quantized Animation) video "), Compression(CompressionKinds.Lossy)]
        ws_vqa,

        [Description("Wing Commander III / Xan"), Compression(CompressionKinds.Lossy)]
        xan_wc3,

        [Description("Wing Commander IV / Xxan"), Compression(CompressionKinds.Lossy)]
        xan_wc4,

        [Description("eXtended BINary text")]
        xbin,

        [Description("XBM (X BitMap) image"), Compression(CompressionKinds.LossLess)]
        xbm,

        [Description("X-face image"), Compression(CompressionKinds.Lossy)]
        xface,

        [Description("XPM (X PixMap) image"), Compression(CompressionKinds.LossLess)]
        xpm,

        [Description("XWD (X Window Dump) image"), Compression(CompressionKinds.LossLess)]
        xwd,

        [Description("Uncompressed YUV 4:1:1 12-bit"), Compression(CompressionKinds.LossLess)]
        y41p,

        [Description("YUY2 LossLess Codec"), Compression(CompressionKinds.LossLess)]
        ylc,

        [Description("Psygnosis YOP Video"), Compression(CompressionKinds.Lossy)]
        yop,

        [Description("Uncompressed packed 4:2:0"), Compression(CompressionKinds.LossLess)]
        yuv4,

        [Description("ZeroCodec LossLess Video"), Compression(CompressionKinds.LossLess)]
        zerocodec,

        [Description("LCL (LossLess Codec Library) ZLIB"), Compression(CompressionKinds.LossLess)]
        zlib,

        [Description("Zip Motion Blocks Video"), Compression(CompressionKinds.LossLess)]
        zmbv,
    }
}