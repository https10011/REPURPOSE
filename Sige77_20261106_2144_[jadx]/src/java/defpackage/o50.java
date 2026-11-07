package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o50 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public Object f;
    public Object g;

    public o50(mj2 mj2Var, Object[] objArr, StringBuilder sb) {
        this.a = 2;
        this.b = 0;
        this.c = -1;
        qt.J(mj2Var, "context");
        this.e = mj2Var;
        this.d = 0;
        this.f = objArr;
        this.g = sb;
    }

    public static void h(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(mr3.a(obj));
        sb.append("]");
    }

    public void a() {
        this.b = 1;
        this.f = (v41) this.e;
        this.d = 0;
    }

    public boolean b() {
        s41 s41VarB = ((v41) this.f).b.b();
        int iA = s41VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) s41VarB.d).get(iA + s41VarB.a) == 0) || this.c == 65039;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        HashMap map = ((wn3) this.g).d;
        int[] iArr = (int[]) this.e;
        wn3 wn3Var = (wn3) map.get(Integer.valueOf(iArr[this.b]));
        while (true) {
            int i = (wn3Var.b - wn3Var.a) + 1;
            int i2 = this.c;
            if (i > i2) {
                return;
            }
            int i3 = this.b + i;
            this.b = i3;
            this.g = wn3Var;
            int i4 = i2 - i;
            this.c = i4;
            if (i4 > 0) {
                wn3Var = (wn3) wn3Var.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public void d() {
        wn3 wn3Var = ((wn3) this.g).c;
        if (wn3Var != null) {
            this.g = wn3Var;
        } else {
            this.g = (wn3) this.f;
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
            }
            if (this.d > 0) {
                this.b++;
            }
        }
        c();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:64:0x0092  */
    public void e(Object obj, fr3 fr3Var, jr3 jr3Var) {
        String simpleName;
        jr3 jr3Var2;
        boolean zIsValidCodePoint;
        StringBuilder sb = (StringBuilder) this.g;
        int i = fr3Var.b;
        String string = fr3Var.d;
        int iV = ts.v(i);
        if (iV != 0) {
            if (iV == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iV != 2) {
                if (iV != 3) {
                    if (iV != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                h(sb, obj, string);
                return;
            }
        }
        int iOrdinal = fr3Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (jr3Var.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        if (jr3Var.a()) {
                            jr3Var2 = jr3Var;
                        } else {
                            int i2 = jr3Var.a;
                            int i3 = i2 & 128;
                            if (i3 == 0) {
                                jr3Var2 = jr3.e;
                            } else if (i3 == i2 && jr3Var.b == -1 && jr3Var.c == -1) {
                                jr3Var2 = jr3Var;
                            } else {
                                jr3Var2 = new jr3(i3, -1, -1);
                            }
                        }
                        if (jr3Var2.equals(jr3Var)) {
                            Number number = (Number) obj;
                            Locale locale = mr3.a;
                            boolean zC = jr3Var.c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                mr3.b(sb, jLongValue, zC);
                                return;
                            }
                            if (number instanceof Integer) {
                                mr3.b(sb, jLongValue & 4294967295L, zC);
                                return;
                            }
                            if (number instanceof Byte) {
                                mr3.b(sb, jLongValue & 255, zC);
                                return;
                            }
                            if (number instanceof Short) {
                                mr3.b(sb, jLongValue & 65535, zC);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                uq1.q("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string2 = ((BigInteger) number).toString(16);
                            if (zC) {
                                string2 = string2.toUpperCase(mr3.a);
                            }
                            sb.append(string2);
                            return;
                        }
                    }
                } else if (jr3Var.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (jr3Var.a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = mr3.a;
                int i4 = jr3Var.a;
                int i5 = i4 & 162;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, mr3.a);
                try {
                    formattable.formatTo(formatter, i5, jr3Var.b, jr3Var.c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(mr3.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (jr3Var.a()) {
                sb.append(mr3.a(obj));
                return;
            }
        }
        if (!jr3Var.a()) {
            int i6 = fr3Var.a;
            if (jr3Var.c()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            jr3Var.d(sb2);
            sb2.append((char) i6);
            string = sb2.toString();
        }
        sb.append(String.format(mr3.a, string, obj));
    }

    public void f(wn3 wn3Var, StringBuilder sb) {
        for (wn3 wn3Var2 : wn3Var.d.values()) {
            sb.append("  ");
            sb.append(wn3Var);
            sb.append(" -> ");
            sb.append(wn3Var2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, wn3Var2.a, Math.min(iArr.length, wn3Var2.b + 1))));
            sb.append("\"]\n");
            f(wn3Var2, sb);
        }
    }

    public boolean g(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("digraph {\n");
                f((wn3) this.f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public o50(int[] iArr) {
        this.a = 1;
        this.e = iArr;
        wn3 wn3Var = new wn3(-1, -1);
        this.f = wn3Var;
        this.g = wn3Var;
    }

    public o50(v41 v41Var) {
        this.a = 0;
        this.b = 1;
        this.e = v41Var;
        this.f = v41Var;
    }
}
