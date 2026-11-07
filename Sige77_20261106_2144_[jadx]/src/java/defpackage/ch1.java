package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ch1 implements Serializable {
    public static final bh1 c = new bh1(null);
    public final String a;
    public final int b;

    public ch1(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.a, this.b);
        patternCompile.getClass();
        return new Regex(patternCompile);
    }
}
