package defpackage;

import android.view.Choreographer;
import androidx.databinding.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a62 implements Choreographer.FrameCallback {
    public final /* synthetic */ a a;

    public a62(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.w.run();
    }
}
