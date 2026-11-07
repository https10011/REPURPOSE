package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.zzt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nd3 {
    public static final zx2 a;
    public static final zx2 b;
    public static volatile ql2 c;
    public static final Object d;
    public static Context e;

    static {
        new zx2(b73.I("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new zx2(b73.I("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new zx2(b73.I("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new zx2(b73.I("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        a = new zx2(b73.I("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        b = new zx2(b73.I("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        d = new Object();
    }

    public static void a() {
        ql2 zj2Var;
        if (c != null) {
            return;
        }
        gu2.o(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = h40.c(e, h40.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = tk2.b;
                    if (iBinderB == null) {
                        zj2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zj2Var = iInterfaceQueryLocalInterface instanceof ql2 ? (ql2) iInterfaceQueryLocalInterface : new zj2(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                    }
                    c = zj2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ir1 b(String str, b83 b83Var, boolean z, boolean z2) {
        try {
            a();
            gu2.o(e);
            zzt zztVar = new zzt(str, b83Var, z, z2);
            try {
                ql2 ql2Var = c;
                e81 e81Var = new e81(e.getPackageManager());
                zj2 zj2Var = (zj2) ql2Var;
                Parcel parcelF = zj2Var.F();
                int i = xv2.a;
                boolean z3 = true;
                parcelF.writeInt(1);
                zztVar.writeToParcel(parcelF, 0);
                xv2.b(parcelF, e81Var);
                Parcel parcelD = zj2Var.D(parcelF, 5);
                if (parcelD.readInt() == 0) {
                    z3 = false;
                }
                parcelD.recycle();
                return z3 ? ir1.f : new qo3(new i93(z, str, b83Var));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return ir1.k("module call", e2);
            }
        } catch (d40 e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return ir1.k("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
