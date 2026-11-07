package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s90 extends h1 {
    public final a c = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // defpackage.h1
    public final Random d() {
        Object obj = this.c.get();
        obj.getClass();
        return (Random) obj;
    }
}
