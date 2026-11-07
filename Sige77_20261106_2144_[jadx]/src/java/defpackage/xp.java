package defpackage;

import okhttp3.Response;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class xp extends RuntimeException {
    public final /* synthetic */ int a;

    public xp(gj1 gj1Var) {
        this.a = 3;
        StringBuilder sb = new StringBuilder("HTTP ");
        Response response = gj1Var.a;
        sb.append(response.d);
        sb.append(" ");
        sb.append(response.c);
        super(sb.toString());
    }

    public static xp a(String str, int i, int i2, String str2) {
        return new xp(c(str, i, i2, str2), 8);
    }

    public static xp b(int i, String str, String str2) {
        return new xp(c(str, i, i + 1, str2), 8);
    }

    public static String c(String str, int i, int i2, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xp(int i, Throwable th) {
        super(th);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xp(String str, int i) {
        super(str);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xp(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
