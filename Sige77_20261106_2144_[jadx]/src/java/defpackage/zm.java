package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.facebook.login.DeviceAuthDialog;
import com.linecorp.linesdk.widget.LoginButton;
import prod.apptest.com.activity.OpenWebActivity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class zm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dn dnVar = (dn) obj;
                EditText editText = dnVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dnVar.p();
                    break;
                }
                break;
            case 1:
                ((DeviceAuthDialog) obj).U();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((v30) obj).t();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((LoginButton) obj).lambda$new$0(view);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                int i2 = OpenWebActivity.U0;
                ((OpenWebActivity) obj).finish();
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                hb1 hb1Var = (hb1) obj;
                EditText editText2 = hb1Var.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = hb1Var.f;
                    boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                    EditText editText4 = hb1Var.f;
                    if (z) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        hb1Var.f.setSelection(selectionEnd);
                    }
                    hb1Var.p();
                    break;
                }
                break;
            default:
                ((d82) obj).cancel();
                break;
        }
    }
}
