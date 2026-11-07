package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sp1 extends xp1 {
    public final up1 c;

    public sp1(up1 up1Var) {
        this.c = up1Var;
    }

    @Override // defpackage.xp1
    public final void a(Matrix matrix, np1 np1Var, int i, Canvas canvas) {
        up1 up1Var = this.c;
        float f = up1Var.f;
        float f2 = up1Var.g;
        RectF rectF = new RectF(up1Var.b, up1Var.c, up1Var.d, up1Var.e);
        Paint paint = np1Var.b;
        boolean z = f2 < 0.0f;
        Path path = np1Var.g;
        int[] iArr = np1.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = np1Var.f;
            iArr[2] = np1Var.e;
            iArr[3] = np1Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = np1Var.d;
            iArr[2] = np1Var.e;
            iArr[3] = np1Var.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = np1.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, np1Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
