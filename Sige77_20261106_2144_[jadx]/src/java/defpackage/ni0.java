package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ni0 implements fz1 {
    public final fz1 b;

    public ni0(fz1 fz1Var) {
        am2.p(fz1Var, "Argument must not be null");
        this.b = fz1Var;
    }

    @Override // defpackage.fz1
    public final pi1 a(Context context, pi1 pi1Var, int i, int i2) {
        li0 li0Var = (li0) pi1Var.get();
        nh nhVar = new nh(a.a(context).a, ((ri0) li0Var.a.b).l);
        fz1 fz1Var = this.b;
        pi1 pi1VarA = fz1Var.a(context, nhVar, i, i2);
        if (nhVar != pi1VarA) {
            nhVar.e();
        }
        ((ri0) li0Var.a.b).c(fz1Var, (Bitmap) pi1VarA.get());
        return pi1Var;
    }

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        if (obj instanceof ni0) {
            return this.b.equals(((ni0) obj).b);
        }
        return false;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        return this.b.hashCode();
    }
}
