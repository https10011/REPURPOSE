package defpackage;

import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u61 {
    public int a;
    public int b;

    public u61(int i) {
        this.a = 2;
        this.b = i;
    }

    public void a(kg1 kg1Var) {
        View view = kg1Var.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public /* synthetic */ u61(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
