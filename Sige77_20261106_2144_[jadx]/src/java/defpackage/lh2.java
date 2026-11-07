package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lh2 extends ph2 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ tw0 b;

    public lh2(Intent intent, tw0 tw0Var) {
        this.a = intent;
        this.b = tw0Var;
    }

    @Override // defpackage.ph2
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
