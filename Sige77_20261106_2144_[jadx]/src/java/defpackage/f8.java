package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f8 implements Window.Callback {
    public final Window.Callback a;
    public kj0 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ k8 f;

    public f8(k8 k8Var, Window.Callback callback) {
        this.f = k8Var;
        if (callback != null) {
            this.a = callback;
        } else {
            e.g("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        n82.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            k8 k8Var = this.f;
            k8Var.B();
            j3 j3Var = k8Var.b0;
            if (j3Var == null || !j3Var.i(keyCode, keyEvent)) {
                j8 j8Var = k8Var.z0;
                if (j8Var == null || !k8Var.G(j8Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (k8Var.z0 == null) {
                        j8 j8VarA = k8Var.A(0);
                        k8Var.H(j8VarA, keyEvent);
                        boolean zG = k8Var.G(j8VarA, keyEvent.getKeyCode(), keyEvent);
                        j8VarA.k = false;
                        if (zG) {
                        }
                    }
                    return false;
                }
                j8 j8Var2 = k8Var.z0;
                if (j8Var2 != null) {
                    j8Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof i31)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        kj0 kj0Var = this.b;
        if (kj0Var != null) {
            View view = i == 0 ? new View(((ny1) kj0Var.b).a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            k8 k8Var = this.f;
            k8Var.B();
            j3 j3Var = k8Var.b0;
            if (j3Var != null) {
                j3Var.c(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        k8 k8Var = this.f;
        if (i == 108) {
            k8Var.B();
            j3 j3Var = k8Var.b0;
            if (j3Var != null) {
                j3Var.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            j8 j8VarA = k8Var.A(i);
            if (j8VarA.m) {
                k8Var.t(j8VarA, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        o82.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        i31 i31Var = menu instanceof i31 ? (i31) menu : null;
        if (i == 0 && i31Var == null) {
            return false;
        }
        if (i31Var != null) {
            i31Var.x = true;
        }
        kj0 kj0Var = this.b;
        if (kj0Var != null && i == 0) {
            ny1 ny1Var = (ny1) kj0Var.b;
            if (!ny1Var.d) {
                ny1Var.a.l = true;
                ny1Var.d = true;
            }
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (i31Var != null) {
            i31Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        i31 i31Var = this.f.A(0).h;
        if (i31Var != null) {
            d(list, i31Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return m82.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return m82.b(this.a, callback, i);
        }
        k8 k8Var = this.f;
        ep1 ep1Var = new ep1(k8Var.X, callback);
        e4 e4VarN = k8Var.n(ep1Var);
        if (e4VarN != null) {
            return ep1Var.o(e4VarN);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
