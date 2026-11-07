package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bl0 extends View {
    public bl0(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        gr grVar = (gr) getLayoutParams();
        grVar.a = i;
        setLayoutParams(grVar);
    }

    public void setGuidelineEnd(int i) {
        gr grVar = (gr) getLayoutParams();
        grVar.b = i;
        setLayoutParams(grVar);
    }

    public void setGuidelinePercent(float f) {
        gr grVar = (gr) getLayoutParams();
        grVar.c = f;
        setLayoutParams(grVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
