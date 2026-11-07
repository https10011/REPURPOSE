package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eo2 extends RuntimeException {
    public eo2() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final xm2 a() {
        return new xm2(getMessage());
    }
}
