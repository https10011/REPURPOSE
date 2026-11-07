package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vr1 extends ag1 {
    public boolean a = false;
    public final /* synthetic */ qa1 b;

    public vr1(qa1 qa1Var) {
        this.b = qa1Var;
    }

    @Override // defpackage.ag1
    public final void a(int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.ag1
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
