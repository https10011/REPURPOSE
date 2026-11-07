package defpackage;

import com.hjq.toast.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class pt2 {
    public static final xv1 a;

    static {
        gt2 gt2VarX = ht2.x();
        gt2VarX.i(-62135596800L);
        gt2VarX.h(0);
        gt2 gt2VarX2 = ht2.x();
        gt2VarX2.i(253402300799L);
        gt2VarX2.h(999999999);
        gt2 gt2VarX3 = ht2.x();
        gt2VarX3.i(0L);
        gt2VarX3.h(0);
        a = new xv1(3);
        try {
            Class.forName("java.time.Instant").getMethod("now", null);
        } catch (Exception unused) {
        }
        try {
            Class.forName("java.time.Instant").getMethod("getEpochSecond", null);
        } catch (Exception unused2) {
        }
        try {
            Class.forName("java.time.Instant").getMethod("getNano", null);
        } catch (Exception unused3) {
        }
    }

    public static ht2 a(String str) {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException(ts.k("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        boolean z = true;
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = BuildConfig.FLAVOR;
        }
        long time = ((SimpleDateFormat) a.get()).parse(strSubstring2).getTime() / 1000;
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (str.charAt(iIndexOf2) != 'Z') {
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            int iIndexOf4 = strSubstring4.indexOf(58);
            if (iIndexOf4 == -1) {
                throw new ParseException("Invalid offset value: ".concat(strSubstring4), 0);
            }
            try {
                long j = ((Long.parseLong(strSubstring4.substring(0, iIndexOf4)) * 60) + Long.parseLong(strSubstring4.substring(iIndexOf4 + 1))) * 60;
                time = str.charAt(iIndexOf2) == '+' ? time - j : time + j;
            } catch (NumberFormatException e) {
                ParseException parseException = new ParseException("Invalid offset value: ".concat(strSubstring4), 0);
                parseException.initCause(e);
                throw parseException;
            }
        } else if (str.length() != iIndexOf2 + 1) {
            throw new ParseException(ts.k("Failed to parse timestamp: invalid trailing data \"", str.substring(iIndexOf2), "\""), 0);
        }
        try {
            if (!(time >= -62135596800L && time <= 253402300799L)) {
                throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + time + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                long j2 = iCharAt / 1000000000;
                long j3 = time + j2;
                if (!((j2 ^ time) < 0) && !((time ^ j3) >= 0)) {
                    throw new ArithmeticException();
                }
                iCharAt %= 1000000000;
                time = j3;
            }
            if (iCharAt < 0) {
                iCharAt += 1000000000;
                long j4 = time - 1;
                boolean z2 = (1 ^ time) >= 0;
                if ((time ^ j4) < 0) {
                    z = false;
                }
                if (!z2 && !z) {
                    throw new ArithmeticException();
                }
                time = j4;
            }
            gt2 gt2VarX = ht2.x();
            gt2VarX.i(time);
            gt2VarX.h(iCharAt);
            ht2 ht2Var = (ht2) gt2VarX.d();
            b(ht2Var);
            return ht2Var;
        } catch (IllegalArgumentException e2) {
            ParseException parseException2 = new ParseException(ts.k("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
            parseException2.initCause(e2);
            throw parseException2;
        }
    }

    public static void b(ht2 ht2Var) {
        long jW = ht2Var.w();
        int iT = ht2Var.t();
        if (jW < -62135596800L || jW > 253402300799L || iT < 0 || iT >= 1000000000) {
            tv2.g("Timestamp is not valid. See proto definition for valid values. Seconds (", jW, ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (", iT, ") must be in range [0, +999,999,999].");
        }
    }
}
