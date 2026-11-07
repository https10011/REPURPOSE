package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ri0 {
    public final gt1 a;
    public final Handler b;
    public final ArrayList c;
    public final ii1 d;
    public final mh e;
    public boolean f;
    public boolean g;
    public bi1 h;
    public pi0 i;
    public boolean j;
    public pi0 k;
    public Bitmap l;
    public pi0 m;
    public int n;
    public int o;
    public int p;

    public ri0(a aVar, gt1 gt1Var, int i, int i2, Bitmap bitmap) {
        mh mhVar = aVar.a;
        cj0 cj0Var = aVar.c;
        Context baseContext = cj0Var.getBaseContext();
        am2.p(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ii1 ii1VarB = a.a(baseContext).e.b(baseContext);
        Context baseContext2 = cj0Var.getBaseContext();
        am2.p(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ii1 ii1VarB2 = a.a(baseContext2).e.b(baseContext2);
        ii1VarB2.getClass();
        bi1 bi1VarZ = new bi1(ii1VarB2.a, ii1VarB2, Bitmap.class, ii1VarB2.b).c(ii1.X).c(((ki1) ((ki1) ((ki1) new ki1().g(x10.b)).x()).t()).m(i, i2));
        this.c = new ArrayList();
        this.d = ii1VarB;
        Handler handler = new Handler(Looper.getMainLooper(), new qi0(this, 0));
        this.e = mhVar;
        this.b = handler;
        this.h = bi1VarZ;
        this.a = gt1Var;
        c(s22.b, bitmap);
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        pi0 pi0Var = this.m;
        if (pi0Var != null) {
            this.m = null;
            b(pi0Var);
            return;
        }
        this.g = true;
        gt1 gt1Var = this.a;
        si0 si0Var = gt1Var.l;
        int i3 = si0Var.c;
        if (i3 <= 0 || (i2 = gt1Var.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((oi0) si0Var.e.get(i2)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i4 = (gt1Var.k + 1) % gt1Var.l.c;
        gt1Var.k = i4;
        this.k = new pi0(this.b, i4, jUptimeMillis);
        bi1 bi1VarD = this.h.c((ki1) new ki1().r(new y71(Double.valueOf(Math.random())))).D(gt1Var);
        bi1VarD.C(this.k, bi1VarD);
    }

    public final void b(pi0 pi0Var) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, pi0Var).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = pi0Var;
            return;
        }
        if (pi0Var.i != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.c(bitmap);
                this.l = null;
            }
            pi0 pi0Var2 = this.i;
            this.i = pi0Var;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                li0 li0Var = (li0) arrayList.get(size);
                Object callback = li0Var.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    li0Var.stop();
                    li0Var.invalidateSelf();
                } else {
                    li0Var.invalidateSelf();
                    ri0 ri0Var = (ri0) li0Var.a.b;
                    pi0 pi0Var3 = ri0Var.i;
                    if ((pi0Var3 != null ? pi0Var3.e : -1) == ri0Var.a.l.c - 1) {
                        li0Var.f++;
                    }
                    int i = li0Var.i;
                    if (i != -1 && li0Var.f >= i) {
                        li0Var.stop();
                    }
                }
            }
            if (pi0Var2 != null) {
                handler.obtainMessage(2, pi0Var2).sendToTarget();
            }
        }
        a();
    }

    public final void c(fz1 fz1Var, Bitmap bitmap) {
        am2.p(fz1Var, "Argument must not be null");
        am2.p(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.c(new ki1().u(fz1Var, true));
        this.n = d42.j(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
