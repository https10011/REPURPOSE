package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o80 {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final l80 G;
    public static final l80[][] H;
    public static final l80[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final List m = Arrays.asList(1, 6, 3, 8);
    public static final List n = Arrays.asList(2, 7, 4, 5);
    public static final int[] o = {8, 8, 8};
    public static final int[] p = {8};
    public static final byte[] q = {-1, -40, -1};
    public static final byte[] r = {102, 116, 121, 112};
    public static final byte[] s = {109, 105, 102, 49};
    public static final byte[] t = {104, 101, 105, 99};
    public static final byte[] u = {79, 76, 89, 77, 80, 0};
    public static final byte[] v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] w = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] x = {101, 88, 73, 102};
    public static final byte[] y = {73, 72, 68, 82};
    public static final byte[] z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        l80[] l80VarArr = {new l80("NewSubfileType", 254, 4), new l80("SubfileType", 255, 4), new l80("ImageWidth", 256, 3, 4), new l80("ImageLength", 257, 3, 4), new l80("BitsPerSample", 258, 3), new l80("Compression", 259, 3), new l80("PhotometricInterpretation", 262, 3), new l80("ImageDescription", 270, 2), new l80("Make", 271, 2), new l80("Model", 272, 2), new l80("StripOffsets", 273, 3, 4), new l80("Orientation", 274, 3), new l80("SamplesPerPixel", 277, 3), new l80("RowsPerStrip", 278, 3, 4), new l80("StripByteCounts", 279, 3, 4), new l80("XResolution", 282, 5), new l80("YResolution", 283, 5), new l80("PlanarConfiguration", 284, 3), new l80("ResolutionUnit", 296, 3), new l80("TransferFunction", 301, 3), new l80("Software", 305, 2), new l80("DateTime", 306, 2), new l80("Artist", 315, 2), new l80("WhitePoint", 318, 5), new l80("PrimaryChromaticities", 319, 5), new l80("SubIFDPointer", 330, 4), new l80("JPEGInterchangeFormat", 513, 4), new l80("JPEGInterchangeFormatLength", 514, 4), new l80("YCbCrCoefficients", 529, 5), new l80("YCbCrSubSampling", 530, 3), new l80("YCbCrPositioning", 531, 3), new l80("ReferenceBlackWhite", 532, 5), new l80("Copyright", 33432, 2), new l80("ExifIFDPointer", 34665, 4), new l80("GPSInfoIFDPointer", 34853, 4), new l80("SensorTopBorder", 4, 4), new l80("SensorLeftBorder", 5, 4), new l80("SensorBottomBorder", 6, 4), new l80("SensorRightBorder", 7, 4), new l80("ISO", 23, 3), new l80("JpgFromRaw", 46, 7), new l80("Xmp", 700, 1)};
        l80[] l80VarArr2 = {new l80("ExposureTime", 33434, 5), new l80("FNumber", 33437, 5), new l80("ExposureProgram", 34850, 3), new l80("SpectralSensitivity", 34852, 2), new l80("PhotographicSensitivity", 34855, 3), new l80("OECF", 34856, 7), new l80("SensitivityType", 34864, 3), new l80("StandardOutputSensitivity", 34865, 4), new l80("RecommendedExposureIndex", 34866, 4), new l80("ISOSpeed", 34867, 4), new l80("ISOSpeedLatitudeyyy", 34868, 4), new l80("ISOSpeedLatitudezzz", 34869, 4), new l80("ExifVersion", 36864, 2), new l80("DateTimeOriginal", 36867, 2), new l80("DateTimeDigitized", 36868, 2), new l80("OffsetTime", 36880, 2), new l80("OffsetTimeOriginal", 36881, 2), new l80("OffsetTimeDigitized", 36882, 2), new l80("ComponentsConfiguration", 37121, 7), new l80("CompressedBitsPerPixel", 37122, 5), new l80("ShutterSpeedValue", 37377, 10), new l80("ApertureValue", 37378, 5), new l80("BrightnessValue", 37379, 10), new l80("ExposureBiasValue", 37380, 10), new l80("MaxApertureValue", 37381, 5), new l80("SubjectDistance", 37382, 5), new l80("MeteringMode", 37383, 3), new l80("LightSource", 37384, 3), new l80("Flash", 37385, 3), new l80("FocalLength", 37386, 5), new l80("SubjectArea", 37396, 3), new l80("MakerNote", 37500, 7), new l80("UserComment", 37510, 7), new l80("SubSecTime", 37520, 2), new l80("SubSecTimeOriginal", 37521, 2), new l80("SubSecTimeDigitized", 37522, 2), new l80("FlashpixVersion", 40960, 7), new l80("ColorSpace", 40961, 3), new l80("PixelXDimension", 40962, 3, 4), new l80("PixelYDimension", 40963, 3, 4), new l80("RelatedSoundFile", 40964, 2), new l80("InteroperabilityIFDPointer", 40965, 4), new l80("FlashEnergy", 41483, 5), new l80("SpatialFrequencyResponse", 41484, 7), new l80("FocalPlaneXResolution", 41486, 5), new l80("FocalPlaneYResolution", 41487, 5), new l80("FocalPlaneResolutionUnit", 41488, 3), new l80("SubjectLocation", 41492, 3), new l80("ExposureIndex", 41493, 5), new l80("SensingMethod", 41495, 3), new l80("FileSource", 41728, 7), new l80("SceneType", 41729, 7), new l80("CFAPattern", 41730, 7), new l80("CustomRendered", 41985, 3), new l80("ExposureMode", 41986, 3), new l80("WhiteBalance", 41987, 3), new l80("DigitalZoomRatio", 41988, 5), new l80("FocalLengthIn35mmFilm", 41989, 3), new l80("SceneCaptureType", 41990, 3), new l80("GainControl", 41991, 3), new l80("Contrast", 41992, 3), new l80("Saturation", 41993, 3), new l80("Sharpness", 41994, 3), new l80("DeviceSettingDescription", 41995, 7), new l80("SubjectDistanceRange", 41996, 3), new l80("ImageUniqueID", 42016, 2), new l80("CameraOwnerName", 42032, 2), new l80("BodySerialNumber", 42033, 2), new l80("LensSpecification", 42034, 5), new l80("LensMake", 42035, 2), new l80("LensModel", 42036, 2), new l80("Gamma", 42240, 5), new l80("DNGVersion", 50706, 1), new l80("DefaultCropSize", 50720, 3, 4)};
        l80[] l80VarArr3 = {new l80("GPSVersionID", 0, 1), new l80("GPSLatitudeRef", 1, 2), new l80("GPSLatitude", 2, 5, 10), new l80("GPSLongitudeRef", 3, 2), new l80("GPSLongitude", 4, 5, 10), new l80("GPSAltitudeRef", 5, 1), new l80("GPSAltitude", 6, 5), new l80("GPSTimeStamp", 7, 5), new l80("GPSSatellites", 8, 2), new l80("GPSStatus", 9, 2), new l80("GPSMeasureMode", 10, 2), new l80("GPSDOP", 11, 5), new l80("GPSSpeedRef", 12, 2), new l80("GPSSpeed", 13, 5), new l80("GPSTrackRef", 14, 2), new l80("GPSTrack", 15, 5), new l80("GPSImgDirectionRef", 16, 2), new l80("GPSImgDirection", 17, 5), new l80("GPSMapDatum", 18, 2), new l80("GPSDestLatitudeRef", 19, 2), new l80("GPSDestLatitude", 20, 5), new l80("GPSDestLongitudeRef", 21, 2), new l80("GPSDestLongitude", 22, 5), new l80("GPSDestBearingRef", 23, 2), new l80("GPSDestBearing", 24, 5), new l80("GPSDestDistanceRef", 25, 2), new l80("GPSDestDistance", 26, 5), new l80("GPSProcessingMethod", 27, 7), new l80("GPSAreaInformation", 28, 7), new l80("GPSDateStamp", 29, 2), new l80("GPSDifferential", 30, 3), new l80("GPSHPositioningError", 31, 5)};
        l80[] l80VarArr4 = {new l80("InteroperabilityIndex", 1, 2)};
        l80[] l80VarArr5 = {new l80("NewSubfileType", 254, 4), new l80("SubfileType", 255, 4), new l80("ThumbnailImageWidth", 256, 3, 4), new l80("ThumbnailImageLength", 257, 3, 4), new l80("BitsPerSample", 258, 3), new l80("Compression", 259, 3), new l80("PhotometricInterpretation", 262, 3), new l80("ImageDescription", 270, 2), new l80("Make", 271, 2), new l80("Model", 272, 2), new l80("StripOffsets", 273, 3, 4), new l80("ThumbnailOrientation", 274, 3), new l80("SamplesPerPixel", 277, 3), new l80("RowsPerStrip", 278, 3, 4), new l80("StripByteCounts", 279, 3, 4), new l80("XResolution", 282, 5), new l80("YResolution", 283, 5), new l80("PlanarConfiguration", 284, 3), new l80("ResolutionUnit", 296, 3), new l80("TransferFunction", 301, 3), new l80("Software", 305, 2), new l80("DateTime", 306, 2), new l80("Artist", 315, 2), new l80("WhitePoint", 318, 5), new l80("PrimaryChromaticities", 319, 5), new l80("SubIFDPointer", 330, 4), new l80("JPEGInterchangeFormat", 513, 4), new l80("JPEGInterchangeFormatLength", 514, 4), new l80("YCbCrCoefficients", 529, 5), new l80("YCbCrSubSampling", 530, 3), new l80("YCbCrPositioning", 531, 3), new l80("ReferenceBlackWhite", 532, 5), new l80("Copyright", 33432, 2), new l80("ExifIFDPointer", 34665, 4), new l80("GPSInfoIFDPointer", 34853, 4), new l80("DNGVersion", 50706, 1), new l80("DefaultCropSize", 50720, 3, 4)};
        G = new l80("StripOffsets", 273, 3);
        H = new l80[][]{l80VarArr, l80VarArr2, l80VarArr3, l80VarArr4, l80VarArr5, l80VarArr, new l80[]{new l80("ThumbnailImage", 256, 7), new l80("CameraSettingsIFDPointer", 8224, 4), new l80("ImageProcessingIFDPointer", 8256, 4)}, new l80[]{new l80("PreviewImageStart", 257, 4), new l80("PreviewImageLength", 258, 4)}, new l80[]{new l80("AspectFrame", 4371, 3)}, new l80[]{new l80("ColorSpace", 55, 3)}};
        I = new l80[]{new l80("SubIFDPointer", 330, 4), new l80("ExifIFDPointer", 34665, 4), new l80("GPSInfoIFDPointer", 34853, 4), new l80("InteroperabilityIFDPointer", 40965, 4), new l80("CameraSettingsIFDPointer", 8224, 1), new l80("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        N = charsetForName;
        O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            l80[][] l80VarArr6 = H;
            if (i >= l80VarArr6.length) {
                HashMap map = M;
                l80[] l80VarArr7 = I;
                map.put(Integer.valueOf(l80VarArr7[0].a), 5);
                map.put(Integer.valueOf(l80VarArr7[1].a), 1);
                map.put(Integer.valueOf(l80VarArr7[2].a), 2);
                map.put(Integer.valueOf(l80VarArr7[3].a), 3);
                map.put(Integer.valueOf(l80VarArr7[4].a), 7);
                map.put(Integer.valueOf(l80VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i] = new HashMap();
            K[i] = new HashMap();
            for (l80 l80Var : l80VarArr6[i]) {
                J[i].put(Integer.valueOf(l80Var.a), l80Var);
                K[i].put(l80Var.b, l80Var);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public o80(InputStream inputStream) throws IOException {
        l80[][] l80VarArr = H;
        this.d = new HashMap[l80VarArr.length];
        this.e = new HashSet(l80VarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z3 = l;
        if (z2) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                q80.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.b = null;
                this.a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z3) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.b = null;
                this.a = null;
            }
        } else {
            this.b = null;
            this.a = null;
        }
        for (int i = 0; i < l80VarArr.length; i++) {
            try {
                try {
                    this.d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            j80 j80Var = new j80(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 4) {
                e(j80Var, 0, 0);
            } else if (i2 == 13) {
                h(j80Var);
            } else if (i2 == 9) {
                i(j80Var);
            } else if (i2 == 14) {
                l(j80Var);
            }
        } else {
            n80 n80Var = new n80(bufferedInputStream);
            int i3 = this.c;
            if (i3 == 12) {
                d(n80Var);
            } else if (i3 == 7) {
                g(n80Var);
            } else if (i3 == 10) {
                k(n80Var);
            } else {
                j(n80Var);
            }
            n80Var.b(this.h);
            u(n80Var);
        }
        a();
        if (!z3) {
            return;
        }
        p();
    }

    public static ByteOrder q(j80 j80Var) throws IOException {
        short s2 = j80Var.readShort();
        boolean z2 = l;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            ur.h(Integer.toHexString(s2), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(N);
            map.put("DateTime", new k80(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", k80.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", k80.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", k80.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", k80.a(0L, this.f));
        }
    }

    public final String b(String str) {
        k80 k80VarC = c(str);
        if (k80VarC != null) {
            int i = k80VarC.a;
            if (!L.contains(str)) {
                return k80VarC.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                m80[] m80VarArr = (m80[]) k80VarC.g(this.f);
                if (m80VarArr == null || m80VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(m80VarArr));
                    return null;
                }
                m80 m80Var = m80VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (m80Var.a / m80Var.b));
                m80 m80Var2 = m80VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (m80Var2.a / m80Var2.b));
                m80 m80Var3 = m80VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (m80Var3.a / m80Var3.b)));
            }
            try {
                return Double.toString(k80VarC.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final k80 c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < H.length; i++) {
            k80 k80Var = (k80) this.d[i].get(str);
            if (k80Var != null) {
                return k80Var;
            }
        }
        return null;
    }

    public final void d(n80 n80Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            sm0.h("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                r80.a(mediaMetadataRetriever, new i80(n80Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", k80.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", k80.c(Integer.parseInt(strExtractMetadata2), this.f));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", k80.c(i, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    n80Var.b(i3);
                    byte[] bArr = new byte[6];
                    if (n80Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (n80Var.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.h = i5;
                    r(bArr2, 0);
                }
                if (l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144 A[LOOP:2: B:69:0x013a->B:74:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.util.Collections$UnmodifiableCollection.add(Collections.java:1138)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:38)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:25)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:38)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:5)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:50)
        */
    public final void e(defpackage.j80 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.e(j80, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x015d A[LOOP:3: B:117:0x0151->B:122:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:129:0x0171 A[LOOP:4: B:124:0x0162->B:129:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0177 A[LOOP:2: B:112:0x0144->B:132:0x0177, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x017f  */
    /* JADX WARN: Code duplicated, block: B:152:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0170 A[EDGE_INSN: B:166:0x0170->B:128:0x0170 BREAK  A[LOOP:3: B:117:0x0151->B:122:0x015d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0170 A[EDGE_INSN: B:168:0x0170->B:128:0x0170 BREAK  A[LOOP:3: B:117:0x0151->B:122:0x015d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:14:0x0039, B:19:0x005a, B:30:0x0076, B:33:0x007c, B:34:0x0082, B:38:0x008c, B:44:0x009b, B:47:0x00a5, B:62:0x00c6, B:64:0x00ca), top: B:145:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        j80 j80Var;
        j80 j80Var2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        j80 j80Var3;
        short s2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = q;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    byte b = bArr4[i8];
                    ?? r7 = bytes[i8];
                    if (b != r7) {
                        ?? r4 = 0;
                        j80 j80Var4 = null;
                        j80 j80Var5 = null;
                        j80 j80Var6 = null;
                        try {
                            try {
                                try {
                                    try {
                                        j80Var = new j80(bArr4);
                                        try {
                                            long j2 = j80Var.readInt();
                                            byte[] bArr6 = new byte[4];
                                            j80Var.read(bArr6);
                                            if (Arrays.equals(bArr6, r)) {
                                                if (j2 == 1) {
                                                    j2 = j80Var.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    long j4 = 0;
                                                    boolean z2 = false;
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (j4 >= j3 / 4) {
                                                            i = 0;
                                                            break;
                                                        }
                                                        i = 0;
                                                        try {
                                                            if (j80Var.read(bArr7) != 4) {
                                                                break;
                                                            }
                                                            if (j4 != 1) {
                                                                if (Arrays.equals(bArr7, s)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr7, t)) {
                                                                    z3 = true;
                                                                }
                                                                if (z2 && z3) {
                                                                    j80Var.close();
                                                                    return 12;
                                                                }
                                                            }
                                                            j4++;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            if (l) {
                                                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                            }
                                                            if (j80Var != null) {
                                                                break;
                                                            }
                                                            j80Var2 = new j80(bArr4);
                                                            ByteOrder byteOrderQ = q(j80Var2);
                                                            this.f = byteOrderQ;
                                                            j80Var2.b = byteOrderQ;
                                                            s2 = j80Var2.readShort();
                                                            if (s2 != 20306) {
                                                                i2 = 1;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            j80Var2.close();
                                                            if (i2 != 0) {
                                                                return 7;
                                                            }
                                                            try {
                                                                j80Var3 = new j80(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderQ2 = q(j80Var3);
                                                                    this.f = byteOrderQ2;
                                                                    j80Var3.b = byteOrderQ2;
                                                                    i3 = j80Var3.readShort() != 85 ? i : 1;
                                                                    j80Var3.close();
                                                                } catch (Exception unused) {
                                                                    j80Var4 = j80Var3;
                                                                    if (j80Var4 != null) {
                                                                        j80Var4.close();
                                                                    }
                                                                    i3 = i;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    j80Var5 = j80Var3;
                                                                    if (j80Var5 != null) {
                                                                        j80Var5.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                            }
                                                            if (i3 != 0) {
                                                                return 10;
                                                            }
                                                            i4 = i;
                                                            while (true) {
                                                                bArr = w;
                                                                if (i4 < bArr.length) {
                                                                    return 13;
                                                                }
                                                                if (bArr4[i4] != bArr[i4]) {
                                                                    i5 = i;
                                                                    while (true) {
                                                                        bArr2 = A;
                                                                        if (i5 < bArr2.length) {
                                                                            i6 = i;
                                                                            while (true) {
                                                                                bArr3 = B;
                                                                                if (i6 < bArr3.length) {
                                                                                    return 14;
                                                                                }
                                                                                if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                                    break;
                                                                                }
                                                                                i6++;
                                                                            }
                                                                        } else {
                                                                            if (bArr4[i5] != bArr2[i5]) {
                                                                                break;
                                                                            }
                                                                            i5++;
                                                                        }
                                                                    }
                                                                    return i;
                                                                }
                                                                i4++;
                                                            }
                                                        }
                                                    }
                                                    j80Var.close();
                                                    j80Var2 = new j80(bArr4);
                                                    ByteOrder byteOrderQ3 = q(j80Var2);
                                                    this.f = byteOrderQ3;
                                                    j80Var2.b = byteOrderQ3;
                                                    s2 = j80Var2.readShort();
                                                    if (s2 != 20306 || s2 == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    j80Var2.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    j80Var3 = new j80(bArr4);
                                                    ByteOrder byteOrderQ4 = q(j80Var3);
                                                    this.f = byteOrderQ4;
                                                    j80Var3.b = byteOrderQ4;
                                                    if (j80Var3.readShort() != 85) {
                                                    }
                                                    j80Var3.close();
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = w;
                                                        if (i4 < bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            while (true) {
                                                                bArr2 = A;
                                                                if (i5 < bArr2.length) {
                                                                    i6 = i;
                                                                    while (true) {
                                                                        bArr3 = B;
                                                                        if (i6 < bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i5] != bArr2[i5]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                            }
                                                            return i;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                                if (l) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (j80Var != null) {
                                                    j80Var.close();
                                                }
                                                j80Var2 = new j80(bArr4);
                                                ByteOrder byteOrderQ5 = q(j80Var2);
                                                this.f = byteOrderQ5;
                                                j80Var2.b = byteOrderQ5;
                                                s2 = j80Var2.readShort();
                                                if (s2 != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                j80Var2.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                j80Var3 = new j80(bArr4);
                                                ByteOrder byteOrderQ6 = q(j80Var3);
                                                this.f = byteOrderQ6;
                                                j80Var3.b = byteOrderQ6;
                                                if (j80Var3.readShort() != 85) {
                                                }
                                                j80Var3.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = w;
                                                    if (i4 < bArr.length) {
                                                        return 13;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        i5 = i;
                                                        while (true) {
                                                            bArr2 = A;
                                                            if (i5 < bArr2.length) {
                                                                i6 = i;
                                                                while (true) {
                                                                    bArr3 = B;
                                                                    if (i6 < bArr3.length) {
                                                                        return 14;
                                                                    }
                                                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            } else {
                                                                if (bArr4[i5] != bArr2[i5]) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i5++;
                                                            }
                                                        }
                                                        return i;
                                                    }
                                                    i4++;
                                                }
                                            }
                                            j80Var.close();
                                            i = 0;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i = 0;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r4 = r7;
                                        if (r4 != 0) {
                                            r4.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i = 0;
                                    j80Var = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    throw th;
                                }
                                ByteOrder byteOrderQ7 = q(j80Var2);
                                this.f = byteOrderQ7;
                                j80Var2.b = byteOrderQ7;
                                s2 = j80Var2.readShort();
                                if (s2 != 20306) {
                                    i2 = 1;
                                } else {
                                    i2 = 1;
                                }
                                j80Var2.close();
                            } catch (Exception unused3) {
                                if (j80Var2 != null) {
                                    j80Var2.close();
                                }
                                i2 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                j80Var6 = j80Var2;
                                if (j80Var6 != null) {
                                    j80Var6.close();
                                }
                                throw th;
                            }
                            j80Var2 = new j80(bArr4);
                        } catch (Exception unused4) {
                            j80Var2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i2 != 0) {
                            return 7;
                        }
                        j80Var3 = new j80(bArr4);
                        ByteOrder byteOrderQ8 = q(j80Var3);
                        this.f = byteOrderQ8;
                        j80Var3.b = byteOrderQ8;
                        if (j80Var3.readShort() != 85) {
                        }
                        j80Var3.close();
                        if (i3 != 0) {
                            return 10;
                        }
                        i4 = i;
                        while (true) {
                            bArr = w;
                            if (i4 < bArr.length) {
                                return 13;
                            }
                            if (bArr4[i4] != bArr[i4]) {
                                i5 = i;
                                while (true) {
                                    bArr2 = A;
                                    if (i5 < bArr2.length) {
                                        i6 = i;
                                        while (true) {
                                            bArr3 = B;
                                            if (i6 < bArr3.length) {
                                                return 14;
                                            }
                                            if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                break;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } else {
                                        if (bArr4[i5] != bArr2[i5]) {
                                            break;
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                                return i;
                            }
                            i4++;
                        }
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    public final void g(n80 n80Var) throws Throwable {
        int i;
        int i2;
        j(n80Var);
        HashMap[] mapArr = this.d;
        k80 k80Var = (k80) mapArr[1].get("MakerNote");
        if (k80Var != null) {
            n80 n80Var2 = new n80(k80Var.d);
            n80Var2.b = this.f;
            byte[] bArr = u;
            byte[] bArr2 = new byte[bArr.length];
            n80Var2.readFully(bArr2);
            n80Var2.b(0L);
            byte[] bArr3 = v;
            byte[] bArr4 = new byte[bArr3.length];
            n80Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                n80Var2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                n80Var2.b(12L);
            }
            s(n80Var2, 6);
            k80 k80Var2 = (k80) mapArr[7].get("PreviewImageStart");
            k80 k80Var3 = (k80) mapArr[7].get("PreviewImageLength");
            if (k80Var2 != null && k80Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", k80Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", k80Var3);
            }
            k80 k80Var4 = (k80) mapArr[8].get("AspectFrame");
            if (k80Var4 != null) {
                int[] iArr = (int[]) k80Var4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                k80 k80VarC = k80.c(i5, this.f);
                k80 k80VarC2 = k80.c(i6, this.f);
                mapArr[0].put("ImageWidth", k80VarC);
                mapArr[0].put("ImageLength", k80VarC2);
            }
        }
    }

    public final void h(j80 j80Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + j80Var);
        }
        j80Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = w;
        j80Var.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = j80Var.readInt();
                byte[] bArr2 = new byte[4];
                if (j80Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, z)) {
                    return;
                }
                if (Arrays.equals(bArr2, x)) {
                    byte[] bArr3 = new byte[i];
                    if (j80Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + yi0.d(bArr2));
                    }
                    int i3 = j80Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.h = i2;
                        r(bArr3, 0);
                        x();
                        u(new j80(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                j80Var.a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                uq1.o("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void i(j80 j80Var) throws Throwable {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + j80Var);
        }
        j80Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        j80Var.read(bArr);
        j80Var.read(bArr2);
        j80Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        j80Var.a(i - j80Var.c);
        j80Var.read(bArr4);
        e(new j80(bArr4), i, 5);
        j80Var.a(i3 - j80Var.c);
        j80Var.b = ByteOrder.BIG_ENDIAN;
        int i4 = j80Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = j80Var.readUnsignedShort();
            int unsignedShort2 = j80Var.readUnsignedShort();
            if (unsignedShort == G.a) {
                short s2 = j80Var.readShort();
                short s3 = j80Var.readShort();
                k80 k80VarC = k80.c(s2, this.f);
                k80 k80VarC2 = k80.c(s3, this.f);
                HashMap[] mapArr = this.d;
                mapArr[0].put("ImageLength", k80VarC);
                mapArr[0].put("ImageWidth", k80VarC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            j80Var.a(unsignedShort2);
        }
    }

    public final void j(n80 n80Var) throws Throwable {
        o(n80Var);
        s(n80Var, 0);
        w(n80Var, 0);
        w(n80Var, 5);
        w(n80Var, 4);
        x();
        if (this.c == 8) {
            HashMap[] mapArr = this.d;
            k80 k80Var = (k80) mapArr[1].get("MakerNote");
            if (k80Var != null) {
                n80 n80Var2 = new n80(k80Var.d);
                n80Var2.b = this.f;
                n80Var2.a(6);
                s(n80Var2, 9);
                k80 k80Var2 = (k80) mapArr[9].get("ColorSpace");
                if (k80Var2 != null) {
                    mapArr[1].put("ColorSpace", k80Var2);
                }
            }
        }
    }

    public final void k(n80 n80Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + n80Var);
        }
        j(n80Var);
        HashMap[] mapArr = this.d;
        k80 k80Var = (k80) mapArr[0].get("JpgFromRaw");
        if (k80Var != null) {
            e(new j80(k80Var.d), (int) k80Var.c, 5);
        }
        k80 k80Var2 = (k80) mapArr[0].get("ISO");
        k80 k80Var3 = (k80) mapArr[1].get("PhotographicSensitivity");
        if (k80Var2 == null || k80Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", k80Var2);
    }

    public final void l(j80 j80Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + j80Var);
        }
        j80Var.b = ByteOrder.LITTLE_ENDIAN;
        j80Var.a(A.length);
        int i = j80Var.readInt() + 8;
        byte[] bArr = B;
        j80Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (j80Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = j80Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (j80Var.read(bArr3) == i2) {
                        this.h = i3;
                        r(bArr3, 0);
                        u(new j80(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + yi0.d(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                j80Var.a(i2);
            } catch (EOFException unused) {
                uq1.o("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void m(j80 j80Var, HashMap map) throws Throwable {
        k80 k80Var = (k80) map.get("JPEGInterchangeFormat");
        k80 k80Var2 = (k80) map.get("JPEGInterchangeFormatLength");
        if (k80Var == null || k80Var2 == null) {
            return;
        }
        int iE = k80Var.e(this.f);
        int iE2 = k80Var2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE > 0 && iE2 > 0 && this.b == null && this.a == null) {
            j80Var.skip(iE);
            j80Var.read(new byte[iE2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        k80 k80Var = (k80) map.get("ImageLength");
        k80 k80Var2 = (k80) map.get("ImageWidth");
        if (k80Var == null || k80Var2 == null) {
            return false;
        }
        return k80Var.e(this.f) <= 512 && k80Var2.e(this.f) <= 512;
    }

    public final void o(n80 n80Var) throws IOException {
        ByteOrder byteOrderQ = q(n80Var);
        this.f = byteOrderQ;
        n80Var.b = byteOrderQ;
        int unsignedShort = n80Var.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            ur.h(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = n80Var.readInt();
        if (i2 < 8) {
            uq1.o(ck1.r(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            n80Var.a(i3);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbU = ck1.u(i, "The size of tag group[", "]: ");
            sbU.append(mapArr[i].size());
            Log.d("ExifInterface", sbU.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                k80 k80Var = (k80) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + k80Var.toString() + ", tagValue: '" + k80Var.f(this.f) + "'");
            }
            i++;
        }
    }

    public final void r(byte[] bArr, int i) throws IOException {
        n80 n80Var = new n80(bArr);
        o(n80Var);
        s(n80Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02df  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0269, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x028a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0160, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01e8, please report this as an issue */
    public final void s(n80 n80Var, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        long j4;
        String str;
        int i3;
        int unsignedShort;
        long j5;
        int i4;
        Integer numValueOf = Integer.valueOf(n80Var.c);
        HashSet hashSet = this.e;
        hashSet.add(numValueOf);
        short s2 = n80Var.readShort();
        boolean z3 = l;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.d;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = n80Var.readUnsignedShort();
            int unsignedShort3 = n80Var.readUnsignedShort();
            int i5 = n80Var.readInt();
            long j6 = ((long) n80Var.c) + 4;
            l80 l80Var = (l80) J[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), l80Var != null ? l80Var.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (l80Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = E;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = l80Var.c;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = l80Var.d) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            j = j6;
                            j2 = ((long) i5) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + D[unsignedShort3] + ") is unexpected for tag: " + l80Var.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i4 = n80Var.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.c == 7) {
                                if ("MakerNote".equals(l80Var.b)) {
                                    this.i = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(l80Var.b)) {
                                    this.j = i4;
                                    this.k = i5;
                                    k80 k80VarC = k80.c(6, this.f);
                                    k80 k80VarA = k80.a(this.j, this.f);
                                    k80 k80VarA2 = k80.a(this.k, this.f);
                                    mapArr[4].put("Compression", k80VarC);
                                    mapArr[4].put("JPEGInterchangeFormat", k80VarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", k80VarA2);
                                }
                            }
                            n80Var.b(i4);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            unsignedShort3 = unsignedShort3;
                        }
                        num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            i3 = unsignedShort3;
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    j5 = ((long) n80Var.readInt()) & 4294967295L;
                                } else if (i3 == 8) {
                                    unsignedShort = n80Var.readShort();
                                } else if (i3 != 9 || i3 == 13) {
                                    unsignedShort = n80Var.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), l80Var.b));
                                }
                                if (j5 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        n80Var.b(j5);
                                        s(n80Var, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                                }
                                n80Var.b(j3);
                            } else {
                                unsignedShort = n80Var.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), l80Var.b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    n80Var.b(j5);
                                    s(n80Var, num.intValue());
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            n80Var.b(j3);
                        } else {
                            j4 = j3;
                            int i7 = n80Var.c + this.h;
                            byte[] bArr = new byte[(int) j2];
                            n80Var.readFully(bArr);
                            k80 k80Var = new k80(i7, bArr, unsignedShort3, i5);
                            HashMap map = mapArr[i];
                            str = l80Var.b;
                            map.put(str, k80Var);
                            if ("DNGVersion".equals(str)) {
                                this.c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && k80Var.f(this.f).contains("PENTAX")) || ("Compression".equals(str) && k80Var.e(this.f) == 65535)) {
                                this.c = 8;
                            }
                            if (n80Var.c != j4) {
                                n80Var.b(j4);
                            }
                        }
                    } else {
                        n80Var.b(j);
                    }
                    s3 = (short) (s3 + 1);
                    s2 = s2;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    n80Var.b(j);
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i4 = n80Var.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.c == 7) {
                            if ("MakerNote".equals(l80Var.b)) {
                                this.i = i4;
                            } else if (i != 6) {
                            }
                        }
                        n80Var.b(i4);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        unsignedShort3 = unsignedShort3;
                    }
                    num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        i3 = unsignedShort3;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                j5 = ((long) n80Var.readInt()) & 4294967295L;
                            } else if (i3 == 8) {
                                if (i3 != 9) {
                                }
                                unsignedShort = n80Var.readInt();
                            } else {
                                unsignedShort = n80Var.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), l80Var.b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    n80Var.b(j5);
                                    s(n80Var, num.intValue());
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            n80Var.b(j3);
                        } else {
                            unsignedShort = n80Var.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), l80Var.b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                n80Var.b(j5);
                                s(n80Var, num.intValue());
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        n80Var.b(j3);
                    } else {
                        j4 = j3;
                        int i8 = n80Var.c + this.h;
                        byte[] bArr2 = new byte[(int) j2];
                        n80Var.readFully(bArr2);
                        k80 k80Var2 = new k80(i8, bArr2, unsignedShort3, i5);
                        HashMap map2 = mapArr[i];
                        str = l80Var.b;
                        map2.put(str, k80Var2);
                        if ("DNGVersion".equals(str)) {
                            this.c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.c = 8;
                        if (n80Var.c != j4) {
                            n80Var.b(j4);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                s2 = s2;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                n80Var.b(j);
            } else {
                j3 = j;
                if (j2 > 4) {
                    i4 = n80Var.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.c == 7) {
                        if ("MakerNote".equals(l80Var.b)) {
                            this.i = i4;
                        } else if (i != 6) {
                        }
                    }
                    n80Var.b(i4);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    unsignedShort3 = unsignedShort3;
                }
                num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    i3 = unsignedShort3;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            j5 = ((long) n80Var.readInt()) & 4294967295L;
                        } else if (i3 == 8) {
                            if (i3 != 9) {
                            }
                            unsignedShort = n80Var.readInt();
                        } else {
                            unsignedShort = n80Var.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), l80Var.b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                n80Var.b(j5);
                                s(n80Var, num.intValue());
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        n80Var.b(j3);
                    } else {
                        unsignedShort = n80Var.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), l80Var.b));
                    }
                    if (j5 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j5))) {
                            n80Var.b(j5);
                            s(n80Var, num.intValue());
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                        }
                    } else if (z3 != 0) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                    }
                    n80Var.b(j3);
                } else {
                    j4 = j3;
                    int i9 = n80Var.c + this.h;
                    byte[] bArr3 = new byte[(int) j2];
                    n80Var.readFully(bArr3);
                    k80 k80Var3 = new k80(i9, bArr3, unsignedShort3, i5);
                    HashMap map3 = mapArr[i];
                    str = l80Var.b;
                    map3.put(str, k80Var3);
                    if ("DNGVersion".equals(str)) {
                        this.c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.c = 8;
                    if (n80Var.c != j4) {
                        n80Var.b(j4);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            s2 = s2;
            z3 = z3;
        }
        boolean z4 = z3;
        int i10 = n80Var.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j7 = i10;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i10))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        n80Var.b(j7);
        if (mapArr[4].isEmpty()) {
            s(n80Var, 4);
        } else if (mapArr[5].isEmpty()) {
            s(n80Var, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(j80 j80Var) throws Throwable {
        k80 k80Var;
        int iE;
        HashMap map = this.d[4];
        k80 k80Var2 = (k80) map.get("Compression");
        if (k80Var2 == null) {
            m(j80Var, map);
            return;
        }
        int iE2 = k80Var2.e(this.f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(j80Var, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        k80 k80Var3 = (k80) map.get("BitsPerSample");
        if (k80Var3 != null) {
            int[] iArr = (int[]) k80Var3.g(this.f);
            int[] iArr2 = o;
            if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (k80Var = (k80) map.get("PhotometricInterpretation")) != null && (((iE = k80Var.e(this.f)) == 1 && Arrays.equals(iArr, p)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                k80 k80Var4 = (k80) map.get("StripOffsets");
                k80 k80Var5 = (k80) map.get("StripByteCounts");
                if (k80Var4 == null || k80Var5 == null) {
                    return;
                }
                long[] jArrF = yi0.f(k80Var4.g(this.f));
                long[] jArrF2 = yi0.f(k80Var5.g(this.f));
                if (jArrF == null || jArrF.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrF2 == null || jArrF2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrF.length != jArrF2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrF2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrF.length; i3++) {
                    int i4 = (int) jArrF[i3];
                    int i5 = (int) jArrF2[i3];
                    if (i3 < jArrF.length - 1 && i4 + i5 != jArrF[i3 + 1]) {
                        this.g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (j80Var.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (j80Var.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.g) {
                    long j4 = jArrF[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        k80 k80Var = (k80) mapArr[i].get("ImageLength");
        k80 k80Var2 = (k80) mapArr[i].get("ImageWidth");
        k80 k80Var3 = (k80) mapArr[i2].get("ImageLength");
        k80 k80Var4 = (k80) mapArr[i2].get("ImageWidth");
        if (k80Var == null || k80Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (k80Var3 == null || k80Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = k80Var.e(this.f);
        int iE2 = k80Var2.e(this.f);
        int iE3 = k80Var3.e(this.f);
        int iE4 = k80Var4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void w(n80 n80Var, int i) throws Throwable {
        k80 k80VarC;
        k80 k80VarC2;
        HashMap[] mapArr = this.d;
        k80 k80Var = (k80) mapArr[i].get("DefaultCropSize");
        k80 k80Var2 = (k80) mapArr[i].get("SensorTopBorder");
        k80 k80Var3 = (k80) mapArr[i].get("SensorLeftBorder");
        k80 k80Var4 = (k80) mapArr[i].get("SensorBottomBorder");
        k80 k80Var5 = (k80) mapArr[i].get("SensorRightBorder");
        if (k80Var != null) {
            int i2 = k80Var.a;
            ByteOrder byteOrder = this.f;
            if (i2 == 5) {
                m80[] m80VarArr = (m80[]) k80Var.g(byteOrder);
                if (m80VarArr == null || m80VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(m80VarArr));
                    return;
                }
                k80VarC = k80.b(m80VarArr[0], this.f);
                k80VarC2 = k80.b(m80VarArr[1], this.f);
            } else {
                int[] iArr = (int[]) k80Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                k80VarC = k80.c(iArr[0], this.f);
                k80VarC2 = k80.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", k80VarC);
            mapArr[i].put("ImageLength", k80VarC2);
            return;
        }
        if (k80Var2 != null && k80Var3 != null && k80Var4 != null && k80Var5 != null) {
            int iE = k80Var2.e(this.f);
            int iE2 = k80Var4.e(this.f);
            int iE3 = k80Var5.e(this.f);
            int iE4 = k80Var3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            k80 k80VarC3 = k80.c(iE2 - iE, this.f);
            k80 k80VarC4 = k80.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", k80VarC3);
            mapArr[i].put("ImageWidth", k80VarC4);
            return;
        }
        k80 k80Var6 = (k80) mapArr[i].get("ImageLength");
        k80 k80Var7 = (k80) mapArr[i].get("ImageWidth");
        if (k80Var6 == null || k80Var7 == null) {
            k80 k80Var8 = (k80) mapArr[i].get("JPEGInterchangeFormat");
            k80 k80Var9 = (k80) mapArr[i].get("JPEGInterchangeFormatLength");
            if (k80Var8 == null || k80Var9 == null) {
                return;
            }
            int iE5 = k80Var8.e(this.f);
            int iE6 = k80Var8.e(this.f);
            n80Var.b(iE5);
            byte[] bArr = new byte[iE6];
            n80Var.read(bArr);
            e(new j80(bArr), iE5, i);
        }
    }

    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.d;
        k80 k80Var = (k80) mapArr[1].get("PixelXDimension");
        k80 k80Var2 = (k80) mapArr[1].get("PixelYDimension");
        if (k80Var != null && k80Var2 != null) {
            mapArr[0].put("ImageWidth", k80Var);
            mapArr[0].put("ImageLength", k80Var2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
