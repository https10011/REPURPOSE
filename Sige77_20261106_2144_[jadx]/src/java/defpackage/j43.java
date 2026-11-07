package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j43 extends y43 {
    public final d33 a;

    public j43(d33 d33Var) {
        this.a = d33Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y43 y43Var = (y43) obj;
        int iZza = y43Var.zza();
        int iC = y43.c((byte) 64);
        if (iC != iZza) {
            return iC - y43Var.zza();
        }
        d33 d33Var = ((j43) y43Var).a;
        d33 d33Var2 = this.a;
        byte[] bArr = d33Var2.b;
        int length = bArr.length;
        byte[] bArr2 = d33Var.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return n23.a.compare(d33Var2.i(), d33Var.i());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j43.class == obj.getClass()) {
            return this.a.equals(((j43) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y43.c((byte) 64)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        o13 o13Var;
        int i;
        boolean z;
        r13 r13Var = w13.d;
        w13 r13Var2 = r13Var.c;
        if (r13Var2 == null) {
            o13 o13Var2 = r13Var.a;
            char[] cArr = o13Var2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    o13Var = o13Var2;
                    break;
                }
                char c = cArr[i2];
                if (c >= 'a' && c <= 'z') {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i4 = 0; i4 < cArr.length; i4++) {
                            char c3 = cArr[i4];
                            if (c3 >= 97 && c3 <= 122) {
                                c3 ^= 32;
                            }
                            cArr2[i4] = (char) c3;
                        }
                        o13Var = new o13(o13Var2.a.concat(".upperCase()"), cArr2);
                        byte[] bArr = o13Var.g;
                        if (!o13Var2.h || o13Var.h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    uq1.q(xi0.H("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                bArrCopyOf[i5] = b;
                            }
                        }
                        o13Var = new o13(o13Var.a.concat(".ignoreCase()"), o13Var.b, bArrCopyOf, true);
                        break;
                    }
                    uq1.q("Cannot call upperCase() on a mixed-case alphabet");
                    return null;
                }
                i2++;
            }
            r13Var2 = o13Var == o13Var2 ? r13Var : new r13(o13Var);
            r13Var.c = r13Var2;
        }
        byte[] bArrI = this.a.i();
        return ts.k("h'", r13Var2.c(bArrI, bArrI.length), "'");
    }

    @Override // defpackage.y43
    public final int zza() {
        return y43.c((byte) 64);
    }
}
