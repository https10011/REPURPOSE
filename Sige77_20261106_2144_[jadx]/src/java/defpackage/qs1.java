package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qs1 implements Iterable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public qs1(jf3 jf3Var, List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ei eiVar = (ei) obj;
                ri2 ri2Var = (ri2) eiVar.e;
                ri2Var.getClass();
                return new ps1(ri2Var, eiVar, (String) obj2);
            default:
                return new vk2(((List) obj2).iterator(), ((List) obj).iterator());
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                qv2 qv2Var = new qv2(", ", 3);
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                qv2Var.a(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public qs1(ei eiVar, String str) {
        this.c = eiVar;
        this.b = str;
    }
}
