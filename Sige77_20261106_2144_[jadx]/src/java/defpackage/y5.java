package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y5 extends x91 {
    @Override // defpackage.x91
    public final void j(yo yoVar, Set set) {
        synchronized (yoVar) {
            try {
                if (yoVar.v == null) {
                    yoVar.v = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.x91
    public final int o(yo yoVar) {
        int i;
        synchronized (yoVar) {
            i = yoVar.w - 1;
            yoVar.w = i;
        }
        return i;
    }
}
