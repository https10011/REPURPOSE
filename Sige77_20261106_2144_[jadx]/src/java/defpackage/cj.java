package defpackage;

import java.io.File;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cj implements e51 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e51
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // defpackage.e51
    public final d51 b(Object obj, int i, int i2, da1 da1Var) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new d51(new y71(bArr), new z21(1, bArr, (bj) obj2));
            case 1:
                return new d51(new y71(obj), new z21(obj.toString(), (vl0) obj2));
            default:
                File file = (File) obj;
                return new d51(new y71(file), new ya0(file, (za0) obj2, 0));
        }
    }
}
