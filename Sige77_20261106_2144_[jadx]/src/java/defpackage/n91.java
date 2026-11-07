package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class n91 extends a {
    public static final /* synthetic */ int s0 = 0;
    public final TextView k0;
    public final EditText l0;
    public final TextView m0;
    public final EditText n0;
    public final TextView o0;
    public final CheckBox p0;
    public final ConstraintLayout q0;
    public r91 r0;

    public n91(Object obj, View view, TextView textView, EditText editText, TextView textView2, EditText editText2, TextView textView3, CheckBox checkBox, ConstraintLayout constraintLayout) {
        super(obj, view, 3);
        this.k0 = textView;
        this.l0 = editText;
        this.m0 = textView2;
        this.n0 = editText2;
        this.o0 = textView3;
        this.p0 = checkBox;
        this.q0 = constraintLayout;
    }

    public abstract void X(r91 r91Var);
}
