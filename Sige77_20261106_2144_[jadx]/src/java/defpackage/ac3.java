package defpackage;

import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ac3 extends dq2 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac3(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.dq2
    public final qt2 g(ep1 ep1Var, List list) {
        int i = this.c;
        xt2 xt2Var = qt2.O;
        switch (i) {
            case 0:
                return xt2Var;
            case 1:
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return this;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new ep2(Double.valueOf(0.0d));
            default:
                return xt2Var;
        }
    }
}
