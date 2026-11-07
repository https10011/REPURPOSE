package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tn extends IOException {
    public tn(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("Pos: ");
        sb.append(i);
        sb.append(", limit: ");
        sb.append(i2);
        sb.append(", len: ");
        sb.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sb.toString()), indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j2 + ", len: " + i), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public /* synthetic */ tn(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public tn(String str, int i, IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }
}
