package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k8 extends y7 implements g31, LayoutInflater.Factory2 {
    public static final wq1 U0 = new wq1(0);
    public static final int[] V0 = {R.attr.windowBackground};
    public static final boolean W0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public Configuration E0;
    public final int F0;
    public int G0;
    public int H0;
    public boolean I0;
    public g8 J0;
    public g8 K0;
    public boolean L0;
    public int M0;
    public boolean O0;
    public Rect P0;
    public Rect Q0;
    public w9 R0;
    public OnBackInvokedDispatcher S0;
    public OnBackInvokedCallback T0;
    public final Object W;
    public final Context X;
    public Window Y;
    public f8 Z;
    public final r7 a0;
    public j3 b0;
    public kv1 c0;
    public CharSequence d0;
    public ActionBarOverlayLayout e0;
    public kj0 f0;
    public ox1 g0;
    public e4 h0;
    public ActionBarContextView i0;
    public PopupWindow j0;
    public z7 k0;
    public boolean m0;
    public ViewGroup n0;
    public TextView o0;
    public View p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public j8[] y0;
    public j8 z0;
    public y62 l0 = null;
    public final z7 N0 = new z7(this, 0);

    public k8(Context context, Window window, r7 r7Var, Object obj) {
        p7 p7Var = null;
        this.F0 = -100;
        this.X = context;
        this.a0 = r7Var;
        this.W = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof p7)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    p7Var = (p7) context;
                    break;
                }
            }
            if (p7Var != null) {
                this.F0 = ((k8) p7Var.getDelegate()).F0;
            }
        }
        if (this.F0 == -100) {
            String name = this.W.getClass().getName();
            wq1 wq1Var = U0;
            Integer num = (Integer) wq1Var.get(name);
            if (num != null) {
                this.F0 = num.intValue();
                wq1Var.remove(this.W.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        m8.d();
    }

    public static qz0 q(Context context) {
        qz0 qz0Var;
        qz0 qz0Var2;
        if (Build.VERSION.SDK_INT >= 33 || (qz0Var = y7.c) == null) {
            return null;
        }
        rz0 rz0Var = qz0Var.a;
        qz0 qz0VarB = c8.b(context.getApplicationContext().getResources().getConfiguration());
        if (rz0Var.a.isEmpty()) {
            qz0Var2 = qz0.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < qz0VarB.a.a.size() + rz0Var.a.size()) {
                Locale locale = i < rz0Var.a.size() ? rz0Var.a.get(i) : qz0VarB.a.a.get(i - rz0Var.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            qz0Var2 = new qz0(new rz0(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return qz0Var2.a.a.isEmpty() ? qz0VarB : qz0Var2;
    }

    public static Configuration u(Context context, int i, qz0 qz0Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (qz0Var != null) {
            c8.d(configuration2, qz0Var);
        }
        return configuration2;
    }

    public final j8 A(int i) {
        j8[] j8VarArr = this.y0;
        if (j8VarArr == null || j8VarArr.length <= i) {
            j8[] j8VarArr2 = new j8[i + 1];
            if (j8VarArr != null) {
                System.arraycopy(j8VarArr, 0, j8VarArr2, 0, j8VarArr.length);
            }
            this.y0 = j8VarArr2;
            j8VarArr = j8VarArr2;
        }
        j8 j8Var = j8VarArr[i];
        if (j8Var != null) {
            return j8Var;
        }
        j8 j8Var2 = new j8();
        j8Var2.a = i;
        j8Var2.n = false;
        j8VarArr[i] = j8Var2;
        return j8Var2;
    }

    public final void B() {
        x();
        if (this.s0 && this.b0 == null) {
            Object obj = this.W;
            if (obj instanceof Activity) {
                this.b0 = new r82((Activity) obj, this.t0);
            } else if (obj instanceof Dialog) {
                this.b0 = new r82((Dialog) obj);
            }
            j3 j3Var = this.b0;
            if (j3Var != null) {
                j3Var.l(this.O0);
            }
        }
    }

    public final void C(int i) {
        this.M0 = (1 << i) | this.M0;
        if (this.L0) {
            return;
        }
        View decorView = this.Y.getDecorView();
        WeakHashMap weakHashMap = x52.a;
        decorView.postOnAnimation(this.N0);
        this.L0 = true;
    }

    public final int D(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            uq1.q("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.K0 == null) {
                            this.K0 = new g8(this, context);
                        }
                        return this.K0.k();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).k();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean E() {
        boolean z = this.A0;
        this.A0 = false;
        j8 j8VarA = A(0);
        if (!j8VarA.m) {
            e4 e4Var = this.h0;
            if (e4Var != null) {
                e4Var.a();
                return true;
            }
            B();
            j3 j3Var = this.b0;
            if (j3Var == null || !j3Var.b()) {
                return false;
            }
        } else if (!z) {
            t(j8VarA, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.f.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(defpackage.j8 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8.F(j8, android.view.KeyEvent):void");
    }

    public final boolean G(j8 j8Var, int i, KeyEvent keyEvent) {
        i31 i31Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((j8Var.k || H(j8Var, keyEvent)) && (i31Var = j8Var.h) != null) {
            return i31Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    public final boolean H(j8 j8Var, KeyEvent keyEvent) {
        i31 i31Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.D0) {
            boolean z = j8Var.k;
            int i = j8Var.a;
            if (z) {
                return true;
            }
            j8 j8Var2 = this.z0;
            if (j8Var2 != null && j8Var2 != j8Var) {
                t(j8Var2, false);
            }
            Window.Callback callback = this.Y.getCallback();
            if (callback != null) {
                j8Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.e0) != null) {
                actionBarOverlayLayout4.k();
                ((qy1) actionBarOverlayLayout4.e).l = true;
            }
            if (j8Var.g == null && (!z2 || !(this.b0 instanceof ny1))) {
                i31 i31Var2 = j8Var.h;
                if (i31Var2 == null || j8Var.o) {
                    if (i31Var2 == null) {
                        Context context = this.X;
                        if ((i == 0 || i == 108) && this.e0 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(2130968588, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(2130968589, typedValue, true);
                            } else {
                                theme.resolveAttribute(2130968589, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                es esVar = new es(context, 0);
                                esVar.getTheme().setTo(themeNewTheme);
                                context = esVar;
                            }
                        }
                        i31 i31Var3 = new i31(context);
                        i31Var3.e = this;
                        i31 i31Var4 = j8Var.h;
                        if (i31Var3 != i31Var4) {
                            if (i31Var4 != null) {
                                i31Var4.r(j8Var.i);
                            }
                            j8Var.h = i31Var3;
                            oy0 oy0Var = j8Var.i;
                            if (oy0Var != null) {
                                i31Var3.b(oy0Var, i31Var3.a);
                            }
                        }
                        if (j8Var.h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.e0) != null) {
                                if (this.f0 == null) {
                                    this.f0 = new kj0(this, 4);
                                }
                                actionBarOverlayLayout2.l(j8Var.h, this.f0);
                            }
                            j8Var.h.w();
                            if (callback.onCreatePanelMenu(i, j8Var.h)) {
                                j8Var.o = false;
                            } else {
                                i31Var = j8Var.h;
                                if (i31Var != null) {
                                    if (i31Var != null) {
                                        i31Var.r(j8Var.i);
                                    }
                                    j8Var.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.e0) != null) {
                                    actionBarOverlayLayout.l((Menu) null, this.f0);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f0 == null) {
                                this.f0 = new kj0(this, 4);
                            }
                            actionBarOverlayLayout2.l(j8Var.h, this.f0);
                        }
                        j8Var.h.w();
                        if (callback.onCreatePanelMenu(i, j8Var.h)) {
                            i31Var = j8Var.h;
                            if (i31Var != null) {
                                if (i31Var != null) {
                                    i31Var.r(j8Var.i);
                                }
                                j8Var.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l((Menu) null, this.f0);
                            }
                        } else {
                            j8Var.o = false;
                        }
                    }
                }
                j8Var.h.w();
                Bundle bundle = j8Var.p;
                if (bundle != null) {
                    j8Var.h.s(bundle);
                    j8Var.p = null;
                }
                if (!callback.onPreparePanel(0, j8Var.g, j8Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.e0) != null) {
                        actionBarOverlayLayout3.l((Menu) null, this.f0);
                    }
                    j8Var.h.v();
                    return false;
                }
                j8Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                j8Var.h.v();
            }
            j8Var.k = true;
            j8Var.l = false;
            this.z0 = j8Var;
            return true;
        }
        return false;
    }

    public final void I() {
        if (this.m0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.S0 != null && (A(0).m || this.h0 != null)) {
                z = true;
            }
            if (z && this.T0 == null) {
                this.T0 = e8.b(this.S0, this);
            } else {
                if (z || (onBackInvokedCallback = this.T0) == null) {
                    return;
                }
                e8.c(this.S0, onBackInvokedCallback);
                this.T0 = null;
            }
        }
    }

    @Override // defpackage.y7
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.X);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof k8) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.y7
    public final void b() {
        if (this.b0 != null) {
            B();
            if (this.b0.f()) {
                return;
            }
            C(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.g31
    public final boolean c(i31 i31Var, MenuItem menuItem) {
        j8 j8Var;
        Window.Callback callback = this.Y.getCallback();
        if (callback != null && !this.D0) {
            i31 i31VarK = i31Var.k();
            j8[] j8VarArr = this.y0;
            int length = j8VarArr != null ? j8VarArr.length : 0;
            for (int i = 0; i < length; i++) {
                j8Var = j8VarArr[i];
                if (j8Var != null && j8Var.h == i31VarK) {
                    if (j8Var != null) {
                        return callback.onMenuItemSelected(j8Var.a, menuItem);
                    }
                }
            }
            j8Var = null;
            if (j8Var != null) {
                return callback.onMenuItemSelected(j8Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.y7
    public final void e() {
        String strQ;
        this.B0 = true;
        o(false, true);
        y();
        Object obj = this.W;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strQ = d42.q(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strQ = null;
            }
            if (strQ != null) {
                j3 j3Var = this.b0;
                if (j3Var == null) {
                    this.O0 = true;
                } else {
                    j3Var.l(true);
                }
            }
            synchronized (y7.v) {
                y7.h(this);
                y7.i.add(new WeakReference(this));
            }
        }
        this.E0 = new Configuration(this.X.getResources().getConfiguration());
        this.C0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.y7
    public final void f() {
        if (this.W instanceof Activity) {
            synchronized (y7.v) {
                y7.h(this);
            }
        }
        if (this.L0) {
            this.Y.getDecorView().removeCallbacks(this.N0);
        }
        this.D0 = true;
        if (this.F0 != -100) {
            Object obj = this.W;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                U0.put(this.W.getClass().getName(), Integer.valueOf(this.F0));
            } else {
                U0.remove(this.W.getClass().getName());
            }
        } else {
            U0.remove(this.W.getClass().getName());
        }
        j3 j3Var = this.b0;
        if (j3Var != null) {
            j3Var.h();
        }
        g8 g8Var = this.J0;
        if (g8Var != null) {
            g8Var.g();
        }
        g8 g8Var2 = this.K0;
        if (g8Var2 != null) {
            g8Var2.g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.g31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.i31 r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8.g(i31):void");
    }

    @Override // defpackage.y7
    public final boolean i(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.w0 && i == 108) {
            return false;
        }
        if (this.s0 && i == 1) {
            this.s0 = false;
        }
        if (i == 1) {
            I();
            this.w0 = true;
            return true;
        }
        if (i == 2) {
            I();
            this.q0 = true;
            return true;
        }
        if (i == 5) {
            I();
            this.r0 = true;
            return true;
        }
        if (i == 10) {
            I();
            this.u0 = true;
            return true;
        }
        if (i == 108) {
            I();
            this.s0 = true;
            return true;
        }
        if (i != 109) {
            return this.Y.requestFeature(i);
        }
        I();
        this.t0 = true;
        return true;
    }

    @Override // defpackage.y7
    public final void j(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.n0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.X).inflate(i, viewGroup);
        this.Z.a(this.Y.getCallback());
    }

    @Override // defpackage.y7
    public final void k(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.n0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.Z.a(this.Y.getCallback());
    }

    @Override // defpackage.y7
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.n0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.Z.a(this.Y.getCallback());
    }

    @Override // defpackage.y7
    public final void m(CharSequence charSequence) {
        this.d0 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.e0;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        j3 j3Var = this.b0;
        if (j3Var != null) {
            j3Var.n(charSequence);
            return;
        }
        TextView textView = this.o0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.y7
    public final e4 n(d4 d4Var) {
        e4 e4VarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (d4Var == null) {
            e.g("ActionMode callback can not be null.");
            return null;
        }
        e4 e4Var = this.h0;
        if (e4Var != null) {
            e4Var.a();
        }
        f91 f91Var = new f91(2, this, d4Var);
        B();
        j3 j3Var = this.b0;
        r7 r7Var = this.a0;
        if (j3Var != null) {
            e4 e4VarO = j3Var.o(f91Var);
            this.h0 = e4VarO;
            if (e4VarO != null) {
                r7Var.onSupportActionModeStarted(e4VarO);
            }
        }
        if (this.h0 == null) {
            y62 y62Var = this.l0;
            if (y62Var != null) {
                y62Var.b();
            }
            e4 e4Var2 = this.h0;
            if (e4Var2 != null) {
                e4Var2.a();
            }
            if (this.D0) {
                e4VarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    e4VarOnWindowStartingSupportActionMode = r7Var.onWindowStartingSupportActionMode(f91Var);
                } catch (AbstractMethodError unused) {
                    e4VarOnWindowStartingSupportActionMode = null;
                }
            }
            if (e4VarOnWindowStartingSupportActionMode != null) {
                this.h0 = e4VarOnWindowStartingSupportActionMode;
            } else {
                int i = 1;
                if (this.i0 == null) {
                    boolean z = this.v0;
                    Context context = this.X;
                    if (z) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(2130968588, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            es esVar = new es(context, 0);
                            esVar.getTheme().setTo(themeNewTheme);
                            context = esVar;
                        }
                        this.i0 = new ActionBarContextView(context, (AttributeSet) null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, 2130968603);
                        this.j0 = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.j0.setContentView(this.i0);
                        this.j0.setWidth(-1);
                        context.getTheme().resolveAttribute(2130968582, typedValue, true);
                        this.i0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.j0.setHeight(-2);
                        this.k0 = new z7(this, i);
                    } else {
                        ViewStubCompat viewStubCompatFindViewById = this.n0.findViewById(2131296322);
                        if (viewStubCompatFindViewById != null) {
                            B();
                            j3 j3Var2 = this.b0;
                            Context contextE = j3Var2 != null ? j3Var2.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompatFindViewById.setLayoutInflater(LayoutInflater.from(context));
                            this.i0 = viewStubCompatFindViewById.a();
                        }
                    }
                }
                if (this.i0 != null) {
                    y62 y62Var2 = this.l0;
                    if (y62Var2 != null) {
                        y62Var2.b();
                    }
                    this.i0.e();
                    Context context2 = this.i0.getContext();
                    ActionBarContextView actionBarContextView = this.i0;
                    et1 et1Var = new et1();
                    et1Var.c = context2;
                    et1Var.d = actionBarContextView;
                    et1Var.e = f91Var;
                    i31 i31Var = new i31(actionBarContextView.getContext());
                    i31Var.l = 1;
                    et1Var.v = i31Var;
                    i31Var.e = et1Var;
                    if (((d4) f91Var.b).c(et1Var, i31Var)) {
                        et1Var.i();
                        this.i0.c(et1Var);
                        this.h0 = et1Var;
                        boolean z2 = this.m0 && (viewGroup = this.n0) != null && viewGroup.isLaidOut();
                        ActionBarContextView actionBarContextView2 = this.i0;
                        if (z2) {
                            actionBarContextView2.setAlpha(0.0f);
                            y62 y62VarA = x52.a(this.i0);
                            y62VarA.a(1.0f);
                            this.l0 = y62VarA;
                            y62VarA.d(new a8(this, i));
                        } else {
                            actionBarContextView2.setAlpha(1.0f);
                            this.i0.setVisibility(0);
                            if (this.i0.getParent() instanceof View) {
                                View view = (View) this.i0.getParent();
                                WeakHashMap weakHashMap = x52.a;
                                view.requestApplyInsets();
                            }
                        }
                        if (this.j0 != null) {
                            this.Y.getDecorView().post(this.k0);
                        }
                    } else {
                        this.h0 = null;
                    }
                }
            }
            e4 e4Var3 = this.h0;
            if (e4Var3 != null) {
                r7Var.onSupportActionModeStarted(e4Var3);
            }
            J();
            this.h0 = this.h0;
        }
        J();
        return this.h0;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(boolean z, boolean z2) {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        if (this.D0) {
            return false;
        }
        int i2 = this.F0;
        if (i2 == -100) {
            i2 = y7.b;
        }
        Context context = this.X;
        int iD = D(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        qz0 qz0VarQ = i3 < 33 ? q(context) : null;
        if (!z2 && qz0VarQ != null) {
            qz0VarQ = c8.b(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iD, qz0VarQ, null, false);
        boolean z4 = this.I0;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj3 = this.W;
        if (z4 || !(obj3 instanceof Activity)) {
            this.I0 = true;
            i = this.H0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.H0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.H0 = 0;
                }
                this.I0 = true;
                i = this.H0;
            }
        }
        Configuration configuration = this.E0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationU.uiMode & 48;
        qz0 qz0VarB = c8.b(configuration);
        qz0 qz0VarB2 = qz0VarQ == null ? null : c8.b(configurationU);
        int i6 = i4 != i5 ? 512 : 0;
        if (qz0VarB2 != null && !qz0VarB.equals(qz0VarB2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.B0 && ((W0 || this.C0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationU.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new y1(activity, z5 ? 1 : 0));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (qz0VarB2 != null) {
                c8.d(configuration2, qz0VarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26 && i8 < 28) {
                if (!yi0.c0) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        yi0.b0 = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e2) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                    }
                    yi0.c0 = true;
                }
                Field field = yi0.b0;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!yi0.W) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                yi0.w = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e4) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                            }
                            yi0.W = true;
                        }
                        Field field2 = yi0.w;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!yi0.Y) {
                                try {
                                    yi0.X = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e6) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
                                }
                                yi0.Y = true;
                            }
                            Class cls = yi0.X;
                            if (cls != null) {
                                if (!yi0.a0) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        yi0.Z = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e7);
                                    }
                                    yi0.a0 = true;
                                }
                                Field field3 = yi0.Z;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e8);
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i9 = this.G0;
            if (i9 != 0) {
                context.setTheme(i9);
                context.getTheme().applyStyle(this.G0, true);
            }
            if (z6 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof ww0) {
                    if (((ww0) activity2).getLifecycle().c.compareTo(lw0.c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.C0 && !this.D0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (qz0VarB2 != null) {
            c8.c(c8.b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            z(context).o();
        } else {
            g8 g8Var = this.J0;
            if (g8Var != null) {
                g8Var.g();
            }
        }
        g8 g8Var2 = this.K0;
        if (i2 == 3) {
            if (g8Var2 == null) {
                this.K0 = new g8(this, context);
            }
            this.K0.o();
        } else if (g8Var2 != null) {
            g8Var2.g();
        }
        return z5;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View u8Var;
        View view2 = null;
        if (this.R0 == null) {
            int[] iArr = we1.j;
            Context context2 = this.X;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.R0 = new w9();
            } else {
                try {
                    this.R0 = (w9) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.R0 = new w9();
                }
            }
        }
        w9 w9Var = this.R0;
        int i = x42.a;
        w9Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, we1.y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context esVar = (resourceId == 0 || ((context instanceof es) && ((es) context).a == resourceId)) ? context : new es(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                u8Var = new u8(esVar, attributeSet);
                break;
            case 1:
                u8Var = new t7(esVar, attributeSet);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                u8Var = new r8(esVar, attributeSet);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                u8Var = w9Var.e(esVar, attributeSet);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                u8Var = new p8(esVar, attributeSet, 2130969213);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                u8Var = new w8(esVar, attributeSet);
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                u8Var = new b(esVar, attributeSet);
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                u8Var = w9Var.d(esVar, attributeSet);
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                u8Var = new u9(esVar, attributeSet);
                break;
            case 9:
                u8Var = new AppCompatImageView(esVar, attributeSet);
                break;
            case 10:
                u8Var = w9Var.a(esVar, attributeSet);
                break;
            case 11:
                u8Var = w9Var.c(esVar, attributeSet);
                break;
            case 12:
                u8Var = new o8(esVar, attributeSet);
                break;
            case 13:
                u8Var = w9Var.b(esVar, attributeSet);
                break;
            default:
                u8Var = null;
                break;
        }
        if (u8Var == null && context != esVar) {
            Object[] objArr = w9Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = esVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = w9.g;
                        if (i2 < 3) {
                            View viewF = w9Var.f(esVar, str, strArr[i2]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = w9Var.f(esVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            u8Var = view2;
        }
        if (u8Var != null) {
            Context context3 = u8Var.getContext();
            if ((context3 instanceof ContextWrapper) && u8Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, w9.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    u8Var.setOnClickListener(new v9(u8Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = esVar.obtainStyledAttributes(attributeSet, w9.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = x52.a;
                    new l52(2131296788, Boolean.class, 0, 28, 2).f(u8Var, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = esVar.obtainStyledAttributes(attributeSet, w9.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    x52.o(u8Var, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = esVar.obtainStyledAttributes(attributeSet, w9.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = x52.a;
                    new l52(2131296794, Boolean.class, 0, 28, 0).f(u8Var, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return u8Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void p(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.Y != null) {
            uq1.q("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof f8) {
            uq1.q("AppCompat has already installed itself into the Window");
            return;
        }
        f8 f8Var = new f8(this, callback);
        this.Z = f8Var;
        window.setCallback(f8Var);
        Context context = this.X;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, V0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            m8 m8VarA = m8.a();
            synchronized (m8VarA) {
                drawableD = m8VarA.a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.Y = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.S0) != null) {
            return;
        }
        Object obj = this.W;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.T0) != null) {
            e8.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.T0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.S0 = e8.a(activity);
            } else {
                this.S0 = null;
            }
        } else {
            this.S0 = null;
        }
        J();
    }

    public final void r(int i, j8 j8Var, i31 i31Var) {
        if (i31Var == null) {
            if (j8Var == null && i >= 0) {
                j8[] j8VarArr = this.y0;
                if (i < j8VarArr.length) {
                    j8Var = j8VarArr[i];
                }
            }
            if (j8Var != null) {
                i31Var = j8Var.h;
            }
        }
        if ((j8Var == null || j8Var.m) && !this.D0) {
            f8 f8Var = this.Z;
            Window.Callback callback = this.Y.getCallback();
            f8Var.getClass();
            try {
                f8Var.e = true;
                callback.onPanelClosed(i, i31Var);
            } finally {
                f8Var.e = false;
            }
        }
    }

    public final void s(i31 i31Var) {
        z3 z3Var;
        if (this.x0) {
            return;
        }
        this.x0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.e0;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((qy1) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (z3Var = actionMenuView.j0) != null) {
            z3Var.c();
            w3 w3Var = z3Var.g0;
            if (w3Var != null && w3Var.b()) {
                w3Var.i.dismiss();
            }
        }
        Window.Callback callback = this.Y.getCallback();
        if (callback != null && !this.D0) {
            callback.onPanelClosed(108, i31Var);
        }
        this.x0 = false;
    }

    public final void t(j8 j8Var, boolean z) {
        ContentFrameLayout contentFrameLayout;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && j8Var.a == 0 && (actionBarOverlayLayout = this.e0) != null) {
            actionBarOverlayLayout.k();
            if (((qy1) actionBarOverlayLayout.e).a.p()) {
                s(j8Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.X.getSystemService("window");
        if (windowManager != null && j8Var.m && (contentFrameLayout = j8Var.e) != null) {
            windowManager.removeView(contentFrameLayout);
            if (z) {
                r(j8Var.a, j8Var, null);
            }
        }
        j8Var.k = false;
        j8Var.l = false;
        j8Var.m = false;
        j8Var.f = null;
        j8Var.n = true;
        if (this.z0 == j8Var) {
            this.z0 = null;
        }
        if (j8Var.a == 0) {
            J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134 A[RETURN] */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        j8 j8VarA;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean zV;
        boolean zH;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        z3 z3Var;
        j8 j8VarA2;
        Object obj = this.W;
        if ((!(obj instanceof iv0) && !(obj instanceof g6)) || (decorView = this.Y.getDecorView()) == null || !nj2.u(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                f8 f8Var = this.Z;
                Window.Callback callback = this.Y.getCallback();
                f8Var.getClass();
                try {
                    f8Var.d = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    f8Var.d = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.A0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    j8VarA2 = A(0);
                                    if (!j8VarA2.m) {
                                        H(j8VarA2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.h0 == null) {
                                    j8VarA = A(0);
                                    actionBarOverlayLayout = this.e0;
                                    context = this.X;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.k();
                                        toolbar = ((qy1) actionBarOverlayLayout.e).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.a) == null || !actionMenuView.i0 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = j8VarA.m;
                                            if (!z || j8VarA.l) {
                                                t(j8VarA, true);
                                                zV = z;
                                            } else {
                                                if (j8VarA.k) {
                                                    if (j8VarA.o) {
                                                        j8VarA.k = false;
                                                        zH = H(j8VarA, keyEvent);
                                                    } else {
                                                        zH = true;
                                                    }
                                                    if (zH) {
                                                        F(j8VarA, keyEvent);
                                                        zV = true;
                                                    }
                                                }
                                                zV = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.e0;
                                            actionBarOverlayLayout2.k();
                                            if (((qy1) actionBarOverlayLayout2.e).a.p()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.e0;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((qy1) actionBarOverlayLayout3.e).a.a;
                                                if (actionMenuView2 != null && (z3Var = actionMenuView2.j0) != null && z3Var.c()) {
                                                    zV = true;
                                                }
                                            } else if (!this.D0 && H(j8VarA, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.e0;
                                                actionBarOverlayLayout4.k();
                                                zV = ((qy1) actionBarOverlayLayout4.e).a.v();
                                            }
                                            zV = false;
                                        }
                                    } else {
                                        z = j8VarA.m;
                                        if (z) {
                                        }
                                        t(j8VarA, true);
                                        zV = z;
                                    }
                                    if (zV) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (E()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    f8Var.d = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.A0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            j8VarA2 = A(0);
                            if (!j8VarA2.m) {
                                H(j8VarA2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.h0 == null) {
                            j8VarA = A(0);
                            actionBarOverlayLayout = this.e0;
                            context = this.X;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.k();
                                toolbar = ((qy1) actionBarOverlayLayout.e).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = j8VarA.m;
                                    if (z) {
                                    }
                                    t(j8VarA, true);
                                    zV = z;
                                } else {
                                    z = j8VarA.m;
                                    if (z) {
                                    }
                                    t(j8VarA, true);
                                    zV = z;
                                }
                            } else {
                                z = j8VarA.m;
                                if (z) {
                                }
                                t(j8VarA, true);
                                zV = z;
                            }
                            if (zV) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (E()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void w(int i) {
        j8 j8VarA = A(i);
        if (j8VarA.h != null) {
            Bundle bundle = new Bundle();
            j8VarA.h.t(bundle);
            if (bundle.size() > 0) {
                j8VarA.p = bundle;
            }
            j8VarA.h.w();
            j8VarA.h.clear();
        }
        j8VarA.o = true;
        j8VarA.n = true;
        if ((i == 108 || i == 0) && this.e0 != null) {
            j8 j8VarA2 = A(0);
            j8VarA2.k = false;
            H(j8VarA2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.m0) {
            return;
        }
        Context context = this.X;
        int[] iArr = we1.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            uq1.q("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.v0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.Y.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.w0) {
            viewGroup = this.u0 ? (ViewGroup) layoutInflaterFrom.inflate(2131492886, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(2131492885, (ViewGroup) null);
        } else if (this.v0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131492876, (ViewGroup) null);
            this.t0 = false;
            this.s0 = false;
        } else if (this.s0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968588, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new es(context, typedValue.resourceId) : context).inflate(2131492887, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayoutFindViewById = viewGroup.findViewById(2131296433);
            this.e0 = actionBarOverlayLayoutFindViewById;
            actionBarOverlayLayoutFindViewById.setWindowCallback(this.Y.getCallback());
            if (this.t0) {
                this.e0.j(109);
            }
            if (this.q0) {
                this.e0.j(2);
            }
            if (this.r0) {
                this.e0.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.s0 + ", windowActionBarOverlay: " + this.t0 + ", android:windowIsFloating: " + this.v0 + ", windowActionModeOverlay: " + this.u0 + ", windowNoTitle: " + this.w0 + " }");
        }
        wa waVar = new wa(this, 4);
        WeakHashMap weakHashMap = x52.a;
        p52.c(viewGroup, waVar);
        if (this.e0 == null) {
            this.o0 = (TextView) viewGroup.findViewById(2131296821);
        }
        boolean z = f72.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayoutFindViewById = viewGroup.findViewById(2131296309);
        ViewGroup viewGroup2 = (ViewGroup) this.Y.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayoutFindViewById.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayoutFindViewById.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.Y.setContentView(viewGroup);
        contentFrameLayoutFindViewById.setAttachListener(new gk1(this, 3));
        this.n0 = viewGroup;
        Object obj = this.W;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.d0;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.e0;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setWindowTitle(title);
            } else {
                j3 j3Var = this.b0;
                if (j3Var != null) {
                    j3Var.n(title);
                } else {
                    TextView textView = this.o0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayoutFindViewById2 = this.n0.findViewById(R.id.content);
        View decorView = this.Y.getDecorView();
        contentFrameLayoutFindViewById2.i.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayoutFindViewById2.isLaidOut()) {
            contentFrameLayoutFindViewById2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayoutFindViewById2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayoutFindViewById2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayoutFindViewById2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayoutFindViewById2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayoutFindViewById2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayoutFindViewById2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayoutFindViewById2.requestLayout();
        this.m0 = true;
        j8 j8VarA = A(0);
        if (this.D0 || j8VarA.h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.Y == null) {
            Object obj = this.W;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.Y != null) {
            return;
        }
        uq1.q("We have not been given a Window");
    }

    public final h8 z(Context context) {
        if (this.J0 == null) {
            if (p11.e == null) {
                Context applicationContext = context.getApplicationContext();
                p11.e = new p11(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.J0 = new g8(this, p11.e);
        }
        return this.J0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
