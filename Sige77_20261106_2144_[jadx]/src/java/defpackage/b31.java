package defpackage;

import androidx.lifecycle.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b31 implements g81 {
    public final b a;
    public final iz1 b;
    public int c = -1;

    public b31(b bVar, iz1 iz1Var) {
        this.a = bVar;
        this.b = iz1Var;
    }

    @Override // defpackage.g81
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }
}
