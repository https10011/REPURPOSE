package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class le {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(le.class, "notCompletedCount$volatile");
    public final e00[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public le(e00[] e00VarArr) {
        this.a = e00VarArr;
        this.notCompletedCount$volatile = e00VarArr.length;
    }
}
