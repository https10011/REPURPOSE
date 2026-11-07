package defpackage;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ts1 extends l02 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    public class a implements m02 {
        @Override // defpackage.m02
        public final l02 c(uk0 uk0Var, s12 s12Var) {
            if (s12Var.a == Date.class) {
                return new ts1(0);
            }
            return null;
        }
    }

    private ts1() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        Date date;
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        String strM = au0Var.M();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(strM).getTime());
                    this.a.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new wt0(4, "Failed parsing '" + strM + "' as SQL Date; at path " + au0Var.n(true), e);
                }
            } catch (Throwable th) {
                this.a.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            eu0Var.p();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date);
        }
        eu0Var.B(str);
    }

    public /* synthetic */ ts1(int i) {
        this();
    }
}
