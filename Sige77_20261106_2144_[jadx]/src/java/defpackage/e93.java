package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e93 extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ mp1 c;
    public final /* synthetic */ ri2 d;
    public final /* synthetic */ Executor e;

    public e93(AtomicBoolean atomicBoolean, Context context, mp1 mp1Var, ri2 ri2Var, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = mp1Var;
        this.d = ri2Var;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            mp1 mp1Var = this.c;
            ri2 ri2Var = this.d;
            Executor executor = this.e;
            h02 h02Var = new h02();
            h02Var.w = new g02(h02Var, ri2Var);
            executor.execute(h02Var);
            mp1Var.n(h02Var);
        }
    }
}
