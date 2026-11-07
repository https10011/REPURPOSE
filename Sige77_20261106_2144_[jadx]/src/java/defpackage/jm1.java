package defpackage;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jm1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ jm1(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.s();
                break;
            default:
                yu yuVar = searchView.E0;
                if (yuVar instanceof yu1) {
                    yuVar.b(null);
                }
                break;
        }
    }
}
