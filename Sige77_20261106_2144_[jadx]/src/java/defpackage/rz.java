package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class rz implements tv1, SuccessContinuation, zk1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rz(bl1 bl1Var, Object obj, ge geVar, int i) {
        this.a = i;
        this.b = bl1Var;
        this.d = obj;
        this.c = geVar;
    }

    @Override // defpackage.tv1
    public Object a() {
        tz tzVar = (tz) this.b;
        ge geVar = (ge) this.c;
        od odVar = (od) this.d;
        bl1 bl1Var = tzVar.d;
        bl1Var.getClass();
        uc1 uc1Var = geVar.c;
        String str = odVar.a;
        String str2 = geVar.a;
        String strS = d42.s("SQLiteEventStore");
        if (Log.isLoggable(strS, 3)) {
            Log.d(strS, "Storing event with priority=" + uc1Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) bl1Var.e(new rz(bl1Var, (Object) odVar, geVar, 2))).getClass();
        tzVar.a.N(geVar, 1, false);
        return null;
    }

    @Override // defpackage.zk1
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        bl1 bl1Var;
        a01 a01Var;
        int i = this.a;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        a01 a01Var2 = a01.CACHE_FULL;
        int i6 = 2;
        int i7 = 0;
        int i8 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                bl1 bl1Var2 = (bl1) obj4;
                od odVar = (od) obj2;
                d60 d60Var = odVar.c;
                String str = odVar.a;
                ge geVar = (ge) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = bl1Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * bl1Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                pd pdVar = bl1Var2.d;
                if (jSimpleQueryForLong >= pdVar.a) {
                    bl1Var2.j(1L, a01Var2, str);
                    return -1L;
                }
                Long lB = bl1.b(sQLiteDatabase, geVar);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", geVar.a);
                    contentValues.put("priority", Integer.valueOf(xc1.a(geVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = geVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = pdVar.e;
                byte[] bArr2 = d60Var.b;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(odVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(odVar.e));
                contentValues2.put("payload_encoding", d60Var.a.a);
                contentValues2.put("code", odVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(odVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                bl1 bl1Var3 = (bl1) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ge geVar2 = (ge) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i8 : 0;
                    qp0 qp0Var = new qp0();
                    qp0Var.f = new HashMap();
                    String string = cursor2.getString(i8);
                    if (string == null) {
                        uq1.h("Null transportName");
                        return null;
                    }
                    qp0Var.a = string;
                    qp0Var.d = Long.valueOf(cursor2.getLong(i6));
                    qp0Var.e = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        qp0Var.c = new d60(string2 == null ? bl1.f : new k60(string2), cursor2.getBlob(5));
                        bl1Var = bl1Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        k60 k60Var = string3 == null ? bl1.f : new k60(string3);
                        Cursor cursorQuery = bl1Var3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            Cursor cursor3 = cursorQuery;
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursor3.moveToNext()) {
                                byte[] blob = cursor3.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i12 = 0;
                            int length2 = 0;
                            while (i12 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                bl1 bl1Var4 = bl1Var3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i12++;
                                    cursorQuery = cursor;
                                    bl1Var3 = bl1Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            bl1Var = bl1Var3;
                            cursorQuery.close();
                            qp0Var.c = new d60(k60Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        qp0Var.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new yd(j, geVar2, qp0Var.c()));
                    bl1Var3 = bl1Var;
                    i6 = 2;
                    i8 = 1;
                }
                return null;
            default:
                bl1 bl1Var5 = (bl1) obj4;
                HashMap map = (HashMap) obj3;
                ep1 ep1Var = (ep1) obj2;
                ArrayList arrayList3 = (ArrayList) ep1Var.d;
                Cursor cursor4 = (Cursor) obj;
                bl1Var5.getClass();
                while (cursor4.moveToNext()) {
                    String string4 = cursor4.getString(i7);
                    int i13 = cursor4.getInt(1);
                    a01 a01Var3 = a01.REASON_UNKNOWN;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            a01Var3 = a01.MESSAGE_TOO_OLD;
                        } else if (i13 == 2) {
                            a01Var = a01Var2;
                        } else if (i13 == i5) {
                            a01Var3 = a01.PAYLOAD_TOO_BIG;
                        } else if (i13 == i4) {
                            a01Var3 = a01.MAX_RETRIES_REACHED;
                        } else if (i13 == i3) {
                            a01Var3 = a01.INVALID_PAYLOD;
                        } else if (i13 == i2) {
                            a01Var3 = a01.SERVER_ERROR;
                        } else {
                            d42.g("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                        a01Var = a01Var3;
                    } else {
                        a01Var = a01Var3;
                    }
                    long j2 = cursor4.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new b01(j2, a01Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i14 = d01.c;
                    new ArrayList();
                    arrayList3.add(new d01((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                final long jB = bl1Var5.b.b();
                ep1Var.c = (tx1) bl1Var5.e(new zk1() { // from class: yk1
                    @Override // defpackage.zk1
                    public final Object apply(Object obj5) {
                        long j3 = jB;
                        Cursor cursorRawQuery = ((SQLiteDatabase) obj5).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                        try {
                            Cursor cursor5 = cursorRawQuery;
                            cursor5.moveToNext();
                            return new tx1(cursor5.getLong(0), j3);
                        } finally {
                            cursorRawQuery.close();
                        }
                    }
                });
                ep1Var.e = new lj0(new zt1(bl1Var5.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * bl1Var5.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), pd.f.a));
                ep1Var.b = (String) bl1Var5.e.get();
                return new gn((tx1) ep1Var.c, Collections.unmodifiableList(arrayList3), (lj0) ep1Var.e, (String) ep1Var.b);
        }
    }

    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        ic icVar = (ic) this.d;
        String str2 = (String) obj;
        wa waVarC = FirebaseMessaging.c(firebaseMessaging.b);
        hc0 hc0Var = firebaseMessaging.a;
        hc0Var.a();
        String strF = "[DEFAULT]".equals(hc0Var.b) ? BuildConfig.FLAVOR : hc0Var.f();
        String strA = firebaseMessaging.h.a();
        synchronized (waVarC) {
            String strA2 = ic.a(System.currentTimeMillis(), str2, strA);
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) waVarC.b).edit();
                editorEdit.putString(strF + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (icVar == null || !str2.equals(icVar.a)) {
            hc0 hc0Var2 = firebaseMessaging.a;
            hc0Var2.a();
            if ("[DEFAULT]".equals(hc0Var2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    hc0Var2.a();
                    sb.append(hc0Var2.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new nl1(firebaseMessaging.b).l(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    public /* synthetic */ rz(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
