package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class vi implements ls, g52, hv2, ff3, ze3, yc3 {
    public final /* synthetic */ int a;
    public static final vi b = new vi(0);
    public static final vi c = new vi(1);
    public static final vi d = new vi(2);
    public static final /* synthetic */ vi e = new vi(12);
    public static final /* synthetic */ vi f = new vi(13);
    public static final /* synthetic */ vi i = new vi(14);
    public static final /* synthetic */ vi v = new vi(15);
    public static final /* synthetic */ vi w = new vi(16);
    public static final /* synthetic */ vi W = new vi(17);
    public static final /* synthetic */ vi X = new vi(18);
    public static final /* synthetic */ vi Y = new vi(19);

    public /* synthetic */ vi(int i2) {
        this.a = i2;
    }

    public static final um2 h(Object obj, long j) {
        um2 um2Var = (um2) no2.i(obj, j);
        if (((xk2) um2Var).a) {
            return um2Var;
        }
        int size = um2Var.size();
        um2 um2VarZzg = um2Var.zzg(size == 0 ? 10 : size + size);
        no2.j(obj, j, um2VarZzg);
        return um2VarZzg;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new oy(executor));
    }

    @Override // defpackage.g52
    public void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) {
        switch (this.a) {
            case 20:
                sz2 sz2Var = (sz2) dx2Var;
                vn3 vn3VarT = xn3.t();
                vn3VarT.i("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                dk3 dk3VarX = ek3.x();
                int i2 = sz2Var.a;
                dk3VarX.f();
                ((ek3) dk3VarX.b).zze = i2;
                vn3VarT.j(((ek3) dk3VarX.d()).b());
                vn3VarT.h(c43.b(sz2Var.b));
                return vf3.f((xn3) vn3VarT.d());
            default:
                n83 n83Var = (n83) dx2Var;
                vn3 vn3VarT2 = xn3.t();
                vn3VarT2.i("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                zk3 zk3VarT = al3.t();
                el3 el3VarD = ha3.d(n83Var);
                zk3VarT.f();
                al3.v((al3) zk3VarT.b, el3VarD);
                vn3VarT2.j(((al3) zk3VarT.d()).b());
                vn3VarT2.h((ip3) ha3.g.E(n83Var.d));
                return vf3.f((xn3) vn3VarT2.d());
        }
    }

    public List d() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.g52
    public void e(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    public synchronized ac2 f() {
        ja0 ja0VarB = ma0.b(i90.b());
        if (ja0VarB == null) {
            return ac2.W.h();
        }
        return ja0VarB.e;
    }

    public Signature[] g(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.ls
    public Object i(Object obj) {
        switch (this.a) {
            case 0:
                return obj.toString();
            default:
                ResponseBody responseBody = (ResponseBody) obj;
                try {
                    ji jiVar = new ji();
                    responseBody.e().r(jiVar);
                    MediaType mediaTypeB = responseBody.b();
                    long jA = responseBody.a();
                    ResponseBody.b.getClass();
                    return new ResponseBody.Companion.asResponseBody.1(mediaTypeB, jA, jiVar);
                } finally {
                    responseBody.close();
                }
        }
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        xn3 xn3Var = (xn3) vf3Var.c;
        if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            e.g(ts.j("Wrong type URL in call to AesSivParameters.parseParameters: ", xn3Var.B()));
            return null;
        }
        try {
            nk3 nk3VarU = nk3.u(xn3Var.A(), wr2.b);
            if (nk3VarU.w() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            rc2 rc2VarB = r73.b();
            rc2VarB.H(nk3VarU.t());
            rc2VarB.c = y73.a(xn3Var.z());
            return rc2VarB.G();
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e2);
        }
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            e.g("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
            return null;
        }
        try {
            bi3 bi3VarU = bi3.u((jr2) wf3Var.e, wr2.b);
            if (bi3VarU.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            u23 u23VarB = pg3.b();
            u23VarB.i(bi3VarU.z().b());
            u23VarB.k(bi3VarU.y().t());
            u23VarB.d = hh3.a((ip3) wf3Var.f);
            pg3 pg3VarG = u23VarB.g();
            u23 u23Var = new u23(8);
            u23Var.c = null;
            u23Var.d = null;
            u23Var.b = pg3VarG;
            u23Var.c = new ox1(tr3.a(bi3VarU.z().o()));
            u23Var.d = (Integer) wf3Var.i;
            return u23Var.f();
        } catch (IllegalArgumentException | ks2 unused) {
            tv2.f("Parsing AesCmacKey failed");
            return null;
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 12:
                List list = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sgtm.upload.retry_max_wait", 21600000L, 52).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.alarm_manager.minimum_interval", 60000L, 27).get();
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.session.engagement_interval", 3600000L, 12).get();
            case 17:
                List list6 = h13.a;
                return (Boolean) tp2.b.get();
            case 18:
                List list7 = h13.a;
                hq2.b.get();
                return (Boolean) iq2.a.r(6, "measurement.rb.attribution.service", true).get();
            default:
                return new Boolean(((Boolean) eq2.a.get()).booleanValue());
        }
    }
}
