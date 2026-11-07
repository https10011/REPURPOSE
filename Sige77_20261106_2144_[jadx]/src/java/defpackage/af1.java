package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class af1 extends ConstraintLayout {
    public final y1 i0;
    public int j0;
    public final r21 k0;

    /* JADX WARN: Multi-variable type inference failed */
    public af1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969419);
        LayoutInflater.from(context).inflate(2131492942, (ViewGroup) this);
        r21 r21Var = new r21();
        this.k0 = r21Var;
        oh1 oh1Var = new oh1(0.5f);
        qf2 qf2VarG = r21Var.b.a.g();
        qf2VarG.e = oh1Var;
        qf2VarG.f = oh1Var;
        qf2VarG.g = oh1Var;
        qf2VarG.h = oh1Var;
        r21Var.setShapeAppearanceModel(qf2VarG.c());
        this.k0.n(ColorStateList.valueOf(-1));
        setBackground(this.k0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ue1.y, 2130969419, 0);
        this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.i0 = new y1(this, 22);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            y1 y1Var = this.i0;
            handler.removeCallbacks(y1Var);
            handler.post(y1Var);
        }
    }

    public abstract void m();

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            y1 y1Var = this.i0;
            handler.removeCallbacks(y1Var);
            handler.post(y1Var);
        }
    }

    public final void setBackgroundColor(int i) {
        this.k0.n(ColorStateList.valueOf(i));
    }
}
