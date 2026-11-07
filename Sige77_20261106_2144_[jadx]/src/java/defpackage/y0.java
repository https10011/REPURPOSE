package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class y0 implements Iterator, KMappedMarker {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;

    public y0(p30 p30Var) {
        this.c = p30Var.a.iterator();
        this.b = p30Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return this.b < ((b1) obj).a();
            default:
                Iterator it = (Iterator) obj;
                while (this.b > 0 && it.hasNext()) {
                    it.next();
                    this.b--;
                }
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    uq1.a();
                    return null;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                return ((b1) obj).get(i2);
            default:
                Iterator it = (Iterator) obj;
                while (this.b > 0 && it.hasNext()) {
                    it.next();
                    this.b--;
                }
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y0(b1 b1Var) {
        this.c = b1Var;
    }
}
