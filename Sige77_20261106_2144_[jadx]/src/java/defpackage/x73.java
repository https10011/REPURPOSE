package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.zzao;
import com.hjq.toast.BuildConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x73 extends fu2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ w93 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x73(w93 w93Var, j73 j73Var, int i) {
        super(j73Var);
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(w93Var);
                this.f = w93Var;
                super(j73Var);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Objects.requireNonNull(w93Var);
                this.f = w93Var;
                super(j73Var);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                this.f = w93Var;
                super(j73Var);
                break;
            default:
                Objects.requireNonNull(w93Var);
                this.f = w93Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x028c A[Catch: IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, TryCatch #5 {IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, blocks: (B:80:0x0244, B:82:0x028c, B:87:0x0297, B:89:0x029d, B:91:0x02a5, B:92:0x02ab, B:93:0x02af), top: B:116:0x0244 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x029d A[Catch: IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, TryCatch #5 {IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, blocks: (B:80:0x0244, B:82:0x028c, B:87:0x0297, B:89:0x029d, B:91:0x02a5, B:92:0x02ab, B:93:0x02af), top: B:116:0x0244 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a5 A[Catch: IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, TryCatch #5 {IllegalArgumentException -> 0x0293, MalformedURLException -> 0x0295, blocks: (B:80:0x0244, B:82:0x028c, B:87:0x0297, B:89:0x029d, B:91:0x02a5, B:92:0x02ab, B:93:0x02af), top: B:116:0x0244 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c9  */
    @Override // defpackage.fu2
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        lc3 lc3VarO;
        y53 y53Var;
        n13 n13Var;
        zzao zzaoVarI;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        y53 y53Var2;
        URL url;
        String strConcat;
        int i2 = this.e;
        int i3 = 0;
        w93 w93Var = this.f;
        switch (i2) {
            case 0:
                w93 w93Var2 = ((y53) w93Var.a).Z;
                y53.k(w93Var2);
                new Thread(new v73(w93Var2, i3)).start();
                break;
            case 1:
                w93Var.d0();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                w93Var.K();
                break;
            default:
                y53 y53Var3 = (y53) w93Var.a;
                h43 h43Var = y53Var3.e;
                c33 c33Var = y53Var3.f;
                t53 t53Var = y53Var3.i;
                y53.l(t53Var);
                t53Var.D();
                da3 da3Var = y53Var3.b0;
                y53.l(da3Var);
                y53 y53Var4 = (y53) da3Var.a;
                y53.l(da3Var);
                String strK = y53Var3.q().K();
                Boolean boolR = y53Var3.d.R("google_analytics_adid_collection_enabled");
                if (boolR == null || boolR.booleanValue()) {
                    y53.j(h43Var);
                    y53 y53Var5 = (y53) h43Var.a;
                    h43Var.D();
                    if (h43Var.L().i(n73.AD_STORAGE)) {
                        y53Var5.X.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = h43Var.v;
                        if (str3 == null || jElapsedRealtime >= h43Var.W) {
                            h43Var.W = y53Var5.d.M(strK, h13.b) + jElapsedRealtime;
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(y53Var5.a);
                                h43Var.v = BuildConfig.FLAVOR;
                                String id = advertisingIdInfo.getId();
                                if (id != null) {
                                    h43Var.v = id;
                                }
                                h43Var.w = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e) {
                                c33 c33Var2 = y53Var5.f;
                                y53.l(c33Var2);
                                c33Var2.Z.b(e, "Unable to get advertising id");
                                h43Var.v = BuildConfig.FLAVOR;
                            }
                            pair = new Pair(h43Var.v, Boolean.valueOf(h43Var.w));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(h43Var.w));
                        }
                    } else {
                        pair = new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        y53.l(da3Var);
                        da3Var.G();
                        ConnectivityManager connectivityManager = (ConnectivityManager) y53Var4.a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            lc3 lc3VarO2 = y53Var3.o();
                            lc3VarO2.D();
                            lc3VarO2.F();
                            if (!lc3VarO2.L()) {
                                w93 w93Var3 = y53Var3.Z;
                                y53.k(w93Var3);
                                y53 y53Var6 = (y53) w93Var3.a;
                                w93Var3.D();
                                lc3VarO = y53Var6.o();
                                y53Var = (y53) lc3VarO.a;
                                lc3VarO.D();
                                lc3VarO.F();
                                n13Var = lc3VarO.d;
                                if (n13Var == null) {
                                    lc3VarO.K();
                                    c33 c33Var3 = y53Var.f;
                                    y53.l(c33Var3);
                                    c33Var3.Z.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        zzaoVarI = n13Var.i(lc3VarO.U(false));
                                        lc3VarO.R();
                                    } catch (RemoteException e2) {
                                        c33 c33Var4 = y53Var.f;
                                        y53.l(c33Var4);
                                        c33Var4.f.b(e2, "Failed to get consents; remote exception");
                                        zzaoVarI = null;
                                    }
                                    if (zzaoVarI != null) {
                                        bundle = zzaoVarI.a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = y53Var3.o0;
                                        y53Var3.o0 = i + 1;
                                        i3 = i < 10 ? 1 : 0;
                                        y53.l(c33Var);
                                        z23 z23Var = c33Var.Z;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        z23Var.b(Integer.valueOf(y53Var3.o0), ts.l(sb2, str2, " retryCount"));
                                    } else {
                                        p73 p73VarB = p73.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(p73VarB.f());
                                        pu2 pu2VarC = pu2.c(100, bundle);
                                        str = pu2VarC.d;
                                        sb.append("&dma=");
                                        Boolean bool2 = pu2VarC.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = p73.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i4);
                                        y53.l(c33Var);
                                        c33Var.a0.b(sb, "Consent query parameters to Bow");
                                        qf3 qf3Var = y53Var3.w;
                                        y53.j(qf3Var);
                                        ((y53) y53Var3.q().a).d.K();
                                        String str4 = (String) pair.first;
                                        long jA = h43Var.h0.a() - 1;
                                        string = sb.toString();
                                        y53Var2 = (y53) qf3Var.a;
                                        try {
                                            gu2.l(str4);
                                            gu2.l(strK);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qf3Var.p0()) + "&rdid=" + str4 + "&bundleid=" + strK + "&retry=" + jA;
                                            if (strK.equals(y53Var2.d.I("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            c33 c33Var5 = y53Var2.f;
                                            y53.l(c33Var5);
                                            c33Var5.f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            c33 c33Var6 = y53Var2.f;
                                            y53.l(c33Var6);
                                            c33Var6.f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            y53.l(da3Var);
                                            pv2 pv2Var = new pv2(y53Var3);
                                            da3Var.G();
                                            t53 t53Var2 = y53Var4.i;
                                            y53.l(t53Var2);
                                            t53Var2.Q(new m33(da3Var, strK, url, (byte[]) null, (HashMap) null, pv2Var));
                                        }
                                    }
                                }
                                zzaoVarI = null;
                                if (zzaoVarI != null) {
                                    bundle = zzaoVarI.a;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = y53Var3.o0;
                                    y53Var3.o0 = i + 1;
                                    if (i < 10) {
                                    }
                                    y53.l(c33Var);
                                    z23 z23Var2 = c33Var.Z;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    z23Var2.b(Integer.valueOf(y53Var3.o0), ts.l(sb3, str2, " retryCount"));
                                } else {
                                    p73 p73VarB2 = p73.b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(p73VarB2.f());
                                    pu2 pu2VarC2 = pu2.c(100, bundle);
                                    str = pu2VarC2.d;
                                    sb.append("&dma=");
                                    Boolean bool3 = pu2VarC2.c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = p73.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i5);
                                    y53.l(c33Var);
                                    c33Var.a0.b(sb, "Consent query parameters to Bow");
                                    qf3 qf3Var2 = y53Var3.w;
                                    y53.j(qf3Var2);
                                    ((y53) y53Var3.q().a).d.K();
                                    String str5 = (String) pair.first;
                                    long jA2 = h43Var.h0.a() - 1;
                                    string = sb.toString();
                                    y53Var2 = (y53) qf3Var2.a;
                                    gu2.l(str5);
                                    gu2.l(strK);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qf3Var2.p0()) + "&rdid=" + str5 + "&bundleid=" + strK + "&retry=" + jA2;
                                    if (strK.equals(y53Var2.d.I("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        y53.l(da3Var);
                                        pv2 pv2Var2 = new pv2(y53Var3);
                                        da3Var.G();
                                        t53 t53Var3 = y53Var4.i;
                                        y53.l(t53Var3);
                                        t53Var3.Q(new m33(da3Var, strK, url, (byte[]) null, (HashMap) null, pv2Var2));
                                    }
                                }
                                break;
                            } else {
                                qf3 qf3Var3 = ((y53) lc3VarO2.a).w;
                                y53.j(qf3Var3);
                                if (qf3Var3.p0() >= 234200) {
                                    w93 w93Var4 = y53Var3.Z;
                                    y53.k(w93Var4);
                                    y53 y53Var7 = (y53) w93Var4.a;
                                    w93Var4.D();
                                    lc3VarO = y53Var7.o();
                                    y53Var = (y53) lc3VarO.a;
                                    lc3VarO.D();
                                    lc3VarO.F();
                                    n13Var = lc3VarO.d;
                                    if (n13Var == null) {
                                        lc3VarO.K();
                                        c33 c33Var7 = y53Var.f;
                                        y53.l(c33Var7);
                                        c33Var7.Z.a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        zzaoVarI = n13Var.i(lc3VarO.U(false));
                                        lc3VarO.R();
                                        if (zzaoVarI != null) {
                                            bundle = zzaoVarI.a;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = y53Var3.o0;
                                            y53Var3.o0 = i + 1;
                                            if (i < 10) {
                                            }
                                            y53.l(c33Var);
                                            z23 z23Var3 = c33Var.Z;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            z23Var3.b(Integer.valueOf(y53Var3.o0), ts.l(sb4, str2, " retryCount"));
                                        } else {
                                            p73 p73VarB3 = p73.b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(p73VarB3.f());
                                            pu2 pu2VarC3 = pu2.c(100, bundle);
                                            str = pu2VarC3.d;
                                            sb.append("&dma=");
                                            Boolean bool4 = pu2VarC3.c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = p73.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i6 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i6);
                                            y53.l(c33Var);
                                            c33Var.a0.b(sb, "Consent query parameters to Bow");
                                            qf3 qf3Var4 = y53Var3.w;
                                            y53.j(qf3Var4);
                                            ((y53) y53Var3.q().a).d.K();
                                            String str6 = (String) pair.first;
                                            long jA3 = h43Var.h0.a() - 1;
                                            string = sb.toString();
                                            y53Var2 = (y53) qf3Var4.a;
                                            gu2.l(str6);
                                            gu2.l(strK);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qf3Var4.p0()) + "&rdid=" + str6 + "&bundleid=" + strK + "&retry=" + jA3;
                                            if (strK.equals(y53Var2.d.I("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                y53.l(da3Var);
                                                pv2 pv2Var3 = new pv2(y53Var3);
                                                da3Var.G();
                                                t53 t53Var4 = y53Var4.i;
                                                y53.l(t53Var4);
                                                t53Var4.Q(new m33(da3Var, strK, url, (byte[]) null, (HashMap) null, pv2Var3));
                                            }
                                        }
                                    }
                                    zzaoVarI = null;
                                    if (zzaoVarI != null) {
                                        bundle = zzaoVarI.a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = y53Var3.o0;
                                        y53Var3.o0 = i + 1;
                                        if (i < 10) {
                                        }
                                        y53.l(c33Var);
                                        z23 z23Var4 = c33Var.Z;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        z23Var4.b(Integer.valueOf(y53Var3.o0), ts.l(sb5, str2, " retryCount"));
                                    } else {
                                        p73 p73VarB4 = p73.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(p73VarB4.f());
                                        pu2 pu2VarC4 = pu2.c(100, bundle);
                                        str = pu2VarC4.d;
                                        sb.append("&dma=");
                                        Boolean bool5 = pu2VarC4.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = p73.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i7 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i7);
                                        y53.l(c33Var);
                                        c33Var.a0.b(sb, "Consent query parameters to Bow");
                                        qf3 qf3Var5 = y53Var3.w;
                                        y53.j(qf3Var5);
                                        ((y53) y53Var3.q().a).d.K();
                                        String str7 = (String) pair.first;
                                        long jA4 = h43Var.h0.a() - 1;
                                        string = sb.toString();
                                        y53Var2 = (y53) qf3Var5.a;
                                        gu2.l(str7);
                                        gu2.l(strK);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qf3Var5.p0()) + "&rdid=" + str7 + "&bundleid=" + strK + "&retry=" + jA4;
                                        if (strK.equals(y53Var2.d.I("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            y53.l(da3Var);
                                            pv2 pv2Var4 = new pv2(y53Var3);
                                            da3Var.G();
                                            t53 t53Var5 = y53Var4.i;
                                            y53.l(t53Var5);
                                            t53Var5.Q(new m33(da3Var, strK, url, (byte[]) null, (HashMap) null, pv2Var4));
                                        }
                                    }
                                } else {
                                    qf3 qf3Var6 = y53Var3.w;
                                    y53.j(qf3Var6);
                                    ((y53) y53Var3.q().a).d.K();
                                    String str8 = (String) pair.first;
                                    long jA5 = h43Var.h0.a() - 1;
                                    string = sb.toString();
                                    y53Var2 = (y53) qf3Var6.a;
                                    gu2.l(str8);
                                    gu2.l(strK);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + qf3Var6.p0()) + "&rdid=" + str8 + "&bundleid=" + strK + "&retry=" + jA5;
                                    if (strK.equals(y53Var2.d.I("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        y53.l(da3Var);
                                        pv2 pv2Var5 = new pv2(y53Var3);
                                        da3Var.G();
                                        t53 t53Var6 = y53Var4.i;
                                        y53.l(t53Var6);
                                        t53Var6.Q(new m33(da3Var, strK, url, (byte[]) null, (HashMap) null, pv2Var5));
                                    }
                                }
                            }
                        } else {
                            y53.l(c33Var);
                            c33Var.w.a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        y53.l(c33Var);
                        c33Var.a0.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    y53.l(c33Var);
                    c33Var.a0.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (i3 != 0) {
                    w93Var.f0.b(2000L);
                }
                break;
        }
    }
}
