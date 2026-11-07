package io.jsonwebtoken.impl.lang;

import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class Services {
    private static final List<ClassLoaderAccessor> CLASS_LOADER_ACCESSORS = Collections.arrayToList(new ClassLoaderAccessor[]{new ClassLoaderAccessor() { // from class: io.jsonwebtoken.impl.lang.Services.1
        @Override // io.jsonwebtoken.impl.lang.Services.ClassLoaderAccessor
        public ClassLoader getClassLoader() {
            return Thread.currentThread().getContextClassLoader();
        }
    }, new ClassLoaderAccessor() { // from class: io.jsonwebtoken.impl.lang.Services.2
        @Override // io.jsonwebtoken.impl.lang.Services.ClassLoaderAccessor
        public ClassLoader getClassLoader() {
            return Services.class.getClassLoader();
        }
    }, new ClassLoaderAccessor() { // from class: io.jsonwebtoken.impl.lang.Services.3
        @Override // io.jsonwebtoken.impl.lang.Services.ClassLoaderAccessor
        public ClassLoader getClassLoader() {
            return ClassLoader.getSystemClassLoader();
        }
    }});

    public interface ClassLoaderAccessor {
        ClassLoader getClassLoader();
    }

    private Services() {
    }

    public static <T> List<T> loadAll(Class<T> cls) {
        Assert.notNull(cls, "Parameter 'spi' must not be null.");
        Iterator<ClassLoaderAccessor> it = CLASS_LOADER_ACCESSORS.iterator();
        while (it.hasNext()) {
            List listLoadAll = loadAll(cls, it.next().getClassLoader());
            if (!listLoadAll.isEmpty()) {
                return java.util.Collections.unmodifiableList(listLoadAll);
            }
        }
        throw new UnavailableImplementationException(cls);
    }

    public static <T> T loadFirst(Class<T> cls) {
        Assert.notNull(cls, "Parameter 'spi' must not be null.");
        Iterator<ClassLoaderAccessor> it = CLASS_LOADER_ACCESSORS.iterator();
        while (it.hasNext()) {
            T t = (T) loadFirst(cls, it.next().getClassLoader());
            if (t != null) {
                return t;
            }
        }
        throw new UnavailableImplementationException(cls);
    }

    private static <T> T loadFirst(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
        if (serviceLoaderLoad.iterator().hasNext()) {
            return (T) serviceLoaderLoad.iterator().next();
        }
        return null;
    }

    private static <T> List<T> loadAll(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        Iterator it = serviceLoaderLoad.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
