package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class kb3 implements bc {
    public static final /* synthetic */ kb3 b = new kb3(0);
    public static final /* synthetic */ kb3 c = new kb3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ kb3(int i) {
        this.a = i;
    }

    @Override // defpackage.bc
    public final /* synthetic */ ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                i7 i7Var = (i7) obj;
                throw new jb3(i7Var.getStatusCode(), i7Var.getMessage(), i7Var);
            case 1:
                throw null;
            default:
                return dh0.d(BuildConfig.FLAVOR);
        }
    }
}
