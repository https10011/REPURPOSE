package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i42 {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static i42 c;
    public final u41 a;

    public i42(u41 u41Var) {
        this.a = u41Var;
    }

    public final boolean a(ae aeVar) {
        if (TextUtils.isEmpty(aeVar.c)) {
            return true;
        }
        long j = aeVar.f + aeVar.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
