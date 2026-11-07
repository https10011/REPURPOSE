package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.fragment.app.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.PhoneAuthCredential;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Matcher;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class p11 implements MatchResult, m90, mn2, OnCompleteListener {
    public static p11 e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public p11(kj0 kj0Var) {
        this.a = 5;
        this.b = kj0Var.K("gcm.n.title");
        kj0Var.H("gcm.n.title");
        Object[] objArrG = kj0Var.G("gcm.n.title");
        if (objArrG != null) {
            String[] strArr = new String[objArrG.length];
            for (int i = 0; i < objArrG.length; i++) {
                strArr[i] = String.valueOf(objArrG[i]);
            }
        }
        this.c = kj0Var.K("gcm.n.body");
        kj0Var.H("gcm.n.body");
        Object[] objArrG2 = kj0Var.G("gcm.n.body");
        if (objArrG2 != null) {
            String[] strArr2 = new String[objArrG2.length];
            for (int i2 = 0; i2 < objArrG2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrG2[i2]);
            }
        }
        kj0Var.K("gcm.n.icon");
        if (TextUtils.isEmpty(kj0Var.K("gcm.n.sound2"))) {
            kj0Var.K("gcm.n.sound");
        }
        kj0Var.K("gcm.n.tag");
        kj0Var.K("gcm.n.color");
        kj0Var.K("gcm.n.click_action");
        kj0Var.K("gcm.n.android_channel_id");
        String strK = kj0Var.K("gcm.n.link_android");
        strK = TextUtils.isEmpty(strK) ? kj0Var.K("gcm.n.link") : strK;
        if (!TextUtils.isEmpty(strK)) {
            Uri.parse(strK);
        }
        this.d = kj0Var.K("gcm.n.image");
        kj0Var.K("gcm.n.ticker");
        kj0Var.D("gcm.n.notification_priority");
        kj0Var.D("gcm.n.visibility");
        kj0Var.D("gcm.n.notification_count");
        kj0Var.B("gcm.n.sticky");
        kj0Var.B("gcm.n.local_only");
        kj0Var.B("gcm.n.default_sound");
        kj0Var.B("gcm.n.default_vibrate_timings");
        kj0Var.B("gcm.n.default_light_settings");
        kj0Var.I();
        kj0Var.F();
        kj0Var.L();
    }

    public static boolean a(String str) {
        return TextUtils.isEmpty(str) || str.equals(se2.i);
    }

    public static p11 k(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new p11(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void b(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.b;
        vd1 vd1Var = new vd1(byteArrayOutputStream, map, (HashMap) this.c, (w71) this.d);
        w71 w71Var = (w71) map.get(obj.getClass());
        if (w71Var != null) {
            w71Var.a(obj, vd1Var);
            return;
        }
        throw new l60("No encoder for " + obj.getClass());
    }

    public l62 c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        e.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.a) {
            case 21:
                p11 p11Var = new p11(((fj2) this.b).clone());
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) p11Var.d).add(((fj2) obj).clone());
                }
                return p11Var;
            default:
                return super.clone();
        }
    }

    public l62 d(Class cls, String str) {
        l62 l62VarB;
        o62 o62Var = (o62) this.c;
        p62 p62Var = (p62) this.b;
        p62Var.getClass();
        LinkedHashMap linkedHashMap = p62Var.a;
        l62 l62Var = (l62) linkedHashMap.get(str);
        if (!cls.isInstance(l62Var)) {
            c61 c61Var = new c61((bu) this.d);
            c61Var.a.put(br0.f, str);
            try {
                l62VarB = o62Var.h(cls, c61Var);
            } catch (AbstractMethodError unused) {
                l62VarB = o62Var.b(cls);
            }
            l62VarB.getClass();
            l62 l62Var2 = (l62) linkedHashMap.put(str, l62VarB);
            if (l62Var2 != null) {
                l62Var2.b();
            }
            return l62VarB;
        }
        wl1 wl1Var = o62Var instanceof wl1 ? (wl1) o62Var : null;
        if (wl1Var != null) {
            l62Var.getClass();
            nw0 nw0Var = wl1Var.d;
            if (nw0Var != null) {
                ul1 ul1Var = wl1Var.e;
                ul1Var.getClass();
                gu2.f(l62Var, ul1Var, nw0Var);
            }
        }
        l62Var.getClass();
        return l62Var;
    }

    public ColorStateList e(int i) {
        int resourceId;
        ColorStateList colorStateListK;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListK = sp0.k((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListK;
    }

    public Drawable f(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : gu2.u((Context) this.b, resourceId);
    }

    public Drawable g(int i) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        m8 m8VarA = m8.a();
        Context context = (Context) this.b;
        synchronized (m8VarA) {
            drawableD = m8VarA.a.d(context, resourceId, true);
        }
        return drawableD;
    }

    @Override // defpackage.yd1
    public Object get() {
        switch (this.a) {
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ac2((Context) ((yd1) this.b).get(), (bl1) ((yd1) this.c).get(), (ce) ((op0) this.d).get(), 29);
            default:
                return new f02(new br0(10), new k42(9), (tz) ((co) this.b).get(), (ue2) ((qq) this.c).get(), (ep1) ((ud2) this.d).get());
        }
    }

    public Typeface h(int i, int i2, i9 i9Var) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        Context context = (Context) this.b;
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = ej1.a;
        if (context.isRestricted()) {
            return null;
        }
        return ej1.a(context, resourceId, typedValue, i2, i9Var, true, false);
    }

    public List i() {
        if (((y11) this.d) == null) {
            this.d = new y11(this);
        }
        y11 y11Var = (y11) this.d;
        y11Var.getClass();
        return y11Var;
    }

    public String j() {
        String str = (String) this.d;
        if (str != null) {
            return str;
        }
        PackageInfo packageInfo = (PackageInfo) this.b;
        String str2 = packageInfo == null ? "UNK" : packageInfo.packageName;
        String str3 = packageInfo != null ? packageInfo.versionName : "UNK";
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("/");
        sb.append(str3);
        sb.append(" ChannelSDK/");
        sb.append((String) this.c);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(locale.getLanguage());
        sb.append("-");
        sb.append(locale.getCountry());
        sb.append("; ");
        sb.append(Build.MODEL);
        sb.append(" Build/");
        String strL = ts.l(sb, Build.ID, ")");
        this.d = strL;
        return strL;
    }

    public boolean l() {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            if (((dg0) ((c41) it.next())).a.o()) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ((TypedArray) this.c).recycle();
    }

    public void n(c41 c41Var) {
        ((CopyOnWriteArrayList) this.c).remove(c41Var);
        m31 m31Var = (m31) ((HashMap) this.d).remove(c41Var);
        if (m31Var != null) {
            m31Var.a.b(m31Var.b);
            m31Var.b = null;
        }
        ((Runnable) this.b).run();
    }

    public void o(nd ndVar) {
        uq1 uq1Var = new uq1(8);
        f02 f02Var = (f02) this.d;
        ge geVar = (ge) this.b;
        k60 k60Var = (k60) this.c;
        tz tzVar = f02Var.c;
        ac2 ac2VarA = ge.a();
        ac2VarA.O(geVar.a);
        ac2VarA.c = uc1.a;
        ac2VarA.b = geVar.b;
        ge geVarR = ac2VarA.r();
        qp0 qp0Var = new qp0();
        qp0Var.f = new HashMap();
        qp0Var.d = Long.valueOf(f02Var.a.b());
        qp0Var.e = Long.valueOf(f02Var.b.b());
        qp0Var.a = "FCM_CLIENT_EVENT_LOGGING";
        p41 p41Var = ndVar.a;
        p11 p11Var = od1.a;
        p11Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            p11Var.b(p41Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        qp0Var.c = new d60(k60Var, byteArrayOutputStream.toByteArray());
        qp0Var.b = null;
        tzVar.b.execute(new dg(tzVar, geVarR, uq1Var, qp0Var.c()));
    }

    public void onComplete(Task task) {
        mk1 mk1Var = (mk1) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (mk1Var.a) {
            mk1Var.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public az2 p() throws GeneralSecurityException {
        ox1 ox1Var;
        tr3 tr3VarB;
        fz2 fz2Var = (fz2) this.b;
        if (fz2Var == null || (ox1Var = (ox1) this.c) == null) {
            tv2.f("Cannot build without parameters and/or key material");
            return null;
        }
        if (fz2Var.a != ((tr3) ox1Var.a).a.length) {
            tv2.f("Key size mismatch");
            return null;
        }
        if (fz2Var.a() && ((Integer) this.d) == null) {
            tv2.f("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((fz2) this.b).a() && ((Integer) this.d) != null) {
            tv2.f("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        dz2 dz2Var = ((fz2) this.b).d;
        if (dz2Var == dz2.e) {
            tr3VarB = we3.a;
        } else if (dz2Var == dz2.d) {
            tr3VarB = we3.a(((Integer) this.d).intValue());
        } else {
            if (dz2Var != dz2.c) {
                uq1.q("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(dz2Var)));
                return null;
            }
            tr3VarB = we3.b(((Integer) this.d).intValue());
        }
        return new az2((fz2) this.b, (ox1) this.c, tr3VarB, (Integer) this.d);
    }

    public gz2 q() throws GeneralSecurityException {
        ox1 ox1Var;
        tr3 tr3VarB;
        oz2 oz2Var = (oz2) this.b;
        if (oz2Var == null || (ox1Var = (ox1) this.c) == null) {
            tv2.f("Cannot build without parameters and/or key material");
            return null;
        }
        if (oz2Var.a != ((tr3) ox1Var.a).a.length) {
            tv2.f("Key size mismatch");
            return null;
        }
        if (oz2Var.a() && ((Integer) this.d) == null) {
            tv2.f("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((oz2) this.b).a() && ((Integer) this.d) != null) {
            tv2.f("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        nz2 nz2Var = ((oz2) this.b).d;
        if (nz2Var == nz2.e) {
            tr3VarB = we3.a;
        } else if (nz2Var == nz2.d) {
            tr3VarB = we3.a(((Integer) this.d).intValue());
        } else {
            if (nz2Var != nz2.c) {
                uq1.q("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(nz2Var)));
                return null;
            }
            tr3VarB = we3.b(((Integer) this.d).intValue());
        }
        return new gz2((oz2) this.b, (ox1) this.c, tr3VarB, (Integer) this.d);
    }

    public pz2 r() throws GeneralSecurityException {
        ox1 ox1Var;
        tr3 tr3VarB;
        sz2 sz2Var = (sz2) this.b;
        if (sz2Var == null || (ox1Var = (ox1) this.c) == null) {
            tv2.f("Cannot build without parameters and/or key material");
            return null;
        }
        if (sz2Var.a != ((tr3) ox1Var.a).a.length) {
            tv2.f("Key size mismatch");
            return null;
        }
        if (sz2Var.a() && ((Integer) this.d) == null) {
            tv2.f("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((sz2) this.b).a() && ((Integer) this.d) != null) {
            tv2.f("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        rz2 rz2Var = ((sz2) this.b).b;
        if (rz2Var == rz2.e) {
            tr3VarB = we3.a;
        } else if (rz2Var == rz2.d) {
            tr3VarB = we3.a(((Integer) this.d).intValue());
        } else {
            if (rz2Var != rz2.c) {
                uq1.q("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(rz2Var)));
                return null;
            }
            tr3VarB = we3.b(((Integer) this.d).intValue());
        }
        return new pz2((sz2) this.b, (ox1) this.c, tr3VarB, (Integer) this.d);
    }

    @Override // defpackage.mn2
    public void s(an2 an2Var) {
        switch (this.a) {
            case 16:
                zp2 zp2Var = (zp2) an2Var;
                ((ox1) this.d).z(new zzahd(zp2Var.b, zp2Var.a, Long.valueOf(zp2Var.c)), null, "password", Boolean.FALSE, null, (rd2) this.b, this);
                break;
            case 17:
                rd2 rd2Var = (rd2) this.b;
                tq2 tq2Var = (tq2) an2Var;
                if (!TextUtils.isEmpty(tq2Var.e)) {
                    rd2Var.i(new Status(17025, (String) null, (PendingIntent) null, (ConnectionResult) null), new PhoneAuthCredential(true, (String) null, (String) null, tq2Var.f, tq2Var.e));
                } else {
                    ((ox1) ((p11) this.d).d).z(new zzahd(tq2Var.b, tq2Var.a, Long.valueOf(tq2Var.c)), null, "phone", Boolean.valueOf(tq2Var.d), null, rd2Var, (p11) this.c);
                }
                break;
            case 18:
                tg2 tg2Var = (tg2) this.b;
                tg2Var.f = ((zzahd) an2Var).b;
                qq qqVar = (qq) ((ox1) this.d).a;
                p11 p11Var = new p11((mn2) this, (rd2) this.c, (mn2) this, 17);
                wm2 wm2Var = (wm2) qqVar.a;
                sp0.K(wm2Var.q("/verifyPhoneNumber", (String) qqVar.f), tg2Var, p11Var, new tq2(), (ep1) wm2Var.b);
                break;
            case 19:
                ox1.x((ox1) ((p11) this.d).d, (mq2) an2Var, (rd2) this.b, this);
                break;
            default:
                zzaij zzaijVar = (zzaij) this.b;
                zzaijVar.b0 = true;
                String str = ((zzahd) an2Var).b;
                gu2.l(str);
                zzaijVar.b = str;
                qq qqVar2 = (qq) ((ox1) this.d).a;
                p11 p11Var2 = new p11((mn2) this, (rd2) this.c, (mn2) this, 19);
                qqVar2.getClass();
                wm2 wm2Var2 = (wm2) qqVar2.a;
                sp0.K(wm2Var2.q("/verifyAssertion", (String) qqVar2.f), zzaijVar, p11Var2, new mq2(), (ep1) wm2Var2.b);
                break;
        }
    }

    public void t(Object obj, String str) {
        p11 p11Var = new p11(25);
        ((p11) this.d).c = p11Var;
        this.d = p11Var;
        p11Var.d = obj;
        p11Var.b = str;
    }

    public String toString() {
        int i = this.a;
        String str = BuildConfig.FLAVOR;
        switch (i) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                nl1 nl1Var = (nl1) ((nl1) this.c).a;
                while (nl1Var != null) {
                    Object obj = nl1Var.b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    nl1Var = (nl1) nl1Var.a;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 26:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                p11 p11Var = (p11) ((p11) this.c).c;
                while (p11Var != null) {
                    Object obj2 = p11Var.d;
                    sb2.append(str);
                    String str2 = (String) p11Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    p11Var = (p11) p11Var.c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        switch (this.a) {
            case 16:
                ((qp0) this.c).zza(str);
                break;
            case 17:
                ((p11) this.c).zza(str);
                break;
            case 18:
                ((rd2) this.c).a(kv.m0(str));
                break;
            case 19:
                ((p11) this.c).zza(str);
                break;
            default:
                ((rd2) this.c).a(kv.m0(str));
                break;
        }
    }

    public p11(qp0 qp0Var) {
        this.a = 14;
        this.c = new LinkedBlockingQueue(1);
        this.b = (Application) ue2.j.a;
        HandlerThread handlerThread = new HandlerThread("EventsHandler");
        handlerThread.start();
        this.d = new hg2(handlerThread.getLooper(), qp0Var);
    }

    public /* synthetic */ p11(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ p11(mn2 mn2Var, rd2 rd2Var, mn2 mn2Var2, int i) {
        this.a = i;
        this.b = rd2Var;
        this.c = mn2Var2;
        this.d = mn2Var;
    }

    public p11() {
        this.a = 21;
        this.b = new fj2(BuildConfig.FLAVOR, 0L, null);
        this.c = new fj2(BuildConfig.FLAVOR, 0L, null);
        this.d = new ArrayList();
    }

    public p11(ox1 ox1Var, rd2 rd2Var, qp0 qp0Var) {
        this.a = 16;
        this.b = rd2Var;
        this.c = qp0Var;
        Objects.requireNonNull(ox1Var);
        this.d = ox1Var;
    }

    public p11(ox1 ox1Var, zzaij zzaijVar, rd2 rd2Var) {
        this.a = 20;
        this.b = zzaijVar;
        this.c = rd2Var;
        Objects.requireNonNull(ox1Var);
        this.d = ox1Var;
    }

    public p11(ox1 ox1Var, tg2 tg2Var, rd2 rd2Var) {
        this.a = 18;
        this.b = tg2Var;
        this.c = rd2Var;
        Objects.requireNonNull(ox1Var);
        this.d = ox1Var;
    }

    public p11(fj2 fj2Var) {
        this.a = 21;
        this.b = fj2Var;
        this.c = fj2Var.clone();
        this.d = new ArrayList();
    }

    public p11(Context context, int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = context;
                return;
            default:
                try {
                    this.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                    this.c = "5.12.0";
                    return;
                } catch (PackageManager.NameNotFoundException unused) {
                    throw null;
                }
        }
    }

    public p11(ge geVar, k60 k60Var, sm0 sm0Var, f02 f02Var) {
        this.a = 8;
        this.b = geVar;
        this.c = k60Var;
        this.d = f02Var;
    }

    public p11(p62 p62Var, o62 o62Var, bu buVar) {
        this.a = 12;
        p62Var.getClass();
        o62Var.getClass();
        buVar.getClass();
        this.b = p62Var;
        this.c = o62Var;
        this.d = buVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p11(p62 p62Var, o62 o62Var) {
        this(p62Var, o62Var, au.b);
        this.a = 12;
        p62Var.getClass();
    }

    public p11(Context context, TypedArray typedArray) {
        this.a = 7;
        this.b = context;
        this.c = typedArray;
    }

    public p11(Runnable runnable) {
        this.a = 2;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public p11(Context context, LocationManager locationManager) {
        this.a = 10;
        this.d = new su1();
        this.b = context;
        this.c = locationManager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p11(c cVar) {
        this(cVar.getViewModelStore(), cVar.getDefaultViewModelProviderFactory(), cVar.getDefaultViewModelCreationExtras());
        this.a = 12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p11(q62 q62Var, o62 o62Var) {
        bu defaultViewModelCreationExtras;
        this.a = 12;
        p62 viewModelStore = q62Var.getViewModelStore();
        if (q62Var instanceof nl0) {
            defaultViewModelCreationExtras = ((nl0) q62Var).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = au.b;
        }
        this(viewModelStore, o62Var, defaultViewModelCreationExtras);
    }

    public p11(String str, int i) {
        this.a = i;
        switch (i) {
            case 26:
                p11 p11Var = new p11(25);
                this.c = p11Var;
                this.d = p11Var;
                this.b = str;
                break;
            default:
                nl1 nl1Var = new nl1();
                this.c = nl1Var;
                this.d = nl1Var;
                this.b = str;
                break;
        }
    }

    public p11(Matcher matcher, CharSequence charSequence) {
        this.a = 1;
        charSequence.getClass();
        this.b = matcher;
        this.c = new z11(this);
    }

    public /* synthetic */ p11(int i) {
        this.a = i;
    }
}
