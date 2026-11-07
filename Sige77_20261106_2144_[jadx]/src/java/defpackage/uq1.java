package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.firebase.datatransport.TransportRegistrar;
import io.jsonwebtoken.security.WeakKeyException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class uq1 implements bx1, nq, ef2 {
    public static final uq1 b = new uq1(3);
    public static final uq1 c = new uq1(4);
    public static final uq1 d = new uq1(5);
    public static final uq1 e = new uq1(6);
    public static final uq1 f = new uq1(7);
    public final /* synthetic */ int a;

    public /* synthetic */ uq1(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void b(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void c(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, int i2, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        throw new WeakKeyException("The " + obj + obj2 + i + ((Object) " bits which is not secure enough for the ") + obj3 + obj4 + obj5 + ((Object) " MUST have a size >= ") + i2 + obj6 + obj7 + obj8 + obj9 + obj10 + obj11 + obj12);
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void n() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void o(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void p() throws vm2 {
        throw new vm2();
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.nq
    public Object d(co coVar) {
        switch (this.a) {
            case 9:
                return TransportRegistrar.c(coVar);
            case 10:
                return TransportRegistrar.b(coVar);
            default:
                return TransportRegistrar.a(coVar);
        }
    }

    @Override // defpackage.ef2
    public void f(Object obj) {
        int i = 0;
        switch (this.a) {
            case 23:
                SparseArray sparseArray = (SparseArray) obj;
                ArrayList arrayList = new ArrayList(sparseArray.size());
                while (i < sparseArray.size()) {
                    arrayList.add((pd2) sparseArray.valueAt(i));
                    i++;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((f91) ld2.f().a.b).c;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(arrayList);
                break;
            case 24:
                Bundle bundle = new Bundle();
                bundle.putString("v", (String) obj);
                gf2.b.a(new oc2("cleanupEvents_oom", bundle));
                break;
            case 25:
                String str = (String) obj;
                Bundle bundle2 = new Bundle();
                bundle2.putString("v", str);
                gf2.b.a(new oc2("cleanupEvents_off", bundle2));
                cc2.f("handleTidChange cleanupList : %s", str);
                break;
            default:
                SparseArray sparseArray2 = (SparseArray) obj;
                while (i < sparseArray2.size()) {
                    df2 df2Var = (df2) sparseArray2.valueAt(i);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("appid", df2Var.a);
                    bundle3.putString("date", df2Var.b);
                    bundle3.putInt("count", df2Var.c);
                    bundle3.putInt("packet", df2Var.d);
                    ic icVar = new ic("day_up_record", 9999);
                    icVar.d(bundle3);
                    icVar.c();
                    int i2 = qd2.a;
                    if (i2 > 0) {
                        ic icVar2 = new ic("day_up_record", i2);
                        icVar2.d(bundle3);
                        icVar2.c();
                    }
                    i++;
                }
                break;
        }
    }
}
