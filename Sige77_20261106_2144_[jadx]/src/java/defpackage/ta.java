package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ta {
    public static boolean d = true;
    public static Thread f;
    public static volatile Handler g;
    public static final tl a = new tl();
    public static final r41 b = new r41(8);
    public static final Type[] c = new Type[0];
    public static final Object e = new Object();

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type A(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeA;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeA2 = A(type, cls, componentType);
                        return componentType == typeA2 ? cls2 : new yk0(1, typeA2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeA3 = A(type, cls, genericComponentType);
                    return genericComponentType == typeA3 ? genericArrayType : new yk0(1, typeA3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeA4 = A(type, cls, ownerType);
                    boolean z = typeA4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeA5 = A(type, cls, actualTypeArguments[i]);
                        if (typeA5 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeA5;
                        }
                        i++;
                    }
                    return z ? new zk0(typeA4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeA6 = A(type, cls, lowerBounds[0]);
                        if (typeA6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new al0(new Type[]{Object.class}, new Type[]{typeA6}, 1);
                        }
                    } else if (upperBounds.length == 1 && (typeA = A(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new al0(new Type[]{typeA}, c, 1);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeK = k(type, cls, cls3);
                if (typeK instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            uq1.a();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeK).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    public static void B(Activity activity) {
        View viewK;
        int iHashCode = activity.hashCode();
        HashMap map = r62.d;
        HashMap map2 = null;
        if (!mt.a.contains(r62.class)) {
            try {
                map2 = r62.d;
            } catch (Throwable th) {
                mt.a(r62.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object r62Var = map2.get(numValueOf);
        if (r62Var == null) {
            r62Var = new r62(activity);
            map2.put(numValueOf, r62Var);
        }
        r62 r62Var2 = (r62) r62Var;
        Set set = mt.a;
        if (set.contains(r62.class)) {
            return;
        }
        try {
            if (set.contains(r62Var2)) {
                return;
            }
            try {
                if (!r62Var2.c.getAndSet(true) && (viewK = ga.k((Activity) r62Var2.a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewK.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(r62Var2);
                        r62Var2.a();
                        return;
                    }
                    return;
                    mt.a(r62.class, th);
                }
            } catch (Throwable th2) {
                mt.a(r62Var2, th2);
            }
        } catch (Throwable th3) {
            mt.a(r62.class, th3);
        }
    }

    public static void C(Activity activity) {
        View viewK;
        int iHashCode = activity.hashCode();
        HashMap map = r62.d;
        HashMap map2 = null;
        if (!mt.a.contains(r62.class)) {
            try {
                map2 = r62.d;
            } catch (Throwable th) {
                mt.a(r62.class, th);
            }
        }
        r62 r62Var = (r62) map2.remove(Integer.valueOf(iHashCode));
        if (r62Var != null) {
            Set set = mt.a;
            if (set.contains(r62.class)) {
                return;
            }
            try {
                if (!set.contains(r62Var)) {
                    try {
                        if (r62Var.c.getAndSet(false) && (viewK = ga.k((Activity) r62Var.a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = viewK.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(r62Var);
                            }
                        }
                    } catch (Throwable th2) {
                        mt.a(r62Var, th2);
                    }
                }
            } catch (Throwable th3) {
                mt.a(r62.class, th3);
            }
        }
    }

    public static final long D(String str, long j, long j2, long j3) {
        String property;
        int i = vv1.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lE = StringsKt.E(property);
        if (lE == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lE.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int E(int i, int i2, String str) {
        return (int) D(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static void F(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String G(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0187 A[Catch: all -> 0x0184, TRY_ENTER, TryCatch #15 {all -> 0x0184, blocks: (B:92:0x0163, B:94:0x016f, B:105:0x0187, B:106:0x018c), top: B:238:0x0163, outer: #27 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0198 A[Catch: IllegalStateException -> 0x017e, IOException -> 0x0180, FileNotFoundException -> 0x0182, TRY_LEAVE, TryCatch #27 {FileNotFoundException -> 0x0182, IOException -> 0x0180, IllegalStateException -> 0x017e, blocks: (B:90:0x015b, B:95:0x0179, B:113:0x0198, B:111:0x0195, B:110:0x0192, B:92:0x0163, B:94:0x016f, B:105:0x0187, B:106:0x018c, B:107:0x018d), top: B:260:0x015b, inners: #15, #24 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d1 A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #32 {all -> 0x01df, blocks: (B:128:0x01c5, B:130:0x01d1, B:139:0x01e2), top: B:253:0x01c5, outer: #29 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x01e2 A[Catch: all -> 0x01df, TRY_ENTER, TRY_LEAVE, TryCatch #32 {all -> 0x01df, blocks: (B:128:0x01c5, B:130:0x01d1, B:139:0x01e2), top: B:253:0x01c5, outer: #29 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:154:0x0207  */
    /* JADX WARN: Code duplicated, block: B:155:0x020b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0225 A[Catch: all -> 0x0247, TRY_LEAVE, TryCatch #17 {all -> 0x0247, blocks: (B:160:0x021d, B:161:0x021f, B:163:0x0225), top: B:235:0x021d }] */
    /* JADX WARN: Code duplicated, block: B:204:0x0274  */
    /* JADX WARN: Code duplicated, block: B:207:0x027d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x028c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x016f A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #15 {all -> 0x0184, blocks: (B:92:0x0163, B:94:0x016f, B:105:0x0187, B:106:0x018c), top: B:238:0x0163, outer: #27 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void H(Context context, Executor executor, gd1 gd1Var, boolean z) {
        char c2;
        FileInputStream fileInputStreamA;
        k10[] k10VarArrR;
        gd1 gd1Var2;
        k10[] k10VarArr;
        byte[] bArr;
        byte[] bArr2;
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        g10 g10Var;
        FileInputStream fileInputStreamA2;
        boolean z3;
        boolean z4;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z4 = j == packageInfo.lastUpdateTime;
                            if (z4) {
                                gd1Var.l(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    ld1.c(false, context);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = jw.c;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            g10 g10Var2 = new g10(assets, executor, gd1Var, name, file2);
            byte[] bArr5 = g10Var2.c;
            if (bArr5 == null) {
                g10Var2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                g10Var2.b(4, null);
                            }
                            if (z2 || !z) {
                                z3 = 0;
                            } else {
                                z3 = c2;
                            }
                            ld1.c(z3, context);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            c2 = 1;
                            g10Var2.b(4, null);
                            z2 = false;
                        }
                        fileInputStreamA = g10Var2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        gd1Var.l(6, e2);
                        fileInputStreamA = null;
                    } catch (IOException e3) {
                        gd1Var.l(7, e3);
                        fileInputStreamA = null;
                    }
                    if (fileInputStreamA != null) {
                        try {
                            if (!Arrays.equals(bArr4, x(fileInputStreamA, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            k10VarArrR = jw.r(fileInputStreamA, x(fileInputStreamA, 4), g10Var2.e);
                            try {
                                fileInputStreamA.close();
                            } catch (IOException e4) {
                                gd1Var.l(7, e4);
                            }
                            g10Var2.g = k10VarArrR;
                        } catch (IOException e5) {
                            gd1Var.l(7, e5);
                            try {
                                fileInputStreamA.close();
                            } catch (IOException e6) {
                                gd1Var.l(7, e6);
                            }
                            k10VarArrR = null;
                        } catch (IllegalStateException e7) {
                            gd1Var.l(8, e7);
                            fileInputStreamA.close();
                            k10VarArrR = null;
                        }
                    }
                    k10[] k10VarArr2 = g10Var2.g;
                    if (k10VarArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                        if (i2 == 24 || i2 == 25) {
                            try {
                                fileInputStreamA2 = g10Var2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 == null) {
                                    try {
                                        if (Arrays.equals(jw.d, x(fileInputStreamA2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        g10Var2.g = jw.o(fileInputStreamA2, x(fileInputStreamA2, 4), bArr5, k10VarArr2);
                                        fileInputStreamA2.close();
                                        g10Var = g10Var2;
                                    } catch (Throwable th4) {
                                        try {
                                            fileInputStreamA2.close();
                                            throw th4;
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                            throw th4;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    g10Var = null;
                                }
                            } catch (FileNotFoundException e8) {
                                gd1Var.l(9, e8);
                                g10Var = null;
                            } catch (IOException e9) {
                                gd1Var.l(7, e9);
                                g10Var = null;
                            } catch (IllegalStateException e10) {
                                g10Var2.g = null;
                                gd1Var.l(8, e10);
                                g10Var = null;
                            }
                            if (g10Var != null) {
                                g10Var2 = g10Var;
                            }
                        } else {
                            switch (i2) {
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                    fileInputStreamA2 = g10Var2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA2 == null) {
                                        if (fileInputStreamA2 != null) {
                                            fileInputStreamA2.close();
                                        }
                                        g10Var = null;
                                    } else {
                                        if (Arrays.equals(jw.d, x(fileInputStreamA2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        g10Var2.g = jw.o(fileInputStreamA2, x(fileInputStreamA2, 4), bArr5, k10VarArr2);
                                        fileInputStreamA2.close();
                                        g10Var = g10Var2;
                                    }
                                    if (g10Var != null) {
                                        g10Var2 = g10Var;
                                        break;
                                    }
                                default:
                                    gd1Var2 = g10Var2.b;
                                    k10VarArr = g10Var2.g;
                                    bArr = g10Var2.c;
                                    if (k10VarArr != null && bArr != null) {
                                        if (g10Var2.f) {
                                            uq1.q("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            return;
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(bArr4);
                                                byteArrayOutputStream.write(bArr);
                                                if (jw.x(byteArrayOutputStream, bArr, k10VarArr)) {
                                                    g10Var2.h = byteArrayOutputStream.toByteArray();
                                                    byteArrayOutputStream.close();
                                                    g10Var2.g = null;
                                                } else {
                                                    gd1Var2.l(5, null);
                                                    g10Var2.g = null;
                                                    byteArrayOutputStream.close();
                                                }
                                            } catch (Throwable th6) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (IOException e11) {
                                            gd1Var2.l(7, e11);
                                        } catch (IllegalStateException e12) {
                                            gd1Var2.l(8, e12);
                                        }
                                    }
                                    bArr2 = g10Var2.h;
                                    if (bArr2 != null) {
                                        z2 = false;
                                        c2 = 1;
                                    } else {
                                        try {
                                            if (g10Var2.f) {
                                                uq1.q("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                return;
                                            }
                                            try {
                                                try {
                                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                    try {
                                                        fileOutputStream = new FileOutputStream(g10Var2.d);
                                                        try {
                                                            try {
                                                                bArr3 = new byte[512];
                                                                while (true) {
                                                                    i = byteArrayInputStream.read(bArr3);
                                                                    if (i > 0) {
                                                                        fileOutputStream.write(bArr3, 0, i);
                                                                    } else {
                                                                        c2 = 1;
                                                                        try {
                                                                            g10Var2.b(1, null);
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            g10Var2.h = null;
                                                                            g10Var2.g = null;
                                                                            z2 = true;
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                        }
                                                                    }
                                                                    th = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th;
                                                                    } catch (Throwable th9) {
                                                                        th.addSuppressed(th9);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                Throwable th11 = th;
                                                                try {
                                                                    byteArrayInputStream.close();
                                                                    throw th11;
                                                                } catch (Throwable th12) {
                                                                    th11.addSuppressed(th12);
                                                                    throw th11;
                                                                }
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (FileNotFoundException e13) {
                                                    e = e13;
                                                    c2 = 1;
                                                    g10Var2.b(6, e);
                                                    g10Var2.h = null;
                                                    g10Var2.g = null;
                                                    z2 = false;
                                                } catch (IOException e14) {
                                                    e = e14;
                                                    c2 = 1;
                                                    g10Var2.b(7, e);
                                                    g10Var2.h = null;
                                                    g10Var2.g = null;
                                                    z2 = false;
                                                }
                                            } catch (FileNotFoundException e15) {
                                                e = e15;
                                                g10Var2.b(6, e);
                                                g10Var2.h = null;
                                                g10Var2.g = null;
                                                z2 = false;
                                            } catch (IOException e16) {
                                                e = e16;
                                                g10Var2.b(7, e);
                                                g10Var2.h = null;
                                                g10Var2.g = null;
                                                z2 = false;
                                            }
                                        } catch (Throwable th15) {
                                            g10Var2.h = null;
                                            g10Var2.g = null;
                                            throw th15;
                                        }
                                    }
                                    if (z2) {
                                        u(packageInfo, filesDir);
                                    }
                                    if (z2) {
                                        z3 = 0;
                                    } else {
                                        z3 = 0;
                                    }
                                    ld1.c(z3, context);
                            }
                        }
                    }
                    gd1Var2 = g10Var2.b;
                    k10VarArr = g10Var2.g;
                    bArr = g10Var2.c;
                    if (k10VarArr != null) {
                        if (g10Var2.f) {
                            uq1.q("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            return;
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr4);
                        byteArrayOutputStream.write(bArr);
                        if (jw.x(byteArrayOutputStream, bArr, k10VarArr)) {
                            gd1Var2.l(5, null);
                            g10Var2.g = null;
                            byteArrayOutputStream.close();
                        } else {
                            g10Var2.h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            g10Var2.g = null;
                        }
                    }
                    bArr2 = g10Var2.h;
                    if (bArr2 != null) {
                        if (g10Var2.f) {
                            uq1.q("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            return;
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream(g10Var2.d);
                        bArr3 = new byte[512];
                        while (true) {
                            i = byteArrayInputStream.read(bArr3);
                            if (i > 0) {
                                fileOutputStream.write(bArr3, 0, i);
                            } else {
                                c2 = 1;
                                g10Var2.b(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                g10Var2.h = null;
                                g10Var2.g = null;
                                z2 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z2 = false;
                    c2 = 1;
                    if (z2) {
                        u(packageInfo, filesDir);
                    }
                    if (z2) {
                        z3 = 0;
                    } else {
                        z3 = 0;
                    }
                    ld1.c(z3, context);
                } catch (Throwable th16) {
                    try {
                        fileInputStreamA.close();
                        throw th16;
                    } catch (IOException e17) {
                        gd1Var.l(7, e17);
                        throw th16;
                    }
                }
                g10Var2.f = true;
                c2 = '\b';
            }
            c2 = 1;
            z2 = false;
            if (z2) {
                z3 = 0;
            } else {
                z3 = 0;
            }
            ld1.c(z3, context);
        } catch (PackageManager.NameNotFoundException e18) {
            gd1Var.l(7, e18);
            ld1.c(false, context);
        }
    }

    public static void I(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void J(ByteArrayOutputStream byteArrayOutputStream, int i) {
        I(byteArrayOutputStream, i, 2);
    }

    public static String K(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(L(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(L(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String L(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strL = y00.l(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strL), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(strL.length() + 8 + name2.length() + 1);
            ts.r(sb, "<", strL, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static p11 M(AbstractSafeParcelable abstractSafeParcelable) {
        return new p11(abstractSafeParcelable.getClass().getSimpleName(), 26);
    }

    public static boolean N(Thread thread) {
        if (f == null) {
            f = Looper.getMainLooper().getThread();
        }
        return thread == f;
    }

    public static Handler O() {
        if (g == null) {
            synchronized (e) {
                try {
                    if (g == null) {
                        g = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static final void P(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        yk ykVar = new yk(level, exc, str, objArr, 6, false);
        int i = to3.a;
        executor.execute(new oo3(new Ref.ObjectRef(), vm3.a(), ykVar));
    }

    public static final ds a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(k42.c) == null) {
            coroutineContext = coroutineContext.plus(new ys0());
        }
        return new ds(coroutineContext);
    }

    public static int b(jj jjVar, boolean z) {
        int i = jjVar.b;
        int i2 = jjVar.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) jjVar.d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b3 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b3 == b2) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b2 = b3;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    public static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            sm0.a();
        }
    }

    public static byte[] d(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static final Object e(Function2 function2, fs fsVar) throws Throwable {
        em1 em1Var = new em1(fsVar, fsVar.getContext());
        Object objP = yv2.P(em1Var, em1Var, function2);
        ft ftVar = ft.a;
        return objP;
    }

    public static boolean f(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = f(file2) && z;
        }
        return z;
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean h(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return h(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type k(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return k(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return k(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type l(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbU = ck1.u(i, "Index ", " not in range [0,");
        sbU.append(actualTypeArguments.length);
        sbU.append(") for ");
        sbU.append(parameterizedType);
        throw new IllegalArgumentException(sbU.toString());
    }

    public static Class m(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            sm0.a();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        uq1.j(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type o(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return A(type, cls, k(type, cls, Map.class));
        }
        sm0.a();
        return null;
    }

    public static boolean p(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return p(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            uq1.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (p(type2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException s(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    public static void t(Object obj, Object obj2, String str) {
        throw new RuntimeException(str + " expected: " + obj + ", but received: " + obj2);
    }

    public static void u(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static IllegalArgumentException v(Method method, int i, String str, Object... objArr) {
        return s(method, null, str + " (" + rb1.b.d(method, i) + ")", objArr);
    }

    public static IllegalArgumentException w(Method method, Exception exc, int i, String str, Object... objArr) {
        return s(method, exc, str + " (" + rb1.b.d(method, i) + ")", objArr);
    }

    public static byte[] x(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                uq1.q(ck1.r(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] y(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long z(InputStream inputStream, int i) {
        byte[] bArrX = x(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrX[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public abstract Method i(Class cls, Field field);

    public abstract Constructor j(Class cls);

    public abstract String[] n(Class cls);

    public abstract boolean r(Class cls);
}
