package defpackage;

import android.view.View;
import androidx.fragment.app.c;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zc0 implements sg0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // defpackage.sg0
    public final void e(c cVar) {
        if (!this.b && this.a.add(cVar)) {
            View decorView = cVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new yc0(this, decorView));
        }
    }
}
