package defpackage;

import androidx.appcompat.widget.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y8 extends lf0 {
    public final /* synthetic */ f9 W;
    public final /* synthetic */ b X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(b bVar, b bVar2, f9 f9Var) {
        super(bVar2);
        this.X = bVar;
        this.W = f9Var;
    }

    @Override // defpackage.lf0
    public final oq1 b() {
        return this.W;
    }

    @Override // defpackage.lf0
    public final boolean c() {
        b bVar = this.X;
        if (bVar.getInternalPopup().a()) {
            return true;
        }
        bVar.f.m(bVar.getTextDirection(), bVar.getTextAlignment());
        return true;
    }
}
