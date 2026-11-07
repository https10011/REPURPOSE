package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nz2 implements v71, ph1 {
    public static final nz2 c;
    public static final nz2 d;
    public static final nz2 e;
    public static final nz2 f;
    public static final nz2 i;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i2 = 0;
        c = new nz2("TINK", i2);
        d = new nz2("CRUNCHY", i2);
        e = new nz2("NO_PREFIX", i2);
        int i3 = 1;
        f = new nz2("TINK", i3);
        i = new nz2("NO_PREFIX", i3);
    }

    public /* synthetic */ nz2(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        int i2 = u83.l;
        a83 a83Var = new a83((TaskCompletionSource) obj2);
        a93 a93Var = (a93) ((b93) obj).l();
        Parcel parcelF = a93Var.F();
        fv2.c(parcelF, a83Var);
        parcelF.writeString(this.b);
        a93Var.G(parcelF, 5);
    }

    @Override // defpackage.v71
    public Object e() {
        throw new wt0(this.b, 4);
    }

    public String toString() {
        int i2 = this.a;
        String str = this.b;
        switch (i2) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }
}
