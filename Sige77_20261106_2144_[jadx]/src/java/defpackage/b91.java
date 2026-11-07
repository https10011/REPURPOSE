package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b91 {
    public static final b91 a = new b91();
    public static final Set b = wb.p(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    public static final boolean a() {
        boolean zBooleanValue;
        Set set = mt.a;
        if (set.contains(b91.class)) {
            return false;
        }
        try {
            if (i90.f(i90.a()) || h42.v()) {
                return false;
            }
            sh1 sh1Var = sh1.b;
            if (set.contains(sh1.class)) {
                zBooleanValue = false;
            } else {
                try {
                    if (sh1.c == null) {
                        sh1.c = Boolean.valueOf(sh1.b.e(i90.a()) != null);
                    }
                    Boolean bool = sh1.c;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                } catch (Throwable th) {
                    mt.a(sh1.class, th);
                }
            }
            return zBooleanValue;
        } catch (Throwable th2) {
            mt.a(b91.class, th2);
            return false;
        }
    }
}
