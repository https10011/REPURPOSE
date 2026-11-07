package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rg0 implements nl0, vl1, q62 {
    public final Fragment a;
    public final p62 b;
    public final y1 c;
    public o62 d;
    public a e = null;
    public ir1 f = null;

    public rg0(Fragment fragment, p62 p62Var, y1 y1Var) {
        this.a = fragment;
        this.b = p62Var;
        this.c = y1Var;
    }

    public final void a(kw0 kw0Var) {
        this.e.e(kw0Var);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new a(this);
            ir1 ir1Var = new ir1(this);
            this.f = ir1Var;
            ir1Var.f();
            this.c.run();
        }
    }

    @Override // defpackage.nl0
    public final bu getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.a;
        Context applicationContext = fragment.J().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        c61 c61Var = new c61();
        LinkedHashMap linkedHashMap = c61Var.a;
        if (application != null) {
            linkedHashMap.put(op0.d, application);
        }
        linkedHashMap.put(bj0.b, fragment);
        linkedHashMap.put(bj0.c, this);
        Bundle bundle = fragment.f;
        if (bundle != null) {
            linkedHashMap.put(bj0.d, bundle);
        }
        return c61Var;
    }

    @Override // defpackage.nl0
    public final o62 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.a;
        o62 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.E0)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.d == null) {
            Context applicationContext = fragment.J().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.d = new wl1(application, fragment, fragment.f);
        }
        return this.d;
    }

    @Override // defpackage.ww0
    public final nw0 getLifecycle() {
        b();
        return this.e;
    }

    @Override // defpackage.vl1
    public final ul1 getSavedStateRegistry() {
        b();
        return (ul1) this.f.d;
    }

    @Override // defpackage.q62
    public final p62 getViewModelStore() {
        b();
        return this.b;
    }
}
