package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yx2 implements z93 {
    public final /* synthetic */ b03 a;

    public yx2(b03 b03Var) {
        this.a = b03Var;
    }

    @Override // defpackage.z93
    public final void b(String str, String str2, Bundle bundle) {
        b03 b03Var = this.a;
        b03Var.a(new jy2(b03Var, str, str2, bundle, true));
    }

    @Override // defpackage.z93
    public final void c(String str, String str2, Bundle bundle) {
        b03 b03Var = this.a;
        b03Var.a(new ny2(b03Var, str, str2, bundle, 0));
    }

    @Override // defpackage.z93
    public final List d(String str, String str2) {
        xw2 xw2Var = new xw2();
        b03 b03Var = this.a;
        b03Var.a(new ny2(b03Var, str, str2, xw2Var, 1));
        List list = (List) xw2.D(xw2Var.e(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // defpackage.z93
    public final void e(Bundle bundle) {
        b03 b03Var = this.a;
        b03Var.a(new ly2(b03Var, bundle, 0));
    }

    @Override // defpackage.z93
    public final int f(String str) {
        xw2 xw2Var = new xw2();
        b03 b03Var = this.a;
        b03Var.a(new zy2(b03Var, str, xw2Var, 2));
        Integer num = (Integer) xw2.D(xw2Var.e(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.z93
    public final void g(String str) {
        b03 b03Var = this.a;
        b03Var.a(new py2(b03Var, str, 2));
    }

    @Override // defpackage.z93
    public final Map h(String str, String str2, boolean z) {
        xw2 xw2Var = new xw2();
        b03 b03Var = this.a;
        b03Var.a(new jy2(b03Var, str, str2, z, xw2Var));
        Bundle bundleE = xw2Var.e(5000L);
        if (bundleE == null || bundleE.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleE.size());
        for (String str3 : bundleE.keySet()) {
            Object obj = bundleE.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // defpackage.z93
    public final void i(String str) {
        b03 b03Var = this.a;
        b03Var.a(new py2(b03Var, str, 1));
    }

    @Override // defpackage.z93
    public final String zzh() {
        xw2 xw2Var = new xw2();
        b03 b03Var = this.a;
        b03Var.a(new ez2(b03Var, xw2Var, 3, false));
        return xw2Var.d(500L);
    }

    @Override // defpackage.z93
    public final String zzi() {
        xw2 xw2Var = new xw2();
        b03 b03Var = this.a;
        b03Var.a(new ez2(b03Var, xw2Var, 4, false));
        return xw2Var.d(500L);
    }

    @Override // defpackage.z93
    public final String zzj() {
        xw2 xw2Var = new xw2();
        b03 b03Var = this.a;
        b03Var.a(new ez2(b03Var, xw2Var, 1));
        return xw2Var.d(50L);
    }

    @Override // defpackage.z93
    public final String zzk() {
        xw2 xw2Var = new xw2();
        b03 b03Var = this.a;
        b03Var.a(new ez2(b03Var, xw2Var, 0));
        return xw2Var.d(500L);
    }

    @Override // defpackage.z93
    public final long zzl() {
        return this.a.d();
    }
}
