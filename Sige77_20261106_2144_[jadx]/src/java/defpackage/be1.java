package defpackage;

import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class be1 {
    public static final LinkedHashMap a;

    static {
        Pair[] pairArr = {new Pair(ErrorCode.w, new t(26)), new Pair(ErrorCode.f, new t(0)), new Pair(ErrorCode.Z, new t(16)), new Pair(ErrorCode.W, new t(1)), new Pair(ErrorCode.X, new t(3)), new Pair(ErrorCode.c, new t(10)), new Pair(ErrorCode.v, new t(4)), new Pair(ErrorCode.e, new t(12)), new Pair(ErrorCode.Y, new t(14)), new Pair(ErrorCode.b, new t(17)), new Pair(ErrorCode.d, new t(22)), new Pair(ErrorCode.i, new t(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(v11.a(12));
        w11.f(linkedHashMap, pairArr);
        a = linkedHashMap;
    }
}
