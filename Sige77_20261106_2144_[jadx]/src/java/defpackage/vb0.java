package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vb0 implements Iterator, KMappedMarker {
    public final Iterator a;
    public int b = -1;
    public Object c;
    public final /* synthetic */ wb0 d;

    public vb0(wb0 wb0Var) {
        this.d = wb0Var;
        this.a = new kz1((wb0) wb0Var.b);
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                this.b = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((ws) this.d.c).invoke(next)).booleanValue());
        this.c = next;
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            uq1.a();
            return null;
        }
        Object obj = this.c;
        this.c = null;
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
