package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gi implements Closeable {
    public final /* synthetic */ int a;
    public Object b;

    public gi(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Inflater(true);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                if (((ji) this.b) == null) {
                    uq1.q("not attached to a buffer");
                } else {
                    this.b = null;
                }
                break;
            default:
                ((Inflater) this.b).end();
                break;
        }
    }
}
