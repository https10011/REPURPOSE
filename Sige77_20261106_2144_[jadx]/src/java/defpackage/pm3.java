package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class pm3 {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa A[SYNTHETIC] */
    public static void a(Throwable th) {
        Throwable cause;
        u41 u41Var;
        Closeable closeable;
        int i;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                u41Var = null;
            } else {
                weakHashMap2.put(th, (jm3) weakHashMap2.get(cause2));
                u41Var = new u41(23);
            }
        }
        if (u41Var != null || (closeable = vm3.c().b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = vm3.c().b; closeable != null; closeable = ((gm3) closeable).a) {
            arrayList.add(closeable);
        }
        UUID uuid = ((gm3) ((bo3) arrayList.get(0))).b;
        if (uuid == null) {
            uq1.h("Null rootTraceId");
            return;
        }
        ((bo3) arrayList.get(0)).getClass();
        int size = arrayList.size();
        no0 no0Var = ro0.b;
        gu2.k(size, "expectedSize");
        gu2.k(size, "initialCapacity");
        Object[] objArrCopyOf = new Object[size];
        int size2 = arrayList.size();
        gu2.k(size2, "expectedSize");
        gu2.k(size2, "initialCapacity");
        Object[] objArrCopyOf2 = new Object[size2];
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        for (bo3 bo3Var : dw0.x(arrayList)) {
            String str = ((gm3) bo3Var).d;
            int i4 = i3 + 1;
            if (objArrCopyOf2.length < i4) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, vn0.c(objArrCopyOf2.length, i4));
            } else {
                if (z2) {
                    objArrCopyOf2 = (Object[]) objArrCopyOf2.clone();
                }
                int i5 = i3 + 1;
                objArrCopyOf2[i3] = str;
                sn3 sn3VarZzh = bo3Var.zzh();
                sn3VarZzh.getClass();
                i = i2 + 1;
                if (objArrCopyOf.length < i) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, vn0.c(objArrCopyOf.length, i));
                } else {
                    if (z) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i2] = sn3VarZzh;
                    i2++;
                    i3 = i5;
                }
                z = false;
                objArrCopyOf[i2] = sn3VarZzh;
                i2++;
                i3 = i5;
            }
            z2 = false;
            int i6 = i3 + 1;
            objArrCopyOf2[i3] = str;
            sn3 sn3VarZzh2 = bo3Var.zzh();
            sn3VarZzh2.getClass();
            i = i2 + 1;
            if (objArrCopyOf.length < i) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, vn0.c(objArrCopyOf.length, i));
            } else {
                if (z) {
                    objArrCopyOf = (Object[]) objArrCopyOf.clone();
                }
                objArrCopyOf[i2] = sn3VarZzh2;
                i2++;
                i3 = i6;
            }
            z = false;
            objArrCopyOf[i2] = sn3VarZzh2;
            i2++;
            i3 = i6;
        }
        WeakHashMap weakHashMap3 = a;
        synchronized (weakHashMap3) {
            try {
                gh1 gh1VarH = ro0.h(i3, objArrCopyOf2);
                if (gh1VarH == null) {
                    throw new NullPointerException("Null spansNames");
                }
                gh1 gh1VarH2 = ro0.h(i2, objArrCopyOf);
                if (gh1VarH2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new jm3(gh1VarH, gh1VarH2, uuid));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
