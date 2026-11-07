package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class hb0 implements Closeable {
    public static final gu0 a;
    public static final xi1 b;

    static {
        gu0 gu0Var;
        try {
            Class.forName("java.nio.file.Files");
            gu0Var = new b71();
        } catch (ClassNotFoundException unused) {
            gu0Var = new gu0();
        }
        a = gu0Var;
        String str = jb1.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        br0.h(property);
        ClassLoader classLoader = xi1.class.getClassLoader();
        classLoader.getClass();
        b = new xi1(classLoader);
    }

    public abstract kr1 a(jb1 jb1Var);

    public abstract void b(jb1 jb1Var, jb1 jb1Var2);

    public abstract void e(jb1 jb1Var);

    public abstract void i(jb1 jb1Var);

    public final boolean j(jb1 jb1Var) {
        jb1Var.getClass();
        return n(jb1Var) != null;
    }

    public abstract List l(jb1 jb1Var);

    public final x00 m(jb1 jb1Var) throws FileNotFoundException {
        jb1Var.getClass();
        x00 x00VarN = n(jb1Var);
        if (x00VarN != null) {
            return x00VarN;
        }
        ur.b(jb1Var, "no such file: ");
        return null;
    }

    public abstract x00 n(jb1 jb1Var);

    public abstract fu0 p(jb1 jb1Var);

    public abstract kr1 q(jb1 jb1Var);

    public abstract ds1 s(jb1 jb1Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
