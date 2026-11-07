package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzom;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u23 implements ph1, ba3, h33 {
    public static u23 e;
    public static Boolean f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public u23(y93 y93Var, String str) {
        this.a = 11;
        this.b = y93Var;
        this.d = str;
        Context context = y93Var.b;
        Pattern pattern = sh3.a;
        qp0 qp0Var = new qp0(context);
        qp0Var.v("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        qp0Var.y(sb.toString());
        this.c = qp0Var.z();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r10
      0x0033: PHI (r10v9 int) = (r10v1 int), (r10v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    @Override // defpackage.ba3
    public void a(int i, Throwable th, byte[] bArr) {
        ga3 ga3Var;
        w93 w93Var = (w93) this.b;
        w93Var.D();
        zzom zzomVar = (zzom) this.d;
        if (i == 200 || i == 204) {
            if (th == null) {
                c33 c33Var = ((y53) w93Var.a).f;
                y53.l(c33Var);
                c33Var.a0.b(Long.valueOf(zzomVar.a), "[sgtm] Upload succeeded for row_id");
                ga3Var = ga3.SUCCESS;
            } else {
                c33 c33Var2 = ((y53) w93Var.a).f;
                y53.l(c33Var2);
                c33Var2.w.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) h13.u.a(null)).split(",")).contains(String.valueOf(i))) {
                    ga3Var = ga3.BACKOFF;
                } else {
                    ga3Var = ga3.FAILURE;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                c33 c33Var3 = ((y53) w93Var.a).f;
                y53.l(c33Var3);
                c33Var3.a0.b(Long.valueOf(zzomVar.a), "[sgtm] Upload succeeded for row_id");
                ga3Var = ga3.SUCCESS;
            } else {
                c33 c33Var4 = ((y53) w93Var.a).f;
                y53.l(c33Var4);
                c33Var4.w.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) h13.u.a(null)).split(",")).contains(String.valueOf(i))) {
                    ga3Var = ga3.BACKOFF;
                } else {
                    ga3Var = ga3.FAILURE;
                }
            }
        } else {
            c33 c33Var5 = ((y53) w93Var.a).f;
            y53.l(c33Var5);
            c33Var5.w.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.a), Integer.valueOf(i), th);
            if (Arrays.asList(((String) h13.u.a(null)).split(",")).contains(String.valueOf(i))) {
                ga3Var = ga3.BACKOFF;
            } else {
                ga3Var = ga3.FAILURE;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.c;
        lc3 lc3VarO = ((y53) w93Var.a).o();
        long j = zzomVar.a;
        zzaf zzafVar = new zzaf(ga3Var.a, j, zzomVar.f);
        lc3VarO.D();
        lc3VarO.F();
        lc3VarO.S(new gc(lc3VarO, lc3VarO.U(true), zzafVar, 14, false));
        c33 c33Var6 = ((y53) w93Var.a).f;
        y53.l(c33Var6);
        c33Var6.a0.c(Long.valueOf(j), ga3Var, "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
            atomicReference.set(ga3Var);
            atomicReference.notifyAll();
        }
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        a93 a93Var = (a93) ((b93) obj).l();
        a83 a83Var = new a83((u83) this.b, (bk0) this.d);
        String str = (String) this.c;
        Parcel parcelF = a93Var.F();
        parcelF.writeString(str);
        fv2.c(parcelF, a83Var);
        a93Var.G(parcelF, 28);
    }

    public nx0 b() {
        String strSubstring;
        int i;
        dd3 dd3Var;
        dd3 dd3Var2;
        String str = (String) this.d;
        y93 y93Var = (y93) this.b;
        cv1 cv1Var = y93Var.f;
        if (!g93.S(y93Var.b)) {
            return new nx0(ug3.A(), new u61(3, 17));
        }
        if (f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    f = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    f = Boolean.FALSE;
                }
            }
        }
        if (f.booleanValue()) {
            return new nx0(ug3.A(), new u61(3, 18));
        }
        og3 og3VarB = y93Var.g.b();
        hl2 hl2Var = og3VarB.c;
        rk2 rk2Var = rk2.FILE;
        mb mbVar = s93.a;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                e.g("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        if (!og3VarB.h) {
            i = 14;
        } else if (!og3VarB.a || !og3VarB.b.contains(rk2Var)) {
            i = 3;
        } else if (hl2Var.b() != 0) {
            List list = og3VarB.f;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = og3VarB.g.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        if (i != 0) {
            dd3Var2 = new dd3(null, new u61(i));
        } else {
            try {
                String str2 = og3VarB.e;
                if (str2.isEmpty()) {
                    aa1 aa1Var = (aa1) y93Var.h.get();
                    if (aa1Var.b()) {
                        str2 = ((ApplicationInfo) aa1Var.a()).dataDir;
                    } else {
                        ta.P(Level.WARNING, y93Var.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        dd3Var = new dd3(dc3.c, new u61(3, 7));
                        dd3Var2 = dd3Var;
                    }
                }
                String str3 = File.separator;
                String str4 = og3VarB.d;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                u23 u23Var = new u23(hl2Var, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = u23Var.c().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        nh3 nh3Var = (nh3) cv1Var.get();
                        boolean zT = og3VarB.k.t();
                        bc3 bc3Var = new bc3();
                        bc3Var.a = zT;
                        dd3 dd3Var3 = new dd3((dc3) nh3Var.a(uriBuild, bc3Var), new u61(5, 2));
                        StrictMode.setThreadPolicy(threadPolicy);
                        dd3Var2 = dd3Var3;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                } catch (FileNotFoundException unused2) {
                    ta.P(Level.INFO, y93Var.a(), null, "Shared storage file not found for %s", str);
                    dd3Var2 = new dd3(null, new u61(8));
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (xm2 e2) {
                    ta.P(Level.SEVERE, y93Var.a(), e2, "Failed to parse snapshot from shared storage for %s", str);
                    dd3Var2 = new dd3(null, new u61(9));
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e3) {
                ta.P(Level.WARNING, y93Var.a(), e3, "Failed to read shared file for %s", str);
                dd3Var = new dd3(dc3.c, new u61(3, 10));
            }
        }
        u61 u61Var = dd3Var2.b;
        dc3 dc3Var = dd3Var2.a;
        if (dc3Var != null) {
            return new nx0(dc3Var, u61Var);
        }
        int i2 = u61Var.b;
        try {
            nh3 nh3Var2 = (nh3) cv1Var.get();
            Uri uri = (Uri) this.c;
            rn2 rn2Var = (rn2) ug3.A().s(7);
            vl2 vl2Var = vl2.b;
            int i3 = yk2.a;
            vl2 vl2Var2 = vl2.c;
            InputStream inputStreamH = rq0.H(nh3Var2.b(uri));
            try {
                dm2 dm2VarA = ((cm2) rn2Var).a(inputStreamH, vl2Var2);
                if (inputStreamH != null) {
                    inputStreamH.close();
                }
                return new nx0((ug3) dm2VarA, new u61(4, i2));
            } catch (Throwable th2) {
                if (inputStreamH != null) {
                    try {
                        inputStreamH.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException unused3) {
            ta.P(Level.INFO, y93Var.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return m() ? new nx0(dc3.c, new u61(3, 16)) : new nx0(ug3.A(), new u61(3, 11));
        }
    }

    public File c() {
        String str = (String) ((cv1) this.c).get();
        String str2 = (String) ((cv1) this.d).get();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3);
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(".pb");
        return new File(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[Catch: all -> 0x0023, PHI: r10
      0x006b: PHI (r10v7 int) = (r10v1 int), (r10v0 int) binds: [B:14:0x0030, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    @Override // defpackage.h33
    public void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        o33 o33Var;
        bu2 bu2Var;
        String strSubstring;
        Object obj;
        switch (this.a) {
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ((if3) this.d).z(true, i, th, bArr, (String) this.b, (ArrayList) this.c, map);
                return;
            default:
                long j = ((kf3) this.c).a;
                if3 if3Var = (if3) this.d;
                String str2 = (String) this.b;
                if3Var.e().D();
                if3Var.l0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        if3Var.h0 = false;
                        if3Var.O();
                    }
                }
                if (i == 200) {
                    if (th == null) {
                        bu2 bu2Var2 = if3Var.c;
                        if3.T(bu2Var2);
                        bu2Var2.L(Long.valueOf(j));
                        if3Var.d().a0.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        o33Var = if3Var.b;
                        if3.T(o33Var);
                        if (o33Var.I()) {
                            bu2Var = if3Var.c;
                            if3.T(bu2Var);
                            if (bu2Var.K(str2)) {
                                if3Var.t(str2);
                            } else {
                                if3Var.N();
                            }
                        } else {
                            if3Var.N();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        z23 z23Var = if3Var.d().X;
                        Integer numValueOf = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        z23Var.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        bu2 bu2Var3 = if3Var.c;
                        if3.T(bu2Var3);
                        bu2Var3.Q(Long.valueOf(j));
                        if3Var.N();
                    }
                } else if (i == 204) {
                    i = 204;
                    if (th == null) {
                        bu2 bu2Var4 = if3Var.c;
                        if3.T(bu2Var4);
                        bu2Var4.L(Long.valueOf(j));
                        if3Var.d().a0.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        o33Var = if3Var.b;
                        if3.T(o33Var);
                        if (o33Var.I()) {
                            bu2Var = if3Var.c;
                            if3.T(bu2Var);
                            if (bu2Var.K(str2)) {
                                if3Var.t(str2);
                            } else {
                                if3Var.N();
                            }
                        } else {
                            if3Var.N();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        z23 z23Var2 = if3Var.d().X;
                        Integer numValueOf2 = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        z23Var2.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        bu2 bu2Var5 = if3Var.c;
                        if3.T(bu2Var5);
                        bu2Var5.Q(Long.valueOf(j));
                        if3Var.N();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    z23 z23Var3 = if3Var.d().X;
                    Integer numValueOf3 = Integer.valueOf(i);
                    obj = th;
                    if (th == null) {
                        obj = strSubstring;
                    }
                    z23Var3.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    bu2 bu2Var6 = if3Var.c;
                    if3.T(bu2Var6);
                    bu2Var6.Q(Long.valueOf(j));
                    if3Var.N();
                }
                return;
        }
    }

    public k73 e() {
        ox1 ox1Var;
        tr3 tr3VarB;
        r73 r73Var = (r73) this.b;
        if (r73Var == null || (ox1Var = (ox1) this.c) == null) {
            e.g("Cannot build without parameters and/or key material");
            return null;
        }
        if (r73Var.a != ((tr3) ox1Var.a).a.length) {
            tv2.f("Key size mismatch");
            return null;
        }
        if (r73Var.a() && ((Integer) this.d) == null) {
            tv2.f("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((r73) this.b).a() && ((Integer) this.d) != null) {
            tv2.f("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        q73 q73Var = ((r73) this.b).b;
        if (q73Var == q73.d) {
            tr3VarB = we3.a;
        } else if (q73Var == q73.c) {
            tr3VarB = we3.a(((Integer) this.d).intValue());
        } else {
            if (q73Var != q73.b) {
                uq1.q("Unknown AesSivParameters.Variant: ".concat(String.valueOf(q73Var)));
                return null;
            }
            tr3VarB = we3.b(((Integer) this.d).intValue());
        }
        return new k73((r73) this.b, (ox1) this.c, tr3VarB, (Integer) this.d);
    }

    public jg3 f() throws GeneralSecurityException {
        ox1 ox1Var;
        pg3 pg3Var = (pg3) this.b;
        if (pg3Var == null || (ox1Var = (ox1) this.c) == null) {
            tv2.f("Cannot build without parameters and/or key material");
            return null;
        }
        if (pg3Var.a != ((tr3) ox1Var.a).a.length) {
            tv2.f("Key size mismatch");
            return null;
        }
        if (pg3Var.a() && ((Integer) this.d) == null) {
            tv2.f("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((pg3) this.b).a() && ((Integer) this.d) != null) {
            tv2.f("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        dz2 dz2Var = ((pg3) this.b).c;
        if (dz2Var == dz2.X) {
            tr3 tr3Var = we3.a;
        } else if (dz2Var == dz2.W || dz2Var == dz2.w) {
            we3.a(((Integer) this.d).intValue());
        } else {
            if (dz2Var != dz2.v) {
                uq1.q("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(dz2Var)));
                return null;
            }
            we3.b(((Integer) this.d).intValue());
        }
        return new jg3((pg3) this.b, (ox1) this.c, (Integer) this.d);
    }

    public pg3 g() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            tv2.f("key size not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            tv2.f("tag size not set");
            return null;
        }
        if (((dz2) this.d) != null) {
            return new pg3(num.intValue(), ((Integer) this.c).intValue(), (dz2) this.d);
        }
        tv2.f("variant not set");
        return null;
    }

    public rg3 h() throws GeneralSecurityException {
        ox1 ox1Var;
        ah3 ah3Var = (ah3) this.b;
        if (ah3Var == null || (ox1Var = (ox1) this.c) == null) {
            tv2.f("Cannot build without parameters and/or key material");
            return null;
        }
        if (ah3Var.a != ((tr3) ox1Var.a).a.length) {
            tv2.f("Key size mismatch");
            return null;
        }
        if (ah3Var.a() && ((Integer) this.d) == null) {
            tv2.f("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((ah3) this.b).a() && ((Integer) this.d) != null) {
            tv2.f("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        yg3 yg3Var = ((ah3) this.b).c;
        if (yg3Var == yg3.e) {
            tr3 tr3Var = we3.a;
        } else if (yg3Var == yg3.d || yg3Var == yg3.c) {
            we3.a(((Integer) this.d).intValue());
        } else {
            if (yg3Var != yg3.b) {
                uq1.q("Unknown HmacParameters.Variant: ".concat(String.valueOf(yg3Var)));
                return null;
            }
            we3.b(((Integer) this.d).intValue());
        }
        return new rg3((ah3) this.b, (ox1) this.c, (Integer) this.d);
    }

    public void i(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
        }
        this.b = Integer.valueOf(i);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x004f A[EDGE_INSN: B:57:0x004f->B:55:0x004f BREAK  A[LOOP:1: B:25:0x0071->B:60:?], SYNTHETIC] */
    public void j(hl2 hl2Var, Set set, String str) {
        ee3[] ee3VarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.b).getAndSet(true)) {
            if (pv2.b == null) {
                synchronized (pv2.class) {
                    try {
                        if (pv2.b == null) {
                            pv2.b = new pv2(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ((CopyOnWriteArrayList) pv2.b.a).add(0, new mo1(22));
        }
        final byte[] bArrK = hl2Var.k();
        ((ConcurrentHashMap) this.c).compute(str, new BiFunction() { // from class: ce3
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrK;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.d).putIfAbsent((String) it.next(), new AtomicReference(new ee3(bArrK, str)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof ee3) {
                        ee3 ee3Var = (ee3) obj;
                        if (str.equals(ee3Var.a)) {
                            ee3Var.a(bArrK);
                            break;
                        }
                        ee3 ee3Var2 = new ee3(bArrK, str);
                        ee3VarArr = str.compareTo(ee3Var.a) < 0 ? new ee3[]{ee3Var2, ee3Var} : new ee3[]{ee3Var, ee3Var2};
                        do {
                            if (atomicReference.compareAndSet(obj, ee3VarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        ee3[] ee3VarArr2 = (ee3[]) obj;
                        int iBinarySearch = Arrays.binarySearch(ee3VarArr2, str);
                        if (iBinarySearch >= 0) {
                            ee3VarArr2[iBinarySearch].a(bArrK);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = ee3VarArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            ee3VarArr = (ee3[]) Arrays.copyOf(ee3VarArr2, i2);
                        } else {
                            ee3[] ee3VarArr3 = new ee3[i2];
                            System.arraycopy(ee3VarArr2, 0, ee3VarArr3, 0, i);
                            System.arraycopy(ee3VarArr2, i, ee3VarArr3, i + 1, i3);
                            ee3VarArr = ee3VarArr3;
                        }
                        ee3VarArr[i] = new ee3(bArrK, str);
                        do {
                            if (atomicReference.compareAndSet(obj, ee3VarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    public void k(int i) {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(ck1.r(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.c = Integer.valueOf(i);
    }

    public synchronized void l(int i, int i2, long j, long j2) {
        ((y53) this.b).X.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((jr0) this.c).c(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, (String) null, (String) null, 0, i2)))).addOnFailureListener(new jm(this, jElapsedRealtime, 2));
    }

    public boolean m() {
        ic3 ic3VarC = ((y93) this.b).g.c();
        return ic3VarC.v() && ((AbstractCollection) ic3VarC.A()).contains(rk2.FILE);
    }

    public /* synthetic */ u23(Object obj, Serializable serializable, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
    }

    public /* synthetic */ u23(if3 if3Var, String str, Object obj, int i) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = if3Var;
    }

    public u23() {
        this.a = 5;
        this.b = new AtomicBoolean(false);
        new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    public u23(Context context, y53 y53Var) {
        this.a = 0;
        this.d = new AtomicLong(-1L);
        this.c = new jr0(context, null, jr0.n, new sw1("measurement:api"), oj0.c);
        this.b = y53Var;
    }

    public u23(hl2 hl2Var, String str) {
        this.a = 4;
        this.b = df.c;
        int i = 12;
        this.c = ia.j(new hs1(i, this, hl2Var));
        this.d = ia.j(new f91(i, this, str, false));
    }

    public /* synthetic */ u23(int i) {
        this.a = i;
    }
}
