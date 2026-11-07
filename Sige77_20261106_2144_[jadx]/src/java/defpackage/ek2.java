package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ek2 {
    public static final rs b = new rs(14);
    public static final ek2 c;
    public final dk2 a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new ek2(new dk2());
    }

    public ek2(dk2 dk2Var) {
        this.a = dk2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ek2) && ((ek2) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
