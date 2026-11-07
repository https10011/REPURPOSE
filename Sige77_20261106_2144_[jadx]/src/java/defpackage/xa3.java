package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xa3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzr d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ lc3 f;
    public final /* synthetic */ Object i;

    public xa3(lc3 lc3Var, String str, String str2, zzr zzrVar, boolean z, hx2 hx2Var) {
        this.b = str;
        this.c = str2;
        this.d = zzrVar;
        this.e = z;
        this.i = hx2Var;
        this.f = lc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        qf3 qf3Var;
        AtomicReference atomicReference;
        switch (this.a) {
            case 0:
                String str = this.c;
                String str2 = this.b;
                hx2 hx2Var = (hx2) this.i;
                lc3 lc3Var = this.f;
                Bundle bundle = new Bundle();
                try {
                    try {
                        n13 n13Var = lc3Var.d;
                        y53 y53Var = (y53) lc3Var.a;
                        if (n13Var == null) {
                            c33 c33Var = y53Var.f;
                            y53.l(c33Var);
                            c33Var.f.c(str2, str, "Failed to get user properties; not connected to service");
                            qf3Var = y53Var.w;
                            y53.j(qf3Var);
                            qf3Var.w0(hx2Var, bundle);
                            return;
                        }
                        List<zzpl> listT = n13Var.t(str2, str, this.e, this.d);
                        Bundle bundle2 = new Bundle();
                        if (listT != null) {
                            for (zzpl zzplVar : listT) {
                                String str3 = zzplVar.e;
                                String str4 = zzplVar.b;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = zzplVar.d;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = zzplVar.i;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            lc3Var.R();
                            qf3 qf3Var2 = y53Var.w;
                            y53.j(qf3Var2);
                            qf3Var2.w0(hx2Var, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            c33 c33Var2 = ((y53) lc3Var.a).f;
                            y53.l(c33Var2);
                            c33Var2.f.c(str2, e, "Failed to get user properties; remote exception");
                            qf3Var = ((y53) lc3Var.a).w;
                            y53.j(qf3Var);
                            qf3Var.w0(hx2Var, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            qf3 qf3Var3 = ((y53) lc3Var.a).w;
                            y53.j(qf3Var3);
                            qf3Var3.w0(hx2Var, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.i;
                synchronized (atomicReference2) {
                    try {
                        try {
                            lc3 lc3Var2 = this.f;
                            n13 n13Var2 = lc3Var2.d;
                            if (n13Var2 == null) {
                                c33 c33Var3 = ((y53) lc3Var2.a).f;
                                y53.l(c33Var3);
                                c33Var3.f.d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(n13Var2.t(this.b, this.c, this.e, this.d));
                            } else {
                                atomicReference2.set(n13Var2.c(null, this.b, this.c, this.e));
                            }
                            lc3Var2.R();
                            atomicReference = (AtomicReference) this.i;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            c33 c33Var4 = ((y53) this.f.a).f;
                            y53.l(c33Var4);
                            c33Var4.f.d("(legacy) Failed to get user properties; remote exception", null, this.b, e3);
                            ((AtomicReference) this.i).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.i;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.i).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public xa3(lc3 lc3Var, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z) {
        this.i = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = zzrVar;
        this.e = z;
        this.f = lc3Var;
    }
}
