package defpackage;

import android.content.Context;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustDeeplink;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;

    public /* synthetic */ w4(String str, long j, Context context) {
        this.a = 4;
        this.d = j;
        this.b = str;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wf3 wf3Var;
        switch (this.a) {
            case 0:
                ActivityHandler.I((ActivityHandler) this.b, (AdjustDeeplink) this.c, this.d);
                break;
            case 1:
                ActivityHandler.A((ActivityHandler) this.b, (AdjustDeeplink) this.c, this.d);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ActivityHandler.x((ActivityHandler) this.b, (AdjustDeeplink) this.c, this.d);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ActivityHandler.X((ActivityHandler) this.b, (AdjustDeeplink) this.c, this.d);
                break;
            default:
                long j = this.d;
                String str = (String) this.b;
                Context context = (Context) this.c;
                wf3 wf3Var2 = e5.g;
                Long l = wf3Var2 != null ? (Long) wf3Var2.d : null;
                if (e5.g == null) {
                    e5.g = new wf3(Long.valueOf(j), null);
                    String str2 = e5.i;
                    context.getClass();
                    gp1.j(context, str, str2);
                } else if (l != null) {
                    long jLongValue = j - l.longValue();
                    String str3 = e5.a;
                    ja0 ja0VarB = ma0.b(i90.b());
                    if (jLongValue > (ja0VarB == null ? 60 : ja0VarB.b) * 1000) {
                        gp1.n(str, e5.g, e5.i);
                        String str4 = e5.i;
                        context.getClass();
                        gp1.j(context, str, str4);
                        e5.g = new wf3(Long.valueOf(j), null);
                    } else if (jLongValue > 1000 && (wf3Var = e5.g) != null) {
                        wf3Var.b++;
                    }
                }
                wf3 wf3Var3 = e5.g;
                if (wf3Var3 != null) {
                    wf3Var3.d = Long.valueOf(j);
                }
                wf3 wf3Var4 = e5.g;
                if (wf3Var4 != null) {
                    wf3Var4.c();
                }
                break;
        }
    }

    public /* synthetic */ w4(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustDeeplink;
        this.d = j;
    }
}
