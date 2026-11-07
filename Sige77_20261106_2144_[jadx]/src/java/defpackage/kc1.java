package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kc1 extends sh0 {
    private static final kc1 DEFAULT_INSTANCE;
    private static volatile eb1 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private r11 preferences_ = r11.b;

    static {
        kc1 kc1Var = new kc1();
        DEFAULT_INSTANCE = kc1Var;
        sh0.j(kc1.class, kc1Var);
    }

    public static r11 l(kc1 kc1Var) {
        r11 r11Var = kc1Var.preferences_;
        if (!r11Var.a) {
            kc1Var.preferences_ = r11Var.d();
        }
        return kc1Var.preferences_;
    }

    public static ic1 n() {
        return (ic1) ((qh0) DEFAULT_INSTANCE.c(5));
    }

    public static kc1 o(FileInputStream fileInputStream) {
        kc1 kc1Var = DEFAULT_INSTANCE;
        rn rnVar = new rn(fileInputStream);
        w80 w80VarA = w80.a();
        sh0 sh0VarI = kc1Var.i();
        try {
            td1 td1Var = td1.c;
            td1Var.getClass();
            zl1 zl1VarA = td1Var.a(sh0VarI.getClass());
            we weVar = (we) rnVar.c;
            if (weVar == null) {
                weVar = new we(rnVar);
            }
            zl1VarA.f(sh0VarI, weVar, w80VarA);
            zl1VarA.d(sh0VarI);
            if (sh0.f(sh0VarI, true)) {
                return (kc1) sh0VarI;
            }
            throw new ur0(new o22().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof ur0) {
                throw ((ur0) e.getCause());
            }
            throw new ur0(e.getMessage(), e);
        } catch (o22 e2) {
            throw new ur0(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ur0) {
                throw ((ur0) e3.getCause());
            }
            throw e3;
        } catch (ur0 e4) {
            if (e4.a) {
                throw new ur0(e4.getMessage(), e4);
            }
            throw e4;
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
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new if1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", jc1.a});
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new kc1();
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new ic1(DEFAULT_INSTANCE);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                eb1 eb1Var = PARSER;
                if (eb1Var != null) {
                    return eb1Var;
                }
                synchronized (kc1.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
