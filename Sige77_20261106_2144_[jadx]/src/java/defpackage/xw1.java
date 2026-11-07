package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xw1 {
    public float c;
    public final WeakReference e;
    public vw1 f;
    public final TextPaint a = new TextPaint(1);
    public final mm b = new mm(this, 1);
    public boolean d = true;

    public xw1(pm pmVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(pmVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
    }

    public final void b(vw1 vw1Var, Context context) {
        if (this.f != vw1Var) {
            this.f = vw1Var;
            WeakReference weakReference = this.e;
            if (vw1Var != null) {
                TextPaint textPaint = this.a;
                mm mmVar = this.b;
                vw1Var.e(context, textPaint, mmVar);
                pm pmVar = (pm) weakReference.get();
                if (pmVar != null) {
                    textPaint.drawableState = pmVar.getState();
                }
                vw1Var.d(context, textPaint, mmVar);
                this.d = true;
            }
            pm pmVar2 = (pm) weakReference.get();
            if (pmVar2 != null) {
                pmVar2.C();
                pmVar2.onStateChange(pmVar2.getState());
            }
        }
    }
}
