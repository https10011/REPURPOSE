package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a8 extends jw {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a8(Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.a72
    public final void a() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                k8 k8Var = ((z7) obj).b;
                k8Var.i0.setAlpha(1.0f);
                k8Var.l0.d(null);
                k8Var.l0 = null;
                break;
            case 1:
                k8 k8Var2 = (k8) obj;
                k8Var2.i0.setAlpha(1.0f);
                k8Var2.l0.d(null);
                k8Var2.l0 = null;
                break;
            default:
                k8 k8Var3 = (k8) ((f91) obj).c;
                k8Var3.i0.setVisibility(8);
                PopupWindow popupWindow = k8Var3.j0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (k8Var3.i0.getParent() instanceof View) {
                    View view = (View) k8Var3.i0.getParent();
                    WeakHashMap weakHashMap = x52.a;
                    view.requestApplyInsets();
                }
                k8Var3.i0.e();
                k8Var3.l0.d(null);
                k8Var3.l0 = null;
                ViewGroup viewGroup = k8Var3.n0;
                WeakHashMap weakHashMap2 = x52.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.jw, defpackage.a72
    public void c() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((z7) obj).b.i0.setVisibility(0);
                break;
            case 1:
                k8 k8Var = (k8) obj;
                k8Var.i0.setVisibility(0);
                if (k8Var.i0.getParent() instanceof View) {
                    View view = (View) k8Var.i0.getParent();
                    WeakHashMap weakHashMap = x52.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
