package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a21 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ b21 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a21(b21 b21Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = b21Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        b21 b21Var = this.c;
        ColorStateList colorStateList2 = b21Var.b0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (b21Var.a0 != 0 && b21Var.b0 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{so.c(b21Var.b0.getColorForState(iArr3, 0), b21Var.a0), so.c(b21Var.b0.getColorForState(iArr2, 0), b21Var.a0), b21Var.a0});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            b21 b21Var = this.c;
            Drawable rippleDrawable = null;
            if (b21Var.getText().toString().contentEquals(textView.getText()) && b21Var.a0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(b21Var.a0);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
