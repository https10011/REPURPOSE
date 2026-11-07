package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qu2 extends i73 {
    public long c;
    public String d;

    @Override // defpackage.i73
    public final boolean F() {
        Calendar calendar = Calendar.getInstance();
        this.c = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = y00.l(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long I() {
        G();
        return this.c;
    }

    public final String J() {
        G();
        return this.d;
    }
}
