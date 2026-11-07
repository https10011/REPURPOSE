package defpackage;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class ys1 {
    public static final boolean a;
    public static final xs1 b;
    public static final xs1 c;
    public static final List d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new xs1(0, Date.class);
            c = new xs1(1, Timestamp.class);
            d = Collections.unmodifiableList(Arrays.asList(us1.b, ts1.b, ws1.b));
        } else {
            b = null;
            c = null;
            d = Collections.EMPTY_LIST;
        }
    }
}
