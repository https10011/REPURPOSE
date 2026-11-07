package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gw1 implements x62 {
    public final WeakReference a;
    public int b;
    public int c;

    public gw1(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    public final void a(int i, float f) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            boolean z = true;
            if (i2 == 2 && this.b != 1) {
                z = false;
            }
            if (i2 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.c(i, f, z, z, false);
        }
    }
}
