package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class as1 implements Comparable {
    public int Y;
    public boolean a;
    public float e;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] i = new float[9];
    public final float[] v = new float[9];
    public nb[] w = new nb[16];
    public int W = 0;
    public int X = 0;

    public as1(int i) {
        this.Y = i;
    }

    public final void a(nb nbVar) {
        int i = 0;
        while (true) {
            int i2 = this.W;
            nb[] nbVarArr = this.w;
            if (i >= i2) {
                if (i2 >= nbVarArr.length) {
                    this.w = (nb[]) Arrays.copyOf(nbVarArr, nbVarArr.length * 2);
                }
                nb[] nbVarArr2 = this.w;
                int i3 = this.W;
                nbVarArr2[i3] = nbVar;
                this.W = i3 + 1;
                return;
            }
            if (nbVarArr[i] == nbVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(nb nbVar) {
        int i = this.W;
        int i2 = 0;
        while (i2 < i) {
            if (this.w[i2] == nbVar) {
                while (i2 < i - 1) {
                    nb[] nbVarArr = this.w;
                    int i3 = i2 + 1;
                    nbVarArr[i2] = nbVarArr[i3];
                    i2 = i3;
                }
                this.W--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.Y = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.W;
        for (int i2 = 0; i2 < i; i2++) {
            this.w[i2] = null;
        }
        this.W = 0;
        this.X = 0;
        this.a = false;
        Arrays.fill(this.v, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((as1) obj).b;
    }

    public final void d(zx0 zx0Var, float f) {
        this.e = f;
        this.f = true;
        int i = this.W;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.w[i2].h(zx0Var, this, false);
        }
        this.W = 0;
    }

    public final void e(zx0 zx0Var, nb nbVar) {
        int i = this.W;
        for (int i2 = 0; i2 < i; i2++) {
            this.w[i2].i(zx0Var, nbVar, false);
        }
        this.W = 0;
    }

    public final String toString() {
        return BuildConfig.FLAVOR + this.b;
    }
}
