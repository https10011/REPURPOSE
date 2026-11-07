package io.jsonwebtoken.lang;

import defpackage.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class Collections {

    public static class EnumerationIterator<E> implements Iterator<E> {
        private Enumeration<E> enumeration;

        public EnumerationIterator(Enumeration<E> enumeration) {
            this.enumeration = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.enumeration.hasMoreElements();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.enumeration.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    private Collections() {
    }

    public static List arrayToList(Object obj) {
        return java.util.Arrays.asList(Objects.toObjectArray(obj));
    }

    public static boolean contains(Iterator it, Object obj) {
        if (it == null) {
            return false;
        }
        while (it.hasNext()) {
            if (Objects.nullSafeEquals(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAny(Collection collection, Collection collection2) {
        if (!isEmpty(collection) && !isEmpty(collection2)) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsInstance(Collection collection, Object obj) {
        if (collection == null) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == obj) {
                return true;
            }
        }
        return false;
    }

    public static Class<?> findCommonElementType(Collection collection) {
        if (isEmpty(collection)) {
            return null;
        }
        Class<?> cls = null;
        for (Object obj : collection) {
            if (obj != null) {
                if (cls == null) {
                    cls = obj.getClass();
                } else if (cls != obj.getClass()) {
                    return null;
                }
            }
        }
        return cls;
    }

    public static Object findFirstMatch(Collection collection, Collection collection2) {
        if (!isEmpty(collection) && !isEmpty(collection2)) {
            for (Object obj : collection2) {
                if (collection.contains(obj)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static <T> T findValueOfType(Collection<?> collection, Class<T> cls) {
        if (isEmpty(collection)) {
            return null;
        }
        T t = null;
        for (Object obj : collection) {
            if (cls == null || cls.isInstance(obj)) {
                if (t != null) {
                    return null;
                }
                t = (T) obj;
            }
        }
        return t;
    }

    public static boolean hasUniqueObject(Collection collection) {
        if (isEmpty(collection)) {
            return false;
        }
        Object obj = null;
        boolean z = false;
        for (Object obj2 : collection) {
            if (!z) {
                obj = obj2;
                z = true;
            } else if (obj != obj2) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static void mergeArrayIntoCollection(Object obj, Collection collection) {
        if (collection == null) {
            e.g("Collection must not be null");
            return;
        }
        for (Object obj2 : Objects.toObjectArray(obj)) {
            collection.add(obj2);
        }
    }

    public static void mergePropertiesIntoMap(Properties properties, Map map) {
        if (map == null) {
            e.g("Map must not be null");
            return;
        }
        if (properties != null) {
            Enumeration<?> enumerationPropertyNames = properties.propertyNames();
            while (enumerationPropertyNames.hasMoreElements()) {
                String str = (String) enumerationPropertyNames.nextElement();
                Object property = properties.getProperty(str);
                if (property == null) {
                    property = properties.get(str);
                }
                map.put(str, property);
            }
        }
    }

    public static int size(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static <A, E extends A> A[] toArray(Enumeration<E> enumeration, A[] aArr) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return (A[]) arrayList.toArray(aArr);
    }

    public static <E> Iterator<E> toIterator(Enumeration<E> enumeration) {
        return new EnumerationIterator(enumeration);
    }

    public static int size(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    public static boolean contains(Enumeration enumeration, Object obj) {
        if (enumeration == null) {
            return false;
        }
        while (enumeration.hasMoreElements()) {
            if (Objects.nullSafeEquals(enumeration.nextElement(), obj)) {
                return true;
            }
        }
        return false;
    }

    public static Object findValueOfType(Collection<?> collection, Class<?>[] clsArr) {
        if (!isEmpty(collection) && !Objects.isEmpty(clsArr)) {
            for (Class<?> cls : clsArr) {
                Object objFindValueOfType = findValueOfType(collection, cls);
                if (objFindValueOfType != null) {
                    return objFindValueOfType;
                }
            }
        }
        return null;
    }
}
