package com.linecorp.linesdk.dialog.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.jk1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class CircleImageView extends AppCompatImageView {
    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setImageDrawable((Drawable) null);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        jk1 jk1Var = new jk1(getContext().getResources(), bitmap);
        jk1Var.k = true;
        jk1Var.j = true;
        jk1Var.g = Math.min(jk1Var.m, jk1Var.l) / 2;
        Paint paint = jk1Var.d;
        BitmapShader bitmapShader = jk1Var.e;
        paint.setShader(bitmapShader);
        jk1Var.invalidateSelf();
        float fMax = Math.max(bitmap.getWidth(), bitmap.getHeight()) / 2.0f;
        if (jk1Var.g != fMax) {
            jk1Var.k = false;
            if (fMax > 0.05f) {
                paint.setShader(bitmapShader);
            } else {
                paint.setShader(null);
            }
            jk1Var.g = fMax;
            jk1Var.invalidateSelf();
        }
        super.setImageDrawable(jk1Var);
    }
}
