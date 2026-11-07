package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class li0 extends Drawable implements Animatable {
    public Rect W;
    public final y6 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int f;
    public boolean v;
    public Paint w;
    public boolean e = true;
    public final int i = -1;

    public li0(y6 y6Var) {
        this.a = y6Var;
    }

    public final void a() {
        am2.n("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        ri0 ri0Var = (ri0) this.a.b;
        if (ri0Var.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.b) {
            return;
        }
        this.b = true;
        ArrayList arrayList = ri0Var.c;
        if (ri0Var.j) {
            uq1.q("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            uq1.q("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !ri0Var.f) {
            ri0Var.f = true;
            ri0Var.j = false;
            ri0Var.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.v) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.W == null) {
                this.W = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.W);
            this.v = false;
        }
        ri0 ri0Var = (ri0) this.a.b;
        pi0 pi0Var = ri0Var.i;
        Bitmap bitmap = pi0Var != null ? pi0Var.i : ri0Var.l;
        if (this.W == null) {
            this.W = new Rect();
        }
        Rect rect = this.W;
        if (this.w == null) {
            this.w = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.w);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((ri0) this.a.b).p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((ri0) this.a.b).o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.v = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.w == null) {
            this.w = new Paint(2);
        }
        this.w.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.w == null) {
            this.w = new Paint(2);
        }
        this.w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        am2.n("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.e = z;
        if (!z) {
            this.b = false;
            ri0 ri0Var = (ri0) this.a.b;
            ArrayList arrayList = ri0Var.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                ri0Var.f = false;
            }
        } else if (this.c) {
            a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.b = false;
        ri0 ri0Var = (ri0) this.a.b;
        ArrayList arrayList = ri0Var.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            ri0Var.f = false;
        }
    }
}
