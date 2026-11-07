package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w12 extends gb2 {
    public static final Class X;
    public static final Constructor Y;
    public static final Method Z;
    public static final Method a0;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        Y = constructor;
        X = cls;
        Z = method2;
        a0 = method;
    }

    public static boolean N(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) Z.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface O(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) X, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) a0.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.gb2
    public final Typeface j(Context context, je0 je0Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = Y.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (ke0 ke0Var : je0Var.a) {
                int i2 = ke0Var.f;
                File fileA = nj2.A(context);
                if (fileA != null) {
                    try {
                        if (nj2.r(fileA, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileA);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileA.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileA.delete();
                        }
                        if (map != null && N(objNewInstance, map, ke0Var.e, ke0Var.b, ke0Var.c)) {
                        }
                    } catch (Throwable th3) {
                        fileA.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return O(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.gb2
    public final Typeface k(Context context, me0[] me0VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = Y.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            wq1 wq1Var = new wq1(0);
            for (me0 me0Var : me0VarArr) {
                Uri uri = me0Var.a;
                ByteBuffer byteBufferK = (ByteBuffer) wq1Var.get(uri);
                if (byteBufferK == null) {
                    byteBufferK = nj2.K(context, uri);
                    wq1Var.put(uri, byteBufferK);
                }
                if (byteBufferK != null && N(objNewInstance, byteBufferK, me0Var.b, me0Var.c, me0Var.d)) {
                }
            }
            Typeface typefaceO = O(objNewInstance);
            if (typefaceO != null) {
                return Typeface.create(typefaceO, i);
            }
        }
        return null;
    }
}
