package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                if (!bVar.getInternalPopup().a()) {
                    bVar.f.m(bVar.getTextDirection(), bVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = bVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                f9 f9Var = (f9) obj;
                b bVar2 = f9Var.t0;
                if (bVar2.isAttachedToWindow() && bVar2.getGlobalVisibleRect(f9Var.r0)) {
                    f9Var.s();
                    f9Var.c();
                } else {
                    f9Var.dismiss();
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                al alVar = (al) obj;
                ArrayList arrayList = alVar.v;
                if (alVar.a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((zk) arrayList.get(0)).a.l0) {
                        View view = alVar.b0;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((zk) obj2).a.c();
                            }
                        } else {
                            alVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                ht1 ht1Var = (ht1) obj;
                z31 z31Var = ht1Var.v;
                if (ht1Var.a() && !z31Var.l0) {
                    View view2 = ht1Var.Z;
                    if (view2 != null && view2.isShown()) {
                        z31Var.c();
                    } else {
                        ht1Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
