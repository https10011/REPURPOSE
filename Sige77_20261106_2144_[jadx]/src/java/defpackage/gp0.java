package defpackage;

import android.content.Context;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFj1rSDK;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class gp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gp0(AFj1rSDK aFj1rSDK, Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        this.a = 3;
        this.e = aFj1rSDK;
        this.c = context;
        this.b = runnable;
        this.d = aFd1zSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArrF;
        int i = this.a;
        int i2 = 2;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                kp0 kp0Var = (kp0) obj4;
                Runnable runnable = (Runnable) obj2;
                rp0 rp0Var = (rp0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (!mt.a.contains(kp0.class)) {
                    try {
                        Class cls = kp0Var.e;
                        sp0.s(kp0Var.b, kp0Var.i, kp0Var.d(), kp0Var.k.h(rp0Var, arrayList), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new fd(kp0Var, runnable, 1)));
                    } catch (Throwable th) {
                        mt.a(kp0.class, th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                lp0 lp0Var = (lp0) obj4;
                Runnable runnable2 = (Runnable) obj2;
                rp0 rp0Var2 = (rp0) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                if (!mt.a.contains(lp0.class)) {
                    try {
                        Class cls2 = lp0Var.n;
                        Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new fd(lp0Var, new Object[]{runnable2}, i2));
                        Object objF = lp0Var.f(rp0Var2, arrayList2);
                        if (objF != null) {
                            sp0.s(lp0Var.b, lp0Var.v, lp0Var.d(), objF, objNewProxyInstance);
                        }
                    } catch (Throwable th2) {
                        mt.a(lp0.class, th2);
                        return;
                    }
                    break;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                JSONObject jSONObject = (JSONObject) obj4;
                String str = (String) obj2;
                t62 t62Var = (t62) obj3;
                String str2 = (String) obj;
                if (!mt.a.contains(t62.class)) {
                    try {
                        str.getClass();
                        try {
                            String lowerCase = h42.l(i90.a()).toLowerCase();
                            lowerCase.getClass();
                            float[] fArrN = ba0.n(lowerCase, jSONObject);
                            String strQ = ba0.q(str, t62Var.d, lowerCase);
                            if (fArrN != null && (strArrF = j51.f(2, new float[][]{fArrN}, new String[]{strQ})) != null) {
                                String str3 = strArrF[0];
                                bc1.a(str2, str3);
                                if (!Intrinsics.areEqual(str3, "other")) {
                                    HashSet hashSet = t62.e;
                                    op0.w(str3, str, fArrN);
                                }
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th3) {
                        mt.a(t62.class, th3);
                        return;
                    }
                    break;
                }
                break;
            default:
                AFj1rSDK.c((AFj1rSDK) obj4, (Context) obj3, (Runnable) obj2, (AFd1zSDK) obj);
                break;
        }
    }

    public /* synthetic */ gp0(int i, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = serializable;
    }
}
