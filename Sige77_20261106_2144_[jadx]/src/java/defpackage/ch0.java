package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ch0 extends o0 implements Runnable {
    public ListenableFuture v;

    @Override // defpackage.v0
    public final void c() {
        this.v = null;
    }

    @Override // defpackage.v0
    public final String j() {
        ListenableFuture listenableFuture = this.v;
        if (listenableFuture == null) {
            return null;
        }
        String strValueOf = String.valueOf(listenableFuture);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 11);
        sb.append("delegate=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.v;
        if (listenableFuture != null) {
            n(listenableFuture);
        }
    }
}
