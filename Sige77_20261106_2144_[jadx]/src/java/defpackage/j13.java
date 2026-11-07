package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j13 extends dj2 {
    public final /* synthetic */ jf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j13(jf jfVar, int i, Bundle bundle) {
        super(jfVar, i, bundle);
        this.g = jfVar;
    }

    @Override // defpackage.dj2
    public final boolean a() {
        this.g.j.c(ConnectionResult.f);
        return true;
    }

    @Override // defpackage.dj2
    public final void b(ConnectionResult connectionResult) {
        jf jfVar = this.g;
        jfVar.getClass();
        jfVar.j.c(connectionResult);
        System.currentTimeMillis();
    }
}
