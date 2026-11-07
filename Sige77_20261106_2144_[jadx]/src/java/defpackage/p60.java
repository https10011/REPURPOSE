package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p60 {
    public final /* synthetic */ q60 a;

    public p60(q60 q60Var) {
        this.a = q60Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        q60 q60Var = this.a;
        o60 o60Var = q60Var.l0;
        if (q60Var.i0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = q60Var.i0;
        if (editText != null) {
            editText.removeTextChangedListener(o60Var);
            if (q60Var.i0.getOnFocusChangeListener() == q60Var.b().e()) {
                q60Var.i0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        q60Var.i0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(o60Var);
        }
        q60Var.b().l(q60Var.i0);
        q60Var.j(q60Var.b());
    }
}
