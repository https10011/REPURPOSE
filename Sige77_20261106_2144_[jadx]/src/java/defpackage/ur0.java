package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class ur0 extends IOException {
    public boolean a;

    public static ur0 a() {
        return new ur0("Protocol message had invalid UTF-8.");
    }

    public static tr0 b() {
        return new tr0("Protocol message tag had invalid wire type.");
    }

    public static ur0 c() {
        return new ur0("CodedInputStream encountered a malformed varint.");
    }

    public static ur0 d() {
        return new ur0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ur0 e() {
        return new ur0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
