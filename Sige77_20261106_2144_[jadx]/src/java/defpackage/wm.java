package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wm {
    public static final wm c = new wm();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, vm vmVar, kw0 kw0Var, Class cls) {
        kw0 kw0Var2 = (kw0) map.get(vmVar);
        if (kw0Var2 == null || kw0Var == kw0Var2) {
            if (kw0Var2 == null) {
                map.put(vmVar, kw0Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + vmVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + kw0Var2 + ", new value " + kw0Var);
    }

    public final um a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            um umVarA = (um) map2.get(superclass);
            if (umVarA == null) {
                umVarA = a(superclass, null);
            }
            map.putAll(umVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            um umVarA2 = (um) map2.get(cls2);
            if (umVarA2 == null) {
                umVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : umVarA2.b.entrySet()) {
                b(map, (vm) entry.getKey(), (kw0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            c91 c91Var = (c91) method.getAnnotation(c91.class);
            if (c91Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ww0.class.isAssignableFrom(parameterTypes[0])) {
                        e.g("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                kw0 kw0VarValue = c91Var.value();
                if (parameterTypes.length > 1) {
                    if (!kw0.class.isAssignableFrom(parameterTypes[1])) {
                        e.g("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (kw0VarValue != kw0.ON_ANY) {
                        e.g("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    e.g("cannot have more than 2 params");
                    return null;
                }
                b(map, new vm(method, i), kw0VarValue, cls);
                z = true;
            }
        }
        um umVar = new um(map);
        map2.put(cls, umVar);
        this.b.put(cls, Boolean.valueOf(z));
        return umVar;
    }
}
