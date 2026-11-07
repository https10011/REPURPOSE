package defpackage;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jk implements kk {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ jk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kk
    public final void a(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                ((n20) obj).a();
                break;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + qt.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((n20) obj) + ']';
        }
    }
}
