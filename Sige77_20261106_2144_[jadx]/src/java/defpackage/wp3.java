package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wp3 extends pq3 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp3(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // defpackage.pq3
    public void a(Iterator it, lr3 lr3Var) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.a;
                    if (!zHasNext) {
                        lr3Var.a(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        lr3Var.a(sb.toString(), str);
                    }
                }
                break;
            default:
                super.a(it, lr3Var);
                break;
        }
    }

    @Override // defpackage.pq3
    public void b(Object obj, lr3 lr3Var) {
        switch (this.f) {
            case 1:
                ek2 ek2Var = (ek2) obj;
                if (ek2Var != null) {
                    ck2 ck2Var = ek2Var.a.c;
                    ck2Var.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < ck2Var.b() - ck2Var.a())) {
                            break;
                        } else if (i >= ck2Var.b() - ck2Var.a()) {
                            uq1.a();
                            break;
                        } else {
                            dk2 dk2Var = ck2Var.b;
                            int iA = ck2Var.a() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) dk2Var.a[iA];
                            if (((Set) entry.getValue()).isEmpty()) {
                                lr3Var.a(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    lr3Var.a(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.b(obj, lr3Var);
                break;
        }
    }
}
