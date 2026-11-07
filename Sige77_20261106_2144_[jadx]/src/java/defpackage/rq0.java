package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.internal.n;
import com.google.firebase.auth.PhoneAuthCredential;
import com.hjq.toast.BuildConfig;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class rq0 implements lh3 {
    public static Context a;
    public static Boolean b;
    public static final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final int[] d = {Integer.MAX_VALUE, -1, -1, -1, -1};
    public static final int[] e = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int[] f = {-1, -1073741826, -1, -1, -1, 1, 1};
    public static final r41 i = new r41(11);
    public static long v;
    public static Method w;

    public static void A(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31) + (j6 >>> 32);
        iArr2[1] = (int) j7;
        long j8 = (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[2] = (int) j8;
        long j9 = (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[4] = (int) j10;
        B(iArr2, (int) (j10 >>> 32));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    public static void B(int[] iArr, int i2) {
        if (i2 == 0) {
            if (iArr[4] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((((long) i2) & 4294967295L) * 2147483649L) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[1]));
        iArr[1] = (int) j2;
        if (((j2 >>> 32) != 0 ? kv.L(5, 2, iArr) : 0) == 0) {
            if (iArr[4] == -1 || !gu2.w(iArr, d)) {
                return;
            }
        }
        kv.j(5, -2147483647, iArr);
    }

    public static void C(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        gu2.H(iArr, iArr3);
        A(iArr3, iArr2);
    }

    public static void D(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        gu2.H(iArr, iArr3);
        A(iArr3, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            gu2.H(iArr2, iArr3);
            A(iArr3, iArr2);
        }
    }

    public static void E(int[] iArr, int[] iArr2, int[] iArr3) {
        if (gu2.J(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 2147483649L;
            iArr3[0] = (int) j;
            if ((j >> 32) == 0) {
                return;
            }
            kv.m(5, 1, iArr3);
        }
    }

    public static int F(pw2 pw2Var) {
        Iterator it = pw2Var.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static tg2 G(PhoneAuthCredential phoneAuthCredential) {
        if (TextUtils.isEmpty(phoneAuthCredential.e)) {
            String str = phoneAuthCredential.a;
            String str2 = phoneAuthCredential.b;
            boolean z = phoneAuthCredential.d;
            tg2 tg2Var = new tg2();
            gu2.l(str);
            tg2Var.c = str;
            gu2.l(str2);
            tg2Var.d = str2;
            tg2Var.a = z;
            return tg2Var;
        }
        String str3 = phoneAuthCredential.c;
        String str4 = phoneAuthCredential.e;
        boolean z2 = phoneAuthCredential.d;
        tg2 tg2Var2 = new tg2();
        gu2.l(str3);
        tg2Var2.b = str3;
        gu2.l(str4);
        tg2Var2.e = str4;
        tg2Var2.a = z2;
        return tg2Var2;
    }

    public static final InputStream H(ep1 ep1Var) {
        ei3 ei3VarA = ((xi3) ep1Var.b).a((Uri) ep1Var.e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ei3VarA);
        ArrayList arrayList2 = (ArrayList) ep1Var.d;
        if (!arrayList2.isEmpty()) {
            int i2 = ih3.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw y00.i(it);
            }
            ih3 ih3Var = !arrayList3.isEmpty() ? new ih3(ei3VarA, arrayList3) : null;
            if (ih3Var != null) {
                arrayList.add(ih3Var);
            }
        }
        Iterator it2 = ((ro0) ep1Var.c).iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            ur.a();
            return null;
        }
        throw null;
    }

    public static String a(InputStream inputStream) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStream.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (IOException e2) {
            b81 b81Var = cc2.a;
            cc2.c(Log.getStackTraceString(e2));
            return null;
        }
    }

    public static String b(Collection collection, String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public static String d(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                int i2 = b2 & 255;
                if (Integer.toHexString(i2).length() == 1) {
                    sb.append("0");
                    sb.append(Integer.toHexString(i2));
                } else {
                    sb.append(Integer.toHexString(i2));
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static JSONObject e(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("appver", String.valueOf(nj2.C(context)));
            jSONObject.put("anver", Build.VERSION.RELEASE);
            jSONObject.put("apppkg", nj2.B(context));
            jSONObject.put("gaid", sc2.a == null ? BuildConfig.FLAVOR : sc2.a);
            jSONObject.put("mcc", nj2.x(context));
            jSONObject.put("lang", Locale.getDefault().getLanguage());
            jSONObject.put("installer", nj2.w(context));
            return jSONObject;
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
            return jSONObject;
        }
    }

    public static void f(StringBuilder sb, Integer num) {
        if (sb.length() == 0) {
            sb.append(num);
        } else {
            sb.append(",");
            sb.append(num);
        }
    }

    public static void g(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (!next.contains("&")) {
                jSONObject2.put(next, obj);
            } else if (!jSONObject2.has(next)) {
                jSONObject2.put(next, obj);
            } else if (next.endsWith("&add")) {
                jSONObject2.put(next, Long.parseLong(obj.toString()) + jSONObject2.getLong(next));
            } else if (next.endsWith("&append")) {
                Object objPut = jSONObject2.get(next);
                if (objPut instanceof JSONArray) {
                    ((JSONArray) objPut).put(obj);
                } else {
                    objPut = new JSONArray().put(objPut).put(obj);
                }
                jSONObject2.put(next, objPut);
            }
        }
    }

    public static boolean h(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static byte[] i(String str) {
        if (str.length() < 1) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i2 = 0; i2 < str.length() / 2; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            bArr[i2] = (byte) ((Integer.parseInt(str.substring(i3, i4), 16) * 16) + Integer.parseInt(str.substring(i4, i3 + 2), 16));
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x028c  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:235:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0391  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x0422  */
    /* JADX WARN: Code duplicated, block: B:409:0x0698  */
    /* JADX WARN: Code duplicated, block: B:412:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:413:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:416:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:417:0x06af  */
    /* JADX WARN: Code duplicated, block: B:419:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:424:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:426:0x06c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x06e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void k(rr rrVar, zx0 zx0Var, ArrayList arrayList, int i2) {
        int i3;
        fl[] flVarArr;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int i6;
        qr qrVar;
        zx0 zx0Var2;
        qr qrVar2;
        as1 as1Var;
        cr crVar;
        as1 as1Var2;
        qr qrVar3;
        int i7;
        cr[] crVarArr;
        cr crVar2;
        as1 as1Var3;
        int i8;
        cr[] crVarArr2;
        int i9;
        cr crVar3;
        cr crVar4;
        as1 as1Var4;
        cr crVar5;
        as1 as1Var5;
        int size;
        ArrayList arrayList2;
        int i10;
        int i11;
        float f2;
        int i12;
        as1 as1Var6;
        as1 as1Var7;
        as1 as1Var8;
        as1 as1Var9;
        nb nbVarL;
        float f3;
        cr crVar6;
        qr qrVar4;
        int i13;
        int i14;
        qr qrVar5;
        rr rrVar2 = rrVar;
        if (i2 == 0) {
            i3 = rrVar2.y0;
            flVarArr = rrVar2.B0;
            i4 = 0;
        } else {
            i3 = rrVar2.z0;
            flVarArr = rrVar2.A0;
            i4 = 2;
        }
        int i15 = i3;
        fl[] flVarArr2 = flVarArr;
        int i16 = 0;
        while (i16 < i15) {
            fl flVar = flVarArr2[i16];
            boolean z4 = flVar.q;
            qr qrVar6 = flVar.a;
            cr[] crVarArr3 = qrVar6.P;
            int i17 = 3;
            int i18 = 8;
            float f4 = 0.0f;
            if (z4) {
                i5 = i16;
            } else {
                int i19 = flVar.l;
                int i20 = i19 * 2;
                qr qrVar7 = qrVar6;
                qr qrVar8 = qrVar7;
                boolean z5 = false;
                while (!z5) {
                    flVar.i++;
                    qr[] qrVarArr = qrVar7.l0;
                    cr[] crVarArr4 = qrVar7.P;
                    qrVarArr[i19] = null;
                    qrVar7.k0[i19] = null;
                    if (qrVar7.f0 != i18) {
                        qrVar7.j(i19);
                        crVarArr4[i20].e();
                        int i21 = i20 + 1;
                        crVarArr4[i21].e();
                        crVarArr4[i20].e();
                        crVarArr4[i21].e();
                        if (flVar.b == null) {
                            flVar.b = qrVar7;
                        }
                        flVar.d = qrVar7;
                        int i22 = qrVar7.o0[i19];
                        if (i22 == i17) {
                            int i23 = qrVar7.s[i19];
                            if (i23 == 0 || i23 == i17 || i23 == 2) {
                                flVar.j++;
                                float f5 = qrVar7.j0[i19];
                                if (f5 > 0.0f) {
                                    flVar.k += f5;
                                }
                                i14 = i19;
                                if (qrVar7.f0 != 8 && i22 == 3 && (i23 == 0 || i23 == 3)) {
                                    if (f5 < 0.0f) {
                                        flVar.n = true;
                                    } else {
                                        flVar.o = true;
                                    }
                                    if (flVar.h == null) {
                                        flVar.h = new ArrayList();
                                    }
                                    flVar.h.add(qrVar7);
                                }
                                if (flVar.f == null) {
                                    flVar.f = qrVar7;
                                }
                                qr qrVar9 = flVar.g;
                                if (qrVar9 != null) {
                                    qrVar9.k0[i14] = qrVar7;
                                }
                                flVar.g = qrVar7;
                            } else {
                                i16 = i16;
                                i14 = i19;
                            }
                            if (i14 == 0) {
                                if (qrVar7.q == 0 && qrVar7.t == 0) {
                                    int i24 = qrVar7.u;
                                }
                            } else if (qrVar7.r == 0 && qrVar7.w == 0) {
                                int i25 = qrVar7.x;
                            }
                        } else {
                            i16 = i16;
                            i14 = i19;
                        }
                    } else {
                        i16 = i16;
                        i14 = i19;
                    }
                    qr qrVar10 = qrVar8;
                    if (qrVar10 != qrVar7) {
                        qrVar10.l0[i14] = qrVar7;
                    }
                    cr crVar7 = crVarArr4[i20 + 1].f;
                    if (crVar7 != null) {
                        qrVar5 = crVar7.d;
                        cr crVar8 = qrVar5.P[i20].f;
                        if (crVar8 == null || crVar8.d != qrVar7) {
                            qrVar5 = null;
                        }
                    } else {
                        qrVar5 = null;
                    }
                    if (qrVar5 == null) {
                        qrVar5 = qrVar7;
                        z5 = true;
                    }
                    qrVar8 = qrVar7;
                    i19 = i14;
                    i17 = 3;
                    i18 = 8;
                    qrVar7 = qrVar5;
                    i16 = i16;
                }
                i5 = i16;
                int i26 = i19;
                qr qrVar11 = flVar.b;
                if (qrVar11 != null) {
                    qrVar11.P[i20].e();
                }
                qr qrVar12 = flVar.d;
                if (qrVar12 != null) {
                    qrVar12.P[i20 + 1].e();
                }
                flVar.c = qrVar7;
                if (i26 == 0 && flVar.m) {
                    flVar.e = qrVar7;
                } else {
                    flVar.e = qrVar6;
                }
                flVar.p = flVar.o && flVar.n;
            }
            flVar.q = true;
            if (arrayList == 0 || arrayList.contains(qrVar6)) {
                qr qrVar13 = flVar.c;
                qr qrVar14 = flVar.b;
                qr qrVar15 = flVar.d;
                qr qrVar16 = flVar.e;
                float f6 = flVar.k;
                int[] iArr = rrVar2.o0;
                cr[] crVarArr5 = rrVar2.P;
                boolean z6 = iArr[i2] == 2;
                if (i2 == 0) {
                    int i27 = qrVar16.h0;
                    boolean z7 = i27 == 0;
                    boolean z8 = i27 == 1;
                    z = i27 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i28 = qrVar16.i0;
                    boolean z9 = i28 == 0;
                    boolean z10 = i28 == 1;
                    z = i28 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    cr[] crVarArr6 = qrVar6.P;
                    int[] iArr2 = qrVar6.o0;
                    cr crVar9 = crVarArr6[i4];
                    int i29 = z ? 1 : 4;
                    int iE = crVar9.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i2] == 3 && qrVar6.s[i2] == 0;
                    cr crVar10 = crVar9.f;
                    if (crVar10 != null && qrVar6 != qrVar6) {
                        iE = crVar10.e() + iE;
                    }
                    int i30 = iE;
                    if (z13 && qrVar6 != qrVar6 && qrVar6 != qrVar14) {
                        i29 = 8;
                    }
                    qr qrVar17 = qrVar6;
                    cr crVar11 = crVar9.f;
                    if (crVar11 != null) {
                        boolean z15 = z14;
                        as1 as1Var10 = crVar9.i;
                        as1 as1Var11 = crVar11.i;
                        if (qrVar6 == qrVar14) {
                            zx0Var.f(as1Var10, as1Var11, i30, 6);
                        } else {
                            zx0Var.f(as1Var10, as1Var11, i30, 8);
                        }
                        if (z15 && !z13) {
                            i29 = 5;
                        }
                        zx0Var.e(crVar9.i, crVar9.f.i, i30, (qrVar6 == qrVar14 && z13 && qrVar6.R[i2]) ? 5 : i29);
                    }
                    if (z12) {
                        if (qrVar6.f0 == 8 || iArr2[i2] != 3) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            zx0Var.f(crVarArr6[i4 + 1].i, crVarArr6[i4].i, 0, 5);
                        }
                        zx0Var.f(crVarArr6[i4].i, crVarArr5[i4].i, i13, 8);
                    }
                    cr crVar12 = crVarArr6[i4 + 1].f;
                    if (crVar12 != null) {
                        qrVar4 = crVar12.d;
                        cr crVar13 = qrVar4.P[i4].f;
                        if (crVar13 == null || crVar13.d != qrVar6) {
                            qrVar4 = null;
                        }
                    } else {
                        qrVar4 = null;
                    }
                    if (qrVar4 != null) {
                        qrVar6 = qrVar4;
                    } else {
                        z11 = true;
                    }
                    qrVar6 = qrVar17;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (qrVar15 != null) {
                    int i31 = i4 + 1;
                    if (qrVar13.P[i31].f != null) {
                        cr crVar14 = qrVar15.P[i31];
                        if (qrVar15.o0[i2] == 3 && qrVar15.s[i2] == 0 && !z17) {
                            cr crVar15 = crVar14.f;
                            if (crVar15.d == rrVar2) {
                                zx0Var.e(crVar14.i, crVar15.i, -crVar14.e(), 5);
                            } else if (z17) {
                                crVar6 = crVar14.f;
                                if (crVar6.d == rrVar2) {
                                    zx0Var.e(crVar14.i, crVar6.i, -crVar14.e(), 4);
                                }
                            }
                        } else if (z17) {
                            crVar6 = crVar14.f;
                            if (crVar6.d == rrVar2) {
                                zx0Var.e(crVar14.i, crVar6.i, -crVar14.e(), 4);
                            }
                        }
                        zx0Var.g(crVar14.i, qrVar13.P[i31].f.i, -crVar14.e(), 6);
                    }
                }
                if (z16) {
                    int i32 = i4 + 1;
                    as1 as1Var12 = crVarArr5[i32].i;
                    cr crVar16 = qrVar13.P[i32];
                    zx0Var.f(as1Var12, crVar16.i, crVar16.e(), 8);
                }
                ArrayList arrayList3 = flVar.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (flVar.n && !flVar.p) {
                        f6 = flVar.j;
                    }
                    qr qrVar18 = null;
                    float f7 = 0.0f;
                    int i33 = 0;
                    while (i33 < size) {
                        qr qrVar19 = (qr) arrayList3.get(i33);
                        float[] fArr = qrVar19.j0;
                        cr[] crVarArr7 = qrVar19.P;
                        float f8 = fArr[i2];
                        if (f8 >= f4) {
                            arrayList2 = arrayList3;
                            i10 = size;
                            if (f8 == f4) {
                                zx0Var.e(crVarArr7[i4 + 1].i, crVarArr7[i4].i, 0, 8);
                                i11 = i15;
                                f2 = f4;
                                f7 = f7;
                                i12 = i33;
                            } else {
                                float f9 = f7;
                                if (qrVar18 != null) {
                                    cr[] crVarArr8 = qrVar18.P;
                                    as1Var6 = crVarArr8[i4].i;
                                    int i34 = i4 + 1;
                                    as1Var7 = crVarArr8[i34].i;
                                    as1Var8 = crVarArr7[i4].i;
                                    as1Var9 = crVarArr7[i34].i;
                                    nbVarL = zx0Var.l();
                                    f3 = f4;
                                    nbVarL.b = f3;
                                    f2 = f3;
                                    if (f6 != f3 || f9 == f8) {
                                        i12 = i33;
                                        i11 = i15;
                                        nbVarL.d.g(as1Var6, 1.0f);
                                        nbVarL.d.g(as1Var7, -1.0f);
                                        nbVarL.d.g(as1Var9, 1.0f);
                                        nbVarL.d.g(as1Var8, -1.0f);
                                    } else {
                                        gb gbVar = nbVarL.d;
                                        if (f9 == f2) {
                                            i12 = i33;
                                            gbVar.g(as1Var6, 1.0f);
                                            nbVarL.d.g(as1Var7, -1.0f);
                                            i11 = i15;
                                        } else {
                                            i12 = i33;
                                            i11 = i15;
                                            if (f8 == f4) {
                                                gbVar.g(as1Var8, 1.0f);
                                                nbVarL.d.g(as1Var9, -1.0f);
                                            } else {
                                                float f10 = (f9 / f6) / (f8 / f6);
                                                gbVar.g(as1Var6, 1.0f);
                                                nbVarL.d.g(as1Var7, -1.0f);
                                                nbVarL.d.g(as1Var9, f10);
                                                nbVarL.d.g(as1Var8, -f10);
                                            }
                                        }
                                    }
                                    zx0Var.c(nbVarL);
                                } else {
                                    i11 = i15;
                                    f2 = f4;
                                    i12 = i33;
                                }
                                f7 = f8;
                                qrVar18 = qrVar19;
                            }
                        } else {
                            if (flVar.p) {
                                arrayList2 = arrayList3;
                                i10 = size;
                                zx0Var.e(crVarArr7[i4 + 1].i, crVarArr7[i4].i, 0, 4);
                            } else {
                                f8 = 1.0f;
                                arrayList2 = arrayList3;
                                i10 = size;
                                if (f8 == f4) {
                                    zx0Var.e(crVarArr7[i4 + 1].i, crVarArr7[i4].i, 0, 8);
                                } else {
                                    float f11 = f7;
                                    if (qrVar18 != null) {
                                        cr[] crVarArr9 = qrVar18.P;
                                        as1Var6 = crVarArr9[i4].i;
                                        int i35 = i4 + 1;
                                        as1Var7 = crVarArr9[i35].i;
                                        as1Var8 = crVarArr7[i4].i;
                                        as1Var9 = crVarArr7[i35].i;
                                        nbVarL = zx0Var.l();
                                        f3 = f4;
                                        nbVarL.b = f3;
                                        f2 = f3;
                                        if (f6 != f3) {
                                            i12 = i33;
                                            i11 = i15;
                                            nbVarL.d.g(as1Var6, 1.0f);
                                            nbVarL.d.g(as1Var7, -1.0f);
                                            nbVarL.d.g(as1Var9, 1.0f);
                                            nbVarL.d.g(as1Var8, -1.0f);
                                        } else {
                                            i12 = i33;
                                            i11 = i15;
                                            nbVarL.d.g(as1Var6, 1.0f);
                                            nbVarL.d.g(as1Var7, -1.0f);
                                            nbVarL.d.g(as1Var9, 1.0f);
                                            nbVarL.d.g(as1Var8, -1.0f);
                                        }
                                        zx0Var.c(nbVarL);
                                    } else {
                                        i11 = i15;
                                        f2 = f4;
                                        i12 = i33;
                                    }
                                    f7 = f8;
                                    qrVar18 = qrVar19;
                                }
                            }
                            i11 = i15;
                            f2 = f4;
                            f7 = f7;
                            i12 = i33;
                        }
                        i33 = i12 + 1;
                        i15 = i11;
                        arrayList3 = arrayList2;
                        size = i10;
                        f4 = f2;
                    }
                }
                i6 = i15;
                if (qrVar14 == null || !(qrVar14 == qrVar15 || z17)) {
                    qrVar = qrVar15;
                    if (z2 && qrVar14 != null) {
                        int i36 = flVar.j;
                        boolean z18 = i36 > 0 && flVar.i == i36;
                        qr qrVar20 = qrVar14;
                        qr qrVar21 = qrVar20;
                        while (true) {
                            cr[] crVarArr10 = qrVar21.P;
                            if (qrVar20 == null) {
                                break;
                            }
                            cr[] crVarArr11 = qrVar20.P;
                            qr qrVar22 = qrVar20.l0[i2];
                            while (true) {
                                if (qrVar22 == null) {
                                    i7 = 8;
                                    break;
                                }
                                i7 = 8;
                                if (qrVar22.f0 != 8) {
                                    break;
                                } else {
                                    qrVar22 = qrVar22.l0[i2];
                                }
                            }
                            if (qrVar22 != null || qrVar20 == qrVar) {
                                cr crVar17 = crVarArr11[i4];
                                as1 as1Var13 = crVar17.i;
                                cr crVar18 = crVar17.f;
                                as1 as1Var14 = crVar18 != null ? crVar18.i : null;
                                if (qrVar21 != qrVar20) {
                                    as1Var14 = crVarArr10[i4 + 1].i;
                                } else if (qrVar20 == qrVar14) {
                                    cr crVar19 = crVarArr3[i4].f;
                                    as1Var14 = crVar19 != null ? crVar19.i : null;
                                }
                                int iE2 = crVar17.e();
                                int i37 = i4 + 1;
                                int iE3 = crVarArr11[i37].e();
                                if (qrVar22 != null) {
                                    crVar2 = qrVar22.P[i4];
                                    crVarArr = crVarArr10;
                                    as1Var3 = crVar2.i;
                                } else {
                                    crVarArr = crVarArr10;
                                    crVar2 = qrVar13.P[i37].f;
                                    as1Var3 = crVar2 != null ? crVar2.i : null;
                                }
                                as1 as1Var15 = crVarArr11[i37].i;
                                if (crVar2 != null) {
                                    iE3 += crVar2.e();
                                }
                                int iE4 = crVarArr[i37].e() + iE2;
                                if (as1Var13 == null || as1Var14 == null || as1Var3 == null || as1Var15 == null) {
                                    i8 = 8;
                                } else {
                                    if (qrVar20 == qrVar14) {
                                        iE4 = qrVar14.P[i4].e();
                                    }
                                    int i38 = iE4;
                                    if (qrVar20 == qrVar) {
                                        iE3 = qrVar.P[i37].e();
                                    }
                                    i8 = 8;
                                    zx0Var.b(as1Var13, as1Var14, i38, 0.5f, as1Var3, as1Var15, iE3, z18 ? 8 : 5);
                                }
                            } else {
                                i8 = i7;
                            }
                            if (qrVar20.f0 != i8) {
                                qrVar21 = qrVar20;
                            }
                            qrVar20 = qrVar22;
                            qrVar21 = qrVar21;
                        }
                    } else {
                        int i39 = 8;
                        if (z3 && qrVar14 != null) {
                            int i40 = flVar.j;
                            boolean z19 = i40 > 0 && flVar.i == i40;
                            qr qrVar23 = qrVar14;
                            qr qrVar24 = qrVar23;
                            while (true) {
                                cr[] crVarArr12 = qrVar23.P;
                                if (qrVar24 == null) {
                                    break;
                                }
                                cr[] crVarArr13 = qrVar24.P;
                                qr qrVar25 = qrVar24.l0[i2];
                                while (qrVar25 != null && qrVar25.f0 == i39) {
                                    qrVar25 = qrVar25.l0[i2];
                                }
                                if (qrVar24 == qrVar14 || qrVar24 == qrVar || qrVar25 == null) {
                                    qrVar2 = qrVar23;
                                } else {
                                    if (qrVar25 == qrVar) {
                                        qrVar25 = null;
                                    }
                                    cr crVar20 = crVarArr13[i4];
                                    as1 as1Var16 = crVar20.i;
                                    int i41 = i4 + 1;
                                    as1 as1Var17 = crVarArr12[i41].i;
                                    int iE5 = crVar20.e();
                                    int iE6 = crVarArr13[i41].e();
                                    if (qrVar25 != null) {
                                        crVar = qrVar25.P[i4];
                                        as1Var = crVar.i;
                                        qrVar2 = qrVar23;
                                        cr crVar21 = crVar.f;
                                        as1Var2 = crVar21 != null ? crVar21.i : null;
                                    } else {
                                        qrVar2 = qrVar23;
                                        cr crVar22 = qrVar.P[i4];
                                        as1Var = crVar22 != null ? crVar22.i : null;
                                        as1 as1Var18 = crVarArr13[i41].i;
                                        crVar = crVar22;
                                        as1Var2 = as1Var18;
                                    }
                                    if (crVar != null) {
                                        iE6 += crVar.e();
                                    }
                                    int iE7 = crVarArr12[i41].e() + iE5;
                                    qr qrVar26 = qrVar25;
                                    int i42 = iE6;
                                    int i43 = z19 ? 8 : 4;
                                    if (as1Var16 == null || as1Var17 == null || as1Var == null || as1Var2 == null) {
                                        qrVar3 = qrVar26;
                                    } else {
                                        as1 as1Var19 = as1Var;
                                        qrVar3 = qrVar26;
                                        zx0Var.b(as1Var16, as1Var17, iE7, 0.5f, as1Var19, as1Var2, i42, i43);
                                    }
                                    qrVar25 = qrVar3;
                                }
                                if (qrVar24.f0 != 8) {
                                    qrVar2 = qrVar24;
                                }
                                qrVar24 = qrVar25;
                                i39 = 8;
                                qrVar23 = qrVar2;
                            }
                            zx0Var2 = zx0Var;
                            cr crVar23 = qrVar14.P[i4];
                            cr crVar24 = crVarArr3[i4].f;
                            int i44 = i4 + 1;
                            cr crVar25 = qrVar.P[i44];
                            cr crVar26 = qrVar13.P[i44].f;
                            if (crVar24 != null) {
                                if (qrVar14 != qrVar) {
                                    zx0Var2.e(crVar23.i, crVar24.i, crVar23.e(), 5);
                                } else if (crVar26 != null) {
                                    zx0Var2.b(crVar23.i, crVar24.i, crVar23.e(), 0.5f, crVar25.i, crVar26.i, crVar25.e(), 5);
                                }
                            }
                            if (crVar26 != null && qrVar14 != qrVar) {
                                zx0Var2.e(crVar25.i, crVar26.i, -crVar25.e(), 5);
                            }
                        }
                        if ((z2 || z3) && qrVar14 != null && qrVar14 != qrVar) {
                            crVarArr2 = qrVar14.P;
                            cr crVar27 = crVarArr2[i4];
                            if (qrVar == null) {
                                qrVar = qrVar14;
                            }
                            cr[] crVarArr14 = qrVar.P;
                            i9 = i4 + 1;
                            crVar3 = crVarArr14[i9];
                            crVar4 = crVar27.f;
                            if (crVar4 != null) {
                                as1Var4 = crVar4.i;
                            } else {
                                as1Var4 = null;
                            }
                            crVar5 = crVar3.f;
                            if (crVar5 != null) {
                                as1Var5 = crVar5.i;
                            } else {
                                as1Var5 = null;
                            }
                            if (qrVar13 != qrVar) {
                                cr crVar28 = qrVar13.P[i9].f;
                                as1Var5 = crVar28 != null ? crVar28.i : null;
                            }
                            if (qrVar14 == qrVar) {
                                crVar3 = crVarArr2[i9];
                            }
                            if (as1Var4 == null && as1Var5 != null) {
                                zx0Var2.b(crVar27.i, as1Var4, crVar27.e(), 0.5f, as1Var5, crVar3.i, crVarArr14[i9].e(), 5);
                            }
                        }
                    }
                } else {
                    cr crVar29 = crVarArr3[i4];
                    int i45 = i4 + 1;
                    cr crVar30 = qrVar13.P[i45];
                    cr crVar31 = crVar29.f;
                    as1 as1Var20 = crVar31 != null ? crVar31.i : null;
                    cr crVar32 = crVar30.f;
                    as1 as1Var21 = crVar32 != null ? crVar32.i : null;
                    cr crVar33 = qrVar14.P[i4];
                    if (qrVar15 != null) {
                        crVar30 = qrVar15.P[i45];
                    }
                    if (as1Var20 == null || as1Var21 == null) {
                        qrVar = qrVar15;
                    } else {
                        float f12 = i2 == 0 ? qrVar16.c0 : qrVar16.d0;
                        int iE8 = crVar33.e();
                        int iE9 = crVar30.e();
                        as1 as1Var22 = crVar33.i;
                        as1 as1Var23 = crVar30.i;
                        as1 as1Var24 = as1Var20;
                        qrVar = qrVar15;
                        zx0Var.b(as1Var22, as1Var24, iE8, f12, as1Var21, as1Var23, iE9, 7);
                    }
                }
                zx0Var2 = zx0Var;
                if (z2) {
                    crVarArr2 = qrVar14.P;
                    cr crVar210 = crVarArr2[i4];
                    if (qrVar == null) {
                        qrVar = qrVar14;
                    }
                    cr[] crVarArr15 = qrVar.P;
                    i9 = i4 + 1;
                    crVar3 = crVarArr15[i9];
                    crVar4 = crVar210.f;
                    if (crVar4 != null) {
                        as1Var4 = crVar4.i;
                    } else {
                        as1Var4 = null;
                    }
                    crVar5 = crVar3.f;
                    if (crVar5 != null) {
                        as1Var5 = crVar5.i;
                    } else {
                        as1Var5 = null;
                    }
                    if (qrVar13 != qrVar) {
                        cr crVar211 = qrVar13.P[i9].f;
                        as1Var5 = crVar211 != null ? crVar211.i : null;
                    }
                    if (qrVar14 == qrVar) {
                        crVar3 = crVarArr2[i9];
                    }
                    if (as1Var4 == null) {
                    }
                } else {
                    crVarArr2 = qrVar14.P;
                    cr crVar212 = crVarArr2[i4];
                    if (qrVar == null) {
                        qrVar = qrVar14;
                    }
                    cr[] crVarArr16 = qrVar.P;
                    i9 = i4 + 1;
                    crVar3 = crVarArr16[i9];
                    crVar4 = crVar212.f;
                    if (crVar4 != null) {
                        as1Var4 = crVar4.i;
                    } else {
                        as1Var4 = null;
                    }
                    crVar5 = crVar3.f;
                    if (crVar5 != null) {
                        as1Var5 = crVar5.i;
                    } else {
                        as1Var5 = null;
                    }
                    if (qrVar13 != qrVar) {
                        cr crVar213 = qrVar13.P[i9].f;
                        as1Var5 = crVar213 != null ? crVar213.i : null;
                    }
                    if (qrVar14 == qrVar) {
                        crVar3 = crVarArr2[i9];
                    }
                    if (as1Var4 == null) {
                    }
                }
            } else {
                i6 = i15;
            }
            i16 = i5 + 1;
            rrVar2 = rrVar;
            i15 = i6;
        }
    }

    public static boolean l(List list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public static byte[] m(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            byteArrayOutputStream.reset();
            return byteArray;
        } catch (Exception e2) {
            b81 b81Var = cc2.a;
            cc2.c(Log.getStackTraceString(e2));
            return null;
        }
    }

    public static void n(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static String o(byte[] bArr) {
        if (bArr == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    public static boolean p(Context context) {
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            return powerManager != null && powerManager.isScreenOn();
        } catch (Exception unused) {
        }
    }

    public static de0 q(Context context) {
        ProviderInfo providerInfo;
        be0 be0Var;
        ApplicationInfo applicationInfo;
        int i2 = 5;
        vi uyVar = Build.VERSION.SDK_INT >= 28 ? new uy(i2) : new vi(i2);
        PackageManager packageManager = context.getPackageManager();
        r93.n(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            be0Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrG = uyVar.g(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrG) {
                    arrayList.add(signature.toByteArray());
                }
                be0Var = new be0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                be0Var = null;
            }
        }
        if (be0Var == null) {
            return null;
        }
        return new de0(new ce0(context, be0Var));
    }

    public static ol1 r(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new ol1();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                map.put(str, bundle2.get(str));
            }
            return new ol1(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            uq1.q("Invalid bundle passed as restored state");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = parcelableArrayList.get(i2);
            obj.getClass();
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
        }
        return new ol1(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0065 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #2 {Exception -> 0x0069, blocks: (B:36:0x0060, B:38:0x0065), top: B:45:0x0060 }] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0027: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:40), block:B:15:0x0027 */
    public static byte[] s(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2;
        GZIPInputStream gZIPInputStream3 = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int i2 = gZIPInputStream.read(bArr2);
                        if (i2 < 0) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                gZIPInputStream.close();
                                return byteArray;
                            } catch (Exception e2) {
                                b81 b81Var = cc2.a;
                                cc2.c(Log.getStackTraceString(e2));
                                return byteArray;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, i2);
                    }
                } catch (Exception e3) {
                    e = e3;
                    b81 b81Var2 = cc2.a;
                    cc2.c(Log.getStackTraceString(e));
                    try {
                        byteArrayOutputStream.close();
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                    } catch (Exception e4) {
                        cc2.c(Log.getStackTraceString(e4));
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                gZIPInputStream3 = gZIPInputStream2;
                try {
                    byteArrayOutputStream.close();
                    if (gZIPInputStream3 != null) {
                        gZIPInputStream3.close();
                    }
                } catch (Exception e5) {
                    b81 b81Var3 = cc2.a;
                    cc2.c(Log.getStackTraceString(e5));
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            gZIPInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream.close();
            if (gZIPInputStream3 != null) {
                gZIPInputStream3.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0095 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r2.a(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0092 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object t(defpackage.id0 r8, defpackage.bd1 r9, boolean r10, defpackage.gs r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq0.t(id0, bd1, boolean, gs):java.lang.Object");
    }

    public static qv2 u(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            uq1.q("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        v5 v5Var = new v5(0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, v5Var, 1)) {
            try {
                try {
                    IBinder iBinderB = v5Var.b();
                    if (iBinderB != null) {
                        w5 w5Var = new w5(0);
                        w5Var.b = iBinderB;
                        String strD = w5Var.D();
                        w5Var.E();
                        qv2 qv2Var = new qv2(strD, 2);
                        context.unbindService(v5Var);
                        return qv2Var;
                    }
                    context.unbindService(v5Var);
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                context.unbindService(v5Var);
                throw th;
            }
            context.unbindService(v5Var);
            throw th;
        }
        uq1.o("Google Play connection failed");
        return null;
    }

    public static Object v(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.get(arrayList.size() - 1);
        }
        uq1.a();
        return null;
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 29) {
            return bz1.a();
        }
        try {
            if (w == null) {
                v = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                w = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) w.invoke(null, Long.valueOf(v))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            sm0.n(cause);
            return false;
        }
    }

    public static synchronized boolean x(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (nj2.H()) {
            b = Boolean.valueOf(n.a(applicationContext.getPackageManager()));
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                b = Boolean.FALSE;
            }
        }
        a = applicationContext;
        return b.booleanValue();
    }

    public static void y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        gu2.B(iArr, iArr2, iArr4);
        A(iArr4, iArr3);
    }

    public static t41 z(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            uq1.o("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j2; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    t41 t41Var = new t41();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    t41Var.d = byteBufferDuplicate;
                    t41Var.a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    t41Var.b = i7;
                    t41Var.c = ((ByteBuffer) t41Var.d).getShort(i7);
                    return t41Var;
                }
            }
        }
        uq1.o("Cannot read metadata.");
        return null;
    }

    public abstract void j(ai1 ai1Var, Object obj);
}
