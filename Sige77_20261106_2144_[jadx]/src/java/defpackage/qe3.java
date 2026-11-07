package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class qe3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf3 b;
    public final /* synthetic */ s1 c;

    public /* synthetic */ qe3(hf3 hf3Var, s1 s1Var, int i) {
        this.a = i;
        this.b = hf3Var;
        this.c = s1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041 A[Catch: CancellationException -> 0x0024, ExecutionException -> 0x0027, TryCatch #4 {CancellationException -> 0x0024, ExecutionException -> 0x0027, blocks: (B:5:0x0009, B:7:0x001f, B:20:0x0033, B:22:0x0041, B:24:0x004d, B:30:0x005f, B:32:0x0063, B:14:0x002a, B:35:0x009d), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[Catch: CancellationException -> 0x0024, ExecutionException -> 0x0027, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0024, ExecutionException -> 0x0027, blocks: (B:5:0x0009, B:7:0x001f, B:20:0x0033, B:22:0x0041, B:24:0x004d, B:30:0x005f, B:32:0x0063, B:14:0x002a, B:35:0x009d), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        nx0 nx0Var;
        mg3 mg3Var;
        switch (this.a) {
            case 0:
                hf3 hf3Var = this.b;
                try {
                    dh0.b(this.c);
                    return;
                } catch (Exception e) {
                    String str = hf3Var.c;
                    Log.w("FlagStore", y00.l(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e);
                    return;
                }
            default:
                hf3 hf3Var2 = this.b;
                try {
                    ug3 ug3Var = (ug3) dh0.b(this.c);
                    nx0 nx0Var2 = new nx0(ug3Var, new u61(6, 2));
                    boolean z = hf3Var2.e;
                    if (z || (nx0Var = hf3Var2.a) == null) {
                        synchronized (hf3Var2) {
                            if (!z) {
                                nx0Var = hf3Var2.a;
                                if (nx0Var != null) {
                                    if (!((lh1) nx0Var.d).equals((lh1) nx0Var2.d)) {
                                        mg3Var = (mg3) hf3Var2.b.e.get();
                                        if (mg3Var != null) {
                                            mg3Var.zza();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            hf3Var2.a = nx0Var2;
                            ((AtomicInteger) hf3Var2.g.a).incrementAndGet();
                        }
                    } else if (!((lh1) nx0Var.d).equals((lh1) nx0Var2.d)) {
                        mg3Var = (mg3) hf3Var2.b.e.get();
                        if (mg3Var != null) {
                            mg3Var.zza();
                            return;
                        }
                        return;
                    }
                    if (hf3Var2.e) {
                        y93 y93Var = hf3Var2.b;
                        nb3 nb3Var = (nb3) y93Var.d.get();
                        String strT = ug3Var.t();
                        nb3Var.getClass();
                        strT.getClass();
                        z zVarB = nb3.b(nb3Var.a.c(strT));
                        ve3 ve3Var = new ve3(hf3Var2, 0);
                        q51 q51VarA = y93Var.a();
                        int i = b0.Y;
                        a0 a0Var = new a0(zVarB, Throwable.class, ve3Var);
                        zVarB.a(a0Var, gb2.C(q51VarA, a0Var));
                        return;
                    }
                    return;
                } catch (CancellationException e2) {
                    e = e2;
                    if (e.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str2 = hf3Var2.c;
                    Log.w("FlagStore", y00.l(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    if (e.getCause() instanceof SecurityException) {
                        String str3 = hf3Var2.c;
                        Log.w("FlagStore", y00.l(new StringBuilder(String.valueOf(str3).length() + 64), "Unable to update local snapshot for ", str3, ", may result in stale flags."), e);
                        return;
                    }
                    return;
                }
        }
    }
}
