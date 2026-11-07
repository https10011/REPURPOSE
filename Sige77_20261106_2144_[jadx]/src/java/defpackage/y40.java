package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y40 extends qh1 {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y40(int i) {
        super(9);
        this.X = i;
    }

    @Override // defpackage.qh1
    public final void t(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.X) {
            case 0:
                RectF rectFM = qh1.m(tabLayout, view);
                RectF rectFM2 = qh1.m(tabLayout, view2);
                if (rectFM.left < rectFM2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(d7.c(fSin, (int) rectFM.left, (int) rectFM2.left), drawable.getBounds().top, d7.c(fCos, (int) rectFM.right, (int) rectFM2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFM3 = qh1.m(tabLayout, view);
                float fB = f < 0.5f ? d7.b(1.0f, 0.0f, 0.0f, 0.5f, f) : d7.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFM3.left, drawable.getBounds().top, (int) rectFM3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
