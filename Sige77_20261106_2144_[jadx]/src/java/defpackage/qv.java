package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qv implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public qv(rv rvVar) {
        this.b = new WeakReference(rvVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                rv rvVar = (rv) ((WeakReference) obj).get();
                if (rvVar != null) {
                    ArrayList arrayList = rvVar.b;
                    View view = rvVar.a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iA = rvVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = rvVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            int size = arrayList2.size();
                            while (i2 < size) {
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                ((er1) obj2).m(iA, iA2);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(rvVar.c);
                            }
                            rvVar.c = null;
                            arrayList.clear();
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                c72 c72Var = (c72) ((WeakReference) obj).get();
                if (c72Var != null) {
                    ArrayList arrayList3 = c72Var.b;
                    View view2 = c72Var.a;
                    if (!arrayList3.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int iA3 = c72Var.a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iA4 = c72Var.a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if ((iA3 > 0 || iA3 == Integer.MIN_VALUE) && (iA4 > 0 || iA4 == Integer.MIN_VALUE)) {
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            int size2 = arrayList4.size();
                            while (i2 < size2) {
                                Object obj3 = arrayList4.get(i2);
                                i2++;
                                ((er1) obj3).m(iA3, iA4);
                            }
                            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(c72Var.c);
                            }
                            c72Var.c = null;
                            arrayList3.clear();
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) obj).p(0);
                break;
        }
        return true;
    }

    public qv(c72 c72Var) {
        this.b = new WeakReference(c72Var);
    }

    public qv(CoordinatorLayout coordinatorLayout) {
        this.b = coordinatorLayout;
    }
}
