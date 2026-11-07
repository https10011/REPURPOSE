package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qz0 {
    public static final qz0 b = new qz0(new rz0(new LocaleList(new Locale[0])));
    public final rz0 a;

    public qz0(rz0 rz0Var) {
        this.a = rz0Var;
    }

    public static qz0 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new qz0(new rz0(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qz0) {
            return this.a.equals(((qz0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
