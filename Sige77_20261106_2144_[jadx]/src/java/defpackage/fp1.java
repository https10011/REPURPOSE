package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fp1 {
    public final nc a;
    public final String b;
    public ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public int e;

    public fp1(nc ncVar, String str) {
        this.a = ncVar;
        this.b = str;
    }

    public final synchronized void a(z9 z9Var) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            z9Var.getClass();
            if (this.c.size() + this.d.size() >= 1000) {
                this.e++;
            } else {
                this.c.add(z9Var);
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final synchronized void b(boolean z) {
        if (mt.a.contains(this)) {
            return;
        }
        if (z) {
            try {
                this.c.addAll(this.d);
            } catch (Throwable th) {
                mt.a(this, th);
                return;
            }
        }
        this.d.clear();
        this.e = 0;
    }

    public final synchronized List c() {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.c;
            this.c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final int d(mk0 mk0Var, Context context, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        if (mt.a.contains(this)) {
            return 0;
        }
        try {
            context.getClass();
            try {
                synchronized (this) {
                    try {
                        int i = this.e;
                        q70.b(this.c);
                        this.d.addAll(this.c);
                        this.c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList = this.d;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            try {
                                Object obj = arrayList.get(i2);
                                i2++;
                                z9 z9Var = (z9) obj;
                                if (z || !z9Var.c) {
                                    jSONArray.put(z9Var.a);
                                    jSONArray2.put(z9Var.b);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            Unit unit = Unit.a;
                            e(mk0Var, context, i, jSONArray, jSONArray2, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                            mt.a(this, th);
                            return 0;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
                mt.a(this, th);
                return 0;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void e(mk0 mk0Var, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (mt.a.contains(this)) {
                return;
            }
            try {
                jSONObject = ra.a(qa.b, this.a, this.b, z, context);
                if (this.e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            mk0Var.c = jSONObject;
            Bundle bundle = mk0Var.d;
            String string = jSONArray.toString();
            string.getClass();
            bundle.putString("custom_events", string);
            if (fa0.b(da0.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            mk0Var.e = string;
            mk0Var.d = bundle;
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
