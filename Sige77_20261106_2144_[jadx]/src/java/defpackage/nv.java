package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nv implements ServiceConnection {
    public Context a;

    public abstract void a(ComponentName componentName, yd2 yd2Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        xm0 xm0Var;
        if (this.a == null) {
            uq1.q("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = wm0.a;
        if (iBinder == null) {
            xm0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xm0)) {
                vm0 vm0Var = new vm0();
                vm0Var.a = iBinder;
                xm0Var = vm0Var;
            } else {
                xm0Var = (xm0) iInterfaceQueryLocalInterface;
            }
        }
        a(componentName, new yd2(2, xm0Var, componentName));
    }
}
