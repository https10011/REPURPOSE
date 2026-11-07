package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class m32 implements tv1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl1 b;

    public /* synthetic */ m32(bl1 bl1Var, int i) {
        this.a = i;
        this.b = bl1Var;
    }

    @Override // defpackage.tv1
    public final Object a() {
        int i = this.a;
        bl1 bl1Var = this.b;
        switch (i) {
            case 0:
                bl1Var.getClass();
                int i2 = gn.e;
                ep1 ep1Var = new ep1(3, false);
                ep1Var.c = null;
                ep1Var.d = new ArrayList();
                ep1Var.e = null;
                ep1Var.b = BuildConfig.FLAVOR;
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = bl1Var.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    gn gnVar = (gn) bl1.n(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new rz(bl1Var, map, ep1Var, 4));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return gnVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                long jB = bl1Var.b.b() - bl1Var.d.d;
                SQLiteDatabase sQLiteDatabaseA2 = bl1Var.a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jB)};
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = cursorRawQuery;
                        while (cursor.moveToNext()) {
                            bl1Var.j(cursor.getInt(0), a01.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        cursorRawQuery.close();
                        int iDelete = sQLiteDatabaseA2.delete("events", "timestamp_ms < ?", strArr);
                        sQLiteDatabaseA2.setTransactionSuccessful();
                        sQLiteDatabaseA2.endTransaction();
                        return Integer.valueOf(iDelete);
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th2;
                }
        }
    }
}
