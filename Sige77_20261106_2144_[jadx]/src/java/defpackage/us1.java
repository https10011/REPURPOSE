package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class us1 extends l02 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    public class a implements m02 {
        @Override // defpackage.m02
        public final l02 c(uk0 uk0Var, s12 s12Var) {
            if (s12Var.a == Time.class) {
                return new us1(0);
            }
            return null;
        }
    }

    private us1() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        Time time;
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        String strM = au0Var.M();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(strM).getTime());
                    this.a.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new wt0(4, "Failed parsing '" + strM + "' as SQL Time; at path " + au0Var.n(true), e);
                }
            } catch (Throwable th) {
                this.a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            eu0Var.p();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        eu0Var.B(str);
    }

    public /* synthetic */ us1(int i) {
        this();
    }
}
