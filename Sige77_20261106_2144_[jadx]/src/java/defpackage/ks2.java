package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ks2 extends IOException {
    public boolean a;

    public static ms2 a() {
        return new ms2("Protocol message tag had invalid wire type.");
    }

    public static ks2 b() {
        return new ks2("Protocol message contained an invalid tag (zero).");
    }

    public static ks2 c() {
        return new ks2("Protocol message had invalid UTF-8.");
    }

    public static ks2 d() {
        return new ks2("CodedInputStream encountered a malformed varint.");
    }

    public static ks2 e() {
        return new ks2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ks2 f() {
        return new ks2("Failed to parse the message.");
    }

    public static ks2 g() {
        return new ks2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
