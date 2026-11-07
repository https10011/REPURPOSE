package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tp1 extends xp1 {
    public final vp1 c;
    public final float d;
    public final float e;

    public tp1(vp1 vp1Var, float f, float f2) {
        this.c = vp1Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.xp1
    public final void a(Matrix matrix, np1 np1Var, int i, Canvas canvas) {
        vp1 vp1Var = this.c;
        float f = vp1Var.c;
        float f2 = this.e;
        float f3 = vp1Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        np1Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = np1Var.f;
        int[] iArr = np1.i;
        iArr[0] = i2;
        iArr[1] = np1Var.e;
        iArr[2] = np1Var.d;
        Paint paint = np1Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, np1.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        vp1 vp1Var = this.c;
        return (float) Math.toDegrees(Math.atan((vp1Var.c - this.e) / (vp1Var.b - this.d)));
    }
}
