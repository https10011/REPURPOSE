package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fa3 extends k13 {
    public JobScheduler c;

    @Override // defpackage.k13
    public final boolean H() {
        return true;
    }

    public final void I(long j) {
        y53 y53Var = (y53) this.a;
        F();
        D();
        JobScheduler jobScheduler = this.c;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(y53Var.a.getPackageName())).hashCode()) != null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.a0.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iJ = J();
        if (iJ != 2) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.a0.b(ck1.y(iJ), "[sgtm] Not eligible for Scion upload");
            return;
        }
        c33 c33Var3 = y53Var.f;
        y53.l(c33Var3);
        c33Var3.a0.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(y53Var.a.getPackageName())).hashCode(), new ComponentName(y53Var.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.c;
        gu2.o(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        c33 c33Var4 = y53Var.f;
        y53.l(c33Var4);
        c33Var4.a0.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int J() {
        y53 y53Var = (y53) this.a;
        F();
        D();
        if (this.c == null) {
            return 7;
        }
        Boolean boolR = y53Var.d.R("google_analytics_sgtm_upload_enabled");
        if (!(boolR == null ? false : boolR.booleanValue())) {
            return 8;
        }
        if (y53Var.q().W < 119000) {
            return 6;
        }
        if (qf3.Z(y53Var.a)) {
            return !y53Var.o().L() ? 5 : 2;
        }
        return 3;
    }
}
