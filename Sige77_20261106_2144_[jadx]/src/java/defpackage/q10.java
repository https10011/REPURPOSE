package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class q10 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler K0;
    public boolean T0;
    public Dialog V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public final i4 L0 = new i4(this, 5);
    public final m10 M0 = new m10(this);
    public final n10 N0 = new n10(this);
    public int O0 = 0;
    public int P0 = 0;
    public boolean Q0 = true;
    public boolean R0 = true;
    public int S0 = -1;
    public final o10 U0 = new o10(this);
    public boolean Z0 = false;

    public final LayoutInflater A(Bundle bundle) {
        LayoutInflater layoutInflaterA = super.A(bundle);
        boolean z = this.R0;
        if (z && !this.T0) {
            if (z && !this.Z0) {
                try {
                    this.T0 = true;
                    Dialog dialogQ = Q(bundle);
                    this.V0 = dialogQ;
                    if (this.R0) {
                        int i = this.O0;
                        if (i == 1 || i == 2) {
                            dialogQ.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogQ.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogQ.requestWindowFeature(1);
                        }
                        Context contextI = i();
                        if (contextI != null) {
                            this.V0.setOwnerActivity((Activity) contextI);
                        }
                        this.V0.setCancelable(this.Q0);
                        this.V0.setOnCancelListener(this.M0);
                        this.V0.setOnDismissListener(this.N0);
                        this.Z0 = true;
                    } else {
                        this.V0 = null;
                    }
                    this.T0 = false;
                } catch (Throwable th) {
                    this.T0 = false;
                    throw th;
                }
            }
            if (e.H(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.V0;
            if (dialog != null) {
                return layoutInflaterA.cloneInContext(dialog.getContext());
            }
        } else if (e.H(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.R0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterA;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterA;
    }

    public void D(Bundle bundle) {
        Dialog dialog = this.V0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.O0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.P0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.Q0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.R0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.S0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void E() {
        ((Fragment) this).r0 = true;
        Dialog dialog = this.V0;
        if (dialog != null) {
            this.W0 = false;
            dialog.show();
            View decorView = this.V0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(2131296853, this);
            decorView.setTag(2131296856, this);
            decorView.setTag(2131296855, this);
        }
    }

    public void F() {
        ((Fragment) this).r0 = true;
        Dialog dialog = this.V0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void G(Bundle bundle) {
        Bundle bundle2;
        ((Fragment) this).r0 = true;
        if (this.V0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.V0.onRestoreInstanceState(bundle2);
    }

    public final void H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.H(layoutInflater, viewGroup, bundle);
        if (((Fragment) this).t0 != null || this.V0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.V0.onRestoreInstanceState(bundle2);
    }

    public final void P(boolean z, boolean z2) {
        if (this.X0) {
            return;
        }
        this.X0 = true;
        this.Y0 = false;
        Dialog dialog = this.V0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.V0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.K0.getLooper()) {
                    onDismiss(this.V0);
                } else {
                    this.K0.post(this.L0);
                }
            }
        }
        this.W0 = true;
        if (this.S0 >= 0) {
            e eVarK = k();
            int i = this.S0;
            if (i < 0) {
                e.g(ck1.r(i, "Bad id: "));
                return;
            } else {
                eVarK.w(new hg0(eVarK, i), z);
                this.S0 = -1;
                return;
            }
        }
        pe peVar = new pe(k());
        peVar.p = true;
        e eVar = ((Fragment) this).e0;
        if (eVar != null && eVar != peVar.q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        peVar.b(new qg0(3, this));
        if (z) {
            peVar.d(true);
        } else {
            peVar.d(false);
        }
    }

    public Dialog Q(Bundle bundle) {
        if (e.H(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new lq(J(), this.P0);
    }

    public void R(e eVar, String str) {
        this.X0 = false;
        this.Y0 = true;
        eVar.getClass();
        pe peVar = new pe(eVar);
        peVar.p = true;
        peVar.e(0, this, str, 1);
        peVar.d(false);
    }

    public final gb2 d() {
        return new p10(this, new rf0(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.W0) {
            return;
        }
        if (e.H(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        P(true, true);
    }

    public final void s() {
        ((Fragment) this).r0 = true;
    }

    public final void u(Context context) {
        super.u(context);
        ((Fragment) this).D0.f(this.U0);
        if (this.Y0) {
            return;
        }
        this.X0 = false;
    }

    public void v(Bundle bundle) {
        super.v(bundle);
        this.K0 = new Handler();
        this.R0 = ((Fragment) this).j0 == 0;
        if (bundle != null) {
            this.O0 = bundle.getInt("android:style", 0);
            this.P0 = bundle.getInt("android:theme", 0);
            this.Q0 = bundle.getBoolean("android:cancelable", true);
            this.R0 = bundle.getBoolean("android:showsDialog", this.R0);
            this.S0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void y() {
        ((Fragment) this).r0 = true;
        Dialog dialog = this.V0;
        if (dialog != null) {
            this.W0 = true;
            dialog.setOnDismissListener(null);
            this.V0.dismiss();
            if (!this.X0) {
                onDismiss(this.V0);
            }
            this.V0 = null;
            this.Z0 = false;
        }
    }

    public final void z() {
        ((Fragment) this).r0 = true;
        if (!this.Y0 && !this.X0) {
            this.X0 = true;
        }
        ((Fragment) this).D0.i(this.U0);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
