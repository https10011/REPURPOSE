package defpackage;

import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nb3 {
    public final u83 a;

    public nb3(u83 u83Var) {
        this.a = u83Var;
    }

    public static z b(Task task) {
        h93 h93Var = new h93();
        h93Var.v = task;
        k93 k93Var = new k93(h93Var);
        t10 t10Var = t10.a;
        task.addOnCompleteListener(t10Var, k93Var);
        return dh0.a(h93Var, i7.class, kb3.b, t10Var);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final z a(nl1 nl1Var) throws Throwable {
        String string;
        u83 u83Var = this.a;
        String simpleName = b93.class.getSimpleName();
        Looper looper = u83Var.g;
        gu2.p(looper, "Looper must not be null");
        bk0 bk0Var = new bk0();
        bk0Var.a = new ll0(looper);
        gu2.l(simpleName);
        bk0Var.b = new yy0(nl1Var, simpleName);
        String strH = dw0.h();
        if (strH == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strH.length() + 1;
            int iIdentityHashCode = System.identityHashCode(b93.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(strH);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        u23 u23Var = new u23(u83Var, string, bk0Var, 2);
        c11 c11Var = c11.b0;
        nx0 nx0Var = new nx0();
        nx0Var.d = bk0Var;
        nx0Var.a = u23Var;
        nx0Var.c = c11Var;
        nx0Var.e = new Feature[]{yv2.l};
        nx0Var.b = false;
        yy0 yy0Var = (yy0) ((bk0) nx0Var.d).b;
        gu2.p(yy0Var, "Key must not be null");
        bk0 bk0Var2 = (bk0) nx0Var.d;
        ?? r4 = (Feature[]) nx0Var.e;
        boolean z = nx0Var.b;
        nd2 nd2Var = new nd2();
        nd2Var.d = nx0Var;
        nd2Var.b = bk0Var2;
        nd2Var.c = r4;
        nd2Var.a = z;
        gk1 gk1Var = new gk1(21, nx0Var, yy0Var);
        gu2.p((yy0) bk0Var2.b, "Listener has already been released.");
        uj0 uj0Var = u83Var.k;
        uj0Var.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        uj0Var.c(taskCompletionSource, 0, u83Var);
        zg2 zg2Var = new zg2(new ih2(new ah2(nd2Var, gk1Var), taskCompletionSource), uj0Var.i.get(), u83Var);
        th2 th2Var = uj0Var.n;
        th2Var.sendMessage(th2Var.obtainMessage(8, zg2Var));
        return b(taskCompletionSource.getTask());
    }
}
