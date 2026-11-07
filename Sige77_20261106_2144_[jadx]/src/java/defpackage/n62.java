package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n62 extends ba0 {
    public static n62 g0;
    public final Application f0;

    public n62(Application application) {
        super(10);
        this.f0 = application;
    }

    public final l62 B(Class cls, Application application) {
        if (!s6.class.isAssignableFrom(cls)) {
            return super.b(cls);
        }
        try {
            l62 l62Var = (l62) cls.getConstructor(Application.class).newInstance(application);
            l62Var.getClass();
            return l62Var;
        } catch (IllegalAccessException e) {
            sm0.l("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            sm0.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            sm0.l("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            sm0.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // defpackage.ba0, defpackage.o62
    public final l62 b(Class cls) {
        Application application = this.f0;
        if (application != null) {
            return B(cls, application);
        }
        sm0.h("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.o62
    public final l62 h(Class cls, c61 c61Var) {
        if (this.f0 != null) {
            return b(cls);
        }
        Application application = (Application) c61Var.a.get(op0.d);
        if (application != null) {
            return B(cls, application);
        }
        if (!s6.class.isAssignableFrom(cls)) {
            return super.b(cls);
        }
        e.g("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
