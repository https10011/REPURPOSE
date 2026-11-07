package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fc2 {
    public static final LinkedBlockingQueue b = new LinkedBlockingQueue();
    public String a = null;

    public final void a(Context context) {
        Class<?> cls;
        try {
            try {
                Class.forName("com.bun.miitmdid.core.JLibrary").getDeclaredMethod("InitEntry", Context.class).invoke(null, context);
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    cls = Class.forName("com.bun.miitmdid.interfaces.IIdentifierListener");
                } catch (ClassNotFoundException unused2) {
                    cls = Class.forName("com.bun.miitmdid.core.IIdentifierListener");
                }
            } catch (ClassNotFoundException unused3) {
                cls = Class.forName("com.bun.supplier.IIdentifierListener");
            }
            Object objNewProxyInstance = Proxy.newProxyInstance(context.getClassLoader(), new Class[]{cls}, new jp0(3));
            Method declaredMethod = Class.forName("com.bun.miitmdid.core.MdidSdkHelper").getDeclaredMethod("InitSdk", Context.class, Boolean.TYPE, cls);
            String str = null;
            for (int i = 0; TextUtils.isEmpty(str) && i < 2; i++) {
                Integer num = (Integer) declaredMethod.invoke(null, context, Boolean.TRUE, objNewProxyInstance);
                if (g93.i) {
                    g93.b("MdidSdkHelper InitSdk return value：" + num, new Object[0]);
                }
                str = (String) b.poll(1100L, TimeUnit.MILLISECONDS);
                if ("NULL".equals(str)) {
                    return;
                }
                this.a = str;
            }
        } catch (Throwable th) {
            if (g93.i) {
                g93.g("MdidSdkHelper InitSdk failed : %s", th.toString());
            }
        }
    }
}
