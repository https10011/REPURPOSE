package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class dj2 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ jf c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ jf f;

    public dj2(jf jfVar, int i, Bundle bundle) {
        this.f = jfVar;
        Boolean bool = Boolean.TRUE;
        this.c = jfVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ConnectionResult connectionResult);
}
