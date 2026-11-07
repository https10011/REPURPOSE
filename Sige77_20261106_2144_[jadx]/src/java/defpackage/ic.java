package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.TrackData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ic {
    public String a;
    public long b;
    public Object c;

    public ic(String str, int i) {
        this.b = i;
        this.a = str;
        this.c = new TrackData();
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static ic b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new ic(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ic(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public void c() {
        long j = this.b;
        hc.g(j).i(this.a, (TrackData) this.c, j);
    }

    public void d(Bundle bundle) {
        ((TrackData) this.c).c("eparam", 0, bundle);
    }

    public List e() {
        List list;
        List list2;
        bu2 bu2Var = (bu2) this.c;
        ArrayList arrayList = new ArrayList();
        String str = this.a;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = bu2Var.v0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.b) {
                            this.b = j;
                        }
                        try {
                            b53 b53Var = (b53) lf3.p0(d53.J(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = BuildConfig.FLAVOR;
                            }
                            b53Var.q(string);
                            long j4 = cursorQuery.getLong(2);
                            b53Var.d();
                            ((d53) b53Var.b).Q(j4);
                            b53Var.d();
                            ((d53) b53Var.b).t(j3);
                            arrayList.add(new yt2(j, j2, z, (d53) b53Var.g()));
                        } catch (IOException e) {
                            c33 c33Var = ((y53) bu2Var.a).f;
                            y53.l(c33Var);
                            c33Var.f.c(c33.M(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                c33 c33Var2 = ((y53) bu2Var.a).f;
                y53.l(c33Var2);
                c33Var2.f.c(c33.M(str), e2, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public ic(long j, String str, String str2) {
        this.a = str;
        this.c = str2;
        this.b = j;
    }
}
