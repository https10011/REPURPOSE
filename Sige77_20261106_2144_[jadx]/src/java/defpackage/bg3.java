package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class bg3 implements bc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ bg3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.bc
    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                gg3 gg3Var = (gg3) this.b;
                return ((nb3) gg3Var.d.get()).a(new nl1(gg3Var, (mg3) this.c));
            case 1:
                List list = (List) this.b;
                dl3 dl3Var = (dl3) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw y00.i(it);
                }
                nj3 nj3Var = new nj3(this, arrayList, size);
                int i = to3.a;
                int i2 = 4;
                bg3 bg3Var = new bg3(i2, vm3.a(), nj3Var);
                t10 t10Var = t10.a;
                return dh0.g(dh0.f(dh0.g(dh0.e(dl3Var.a.e.n()), new bg3(i2, vm3.a(), new bg3(3, dl3Var, bg3Var)), t10Var), new zg0(), t10Var), new bg3(i2, vm3.a(), new nj3(this, size, arrayList)), t10Var);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                rk3 rk3Var = (rk3) this.b;
                r1 r1Var = (r1) this.c;
                rk3Var.c((Uri) dh0.b(rk3Var.b), obj);
                synchronized (rk3Var.h) {
                    rk3Var.j = r1Var;
                    break;
                }
                return dh0.d(obj);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((dl3) this.b).a.c.a((bg3) this.c, t10.a);
            default:
                bo3 bo3Var = (bo3) this.b;
                zn3 zn3VarC = vm3.c();
                bo3 bo3VarB = vm3.b(zn3VarC, bo3Var);
                try {
                    ListenableFuture listenableFutureApply = ((bc) this.c).apply(obj);
                    if (listenableFutureApply == null) {
                        throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                    }
                    vm3.b(zn3VarC, bo3VarB);
                    return listenableFutureApply;
                } catch (Throwable th) {
                    try {
                        pm3.a(th);
                        throw th;
                    } catch (Throwable th2) {
                        vm3.b(zn3VarC, bo3VarB);
                        throw th2;
                    }
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                bc bcVar = (bc) this.c;
                StringBuilder sb = new StringBuilder(bcVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(bcVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
