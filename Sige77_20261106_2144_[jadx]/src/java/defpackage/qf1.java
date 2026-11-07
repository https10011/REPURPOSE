package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qf1 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((rf1) ((Observable) this).mObservers.get(size)).a;
            recyclerView.i((String) null);
            recyclerView.Q0.f = true;
            recyclerView.T(true);
            if (!recyclerView.d.y()) {
                recyclerView.requestLayout();
            }
        }
    }
}
