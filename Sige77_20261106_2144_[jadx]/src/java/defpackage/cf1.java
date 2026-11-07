package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cf1 extends df1 implements Serializable {
    public cf1(DefaultConstructorMarker defaultConstructorMarker) {
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return bf1.a;
    }

    @Override // defpackage.df1
    public final int a(int i) {
        return df1.b.a(i);
    }

    @Override // defpackage.df1
    public final int b() {
        return df1.b.b();
    }

    @Override // defpackage.df1
    public final int c(int i, int i2) {
        return df1.b.c(i, i2);
    }
}
