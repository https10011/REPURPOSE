package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public enum fk2 {
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY_PADDED('H'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY('k'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H_PADDED('I'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H('l'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MINUTE_OF_HOUR_PADDED('M'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_SECONDS_OF_MINUTE_PADDED('S'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MILLIS_OF_SECOND_PADDED('L'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_NANOS_OF_SECOND_PADDED('N'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_AM_PM('p'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_NUMERIC('z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_SHORT('Z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_SECONDS('s'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_MILLIS('Q'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_FULL('B'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT('b'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT_ALT('h'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_FULL('A'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_SHORT('a'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_CENTURY_PADDED('C'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_PADDED('Y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_OF_CENTURY_PADDED('y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_YEAR_PADDED('j'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_PADDED('m'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH_PADDED('d'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH('e'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES('R'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS('T'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS_12H('r'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_MONTH_DAY_YEAR('D'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_YEAR_MONTH_DAY('F'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_FULL('c');

    public static final Map b;
    public final char a;

    static {
        HashMap map = new HashMap();
        for (fk2 fk2Var : values()) {
            if (map.put(Character.valueOf(fk2Var.a), fk2Var) != null) {
                uq1.q("duplicate format character: ".concat(String.valueOf(fk2Var)));
                return;
            }
        }
        b = Collections.unmodifiableMap(map);
    }

    fk2(char c2) {
        this.a = c2;
    }
}
