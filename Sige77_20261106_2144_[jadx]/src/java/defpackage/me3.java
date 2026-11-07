package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class me3 implements bc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ me3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bc
    public final ListenableFuture apply(Object obj) throws IOException {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hf3 hf3Var = (hf3) obj2;
                int i2 = ((jb3) obj).a;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !hf3Var.h.m()) {
                    hf3Var.b();
                }
                return un0.b;
            case 1:
                u23 u23Var = (u23) obj2;
                u23Var.getClass();
                b63 b63Var = new b63(u23Var, (ug3) obj);
                q51 q51VarA = ((y93) u23Var.b).a();
                h02 h02Var = new h02(b63Var);
                q51VarA.execute(h02Var);
                return h02Var;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return dh0.e((ListenableFuture) ((ch3) obj2).e.get());
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return dh0.d(((ve3) obj2).apply(obj));
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return ((tj3) obj2).e.n();
            default:
                IOException iOException = (IOException) obj2;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
