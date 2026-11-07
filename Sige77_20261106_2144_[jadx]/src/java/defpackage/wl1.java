package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wl1 implements o62 {
    public final Application a;
    public final n62 b;
    public final Bundle c;
    public final nw0 d;
    public final ul1 e;

    public wl1(Application application, vl1 vl1Var, Bundle bundle) {
        n62 n62Var;
        this.e = vl1Var.getSavedStateRegistry();
        this.d = vl1Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (n62.g0 == null) {
                n62.g0 = new n62(application);
            }
            n62Var = n62.g0;
            n62Var.getClass();
        } else {
            n62Var = new n62(null);
        }
        this.b = n62Var;
    }

    public final l62 a(Class cls, String str) {
        a aVar = this.d;
        if (aVar == null) {
            sm0.h("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = s6.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? xl1.a(cls, xl1.b) : xl1.a(cls, xl1.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.b(cls);
            }
            if (ba0.W == null) {
                ba0.W = new ba0(10);
            }
            ba0 ba0Var = ba0.W;
            ba0Var.getClass();
            return ba0Var.b(cls);
        }
        ul1 ul1Var = this.e;
        ul1Var.getClass();
        Bundle bundleA = ul1Var.a(str);
        Class[] clsArr = ol1.f;
        ol1 ol1VarR = rq0.r(bundleA, this.c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, ol1VarR);
        savedStateHandleController.b(aVar, ul1Var);
        lw0 lw0Var = aVar.c;
        if (lw0Var == lw0.b || lw0Var.compareTo(lw0.d) >= 0) {
            ul1Var.d();
        } else {
            aVar.a(new LegacySavedStateHandleController.tryToAddRecreator.1(aVar, ul1Var));
        }
        l62 l62VarB = (!zIsAssignableFrom || application == null) ? xl1.b(cls, constructorA, ol1VarR) : xl1.b(cls, constructorA, application, ol1VarR);
        l62VarB.c(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return l62VarB;
    }

    @Override // defpackage.o62
    public final l62 b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        e.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.o62
    public final l62 h(Class cls, c61 c61Var) {
        br0 br0Var = br0.f;
        LinkedHashMap linkedHashMap = c61Var.a;
        String str = (String) linkedHashMap.get(br0Var);
        if (str == null) {
            uq1.q("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(bj0.b) == null || linkedHashMap.get(bj0.c) == null) {
            if (this.d != null) {
                return a(cls, str);
            }
            uq1.q("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(op0.d);
        boolean zIsAssignableFrom = s6.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? xl1.a(cls, xl1.b) : xl1.a(cls, xl1.a);
        if (constructorA == null) {
            return this.b.h(cls, c61Var);
        }
        return (!zIsAssignableFrom || application == null) ? xl1.b(cls, constructorA, bj0.e(c61Var)) : xl1.b(cls, constructorA, application, bj0.e(c61Var));
    }
}
