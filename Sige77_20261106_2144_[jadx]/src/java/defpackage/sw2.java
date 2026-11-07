package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sw2 extends pw2 {
    public final /* synthetic */ uw2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw2(uw2 uw2Var) {
        super(2);
        this.i = uw2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.i.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uk2
    public final bs0 g() {
        return m().listIterator(0);
    }

    @Override // defpackage.pw2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return rq0.F(this.i.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    @Override // defpackage.pw2
    public final kw2 o() {
        return new rw2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i.d.size();
    }
}
