package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class lo2 implements hj1, j73 {
    public Object a;

    public lo2(int i) {
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.a = new ri2(12);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                this.a = new Bundle();
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                this.a = new ConcurrentHashMap();
                break;
            default:
                this.a = new ArrayDeque(20);
                break;
        }
    }

    public void A(RuntimeException runtimeException, qp3 qp3Var) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void B(Object obj, long j, float f);

    public abstract double C(Object obj, long j);

    public void D() {
        t53 t53Var = ((y53) this.a).i;
        y53.l(t53Var);
        t53Var.D();
    }

    public abstract void E(Object obj, long j, double d);

    @Override // defpackage.j73
    public nk1 b() {
        throw null;
    }

    @Override // defpackage.hj1
    public Object c(InputStream inputStream) throws IOException {
        try {
            ri2 ri2Var = (ri2) this.a;
            ri2Var.getClass();
            try {
                return r(new JSONObject(((r41) ri2Var.a).c(inputStream)));
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    @Override // defpackage.j73
    public c33 d() {
        throw null;
    }

    @Override // defpackage.j73
    public t53 e() {
        throw null;
    }

    @Override // defpackage.j73
    public Context f() {
        throw null;
    }

    @Override // defpackage.j73
    public r41 g() {
        throw null;
    }

    public void h(ce2 ce2Var) {
        qp0 qp0Var = (qp0) this.a;
        if (ce2Var instanceof vd2) {
            String str = ((vd2) ce2Var).d;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            lf2 lf2VarB = lf2.b(str);
            lf2 lf2Var = (lf2) qp0Var.e;
            if (!lf2Var.equals(lf2VarB)) {
                lf2Var.a(lf2VarB);
                ((pv2) qp0Var.c).o(lf2Var);
            }
            if (TextUtils.isEmpty(lf2Var.f)) {
                return;
            }
            pv2 pv2VarJ = qp0Var.j();
            String str2 = (String) ue2.j.b;
            String str3 = lf2Var.f;
            rb2 rb2Var = (rb2) pv2VarJ.a;
            String strB = rb2Var.b(str2);
            if (strB == null || !strB.equals(str3)) {
                rb2Var.d(str2, str3);
            }
        }
    }

    public abstract void j(o71 o71Var);

    public abstract String k();

    public hc2 l() {
        Context context = (Context) ((qp0) this.a).a;
        if (hc2.g == null) {
            synchronized (hc2.class) {
                try {
                    if (hc2.g == null) {
                        hc2.g = new hc2(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hc2.g;
    }

    public abstract String m();

    public void n() {
        o();
        ee2.a.execute(new i4(this, 24));
    }

    public abstract de2 p();

    public void q(xb1 xb1Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(xb1Var);
        }
    }

    public abstract Object r(JSONObject jSONObject);

    public abstract Object s();

    public abstract void t(Object obj, long j, byte b);

    public Object u(kq3 kq3Var, g93 g93Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        Object obj = concurrentHashMap.get(kq3Var);
        if (obj != null) {
            return obj;
        }
        Object objS = s();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(kq3Var, objS);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iJ = g93Var.J();
        for (int i = 0; i < iJ; i++) {
            if (aq3.f.equals(g93Var.M(i))) {
                g93Var.N(i);
            }
        }
        return objS;
    }

    public abstract boolean v(Object obj, long j);

    public abstract boolean w(Level level);

    public abstract void x(Object obj, long j, boolean z);

    public abstract void y(qp3 qp3Var);

    public abstract float z(Object obj, long j);

    public void o() {
    }

    public void i(de2 de2Var) {
    }

    public lo2(y53 y53Var) {
        gu2.o(y53Var);
        this.a = y53Var;
    }

    public /* synthetic */ lo2(Object obj) {
        this.a = obj;
    }
}
