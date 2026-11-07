package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fk extends p1 {
    public final /* synthetic */ gk v;

    public fk(gk gkVar) {
        this.v = gkVar;
    }

    @Override // defpackage.p1
    public final String h() {
        ek ekVar = (ek) this.v.a.get();
        if (ekVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + ekVar.a + "]";
    }
}
