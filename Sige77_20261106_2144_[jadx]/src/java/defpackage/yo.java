package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yo extends z5 {
    public static final Logger b0 = Logger.getLogger(yo.class.getName());
    public wn0 Y;
    public final boolean Z;
    public xo a0;

    public yo(wn0 wn0Var, boolean z) {
        int size = wn0Var.size();
        this.v = null;
        this.w = size;
        this.Y = wn0Var;
        this.Z = z;
    }

    @Override // defpackage.v0
    public final void c() {
        wn0 wn0Var = this.Y;
        this.Y = null;
        this.a0 = null;
        if ((this.a instanceof g0) && (wn0Var != null)) {
            boolean zP = p();
            bs0 it = wn0Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zP);
            }
        }
    }

    @Override // defpackage.v0
    public final void i() {
        xo xoVar = this.a0;
        if (xoVar != null) {
            xoVar.c();
        }
    }

    @Override // defpackage.v0
    public final String j() {
        wn0 wn0Var = this.Y;
        if (wn0Var == null) {
            return super.j();
        }
        String strValueOf = String.valueOf(wn0Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
        sb.append("futures=");
        sb.append(strValueOf);
        return sb.toString();
    }

    public final void q(wn0 wn0Var) {
        int iO = z5.W.o(this);
        yv2.o("Less than 0 remaining futures", iO >= 0);
        if (iO == 0) {
            if (wn0Var != null) {
                bs0 it = wn0Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            dh0.b(future);
                        } catch (ExecutionException e) {
                            r(e.getCause());
                        } catch (Throwable th) {
                            r(th);
                        }
                    }
                }
            }
            this.v = null;
            xo xoVar = this.a0;
            if (xoVar != null) {
                try {
                    xoVar.c.execute(xoVar);
                } catch (RejectedExecutionException e2) {
                    xoVar.d.m(e2);
                }
            }
            this.Y = null;
        }
    }

    public final void r(Throwable th) {
        th.getClass();
        if (this.Z && !m(th)) {
            Set set = this.v;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.a instanceof g0)) {
                    Throwable thO = o();
                    Objects.requireNonNull(thO);
                    while (thO != null && setNewSetFromMap.add(thO)) {
                        thO = thO.getCause();
                    }
                }
                z5.W.j(this, setNewSetFromMap);
                set = this.v;
                Objects.requireNonNull(set);
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    b0.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            b0.log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.Y);
        if (this.Y.isEmpty()) {
            xo xoVar = this.a0;
            if (xoVar != null) {
                try {
                    xoVar.c.execute(xoVar);
                    return;
                } catch (RejectedExecutionException e) {
                    xoVar.d.m(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.Z;
        t10 t10Var = t10.a;
        if (!z) {
            x4 x4Var = new x4(3, this, (Object) null);
            bs0 it = this.Y.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).a(x4Var, t10Var);
            }
            return;
        }
        bs0 it2 = this.Y.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.a(new x4(this, listenableFuture, i), t10Var);
            i++;
        }
    }
}
