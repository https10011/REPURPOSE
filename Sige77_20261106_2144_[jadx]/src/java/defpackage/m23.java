package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m23 extends k13 {
    public static final String[] e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final au2 c;
    public boolean d;

    public m23(y53 y53Var) {
        super(y53Var);
        this.c = new au2(this, ((y53) this.a).a);
    }

    @Override // defpackage.k13
    public final boolean H() {
        return false;
    }

    public final void I() {
        int iDelete;
        y53 y53Var = (y53) this.a;
        D();
        try {
            SQLiteDatabase sQLiteDatabaseK = K();
            if (sQLiteDatabaseK == null || (iDelete = sQLiteDatabaseK.delete("messages", null, null)) <= 0) {
                return;
            }
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.a0.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e2) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.f.b(e2, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
      0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public final void J() {
        y53 y53Var = (y53) this.a;
        D();
        if (!this.d && y53Var.a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseK = K();
                        if (sQLiteDatabaseK == null) {
                            this.d = true;
                            return;
                        }
                        sQLiteDatabaseK.beginTransaction();
                        sQLiteDatabaseK.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseK.setTransactionSuccessful();
                        sQLiteDatabaseK.endTransaction();
                        sQLiteDatabaseK.close();
                        return;
                    } catch (SQLiteException e2) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        c33 c33Var = y53Var.f;
                        y53.l(c33Var);
                        c33Var.f.b(e2, "Error deleting app launch break from local database");
                        this.d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e3) {
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.b(e3, "Error deleting app launch break from local database");
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            c33 c33Var3 = y53Var.f;
            y53.l(c33Var3);
            c33Var3.w.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase K() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
      0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    public final boolean L(byte[] bArr, int i) {
        SQLiteDatabase sQLiteDatabaseK;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        y53 y53Var = (y53) this.a;
        D();
        boolean z3 = false;
        z3 = false;
        if (!this.d) {
            is2 is2Var = y53Var.d;
            c33 c33Var = y53Var.f;
            f13 f13Var = h13.W0;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarI = is2Var.P(null, f13Var) ? y53Var.q().I(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (y53Var.d.P(null, f13Var) && zzrVarI != null) {
                contentValues.put("app_version", zzrVarI.c);
                contentValues.put("app_version_int", Long.valueOf(zzrVarI.W));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseK = K();
                    if (sQLiteDatabaseK == null) {
                        this.d = true;
                    } else {
                        try {
                            sQLiteDatabaseK.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseK.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseK != null) {
                                        sQLiteDatabaseK.close();
                                    }
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    y53.l(c33Var);
                                    c33Var.f.b(e, "Error writing entry; local database full");
                                    this.d = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseK != null) {
                                        sQLiteDatabaseK.close();
                                    }
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabaseK != null) {
                                        sQLiteDatabaseK.endTransaction();
                                    }
                                    y53.l(c33Var);
                                    c33Var.f.b(e, "Error writing entry to local database");
                                    this.d = z2;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseK != null) {
                                        sQLiteDatabaseK.close();
                                    }
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                y53.l(c33Var);
                                c33Var.f.a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseK.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    y53.l(c33Var);
                                    z23 z23Var = c33Var.f;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                z23Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e4) {
                                                e = e4;
                                                y53.l(c33Var);
                                                c33Var.f.b(e, "Error writing entry; local database full");
                                                this.d = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseK != null) {
                                                    sQLiteDatabaseK.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                if (sQLiteDatabaseK != null) {
                                                    sQLiteDatabaseK.endTransaction();
                                                }
                                                y53.l(c33Var);
                                                c33Var.f.b(e, "Error writing entry to local database");
                                                this.d = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseK != null) {
                                                    sQLiteDatabaseK.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseK != null) {
                                                sQLiteDatabaseK.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e6) {
                                        e = e6;
                                        y53.l(c33Var);
                                        c33Var.f.b(e, "Error writing entry; local database full");
                                        this.d = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e7) {
                                        e = e7;
                                        z2 = true;
                                        if (sQLiteDatabaseK != null && sQLiteDatabaseK.inTransaction()) {
                                            sQLiteDatabaseK.endTransaction();
                                        }
                                        y53.l(c33Var);
                                        c33Var.f.b(e, "Error writing entry to local database");
                                        this.d = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseK.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseK.setTransactionSuccessful();
                            sQLiteDatabaseK.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseK.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e9) {
                            e = e9;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseK = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseK = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e11) {
                    e = e11;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseK = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseK = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            y53.l(c33Var);
            c33Var.a0.a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}
