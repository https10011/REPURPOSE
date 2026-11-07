package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class r90 extends pz1 {
    public static final String[] o0 = {"android:visibility:visibility", "android:visibility:parent"};
    public final int n0;

    public r90() {
        this.n0 = 3;
    }

    public static void M(zz1 zz1Var) {
        View view = zz1Var.b;
        int visibility = view.getVisibility();
        HashMap map = zz1Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float O(zz1 zz1Var, float f) {
        Float f2;
        return (zz1Var == null || (f2 = (Float) zz1Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static r72 P(zz1 zz1Var, zz1 zz1Var2) {
        r72 r72Var = new r72();
        r72Var.a = false;
        r72Var.b = false;
        if (zz1Var != null) {
            HashMap map = zz1Var.a;
            if (map.containsKey("android:visibility:visibility")) {
                r72Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                r72Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                r72Var.c = -1;
                r72Var.e = null;
            }
        } else {
            r72Var.c = -1;
            r72Var.e = null;
        }
        if (zz1Var2 != null) {
            HashMap map2 = zz1Var2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                r72Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                r72Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                r72Var.d = -1;
                r72Var.f = null;
            }
        } else {
            r72Var.d = -1;
            r72Var.f = null;
        }
        if (zz1Var != null && zz1Var2 != null) {
            int i = r72Var.c;
            int i2 = r72Var.d;
            if (i != i2 || r72Var.e != r72Var.f) {
                if (i != i2) {
                    if (i == 0) {
                        r72Var.b = false;
                        r72Var.a = true;
                        return r72Var;
                    }
                    if (i2 == 0) {
                        r72Var.b = true;
                        r72Var.a = true;
                        return r72Var;
                    }
                } else {
                    if (r72Var.f == null) {
                        r72Var.b = false;
                        r72Var.a = true;
                        return r72Var;
                    }
                    if (r72Var.e == null) {
                        r72Var.b = true;
                        r72Var.a = true;
                        return r72Var;
                    }
                }
            }
        } else {
            if (zz1Var == null && r72Var.d == 0) {
                r72Var.b = true;
                r72Var.a = true;
                return r72Var;
            }
            if (zz1Var2 == null && r72Var.c == 0) {
                r72Var.b = false;
                r72Var.a = true;
            }
        }
        return r72Var;
    }

    public final ObjectAnimator N(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        e72.a.w(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, e72.b, f2);
        q90 q90Var = new q90(view);
        objectAnimatorOfFloat.addListener(q90Var);
        q().c(q90Var);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.pz1
    public final void f(zz1 zz1Var) {
        M(zz1Var);
    }

    @Override // defpackage.pz1
    public final void i(zz1 zz1Var) {
        M(zz1Var);
        View view = zz1Var.b;
        Float fValueOf = (Float) view.getTag(2131296836);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(e72.a.n(view)) : Float.valueOf(0.0f);
        }
        zz1Var.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:66:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x020c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0213  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (P(p(r3, false), u(r3, false)).a != false) goto L9;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator m(android.view.ViewGroup r24, defpackage.zz1 r25, defpackage.zz1 r26) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r90.m(android.view.ViewGroup, zz1, zz1):android.animation.Animator");
    }

    @Override // defpackage.pz1
    public final String[] t() {
        return o0;
    }

    @Override // defpackage.pz1
    public final boolean v(zz1 zz1Var, zz1 zz1Var2) {
        if (zz1Var == null && zz1Var2 == null) {
            return false;
        }
        if (zz1Var != null && zz1Var2 != null && zz1Var2.a.containsKey("android:visibility:visibility") != zz1Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        r72 r72VarP = P(zz1Var, zz1Var2);
        if (r72VarP.a) {
            return r72VarP.c == 0 || r72VarP.d == 0;
        }
        return false;
    }

    public r90(int i) {
        this();
        this.n0 = i;
    }
}
