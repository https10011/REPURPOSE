package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fp3 extends lo2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp3(int i) {
        super(8);
        this.b = i;
    }

    @Override // defpackage.lo2
    public final /* synthetic */ Object s() {
        switch (this.b) {
            case 0:
                return new gp3();
            case 1:
                return new lp3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new uq3();
            default:
                return new yq3();
        }
    }
}
