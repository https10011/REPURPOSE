package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ih implements si1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ih(Resources resources, si1 si1Var) {
        this.a = 0;
        this.c = resources;
        this.b = si1Var;
    }

    @Override // defpackage.si1
    public final pi1 a(Object obj, int i, int i2, da1 da1Var) {
        boolean z;
        nf1 nf1Var;
        z70 z70Var;
        switch (this.a) {
            case 0:
                pi1 pi1VarA = ((si1) this.b).a(obj, i, i2, da1Var);
                Resources resources = (Resources) this.c;
                if (pi1VarA == null) {
                    return null;
                }
                return new nh(resources, pi1VarA);
            case 1:
                pi1 pi1VarC = ((ui1) this.b).c((Uri) obj, da1Var);
                if (pi1VarC == null) {
                    return null;
                }
                return zi0.g((mh) this.c, (Drawable) ((mi0) pi1VarC).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof nf1) {
                    nf1Var = (nf1) inputStream;
                    z = false;
                } else {
                    z = true;
                    nf1Var = new nf1(inputStream, (v01) this.c);
                }
                ArrayDeque arrayDeque = z70.c;
                synchronized (arrayDeque) {
                    z70Var = (z70) arrayDeque.poll();
                    break;
                }
                if (z70Var == null) {
                    z70Var = new z70();
                }
                z70 z70Var2 = z70Var;
                z70Var2.a = nf1Var;
                x11 x11Var = new x11(z70Var2);
                hs1 hs1Var = new hs1(7, nf1Var, z70Var2);
                try {
                    b30 b30Var = (b30) this.b;
                    nh nhVarA = b30Var.a(new ac2(x11Var, b30Var.d, b30Var.c), i, i2, da1Var, hs1Var);
                    z70Var2.b = null;
                    z70Var2.a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(z70Var2);
                        break;
                    }
                    return nhVarA;
                } finally {
                    z70Var2.b = null;
                    z70Var2.a = null;
                    ArrayDeque arrayDeque2 = z70.c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(z70Var2);
                        if (z) {
                            nf1Var.b();
                        }
                    }
                }
        }
    }

    @Override // defpackage.si1
    public final boolean b(Object obj, da1 da1Var) {
        switch (this.a) {
            case 0:
                return ((si1) this.b).b(obj, da1Var);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public /* synthetic */ ih(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
