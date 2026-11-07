package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class mq implements zd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zd1
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new vr0("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new vr0(ts.k("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new vr0(ts.k("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new vr0(ts.j("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new vr0(ts.j("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new on0((hc0) obj);
        }
    }
}
