package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class to1 implements Iterable, KMappedMarker {
    public final /* synthetic */ t00 a;

    public to1(t00 t00Var) {
        this.a = t00Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a);
    }
}
