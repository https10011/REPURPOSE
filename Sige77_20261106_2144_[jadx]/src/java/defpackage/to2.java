package defpackage;

import android.content.Context;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class to2 implements vg0 {
    public static final /* synthetic */ to2 b = new to2(0);
    public static final /* synthetic */ to2 c = new to2(1);
    public static final /* synthetic */ to2 d = new to2(2);
    public static final /* synthetic */ to2 e = new to2(3);
    public final /* synthetic */ int a;

    public /* synthetic */ to2(int i) {
        this.a = i;
    }

    @Override // defpackage.vg0
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                String strB = uo2.b;
                if (strB == null) {
                    synchronized (uo2.class) {
                        try {
                            strB = uo2.b;
                            if (strB == null) {
                                strB = s93.b(context, "com.google.android.gms.measurement");
                                uo2.b = strB;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return strB;
            case 1:
                m83 m83Var = hf3.i;
                return BuildConfig.FLAVOR;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                eb3 eb3Var = (eb3) obj;
                sg3 sg3VarZ = ug3.z();
                if (eb3Var == null) {
                    return (ug3) sg3VarZ.g();
                }
                for (ib3 ib3Var : eb3Var.x()) {
                    vg3 vg3VarZ = wg3.z();
                    String strT = ib3Var.t();
                    vg3VarZ.d();
                    ((wg3) vg3VarZ.b).A(strT);
                    int iH = ib3Var.H();
                    int i = iH - 1;
                    if (iH == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jU = ib3Var.u();
                        vg3VarZ.d();
                        ((wg3) vg3VarZ.b).B(jU);
                    } else if (i == 1) {
                        boolean zV = ib3Var.v();
                        vg3VarZ.d();
                        ((wg3) vg3VarZ.b).C(zV);
                    } else if (i == 2) {
                        double dW = ib3Var.w();
                        vg3VarZ.d();
                        ((wg3) vg3VarZ.b).D(dW);
                    } else if (i == 3) {
                        String strX = ib3Var.x();
                        vg3VarZ.d();
                        ((wg3) vg3VarZ.b).E(strX);
                    } else {
                        if (i != 4) {
                            uq1.q("No known flag type");
                            return null;
                        }
                        hl2 hl2VarY = ib3Var.y();
                        vg3VarZ.d();
                        ((wg3) vg3VarZ.b).F(hl2VarY);
                    }
                    wg3 wg3Var = (wg3) vg3VarZ.g();
                    sg3VarZ.d();
                    ((ug3) sg3VarZ.b).F(wg3Var);
                }
                String strW = eb3Var.w();
                sg3VarZ.d();
                ((ug3) sg3VarZ.b).D(strW);
                String strT2 = eb3Var.t();
                sg3VarZ.d();
                ((ug3) sg3VarZ.b).B(strT2);
                long jY = eb3Var.y();
                sg3VarZ.d();
                ((ug3) sg3VarZ.b).E(jY);
                if (eb3Var.u()) {
                    hl2 hl2VarV = eb3Var.v();
                    sg3VarZ.d();
                    ((ug3) sg3VarZ.b).C(hl2VarV);
                }
                return (ug3) sg3VarZ.g();
            default:
                jb3 jb3Var = (jb3) obj;
                if (jb3Var.a != 29514) {
                    throw jb3Var;
                }
                pc3 pc3VarW = rc3.w();
                hc3 hc3VarG = ic3.G();
                long jCurrentTimeMillis = System.currentTimeMillis();
                hc3VarG.d();
                ((ic3) hc3VarG.b).I(jCurrentTimeMillis);
                pc3VarW.d();
                ((rc3) pc3VarW.b).x((ic3) hc3VarG.g());
                return (rc3) pc3VarW.g();
        }
    }
}
