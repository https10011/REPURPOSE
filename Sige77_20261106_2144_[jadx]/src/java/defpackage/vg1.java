package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vg1 extends ug1 {
    public final v71 b;

    public vg1(v71 v71Var, wg1 wg1Var) {
        super(wg1Var);
        this.b = v71Var;
    }

    @Override // defpackage.ug1
    public final Object d() {
        return this.b.e();
    }

    @Override // defpackage.ug1
    public final void f(Object obj, au0 au0Var, tg1 tg1Var) throws IllegalAccessException {
        Field field = tg1Var.b;
        Object objB = tg1Var.f.b(au0Var);
        if (objB == null && tg1Var.g) {
            return;
        }
        if (tg1Var.h) {
            throw new wt0("Cannot set value of 'static final' ".concat(rg1.d(field, false)), 4);
        }
        field.set(obj, objB);
    }

    @Override // defpackage.ug1
    public final Object e(Object obj) {
        return obj;
    }
}
