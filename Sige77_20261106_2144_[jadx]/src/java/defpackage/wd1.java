package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wd1 implements m42 {
    public boolean a = false;
    public boolean b = false;
    public oa0 c;
    public final vd1 d;

    public wd1(vd1 vd1Var) {
        this.d = vd1Var;
    }

    @Override // defpackage.m42
    public final m42 b(String str) {
        if (this.a) {
            throw new l60("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.f(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.m42
    public final m42 c(boolean z) {
        if (this.a) {
            throw new l60("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
