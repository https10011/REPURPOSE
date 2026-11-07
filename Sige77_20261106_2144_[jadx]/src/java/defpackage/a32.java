package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a32 extends d32 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public a32(Method method, int i) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.d32
    public final Object a(Class cls) {
        String strA = ir1.a(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        e.b("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
