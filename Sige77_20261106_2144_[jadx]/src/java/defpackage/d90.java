package defpackage;

import com.hjq.toast.BuildConfig;
import java.security.SecureRandom;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class d90 extends RuntimeException {
    public static final SecureRandom a = new SecureRandom();

    public d90(String str) {
        super(str);
        if (str == null || !i90.q.get() || a.nextInt(100) <= 50) {
            return;
        }
        fa0.a(new ab(str, 8), da0.ErrorReport);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? BuildConfig.FLAVOR : message;
    }
}
