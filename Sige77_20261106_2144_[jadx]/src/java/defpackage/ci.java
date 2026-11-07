package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.firebase.auth.zzc;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ci implements a41 {
    public static ci c;
    public boolean a;
    public Object b;

    public /* synthetic */ ci(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public static zzc d(Intent intent) {
        Parcelable.Creator creator = zzaij.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        zzaij zzaijVar = (zzaij) (byteArrayExtra == null ? null : sp0.f(byteArrayExtra, creator));
        zzaijVar.w = true;
        return zzc.T(zzaijVar);
    }

    public static void e(Context context) {
        ci ciVar = c;
        ciVar.a = false;
        if (((wu2) ciVar.b) != null) {
            co.x(context).J((wu2) c.b);
        }
        c.b = null;
    }

    public boolean a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean b(CharSequence charSequence, int i) {
        char c2 = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            sm0.a();
            return false;
        }
        if (((vi) this.b) == null) {
            return a();
        }
        c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            ci ciVar = ww1.a;
            if (directionality == 0) {
                c2 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c2 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c2 = 2;
                        continue;
                }
            }
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return a();
        }
        return false;
    }

    public synchronized void c(pi1 pi1Var, boolean z) {
        try {
            if (this.a || z) {
                ((Handler) this.b).obtainMessage(1, pi1Var).sendToTarget();
            } else {
                this.a = true;
                pi1Var.e();
                this.a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.a41
    public void f(i31 i31Var, boolean z) {
        z3 z3Var;
        ny1 ny1Var = (ny1) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        ActionMenuView actionMenuView = ny1Var.a.a.a;
        if (actionMenuView != null && (z3Var = actionMenuView.j0) != null) {
            z3Var.c();
            w3 w3Var = z3Var.g0;
            if (w3Var != null && w3Var.b()) {
                w3Var.i.dismiss();
            }
        }
        ny1Var.b.onPanelClosed(108, i31Var);
        this.a = false;
    }

    @Override // defpackage.a41
    public boolean y(i31 i31Var) {
        ((ny1) this.b).b.onMenuOpened(108, i31Var);
        return true;
    }

    public /* synthetic */ ci(Object obj) {
        this.b = obj;
    }

    public ci(vi viVar, boolean z) {
        this(viVar);
        this.a = z;
    }
}
