package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tv extends p21 {
    public final RectF r;

    public tv(tv tvVar) {
        super(tvVar);
        this.r = tvVar.r;
    }

    @Override // defpackage.p21, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        uv uvVar = new uv(this);
        uvVar.u0 = this;
        uvVar.invalidateSelf();
        return uvVar;
    }

    public tv(op1 op1Var, RectF rectF) {
        super(op1Var);
        this.r = rectF;
    }
}
