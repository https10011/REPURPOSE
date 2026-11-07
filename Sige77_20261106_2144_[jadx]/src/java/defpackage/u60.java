package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u60 {
    public final er1 a;
    public final Executor b;

    public u60(er1 er1Var, Executor executor) {
        this.a = er1Var;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u60) && this.a == ((u60) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
