package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.hjq.toast.BuildConfig;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class b0 extends vd0 implements Runnable {
    public static final /* synthetic */ int Y = 0;
    public Class W;
    public Object X;
    public ListenableFuture w;

    public b0(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.w = listenableFuture;
        this.W = cls;
        this.X = obj;
    }

    @Override // defpackage.v0
    public final void c() {
        ListenableFuture listenableFuture = this.w;
        if ((listenableFuture != null) & (this.a instanceof g0)) {
            listenableFuture.cancel(p());
        }
        this.w = null;
        this.W = null;
        this.X = null;
    }

    @Override // defpackage.v0
    public final String j() {
        String string;
        ListenableFuture listenableFuture = this.w;
        Class cls = this.W;
        Object obj = this.X;
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
        if (cls == null || obj == null) {
            if (strJ != null) {
                return strJ.length() != 0 ? string.concat(strJ) : new String(string);
            }
            return null;
        }
        String strValueOf2 = String.valueOf(cls);
        String strValueOf3 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf3.length() + strValueOf2.length() + string.length() + 29);
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(strValueOf2);
        sb2.append("], fallback=[");
        return ts.l(sb2, strValueOf3, "]");
    }

    public abstract Object q(Object obj, Throwable th);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        Object objB;
        ListenableFuture listenableFuture = this.w;
        Class cls = this.W;
        Object obj = this.X;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.a instanceof g0)) {
            return;
        }
        this.w = null;
        try {
            th = listenableFuture instanceof v0 ? ((v0) listenableFuture).o() : null;
            objB = th == null ? dh0.b(listenableFuture) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 35);
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            l(objB);
            return;
        }
        if (!cls.isInstance(th)) {
            n(listenableFuture);
            return;
        }
        try {
            Object objQ = q(obj, th);
            this.W = null;
            this.X = null;
            r(objQ);
        } catch (Throwable th2) {
            try {
                m(th2);
            } finally {
                this.W = null;
                this.X = null;
            }
        }
    }
}
