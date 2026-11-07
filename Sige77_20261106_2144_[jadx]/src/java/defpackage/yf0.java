package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yf0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ zf0 b;

    public yf0(zf0 zf0Var, f fVar) {
        this.b = zf0Var;
        this.a = fVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        f fVar = this.a;
        Fragment fragment = fVar.c;
        fVar.k();
        os1.f((ViewGroup) fragment.t0.getParent(), this.b.a).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
