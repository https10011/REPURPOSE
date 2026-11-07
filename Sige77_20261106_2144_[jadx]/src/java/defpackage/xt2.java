package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xt2 implements qt2 {
    @Override // defpackage.qt2
    public final qt2 c(String str, ep1 ep1Var, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof xt2;
    }

    @Override // defpackage.qt2
    public final qt2 f() {
        return qt2.O;
    }

    @Override // defpackage.qt2
    public final String zzc() {
        return "undefined";
    }

    @Override // defpackage.qt2
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.qt2
    public final Boolean zze() {
        return Boolean.FALSE;
    }

    @Override // defpackage.qt2
    public final Iterator zzf() {
        return null;
    }
}
