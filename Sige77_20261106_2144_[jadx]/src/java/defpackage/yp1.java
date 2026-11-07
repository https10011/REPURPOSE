package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yp1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public yp1() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        up1 up1Var = new up1(f4, f5, f4, f5);
        up1Var.f = this.d;
        up1Var.g = f3;
        this.g.add(new sp1(up1Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wp1) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        vp1 vp1Var = new vp1();
        vp1Var.b = f;
        vp1Var.c = f2;
        this.f.add(vp1Var);
        tp1 tp1Var = new tp1(vp1Var, this.b, this.c);
        float fB = tp1Var.b() + 270.0f;
        float fB2 = tp1Var.b() + 270.0f;
        a(fB);
        this.g.add(tp1Var);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
