package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.google.android.material.chip.Chip;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm91;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "line-sdk_release"}, k = 1, mv = {1, oc1.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
public final class m91 extends Fragment {
    public n91 K0;
    public r91 L0;

    public final String P(int i, String str) {
        int integer = I().getResources().getInteger(i);
        StringBuilder sb = new StringBuilder();
        sb.append(str.length());
        sb.append('/');
        sb.append(integer);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        final int i = 1;
        ((Fragment) this).r0 = true;
        this.L0 = (r91) new p11(I()).c(r91.class);
        n91 n91Var = this.K0;
        n91 n91Var2 = null;
        if (n91Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n91Var = null;
        }
        r91 r91Var = this.L0;
        if (r91Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var = null;
        }
        n91Var.X(r91Var);
        r91 r91Var2 = this.L0;
        if (r91Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var2 = null;
        }
        final int i2 = 0;
        r91Var2.f.e(this, new g81(this) { // from class: i91
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // defpackage.g81
            public final void a(Object obj) {
                int i3 = i2;
                n91 n91Var3 = null;
                m91 m91Var = this.b;
                switch (i3) {
                    case 0:
                        String str = (String) obj;
                        n91 n91Var4 = m91Var.K0;
                        if (n91Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            n91Var3 = n91Var4;
                        }
                        TextView textView = n91Var3.o0;
                        str.getClass();
                        textView.setText(m91Var.P(2131361842, str));
                        break;
                    case 1:
                        String str2 = (String) obj;
                        n91 n91Var5 = m91Var.K0;
                        if (n91Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            n91Var3 = n91Var5;
                        }
                        TextView textView2 = n91Var3.m0;
                        str2.getClass();
                        textView2.setText(m91Var.P(2131361841, str2));
                        break;
                    default:
                        h91 h91Var = (h91) obj;
                        if (h91Var != null) {
                            int i4 = h91Var.b;
                            n91 n91Var6 = m91Var.K0;
                            if (n91Var6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                n91Var3 = n91Var6;
                            }
                            n91Var3.k0.setText(m91Var.l().getString(i4));
                        }
                        break;
                }
            }
        });
        r91 r91Var3 = this.L0;
        if (r91Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var3 = null;
        }
        r91Var3.h.e(this, new g81(this) { // from class: i91
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // defpackage.g81
            public final void a(Object obj) {
                int i3 = i;
                n91 n91Var3 = null;
                m91 m91Var = this.b;
                switch (i3) {
                    case 0:
                        String str = (String) obj;
                        n91 n91Var4 = m91Var.K0;
                        if (n91Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            n91Var3 = n91Var4;
                        }
                        TextView textView = n91Var3.o0;
                        str.getClass();
                        textView.setText(m91Var.P(2131361842, str));
                        break;
                    case 1:
                        String str2 = (String) obj;
                        n91 n91Var5 = m91Var.K0;
                        if (n91Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            n91Var3 = n91Var5;
                        }
                        TextView textView2 = n91Var3.m0;
                        str2.getClass();
                        textView2.setText(m91Var.P(2131361841, str2));
                        break;
                    default:
                        h91 h91Var = (h91) obj;
                        if (h91Var != null) {
                            int i4 = h91Var.b;
                            n91 n91Var6 = m91Var.K0;
                            if (n91Var6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                n91Var3 = n91Var6;
                            }
                            n91Var3.k0.setText(m91Var.l().getString(i4));
                        }
                        break;
                }
            }
        });
        r91 r91Var4 = this.L0;
        if (r91Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var4 = null;
        }
        final int i3 = 2;
        r91Var4.i.e(this, new g81(this) { // from class: i91
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // defpackage.g81
            public final void a(Object obj) {
                int i4 = i3;
                n91 n91Var3 = null;
                m91 m91Var = this.b;
                switch (i4) {
                    case 0:
                        String str = (String) obj;
                        n91 n91Var4 = m91Var.K0;
                        if (n91Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            n91Var3 = n91Var4;
                        }
                        TextView textView = n91Var3.o0;
                        str.getClass();
                        textView.setText(m91Var.P(2131361842, str));
                        break;
                    case 1:
                        String str2 = (String) obj;
                        n91 n91Var5 = m91Var.K0;
                        if (n91Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            n91Var3 = n91Var5;
                        }
                        TextView textView2 = n91Var3.m0;
                        str2.getClass();
                        textView2.setText(m91Var.P(2131361841, str2));
                        break;
                    default:
                        h91 h91Var = (h91) obj;
                        if (h91Var != null) {
                            int i5 = h91Var.b;
                            n91 n91Var6 = m91Var.K0;
                            if (n91Var6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                n91Var3 = n91Var6;
                            }
                            n91Var3.k0.setText(m91Var.l().getString(i5));
                        }
                        break;
                }
            }
        });
        rc2 rc2Var = ((CreateOpenChatActivity) I()).n0;
        if (rc2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rc2Var = null;
        }
        Toolbar toolbar = (Toolbar) rc2Var.c;
        toolbar.setTitle(m(2131886355));
        toolbar.getMenu().clear();
        toolbar.m(2131623936);
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(2131296597);
        menuItemFindItem.setOnMenuItemClickListener(new k91(i2, this));
        r91 r91Var5 = this.L0;
        if (r91Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var5 = null;
        }
        r91Var5.o.e(this, new l91(0, menuItemFindItem));
        n91 n91Var3 = this.K0;
        if (n91Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n91Var3 = null;
        }
        EditText editText = n91Var3.n0;
        editText.getClass();
        r91 r91Var6 = this.L0;
        if (r91Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var6 = null;
        }
        editText.addTextChangedListener(new nv0(new at0(1, r91Var6.f, b.class, "setValue", "setValue(Ljava/lang/Object;)V", 0, 2), 0));
        n91 n91Var4 = this.K0;
        if (n91Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n91Var4 = null;
        }
        EditText editText2 = n91Var4.l0;
        editText2.getClass();
        r91 r91Var7 = this.L0;
        if (r91Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            r91Var7 = null;
        }
        editText2.addTextChangedListener(new nv0(new at0(1, r91Var7.h, b.class, "setValue", "setValue(Ljava/lang/Object;)V", 0, 1), 0));
        n91 n91Var5 = this.K0;
        if (n91Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n91Var5 = null;
        }
        n91Var5.k0.setOnClickListener(new View.OnClickListener(this) { // from class: j91
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                n91 n91Var6 = null;
                r91 r91Var8 = null;
                final m91 m91Var = this.b;
                switch (i4) {
                    case 0:
                        n91 n91Var7 = m91Var.K0;
                        if (n91Var7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            n91Var6 = n91Var7;
                        }
                        n91Var6.p0.toggle();
                        break;
                    default:
                        f6 f6Var = new f6(m91Var.J());
                        r91 r91Var9 = m91Var.L0;
                        if (r91Var9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            r91Var8 = r91Var9;
                        }
                        Context contextJ = m91Var.J();
                        r91Var8.getClass();
                        h91[] h91VarArrValues = h91.values();
                        ArrayList arrayList = new ArrayList(h91VarArrValues.length);
                        for (h91 h91Var : h91VarArrValues) {
                            arrayList.add(contextJ.getResources().getString(h91Var.b));
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        array.getClass();
                        final int i5 = 1;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c10
                            /* JADX WARN: Code duplicated, block: B:12:0x0028  */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i6) {
                                h91 h91Var2;
                                int i7 = i5;
                                DeviceAuthDialog deviceAuthDialog = m91Var;
                                switch (i7) {
                                    case 0:
                                        DeviceAuthDialog deviceAuthDialog2 = deviceAuthDialog;
                                        View viewT = deviceAuthDialog2.T(false);
                                        Dialog dialog = deviceAuthDialog2.V0;
                                        if (dialog != null) {
                                            dialog.setContentView(viewT);
                                        }
                                        LoginClient.Request request = deviceAuthDialog2.k1;
                                        if (request != null) {
                                            deviceAuthDialog2.a0(request);
                                        }
                                        break;
                                    default:
                                        m91 m91Var2 = (m91) deviceAuthDialog;
                                        r91 r91Var10 = m91Var2.L0;
                                        r91 r91Var11 = null;
                                        if (r91Var10 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                            r91Var10 = null;
                                        }
                                        r91Var10.getClass();
                                        h91[] h91VarArrValues2 = h91.values();
                                        if (i6 >= 0) {
                                            h91VarArrValues2.getClass();
                                            if (i6 <= h91VarArrValues2.length - 1) {
                                                h91Var2 = h91VarArrValues2[i6];
                                            } else {
                                                h91Var2 = h91.NotSelected;
                                            }
                                        } else {
                                            h91Var2 = h91.NotSelected;
                                        }
                                        r91 r91Var12 = m91Var2.L0;
                                        if (r91Var12 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                        } else {
                                            r91Var11 = r91Var12;
                                        }
                                        r91Var11.i.j(h91Var2);
                                        break;
                                }
                            }
                        };
                        b6 b6Var = (b6) f6Var.c;
                        b6Var.r = (String[]) array;
                        b6Var.t = onClickListener;
                        f6Var.a().show();
                        break;
                }
            }
        });
        n91 n91Var6 = this.K0;
        if (n91Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n91Var6 = null;
        }
        n91Var6.p0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lm
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i4 = i;
                Object obj = this;
                switch (i4) {
                    case 0:
                        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).w;
                        if (onCheckedChangeListener != null) {
                            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                        }
                        break;
                    default:
                        r91 r91Var8 = ((m91) obj).L0;
                        if (r91Var8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            r91Var8 = null;
                        }
                        r91Var8.j.j(Boolean.valueOf(z));
                        break;
                }
            }
        });
        n91 n91Var7 = this.K0;
        if (n91Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            n91Var2 = n91Var7;
        }
        n91Var2.q0.setOnClickListener(new View.OnClickListener(this) { // from class: j91
            public final /* synthetic */ m91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                n91 n91Var8 = null;
                r91 r91Var8 = null;
                final Fragment m91Var = this.b;
                switch (i4) {
                    case 0:
                        n91 n91Var9 = m91Var.K0;
                        if (n91Var9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            n91Var8 = n91Var9;
                        }
                        n91Var8.p0.toggle();
                        break;
                    default:
                        f6 f6Var = new f6(m91Var.J());
                        r91 r91Var9 = m91Var.L0;
                        if (r91Var9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            r91Var8 = r91Var9;
                        }
                        Context contextJ = m91Var.J();
                        r91Var8.getClass();
                        h91[] h91VarArrValues = h91.values();
                        ArrayList arrayList = new ArrayList(h91VarArrValues.length);
                        for (h91 h91Var : h91VarArrValues) {
                            arrayList.add(contextJ.getResources().getString(h91Var.b));
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        array.getClass();
                        final int i5 = 1;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c10
                            /* JADX WARN: Code duplicated, block: B:12:0x0028  */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i6) {
                                h91 h91Var2;
                                int i7 = i5;
                                DeviceAuthDialog deviceAuthDialog = m91Var;
                                switch (i7) {
                                    case 0:
                                        DeviceAuthDialog deviceAuthDialog2 = deviceAuthDialog;
                                        View viewT = deviceAuthDialog2.T(false);
                                        Dialog dialog = deviceAuthDialog2.V0;
                                        if (dialog != null) {
                                            dialog.setContentView(viewT);
                                        }
                                        LoginClient.Request request = deviceAuthDialog2.k1;
                                        if (request != null) {
                                            deviceAuthDialog2.a0(request);
                                        }
                                        break;
                                    default:
                                        m91 m91Var2 = (m91) deviceAuthDialog;
                                        r91 r91Var10 = m91Var2.L0;
                                        r91 r91Var11 = null;
                                        if (r91Var10 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                            r91Var10 = null;
                                        }
                                        r91Var10.getClass();
                                        h91[] h91VarArrValues2 = h91.values();
                                        if (i6 >= 0) {
                                            h91VarArrValues2.getClass();
                                            if (i6 <= h91VarArrValues2.length - 1) {
                                                h91Var2 = h91VarArrValues2[i6];
                                            } else {
                                                h91Var2 = h91.NotSelected;
                                            }
                                        } else {
                                            h91Var2 = h91.NotSelected;
                                        }
                                        r91 r91Var12 = m91Var2.L0;
                                        if (r91Var12 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                        } else {
                                            r91Var11 = r91Var12;
                                        }
                                        r91Var11.i.j(h91Var2);
                                        break;
                                }
                            }
                        };
                        b6 b6Var = (b6) f6Var.c;
                        b6Var.r = (String[]) array;
                        b6Var.t = onClickListener;
                        f6Var.a().show();
                        break;
                }
            }
        });
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
        int i = n91.s0;
        ew ewVar = fw.a;
        n91 n91Var = (n91) a.Q(2131492996, layoutInflater, viewGroup);
        n91Var.getClass();
        this.K0 = n91Var;
        n91Var.V(this);
        n91 n91Var2 = this.K0;
        if (n91Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n91Var2 = null;
        }
        return ((a) n91Var2).Y;
    }
}
