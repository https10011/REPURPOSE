package defpackage;

import android.app.Dialog;
import androidx.fragment.app.c;
import com.facebook.login.DeviceAuthDialog;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d10 extends Dialog {
    public final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public d10(mz0 mz0Var, yg ygVar) {
        super(ygVar, 2131952873);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        switch (this.a) {
            case 1:
                break;
            default:
                super.onBackPressed();
                break;
        }
    }

    public d10(DeviceAuthDialog deviceAuthDialog, c cVar) {
        super(cVar, 2131952868);
    }

    private final void a() {
    }
}
