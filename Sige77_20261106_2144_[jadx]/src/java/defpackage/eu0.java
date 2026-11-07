package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class eu0 implements Closeable, Flushable {
    public static final Pattern Y = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] Z = new String[128];
    public static final String[] a0;
    public String W;
    public boolean X;
    public final Writer a;
    public int[] b;
    public int c;
    public if0 d;
    public String e;
    public String f;
    public boolean i;
    public int v;
    public boolean w;

    static {
        for (int i = 0; i <= 31; i++) {
            Z[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = Z;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        a0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public eu0(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            this.b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.b;
        int i = this.c;
        this.c = i + 1;
        iArr2[i] = 6;
        this.v = 2;
        this.X = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        s(if0.d);
    }

    public void A(Number number) throws IOException {
        if (number == null) {
            p();
            return;
        }
        D();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.v != 1) {
                    e.g("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !Y.matcher(string).matches()) {
                uq1.i("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        a();
        this.a.append((CharSequence) string);
    }

    public void B(String str) throws IOException {
        if (str == null) {
            p();
            return;
        }
        D();
        a();
        w(str);
    }

    public void C(boolean z) throws IOException {
        D();
        a();
        this.a.write(z ? "true" : "false");
    }

    public final void D() throws IOException {
        if (this.W != null) {
            int iQ = q();
            if (iQ == 5) {
                this.a.write(this.f);
            } else if (iQ != 3) {
                uq1.q("Nesting problem.");
                return;
            }
            n();
            this.b[this.c - 1] = 4;
            w(this.W);
            this.W = null;
        }
    }

    public final void a() throws IOException {
        int iQ = q();
        if (iQ == 1) {
            this.b[this.c - 1] = 2;
            n();
            return;
        }
        Writer writer = this.a;
        if (iQ == 2) {
            writer.append((CharSequence) this.f);
            n();
            return;
        }
        if (iQ == 4) {
            writer.append((CharSequence) this.e);
            this.b[this.c - 1] = 5;
            return;
        }
        if (iQ != 6) {
            if (iQ != 7) {
                uq1.q("Nesting problem.");
                return;
            } else if (this.v != 1) {
                uq1.q("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.c - 1] = 7;
    }

    public void b() throws IOException {
        D();
        a();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 1;
        this.a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            uq1.o("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    public void e() throws IOException {
        D();
        a();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 3;
        this.a.write(123);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.c != 0) {
            this.a.flush();
        } else {
            uq1.q("JsonWriter is closed.");
        }
    }

    public final void i(int i, int i2, char c) throws IOException {
        int iQ = q();
        if (iQ != i2 && iQ != i) {
            uq1.q("Nesting problem.");
            return;
        }
        if (this.W != null) {
            sm0.q(this.W, "Dangling name: ");
            return;
        }
        this.c--;
        if (iQ == i2) {
            n();
        }
        this.a.write(c);
    }

    public void j() throws IOException {
        i(1, 2, ']');
    }

    public void l() throws IOException {
        i(3, 5, '}');
    }

    public void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.W != null) {
            uq1.q("Already wrote a name, expecting a value.");
            return;
        }
        int iQ = q();
        if (iQ == 3 || iQ == 5) {
            this.W = str;
        } else {
            uq1.q("Please begin an object before writing a name.");
        }
    }

    public final void n() throws IOException {
        if (this.i) {
            return;
        }
        String str = this.d.a;
        Writer writer = this.a;
        writer.write(str);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.d.b);
        }
    }

    public eu0 p() throws IOException {
        if (this.W != null) {
            if (!this.X) {
                this.W = null;
                return this;
            }
            D();
        }
        a();
        this.a.write("null");
        return this;
    }

    public final int q() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        uq1.q("JsonWriter is closed.");
        return 0;
    }

    public final void s(if0 if0Var) {
        Objects.requireNonNull(if0Var);
        this.d = if0Var;
        this.f = ",";
        if (if0Var.c) {
            this.e = ": ";
            if (if0Var.a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        this.i = this.d.a.isEmpty() && this.d.b.isEmpty();
    }

    public final void t(int i) {
        if (i == 0) {
            throw null;
        }
        this.v = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void w(String str) throws IOException {
        String str2;
        String[] strArr = this.w ? a0 : Z;
        Writer writer = this.a;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public void x(long j) throws IOException {
        D();
        a();
        this.a.write(Long.toString(j));
    }
}
