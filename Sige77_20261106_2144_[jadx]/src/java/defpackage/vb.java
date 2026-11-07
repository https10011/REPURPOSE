package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vb implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ArrayIteratorKt.iterator((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new by0(this);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                no1 no1Var = new no1();
                no1Var.c = sr0.a(no1Var, no1Var, (ht0) obj);
                return no1Var;
            default:
                return (Iterator) obj;
        }
    }
}
