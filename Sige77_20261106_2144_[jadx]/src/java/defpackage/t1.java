package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.hjq.toast.BuildConfig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class t1 extends vd0 implements Runnable {
    public static final /* synthetic */ int X = 0;
    public Object W;
    public ListenableFuture w;

    public t1(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.w = listenableFuture;
        obj.getClass();
        this.W = obj;
    }

    @Override // defpackage.v0
    public final void c() {
        ListenableFuture listenableFuture = this.w;
        if ((listenableFuture != null) & (this.a instanceof g0)) {
            listenableFuture.cancel(p());
        }
        this.w = null;
        this.W = null;
    }

    @Override // defpackage.v0
    public final String j() {
        String string;
        ListenableFuture listenableFuture = this.w;
        Object obj = this.W;
        String strJ = super.j();
        if (listenableFuture != null) {
            String strValueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = BuildConfig.FLAVOR;
        }
        if (obj == null) {
            if (strJ != null) {
                return strJ.length() != 0 ? string.concat(strJ) : new String(string);
            }
            return null;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + string.length() + 11);
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf2);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.w;
        Object obj = this.W;
        if (((this.a instanceof g0) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.w = null;
        if (listenableFuture.isCancelled()) {
            n(listenableFuture);
            return;
        }
        try {
            try {
                Object objQ = q(obj, dh0.b(listenableFuture));
                this.W = null;
                r(objQ);
            } catch (Throwable th) {
                try {
                    m(th);
                } finally {
                    this.W = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            m(e2);
        } catch (ExecutionException e3) {
            m(e3.getCause());
        }
    }
}
