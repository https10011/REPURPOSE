package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ez implements rn0 {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(dz dzVar, v01 v01Var) {
        try {
            int iT = dzVar.t();
            if ((iT & 65496) == 65496 || iT == 19789 || iT == 18761) {
                int iK = k(dzVar, 225);
                if (iK != -1) {
                    byte[] bArr = (byte[]) v01Var.c(iK, byte[].class);
                    try {
                        return l(dzVar, bArr, iK);
                    } finally {
                        v01Var.g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iT);
                return -1;
            }
        } catch (cz unused) {
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType h(dz dzVar) {
        try {
            int iT = dzVar.t();
            if (iT == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iQ = (iT << 8) | dzVar.q();
            if (iQ == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iQ2 = (iQ << 8) | dzVar.q();
            if (iQ2 == -1991225785) {
                dzVar.skip(21L);
                try {
                    return dzVar.q() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (cz unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iQ2 == 1380533830) {
                dzVar.skip(4L);
                if (((dzVar.t() << 16) | dzVar.t()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iT2 = (dzVar.t() << 16) | dzVar.t();
                if ((iT2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iT2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    dzVar.skip(4L);
                    return (dzVar.q() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                dzVar.skip(4L);
                short sQ = dzVar.q();
                if ((sQ & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (sQ & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((dzVar.t() << 16) | dzVar.t()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iT3 = (dzVar.t() << 16) | dzVar.t();
            if (iT3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iT3 == 1635150182;
            dzVar.skip(4L);
            int i3 = iQ2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iT4 = (dzVar.t() << 16) | dzVar.t();
                    if (iT4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iT4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (cz unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static boolean i(dz dzVar, v01 v01Var) {
        boolean zJ;
        if (h(dzVar) == ImageHeaderParser.ImageType.JPEG) {
            int iK = k(dzVar, 226);
            while (iK > 0) {
                byte[] bArr = (byte[]) v01Var.c(iK, byte[].class);
                try {
                    int iP = dzVar.p(bArr, iK);
                    if (iP != iK) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iK + ", actually read: " + iP);
                        }
                        zJ = false;
                    } else {
                        zJ = j(iK, bArr, b);
                    }
                    if (zJ) {
                        v01Var.g(bArr);
                        return true;
                    }
                    v01Var.g(bArr);
                    iK = k(dzVar, 226);
                } catch (Throwable th) {
                    v01Var.g(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    public static boolean j(int i, byte[] bArr, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    public static int k(dz dzVar, int i) {
        short sQ;
        int iT;
        long j;
        long jSkip;
        do {
            short sQ2 = dzVar.q();
            if (sQ2 == 255) {
                sQ = dzVar.q();
                if (sQ != 218) {
                    if (sQ != 217) {
                        iT = dzVar.t() - 2;
                        if (sQ == i) {
                            return iT;
                        }
                        j = iT;
                        jSkip = dzVar.skip(j);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sQ2));
                return -1;
            }
            return -1;
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sQ) + ", wanted to skip: " + iT + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    public static int l(dz dzVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iP = dzVar.p(bArr, i);
        if (iP != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iP);
                return -1;
            }
        } else if (j(i, bArr, a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s != 18761) {
                if (s != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i2 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i3 = i2 + 6;
            short s2 = byteBuffer.remaining() - i3 >= 2 ? byteBuffer.getShort(i3) : (short) -1;
            for (int i4 = 0; i4 < s2; i4++) {
                int i5 = (i4 * 12) + i2 + 8;
                short s3 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
                if (s3 == 274) {
                    int i6 = i5 + 2;
                    short s4 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
                    if (s4 >= 1 && s4 <= 12) {
                        int i7 = i5 + 4;
                        int i8 = byteBuffer.remaining() - i7 >= 4 ? byteBuffer.getInt(i7) : -1;
                        if (i8 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i4 + " tagType=" + ((int) s3) + " formatCode=" + ((int) s4) + " componentCount=" + i8);
                            }
                            int i9 = i8 + c[s4];
                            if (i9 <= 4) {
                                int i10 = i5 + 8;
                                if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                    if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i10 >= 2) {
                                            return byteBuffer.getShort(i10);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s3));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) s3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s4));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s4));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // defpackage.rn0
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        am2.p(byteBuffer, "Argument must not be null");
        return h(new bz(byteBuffer));
    }

    @Override // defpackage.rn0
    public final int b(InputStream inputStream, v01 v01Var) {
        kj0 kj0Var = new kj0(inputStream, 10);
        am2.p(v01Var, "Argument must not be null");
        return g(kj0Var, v01Var);
    }

    @Override // defpackage.rn0
    public final boolean c(ByteBuffer byteBuffer, v01 v01Var) {
        bz bzVar = new bz(byteBuffer);
        am2.p(v01Var, "Argument must not be null");
        return i(bzVar, v01Var);
    }

    @Override // defpackage.rn0
    public final int d(ByteBuffer byteBuffer, v01 v01Var) {
        bz bzVar = new bz(byteBuffer);
        am2.p(v01Var, "Argument must not be null");
        return g(bzVar, v01Var);
    }

    @Override // defpackage.rn0
    public final boolean e(InputStream inputStream, v01 v01Var) {
        am2.p(inputStream, "Argument must not be null");
        kj0 kj0Var = new kj0(inputStream, 10);
        am2.p(v01Var, "Argument must not be null");
        return i(kj0Var, v01Var);
    }

    @Override // defpackage.rn0
    public final ImageHeaderParser.ImageType f(InputStream inputStream) {
        return h(new kj0(inputStream, 10));
    }
}
