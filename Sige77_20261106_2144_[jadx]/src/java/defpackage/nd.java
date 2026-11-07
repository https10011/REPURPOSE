package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nd {
    public final p41 a;
    public final be b;

    public nd(p41 p41Var, be beVar) {
        this.a = p41Var;
        this.b = beVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nd) {
            nd ndVar = (nd) obj;
            if (this.a != ndVar.a) {
                return false;
            }
            Object obj2 = uc1.a;
            if (obj2.equals(obj2) && this.b.equals(ndVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ uc1.a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + uc1.a + ", productData=" + this.b + "}";
    }
}
