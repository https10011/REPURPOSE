package defpackage;

import android.content.SharedPreferences;
import androidx.lifecycle.b;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class r91 extends l62 {
    public final SharedPreferences d;
    public final fx0 e;
    public final b f;
    public final b g;
    public final b h;
    public final b i;
    public final b j;
    public final b k;
    public final b l;
    public final b m;
    public final b n;
    public final c31 o;
    public final c31 p;

    public r91(SharedPreferences sharedPreferences, fx0 fx0Var) {
        sharedPreferences.getClass();
        fx0Var.getClass();
        this.d = sharedPreferences;
        this.e = fx0Var;
        b bVar = new b();
        this.f = bVar;
        b bVar2 = new b();
        this.g = bVar2;
        b bVar3 = new b();
        this.h = bVar3;
        b bVar4 = new b();
        this.i = bVar4;
        b bVar5 = new b();
        this.j = bVar5;
        this.k = new b();
        this.l = new b();
        this.m = new b();
        this.n = new b();
        this.o = jz1.a(bVar, new sm0(16));
        this.p = jz1.a(bVar2, new sm0(17));
        bVar.j(BuildConfig.FLAVOR);
        fs fsVar = null;
        String string = sharedPreferences.getString("key_profile_name", null);
        bVar2.j(string == null ? BuildConfig.FLAVOR : string);
        bVar3.j(BuildConfig.FLAVOR);
        bVar4.j(h91.NotSelected);
        bVar5.j(Boolean.TRUE);
        qt.o(ia.g(this), new r00(this, fsVar, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(r91 r91Var, gs gsVar) throws Throwable {
        p91 p91Var;
        if (gsVar instanceof p91) {
            p91Var = (p91) gsVar;
            int i = p91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p91Var.c = i - Integer.MIN_VALUE;
            } else {
                p91Var = new p91(r91Var, gsVar);
            }
        } else {
            p91Var = new p91(r91Var, gsVar);
        }
        Object objE = p91Var.a;
        ft ftVar = ft.a;
        int i2 = p91Var.c;
        if (i2 == 0) {
            zi0.B(objE);
            sz szVar = i20.a;
            fz fzVar = fz.c;
            fx fxVar = new fx(r91Var, (fs) null);
            p91Var.c = 1;
            objE = qt.E(fzVar, fxVar, p91Var);
            if (objE == ftVar) {
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zi0.B(objE);
        }
        objE.getClass();
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(r91 r91Var, nx0 nx0Var, gs gsVar) throws Throwable {
        q91 q91Var;
        if (gsVar instanceof q91) {
            q91Var = (q91) gsVar;
            int i = q91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q91Var.c = i - Integer.MIN_VALUE;
            } else {
                q91Var = new q91(r91Var, gsVar);
            }
        } else {
            q91Var = new q91(r91Var, gsVar);
        }
        Object objE = q91Var.a;
        ft ftVar = ft.a;
        int i2 = q91Var.c;
        if (i2 == 0) {
            zi0.B(objE);
            sz szVar = i20.a;
            fz fzVar = fz.c;
            gx gxVar = new gx(r91Var, nx0Var, (fs) null);
            q91Var.c = 1;
            objE = qt.E(fzVar, gxVar, q91Var);
            if (objE == ftVar) {
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zi0.B(objE);
        }
        objE.getClass();
        return objE;
    }
}
