package defpackage;

import android.content.SharedPreferences;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b;
import com.hjq.toast.BuildConfig;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class k91 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ k91(int i, Fragment fragment) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                m91 m91Var = (m91) fragment;
                menuItem.getClass();
                if (menuItem.getItemId() != 2131296597) {
                    return false;
                }
                ((CreateOpenChatActivity) m91Var.I()).g(2, true);
                return true;
            default:
                cd1 cd1Var = (cd1) fragment;
                menuItem.getClass();
                if (menuItem.getItemId() != 2131296596) {
                    return false;
                }
                View currentFocus = cd1Var.I().getCurrentFocus();
                if (currentFocus != null) {
                    Object systemService = cd1Var.I().getSystemService("input_method");
                    systemService.getClass();
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
                r91 r91Var = cd1Var.L0;
                if (r91Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    r91Var = null;
                }
                SharedPreferences.Editor editorEdit = r91Var.d.edit();
                editorEdit.getClass();
                b bVar = r91Var.g;
                editorEdit.putString("key_profile_name", (String) bVar.d());
                editorEdit.apply();
                String str = (String) r91Var.f.d();
                String str2 = BuildConfig.FLAVOR;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                String str3 = (String) r91Var.h.d();
                if (str3 == null) {
                    str3 = BuildConfig.FLAVOR;
                }
                String str4 = (String) bVar.d();
                if (str4 != null) {
                    str2 = str4;
                }
                h91 h91Var = (h91) r91Var.i.d();
                if (h91Var == null) {
                    h91Var = h91.NotSelected;
                }
                Boolean bool = (Boolean) r91Var.j.d();
                if (bool == null) {
                    bool = Boolean.TRUE;
                }
                boolean zBooleanValue = bool.booleanValue();
                nx0 nx0Var = new nx0();
                nx0Var.a = str;
                nx0Var.c = str3;
                nx0Var.d = str2;
                nx0Var.e = h91Var;
                nx0Var.b = zBooleanValue;
                if (str.length() <= 0 || str.length() > 50) {
                    e.g("String size needs to be less or equal to 50");
                    throw null;
                }
                if (str3.length() > 200) {
                    e.g("String size needs to be less or equal to 200");
                    throw null;
                }
                if (str2.length() <= 0 || str2.length() > 50) {
                    e.g("String size needs to be less or equal to 50");
                    throw null;
                }
                qt.o(ia.g(r91Var), new pw(r91Var, nx0Var, null, 6));
                return true;
        }
    }
}
