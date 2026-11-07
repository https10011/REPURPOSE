package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oc1 extends sh0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final oc1 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile eb1 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        oc1 oc1Var = new oc1();
        DEFAULT_INSTANCE = oc1Var;
        sh0.j(oc1.class, oc1Var);
    }

    public static nc1 D() {
        return (nc1) ((qh0) DEFAULT_INSTANCE.c(5));
    }

    public static void l(oc1 oc1Var, long j) {
        oc1Var.valueCase_ = 4;
        oc1Var.value_ = Long.valueOf(j);
    }

    public static void m(oc1 oc1Var, String str) {
        oc1Var.getClass();
        oc1Var.valueCase_ = 5;
        oc1Var.value_ = str;
    }

    public static void n(oc1 oc1Var, mc1 mc1Var) {
        oc1Var.getClass();
        oc1Var.value_ = mc1Var;
        oc1Var.valueCase_ = 6;
    }

    public static void o(oc1 oc1Var, double d) {
        oc1Var.valueCase_ = 7;
        oc1Var.value_ = Double.valueOf(d);
    }

    public static void p(oc1 oc1Var, qj qjVar) {
        oc1Var.getClass();
        oc1Var.valueCase_ = 8;
        oc1Var.value_ = qjVar;
    }

    public static void q(oc1 oc1Var, boolean z) {
        oc1Var.valueCase_ = 1;
        oc1Var.value_ = Boolean.valueOf(z);
    }

    public static void r(oc1 oc1Var, float f) {
        oc1Var.valueCase_ = 2;
        oc1Var.value_ = Float.valueOf(f);
    }

    public static void s(oc1 oc1Var, int i) {
        oc1Var.valueCase_ = 3;
        oc1Var.value_ = Integer.valueOf(i);
    }

    public static oc1 v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : BuildConfig.FLAVOR;
    }

    public final mc1 B() {
        return this.valueCase_ == 6 ? (mc1) this.value_ : mc1.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    @Override // defpackage.sh0
    public final Object c(int i) {
        eb1 rh0Var;
        switch (ts.v(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new if1(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", mc1.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new oc1();
            case LONG_FIELD_NUMBER /* 4 */:
                return new nc1(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                eb1 eb1Var = PARSER;
                if (eb1Var != null) {
                    return eb1Var;
                }
                synchronized (oc1.class) {
                    try {
                        rh0Var = PARSER;
                        if (rh0Var == null) {
                            rh0Var = new rh0();
                            PARSER = rh0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return rh0Var;
            default:
                uq1.k();
                return null;
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final qj u() {
        return this.valueCase_ == 8 ? (qj) this.value_ : qj.c;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
