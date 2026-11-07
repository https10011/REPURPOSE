package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r50 extends d50 {
    public final WeakReference a;

    public r50(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.d50
    public final void a() {
        s50.a((EditText) this.a.get(), 1);
    }
}
