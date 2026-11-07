package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class al extends t31 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View a0;
    public final Context b;
    public View b0;
    public final int c;
    public int c0;
    public final int d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final Handler f;
    public int f0;
    public int g0;
    public boolean i0;
    public a41 j0;
    public ViewTreeObserver k0;
    public PopupWindow.OnDismissListener l0;
    public boolean m0;
    public final ArrayList i = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final z8 w = new z8(this, 2);
    public final xk W = new xk(this, 0);
    public final pv2 X = new pv2(this);
    public int Y = 0;
    public int Z = 0;
    public boolean h0 = false;

    public al(Context context, View view, int i, boolean z) {
        this.b = context;
        this.a0 = view;
        this.d = i;
        this.e = z;
        this.c0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f = new Handler();
    }

    @Override // defpackage.oq1
    public final boolean a() {
        ArrayList arrayList = this.v;
        return arrayList.size() > 0 && ((zk) arrayList.get(0)).a.m0.isShowing();
    }

    @Override // defpackage.oq1
    public final void c() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((i31) obj);
        }
        arrayList.clear();
        View view = this.a0;
        this.b0 = view;
        if (view != null) {
            boolean z = this.k0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.k0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.w);
            }
            this.b0.addOnAttachStateChangeListener(this.W);
        }
    }

    @Override // defpackage.b41
    public final void d(a41 a41Var) {
        this.j0 = a41Var;
    }

    @Override // defpackage.oq1
    public final void dismiss() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        if (size > 0) {
            zk[] zkVarArr = (zk[]) arrayList.toArray(new zk[size]);
            for (int i = size - 1; i >= 0; i--) {
                zk zkVar = zkVarArr[i];
                if (zkVar.a.m0.isShowing()) {
                    zkVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.b41
    public final void f(i31 i31Var, boolean z) {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (i31Var == ((zk) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((zk) arrayList.get(i2)).b.c(false);
        }
        zk zkVar = (zk) arrayList.remove(i);
        i31 i31Var2 = zkVar.b;
        z31 z31Var = zkVar.a;
        s8 s8Var = z31Var.m0;
        i31Var2.r(this);
        if (this.m0) {
            w31.b(s8Var, null);
            s8Var.setAnimationStyle(0);
        }
        z31Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.c0 = ((zk) arrayList.get(size2 - 1)).c;
        } else {
            this.c0 = this.a0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((zk) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        a41 a41Var = this.j0;
        if (a41Var != null) {
            a41Var.f(i31Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.k0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.k0.removeGlobalOnLayoutListener(this.w);
            }
            this.k0 = null;
        }
        this.b0.removeOnAttachStateChangeListener(this.W);
        this.l0.onDismiss();
    }

    @Override // defpackage.b41
    public final void g() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((zk) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f31) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.oq1
    public final o30 h() {
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((zk) arrayList.get(arrayList.size() - 1)).a.c;
    }

    @Override // defpackage.b41
    public final boolean j(tu1 tu1Var) {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zk zkVar = (zk) obj;
            if (tu1Var == zkVar.b) {
                zkVar.a.c.requestFocus();
                return true;
            }
        }
        if (!tu1Var.hasVisibleItems()) {
            return false;
        }
        l(tu1Var);
        a41 a41Var = this.j0;
        if (a41Var != null) {
            a41Var.y(tu1Var);
        }
        return true;
    }

    @Override // defpackage.b41
    public final boolean k() {
        return false;
    }

    @Override // defpackage.t31
    public final void l(i31 i31Var) {
        i31Var.b(this, this.b);
        if (a()) {
            u(i31Var);
        } else {
            this.i.add(i31Var);
        }
    }

    @Override // defpackage.t31
    public final void n(View view) {
        if (this.a0 != view) {
            this.a0 = view;
            this.Z = Gravity.getAbsoluteGravity(this.Y, view.getLayoutDirection());
        }
    }

    @Override // defpackage.t31
    public final void o(boolean z) {
        this.h0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        zk zkVar;
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zkVar = null;
                break;
            }
            zkVar = (zk) arrayList.get(i);
            if (!zkVar.a.m0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (zkVar != null) {
            zkVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.t31
    public final void p(int i) {
        if (this.Y != i) {
            this.Y = i;
            this.Z = Gravity.getAbsoluteGravity(i, this.a0.getLayoutDirection());
        }
    }

    @Override // defpackage.t31
    public final void q(int i) {
        this.d0 = true;
        this.f0 = i;
    }

    @Override // defpackage.t31
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.l0 = onDismissListener;
    }

    @Override // defpackage.t31
    public final void s(boolean z) {
        this.i0 = z;
    }

    @Override // defpackage.t31
    public final void t(int i) {
        this.e0 = true;
        this.g0 = i;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u(i31 i31Var) {
        boolean z;
        char c;
        View childAt;
        zk zkVar;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem item;
        f31 f31Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        f31 f31Var2 = new f31(i31Var, layoutInflaterFrom, this.e, 2131492875);
        if (!a() && this.h0) {
            f31Var2.c = true;
        } else if (a()) {
            int size = i31Var.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = i31Var.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            f31Var2.c = z;
        }
        int iM = t31.m(f31Var2, context, this.c);
        z31 z31Var = new z31(context, null, this.d, 0);
        z31Var.p0 = this.X;
        z31Var.c0 = this;
        s8 s8Var = z31Var.m0;
        s8Var.setOnDismissListener(this);
        z31Var.b0 = this.a0;
        z31Var.Y = this.Z;
        z31Var.l0 = true;
        s8Var.setFocusable(true);
        s8Var.setInputMethodMode(2);
        z31Var.p(f31Var2);
        z31Var.r(iM);
        z31Var.Y = this.Z;
        ArrayList arrayList = this.v;
        if (arrayList.size() > 0) {
            zkVar = (zk) arrayList.get(arrayList.size() - 1);
            i31 i31Var2 = zkVar.b;
            int size2 = i31Var2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = i31Var2.getItem(i5);
                if (item.hasSubMenu() && i31Var == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                c = 0;
                childAt = null;
            } else {
                o30 o30Var = zkVar.a.c;
                ListAdapter adapter = o30Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    f31Var = (f31) headerViewListAdapter.getWrappedAdapter();
                } else {
                    f31Var = (f31) adapter;
                    headersCount = 0;
                }
                int count = f31Var.getCount();
                int i6 = 0;
                c = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == f31Var.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - o30Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < o30Var.getChildCount()) ? o30Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            zkVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = z31.q0;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(s8Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                x31.a(s8Var, c);
            }
            w31.a(s8Var, null);
            o30 o30Var2 = ((zk) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            o30Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.b0.getWindowVisibleDisplayFrame(rect);
            if (this.c0 == 1) {
                if (o30Var2.getWidth() + iArr[0] + iM > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.c0 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                z31Var.b0 = childAt;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.a0.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.Z & 7) == 5) {
                    iArr2[0] = this.a0.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i7 = iArr3[0] - iArr2[0];
                i2 = iArr3[1] - iArr2[1];
                i3 = i7;
            }
            if ((this.Z & 5) != 5) {
                width = z2 ? i3 + childAt.getWidth() : i3 - iM;
            } else if (z2) {
                width = i3 + iM;
            } else {
                iM = childAt.getWidth();
            }
            z31Var.f = width;
            z31Var.X = true;
            z31Var.W = true;
            z31Var.i(i2);
        } else {
            if (this.d0) {
                z31Var.f = this.f0;
            }
            if (this.e0) {
                z31Var.i(this.g0);
            }
            Rect rect2 = this.a;
            z31Var.k0 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new zk(z31Var, i31Var, this.c0));
        z31Var.c();
        o30 o30Var3 = z31Var.c;
        o30Var3.setOnKeyListener(this);
        if (zkVar == null && this.i0 && i31Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(2131492882, (ViewGroup) o30Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(i31Var.m);
            o30Var3.addHeaderView(frameLayout, null, false);
            z31Var.c();
        }
    }
}
