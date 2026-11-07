package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q42 extends r42 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public q42(q42 q42Var, mb mbVar) {
        s42 o42Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = q42Var.c;
        this.d = q42Var.d;
        this.e = q42Var.e;
        this.f = q42Var.f;
        this.g = q42Var.g;
        this.h = q42Var.h;
        this.i = q42Var.i;
        String str = q42Var.k;
        this.k = str;
        if (str != null) {
            mbVar.put(str, this);
        }
        matrix.set(q42Var.j);
        ArrayList arrayList = q42Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof q42) {
                this.b.add(new q42((q42) obj, mbVar));
            } else {
                if (obj instanceof p42) {
                    p42 p42Var = (p42) obj;
                    p42 p42Var2 = new p42(p42Var);
                    p42Var2.e = 0.0f;
                    p42Var2.g = 1.0f;
                    p42Var2.h = 1.0f;
                    p42Var2.i = 0.0f;
                    p42Var2.j = 1.0f;
                    p42Var2.k = 0.0f;
                    p42Var2.l = Paint.Cap.BUTT;
                    p42Var2.m = Paint.Join.MITER;
                    p42Var2.n = 4.0f;
                    p42Var2.d = p42Var.d;
                    p42Var2.e = p42Var.e;
                    p42Var2.g = p42Var.g;
                    p42Var2.f = p42Var.f;
                    p42Var2.c = p42Var.c;
                    p42Var2.h = p42Var.h;
                    p42Var2.i = p42Var.i;
                    p42Var2.j = p42Var.j;
                    p42Var2.k = p42Var.k;
                    p42Var2.l = p42Var.l;
                    p42Var2.m = p42Var.m;
                    p42Var2.n = p42Var.n;
                    o42Var = p42Var2;
                } else {
                    if (!(obj instanceof o42)) {
                        uq1.q("Unknown object in the tree!");
                        throw null;
                    }
                    o42Var = new o42((o42) obj);
                }
                this.b.add(o42Var);
                Object obj2 = o42Var.b;
                if (obj2 != null) {
                    mbVar.put(obj2, o42Var);
                }
            }
        }
    }

    @Override // defpackage.r42
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((r42) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.r42
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((r42) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public q42() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
