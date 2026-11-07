package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c33 extends i73 {
    public final z23 W;
    public final z23 X;
    public final z23 Y;
    public final z23 Z;
    public final z23 a0;
    public char c;
    public long d;
    public String e;
    public final z23 f;
    public final z23 i;
    public final z23 v;
    public final z23 w;

    public c33(y53 y53Var) {
        super(y53Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new z23(this, 6, false, false);
        this.i = new z23(this, 6, true, false);
        this.v = new z23(this, 6, false, true);
        this.w = new z23(this, 5, false, false);
        this.W = new z23(this, 5, true, false);
        this.X = new z23(this, 5, false, true);
        this.Y = new z23(this, 4, false, false);
        this.Z = new z23(this, 3, false, false);
        this.a0 = new z23(this, 2, false, false);
    }

    public static b33 M(String str) {
        if (str == null) {
            return null;
        }
        return new b33(str);
    }

    public static String P(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strQ = Q(obj, z);
        String strQ2 = Q(obj2, z);
        String strQ3 = Q(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strQ)) {
            sb.append(str2);
            sb.append(strQ);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strQ2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strQ2);
        }
        if (!TextUtils.isEmpty(strQ3)) {
            sb.append(str3);
            sb.append(strQ3);
        }
        return sb.toString();
    }

    public static String Q(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            if (cCharAt == '-') {
                str = "-";
            }
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof b33) {
                return ((b33) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = y53.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    @Override // defpackage.i73
    public final boolean F() {
        return false;
    }

    public final z23 I() {
        return this.f;
    }

    public final z23 J() {
        return this.w;
    }

    public final z23 K() {
        return this.Z;
    }

    public final z23 L() {
        return this.a0;
    }

    public final void N(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(O(), i)) {
            Log.println(i, O(), P(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        gu2.o(str);
        t53 t53Var = ((y53) this.a).i;
        if (t53Var == null) {
            Log.println(6, O(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!t53Var.b) {
                Log.println(6, O(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            t53Var.N(new x23(this, i, str, obj, obj2, obj3));
        }
    }

    public final String O() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    ((y53) ((y53) this.a).d.a).getClass();
                    this.e = "FA";
                }
                gu2.o(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
