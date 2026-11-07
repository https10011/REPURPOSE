package defpackage;

import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ei {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;

    public ei(ei eiVar, Feature[] featureArr, boolean z, int i) {
        this.a = 4;
        this.e = eiVar;
        this.d = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.b = i;
    }

    public static ei b() {
        ei eiVar = new ei();
        eiVar.c = true;
        eiVar.b = 0;
        return eiVar;
    }

    public ei a() {
        gu2.h("execute parameter required", ((ph1) this.d) != null);
        return new ei(this, (Feature[]) this.e, this.c, this.b);
    }

    public void c(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((i4) this.d);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((y1) this.d);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ei() {
        this.a = 3;
    }

    public ei(ri2 ri2Var, boolean z) {
        this.a = 2;
        yl ylVar = yl.i;
        this.e = ri2Var;
        this.c = z;
        this.d = ylVar;
        this.b = Integer.MAX_VALUE;
    }

    public ei(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new y1(this, 24);
    }

    public ei(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new i4(this, 3);
    }
}
