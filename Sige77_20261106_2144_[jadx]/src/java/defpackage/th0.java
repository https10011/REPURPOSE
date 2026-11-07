package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.internal.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class th0 implements Iterator, KMappedMarker {
    public Object a;
    public int b = -2;
    public final /* synthetic */ wb0 c;

    public th0(wb0 wb0Var) {
        this.c = wb0Var;
    }

    public final void a() {
        Object objInvoke;
        int i = this.b;
        wb0 wb0Var = this.c;
        if (i == -2) {
            objInvoke = ((bq) wb0Var.b).invoke();
        } else {
            a aVar = wb0Var.c;
            Object obj = this.a;
            obj.getClass();
            objInvoke = aVar.invoke(obj);
        }
        this.a = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < 0) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b < 0) {
            a();
        }
        if (this.b == 0) {
            uq1.a();
            return null;
        }
        Object obj = this.a;
        obj.getClass();
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
