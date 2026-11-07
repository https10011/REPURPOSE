package defpackage;

import android.content.Context;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jp0 implements InvocationHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ jp0(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0225  */
    /* JADX WARN: Code duplicated, block: B:59:0x0231  */
    /* JADX WARN: Code duplicated, block: B:78:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0288 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public lp0 a(Context context) {
        Class cls;
        Object objS;
        lp0 lp0Var;
        Class clsJ = sp0.j("com.android.billingclient.api.BillingClient");
        Class clsJ2 = sp0.j("com.android.billingclient.api.Purchase");
        Class clsJ3 = sp0.j("com.android.billingclient.api.ProductDetails");
        Class clsJ4 = sp0.j("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsJ5 = sp0.j("com.android.billingclient.api.QueryProductDetailsParams$Product");
        Class clsJ6 = sp0.j("com.android.billingclient.api.BillingResult");
        Class clsJ7 = sp0.j("com.android.billingclient.api.QueryProductDetailsParams");
        Class clsJ8 = sp0.j("com.android.billingclient.api.QueryPurchaseHistoryParams");
        Class clsJ9 = sp0.j("com.android.billingclient.api.QueryPurchasesParams");
        Class clsJ10 = sp0.j("com.android.billingclient.api.QueryProductDetailsParams$Builder");
        Class clsJ11 = sp0.j("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
        Class clsJ12 = sp0.j("com.android.billingclient.api.QueryPurchasesParams$Builder");
        Class clsJ13 = sp0.j("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
        Class clsJ14 = sp0.j("com.android.billingclient.api.BillingClient$Builder");
        Class clsJ15 = sp0.j("com.android.billingclient.api.PurchasesUpdatedListener");
        Class clsJ16 = sp0.j("com.android.billingclient.api.BillingClientStateListener");
        Class clsJ17 = sp0.j("com.android.billingclient.api.ProductDetailsResponseListener");
        Class clsJ18 = sp0.j("com.android.billingclient.api.PurchasesResponseListener");
        Class clsJ19 = sp0.j("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsJ == null || clsJ2 == null || clsJ3 == null || clsJ4 == null || clsJ5 == null || clsJ6 == null || clsJ7 == null || clsJ8 == null || clsJ9 == null || clsJ10 == null || clsJ11 == null || clsJ12 == null || clsJ13 == null || clsJ14 == null || clsJ15 == null || clsJ16 == null || clsJ17 == null || clsJ18 == null || clsJ19 == null) {
            Log.w(lp0.b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Method methodO = sp0.o(clsJ, "queryPurchasesAsync", clsJ9, clsJ18);
        Method methodO2 = sp0.o(clsJ9, "newBuilder", new Class[0]);
        Method methodO3 = sp0.o(clsJ12, "build", new Class[0]);
        Method methodO4 = sp0.o(clsJ12, "setProductType", String.class);
        Method methodO5 = sp0.o(clsJ2, "getOriginalJson", new Class[0]);
        Method methodO6 = sp0.o(clsJ, "queryPurchaseHistoryAsync", clsJ8, clsJ19);
        Method methodO7 = sp0.o(clsJ8, "newBuilder", new Class[0]);
        Method methodO8 = sp0.o(clsJ11, "build", new Class[0]);
        Method methodO9 = sp0.o(clsJ11, "setProductType", String.class);
        Method methodO10 = sp0.o(clsJ4, "getOriginalJson", new Class[0]);
        Method methodO11 = sp0.o(clsJ, "queryProductDetailsAsync", clsJ7, clsJ17);
        Method methodO12 = sp0.o(clsJ7, "newBuilder", new Class[0]);
        Method methodO13 = sp0.o(clsJ10, "build", new Class[0]);
        Method methodO14 = sp0.o(clsJ10, "setProductList", List.class);
        Method methodO15 = sp0.o(clsJ5, "newBuilder", new Class[0]);
        Method methodO16 = sp0.o(clsJ13, "build", new Class[0]);
        Method methodO17 = sp0.o(clsJ13, "setProductId", String.class);
        Method methodO18 = sp0.o(clsJ13, "setProductType", String.class);
        Method methodO19 = sp0.o(clsJ3, "toString", new Class[0]);
        Method methodO20 = sp0.o(clsJ, "startConnection", clsJ16);
        Method methodO21 = sp0.o(clsJ6, "getResponseCode", new Class[0]);
        if (methodO == null || methodO2 == null || methodO3 == null || methodO4 == null || methodO5 == null || methodO6 == null || methodO7 == null || methodO8 == null || methodO9 == null || methodO10 == null || methodO11 == null || methodO12 == null || methodO13 == null || methodO14 == null || methodO15 == null || methodO16 == null || methodO17 == null || methodO18 == null || methodO19 == null || methodO20 == null || methodO21 == null) {
            Log.w(lp0.b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Method methodO22 = sp0.o(clsJ, "newBuilder", Context.class);
        Method methodO23 = sp0.o(clsJ14, "setListener", clsJ15);
        Method methodO24 = sp0.o(clsJ14, "enablePendingPurchases", new Class[0]);
        Method methodO25 = sp0.o(clsJ14, "build", new Class[0]);
        if (methodO25 != null && methodO23 != null && methodO22 != null && methodO24 != null) {
            cls = clsJ;
            Object objS2 = sp0.s(clsJ14, methodO23, sp0.s(clsJ, methodO22, null, context), Proxy.newProxyInstance(clsJ15.getClassLoader(), new Class[]{clsJ15}, this));
            if (objS2 != null) {
                objS = sp0.s(clsJ14, methodO25, sp0.s(clsJ14, methodO24, objS2, new Object[0]), new Object[0]);
            }
            if (objS == null) {
                Log.w(lp0.b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            lp0Var = new lp0(objS, cls, clsJ2, clsJ3, clsJ4, clsJ5, clsJ6, clsJ7, clsJ8, clsJ10, clsJ11, clsJ13, clsJ16, clsJ17, clsJ19, methodO5, methodO6, methodO7, methodO8, methodO9, methodO10, methodO11, methodO12, methodO13, methodO14, methodO15, methodO16, methodO17, methodO18, methodO19, methodO20, methodO21);
            if (!mt.a.contains(lp0.class)) {
                try {
                    lp0.I = lp0Var;
                } catch (Throwable th) {
                    mt.a(lp0.class, th);
                }
            }
            if (!mt.a.contains(lp0.class)) {
                try {
                    return lp0.I;
                } catch (Throwable th2) {
                    mt.a(lp0.class, th2);
                }
            }
            return null;
        }
        cls = clsJ;
        objS = null;
        if (objS == null) {
            Log.w(lp0.b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        lp0Var = new lp0(objS, cls, clsJ2, clsJ3, clsJ4, clsJ5, clsJ6, clsJ7, clsJ8, clsJ10, clsJ11, clsJ13, clsJ16, clsJ17, clsJ19, methodO5, methodO6, methodO7, methodO8, methodO9, methodO10, methodO11, methodO12, methodO13, methodO14, methodO15, methodO16, methodO17, methodO18, methodO19, methodO20, methodO21);
        if (!mt.a.contains(lp0.class)) {
            lp0.I = lp0Var;
        }
        if (!mt.a.contains(lp0.class)) {
            return lp0.I;
        }
        return null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object objInvoke;
        Class<?> cls;
        switch (this.a) {
            case 0:
                if (!mt.a.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                    } catch (Throwable th) {
                        mt.a(this, th);
                    }
                }
                break;
            case 1:
                obj.getClass();
                method.getClass();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if ("onInstallReferrerSetupFinished".equalsIgnoreCase(method.getName())) {
                    try {
                        int iIntValue = ((Integer) objArr[0]).intValue();
                        if (g93.i) {
                            g93.b("StateListenerHandler : onInstallReferrerSetupFinished code=" + iIntValue, new Object[0]);
                        }
                        if (iIntValue == 0) {
                            xb2.b = (String) ReferrerDetails.class.getDeclaredMethod("getInstallReferrer", null).invoke(InstallReferrerClient.class.getDeclaredMethod("getInstallReferrer", null).invoke(xb2.c, null), null);
                            InstallReferrerClient.class.getDeclaredMethod("endConnection", null).invoke(xb2.c, null);
                        }
                    } catch (Throwable unused) {
                        if (g93.i) {
                            g93.b("InstallReferrerClient getInstallReferrer failed", new Object[0]);
                        }
                    }
                    xb2.a.countDown();
                } else if (!"onInstallReferrerServiceDisconnected".equalsIgnoreCase(method.getName())) {
                    if (g93.i) {
                        g93.b("StateListenerHandler : no such method : " + method.getName(), new Object[0]);
                    }
                } else if (g93.i) {
                    g93.b("StateListenerHandler : InstallReferrerService Disconnected", new Object[0]);
                }
                break;
            default:
                String str = "NULL";
                try {
                    if ("OnSupport".equals(method.getName())) {
                        Object obj2 = objArr[0];
                        if (obj2 != null ? Boolean.parseBoolean(String.valueOf(obj2)) : false) {
                            try {
                                try {
                                    cls = Class.forName("com.bun.miitmdid.interfaces.IdSupplier");
                                } catch (ClassNotFoundException unused2) {
                                    cls = Class.forName("com.bun.supplier.IdSupplier");
                                }
                            } catch (ClassNotFoundException unused3) {
                                cls = Class.forName("com.bun.miitmdid.supplier.IdSupplier");
                            }
                            objInvoke = cls.getDeclaredMethod("getOAID", null).invoke(objArr[1], null);
                            str = (String) objInvoke;
                        } else if (g93.i) {
                            g93.g("IdSupplier isSupport = false", new Object[0]);
                        }
                        break;
                    } else if ("onSupport".equals(method.getName())) {
                        Class<?> cls2 = Class.forName("com.bun.miitmdid.interfaces.IdSupplier");
                        Object objInvoke2 = cls2.getDeclaredMethod("isSupported", null).invoke(objArr[0], null);
                        if (objInvoke2 != null && Boolean.parseBoolean(objInvoke2.toString())) {
                            objInvoke = cls2.getDeclaredMethod("getOAID", null).invoke(objArr[0], null);
                            str = (String) objInvoke;
                        } else if (g93.i) {
                            g93.g("IdSupplier isSupport = false", new Object[0]);
                        }
                    } else {
                        if (g93.i) {
                            g93.g("IIdentifierListener invoke %s", method.getName());
                        }
                        str = null;
                    }
                } catch (Throwable th2) {
                    if (g93.i) {
                        g93.g("IdSupplier getOAID failed : %s", th2.toString());
                    }
                }
                fc2.b.offer(str);
                break;
        }
        return null;
        return null;
    }
}
