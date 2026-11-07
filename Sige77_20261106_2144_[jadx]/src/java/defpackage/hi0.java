package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hi0 implements tt1 {
    public final TaskCompletionSource a;

    public hi0(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.tt1
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.tt1
    public final boolean b(ae aeVar) {
        int i = aeVar.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.trySetResult(aeVar.a);
        return true;
    }
}
