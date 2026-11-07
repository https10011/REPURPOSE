package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tt0 implements h60 {
    public static final rt0 f;
    public static final rt0 g;
    public final HashMap a;
    public final HashMap b;
    public final qt0 c;
    public boolean d;
    public static final qt0 e = new qt0(0);
    public static final st0 h = new st0();

    /* JADX WARN: Type inference failed for: r0v1, types: [rt0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [rt0] */
    static {
        final int i = 0;
        f = new l42() { // from class: rt0
            @Override // defpackage.e60
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((m42) obj2).b((String) obj);
                        break;
                    default:
                        ((m42) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new l42() { // from class: rt0
            @Override // defpackage.e60
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((m42) obj2).b((String) obj);
                        break;
                    default:
                        ((m42) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public tt0() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final h60 a(Class cls, w71 w71Var) {
        this.a.put(cls, w71Var);
        this.b.remove(cls);
        return this;
    }
}
