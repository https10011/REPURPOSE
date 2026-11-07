package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w93 extends k13 {
    public int W;
    public x73 X;
    public x73 Y;
    public PriorityQueue Z;
    public p73 a0;
    public final AtomicLong b0;
    public aa0 c;
    public long c0;
    public rd2 d;
    public final t73 d0;
    public final CopyOnWriteArraySet e;
    public boolean e0;
    public boolean f;
    public x73 f0;
    public p93 g0;
    public x73 h0;
    public final AtomicReference i;
    public final ox1 i0;
    public final Object v;
    public boolean w;

    public w93(y53 y53Var) {
        super(y53Var);
        this.e = new CopyOnWriteArraySet();
        this.v = new Object();
        this.w = false;
        this.W = 1;
        this.e0 = true;
        this.i0 = new ox1(this);
        this.i = new AtomicReference();
        this.a0 = p73.c;
        this.c0 = -1L;
        this.b0 = new AtomicLong(0L);
        this.d0 = new t73(y53Var);
    }

    @Override // defpackage.k13
    public final boolean H() {
        return false;
    }

    public final void I(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        y53 y53Var = (y53) this.a;
        y53Var.X.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (y53Var.d.P(null, h13.e1)) {
            y53Var.X.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        J(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r5 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w93.J(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v11 ??, still in use, count: 1, list:
          (r14v11 ?? I:??[OBJECT, ARRAY]) from 0x0501: INVOKE (r2v9 ?? I:int) = (r14v11 ?? I:??[OBJECT, ARRAY]) VIRTUAL call: wd3.c():int A[MD:():int (m)] (LINE:1282)
        	at jadx.core.utils.InsnRemover.removeSsaVar(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:179)
        	at jadx.core.utils.InsnRemover.unbindResult(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.utils.InsnRemover.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at ep.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:10)
        	at java.util.ArrayList.forEach(ArrayList.java:1621)
        	at jadx.core.utils.InsnRemover.unbindInsns(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:16)
        	at jadx.core.utils.InsnRemover.perform(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:42)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:68)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:8)
        */
    public final void K() {
        /*
            Method dump skipped, instruction units count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w93.K():void");
    }

    public final void L(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        D();
        y53 y53Var = (y53) this.a;
        y53Var.X.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (y53Var.d.P(null, h13.e1)) {
            y53Var.X.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        M(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void M(long j, long j2, Bundle bundle, String str, String str2) {
        D();
        boolean z = true;
        if (this.d != null && !qf3.i0(str2)) {
            z = false;
        }
        N(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:201:0x051f  */
    /* JADX WARN: Code duplicated, block: B:232:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:61:0x016e  */
    public final void N(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        w93 w93Var;
        qf3 qf3Var;
        h43 h43Var;
        h43 h43Var2;
        ox1 ox1Var;
        boolean z4;
        String str3;
        qf3 qf3Var2;
        long j3;
        h43 h43Var3;
        boolean zA;
        long j4;
        ua3 ua3Var;
        qf3 qf3Var3;
        int i;
        long j5;
        boolean zL;
        Iterator it;
        y53 y53Var;
        Bundle[] bundleArr;
        int i2;
        int length;
        long j6 = j;
        gu2.l(str);
        gu2.o(bundle);
        D();
        F();
        y53 y53Var2 = (y53) this.a;
        boolean zA2 = y53Var2.a();
        td3 td3Var = y53Var2.v;
        is2 is2Var = y53Var2.d;
        Context context = y53Var2.a;
        qf3 qf3Var4 = y53Var2.w;
        c33 c33Var = y53Var2.f;
        if (!zA2) {
            y53.l(c33Var);
            c33Var.Z.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = y53Var2.q().X;
        if (list != null && !list.contains(str2)) {
            y53.l(c33Var);
            c33Var.Z.c(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!y53Var2.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    y53.l(c33Var);
                    c33Var.w.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                y53.l(c33Var);
                c33Var.Y.a("Tag Manager is not found and thus will not be used");
            }
        }
        p23 p23Var = y53Var2.W;
        h43 h43Var4 = y53Var2.e;
        r41 r41Var = y53Var2.X;
        if (!is2Var.P(null, h13.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            r41Var.getClass();
            w93Var = this;
            w93Var.P(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            w93Var = this;
        }
        if (!z || qf3.W[0].equals(str2)) {
            qf3Var = qf3Var4;
            h43Var = h43Var4;
        } else {
            y53.j(qf3Var4);
            y53.j(h43Var4);
            h43Var = h43Var4;
            qf3Var = qf3Var4;
            qf3Var.R(bundle, h43Var.l0.k());
        }
        ox1 ox1Var2 = w93Var.i0;
        if (z3 || "_iap".equals(str2)) {
            h43Var2 = h43Var;
            ox1Var = ox1Var2;
        } else {
            y53.j(qf3Var);
            int i3 = 2;
            if (qf3Var.H0("event", str2)) {
                ox1Var = ox1Var2;
                h43Var2 = h43Var;
                if (qf3Var.J0("event", gu2.g, ((y53) qf3Var.a).d.P(null, h13.f1) ? gu2.i : gu2.h, str2)) {
                    i2 = 40;
                    if (qf3Var.K0(40, "event", str2)) {
                        i3 = 0;
                    }
                } else {
                    i3 = 13;
                }
                if (i3 != 0) {
                    y53.l(c33Var);
                    c33Var.v.b(p23Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                    y53.j(qf3Var);
                    String strL = qf3.L(i2, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    qf3.W(ox1Var, null, i3, "_ev", strL, length);
                    return;
                }
            } else {
                h43Var2 = h43Var;
                ox1Var = ox1Var2;
            }
            i2 = 40;
            if (i3 != 0) {
                y53.l(c33Var);
                c33Var.v.b(p23Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                y53.j(qf3Var);
                String strL2 = qf3.L(i2, str2, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                qf3.W(ox1Var, null, i3, "_ev", strL2, length);
                return;
            }
        }
        ua3 ua3Var2 = y53Var2.Y;
        y53.k(ua3Var2);
        ja3 ja3VarI = ua3Var2.I(false);
        if (ja3VarI != null && !bundle.containsKey("_sc")) {
            ja3VarI.d = true;
        }
        qf3.A0(ja3VarI, bundle, z && !z3);
        boolean zEquals = "am".equals(str);
        boolean zI0 = qf3.i0(str2);
        if (!z || w93Var.d == null || zI0) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                y53.l(c33Var);
                c33Var.Z.c(p23Var.a(str2), p23Var.e(bundle), "Passing event to registered event handler (FE)");
                gu2.o(w93Var.d);
                rd2 rd2Var = w93Var.d;
                rd2Var.getClass();
                try {
                    rx2 rx2Var = (rx2) ((ux2) rd2Var.b);
                    Parcel parcelF = rx2Var.F();
                    parcelF.writeString(str);
                    parcelF.writeString(str2);
                    fv2.b(parcelF, bundle);
                    parcelF.writeLong(j6);
                    rx2Var.G(parcelF, 1);
                    return;
                } catch (RemoteException e2) {
                    y53 y53Var3 = ((AppMeasurementDynamiteService) rd2Var.c).a;
                    if (y53Var3 != null) {
                        c33 c33Var2 = y53Var3.f;
                        y53.l(c33Var2);
                        c33Var2.w.b(e2, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z4 = true;
        }
        if (y53Var2.h()) {
            y53.j(qf3Var);
            y53 y53Var4 = (y53) qf3Var.a;
            int iL0 = qf3Var.L0(str2);
            if (iL0 != 0) {
                y53.l(c33Var);
                c33Var.v.b(p23Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                String strL3 = qf3.L(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                y53.j(qf3Var);
                qf3.W(ox1Var, null, iL0, "_ev", strL3, length2);
                return;
            }
            Bundle bundleO = qf3Var.O(str2, bundle, yv2.F("_o", "_sn", "_sc", "_si"), z3);
            gu2.o(bundleO);
            y53.k(ua3Var2);
            qf3 qf3Var5 = qf3Var;
            if (ua3Var2.I(false) == null || !"_ae".equals(str2)) {
                str3 = "_o";
                qf3Var2 = qf3Var5;
                j3 = 0;
            } else {
                y53.k(td3Var);
                pd3 pd3Var = td3Var.f;
                j3 = 0;
                ((y53) pd3Var.d.a).X.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                str3 = "_o";
                long j7 = jElapsedRealtime - pd3Var.b;
                pd3Var.b = jElapsedRealtime;
                qf3Var2 = qf3Var5;
                if (j7 > 0) {
                    qf3Var2.q0(bundleO, j7);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                String string2 = bundleO.getString("_ffr");
                int i4 = ku1.a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                h43 h43Var5 = y53Var4.e;
                y53.j(h43Var5);
                if (Objects.equals(string2, h43Var5.i0.j())) {
                    c33 c33Var3 = y53Var4.f;
                    y53.l(c33Var3);
                    c33Var3.Z.a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    h43 h43Var6 = y53Var4.e;
                    y53.j(h43Var6);
                    h43Var6.i0.k(string2);
                }
            } else if ("_ae".equals(str2)) {
                h43 h43Var7 = y53Var4.e;
                y53.j(h43Var7);
                String strJ = h43Var7.i0.j();
                if (!TextUtils.isEmpty(strJ)) {
                    bundleO.putString("_ffr", strJ);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleO);
            if (is2Var.P(null, h13.S0)) {
                y53.k(td3Var);
                td3Var.D();
                zA = td3Var.d;
                h43Var3 = h43Var2;
            } else {
                y53.j(h43Var2);
                h43Var3 = h43Var2;
                zA = h43Var3.f0.a();
            }
            y53.j(h43Var3);
            if (h43Var3.c0.a() > j3 && h43Var3.N(j6) && zA) {
                y53.l(c33Var);
                c33Var.a0.a("Current session is expired, remove the session number, ID, and engagement time");
                r41Var.getClass();
                j4 = j3;
                ua3Var = ua3Var2;
                qf3Var3 = qf3Var2;
                i = 0;
                w93Var.P(System.currentTimeMillis(), null, "auto", "_sid");
                P(System.currentTimeMillis(), null, "auto", "_sno");
                P(System.currentTimeMillis(), null, "auto", "_se");
                h43Var3.d0.b(j4);
            } else {
                j4 = j3;
                ua3Var = ua3Var2;
                qf3Var3 = qf3Var2;
                i = 0;
            }
            if (bundleO.getLong("extend_session", j4) == 1) {
                y53.l(c33Var);
                c33Var.a0.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                y53.k(td3Var);
                j5 = j2;
                td3Var.e.z(j6, j5);
            } else {
                j5 = j2;
            }
            ArrayList arrayList2 = new ArrayList(bundleO.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i5 = i; i5 < size; i5++) {
                String str4 = (String) arrayList2.get(i5);
                if (str4 != null) {
                    y53.j(qf3Var3);
                    Object obj = bundleO.get(str4);
                    if (obj instanceof Bundle) {
                        Bundle[] bundleArr2 = new Bundle[1];
                        bundleArr2[i] = (Bundle) obj;
                        bundleArr = bundleArr2;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleO.putParcelableArray(str4, bundleArr);
                    }
                }
            }
            int i6 = i;
            while (i6 < arrayList.size()) {
                Bundle bundleK0 = (Bundle) arrayList.get(i6);
                String str5 = i6 != 0 ? "_ep" : str2;
                String str6 = str3;
                bundleK0.putString(str6, str);
                qf3 qf3Var6 = qf3Var3;
                if (z2) {
                    bundleK0 = qf3Var6.k0(bundleK0);
                }
                Bundle bundle2 = bundleK0;
                qf3Var3 = qf3Var6;
                long j8 = j6;
                zzbh zzbhVar = new zzbh(str5, new zzbf(bundle2), str, j8, j5);
                lc3 lc3VarO = y53Var2.o();
                lc3VarO.getClass();
                lc3VarO.D();
                lc3VarO.F();
                lc3VarO.Q();
                m23 m23VarN = ((y53) lc3VarO.a).n();
                m23VarN.getClass();
                Parcel parcelObtain = Parcel.obtain();
                hu2.a(zzbhVar, parcelObtain, i);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    c33 c33Var4 = ((y53) m23VarN.a).f;
                    y53.l(c33Var4);
                    c33Var4.i.a("Event is too long for local database. Sending event directly to service");
                    zL = false;
                } else {
                    zL = m23VarN.L(bArrMarshall, 0);
                }
                lc3VarO.S(new r33(lc3VarO, lc3VarO.U(true), zL, (AbstractSafeParcelable) zzbhVar, 2));
                if (!z4) {
                    Iterator it2 = this.e.iterator();
                    while (it2.hasNext()) {
                        ag3 ag3Var = (ag3) it2.next();
                        Bundle bundle3 = new Bundle(bundle2);
                        ag3Var.getClass();
                        try {
                            rx2 rx2Var2 = (rx2) ag3Var.a;
                            Parcel parcelF2 = rx2Var2.F();
                            parcelF2.writeString(str);
                            try {
                                parcelF2.writeString(str2);
                                fv2.b(parcelF2, bundle3);
                                parcelF2.writeLong(j8);
                                it = it2;
                                try {
                                    rx2Var2.G(parcelF2, 1);
                                } catch (RemoteException e3) {
                                    e = e3;
                                    y53Var = ag3Var.b.a;
                                    if (y53Var != null) {
                                        c33 c33Var5 = y53Var.f;
                                        y53.l(c33Var5);
                                        c33Var5.w.b(e, "Event listener threw exception");
                                    }
                                }
                            } catch (RemoteException e4) {
                                e = e4;
                                it = it2;
                                y53Var = ag3Var.b.a;
                                if (y53Var != null) {
                                    c33 c33Var6 = y53Var.f;
                                    y53.l(c33Var6);
                                    c33Var6.w.b(e, "Event listener threw exception");
                                }
                                it2 = it;
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                        it2 = it;
                    }
                }
                i6++;
                j5 = j2;
                j6 = j8;
                str3 = str6;
                i = 0;
            }
            y53.k(ua3Var);
            if (ua3Var.I(false) == null || !"_ae".equals(str2)) {
                return;
            }
            y53.k(td3Var);
            r41Var.getClass();
            td3Var.f.a(true, true, SystemClock.elapsedRealtime());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void O(String str, String str2, Object obj, boolean z, long j) {
        int iN0;
        int length;
        y53 y53Var = (y53) this.a;
        if (z) {
            qf3 qf3Var = y53Var.w;
            y53.j(qf3Var);
            iN0 = qf3Var.N0(str2);
        } else {
            qf3 qf3Var2 = y53Var.w;
            y53.j(qf3Var2);
            if (!qf3Var2.H0("user property", str2)) {
                iN0 = 6;
            } else if (qf3Var2.J0("user property", r93.i, null, str2)) {
                ((y53) qf3Var2.a).getClass();
                if (qf3Var2.K0(24, "user property", str2)) {
                    iN0 = 0;
                } else {
                    iN0 = 6;
                }
            } else {
                iN0 = 15;
            }
        }
        ox1 ox1Var = this.i0;
        if (iN0 != 0) {
            y53.j(y53Var.w);
            String strL = qf3.L(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            y53.j(y53Var.w);
            qf3.W(ox1Var, null, iN0, "_ev", strL, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            t53 t53Var = y53Var.i;
            y53.l(t53Var);
            t53Var.N(new az1(this, str3, str2, null, j, 2));
            return;
        }
        qf3 qf3Var3 = y53Var.w;
        qf3 qf3Var4 = y53Var.w;
        y53.j(qf3Var3);
        int iT = qf3Var3.T(obj, str2);
        if (iT != 0) {
            y53.j(qf3Var4);
            String strL2 = qf3.L(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            y53.j(qf3Var4);
            qf3.W(ox1Var, null, iT, "_ev", strL2, length);
            return;
        }
        y53.j(qf3Var4);
        Object objU = qf3Var4.U(obj, str2);
        if (objU != null) {
            t53 t53Var2 = y53Var.i;
            y53.l(t53Var2);
            t53Var2.N(new az1(this, str3, str2, objU, j, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    public final void P(long j, Object obj, String str, String str2) {
        String str3;
        boolean zL;
        Object objValueOf = obj;
        y53 y53Var = (y53) this.a;
        gu2.l(str);
        gu2.l(str2);
        D();
        F();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    h43 h43Var = y53Var.e;
                    y53.j(h43Var);
                    h43Var.Z.k(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    h43 h43Var2 = y53Var.e;
                    y53.j(h43Var2);
                    h43Var2.Z.k("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                h43 h43Var3 = y53Var.e;
                y53.j(h43Var3);
                h43Var3.Z.k("unset");
            } else {
                str4 = str2;
            }
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.a0.c("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!y53Var.a()) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.a0.a("User property not set since app measurement is disabled");
            return;
        }
        if (y53Var.h()) {
            zzpl zzplVar = new zzpl(j, obj2, str3, str);
            lc3 lc3VarO = y53Var.o();
            lc3VarO.D();
            lc3VarO.F();
            lc3VarO.Q();
            m23 m23VarN = ((y53) lc3VarO.a).n();
            m23VarN.getClass();
            Parcel parcelObtain = Parcel.obtain();
            qa3.a(zzplVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                c33 c33Var3 = ((y53) m23VarN.a).f;
                y53.l(c33Var3);
                c33Var3.i.a("User property too long for local database. Sending directly to service");
                zL = false;
            } else {
                zL = m23VarN.L(bArrMarshall, 1);
            }
            lc3VarO.S(new r33(lc3VarO, lc3VarO.U(true), zL, (AbstractSafeParcelable) zzplVar, 1));
        }
    }

    public final void Q() {
        D();
        F();
        y53 y53Var = (y53) this.a;
        if (y53Var.h()) {
            is2 is2Var = y53Var.d;
            ((y53) is2Var.a).getClass();
            Boolean boolR = is2Var.R("google_analytics_deferred_deep_link_enabled");
            if (boolR != null && boolR.booleanValue()) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.Z.a("Deferred Deep Link feature enabled.");
                t53 t53Var = y53Var.i;
                y53.l(t53Var);
                t53Var.N(new v73(this, 2));
            }
            lc3 lc3VarO = y53Var.o();
            lc3VarO.D();
            lc3VarO.F();
            zzr zzrVarU = lc3VarO.U(true);
            lc3VarO.Q();
            y53 y53Var2 = (y53) lc3VarO.a;
            y53Var2.d.P(null, h13.W0);
            y53Var2.n().L(new byte[0], 3);
            lc3VarO.S(new gb3(lc3VarO, zzrVarU, 1));
            this.e0 = false;
            h43 h43Var = y53Var.e;
            y53.j(h43Var);
            h43Var.D();
            String string = h43Var.I().getString("previous_os_version", null);
            ((y53) h43Var.a).p().G();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = h43Var.I().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            y53Var.p().G();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            L("auto", "_ou", bundle);
        }
    }

    public final void R(Bundle bundle, long j) {
        y53 y53Var = (y53) this.a;
        gu2.o(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.w.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        d42.K(bundle2, "app_id", String.class, null);
        d42.K(bundle2, "origin", String.class, null);
        d42.K(bundle2, "name", String.class, null);
        d42.K(bundle2, "value", Object.class, null);
        d42.K(bundle2, "trigger_event_name", String.class, null);
        d42.K(bundle2, "trigger_timeout", Long.class, 0L);
        d42.K(bundle2, "timed_out_event_name", String.class, null);
        d42.K(bundle2, "timed_out_event_params", Bundle.class, null);
        d42.K(bundle2, "triggered_event_name", String.class, null);
        d42.K(bundle2, "triggered_event_params", Bundle.class, null);
        d42.K(bundle2, "time_to_live", Long.class, 0L);
        d42.K(bundle2, "expired_event_name", String.class, null);
        d42.K(bundle2, "expired_event_params", Bundle.class, null);
        gu2.l(bundle2.getString("name"));
        gu2.l(bundle2.getString("origin"));
        gu2.o(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        qf3 qf3Var = y53Var.w;
        p23 p23Var = y53Var.W;
        c33 c33Var2 = y53Var.f;
        y53.j(qf3Var);
        if (qf3Var.N0(string) != 0) {
            y53.l(c33Var2);
            c33Var2.f.b(p23Var.c(string), "Invalid conditional user property name");
            return;
        }
        y53.j(qf3Var);
        if (qf3Var.T(obj, string) != 0) {
            y53.l(c33Var2);
            c33Var2.f.c(p23Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objU = qf3Var.U(obj, string);
        if (objU == null) {
            y53.l(c33Var2);
            c33Var2.f.c(p23Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        d42.I(bundle2, objU);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            y53.l(c33Var2);
            c33Var2.f.c(p23Var.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            y53.l(c33Var2);
            c33Var2.f.c(p23Var.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            t53 t53Var = y53Var.i;
            y53.l(t53Var);
            t53Var.N(new o83(this, bundle2, 0));
        }
    }

    public final void S(String str, String str2, Bundle bundle) {
        y53 y53Var = (y53) this.a;
        y53Var.X.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gu2.l(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        t53 t53Var = y53Var.i;
        y53.l(t53Var);
        t53Var.N(new o83(this, bundle2, 1));
    }

    public final String T() {
        y53 y53Var = (y53) this.a;
        try {
            return ia.w(y53Var.a, y53Var.c0);
        } catch (IllegalStateException e) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void U(p73 p73Var, long j, boolean z) {
        int i = p73Var.b;
        D();
        F();
        y53 y53Var = (y53) this.a;
        h43 h43Var = y53Var.e;
        c33 c33Var = y53Var.f;
        y53.j(h43Var);
        p73 p73VarL = h43Var.L();
        if (j <= this.c0 && p73.l(p73VarL.b, i)) {
            y53.l(c33Var);
            c33Var.Y.b(p73Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        h43 h43Var2 = y53Var.e;
        y53.j(h43Var2);
        h43Var2.D();
        if (!p73.l(i, h43Var2.I().getInt("consent_source", 100))) {
            y53.l(c33Var);
            c33Var.Y.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = h43Var2.I().edit();
        editorEdit.putString("consent_settings", p73Var.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        y53.l(c33Var);
        c33Var.a0.b(p73Var, "Setting storage consent(FE)");
        this.c0 = j;
        if (y53Var.o().O()) {
            lc3 lc3VarO = y53Var.o();
            lc3VarO.D();
            lc3VarO.F();
            lc3VarO.S(new ec3(lc3VarO, 2));
        } else {
            lc3 lc3VarO2 = y53Var.o();
            lc3VarO2.D();
            lc3VarO2.F();
            if (lc3VarO2.N()) {
                lc3VarO2.S(new gb3(lc3VarO2, lc3VarO2.U(false)));
            }
        }
        if (z) {
            y53Var.o().I(new AtomicReference());
        }
    }

    public final void V(Boolean bool, boolean z) {
        D();
        F();
        y53 y53Var = (y53) this.a;
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        c33Var.Z.b(bool, "Setting app measurement enabled (FE)");
        h43 h43Var = y53Var.e;
        y53.j(h43Var);
        h43Var.D();
        SharedPreferences.Editor editorEdit = h43Var.I().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            h43Var.D();
            SharedPreferences.Editor editorEdit2 = h43Var.I().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        t53 t53Var = y53Var.i;
        y53.l(t53Var);
        t53Var.D();
        if (y53Var.m0 || !(bool == null || bool.booleanValue())) {
            W();
        }
    }

    public final void W() {
        D();
        y53 y53Var = (y53) this.a;
        h43 h43Var = y53Var.e;
        c33 c33Var = y53Var.f;
        r41 r41Var = y53Var.X;
        y53.j(h43Var);
        String strJ = h43Var.Z.j();
        int i = 1;
        if (strJ != null) {
            if ("unset".equals(strJ)) {
                r41Var.getClass();
                P(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strJ) ? 0L : 1L);
                r41Var.getClass();
                P(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!y53Var.a() || !this.e0) {
            y53.l(c33Var);
            c33Var.Z.a("Updating Scion state (FE)");
            lc3 lc3VarO = y53Var.o();
            lc3VarO.D();
            lc3VarO.F();
            lc3VarO.S(new gb3(lc3VarO, lc3VarO.U(true), 3));
            return;
        }
        y53.l(c33Var);
        c33Var.Z.a("Recording app launch after enabling measurement for the first time (FE)");
        Q();
        td3 td3Var = y53Var.v;
        y53.k(td3Var);
        td3Var.e.y();
        t53 t53Var = y53Var.i;
        y53.l(t53Var);
        t53Var.N(new v73(this, i));
    }

    public final void X() {
        y53 y53Var = (y53) this.a;
        if (!(y53Var.a.getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) y53Var.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    public final void Y(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        l73 l73Var;
        Boolean bool2;
        y53 y53Var = (y53) this.a;
        F();
        p73 p73Var = p73.c;
        n73[] n73VarArr = m73.STORAGE.a;
        int length = n73VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = n73VarArr[i2].a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.X.b(string, "Ignoring invalid consent setting");
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.X.a("Valid consent values are 'granted', 'denied'");
        }
        t53 t53Var = y53Var.i;
        y53.l(t53Var);
        boolean zK = t53Var.K();
        p73 p73VarB = p73.b(i, bundle);
        Iterator it = p73VarB.a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            l73Var = l73.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((l73) it.next()) != l73Var) {
                a0(p73VarB, zK);
                break;
            }
        }
        pu2 pu2VarC = pu2.c(i, bundle);
        Iterator it2 = pu2VarC.e.values().iterator();
        while (it2.hasNext()) {
            if (((l73) it2.next()) != l73Var) {
                Z(pu2VarC, zK);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = p73.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zK) {
                P(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                O(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void Z(pu2 pu2Var, boolean z) {
        z83 z83Var = new z83(1, this, pu2Var);
        if (z) {
            D();
            z83Var.run();
        } else {
            t53 t53Var = ((y53) this.a).i;
            y53.l(t53Var);
            t53Var.N(z83Var);
        }
    }

    public final void a0(p73 p73Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        p73 p73Var2;
        F();
        int i = p73Var.b;
        if (i != -10) {
            l73 l73Var = (l73) p73Var.a.get(n73.AD_STORAGE);
            if (l73Var == null) {
                l73Var = l73.UNINITIALIZED;
            }
            l73 l73Var2 = l73.UNINITIALIZED;
            if (l73Var == l73Var2) {
                l73 l73Var3 = (l73) p73Var.a.get(n73.ANALYTICS_STORAGE);
                if (l73Var3 == null) {
                    l73Var3 = l73Var2;
                }
                if (l73Var3 == l73Var2) {
                    c33 c33Var = ((y53) this.a).f;
                    y53.l(c33Var);
                    c33Var.X.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.v) {
            try {
                z2 = false;
                if (p73.l(i, this.a0.b)) {
                    p73 p73Var3 = this.a0;
                    EnumMap enumMap = p73Var.a;
                    n73[] n73VarArr = (n73[]) enumMap.keySet().toArray(new n73[0]);
                    int length = n73VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        n73 n73Var = n73VarArr[i2];
                        l73 l73Var4 = (l73) enumMap.get(n73Var);
                        l73 l73Var5 = (l73) p73Var3.a.get(n73Var);
                        l73 l73Var6 = l73.DENIED;
                        if (l73Var4 == l73Var6 && l73Var5 != l73Var6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    n73 n73Var2 = n73.ANALYTICS_STORAGE;
                    if (p73Var.i(n73Var2) && !this.a0.i(n73Var2)) {
                        z2 = true;
                    }
                    p73Var = p73Var.k(this.a0);
                    this.a0 = p73Var;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                p73Var2 = p73Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            c33 c33Var2 = ((y53) this.a).f;
            y53.l(c33Var2);
            c33Var2.Y.b(p73Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.b0.getAndIncrement();
        if (z3) {
            this.i.set(null);
            c93 c93Var = new c93(this, p73Var2, andIncrement, z4, 0);
            if (z) {
                D();
                c93Var.run();
                return;
            } else {
                t53 t53Var = ((y53) this.a).i;
                y53.l(t53Var);
                t53Var.P(c93Var);
                return;
            }
        }
        c93 c93Var2 = new c93(this, p73Var2, andIncrement, z4, 1);
        if (z) {
            D();
            c93Var2.run();
        } else if (i == 30 || i == -10) {
            t53 t53Var2 = ((y53) this.a).i;
            y53.l(t53Var2);
            t53Var2.P(c93Var2);
        } else {
            t53 t53Var3 = ((y53) this.a).i;
            y53.l(t53Var3);
            t53Var3.N(c93Var2);
        }
    }

    public final void b0() {
        hq2.a();
        y53 y53Var = (y53) this.a;
        is2 is2Var = y53Var.d;
        t53 t53Var = y53Var.i;
        c33 c33Var = y53Var.f;
        if (is2Var.P(null, h13.P0)) {
            y53.l(t53Var);
            if (t53Var.K()) {
                y53.l(c33Var);
                c33Var.f.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (nk1.n()) {
                y53.l(c33Var);
                c33Var.f.a("Cannot get trigger URIs from main thread");
                return;
            }
            F();
            y53.l(c33Var);
            c33Var.a0.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            y53.l(t53Var);
            t53Var.O(atomicReference, 10000L, "get trigger URIs", new h83(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                y53.l(c33Var);
                c33Var.v.a("Timed out waiting for get trigger URIs");
            } else {
                y53.l(t53Var);
                t53Var.N(new z83(3, this, list));
            }
        }
    }

    public final PriorityQueue c0() {
        if (this.Z == null) {
            this.Z = new PriorityQueue(Comparator.comparing(m93.a, rs.c));
        }
        return this.Z;
    }

    public final void d0() {
        zzoh zzohVar;
        D();
        if (c0().isEmpty() || this.w || (zzohVar = (zzoh) c0().poll()) == null) {
            return;
        }
        y53 y53Var = (y53) this.a;
        qf3 qf3Var = y53Var.w;
        y53.j(qf3Var);
        v21 v21VarA0 = qf3Var.a0();
        if (v21VarA0 != null) {
            this.w = true;
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            z23 z23Var = c33Var.a0;
            String str = zzohVar.a;
            z23Var.b(str, "Registering trigger URI");
            ListenableFuture listenableFutureE = v21VarA0.e(Uri.parse(str));
            int i = 0;
            if (listenableFutureE != null) {
                listenableFutureE.a(new bh0(i, listenableFutureE, new hd2(this, zzohVar)), new ll0(this, 2));
            } else {
                this.w = false;
                c0().add(zzohVar);
            }
        }
    }

    public final void e0(p73 p73Var) {
        D();
        boolean z = (p73Var.i(n73.ANALYTICS_STORAGE) && p73Var.i(n73.AD_STORAGE)) || ((y53) this.a).o().N();
        y53 y53Var = (y53) this.a;
        t53 t53Var = y53Var.i;
        y53.l(t53Var);
        t53Var.D();
        if (z != y53Var.m0) {
            t53 t53Var2 = y53Var.i;
            y53.l(t53Var2);
            t53Var2.D();
            y53Var.m0 = z;
            h43 h43Var = ((y53) this.a).e;
            y53.j(h43Var);
            h43Var.D();
            Boolean boolValueOf = h43Var.I().contains("measurement_enabled_from_api") ? Boolean.valueOf(h43Var.I().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                V(Boolean.valueOf(z), false);
            }
        }
    }
}
