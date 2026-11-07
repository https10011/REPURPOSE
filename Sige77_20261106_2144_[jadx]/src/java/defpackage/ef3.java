package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ef3 {
    public final if3 a;
    public int b = 1;
    public long c = a();

    public ef3(if3 if3Var) {
        this.a = if3Var;
    }

    public final long a() {
        if3 if3Var = this.a;
        gu2.o(if3Var);
        long jLongValue = ((Long) h13.v.a(null)).longValue();
        long jLongValue2 = ((Long) h13.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        if3Var.g().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
