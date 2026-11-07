package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.TrackDataWrapper;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wb2 implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wb2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jd2 jd2Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yb2 yb2Var = (yb2) obj;
                yb2Var.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                yb2Var.a().post(new mb2(this, iBinder));
                break;
            default:
                hc hcVar = (hc) obj;
                try {
                    int i2 = jc.a;
                    if (iBinder == null) {
                        jd2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.transsion.athena.IAthenaTrackInterface");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jd2)) {
                            cd2 cd2Var = new cd2();
                            cd2Var.a = iBinder;
                            jd2Var = cd2Var;
                        } else {
                            jd2Var = (jd2) iInterfaceQueryLocalInterface;
                        }
                    }
                    hcVar.c = jd2Var;
                    CopyOnWriteArrayList<TrackDataWrapper> copyOnWriteArrayList = (CopyOnWriteArrayList) hcVar.d;
                    hcVar.a = true;
                    cc2.e("AthenaTrackService onServiceConnected");
                    for (TrackDataWrapper trackDataWrapper : copyOnWriteArrayList) {
                        if (trackDataWrapper.b.f() < 524288) {
                            String str = trackDataWrapper.a;
                            if (str == null) {
                                str = BuildConfig.FLAVOR;
                            }
                            hcVar.c(str, trackDataWrapper.b, trackDataWrapper.c);
                        } else {
                            cc2.c("TrackData size is too large, ignored !!");
                        }
                    }
                    copyOnWriteArrayList.clear();
                } catch (Exception e) {
                    cc2.c(Log.getStackTraceString(e));
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                yb2 yb2Var = (yb2) obj;
                yb2Var.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                yb2Var.a().post(new sb2(this, i2));
                break;
            default:
                ((hc) obj).a = false;
                cc2.e("AthenaTrackService onServiceDisconnected");
                break;
        }
    }
}
