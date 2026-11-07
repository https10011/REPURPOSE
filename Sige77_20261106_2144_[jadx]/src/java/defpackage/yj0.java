package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yj0 {
    public final HashSet a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final Account f;
    public final String g;
    public final HashMap h;
    public String i;

    public yj0(GoogleSignInOptions googleSignInOptions) {
        this.a = new HashSet();
        this.h = new HashMap();
        gu2.o(googleSignInOptions);
        this.a = new HashSet(googleSignInOptions.b);
        this.b = googleSignInOptions.e;
        this.c = googleSignInOptions.f;
        this.d = googleSignInOptions.d;
        this.e = googleSignInOptions.i;
        this.f = googleSignInOptions.c;
        this.g = googleSignInOptions.v;
        this.h = GoogleSignInOptions.S(googleSignInOptions.w);
        this.i = googleSignInOptions.W;
    }

    public yj0() {
        this.a = new HashSet();
        this.h = new HashMap();
    }
}
