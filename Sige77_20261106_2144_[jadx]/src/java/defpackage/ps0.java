package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class ps0 {
    public static /* bridge */ /* synthetic */ Class A() {
        return OffsetDateTime.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return OffsetTime.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return Period.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return Year.class;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return Duration.class;
    }

    public static /* bridge */ /* synthetic */ Instant g(Object obj) {
        return (Instant) obj;
    }

    public static /* bridge */ /* synthetic */ LocalDate i(Object obj) {
        return (LocalDate) obj;
    }

    public static /* bridge */ /* synthetic */ LocalDateTime j(Object obj) {
        return (LocalDateTime) obj;
    }

    public static /* bridge */ /* synthetic */ ZoneId l(Object obj) {
        return (ZoneId) obj;
    }

    public static /* bridge */ /* synthetic */ ZoneOffset n(Object obj) {
        return (ZoneOffset) obj;
    }

    public static /* bridge */ /* synthetic */ ZonedDateTime p(Object obj) {
        return (ZonedDateTime) obj;
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof ZoneOffset;
    }

    public static /* bridge */ /* synthetic */ Class s() {
        return YearMonth.class;
    }

    public static /* bridge */ /* synthetic */ LocalDateTime t(Object obj) {
        return (LocalDateTime) obj;
    }

    public static /* bridge */ /* synthetic */ ZoneId u(Object obj) {
        return (ZoneId) obj;
    }

    public static /* bridge */ /* synthetic */ ZoneOffset v(Object obj) {
        return (ZoneOffset) obj;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return ZonedDateTime.class;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return Instant.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return LocalDateTime.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return MonthDay.class;
    }
}
