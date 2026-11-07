package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w1 implements Serializable {
    public final String a;
    public final String b;

    public w1(String str, String str2) {
        this.a = str2;
        this.b = h42.x(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new v1(this.a);
    }

    public final boolean equals(Object obj) {
        boolean zAreEqual;
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            String str = w1Var.b;
            String str2 = this.b;
            if (str == null) {
                zAreEqual = str2 == null;
            } else {
                zAreEqual = Intrinsics.areEqual(str, str2);
            }
            if (zAreEqual && Intrinsics.areEqual(w1Var.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return this.a.hashCode() ^ (str != null ? str.hashCode() : 0);
    }
}
