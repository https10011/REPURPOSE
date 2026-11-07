package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t33 extends BroadcastReceiver {
    public final if3 a;
    public boolean b;
    public boolean c;

    public t33(if3 if3Var) {
        gu2.o(if3Var);
        this.a = if3Var;
    }

    public final void a() {
        if3 if3Var = this.a;
        if3Var.l0();
        if3Var.e().D();
        if3Var.e().D();
        if (this.b) {
            if3Var.d().a0.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                if3Var.Y.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                if3Var.d().f.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if3 if3Var = this.a;
        if3Var.l0();
        String action = intent.getAction();
        if3Var.d().a0.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            if3Var.d().w.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        o33 o33Var = if3Var.b;
        if3.T(o33Var);
        boolean zI = o33Var.I();
        if (this.c != zI) {
            this.c = zI;
            if3Var.e().N(new aj2(this, zI));
        }
    }
}
