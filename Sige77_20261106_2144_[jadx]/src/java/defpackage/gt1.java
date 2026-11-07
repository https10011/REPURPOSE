package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gt1 {
    public int[] a;
    public final md2 c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public si0 l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public gt1(md2 md2Var, si0 si0Var, ByteBuffer byteBuffer, int i) {
        this.c = md2Var;
        this.l = new si0();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                int i2 = 0;
                this.o = 0;
                this.l = si0Var;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                ArrayList arrayList = si0Var.e;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((oi0) obj).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = iHighestOneBit;
                int i3 = si0Var.f;
                this.r = i3 / iHighestOneBit;
                int i4 = si0Var.g;
                this.q = i4 / iHighestOneBit;
                int i5 = i3 * i4;
                v01 v01Var = (v01) this.c.b;
                this.i = v01Var == null ? new byte[i5] : (byte[]) v01Var.c(i5, byte[].class);
                md2 md2Var2 = this.c;
                int i6 = this.r * this.q;
                v01 v01Var2 = (v01) md2Var2.b;
                this.j = v01Var2 == null ? new int[i6] : (int[]) v01Var2.c(i6, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap bitmapA = ((mh) this.c.a).a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("gt1", 3)) {
                    Log.d("gt1", "Unable to decode frame, frameCount=" + this.l.c + ", framePointer=" + this.k);
                }
                this.o = 1;
            }
            int i = this.o;
            if (i != 1 && i != 2) {
                this.o = 0;
                if (this.e == null) {
                    v01 v01Var = (v01) this.c.b;
                    this.e = v01Var == null ? new byte[255] : (byte[]) v01Var.c(255, byte[].class);
                }
                oi0 oi0Var = (oi0) this.l.e.get(this.k);
                int i2 = this.k - 1;
                oi0 oi0Var2 = i2 >= 0 ? (oi0) this.l.e.get(i2) : null;
                int[] iArr = oi0Var.k;
                if (iArr == null) {
                    iArr = this.l.a;
                }
                this.a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("gt1", 3)) {
                        Log.d("gt1", "No valid color table found for frame #" + this.k);
                    }
                    this.o = 1;
                    return null;
                }
                if (oi0Var.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[oi0Var.h] = 0;
                    if (oi0Var.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return d(oi0Var, oi0Var2);
            }
            if (Log.isLoggable("gt1", 3)) {
                Log.d("gt1", "Unable to decode frame, status=" + this.o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e7 A[PHI: r7
      0x01e7: PHI (r7v18 int) = (r7v12 int), (r7v20 int), (r7v20 int) binds: [B:95:0x01d3, B:97:0x01de, B:98:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29, types: [short] */
    /* JADX WARN: Type inference failed for: r8v31 */
    public final Bitmap d(oi0 oi0Var, oi0 oi0Var2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        short s;
        int i7;
        int i8;
        md2 md2Var = this.c;
        byte b = 0;
        int[] iArr2 = this.j;
        if (oi0Var2 == null) {
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                ((mh) md2Var.a).c(bitmap);
            }
            this.m = null;
            Arrays.fill(iArr2, 0);
        }
        if (oi0Var2 != null && oi0Var2.g == 3 && this.m == null) {
            Arrays.fill(iArr2, 0);
        }
        int i9 = this.r;
        int i10 = this.p;
        if (oi0Var2 != null && (i7 = oi0Var2.g) > 0) {
            if (i7 == 2) {
                if (oi0Var.f) {
                    i8 = 0;
                } else {
                    si0 si0Var = this.l;
                    i8 = si0Var.k;
                    if (oi0Var.k != null && si0Var.j == oi0Var.h) {
                        i8 = 0;
                    }
                }
                int i11 = oi0Var2.d / i10;
                int i12 = oi0Var2.b / i10;
                int i13 = oi0Var2.c / i10;
                int i14 = (i12 * i9) + (oi0Var2.a / i10);
                int i15 = (i11 * i9) + i14;
                while (i14 < i15) {
                    int i16 = i14 + i13;
                    for (int i17 = i14; i17 < i16; i17++) {
                        iArr2[i17] = i8;
                    }
                    i14 += i9;
                }
            } else if (i7 == 3) {
                Bitmap bitmap2 = this.m;
                if (bitmap2 != null) {
                    int i18 = this.q;
                    int i19 = this.r;
                    bitmap2.getPixels(iArr2, 0, i19, 0, 0, i19, i18);
                }
            }
        }
        this.d.position(oi0Var.j);
        int i20 = oi0Var.c * oi0Var.d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i20) {
            v01 v01Var = (v01) md2Var.b;
            this.i = v01Var == null ? new byte[i20] : (byte[]) v01Var.c(i20, byte[].class);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        byte[] bArr4 = this.h;
        int i21 = this.d.get() & 255;
        int i22 = 1 << i21;
        int i23 = i22 + 1;
        int i24 = i22 + 2;
        int i25 = i21 + 1;
        int i26 = (1 << i25) - 1;
        for (int i27 = 0; i27 < i22; i27++) {
            sArr[i27] = 0;
            bArr3[i27] = (byte) i27;
        }
        byte[] bArr5 = this.e;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = i25;
        int i37 = i24;
        int i38 = i26;
        int i39 = -1;
        int i40 = -1;
        while (true) {
            if (i28 >= i20) {
                iArr2 = iArr2;
                break;
            }
            if (i29 == 0) {
                i29 = this.d.get() & 255;
                if (i29 > 0) {
                    ByteBuffer byteBuffer = this.d;
                    byteBuffer.get(this.e, 0, Math.min(i29, byteBuffer.remaining()));
                }
                if (i29 <= 0) {
                    this.o = 3;
                    b = 0;
                    break;
                }
                i30 = 0;
            } else {
                iArr2 = iArr2;
                sArr = sArr;
                bArr5 = bArr5;
            }
            i32 += (bArr5[i30] & 255) << i31;
            i30++;
            i29--;
            i40 = i40;
            i31 += 8;
            i37 = i37;
            int i41 = i36;
            bArr3 = bArr3;
            i34 = i34;
            while (true) {
                i31 = i31;
                if (i31 < i41) {
                    i36 = i41;
                    i39 = -1;
                    break;
                }
                int i42 = i32 & i38;
                i32 >>= i41;
                i31 -= i41;
                if (i42 == i22) {
                    i41 = i25;
                    i37 = i24;
                    i38 = i26;
                    i40 = i39;
                    i31 = i31;
                } else {
                    if (i42 == i23) {
                        i36 = i41;
                        break;
                    }
                    int i43 = i41;
                    if (i40 == i39) {
                        bArr2[i33] = bArr3[i42];
                        i33++;
                        i28++;
                        i40 = i42;
                        i34 = i40;
                        i41 = i43;
                    } else {
                        if (i42 >= i37) {
                            bArr4[i35] = (byte) i34;
                            i35++;
                            s = i40;
                        } else {
                            s = i42;
                        }
                        while (s >= i22) {
                            bArr4[i35] = bArr3[s];
                            i35++;
                            s = sArr[s];
                        }
                        i34 = bArr3[s] & 255;
                        byte b2 = (byte) i34;
                        bArr2[i33] = b2;
                        while (true) {
                            i33++;
                            i28++;
                            if (i35 <= 0) {
                                break;
                            }
                            i35--;
                            bArr2[i33] = bArr4[i35];
                        }
                        int i44 = i22;
                        if (i37 < 4096) {
                            sArr[i37] = (short) i40;
                            bArr3[i37] = b2;
                            i37++;
                            if ((i37 & i38) != 0 || i37 >= 4096) {
                                i41 = i43;
                            } else {
                                i41 = i43 + 1;
                                i38 += i37;
                            }
                        } else {
                            i41 = i43;
                        }
                        i40 = i42;
                        i22 = i44;
                    }
                    i39 = -1;
                }
            }
            b = 0;
        }
        Arrays.fill(bArr2, i33, i20, b);
        boolean z = oi0Var.e;
        int[] iArr3 = this.j;
        if (z || i10 != 1) {
            int i45 = oi0Var.d / i10;
            int i46 = oi0Var.b / i10;
            int i47 = oi0Var.c / i10;
            int i48 = oi0Var.a / i10;
            boolean z2 = this.k == 0;
            byte[] bArr6 = this.i;
            int[] iArr4 = this.a;
            Boolean bool = this.s;
            int i49 = 8;
            int i50 = 0;
            int i51 = 0;
            int i52 = 1;
            while (i50 < i45) {
                int i53 = i46;
                if (oi0Var.e) {
                    if (i51 >= i45) {
                        i52++;
                        if (i52 == 2) {
                            i51 = 4;
                        } else if (i52 == 3) {
                            i49 = 4;
                            i51 = 2;
                        } else if (i52 == 4) {
                            i51 = 1;
                            i49 = 2;
                        }
                    }
                    i = i51 + i49;
                } else {
                    i = i51;
                    i51 = i50;
                }
                int i54 = i51 + i53;
                int i55 = i45;
                boolean z3 = i10 == 1;
                if (i54 < this.q) {
                    int i56 = i54 * i9;
                    int i57 = i56 + i48;
                    int i58 = i57 + i47;
                    int i59 = i56 + i9;
                    if (i59 < i58) {
                        i58 = i59;
                    }
                    i2 = i;
                    int i60 = i50 * i10 * oi0Var.c;
                    if (z3) {
                        int i61 = i57;
                        while (i61 < i58) {
                            int i62 = i61;
                            int i63 = iArr4[bArr6[i60] & 255];
                            if (i63 != 0) {
                                iArr3[i62] = i63;
                            } else if (z2 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i60 += i10;
                            i61 = i62 + 1;
                        }
                    } else {
                        int i64 = ((i58 - i57) * i10) + i60;
                        Boolean bool2 = bool;
                        int i65 = i60;
                        int i66 = i57;
                        while (i66 < i58) {
                            int i67 = i58;
                            int i68 = oi0Var.c;
                            int i69 = i47;
                            int i70 = i65;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            while (true) {
                                if (i70 >= i65 + i10) {
                                    i5 = i48;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i5 = i48;
                                if (i70 >= bArr7.length || i70 >= i64) {
                                    break;
                                }
                                int i76 = this.a[bArr7[i70] & 255];
                                if (i76 != 0) {
                                    i71 += (i76 >> 24) & 255;
                                    i72 += (i76 >> 16) & 255;
                                    i73 += (i76 >> 8) & 255;
                                    i74 += i76 & 255;
                                    i75++;
                                }
                                i70++;
                                i48 = i5;
                            }
                            int i77 = i65 + i68;
                            int i78 = i77;
                            while (i78 < i77 + i10) {
                                byte[] bArr8 = this.i;
                                int i79 = i77;
                                if (i78 >= bArr8.length || i78 >= i64) {
                                    break;
                                }
                                int i80 = this.a[bArr8[i78] & 255];
                                if (i80 != 0) {
                                    i71 += (i80 >> 24) & 255;
                                    i72 += (i80 >> 16) & 255;
                                    i73 += (i80 >> 8) & 255;
                                    i74 += i80 & 255;
                                    i75++;
                                }
                                i78++;
                                i77 = i79;
                            }
                            int i81 = i75 == 0 ? 0 : ((i71 / i75) << 24) | ((i72 / i75) << 16) | ((i73 / i75) << 8) | (i74 / i75);
                            if (i81 != 0) {
                                iArr3[i66] = i81;
                            } else if (z2 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i65 += i10;
                            i66++;
                            i58 = i67;
                            i47 = i69;
                            i48 = i5;
                        }
                        i4 = i47;
                        i3 = i48;
                        bool = bool2;
                    }
                    i50++;
                    i46 = i53;
                    i45 = i55;
                    i51 = i2;
                    i47 = i4;
                    i48 = i3;
                } else {
                    i2 = i;
                }
                i4 = i47;
                i3 = i48;
                i50++;
                i46 = i53;
                i45 = i55;
                i51 = i2;
                i47 = i4;
                i48 = i3;
            }
            if (this.s == null) {
                this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i82 = oi0Var.d;
            int i83 = oi0Var.b;
            int i84 = oi0Var.c;
            int i85 = oi0Var.a;
            byte b3 = this.k == 0 ? (byte) 1 : b;
            byte[] bArr9 = this.i;
            int[] iArr5 = this.a;
            byte b4 = -1;
            for (int i86 = b; i86 < i82; i86++) {
                int i87 = (i86 + i83) * i9;
                int i88 = i87 + i85;
                int i89 = i88 + i84;
                int i90 = i87 + i9;
                if (i90 < i89) {
                    i89 = i90;
                }
                int i91 = oi0Var.c * i86;
                while (i88 < i89) {
                    int i92 = i82;
                    byte b5 = bArr9[i91];
                    int[] iArr6 = iArr3;
                    int i93 = b5 & 255;
                    if (i93 != b4) {
                        int i94 = iArr5[i93];
                        if (i94 != 0) {
                            iArr6[i88] = i94;
                        } else {
                            b4 = b5;
                        }
                    }
                    i91++;
                    i88++;
                    i82 = i92;
                    iArr3 = iArr6;
                }
            }
            Boolean bool3 = this.s;
            this.s = Boolean.valueOf((bool3 != null && bool3.booleanValue()) || !(this.s != null || b3 == 0 || b4 == -1));
        }
        if (this.n && ((i6 = oi0Var.g) == 0 || i6 == 1)) {
            if (this.m == null) {
                this.m = a();
            }
            Bitmap bitmap3 = this.m;
            int i95 = this.q;
            int i96 = this.r;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i96, 0, 0, i96, i95);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapA = a();
        int i97 = this.q;
        int i98 = this.r;
        bitmapA.setPixels(iArr, 0, i98, 0, 0, i98, i97);
        return bitmapA;
    }
}
