package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ev1 implements cv1 {
    public volatile cv1 a;
    public volatile boolean b;
    public Object c;

    @Override // defpackage.cv1
    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        cv1 cv1Var = this.a;
                        Objects.requireNonNull(cv1Var);
                        Object obj = cv1Var.get();
                        this.c = obj;
                        this.b = true;
                        this.a = null;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object string = this.a;
        if (string == null) {
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
