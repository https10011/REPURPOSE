package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class y73 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;
    public static final Map e;
    public static final Map f;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.AesSivKey");
        a = new gf3(r73.class, new xn(21));
        b = new cf3(tr3VarC, new vi(21));
        c = new hd3(k73.class, new br0(21));
        d = new ad3(tr3VarC, new ba0(21));
        HashMap map = new HashMap();
        q73 q73Var = q73.d;
        ip3 ip3Var = ip3.RAW;
        map.put(q73Var, ip3Var);
        q73 q73Var2 = q73.b;
        ip3 ip3Var2 = ip3.TINK;
        map.put(q73Var2, ip3Var2);
        q73 q73Var3 = q73.c;
        ip3 ip3Var3 = ip3.CRUNCHY;
        map.put(q73Var3, ip3Var3);
        e = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(ip3.class);
        enumMap.put(ip3Var, q73Var);
        enumMap.put(ip3Var2, q73Var2);
        enumMap.put(ip3Var3, q73Var3);
        enumMap.put(ip3.LEGACY, q73Var3);
        f = Collections.unmodifiableMap(enumMap);
    }

    public static q73 a(ip3 ip3Var) throws GeneralSecurityException {
        Map map = f;
        if (map.containsKey(ip3Var)) {
            return (q73) map.get(ip3Var);
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }
}
