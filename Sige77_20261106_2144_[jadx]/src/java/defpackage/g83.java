package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g83 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ w93 w;

    public g83(w93 w93Var, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bundle;
        this.f = z;
        this.i = z2;
        this.v = z3;
        this.w = w93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.N(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v);
    }
}
