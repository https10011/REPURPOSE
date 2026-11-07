package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class pj0 {
    public final Context a;
    public final String b;
    public final gk1 c;
    public final yd2 d;
    public final f7 e;
    public final j7 f;
    public final Looper g;
    public final int h;
    public final ug2 i;
    public final r41 j;
    public final uj0 k;

    public pj0(Context context, Activity activity, yd2 yd2Var, f7 f7Var, oj0 oj0Var) {
        gu2.p(context, "Null context is not permitted.");
        gu2.p(yd2Var, "Api must not be null.");
        gu2.p(oj0Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        gu2.p(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String strB = (i < 30 || i < 30) ? null : s2.b(context);
        this.b = strB;
        this.c = i >= 31 ? new gk1(context.getAttributionSource(), 4) : null;
        this.d = yd2Var;
        this.e = f7Var;
        this.g = oj0Var.b;
        j7 j7Var = new j7(yd2Var, f7Var, strB);
        this.f = j7Var;
        this.i = new ug2(this);
        uj0 uj0VarE = uj0.e(applicationContext);
        this.k = uj0VarE;
        this.h = uj0VarE.h.getAndIncrement();
        this.j = oj0Var.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            tw0 fragment = pw0.getFragment(activity);
            mg2 mg2Var = (mg2) fragment.b(mg2.class, "ConnectionlessLifecycleHelper");
            if (mg2Var == null) {
                Object obj = qj0.d;
                mg2Var = new mg2(fragment, uj0VarE);
            }
            mg2Var.e.add(j7Var);
            uj0VarE.f(mg2Var);
        }
        th2 th2Var = uj0VarE.n;
        th2Var.sendMessage(th2Var.obtainMessage(7, this));
    }

    public final ac2 a() {
        ac2 ac2Var = new ac2(13);
        Set set = Collections.EMPTY_SET;
        if (((ob) ac2Var.b) == null) {
            ac2Var.b = new ob(0);
        }
        ((ob) ac2Var.b).addAll(set);
        Context context = this.a;
        ac2Var.c = context.getClass().getName();
        ac2Var.d = context.getPackageName();
        return ac2Var;
    }

    public final Task b(int i, ei eiVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        uj0 uj0Var = this.k;
        uj0Var.getClass();
        uj0Var.c(taskCompletionSource, eiVar.b, this);
        zg2 zg2Var = new zg2(new kh2(i, eiVar, taskCompletionSource, this.j), uj0Var.i.get(), this);
        th2 th2Var = uj0Var.n;
        th2Var.sendMessage(th2Var.obtainMessage(4, zg2Var));
        return taskCompletionSource.getTask();
    }
}
