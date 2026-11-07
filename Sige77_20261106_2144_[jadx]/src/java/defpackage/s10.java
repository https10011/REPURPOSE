package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class s10 extends z00 {
    public int m;

    public s10(l82 l82Var) {
        super(l82Var);
        if (l82Var instanceof gm0) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.z00
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            v00 v00Var = (v00) obj;
            v00Var.a(v00Var);
        }
    }
}
