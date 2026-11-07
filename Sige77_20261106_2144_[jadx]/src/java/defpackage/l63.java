package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l63 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ g73 e;

    public /* synthetic */ l63(g73 g73Var, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = g73Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        g73 g73Var = this.e;
        switch (i) {
            case 0:
                g73Var.a.V();
                bu2 bu2Var = g73Var.a.c;
                if3.T(bu2Var);
                return bu2Var.C0(str3, str2, str);
            case 1:
                g73Var.a.V();
                bu2 bu2Var2 = g73Var.a.c;
                if3.T(bu2Var2);
                return bu2Var2.C0(str3, str2, str);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                g73Var.a.V();
                bu2 bu2Var3 = g73Var.a.c;
                if3.T(bu2Var3);
                return bu2Var3.G0(str3, str2, str);
            default:
                g73Var.a.V();
                bu2 bu2Var4 = g73Var.a.c;
                if3.T(bu2Var4);
                return bu2Var4.G0(str3, str2, str);
        }
    }
}
