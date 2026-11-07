package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uv extends r21 {
    public static final /* synthetic */ int v0 = 0;
    public tv u0;

    @Override // defpackage.r21
    public final void f(Canvas canvas) {
        if (this.u0.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        tv tvVar = this.u0;
        if (i >= 26) {
            canvas.clipOutRect(tvVar.r);
        } else {
            canvas.clipRect(tvVar.r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.u0 = new tv(this.u0);
        return this;
    }

    public final void t(float f, float f2, float f3, float f4) {
        RectF rectF = this.u0.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
