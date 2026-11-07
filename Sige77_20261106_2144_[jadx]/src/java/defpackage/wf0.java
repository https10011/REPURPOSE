package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.result.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wf0 extends gb2 implements q62, ww0, p5, vl1, kg0 {
    public final c X;
    public final c Y;
    public final Handler Z;
    public final ig0 a0;
    public final /* synthetic */ c b0;

    public wf0(c cVar) {
        this.b0 = cVar;
        Handler handler = new Handler();
        this.a0 = new ig0();
        this.X = cVar;
        this.Y = cVar;
        this.Z = handler;
    }

    @Override // defpackage.kg0
    public final void a(Fragment fragment) {
        this.b0.onAttachFragment(fragment);
    }

    @Override // defpackage.p5
    public final a getActivityResultRegistry() {
        return this.b0.getActivityResultRegistry();
    }

    @Override // defpackage.ww0
    public final nw0 getLifecycle() {
        return this.b0.i0;
    }

    @Override // defpackage.vl1
    public final ul1 getSavedStateRegistry() {
        return this.b0.getSavedStateRegistry();
    }

    @Override // defpackage.q62
    public final p62 getViewModelStore() {
        return this.b0.getViewModelStore();
    }

    @Override // defpackage.gb2
    public final View x(int i) {
        return this.b0.findViewById(i);
    }

    @Override // defpackage.gb2
    public final boolean y() {
        Window window = this.b0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
