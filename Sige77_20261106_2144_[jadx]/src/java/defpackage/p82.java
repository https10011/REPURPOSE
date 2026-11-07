package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p82 extends jw {
    public final /* synthetic */ int h;
    public final /* synthetic */ r82 i;

    public /* synthetic */ p82(r82 r82Var, int i) {
        this.h = i;
        this.i = r82Var;
    }

    @Override // defpackage.a72
    public final void a() {
        View view;
        int i = this.h;
        r82 r82Var = this.i;
        switch (i) {
            case 0:
                if (r82Var.o && (view = r82Var.g) != null) {
                    view.setTranslationY(0.0f);
                    r82Var.d.setTranslationY(0.0f);
                }
                r82Var.d.setVisibility(8);
                r82Var.d.setTransitioning(false);
                r82Var.s = null;
                f91 f91Var = r82Var.k;
                if (f91Var != null) {
                    f91Var.f(r82Var.j);
                    r82Var.j = null;
                    r82Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = r82Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = x52.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                r82Var.s = null;
                r82Var.d.requestLayout();
                break;
        }
    }
}
