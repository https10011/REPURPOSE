package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gb3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ lc3 c;

    public gb3(lc3 lc3Var, zzr zzrVar) {
        this.a = 4;
        this.b = zzrVar;
        Objects.requireNonNull(lc3Var);
        this.c = lc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        zzr zzrVar = this.b;
        lc3 lc3Var = this.c;
        switch (i) {
            case 0:
                n13 n13Var = lc3Var.d;
                y53 y53Var = (y53) lc3Var.a;
                if (n13Var != null) {
                    try {
                        n13Var.m(zzrVar);
                    } catch (RemoteException e) {
                        c33 c33Var = y53Var.f;
                        y53.l(c33Var);
                        c33Var.f.b(e, "Failed to reset data on the service: remote exception");
                    }
                    lc3Var.R();
                } else {
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                n13 n13Var2 = lc3Var.d;
                y53 y53Var2 = (y53) lc3Var.a;
                if (n13Var2 == null) {
                    c33 c33Var3 = y53Var2.f;
                    y53.l(c33Var3);
                    c33Var3.f.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        is2 is2Var = y53Var2.d;
                        f13 f13Var = h13.W0;
                        if (is2Var.P(null, f13Var)) {
                            lc3Var.W(n13Var2, null, zzrVar);
                        }
                        n13Var2.n(zzrVar);
                        y53Var2.n().J();
                        y53Var2.d.P(null, f13Var);
                        lc3Var.W(n13Var2, null, zzrVar);
                        lc3Var.R();
                    } catch (RemoteException e2) {
                        c33 c33Var4 = y53Var2.f;
                        y53.l(c33Var4);
                        c33Var4.f.b(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                n13 n13Var3 = lc3Var.d;
                y53 y53Var3 = (y53) lc3Var.a;
                if (n13Var3 == null) {
                    c33 c33Var5 = y53Var3.f;
                    y53.l(c33Var5);
                    c33Var5.w.a("Failed to send app backgrounded");
                } else {
                    try {
                        n13Var3.q(zzrVar);
                        lc3Var.R();
                    } catch (RemoteException e3) {
                        c33 c33Var6 = y53Var3.f;
                        y53.l(c33Var6);
                        c33Var6.f.b(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                n13 n13Var4 = lc3Var.d;
                y53 y53Var4 = (y53) lc3Var.a;
                if (n13Var4 == null) {
                    c33 c33Var7 = y53Var4.f;
                    y53.l(c33Var7);
                    c33Var7.f.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        n13Var4.B(zzrVar);
                        lc3Var.R();
                    } catch (RemoteException e4) {
                        c33 c33Var8 = y53Var4.f;
                        y53.l(c33Var8);
                        c33Var8.f.b(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                n13 n13Var5 = lc3Var.d;
                y53 y53Var5 = (y53) lc3Var.a;
                if (n13Var5 == null) {
                    c33 c33Var9 = y53Var5.f;
                    y53.l(c33Var9);
                    c33Var9.f.a("Failed to send consent settings to service");
                } else {
                    try {
                        n13Var5.A(zzrVar);
                        lc3Var.R();
                    } catch (RemoteException e5) {
                        c33 c33Var10 = y53Var5.f;
                        y53.l(c33Var10);
                        c33Var10.f.b(e5, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public /* synthetic */ gb3(lc3 lc3Var, zzr zzrVar, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = lc3Var;
    }
}
