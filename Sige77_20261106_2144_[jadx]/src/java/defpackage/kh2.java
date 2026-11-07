package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kh2 extends xg2 {
    public final ei b;
    public final TaskCompletionSource c;
    public final r41 d;

    public kh2(int i, ei eiVar, TaskCompletionSource taskCompletionSource, r41 r41Var) {
        super(i);
        this.c = taskCompletionSource;
        this.b = eiVar;
        this.d = r41Var;
        if (i == 2 && eiVar.c) {
            e.g("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.mh2
    public final void a(Status status) {
        this.d.getClass();
        this.c.trySetException(nj2.y(status));
    }

    @Override // defpackage.mh2
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // defpackage.mh2
    public final void c(md2 md2Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) md2Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new vf3(md2Var, taskCompletionSource));
    }

    @Override // defpackage.mh2
    public final void d(rg2 rg2Var) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            ei eiVar = this.b;
            ((ph1) ((ei) eiVar.e).d).accept(rg2Var.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(mh2.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // defpackage.xg2
    public final Feature[] f(rg2 rg2Var) {
        return (Feature[]) this.b.d;
    }

    @Override // defpackage.xg2
    public final boolean g(rg2 rg2Var) {
        return this.b.c;
    }

    @Override // defpackage.xg2
    public final int h(rg2 rg2Var) {
        return this.b.b;
    }
}
