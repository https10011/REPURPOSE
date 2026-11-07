package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p23 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final t73 a;

    public p23(t73 t73Var) {
        this.a = t73Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        gu2.o(atomicReference);
        gu2.i(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, gu2.l, gu2.g, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, g93.f, g93.e, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.a()) {
            return str.startsWith("_exp_") ? ts.k("experiment_id(", str, ")") : g(str, r93.j, r93.i, d);
        }
        return str;
    }

    public final String d(zzbh zzbhVar) {
        String string;
        t73 t73Var = this.a;
        if (!t73Var.a()) {
            return zzbhVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbhVar.c);
        sb.append(",name=");
        sb.append(a(zzbhVar.a));
        sb.append(",params=");
        zzbf zzbfVar = zzbhVar.b;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !t73Var.a() ? zzbfVar.a.toString() : e(zzbfVar.U());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder sbM = ts.m("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM.length() != 8) {
                sbM.append(", ");
            }
            sbM.append(b(str));
            sbM.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbM.append(strF);
        }
        sbM.append("}]");
        return sbM.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM = ts.m("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbM.length() != 1) {
                    sbM.append(", ");
                }
                sbM.append(strE);
            }
        }
        sbM.append("]");
        return sbM.toString();
    }
}
