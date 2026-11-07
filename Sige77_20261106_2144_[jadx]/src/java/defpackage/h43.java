package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h43 extends i73 {
    public static final Pair m0 = new Pair(BuildConfig.FLAVOR, 0L);
    public long W;
    public final b43 X;
    public final v33 Y;
    public final hc Z;
    public final ud2 a0;
    public final v33 b0;
    public SharedPreferences c;
    public final b43 c0;
    public SharedPreferences d;
    public final b43 d0;
    public e20 e;
    public boolean e0;
    public final b43 f;
    public final v33 f0;
    public final v33 g0;
    public final b43 h0;
    public final hc i;
    public final hc i0;
    public final hc j0;
    public final b43 k0;
    public final ud2 l0;
    public String v;
    public boolean w;

    public h43(y53 y53Var) {
        super(y53Var);
        this.X = new b43(this, "session_timeout", 1800000L);
        this.Y = new v33(this, "start_new_session", true);
        this.c0 = new b43(this, "last_pause_time", 0L);
        this.d0 = new b43(this, "session_id", 0L);
        this.Z = new hc(this, "non_personalized_ads");
        this.a0 = new ud2(this, "last_received_uri_timestamps_by_source");
        this.b0 = new v33(this, "allow_remote_dynamite", false);
        this.f = new b43(this, "first_open_time", 0L);
        gu2.l("app_install_time");
        this.i = new hc(this, "app_instance_id");
        this.f0 = new v33(this, "app_backgrounded", false);
        this.g0 = new v33(this, "deep_link_retrieval_complete", false);
        this.h0 = new b43(this, "deep_link_retrieval_attempts", 0L);
        this.i0 = new hc(this, "firebase_feature_rollouts");
        this.j0 = new hc(this, "deferred_attribution_cache");
        this.k0 = new b43(this, "deferred_attribution_cache_timestamp", 0L);
        this.l0 = new ud2(this, "default_event_parameters");
    }

    @Override // defpackage.i73
    public final boolean F() {
        return true;
    }

    public final SharedPreferences I() {
        D();
        G();
        gu2.o(this.c);
        return this.c;
    }

    public final SharedPreferences J() {
        D();
        G();
        if (this.d == null) {
            y53 y53Var = (y53) this.a;
            String strValueOf = String.valueOf(y53Var.a.getPackageName());
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            z23 z23Var = c33Var.a0;
            String strConcat = strValueOf.concat("_preferences");
            z23Var.b(strConcat, "Default prefs file");
            this.d = y53Var.a.getSharedPreferences(strConcat, 0);
        }
        return this.d;
    }

    public final SparseArray K() {
        Bundle bundleK = this.a0.k();
        int[] intArray = bundleK.getIntArray("uriSources");
        long[] longArray = bundleK.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final p73 L() {
        D();
        return p73.c(I().getInt("consent_source", 100), I().getString("consent_settings", "G1"));
    }

    public final void M(boolean z) {
        D();
        c33 c33Var = ((y53) this.a).f;
        y53.l(c33Var);
        c33Var.a0.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = I().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean N(long j) {
        return j - this.X.a() > this.c0.a();
    }
}
