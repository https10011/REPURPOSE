package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class v12 extends gb2 {
    public static Class X;
    public static Constructor Y;
    public static Method Z;
    public static Method a0;
    public static boolean b0;

    public static boolean N(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        O();
        try {
            return ((Boolean) Z.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            sm0.n(e);
            return false;
        }
    }

    public static void O() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (b0) {
            return;
        }
        b0 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        Y = constructor;
        X = cls;
        Z = method2;
        a0 = method;
    }

    @Override // defpackage.gb2
    public Typeface j(Context context, je0 je0Var, Resources resources, int i) throws NoSuchMethodException {
        O();
        try {
            Object objNewInstance = Y.newInstance(null);
            for (ke0 ke0Var : je0Var.a) {
                File fileA = nj2.A(context);
                if (fileA == null) {
                    return null;
                }
                try {
                    if (!nj2.r(fileA, resources, ke0Var.f)) {
                        return null;
                    }
                    if (!N(objNewInstance, fileA.getPath(), ke0Var.b, ke0Var.c)) {
                        return null;
                    }
                    fileA.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileA.delete();
                }
            }
            O();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) X, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) a0.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                sm0.n(e);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            sm0.n(e2);
            return null;
        }
    }

    @Override // defpackage.gb2
    public Typeface k(Context context, me0[] me0VarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (me0VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(gb2.o(me0VarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileA = nj2.A(context);
                        if (fileA == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (nj2.s(fileA, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
                                    fileA.delete();
                                } else {
                                    fileA.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileA.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
