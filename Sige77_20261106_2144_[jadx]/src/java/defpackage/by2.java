package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class by2 extends pg2 {
    public jf b;
    public final int c;

    public by2(jf jfVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
        this.b = jfVar;
        this.c = i;
    }

    @Override // defpackage.pg2
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) xv2.a(parcel, Bundle.CREATOR);
            xv2.c(parcel);
            gu2.p(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            jf jfVar = this.b;
            int i3 = this.c;
            jfVar.getClass();
            d03 d03Var = new d03(jfVar, i2, strongBinder, bundle);
            mu2 mu2Var = jfVar.f;
            mu2Var.sendMessage(mu2Var.obtainMessage(1, i3, -1, d03Var));
            this.b = null;
        } else if (i == 2) {
            parcel.readInt();
            xv2.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVarA = xv2.a(parcel, zzj.CREATOR);
            xv2.c(parcel);
            jf jfVar2 = this.b;
            gu2.p(jfVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            gu2.o(zzjVarA);
            jfVar2.w = zzjVarA;
            if (jfVar2.s()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVarA.d;
                gk1 gk1VarQ = gk1.q();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a;
                synchronized (gk1VarQ) {
                    try {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = gk1.d;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) gk1VarQ.b;
                            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.a < rootTelemetryConfiguration.a) {
                            }
                        }
                        gk1VarQ.b = rootTelemetryConfiguration;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = zzjVarA.a;
            gu2.p(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            jf jfVar3 = this.b;
            int i5 = this.c;
            jfVar3.getClass();
            d03 d03Var2 = new d03(jfVar3, i4, strongBinder2, bundle2);
            mu2 mu2Var2 = jfVar3.f;
            mu2Var2.sendMessage(mu2Var2.obtainMessage(1, i5, -1, d03Var2));
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
