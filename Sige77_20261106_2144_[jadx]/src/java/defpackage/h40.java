package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h40 {
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static ye3 m;
    public static zf3 n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final xv1 k = new xv1(4);
    public static final r41 l = new r41(17);
    public static final k42 b = new k42(19);
    public static final nk1 c = new nk1(20);
    public static final op0 d = new op0(21);

    public h40(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (jw.j(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023c A[Catch: all -> 0x0225, d40 -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, d40 -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x024d A[Catch: all -> 0x0225, d40 -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, d40 -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0263 A[Catch: all -> 0x0225, d40 -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, d40 -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x026c A[Catch: all -> 0x0225, d40 -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, d40 -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0274 A[Catch: all -> 0x0225, d40 -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, d40 -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x027e A[Catch: all -> 0x0225, d40 -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, d40 -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x028c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:136:0x0301  */
    /* JADX WARN: Code duplicated, block: B:139:0x030a  */
    /* JADX WARN: Code duplicated, block: B:144:0x031b A[Catch: all -> 0x00b8, TryCatch #12 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a0, B:128:0x02af, B:130:0x02d7, B:132:0x02e7, B:142:0x0313, B:143:0x031a, B:123:0x02a3, B:124:0x02a4, B:125:0x02ab, B:144:0x031b, B:145:0x033b, B:146:0x033c, B:147:0x0389), top: B:168:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #12 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a0, B:128:0x02af, B:130:0x02d7, B:132:0x02e7, B:142:0x0313, B:143:0x031a, B:123:0x02a3, B:124:0x02a4, B:125:0x02ab, B:144:0x031b, B:145:0x033b, B:146:0x033c, B:147:0x0389), top: B:168:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[Catch: all -> 0x0288, TryCatch #5 {all -> 0x0288, blocks: (B:34:0x00f1, B:36:0x00f7, B:37:0x00f9), top: B:163:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: all -> 0x0173, d40 -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x017d, d40 -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[Catch: all -> 0x0173, d40 -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, d40 -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[Catch: all -> 0x0173, d40 -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x017d, d40 -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9 A[Catch: all -> 0x0173, d40 -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, d40 -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4 A[Catch: all -> 0x0173, d40 -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, d40 -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7 A[Catch: all -> 0x0173, d40 -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, d40 -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x020a A[Catch: all -> 0x0173, d40 -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, d40 -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0212 A[Catch: all -> 0x0173, d40 -> 0x0178, RemoteException -> 0x017d, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x017d, d40 -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022e A[Catch: all -> 0x0225, d40 -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, d40 -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [g40] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static h40 c(Context context, g40 g40Var, String str) throws d40 {
        ?? r7;
        int i2;
        h40 h40Var;
        Cursor cursor;
        int i3;
        Boolean bool;
        ye3 ye3VarH;
        int i4;
        en0 en0VarI;
        Object objI;
        zb3 zb3Var;
        zf3 zf3Var;
        zb3 zb3Var2;
        boolean z;
        en0 en0VarI2;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new d40("null application Context");
        }
        ThreadLocal threadLocal = j;
        zb3 zb3Var3 = (zb3) threadLocal.get();
        zb3 zb3Var4 = new zb3();
        threadLocal.set(zb3Var4);
        xv1 xv1Var = k;
        Long l2 = (Long) xv1Var.get();
        long jLongValue = l2.longValue();
        try {
            xv1Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            f40 f40VarE = g40Var.e(context, str, l);
            int i5 = f40VarE.a;
            int i6 = f40VarE.b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i5).length() + 19 + str.length() + 1 + String.valueOf(i6).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i6);
            Log.i("DynamiteModule", sb.toString());
            int i7 = f40VarE.c;
            if (i7 != 0) {
                if (i7 != -1) {
                    if (i7 == 1 || f40VarE.b != 0) {
                        if (i7 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            h40 h40Var2 = new h40(applicationContext);
                            if (jLongValue == 0) {
                                xv1Var.remove();
                            } else {
                                xv1Var.set(l2);
                            }
                            cursor2 = zb3Var4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zb3Var3);
                            return h40Var2;
                        }
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i7);
                            throw new d40(sb2.toString());
                        }
                        try {
                            try {
                                i3 = f40VarE.b;
                                try {
                                    try {
                                        try {
                                            synchronized (h40.class) {
                                                try {
                                                    if (e(context)) {
                                                        throw new d40("Remote loading disabled");
                                                    }
                                                    bool = e;
                                                    if (bool != null) {
                                                        throw new d40("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i3);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (h40.class) {
                                                            zf3Var = n;
                                                        }
                                                        if (zf3Var != null) {
                                                            throw new d40("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        zb3Var2 = (zb3) threadLocal.get();
                                                        if (zb3Var2 != null || zb3Var2.a == null) {
                                                            throw new d40("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = zb3Var2.a;
                                                        new e81(null);
                                                        synchronized (h40.class) {
                                                            z = h >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            en0VarI2 = zf3Var.J(new e81(applicationContext2), str, i3, new e81(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            en0VarI2 = zf3Var.I(new e81(applicationContext2), str, i3, new e81(cursor3));
                                                        }
                                                        Context context2 = (Context) e81.I(en0VarI2);
                                                        if (context2 == null) {
                                                            throw new d40("Failed to get module context");
                                                        }
                                                        h40Var = new h40(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i3);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        ye3VarH = h(context);
                                                        if (ye3VarH != null) {
                                                            throw new d40("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelD = ye3VarH.D(ye3VarH.F(), 6);
                                                        i4 = parcelD.readInt();
                                                        parcelD.recycle();
                                                        if (i4 >= 3) {
                                                            zb3Var = (zb3) threadLocal.get();
                                                            if (zb3Var != null) {
                                                                throw new d40("No cached result cursor holder");
                                                            }
                                                            en0VarI = ye3VarH.L(new e81(context), str, i3, new e81(zb3Var.a));
                                                        } else if (i4 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            en0VarI = ye3VarH.J(new e81(context), str, i3);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            en0VarI = ye3VarH.I(new e81(context), str, i3);
                                                        }
                                                        objI = e81.I(en0VarI);
                                                        if (objI != null) {
                                                            throw new d40("Failed to load remote module.");
                                                        }
                                                        h40Var = new h40((Context) objI);
                                                    }
                                                    if (jLongValue == 0) {
                                                        k.remove();
                                                    } else {
                                                        k.set(l2);
                                                    }
                                                    cursor = zb3Var4.a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    j.set(zb3Var3);
                                                    return h40Var;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (RemoteException e2) {
                                        e = e2;
                                        throw new d40("Failed to load remote module.", e);
                                    } catch (d40 e3) {
                                        throw e3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw new d40("Failed to load remote module.", th);
                                    }
                                } catch (RemoteException e4) {
                                    e = e4;
                                    throw new d40("Failed to load remote module.", e);
                                } catch (d40 e5) {
                                    throw e5;
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw new d40("Failed to load remote module.", th);
                                }
                            } catch (d40 e6) {
                                e = e6;
                                r7 = context;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i2 = f40VarE.a;
                                if (i2 != 0 || g40Var.e(r7, str, new jf2(i2, 5)).c != -1) {
                                    throw new d40("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                h40Var = new h40(applicationContext);
                            }
                        } catch (d40 e7) {
                            e = e7;
                            r7 = xv1Var;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i2 = f40VarE.a;
                            if (i2 != 0) {
                            }
                            throw new d40("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (f40VarE.a != 0) {
                    i7 = -1;
                    if (i7 == 1) {
                    }
                    if (i7 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        h40 h40Var3 = new h40(applicationContext);
                        if (jLongValue == 0) {
                            xv1Var.remove();
                        } else {
                            xv1Var.set(l2);
                        }
                        cursor2 = zb3Var4.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(zb3Var3);
                        return h40Var3;
                    }
                    if (i7 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i7).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i7);
                        throw new d40(sb7.toString());
                    }
                    i3 = f40VarE.b;
                    synchronized (h40.class) {
                        if (e(context)) {
                            throw new d40("Remote loading disabled");
                        }
                        bool = e;
                        if (bool != null) {
                            throw new d40("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i3);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (h40.class) {
                                zf3Var = n;
                                if (zf3Var != null) {
                                    throw new d40("DynamiteLoaderV2 was not cached.");
                                }
                                zb3Var2 = (zb3) threadLocal.get();
                                if (zb3Var2 != null) {
                                }
                                throw new d40("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i3);
                        Log.i("DynamiteModule", sb9.toString());
                        ye3VarH = h(context);
                        if (ye3VarH != null) {
                            throw new d40("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelD2 = ye3VarH.D(ye3VarH.F(), 6);
                        i4 = parcelD2.readInt();
                        parcelD2.recycle();
                        if (i4 >= 3) {
                            zb3Var = (zb3) threadLocal.get();
                            if (zb3Var != null) {
                                throw new d40("No cached result cursor holder");
                            }
                            en0VarI = ye3VarH.L(new e81(context), str, i3, new e81(zb3Var.a));
                        } else if (i4 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            en0VarI = ye3VarH.J(new e81(context), str, i3);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            en0VarI = ye3VarH.I(new e81(context), str, i3);
                        }
                        objI = e81.I(en0VarI);
                        if (objI != null) {
                            throw new d40("Failed to load remote module.");
                        }
                        h40Var = new h40((Context) objI);
                        if (jLongValue == 0) {
                            k.remove();
                        } else {
                            k.set(l2);
                        }
                        cursor = zb3Var4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        j.set(zb3Var3);
                        return h40Var;
                    }
                }
            }
            int i8 = f40VarE.a;
            int i9 = f40VarE.b;
            StringBuilder sb10 = new StringBuilder(str.length() + 46 + String.valueOf(i8).length() + 23 + String.valueOf(i9).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i8);
            sb10.append(" and remote version is ");
            sb10.append(i9);
            sb10.append(".");
            throw new d40(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                k.remove();
            } else {
                k.set(l2);
            }
            Cursor cursor4 = zb3Var4.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            j.set(zb3Var3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #13 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:152:0x002b, inners: #1 }] */
    public static int d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i2;
        Cursor cursor;
        try {
            synchronized (h40.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (d40 unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z, true);
                                                String str2 = f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderV = gu2.V();
                                                    if (classLoaderV == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            c40.c();
                                                            String str3 = f;
                                                            gu2.o(str3);
                                                            classLoaderV = c40.b(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f;
                                                            gu2.o(str4);
                                                            classLoaderV = new cy2(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    g(classLoaderV);
                                                    declaredField.set(null, classLoaderV);
                                                    e = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (d40 unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (d40 e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                ye3 ye3VarH = h(context);
                try {
                    if (ye3VarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelD = ye3VarH.D(ye3VarH.F(), 6);
                        int i3 = parcelD.readInt();
                        parcelD.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = j;
                            zb3 zb3Var = (zb3) threadLocal.get();
                            if (zb3Var != null && (cursor = zb3Var.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) e81.I(ye3VarH.K(new e81(context), str, z, ((Long) k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i2 = cursor3.getInt(0);
                                        if (i2 > 0) {
                                            zb3 zb3Var2 = (zb3) threadLocal.get();
                                            if (zb3Var2 == null || zb3Var2.a != null) {
                                                z2 = false;
                                            } else {
                                                zb3Var2.a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    remoteException = e4;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            e81 e81Var = new e81(context);
                            Parcel parcelF = ye3VarH.F();
                            xv2.b(parcelF, e81Var);
                            parcelF.writeString(str);
                            parcelF.writeInt(z ? 1 : 0);
                            Parcel parcelD2 = ye3VarH.D(parcelF, 5);
                            i2 = parcelD2.readInt();
                            parcelD2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            e81 e81Var2 = new e81(context);
                            Parcel parcelF2 = ye3VarH.F();
                            xv2.b(parcelF2, e81Var2);
                            parcelF2.writeString(str);
                            parcelF2.writeInt(z ? 1 : 0);
                            Parcel parcelD3 = ye3VarH.D(parcelF2, 3);
                            i2 = parcelD3.readInt();
                            parcelD3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e5) {
                        remoteException = e5;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                gu2.o(context);
                throw th5;
            } catch (Exception e6) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
                throw th5;
            }
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (rj0.b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (h40.class) {
                                    try {
                                        f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            g = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                zb3 zb3Var = (zb3) j.get();
                                if (zb3Var == null || zb3Var.a != null) {
                                    z4 = false;
                                } else {
                                    zb3Var.a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new d40("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof d40) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new d40(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new d40("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void g(ClassLoader classLoader) throws d40 {
        try {
            zf3 zf3Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zf3Var = iInterfaceQueryLocalInterface instanceof zf3 ? (zf3) iInterfaceQueryLocalInterface : new zf3(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 3);
            }
            n = zf3Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new d40("Failed to instantiate dynamite loader", e2);
        }
    }

    public static ye3 h(Context context) {
        ye3 ye3Var;
        synchronized (h40.class) {
            ye3 ye3Var2 = m;
            if (ye3Var2 != null) {
                return ye3Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    ye3Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    ye3Var = iInterfaceQueryLocalInterface instanceof ye3 ? (ye3) iInterfaceQueryLocalInterface : new ye3(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 3);
                }
                if (ye3Var != null) {
                    m = ye3Var;
                    return ye3Var;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws d40 {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new d40("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
