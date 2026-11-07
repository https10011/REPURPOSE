package defpackage;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class za1 extends rq0 {
    public final Method W;
    public final int X;
    public final String Y;
    public final vi Z;
    public final boolean a0;

    public za1(Method method, int i, String str, boolean z) {
        vi viVar = vi.b;
        this.W = method;
        this.X = i;
        Objects.requireNonNull(str, "name == null");
        this.Y = str;
        this.Z = viVar;
        this.a0 = z;
    }

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) throws EOFException {
        String strC;
        String str = this.Y;
        if (obj == null) {
            throw ta.v(this.W, this.X, ts.k("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.Z.getClass();
        String string = obj.toString();
        if (ai1Var.c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strC = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.a0;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                ji jiVar = new ji();
                jiVar.X(0, iCharCount, string);
                ji jiVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (jiVar2 == null) {
                                jiVar2 = new ji();
                            }
                            jiVar2.Z(iCodePointAt2);
                            long j = jiVar2.b;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bN = jiVar2.n(j2);
                                jiVar.S(37);
                                char[] cArr = ai1.l;
                                jiVar.S(cArr[((bN & 255) >> 4) & 15]);
                                jiVar.S(cArr[bN & 15]);
                                j2++;
                                jiVar2 = jiVar2;
                            }
                            jiVar2.i();
                        } else {
                            jiVar.Z(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strC = jiVar.C();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = ai1Var.c.replace("{" + str + "}", strC);
        if (ai1.m.matcher(strReplace).matches()) {
            e.g("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        } else {
            ai1Var.c = strReplace;
        }
    }
}
