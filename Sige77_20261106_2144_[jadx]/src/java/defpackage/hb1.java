package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hb1 extends r60 {
    public final int e;
    public EditText f;
    public final zm g;

    public hb1(q60 q60Var, int i) {
        super(q60Var);
        this.e = 2131230901;
        this.g = new zm(this, 5);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.r60
    public final void b() {
        p();
    }

    @Override // defpackage.r60
    public final int c() {
        return 2131886357;
    }

    @Override // defpackage.r60
    public final int d() {
        return this.e;
    }

    @Override // defpackage.r60
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.r60
    public final boolean j() {
        return true;
    }

    @Override // defpackage.r60
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.r60
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.r60
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.r60
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
