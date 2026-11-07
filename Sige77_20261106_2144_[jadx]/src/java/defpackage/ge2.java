package defpackage;

import android.text.TextUtils;
import com.fm.openinstall.model.AppData;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ge2 extends lo2 implements Callable {
    public static AppData F(String str) {
        AppData appData = new AppData();
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("channelCode")) {
                appData.setChannel(jSONObject.optString("channelCode"));
            }
            if (jSONObject.has("bind")) {
                appData.setData(jSONObject.optString("bind"));
            }
        }
        return appData;
    }

    public void G() {
        l().a(m());
    }

    public abstract de2 H();

    public abstract int I();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        G();
        ec1 ec1Var = (ec1) ((qp0) this.a).d;
        String strM = m();
        long jI = I();
        if (((jf2) ec1Var.b) == null || ((jf2) ec1Var.b) == jf2.c || ((jf2) ec1Var.b) == jf2.d) {
            ((LinkedBlockingQueue) ec1Var.d).offer(ec1Var.a);
            try {
                ((CountDownLatch) ec1Var.c).await(jI, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                if (g93.i) {
                    g93.g("%s awaitInit interrupted", strM);
                }
            }
        }
        if (((ec1) ((qp0) this.a).d).b()) {
            return ((jf2) ((ec1) ((qp0) this.a).d).b) == jf2.f ? H() : ck1.b(2, ((pv2) ((qp0) this.a).c).b("FM_init_msg"));
        }
        return ck1.a(6);
    }

    @Override // defpackage.lo2
    public final de2 p() {
        Future futureSubmit = ee2.b.submit(this);
        try {
            return (de2) futureSubmit.get(I(), TimeUnit.SECONDS);
        } catch (TimeoutException unused) {
            futureSubmit.cancel(true);
            return ck1.a(6);
        } catch (Exception e) {
            return ck1.b(3, e.getMessage());
        }
    }
}
