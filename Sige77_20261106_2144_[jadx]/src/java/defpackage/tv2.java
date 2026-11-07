package defpackage;

import com.google.android.recaptcha.internal.zzce;
import com.google.android.recaptcha.internal.zznm;
import com.google.android.recaptcha.internal.zznn;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class tv2 {
    public static /* synthetic */ void a() throws zznm {
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void b(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void c(int i, int i2, Throwable th) throws zzce {
        throw new zzce(i, i2, th);
    }

    public static /* synthetic */ void d(Object obj, int i, int i2, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void e(Object obj, long j) throws tn {
        throw new tn("Integer value " + j + obj);
    }

    public static /* synthetic */ void f(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void g(String str, long j, Object obj, int i, Object obj2) {
        throw new IllegalArgumentException(str + j + obj + i + obj2);
    }

    public static /* synthetic */ void h(String str) throws zznn {
        throw new zznn(str);
    }

    public static /* synthetic */ void i(String str) throws xm2 {
        throw new xm2(str);
    }
}
