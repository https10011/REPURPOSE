package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qy2 extends uz2 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ b03 f;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy2(b03 b03Var, Boolean bool) {
        super(b03Var, true);
        this.i = bool;
        Objects.requireNonNull(b03Var);
        this.f = b03Var;
    }

    @Override // defpackage.uz2
    public final void a() {
        switch (this.e) {
            case 0:
                bx2 bx2Var = this.f.e;
                gu2.o(bx2Var);
                bx2Var.setMeasurementEnabled(((Boolean) this.i).booleanValue(), this.a);
                break;
            default:
                bx2 bx2Var2 = this.f.e;
                gu2.o(bx2Var2);
                bx2Var2.retrieveAndUploadBatches(new bz2(this, (z83) this.i));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy2(b03 b03Var, z83 z83Var) {
        super(b03Var, true);
        this.i = z83Var;
        this.f = b03Var;
    }
}
