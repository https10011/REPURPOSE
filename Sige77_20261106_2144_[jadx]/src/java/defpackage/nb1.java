package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nb1 implements Serializable {
    public final HashMap a;

    public nb1(HashMap map) {
        map.getClass();
        this.a = map;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new ob1(this.a);
    }
}
