package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class br implements Sequence {
    public final AtomicReference a;

    public br(Sequence sequence) {
        this.a = new AtomicReference(sequence);
    }

    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        uq1.q("This sequence can be consumed only once.");
        return null;
    }
}
