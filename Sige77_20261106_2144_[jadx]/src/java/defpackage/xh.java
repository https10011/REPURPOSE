package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.hjq.toast.BuildConfig;
import java.util.Set;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xh extends BroadcastReceiver {
    public static xh c;
    public final /* synthetic */ int a;
    public final Object b;

    public xh(Context context) {
        this.a = 0;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
    }

    public static final xh a() {
        if (mt.a.contains(xh.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            mt.a(xh.class, th);
            return null;
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 0:
                Set set = mt.a;
                if (!set.contains(this)) {
                    try {
                        if (!set.contains(this)) {
                            try {
                                co coVarX = co.x((Context) this.b);
                                coVarX.getClass();
                                coVarX.J(this);
                            } catch (Throwable th) {
                                mt.a(this, th);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        mt.a(this, th2);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (!mt.a.contains(this)) {
                    try {
                        pa paVar = new pa(context, (String) null);
                        StringBuilder sb = new StringBuilder("bf_");
                        sb.append(intent != null ? intent.getStringExtra("event_name") : null);
                        String string = sb.toString();
                        Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                        Bundle bundle = new Bundle();
                        Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
                        if (setKeySet != null) {
                            for (String str : setKeySet) {
                                str.getClass();
                                bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(str, "-"), BuildConfig.FLAVOR), BuildConfig.FLAVOR), (String) bundleExtra.get(str));
                            }
                        }
                        i90 i90Var = i90.a;
                        if (x32.c()) {
                            paVar.d(string, bundle);
                        }
                    } catch (Throwable th) {
                        mt.a(this, th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                ((h8) obj).n();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                context.getClass();
                intent.getClass();
                ((CustomTabActivity) obj).finish();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                context.getClass();
                intent.getClass();
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) obj;
                Intent intent2 = new Intent((Context) customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i2 = CustomTabMainActivity.c;
                intent2.setAction("CustomTabMainActivity.action_refresh");
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                break;
            default:
                y53 y53Var = (y53) obj;
                if (intent == null) {
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.w.a("App receiver called with null intent");
                } else {
                    String action = intent.getAction();
                    if (action == null) {
                        c33 c33Var2 = y53Var.f;
                        y53.l(c33Var2);
                        c33Var2.w.a("App receiver called with null action");
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                c33 c33Var3 = y53Var.f;
                                y53.l(c33Var3);
                                c33Var3.a0.a("[sgtm] App Receiver notified batches are available");
                                t53 t53Var = y53Var.i;
                                y53.l(t53Var);
                                t53Var.N(new aj2(this, 13));
                            }
                            break;
                        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            hq2.a();
                            if (y53Var.d.P(null, h13.P0)) {
                                c33 c33Var4 = y53Var.f;
                                y53.l(c33Var4);
                                c33Var4.a0.a("App receiver notified triggers are available");
                                t53 t53Var2 = y53Var.i;
                                y53.l(t53Var2);
                                t53Var2.N(new aj2(y53Var, 14));
                                break;
                            }
                        }
                        c33 c33Var5 = y53Var.f;
                        y53.l(c33Var5);
                        c33Var5.w.a("App receiver called with unknown action");
                    }
                }
                break;
        }
    }

    public xh(y53 y53Var) {
        this.a = 4;
        this.b = y53Var;
    }

    public /* synthetic */ xh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
