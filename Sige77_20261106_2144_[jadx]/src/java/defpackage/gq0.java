package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gq0 extends InputConnectionWrapper {
    public final /* synthetic */ ab a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(InputConnection inputConnection, ab abVar) {
        super(inputConnection, false);
        this.a = abVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        pv2 pv2Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            pv2Var = new pv2(new iq0(inputContentInfo));
        }
        if (this.a.g(pv2Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
