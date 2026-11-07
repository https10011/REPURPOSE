package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class je1 {
    public final Class a;
    public final Class b;

    public je1(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static je1 a(Class cls) {
        return new je1(ie1.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || je1.class != obj.getClass()) {
            return false;
        }
        je1 je1Var = (je1) obj;
        if (this.b.equals(je1Var.b)) {
            return this.a.equals(je1Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == ie1.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
