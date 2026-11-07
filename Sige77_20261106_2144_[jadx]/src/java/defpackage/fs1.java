package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fs1 implements nw, mw {
    public final hy a;
    public final jy b;
    public volatile int c;
    public volatile gw d;
    public volatile Object e;
    public volatile d51 f;
    public volatile hw i;

    public fs1(hy hyVar, jy jyVar) {
        this.a = hyVar;
        this.b = jyVar;
    }

    @Override // defpackage.mw
    public final void a(hv0 hv0Var, Exception exc, lw lwVar, int i) {
        this.b.a(hv0Var, exc, lwVar, this.f.c.j());
    }

    @Override // defpackage.mw
    public final void b(hv0 hv0Var, Object obj, lw lwVar, int i, hv0 hv0Var2) {
        this.b.b(hv0Var, obj, lwVar, this.f.c.j(), hv0Var);
    }

    public final boolean c(Object obj) throws Throwable {
        Throwable th;
        int i = e01.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            vw vwVarG = this.a.c.a().g(obj);
            Object objV = vwVarG.v();
            g60 g60VarD = this.a.d(objV);
            ac2 ac2Var = new ac2(g60VarD, objV, this.a.i, 16);
            hv0 hv0Var = this.f.a;
            hy hyVar = this.a;
            hw hwVar = new hw(hv0Var, hyVar.n);
            w10 w10VarA = hyVar.h.a();
            w10VarA.a(hwVar, ac2Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + hwVar + ", data: " + obj + ", encoder: " + g60VarD + ", duration: " + e01.a(jElapsedRealtimeNanos));
            }
            if (w10VarA.d(hwVar) != null) {
                this.i = hwVar;
                this.d = new gw(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.h();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.i + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.b.b(this.f.a, vwVarG.v(), this.f.c, this.f.c.j(), this.f.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f.c.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.nw
    public final void cancel() {
        d51 d51Var = this.f;
        if (d51Var != null) {
            d51Var.c.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // defpackage.nw
    public final boolean d() {
        boolean z;
        if (this.e == null) {
            if (this.d != null) {
            }
            this.d = null;
            this.f = null;
            z = false;
            while (!z) {
                ArrayList arrayListB = this.a.b();
                int i = this.c;
                this.c = i + 1;
                this.f = (d51) arrayListB.get(i);
                if (this.f == null) {
                }
            }
            return z;
        }
        Object obj = this.e;
        this.e = null;
        try {
            if (c(obj)) {
                if (this.d != null || !this.d.d()) {
                    this.d = null;
                    this.f = null;
                    z = false;
                    while (!z && this.c < this.a.b().size()) {
                        ArrayList arrayListB2 = this.a.b();
                        int i2 = this.c;
                        this.c = i2 + 1;
                        this.f = (d51) arrayListB2.get(i2);
                        if (this.f == null && (this.a.p.a(this.f.c.j()) || this.a.c(this.f.c.a()) != null)) {
                            d51 d51Var = this.f;
                            lw lwVar = this.f.c;
                            vc1 vc1Var = this.a.o;
                            nl1 nl1Var = new nl1();
                            nl1Var.a = this;
                            nl1Var.b = d51Var;
                            lwVar.i(vc1Var, nl1Var);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }
}
