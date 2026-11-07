package defpackage;

import android.R;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.adjust.sdk.ActivityHandler;
import com.appsflyer.internal.d;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.hjq.toast.BuildConfig;
import com.transsion.sdk.oneid.data.GroupFpInfo;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.KeyGenerator;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class d42 {
    public static volatile Handler c = null;
    public static String m = "";
    public static boolean n;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    public static final int[] d = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] e = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] f = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] g = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] h = {R.attr.drawable};
    public static final int[] i = {R.attr.name, R.attr.animation};
    public static final boolean[] j = new boolean[3];
    public static final Object k = new Object();
    public static final Object l = new Object();

    public static String A(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            e.g("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static int F(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static cc3 H(String str) throws GeneralSecurityException {
        cc3 cc3Var;
        try {
            synchronized (l) {
                try {
                    cc3Var = new cc3(dw0.F(str));
                    byte[] bArrA = xf3.a(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrA, cc3Var.g(cc3Var.h(bArrA, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return cc3Var;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static void I(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
      0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static void J(c33 c33Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i2;
        int i3;
        if (c33Var == null) {
            e.g("Monitor must not be null");
            return;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        sQLiteDatabase2 = sQLiteDatabase;
                        try {
                            cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                            try {
                                try {
                                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                                    cursorQuery.close();
                                    if (!zMoveToFirst) {
                                        sQLiteDatabase2.execSQL(str2);
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    c33Var.w.c(str, e, "Error querying for table");
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursorQuery = null;
                            c33Var.w.c(str, e, "Error querying for table");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            sQLiteDatabase2.execSQL(str2);
                            hashSet = new HashSet();
                            StringBuilder sb = new StringBuilder(str.length() + 22);
                            sb.append("SELECT * FROM ");
                            sb.append(str);
                            sb.append(" LIMIT 0");
                            cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                            cursorRawQuery.close();
                            for (String str4 : str3.split(",")) {
                                if (hashSet.remove(str4)) {
                                    StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb2.append("Table ");
                                    sb2.append(str);
                                    sb2.append(" is missing required column: ");
                                    sb2.append(str4);
                                    throw new SQLiteException(sb2.toString());
                                }
                            }
                            if (strArr != null) {
                                for (i2 = 0; i2 < strArr.length; i2 += 2) {
                                    if (!hashSet.remove(strArr[i2])) {
                                        sQLiteDatabase2.execSQL(strArr[i2 + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                return;
                            }
                            c33Var.w.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (cursor != null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    sQLiteDatabase2 = sQLiteDatabase;
                }
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i3 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb3.append("Table ");
                        sb3.append(str);
                        sb3.append(" is missing required column: ");
                        sb3.append(str4);
                        throw new SQLiteException(sb3.toString());
                    }
                }
                if (strArr != null) {
                    while (i2 < strArr.length) {
                        if (!hashSet.remove(strArr[i2])) {
                            sQLiteDatabase2.execSQL(strArr[i2 + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    c33Var.w.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                    return;
                }
                return;
            } catch (Throwable th4) {
                cursorRawQuery.close();
                throw th4;
            }
            hashSet = new HashSet();
            StringBuilder sb4 = new StringBuilder(str.length() + 22);
            sb4.append("SELECT * FROM ");
            sb4.append(str);
            sb4.append(" LIMIT 0");
            cursorRawQuery = sQLiteDatabase2.rawQuery(sb4.toString(), null);
        } catch (SQLiteException e5) {
            c33Var.f.b(str, "Failed to verify columns on table that was just created");
            throw e5;
        }
    }

    public static Object K(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        uq1.q(ts.l(d.b("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }

    public static void L(c33 c33Var, SQLiteDatabase sQLiteDatabase) {
        if (c33Var == null) {
            e.g("Monitor must not be null");
            return;
        }
        z23 z23Var = c33Var.w;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            z23Var.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            z23Var.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            z23Var.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        z23Var.a("Failed to turn on database write permission for owner");
    }

    public static boolean M(String str) {
        synchronized (l) {
            try {
                String strF = dw0.F(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(strF)) {
                        return false;
                    }
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strF, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                    return true;
                } catch (IOException e2) {
                    throw new GeneralSecurityException(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String a() {
        if (!TextUtils.isEmpty(m)) {
            return m;
        }
        cc2.a("OneID isEnable = true");
        boolean z = n;
        String str = BuildConfig.FLAVOR;
        if (z) {
            if (f91.d == null) {
                uq1.q("You should call OneID.init first!");
                return null;
            }
            xe2 xe2Var = (xe2) f91.d.b;
            if (xe2Var != null) {
                try {
                    GroupFpInfo groupFpInfo = xe2Var.c;
                    if (groupFpInfo != null) {
                        str = groupFpInfo.vaid;
                    }
                } catch (Exception unused) {
                }
            }
        }
        m = str;
        return str;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        e.g("You must call this method on the main thread");
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void d(rr rrVar, zx0 zx0Var, qr qrVar) {
        qrVar.n = -1;
        cr crVar = qrVar.L;
        int[] iArr = qrVar.o0;
        cr crVar2 = qrVar.K;
        cr crVar3 = qrVar.I;
        cr crVar4 = qrVar.J;
        cr crVar5 = qrVar.H;
        qrVar.o = -1;
        int[] iArr2 = rrVar.o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = crVar5.g;
            int iN = rrVar.n() - crVar4.g;
            crVar5.i = zx0Var.k(crVar5);
            crVar4.i = zx0Var.k(crVar4);
            zx0Var.d(crVar5.i, i2);
            zx0Var.d(crVar4.i, iN);
            qrVar.n = 2;
            qrVar.X = i2;
            int i3 = iN - i2;
            qrVar.T = i3;
            int i4 = qrVar.a0;
            if (i3 < i4) {
                qrVar.T = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = crVar3.g;
        int iK = rrVar.k() - crVar2.g;
        crVar3.i = zx0Var.k(crVar3);
        crVar2.i = zx0Var.k(crVar2);
        zx0Var.d(crVar3.i, i5);
        zx0Var.d(crVar2.i, iK);
        if (qrVar.Z > 0 || qrVar.f0 == 8) {
            as1 as1VarK = zx0Var.k(crVar);
            crVar.i = as1VarK;
            zx0Var.d(as1VarK, qrVar.Z + i5);
        }
        qrVar.o = 2;
        qrVar.Y = i5;
        int i6 = iK - i5;
        qrVar.U = i6;
        int i7 = qrVar.b0;
        if (i6 < i7) {
            qrVar.U = i7;
        }
    }

    public static void g(String str, String str2, Object obj) {
        String strS = s(str);
        if (Log.isLoggable(strS, 3)) {
            Log.d(strS, String.format(str2, obj));
        }
    }

    public static void h(Exception exc, String str, String str2) {
        String strS = s(str);
        if (Log.isLoggable(strS, 6)) {
            Log.e(strS, str2, exc);
        }
    }

    public static final boolean i(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static int j(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static int k(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = c42.a[config.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 3) {
                return i2 != 4 ? 4 : 8;
            }
        }
        return i3;
    }

    public static Set m() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static String n(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Intent o(p7 p7Var) {
        Intent parentActivityIntent = p7Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strQ = q(p7Var, p7Var.getComponentName());
            if (strQ == null) {
                return null;
            }
            ComponentName componentName = new ComponentName((Context) p7Var, strQ);
            try {
                return q(p7Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strQ + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            sm0.s(e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Intent p(p7 p7Var, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strQ = q(p7Var, componentName);
        if (strQ == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strQ);
        return q(p7Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String q(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static ArrayList r(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String s(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static Handler t() {
        if (c == null) {
            synchronized (d42.class) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static int w(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    public static int x(int i2, Object obj) {
        return w(obj == null ? 0 : obj.hashCode(), i2);
    }

    public static void y(final Context context) {
        final boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (ea.k(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            Tasks.forResult((Object) null);
            return;
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final int i2 = 2;
        new Runnable() { // from class: a5
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                Object obj = taskCompletionSource;
                boolean z2 = z;
                Object obj2 = context;
                switch (i3) {
                    case 0:
                        ActivityHandler.s((ActivityHandler) obj2, z2, (String) obj);
                        return;
                    case 1:
                        ActivityHandler.M((ActivityHandler) obj2, z2, (String) obj);
                        return;
                    default:
                        Context context2 = (Context) obj2;
                        TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
                        try {
                            if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                                SharedPreferences.Editor editorEdit = ea.k(context2).edit();
                                editorEdit.putBoolean("proxy_notification_initialized", true);
                                editorEdit.apply();
                                NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                                if (z2) {
                                    notificationManager.setNotificationDelegate("com.google.android.gms");
                                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                    notificationManager.setNotificationDelegate(null);
                                }
                            } else {
                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                            }
                            return;
                        } finally {
                            taskCompletionSource2.trySetResult((Object) null);
                        }
                }
            }
        }.run();
        taskCompletionSource.getTask();
    }

    public static boolean z(int i2, int i3) {
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            return i3 > 0 || i3 == Integer.MIN_VALUE;
        }
        return false;
    }

    public abstract void C(int i2);

    public abstract void D(View view, int i2, int i3);

    public abstract void E(View view, float f2, float f3);

    public abstract boolean G(View view, int i2);

    public abstract int e(View view, int i2);

    public abstract int f(View view, int i2);

    public abstract void l(yp1 yp1Var, float f2, float f3);

    public int u(View view) {
        return 0;
    }

    public int v() {
        return 0;
    }

    public void B(View view, int i2) {
    }
}
