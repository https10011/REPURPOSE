package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cj0 extends ContextWrapper {
    public static final xh0 k = new xh0();
    public final v01 a;
    public final bk0 b;
    public final vi c;
    public final w40 d;
    public final List e;
    public final mb f;
    public final s60 g;
    public final kj0 h;
    public final int i;
    public ki1 j;

    public cj0(Context context, v01 v01Var, ir1 ir1Var, vi viVar, w40 w40Var, mb mbVar, List list, s60 s60Var, kj0 kj0Var) {
        super(context.getApplicationContext());
        this.a = v01Var;
        this.c = viVar;
        this.d = w40Var;
        this.e = list;
        this.f = mbVar;
        this.g = s60Var;
        this.h = kj0Var;
        this.i = 4;
        this.b = new bk0(ir1Var);
    }

    public final fh1 a() {
        return (fh1) this.b.get();
    }
}
