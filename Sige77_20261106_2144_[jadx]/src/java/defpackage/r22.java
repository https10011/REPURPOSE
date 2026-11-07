package defpackage;

import java.io.File;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r22 implements e51 {
    public static final r22 b = new r22(0);
    public final /* synthetic */ int a;

    public /* synthetic */ r22(int i) {
        this.a = i;
    }

    @Override // defpackage.e51
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.e51
    public final d51 b(Object obj, int i, int i2, da1 da1Var) {
        switch (this.a) {
            case 0:
                return new d51(new y71(obj), new fj(obj, 1));
            case 1:
                File file = (File) obj;
                return new d51(new y71(file), new fj(file, 0));
            default:
                return null;
        }
    }
}
