package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import io.jsonwebtoken.JwtParser;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i10 {
    public static final i10 a = new i10();
    public static final HashMap b = new HashMap();

    public static final void a(String str) {
        Set set = mt.a;
        if (set.contains(i10.class)) {
            return;
        }
        try {
            i10 i10Var = a;
            HashMap map = b;
            if (set.contains(i10Var)) {
                return;
            }
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
                if (registrationListener != null) {
                    Object systemService = i90.a().getSystemService("servicediscovery");
                    systemService.getClass();
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        i90 i90Var = i90.a;
                    }
                    map.remove(str);
                    return;
                }
                return;
            } catch (Throwable th) {
                mt.a(i10Var, th);
                return;
            }
            mt.a(i10.class, th);
        } catch (Throwable th2) {
            mt.a(i10.class, th2);
        }
    }

    public static final boolean b() {
        if (!mt.a.contains(i10.class)) {
            try {
                ja0 ja0VarB = ma0.b(i90.b());
                if (ja0VarB != null && ja0VarB.c.contains(ur1.Enabled)) {
                    return true;
                }
            } catch (Throwable th) {
                mt.a(i10.class, th);
                return false;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        if (mt.a.contains(this)) {
            return false;
        }
        try {
            HashMap map = b;
            if (map.containsKey(str)) {
                return true;
            }
            i90 i90Var = i90.a;
            String strReplace = "18.2.3".replace(JwtParser.SEPARATOR_CHAR, '|');
            strReplace.getClass();
            String str2 = "fbsdk_" + "android-".concat(strReplace) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = i90.a().getSystemService("servicediscovery");
            systemService.getClass();
            h10 h10Var = new h10(str2, str);
            map.put(str, h10Var);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, h10Var);
            return true;
        } catch (Throwable th) {
            mt.a(this, th);
            return false;
        }
    }
}
