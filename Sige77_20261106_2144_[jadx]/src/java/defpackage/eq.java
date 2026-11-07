package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.a;
import androidx.fragment.app.c;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eq extends a {
    public final /* synthetic */ c h;

    public eq(c cVar) {
        this.h = cVar;
    }

    public final void b(int i, j5 j5Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        c cVar = this.h;
        i5 i5VarB = j5Var.b(cVar, obj);
        if (i5VarB != null) {
            new Handler(Looper.getMainLooper()).post(new j9(this, i, i5VarB, 2));
            return;
        }
        Intent intentA = j5Var.a(cVar, obj);
        if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
            intentA.setExtrasClassLoader(cVar.getClassLoader());
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            sp0.A(cVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            cVar.startActivityForResult(intentA, i, bundle);
            return;
        }
        IntentSenderRequest parcelableExtra = intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
            try {
                cVar.startIntentSenderForResult(parcelableExtra.a, i2, parcelableExtra.b, parcelableExtra.c, parcelableExtra.d, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new j9(this, i2, e, 3));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
