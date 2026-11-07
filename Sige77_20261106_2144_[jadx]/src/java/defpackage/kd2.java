package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kd2 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public kd2(int i, int i2, int i3, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
    }

    public final String a() {
        return this.a + "-" + this.b + "-" + this.d + "-" + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kd2) {
            return TextUtils.equals(a(), ((kd2) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
