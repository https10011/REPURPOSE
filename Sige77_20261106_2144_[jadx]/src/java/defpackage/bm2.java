package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class bm2 implements Cloneable {
    public final dm2 a;
    public dm2 b;

    public bm2(dm2 dm2Var) {
        this.a = dm2Var;
        if (dm2Var.g()) {
            e.g("Default instance must be immutable.");
            throw null;
        }
        this.b = dm2Var.i();
    }

    public static void c(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void d() {
        if (this.b.g()) {
            return;
        }
        dm2 dm2VarI = this.a.i();
        un2.c.a(dm2VarI.getClass()).b(dm2VarI, this.b);
        this.b = dm2VarI;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final bm2 clone() {
        bm2 bm2Var = (bm2) this.a.s(5);
        boolean zG = this.b.g();
        dm2 dm2Var = this.b;
        if (zG) {
            dm2Var.getClass();
            un2.c.a(dm2Var.getClass()).f(dm2Var);
            dm2Var.h();
            dm2Var = this.b;
        }
        bm2Var.b = dm2Var;
        return bm2Var;
    }

    public final dm2 g() {
        boolean zG = this.b.g();
        dm2 dm2Var = this.b;
        if (zG) {
            dm2Var.getClass();
            un2.c.a(dm2Var.getClass()).f(dm2Var);
            dm2Var.h();
            dm2Var = this.b;
        }
        dm2Var.getClass();
        if (dm2.q(dm2Var, true)) {
            return dm2Var;
        }
        throw new eo2();
    }

    public final void h(dm2 dm2Var) {
        dm2 dm2Var2 = this.a;
        if (dm2Var2.equals(dm2Var)) {
            return;
        }
        if (!this.b.g()) {
            dm2 dm2VarI = dm2Var2.i();
            un2.c.a(dm2VarI.getClass()).b(dm2VarI, this.b);
            this.b = dm2VarI;
        }
        dm2 dm2Var3 = this.b;
        un2.c.a(dm2Var3.getClass()).b(dm2Var3, dm2Var);
    }

    public final void i(byte[] bArr, int i, vl2 vl2Var) throws xm2 {
        if (!this.b.g()) {
            dm2 dm2VarI = this.a.i();
            un2.c.a(dm2VarI.getClass()).b(dm2VarI, this.b);
            this.b = dm2VarI;
        }
        try {
            un2.c.a(this.b.getClass()).h(this.b, bArr, 0, i, new zk2(vl2Var));
        } catch (xm2 e) {
            throw e;
        } catch (IOException e2) {
            sm0.m("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            tv2.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
