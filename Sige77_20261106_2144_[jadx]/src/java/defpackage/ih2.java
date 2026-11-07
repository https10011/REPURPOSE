package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ih2 extends xg2 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ih2(yy0 yy0Var, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = yy0Var;
    }

    @Override // defpackage.mh2
    public final void a(Status status) {
        this.b.trySetException(new i7(status));
    }

    @Override // defpackage.mh2
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // defpackage.mh2
    public final /* bridge */ /* synthetic */ void c(md2 md2Var, boolean z) {
        int i = this.c;
    }

    @Override // defpackage.mh2
    public final void d(rg2 rg2Var) throws DeadObjectException {
        try {
            k(rg2Var);
        } catch (DeadObjectException e) {
            a(mh2.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(mh2.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    @Override // defpackage.xg2
    public final Feature[] f(rg2 rg2Var) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (Feature[]) ((ah2) obj).a.c;
            default:
                ah2 ah2Var = (ah2) rg2Var.f.get((yy0) obj);
                if (ah2Var == null) {
                    return null;
                }
                return (Feature[]) ah2Var.a.c;
        }
    }

    @Override // defpackage.xg2
    public final boolean g(rg2 rg2Var) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((ah2) obj).a.a;
            default:
                ah2 ah2Var = (ah2) rg2Var.f.get((yy0) obj);
                return ah2Var != null && ah2Var.a.a;
        }
    }

    @Override // defpackage.xg2
    public final int h(rg2 rg2Var) {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return ((ah2) rg2Var.f.get((yy0) this.d)) != null ? 0 : -1;
        }
    }

    public final void k(rg2 rg2Var) {
        switch (this.c) {
            case 0:
                ah2 ah2Var = (ah2) this.d;
                nd2 nd2Var = ah2Var.a;
                ((u23) ((nx0) nd2Var.d).a).accept(rg2Var.b, this.b);
                yy0 yy0Var = (yy0) ((bk0) nd2Var.b).b;
                if (yy0Var != null) {
                    rg2Var.f.put(yy0Var, ah2Var);
                }
                break;
            default:
                ah2 ah2Var2 = (ah2) rg2Var.f.remove((yy0) this.d);
                if (ah2Var2 == null) {
                    this.b.trySetResult(Boolean.FALSE);
                } else {
                    ((c11) ((nx0) ah2Var2.b.b).c).accept(rg2Var.b, this.b);
                    ((bk0) ah2Var2.a.b).b = null;
                }
                break;
        }
    }

    public ih2(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ih2(ah2 ah2Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = ah2Var;
    }

    private final /* bridge */ /* synthetic */ void i(md2 md2Var, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(md2 md2Var, boolean z) {
    }
}
