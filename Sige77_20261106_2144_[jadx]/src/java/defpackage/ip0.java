package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ip0 implements InvocationHandler {
    public final rp0 a;
    public final Runnable b;
    public final /* synthetic */ kp0 c;

    public ip0(kp0 kp0Var, rp0 rp0Var, Runnable runnable) {
        this.c = kp0Var;
        this.a = rp0Var;
        this.b = runnable;
    }

    public final void a(Object obj, Method method, Object[] objArr) {
        rp0 rp0Var;
        kp0 kp0Var;
        Class cls;
        Method method2;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            obj.getClass();
            method.getClass();
            if (Intrinsics.areEqual(method.getName(), "onPurchaseHistoryResponse")) {
                Object objK = objArr != null ? wb.k(1, objArr) : null;
                if (objK != null && (objK instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objK).iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        rp0Var = this.a;
                        kp0Var = this.c;
                        if (!zHasNext) {
                            break;
                        }
                        Object next = it.next();
                        try {
                            if (mt.a.contains(kp0.class)) {
                                cls = null;
                            } else {
                                try {
                                    cls = kp0Var.d;
                                } catch (Throwable th) {
                                    mt.a(kp0.class, th);
                                    cls = null;
                                }
                            }
                            if (mt.a.contains(kp0.class)) {
                                method2 = null;
                            } else {
                                try {
                                    method2 = kp0Var.h;
                                } catch (Throwable th2) {
                                    mt.a(kp0.class, th2);
                                    method2 = null;
                                }
                            }
                            Object objS = sp0.s(cls, method2, next, new Object[0]);
                            String str = objS instanceof String ? (String) objS : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    string.getClass();
                                    arrayList.add(string);
                                    if (rp0Var == rp0.INAPP) {
                                        xn xnVar = kp0.l;
                                        xn.m().put(string, jSONObject);
                                    } else {
                                        xn xnVar2 = kp0.l;
                                        xn.q().put(string, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    Runnable runnable = this.b;
                    if (zIsEmpty) {
                        runnable.run();
                        return;
                    }
                    Set set = mt.a;
                    if (set.contains(kp0.class)) {
                        return;
                    }
                    try {
                        if (set.contains(kp0Var)) {
                            return;
                        }
                        try {
                            kp0Var.c(new gp0(0, arrayList, kp0Var, runnable, rp0Var));
                        } catch (Throwable th3) {
                            mt.a(kp0Var, th3);
                        }
                    } catch (Throwable th4) {
                        mt.a(kp0.class, th4);
                    }
                }
            }
        } catch (Throwable th5) {
            mt.a(this, th5);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
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
    }
}
