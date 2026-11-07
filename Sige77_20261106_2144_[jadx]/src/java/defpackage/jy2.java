package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jy2 extends uz2 {
    public final /* synthetic */ Object W;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ b03 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy2(b03 b03Var, String str, String str2, Object obj, boolean z) {
        super(b03Var, true);
        this.f = str;
        this.i = str2;
        this.W = obj;
        this.v = z;
        Objects.requireNonNull(b03Var);
        this.w = b03Var;
    }

    @Override // defpackage.uz2
    public final void a() {
        switch (this.e) {
            case 0:
                bx2 bx2Var = this.w.e;
                gu2.o(bx2Var);
                bx2Var.setUserProperty(this.f, this.i, new e81(this.W), this.v, this.a);
                break;
            case 1:
                bx2 bx2Var2 = this.w.e;
                gu2.o(bx2Var2);
                bx2Var2.getUserProperties(this.f, this.i, this.v, (xw2) this.W);
                break;
            default:
                long j = this.a;
                long j2 = this.b;
                bx2 bx2Var3 = this.w.e;
                gu2.o(bx2Var3);
                bx2Var3.logEventWithElapsedTime(this.f, this.i, (Bundle) this.W, this.v, true, j, j2);
                break;
        }
    }

    @Override // defpackage.uz2
    public void b() {
        switch (this.e) {
            case 1:
                ((xw2) this.W).k(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy2(b03 b03Var, String str, String str2, Bundle bundle, boolean z) {
        super(b03Var, true);
        this.f = str;
        this.i = str2;
        this.W = bundle;
        this.v = z;
        this.w = b03Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy2(b03 b03Var, String str, String str2, boolean z, xw2 xw2Var) {
        super(b03Var, true);
        this.f = str;
        this.i = str2;
        this.v = z;
        this.W = xw2Var;
        this.w = b03Var;
    }
}
