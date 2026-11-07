package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gm2 {
    public static final h01 b = new h01("FirebaseAuth", "FirebaseAuthFallback:");
    public final ox1 a;

    public gm2(hc0 hc0Var) throws Throwable {
        gu2.o(hc0Var);
        hc0Var.a();
        gu2.o(hc0Var.a);
        jf2 jf2VarD = jf2.d();
        qq qqVar = new qq();
        qqVar.e = hc0Var;
        hc0Var.a();
        String str = hc0Var.c.a;
        qqVar.f = str;
        hc0Var.a();
        hc0Var.c.getClass();
        qqVar.d = jf2VarD;
        qqVar.c = null;
        qqVar.a = null;
        qqVar.b = null;
        String strX = y21.x("firebear.secureToken");
        if (TextUtils.isEmpty(strX)) {
            mb mbVar = co2.a;
            synchronized (mbVar) {
                if (mbVar.get(str) != null) {
                    throw new ClassCastException();
                }
            }
            strX = "https://".concat("securetoken.googleapis.com/v1");
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + strX);
        }
        if (((wm2) qqVar.c) == null) {
            qqVar.c = new wm2(strX, qqVar.k());
        }
        String strX2 = y21.x("firebear.identityToolkit");
        if (TextUtils.isEmpty(strX2)) {
            strX2 = co2.b(str);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + strX2);
        }
        if (((wm2) qqVar.a) == null) {
            qqVar.a = new wm2(strX2, qqVar.k());
        }
        String strX3 = y21.x("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strX3)) {
            mb mbVar2 = co2.a;
            synchronized (mbVar2) {
                if (mbVar2.get(str) != null) {
                    throw new ClassCastException();
                }
            }
            strX3 = "https://".concat("identitytoolkit.googleapis.com/v2");
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + strX3);
        }
        if (((wm2) qqVar.b) == null) {
            qqVar.b = new wm2(strX3, qqVar.k());
        }
        ((sl2) hc0Var.b(sl2.class)).getClass();
        mb mbVar3 = co2.b;
        synchronized (mbVar3) {
            try {
                if (mbVar3.containsKey(str)) {
                    ((List) mbVar3.get(str)).add(new WeakReference(qqVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(qqVar));
                    mbVar3.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = new ox1(qqVar);
        new HashMap();
    }

    public final void a(zzaij zzaijVar, em2 em2Var) {
        gu2.o(zzaijVar);
        gu2.o(em2Var);
        rd2 rd2Var = new rd2(em2Var, b);
        ox1 ox1Var = this.a;
        ox1Var.getClass();
        zzaijVar.b0 = true;
        qq qqVar = (qq) ox1Var.a;
        hd2 hd2Var = new hd2(ox1Var, rd2Var);
        qqVar.getClass();
        wm2 wm2Var = (wm2) qqVar.a;
        sp0.K(wm2Var.q("/verifyAssertion", (String) qqVar.f), zzaijVar, hd2Var, new mq2(), (ep1) wm2Var.b);
    }

    public final void b(mo2 mo2Var, em2 em2Var) {
        gu2.o(em2Var);
        gu2.o(mo2Var.c);
        EmailAuthCredential emailAuthCredential = mo2Var.c;
        String str = mo2Var.e;
        rd2 rd2Var = new rd2(em2Var, b);
        ox1 ox1Var = this.a;
        ox1Var.getClass();
        gu2.o(emailAuthCredential);
        if (!emailAuthCredential.e) {
            ox1Var.B(new mo2(emailAuthCredential, null, str), rd2Var);
            return;
        }
        String str2 = emailAuthCredential.d;
        ud2 ud2Var = new ud2();
        ud2Var.a = emailAuthCredential;
        ud2Var.b = str;
        ud2Var.c = rd2Var;
        Objects.requireNonNull(ox1Var);
        ud2Var.d = ox1Var;
        ox1Var.A(str2, ud2Var);
    }

    public final void c(ik3 ik3Var, em2 em2Var) {
        gu2.o(em2Var);
        gu2.o(ik3Var);
        tg2 tg2VarG = rq0.G((PhoneAuthCredential) ik3Var.a);
        rd2 rd2Var = new rd2(em2Var, b);
        ox1 ox1Var = this.a;
        ox1Var.getClass();
        qq qqVar = (qq) ox1Var.a;
        rc2 rc2Var = new rc2(ox1Var, rd2Var);
        wm2 wm2Var = (wm2) qqVar.a;
        sp0.K(wm2Var.q("/verifyPhoneNumber", (String) qqVar.f), tg2VarG, rc2Var, new tq2(), (ep1) wm2Var.b);
    }

    public final void d(String str, String str2, String str3, String str4, em2 em2Var) {
        gu2.l(str);
        gu2.l(str2);
        gu2.o(em2Var);
        rd2 rd2Var = new rd2(em2Var, b);
        ox1 ox1Var = this.a;
        ox1Var.getClass();
        gu2.l(str);
        gu2.l(str2);
        nx0 nx0Var = new nx0();
        gu2.l(str);
        nx0Var.a = str;
        gu2.l(str2);
        nx0Var.c = str2;
        nx0Var.d = str3;
        nx0Var.e = str4;
        nx0Var.b = true;
        qq qqVar = (qq) ox1Var.a;
        hs1 hs1Var = new hs1(ox1Var, rd2Var);
        qqVar.getClass();
        wm2 wm2Var = (wm2) qqVar.a;
        sp0.K(wm2Var.q("/verifyPassword", (String) qqVar.f), nx0Var, hs1Var, new qq2(), (ep1) wm2Var.b);
    }
}
