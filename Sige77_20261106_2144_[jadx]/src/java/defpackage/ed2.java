package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ed2 extends SQLiteOpenHelper {
    public final File a;

    public ed2(Context context) {
        super(context, "athena.db", (SQLiteDatabase.CursorFactory) null, 6);
        this.a = context.getDatabasePath("athena.db");
    }

    public final boolean a() {
        File file = this.a;
        if (file.exists()) {
            long length = file.length();
            String str = ze2.a;
            if (length > 10485760) {
                return true;
            }
        }
        return false;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        cc2.a("Creating a new Athena DB");
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, tid INTEGER NOT NULL,event TEXT NOT NULL,et INTEGER NOT NULL,pi INTEGER NOT NULL,created_at INTEGER NOT NULL,uid TEXT,ext TEXT,er_ts INTEGER DEFAULT 0,boot_id TEXT)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS t_idx ON events (tid,created_at)");
                sQLiteDatabase.execSQL("CREATE TABLE tidconfig (_id INTEGER PRIMARY KEY AUTOINCREMENT, tid INTEGER NOT NULL UNIQUE,ev TEXT,pt INTEGER DEFAULT 0,cf TEXT,ext TEXT)");
                sQLiteDatabase.execSQL("CREATE TABLE appidconfig (_id INTEGER PRIMARY KEY AUTOINCREMENT, appid INTEGER NOT NULL UNIQUE,base TEXT,cfg TEXT,uid TEXT,try INTEGER DEFAULT 0,date TEXT,cnt INTEGER DEFAULT 0,ext TEXT)");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                cc2.a(Log.getStackTraceString(e));
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[Catch: all -> 0x0022, Exception -> 0x0024, SQLiteException -> 0x002f, TryCatch #2 {Exception -> 0x0024, blocks: (B:3:0x0011, B:5:0x0017, B:13:0x0029, B:18:0x0034, B:21:0x003c, B:24:0x0058, B:23:0x0047), top: B:31:0x0011, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[Catch: all -> 0x0022, Exception -> 0x0024, SQLiteException -> 0x002f, TRY_LEAVE, TryCatch #2 {Exception -> 0x0024, blocks: (B:3:0x0011, B:5:0x0017, B:13:0x0029, B:18:0x0034, B:21:0x003c, B:24:0x0058, B:23:0x0047), top: B:31:0x0011, outer: #0 }] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        cc2.a("Upgrading app, replacing Athena DB oldVersion = " + i);
        try {
            try {
                sQLiteDatabase.beginTransaction();
                if (i < 4) {
                    sQLiteDatabase.execSQL("CREATE TABLE tidconfig (_id INTEGER PRIMARY KEY AUTOINCREMENT, tid INTEGER NOT NULL UNIQUE,ev TEXT,pt INTEGER DEFAULT 0,cf TEXT,ext TEXT)");
                    sQLiteDatabase.execSQL("CREATE TABLE appidconfig (_id INTEGER PRIMARY KEY AUTOINCREMENT, appid INTEGER NOT NULL UNIQUE,base TEXT,cfg TEXT,uid TEXT,try INTEGER DEFAULT 0,date TEXT,cnt INTEGER DEFAULT 0,ext TEXT)");
                }
                if (i < 3) {
                    try {
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN uid TEXT");
                        if (i < 5) {
                            sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN ext TEXT");
                        }
                        if (i < 6) {
                            sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN er_ts INTEGER");
                            sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN boot_id TEXT");
                        }
                    } catch (SQLiteException e) {
                        cc2.c(Log.getStackTraceString(e));
                        sQLiteDatabase.execSQL("DROP TABLE events");
                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, tid INTEGER NOT NULL,event TEXT NOT NULL,et INTEGER NOT NULL,pi INTEGER NOT NULL,created_at INTEGER NOT NULL,uid TEXT,ext TEXT,er_ts INTEGER DEFAULT 0,boot_id TEXT)");
                    }
                } else {
                    if (i < 5) {
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN ext TEXT");
                    }
                    if (i < 6) {
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN er_ts INTEGER");
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN boot_id TEXT");
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
