package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hp0 implements InvocationHandler {
    public final Runnable a;

    public hp0(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AtomicBoolean atomicBoolean;
        Method methodO;
        AtomicBoolean atomicBoolean2;
        Set set = mt.a;
        if (!set.contains(this)) {
            try {
                obj.getClass();
                method.getClass();
                if (Intrinsics.areEqual(method.getName(), "onBillingSetupFinished")) {
                    Object objK = objArr != null ? wb.k(0, objArr) : null;
                    Class clsJ = sp0.j("com.android.billingclient.api.BillingResult");
                    if (clsJ != null && (methodO = sp0.o(clsJ, "getResponseCode", new Class[0])) != null && Intrinsics.areEqual(sp0.s(clsJ, methodO, objK, new Object[0]), 0)) {
                        xn xnVar = kp0.l;
                        if (set.contains(kp0.class)) {
                            atomicBoolean2 = null;
                        } else {
                            try {
                                atomicBoolean2 = kp0.n;
                            } catch (Throwable th) {
                                mt.a(kp0.class, th);
                                atomicBoolean2 = null;
                            }
                        }
                        atomicBoolean2.set(true);
                        this.a.run();
                    }
                } else {
                    String name = method.getName();
                    name.getClass();
                    if (d.d(name, "onBillingServiceDisconnected", false)) {
                        xn xnVar2 = kp0.l;
                        if (set.contains(kp0.class)) {
                            atomicBoolean = null;
                        } else {
                            try {
                                atomicBoolean = kp0.n;
                            } catch (Throwable th2) {
                                mt.a(kp0.class, th2);
                                atomicBoolean = null;
                            }
                        }
                        atomicBoolean.set(false);
                    }
                }
            } catch (Throwable th3) {
                mt.a(this, th3);
                return null;
            }
        }
        return null;
    }
}
