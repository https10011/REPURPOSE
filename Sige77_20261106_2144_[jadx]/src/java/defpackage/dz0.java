package defpackage;

import androidx.lifecycle.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class dz0 {
    public final g81 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ b d;

    public dz0(b bVar, g81 g81Var) {
        this.d = bVar;
        this.a = g81Var;
    }

    public final void b(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        b bVar = this.d;
        int i2 = bVar.c;
        bVar.c = i + i2;
        if (!bVar.d) {
            bVar.d = true;
            while (true) {
                try {
                    int i3 = bVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        bVar.g();
                    } else if (z3) {
                        bVar.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    bVar.d = false;
                    throw th;
                }
            }
            bVar.d = false;
        }
        if (this.b) {
            bVar.c(this);
        }
    }

    public boolean d(ww0 ww0Var) {
        return false;
    }

    public abstract boolean e();

    public void c() {
    }
}
