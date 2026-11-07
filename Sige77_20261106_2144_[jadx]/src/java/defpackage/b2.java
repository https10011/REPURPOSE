package defpackage;

import com.facebook.AccessToken;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ e2 a;
    public final /* synthetic */ AccessToken b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ HashSet e;
    public final /* synthetic */ HashSet f;
    public final /* synthetic */ co i;

    public /* synthetic */ b2(e2 e2Var, AccessToken accessToken, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, co coVar) {
        this.a = e2Var;
        this.b = accessToken;
        this.c = atomicBoolean;
        this.d = hashSet;
        this.e = hashSet2;
        this.f = hashSet3;
        this.i = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Date date;
        AccessToken accessToken = this.b;
        AtomicBoolean atomicBoolean = this.c;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.i.d;
        e2 e2Var = this.a;
        String str = (String) e2Var.c;
        int i = e2Var.a;
        Long l = (Long) e2Var.e;
        String str2 = (String) e2Var.d;
        try {
            xn xnVar = co.v;
            if (((AccessToken) xnVar.n().c) != null) {
                AccessToken accessToken2 = (AccessToken) xnVar.n().c;
                if ((accessToken2 != null ? accessToken2.w : null) == accessToken.w) {
                    if (!atomicBoolean.get() && str == null && i == 0) {
                        return;
                    }
                    Date date2 = accessToken.a;
                    if (e2Var.a != 0) {
                        date = new Date(((long) e2Var.a) * 1000);
                        j = 1000;
                    } else {
                        if (e2Var.b != 0) {
                            j = 1000;
                            date2 = new Date((((long) e2Var.b) * 1000) + new Date().getTime());
                        } else {
                            j = 1000;
                        }
                        date = date2;
                    }
                    if (str == null) {
                        str = accessToken.e;
                    }
                    String str3 = str;
                    String str4 = accessToken.v;
                    String str5 = accessToken.w;
                    Collection collection = atomicBoolean.get() ? this.d : accessToken.b;
                    Collection collection2 = atomicBoolean.get() ? this.e : accessToken.c;
                    Collection collection3 = atomicBoolean.get() ? this.f : accessToken.d;
                    g2 g2Var = accessToken.f;
                    Date date3 = new Date();
                    Date date4 = l != null ? new Date(l.longValue() * j) : accessToken.W;
                    if (str2 == null) {
                        str2 = accessToken.X;
                    }
                    xnVar.n().I(new AccessToken(str3, str4, str5, collection, collection2, collection3, g2Var, date, date3, date4, str2), true);
                }
            }
        } finally {
            atomicBoolean2.set(false);
        }
    }
}
