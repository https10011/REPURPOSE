package defpackage;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class os0 extends l02 {
    public final List a;
    public final /* synthetic */ int b;

    public os0(String[] strArr, int i) {
        this.b = i;
        this.a = Arrays.asList(strArr);
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        au0Var.b();
        List list = this.a;
        long[] jArr = new long[list.size()];
        while (au0Var.R() != 4) {
            int iIndexOf = list.indexOf(au0Var.B());
            if (iIndexOf >= 0) {
                jArr[iIndexOf] = au0Var.A();
            } else {
                au0Var.X();
            }
        }
        au0Var.l();
        switch (this.b) {
            case 0:
                return Year.of(Math.toIntExact(jArr[0]));
            case 1:
                return YearMonth.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return Duration.ofSeconds(jArr[0], jArr[1]);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return Instant.ofEpochSecond(jArr[0], jArr[1]);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return LocalDate.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return LocalTime.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]), Math.toIntExact(jArr[3]));
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
            default:
                return new GregorianCalendar(r12.b(jArr[0]), r12.b(jArr[1]), r12.b(jArr[2]), r12.b(jArr[3]), r12.b(jArr[4]), r12.b(jArr[5]));
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        int i;
        long[] jArr;
        long[] jArr2;
        if (obj == null) {
            eu0Var.p();
            return;
        }
        eu0Var.e();
        switch (this.b) {
            case 0:
                i = 0;
                jArr = new long[]{z20.q(obj).getValue()};
                jArr2 = jArr;
                break;
            case 1:
                i = 0;
                YearMonth yearMonthS = z20.s(obj);
                jArr2 = new long[]{yearMonthS.getYear(), yearMonthS.getMonthValue()};
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                i = 0;
                Duration durationL = z20.l(obj);
                jArr2 = new long[]{durationL.getSeconds(), durationL.getNano()};
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                i = 0;
                Instant instantG = ps0.g(obj);
                jArr2 = new long[]{instantG.getEpochSecond(), instantG.getNano()};
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                i = 0;
                LocalDate localDateI = ps0.i(obj);
                jArr = new long[]{localDateI.getYear(), localDateI.getMonthValue(), localDateI.getDayOfMonth()};
                jArr2 = jArr;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                i = 0;
                LocalTime localTimeI = ss0.i(obj);
                jArr2 = new long[]{localTimeI.getHour(), localTimeI.getMinute(), localTimeI.getSecond(), localTimeI.getNano()};
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 0;
                MonthDay monthDayM = ss0.m(obj);
                jArr2 = new long[]{monthDayM.getMonthValue(), monthDayM.getDayOfMonth()};
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                i = 0;
                Period periodS = ss0.s(obj);
                jArr = new long[]{periodS.getYears(), periodS.getMonths(), periodS.getDays()};
                jArr2 = jArr;
                break;
            default:
                Calendar calendar = (Calendar) obj;
                i = 0;
                jArr2 = new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
                break;
        }
        int i2 = i;
        while (true) {
            List list = this.a;
            if (i2 >= list.size()) {
                eu0Var.l();
                return;
            } else {
                eu0Var.m((String) list.get(i2));
                eu0Var.x(jArr2[i2]);
                i2++;
            }
        }
    }
}
