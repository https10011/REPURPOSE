package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b32 extends d32 {
    public final /* synthetic */ Method b;

    public b32(Method method) {
        this.b = method;
    }

    @Override // defpackage.d32
    public final Object a(Class cls) {
        String strA = ir1.a(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        e.b("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
