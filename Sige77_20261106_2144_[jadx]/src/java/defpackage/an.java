package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class an implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ an(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dn dnVar = (dn) obj;
                dnVar.s(dnVar.t());
                break;
            case 1:
                for (EditText editText : (EditText[]) obj) {
                    if (editText.hasFocus()) {
                    }
                    break;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                break;
            default:
                v30 v30Var = (v30) obj;
                v30Var.l = z;
                v30Var.p();
                if (!z) {
                    v30Var.s(false);
                    v30Var.m = false;
                }
                break;
        }
    }
}
