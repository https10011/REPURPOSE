package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yi2 extends bw2 {
    public final y53 a;
    public final w93 b;

    public yi2(y53 y53Var) {
        gu2.o(y53Var);
        this.a = y53Var;
        w93 w93Var = y53Var.Z;
        y53.k(w93Var);
        this.b = w93Var;
    }

    @Override // defpackage.z93
    public final void b(String str, String str2, Bundle bundle) {
        this.b.I(str, str2, bundle);
    }

    @Override // defpackage.z93
    public final void c(String str, String str2, Bundle bundle) {
        w93 w93Var = this.a.Z;
        y53.k(w93Var);
        w93Var.S(str, str2, bundle);
    }

    @Override // defpackage.z93
    public final List d(String str, String str2) {
        w93 w93Var = this.b;
        y53 y53Var = (y53) w93Var.a;
        t53 t53Var = y53Var.i;
        c33 c33Var = y53Var.f;
        y53.l(t53Var);
        if (t53Var.K()) {
            y53.l(c33Var);
            c33Var.f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (nk1.n()) {
            y53.l(c33Var);
            c33Var.f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        t53 t53Var2 = y53Var.i;
        y53.l(t53Var2);
        t53Var2.O(atomicReference, 5000L, "get conditional user properties", new yk(w93Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return qf3.y0(list);
        }
        y53.l(c33Var);
        c33Var.f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.z93
    public final void e(Bundle bundle) {
        w93 w93Var = this.b;
        ((y53) w93Var.a).X.getClass();
        w93Var.R(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.z93
    public final int f(String str) {
        w93 w93Var = this.b;
        w93Var.getClass();
        gu2.l(str);
        ((y53) w93Var.a).getClass();
        return 25;
    }

    @Override // defpackage.z93
    public final void g(String str) {
        y53 y53Var = this.a;
        xx2 xx2Var = y53Var.a0;
        y53.i(xx2Var);
        y53Var.X.getClass();
        xx2Var.G(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.z93
    public final Map h(String str, String str2, boolean z) {
        w93 w93Var = this.b;
        y53 y53Var = (y53) w93Var.a;
        t53 t53Var = y53Var.i;
        c33 c33Var = y53Var.f;
        y53.l(t53Var);
        if (t53Var.K()) {
            y53.l(c33Var);
            c33Var.f.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (nk1.n()) {
            y53.l(c33Var);
            c33Var.f.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        t53 t53Var2 = y53Var.i;
        y53.l(t53Var2);
        t53Var2.O(atomicReference, 5000L, "get user properties", new d83(w93Var, atomicReference, str, str2, z));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            y53.l(c33Var);
            c33Var.f.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        mb mbVar = new mb(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                mbVar.put(zzplVar.b, objZza);
            }
        }
        return mbVar;
    }

    @Override // defpackage.z93
    public final void i(String str) {
        y53 y53Var = this.a;
        xx2 xx2Var = y53Var.a0;
        y53.i(xx2Var);
        y53Var.X.getClass();
        xx2Var.F(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.z93
    public final String zzh() {
        ua3 ua3Var = ((y53) this.b.a).Y;
        y53.k(ua3Var);
        ja3 ja3Var = ua3Var.c;
        if (ja3Var != null) {
            return ja3Var.a;
        }
        return null;
    }

    @Override // defpackage.z93
    public final String zzi() {
        ua3 ua3Var = ((y53) this.b.a).Y;
        y53.k(ua3Var);
        ja3 ja3Var = ua3Var.c;
        if (ja3Var != null) {
            return ja3Var.b;
        }
        return null;
    }

    @Override // defpackage.z93
    public final String zzj() {
        return (String) this.b.i.get();
    }

    @Override // defpackage.z93
    public final String zzk() {
        return this.b.T();
    }

    @Override // defpackage.z93
    public final long zzl() {
        qf3 qf3Var = this.a.w;
        y53.j(qf3Var);
        return qf3Var.C0();
    }
}
