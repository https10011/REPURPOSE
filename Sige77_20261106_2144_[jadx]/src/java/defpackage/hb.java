package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class hb extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((rr1) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((ao2) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((rr1) obj).clear();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((ao2) obj).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((rr1) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 != value) {
                    return obj3 != null && obj3.equals(value);
                }
                return true;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((ao2) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 != value2) {
                    return obj4 != null && obj4.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new kb((mb) obj);
            case 1:
                return new fo0((go0) obj);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new tr1((rr1) obj);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new tr1((ao2) obj);
            default:
                return new rb(this, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((rr1) obj2).remove(entry.getKey());
                return true;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((ao2) obj2).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((mb) obj).c;
            case 1:
                return ((go0) obj).b;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return ((rr1) obj).size();
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((ao2) obj).size();
            default:
                return ((wr3) obj).e;
        }
    }
}
