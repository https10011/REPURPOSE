package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zt0 extends ut0 {
    public final Serializable a;

    public zt0(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean d(zt0 zt0Var) {
        Serializable serializable = zt0Var.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger a() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (d(this)) {
            return BigInteger.valueOf(b().longValue());
        }
        String strC = c();
        ea.d(strC);
        return new BigInteger(strC);
    }

    public final Number b() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new uv0((String) serializable);
        }
        sm0.h("Primitive is neither a number nor a string");
        return null;
    }

    public final String c() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zt0.class != obj.getClass()) {
            return false;
        }
        zt0 zt0Var = (zt0) obj;
        Serializable serializable = zt0Var.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (d(this) && d(zt0Var)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return a().equals(zt0Var.a());
            }
            return b().longValue() == zt0Var.b().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : ea.t(c())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : ea.t(zt0Var.c())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? b().doubleValue() : Double.parseDouble(c());
        double dDoubleValue2 = serializable instanceof Number ? zt0Var.b().doubleValue() : Double.parseDouble(zt0Var.c());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            jDoubleToLongBits = b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public zt0(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public zt0(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
