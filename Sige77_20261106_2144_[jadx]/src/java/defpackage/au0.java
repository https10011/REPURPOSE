package defpackage;

import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class au0 implements Closeable {
    public String W;
    public int[] X;
    public String[] Z;
    public final Reader a;
    public int[] a0;
    public long v;
    public int w;
    public int b0 = 2;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int i = 0;
    public int Y = 1;

    static {
        br0.i = new br0(7);
    }

    public au0(Reader reader) {
        int[] iArr = new int[32];
        this.X = iArr;
        iArr[0] = 6;
        this.Z = new String[32];
        this.a0 = new int[32];
        this.a = reader;
    }

    public final long A() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i == 15) {
            this.i = 0;
            int[] iArr = this.a0;
            int i2 = this.Y - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.v;
        }
        if (i == 16) {
            this.W = new String(this.b, this.c, this.w);
            this.c += this.w;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw Z("a long");
            }
            if (i == 10) {
                this.W = N();
            } else {
                this.W = I(i == 8 ? '\'' : '\"');
            }
            a0(this.W);
            try {
                long j = Long.parseLong(this.W);
                this.i = 0;
                int[] iArr2 = this.a0;
                int i3 = this.Y - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double d = Double.parseDouble(this.W);
        long j2 = (long) d;
        if (j2 == d) {
            this.W = null;
            this.i = 0;
            int[] iArr3 = this.a0;
            int i4 = this.Y - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.W + s());
    }

    public final String B() throws IOException {
        String strI;
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i == 14) {
            strI = N();
        } else if (i == 12) {
            strI = I('\'');
        } else {
            if (i != 13) {
                throw Z("a name");
            }
            strI = I('\"');
        }
        this.i = 0;
        this.Z[this.Y - 1] = strI;
        return strI;
    }

    public final int C(boolean z) throws IOException {
        int i = this.c;
        int i2 = this.d;
        while (true) {
            if (i == i2) {
                this.c = i;
                if (!m(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(s()));
                    }
                    return -1;
                }
                i = this.c;
                i2 = this.d;
            }
            int i3 = i + 1;
            char[] cArr = this.b;
            char c = cArr[i];
            if (c == '\n') {
                this.e++;
                this.f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.c = i3;
                    if (i3 == i2) {
                        this.c = i;
                        boolean zM = m(2);
                        this.c++;
                        if (!zM) {
                        }
                        return c;
                    }
                    e();
                    int i4 = this.c;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.c = i4 + 1;
                        while (true) {
                            if (this.c + 2 > this.d && !m(2)) {
                                Y("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.c;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.c;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.d;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.e++;
                                this.f = i5 + 1;
                            }
                            this.c++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.c = i4 + 1;
                        V();
                        i = this.c;
                        i2 = this.d;
                    }
                } else {
                    if (c != '#') {
                        this.c = i3;
                        return c;
                    }
                    this.c = i3;
                    e();
                    V();
                    i = this.c;
                    i2 = this.d;
                }
            }
            i = i3;
        }
    }

    public final void D() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i != 7) {
            throw Z("null");
        }
        this.i = 0;
        int[] iArr = this.a0;
        int i2 = this.Y - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final String I(char c) throws f11 {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.c;
            int i3 = this.d;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.b;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (this.b0 == 3 && c2 < ' ') {
                            Y("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.c = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.c = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(T());
                            i2 = this.c;
                            i3 = this.d;
                        } else {
                            if (c2 == '\n') {
                                this.e++;
                                this.f = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.c = i2;
        } while (m(1));
        Y("Unterminated string");
        throw null;
    }

    public final String M() {
        String str;
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i == 10) {
            str = N();
        } else if (i == 8) {
            str = I('\'');
        } else if (i == 9) {
            str = I('\"');
        } else if (i == 11) {
            str = this.W;
            this.W = null;
        } else if (i == 15) {
            str = Long.toString(this.v);
        } else {
            if (i != 16) {
                throw Z("a string");
            }
            str = new String(this.b, this.c, this.w);
            this.c += this.w;
        }
        this.i = 0;
        int[] iArr = this.a0;
        int i2 = this.Y - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String N() throws f11 {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.c + i2;
                int i4 = this.d;
                char[] cArr = this.b;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.c, i2);
                    this.c += i2;
                    if (!m(1)) {
                    }
                } else if (!m(i2 + 1)) {
                    i = i2;
                }
                int i5 = this.c;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.c += i;
                return string;
            }
        }
    }

    public final int R() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        switch (i) {
            case 1:
                return 3;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return 4;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return 1;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return 2;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void S(int i) throws f11 {
        int i2 = this.Y;
        if (i2 - 1 >= 255) {
            throw new f11("Nesting limit 255 reached".concat(s()));
        }
        int[] iArr = this.X;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.X = Arrays.copyOf(iArr, i3);
            this.a0 = Arrays.copyOf(this.a0, i3);
            this.Z = (String[]) Arrays.copyOf(this.Z, i3);
        }
        int[] iArr2 = this.X;
        int i4 = this.Y;
        this.Y = i4 + 1;
        iArr2[i4] = i;
    }

    public final char T() throws f11 {
        int i;
        if (this.c == this.d && !m(1)) {
            Y("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        char[] cArr = this.b;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            Y("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.d && !m(4)) {
                            Y("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.c;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    Y("Malformed Unicode escape \\u".concat(new String(cArr, this.c, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.c += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.b0 == 3) {
            Y("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.e++;
        this.f = i3;
        if (this.b0 == 3) {
            Y("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void U(char c) throws f11 {
        do {
            int i = this.c;
            int i2 = this.d;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.b[i];
                if (c2 == c) {
                    this.c = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.c = i3;
                    T();
                    i = this.c;
                    i2 = this.d;
                } else {
                    if (c2 == '\n') {
                        this.e++;
                        this.f = i3;
                    }
                    i = i3;
                }
            }
            this.c = i;
        } while (m(1));
        Y("Unterminated string");
        throw null;
    }

    public final void V() {
        char c;
        do {
            if (this.c >= this.d && !m(1)) {
                return;
            }
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            c = this.b[i];
            if (c == '\n') {
                this.e++;
                this.f = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void W() throws f11 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.c + i;
                if (i2 < this.d) {
                    char c = this.b[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    this.c += i;
                    return;
                }
                this.c = i2;
            }
        } while (m(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void X() throws IOException {
        int i = 0;
        do {
            int i2 = this.i;
            if (i2 == 0) {
                i2 = i();
            }
            switch (i2) {
                case 1:
                    S(3);
                    i++;
                    this.i = 0;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (i == 0) {
                        this.Z[this.Y - 1] = null;
                    }
                    this.Y--;
                    i--;
                    this.i = 0;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    S(1);
                    i++;
                    this.i = 0;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    this.Y--;
                    i--;
                    this.i = 0;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                case 11:
                case 15:
                default:
                    this.i = 0;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    U('\'');
                    this.i = 0;
                    break;
                case 9:
                    U('\"');
                    this.i = 0;
                    break;
                case 10:
                    W();
                    this.i = 0;
                    break;
                case 12:
                    U('\'');
                    if (i == 0) {
                        this.Z[this.Y - 1] = "<skipped>";
                    }
                    this.i = 0;
                    break;
                case 13:
                    U('\"');
                    if (i == 0) {
                        this.Z[this.Y - 1] = "<skipped>";
                    }
                    this.i = 0;
                    break;
                case 14:
                    W();
                    if (i == 0) {
                        this.Z[this.Y - 1] = "<skipped>";
                    }
                    this.i = 0;
                    break;
                case 16:
                    this.c += this.w;
                    this.i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.a0;
        int i3 = this.Y - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void Y(String str) throws f11 {
        StringBuilder sbM = ts.m(str);
        sbM.append(s());
        sbM.append("\nSee ");
        sbM.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new f11(sbM.toString());
    }

    public final IllegalStateException Z(String str) {
        String str2 = R() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbN = ts.n("Expected ", str, " but was ");
        sbN.append(y00.p(R()));
        sbN.append(s());
        sbN.append("\nSee ");
        sbN.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbN.toString());
    }

    public final void a() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i != 3) {
            throw Z("BEGIN_ARRAY");
        }
        S(1);
        this.a0[this.Y - 1] = 0;
        this.i = 0;
    }

    public final void a0(String str) throws f11 {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                Y("String contains non-ASCII characters: ".concat(str));
                throw null;
            }
        }
    }

    public final void b() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i != 1) {
            throw Z("BEGIN_OBJECT");
        }
        S(3);
        this.i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.i = 0;
        this.X[0] = 8;
        this.Y = 1;
        this.a.close();
    }

    public final void e() throws f11 {
        if (this.b0 == 1) {
            return;
        }
        Y("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x0196  */
    /* JADX WARN: Code duplicated, block: B:126:0x019c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ad A[PHI: r1 r10
      0x01ad: PHI (r1v56 int) = (r1v55 int), (r1v72 int) binds: [B:122:0x0194, B:130:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r10v6 int) = (r10v5 int), (r10v7 int) binds: [B:122:0x0194, B:130:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:176:0x0227  */
    /* JADX WARN: Code duplicated, block: B:177:0x0229  */
    /* JADX WARN: Code duplicated, block: B:190:0x024c A[DONT_INVERT, PHI: r8
      0x024c: PHI (r8v20 char) = (r8v19 char), (r8v21 char) binds: [B:175:0x0225, B:181:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x024e  */
    /* JADX WARN: Code duplicated, block: B:204:0x026a  */
    /* JADX WARN: Code duplicated, block: B:206:0x026d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x027e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:214:0x027f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0289  */
    /* JADX WARN: Code duplicated, block: B:218:0x0291  */
    /* JADX WARN: Code duplicated, block: B:280:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x01a4 A[SYNTHETIC] */
    public final int i() throws IOException {
        int iC;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        boolean z;
        int i6;
        char c2;
        char c3;
        int i7;
        char c4;
        int[] iArr = this.X;
        boolean z2 = true;
        int i8 = this.Y - 1;
        int i9 = iArr[i8];
        char[] cArr = this.b;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iC2 = C(true);
            if (iC2 != 44) {
                if (iC2 != 59) {
                    if (iC2 == 93) {
                        this.i = 4;
                        return 4;
                    }
                    Y("Unterminated array");
                    throw null;
                }
                e();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iC = C(true)) != 44) {
                    if (iC != 59) {
                        if (iC == 125) {
                            this.i = 2;
                            return 2;
                        }
                        Y("Unterminated object");
                        throw null;
                    }
                    e();
                }
                int iC3 = C(true);
                if (iC3 == 34) {
                    this.i = 13;
                    return 13;
                }
                if (iC3 == 39) {
                    e();
                    this.i = 12;
                    return 12;
                }
                if (iC3 == 125) {
                    if (i9 != 5) {
                        this.i = 2;
                        return 2;
                    }
                    Y("Expected name");
                    throw null;
                }
                e();
                this.c--;
                if (q((char) iC3)) {
                    this.i = 14;
                    return 14;
                }
                Y("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iC4 = C(true);
                if (iC4 != 58) {
                    if (iC4 != 61) {
                        Y("Expected ':'");
                        throw null;
                    }
                    e();
                    if (this.c < this.d || m(1)) {
                        int i10 = this.c;
                        if (cArr[i10] == '>') {
                            this.c = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.b0 == 1) {
                    C(true);
                    int i11 = this.c;
                    this.c = i11 - 1;
                    if (i11 + 4 <= this.d || m(5)) {
                        int i12 = this.c;
                        if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                            this.c = i12 + 5;
                        }
                    }
                }
                this.X[this.Y - 1] = 7;
            } else if (i9 == 7) {
                if (C(false) == -1) {
                    this.i = 17;
                    return 17;
                }
                e();
                this.c--;
            } else if (i9 == 8) {
                uq1.q("JsonReader is closed");
                return 0;
            }
        }
        int iC5 = C(true);
        if (iC5 == 34) {
            this.i = 9;
            return 9;
        }
        if (iC5 == 39) {
            e();
            this.i = 8;
            return 8;
        }
        if (iC5 == 44 || iC5 == 59) {
            i = 1;
        } else {
            if (iC5 == 91) {
                this.i = 3;
                return 3;
            }
            if (iC5 != 93) {
                if (iC5 == 123) {
                    this.i = 1;
                    return 1;
                }
                int i13 = this.c - 1;
                this.c = i13;
                char c5 = cArr[i13];
                if (c5 == 't' || c5 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else {
                    if (c5 != 'f' && c5 != 'F') {
                        if (c5 != 'n' && c5 != 'N') {
                            i3 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                        if (i3 != 0) {
                            return i3;
                        }
                        i4 = this.c;
                        i5 = this.d;
                        z = true;
                        i6 = 0;
                        long j = 0;
                        boolean z3 = false;
                        c2 = 0;
                        while (true) {
                            if (i4 + i6 != i5) {
                                c3 = cArr[i4 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        }
                                    } else if (c3 == '-') {
                                        if (c2 == 0) {
                                            z3 = true;
                                            c2 = 1;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                        }
                                        i6++;
                                        z2 = true;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == z2 || c2 == 0) {
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else if (c2 != 2) {
                                                long j2 = j;
                                                if (c2 == 3) {
                                                    j = j2;
                                                    c2 = 4;
                                                } else if (c2 == 5 || c2 == 6) {
                                                    j = j2;
                                                    c2 = 7;
                                                } else {
                                                    j = j2;
                                                }
                                            } else if (j != 0) {
                                                long j3 = j;
                                                long j4 = (10 * j) - ((long) (c3 - '0'));
                                                z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                j = j4;
                                            }
                                            i6++;
                                            z2 = true;
                                        } else if (!q(c3)) {
                                            c4 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                    this.w = i6;
                                                    i7 = 16;
                                                    this.i = 16;
                                                }
                                            } else if (z || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                                                c4 = 2;
                                                if (c2 != c4) {
                                                }
                                                this.w = i6;
                                                i7 = 16;
                                                this.i = 16;
                                            } else {
                                                long j5 = j;
                                                if (!z3) {
                                                    j5 = -j5;
                                                }
                                                this.v = j5;
                                                this.c += i6;
                                                i7 = 15;
                                                this.i = 15;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i6++;
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (q(cArr[this.c])) {
                                        Y("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.i = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i6++;
                                z2 = true;
                            } else if (i6 != cArr.length) {
                                if (!m(i6 + 1)) {
                                    i4 = this.c;
                                    i5 = this.d;
                                    c3 = cArr[i4 + i6];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (q(cArr[this.c])) {
                                            Y("Expected value");
                                            throw null;
                                        }
                                        e();
                                        this.i = 10;
                                        return 10;
                                    }
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i6++;
                                    z2 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.w = i6;
                                    i7 = 16;
                                    this.i = 16;
                                } else {
                                    if (z) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.w = i6;
                                    i7 = 16;
                                    this.i = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (q(cArr[this.c])) {
                                    Y("Expected value");
                                    throw null;
                                }
                                e();
                                this.i = 10;
                                return 10;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (q(cArr[this.c])) {
                                Y("Expected value");
                                throw null;
                            }
                            e();
                            this.i = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                }
                boolean z4 = this.b0 != 3;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.c;
                    int i16 = this.d;
                    if (i14 >= length) {
                        if ((i15 + length >= i16 && !m(length + 1)) || !q(cArr[this.c + length])) {
                            this.c += length;
                            this.i = i2;
                            i3 = i2;
                            break;
                        }
                        break;
                    }
                    if ((i15 + i14 < i16 || m(i14 + 1)) && ((c = cArr[this.c + i14]) == str.charAt(i14) || (z4 && c == str2.charAt(i14)))) {
                        i14++;
                    }
                    i3 = 0;
                    break;
                }
                if (i3 != 0) {
                    return i3;
                }
                i4 = this.c;
                i5 = this.d;
                z = true;
                i6 = 0;
                long j6 = 0;
                boolean z5 = false;
                c2 = 0;
                while (true) {
                    if (i4 + i6 != i5) {
                        c3 = cArr[i4 + i6];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z2 = true;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z2 = true;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (q(cArr[this.c])) {
                                Y("Expected value");
                                throw null;
                            }
                            e();
                            this.i = 10;
                            return 10;
                        }
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i6++;
                        z2 = true;
                    } else if (i6 != cArr.length) {
                        if (!m(i6 + 1)) {
                            i4 = this.c;
                            i5 = this.d;
                            c3 = cArr[i4 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z2 = true;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (q(cArr[this.c])) {
                                    Y("Expected value");
                                    throw null;
                                }
                                e();
                                this.i = 10;
                                return 10;
                            }
                            if (c2 != 5) {
                            }
                            c2 = 6;
                            i6++;
                            z2 = true;
                        }
                        c4 = 2;
                        if (c2 != 2) {
                            if (c2 != c4) {
                            }
                            this.w = i6;
                            i7 = 16;
                            this.i = 16;
                        } else {
                            if (z) {
                            }
                            c4 = 2;
                            if (c2 != c4) {
                            }
                            this.w = i6;
                            i7 = 16;
                            this.i = 16;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        if (q(cArr[this.c])) {
                            Y("Expected value");
                            throw null;
                        }
                        e();
                        this.i = 10;
                        return 10;
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (q(cArr[this.c])) {
                        Y("Expected value");
                        throw null;
                    }
                    e();
                    this.i = 10;
                    return 10;
                }
            }
            i = 1;
            if (i9 == 1) {
                this.i = 4;
                return 4;
            }
        }
        if (i9 != i && i9 != 2) {
            Y("Unexpected value");
            throw null;
        }
        e();
        this.c -= i;
        this.i = 7;
        return 7;
    }

    public final void j() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i != 4) {
            throw Z("END_ARRAY");
        }
        int i2 = this.Y;
        this.Y = i2 - 1;
        int[] iArr = this.a0;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i = 0;
    }

    public final void l() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i != 2) {
            throw Z("END_OBJECT");
        }
        int i2 = this.Y;
        int i3 = i2 - 1;
        this.Y = i3;
        this.Z[i3] = null;
        int[] iArr = this.a0;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.i = 0;
    }

    public final boolean m(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f;
        int i5 = this.c;
        this.f = i4 - i5;
        int i6 = this.d;
        char[] cArr = this.b;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.d = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.d = 0;
        }
        this.c = 0;
        do {
            int i8 = this.d;
            int i9 = this.a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.d + i9;
            this.d = i2;
            if (this.e == 0 && (i3 = this.f) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String n(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.Y;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.X[i];
            switch (i3) {
                case 1:
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    int i4 = this.a0[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    sb.append(JwtParser.SEPARATOR_CHAR);
                    String str = this.Z[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                default:
                    e.b(ck1.r(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    public final boolean p() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean q(char c) throws f11 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public final String s() {
        return " at line " + (this.e + 1) + " column " + ((this.c - this.f) + 1) + " path " + n(false);
    }

    public final boolean t() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i == 5) {
            this.i = 0;
            int[] iArr = this.a0;
            int i2 = this.Y - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw Z("a boolean");
        }
        this.i = 0;
        int[] iArr2 = this.a0;
        int i3 = this.Y - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final String toString() {
        return au0.class.getSimpleName().concat(s());
    }

    public final double w() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i == 15) {
            this.i = 0;
            int[] iArr = this.a0;
            int i2 = this.Y - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.v;
        }
        if (i == 16) {
            this.W = new String(this.b, this.c, this.w);
            this.c += this.w;
        } else if (i == 8 || i == 9) {
            this.W = I(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.W = N();
        } else if (i != 11) {
            throw Z("a double");
        }
        this.i = 11;
        double d = Double.parseDouble(this.W);
        if (this.b0 != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            Y("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.W = null;
        this.i = 0;
        int[] iArr2 = this.a0;
        int i3 = this.Y - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d;
    }

    public final int x() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = i();
        }
        if (i == 15) {
            long j = this.v;
            int i2 = (int) j;
            if (j == i2) {
                this.i = 0;
                int[] iArr = this.a0;
                int i3 = this.Y - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.v + s());
        }
        if (i == 16) {
            this.W = new String(this.b, this.c, this.w);
            this.c += this.w;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw Z("an int");
            }
            if (i == 10) {
                this.W = N();
            } else {
                this.W = I(i == 8 ? '\'' : '\"');
            }
            a0(this.W);
            try {
                int i4 = Integer.parseInt(this.W);
                this.i = 0;
                int[] iArr2 = this.a0;
                int i5 = this.Y - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double d = Double.parseDouble(this.W);
        int i6 = (int) d;
        if (i6 == d) {
            this.W = null;
            this.i = 0;
            int[] iArr3 = this.a0;
            int i7 = this.Y - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.W + s());
    }
}
