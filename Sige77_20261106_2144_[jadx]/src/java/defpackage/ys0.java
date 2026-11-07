package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ys0 extends lt0 {
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0() {
        lt0 lt0VarP;
        super(true);
        boolean z = true;
        A(null);
        hm hmVarW = w();
        im imVar = hmVarW instanceof im ? (im) hmVarW : null;
        if (imVar == null || (lt0VarP = imVar.p()) == null) {
            z = false;
            break;
        }
        while (!lt0VarP.t()) {
            hm hmVarW2 = lt0VarP.w();
            im imVar2 = hmVarW2 instanceof im ? (im) hmVarW2 : null;
            if (imVar2 == null || (lt0VarP = imVar2.p()) == null) {
                z = false;
                break;
            }
        }
        this.e = z;
    }

    @Override // defpackage.lt0
    public final boolean t() {
        return this.e;
    }

    @Override // defpackage.lt0
    public final boolean u() {
        return true;
    }
}
