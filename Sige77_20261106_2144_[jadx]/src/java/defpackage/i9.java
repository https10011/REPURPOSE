package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i9 extends xi0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ WeakReference j;
    public final /* synthetic */ AppCompatTextHelper k;

    public i9(AppCompatTextHelper appCompatTextHelper, int i, int i2, WeakReference weakReference) {
        this.k = appCompatTextHelper;
        this.h = i;
        this.i = i2;
        this.j = weakReference;
    }

    @Override // defpackage.xi0
    public final void r(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = m9.a(typeface, i, (this.i & 2) != 0);
        }
        AppCompatTextHelper appCompatTextHelper = this.k;
        if (appCompatTextHelper.m) {
            appCompatTextHelper.l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = appCompatTextHelper.j;
                if (zIsAttachedToWindow) {
                    textView.post(new j9(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.xi0
    public final void q(int i) {
    }
}
