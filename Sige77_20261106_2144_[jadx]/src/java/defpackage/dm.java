package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dm extends am {
    public static final cm e = new cm(null);

    static {
        new dm((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dm)) {
            return false;
        }
        char c = this.a;
        char c2 = this.b;
        if (Intrinsics.compare(c, c2) > 0) {
            dm dmVar = (dm) obj;
            if (Intrinsics.compare(dmVar.a, dmVar.b) > 0) {
                return true;
            }
        }
        dm dmVar2 = (dm) obj;
        return c == dmVar2.a && c2 == dmVar2.b;
    }

    public final int hashCode() {
        char c = this.a;
        char c2 = this.b;
        if (Intrinsics.compare(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
