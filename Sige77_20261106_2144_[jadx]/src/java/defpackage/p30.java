package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p30 implements Sequence, q30 {
    public final Sequence a;
    public final int b;

    public p30(Sequence sequence, int i) {
        sequence.getClass();
        this.a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        e.a(i, 46, "count must be non-negative, but was ");
        throw null;
    }

    @Override // defpackage.q30
    public final Sequence a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new p30(this, i) : new p30(this.a, i2);
    }

    public final Iterator iterator() {
        return new y0(this);
    }
}
