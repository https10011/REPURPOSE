package defpackage;

import com.linecorp.linesdk.LineApiError;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ix0 {
    public static final ix0 d = new ix0(jx0.a, null, LineApiError.d);
    public final jx0 a;
    public final Object b;
    public final LineApiError c;

    public ix0(jx0 jx0Var, Object obj, LineApiError lineApiError) {
        this.a = jx0Var;
        this.b = obj;
        this.c = lineApiError;
    }

    public static ix0 a(jx0 jx0Var, LineApiError lineApiError) {
        return new ix0(jx0Var, null, lineApiError);
    }

    public static ix0 b(Object obj) {
        return obj == null ? d : new ix0(jx0.a, obj, LineApiError.d);
    }

    public final Object c() {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    public final boolean d() {
        return this.a == jx0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ix0.class != obj.getClass()) {
            return false;
        }
        ix0 ix0Var = (ix0) obj;
        if (this.a != ix0Var.a) {
            return false;
        }
        Object obj2 = ix0Var.b;
        Object obj3 = this.b;
        if (obj3 != null) {
            if (!obj3.equals(obj2)) {
                return false;
            }
        } else if (obj2 != null) {
            return false;
        }
        return this.c.equals(ix0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return this.c.hashCode() + ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LineApiResponse{errorData=" + this.c + ", responseCode=" + this.a + ", responseData=" + this.b + '}';
    }
}
