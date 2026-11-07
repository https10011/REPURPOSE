package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class yu2 {
    public static final h01 a = new h01("GetTokenResultFactory", new String[0]);

    public static ki0 a(String str) {
        Map map;
        try {
            map = zu2.c(str);
        } catch (vr3 e) {
            a.g("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        ki0 ki0Var = new ki0();
        ki0Var.a = str;
        ki0Var.b = map;
        return ki0Var;
    }
}
