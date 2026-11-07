package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fc implements sd1 {
    public final int b;

    public fc(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return sd1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd1)) {
            return false;
        }
        sd1 sd1Var = (sd1) obj;
        return this.b == sd1Var.tag() && rd1.a.equals(sd1Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (rd1.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.sd1
    public final rd1 intEncoding() {
        return rd1.a;
    }

    @Override // defpackage.sd1
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + rd1.a + ')';
    }
}
