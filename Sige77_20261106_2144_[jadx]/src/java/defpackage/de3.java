package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class de3 extends ne3 {
    public final AlarmManager d;
    public jd3 e;
    public Integer f;

    public de3(if3 if3Var) {
        super(if3Var);
        this.d = (AlarmManager) ((y53) this.a).a.getSystemService("alarm");
    }

    @Override // defpackage.ne3
    public final void H() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = ((y53) this.a).a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), nw2.a));
        }
        K();
    }

    public final fu2 I() {
        if (this.e == null) {
            this.e = new jd3(this, this.b.Y, 1);
        }
        return this.e;
    }

    public final void J() {
        F();
        y53 y53Var = (y53) this.a;
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        c33Var.a0.a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = y53Var.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), nw2.a));
        }
        I().c();
        K();
    }

    public final void K() {
        JobScheduler jobScheduler = (JobScheduler) ((y53) this.a).a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(L());
        }
    }

    public final int L() {
        if (this.f == null) {
            this.f = Integer.valueOf("measurement".concat(String.valueOf(((y53) this.a).a.getPackageName())).hashCode());
        }
        return this.f.intValue();
    }
}
