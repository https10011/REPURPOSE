package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class p7 extends c implements r7 {
    public k8 m0;

    public p7() {
        getSavedStateRegistry().c("androidx:appcompat", new n7(this));
        addOnContextAvailableListener(new o7(this));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k8 k8Var = (k8) getDelegate();
        k8Var.x();
        ((ViewGroup) k8Var.n0.findViewById(R.id.content)).addView(view, layoutParams);
        k8Var.Z.a(k8Var.Y.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x0208  */
    /* JADX WARN: Code duplicated, block: B:127:0x020c  */
    /* JADX WARN: Code duplicated, block: B:138:0x022d A[Catch: all -> 0x0221, TRY_LEAVE, TryCatch #0 {, blocks: (B:129:0x020f, B:131:0x0213, B:137:0x022b, B:138:0x022d, B:140:0x0231, B:146:0x0241, B:145:0x0238, B:136:0x0224), top: B:156:0x020f, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        es esVar;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        k8 k8Var = (k8) getDelegate();
        int i37 = 1;
        k8Var.B0 = true;
        int i38 = k8Var.F0;
        if (i38 == -100) {
            i38 = y7.b;
        }
        int iD = k8Var.D(context, i38);
        if (y7.d(context) && y7.d(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (y7.w) {
                    try {
                        qz0 qz0Var = y7.c;
                        if (qz0Var == null) {
                            if (y7.d == null) {
                                y7.d = qz0.a(ea.x(context));
                            }
                            if (!y7.d.a.a.isEmpty()) {
                                y7.c = y7.d;
                            }
                        } else if (!qz0Var.equals(y7.d)) {
                            qz0 qz0Var2 = y7.c;
                            y7.d = qz0Var2;
                            ea.w(context, qz0Var2.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!y7.f) {
                y7.a.execute(new t5(context, i37));
            }
        }
        qz0 qz0VarQ = k8.q(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(k8.u(context, iD, qz0VarQ, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof es) {
                    try {
                        ((es) context).a(k8.u(context, iD, qz0VarQ, null, false));
                    } catch (IllegalStateException unused2) {
                        if (k8.W0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    c8.a(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i25 = configuration.uiMode & 15;
                                    i26 = configuration2.uiMode & 15;
                                    if (i25 != i26) {
                                        configuration3.uiMode |= i26;
                                    }
                                    i27 = configuration.uiMode & 48;
                                    i28 = configuration2.uiMode & 48;
                                    if (i27 != i28) {
                                        configuration3.uiMode |= i28;
                                    }
                                    i29 = configuration.screenWidthDp;
                                    i30 = configuration2.screenWidthDp;
                                    if (i29 != i30) {
                                        configuration3.screenWidthDp = i30;
                                    }
                                    i31 = configuration.screenHeightDp;
                                    i32 = configuration2.screenHeightDp;
                                    if (i31 != i32) {
                                        configuration3.screenHeightDp = i32;
                                    }
                                    i33 = configuration.smallestScreenWidthDp;
                                    i34 = configuration2.smallestScreenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.smallestScreenWidthDp = i34;
                                    }
                                    i35 = configuration.densityDpi;
                                    i36 = configuration2.densityDpi;
                                    if (i35 != i36) {
                                        configuration3.densityDpi = i36;
                                    }
                                }
                            }
                            Configuration configurationU = k8.u(context, iD, qz0VarQ, configuration3, true);
                            esVar = new es(context, 2131952239);
                            esVar.a(configurationU);
                            try {
                                if (context.getTheme() != null) {
                                    theme = esVar.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        za.c(theme);
                                    } else {
                                        synchronized (yi0.c) {
                                            if (yi0.e) {
                                                method = yi0.d;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    yi0.d = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                                }
                                                yi0.e = true;
                                                method = yi0.d;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                                        yi0.d = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = esVar;
                        }
                    }
                } else if (k8.W0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            c8.a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i25 = configuration.uiMode & 15;
                            i26 = configuration2.uiMode & 15;
                            if (i25 != i26) {
                                configuration3.uiMode |= i26;
                            }
                            i27 = configuration.uiMode & 48;
                            i28 = configuration2.uiMode & 48;
                            if (i27 != i28) {
                                configuration3.uiMode |= i28;
                            }
                            i29 = configuration.screenWidthDp;
                            i30 = configuration2.screenWidthDp;
                            if (i29 != i30) {
                                configuration3.screenWidthDp = i30;
                            }
                            i31 = configuration.screenHeightDp;
                            i32 = configuration2.screenHeightDp;
                            if (i31 != i32) {
                                configuration3.screenHeightDp = i32;
                            }
                            i33 = configuration.smallestScreenWidthDp;
                            i34 = configuration2.smallestScreenWidthDp;
                            if (i33 != i34) {
                                configuration3.smallestScreenWidthDp = i34;
                            }
                            i35 = configuration.densityDpi;
                            i36 = configuration2.densityDpi;
                            if (i35 != i36) {
                                configuration3.densityDpi = i36;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationU2 = k8.u(context, iD, qz0VarQ, configuration3, true);
                    esVar = new es(context, 2131952239);
                    esVar.a(configurationU2);
                    if (context.getTheme() != null) {
                        theme = esVar.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            za.c(theme);
                        } else {
                            synchronized (yi0.c) {
                                if (yi0.e) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    yi0.d = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    yi0.e = true;
                                    method = yi0.d;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = yi0.d;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = esVar;
                }
            }
        } else if (context instanceof es) {
            ((es) context).a(k8.u(context, iD, qz0VarQ, null, false));
        } else if (k8.W0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    c8.a(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i25 = configuration.uiMode & 15;
                    i26 = configuration2.uiMode & 15;
                    if (i25 != i26) {
                        configuration3.uiMode |= i26;
                    }
                    i27 = configuration.uiMode & 48;
                    i28 = configuration2.uiMode & 48;
                    if (i27 != i28) {
                        configuration3.uiMode |= i28;
                    }
                    i29 = configuration.screenWidthDp;
                    i30 = configuration2.screenWidthDp;
                    if (i29 != i30) {
                        configuration3.screenWidthDp = i30;
                    }
                    i31 = configuration.screenHeightDp;
                    i32 = configuration2.screenHeightDp;
                    if (i31 != i32) {
                        configuration3.screenHeightDp = i32;
                    }
                    i33 = configuration.smallestScreenWidthDp;
                    i34 = configuration2.smallestScreenWidthDp;
                    if (i33 != i34) {
                        configuration3.smallestScreenWidthDp = i34;
                    }
                    i35 = configuration.densityDpi;
                    i36 = configuration2.densityDpi;
                    if (i35 != i36) {
                        configuration3.densityDpi = i36;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationU3 = k8.u(context, iD, qz0VarQ, configuration3, true);
            esVar = new es(context, 2131952239);
            esVar.a(configurationU3);
            if (context.getTheme() != null) {
                theme = esVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    za.c(theme);
                } else {
                    synchronized (yi0.c) {
                        if (yi0.e) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            yi0.d = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            yi0.e = true;
                            method = yi0.d;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = yi0.d;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = esVar;
        }
        super/*android.content.ContextWrapper*/.attachBaseContext(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void closeOptionsMenu() {
        j3 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super/*android.app.Activity*/.closeOptionsMenu();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j3 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super/*jq*/.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        k8 k8Var = (k8) getDelegate();
        k8Var.x();
        return (T) k8Var.Y.findViewById(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y7 getDelegate() {
        if (this.m0 == null) {
            x7 x7Var = y7.a;
            this.m0 = new k8(this, null, this, this);
        }
        return this.m0;
    }

    public m3 getDrawerToggleDelegate() {
        ((k8) getDelegate()).getClass();
        return new u41(3);
    }

    public MenuInflater getMenuInflater() {
        k8 k8Var = (k8) getDelegate();
        if (k8Var.c0 == null) {
            k8Var.B();
            j3 j3Var = k8Var.b0;
            k8Var.c0 = new kv1(j3Var != null ? j3Var.e() : k8Var.X);
        }
        return k8Var.c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resources getResources() {
        int i = x42.a;
        return super/*android.content.Context*/.getResources();
    }

    public j3 getSupportActionBar() {
        k8 k8Var = (k8) getDelegate();
        k8Var.B();
        return k8Var.b0;
    }

    public Intent getSupportParentActivityIntent() {
        return d42.o(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*androidx.activity.ComponentActivity*/.onConfigurationChanged(configuration);
        k8 k8Var = (k8) getDelegate();
        if (k8Var.s0 && k8Var.m0) {
            k8Var.B();
            j3 j3Var = k8Var.b0;
            if (j3Var != null) {
                j3Var.g();
            }
        }
        m8 m8VarA = m8.a();
        Context context = k8Var.X;
        synchronized (m8VarA) {
            aj1 aj1Var = m8VarA.a;
            synchronized (aj1Var) {
                s01 s01Var = (s01) aj1Var.b.get(context);
                if (s01Var != null) {
                    s01Var.c();
                }
            }
        }
        k8Var.E0 = new Configuration(k8Var.X.getResources().getConfiguration());
        k8Var.o(false, false);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context, p7] */
    public void onCreateSupportNavigateUpTaskStack(ow1 ow1Var) {
        ArrayList arrayList = ow1Var.a;
        ?? r4 = ow1Var.b;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = d42.o(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(r4.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent intentP = d42.p(r4, component); intentP != null; intentP = d42.p(r4, intentP.getComponent())) {
                    arrayList.add(size, intentP);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                sm0.s(e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super/*android.app.Activity*/.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        j3 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onMenuOpened(int i, Menu menu) {
        return super/*android.app.Activity*/.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super/*androidx.activity.ComponentActivity*/.onPanelClosed(i, menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPostCreate(Bundle bundle) {
        super/*android.app.Activity*/.onPostCreate(bundle);
        ((k8) getDelegate()).x();
    }

    public final void onPostResume() {
        super.onPostResume();
        k8 k8Var = (k8) getDelegate();
        k8Var.B();
        j3 j3Var = k8Var.b0;
        if (j3Var != null) {
            j3Var.m(true);
        }
    }

    public final void onStart() {
        super.onStart();
        ((k8) getDelegate()).o(true, false);
    }

    public final void onStop() {
        super.onStop();
        k8 k8Var = (k8) getDelegate();
        k8Var.B();
        j3 j3Var = k8Var.b0;
        if (j3Var != null) {
            j3Var.m(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        ow1 ow1Var = new ow1(this);
        onCreateSupportNavigateUpTaskStack(ow1Var);
        onPrepareSupportNavigateUpTaskStack(ow1Var);
        ArrayList arrayList = ow1Var.a;
        if (arrayList.isEmpty()) {
            uq1.q("No intents added to TaskStackBuilder; cannot startActivities");
            return false;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ow1Var.b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super/*android.app.Activity*/.onTitleChanged(charSequence, i);
        getDelegate().m(charSequence);
    }

    @Override // defpackage.r7
    public e4 onWindowStartingSupportActionMode(d4 d4Var) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void openOptionsMenu() {
        j3 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super/*android.app.Activity*/.openOptionsMenu();
            }
        }
    }

    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().j(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        k8 k8Var = (k8) getDelegate();
        if (k8Var.W instanceof Activity) {
            k8Var.B();
            j3 j3Var = k8Var.b0;
            if (j3Var instanceof r82) {
                uq1.q("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            k8Var.c0 = null;
            if (j3Var != null) {
                j3Var.h();
            }
            k8Var.b0 = null;
            if (toolbar != null) {
                Object obj = k8Var.W;
                ny1 ny1Var = new ny1(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : k8Var.d0, k8Var.Z);
                k8Var.b0 = ny1Var;
                k8Var.Z.b = ny1Var.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                k8Var.Z.b = null;
            }
            k8Var.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTheme(int i) {
        super/*android.content.Context*/.setTheme(i);
        ((k8) getDelegate()).G0 = i;
    }

    public e4 startSupportActionMode(d4 d4Var) {
        return getDelegate().n(d4Var);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().i(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().k(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().l(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onPrepareSupportNavigateUpTaskStack(ow1 ow1Var) {
    }

    @Override // defpackage.r7
    public void onSupportActionModeFinished(e4 e4Var) {
    }

    @Override // defpackage.r7
    public void onSupportActionModeStarted(e4 e4Var) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }
}
