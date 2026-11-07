package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class va1 extends rq0 {
    public final /* synthetic */ int W;
    public final String X;
    public final vi Y;
    public final boolean Z;

    public va1(int i, String str, boolean z) {
        this.W = i;
        switch (i) {
            case 1:
                vi viVar = vi.b;
                Objects.requireNonNull(str, "name == null");
                this.X = str;
                this.Y = viVar;
                this.Z = z;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                vi viVar2 = vi.b;
                Objects.requireNonNull(str, "name == null");
                this.X = str;
                this.Y = viVar2;
                this.Z = z;
                break;
            default:
                vi viVar3 = vi.b;
                Objects.requireNonNull(str, "name == null");
                this.X = str;
                this.Y = viVar3;
                this.Z = z;
                break;
        }
    }

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) {
        int i = this.W;
        boolean z = this.Z;
        String str = this.X;
        vi viVar = this.Y;
        switch (i) {
            case 0:
                if (obj != null) {
                    viVar.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        ai1Var.a(str, string, z);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    viVar.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        ai1Var.b(str, string2, z);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    viVar.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        ai1Var.d(str, string3, z);
                        break;
                    }
                }
                break;
        }
    }
}
