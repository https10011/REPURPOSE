package defpackage;

import android.graphics.Path;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.hjq.toast.BuildConfig;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.crypto.KeyAgreement;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mo1 implements nq, mw0, o62, n90, sk0, hv2, ed3, ze3, kr3 {
    public final /* synthetic */ int a;
    public static final mo1 b = new mo1(0);
    public static final mo1 c = new mo1(1);
    public static final /* synthetic */ mo1 d = new mo1(11);
    public static final /* synthetic */ mo1 e = new mo1(12);
    public static final /* synthetic */ mo1 f = new mo1(13);
    public static final /* synthetic */ mo1 i = new mo1(14);
    public static final /* synthetic */ mo1 v = new mo1(15);
    public static final /* synthetic */ mo1 w = new mo1(16);
    public static final /* synthetic */ mo1 W = new mo1(17);
    public static final /* synthetic */ mo1 X = new mo1(18);

    public /* synthetic */ mo1(int i2) {
        this.a = i2;
    }

    public static Bundle l(n70 n70Var, View view, View view2) {
        Bundle bundle = new Bundle();
        if (n70Var != null) {
            List<sa1> listUnmodifiableList = Collections.unmodifiableList(n70Var.c);
            listUnmodifiableList.getClass();
            for (sa1 sa1Var : listUnmodifiableList) {
                String str = sa1Var.b;
                ArrayList arrayList = sa1Var.c;
                String str2 = sa1Var.a;
                if (str != null && str.length() > 0) {
                    bundle.putString(str2, sa1Var.b);
                } else if (arrayList.size() > 0) {
                    int i2 = 0;
                    ArrayList arrayListV = Intrinsics.areEqual(sa1Var.d, "relative") ? am2.v(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : am2.v(view, arrayList, 0, -1, view.getClass().getSimpleName());
                    int size = arrayListV.size();
                    while (i2 < size) {
                        Object obj = arrayListV.get(i2);
                        i2++;
                        ao aoVar = (ao) obj;
                        if (aoVar.a() != null) {
                            String strJ = g62.j(aoVar.a());
                            if (strJ.length() > 0) {
                                bundle.putString(str2, strJ);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static Path m(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008b A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1 A[Catch: all -> 0x00b9, TryCatch #4 {all -> 0x00b9, blocks: (B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae), top: B:79:0x0097, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[Catch: all -> 0x00b9, TryCatch #4 {all -> 0x00b9, blocks: (B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae), top: B:79:0x0097, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final boolean o(View view) {
        boolean z;
        TextView textView;
        TextView textView2;
        TextView textView3;
        String strJ;
        boolean zMatches;
        mo1 mo1Var = b;
        Set set = mt.a;
        if (set.contains(mo1.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView4 = (TextView) view;
            if (set.contains(mo1Var)) {
                z = false;
            } else {
                try {
                    z = textView4.getInputType() == 128 ? true : textView4.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    mt.a(mo1Var, th);
                    z = false;
                }
            }
            if (!z && !mo1Var.n((TextView) view)) {
                TextView textView5 = (TextView) view;
                if (mt.a.contains(mo1Var)) {
                    textView = (TextView) view;
                    if (mt.a.contains(mo1Var)) {
                        textView2 = (TextView) view;
                        if (mt.a.contains(mo1Var)) {
                            textView3 = (TextView) view;
                            if (mt.a.contains(mo1Var)) {
                                zMatches = false;
                            } else {
                                try {
                                    if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = g62.j(textView3);
                                        if (strJ != null || strJ.length() == 0) {
                                            zMatches = false;
                                        } else {
                                            zMatches = Patterns.EMAIL_ADDRESS.matcher(strJ).matches();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    mt.a(mo1Var, th2);
                                }
                            }
                            if (!zMatches) {
                                return false;
                            }
                        } else {
                            try {
                                if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (mt.a.contains(mo1Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = g62.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            } catch (Throwable th3) {
                                mt.a(mo1Var, th3);
                            }
                        }
                    } else {
                        try {
                            if (textView.getInputType() != 112) {
                                textView2 = (TextView) view;
                                if (mt.a.contains(mo1Var)) {
                                    textView3 = (TextView) view;
                                    if (mt.a.contains(mo1Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = g62.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (mt.a.contains(mo1Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = g62.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            mt.a(mo1Var, th4);
                        }
                    }
                } else {
                    try {
                        if (textView5.getInputType() != 96) {
                            textView = (TextView) view;
                            if (mt.a.contains(mo1Var)) {
                                textView2 = (TextView) view;
                                if (mt.a.contains(mo1Var)) {
                                    textView3 = (TextView) view;
                                    if (mt.a.contains(mo1Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = g62.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (mt.a.contains(mo1Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = g62.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            } else if (textView.getInputType() != 112) {
                                textView2 = (TextView) view;
                                if (mt.a.contains(mo1Var)) {
                                    textView3 = (TextView) view;
                                    if (mt.a.contains(mo1Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = g62.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (mt.a.contains(mo1Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = g62.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        mt.a(mo1Var, th5);
                    }
                }
            }
            return true;
        } catch (Throwable th6) {
            mt.a(mo1.class, th6);
            return false;
        }
    }

    public static boolean p(int i2, we weVar, Object obj) throws ks2 {
        int i3 = weVar.a;
        sn snVar = (sn) weVar.d;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            weVar.h0(0);
            ((jt2) obj).c(i4 << 3, Long.valueOf(snVar.U()));
            return true;
        }
        if (i5 == 1) {
            weVar.h0(1);
            ((jt2) obj).c((i4 << 3) | 1, Long.valueOf(snVar.T()));
            return true;
        }
        if (i5 == 2) {
            ((jt2) obj).c((i4 << 3) | 2, weVar.C0());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                throw new ks2("Protocol message end-group tag did not match expected tag.");
            }
            if (i5 != 5) {
                throw ks2.a();
            }
            weVar.h0(5);
            ((jt2) obj).c(5 | (i4 << 3), Integer.valueOf(snVar.N()));
            return true;
        }
        jt2 jt2VarE = jt2.e();
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        int i8 = i2 + 1;
        if (i8 >= 100) {
            throw new ks2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (weVar.k0() != Integer.MAX_VALUE && p(i8, weVar, jt2VarE)) {
        }
        if (i7 != weVar.a) {
            throw new ks2("Protocol message end-group tag did not match expected tag.");
        }
        if (jt2VarE.e) {
            jt2VarE.e = false;
        }
        ((jt2) obj).c(i6 | 3, jt2VarE);
        return true;
    }

    public static jt2 q(Object obj) {
        cs2 cs2Var = (cs2) obj;
        jt2 jt2Var = cs2Var.zzb;
        if (jt2Var != jt2.f) {
            return jt2Var;
        }
        jt2 jt2VarE = jt2.e();
        cs2Var.zzb = jt2VarE;
        return jt2VarE;
    }

    @Override // defpackage.kr3
    public /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // defpackage.o62
    public l62 b(Class cls) {
        return new jg0(true);
    }

    @Override // defpackage.nq
    public Object d(co coVar) {
        Object objG = coVar.g(new je1(i22.class, Executor.class));
        objG.getClass();
        return new h80((Executor) objG);
    }

    @Override // defpackage.mw0
    public void e(uw0 uw0Var) {
        uw0Var.j();
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) throws GeneralSecurityException {
        ip3 ip3Var;
        switch (this.a) {
            case 19:
                az2 az2Var = (az2) zi0Var;
                ij3 ij3VarX = jj3.x();
                qj3 qj3VarC = t23.c(az2Var.f);
                ij3VarX.f();
                jj3.w((jj3) ij3VarX.b, qj3VarC);
                byte[] bArrB = ((tr3) az2Var.g.a).b();
                nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
                ij3VarX.f();
                jj3.v((jj3) ij3VarX.b, nr2VarE);
                return wf3.d("type.googleapis.com/google.crypto.tink.AesEaxKey", ((jj3) ij3VarX.d()).b(), 2, t23.b(az2Var.f.d), az2Var.i);
            default:
                l13 l13Var = (l13) zi0Var;
                kp3 kp3VarX = mp3.x();
                byte[] bArrB2 = ((tr3) l13Var.g.a).b();
                nr2 nr2VarE2 = jr2.e(bArrB2, 0, bArrB2.length);
                kp3VarX.f();
                mp3.v((mp3) kp3VarX.b, nr2VarE2);
                up3 up3VarV = vp3.v();
                s13 s13Var = l13Var.f;
                int i2 = s13Var.b;
                up3VarV.f();
                ((vp3) up3VarV.b).zze = i2;
                vp3 vp3Var = (vp3) up3VarV.d();
                kp3VarX.f();
                mp3.w((mp3) kp3VarX.b, vp3Var);
                nr2 nr2VarB = ((mp3) kp3VarX.d()).b();
                nz2 nz2Var = s13Var.a;
                if (nz2Var == nz2.f) {
                    ip3Var = ip3.TINK;
                } else {
                    if (nz2Var != nz2.i) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(nz2Var)));
                    }
                    ip3Var = ip3.RAW;
                }
                return wf3.d("type.googleapis.com/google.crypto.tink.XAesGcmKey", nr2VarB, 2, ip3Var, l13Var.i);
        }
    }

    public synchronized co i() {
        co coVar;
        co coVar2;
        try {
            coVar = null;
            if (mt.a.contains(co.class)) {
                coVar2 = null;
            } else {
                try {
                    coVar2 = co.i;
                } catch (Throwable th) {
                    mt.a(co.class, th);
                    coVar2 = null;
                }
            }
            if (coVar2 == null) {
                co coVar3 = new co(0);
                if (!mt.a.contains(co.class)) {
                    try {
                        co.i = coVar3;
                    } catch (Throwable th2) {
                        mt.a(co.class, th2);
                    }
                }
            }
            if (!mt.a.contains(co.class)) {
                try {
                    coVar = co.i;
                } catch (Throwable th3) {
                    mt.a(co.class, th3);
                }
            }
            coVar.getClass();
        } catch (Throwable th4) {
            throw th4;
        }
        return coVar;
    }

    @Override // defpackage.n90
    public Object j() {
        return new yz0();
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        xn3 xn3Var = (xn3) vf3Var.c;
        if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            e.g(ts.j("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", xn3Var.B()));
            return null;
        }
        try {
            return y83.a(xn3Var.z(), um3.t(xn3Var.A(), wr2.b).w());
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
        }
    }

    public boolean n(TextView textView) {
        if (mt.a.contains(this)) {
            return false;
        }
        try {
            String strReplace = new Regex("\\s").replace(g62.j(textView), BuildConfig.FLAVOR);
            int length = strReplace.length();
            if (length >= 12 && length <= 19) {
                int i2 = 0;
                boolean z = false;
                for (int i3 = length - 1; -1 < i3; i3--) {
                    char cCharAt = strReplace.charAt(i3);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iDigit = Character.digit((int) cCharAt, 10);
                    if (iDigit < 0) {
                        throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                    }
                    if (z && (iDigit = iDigit * 2) > 9) {
                        iDigit = (iDigit % 10) + 1;
                    }
                    i2 += iDigit;
                    z = !z;
                }
                if (i2 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            mt.a(this, th);
            return false;
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                return new Boolean(((Boolean) gp2.a.get()).booleanValue());
            case 12:
                List list = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.config.cache_time", 86400000L, 5).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.google_signal_max_queue_time", 605000L, 15).get();
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.redaction.app_instance_id.ttl", 7200000L, 62).get();
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.rb.max_trigger_registrations_per_day", 1000L, 24).get()).longValue());
            case 17:
                List list6 = h13.a;
                return (Boolean) rp2.b.get();
            default:
                List list7 = h13.a;
                return (Boolean) oq2.b.get();
        }
    }

    @Override // defpackage.mw0
    public void c(uw0 uw0Var) {
    }

    @Override // defpackage.sk0
    public void f(HashMap map) {
    }
}
