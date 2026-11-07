package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eu2 implements Comparator {
    public final /* synthetic */ dq2 a;
    public final /* synthetic */ ep1 b;

    public eu2(dq2 dq2Var, ep1 ep1Var) {
        this.a = dq2Var;
        this.b = ep1Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        qt2 qt2Var = (qt2) obj;
        qt2 qt2Var2 = (qt2) obj2;
        if (qt2Var instanceof xt2) {
            return !(qt2Var2 instanceof xt2) ? 1 : 0;
        }
        if (qt2Var2 instanceof xt2) {
            return -1;
        }
        dq2 dq2Var = this.a;
        return dq2Var == null ? qt2Var.zzc().compareTo(qt2Var2.zzc()) : (int) gu2.i0(dq2Var.g(this.b, Arrays.asList(qt2Var, qt2Var2)).zzd().doubleValue());
    }
}
