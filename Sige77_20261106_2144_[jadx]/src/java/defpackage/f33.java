package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f33 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public f33(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static f33 a(zzbh zzbhVar) {
        String str = zzbhVar.a;
        String str2 = zzbhVar.c;
        return new f33(zzbhVar.d, zzbhVar.e, zzbhVar.b.U(), str, str2);
    }

    public final zzbh b() {
        zzbf zzbfVar = new zzbf(new Bundle(this.e));
        return new zzbh(this.a, zzbfVar, this.b, this.c, this.d);
    }

    public final String toString() {
        String string = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        ts.r(sb, "origin=", str, ",name=", str2);
        return ts.l(sb, ",params=", string);
    }
}
