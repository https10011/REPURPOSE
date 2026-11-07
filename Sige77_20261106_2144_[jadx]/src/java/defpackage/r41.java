package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.f;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r41 implements Continuation, oz1, za0, bx0, gd1, hj1, f, hv2, jv2, e40, ed3, yc3 {
    public static boolean c;
    public final /* synthetic */ int a;
    public static final r41 b = new r41(0);
    public static final r41 d = new r41(1);
    public static final /* synthetic */ r41 e = new r41(2);
    public static final /* synthetic */ r41 f = new r41(12);
    public static final /* synthetic */ r41 i = new r41(13);
    public static final /* synthetic */ r41 v = new r41(15);
    public static final /* synthetic */ r41 w = new r41(16);
    public static final /* synthetic */ r41 W = new r41(18);

    public /* synthetic */ r41(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
    public static rj k(String str) {
        int i2;
        char cCharAt;
        str.getClass();
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i3 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i4 >= length) {
                int i8 = i5 % 4;
                if (i8 != 1) {
                    if (i8 == 2) {
                        bArrCopyOf[i7] = (byte) ((i6 << 12) >> 16);
                        i7++;
                    } else if (i8 == 3) {
                        int i9 = i6 << 6;
                        int i10 = i7 + 1;
                        bArrCopyOf[i7] = (byte) (i9 >> 16);
                        i7 += 2;
                        bArrCopyOf[i10] = (byte) (i9 >> 8);
                    }
                    if (i7 != i3) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                    }
                }
                if (bArrCopyOf != null) {
                    return new rj(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i4);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i2 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i2 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i2 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i2 = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i2 = 63;
                }
                i4++;
            }
            i6 = (i6 << 6) | i2;
            i5++;
            if (i5 % 4 == 0) {
                bArrCopyOf[i7] = (byte) (i6 >> 16);
                int i11 = i7 + 2;
                bArrCopyOf[i7 + 1] = (byte) (i6 >> 8);
                i7 += 3;
                bArrCopyOf[i11] = (byte) i6;
            }
            i4++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new rj(bArrCopyOf);
        }
        return null;
    }

    public static rj n(String str) {
        if (str.length() % 2 != 0) {
            e.d("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (qt.a(str.charAt(i3 + 1)) + (qt.a(str.charAt(i3)) << 4));
        }
        return new rj(bArr);
    }

    public static rj p(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        rj rjVar = new rj(bytes);
        rjVar.c = str;
        return rjVar;
    }

    public static rj r(byte[] bArr) {
        rj rjVar = rj.d;
        bArr.getClass();
        int length = bArr.length;
        kv.l(bArr.length, 0L, length);
        return new rj(ub.f(bArr, 0, length));
    }

    public static mn3 s(String str) {
        boolean z;
        bo3 bo3VarY;
        sn3 sn3Var = rn3.e;
        zn3 zn3VarC = vm3.c();
        bo3 bo3Var = zn3VarC.b;
        int i2 = 1;
        if (bo3Var == kn3.i) {
            bo3Var = null;
            vm3.b(zn3VarC, null);
            z = true;
        } else {
            z = false;
        }
        if (bo3Var == null) {
            UUID uuidB = wm3.c.b();
            String strA = gm3.a(uuidB);
            nc0 nc0Var = fn3.i;
            wo0 wo0Var = (wo0) vm3.a.get();
            if (!wo0Var.isEmpty()) {
                wo0Var.forEach(new cn3(i2));
            }
            bo3VarY = new hn3(uuidB, strA, str, sn3Var, nc0Var, zn3VarC);
        } else {
            bo3VarY = bo3Var instanceof mm3 ? ((mm3) bo3Var).y(str, sn3Var, false, zn3VarC) : bo3Var.E(str, sn3Var, zn3VarC);
        }
        vm3.b(zn3VarC, bo3VarY);
        return new mn3(bo3VarY, z);
    }

    @Override // defpackage.za0
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.e40
    public int b(Context context, String str, boolean z) {
        return h40.d(context, str, z);
    }

    @Override // defpackage.jv2
    public Object d(yd2 yd2Var, Class cls) throws GeneralSecurityException {
        tr3 tr3VarH;
        List arrayList;
        if (cls != cv2.class) {
            tv2.f("AeadConfigurationV1 can only create AEADs");
            return null;
        }
        br0 br0Var = new br0(14);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < ((List) yd2Var.b).size(); i2++) {
            lw2 lw2VarQ = yd2Var.q(i2);
            if (lw2VarQ.c.equals(qv2.c)) {
                zi0 zi0VarA = lw2VarQ.a();
                if (zi0VarA instanceof iy2) {
                    tr3VarH = ((iy2) zi0VarA).H();
                } else {
                    if (!(zi0VarA instanceof qd3)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zi0VarA.getClass().getName() + " with parameters " + String.valueOf(zi0VarA.E()));
                    }
                    tr3VarH = ((qd3) zi0VarA).H();
                }
                c63 c63Var = new c63((cv2) br0Var.l(lw2VarQ), lw2VarQ.d);
                byte[] bArr = tr3VarH.a;
                if (bArr.length != 0 && bArr.length != 5) {
                    tv2.f("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (map.containsKey(tr3VarH)) {
                    arrayList = (List) map.get(tr3VarH);
                } else {
                    arrayList = new ArrayList();
                    map.put(tr3VarH, arrayList);
                }
                arrayList.add(c63Var);
            }
        }
        yd2Var.s();
        return cls.cast(new f63(new c63((cv2) br0Var.l(yd2Var.D()), yd2Var.D().d), new jf3(map)));
    }

    @Override // defpackage.e40
    public int e(Context context, String str) {
        return h40.a(context, str);
    }

    @Override // defpackage.oz1
    public boolean f(Object obj, lh lhVar) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = lhVar.a;
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(300);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) {
        oy2 oy2Var = (oy2) zi0Var;
        oi3 oi3VarX = qi3.x();
        wi3 wi3VarW = yi3.w();
        ej3 ej3VarV = fj3.v();
        int i2 = oy2Var.f.c;
        ej3VarV.f();
        ((fj3) ej3VarV.b).zze = i2;
        fj3 fj3Var = (fj3) ej3VarV.d();
        wi3VarW.f();
        yi3.v((yi3) wi3VarW.b, fj3Var);
        byte[] bArrB = ((tr3) oy2Var.g.a).b();
        nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
        wi3VarW.f();
        yi3.u((yi3) wi3VarW.b, nr2VarE);
        yi3 yi3Var = (yi3) wi3VarW.d();
        oi3VarX.f();
        qi3.v((qi3) oi3VarX.b, yi3Var);
        yl3 yl3VarX = zl3.x();
        yy2 yy2Var = oy2Var.f;
        km3 km3VarD = h23.d(yy2Var);
        yl3VarX.f();
        zl3.w((zl3) yl3VarX.b, km3VarD);
        byte[] bArrB2 = ((tr3) oy2Var.h.a).b();
        nr2 nr2VarE2 = jr2.e(bArrB2, 0, bArrB2.length);
        yl3VarX.f();
        zl3.v((zl3) yl3VarX.b, nr2VarE2);
        zl3 zl3Var = (zl3) yl3VarX.d();
        oi3VarX.f();
        qi3.w((qi3) oi3VarX.b, zl3Var);
        return wf3.d("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((qi3) oi3VarX.d()).b(), 2, h23.c(yy2Var.e), oy2Var.j);
    }

    @Override // defpackage.bx0
    public void h(Window window, boolean z) {
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class cls3 = Integer.TYPE;
            cls.getMethod("setExtraFlags", cls3, cls3).invoke(window, Integer.valueOf(z ? i2 : 0), Integer.valueOf(i2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.za0
    public Object i(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.za0
    public void m(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            e.g("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            qk3 qk3VarU = qk3.u((jr2) wf3Var.e, wr2.b);
            if (qk3VarU.t() == 0) {
                return tz2.I(t43.a((ip3) wf3Var.f), new ox1(tr3.a(qk3VarU.x().o())), (Integer) wf3Var.i);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (ks2 unused) {
            tv2.f("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // defpackage.hj1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public String c(InputStream inputStream) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return sb.toString();
                    }
                    sb.append(line);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Object then(Task task) {
        dm2 dm2VarG;
        switch (this.a) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            default:
                zzjh zzjhVar = (zzjh) task.getResult();
                cb3 cb3VarZ = eb3.z();
                String str = zzjhVar.a;
                cb3VarZ.d();
                ((eb3) cb3VarZ.b).A(str);
                String str2 = zzjhVar.c;
                cb3VarZ.d();
                ((eb3) cb3VarZ.b).C(str2);
                boolean z = zzjhVar.f;
                cb3VarZ.d();
                ((eb3) cb3VarZ.b).F(z);
                long j = zzjhVar.i;
                cb3VarZ.d();
                ((eb3) cb3VarZ.b).G(j);
                byte[] bArr = zzjhVar.b;
                if (bArr != null) {
                    gl2 gl2VarH = hl2.h(bArr, 0, bArr.length);
                    cb3VarZ.d();
                    ((eb3) cb3VarZ.b).B(gl2VarH);
                }
                for (zzjf zzjfVar : zzjhVar.d) {
                    for (zzjo zzjoVar : zzjfVar.b) {
                        int i2 = zzjoVar.i;
                        String str3 = zzjoVar.a;
                        if (i2 == 1) {
                            fb3 fb3VarZ = ib3.z();
                            fb3VarZ.j(str3);
                            if (i2 != 1) {
                                e.g("Not a long type");
                                return null;
                            }
                            long j2 = zzjoVar.b;
                            fb3VarZ.d();
                            ((ib3) fb3VarZ.b).C(j2);
                            dm2VarG = fb3VarZ.g();
                        } else if (i2 == 2) {
                            fb3 fb3VarZ2 = ib3.z();
                            fb3VarZ2.j(str3);
                            if (i2 != 2) {
                                e.g("Not a boolean type");
                                return null;
                            }
                            boolean z2 = zzjoVar.c;
                            fb3VarZ2.d();
                            ((ib3) fb3VarZ2.b).D(z2);
                            dm2VarG = fb3VarZ2.g();
                        } else if (i2 == 3) {
                            fb3 fb3VarZ3 = ib3.z();
                            fb3VarZ3.j(str3);
                            if (i2 != 3) {
                                e.g("Not a double type");
                                return null;
                            }
                            double d2 = zzjoVar.d;
                            fb3VarZ3.d();
                            ((ib3) fb3VarZ3.b).E(d2);
                            dm2VarG = fb3VarZ3.g();
                        } else if (i2 == 4) {
                            fb3 fb3VarZ4 = ib3.z();
                            fb3VarZ4.j(str3);
                            if (i2 != 4) {
                                e.g("Not a String type");
                                return null;
                            }
                            String str4 = zzjoVar.e;
                            gu2.o(str4);
                            fb3VarZ4.d();
                            ((ib3) fb3VarZ4.b).F(str4);
                            dm2VarG = fb3VarZ4.g();
                        } else {
                            if (i2 != 5) {
                                e.g(ck1.s(i2, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i2).length() + 24)));
                                return null;
                            }
                            fb3 fb3VarZ5 = ib3.z();
                            fb3VarZ5.j(str3);
                            if (i2 != 5) {
                                e.g("Not a bytes type");
                                return null;
                            }
                            byte[] bArr2 = zzjoVar.f;
                            gu2.o(bArr2);
                            gl2 gl2VarH2 = hl2.h(bArr2, 0, bArr2.length);
                            fb3VarZ5.d();
                            ((ib3) fb3VarZ5.b).G(gl2VarH2);
                            dm2VarG = fb3VarZ5.g();
                        }
                        cb3VarZ.d();
                        ((eb3) cb3VarZ.b).D((ib3) dm2VarG);
                    }
                    String[] strArr = zzjfVar.c;
                    if (strArr != null) {
                        for (String str5 : strArr) {
                            cb3VarZ.d();
                            ((eb3) cb3VarZ.b).E(str5);
                        }
                    }
                }
                return (eb3) cb3VarZ.g();
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() throws InvalidAlgorithmParameterException {
        switch (this.a) {
            case 12:
                List list = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_public_events_per_day", 50000L, 72).get()).longValue());
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sgtm.upload.min_delay_after_startup", 5000L, 50).get();
            case 14:
            case 17:
            default:
                HashSet hashSet = new HashSet();
                ep1 ep1VarB = oz2.b();
                ep1VarB.G();
                ep1VarB.J(16);
                ep1VarB.L();
                nz2 nz2Var = nz2.e;
                ep1VarB.e = nz2Var;
                hashSet.add(ep1VarB.D());
                ep1 ep1VarB2 = oz2.b();
                ep1VarB2.G();
                ep1VarB2.J(32);
                ep1VarB2.L();
                ep1VarB2.e = nz2Var;
                hashSet.add(ep1VarB2.D());
                qp0 qp0VarB = yy2.b();
                qp0VarB.r(16);
                qp0VarB.u(32);
                qp0VarB.A(16);
                qp0VarB.x(16);
                wy2 wy2Var = wy2.e;
                qp0VarB.e = wy2Var;
                vy2 vy2Var = vy2.e;
                qp0VarB.f = vy2Var;
                hashSet.add(qp0VarB.p());
                qp0 qp0VarB2 = yy2.b();
                qp0VarB2.r(32);
                qp0VarB2.u(32);
                qp0VarB2.A(32);
                qp0VarB2.x(16);
                qp0VarB2.e = wy2Var;
                qp0VarB2.f = vy2Var;
                hashSet.add(qp0VarB2.p());
                hashSet.add(new f23(rz2.h));
                rc2 rc2VarB = r73.b();
                rc2VarB.H(64);
                rc2VarB.c = q73.d;
                hashSet.add(rc2VarB.G());
                return Collections.unmodifiableSet(hashSet);
            case 15:
                List list3 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_item_scoped_custom_parameters", 27L, 23).get()).longValue());
            case 16:
                List list4 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.rb.attribution.max_queue_time", 864000000L, 57).get();
            case 18:
                List list5 = h13.a;
                return (Boolean) kq2.a.get();
        }
    }

    @Override // defpackage.gd1
    public void j() {
    }

    @Override // defpackage.gd1
    public void l(int i2, Object obj) {
    }
}
