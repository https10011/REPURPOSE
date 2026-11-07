package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bu2 extends ne3 {
    public final au2 d;
    public final jm e;
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] i = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] v = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] w = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] W = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] X = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] Y = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] Z = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] a0 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] b0 = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] c0 = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public bu2(if3 if3Var) {
        super(if3Var);
        this.e = new jm(((y53) this.a).X);
        ((y53) this.a).getClass();
        this.d = new au2(this, ((y53) this.a).a);
    }

    public static final String j0(List list) {
        return list.isEmpty() ? BuildConfig.FLAVOR : ts.k(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void r0(ContentValues contentValues, Object obj) {
        gu2.l("value");
        gu2.o(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            e.g("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final of3 A0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        gu2.l(str2);
        D();
        F();
        Cursor cursor = null;
        try {
            cursorQuery = v0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objR = R(cursorQuery, 1);
                        if (objR != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                of3 of3Var = new of3(str3, cursorQuery.getString(2), str4, j, objR);
                                if (cursorQuery.moveToNext()) {
                                    c33 c33Var = y53Var.f;
                                    y53.l(c33Var);
                                    c33Var.f.b(c33.M(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return of3Var;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        c33 c33Var2 = y53Var.f;
                        y53.l(c33Var2);
                        c33Var2.f.d("Error querying user property. appId", c33.M(str3), y53Var.W.c(str4), sQLiteException);
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
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List B0(String str) {
        String str2;
        SQLiteException sQLiteException;
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        D();
        F();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                y53Var.getClass();
                cursorQuery = v0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = BuildConfig.FLAVOR;
                        }
                        String str3 = string2;
                        long j = cursorQuery.getLong(2);
                        Object objR = R(cursorQuery, 3);
                        if (objR == null) {
                            try {
                                c33 c33Var = y53Var.f;
                                y53.l(c33Var);
                                c33Var.f.b(c33.M(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                c33 c33Var2 = y53Var.f;
                                y53.l(c33Var2);
                                c33Var2.f.c(c33.M(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new of3(str2, str3, string, j, objR));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            c33 c33Var3 = y53Var.f;
                            y53.l(c33Var3);
                            c33Var3.f.c(c33.M(str2), sQLiteException, "Error querying user properties. appId");
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List C0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        D();
        F();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            y53Var.getClass();
            c33 c33Var = y53Var.f;
            cursorQuery = v0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    y53.l(c33Var);
                                    c33Var.f.b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objR = R(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objR == null) {
                                    try {
                                        y53.l(c33Var);
                                        c33Var.f.d("(2)Read invalid user property value, ignoring it", c33.M(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            c33 c33Var2 = y53Var.f;
                                            y53.l(c33Var2);
                                            c33Var2.f.d("(2)Error querying user properties", c33.M(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new of3(str, str5, string2, j, objR));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    c33 c33Var3 = y53Var.f;
                                    y53.l(c33Var3);
                                    c33Var3.f.d("(2)Error querying user properties", c33.M(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                c33 c33Var4 = y53Var.f;
                                y53.l(c33Var4);
                                c33Var4.f.d("(2)Error querying user properties", c33.M(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean D0(zzah zzahVar) {
        y53 y53Var = (y53) this.a;
        D();
        F();
        String str = zzahVar.a;
        gu2.o(str);
        if (A0(str, zzahVar.c.b) == null) {
            long jA0 = a0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            y53Var.getClass();
            if (jA0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.b);
        contentValues.put("name", zzahVar.c.b);
        Object objZza = zzahVar.c.zza();
        gu2.o(objZza);
        r0(contentValues, objZza);
        contentValues.put("active", Boolean.valueOf(zzahVar.e));
        contentValues.put("trigger_event_name", zzahVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.v));
        zzbh zzbhVar = zzahVar.i;
        qf3 qf3Var = y53Var.w;
        c33 c33Var = y53Var.f;
        y53.j(qf3Var);
        contentValues.put("timed_out_event", qf3.n0(zzbhVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.d));
        y53.j(qf3Var);
        contentValues.put("triggered_event", qf3.n0(zzahVar.w));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.W));
        contentValues.put("expired_event", qf3.n0(zzahVar.X));
        try {
            if (v0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            y53.l(c33Var);
            c33Var.f.b(c33.M(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            y53.l(c33Var);
            c33Var.f.c(c33.M(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
    public final zzah E0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        gu2.l(str2);
        D();
        F();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = v0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = BuildConfig.FLAVOR;
                    }
                    String str4 = string;
                    Object objR = R(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    lf3 lf3Var = this.b.i;
                    if3.T(lf3Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator creator = zzbh.CREATOR;
                    zzbh zzbhVarH0 = lf3Var.h0(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    if3.T(lf3Var);
                    zzbh zzbhVarH1 = lf3Var.h0(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    if3.T(lf3Var);
                    str3 = str2;
                    try {
                        zzah zzahVar = new zzah(str, str4, new zzpl(j3, objR, str3, str4), j2, z, string2, zzbhVarH0, j, zzbhVarH1, j4, lf3Var.h0(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            c33 c33Var = y53Var.f;
                            y53.l(c33Var);
                            c33Var.f.c(c33.M(str), y53Var.W.c(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return zzahVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        c33 c33Var2 = y53Var.f;
        y53.l(c33Var2);
        c33Var2.f.d("Error querying conditional property", c33.M(str), y53Var.W.c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void F0(String str, String str2) {
        gu2.l(str);
        gu2.l(str2);
        D();
        F();
        try {
            v0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            y53 y53Var = (y53) this.a;
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.d("Error deleting conditional property", c33.M(str), y53Var.W.c(str2), e);
        }
    }

    public final List G0(String str, String str2, String str3) {
        gu2.l(str);
        D();
        F();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return H0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // defpackage.ne3
    public final void H() {
        y53 y53Var = (y53) this.a;
        if (y53Var.d.P(null, h13.e1)) {
            t53 t53Var = y53Var.i;
            y53.l(t53Var);
            t53Var.N(new aj2(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final List H0(String str, String[] strArr) {
        y53 y53Var = (y53) this.a;
        D();
        F();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                y53Var.getClass();
                cursorQuery = v0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            c33 c33Var = y53Var.f;
                            y53.l(c33Var);
                            c33Var.f.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objR = R(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        lf3 lf3Var = this.b.i;
                        if3.T(lf3Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator creator = zzbh.CREATOR;
                        zzbh zzbhVarH0 = lf3Var.h0(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        if3.T(lf3Var);
                        zzbh zzbhVarH1 = lf3Var.h0(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        if3.T(lf3Var);
                        arrayList.add(new zzah(string, string2, new zzpl(j3, objR, string3, string2), j2, z, string4, zzbhVarH0, j, zzbhVarH1, j4, lf3Var.h0(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                c33Var2.f.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final long I(String str, w53 w53Var, String str2, Map map, ia3 ia3Var, Long l) {
        int iDelete;
        y53 y53Var = (y53) this.a;
        D();
        F();
        gu2.o(w53Var);
        gu2.l(str);
        D();
        F();
        if (p0()) {
            if3 if3Var = this.b;
            long jA = if3Var.w.f.a();
            r41 r41Var = y53Var.X;
            c33 c33Var = y53Var.f;
            r41Var.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) h13.M.a(null)).longValue()) {
                if3Var.w.f.b(jElapsedRealtime);
                D();
                F();
                if (p0() && (iDelete = v0().delete("upload_queue", i0(), new String[0])) > 0) {
                    y53.l(c33Var);
                    c33Var.a0.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                gu2.l(str);
                D();
                F();
                try {
                    int iN = y53Var.d.N(str, h13.A);
                    if (iN > 0) {
                        v0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iN)});
                    }
                } catch (SQLiteException e) {
                    y53.l(c33Var);
                    c33Var.f.c(c33.M(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrA = w53Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(ia3Var.a));
        r41 r41Var2 = y53Var.X;
        c33 c33Var2 = y53Var.f;
        r41Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = v0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            y53.l(c33Var2);
            c33Var2.f.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            y53.l(c33Var2);
            c33Var2.f.c(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    public final q33 I0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        D();
        F();
        Cursor cursor = null;
        try {
            cursorQuery = v0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        if3 if3Var = this.b;
                        q33 q33Var = new q33(if3Var.Y, str);
                        y53 y53Var2 = q33Var.a;
                        p73 p73VarA = if3Var.a(str);
                        n73 n73Var = n73.ANALYTICS_STORAGE;
                        if (p73VarA.i(n73Var)) {
                            q33Var.G(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        q33Var.I(cursorQuery.getString(1));
                        if (if3Var.a(str).i(n73.AD_STORAGE)) {
                            q33Var.J(cursorQuery.getString(2));
                        }
                        q33Var.e(cursorQuery.getLong(3));
                        q33Var.M(cursorQuery.getLong(4));
                        q33Var.N(cursorQuery.getLong(5));
                        q33Var.P(cursorQuery.getString(6));
                        q33Var.S(cursorQuery.getString(7));
                        q33Var.T(cursorQuery.getLong(8));
                        q33Var.a(cursorQuery.getLong(9));
                        q33Var.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        q33Var.i(cursorQuery.getLong(11));
                        q33Var.j(cursorQuery.getLong(12));
                        q33Var.k(cursorQuery.getLong(13));
                        q33Var.l(cursorQuery.getLong(14));
                        q33Var.f(cursorQuery.getLong(15));
                        q33Var.g(cursorQuery.getLong(16));
                        q33Var.R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        q33Var.L(cursorQuery.getString(18));
                        q33Var.n(cursorQuery.getLong(19));
                        q33Var.m(cursorQuery.getLong(20));
                        q33Var.w(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        t53 t53Var = y53Var2.i;
                        y53.l(t53Var);
                        t53Var.D();
                        q33Var.R |= q33Var.p != z2;
                        q33Var.p = z2;
                        q33Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            q33Var.y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (if3Var.a(str).i(n73Var)) {
                            String string2 = cursorQuery.getString(28);
                            t53 t53Var2 = y53Var2.i;
                            y53.l(t53Var2);
                            t53Var2.D();
                            q33Var.R |= !Objects.equals(q33Var.t, string2);
                            q33Var.t = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        t53 t53Var3 = y53Var2.i;
                        y53.l(t53Var3);
                        t53Var3.D();
                        q33Var.R |= q33Var.u != z3;
                        q33Var.u = z3;
                        q33Var.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        t53 t53Var4 = y53Var2.i;
                        y53.l(t53Var4);
                        t53Var4.D();
                        q33Var.R |= q33Var.C != string3;
                        q33Var.C = string3;
                        q33Var.A(cursorQuery.getLong(30));
                        q33Var.B(cursorQuery.getLong(31));
                        hq2.a();
                        if (y53Var.d.P(str, h13.O0)) {
                            int i2 = cursorQuery.getInt(32);
                            t53 t53Var5 = y53Var2.i;
                            y53.l(t53Var5);
                            t53Var5.D();
                            q33Var.R |= q33Var.x != i2;
                            q33Var.x = i2;
                            q33Var.C(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        t53 t53Var6 = y53Var2.i;
                        y53.l(t53Var6);
                        t53Var6.D();
                        q33Var.R |= q33Var.y != z4;
                        q33Var.y = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        t53 t53Var7 = y53Var2.i;
                        y53.l(t53Var7);
                        t53Var7.D();
                        q33Var.R |= !Objects.equals(q33Var.q, boolValueOf);
                        q33Var.q = boolValueOf;
                        q33Var.p(cursorQuery.getInt(37));
                        q33Var.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = BuildConfig.FLAVOR;
                        } else {
                            string = cursorQuery.getString(40);
                            gu2.o(string);
                        }
                        t53 t53Var8 = y53Var2.i;
                        y53.l(t53Var8);
                        t53Var8.D();
                        q33Var.R |= q33Var.G != string;
                        q33Var.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            t53 t53Var9 = y53Var2.i;
                            y53.l(t53Var9);
                            t53Var9.D();
                            q33Var.R |= !Objects.equals(q33Var.z, lValueOf);
                            q33Var.z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            t53 t53Var10 = y53Var2.i;
                            y53.l(t53Var10);
                            t53Var10.D();
                            q33Var.R |= !Objects.equals(q33Var.A, lValueOf2);
                            q33Var.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        t53 t53Var11 = y53Var2.i;
                        y53.l(t53Var11);
                        t53Var11.D();
                        q33Var.R |= q33Var.H != blob;
                        q33Var.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i3 = cursorQuery.getInt(44);
                            t53 t53Var12 = y53Var2.i;
                            y53.l(t53Var12);
                            t53Var12.D();
                            boolean z5 = q33Var.R;
                            if (q33Var.I == i3) {
                                z = false;
                            }
                            q33Var.R = z | z5;
                            q33Var.I = i3;
                        }
                        if (y53Var.d.P(str, h13.j1) && !cursorQuery.isNull(45)) {
                            q33Var.u(cursorQuery.getLong(45));
                        }
                        t53 t53Var13 = y53Var2.i;
                        y53.l(t53Var13);
                        t53Var13.D();
                        q33Var.R = false;
                        if (cursorQuery.moveToNext()) {
                            c33 c33Var = y53Var.f;
                            y53.l(c33Var);
                            c33Var.f.b(c33.M(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return q33Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.c(c33.M(str), e, "Error querying app. appId");
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List J(String str, zzoo zzooVar, int i2) {
        ?? arrayList;
        gu2.l(str);
        D();
        F();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseV0 = v0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strJ0 = j0(zzooVar.a);
            String strI0 = i0();
            StringBuilder sb = new StringBuilder(strJ0.length() + 17 + strI0.length());
            sb.append("app_id=?");
            sb.append(strJ0);
            sb.append(" AND NOT ");
            sb.append(strI0);
            cursorQuery = sQLiteDatabaseV0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i2 > 0 ? String.valueOf(i2) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                kf3 kf3VarH0 = h0(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (kf3VarH0 != null) {
                    arrayList.add(kf3VarH0);
                }
            }
        } catch (SQLiteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.c(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final void J0(q33 q33Var, boolean z) {
        y53 y53Var = (y53) this.a;
        y53 y53Var2 = q33Var.a;
        D();
        F();
        String strE = q33Var.E();
        gu2.o(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE);
        n73 n73Var = n73.ANALYTICS_STORAGE;
        if3 if3Var = this.b;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (if3Var.a(strE).i(n73Var)) {
            contentValues.put("app_instance_id", q33Var.F());
        }
        contentValues.put("gmp_app_id", q33Var.H());
        if (if3Var.a(strE).i(n73.AD_STORAGE)) {
            t53 t53Var = y53Var2.i;
            y53.l(t53Var);
            t53Var.D();
            contentValues.put("resettable_device_id_hash", q33Var.e);
        }
        t53 t53Var2 = y53Var2.i;
        y53.l(t53Var2);
        t53Var2.D();
        contentValues.put("last_bundle_index", Long.valueOf(q33Var.g));
        t53 t53Var3 = y53Var2.i;
        y53.l(t53Var3);
        t53Var3.D();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(q33Var.h));
        t53 t53Var4 = y53Var2.i;
        y53.l(t53Var4);
        t53Var4.D();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(q33Var.i));
        contentValues.put("app_version", q33Var.O());
        t53 t53Var5 = y53Var2.i;
        y53.l(t53Var5);
        t53Var5.D();
        contentValues.put("app_store", q33Var.l);
        t53 t53Var6 = y53Var2.i;
        y53.l(t53Var6);
        t53Var6.D();
        contentValues.put("gmp_version", Long.valueOf(q33Var.m));
        t53 t53Var7 = y53Var2.i;
        y53.l(t53Var7);
        t53Var7.D();
        contentValues.put("dev_cert_hash", Long.valueOf(q33Var.n));
        t53 t53Var8 = y53Var2.i;
        y53.l(t53Var8);
        t53Var8.D();
        contentValues.put("measurement_enabled", Boolean.valueOf(q33Var.o));
        t53 t53Var9 = y53Var2.i;
        t53 t53Var10 = y53Var2.i;
        y53.l(t53Var9);
        t53Var9.D();
        contentValues.put("day", Long.valueOf(q33Var.K));
        y53.l(t53Var10);
        t53Var10.D();
        contentValues.put("daily_public_events_count", Long.valueOf(q33Var.L));
        y53.l(t53Var10);
        t53Var10.D();
        contentValues.put("daily_events_count", Long.valueOf(q33Var.M));
        y53.l(t53Var10);
        t53Var10.D();
        contentValues.put("daily_conversions_count", Long.valueOf(q33Var.N));
        t53 t53Var11 = y53Var2.i;
        y53.l(t53Var11);
        t53Var11.D();
        contentValues.put("config_fetched_time", Long.valueOf(q33Var.S));
        t53 t53Var12 = y53Var2.i;
        y53.l(t53Var12);
        t53Var12.D();
        contentValues.put("failed_config_fetch_time", Long.valueOf(q33Var.T));
        contentValues.put("app_version_int", Long.valueOf(q33Var.Q()));
        contentValues.put("firebase_instance_id", q33Var.K());
        y53.l(t53Var10);
        t53Var10.D();
        contentValues.put("daily_error_events_count", Long.valueOf(q33Var.O));
        y53.l(t53Var10);
        t53Var10.D();
        contentValues.put("daily_realtime_events_count", Long.valueOf(q33Var.P));
        y53.l(t53Var10);
        t53Var10.D();
        contentValues.put("health_monitor_sample", q33Var.Q);
        contentValues.put("android_id", (Long) 0L);
        t53 t53Var13 = y53Var2.i;
        y53.l(t53Var13);
        t53Var13.D();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(q33Var.p));
        contentValues.put("dynamite_version", Long.valueOf(q33Var.b()));
        if (if3Var.a(strE).i(n73Var)) {
            t53 t53Var14 = y53Var2.i;
            y53.l(t53Var14);
            t53Var14.D();
            contentValues.put("session_stitching_token", q33Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(q33Var.z()));
        t53 t53Var15 = y53Var2.i;
        y53.l(t53Var15);
        t53Var15.D();
        contentValues.put("target_os_version", Long.valueOf(q33Var.v));
        t53 t53Var16 = y53Var2.i;
        y53.l(t53Var16);
        t53Var16.D();
        contentValues.put("session_stitching_token_hash", Long.valueOf(q33Var.w));
        hq2.a();
        is2 is2Var = y53Var.d;
        c33 c33Var = y53Var.f;
        if (is2Var.P(strE, h13.O0)) {
            t53 t53Var17 = y53Var2.i;
            y53.l(t53Var17);
            t53Var17.D();
            contentValues.put("ad_services_version", Integer.valueOf(q33Var.x));
            t53 t53Var18 = y53Var2.i;
            y53.l(t53Var18);
            t53Var18.D();
            contentValues.put("attribution_eligibility_status", Long.valueOf(q33Var.B));
        }
        t53 t53Var19 = y53Var2.i;
        y53.l(t53Var19);
        t53Var19.D();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(q33Var.y));
        contentValues.put("npa_metadata_value", q33Var.x());
        t53 t53Var20 = y53Var2.i;
        y53.l(t53Var20);
        t53Var20.D();
        contentValues.put("bundle_delivery_index", Long.valueOf(q33Var.F));
        contentValues.put("sgtm_preview_key", q33Var.D());
        y53.l(t53Var10);
        t53Var10.D();
        contentValues.put("dma_consent_state", Integer.valueOf(q33Var.D));
        y53.l(t53Var10);
        t53Var10.D();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(q33Var.E));
        contentValues.put("serialized_npa_metadata", q33Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(q33Var.t()));
        t53 t53Var21 = y53Var2.i;
        y53.l(t53Var21);
        t53Var21.D();
        ArrayList arrayList = q33Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                y53.l(c33Var);
                c33Var.w.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (is2Var.P(null, h13.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        t53 t53Var22 = y53Var2.i;
        y53.l(t53Var22);
        t53Var22.D();
        contentValues.put("unmatched_pfo", q33Var.z);
        t53 t53Var23 = y53Var2.i;
        y53.l(t53Var23);
        t53Var23.D();
        contentValues.put("unmatched_uwa", q33Var.A);
        t53 t53Var24 = y53Var2.i;
        y53.l(t53Var24);
        t53Var24.D();
        contentValues.put("ad_campaign_info", q33Var.H);
        if (is2Var.P(strE, h13.j1)) {
            t53 t53Var25 = y53Var2.i;
            y53.l(t53Var25);
            t53Var25.D();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(q33Var.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseV0 = v0();
            if (sQLiteDatabaseV0.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseV0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                y53.l(c33Var);
                c33Var.f.b(c33.M(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            y53.l(c33Var);
            c33Var.f.c(c33.M(strE), e, "Error storing app. appId");
        }
    }

    public final boolean K(String str) {
        ia3[] ia3VarArr = {ia3.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(ia3VarArr[0].a));
        String strJ0 = j0(arrayList);
        String strI0 = i0();
        StringBuilder sb = new StringBuilder(strJ0.length() + 61 + strI0.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strJ0);
        sb.append(" AND NOT ");
        sb.append(strI0);
        return a0(sb.toString(), new String[]{str}) != 0;
    }

    public final tt2 K0(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return L0(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final void L(Long l) {
        y53 y53Var = (y53) this.a;
        D();
        F();
        try {
            if (v0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.w.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.f.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final tt2 L0(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        D();
        F();
        String[] strArr = {str};
        tt2 tt2Var = new tt2();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseV0 = v0();
                cursorQuery = sQLiteDatabaseV0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        tt2Var.b = cursorQuery.getLong(1);
                        tt2Var.a = cursorQuery.getLong(2);
                        tt2Var.c = cursorQuery.getLong(3);
                        tt2Var.d = cursorQuery.getLong(4);
                        tt2Var.e = cursorQuery.getLong(5);
                        tt2Var.f = cursorQuery.getLong(6);
                        tt2Var.g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        tt2Var.b += j2;
                    }
                    if (z2) {
                        tt2Var.a += j2;
                    }
                    if (z3) {
                        tt2Var.c += j2;
                    }
                    if (z4) {
                        tt2Var.d += j2;
                    }
                    if (z5) {
                        tt2Var.e += j2;
                    }
                    if (z6) {
                        tt2Var.f += j2;
                    }
                    if (z7) {
                        tt2Var.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(tt2Var.a));
                    contentValues.put("daily_events_count", Long.valueOf(tt2Var.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(tt2Var.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(tt2Var.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(tt2Var.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(tt2Var.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(tt2Var.g));
                    sQLiteDatabaseV0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.w.b(c33.M(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                c33Var2.f.c(c33.M(str), e, "Error updating daily counts. appId");
            }
            return tt2Var;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final String M() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseV0 = v0();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseV0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    c33 c33Var = ((y53) this.a).f;
                    y53.l(c33Var);
                    c33Var.f.b(e, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseV0;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final p11 M0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        D();
        F();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = v0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            c33 c33Var = y53Var.f;
                            y53.l(c33Var);
                            c33Var.f.b(c33.M(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            p11 p11Var = new p11(blob, string, string2, 24);
                            cursorQuery.close();
                            return p11Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.c(c33.M(str), e, "Error querying remote config. appId");
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void N(long j) {
        D();
        F();
        try {
            if (v0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void N0(a63 a63Var, boolean z) {
        D();
        F();
        gu2.l(a63Var.t());
        if (!a63Var.g2()) {
            uq1.n();
            return;
        }
        O();
        y53 y53Var = (y53) this.a;
        r41 r41Var = y53Var.X;
        c33 c33Var = y53Var.f;
        r41Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jH2 = a63Var.h2();
        f13 f13Var = h13.R;
        if (jH2 < jCurrentTimeMillis - ((Long) f13Var.a(null)).longValue() || a63Var.h2() > ((Long) f13Var.a(null)).longValue() + jCurrentTimeMillis) {
            y53.l(c33Var);
            c33Var.w.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", c33.M(a63Var.t()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(a63Var.h2()));
        }
        byte[] bArrA = a63Var.a();
        try {
            lf3 lf3Var = this.b.i;
            if3.T(lf3Var);
            byte[] bArrO0 = lf3Var.o0(bArrA);
            y53.l(c33Var);
            c33Var.a0.b(Integer.valueOf(bArrO0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", a63Var.t());
            contentValues.put("bundle_end_timestamp", Long.valueOf(a63Var.h2()));
            contentValues.put("data", bArrO0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (a63Var.t0()) {
                contentValues.put("retry_count", Integer.valueOf(a63Var.u0()));
            }
            try {
                if (v0().insert("queue", null, contentValues) == -1) {
                    y53.l(c33Var);
                    c33Var.f.b(c33.M(a63Var.t()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                y53.l(c33Var);
                c33Var.f.c(c33.M(a63Var.t()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            y53.l(c33Var);
            c33Var.f.c(c33.M(a63Var.t()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void O() {
        D();
        F();
        if (p0()) {
            if3 if3Var = this.b;
            long jA = if3Var.w.e.a();
            y53 y53Var = (y53) this.a;
            y53Var.X.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) h13.M.a(null)).longValue()) {
                if3Var.w.e.b(jElapsedRealtime);
                D();
                F();
                if (p0()) {
                    SQLiteDatabase sQLiteDatabaseV0 = v0();
                    y53Var.X.getClass();
                    int iDelete = sQLiteDatabaseV0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) h13.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        c33 c33Var = y53Var.f;
                        y53.l(c33Var);
                        c33Var.a0.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void P(ArrayList arrayList) {
        y53 y53Var = (y53) this.a;
        D();
        F();
        gu2.o(arrayList);
        if (arrayList.size() == 0) {
            e.g("Given Integer is zero");
            return;
        }
        if (p0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strL = y00.l(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (a0(y00.l(new StringBuilder(strL.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strL, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.w.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseV0 = v0();
                StringBuilder sb = new StringBuilder(strL.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strL);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseV0.execSQL(sb.toString());
            } catch (SQLiteException e) {
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                c33Var2.f.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void Q(Long l) {
        y53 y53Var = (y53) this.a;
        D();
        F();
        if (p0()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (a0(sb.toString(), null) > 0) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.w.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseV0 = v0();
                y53Var.X.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseV0.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                c33Var2.f.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object R(Cursor cursor, int i2) {
        y53 y53Var = (y53) this.a;
        int type = cursor.getType(i2);
        if (type == 0) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        c33 c33Var3 = y53Var.f;
        y53.l(c33Var3);
        c33Var3.f.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    public final long S(String str) {
        long j;
        ContentValues contentValues;
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        gu2.l("first_open_count");
        D();
        F();
        SQLiteDatabase sQLiteDatabaseV0 = v0();
        sQLiteDatabaseV0.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jB0 = b0(sb.toString(), new String[]{str}, -1L);
                if (jB0 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseV0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        c33 c33Var = y53Var.f;
                        y53.l(c33Var);
                        c33Var.f.c(c33.M(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jB0 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jB0));
                            if (sQLiteDatabaseV0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                c33 c33Var2 = y53Var.f;
                                y53.l(c33Var2);
                                c33Var2.f.c(c33.M(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseV0.setTransactionSuccessful();
                                j = jB0;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jB0;
                            c33 c33Var3 = y53Var.f;
                            y53.l(c33Var3);
                            c33Var3.f.d("Error inserting column. appId", c33.M(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jB0));
                    if (sQLiteDatabaseV0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        c33 c33Var4 = y53Var.f;
                        y53.l(c33Var4);
                        c33Var4.f.c(c33.M(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseV0.setTransactionSuccessful();
                        j = jB0;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
            return j;
        } finally {
            sQLiteDatabaseV0.endTransaction();
        }
    }

    public final boolean T(String str, String str2) {
        return a0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void U(List list) {
        gu2.o(list);
        D();
        F();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(")");
        int iDelete = v0().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.c(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long V(String str) {
        gu2.l(str);
        return b0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void W(String str, Long l, long j, d53 d53Var) {
        D();
        F();
        gu2.o(d53Var);
        gu2.l(str);
        y53 y53Var = (y53) this.a;
        byte[] bArrA = d53Var.a();
        c33 c33Var = y53Var.f;
        c33 c33Var2 = y53Var.f;
        y53.l(c33Var);
        c33Var.a0.c(y53Var.W.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrA);
        try {
            if (v0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                y53.l(c33Var2);
                c33Var2.f.b(c33.M(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            y53.l(c33Var2);
            c33Var2.f.c(c33.M(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x011f->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    public final void X(String str, Long l, String str2, Bundle bundle) {
        ic icVar;
        c33 c33Var;
        Bundle bundle2;
        long j;
        String str3;
        ContentValues contentValues;
        c33 c33Var2;
        a63 a63Var;
        Iterator it;
        bu2 bu2Var = this;
        String str4 = str;
        y53 y53Var = (y53) bu2Var.a;
        gu2.o(bundle);
        bu2Var.D();
        bu2Var.F();
        if (l != null) {
            long jLongValue = l.longValue();
            icVar = new ic();
            icVar.c = bu2Var;
            gu2.l(str4);
            icVar.a = str4;
            icVar.b = bu2Var.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str4, String.valueOf(jLongValue)}, -1L);
        } else {
            icVar = new ic();
            icVar.c = bu2Var;
            gu2.l(str4);
            icVar.a = str4;
            icVar.b = -1L;
        }
        ic icVar2 = icVar;
        List<yt2> listE = icVar2.e();
        while (!listE.isEmpty()) {
            for (yt2 yt2Var : listE) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        a63 a63Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = bu2Var.v0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(yt2Var.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                a63Var = (a63) ((x53) lf3.p0(a63.Y(), cursorQuery.getBlob(0))).g();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        c33 c33Var3 = y53Var.f;
                                                        y53.l(c33Var3);
                                                        c33Var3.w.b(c33.M(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    c33 c33Var4 = y53Var.f;
                                                    y53.l(c33Var4);
                                                    c33Var4.f.c(c33.M(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                a63Var2 = a63Var;
                                            } catch (IOException e2) {
                                                c33 c33Var5 = y53Var.f;
                                                y53.l(c33Var5);
                                                c33Var5.f.c(c33.M(str4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (a63Var2 != null) {
                                                it = a63Var2.Z1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((u63) it.next()).v().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c33 c33Var6 = y53Var.f;
                                            y53.l(c33Var6);
                                            c33Var6.f.b(c33.M(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        a63Var = null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            a63Var = null;
                        }
                        if (a63Var2 != null) {
                            it = a63Var2.Z1().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((u63) it.next()).v().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = v0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        y53.l(c33Var);
                        c33Var2 = c33Var;
                        try {
                            c33Var2.f.c(c33.M(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            y53.l(c33Var2);
                            c33Var2.f.c(c33.M(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    c33Var2 = c33Var;
                }
                if3 if3Var = bu2Var.b;
                lf3 lf3Var = if3Var.i;
                if3.T(lf3Var);
                d53 d53Var = yt2Var.d;
                Bundle bundle3 = new Bundle();
                for (l53 l53Var : d53Var.v()) {
                    if (l53Var.B()) {
                        bundle3.putDouble(l53Var.u(), l53Var.C());
                    } else if (l53Var.z()) {
                        bundle3.putFloat(l53Var.u(), l53Var.A());
                    } else if (l53Var.x()) {
                        bundle3.putLong(l53Var.u(), l53Var.y());
                    } else if (l53Var.v()) {
                        bundle3.putString(l53Var.u(), l53Var.w());
                    } else if (l53Var.D().isEmpty()) {
                        c33 c33Var7 = ((y53) lf3Var.a).f;
                        y53.l(c33Var7);
                        c33Var7.f.b(l53Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(l53Var.u(), lf3.r0(l53Var.D()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strY = d53Var.y();
                if (string == null) {
                    string = BuildConfig.FLAVOR;
                }
                qf3 qf3Var = y53Var.w;
                c33Var = y53Var.f;
                y53.j(qf3Var);
                if (strY.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        yt2 yt2Var2 = yt2Var;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        yt2Var = yt2Var2;
                    }
                } else {
                    bundle2 = bundle;
                }
                yt2 yt2Var3 = yt2Var;
                qf3Var.R(bundle3, bundle2);
                ru2 ru2Var = new ru2((y53) bu2Var.a, string, str4, d53Var.y(), d53Var.A(), d53Var.I(), d53Var.C(), bundle3);
                j = yt2Var3.a;
                long j2 = yt2Var3.b;
                boolean z = yt2Var3.c;
                D();
                F();
                str3 = ru2Var.a;
                gu2.l(str3);
                lf3 lf3Var2 = if3Var.i;
                if3.T(lf3Var2);
                byte[] bArrA = lf3Var2.e0(ru2Var).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", ru2Var.b);
                contentValues.put("timestamp", Long.valueOf(ru2Var.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrA);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(ru2Var.e));
                bu2Var = this;
                str4 = str;
            }
            listE = icVar2.e();
            bu2Var = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [bu2, lo2, ne3] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    public final p73 Y(String str) {
        Throwable th;
        SQLiteException e;
        y53 y53Var = (y53) this.a;
        gu2.o(str);
        D();
        F();
        ?? r2 = 0;
        p73VarC = null;
        p73VarC = null;
        p73 p73VarC = null;
        try {
            try {
                this = v0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        p73VarC = p73.c(this.getInt(1), this.getString(0));
                    } else {
                        c33 c33Var = y53Var.f;
                        y53.l(c33Var);
                        c33Var.a0.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.b(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (p73VarC == null) {
                        return p73.c;
                    }
                    return p73VarC;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        this.close();
        if (p73VarC == null) {
            return p73.c;
        }
        return p73VarC;
    }

    public final void Z(String str, zzoh zzohVar) {
        D();
        F();
        gu2.l(str);
        y53 y53Var = (y53) this.a;
        r41 r41Var = y53Var.X;
        c33 c33Var = y53Var.f;
        r41Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        f13 f13Var = h13.u0;
        long jLongValue = jCurrentTimeMillis - ((Long) f13Var.a(null)).longValue();
        long j = zzohVar.b;
        if (j < jLongValue || j > ((Long) f13Var.a(null)).longValue() + jCurrentTimeMillis) {
            y53.l(c33Var);
            c33Var.w.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", c33.M(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        y53.l(c33Var);
        c33Var.a0.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.a);
        contentValues.put("source", Integer.valueOf(zzohVar.c));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (v0().insert("trigger_uris", null, contentValues) == -1) {
                y53.l(c33Var);
                c33Var.f.b(c33.M(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            y53.l(c33Var);
            c33Var.f.c(c33.M(str), e, "Error storing trigger URI. appId");
        }
    }

    public final long a0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = v0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                c33 c33Var = ((y53) this.a).f;
                y53.l(c33Var);
                c33Var.f.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long b0(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = v0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                c33 c33Var = ((y53) this.a).f;
                y53.l(c33Var);
                c33Var.f.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public final String c0(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = v0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return BuildConfig.FLAVOR;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                c33 c33Var = ((y53) this.a).f;
                y53.l(c33Var);
                c33Var.f.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final void d0(ContentValues contentValues) {
        y53 y53Var = (y53) this.a;
        try {
            SQLiteDatabase sQLiteDatabaseV0 = v0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.v.b(c33.M("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseV0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseV0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                c33Var2.f.c(c33.M("consent_settings"), c33.M("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            c33 c33Var3 = y53Var.f;
            y53.l(c33Var3);
            c33Var3.f.d("Error storing into table. key", c33.M("consent_settings"), c33.M("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final tu2 e0(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        y53 y53Var = (y53) this.a;
        gu2.l(str2);
        gu2.l(str3);
        D();
        F();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = v0().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        tu2 tu2Var = new tu2(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            c33 c33Var = y53Var.f;
                            y53.l(c33Var);
                            c33Var.f.b(c33.M(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return tu2Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.d("Error querying events. appId", c33.M(str2), y53Var.W.a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void f0(String str, tu2 tu2Var) {
        y53 y53Var = (y53) this.a;
        gu2.o(tu2Var);
        D();
        F();
        ContentValues contentValues = new ContentValues();
        String str2 = tu2Var.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", tu2Var.b);
        contentValues.put("lifetime_count", Long.valueOf(tu2Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(tu2Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(tu2Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(tu2Var.g));
        contentValues.put("last_bundled_day", tu2Var.h);
        contentValues.put("last_sampled_complex_event_id", tu2Var.i);
        contentValues.put("last_sampling_rate", tu2Var.j);
        contentValues.put("current_session_count", Long.valueOf(tu2Var.e));
        Boolean bool = tu2Var.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (v0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.f.b(c33.M(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.f.c(c33.M(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void g0(String str, String str2) {
        gu2.l(str2);
        D();
        F();
        try {
            v0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.c(c33.M(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final kf3 h0(String str, long j, byte[] bArr, String str2, String str3, int i2, int i3, long j2, long j3, long j4) {
        ia3 ia3Var;
        y53 y53Var = (y53) this.a;
        if (TextUtils.isEmpty(str2)) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.Z.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            s53 s53Var = (s53) lf3.p0(w53.A(), bArr);
            ia3[] ia3VarArrValues = ia3.values();
            int length = ia3VarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    ia3Var = ia3.UNKNOWN;
                    break;
                }
                ia3Var = ia3VarArrValues[i4];
                if (ia3Var.a == i2) {
                    break;
                }
                i4++;
            }
            if (ia3Var != ia3.GOOGLE_SIGNAL && ia3Var != ia3.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((w53) s53Var.b).t()).iterator();
                while (it.hasNext()) {
                    x53 x53Var = (x53) ((a63) it.next()).k();
                    x53Var.d();
                    ((a63) x53Var.b).X0(i3);
                    arrayList.add((a63) x53Var.g());
                }
                s53Var.d();
                ((w53) s53Var.b).F();
                s53Var.d();
                ((w53) s53Var.b).E(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        c33 c33Var2 = y53Var.f;
                        y53.l(c33Var2);
                        c33Var2.f.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new kf3(j, (w53) s53Var.g(), str2, map, ia3Var, j2, j3, j4, i3);
        } catch (IOException e) {
            c33 c33Var3 = y53Var.f;
            y53.l(c33Var3);
            c33Var3.f.c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String i0() {
        ((y53) this.a).X.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) h13.S.a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String str2 = "(upload_type != 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) h13.R.a(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        ts.r(sb, "(", str, " OR ", str2);
        sb.append(")");
        return sb.toString();
    }

    public final void k0(String str, p73 p73Var) {
        gu2.o(str);
        gu2.o(p73Var);
        D();
        F();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", p73Var.g());
        contentValues.put("consent_source", Integer.valueOf(p73Var.b));
        d0(contentValues);
    }

    public final List l0(String str) {
        List list;
        String string;
        y53 y53Var = (y53) this.a;
        D();
        F();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseV0 = v0();
            sQLiteDatabaseV0.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseV0.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = BuildConfig.FLAVOR;
                            } else {
                                string = cursorQuery.getString(1);
                                gu2.o(string);
                            }
                            if (string2 == null) {
                                c33 c33Var = y53Var.f;
                                y53.l(c33Var);
                                c33Var.f.b(c33.M(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursorQuery.getLong(2);
                                g03 g03VarT = h03.t();
                                g03VarT.d();
                                ((h03) g03VarT.b).u(string2);
                                g03VarT.d();
                                ((h03) g03VarT.b).x(j);
                                g03VarT.d();
                                ((h03) g03VarT.b).w(string);
                                if (zIsEmpty) {
                                    g03VarT.d();
                                    ((h03) g03VarT.b).v();
                                }
                                arrayList.add((h03) g03VarT.g());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseV0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseV0.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseV0.setTransactionSuccessful();
                    }
                } catch (SQLiteException e) {
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.c(c33.M(str), e, "Error querying or deleting diagnostic signals. appId");
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseV0.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseV0.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            c33 c33Var3 = y53Var.f;
            y53.l(c33Var3);
            c33Var3.f.c(c33.M(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void m0(String str, p73 p73Var) {
        gu2.o(str);
        D();
        F();
        k0(str, Y(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", p73Var.g());
        d0(contentValues);
    }

    public final p73 n0(String str) {
        gu2.o(str);
        D();
        F();
        return p73.c(100, c0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final tu2 o0(String str, d53 d53Var, String str2) {
        tu2 tu2VarE0 = e0("events", str, d53Var.y());
        if (tu2VarE0 != null) {
            long j = tu2VarE0.e + 1;
            long j2 = tu2VarE0.d + 1;
            return new tu2(tu2VarE0.a, tu2VarE0.b, tu2VarE0.c + 1, j2, j, tu2VarE0.f, tu2VarE0.g, tu2VarE0.h, tu2VarE0.i, tu2VarE0.j, tu2VarE0.k);
        }
        y53 y53Var = (y53) this.a;
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        c33Var.w.c(c33.M(str), y53Var.W.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new tu2(str, d53Var.y(), 1L, 1L, 1L, d53Var.A(), 0L, null, null, null, null);
    }

    public final boolean p0() {
        return ((y53) this.a).a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void q0(String str, long j, long j2, e20 e20Var) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jB0;
        long j3;
        String[] strArr2;
        String str3;
        long j4;
        b53 b53Var;
        y53 y53Var = (y53) this.a;
        D();
        F();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseV0 = v0();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = BuildConfig.FLAVOR;
                if (IsEmpty != 0) {
                    String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                    if (j2 != -1) {
                        str4 = "rowid <= ? and ";
                    }
                    StringBuilder sb = new StringBuilder(str4.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseV0.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseV0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        a63 a63Var = (a63) ((x53) lf3.p0(a63.Y(), cursorRawQuery.getBlob(0))).g();
                                        if (cursorRawQuery.moveToNext()) {
                                            c33 c33Var = y53Var.f;
                                            y53.l(c33Var);
                                            c33Var.w.b(c33.M(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        e20Var.b = a63Var;
                                        jB0 = b0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j2 == -1) {
                                            if (jB0 != -1) {
                                                j3 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseV0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j4 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j5 = cursorRawQuery.getLong(4);
                                                    try {
                                                        b53Var = (b53) lf3.p0(d53.J(), blob);
                                                        b53Var.q(cursorRawQuery.getString(1));
                                                        long j6 = cursorRawQuery.getLong(2);
                                                        b53Var.d();
                                                        ((d53) b53Var.b).Q(j6);
                                                        b53Var.d();
                                                        ((d53) b53Var.b).t(j5);
                                                        if (!e20Var.c(j4, (d53) b53Var.g())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        c33 c33Var2 = y53Var.f;
                                                        y53.l(c33Var2);
                                                        c33Var2.f.c(c33.M(r3), e, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                c33 c33Var3 = y53Var.f;
                                                y53.l(c33Var3);
                                                c33Var3.w.b(c33.M(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j3 = j2;
                                        }
                                        if (j3 == -1 && jB0 != -1) {
                                            jB0 = Math.min(j3, jB0);
                                        } else if (j3 != -1) {
                                            jB0 = j3;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jB0)};
                                        cursorRawQuery = sQLiteDatabaseV0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j4 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j7 = cursorRawQuery.getLong(4);
                                                b53Var = (b53) lf3.p0(d53.J(), blob2);
                                                b53Var.q(cursorRawQuery.getString(1));
                                                long j8 = cursorRawQuery.getLong(2);
                                                b53Var.d();
                                                ((d53) b53Var.b).Q(j8);
                                                b53Var.d();
                                                ((d53) b53Var.b).t(j7);
                                                if (!e20Var.c(j4, (d53) b53Var.g())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            c33 c33Var4 = y53Var.f;
                                            y53.l(c33Var4);
                                            c33Var4.w.b(c33.M(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        c33 c33Var5 = y53Var.f;
                                        y53.l(c33Var5);
                                        c33Var5.f.c(c33.M(r3), e2, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    c33 c33Var6 = y53Var.f;
                                    y53.l(c33Var6);
                                    c33Var6.f.b(c33.M(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                c33 c33Var7 = y53Var.f;
                                y53.l(c33Var7);
                                c33Var7.f.c(c33.M(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j2 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j2)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j2 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseV0.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseV0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                c33 c33Var8 = y53Var.f;
                                y53.l(c33Var8);
                                c33Var8.f.b(c33.M(r3), "Raw event metadata record is missing. appId");
                            } else {
                                a63 a63Var2 = (a63) ((x53) lf3.p0(a63.Y(), cursorRawQuery.getBlob(0))).g();
                                if (cursorRawQuery.moveToNext()) {
                                    c33 c33Var9 = y53Var.f;
                                    y53.l(c33Var9);
                                    c33Var9.w.b(c33.M(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                e20Var.b = a63Var2;
                                jB0 = b0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j2 == -1) {
                                    if (jB0 != -1) {
                                        j3 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseV0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j4 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j9 = cursorRawQuery.getLong(4);
                                            b53Var = (b53) lf3.p0(d53.J(), blob3);
                                            b53Var.q(cursorRawQuery.getString(1));
                                            long j10 = cursorRawQuery.getLong(2);
                                            b53Var.d();
                                            ((d53) b53Var.b).Q(j10);
                                            b53Var.d();
                                            ((d53) b53Var.b).t(j9);
                                            if (!e20Var.c(j4, (d53) b53Var.g())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        c33 c33Var10 = y53Var.f;
                                        y53.l(c33Var10);
                                        c33Var10.w.b(c33.M(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j3 = j2;
                                }
                                if (j3 == -1) {
                                    if (j3 != -1) {
                                        jB0 = j3;
                                    }
                                } else if (j3 != -1) {
                                    jB0 = j3;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jB0)};
                                cursorRawQuery = sQLiteDatabaseV0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j4 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j11 = cursorRawQuery.getLong(4);
                                        b53Var = (b53) lf3.p0(d53.J(), blob4);
                                        b53Var.q(cursorRawQuery.getString(1));
                                        long j12 = cursorRawQuery.getLong(2);
                                        b53Var.d();
                                        ((d53) b53Var.b).Q(j12);
                                        b53Var.d();
                                        ((d53) b53Var.b).t(j11);
                                        if (!e20Var.c(j4, (d53) b53Var.g())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c33 c33Var11 = y53Var.f;
                                    y53.l(c33Var11);
                                    c33Var11.w.b(c33.M(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        c33 c33Var12 = y53Var.f;
                        y53.l(c33Var12);
                        c33Var12.f.c(c33.M(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } catch (SQLiteException e6) {
                e = e6;
                IsEmpty = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    public final void s0() {
        F();
        v0().beginTransaction();
    }

    public final void t0() {
        F();
        v0().setTransactionSuccessful();
    }

    public final void u0() {
        F();
        v0().endTransaction();
    }

    public final SQLiteDatabase v0() {
        D();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(e, "Error opening database");
            throw e;
        }
    }

    public final void w0(String str) {
        tu2 tu2VarE0;
        g0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = v0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (tu2VarE0 = e0("events", str, string)) != null) {
                            f0("events_snapshot", tu2VarE0);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                c33 c33Var = ((y53) this.a).f;
                y53.l(c33Var);
                c33Var.f.c(c33.M(str), e, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void x0(String str) throws Throwable {
        boolean z;
        tu2 tu2VarE0;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        tu2 tu2VarE1 = e0("events", str, "_f");
        tu2 tu2VarE2 = e0("events", str, "_v");
        g0("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = v0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (tu2VarE0 = e0("events_snapshot", str, string)) != null) {
                            f0("events", tu2VarE0);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            c33 c33Var = ((y53) this.a).f;
                            y53.l(c33Var);
                            c33Var.f.c(c33.M(str), e, "Error querying snapshot. appId");
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && tu2VarE1 != null) {
                                f0("events", tu2VarE1);
                            } else if (!z && tu2VarE2 != null) {
                                f0("events", tu2VarE2);
                            }
                            g0("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                f0("events", tu2VarE2);
                            }
                        } else if (!z) {
                            f0("events", tu2VarE2);
                        }
                        g0("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && tu2VarE1 != null) {
                    f0("events", tu2VarE1);
                } else if (!z && tu2VarE2 != null) {
                    f0("events", tu2VarE2);
                }
            } else {
                cursorQuery.close();
                if (tu2VarE1 != null) {
                    f0("events", tu2VarE1);
                } else if (tu2VarE2 != null) {
                    f0("events", tu2VarE2);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        g0("events_snapshot", str);
    }

    public final void y0(String str, String str2) {
        gu2.l(str);
        gu2.l(str2);
        D();
        F();
        try {
            v0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            y53 y53Var = (y53) this.a;
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.d("Error deleting user property. appId", c33.M(str), y53Var.W.c(str2), e);
        }
    }

    public final boolean z0(of3 of3Var) {
        y53 y53Var = (y53) this.a;
        String str = of3Var.b;
        D();
        F();
        String str2 = of3Var.a;
        String str3 = of3Var.c;
        if (A0(str2, str3) == null) {
            if (qf3.E0(str3)) {
                if (a0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(y53Var.d.N(str2, h13.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jA0 = a0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                y53Var.getClass();
                if (jA0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(of3Var.d));
        r0(contentValues, of3Var.e);
        try {
            if (v0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.b(c33.M(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.f.c(c33.M(str2), e, "Error storing user property. appId");
            return true;
        }
    }
}
