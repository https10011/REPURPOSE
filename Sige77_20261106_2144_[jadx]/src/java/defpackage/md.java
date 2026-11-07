package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class md extends zt {
    public final Context a;
    public final hn b;
    public final hn c;
    public final String d;

    public md(Context context, hn hnVar, hn hnVar2, String str) {
        if (context == null) {
            uq1.h("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (hnVar == null) {
            uq1.h("Null wallClock");
            throw null;
        }
        this.b = hnVar;
        if (hnVar2 == null) {
            uq1.h("Null monotonicClock");
            throw null;
        }
        this.c = hnVar2;
        if (str != null) {
            this.d = str;
        } else {
            uq1.h("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zt) {
            md mdVar = (md) ((zt) obj);
            if (this.a.equals(mdVar.a) && this.b.equals(mdVar.b) && this.c.equals(mdVar.c) && this.d.equals(mdVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return ts.l(sb, this.d, "}");
    }
}
