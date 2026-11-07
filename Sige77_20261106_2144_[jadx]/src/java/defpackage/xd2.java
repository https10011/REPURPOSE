package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xd2 {
    public static final ThreadLocal d = new ThreadLocal();
    public final Class a;
    public final xd2 b;
    public final TreeMap c = new TreeMap();

    public xd2(Class cls) {
        this.a = cls;
        this.b = a(cls.getSuperclass());
        for (Field field : cls.getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers()) && !this.c.containsKey(field.getName())) {
                this.c.put(field.getName(), new qe2(field, this));
            }
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (!Modifier.isStatic(method.getModifiers())) {
                int length = method.getParameterTypes().length;
                String name = method.getName();
                if (name.length() > 3 || name.startsWith("is")) {
                    if (length == 0) {
                        if (name.startsWith("get")) {
                            String strD = d(name.substring(3));
                            if (!this.c.containsKey(strD)) {
                                this.c.put(strD, new qe2(strD, this));
                            }
                            ((qe2) this.c.get(strD)).b(method);
                        } else if (name.startsWith("is")) {
                            String strD2 = d(name.substring(2));
                            if (!this.c.containsKey(strD2)) {
                                this.c.put(strD2, new qe2(strD2, this));
                            }
                            ((qe2) this.c.get(strD2)).b(method);
                        }
                    } else if (length == 1 && name.startsWith("set")) {
                        String strD3 = d(name.substring(3));
                        if (!this.c.containsKey(strD3)) {
                            this.c.put(strD3, new qe2(strD3, this));
                        }
                        qe2 qe2Var = (qe2) this.c.get(strD3);
                        qe2Var.getClass();
                        Class<?> cls2 = method.getParameterTypes()[0];
                        if (qe2Var.d == null) {
                            qe2Var.d = cls2;
                        }
                        qe2Var.h.put(cls2, method);
                        method.setAccessible(true);
                    }
                }
            }
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            qe2 qe2Var2 = (qe2) it.next();
            if (qe2Var2.c() == null && qe2Var2.d() == null && !Modifier.isPublic(qe2Var2.e.getModifiers())) {
                it.remove();
            }
        }
    }

    public static xd2 a(Class cls) {
        ThreadLocal threadLocal = d;
        if (threadLocal.get() == null) {
            threadLocal.set(new HashMap());
        }
        if (cls == null) {
            return null;
        }
        if (!((Map) threadLocal.get()).containsKey(cls)) {
            ((Map) threadLocal.get()).put(cls, new xd2(cls));
        }
        return (xd2) ((Map) threadLocal.get()).get(cls);
    }

    public static String d(String str) {
        if (str.length() < 2) {
            return str.toLowerCase();
        }
        if (Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1))) {
            return str;
        }
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    public final Collection b() {
        TreeMap treeMap = new TreeMap((Map) this.c);
        for (xd2 xd2Var = this.b; xd2Var != null; xd2Var = xd2Var.b) {
            TreeMap treeMap2 = xd2Var.c;
            for (String str : treeMap2.keySet()) {
                if (!treeMap.containsKey(str)) {
                    treeMap.put(str, treeMap2.get(str));
                }
            }
        }
        return treeMap.values();
    }

    public final boolean c(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        xd2 xd2Var = this.b;
        return xd2Var != null && xd2Var.c(str);
    }
}
