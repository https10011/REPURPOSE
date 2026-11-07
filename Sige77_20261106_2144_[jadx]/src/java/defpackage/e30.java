package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e30 implements fz1 {
    public final fz1 b;
    public final boolean c;

    public e30(fz1 fz1Var, boolean z) {
        this.b = fz1Var;
        this.c = z;
    }

    @Override // defpackage.fz1
    public final pi1 a(Context context, pi1 pi1Var, int i, int i2) {
        mh mhVar = a.a(context).a;
        Drawable drawable = (Drawable) pi1Var.get();
        nh nhVarG = zi0.g(mhVar, drawable, i, i2);
        if (nhVarG == null) {
            if (!this.c) {
                return pi1Var;
            }
            uq1.e(drawable, " to a Bitmap", "Unable to convert ");
            return null;
        }
        pi1 pi1VarA = this.b.a(context, nhVarG, i, i2);
        if (!pi1VarA.equals(nhVarG)) {
            return new nh(context.getResources(), pi1VarA);
        }
        pi1VarA.e();
        return pi1Var;
    }

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        if (obj instanceof e30) {
            return this.b.equals(((e30) obj).b);
        }
        return false;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        return this.b.hashCode();
    }
}
