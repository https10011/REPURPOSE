package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class c8 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static qz0 b(Configuration configuration) {
        return qz0.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(qz0 qz0Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(qz0Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, qz0 qz0Var) {
        configuration.setLocales(LocaleList.forLanguageTags(qz0Var.a.a.toLanguageTags()));
    }
}
