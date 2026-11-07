package defpackage;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class km1 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public km1(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        View view2 = this.a;
        View.OnFocusChangeListener onFocusChangeListener = ((SearchView) view2).A0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view2, z);
        }
    }
}
