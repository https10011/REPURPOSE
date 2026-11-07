package defpackage;

import android.content.res.Configuration;
import androidx.fragment.app.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ag0 implements vr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ ag0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vr
    public final void accept(Object obj) {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                Configuration configuration = (Configuration) obj;
                if (eVar.J()) {
                    eVar.h(false, configuration);
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                if (eVar.J() && num.intValue() == 80) {
                    eVar.l(false);
                    break;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                x51 x51Var = (x51) obj;
                if (eVar.J()) {
                    boolean z = x51Var.a;
                    eVar.m(false);
                }
                break;
            default:
                qb1 qb1Var = (qb1) obj;
                if (eVar.J()) {
                    boolean z2 = qb1Var.a;
                    eVar.r(false);
                }
                break;
        }
    }
}
