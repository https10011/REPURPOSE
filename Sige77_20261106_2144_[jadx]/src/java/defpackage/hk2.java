package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hk2 extends sn {
    public static final Map e;
    public final fr3 d;

    static {
        EnumMap enumMap = new EnumMap(fr3.class);
        for (fr3 fr3Var : fr3.values()) {
            hk2[] hk2VarArr = new hk2[10];
            for (int i = 0; i < 10; i++) {
                hk2VarArr[i] = new hk2(i, fr3Var, jr3.e);
            }
            enumMap.put(fr3Var, hk2VarArr);
        }
        e = Collections.unmodifiableMap(enumMap);
    }

    public hk2(int i, fr3 fr3Var, jr3 jr3Var) {
        super(jr3Var, i);
        qt.J(fr3Var, "format char");
        this.d = fr3Var;
        if (jr3Var.a()) {
            return;
        }
        int i2 = fr3Var.a;
        i2 = jr3Var.c() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        jr3Var.d(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.sn
    public final void I(o50 o50Var, Object obj) {
        o50Var.e(obj, this.d, (jr3) this.c);
    }
}
