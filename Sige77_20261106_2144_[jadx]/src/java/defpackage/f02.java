package defpackage;

import android.content.Context;
import com.hjq.toast.BuildConfig;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f02 {
    public static volatile cw e;
    public final hn a;
    public final hn b;
    public final tz c;
    public final ue2 d;

    public f02(hn hnVar, hn hnVar2, tz tzVar, ue2 ue2Var, ep1 ep1Var) {
        this.a = hnVar;
        this.b = hnVar2;
        this.c = tzVar;
        this.d = ue2Var;
        ((Executor) ep1Var.b).execute(new y1(ep1Var, 28));
    }

    public static f02 a() {
        cw cwVar = e;
        if (cwVar != null) {
            return (f02) cwVar.f.get();
        }
        uq1.q("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (f02.class) {
                try {
                    if (e == null) {
                        gf2 gf2Var = new gf2();
                        context.getClass();
                        gf2Var.a = context;
                        e = gf2Var.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final e02 c(sj sjVar) {
        Set setUnmodifiableSet = sjVar instanceof sj ? Collections.unmodifiableSet(sj.d) : Collections.singleton(new k60("proto"));
        ac2 ac2VarA = ge.a();
        sjVar.getClass();
        ac2VarA.d = "cct";
        String str = sjVar.a;
        String str2 = sjVar.b;
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        ac2VarA.b = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new e02(setUnmodifiableSet, ac2VarA.r(), this);
    }
}
