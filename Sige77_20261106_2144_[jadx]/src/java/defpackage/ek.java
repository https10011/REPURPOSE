package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ek {
    public Object a;
    public gk b;
    public oi1 c;
    public boolean d;

    public final void finalize() {
        oi1 oi1Var;
        gk gkVar = this.b;
        if (gkVar != null) {
            fk fkVar = gkVar.b;
            if (!fkVar.isDone()) {
                fkVar.k(new h0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (this.d || (oi1Var = this.c) == null) {
            return;
        }
        oi1Var.j(null);
    }
}
