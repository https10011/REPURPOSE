package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jb2 {
    public final /* synthetic */ int a;

    public final Object a(co coVar, Object obj, Type type, Class cls) {
        Class<?> componentType = null;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                cg2 cg2Var = (cg2) coVar.c;
                cg2Var.a.add("values");
                try {
                    try {
                        if (cls.getComponentType() != null) {
                            componentType = cls.getComponentType();
                        }
                        if (componentType == null) {
                            throw new xp("Missing concrete class for array.  You might require a use() method.", 7);
                        }
                        Object objNewInstance = Array.newInstance(componentType, list.size());
                        for (int i = 0; i < list.size(); i++) {
                            Array.set(objNewInstance, i, coVar.j(list.get(i), componentType));
                        }
                        cg2Var.a();
                        return objNewInstance;
                    } catch (ClassNotFoundException e) {
                        throw new xp(7, cg2Var + ": Could not find class " + e.getMessage(), e);
                    }
                } catch (Throwable th) {
                    cg2Var.a();
                    throw th;
                }
            case 1:
                cg2 cg2Var2 = (cg2) coVar.c;
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    return coVar.k((Map) obj, declaredConstructor.newInstance(null), type);
                } catch (IllegalAccessException e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cg2Var2);
                    String name = cls.getName();
                    sb.append(":There was an exception trying to instantiate an instance of ");
                    sb.append(name);
                    throw new xp(7, sb.toString(), e2);
                } catch (InstantiationException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cg2Var2);
                    String name2 = cls.getName();
                    sb2.append(":There was an exception trying to instantiate an instance of ");
                    sb2.append(name2);
                    throw new xp(7, sb2.toString(), e3);
                } catch (NoSuchMethodException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(cg2Var2);
                    String name3 = cls.getName();
                    sb3.append(": ");
                    sb3.append(name3);
                    sb3.append(" lacks a no argument constructor.  com.zero.json will instantiate any protected, private, or public no-arg constructor.");
                    throw new xp(7, sb3.toString(), e4);
                } catch (InvocationTargetException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(cg2Var2);
                    String name4 = cls.getName();
                    sb4.append(":There was an exception trying to instantiate an instance of ");
                    sb4.append(name4);
                    throw new xp(7, sb4.toString(), e5);
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return obj;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (obj instanceof Number) {
                    return Byte.valueOf(((Number) obj).byteValue());
                }
                throw coVar.p(obj, Byte.class);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return Character.valueOf(obj.toString().charAt(0));
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (obj instanceof Number) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
                try {
                    return Double.valueOf(Double.parseDouble(obj.toString()));
                } catch (Exception unused) {
                    throw coVar.p(obj, Double.class);
                }
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (obj instanceof String) {
                    return Enum.valueOf((Class) type, obj.toString());
                }
                throw new xp(String.format("%s:  Don't know how to convert %s to enumerated constant of %s", (cg2) coVar.c, obj, type), 7);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                if (obj instanceof Number) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                try {
                    return Float.valueOf(Float.parseFloat(obj.toString()));
                } catch (Exception unused2) {
                    throw coVar.p(obj, Float.class);
                }
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof Number) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                try {
                    return Integer.valueOf(Integer.parseInt(obj.toString()));
                } catch (Exception unused3) {
                    throw coVar.p(obj, Integer.class);
                }
            case 9:
                wf2 wf2Var = (wf2) obj;
                String str = wf2Var.a;
                return str.matches("\\-?\\d+") ? Long.valueOf(wf2Var.longValue()) : Double.valueOf(Double.parseDouble(str));
            case 10:
                if (obj instanceof Collection) {
                    ArrayList arrayList = new ArrayList();
                    coVar.m((Collection) obj, arrayList, type);
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(coVar.j(obj, null));
                return arrayList2;
            case 11:
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                try {
                    return Long.valueOf(Long.parseLong(obj.toString()));
                } catch (Exception unused4) {
                    throw coVar.p(obj, Long.class);
                }
            case 12:
                if (type == null || !(type instanceof ParameterizedType)) {
                    HashMap map = new HashMap();
                    coVar.n((Map) obj, map, null, null);
                    return map;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type type2 = parameterizedType.getActualTypeArguments()[0];
                Type type3 = parameterizedType.getActualTypeArguments()[1];
                Map map2 = (Map) obj;
                HashMap map3 = new HashMap();
                if (type2 == Object.class) {
                    type2 = null;
                }
                coVar.n(map2, map3, type2, type3 != Object.class ? type3 : null);
                return map3;
            case 13:
                if (obj instanceof Collection) {
                    HashSet hashSet = new HashSet();
                    coVar.m((Collection) obj, hashSet, type);
                    return hashSet;
                }
                HashSet hashSet2 = new HashSet();
                hashSet2.add(coVar.j(obj, null));
                return hashSet2;
            default:
                return obj;
        }
    }
}
