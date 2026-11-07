package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import androidx.viewpager.widget.ViewPager;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sh1 implements nq, rs2, cw1, hv2, ze3, yc3, ed3, qm2, kr3 {
    public static Boolean c;
    public final /* synthetic */ int a;
    public static final sh1 b = new sh1(0);
    public static final sh1 d = new sh1(1);
    public static final sh1 e = new sh1(2);
    public static final /* synthetic */ sh1 f = new sh1(12);
    public static final /* synthetic */ sh1 i = new sh1(13);
    public static final /* synthetic */ sh1 v = new sh1(14);
    public static final /* synthetic */ sh1 w = new sh1(15);
    public static final /* synthetic */ sh1 W = new sh1(16);
    public static final /* synthetic */ sh1 X = new sh1(17);

    public sh1(ViewPager viewPager) {
        this.a = 9;
    }

    public static boolean f(j50 j50Var, Editable editable, int i2, int i3, boolean z) {
        int iMin;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i3, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    iMin = Math.min(selectionEnd + i3, editable.length());
                }
                c22[] c22VarArr = (c22[]) editable.getSpans(selectionStart, iMin, c22.class);
                if (c22VarArr != null && c22VarArr.length > 0) {
                    for (c22 c22Var : c22VarArr) {
                        int spanStart = editable.getSpanStart(c22Var);
                        int spanEnd = editable.getSpanEnd(c22Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    j50Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    j50Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static final CharSequence i(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // defpackage.kr3
    public /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #3 {, blocks: (B:11:0x0018, B:15:0x0022, B:23:0x0036, B:29:0x004b, B:21:0x0031, B:18:0x002d, B:26:0x0047), top: B:44:0x0018, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public wa b() {
        wa waVar;
        wa waVar2 = null;
        if (mt.a.contains(wa.class)) {
            waVar = null;
        } else {
            try {
                waVar = wa.d;
            } catch (Throwable th) {
                mt.a(wa.class, th);
                waVar = null;
            }
        }
        if (waVar != null) {
            return waVar;
        }
        synchronized (this) {
            if (!i90.q.get()) {
                return null;
            }
            if (mt.a.contains(wa.class)) {
                if (waVar2 == null) {
                    waVar2 = new wa(0);
                    if (!mt.a.contains(wa.class)) {
                        try {
                            wa.d = waVar2;
                        } catch (Throwable th2) {
                            mt.a(wa.class, th2);
                        }
                    }
                }
                return waVar2;
            }
            try {
                waVar2 = wa.d;
            } catch (Throwable th3) {
                mt.a(wa.class, th3);
            }
            if (waVar2 == null) {
                waVar2 = new wa(0);
                if (!mt.a.contains(wa.class)) {
                    wa.d = waVar2;
                }
            }
            return waVar2;
            throw th;
        }
    }

    public synchronized ac2 c() {
        ac2 ac2Var;
        try {
            if (ac2.Z == null) {
                co coVarX = co.x(i90.a());
                coVarX.getClass();
                ac2.Z = new ac2(coVarX, new x1(1));
            }
            ac2Var = ac2.Z;
            if (ac2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                ac2Var = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ac2Var;
    }

    @Override // defpackage.nq
    public Object d(co coVar) {
        Object objG = coVar.g(new je1(rh.class, Executor.class));
        objG.getClass();
        return new h80((Executor) objG);
    }

    public Intent e(Context context) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && k90.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null && k90.a(context, "com.facebook.wakizashi")) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) {
        d93 d93Var = (d93) zi0Var;
        return wf3.d("type.googleapis.com/google.crypto.tink.HpkePublicKey", y83.b(d93Var).b(), 4, (ip3) y83.g.E(d93Var.f.d), d93Var.i);
    }

    public int h(String str, List list, int i2) {
        if (mt.a.contains(this)) {
            return 0;
        }
        try {
            Context contextA = i90.a();
            Intent intentE = e(contextA);
            int i3 = 2;
            if (intentE == null) {
                return 2;
            }
            rh1 rh1Var = new rh1();
            try {
                if (!contextA.bindService(intentE, rh1Var, 1)) {
                    return 3;
                }
                try {
                    try {
                        rh1Var.a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = rh1Var.b;
                        if (iBinder != null) {
                            hn0 hn0VarA = gn0.a(iBinder);
                            Bundle bundleK = qh1.k(str, list, i2);
                            if (bundleK != null) {
                                ((fn0) hn0VarA).a(bundleK);
                                bundleK.toString();
                            }
                            i3 = 1;
                        }
                        contextA.unbindService(rh1Var);
                        return i3;
                    } catch (InterruptedException unused) {
                        i90 i90Var = i90.a;
                        contextA.unbindService(rh1Var);
                        return 3;
                    }
                } catch (RemoteException unused2) {
                    i90 i90Var2 = i90.a;
                    contextA.unbindService(rh1Var);
                    return 3;
                }
            } catch (Throwable th) {
                contextA.unbindService(rh1Var);
                i90 i90Var3 = i90.a;
                throw th;
            }
        } catch (Throwable th2) {
            mt.a(this, th2);
            return 0;
        }
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        xn3 xn3Var = (xn3) vf3Var.c;
        if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            e.g(ts.j("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", xn3Var.B()));
            return null;
        }
        try {
            return t03.a(ep3.u(xn3Var.A(), wr2.b), xn3Var.z());
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        switch (this.a) {
            case 19:
                if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    e.g("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                    return null;
                }
                try {
                    jj3 jj3VarU = jj3.u((jr2) wf3Var.e, wr2.b);
                    if (jj3VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ud2 ud2VarB = fz2.b();
                    ud2VarB.w(jj3VarU.z().b());
                    ud2VarB.o(jj3VarU.y().t());
                    ud2VarB.A();
                    ud2VarB.d = t23.a((ip3) wf3Var.f);
                    fz2 fz2VarN = ud2VarB.n();
                    p11 p11Var = new p11(27);
                    p11Var.c = null;
                    p11Var.d = null;
                    p11Var.b = fz2VarN;
                    p11Var.c = new ox1(tr3.a(jj3VarU.z().o()));
                    p11Var.d = (Integer) wf3Var.i;
                    return p11Var.p();
                } catch (ks2 unused) {
                    tv2.f("Parsing AesEaxKey failed");
                    return null;
                }
            default:
                if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    e.g("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    mp3 mp3VarU = mp3.u((jr2) wf3Var.e, wr2.b);
                    if (mp3VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (mp3VarU.z().b() == 32) {
                        return l13.I(s13.b(h63.a((ip3) wf3Var.f), mp3VarU.y().t()), new ox1(tr3.a(mp3VarU.z().o())), (Integer) wf3Var.i);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (ks2 unused2) {
                    tv2.f("Parsing XAesGcmKey failed");
                    return null;
                }
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 12:
                List list = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.store.max_stored_events_per_app", 100000L, 20).get()).longValue());
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sgtm.batch.long_queuing_threshold", 240000L, 40).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.max_queue_time", 518400000L, 73).get();
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sdk.attribution.cache.ttl", 604800000L, 61).get();
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L, 25).get()).longValue());
            default:
                List list6 = h13.a;
                return (Boolean) rp2.a.get();
        }
    }

    @Override // defpackage.rs2
    public boolean zzb(Class cls) {
        return cs2.class.isAssignableFrom(cls);
    }

    public /* synthetic */ sh1(int i2) {
        this.a = i2;
    }

    @Override // defpackage.rs2
    public bt2 zza(Class cls) {
        if (cs2.class.isAssignableFrom(cls)) {
            try {
                return (bt2) cs2.f(cls.asSubclass(cs2.class)).d(3);
            } catch (Exception e2) {
                sm0.m("Unable to get message info for ".concat(cls.getName()), e2);
                return null;
            }
        }
        e.g("Unsupported message type: ".concat(cls.getName()));
        return null;
    }
}
