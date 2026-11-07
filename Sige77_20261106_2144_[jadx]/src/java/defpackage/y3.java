package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y3 extends AppCompatImageView implements a4 {
    public final /* synthetic */ z3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y3(z3 z3Var, Context context) {
        super(context, (AttributeSet) null, 2130968610);
        this.d = z3Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        sp0.D(this, getContentDescription());
        setOnTouchListener(new u3(this, this));
    }

    @Override // defpackage.a4
    public final boolean a() {
        return false;
    }

    @Override // defpackage.a4
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performClick() {
        if (super/*android.view.View*/.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super/*android.widget.ImageView*/.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
