package defpackage;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dc3 {
    public static final dc3 c = new dc3(vb3.b, sb3.A());
    public final vb3 a;
    public final sb3 b;

    public dc3(vb3 vb3Var, sb3 sb3Var) {
        vb3Var.getClass();
        this.a = vb3Var;
        this.b = sb3Var;
    }

    public static dc3 a(ll2 ll2Var, boolean z) throws xm2 {
        vb3 vb3VarA;
        int iC = ll2Var.C();
        if (iC > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(iC);
            sb.append(". Current version is: 1");
            throw new xm2(sb.toString());
        }
        ll2Var.C();
        int iA = ll2Var.a(ll2Var.A());
        vl2 vl2Var = vl2.b;
        int i = yk2.a;
        sb3 sb3VarZ = sb3.z(ll2Var, vl2.c);
        ll2Var.b(iA);
        gi giVar = new gi(1);
        Inflater inflater = (Inflater) giVar.b;
        try {
            if (z) {
                int iA2 = ll2Var.a(ll2Var.A());
                int iC2 = ll2Var.c();
                try {
                    vb3VarA = vb3.a(ll2.h(new InflaterInputStream(new hi(giVar, ll2Var), inflater, iC2 < 0 ? 4096 : Math.min(iC2, 4096)), 4096));
                    inflater.reset();
                    if (ll2Var.c() != 0) {
                        throw new xm2("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    ll2Var.b(iA2);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                inflater.setInput(ll2Var.z());
                try {
                    vb3VarA = vb3.a(ll2.h(new hi(giVar, 2), 4096));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            giVar.close();
            return new dc3(vb3VarA, sb3VarZ);
        } catch (Throwable th3) {
            try {
                giVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
