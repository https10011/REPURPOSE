package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rr3 extends ThreadLocal {
    public final /* synthetic */ qr3 a;

    public rr3(qr3 qr3Var) {
        this.a = qr3Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        qr3 qr3Var = this.a;
        try {
            cr3 cr3Var = cr3.c;
            Mac mac = (Mac) cr3Var.a.zza((String) qr3Var.c);
            mac.init((SecretKeySpec) qr3Var.d);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
