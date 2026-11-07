package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.zzc;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yd2 implements gd0, m90, s81 {
    public static yd2 d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public yd2(Map map, List list) throws GeneralSecurityException {
        this.a = 10;
        this.b = list;
        this.c = map;
        if (((AtomicBoolean) y63.a.b).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                lw2 lw2Var = (lw2) it.next();
                int i = lw2Var.d;
                if (hashSet.contains(Integer.valueOf(i))) {
                    throw new GeneralSecurityException(ts.g(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(i));
                if (lw2Var.e) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            tv2.f("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            throw null;
        }
    }

    public static wf3 B(eo3 eo3Var) {
        return wf3.d(eo3Var.y().A(), eo3Var.y().z(), eo3Var.y().x(), eo3Var.B(), eo3Var.B() == ip3.RAW ? null : Integer.valueOf(eo3Var.t()));
    }

    public static synchronized yd2 a(Context context) {
        try {
            if (d == null) {
                yd2 yd2Var = new yd2(0);
                yd2Var.c = context.getApplicationContext();
                d = yd2Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public static zi0 l(eo3 eo3Var) {
        wf3 wf3VarB = B(eo3Var);
        te3 te3Var = te3.b;
        cg3 cg3Var = (cg3) te3Var.a.get();
        cg3Var.getClass();
        return !cg3Var.b.containsKey(new fg3(wf3.class, (tr3) wf3VarB.d)) ? new qd3(wf3VarB) : te3Var.a(wf3VarB);
    }

    public static final yd2 m(kj0 kj0Var) throws GeneralSecurityException {
        int i;
        dx2 dx2VarJ = (dx2) kj0Var.b;
        if (dx2VarJ == null) {
            try {
                dx2VarJ = sp0.J((dx2VarJ instanceof xd3 ? (xn3) ((xd3) dx2VarJ).a.c : (xn3) ((vf3) te3.b.d(dx2VarJ)).c).c());
            } catch (GeneralSecurityException e) {
                throw new xp(10, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(dx2VarJ)), e);
            }
        }
        ir1 ir1Var = new ir1(7);
        ArrayList arrayList = (ArrayList) ir1Var.c;
        iw2 iw2Var = new iw2(dx2VarJ);
        gp1 gp1Var = gp1.e;
        iw2Var.c = gp1Var;
        iw2Var.a = true;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((iw2) obj).a = false;
        }
        arrayList.add(iw2Var);
        if (ir1Var.b) {
            tv2.f("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        ir1Var.b = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
            if (((iw2) arrayList.get(i3)).c == gp1Var && ((iw2) arrayList.get(i3 + 1)).c != gp1Var) {
                tv2.f("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        Integer numValueOf = null;
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            iw2 iw2Var2 = (iw2) obj2;
            iw2Var2.getClass();
            dx2 dx2Var = iw2Var2.b;
            gp1 gp1Var2 = iw2Var2.c;
            if (gp1Var2 == null) {
                tv2.f("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            if (gp1Var2 == gp1Var) {
                int i5 = 0;
                while (true) {
                    if (i5 != 0 && !hashSet.contains(Integer.valueOf(i5))) {
                        break;
                    }
                    Charset charset = kg3.a;
                    i5 = 0;
                    while (i5 == 0) {
                        byte[] bArrA = xf3.a(4);
                        i5 = (bArrA[3] & 255) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8);
                    }
                }
                i = i5;
            } else {
                i = 0;
            }
            if (hashSet.contains(Integer.valueOf(i))) {
                throw new GeneralSecurityException(ts.g(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(i));
            lw2 lw2Var = new lw2(ie3.b.a(dx2Var, dx2Var.a() ? Integer.valueOf(i) : null), 2, i, iw2Var2.a, false);
            int i6 = i;
            if (iw2Var2.a) {
                if (numValueOf != null) {
                    tv2.f("Two primaries were set");
                    return null;
                }
                numValueOf = Integer.valueOf(i6);
            }
            arrayList2.add(lw2Var);
        }
        if (numValueOf == null) {
            tv2.f("No primary was set");
            return null;
        }
        yd2 yd2Var = new yd2((HashMap) ir1Var.d, arrayList2);
        yd2Var.s();
        return yd2Var;
    }

    public static final yd2 n(pv2 pv2Var, cc3 cc3Var, byte[] bArr) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) pv2Var.a;
        try {
            wr2 wr2Var = wr2.b;
            xl3 xl3VarT = xl3.t(byteArrayInputStream, wr2Var);
            byteArrayInputStream.close();
            if (xl3VarT.x().b() == 0) {
                tv2.f("empty keyset");
                return null;
            }
            try {
                go3 go3VarW = go3.w(cc3Var.g(xl3VarT.x().o(), bArr), wr2Var);
                if (go3VarW == null || go3VarW.t() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                return o(go3VarW);
            } catch (ks2 unused) {
                tv2.f("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static final yd2 o(go3 go3Var) throws GeneralSecurityException {
        zi0 qd3Var;
        boolean z;
        if (go3Var.t() <= 0) {
            tv2.f("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(go3Var.t());
        for (eo3 eo3Var : go3Var.B()) {
            int iT = eo3Var.t();
            try {
                qd3Var = l(eo3Var);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) y63.a.b).get()) {
                    throw e;
                }
                qd3Var = new qd3(B(eo3Var));
                z = true;
            }
            if (((AtomicBoolean) y63.a.b).get() && !x(eo3Var.z())) {
                tv2.f("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            arrayList.add(new lw2(qd3Var, eo3Var.z(), iT, iT == go3Var.z(), z));
        }
        return new yd2(new HashMap(), Collections.unmodifiableList(arrayList));
    }

    public static boolean x(int i) {
        int i2 = uv2.a[ts.v(i)];
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r6.A(r7, r0) == r1) goto L28;
     */
    @Override // defpackage.gd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A(defpackage.id0 r7, defpackage.gs r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nd0
            if (r0 == 0) goto L13
            r0 = r8
            nd0 r0 = (defpackage.nd0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            nd0 r0 = new nd0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ft r1 = defpackage.ft.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.zi0.B(r8)
            goto L7c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r6)
            return r5
        L31:
            cl1 r6 = r0.f
            id0 r7 = r0.e
            yd2 r2 = r0.d
            defpackage.zi0.B(r8)     // Catch: java.lang.Throwable -> L3b
            goto L66
        L3b:
            r7 = move-exception
            goto L85
        L3d:
            defpackage.zi0.B(r8)
            cl1 r8 = new cl1
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r8.<init>(r7, r2)
            java.lang.Object r2 = r6.b     // Catch: java.lang.Throwable -> L82
            ex r2 = (defpackage.ex) r2     // Catch: java.lang.Throwable -> L82
            r0.d = r6     // Catch: java.lang.Throwable -> L7f
            r0.e = r7     // Catch: java.lang.Throwable -> L7f
            r0.f = r8     // Catch: java.lang.Throwable -> L7f
            r0.b = r4     // Catch: java.lang.Throwable -> L7f
            r4 = 6
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L7f
            r4 = 7
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L64
            goto L7b
        L64:
            r2 = r6
            r6 = r8
        L66:
            r6.releaseIntercepted()
            java.lang.Object r6 = r2.c
            gd0 r6 = (defpackage.gd0) r6
            r0.d = r5
            r0.e = r5
            r0.f = r5
            r0.b = r3
            java.lang.Object r6 = r6.A(r7, r0)
            if (r6 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L7f:
            r7 = move-exception
        L80:
            r6 = r8
            goto L85
        L82:
            r6 = move-exception
            r7 = r6
            goto L80
        L85:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd2.A(id0, gs):java.lang.Object");
    }

    public void C(ep1 ep1Var, p11 p11Var) {
        j93 j93Var = new j93(p11Var);
        TreeMap treeMap = (TreeMap) this.b;
        for (Integer num : treeMap.keySet()) {
            fj2 fj2VarA = ((fj2) p11Var.c).clone();
            qt2 qt2VarG = ((et2) treeMap.get(num)).g(ep1Var, Collections.singletonList(j93Var));
            int iH0 = qt2VarG instanceof ep2 ? gu2.h0(((ep2) qt2VarG).a.doubleValue()) : -1;
            if (iH0 == 2 || iH0 == -1) {
                p11Var.c = fj2VarA;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.c;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            qt2 qt2VarG2 = ((et2) treeMap2.get((Integer) it.next())).g(ep1Var, Collections.singletonList(j93Var));
            if (qt2VarG2 instanceof ep2) {
                gu2.h0(((ep2) qt2VarG2).a.doubleValue());
            }
        }
    }

    public lw2 D() {
        for (lw2 lw2Var : (List) this.b) {
            if (lw2Var != null && lw2Var.e) {
                if (lw2Var.c == qv2.c) {
                    return lw2Var;
                }
                uq1.q("Keyset has primary which isn't enabled");
                return null;
            }
        }
        uq1.q("Keyset has no valid primary");
        return null;
    }

    public zd3 E(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        zd3 zd3Var = (zd3) atomicReferenceArray.get(i);
        if (zd3Var != null) {
            return zd3Var;
        }
        vd3 vd3Var = new vd3(str, (bk0) ((k93) this.c).a, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, vd3Var)) {
            if (atomicReferenceArray.get(i) != null) {
                zd3 zd3Var2 = (zd3) atomicReferenceArray.get(i);
                zd3Var2.getClass();
                return zd3Var2;
            }
        }
        return vd3Var;
    }

    public go3 F() {
        try {
            fo3 fo3VarA = go3.A();
            for (lw2 lw2Var : (List) this.b) {
                zi0 zi0VarA = lw2Var.a();
                int i = lw2Var.d;
                int i2 = lw2Var.b;
                wf3 wf3Var = (wf3) te3.b.c(zi0VarA);
                Integer numF = zi0VarA.F();
                if (numF != null && numF.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                do3 do3VarA = eo3.A();
                on3 on3VarT = qn3.t();
                String str = (String) wf3Var.c;
                on3VarT.f();
                qn3.v((qn3) on3VarT.b, str);
                jr2 jr2Var = (jr2) wf3Var.e;
                on3VarT.f();
                qn3.w((qn3) on3VarT.b, jr2Var);
                int i3 = wf3Var.b;
                on3VarT.f();
                qn3.u((qn3) on3VarT.b, i3);
                do3VarA.f();
                eo3.v((eo3) do3VarA.b, (qn3) on3VarT.d());
                do3VarA.f();
                ((eo3) do3VarA.b).zzg = ck1.h(i2);
                do3VarA.f();
                ((eo3) do3VarA.b).zzh = i;
                ip3 ip3Var = (ip3) wf3Var.f;
                do3VarA.f();
                ((eo3) do3VarA.b).zzi = ip3Var.zza();
                eo3 eo3Var = (eo3) do3VarA.d();
                fo3VarA.f();
                go3.y((go3) fo3VarA.b, eo3Var);
                if (lw2Var.e) {
                    fo3VarA.f();
                    ((go3) fo3VarA.b).zze = i;
                }
            }
            return (go3) fo3VarA.d();
        } catch (GeneralSecurityException e) {
            throw new xp(10, e);
        }
    }

    public void b(int i, String str) {
        Context context = (Context) this.c;
        if (context == null) {
            return;
        }
        if (((SharedPreferences) this.b) == null) {
            this.b = d(context);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putInt(str, i).apply();
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
        }
    }

    public void c(String str, String str2) {
        Context context = (Context) this.c;
        if (context == null) {
            throw new Exception("context is null");
        }
        if (((SharedPreferences) this.b) == null) {
            this.b = d(context);
        }
        if (((SharedPreferences) this.b) == null) {
            throw new Exception("sp is null");
        }
        try {
            synchronized (nk1.class) {
            }
            if (!zi0.b.g()) {
                throw new Exception("keystore encrypt error");
            }
            String str3 = new String(Base64.encode(new ep1(6, false).l(str2), 2));
            if (TextUtils.isEmpty(str3)) {
                throw new Exception("rsaCrypter encrypt error");
            }
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.b).edit();
            editorEdit.putString(str, str3);
            editorEdit.apply();
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
            throw e;
        }
    }

    public SharedPreferences d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(am2.k(context) + "_tcrypto", 0);
            this.b = sharedPreferences;
            return sharedPreferences;
        } catch (Exception unused) {
            return null;
        }
    }

    public String e(String str) throws Exception {
        Context context = (Context) this.c;
        if (context == null) {
            throw new Exception("context is null");
        }
        if (((SharedPreferences) this.b) == null) {
            this.b = d(context);
        }
        if (((SharedPreferences) this.b) == null) {
            throw new Exception("sp is null");
        }
        try {
            synchronized (nk1.class) {
            }
            if (!zi0.b.g()) {
                throw new Exception("keystore decrypt error");
            }
            String string = ((SharedPreferences) this.b).getString(str, BuildConfig.FLAVOR);
            if (!TextUtils.isEmpty(string) && !string.contains("_")) {
                String str2 = new String(new ep1(6, false).k(Base64.decode(string, 2)));
                if (TextUtils.isEmpty(str2)) {
                    throw new Exception("rsaCrypter decrypt error");
                }
                return str2;
            }
            return BuildConfig.FLAVOR;
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
            throw e;
        }
    }

    public void f(String str, String str2) {
        Context context = (Context) this.c;
        if (context == null) {
            return;
        }
        if (((SharedPreferences) this.b) == null) {
            this.b = d(context);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putString(str, str2).apply();
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
        }
    }

    public String g(String str) {
        Context context = (Context) this.c;
        if (context != null) {
            if (((SharedPreferences) this.b) == null) {
                this.b = d(context);
            }
            SharedPreferences sharedPreferences = (SharedPreferences) this.b;
            if (sharedPreferences != null) {
                try {
                    return sharedPreferences.getString(str, BuildConfig.FLAVOR);
                } catch (Exception e) {
                    am2.l(Log.getStackTraceString(e));
                    return BuildConfig.FLAVOR;
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    @Override // defpackage.yd1
    public Object get() {
        return new q41((Context) ((qq0) this.b).a, (ac2) ((ri2) this.c).get());
    }

    public synchronized List h(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.b).contains(str)) {
                ((ArrayList) this.b).add(str);
            }
            arrayList = (List) ((HashMap) this.c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.c).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized ArrayList i(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<ti1> list = (List) ((HashMap) this.c).get((String) obj);
            if (list != null) {
                for (ti1 ti1Var : list) {
                    if ((ti1Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(ti1Var.b)) && !arrayList.contains(ti1Var.b)) {
                        arrayList.add(ti1Var.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public int j(Context context, nj0 nj0Var) {
        int i;
        int iC;
        gu2.o(context);
        gu2.o(nj0Var);
        int i2 = nj0Var.i();
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(i2, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
        synchronized (sparseIntArray2) {
            iC = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i3);
                    if (iKeyAt > i2 && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iC == -1) {
                iC = ((qj0) this.c).c(context, i2);
            }
            sparseIntArray2.put(i2, iC);
        }
        return iC;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    @Override // defpackage.s81
    public u92 k(View view, u92 u92Var) {
        boolean z;
        ci ciVar = (ci) this.b;
        f40 f40Var = (f40) this.c;
        int i = f40Var.a;
        int i2 = f40Var.b;
        int i3 = f40Var.c;
        r92 r92Var = u92Var.a;
        nq0 nq0VarH = r92Var.h(519);
        nq0 nq0VarH2 = r92Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ciVar.b;
        int i4 = nq0VarH.b;
        int i5 = nq0VarH.c;
        int i6 = nq0VarH.a;
        bottomSheetBehavior.w = i4;
        boolean z2 = true;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.o;
        if (z4) {
            int iA = u92Var.a();
            bottomSheetBehavior.v = iA;
            paddingBottom = iA + i3;
        }
        if (bottomSheetBehavior.p) {
            paddingLeft = (z3 ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.q) {
            if (!z3) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i7 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.u) {
            int i8 = marginLayoutParams.topMargin;
            int i9 = nq0VarH.b;
            if (i8 != i9) {
                marginLayoutParams.topMargin = i9;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i7, paddingBottom);
        boolean z5 = ciVar.a;
        if (z5) {
            bottomSheetBehavior.m = nq0VarH2.d;
        }
        if (!z4 && !z5) {
            return u92Var;
        }
        bottomSheetBehavior.J();
        return u92Var;
    }

    public Object p(jv2 jv2Var, Class cls) throws GeneralSecurityException {
        List list = (List) this.b;
        go3 go3VarF = F();
        int i = sx2.a;
        int iZ = go3VarF.z();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (eo3 eo3Var : go3VarF.B()) {
            if (eo3Var.z() == 2) {
                if (!eo3Var.C()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(eo3Var.t())));
                }
                if (eo3Var.B() == ip3.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(eo3Var.t())));
                }
                if (eo3Var.z() == 1) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(eo3Var.t())));
                }
                if (eo3Var.t() == iZ) {
                    if (z2) {
                        tv2.f("keyset contains multiple primary keys");
                        return null;
                    }
                    z2 = true;
                }
                if (eo3Var.y().x() != 4) {
                    z = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            tv2.f("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z2 && !z) {
            tv2.f("keyset doesn't contain a valid primary key");
            return null;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((lw2) list.get(i3)).f || !x(((lw2) list.get(i3)).b)) {
                throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + go3VarF.u(i3).y().A() + " failed, unable to get primitive");
            }
        }
        return jv2Var.d(this, cls);
    }

    public lw2 q(int i) {
        List list = (List) this.b;
        if (i < 0 || i >= list.size()) {
            e.c(ts.i("Invalid index ", i, list.size(), " for keyset of size "));
            return null;
        }
        lw2 lw2Var = (lw2) list.get(i);
        if (!x(lw2Var.b)) {
            uq1.q(ts.g(i, "Keyset-Entry at position ", " has wrong status"));
            return null;
        }
        if (!lw2Var.f) {
            return (lw2) list.get(i);
        }
        uq1.q(ts.g(i, "Keyset-Entry at position ", " didn't parse correctly"));
        return null;
    }

    public zd3 r(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        zd3 zd3Var = (zd3) atomicReferenceArray.get(i);
        if (zd3Var != null) {
            return zd3Var;
        }
        fd3 fd3VarA = ((k93) this.c).a(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, fd3VarA)) {
            if (atomicReferenceArray.get(i) != null) {
                zd3 zd3Var2 = (zd3) atomicReferenceArray.get(i);
                zd3Var2.getClass();
                return zd3Var2;
            }
        }
        return fd3VarA;
    }

    public void s() {
        if (((Map) this.c).get(z32.class) == null) {
            return;
        }
        ur.a();
    }

    public void t(dc2 dc2Var, cc3 cc3Var, byte[] bArr) throws GeneralSecurityException, IOException {
        go3 go3VarF = F();
        byte[] bArrH = cc3Var.h(go3VarF.c(), bArr);
        vl3 vl3VarW = xl3.w();
        nr2 nr2VarE = jr2.e(bArrH, 0, bArrH.length);
        vl3VarW.f();
        xl3.u((xl3) vl3VarW.b, nr2VarE);
        lo3 lo3VarA = sx2.a(go3VarF);
        vl3VarW.f();
        xl3.v((xl3) vl3VarW.b, lo3VarA);
        if (((SharedPreferences.Editor) dc2Var.a).putString((String) dc2Var.b, r93.q0(((xl3) vl3VarW.d()).c())).commit()) {
            return;
        }
        uq1.o("Failed to write to SharedPreferences");
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return sx2.a(F()).toString();
            default:
                return super.toString();
        }
    }

    public void v(Object obj, Status status) {
        nc0 kc0Var;
        en2 en2Var = (en2) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        gu2.p(taskCompletionSource, "completion source cannot be null");
        if (status == null) {
            taskCompletionSource.setResult(obj);
            return;
        }
        if (en2Var.k == null) {
            if (en2Var.j == null) {
                taskCompletionSource.setException(jm2.a(status));
                return;
            }
            SparseArray sparseArray = jm2.a;
            int i = status.a;
            if (i == 17012 || i == 17007 || i == 17025) {
                Pair pair = (Pair) jm2.a.get(i);
                kc0Var = new kc0(jm2.b(i), jm2.c(pair != null ? (String) pair.second : "An internal error has occurred.", status));
            } else {
                kc0Var = jm2.a(status);
            }
            taskCompletionSource.setException(kc0Var);
            return;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(en2Var.c);
        p11 p11Var = en2Var.k;
        FirebaseUser firebaseUser = ("reauthenticateWithCredential".equals(en2Var.a()) || "reauthenticateWithCredentialWithData".equals(en2Var.a())) ? en2Var.d : null;
        SparseArray sparseArray2 = jm2.a;
        firebaseAuth.getClass();
        p11Var.getClass();
        Pair pair2 = (Pair) jm2.a.get(17078);
        String str = (String) pair2.first;
        String str2 = (String) pair2.second;
        List list = (List) p11Var.c;
        ArrayList arrayListY = ia.y(list);
        ArrayList arrayList = new ArrayList();
        int size = arrayListY.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayListY.get(i2);
            i2++;
            PhoneMultiFactorInfo phoneMultiFactorInfo = (MultiFactorInfo) obj2;
            if (phoneMultiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add(phoneMultiFactorInfo);
            }
        }
        ArrayList arrayListY2 = ia.y(list);
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayListY2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayListY2.get(i3);
            i3++;
            TotpMultiFactorInfo totpMultiFactorInfo = (MultiFactorInfo) obj3;
            if (totpMultiFactorInfo instanceof TotpMultiFactorInfo) {
                arrayList2.add(totpMultiFactorInfo);
            }
        }
        ArrayList arrayListY3 = ia.y(list);
        String str3 = (String) p11Var.b;
        gu2.l(str3);
        int i4 = 0;
        zzao zzaoVar = new zzao();
        zzaoVar.c = new ArrayList();
        zzaoVar.d = new ArrayList();
        int size3 = arrayListY3.size();
        while (i4 < size3) {
            Object obj4 = arrayListY3.get(i4);
            i4++;
            TotpMultiFactorInfo totpMultiFactorInfo2 = (MultiFactorInfo) obj4;
            if (totpMultiFactorInfo2 instanceof PhoneMultiFactorInfo) {
                zzaoVar.c.add((PhoneMultiFactorInfo) totpMultiFactorInfo2);
            } else {
                if (!(totpMultiFactorInfo2 instanceof TotpMultiFactorInfo)) {
                    e.g("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ".concat(totpMultiFactorInfo2.R()));
                    return;
                }
                zzaoVar.d.add(totpMultiFactorInfo2);
            }
        }
        zzaoVar.b = str3;
        hc0 hc0Var = firebaseAuth.a;
        hc0Var.a();
        new zzaj(arrayList, zzaoVar, hc0Var.b, (zzc) p11Var.d, (zzad) firebaseUser, arrayList2);
        taskCompletionSource.setException(new kc0(str, str2));
    }

    public void w(ri2 ri2Var) throws GeneralSecurityException, IOException {
        String str;
        go3 go3VarF = F();
        for (eo3 eo3Var : go3VarF.B()) {
            if (eo3Var.y().x() == 1 || eo3Var.y().x() == 2 || eo3Var.y().x() == 3) {
                switch (eo3Var.y().x()) {
                    case 1:
                        str = "UNKNOWN_KEYMATERIAL";
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "SYMMETRIC";
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "ASYMMETRIC_PRIVATE";
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        str = "ASYMMETRIC_PUBLIC";
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        str = "REMOTE";
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "UNRECOGNIZED";
                        break;
                    default:
                        throw null;
                }
                throw new GeneralSecurityException("keyset contains key material of type " + str + " for type url " + eo3Var.y().A());
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) ri2Var.a;
        try {
            go3 go3Var = go3VarF;
            int iA = go3Var.a(null);
            boolean z = tr2.b;
            if (iA > 4096) {
                iA = 4096;
            }
            ur2 ur2Var = new ur2(byteArrayOutputStream, iA);
            go3Var.k(ur2Var);
            if (ur2Var.e > 0) {
                ur2Var.v();
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public yd2 y() throws GeneralSecurityException {
        zi0 qd3Var;
        boolean z;
        lw2 lw2Var;
        go3 go3VarF = F();
        List<lw2> list = (List) this.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (lw2 lw2Var2 : list) {
            if (lw2Var2.a() instanceof t93) {
                zi0 zi0VarH = ((t93) lw2Var2.a()).H();
                lw2Var = new lw2(zi0VarH, lw2Var2.b, lw2Var2.d, lw2Var2.e, false);
                int i2 = lw2Var2.d;
                Integer numF = zi0VarH.F();
                if (numF != null && numF.intValue() != i2) {
                    tv2.f("Wrong ID set for key with ID requirement");
                    return null;
                }
            } else {
                eo3 eo3VarU = go3VarF.u(i);
                qn3 qn3VarY = eo3VarU.y();
                if (qn3VarY.x() != 3) {
                    tv2.f("The keyset contains a non-private key");
                    return null;
                }
                String strA = qn3VarY.A();
                jr2 jr2VarZ = qn3VarY.z();
                int i3 = jx2.a;
                id3 id3VarA = vc3.d.a(strA);
                if (!(id3VarA instanceof sd3)) {
                    throw new GeneralSecurityException(ts.k("manager for key type ", strA, " is not a PrivateKeyManager"));
                }
                sd3 sd3Var = (sd3) id3VarA;
                wf3 wf3VarD = wf3.d(sd3Var.a, jr2VarZ, sd3Var.b, ip3.RAW, null);
                te3 te3Var = te3.b;
                zi0 zi0VarA = te3Var.a(wf3VarD);
                if (!(zi0VarA instanceof t93)) {
                    tv2.f("Key not private key");
                    return null;
                }
                wf3 wf3Var = (wf3) te3Var.c(((t93) zi0VarA).H());
                on3 on3VarT = qn3.t();
                String str = (String) wf3Var.c;
                on3VarT.f();
                qn3.v((qn3) on3VarT.b, str);
                jr2 jr2Var = (jr2) wf3Var.e;
                on3VarT.f();
                qn3.w((qn3) on3VarT.b, jr2Var);
                int i4 = wf3Var.b;
                on3VarT.f();
                qn3.u((qn3) on3VarT.b, i4);
                qn3 qn3Var = (qn3) on3VarT.d();
                bs2 bs2Var = (bs2) eo3VarU.d(5);
                if (!bs2Var.a.equals(eo3VarU)) {
                    if (!bs2Var.b.s()) {
                        bs2Var.g();
                    }
                    bs2.c(bs2Var.b, eo3VarU);
                }
                do3 do3Var = (do3) bs2Var;
                do3Var.f();
                eo3.v((eo3) do3Var.b, qn3Var);
                eo3 eo3Var = (eo3) do3Var.d();
                try {
                    qd3Var = l(eo3Var);
                    z = false;
                } catch (GeneralSecurityException e) {
                    if (((AtomicBoolean) y63.a.b).get()) {
                        throw e;
                    }
                    qd3Var = new qd3(B(eo3Var));
                    z = true;
                }
                zi0 zi0Var = qd3Var;
                int iT = eo3Var.t();
                lw2Var = new lw2(zi0Var, lw2Var2.b, iT, iT == go3VarF.z(), z);
            }
            arrayList.add(lw2Var);
            i++;
        }
        yd2 yd2Var = new yd2((Map) this.c, arrayList);
        yd2Var.s();
        return yd2Var;
    }

    public zd3 z(String str, long j, int i) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        zd3 zd3Var = (zd3) atomicReferenceArray.get(i);
        if (zd3Var != null) {
            return zd3Var;
        }
        rd3 rd3Var = new rd3(str, (bk0) ((k93) this.c).a, j);
        while (!atomicReferenceArray.compareAndSet(i, null, rd3Var)) {
            if (atomicReferenceArray.get(i) != null) {
                zd3 zd3Var2 = (zd3) atomicReferenceArray.get(i);
                zd3Var2.getClass();
                return zd3Var2;
            }
        }
        return rd3Var;
    }

    public yd2(int i) {
        this.a = i;
        switch (i) {
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                this.b = new ArrayList();
                this.c = new HashMap();
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                qj0 qj0Var = qj0.e;
                this.b = new SparseIntArray();
                this.c = qj0Var;
                break;
            case 13:
                this.b = new TreeMap();
                this.c = new TreeMap();
                break;
        }
    }

    public yd2(String str, gb2 gb2Var, c11 c11Var) {
        this.a = 1;
        this.c = str;
        this.b = gb2Var;
    }

    public yd2(k93 k93Var, int i) {
        this.a = 12;
        this.c = k93Var;
        this.b = new AtomicReferenceArray(i);
    }

    public /* synthetic */ yd2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public yd2(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 4;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public yd2(int i, int i2) {
        this.a = 4;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public yd2(int i, int i2, int i3) {
        this.a = 4;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }
}
