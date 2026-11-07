package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.zzr;
import com.hjq.toast.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qc3 extends ne3 {
    public final b43 W;
    public final HashMap d;
    public final b43 e;
    public final b43 f;
    public final b43 i;
    public final b43 v;
    public final b43 w;

    public qc3(if3 if3Var) {
        super(if3Var);
        this.d = new HashMap();
        h43 h43Var = ((y53) this.a).e;
        y53.j(h43Var);
        this.e = new b43(h43Var, "last_delete_stale", 0L);
        h43 h43Var2 = ((y53) this.a).e;
        y53.j(h43Var2);
        this.f = new b43(h43Var2, "last_delete_stale_batch", 0L);
        h43 h43Var3 = ((y53) this.a).e;
        y53.j(h43Var3);
        this.i = new b43(h43Var3, "backoff", 0L);
        h43 h43Var4 = ((y53) this.a).e;
        y53.j(h43Var4);
        this.v = new b43(h43Var4, "last_upload", 0L);
        h43 h43Var5 = ((y53) this.a).e;
        y53.j(h43Var5);
        this.w = new b43(h43Var5, "last_upload_attempt", 0L);
        h43 h43Var6 = ((y53) this.a).e;
        y53.j(h43Var6);
        this.W = new b43(h43Var6, "midnight_offset", 0L);
    }

    public final Pair I(zzr zzrVar, p73 p73Var) {
        String str = zzrVar.a;
        gu2.l(str);
        return (p73Var.i(n73.AD_STORAGE) && zzrVar.a0) ? J(str) : new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    public final Pair J(String str) {
        nc3 nc3Var;
        AdvertisingIdClient.Info advertisingIdInfo;
        D();
        y53 y53Var = (y53) this.a;
        r41 r41Var = y53Var.X;
        is2 is2Var = y53Var.d;
        r41Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.d;
        nc3 nc3Var2 = (nc3) map.get(str);
        if (nc3Var2 != null && jElapsedRealtime < nc3Var2.c) {
            return new Pair(nc3Var2.a, Boolean.valueOf(nc3Var2.b));
        }
        long jM = is2Var.M(str, h13.b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(y53Var.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (nc3Var2 != null && jElapsedRealtime < nc3Var2.c + is2Var.M(str, h13.c)) {
                    return new Pair(nc3Var2.a, Boolean.valueOf(nc3Var2.b));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            nc3Var = id != null ? new nc3(id, jM, advertisingIdInfo.isLimitAdTrackingEnabled()) : new nc3(BuildConfig.FLAVOR, jM, advertisingIdInfo.isLimitAdTrackingEnabled());
            map.put(str, nc3Var);
            return new Pair(nc3Var.a, Boolean.valueOf(nc3Var.b));
        } catch (Exception e) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.Z.b(e, "Unable to get advertising id");
            nc3Var = new nc3(BuildConfig.FLAVOR, jM, false);
        }
    }

    public final String K(zzr zzrVar, p73 p73Var) {
        String str = zzrVar.a;
        gu2.l(str);
        if (!p73Var.i(n73.AD_STORAGE) || !zzrVar.a0) {
            return BuildConfig.FLAVOR;
        }
        D();
        String str2 = (String) J(str).first;
        MessageDigest messageDigestX = qf3.X();
        if (messageDigestX == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestX.digest(str2.getBytes())));
    }

    @Override // defpackage.ne3
    public final void H() {
    }
}
