package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzz;
import com.hjq.toast.BuildConfig;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class md2 implements o62, OnCompleteListener, Continuation, ac {
    public static volatile md2 c;
    public Object a;
    public Object b;

    public md2(int i) {
        switch (i) {
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a = new wq1(0);
                this.b = new s01();
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                this.a = Collections.synchronizedMap(new WeakHashMap());
                this.b = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.a = new AtomicReference(un0.b);
                this.b = new ac2(23);
                break;
        }
    }

    public static zzad n(hc0 hc0Var, zo2 zo2Var) {
        gu2.o(hc0Var);
        gu2.o(zo2Var);
        ArrayList arrayList = new ArrayList();
        zzz zzzVar = new zzz();
        gu2.l("firebase");
        String str = zo2Var.a;
        gu2.l(str);
        zzzVar.a = str;
        zzzVar.b = "firebase";
        zzzVar.e = zo2Var.b;
        zzzVar.c = zo2Var.d;
        String str2 = zo2Var.e;
        Uri uri = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : null;
        if (uri != null) {
            zzzVar.d = uri.toString();
        }
        zzzVar.i = zo2Var.c;
        zzzVar.v = null;
        zzzVar.f = zo2Var.g;
        arrayList.add(zzzVar);
        List list = (List) zo2Var.f.a;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                op2 op2Var = (op2) list.get(i);
                zzz zzzVar2 = new zzz();
                gu2.o(op2Var);
                zzzVar2.a = op2Var.a;
                String str3 = op2Var.d;
                gu2.l(str3);
                zzzVar2.b = str3;
                zzzVar2.c = op2Var.b;
                String str4 = op2Var.c;
                Uri uri2 = !TextUtils.isEmpty(str4) ? Uri.parse(str4) : null;
                if (uri2 != null) {
                    zzzVar2.d = uri2.toString();
                }
                zzzVar2.e = op2Var.g;
                zzzVar2.f = op2Var.f;
                zzzVar2.i = false;
                zzzVar2.v = op2Var.e;
                arrayList.add(zzzVar2);
            }
        }
        zzad zzadVar = new zzad(hc0Var, arrayList);
        zzadVar.w = new zzaf(zo2Var.i, zo2Var.h);
        zzadVar.W = zo2Var.j;
        zzadVar.X = zo2Var.k;
        zzadVar.c0(ia.y(zo2Var.l));
        zzadVar.a0(zo2Var.m);
        return zzadVar;
    }

    public void a(kg1 kg1Var, u61 u61Var) {
        wq1 wq1Var = (wq1) this.a;
        k62 k62VarA = (k62) wq1Var.get(kg1Var);
        if (k62VarA == null) {
            k62VarA = k62.a();
            wq1Var.put(kg1Var, k62VarA);
        }
        k62VarA.c = u61Var;
        k62VarA.a |= 8;
    }

    @Override // defpackage.o62
    public l62 b(Class cls) {
        if (!cls.isAssignableFrom(r91.class)) {
            uq1.q("Unknown ViewModel class");
            return null;
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.a;
        sharedPreferences.getClass();
        return new r91(sharedPreferences, (fx0) ((CreateOpenChatActivity) this.b).o0.getValue());
    }

    public void c() {
        String str;
        nd2 nd2Var = (nd2) this.a;
        try {
            nd2Var.getClass();
            byte[] bArrI = rq0.i("63D4BEBEBC7ABCA4BC6A796B6AB06B766A6C7D706B6B756F70B07B6F71A4A5AEBCB2D4BEBEBC6A69BCA4BC7A6B69B16A796B6AB06B767D72726A6C65B07B6F71BCB2D4BEBEBC6A7BBCA4BC7A6B7BB16A796B6AB06B767D72726A6C65B07B6F71BCB2D4BEBEBC6F69BCA4BC7A6B69B06B767D72726A6C65B07B6F71BCB2D4BEBEBC6F7BBCA4BC7A6B7BB06B767D72726A6C65B07B6F71BCB2D4BEBEBC7BBCA4BCAF726F777B6F7078AF68A8AF696E726F7D7A7B6F7078BCB2D4BEBEBC77BCA4BCAF726F777B6F7078AF68ADAF6B797B6C796ABCB2D4BEBEBC69BCA4BCAF7D6A7679707DAF7B76797B736E6F75706AAF68ACAF696E726F7D7ABCB2D4BEBEBC787BBCA4BC68AEAC7BBCB2D4BEBEBC787ABCA4BC68AEAC7ABCB2D4BEBEBC7879BCA4BC68AEAC79BCB2D4BEBEBC7568BCA4BC7D7C7B7A79787776757473AD71706F6EBCB2D4BEBEBC67BCA4BCABA7ADA899A99B9CAD9CA5A6AC9BAEABA9AEADAB99A9ACADA8A79D9D98A9AA9DBCD461D4D4");
            if (bArrI == null) {
                str = BuildConfig.FLAVOR;
            } else {
                for (int i = 0; i < bArrI.length; i++) {
                    bArrI[i] = (byte) (222 - ((char) bArrI[i]));
                }
                str = new String(bArrI);
            }
            ze2.b(str);
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
            oc2.a("initSDKConfig", e);
        } finally {
            nd2Var.a(ze2.i);
            nd2Var.b = ze2.l;
        }
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        tj3 tj3Var = (tj3) this.b;
        String strValueOf = String.valueOf(tj3Var.a);
        r41 r41Var = tj3Var.h;
        String strConcat = "Initialize ".concat(strValueOf);
        r41Var.getClass();
        mn3 mn3VarS = r41.s(strConcat);
        try {
            synchronized (tj3Var.g) {
                try {
                    if (((List) this.a) == null) {
                        this.a = tj3Var.i;
                        tj3Var.i = Collections.EMPTY_LIST;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(((List) this.a).size());
            dl3 dl3Var = new dl3((tj3) this.b);
            Iterator it = ((List) this.a).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((bc) it.next()).apply(dl3Var));
                } catch (Exception e) {
                    arrayList.add(dh0.c(e));
                }
            }
            ro0 ro0VarI = ro0.i(arrayList);
            a20 a20Var = new a20(this, 6);
            yo yoVar = new yo(ro0VarI, true);
            yoVar.a0 = new xo(yoVar, a20Var);
            yoVar.s();
            mn3VarS.a(yoVar);
            mn3VarS.close();
            return yoVar;
        } catch (Throwable th2) {
            try {
                mn3VarS.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public Pair d() {
        ArrayList arrayList = ((hf2) ((f91) this.b).b).l;
        if (!rq0.l(arrayList)) {
            return new Pair(0, ze2.m);
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() % ((long) arrayList.size()));
        return new Pair(Integer.valueOf(iCurrentTimeMillis), (byte[]) arrayList.get(iCurrentTimeMillis));
    }

    public void e(int[] iArr, int i) {
        vh0 vh0Var;
        vh0 vh0Var2;
        vh0 vh0Var3;
        uh0 uh0Var = (uh0) this.a;
        if (i == 0) {
            e.g("No error correction bytes");
            return;
        }
        int length = iArr.length - i;
        if (length <= 0) {
            e.g("No data bytes provided");
            return;
        }
        ArrayList arrayList = (ArrayList) this.b;
        int i2 = 1;
        int i3 = 0;
        if (i >= arrayList.size()) {
            vh0 vh0Var4 = (vh0) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            while (size <= i) {
                int[] iArr2 = {i2, uh0Var.a[(size - 1) + uh0Var.f]};
                if (iArr2[i3] == 0) {
                    int i4 = i2;
                    while (i4 < 2 && iArr2[i4] == 0) {
                        i4++;
                    }
                    if (i4 == 2) {
                        iArr2 = new int[]{i3};
                    } else {
                        int i5 = 2 - i4;
                        int[] iArr3 = new int[i5];
                        System.arraycopy(iArr2, i4, iArr3, i3, i5);
                        iArr2 = iArr3;
                    }
                }
                uh0 uh0Var2 = vh0Var4.a;
                if (!uh0Var2.equals(uh0Var)) {
                    e.g("GenericGFPolys do not have same GenericGF field");
                    return;
                }
                int[] iArr4 = vh0Var4.b;
                if (iArr4[i3] == 0 || iArr2[i3] == 0) {
                    vh0Var4 = uh0Var2.c;
                } else {
                    int length2 = iArr4.length;
                    int length3 = iArr2.length;
                    int[] iArr5 = new int[(length2 + length3) - i2];
                    int i6 = i3;
                    while (i6 < length2) {
                        int i7 = iArr4[i6];
                        while (i3 < length3) {
                            int i8 = i6 + i3;
                            iArr5[i8] = iArr5[i8] ^ uh0Var2.a(i7, iArr2[i3]);
                            i3++;
                            iArr4 = iArr4;
                        }
                        i6++;
                        i3 = 0;
                    }
                    vh0Var4 = new vh0(uh0Var2, iArr5);
                }
                arrayList.add(vh0Var4);
                size++;
                i2 = 1;
                i3 = 0;
            }
        }
        vh0 vh0Var5 = (vh0) arrayList.get(i);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        if (length == 0) {
            sm0.a();
            return;
        }
        if (length > 1 && iArr6[0] == 0) {
            int i9 = 1;
            while (i9 < length && iArr6[i9] == 0) {
                i9++;
            }
            if (i9 == length) {
                iArr6 = new int[]{0};
            } else {
                int i10 = length - i9;
                int[] iArr7 = new int[i10];
                System.arraycopy(iArr6, i9, iArr7, 0, i10);
                iArr6 = iArr7;
            }
        }
        if (i < 0) {
            sm0.a();
            return;
        }
        int length4 = iArr6.length;
        int[] iArr8 = new int[length4 + i];
        for (int i11 = 0; i11 < length4; i11++) {
            iArr8[i11] = uh0Var.a(iArr6[i11], 1);
        }
        vh0 vh0Var6 = new vh0(uh0Var, iArr8);
        uh0 uh0Var3 = vh0Var5.a;
        int[] iArr9 = vh0Var5.b;
        boolean zEquals = uh0Var.equals(uh0Var3);
        vh0 vh0Var7 = uh0Var.c;
        if (!zEquals) {
            e.g("GenericGFPolys do not have same GenericGF field");
            return;
        }
        if (iArr9[0] == 0) {
            e.g("Divide by 0");
            return;
        }
        int i12 = iArr9[(iArr9.length - 1) - vh0Var5.b()];
        if (i12 == 0) {
            throw new ArithmeticException();
        }
        int i13 = uh0Var.a[(uh0Var.d - uh0Var.b[i12]) - 1];
        vh0 vh0VarA = vh0Var7;
        while (true) {
            int[] iArr10 = vh0Var6.b;
            if (vh0Var6.b() < vh0Var5.b() || iArr10[0] == 0) {
                break;
            }
            int iB = vh0Var6.b() - vh0Var5.b();
            int iA = uh0Var.a(iArr10[(iArr10.length - 1) - vh0Var6.b()], i13);
            uh0 uh0Var4 = vh0Var5.a;
            if (iB < 0) {
                sm0.a();
                return;
            }
            if (iA == 0) {
                vh0Var2 = uh0Var4.c;
                vh0Var = vh0Var5;
            } else {
                int length5 = iArr9.length;
                int[] iArr11 = new int[length5 + iB];
                int i14 = 0;
                while (i14 < length5) {
                    iArr11[i14] = uh0Var4.a(iArr9[i14], iA);
                    i14++;
                    vh0Var5 = vh0Var5;
                }
                vh0Var = vh0Var5;
                vh0Var2 = new vh0(uh0Var4, iArr11);
            }
            if (iB < 0) {
                sm0.a();
                return;
            }
            if (iA == 0) {
                vh0Var3 = vh0Var7;
            } else {
                int[] iArr12 = new int[iB + 1];
                iArr12[0] = iA;
                vh0Var3 = new vh0(uh0Var, iArr12);
            }
            vh0VarA = vh0VarA.a(vh0Var3);
            vh0Var6 = vh0Var6.a(vh0Var2);
            vh0Var5 = vh0Var;
        }
        int[] iArr13 = new vh0[]{vh0VarA, vh0Var6}[1].b;
        int length6 = i - iArr13.length;
        for (int i15 = 0; i15 < length6; i15++) {
            iArr[length + i15] = 0;
        }
        System.arraycopy(iArr13, 0, iArr, length + length6, iArr13.length);
    }

    public u61 f(kg1 kg1Var, int i) {
        k62 k62Var;
        u61 u61Var;
        wq1 wq1Var = (wq1) this.a;
        int iD = wq1Var.d(kg1Var);
        if (iD >= 0 && (k62Var = (k62) wq1Var.j(iD)) != null) {
            int i2 = k62Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                k62Var.a = i3;
                if (i == 4) {
                    u61Var = k62Var.b;
                } else if (i == 8) {
                    u61Var = k62Var.c;
                } else {
                    e.g("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    wq1Var.h(iD);
                    k62Var.a = 0;
                    k62Var.b = null;
                    k62Var.c = null;
                    k62.d.b(k62Var);
                }
                return u61Var;
            }
        }
        return null;
    }

    public void g(kg1 kg1Var) {
        k62 k62Var = (k62) ((wq1) this.a).get(kg1Var);
        if (k62Var == null) {
            return;
        }
        k62Var.a &= -2;
    }

    public void i(kg1 kg1Var) {
        s01 s01Var = (s01) this.b;
        for (int iH = s01Var.h() - 1; iH >= 0; iH--) {
            if (kg1Var == s01Var.i(iH)) {
                Object[] objArr = s01Var.c;
                Object obj = objArr[iH];
                Object obj2 = g93.c;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                s01Var.a = true;
                break;
            }
        }
        k62 k62Var = (k62) ((wq1) this.a).remove(kg1Var);
        if (k62Var != null) {
            k62Var.a = 0;
            k62Var.b = null;
            k62Var.c = null;
            k62.d.b(k62Var);
        }
    }

    public ListenableFuture j(ac acVar, Executor executor) {
        executor.getClass();
        f80 f80Var = new f80(e80.a);
        f80Var.b = executor;
        f80Var.a = this;
        hd2 hd2Var = new hd2(3, f80Var, acVar);
        mp1 mp1Var = new mp1();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.a).getAndSet(mp1Var);
        h02 h02Var = new h02();
        h02Var.w = new g02(h02Var, hd2Var);
        listenableFuture.a(h02Var, f80Var);
        ListenableFuture listenableFutureE = dh0.e(h02Var);
        d80 d80Var = new d80(h02Var, mp1Var, listenableFuture, listenableFutureE, f80Var, 0);
        t10 t10Var = t10.a;
        listenableFutureE.a(d80Var, t10Var);
        h02Var.a(d80Var, t10Var);
        return listenableFutureE;
    }

    public void k(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.a;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.b;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new i7(status));
            }
        }
    }

    public Task l(hc0 hc0Var, FirebaseUser firebaseUser, AuthCredential authCredential, String str, qw2 qw2Var) {
        gu2.o(hc0Var);
        gu2.o(authCredential);
        gu2.o(firebaseUser);
        gu2.o(qw2Var);
        List listG0 = firebaseUser.g0();
        if (listG0 != null && listG0.contains(authCredential.R())) {
            return Tasks.forException(jm2.a(new Status(17015, (String) null, (PendingIntent) null, (ConnectionResult) null)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (TextUtils.isEmpty(emailAuthCredential.c)) {
                cl2 cl2Var = new cl2(emailAuthCredential, str);
                cl2Var.c = hc0Var;
                cl2Var.d = firebaseUser;
                cl2Var.e = qw2Var;
                cl2Var.f = qw2Var;
                return m(cl2Var);
            }
            bl2 bl2Var = new bl2(emailAuthCredential);
            bl2Var.c = hc0Var;
            bl2Var.d = firebaseUser;
            bl2Var.e = qw2Var;
            bl2Var.f = qw2Var;
            return m(bl2Var);
        }
        if (!(authCredential instanceof PhoneAuthCredential)) {
            el2 el2Var = new el2(authCredential);
            el2Var.c = hc0Var;
            el2Var.d = firebaseUser;
            el2Var.e = qw2Var;
            el2Var.f = qw2Var;
            return m(el2Var);
        }
        sn2.a.clear();
        bl2 bl2Var2 = new bl2((PhoneAuthCredential) authCredential);
        bl2Var2.c = hc0Var;
        bl2Var2.d = firebaseUser;
        bl2Var2.e = qw2Var;
        bl2Var2.f = qw2Var;
        return m(bl2Var2);
    }

    public Task m(en2 en2Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Executor executor = (Executor) this.b;
        gc gcVar = new gc(4);
        gcVar.b = this;
        gcVar.c = en2Var;
        gcVar.d = taskCompletionSource;
        executor.execute(gcVar);
        return taskCompletionSource.getTask();
    }

    public void onComplete(Task task) {
        GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.a;
        String str = (String) this.b;
        tw2 tw2Var = GenericIdpActivity.o0;
        boolean z = false;
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            genericIdpActivity.h();
            return;
        }
        List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            genericIdpActivity.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        gk1 gk1Var = new gk1(8, z);
        if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent2.putExtras(bundle);
        }
        intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Integer num = (Integer) gk1Var.b;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent2.putExtras(bundle2);
        intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        kj0 kj0Var = new kj0(intent2, 9);
        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
        Uri uri = (Uri) task.getResult();
        Intent intent3 = (Intent) kj0Var.b;
        intent3.setData(uri);
        genericIdpActivity.startActivity(intent3, null);
    }

    public Object then(Task task) {
        boolean z = task.getException() instanceof j32;
        ab3 ab3Var = (ab3) this.b;
        u83 u83Var = (u83) this.a;
        if (z) {
            return u83Var.c(ab3Var.t());
        }
        if (task.getException() instanceof i7) {
            i7 i7Var = (i7) task.getException();
            i7Var.getClass();
            if (i7Var.getStatusCode() == 29514) {
                return u83Var.c(ab3Var.t());
            }
        }
        return task;
    }

    public /* synthetic */ md2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public md2(uh0 uh0Var) {
        this.a = uh0Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new vh0(uh0Var, new int[]{1}));
    }

    public /* synthetic */ md2(Object obj) {
        this.b = obj;
    }
}
