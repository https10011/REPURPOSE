package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lh implements kw1 {
    public final ImageView a;
    public final c72 b;
    public Animatable c;
    public final /* synthetic */ int d;

    public lh(ImageView imageView, int i) {
        this.d = i;
        am2.p(imageView, "Argument must not be null");
        this.a = imageView;
        this.b = new c72(imageView);
    }

    @Override // defpackage.kw1
    public final void a(Drawable drawable) {
        l(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.uw0
    public final void b() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.kw1
    public final void c(er1 er1Var) {
        this.b.b.remove(er1Var);
    }

    @Override // defpackage.kw1
    public final void d(Object obj, oz1 oz1Var) {
        if (oz1Var != null && oz1Var.f(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.c = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.c = animatable;
            animatable.start();
            return;
        }
        l(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.c = animatable2;
        animatable2.start();
    }

    @Override // defpackage.kw1
    public final void e(er1 er1Var) {
        c72 c72Var = this.b;
        ArrayList arrayList = c72Var.b;
        View view = c72Var.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = c72Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = c72Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            er1Var.m(iA, iA2);
            return;
        }
        if (!arrayList.contains(er1Var)) {
            arrayList.add(er1Var);
        }
        if (c72Var.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            qv qvVar = new qv(c72Var);
            c72Var.c = qvVar;
            viewTreeObserver.addOnPreDrawListener(qvVar);
        }
    }

    @Override // defpackage.kw1
    public final void f(xh1 xh1Var) {
        this.a.setTag(2131296512, xh1Var);
    }

    @Override // defpackage.kw1
    public final void g(Drawable drawable) {
        l(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.kw1
    public final xh1 h() {
        Object tag = this.a.getTag(2131296512);
        if (tag != null) {
            if (tag instanceof xh1) {
                return (xh1) tag;
            }
            e.g("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.kw1
    public final void i(Drawable drawable) {
        c72 c72Var = this.b;
        ViewTreeObserver viewTreeObserver = c72Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c72Var.c);
        }
        c72Var.c = null;
        c72Var.b.clear();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.uw0
    public final void j() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void l(Object obj) {
        switch (this.d) {
            case 0:
                this.a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final String toString() {
        return "Target for: " + this.a;
    }

    @Override // defpackage.uw0
    public final void k() {
    }
}
