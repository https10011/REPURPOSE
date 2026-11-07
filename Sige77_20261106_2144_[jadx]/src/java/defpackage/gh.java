package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gh implements Cloneable {
    public int b = 0;
    public int[] a = new int[1];

    public final void c(boolean z) {
        f(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final Object clone() {
        int[] iArr = (int[]) this.a.clone();
        int i = this.b;
        gh ghVar = new gh();
        ghVar.a = iArr;
        ghVar.b = i;
        return ghVar;
    }

    public final void d(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            e.g("Num bits must be between 0 and 32");
            return;
        }
        f(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            c(z);
            i2--;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return this.b == ghVar.b && Arrays.equals(this.a, ghVar.a);
    }

    public final void f(int i) {
        int[] iArr = this.a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.a = iArr2;
        }
    }

    public final boolean g(int i) {
        return (this.a[i / 32] & (1 << (i & 31))) != 0;
    }

    public final int h() {
        return (this.b + 7) / 8;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (this.b * 31);
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(g(i2) ? 'X' : JwtParser.SEPARATOR_CHAR);
        }
        return sb.toString();
    }
}
