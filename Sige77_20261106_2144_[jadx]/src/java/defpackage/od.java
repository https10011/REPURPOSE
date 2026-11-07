package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class od {
    public final String a;
    public final Integer b;
    public final d60 c;
    public final long d;
    public final long e;
    public final Map f;

    public od(String str, Integer num, d60 d60Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = d60Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final qp0 c() {
        qp0 qp0Var = new qp0();
        String str = this.a;
        if (str == null) {
            uq1.h("Null transportName");
            return null;
        }
        qp0Var.a = str;
        qp0Var.b = this.b;
        d60 d60Var = this.c;
        if (d60Var == null) {
            uq1.h("Null encodedPayload");
            return null;
        }
        qp0Var.c = d60Var;
        qp0Var.d = Long.valueOf(this.d);
        qp0Var.e = Long.valueOf(this.e);
        qp0Var.f = new HashMap(this.f);
        return qp0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof od) {
            od odVar = (od) obj;
            if (this.a.equals(odVar.a)) {
                Integer num = odVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(odVar.c) && this.d == odVar.d && this.e == odVar.e && this.f.equals(odVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
