package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w82 extends WindowInsetsAnimation.Callback {
    public final e2 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public w82(e2 e2Var) {
        super(0);
        this.d = new HashMap();
        this.a = e2Var;
    }

    public final z82 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        z82 z82Var = (z82) map.get(windowInsetsAnimation);
        if (z82Var != null) {
            return z82Var;
        }
        z82 z82Var2 = new z82(0, null, 0L);
        z82Var2.a = new x82(windowInsetsAnimation);
        map.put(windowInsetsAnimation, z82Var2);
        return z82Var2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.a.d).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        e2 e2Var = this.a;
        View view = (View) e2Var.d;
        int[] iArr = (int[]) e2Var.e;
        view.getLocationOnScreen(iArr);
        e2Var.a = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationE = v82.e(list.get(size));
            z82 z82VarA = a(windowInsetsAnimationE);
            z82VarA.a.d(windowInsetsAnimationE.getFraction());
            this.c.add(z82VarA);
        }
        u92 u92VarH = u92.h(null, windowInsets);
        this.a.e(u92VarH, this.b);
        return u92VarH.g();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        nq0 nq0VarC = nq0.c(bounds.getLowerBound());
        nq0 nq0VarC2 = nq0.c(bounds.getUpperBound());
        e2 e2Var = this.a;
        View view = (View) e2Var.d;
        int[] iArr = (int[]) e2Var.e;
        view.getLocationOnScreen(iArr);
        int i = e2Var.a - iArr[1];
        e2Var.b = i;
        view.setTranslationY(i);
        o2.n();
        return o2.i(nq0VarC.d(), nq0VarC2.d());
    }
}
