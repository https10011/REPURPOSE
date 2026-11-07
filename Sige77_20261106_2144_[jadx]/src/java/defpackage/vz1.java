package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class vz1 implements Cloneable {
    public qz1 a = d71.b;

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final vz1 clone() {
        try {
            return (vz1) super.clone();
        } catch (CloneNotSupportedException e) {
            sm0.n(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof vz1) {
            return this.a.equals(((vz1) obj).a);
        }
        return false;
    }
}
