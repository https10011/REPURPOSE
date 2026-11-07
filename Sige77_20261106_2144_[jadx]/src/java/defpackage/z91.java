package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z91 {
    public static final ba0 e = new ba0(8);
    public final Object a;
    public final y91 b;
    public final String c;
    public volatile byte[] d;

    public z91(String str, Object obj, y91 y91Var) {
        if (TextUtils.isEmpty(str)) {
            e.g("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = obj;
        this.b = y91Var;
    }

    public static z91 a(Object obj, String str) {
        return new z91(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z91) {
            return this.c.equals(((z91) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return ts.l(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
