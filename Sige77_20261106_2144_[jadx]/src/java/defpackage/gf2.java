package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteFullException;
import android.os.Process;
import android.util.Log;
import com.transsion.athena.data.TrackData;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gf2 {
    public static volatile gf2 b;
    public Context a;

    public void a(oc2 oc2Var) {
        String stackTraceString;
        long usableSpace;
        int i = qd2.a;
        if (i == 0) {
            cc2.a("trackException tid not configure or e is null");
            return;
        }
        String str = oc2Var.a;
        if (str.contains("addJSON") || str.contains("updateEvents") || str.contains("cleanupEvents")) {
            return;
        }
        TrackData trackData = new TrackData();
        trackData.a(1, 1, "count");
        trackData.b(0, "eid", str);
        trackData.a(Process.myPid(), 2, "pid");
        trackData.c("extra", 2, oc2Var.b);
        Throwable cause = oc2Var.getCause();
        if (cause == null) {
            stackTraceString = null;
        } else if (cause instanceof SQLiteFullException) {
            stackTraceString = cause.getClass().getName();
        } else {
            stackTraceString = cause.getCause() != null ? Log.getStackTraceString(cause.getCause()) : Log.getStackTraceString(cause);
            if (stackTraceString.length() > 2048) {
                stackTraceString = stackTraceString.substring(0, 2048);
            }
        }
        trackData.e("stackTrace", stackTraceString);
        if (str.contains("sql")) {
            try {
                usableSpace = this.a.getFilesDir().getUsableSpace();
            } catch (Exception e) {
                e.printStackTrace();
                usableSpace = 0;
            }
            trackData.d("usableSpace", usableSpace);
        }
        long j = i;
        hc.g(j).i("ev_athena", trackData, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cw b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        cw cwVar = new cw();
        cwVar.a = t20.a(x91.a);
        qq0 qq0Var = new qq0(context);
        cwVar.b = qq0Var;
        cwVar.c = t20.a(new yd2(5, qq0Var, new ri2(qq0Var)));
        qq0 qq0Var2 = cwVar.b;
        cwVar.d = new y70(qq0Var2, 1);
        int i = 6;
        yd1 yd1VarA = t20.a(new vf3(i, cwVar.d, t20.a(new y70(qq0Var2, 0)), 0 == true ? 1 : 0));
        cwVar.e = yd1VarA;
        int i2 = 9;
        op0 op0Var = new op0(i2);
        qq0 qq0Var3 = cwVar.b;
        p11 p11Var = new p11(qq0Var3, yd1VarA, op0Var, i);
        yd1 yd1Var = cwVar.a;
        yd1 yd1Var2 = cwVar.c;
        co coVar = new co();
        coVar.a = yd1Var;
        coVar.b = yd1Var2;
        coVar.c = p11Var;
        coVar.d = yd1VarA;
        coVar.e = yd1VarA;
        qq qqVar = new qq();
        qqVar.a = qq0Var3;
        qqVar.b = yd1Var2;
        qqVar.c = yd1VarA;
        qqVar.d = p11Var;
        qqVar.e = yd1Var;
        qqVar.f = yd1VarA;
        qqVar.i = yd1VarA;
        cwVar.f = t20.a(new p11(coVar, qqVar, new ud2(yd1Var, yd1VarA, p11Var, yd1VarA), i2));
        return cwVar;
    }
}
