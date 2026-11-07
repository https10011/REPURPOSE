package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qb extends l02 {
    public static final pb c = new pb();
    public final Class a;
    public final rs0 b;

    public qb(uk0 uk0Var, l02 l02Var, Class cls) {
        this.b = new rs0(uk0Var, l02Var, cls, 2);
        this.a = cls;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        au0Var.a();
        while (au0Var.p()) {
            arrayList.add(this.b.c.b(au0Var));
        }
        au0Var.j();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        if (obj == null) {
            eu0Var.p();
            return;
        }
        eu0Var.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(eu0Var, Array.get(obj, i));
        }
        eu0Var.j();
    }
}
