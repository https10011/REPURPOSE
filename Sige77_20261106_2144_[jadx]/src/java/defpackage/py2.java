package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class py2 extends uz2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ b03 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py2(b03 b03Var, String str, int i) {
        super(b03Var, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = str;
                Objects.requireNonNull(b03Var);
                this.i = b03Var;
                super(b03Var, true);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.f = str;
                Objects.requireNonNull(b03Var);
                this.i = b03Var;
                super(b03Var, true);
                break;
            default:
                this.f = str;
                Objects.requireNonNull(b03Var);
                this.i = b03Var;
                break;
        }
    }

    @Override // defpackage.uz2
    public final void a() {
        switch (this.e) {
            case 0:
                bx2 bx2Var = this.i.e;
                gu2.o(bx2Var);
                bx2Var.setUserId(this.f, this.a);
                break;
            case 1:
                bx2 bx2Var2 = this.i.e;
                gu2.o(bx2Var2);
                bx2Var2.beginAdUnitExposure(this.f, this.b);
                break;
            default:
                bx2 bx2Var3 = this.i.e;
                gu2.o(bx2Var3);
                bx2Var3.endAdUnitExposure(this.f, this.b);
                break;
        }
    }
}
