package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z22 extends d32 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public z22(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.d32
    public final Object a(Class cls) {
        String strA = ir1.a(cls);
        if (strA == null) {
            return this.b.invoke(this.c, cls);
        }
        e.b("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
