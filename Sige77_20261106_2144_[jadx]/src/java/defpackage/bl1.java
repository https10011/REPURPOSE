package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bl1 implements Closeable {
    public static final k60 f = new k60("proto");
    public final bm1 a;
    public final hn b;
    public final hn c;
    public final pd d;
    public final yd1 e;

    public bl1(hn hnVar, hn hnVar2, pd pdVar, bm1 bm1Var, yd1 yd1Var) {
        this.a = bm1Var;
        this.b = hnVar;
        this.c = hnVar2;
        this.d = pdVar;
        this.e = yd1Var;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, ge geVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(geVar.a, String.valueOf(xc1.a(geVar.c))));
        byte[] bArr = geVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String m(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((yd) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object n(Cursor cursor, zk1 zk1Var) {
        try {
            return zk1Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        bm1 bm1Var = this.a;
        Objects.requireNonNull(bm1Var);
        hn hnVar = this.c;
        long jB = hnVar.b();
        while (true) {
            try {
                return bm1Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (hnVar.b() >= ((long) this.d.c) + jB) {
                    throw new sv1("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final Object e(zk1 zk1Var) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = zk1Var.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase, ge geVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lB = b(sQLiteDatabase, geVar);
        if (lB == null) {
            return arrayList;
        }
        n(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(i)), new rz(this, (Object) arrayList, geVar, 3));
        return arrayList;
    }

    public final void j(long j, a01 a01Var, String str) {
        e(new xk1(str, j, a01Var));
    }

    public final Object l(tv1 tv1Var) {
        SQLiteDatabase sQLiteDatabaseA = a();
        hn hnVar = this.c;
        long jB = hnVar.b();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objA = tv1Var.a();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objA;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (hnVar.b() >= ((long) this.d.c) + jB) {
                    throw new sv1("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
