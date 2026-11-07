package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d63 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ g73 c;

    public /* synthetic */ d63(g73 g73Var, zzr zzrVar, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = g73Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        zzr zzrVar = this.b;
        g73 g73Var = this.c;
        switch (i) {
            case 0:
                g73Var.a.V();
                g73Var.a.Y(zzrVar);
                break;
            case 1:
                g73Var.a.V();
                if3 if3Var = g73Var.a;
                if3Var.e().D();
                if3Var.l0();
                gu2.o(zzrVar);
                String str = zzrVar.a;
                gu2.l(str);
                int i2 = 0;
                if (if3Var.e0().P(null, h13.y0)) {
                    if3Var.g().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iN = if3Var.e0().N(null, h13.h0);
                    if3Var.e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) h13.e.a(null)).longValue();
                    while (i2 < iN && if3Var.I(null, jLongValue)) {
                        i2++;
                    }
                } else {
                    if3Var.e0();
                    long jIntValue = ((Integer) h13.l.a(null)).intValue();
                    while (i2 < jIntValue && if3Var.I(str, 0L)) {
                        i2++;
                    }
                }
                if (if3Var.e0().P(null, h13.z0)) {
                    if3Var.e().D();
                    if3Var.H();
                }
                se3 se3Var = if3Var.W;
                int iJ = ck1.j(zzrVar.r0);
                se3Var.D();
                if (iJ == 2 && !se3.H(str)) {
                    f53 f53Var = se3Var.b.a;
                    if3.T(f53Var);
                    l23 l23VarQ = f53Var.Q(str);
                    if (l23VarQ != null && l23VarQ.H() && !l23VarQ.I().u().isEmpty()) {
                        if3Var.d().a0.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        if3Var.g().getClass();
                        if3Var.r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                g73Var.a.V();
                if3 if3Var2 = g73Var.a;
                if3Var2.e().D();
                if3Var2.l0();
                gu2.l(zzrVar.a);
                if3Var2.c0(zzrVar);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                g73Var.a.V();
                if3 if3Var3 = g73Var.a;
                if (if3Var3.l0 != null) {
                    ArrayList arrayList = new ArrayList();
                    if3Var3.m0 = arrayList;
                    arrayList.addAll(if3Var3.l0);
                }
                bu2 bu2Var = if3Var3.c;
                if3.T(bu2Var);
                y53 y53Var = (y53) bu2Var.a;
                String str2 = zzrVar.a;
                gu2.o(str2);
                gu2.l(str2);
                bu2Var.D();
                bu2Var.F();
                try {
                    SQLiteDatabase sQLiteDatabaseV0 = bu2Var.v0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseV0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseV0.delete("events", "app_id=?", strArr) + sQLiteDatabaseV0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseV0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseV0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseV0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseV0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseV0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseV0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseV0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseV0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseV0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseV0.delete("upload_queue", "app_id=?", strArr);
                    if (y53Var.d.P(null, h13.c1)) {
                        iDelete += sQLiteDatabaseV0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseV0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        c33 c33Var = y53Var.f;
                        y53.l(c33Var);
                        c33Var.a0.c(str2, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.c(c33.M(str2), e, "Error resetting analytics data. appId, error");
                }
                if (zzrVar.v) {
                    if3Var3.Y(zzrVar);
                }
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                g73Var.a.V();
                if3 if3Var4 = g73Var.a;
                if3Var4.e().D();
                if3Var4.l0();
                gu2.l(zzrVar.a);
                if3Var4.m0(zzrVar);
                if3Var4.n0(zzrVar);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if3 if3Var5 = g73Var.a;
                if3Var5.V();
                if3Var5.n0(zzrVar);
                break;
            default:
                if3 if3Var6 = g73Var.a;
                if3Var6.V();
                if3Var6.m0(zzrVar);
                break;
        }
    }
}
