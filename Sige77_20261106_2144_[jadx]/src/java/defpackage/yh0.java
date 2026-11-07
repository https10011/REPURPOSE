package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yh0 implements tt1 {
    public final i42 a;
    public final TaskCompletionSource b;

    public yh0(i42 i42Var, TaskCompletionSource taskCompletionSource) {
        this.a = i42Var;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.tt1
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.tt1
    public final boolean b(ae aeVar) {
        if (aeVar.b == 4 && !this.a.a(aeVar)) {
            String str = aeVar.c;
            if (str != null) {
                this.b.setResult(new sd(str, aeVar.e, aeVar.f));
                return true;
            }
            uq1.h("Null token");
        }
        return false;
    }
}
