package defpackage;

import java.io.FileOutputStream;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qb0 extends cb0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, gs gsVar) {
        pb0 pb0Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (gsVar instanceof pb0) {
            pb0Var = (pb0) gsVar;
            int i = pb0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pb0Var.e = i - Integer.MIN_VALUE;
            } else {
                pb0Var = new pb0(this, gsVar);
            }
        } else {
            pb0Var = new pb0(this, gsVar);
        }
        Object obj2 = pb0Var.c;
        Unit unit = ft.a;
        int i2 = pb0Var.e;
        if (i2 == 0) {
            zi0.B(obj2);
            if (this.b.get()) {
                uq1.q("This scope has already been closed.");
                return null;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
            try {
                ii iiVar = new ii(fileOutputStream3);
                pb0Var.a = fileOutputStream3;
                pb0Var.b = fileOutputStream3;
                pb0Var.e = 1;
                if (nk1.l(obj, iiVar) == unit) {
                    return unit;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = pb0Var.b;
            fileOutputStream = pb0Var.a;
            try {
                zi0.B(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    nj2.q(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        Unit unit2 = Unit.a;
        nj2.q(fileOutputStream, null);
        return Unit.a;
    }
}
