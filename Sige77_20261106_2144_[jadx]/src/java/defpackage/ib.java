package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ib implements Iterator, KMutableIterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ib(mb mbVar, int i) {
        this(mbVar.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = mbVar;
                this(mbVar.c);
                break;
            default:
                this.e = mbVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            uq1.a();
            return null;
        }
        int i = this.b;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                objF = ((mb) obj).f(i);
                break;
            case 1:
                objF = ((mb) obj).j(i);
                break;
            default:
                objF = ((ob) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            uq1.q("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((mb) obj).h(i);
                break;
            case 1:
                ((mb) obj).h(i);
                break;
            default:
                ((ob) obj).a(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ib(ob obVar) {
        this(obVar.c);
        this.d = 2;
        this.e = obVar;
    }

    public ib(int i) {
        this.a = i;
    }
}
