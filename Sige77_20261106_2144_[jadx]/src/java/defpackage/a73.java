package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class a73 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a73(g73 g73Var, zzr zzrVar, Bundle bundle, v13 v13Var, String str) {
        this.d = g73Var;
        this.c = zzrVar;
        this.e = bundle;
        this.f = v13Var;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        qf3 qf3Var;
        switch (this.a) {
            case 0:
                g73 g73Var = (g73) this.d;
                zzr zzrVar = this.c;
                Bundle bundle = (Bundle) this.e;
                v13 v13Var = (v13) this.f;
                String str = this.b;
                if3 if3Var = g73Var.a;
                if3Var.V();
                try {
                    v13Var.s(if3Var.d0(bundle, zzrVar));
                    return;
                } catch (RemoteException e) {
                    if3Var.d().f.c(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            lc3 lc3Var = (lc3) this.f;
                            n13 n13Var = lc3Var.d;
                            if (n13Var == null) {
                                c33 c33Var = ((y53) lc3Var.a).f;
                                y53.l(c33Var);
                                c33Var.f.d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, (String) this.e);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(n13Var.y(this.b, (String) this.e, this.c));
                            } else {
                                atomicReference2.set(n13Var.p(null, this.b, (String) this.e));
                            }
                            lc3Var.R();
                            atomicReference = (AtomicReference) this.d;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e2) {
                            c33 c33Var2 = ((y53) ((lc3) this.f).a).f;
                            y53.l(c33Var2);
                            c33Var2.f.d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e2);
                            ((AtomicReference) this.d).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.d;
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.d).notify();
                        throw th;
                    }
                }
                break;
            default:
                hx2 hx2Var = (hx2) this.e;
                String str2 = (String) this.d;
                String str3 = this.b;
                lc3 lc3Var2 = (lc3) this.f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        n13 n13Var2 = lc3Var2.d;
                        if (n13Var2 == null) {
                            y53 y53Var = (y53) lc3Var2.a;
                            c33 c33Var3 = y53Var.f;
                            y53.l(c33Var3);
                            c33Var3.f.c(str3, str2, "Failed to get conditional properties; not connected to service");
                            qf3Var = y53Var.w;
                        } else {
                            arrayList = qf3.y0(n13Var2.y(str3, str2, this.c));
                            lc3Var2.R();
                            qf3Var = ((y53) lc3Var2.a).w;
                        }
                    } catch (Throwable th2) {
                        qf3 qf3Var2 = ((y53) lc3Var2.a).w;
                        y53.j(qf3Var2);
                        qf3Var2.x0(hx2Var, arrayList);
                        throw th2;
                    }
                } catch (RemoteException e3) {
                    c33 c33Var4 = ((y53) lc3Var2.a).f;
                    y53.l(c33Var4);
                    c33Var4.f.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                }
                y53.j(qf3Var);
                qf3Var.x0(hx2Var, arrayList);
                return;
        }
    }

    public a73(lc3 lc3Var, String str, String str2, zzr zzrVar, hx2 hx2Var) {
        this.b = str;
        this.d = str2;
        this.c = zzrVar;
        this.e = hx2Var;
        this.f = lc3Var;
    }

    public a73(lc3 lc3Var, AtomicReference atomicReference, String str, String str2, zzr zzrVar) {
        this.d = atomicReference;
        this.b = str;
        this.e = str2;
        this.c = zzrVar;
        this.f = lc3Var;
    }
}
