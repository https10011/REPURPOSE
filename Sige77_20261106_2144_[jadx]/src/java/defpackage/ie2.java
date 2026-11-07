package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fm.openinstall.listener.AppWakeUpListener;
import com.fm.openinstall.model.AppData;
import com.fm.openinstall.model.Error;
import com.hjq.toast.BuildConfig;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ie2 extends ge2 {
    public final Uri b;
    public final AppWakeUpListener c;
    public boolean d;

    public ie2(qp0 qp0Var, Uri uri, AppWakeUpListener appWakeUpListener) {
        super(qp0Var);
        this.d = false;
        this.b = uri;
        this.c = appWakeUpListener;
    }

    @Override // defpackage.ge2
    public final de2 H() {
        String str;
        qp0 qp0Var = (qp0) this.a;
        boolean z = false;
        Uri uri = this.b;
        if (uri == null) {
            HashMap map = new HashMap();
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
            ee2.a.execute(new bh0(19, this, linkedBlockingQueue, z));
            try {
                Pair pair = (Pair) linkedBlockingQueue.poll(3L, TimeUnit.SECONDS);
                map.put(pair.first, pair.second);
                l().a("wakeup");
            } catch (InterruptedException unused) {
            }
            ud2 ud2Var = (ud2) qp0Var.b;
            ce2 ce2VarA = ud2Var.a("/decode-wakeup-url", ud2Var.i(map));
            if (!(ce2VarA instanceof vd2)) {
                ud2 ud2Var2 = (ud2) qp0Var.b;
                ce2VarA = ud2Var2.a("/decode-wakeup-url", ud2Var2.i(map));
            }
            h(ce2VarA);
            return de2.a(ce2VarA);
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 0) {
            return ck1.a(8);
        }
        if (pathSegments.get(0).equalsIgnoreCase("c")) {
            this.d = true;
            if (pathSegments.size() > 1) {
                str = pathSegments.get(1);
                try {
                    str = new String(tb2.e.a(str), vb2.a);
                } catch (Exception unused2) {
                }
            } else {
                str = BuildConfig.FLAVOR;
            }
            return de2.b(str);
        }
        if (!pathSegments.get(0).equalsIgnoreCase("h")) {
            return ck1.a(8);
        }
        HashMap map2 = new HashMap();
        map2.put("waU", uri.toString());
        ud2 ud2Var3 = (ud2) qp0Var.b;
        ce2 ce2VarA2 = ud2Var3.a("/decode-wakeup-url", ud2Var3.i(map2));
        if (!(ce2VarA2 instanceof vd2)) {
            ud2 ud2Var4 = (ud2) qp0Var.b;
            ce2VarA2 = ud2Var4.a("/decode-wakeup-url", ud2Var4.i(map2));
        }
        h(ce2VarA2);
        return de2.a(ce2VarA2);
    }

    @Override // defpackage.ge2
    public final int I() {
        return 6;
    }

    @Override // defpackage.lo2
    public final void i(de2 de2Var) {
        AppData appDataF;
        Error error = de2Var.b;
        AppWakeUpListener appWakeUpListener = this.c;
        if (error != null) {
            if (g93.i) {
                g93.j("decodeWakeUp fail : %s", error);
            }
            if (appWakeUpListener != null) {
                appWakeUpListener.onWakeUpFinish(null, de2Var.b);
                return;
            }
            return;
        }
        String str = de2Var.a;
        if (g93.i) {
            g93.b("decodeWakeUp success : %s", str);
        }
        try {
            if (this.d) {
                appDataF = new AppData();
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("c")) {
                        appDataF.setChannel(jSONObject.optString("c"));
                    }
                    if (jSONObject.has("d")) {
                        appDataF.setData(jSONObject.optString("d"));
                    }
                }
            } else {
                appDataF = ge2.F(str);
            }
            if (appWakeUpListener != null) {
                appWakeUpListener.onWakeUpFinish(appDataF, null);
            }
            if (appDataF.isEmpty()) {
                return;
            }
            new le2((qp0) this.a, this.b).n();
        } catch (JSONException e) {
            if (g93.i) {
                g93.j("decodeWakeUp error : %s", e.toString());
            }
            if (appWakeUpListener != null) {
                appWakeUpListener.onWakeUpFinish(null, null);
            }
        }
    }

    @Override // defpackage.lo2
    public final String m() {
        return "wakeup";
    }
}
