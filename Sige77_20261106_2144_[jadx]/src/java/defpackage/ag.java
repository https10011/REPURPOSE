package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ag implements OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg b;
    public final /* synthetic */ Task c;

    public /* synthetic */ ag(yg ygVar, Task task, int i) {
        this.a = i;
        this.b = ygVar;
        this.c = task;
    }

    public final void onComplete(Task task) {
        int i = this.a;
        Task task2 = this.c;
        yg ygVar = this.b;
        switch (i) {
            case 0:
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ygVar.w(((ki0) task2.getResult()).a);
                break;
            case 1:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ygVar.w(((ki0) task2.getResult()).a);
                break;
            default:
                int i4 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ygVar.w(((ki0) task2.getResult()).a);
                break;
        }
    }
}
