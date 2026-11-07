package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.hjq.toast.BuildConfig;
import java.util.TreeSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o83 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ w93 c;

    public /* synthetic */ o83(w93 w93Var, Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
        this.c = w93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.b;
        w93 w93Var = this.c;
        switch (i) {
            case 0:
                w93Var.D();
                w93Var.F();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                gu2.l(string);
                gu2.l(string2);
                gu2.o(bundle.get("value"));
                y53 y53Var = (y53) w93Var.a;
                if (!y53Var.a()) {
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.a0.a("Conditional property not set since app measurement is disabled");
                } else {
                    zzpl zzplVar = new zzpl(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        qf3 qf3Var = y53Var.w;
                        y53.j(qf3Var);
                        bundle.getString("app_id");
                        zzbh zzbhVarL0 = qf3Var.l0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        y53.j(qf3Var);
                        bundle.getString("app_id");
                        zzbh zzbhVarL1 = qf3Var.l0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString("app_id");
                        y53Var.o().X(new zzah(bundle.getString("app_id"), string2, zzplVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzbhVarL1, bundle.getLong("trigger_timeout"), zzbhVarL0, bundle.getLong("time_to_live"), qf3Var.l0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                w93Var.D();
                w93Var.F();
                String string3 = bundle.getString("name");
                gu2.l(string3);
                y53 y53Var2 = (y53) w93Var.a;
                if (!y53Var2.a()) {
                    c33 c33Var2 = y53Var2.f;
                    y53.l(c33Var2);
                    c33Var2.a0.a("Conditional property not cleared since app measurement is disabled");
                } else {
                    zzpl zzplVar2 = new zzpl(0L, (Object) null, string3, BuildConfig.FLAVOR);
                    try {
                        qf3 qf3Var2 = y53Var2.w;
                        y53.j(qf3Var2);
                        bundle.getString("app_id");
                        y53Var2.o().X(new zzah(bundle.getString("app_id"), BuildConfig.FLAVOR, zzplVar2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzbh) null, bundle.getLong("trigger_timeout"), (zzbh) null, bundle.getLong("time_to_live"), qf3Var2.l0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                ox1 ox1Var = w93Var.i0;
                y53 y53Var3 = (y53) w93Var.a;
                if (!bundle.isEmpty()) {
                    h43 h43Var = y53Var3.e;
                    qf3 qf3Var3 = y53Var3.w;
                    is2 is2Var = y53Var3.d;
                    c33 c33Var3 = y53Var3.f;
                    y53.j(h43Var);
                    Bundle bundle2 = new Bundle(h43Var.l0.k());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            y53.j(qf3Var3);
                            if (qf3.Q0(obj)) {
                                qf3.W(ox1Var, null, 27, null, null, 0);
                            }
                            y53.l(c33Var3);
                            c33Var3.X.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (qf3.i0(str)) {
                            y53.l(c33Var3);
                            c33Var3.X.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            y53.j(qf3Var3);
                            is2Var.getClass();
                            if (qf3Var3.I("param", str, 500, obj)) {
                                qf3Var3.V(bundle2, str, obj);
                            }
                        }
                    }
                    y53.j(qf3Var3);
                    qf3 qf3Var4 = ((y53) is2Var.a).w;
                    y53.j(qf3Var4);
                    int i2 = qf3Var4.o0(201500000) ? 100 : 25;
                    if (bundle2.size() > i2) {
                        int i3 = 0;
                        for (String str2 : new TreeSet(bundle2.keySet())) {
                            i3++;
                            if (i3 > i2) {
                                bundle2.remove(str2);
                            }
                        }
                        y53.j(qf3Var3);
                        qf3.W(ox1Var, null, 26, null, null, 0);
                        y53.l(c33Var3);
                        c33Var3.X.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                h43 h43Var2 = y53Var3.e;
                y53.j(h43Var2);
                h43Var2.l0.x(bundle);
                y53Var3.o().J(bundle);
                break;
        }
    }
}
