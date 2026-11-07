package defpackage;

import android.app.NotificationChannel;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract /* synthetic */ class z20 {
    public static /* bridge */ /* synthetic */ Class B() {
        return LocalTime.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return ZoneOffset.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return ZoneId.class;
    }

    public static /* synthetic */ NotificationChannel f(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return LocalDate.class;
    }

    public static /* bridge */ /* synthetic */ Duration l(Object obj) {
        return (Duration) obj;
    }

    public static /* bridge */ /* synthetic */ Year q(Object obj) {
        return (Year) obj;
    }

    public static /* bridge */ /* synthetic */ YearMonth s(Object obj) {
        return (YearMonth) obj;
    }
}
