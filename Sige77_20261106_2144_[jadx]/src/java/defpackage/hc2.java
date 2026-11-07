package defpackage;

import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hc2 {
    public static hc2 g;
    public final boolean a;
    public final uc2 b;
    public final Application d;
    public jc2 e;
    public boolean c = true;
    public final i4 f = new i4(this, 21);

    public hc2(Context context) {
        boolean zBooleanValue = ue2.j.a().booleanValue();
        this.a = zBooleanValue;
        if (!zBooleanValue) {
            if (g93.i) {
                g93.b("clipBoardEnabled = false", new Object[0]);
            }
        } else {
            this.b = new uc2(context);
            Application application = (Application) context.getApplicationContext();
            this.d = application;
            jc2 jc2Var = new jc2(this);
            this.e = jc2Var;
            application.registerActivityLifecycleCallbacks(jc2Var);
        }
    }

    public final void a(String str) {
        if (this.a && this.c) {
            if (g93.i) {
                g93.b("%s release", str);
            }
            uc2 uc2Var = this.b;
            DelayQueue delayQueue = uc2Var.c;
            if (uc2Var.a) {
                delayQueue.offer(new lc2(0L, false));
                delayQueue.offer(new lc2(800L, true));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public final h01 b(boolean z) {
        ClipData clipDataA;
        jc2 jc2Var;
        int i;
        lc2 lc2Var;
        if (!this.a) {
            return null;
        }
        uc2 uc2Var = this.b;
        if (z) {
            DelayQueue delayQueue = uc2Var.c;
            boolean z2 = uc2Var.a;
            if (uc2Var.b == null) {
                clipDataA = null;
            } else {
                if (z2) {
                    clipDataA = uc2Var.a();
                    i = 2;
                } else {
                    clipDataA = null;
                    i = 1;
                }
                while (clipDataA == null) {
                    try {
                        lc2Var = (lc2) delayQueue.poll(1000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        lc2Var = null;
                    }
                    ClipData clipDataA2 = uc2Var.a();
                    i++;
                    if (lc2Var == null || !lc2Var.b) {
                        if (z2 || i < 3) {
                            clipDataA = clipDataA2;
                        }
                    } else if (clipDataA2 == null && g93.i) {
                        g93.g("疑似应用处于后台不可见状态下调用init，并且接着调用其它api，数据大概率丢失，请检查代码", new Object[0]);
                    }
                    clipDataA = clipDataA2;
                    break;
                }
                delayQueue.clear();
            }
        } else if (uc2Var.b == null) {
            clipDataA = null;
        } else {
            clipDataA = uc2Var.a();
        }
        h01 h01VarA = h01.a(clipDataA);
        if (h01VarA != null) {
            if (g93.i) {
                g93.b("data type is %d", Integer.valueOf(h01VarA.c));
            }
            Application application = this.d;
            if (application != null && (jc2Var = this.e) != null) {
                application.unregisterActivityLifecycleCallbacks(jc2Var);
                this.e = null;
            }
        } else if (g93.i) {
            g93.b("data is null", new Object[0]);
        }
        return h01VarA;
    }

    public final void c(String str) {
        if (this.a && this.c) {
            if (g93.i) {
                g93.b("%s access", str);
            }
            uc2 uc2Var = this.b;
            if (uc2Var.a) {
                uc2Var.c.offer(new lc2(0L, false));
            }
        }
    }
}
