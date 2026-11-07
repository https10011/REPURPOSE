package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t80 extends ri2 {
    public final /* synthetic */ om d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(om omVar) {
        super(2);
        this.d = omVar;
    }

    @Override // defpackage.ri2
    public final x2 b(int i) {
        return new x2(AccessibilityNodeInfo.obtain(this.d.n(i).a));
    }

    @Override // defpackage.ri2
    public final x2 d(int i) {
        om omVar = this.d;
        int i2 = i == 2 ? omVar.k : omVar.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return b(i2);
    }

    @Override // defpackage.ri2
    public final boolean t(int i, int i2, Bundle bundle) {
        int i3;
        om omVar = this.d;
        Chip chip = omVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = x52.a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return omVar.p(i);
        }
        if (i2 == 2) {
            return omVar.j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = omVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = omVar.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                omVar.k = Integer.MIN_VALUE;
                chip.invalidate();
                omVar.q(i3, 65536);
            }
            omVar.k = i;
            chip.invalidate();
            omVar.q(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (omVar.k != i) {
                return false;
            }
            omVar.k = Integer.MIN_VALUE;
            chip.invalidate();
            omVar.q(i, 65536);
            return true;
        }
        View view = omVar.n;
        if (i2 == 16) {
            if (i == 0) {
                return view.performClick();
            }
            if (i == 1) {
                view.playSoundEffect(0);
                View.OnClickListener onClickListener = ((Chip) view).v;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    z = true;
                }
                if (((Chip) view).i0) {
                    ((Chip) view).h0.q(1, 1);
                }
            }
        }
        return z;
    }
}
