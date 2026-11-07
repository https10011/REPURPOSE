package defpackage;

import androidx.fragment.app.c;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class br0 implements ls, a41, sg0, p90, gm1, hn, rr2, hv2, ff3, ed3, yc3 {
    public static boolean c;
    public static boolean d;
    public static volatile br0 i;
    public final /* synthetic */ int a;
    public static final br0 b = new br0(0);
    public static final br0 e = new br0(1);
    public static final br0 f = new br0(2);
    public static final /* synthetic */ br0 v = new br0(11);
    public static final /* synthetic */ br0 w = new br0(12);
    public static final /* synthetic */ br0 W = new br0(13);
    public static final /* synthetic */ br0 X = new br0(15);
    public static final /* synthetic */ br0 Y = new br0(16);
    public static final /* synthetic */ br0 Z = new br0(17);

    public /* synthetic */ br0(int i2) {
        this.a = i2;
    }

    public static jb1 h(String str) {
        str.getClass();
        rj rjVar = d.a;
        ji jiVar = new ji();
        jiVar.Y(str);
        return d.d(jiVar, false);
    }

    public static jb1 j(File file) {
        String str = jb1.b;
        file.getClass();
        String string = file.toString();
        string.getClass();
        return h(string);
    }

    @Override // defpackage.rr2
    public /* synthetic */ String a(String str, String str2) {
        return null;
    }

    @Override // defpackage.hn
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) throws GeneralSecurityException {
        ip3 ip3Var;
        switch (this.a) {
            case 18:
                p03 p03Var = (p03) dx2Var;
                vn3 vn3VarT = xn3.t();
                vn3VarT.i("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                vn3VarT.j(t03.b(p03Var).b());
                dz2 dz2Var = p03Var.a;
                if (dz2.f == dz2Var) {
                    ip3Var = ip3.TINK;
                } else {
                    if (dz2.i != dz2Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(dz2Var)));
                    }
                    ip3Var = ip3.RAW;
                }
                vn3VarT.h(ip3Var);
                return vf3.f((xn3) vn3VarT.d());
            default:
                yy2 yy2Var = (yy2) dx2Var;
                vn3 vn3VarT2 = xn3.t();
                vn3VarT2.i("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                si3 si3VarT = ui3.t();
                bj3 bj3VarW = cj3.w();
                ej3 ej3VarV = fj3.v();
                int i2 = yy2Var.c;
                ej3VarV.f();
                ((fj3) ej3VarV.b).zze = i2;
                fj3 fj3Var = (fj3) ej3VarV.d();
                bj3VarW.f();
                cj3.v((cj3) bj3VarW.b, fj3Var);
                int i3 = yy2Var.a;
                bj3VarW.f();
                ((cj3) bj3VarW.b).zzg = i3;
                cj3 cj3Var = (cj3) bj3VarW.d();
                si3VarT.f();
                ui3.v((ui3) si3VarT.b, cj3Var);
                em3 em3VarY = fm3.y();
                km3 km3VarD = h23.d(yy2Var);
                em3VarY.f();
                fm3.w((fm3) em3VarY.b, km3VarD);
                int i4 = yy2Var.b;
                em3VarY.f();
                ((fm3) em3VarY.b).zzg = i4;
                fm3 fm3Var = (fm3) em3VarY.d();
                si3VarT.f();
                ui3.w((ui3) si3VarT.b, fm3Var);
                vn3VarT2.j(((ui3) si3VarT.d()).b());
                vn3VarT2.h(h23.c(yy2Var.e));
                return vf3.f((xn3) vn3VarT2.d());
        }
    }

    @Override // defpackage.p90
    public void d(Object obj) {
        ((List) obj).clear();
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) throws GeneralSecurityException {
        switch (this.a) {
            case 20:
                tz2 tz2Var = (tz2) zi0Var;
                pk3 pk3VarW = qk3.w();
                byte[] bArrB = ((tr3) tz2Var.g.a).b();
                nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
                pk3VarW.f();
                qk3.v((qk3) pk3VarW.b, nr2VarE);
                return wf3.d("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((qk3) pk3VarW.d()).b(), 2, t43.b(tz2Var.f.a), tz2Var.i);
            case 21:
                k73 k73Var = (k73) zi0Var;
                hk3 hk3VarW = jk3.w();
                byte[] bArrB2 = ((tr3) k73Var.g.a).b();
                nr2 nr2VarE2 = jr2.e(bArrB2, 0, bArrB2.length);
                hk3VarW.f();
                jk3.v((jk3) hk3VarW.b, nr2VarE2);
                nr2 nr2VarB = ((jk3) hk3VarW.d()).b();
                q73 q73Var = k73Var.f.b;
                Map map = y73.e;
                if (map.containsKey(q73Var)) {
                    return wf3.d("type.googleapis.com/google.crypto.tink.AesSivKey", nr2VarB, 2, (ip3) map.get(q73Var), k73Var.i);
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(q73Var)));
            default:
                rg3 rg3Var = (rg3) zi0Var;
                yl3 yl3VarX = zl3.x();
                ah3 ah3Var = rg3Var.f;
                im3 im3VarX = km3.x();
                int i2 = ah3Var.b;
                im3VarX.f();
                ((km3) im3VarX.b).zzf = i2;
                bm3 bm3Var = (bm3) mh3.b.E(ah3Var.d);
                im3VarX.f();
                ((km3) im3VarX.b).zze = bm3Var.zza();
                km3 km3Var = (km3) im3VarX.d();
                yl3VarX.f();
                zl3.w((zl3) yl3VarX.b, km3Var);
                byte[] bArrB3 = ((tr3) rg3Var.g.a).b();
                nr2 nr2VarE3 = jr2.e(bArrB3, 0, bArrB3.length);
                yl3VarX.f();
                zl3.v((zl3) yl3VarX.b, nr2VarE3);
                return wf3.d("type.googleapis.com/google.crypto.tink.HmacKey", ((zl3) yl3VarX.d()).b(), 2, (ip3) mh3.a.E(rg3Var.f.c), rg3Var.h);
        }
    }

    @Override // defpackage.ls
    public Object i(Object obj) {
        ((ResponseBody) obj).close();
        return null;
    }

    public boolean k(String str) {
        Set set = mt.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!set.contains(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    String[] strArrF = j51.f(1, new float[][]{fArr}, new String[]{str});
                    if (strArrF == null || (str2 = strArrF[0]) == null) {
                        str2 = "none";
                    }
                } catch (Throwable th) {
                    mt.a(this, th);
                }
            }
            return !Intrinsics.areEqual("none", str2);
        } catch (Throwable th2) {
            mt.a(this, th2);
            return false;
        }
    }

    public Object l(lw2 lw2Var) throws GeneralSecurityException {
        zi0 zi0VarA = lw2Var.a();
        if (zi0VarA instanceof oy2) {
            return xq3.a((oy2) zi0VarA);
        }
        if (zi0VarA instanceof gz2) {
            gz2 gz2Var = (gz2) zi0VarA;
            oz2 oz2Var = gz2Var.f;
            int i2 = oz2Var.b;
            int i3 = oz2Var.c;
            if (i2 != 12) {
                throw new GeneralSecurityException(ck1.r(oz2Var.b, "Expected IV Size 12, got "));
            }
            if (i3 == 16) {
                return new f63(((tr3) gz2Var.g.a).b(), gz2Var.h);
            }
            throw new GeneralSecurityException(ck1.r(i3, "Expected tag Size 16, got "));
        }
        if (zi0VarA instanceof pz2) {
            pz2 pz2Var = (pz2) zi0VarA;
            xv1 xv1Var = x63.a;
            vl0 vl0Var = new vl0(20);
            byte[] bArr = y33.d;
            if (y33.a(vl0.y())) {
                return new y33(((tr3) pz2Var.g.a).b(), pz2Var.h.b(), vl0Var);
            }
            uq1.q("Cipher does not implement AES GCM SIV.");
            return null;
        }
        if (zi0VarA instanceof az2) {
            az2 az2Var = (az2) zi0VarA;
            xv1 xv1Var2 = lq3.e;
            if (!ck1.i(1)) {
                tv2.f("Can not use AES-EAX in FIPS-mode.");
                return null;
            }
            fz2 fz2Var = az2Var.f;
            if (fz2Var.c != 16) {
                throw new GeneralSecurityException(ck1.r(fz2Var.c, "AesEaxJce only supports 16 byte tag size, not "));
            }
            return new lq3(fz2Var.b, ((tr3) az2Var.g.a).b(), az2Var.h.b());
        }
        if (zi0VarA instanceof tz2) {
            tz2 tz2Var = (tz2) zi0VarA;
            tr3 tr3Var = tz2Var.h;
            tr3 tr3Var2 = (tr3) tz2Var.g.a;
            try {
                n43.a();
                return new n43(tr3Var2.b(), tr3Var.b(), n43.a().getProvider());
            } catch (GeneralSecurityException unused) {
                return new f63(2, tr3Var2.b(), tr3Var.b());
            }
        }
        if (zi0VarA instanceof z13) {
            z13 z13Var = (z13) zi0VarA;
            tr3 tr3Var3 = z13Var.h;
            tr3 tr3Var4 = (tr3) z13Var.g.a;
            try {
                n43.a();
                return new o63(tr3Var4.b(), tr3Var3.b(), n43.a().getProvider());
            } catch (GeneralSecurityException unused2) {
                return new f63(3, tr3Var4.b(), tr3Var3.b());
            }
        }
        if (!(zi0VarA instanceof l13)) {
            throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zi0VarA.getClass())));
        }
        l13 l13Var = (l13) zi0VarA;
        int i4 = l13Var.f.b;
        if (i4 >= 8 && i4 <= 12) {
            return new j63(((tr3) l13Var.g.a).b(), l13Var.h, i4);
        }
        tv2.f("invalid salt size");
        return null;
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        String str = (String) wf3Var.c;
        Integer num = (Integer) wf3Var.i;
        if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            e.g(ts.j("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", str));
            return null;
        }
        try {
            kl3 kl3VarU = kl3.u((jr2) wf3Var.e, wr2.b);
            if (kl3VarU.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            n83 n83VarB = ha3.b((ip3) wf3Var.f, kl3VarU.y());
            if (!n83VarB.a.equals(j83.e)) {
                return w83.I(n83VarB, new ECPoint(xi0.E(kl3VarU.C().o()), xi0.E(kl3VarU.D().o())), num);
            }
            if (kl3VarU.D().b() == 0) {
                return w83.J(n83VarB, tr3.a(kl3VarU.C().o()), num);
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (IllegalArgumentException | ks2 unused) {
            tv2.f("Parsing EcdsaPublicKey failed");
            return null;
        }
    }

    @Override // defpackage.a41
    public boolean y(i31 i31Var) {
        return false;
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 12:
                List list = h13.a;
                return (String) lp2.c.get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.sgtm.upload.max_queued_batches", 5000L, 47).get()).longValue());
            case 14:
            default:
                List list3 = h13.a;
                return (Boolean) gr2.a.get();
            case 15:
                List list4 = h13.a;
                fq2.b.get();
                yd2 yd2Var = gq2.a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) yd2Var.b;
                zd3 zd3Var = (zd3) atomicReferenceArray.get(2);
                if (zd3Var == null) {
                    kd3 kd3Var = new kd3("measurement.test.double_flag", (bk0) ((k93) yd2Var.c).a);
                    while (!atomicReferenceArray.compareAndSet(2, null, kd3Var)) {
                        if (atomicReferenceArray.get(2) != null) {
                            zd3Var = (zd3) atomicReferenceArray.get(2);
                            zd3Var.getClass();
                        }
                    }
                    zd3Var = kd3Var;
                }
                return (Double) zd3Var.get();
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(59, "measurement.rb.attribution.query_parameters_to_remove", BuildConfig.FLAVOR).get();
        }
    }

    @Override // defpackage.sg0
    public void e(c cVar) {
    }

    @Override // defpackage.a41
    public void f(i31 i31Var, boolean z) {
    }

    @Override // defpackage.gm1
    public void onScrollLimit(int i2, int i3, int i4, boolean z) {
    }

    @Override // defpackage.gm1
    public void onScrollProgress(int i2, int i3, int i4, int i5) {
    }
}
