package defpackage;

import android.net.Uri;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzr;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b63 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public b63(if3 if3Var, zzr zzrVar) {
        this.a = 2;
        this.c = zzrVar;
        Objects.requireNonNull(if3Var);
        this.b = if3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                g73 g73Var = (g73) obj;
                g73Var.a.V();
                bu2 bu2Var = g73Var.a.c;
                if3.T(bu2Var);
                return bu2Var.B0((String) obj2);
            case 1:
                g73 g73Var2 = (g73) obj;
                g73Var2.a.V();
                return new zzao(g73Var2.a.p0(((zzr) obj2).a));
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                zzr zzrVar = (zzr) obj2;
                String str = zzrVar.a;
                gu2.o(str);
                if3 if3Var = (if3) obj;
                p73 p73VarA = if3Var.a(str);
                n73 n73Var = n73.ANALYTICS_STORAGE;
                if (p73VarA.i(n73Var) && p73.c(100, zzrVar.f0).i(n73Var)) {
                    return if3Var.c0(zzrVar).F();
                }
                if3Var.d().a0.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                u23 u23Var = (u23) obj2;
                ug3 ug3Var = (ug3) obj;
                y93 y93Var = (y93) u23Var.b;
                dc2 dc2Var = new dc2();
                try {
                    nh3 nh3Var = (nh3) y93Var.f.get();
                    Uri uri = (Uri) u23Var.c;
                    hd2 hd2Var = new hd2(ug3Var);
                    hd2Var.c = new dc2[]{dc2Var};
                    break;
                } catch (IOException | RuntimeException e) {
                    ta.P(Level.WARNING, y93Var.a(), e, "Failed to update snapshot for %s flags may be stale.", (String) u23Var.d);
                }
                return null;
        }
    }

    public /* synthetic */ b63(g73 g73Var, Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = g73Var;
    }

    public /* synthetic */ b63(u23 u23Var, ug3 ug3Var) {
        this.a = 3;
        this.c = u23Var;
        this.b = ug3Var;
    }
}
