package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wy1 {
    public static WeakReference b;
    public co a;

    public final synchronized vy1 a() {
        String str;
        vy1 vy1Var;
        co coVar = this.a;
        synchronized (((ArrayDeque) coVar.d)) {
            str = (String) ((ArrayDeque) coVar.d).peek();
        }
        Pattern pattern = vy1.d;
        vy1Var = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                vy1Var = new vy1(strArrSplit[0], strArrSplit[1]);
            }
        }
        return vy1Var;
    }
}
