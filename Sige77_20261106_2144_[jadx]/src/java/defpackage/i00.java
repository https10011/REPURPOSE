package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class i00 implements o00, tv1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i00(ue2 ue2Var, Iterable iterable, ge geVar, long j) {
        this.a = 2;
        this.b = ue2Var;
        this.e = iterable;
        this.d = geVar;
        this.c = j;
    }

    @Override // defpackage.tv1
    public Object a() {
        ue2 ue2Var = (ue2) this.b;
        Iterable iterable = (Iterable) this.e;
        ge geVar = (ge) this.d;
        bl1 bl1Var = (bl1) ue2Var.c;
        bl1Var.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(bl1.m(iterable));
            SQLiteDatabase sQLiteDatabaseA = bl1Var.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        bl1Var.j(cursor.getInt(0), a01.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                sQLiteDatabaseA.endTransaction();
                throw th2;
            }
        }
        bl1Var.e(new wk1(((hn) ue2Var.g).b() + this.c, geVar));
        return null;
    }

    @Override // defpackage.o00
    public ScheduledFuture b(final ox1 ox1Var) {
        int i = this.a;
        Object obj = this.d;
        long j = this.c;
        Object obj2 = this.e;
        final n00 n00Var = (n00) this.b;
        switch (i) {
            case 0:
                return n00Var.b.schedule(new l00(n00Var, (Runnable) obj2, ox1Var, 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return n00Var.b.schedule(new Callable() { // from class: m00
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return n00Var.a.submit(new x4(24, callable, ox1Var));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    public /* synthetic */ i00(n00 n00Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = n00Var;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }
}
