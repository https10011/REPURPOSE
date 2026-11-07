package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class m83 implements ph1, hr3 {
    public Object a;

    public /* synthetic */ m83(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.hr3
    public Iterator a(ox1 ox1Var, CharSequence charSequence) {
        return new so3(ox1Var, charSequence, (p33) this.a, 1);
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        a93 a93Var = (a93) ((b93) obj).l();
        a83 a83Var = new a83((u83) this.a, (TaskCompletionSource) obj2);
        Parcel parcelF = a93Var.F();
        fv2.c(parcelF, a83Var);
        a93Var.G(parcelF, 27);
    }
}
