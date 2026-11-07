package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.a;
import androidx.fragment.app.Fragment;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcd1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "line-sdk_release"}, k = 1, mv = {1, oc1.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
public final class cd1 extends Fragment {
    public dd1 K0;
    public r91 L0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        int i = 1;
        ((Fragment) this).r0 = true;
        this.L0 = (r91) new p11(I()).c(r91.class);
        dd1 dd1Var = this.K0;
        r91 r91Var = null;
        if (dd1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dd1Var = null;
        }
        r91 r91Var2 = this.L0;
        if (r91Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var2 = null;
        }
        dd1Var.X(r91Var2);
        rc2 rc2Var = ((CreateOpenChatActivity) I()).n0;
        if (rc2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rc2Var = null;
        }
        Toolbar toolbar = (Toolbar) rc2Var.c;
        toolbar.setTitle(m(2131886347));
        toolbar.getMenu().clear();
        toolbar.m(2131623937);
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(2131296596);
        menuItemFindItem.setOnMenuItemClickListener(new k91(i, this));
        r91 r91Var3 = this.L0;
        if (r91Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var3 = null;
        }
        r91Var3.p.e(this, new l91(1, menuItemFindItem));
        dd1 dd1Var2 = this.K0;
        if (dd1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dd1Var2 = null;
        }
        EditText editText = dd1Var2.k0;
        editText.getClass();
        editText.addTextChangedListener(new nv0(new ux(this, 3), 0));
        dd1 dd1Var3 = this.K0;
        if (dd1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dd1Var3 = null;
        }
        TextView textView = dd1Var3.l0;
        Resources resourcesL = l();
        r91 r91Var4 = this.L0;
        if (r91Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            r91Var = r91Var4;
        }
        textView.setText(resourcesL.getString(2131886344, r91Var.f.d()));
    }

    public final void v(Bundle bundle) {
        super.v(bundle);
        if (!((Fragment) this).p0) {
            ((Fragment) this).p0 = true;
            if (!p() || q()) {
                return;
            }
            ((Fragment) this).f0.b0.invalidateMenu();
        }
    }

    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i = dd1.n0;
        ew ewVar = fw.a;
        dd1 dd1Var = (dd1) a.Q(2131492997, layoutInflater, viewGroup);
        dd1Var.getClass();
        this.K0 = dd1Var;
        dd1Var.V(this);
        dd1 dd1Var2 = this.K0;
        if (dd1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dd1Var2 = null;
        }
        return ((a) dd1Var2).Y;
    }
}
