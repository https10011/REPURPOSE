package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ev extends r60 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev(q60 q60Var, int i) {
        super(q60Var);
        this.e = i;
    }

    @Override // defpackage.r60
    public void q() {
        switch (this.e) {
            case 0:
                q60 q60Var = this.b;
                q60Var.e0 = null;
                CheckableImageButton checkableImageButton = q60Var.i;
                checkableImageButton.setOnLongClickListener(null);
                ia.n(checkableImageButton, null);
                break;
        }
    }
}
