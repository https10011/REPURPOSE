package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gr0 implements cv1 {
    public final Context a;

    public gr0(Context context) {
        gu2.o(context);
        Context applicationContext = context.getApplicationContext();
        gu2.o(applicationContext);
        this.a = applicationContext;
    }

    @Override // defpackage.cv1
    public Object get() {
        Object obj = y93.j;
        return new nb3(new u83(this.a, null, z73.a, f7.g, oj0.c));
    }

    public /* synthetic */ gr0(boolean z, Context context) {
        this.a = context;
    }
}
