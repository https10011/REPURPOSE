package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wu2 extends BroadcastReceiver {
    public final WeakReference a;
    public final TaskCompletionSource b;
    public final FirebaseAuth c;
    public final /* synthetic */ ci d;

    public wu2(ci ciVar, yg ygVar, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(ciVar);
        this.d = ciVar;
        this.a = new WeakReference(ygVar);
        this.b = taskCompletionSource;
        this.c = firebaseAuth;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Activity activity = (Activity) this.a.get();
        TaskCompletionSource taskCompletionSource = this.b;
        if (activity == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            taskCompletionSource.setException(jm2.a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", (PendingIntent) null, (ConnectionResult) null)));
            ci.e(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            HashMap map = vw2.a;
            if (!intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    taskCompletionSource.setException(jm2.a(kv.m0("WEB_CONTEXT_CANCELED")));
                    ci.e(context);
                    return;
                }
                return;
            }
            gu2.i(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
            Parcelable.Creator creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
            taskCompletionSource.setException(jm2.a((Status) (byteArrayExtra != null ? sp0.f(byteArrayExtra, creator) : null)));
            ci.e(context);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            Task taskA = this.c.a(ci.d(intent));
            nl1 nl1Var = new nl1();
            nl1Var.b = taskCompletionSource;
            nl1Var.a = context;
            ci ciVar = this.d;
            Objects.requireNonNull(ciVar);
            taskA.addOnSuccessListener(nl1Var).addOnFailureListener(new hs1(ciVar, taskCompletionSource, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            ci.d(intent);
            throw null;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            ci.d(intent);
            throw null;
        }
        taskCompletionSource.setException(jm2.a(kv.m0("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
    }
}
