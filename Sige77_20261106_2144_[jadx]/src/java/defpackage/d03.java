package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d03 extends dj2 {
    public final IBinder g;
    public final /* synthetic */ jf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d03(jf jfVar, int i, IBinder iBinder, Bundle bundle) {
        super(jfVar, i, bundle);
        this.h = jfVar;
        this.g = iBinder;
    }

    @Override // defpackage.dj2
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            gu2.o(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            jf jfVar = this.h;
            if (!jfVar.m().equals(interfaceDescriptor)) {
                String strM = jfVar.m();
                StringBuilder sb = new StringBuilder(strM.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strM);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceB = jfVar.b(iBinder);
            if (iInterfaceB == null || !(jfVar.t(2, 4, iInterfaceB) || jfVar.t(3, 4, iInterfaceB))) {
                return false;
            }
            jfVar.u = null;
            ff ffVar = jfVar.o;
            if (ffVar == null) {
                return true;
            }
            ffVar.e();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.dj2
    public final void b(ConnectionResult connectionResult) {
        gf gfVar = this.h.p;
        if (gfVar != null) {
            gfVar.a(connectionResult);
        }
        System.currentTimeMillis();
    }
}
