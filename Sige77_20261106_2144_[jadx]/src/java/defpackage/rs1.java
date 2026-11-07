package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rs1 {
    public static final a40 m = new a40(1);
    public static final a40 n = new a40(2);
    public static final a40 o = new a40(3);
    public static final a40 p = new a40(4);
    public static final a40 q = new a40(5);
    public static final a40 r = new a40(0);
    public final zp1 c;
    public final bj0 d;
    public final float g;
    public ss1 j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public rs1(zp1 zp1Var, bj0 bj0Var) {
        this.c = zp1Var;
        this.d = bj0Var;
        if (bj0Var == o || bj0Var == p || bj0Var == q) {
            this.g = 0.1f;
        } else if (bj0Var == r) {
            this.g = 0.00390625f;
        } else if (bj0Var == m || bj0Var == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static c7 b() {
        ThreadLocal threadLocal = c7.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c7(new rd2(1)));
        }
        return (c7) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [a7, java.lang.Object] */
    public final void a(float f) {
        if (this.e) {
            this.k = f;
            return;
        }
        if (this.j == null) {
            this.j = new ss1(f);
        }
        ss1 ss1Var = this.j;
        double d = f;
        ss1Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            sm0.h("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            sm0.h("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.g * 0.75f);
        ss1Var.d = dAbs;
        ss1Var.e = dAbs * 62.5d;
        rd2 rd2Var = b().e;
        rd2Var.getClass();
        if (Thread.currentThread() != ((Looper) rd2Var.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        float fO = this.d.o(this.c);
        this.b = fO;
        if (fO > Float.MAX_VALUE || fO < -3.4028235E38f) {
            e.g("Starting value need to be in between min value and max value");
            return;
        }
        c7 c7VarB = b();
        ArrayList arrayList = c7VarB.b;
        if (arrayList.size() == 0) {
            ((Choreographer) c7VarB.e.b).postFrameCallback(new b7(c7VarB.d, 0));
            if (Build.VERSION.SDK_INT >= 33) {
                c7VarB.g = ValueAnimator.getDurationScale();
                if (c7VarB.h == null) {
                    c7VarB.h = new md2(c7VarB);
                }
                final md2 md2Var = c7VarB.h;
                if (((a7) md2Var.a) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: a7
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((c7) md2Var.b).g = f2;
                        }
                    };
                    md2Var.a = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.d.s(this.c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                ur.a();
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            sm0.h("Spring animations can only come to an end when there is damping");
            return;
        }
        rd2 rd2Var = b().e;
        rd2Var.getClass();
        if (Thread.currentThread() != ((Looper) rd2Var.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
