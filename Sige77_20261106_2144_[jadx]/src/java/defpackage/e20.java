package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e20 implements w10 {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;
    public Object e;

    public /* synthetic */ e20(if3 if3Var) {
        this.e = if3Var;
    }

    @Override // defpackage.w10
    public void a(hv0 hv0Var, ac2 ac2Var) {
        y10 y10Var;
        String strI = ((f91) this.b).i(hv0Var);
        hs1 hs1Var = (hs1) this.d;
        synchronized (hs1Var) {
            y10Var = (y10) ((HashMap) hs1Var.b).get(strI);
            if (y10Var == null) {
                z10 z10Var = (z10) hs1Var.c;
                synchronized (z10Var.a) {
                    y10Var = (y10) z10Var.a.poll();
                }
                if (y10Var == null) {
                    y10Var = new y10();
                }
                ((HashMap) hs1Var.b).put(strI, y10Var);
            }
            y10Var.b++;
        }
        y10Var.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strI + " for for Key: " + hv0Var);
            }
            try {
                d20 d20VarB = b();
                if (d20VarB.l(strI) == null) {
                    hc hcVarI = d20VarB.i(strI);
                    if (hcVarI == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strI));
                    }
                    try {
                        if (((g60) ac2Var.b).b(ac2Var.c, hcVarI.f(), (da1) ac2Var.d)) {
                            d20.a((d20) hcVarI.d, hcVarI, true);
                            hcVarI.a = true;
                        }
                        if (!hcVarI.a) {
                            try {
                                hcVarI.b();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!hcVarI.a) {
                            try {
                                hcVarI.b();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            ((hs1) this.d).m(strI);
        } catch (Throwable th2) {
            ((hs1) this.d).m(strI);
            throw th2;
        }
    }

    public synchronized d20 b() {
        try {
            if (((d20) this.e) == null) {
                this.e = d20.n((File) this.c, this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (d20) this.e;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
    public boolean c(long j, d53 d53Var) {
        a63 a63Var;
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (((ArrayList) this.d).isEmpty() || ((((d53) ((ArrayList) this.d).get(0)).A() / 1000) / 60) / 60 == ((d53Var.A() / 1000) / 60) / 60) {
            long jM = this.a + ((long) d53Var.m());
            if3 if3Var = (if3) this.e;
            if (!if3Var.e0().P(null, h13.Y0)) {
                if3Var.e0();
                if (jM < Math.max(0, ((Integer) h13.j.a(null)).intValue())) {
                    this.a = jM;
                    ((ArrayList) this.d).add(d53Var);
                    ((ArrayList) this.c).add(Long.valueOf(j));
                    a63Var = (a63) this.b;
                    if (((ArrayList) this.d).size() < Math.max(1, if3Var.e0().N(a63Var != null ? a63Var.t() : null, h13.k))) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.d).isEmpty()) {
                this.a = jM;
                ((ArrayList) this.d).add(d53Var);
                ((ArrayList) this.c).add(Long.valueOf(j));
                a63Var = (a63) this.b;
                if (((ArrayList) this.d).size() < Math.max(1, if3Var.e0().N(a63Var != null ? a63Var.t() : null, h13.k))) {
                    return true;
                }
            } else {
                if3Var.e0();
                if (jM < Math.max(0, ((Integer) h13.j.a(null)).intValue())) {
                    this.a = jM;
                    ((ArrayList) this.d).add(d53Var);
                    ((ArrayList) this.c).add(Long.valueOf(j));
                    a63Var = (a63) this.b;
                    if (((ArrayList) this.d).size() < Math.max(1, if3Var.e0().N(a63Var != null ? a63Var.t() : null, h13.k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.w10
    public File d(hv0 hv0Var) {
        String strI = ((f91) this.b).i(hv0Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strI + " for for Key: " + hv0Var);
        }
        try {
            pv2 pv2VarL = b().l(strI);
            if (pv2VarL != null) {
                return ((File[]) pv2VarL.a)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public void e() {
        h43 h43Var = (h43) this.e;
        h43Var.D();
        ((y53) h43Var.a).X.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = h43Var.I().edit();
        editorEdit.remove((String) this.c);
        editorEdit.remove((String) this.d);
        editorEdit.putLong((String) this.b, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
