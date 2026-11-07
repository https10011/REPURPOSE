package defpackage;

import android.text.TextUtils;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rx1 {
    public long a;
    public String b;
    public qb2 c;
    public long d;

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    public final boolean a() {
        boolean z;
        qb2 qb2Var = this.c;
        int i = qb2Var.f;
        int i2 = qb2Var.g;
        int i3 = qb2Var.h;
        int i4 = qb2Var.b;
        int i5 = qb2Var.c;
        if (i4 != 100 || i != 0 || i2 != 100 || i3 != 1 || i5 != 1) {
            String str = sc2.a;
            String strL = BuildConfig.FLAVOR;
            if (TextUtils.isEmpty(str == null ? BuildConfig.FLAVOR : sc2.a)) {
                strL = nj2.l(hc.h);
            } else if (sc2.a != null) {
                strL = sc2.a;
            }
            if (TextUtils.isEmpty(strL)) {
                z = true;
            } else {
                int iAbs = Math.abs(strL.hashCode()) % (i3 * 100);
                if (iAbs < i || iAbs > i2) {
                    z = false;
                } else {
                    z = true;
                }
            }
            boolean z2 = Math.abs(ld2.d.nextInt()) % (i5 * 100) < i4;
            String str2 = ze2.a;
            if (TextUtils.equals("online", "test")) {
                cc2.e("gaidHashHit: " + z + " eventHashHit: " + z2 + " gmin = " + i + " gmax = " + i2);
            }
            if (!z || !z2) {
                return false;
            }
        }
        return true;
    }
}
