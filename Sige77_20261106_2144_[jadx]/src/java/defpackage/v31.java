package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class v31 {
    public final Context a;
    public final i31 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public a41 h;
    public t31 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final u31 k = new u31(this);

    public v31(Context context, i31 i31Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = i31Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final t31 a() {
        t31 ht1Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165206);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                ht1Var = new al(context2, this.e, this.d, this.c);
            } else {
                ht1Var = new ht1(context2, this.b, this.e, this.d, this.c);
            }
            ht1Var.l(this.b);
            ht1Var.r(this.k);
            ht1Var.n(this.e);
            ht1Var.d(this.h);
            ht1Var.o(this.g);
            ht1Var.p(this.f);
            this.i = ht1Var;
        }
        return this.i;
    }

    public final boolean b() {
        t31 t31Var = this.i;
        return t31Var != null && t31Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        t31 t31VarA = a();
        t31VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            t31VarA.q(i);
            t31VarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            t31VarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        t31VarA.c();
    }
}
