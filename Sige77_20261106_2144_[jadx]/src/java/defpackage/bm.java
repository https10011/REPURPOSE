package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bm extends wl {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public bm(char c, char c2, int i) {
        this.a = i;
        this.b = c2;
        boolean z = false;
        if (i <= 0 ? Intrinsics.compare(c, c2) >= 0 : Intrinsics.compare(c, c2) <= 0) {
            z = true;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // defpackage.wl
    public final char nextChar() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                uq1.a();
                return (char) 0;
            }
            this.c = false;
        }
        return (char) i;
    }
}
