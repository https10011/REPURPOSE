package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zab;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class qj0 extends rj0 {
    public static final Object d = new Object();
    public static final qj0 e = new qj0();
    public jr0 c;

    public static AlertDialog e(Activity activity, int i, ph2 ph2Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(gh2.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(2131886173);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(2131886170);
        } else {
            string = resources.getString(2131886180);
        }
        if (string != null) {
            builder.setPositiveButton(string, ph2Var);
        }
        String strA = gh2.a(activity, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", ck1.r(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void i(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof c) {
                e supportFragmentManager = ((c) activity).getSupportFragmentManager();
                hv1 hv1Var = new hv1();
                gu2.p(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                hv1Var.a1 = alertDialog;
                if (onCancelListener != null) {
                    hv1Var.b1 = onCancelListener;
                }
                hv1Var.R(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        j70 j70Var = new j70();
        gu2.p(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        j70Var.a = alertDialog;
        if (onCancelListener != null) {
            j70Var.b = onCancelListener;
        }
        j70Var.show(fragmentManager, str);
    }

    @Override // defpackage.rj0
    public final int b(Context context) {
        return c(context, rj0.a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, new jh2(super.a(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        i(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Activity activity, tw0 tw0Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new lh2(super.a(i, activity, "d"), tw0Var), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        i(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", ts.g(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new ch2(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? gh2.e(context, "common_google_play_services_resolution_required_title") : gh2.a(context, i);
        if (strE == null) {
            strE = context.getResources().getString(2131886177);
        }
        String strD = (i == 6 || i == 19) ? gh2.d(context, "common_google_play_services_resolution_required_text", gh2.c(context)) : gh2.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        gu2.o(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        m71 m71Var = new m71(context, null);
        m71Var.m = true;
        m71Var.c(true);
        m71Var.e = m71.b(strE);
        l71 l71Var = new l71();
        l71Var.b = m71.b(strD);
        m71Var.e(l71Var);
        PackageManager packageManager = context.getPackageManager();
        if (gb2.i == null) {
            gb2.i = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = gb2.i.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            m71Var.s.icon = i3;
            m71Var.j = 2;
            if (gb2.u(context)) {
                m71Var.b.add(new i71(resources.getString(2131886186), pendingIntent));
            } else {
                m71Var.g = pendingIntent;
            }
        } else {
            m71Var.s.icon = R.drawable.stat_sys_warning;
            m71Var.s.tickerText = m71.b(resources.getString(2131886177));
            m71Var.s.when = System.currentTimeMillis();
            m71Var.g = pendingIntent;
            m71Var.f = m71.b(strD);
        }
        if (nj2.H()) {
            if (!nj2.H()) {
                uq1.n();
                return;
            }
            synchronized (d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(2131886176);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(z20.f(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            m71Var.q = "com.google.android.gms.availability";
        }
        Notification notificationA = m71Var.a();
        if (i == 1 || i == 2 || i == 3) {
            xj0.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    public final void h(Context context, ConnectionResult connectionResult, boolean z) {
        Integer num = connectionResult.e;
        int iIntValue = num == null ? -1 : num.intValue();
        zab zabVar = new zab(iIntValue, connectionResult.b, System.currentTimeMillis(), context.getPackageName(), z);
        if (this.c == null) {
            this.c = new jr0(context, null, jr0.m, f7.g, oj0.c);
        }
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        ei eiVarB = ei.b();
        eiVarB.e = new Feature[]{zi0.d};
        eiVarB.c = false;
        eiVarB.d = new ri2(zabVar);
        jr0Var.b(2, eiVarB.a());
    }
}
