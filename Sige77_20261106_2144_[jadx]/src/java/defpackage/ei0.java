package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ei0 {
    public final List a;

    public ei0(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            e.g("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List<gi0> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (gi0 gi0Var : list2) {
                }
            }
            for (gi0 gi0Var2 : this.a) {
            }
        }
    }
}
