package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class uc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ uc0(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task taskForException;
        int i;
        int i2 = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (i2) {
            case 0:
                if (firebaseMessaging.e.f() && firebaseMessaging.h(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.g(0L);
                        }
                        break;
                    }
                    return;
                }
                return;
            default:
                final Context context = firebaseMessaging.b;
                d42.y(context);
                qp0 qp0Var = firebaseMessaging.c;
                final boolean zF = firebaseMessaging.f();
                if (Build.VERSION.SDK_INT >= 29) {
                    SharedPreferences sharedPreferencesK = ea.k(context);
                    if (!sharedPreferencesK.contains("proxy_retention") || sharedPreferencesK.getBoolean("proxy_retention", false) != zF) {
                        mk1 mk1Var = (mk1) qp0Var.c;
                        if (mk1Var.c.d() >= 241100000) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("proxy_retention", zF);
                            ll3 ll3VarA = ll3.a(mk1Var.b);
                            synchronized (ll3VarA) {
                                i = ll3VarA.a;
                                ll3VarA.a = i + 1;
                            }
                            taskForException = ll3VarA.b(new xg3(i, 4, bundle, 0));
                        } else {
                            taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                        }
                        taskForException.addOnSuccessListener(new w21(), new OnSuccessListener() { // from class: ae1
                            public final void onSuccess(Object obj) {
                                SharedPreferences.Editor editorEdit = ea.k(context).edit();
                                editorEdit.putBoolean("proxy_retention", zF);
                                editorEdit.apply();
                            }
                        });
                    }
                }
                if (firebaseMessaging.f()) {
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
