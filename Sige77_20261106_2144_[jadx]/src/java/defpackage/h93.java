package defpackage;

import com.google.android.gms.tasks.Task;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h93 extends v0 {
    public Task v;

    @Override // defpackage.v0
    public final void c() {
        this.v = null;
    }

    @Override // defpackage.v0
    public final String j() {
        Task task = this.v;
        return task == null ? BuildConfig.FLAVOR : task.toString();
    }
}
