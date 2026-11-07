package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qd3 extends zi0 {
    public final wf3 f;

    public qd3(wf3 wf3Var) {
        int i = ud3.b[ts.v(wf3Var.b)];
        this.f = wf3Var;
    }

    @Override // defpackage.zi0
    public final dx2 E() {
        wf3 wf3Var = this.f;
        return new od3((String) wf3Var.c, (ip3) wf3Var.f);
    }

    @Override // defpackage.zi0
    public final Integer F() {
        return (Integer) this.f.i;
    }

    public final tr3 H() {
        wf3 wf3Var = this.f;
        ip3 ip3Var = (ip3) wf3Var.f;
        Integer num = (Integer) wf3Var.i;
        ip3 ip3Var2 = (ip3) wf3Var.f;
        if (ip3Var.equals(ip3.RAW)) {
            return tr3.a(new byte[0]);
        }
        if (ip3Var2.equals(ip3.TINK)) {
            return we3.b(num.intValue());
        }
        if (ip3Var2.equals(ip3.LEGACY) || ip3Var2.equals(ip3.CRUNCHY)) {
            return we3.a(num.intValue());
        }
        tv2.f("Unknown output prefix type");
        return null;
    }
}
