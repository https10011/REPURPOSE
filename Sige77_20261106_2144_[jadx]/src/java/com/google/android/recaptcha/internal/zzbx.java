package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.cp;
import defpackage.e00;
import defpackage.g93;
import defpackage.lt0;
import defpackage.ws0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzbx {
    public static final e00 zza(Task task) {
        final cp cpVarA = g93.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            public final void onComplete(Task task2) {
                ws0 ws0Var = cpVarA;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((cp) ws0Var).V(exception);
                } else if (task2.isCanceled()) {
                    ((lt0) ws0Var).cancel(null);
                } else {
                    ((cp) ws0Var).D(task2.getResult());
                }
            }
        });
        return new zzbw(cpVarA);
    }
}
