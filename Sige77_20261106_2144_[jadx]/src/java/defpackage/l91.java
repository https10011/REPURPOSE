package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class l91 implements g81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MenuItem b;

    public /* synthetic */ l91(int i, MenuItem menuItem) {
        this.a = i;
        this.b = menuItem;
    }

    @Override // defpackage.g81
    public final void a(Object obj) {
        int i = this.a;
        MenuItem menuItem = this.b;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                menuItem.setEnabled(bool != null ? bool.booleanValue() : false);
                break;
            default:
                menuItem.setEnabled(bool != null ? bool.booleanValue() : false);
                break;
        }
    }
}
