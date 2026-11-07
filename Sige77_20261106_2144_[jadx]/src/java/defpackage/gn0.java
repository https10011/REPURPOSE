package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class gn0 extends Binder implements hn0 {
    public static hn0 a(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof hn0)) {
            return (hn0) iInterfaceQueryLocalInterface;
        }
        fn0 fn0Var = new fn0();
        fn0Var.a = iBinder;
        return fn0Var;
    }
}
