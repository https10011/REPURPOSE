package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vk2 implements Iterator {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public final Iterator c;

    public vk2(lm2 lm2Var, Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b.hasNext()) {
                    return true;
                }
                return this.c.hasNext();
            default:
                return this.b.hasNext() || this.c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.c;
        Iterator it2 = this.b;
        switch (i) {
            case 0:
                if (it2.hasNext()) {
                    return new vt2(((Integer) it2.next()).toString());
                }
                if (it.hasNext()) {
                    return new vt2((String) it.next());
                }
                uq1.a();
                return null;
            default:
                return it2.hasNext() ? it2.next() : it.next();
        }
    }

    public vk2(Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }
}
