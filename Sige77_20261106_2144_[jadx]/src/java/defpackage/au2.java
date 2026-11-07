package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class au2 extends SQLiteOpenHelper {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo2 b;

    public au2(Context context, String str) {
        super(context, true == str.equals(BuildConfig.FLAVOR) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.a;
        lo2 lo2Var = this.b;
        switch (i) {
            case 0:
                bu2 bu2Var = (bu2) lo2Var;
                y53 y53Var = (y53) bu2Var.a;
                y53 y53Var2 = (y53) bu2Var.a;
                y53Var.getClass();
                jm jmVar = bu2Var.e;
                if (jmVar.b != 0) {
                    ((r41) jmVar.c).getClass();
                    if (SystemClock.elapsedRealtime() - jmVar.b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((r41) jmVar.c).getClass();
                    jmVar.b = SystemClock.elapsedRealtime();
                    c33 c33Var = y53Var2.f;
                    y53.l(c33Var);
                    c33Var.f.a("Opening the database failed, dropping and recreating it");
                    if (!y53Var2.a.getDatabasePath("google_app_measurement.db").delete()) {
                        c33 c33Var2 = y53Var2.f;
                        y53.l(c33Var2);
                        c33Var2.f.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        jmVar.b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        c33 c33Var3 = y53Var2.f;
                        y53.l(c33Var3);
                        c33Var3.f.b(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                m23 m23Var = (m23) lo2Var;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    y53 y53Var3 = (y53) m23Var.a;
                    c33 c33Var4 = y53Var3.f;
                    y53.l(c33Var4);
                    c33Var4.f.a("Opening the local database failed, dropping and recreating it");
                    if (!y53Var3.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        c33 c33Var5 = y53Var3.f;
                        y53.l(c33Var5);
                        c33Var5.f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        c33 c33Var6 = ((y53) m23Var.a).f;
                        y53.l(c33Var6);
                        c33Var6.f.b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.a;
        lo2 lo2Var = this.b;
        switch (i) {
            case 0:
                c33 c33Var = ((y53) ((bu2) lo2Var).a).f;
                y53.l(c33Var);
                d42.L(c33Var, sQLiteDatabase);
                break;
            default:
                c33 c33Var2 = ((y53) ((m23) lo2Var).a).f;
                y53.l(c33Var2);
                d42.L(c33Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int i = this.a;
        lo2 lo2Var = this.b;
        switch (i) {
            case 0:
                y53 y53Var = (y53) ((bu2) lo2Var).a;
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                d42.J(c33Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", bu2.f);
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", bu2.v);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", bu2.w);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", bu2.X);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", bu2.W);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", bu2.Y);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", bu2.Z);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", bu2.a0);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", bu2.b0);
                hq2.a();
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", bu2.c0);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", bu2.i);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                y53.l(c33Var2);
                d42.J(c33Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                c33 c33Var3 = ((y53) ((m23) lo2Var).a).f;
                y53.l(c33Var3);
                d42.J(c33Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", m23.e);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public au2(m23 m23Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.a = 1;
        this.b = m23Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public au2(bu2 bu2Var, Context context) {
        this(context, "google_app_measurement.db");
        this.a = 0;
        this.b = bu2Var;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void i(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
