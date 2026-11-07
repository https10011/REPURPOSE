package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatBackgroundHelper;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class p8 extends ImageButton {
    public final AppCompatBackgroundHelper a;
    public final q8 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        by1.a(context);
        this.c = false;
        gx1.a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.a = appCompatBackgroundHelper;
        appCompatBackgroundHelper.d(attributeSet, i);
        q8 q8Var = new q8(this);
        this.b = q8Var;
        q8Var.g(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
        q8 q8Var = this.b;
        if (q8Var != null) {
            q8Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        cy1 cy1Var;
        q8 q8Var = this.b;
        if (q8Var == null || (cy1Var = (cy1) q8Var.c) == null) {
            return null;
        }
        return cy1Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        cy1 cy1Var;
        q8 q8Var = this.b;
        if (q8Var == null || (cy1Var = (cy1) q8Var.c) == null) {
            return null;
        }
        return cy1Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q8 q8Var = this.b;
        if (q8Var != null) {
            q8Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q8 q8Var = this.b;
        if (q8Var != null && drawable != null && !this.c) {
            q8Var.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (q8Var != null) {
            q8Var.b();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) q8Var.b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(q8Var.a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        q8 q8Var = this.b;
        ImageView imageView = (ImageView) q8Var.b;
        if (i != 0) {
            Drawable drawableU = gu2.u(imageView.getContext(), i);
            if (drawableU != null) {
                i30.a(drawableU);
            }
            imageView.setImageDrawable(drawableU);
        } else {
            imageView.setImageDrawable(null);
        }
        q8Var.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q8 q8Var = this.b;
        if (q8Var != null) {
            q8Var.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q8 q8Var = this.b;
        if (q8Var != null) {
            if (((cy1) q8Var.c) == null) {
                q8Var.c = new cy1();
            }
            cy1 cy1Var = (cy1) q8Var.c;
            cy1Var.a = colorStateList;
            cy1Var.d = true;
            q8Var.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q8 q8Var = this.b;
        if (q8Var != null) {
            if (((cy1) q8Var.c) == null) {
                q8Var.c = new cy1();
            }
            cy1 cy1Var = (cy1) q8Var.c;
            cy1Var.b = mode;
            cy1Var.c = true;
            q8Var.b();
        }
    }
}
