package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.datepicker.l;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.a;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((e4) obj).a();
                break;
            case 1:
                e6 e6Var = (e6) obj;
                if (view == e6Var.g && (message3 = e6Var.i) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == e6Var.j && (message2 = e6Var.l) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == e6Var.m && (message = e6Var.o) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                e6Var.D.obtainMessage(1, e6Var.b).sendToTarget();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                l lVar = (l) obj;
                int i2 = lVar.Q0;
                if (i2 == 2) {
                    lVar.R(1);
                    lVar.T0.announceForAccessibility(lVar.m(2131886326));
                } else if (i2 == 1) {
                    lVar.R(2);
                    lVar.S0.announceForAccessibility(lVar.m(2131886327));
                }
                break;
            default:
                ky1 ky1Var = ((Toolbar) obj).C0;
                o31 o31Var = ky1Var != null ? ky1Var.b : null;
                if (o31Var != null) {
                    o31Var.collapseActionView();
                }
                break;
        }
    }
}
