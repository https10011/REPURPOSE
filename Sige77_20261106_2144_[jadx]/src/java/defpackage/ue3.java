package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ue3 {
    public static final ue3 b = new ue3();
    public final AtomicReference a = new AtomicReference(new sf3(new vf3(12)));

    public final synchronized void a(ky2 ky2Var) {
        Object obj;
        vf3 vf3Var = new vf3((sf3) this.a.get());
        HashMap map = (HashMap) vf3Var.c;
        switch (ky2Var.a) {
            case 0:
                obj = cv2.class;
                break;
            case 1:
                obj = oq3.class;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                obj = mv2.class;
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                obj = lv2.class;
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                obj = qg3.class;
                break;
            default:
                obj = qr3.class;
                break;
        }
        if (map.containsKey(obj)) {
            ky2 ky2Var2 = (ky2) map.get(obj);
            if (!ky2Var2.equals(ky2Var) || !ky2Var.equals(ky2Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(obj)));
            }
        } else {
            map.put(obj, ky2Var);
        }
        this.a.set(new sf3(vf3Var));
    }

    public final synchronized void b(nf3 nf3Var) {
        vf3 vf3Var = new vf3((sf3) this.a.get());
        vf3Var.e(nf3Var);
        this.a.set(new sf3(vf3Var));
    }
}
