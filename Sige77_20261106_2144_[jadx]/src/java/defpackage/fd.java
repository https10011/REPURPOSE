package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fd implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public fd(hx0 hx0Var) {
        this.a = 0;
        this.b = hx0Var;
        this.c = new ConcurrentHashMap(0);
    }

    public void a(Object obj, Method method, Object[] objArr) {
        Class cls;
        Method method2;
        kp0 kp0Var = (kp0) this.c;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            obj.getClass();
            method.getClass();
            if (Intrinsics.areEqual(method.getName(), "onSkuDetailsResponse")) {
                Object objK = objArr != null ? wb.k(1, objArr) : null;
                if (objK != null && (objK instanceof List)) {
                    for (Object obj2 : (List) objK) {
                        try {
                            if (mt.a.contains(kp0.class)) {
                                cls = null;
                            } else {
                                try {
                                    cls = kp0Var.c;
                                } catch (Throwable th) {
                                    mt.a(kp0.class, th);
                                    cls = null;
                                }
                            }
                            if (mt.a.contains(kp0.class)) {
                                method2 = null;
                            } else {
                                try {
                                    method2 = kp0Var.g;
                                } catch (Throwable th2) {
                                    mt.a(kp0.class, th2);
                                    method2 = null;
                                }
                            }
                            Object objS = sp0.s(cls, method2, obj2, new Object[0]);
                            String str = objS instanceof String ? (String) objS : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    xn xnVar = kp0.l;
                                    ConcurrentHashMap concurrentHashMapP = xn.p();
                                    string.getClass();
                                    concurrentHashMapP.put(string, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    ((Runnable) this.b).run();
                }
            }
        } catch (Throwable th3) {
            mt.a(this, th3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x0291  */
    /* JADX WARN: Code duplicated, block: B:198:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x007d A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        boolean zBooleanValue;
        ix0 ix0VarA;
        Object objA;
        Object obj2;
        switch (this.a) {
            case 0:
                hx0 hx0Var = (hx0) this.b;
                try {
                    Object objInvoke = method.invoke(hx0Var, objArr);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
                    Boolean bool = (Boolean) concurrentHashMap.get(method);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        String name = method.getName();
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        Class<hx0> superclass = hx0.class;
                        while (true) {
                            if (superclass != null) {
                                try {
                                    if (((gy1) superclass.getDeclaredMethod(name, parameterTypes).getAnnotation(gy1.class)) != null) {
                                        concurrentHashMap.put(method, Boolean.TRUE);
                                        zBooleanValue = true;
                                    } else {
                                        continue;
                                    }
                                } catch (NoSuchMethodException unused) {
                                }
                                superclass = superclass.getSuperclass();
                            } else {
                                concurrentHashMap.put(method, Boolean.FALSE);
                                zBooleanValue = false;
                            }
                        }
                    }
                    if (!zBooleanValue || !(objInvoke instanceof ix0) || ((ix0) objInvoke).c.a != 401) {
                        return objInvoke;
                    }
                    ac2 ac2Var = hx0Var.d;
                    jx0 jx0Var = jx0.f;
                    try {
                        er0 er0VarZ = ac2Var.z();
                        if (er0VarZ != null) {
                            String str = er0VarZ.d;
                            if (TextUtils.isEmpty(str)) {
                                ix0VarA = ix0.a(jx0Var, new LineApiError("access token or refresh token is not found."));
                            } else {
                                mx0 mx0Var = hx0Var.b;
                                String str2 = hx0Var.a;
                                Uri uriI = g93.i(mx0Var.a, "oauth2/v2.1", "token");
                                LinkedHashMap linkedHashMapH = g93.h("grant_type", "refresh_token", "refresh_token", er0VarZ.d, "client_id", str2);
                                vl vlVar = mx0Var.b;
                                Map map = Collections.EMPTY_MAP;
                                ix0 ix0VarH = vlVar.h(uriI, linkedHashMapH, mx0.f);
                                if (ix0VarH.d()) {
                                    zg1 zg1Var = (zg1) ix0VarH.c();
                                    if (!TextUtils.isEmpty(zg1Var.c)) {
                                        str = zg1Var.c;
                                    }
                                    String str3 = zg1Var.a;
                                    long j = zg1Var.b;
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    try {
                                        ((Context) ac2Var.b).getSharedPreferences((String) ac2Var.d, 0).edit().putString("accessToken", ac2Var.y(str3)).putString("expiresIn", ac2Var.x(j)).putString("issuedClientTime", ac2Var.x(jCurrentTimeMillis)).putString("refreshToken", ac2Var.y(str)).apply();
                                        ix0VarA = ix0.b(new LineAccessToken(str3, j, jCurrentTimeMillis));
                                    } catch (Exception e) {
                                        ix0VarA = ix0.a(jx0Var, new LineApiError("save access token fail:" + e.getMessage()));
                                    }
                                } else {
                                    ix0VarA = ix0.a(ix0VarH.a, ix0VarH.c);
                                }
                            }
                        } else {
                            ix0VarA = ix0.a(jx0Var, new LineApiError("access token or refresh token is not found."));
                        }
                    } catch (Exception e2) {
                        ix0VarA = ix0.a(jx0Var, new LineApiError("get access token fail:" + e2.getMessage()));
                    }
                    if (!ix0VarA.d()) {
                        return ix0VarA.a == jx0.c ? ix0VarA : objInvoke;
                    }
                    try {
                        return method.invoke(hx0Var, objArr);
                    } catch (InvocationTargetException e3) {
                        throw e3.getTargetException();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getTargetException();
                }
            case 1:
                if (mt.a.contains(this)) {
                    return null;
                }
                try {
                    a(obj, method, objArr);
                    return Unit.a;
                } catch (Throwable th) {
                    mt.a(this, th);
                    return null;
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Object[] objArr2 = (Object[]) this.b;
                lp0 lp0Var = (lp0) this.c;
                obj.getClass();
                method.getClass();
                String name2 = method.getName();
                if (name2 != null) {
                    switch (name2.hashCode()) {
                        case -1642587947:
                            if (name2.equals("onPurchaseHistoryResponse") && !mt.a.contains(lp0.class)) {
                                try {
                                    lp0Var.j(objArr2, objArr);
                                } catch (Throwable th2) {
                                    mt.a(lp0.class, th2);
                                }
                            }
                            break;
                        case -1599362358:
                            if (name2.equals("onQueryPurchasesResponse") && !mt.a.contains(lp0.class)) {
                                try {
                                    lp0Var.k(objArr2, objArr);
                                } catch (Throwable th3) {
                                    mt.a(lp0.class, th3);
                                }
                            }
                            break;
                        case -79406125:
                            if (name2.equals("onBillingSetupFinished") && !mt.a.contains(lp0.class)) {
                                try {
                                    lp0Var.h(objArr2, objArr);
                                } catch (Throwable th4) {
                                    mt.a(lp0.class, th4);
                                }
                            }
                            break;
                        case 1227540564:
                            if (name2.equals("onBillingServiceDisconnected")) {
                                Set set = mt.a;
                                if (!set.contains(lp0.class)) {
                                    try {
                                        if (!set.contains(lp0Var)) {
                                            try {
                                                lp0.H.set(false);
                                            } catch (Throwable th5) {
                                                mt.a(lp0Var, th5);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        mt.a(lp0.class, th6);
                                    }
                                }
                            }
                            break;
                        case 1940131955:
                            if (name2.equals("onProductDetailsResponse") && !mt.a.contains(lp0.class)) {
                                try {
                                    lp0Var.i(objArr2, objArr);
                                } catch (Throwable th7) {
                                    mt.a(lp0.class, th7);
                                }
                            }
                            break;
                    }
                }
                return null;
            default:
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                Object[] objArr3 = objArr != null ? objArr : (Object[]) this.b;
                k42 k42Var = rb1.b;
                if (k42Var.j(method)) {
                    return k42Var.i(obj, method, objArr3);
                }
                yj1 yj1Var = (yj1) this.c;
                while (true) {
                    Object objPutIfAbsent = yj1Var.a.get(method);
                    if (objPutIfAbsent instanceof dp1) {
                        objA = (dp1) objPutIfAbsent;
                    } else if (objPutIfAbsent != null) {
                        synchronized (objPutIfAbsent) {
                            obj2 = yj1Var.a.get(method);
                            if (obj2 == null) {
                                objA = (dp1) obj2;
                                break;
                            }
                        }
                    } else {
                        Object obj3 = new Object();
                        synchronized (obj3) {
                            try {
                                objPutIfAbsent = yj1Var.a.putIfAbsent(method, obj3);
                                if (objPutIfAbsent != null) {
                                    synchronized (objPutIfAbsent) {
                                        try {
                                            obj2 = yj1Var.a.get(method);
                                            if (obj2 == null) {
                                                objA = (dp1) obj2;
                                            }
                                        } catch (Throwable th8) {
                                            throw th8;
                                        }
                                    }
                                    break;
                                } else {
                                    try {
                                        objA = dp1.a(yj1Var, method);
                                        yj1Var.a.put(method, objA);
                                    } catch (Throwable th9) {
                                        yj1Var.a.remove(method);
                                        throw th9;
                                    }
                                }
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                    }
                }
                rm0 rm0Var = (rm0) objA;
                return rm0Var.b(new l81(rm0Var.a, obj, objArr3, rm0Var.b, rm0Var.c), objArr3);
        }
    }

    public /* synthetic */ fd(fp0 fp0Var, Object obj, int i) {
        this.a = i;
        this.c = fp0Var;
        this.b = obj;
    }

    public fd(yj1 yj1Var) {
        this.a = 3;
        this.c = yj1Var;
        this.b = new Object[0];
    }
}
