package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbf;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ru2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final zzbf g;

    public ru2(y53 y53Var, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        zzbf zzbfVar;
        gu2.l(str2);
        gu2.l(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.w.b(c33.M(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.a("Param name can't be null");
                    it.remove();
                } else {
                    qf3 qf3Var = y53Var.w;
                    y53.j(qf3Var);
                    Object objN = qf3Var.N(bundle2.get(next), next);
                    if (objN == null) {
                        c33 c33Var3 = y53Var.f;
                        y53.l(c33Var3);
                        c33Var3.w.b(y53Var.W.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        qf3 qf3Var2 = y53Var.w;
                        y53.j(qf3Var2);
                        qf3Var2.V(bundle2, next, objN);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.g = zzbfVar;
    }

    public final ru2 a(y53 y53Var, long j) {
        return new ru2(y53Var, this.c, this.a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String string = this.g.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        ts.r(sb, "Event{appId='", str, "', name='", str2);
        return y00.l(sb, "', params=", string, "}");
    }

    public ru2(y53 y53Var, String str, String str2, String str3, long j, long j2, long j3, zzbf zzbfVar) {
        gu2.l(str2);
        gu2.l(str3);
        gu2.o(zzbfVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.w.c(c33.M(str2), c33.M(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = zzbfVar;
    }
}
