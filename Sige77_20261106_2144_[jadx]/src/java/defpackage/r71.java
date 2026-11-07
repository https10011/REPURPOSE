package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class r71 implements m02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l02 b;

    public /* synthetic */ r71(l02 l02Var, int i) {
        this.a = i;
        this.b = l02Var;
    }

    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        int i = this.a;
        l02 l02Var = this.b;
        switch (i) {
            case 0:
                if (s12Var.a == Number.class) {
                    return (s71) l02Var;
                }
                return null;
            default:
                Class cls = s12Var.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (os0) l02Var;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((os0) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
