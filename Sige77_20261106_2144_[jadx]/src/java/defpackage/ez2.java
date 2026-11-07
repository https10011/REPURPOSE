package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ez2 extends uz2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xw2 f;
    public final /* synthetic */ b03 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez2(b03 b03Var, xw2 xw2Var, int i) {
        super(b03Var, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = xw2Var;
                Objects.requireNonNull(b03Var);
                this.i = b03Var;
                super(b03Var, true);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.f = xw2Var;
                Objects.requireNonNull(b03Var);
                this.i = b03Var;
                super(b03Var, true);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            default:
                this.f = xw2Var;
                Objects.requireNonNull(b03Var);
                this.i = b03Var;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                this.f = xw2Var;
                Objects.requireNonNull(b03Var);
                this.i = b03Var;
                super(b03Var, true);
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f = xw2Var;
                Objects.requireNonNull(b03Var);
                this.i = b03Var;
                super(b03Var, true);
                break;
        }
    }

    @Override // defpackage.uz2
    public final void a() {
        switch (this.e) {
            case 0:
                bx2 bx2Var = this.i.e;
                gu2.o(bx2Var);
                bx2Var.getGmpAppId(this.f);
                break;
            case 1:
                bx2 bx2Var2 = this.i.e;
                gu2.o(bx2Var2);
                bx2Var2.getCachedAppInstanceId(this.f);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                bx2 bx2Var3 = this.i.e;
                gu2.o(bx2Var3);
                bx2Var3.generateEventId(this.f);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                bx2 bx2Var4 = this.i.e;
                gu2.o(bx2Var4);
                bx2Var4.getCurrentScreenName(this.f);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                bx2 bx2Var5 = this.i.e;
                gu2.o(bx2Var5);
                bx2Var5.getCurrentScreenClass(this.f);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                bx2 bx2Var6 = this.i.e;
                gu2.o(bx2Var6);
                bx2Var6.getAppInstanceId(this.f);
                break;
            default:
                bx2 bx2Var7 = this.i.e;
                gu2.o(bx2Var7);
                bx2Var7.getSessionId(this.f);
                break;
        }
    }

    @Override // defpackage.uz2
    public final void b() {
        int i = this.e;
        xw2 xw2Var = this.f;
        switch (i) {
            case 0:
                xw2Var.k(null);
                break;
            case 1:
                xw2Var.k(null);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                xw2Var.k(null);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                xw2Var.k(null);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                xw2Var.k(null);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                xw2Var.k(null);
                break;
            default:
                xw2Var.k(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez2(b03 b03Var, xw2 xw2Var, int i, boolean z) {
        super(b03Var, true);
        this.e = i;
        this.f = xw2Var;
        this.i = b03Var;
    }
}
