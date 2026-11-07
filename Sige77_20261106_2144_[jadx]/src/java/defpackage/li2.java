package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class li2 extends nj0 {
    public final GoogleSignInOptions A;

    public li2(Context context, Looper looper, uy1 uy1Var, GoogleSignInOptions googleSignInOptions, rg2 rg2Var, rg2 rg2Var2) {
        super(context, looper, 91, uy1Var, rg2Var, rg2Var2, 0);
        Set set = (Set) uy1Var.b;
        yj0 yj0Var = googleSignInOptions != null ? new yj0(googleSignInOptions) : new yj0();
        yj0Var.i = ai2.a();
        boolean zIsEmpty = set.isEmpty();
        HashSet hashSet = yj0Var.a;
        if (!zIsEmpty) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add((Scope) it.next());
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        if (hashSet.contains(GoogleSignInOptions.b0)) {
            Scope scope = GoogleSignInOptions.a0;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (yj0Var.d && (yj0Var.f == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.Z);
        }
        this.A = new GoogleSignInOptions(3, new ArrayList(hashSet), yj0Var.f, yj0Var.d, yj0Var.b, yj0Var.c, yj0Var.e, yj0Var.g, yj0Var.h, yj0Var.i);
    }

    @Override // defpackage.jf
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof si2 ? (si2) iInterfaceQueryLocalInterface : new si2(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 2);
    }

    @Override // defpackage.jf
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
