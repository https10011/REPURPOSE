package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class no1 extends oo1 implements Iterator, fs, KMappedMarker {
    public int a;
    public Object b;
    public fs c;

    @Override // defpackage.oo1
    public final void a(Object obj, mj1 mj1Var) {
        this.b = obj;
        this.a = 3;
        this.c = mj1Var;
        ft ftVar = ft.a;
    }

    public final RuntimeException b() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    @Override // defpackage.fs
    public final CoroutineContext getContext() {
        return g.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.a;
            if (i != 0) {
                break;
            }
            this.a = 5;
            fs fsVar = this.c;
            fsVar.getClass();
            this.c = null;
            Unit unit = Unit.a;
            pj1 pj1Var = rj1.b;
            fsVar.resumeWith(unit);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            uq1.a();
            return null;
        }
        if (i == 2) {
            this.a = 1;
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.fs
    public final void resumeWith(Object obj) {
        zi0.B(obj);
        this.a = 4;
    }
}
