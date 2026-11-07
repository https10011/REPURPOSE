package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class w40 implements f60, na2, m90, g52, hv2, yc3, jv2, ff3, kr3 {
    public final /* synthetic */ int a;
    public static final w40 b = new w40(1);
    public static final w40 c = new w40(2);
    public static final /* synthetic */ w40 d = new w40(11);
    public static final /* synthetic */ w40 e = new w40(12);
    public static final /* synthetic */ w40 f = new w40(13);
    public static final /* synthetic */ w40 i = new w40(14);
    public static final /* synthetic */ w40 v = new w40(15);
    public static final /* synthetic */ w40 w = new w40(16);
    public static final /* synthetic */ w40 W = new w40(17);
    public static final /* synthetic */ w40 X = new w40(18);

    public /* synthetic */ w40(int i2) {
        this.a = i2;
    }

    @Override // defpackage.kr3
    public /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // defpackage.g52
    public void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) {
        pg3 pg3Var = (pg3) dx2Var;
        vn3 vn3VarT = xn3.t();
        vn3VarT.i("type.googleapis.com/google.crypto.tink.AesCmacKey");
        di3 di3VarX = fi3.x();
        ji3 ji3VarV = li3.v();
        int i2 = pg3Var.b;
        ji3VarV.f();
        ((li3) ji3VarV.b).zze = i2;
        li3 li3Var = (li3) ji3VarV.d();
        di3VarX.f();
        fi3.w((fi3) di3VarX.b, li3Var);
        int i3 = pg3Var.a;
        di3VarX.f();
        ((fi3) di3VarX.b).zzf = i3;
        vn3VarT.j(((fi3) di3VarX.d()).b());
        vn3VarT.h(hh3.b(pg3Var.c));
        return vf3.f((xn3) vn3VarT.d());
    }

    @Override // defpackage.jv2
    public Object d(yd2 yd2Var, Class cls) throws GeneralSecurityException {
        Object obj;
        int i2;
        mv2 va3Var;
        tr3 tr3VarH;
        List list;
        yd2 yd2Var2 = yd2Var;
        String str = "EC";
        if (cls.equals(lv2.class)) {
            yd2Var2.s();
            zi0 zi0VarA = yd2Var2.D().a();
            if (zi0VarA instanceof w83) {
                w83 w83Var = (w83) zi0VarA;
                n83 n83Var = w83Var.f;
                wq3 wq3Var = (wq3) rq3.a.E(n83Var.a);
                ECPoint eCPoint = w83Var.g;
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
                ECParameterSpec eCParameterSpecB0 = am2.b0(wq3Var);
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                jc3.g(eCPoint2, eCParameterSpecB0.getCurve());
                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) cr3.f.a.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, eCParameterSpecB0));
                tr3 tr3Var = n83Var.f;
                if (tr3Var != null) {
                    tr3Var.b();
                }
                rq3.a(n83Var.b);
                dw0.G(n83Var);
                w83Var.i.b();
                jc3.g(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
            } else {
                if (!(zi0VarA instanceof d93)) {
                    throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zi0VarA.getClass())));
                }
                d93 d93Var = (d93) zi0VarA;
                v83 v83Var = d93Var.f;
                tr3 tr3Var2 = d93Var.g;
                qt.H(v83Var.a);
                qt.F(v83Var.b);
                qt.G(v83Var.c);
                tr3 tr3Var3 = d93Var.h;
                tr3Var2.b();
                tr3Var3.b();
            }
            return cls.cast(new u41(22));
        }
        if (!cls.equals(mv2.class)) {
            tv2.f("HybridConfigurationV1 can only create HybridEncrypt and HybridDecrypt primitives");
            return null;
        }
        HashMap map = new HashMap();
        int i3 = 0;
        int i4 = 0;
        while (i4 < ((List) yd2Var2.b).size()) {
            lw2 lw2VarQ = yd2Var2.q(i4);
            if (lw2VarQ.c.equals(qv2.c)) {
                zi0 zi0VarA2 = lw2VarQ.a();
                if (zi0VarA2 instanceof p83) {
                    p83 p83Var = (p83) zi0VarA2;
                    n83 n83Var2 = p83Var.f.f;
                    wq3 wq3Var2 = (wq3) rq3.a.E(n83Var2.a);
                    ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) cr3.f.a.zza(str)).generatePrivate(new ECPrivateKeySpec(xi0.E(xi0.G((BigInteger) p83Var.g.a)), am2.b0(wq3Var2)));
                    byte[] bArrB = new byte[i3];
                    tr3 tr3Var4 = n83Var2.f;
                    if (tr3Var4 != null) {
                        bArrB = tr3Var4.b();
                    }
                    obj = null;
                    va3Var = new tq3(eCPrivateKey, bArrB, rq3.a(n83Var2.b), (zq3) rq3.b.E(n83Var2.c), dw0.G(n83Var2), ((x93) p83Var.H()).H().b());
                } else {
                    obj = null;
                    if (!(zi0VarA2 instanceof x83)) {
                        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zi0VarA2.getClass())));
                    }
                    x83 x83Var = (x83) zi0VarA2;
                    d93 d93Var2 = x83Var.f;
                    v83 v83Var2 = d93Var2.f;
                    t83 t83Var = v83Var2.a;
                    ya3 ya3VarH = qt.H(t83Var);
                    rz2 rz2VarF = qt.F(v83Var2.b);
                    pa3 pa3VarG = qt.G(v83Var2.c);
                    t83 t83Var2 = t83.g;
                    boolean zEquals = t83Var.equals(t83Var2);
                    t83 t83Var3 = t83.f;
                    t83 t83Var4 = t83.e;
                    t83 t83Var5 = t83.d;
                    if (zEquals) {
                        i2 = 32;
                    } else if (t83Var == t83Var5) {
                        i2 = 65;
                    } else if (t83Var == t83Var4) {
                        i2 = 97;
                    } else {
                        if (t83Var != t83Var3) {
                            tv2.f("Unrecognized HPKE KEM identifier");
                            return null;
                        }
                        i2 = 133;
                    }
                    int i5 = i2;
                    if (!t83Var.equals(t83Var2) && t83Var != t83Var5 && t83Var != t83Var4 && t83Var != t83Var3) {
                        tv2.f("Unrecognized HPKE KEM identifier");
                        return null;
                    }
                    va3Var = new va3(new yd2(11, tr3.a(((tr3) x83Var.g.a).b()), d93Var2.g), ya3VarH, rz2VarF, pa3VarG, i5, ((x93) x83Var.H()).H());
                }
                zi0 zi0VarA3 = lw2VarQ.a();
                if (zi0VarA3 instanceof t93) {
                    tr3VarH = ((x93) ((t93) zi0VarA3).H()).H();
                } else {
                    if (!(zi0VarA3 instanceof qd3)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zi0VarA3.getClass().getName() + " with parameters " + String.valueOf(zi0VarA3.E()));
                    }
                    tr3VarH = ((qd3) zi0VarA3).H();
                }
                rb3 rb3Var = new rb3(va3Var, lw2VarQ.d);
                byte[] bArr = tr3VarH.a;
                if (bArr.length != 0 && bArr.length != 5) {
                    tv2.f("PrefixMap only supports 0 and 5 byte prefixes");
                    return obj;
                }
                if (map.containsKey(tr3VarH)) {
                    list = (List) map.get(tr3VarH);
                } else {
                    ArrayList arrayList = new ArrayList();
                    map.put(tr3VarH, arrayList);
                    list = arrayList;
                }
                list.add(rb3Var);
            } else {
                str = str;
            }
            i4++;
            yd2Var2 = yd2Var;
            str = str;
            i3 = 0;
        }
        yd2Var.s();
        return cls.cast(new pb3(new jf3(map)));
    }

    @Override // defpackage.g52
    public void e(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.yd1
    public Object get() {
        return new ll0(Executors.newSingleThreadExecutor(), 1);
    }

    @Override // defpackage.f60
    public void i(i60 i60Var) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            boolean zB = i60Var.b();
            sb = i60Var.c;
            if (!zB) {
                break;
            }
            sb2.append(i60Var.a());
            int i2 = i60Var.d + 1;
            i60Var.d = i2;
            if (ga.u(i60Var.a, i2, 5) != 5) {
                i60Var.e = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        int length2 = sb.length() + length + 1;
        i60Var.c(length2);
        boolean z = i60Var.f.b - length2 > 0;
        if (i60Var.b() || z) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length > 1555) {
                uq1.q("Message length not in valid ranges: ".concat(String.valueOf(length)));
                return;
            } else {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb2.length();
        for (int i3 = 0; i3 < length3; i3++) {
            int length4 = (((sb.length() + 1) * 149) % 255) + 1 + sb2.charAt(i3);
            if (length4 > 255) {
                length4 -= 256;
            }
            i60Var.d((char) length4);
        }
    }

    @Override // defpackage.na2
    public hh m(String str, int i2, EnumMap enumMap) {
        int i3;
        int i4;
        int i5;
        hh hhVar;
        int i6;
        int i7;
        if (str.isEmpty()) {
            e.g("Found empty contents");
            return null;
        }
        if (i2 != 6) {
            e.g("Can only encode DATA_MATRIX, but got ".concat(ts.w(i2)));
            return null;
        }
        pv1 pv1Var = (pv1) enumMap.get(c60.c);
        if (pv1Var == null) {
            pv1Var = pv1.a;
        }
        if (enumMap.get(c60.d) != null) {
            ur.a();
            return null;
        }
        if (enumMap.get(c60.e) != null) {
            ur.a();
            return null;
        }
        int i8 = 0;
        int i9 = 1;
        f60[] f60VarArr = {new nk1(2), new qh1(4), new yw1(i8), new yw1(i9), new u41(5), new w40(3)};
        i60 i60Var = new i60(str);
        i60Var.b = pv1Var;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            i60Var.d((char) 236);
            i60Var.g = 2;
            i60Var.d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            i60Var.d((char) 237);
            i60Var.g = 2;
            i60Var.d += 7;
        }
        int i10 = 0;
        while (i60Var.b()) {
            f60VarArr[i10].i(i60Var);
            int i11 = i60Var.e;
            if (i11 >= 0) {
                i60Var.e = -1;
                i10 = i11;
            }
        }
        StringBuilder sb = i60Var.c;
        int length = sb.length();
        i60Var.c(sb.length());
        int i12 = i60Var.f.b;
        if (length < i12 && i10 != 0 && i10 != 5 && i10 != 4) {
            i60Var.d((char) 254);
        }
        if (sb.length() < i12) {
            sb.append((char) 129);
        }
        while (sb.length() < i12) {
            int length2 = ((sb.length() + 1) * 149) % 253;
            int i13 = length2 + 130;
            if (i13 > 254) {
                i13 = length2 - 124;
            }
            sb.append((char) i13);
        }
        String string = sb.toString();
        ov1 ov1VarE = ov1.e(string.length(), pv1Var);
        int i14 = ov1VarE.e;
        int i15 = ov1VarE.d;
        int[] iArr = i70.a;
        int length3 = string.length();
        int i16 = ov1VarE.b;
        int i17 = ov1VarE.c;
        if (length3 != i16) {
            e.g("The number of codewords does not match the selected symbol");
            return null;
        }
        StringBuilder sb2 = new StringBuilder(i16 + i17);
        sb2.append(string);
        int iC = ov1VarE.c();
        if (iC == 1) {
            sb2.append(i70.a(i17, string));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr2 = new int[iC];
            int[] iArr3 = new int[iC];
            int[] iArr4 = new int[iC];
            int i18 = 0;
            while (i18 < iC) {
                int i19 = i18 + 1;
                iArr2[i18] = ov1VarE.a(i19);
                iArr3[i18] = ov1VarE.h;
                iArr4[i18] = 0;
                if (i18 > 0) {
                    iArr4[i18] = iArr4[i18 - 1] + iArr2[i18];
                }
                i18 = i19;
            }
            for (int i20 = 0; i20 < iC; i20++) {
                StringBuilder sb3 = new StringBuilder(iArr2[i20]);
                for (int i21 = i20; i21 < i16; i21 += iC) {
                    sb3.append(string.charAt(i21));
                }
                String strA = i70.a(iArr3[i20], sb3.toString());
                int i22 = i20;
                int i23 = 0;
                while (i22 < iArr3[i20] * iC) {
                    sb2.setCharAt(i16 + i22, strA.charAt(i23));
                    i22 += iC;
                    i23++;
                }
            }
        }
        String string2 = sb2.toString();
        int iB = ov1VarE.b() * i15;
        int iD = ov1VarE.d() * i14;
        vl vlVar = new vl(string2, iB, iD);
        byte[] bArr = (byte[]) vlVar.d;
        int i24 = 0;
        int i25 = 0;
        int i26 = 4;
        while (true) {
            if (i26 == iD && i24 == 0) {
                int i27 = iD - 1;
                vlVar.c(i27, i8, i25, i9);
                vlVar.c(i27, i9, i25, 2);
                vlVar.c(i27, 2, i25, 3);
                vlVar.c(i8, iB - 2, i25, 4);
                int i28 = iB - 1;
                vlVar.c(i8, i28, i25, 5);
                vlVar.c(i9, i28, i25, 6);
                vlVar.c(2, i28, i25, 7);
                vlVar.c(3, i28, i25, 8);
                i25++;
            }
            i3 = iD - 2;
            if (i26 == i3 && i24 == 0 && iB % 4 != 0) {
                vlVar.c(iD - 3, i8, i25, i9);
                vlVar.c(i3, i8, i25, 2);
                vlVar.c(iD - 1, i8, i25, 3);
                vlVar.c(i8, iB - 4, i25, 4);
                vlVar.c(i8, iB - 3, i25, 5);
                vlVar.c(i8, iB - 2, i25, 6);
                int i29 = iB - 1;
                vlVar.c(i8, i29, i25, 7);
                vlVar.c(i9, i29, i25, 8);
                i25++;
            }
            if (i26 == i3 && i24 == 0 && iB % 8 == 4) {
                vlVar.c(iD - 3, i8, i25, i9);
                vlVar.c(i3, i8, i25, 2);
                vlVar.c(iD - 1, i8, i25, 3);
                vlVar.c(i8, iB - 2, i25, 4);
                int i30 = iB - 1;
                vlVar.c(i8, i30, i25, 5);
                vlVar.c(i9, i30, i25, 6);
                i4 = 2;
                vlVar.c(2, i30, i25, 7);
                vlVar.c(3, i30, i25, 8);
                i25++;
            } else {
                i4 = 2;
            }
            if (i26 == iD + 4 && i24 == i4 && iB % 8 == 0) {
                int i31 = iD - 1;
                vlVar.c(i31, 0, i25, 1);
                int i32 = iB - 1;
                vlVar.c(i31, i32, i25, i4);
                int i33 = iB - 3;
                vlVar.c(0, i33, i25, 3);
                int i34 = iB - 2;
                vlVar.c(0, i34, i25, 4);
                vlVar.c(0, i32, i25, 5);
                vlVar.c(1, i33, i25, 6);
                vlVar.c(1, i34, i25, 7);
                vlVar.c(1, i32, i25, 8);
                i25++;
            }
            while (true) {
                i5 = vlVar.b;
                if (i26 < iD && i24 >= 0 && bArr[(i26 * i5) + i24] < 0) {
                    vlVar.j(i26, i24, i25);
                    i25++;
                }
                int i35 = i26 - 2;
                int i36 = i24 + 2;
                if (i35 < 0 || i36 >= iB) {
                    break;
                }
                i26 = i35;
                i24 = i36;
            }
            int i37 = i26 - 1;
            int i38 = i24 + 5;
            while (true) {
                if (i37 >= 0 && i38 < iB && bArr[(i37 * i5) + i38] < 0) {
                    vlVar.j(i37, i38, i25);
                    i25++;
                }
                int i39 = i37 + 2;
                int i40 = i38 - 2;
                if (i39 >= iD || i40 < 0) {
                    break;
                }
                i37 = i39;
                i38 = i40;
            }
            i26 = i37 + 5;
            i24 = i38 - 1;
            if (i26 >= iD && i24 >= iB) {
                break;
            }
            bArr = bArr;
            i9 = 1;
            i8 = 0;
        }
        int i41 = iB - 1;
        boolean z = true;
        int i42 = iD - 1;
        if (bArr[(i42 * i5) + i41] < 0) {
            bArr[(i42 * i5) + i41] = 1;
            bArr[(i3 * i5) + (iB - 2)] = 1;
        }
        int iB2 = ov1VarE.b() * i15;
        int iD2 = ov1VarE.d() * i14;
        jj jjVar = new jj((ov1VarE.b() * i15) + (ov1VarE.b() << 1), (ov1VarE.d() * i14) + (ov1VarE.d() << 1));
        int i43 = 0;
        int i44 = 0;
        while (i44 < iD2) {
            int i45 = i44 % i14;
            if (i45 == 0) {
                int i46 = 0;
                int i47 = 0;
                while (i46 < (ov1VarE.b() * i15) + (ov1VarE.b() << 1)) {
                    jjVar.c(i47, i43, i46 % 2 == 0 ? z : false);
                    i47++;
                    i46++;
                    z = true;
                }
                i43++;
            }
            int i48 = 0;
            for (int i49 = 0; i49 < iB2; i49++) {
                int i50 = i49 % i15;
                if (i50 == 0) {
                    jjVar.c(i48, i43, true);
                    i48++;
                }
                jjVar.c(i48, i43, bArr[(i44 * i5) + i49] == 1);
                int i51 = i48 + 1;
                if (i50 == i15 - 1) {
                    jjVar.c(i51, i43, i44 % 2 == 0);
                    i48 += 2;
                } else {
                    i48 = i51;
                }
            }
            int i52 = i43 + 1;
            if (i45 == i14 - 1) {
                int i53 = 0;
                for (int i54 = 0; i54 < (ov1VarE.b() * i15) + (ov1VarE.b() << 1); i54++) {
                    jjVar.c(i53, i52, true);
                    i53++;
                }
                i43 += 2;
            } else {
                i43 = i52;
            }
            i44++;
            z = true;
        }
        int i55 = jjVar.b;
        int i56 = jjVar.c;
        int iMax = Math.max(200, i55);
        int iMax2 = Math.max(200, i56);
        int iMin = Math.min(iMax / i55, iMax2 / i56);
        int i57 = (iMax - (i55 * iMin)) / 2;
        int i58 = (iMax2 - (i56 * iMin)) / 2;
        if (200 < i56 || 200 < i55) {
            hhVar = new hh(i55, i56);
            i6 = 0;
            i7 = 0;
        } else {
            hhVar = new hh(200, 200);
            i6 = i57;
            i7 = i58;
        }
        int[] iArr5 = hhVar.d;
        int length4 = iArr5.length;
        for (int i59 = 0; i59 < length4; i59++) {
            iArr5[i59] = 0;
        }
        int i60 = i7;
        int i61 = 0;
        while (i61 < i56) {
            int i62 = i6;
            int i63 = 0;
            while (i63 < i55) {
                if (jjVar.a(i63, i61) == 1) {
                    hhVar.f(i62, i60, iMin, iMin);
                }
                i63++;
                i62 += iMin;
            }
            i61++;
            i60 += iMin;
        }
        return hhVar;
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        switch (this.a) {
            case 19:
                if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    e.g("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    uj3 uj3VarU = uj3.u((jr2) wf3Var.e, wr2.b);
                    if (uj3VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ep1 ep1VarB = oz2.b();
                    ep1VarB.J(uj3VarU.x().b());
                    ep1VarB.G();
                    ep1VarB.L();
                    ep1VarB.e = j33.a((ip3) wf3Var.f);
                    oz2 oz2VarD = ep1VarB.D();
                    p11 p11Var = new p11(28);
                    p11Var.c = null;
                    p11Var.d = null;
                    p11Var.b = oz2VarD;
                    p11Var.c = new ox1(tr3.a(uj3VarU.x().o()));
                    p11Var.d = (Integer) wf3Var.i;
                    return p11Var.q();
                } catch (ks2 unused) {
                    tv2.f("Parsing AesGcmKey failed");
                    return null;
                }
            default:
                if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    e.g("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zp3 zp3VarU = zp3.u((jr2) wf3Var.e, wr2.b);
                    if (zp3VarU.t() == 0) {
                        return z13.I(q63.a((ip3) wf3Var.f), new ox1(tr3.a(zp3VarU.x().o())), (Integer) wf3Var.i);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (ks2 unused2) {
                    tv2.f("Parsing XChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                return new Boolean(((Boolean) vp2.a.get()).booleanValue());
            case 12:
                List list = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sgtm.upload.retry_interval", 600000L, 51).get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.realtime_upload_interval", 10000L, 33).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.service_client.reconnect_millis", 1000L, 38).get();
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return (Boolean) xo2.a.r(10, "measurement.config.default_flag_values", true).get();
            case 17:
                List list6 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_events_per_bundle", 1000L, 70).get()).longValue());
            default:
                List list7 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.ad_id_cache_time", 10000L, 0).get();
        }
    }
}
