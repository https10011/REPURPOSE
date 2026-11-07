package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rj1 implements Serializable {
    public static final pj1 b = new pj1(null);
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof qj1) {
            return ((qj1) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rj1) {
            return Intrinsics.areEqual(this.a, ((rj1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof qj1) {
            return ((qj1) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
