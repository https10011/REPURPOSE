package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class r12 {
    public static final h12 A;
    public static final h12 B;
    public static final e70 C;
    public static final h12 a;
    public static final h12 b;
    public static final k12 c;
    public static final i12 d;
    public static final i12 e;
    public static final i12 f;
    public static final i12 g;
    public static final h12 h;
    public static final h12 i;
    public static final h12 j;
    public static final q02 k;
    public static final p12 l;
    public static final p12 m;
    public static final i12 n;
    public static final h12 o;
    public static final h12 p;
    public static final h12 q;
    public static final h12 r;
    public static final h12 s;
    public static final h12 t;
    public static final h12 u;
    public static final h12 v;
    public static final h12 w;
    public static final h12 x;
    public static final h12 y;
    public static final r71 z;

    static {
        int i2 = 0;
        a = new h12(Class.class, new x02().a(), i2);
        b = new h12(BitSet.class, new g12().a(), i2);
        j12 j12Var = new j12();
        c = new k12();
        d = new i12(Boolean.TYPE, Boolean.class, j12Var);
        e = new i12(Byte.TYPE, Byte.class, new l12());
        f = new i12(Short.TYPE, Short.class, new m12());
        g = new i12(Integer.TYPE, Integer.class, new n12());
        h = new h12(AtomicInteger.class, new o12().a(), i2);
        i = new h12(AtomicBoolean.class, new n02().a(), i2);
        j = new h12(AtomicIntegerArray.class, new o02().a(), i2);
        k = new q02();
        new r02();
        int i3 = 1;
        new p12(1, false);
        l = new p12(1, true);
        new p12(0, false);
        m = new p12(0, true);
        n = new i12(Character.TYPE, Character.class, new s02());
        t02 t02Var = new t02();
        o = new h12(BigDecimal.class, new u02(), i2);
        p = new h12(BigInteger.class, new v02(), i2);
        q = new h12(uv0.class, new w02(), i2);
        r = new h12(String.class, t02Var, i2);
        s = new h12(StringBuilder.class, new y02(), i2);
        t = new h12(StringBuffer.class, new z02(), i2);
        u = new h12(URL.class, new a12(), i2);
        v = new h12(URI.class, new b12(), i2);
        w = new h12(InetAddress.class, new c12(), i3);
        x = new h12(UUID.class, new d12(), i2);
        y = new h12(Currency.class, new e12().a(), i2);
        z = new r71(new os0(new String[]{"year", "month", "dayOfMonth", "hourOfDay", "minute", "second"}, 8), i3);
        A = new h12(Locale.class, new f12(), i2);
        B = new h12(ut0.class, vt0.a, i3);
        C = f70.d;
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static int b(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        e.g(ck1.t("Too big for an int: ", j2));
        return 0;
    }
}
