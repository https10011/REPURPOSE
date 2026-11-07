package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ c5(String str, long j, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                if (e5.g == null) {
                    e5.g = new wf3(Long.valueOf(j), null);
                }
                wf3 wf3Var = e5.g;
                if (wf3Var != null) {
                    wf3Var.d = Long.valueOf(j);
                }
                int i2 = 1;
                if (e5.f.get() <= 0) {
                    c5 c5Var = new c5(str, j, i2);
                    synchronized (e5.e) {
                        ScheduledExecutorService scheduledExecutorService = e5.b;
                        ja0 ja0VarB = ma0.b(i90.b());
                        e5.d = scheduledExecutorService.schedule(c5Var, ja0VarB == null ? 60 : ja0VarB.b, TimeUnit.SECONDS);
                        Unit unit = Unit.a;
                    }
                }
                long j2 = e5.j;
                long j3 = j2 > 0 ? (j - j2) / 1000 : 0L;
                ox1 ox1Var = ie.a;
                Context contextA = i90.a();
                ja0 ja0VarK = ma0.k(i90.b(), false);
                if (ja0VarK != null && ja0VarK.d && j3 > 0) {
                    pa paVar = new pa(contextA, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", str);
                    double d = j3;
                    if (x32.c() && !mt.a.contains(paVar)) {
                        try {
                            pa.f(paVar, "fb_aa_time_spent_on_view", Double.valueOf(d), bundle, false, e5.b());
                        } catch (Throwable th) {
                            mt.a(paVar, th);
                        }
                    }
                    break;
                }
                wf3 wf3Var2 = e5.g;
                if (wf3Var2 != null) {
                    wf3Var2.c();
                    return;
                }
                return;
            default:
                if (e5.g == null) {
                    e5.g = new wf3(Long.valueOf(j), null);
                }
                if (e5.f.get() <= 0) {
                    gp1.n(str, e5.g, e5.i);
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(i90.a()).edit();
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    editorEdit.apply();
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(i90.a()).edit();
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    editorEdit2.apply();
                    e5.g = null;
                }
                synchronized (e5.e) {
                    e5.d = null;
                    Unit unit2 = Unit.a;
                }
                return;
        }
    }
}
