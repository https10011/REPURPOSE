package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class c50 {
    public int a;
    public final Object b;
    public final Object c;

    public c50(xf1 xf1Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = xf1Var;
    }

    public static c50 a(xf1 xf1Var, int i) {
        if (i == 0) {
            return new fa1(xf1Var, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new fa1(xf1Var, i2);
        }
        e.g("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public c50(e50 e50Var) {
        this.a = 0;
        this.c = new xy();
        this.b = e50Var;
    }
}
