package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yb3 {
    public final String a;
    public final String b;
    public final boolean c;

    public yb3(String str, boolean z) {
        gu2.l(str);
        this.a = str;
        gu2.l("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb3)) {
            return false;
        }
        yb3 yb3Var = (yb3) obj;
        return jw.j(this.a, yb3Var.a) && jw.j(this.b, yb3Var.b) && jw.j(null, null) && this.c == yb3Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        gu2.o(null);
        throw null;
    }
}
