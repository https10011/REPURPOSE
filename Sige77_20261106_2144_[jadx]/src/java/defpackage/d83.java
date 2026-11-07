package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d83 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public d83(w93 w93Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.e = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
        Objects.requireNonNull(w93Var);
        this.f = w93Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0168 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016f A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x018d A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0193 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
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
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundleF0;
        String str;
        String str2;
        z23 z23Var;
        Bundle bundleF1;
        int i = this.a;
        boolean z = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                lc3 lc3VarO = ((AppMeasurementDynamiteService) obj4).a.o();
                lc3VarO.D();
                lc3VarO.F();
                lc3VarO.S(new xa3(lc3VarO, (String) obj2, (String) obj, lc3VarO.U(false), this.d, (hx2) obj3));
                break;
            case 1:
                lc3 lc3VarO2 = ((y53) ((w93) obj4).a).o();
                lc3VarO2.D();
                lc3VarO2.F();
                lc3VarO2.S(new xa3(lc3VarO2, (AtomicReference) obj3, (String) obj2, (String) obj, lc3VarO2.U(false), this.d));
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                aa0 aa0Var = (aa0) obj4;
                w93 w93Var = (w93) aa0Var.b;
                w93Var.D();
                y53 y53Var = (y53) w93Var.a;
                t73 t73Var = w93Var.d0;
                String str3 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    qf3 qf3Var = y53Var.w;
                    c33 c33Var = y53Var.f;
                    y53.j(qf3Var);
                    try {
                        String str4 = "utm_medium";
                        if (!TextUtils.isEmpty(str3)) {
                            if (!str3.contains("gclid")) {
                                try {
                                    if (!str3.contains("gbraid") && !str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains("utm_medium") && !str3.contains("utm_id") && !str3.contains("dclid") && !str3.contains("srsltid") && !str3.contains("sfmc_id")) {
                                        c33 c33Var2 = ((y53) qf3Var.a).f;
                                        y53.l(c33Var2);
                                        c33Var2.Z.a("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) obj2;
                                    if (z) {
                                        str2 = "Activity created with data 'referrer' without required params";
                                        qf3 qf3Var2 = y53Var.w;
                                        y53.j(qf3Var2);
                                        bundleF1 = qf3Var2.F0(uri);
                                        if (bundleF1 != null) {
                                            bundleF1.putString("_cis", "intent");
                                            if (bundleF1.containsKey("gclid") && bundleF0 != null && bundleF0.containsKey("gclid")) {
                                                bundleF1.putString("_cer", "gclid=" + bundleF0.getString("gclid"));
                                            }
                                            w93Var.L(str, "_cmp", bundleF1);
                                            t73Var.b(str, bundleF1);
                                        }
                                        if (!TextUtils.isEmpty(str3)) {
                                            y53.l(c33Var);
                                            z23Var = c33Var.Z;
                                            z23Var.b(str3, "Activity created with referrer");
                                            if (!y53Var.d.P(null, h13.G0)) {
                                                if (bundleF0 != null) {
                                                    w93Var.L(str, "_cmp", bundleF0);
                                                    t73Var.b(str, bundleF0);
                                                } else {
                                                    y53.l(c33Var);
                                                    z23Var.b(str3, "Referrer does not contain valid parameters");
                                                }
                                                y53Var.X.getClass();
                                                w93Var.O("auto", "_ldl", null, true, System.currentTimeMillis());
                                            } else if (str3.contains("gclid") || (!str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains(str4) && !str3.contains("utm_term") && !str3.contains("utm_content"))) {
                                                y53.l(c33Var);
                                                z23Var.a(str2);
                                            } else if (!TextUtils.isEmpty(str3)) {
                                                y53Var.X.getClass();
                                                w93Var.O("auto", "_ldl", str3, true, System.currentTimeMillis());
                                            }
                                        }
                                    } else {
                                        str2 = "Activity created with data 'referrer' without required params";
                                    }
                                    str4 = "utm_medium";
                                    if (!TextUtils.isEmpty(str3)) {
                                        y53.l(c33Var);
                                        z23Var = c33Var.Z;
                                        z23Var.b(str3, "Activity created with referrer");
                                        if (!y53Var.d.P(null, h13.G0)) {
                                            if (str3.contains("gclid")) {
                                            }
                                            y53.l(c33Var);
                                            z23Var.a(str2);
                                        } else {
                                            if (bundleF0 != null) {
                                                w93Var.L(str, "_cmp", bundleF0);
                                                t73Var.b(str, bundleF0);
                                            } else {
                                                y53.l(c33Var);
                                                z23Var.b(str3, "Referrer does not contain valid parameters");
                                            }
                                            y53Var.X.getClass();
                                            w93Var.O("auto", "_ldl", null, true, System.currentTimeMillis());
                                        }
                                    }
                                } catch (RuntimeException e) {
                                    e = e;
                                    aa0Var = aa0Var;
                                    c33 c33Var3 = ((y53) ((w93) aa0Var.b).a).f;
                                    y53.l(c33Var3);
                                    c33Var3.f.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                    return;
                                }
                                break;
                            }
                            bundleF0 = qf3Var.F0(Uri.parse("https://google.com/search?".concat(str3)));
                            if (bundleF0 != null) {
                                bundleF0.putString("_cis", "referrer");
                            }
                            str = (String) obj2;
                            if (z) {
                                str2 = "Activity created with data 'referrer' without required params";
                                qf3 qf3Var3 = y53Var.w;
                                y53.j(qf3Var3);
                                bundleF1 = qf3Var3.F0(uri);
                                if (bundleF1 != null) {
                                    bundleF1.putString("_cis", "intent");
                                    if (bundleF1.containsKey("gclid")) {
                                    }
                                    w93Var.L(str, "_cmp", bundleF1);
                                    t73Var.b(str, bundleF1);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    y53.l(c33Var);
                                    z23Var = c33Var.Z;
                                    z23Var.b(str3, "Activity created with referrer");
                                    if (!y53Var.d.P(null, h13.G0)) {
                                        if (str3.contains("gclid")) {
                                        }
                                        y53.l(c33Var);
                                        z23Var.a(str2);
                                    } else {
                                        if (bundleF0 != null) {
                                            w93Var.L(str, "_cmp", bundleF0);
                                            t73Var.b(str, bundleF0);
                                        } else {
                                            y53.l(c33Var);
                                            z23Var.b(str3, "Referrer does not contain valid parameters");
                                        }
                                        y53Var.X.getClass();
                                        w93Var.O("auto", "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } else {
                                str2 = "Activity created with data 'referrer' without required params";
                            }
                            str4 = "utm_medium";
                            if (!TextUtils.isEmpty(str3)) {
                                y53.l(c33Var);
                                z23Var = c33Var.Z;
                                z23Var.b(str3, "Activity created with referrer");
                                if (!y53Var.d.P(null, h13.G0)) {
                                    if (str3.contains("gclid")) {
                                    }
                                    y53.l(c33Var);
                                    z23Var.a(str2);
                                } else {
                                    if (bundleF0 != null) {
                                        w93Var.L(str, "_cmp", bundleF0);
                                        t73Var.b(str, bundleF0);
                                    } else {
                                        y53.l(c33Var);
                                        z23Var.b(str3, "Referrer does not contain valid parameters");
                                    }
                                    y53Var.X.getClass();
                                    w93Var.O("auto", "_ldl", null, true, System.currentTimeMillis());
                                }
                            }
                            break;
                        }
                        bundleF0 = null;
                        str = (String) obj2;
                        if (z) {
                            str2 = "Activity created with data 'referrer' without required params";
                            qf3 qf3Var4 = y53Var.w;
                            y53.j(qf3Var4);
                            bundleF1 = qf3Var4.F0(uri);
                            if (bundleF1 != null) {
                                bundleF1.putString("_cis", "intent");
                                if (bundleF1.containsKey("gclid")) {
                                }
                                w93Var.L(str, "_cmp", bundleF1);
                                t73Var.b(str, bundleF1);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                y53.l(c33Var);
                                z23Var = c33Var.Z;
                                z23Var.b(str3, "Activity created with referrer");
                                if (!y53Var.d.P(null, h13.G0)) {
                                    if (str3.contains("gclid")) {
                                    }
                                    y53.l(c33Var);
                                    z23Var.a(str2);
                                } else {
                                    if (bundleF0 != null) {
                                        w93Var.L(str, "_cmp", bundleF0);
                                        t73Var.b(str, bundleF0);
                                    } else {
                                        y53.l(c33Var);
                                        z23Var.b(str3, "Referrer does not contain valid parameters");
                                    }
                                    y53Var.X.getClass();
                                    w93Var.O("auto", "_ldl", null, true, System.currentTimeMillis());
                                }
                            }
                        } else {
                            str2 = "Activity created with data 'referrer' without required params";
                        }
                        str4 = "utm_medium";
                        if (!TextUtils.isEmpty(str3)) {
                            y53.l(c33Var);
                            z23Var = c33Var.Z;
                            z23Var.b(str3, "Activity created with referrer");
                            if (!y53Var.d.P(null, h13.G0)) {
                                if (str3.contains("gclid")) {
                                }
                                y53.l(c33Var);
                                z23Var.a(str2);
                            } else {
                                if (bundleF0 != null) {
                                    w93Var.L(str, "_cmp", bundleF0);
                                    t73Var.b(str, bundleF0);
                                } else {
                                    y53.l(c33Var);
                                    z23Var.b(str3, "Referrer does not contain valid parameters");
                                }
                                y53Var.X.getClass();
                                w93Var.O("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        c33 c33Var4 = ((y53) ((w93) aa0Var.b).a).f;
                        y53.l(c33Var4);
                        c33Var4.f.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
                break;
            default:
                lc3 lc3Var = (lc3) obj4;
                n13 n13Var = lc3Var.d;
                y53 y53Var2 = (y53) lc3Var.a;
                if (n13Var == null) {
                    c33 c33Var5 = y53Var2.f;
                    y53.l(c33Var5);
                    c33Var5.f.a("Failed to send default event parameters to service");
                } else {
                    zzr zzrVar = (zzr) obj3;
                    if (y53Var2.d.P(null, h13.W0)) {
                        lc3Var.W(n13Var, z ? null : (zzbf) obj2, zzrVar);
                    } else {
                        try {
                            n13Var.j((Bundle) obj, zzrVar);
                            lc3Var.R();
                        } catch (RemoteException e4) {
                            c33 c33Var6 = y53Var2.f;
                            y53.l(c33Var6);
                            c33Var6.f.b(e4, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public d83(AppMeasurementDynamiteService appMeasurementDynamiteService, hx2 hx2Var, String str, String str2, boolean z) {
        this.e = hx2Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.f = appMeasurementDynamiteService;
    }

    public d83(aa0 aa0Var, boolean z, Uri uri, String str, String str2) {
        this.d = z;
        this.e = uri;
        this.b = str;
        this.c = str2;
        this.f = aa0Var;
    }

    public d83(lc3 lc3Var, zzr zzrVar, boolean z, zzbf zzbfVar, Bundle bundle) {
        this.e = zzrVar;
        this.d = z;
        this.b = zzbfVar;
        this.c = bundle;
        Objects.requireNonNull(lc3Var);
        this.f = lc3Var;
    }
}
