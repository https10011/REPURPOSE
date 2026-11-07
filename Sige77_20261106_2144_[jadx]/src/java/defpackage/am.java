package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class am implements Iterable, KMappedMarker {
    public static final zl d = new zl(null);
    public final char a;
    public final char b;
    public final int c = 1;

    public am(char c, char c2) {
        this.a = c;
        this.b = (char) kv.A(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bm(this.a, this.b, this.c);
    }
}
