package defpackage;

import android.R;
import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.FirebaseAuth;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qp0 implements mn2 {
    public static final ba0 i = new ba0(7);
    public static qp0 v;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public qp0(int i2) {
        switch (i2) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                this.f = new Handler(Looper.getMainLooper());
                Context context = ue2.j.a;
                this.a = context;
                this.d = new ec1();
                this.e = new lf2();
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                FutureTask futureTask = new FutureTask(new a20(context, 3));
                executorServiceNewSingleThreadExecutor.execute(futureTask);
                pv2 pv2Var = new pv2();
                pv2Var.a = futureTask;
                this.c = pv2Var;
                if (ud2.e == null) {
                    synchronized (ud2.class) {
                        try {
                            if (ud2.e == null) {
                                u41 u41Var = new u41(10);
                                ud2 ud2Var = new ud2();
                                ud2Var.b = new hs1(8);
                                ud2Var.c = this;
                                ud2Var.a = u41Var;
                                ud2.e = ud2Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                this.b = ud2.e;
                return;
            default:
                this.a = new int[]{2131230836, 2131230834, 2131230760};
                this.b = new int[]{2131230784, 2131230819, 2131230791, 2131230786, 2131230787, 2131230790, 2131230789};
                this.c = new int[]{2131230833, 2131230835, 2131230777, 2131230829, 2131230830, 2131230831, 2131230832};
                this.d = new int[]{2131230809, 2131230775, 2131230808};
                this.e = new int[]{2131230827, 2131230837};
                this.f = new int[]{2131230763, 2131230769, 2131230764, 2131230770};
                return;
        }
    }

    public static boolean b(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i2) {
        int iC = gx1.c(context, 2130968837);
        int iB = gx1.b(context, 2130968832);
        int[] iArr = gx1.b;
        int[] iArr2 = gx1.d;
        int iC2 = so.c(iC, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, gx1.c, gx1.f}, new int[]{iB, iC2, so.c(iC, i2), i2});
    }

    public static LayerDrawable g(aj1 aj1Var, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableC = aj1Var.c(context, 2131230823);
        Drawable drawableC2 = aj1Var.c(context, 2131230824);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void l(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = m8.b;
        }
        drawableMutate.setColorFilter(m8.c(i2, mode));
    }

    public void A(int i2) {
        if (i2 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i2)));
        }
        this.d = Integer.valueOf(i2);
    }

    public v0 B(int i2) {
        t10 t10Var;
        AtomicLong atomicLong = (AtomicLong) this.b;
        if (((int) (atomicLong.get() >>> 32)) > i2) {
            sn0 sn0Var = sn0.v;
            return sn0Var != null ? sn0Var : new sn0();
        }
        cm3 cm3Var = new cm3(i2);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.c;
            cm3 cm3Var2 = (cm3) atomicReference.get();
            if (cm3Var2 != null && cm3Var2.v > i2) {
                sn0 sn0Var2 = sn0.v;
                return sn0Var2 != null ? sn0Var2 : new sn0();
            }
            do {
                if (atomicReference.compareAndSet(cm3Var2, cm3Var)) {
                    if (((int) (atomicLong.get() >>> 32)) > i2) {
                        cm3Var.cancel(true);
                        while (!atomicReference.compareAndSet(cm3Var, null) && atomicReference.get() == cm3Var) {
                        }
                        return cm3Var;
                    }
                    z83 z83Var = (z83) this.a;
                    ac acVar = (ac) z83Var.c;
                    if (acVar == null || (t10Var = (t10) z83Var.b) == null) {
                        cm3Var.n((mp1) this.f);
                        return cm3Var;
                    }
                    rd2 rd2VarA = to3.a(acVar);
                    h02 h02Var = new h02();
                    h02Var.w = new g02(h02Var, rd2VarA);
                    t10Var.execute(h02Var);
                    cm3Var.n(h02Var);
                    return cm3Var;
                }
            } while (atomicReference.get() == cm3Var2);
        }
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f;
        if (map != null) {
            map.put(str, str2);
        } else {
            uq1.q("Property \"autoMetadata\" has not been set");
        }
    }

    public od c() {
        String strConcat = ((String) this.a) == null ? " transportName" : BuildConfig.FLAVOR;
        if (((d60) this.c) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.e) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new od((String) this.a, (Integer) this.b, (d60) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        uq1.q("Missing required properties:".concat(strConcat));
        return null;
    }

    public Task e(Task task) {
        return task.continueWith(new w21(), new ur(this));
    }

    public qf2 f() {
        Context context = (Context) this.a;
        pv2 pv2Var = (pv2) this.c;
        synchronized (qf2.n) {
            try {
                if (qf2.m == null) {
                    qf2.m = new qf2(context.getApplicationContext(), pv2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qf2.m;
    }

    public Object h(rp0 rp0Var, ArrayList arrayList) {
        Object objS;
        Object objS2;
        Class cls = (Class) this.b;
        if (!mt.a.contains(this)) {
            try {
                Object objS3 = sp0.s((Class) this.a, (Method) this.c, null, new Object[0]);
                if (objS3 != null && (objS = sp0.s(cls, (Method) this.d, objS3, rp0Var.a)) != null && (objS2 = sp0.s(cls, (Method) this.e, objS, arrayList)) != null) {
                    return sp0.s(cls, (Method) this.f, objS2, new Object[0]);
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public ColorStateList i(Context context, int i2) {
        if (i2 == 2131230780) {
            return sp0.k(context, 2131099669);
        }
        if (i2 == 2131230826) {
            return sp0.k(context, 2131099672);
        }
        if (i2 != 2131230825) {
            if (i2 == 2131230768) {
                return d(context, gx1.c(context, 2130968832));
            }
            if (i2 == 2131230762) {
                return d(context, 0);
            }
            if (i2 == 2131230767) {
                return d(context, gx1.c(context, 2130968830));
            }
            if (i2 == 2131230821 || i2 == 2131230822) {
                return sp0.k(context, 2131099671);
            }
            if (b((int[]) this.b, i2)) {
                return gx1.d(context, 2130968838);
            }
            if (b((int[]) this.e, i2)) {
                return sp0.k(context, 2131099668);
            }
            if (b((int[]) this.f, i2)) {
                return sp0.k(context, 2131099667);
            }
            if (i2 == 2131230818) {
                return sp0.k(context, 2131099670);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = gx1.d(context, 2130968889);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = gx1.b;
            iArr2[0] = gx1.b(context, 2130968889);
            iArr[1] = gx1.e;
            iArr2[1] = gx1.c(context, 2130968836);
            iArr[2] = gx1.f;
            iArr2[2] = gx1.c(context, 2130968889);
        } else {
            int[] iArr3 = gx1.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = gx1.e;
            iArr2[1] = gx1.c(context, 2130968836);
            iArr[2] = gx1.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public pv2 j() {
        Context context = (Context) this.a;
        synchronized (pv2.d) {
            try {
                if (pv2.c == null) {
                    pv2.c = new pv2(context.getApplicationContext(), 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pv2.c;
    }

    public void k(String str, String str2, Bundle bundle) {
        int i2;
        String str3;
        String strEncodeToString;
        boolean zE;
        int i3;
        PackageInfo packageInfoC;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        hc0 hc0Var = (hc0) this.a;
        hc0Var.a();
        bundle.putString("gmp_app_id", hc0Var.c.b);
        e2 e2Var = (e2) this.b;
        synchronized (e2Var) {
            try {
                if (e2Var.a == 0 && (packageInfoC = e2Var.c("com.google.android.gms")) != null) {
                    e2Var.a = packageInfoC.versionCode;
                }
                i2 = e2Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i2));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((e2) this.b).a());
        e2 e2Var2 = (e2) this.b;
        synchronized (e2Var2) {
            try {
                if (((String) e2Var2.d) == null) {
                    e2Var2.f();
                }
                str3 = (String) e2Var2.d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        hc0 hc0Var2 = (hc0) this.a;
        hc0Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(hc0Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((sd) Tasks.await(((qc0) ((rc0) this.f)).d())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(((qc0) ((rc0) this.f)).c()));
        bundle.putString("cliv", "fcm-25.0.2");
        xl0 xl0Var = (xl0) ((zd1) this.e).get();
        d00 d00Var = (d00) ((zd1) this.d).get();
        if (xl0Var == null || d00Var == null) {
            return;
        }
        az azVar = (az) xl0Var;
        synchronized (azVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zl0 zl0Var = (zl0) azVar.a.get();
            synchronized (zl0Var) {
                zE = zl0Var.e(zl0.b, jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (zl0Var) {
                    i3 = 3;
                    zl0Var.a.a(new fu(i3, zl0Var, zl0Var.b(System.currentTimeMillis())));
                }
            } else {
                i3 = 1;
            }
        }
        if (i3 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(ts.v(i3)));
            bundle.putString("Firebase-Client", d00Var.a());
        }
    }

    public Task m(String str, String str2, Bundle bundle) {
        int i2;
        try {
            k(str, str2, bundle);
            mk1 mk1Var = (mk1) this.c;
            iz2 iz2Var = iz2.c;
            jj jjVar = mk1Var.c;
            if (jjVar.d() < 12000000) {
                return jjVar.e() != 0 ? mk1Var.a(bundle).continueWithTask(iz2Var, new vf3(13, mk1Var, bundle, false)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            ll3 ll3VarA = ll3.a(mk1Var.b);
            synchronized (ll3VarA) {
                i2 = ll3VarA.a;
                ll3VarA.a = i2 + 1;
            }
            return ll3VarA.b(new xg3(i2, 1, bundle, 1)).continueWith(iz2Var, c11.i);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    public v0 n() {
        AtomicLong atomicLong;
        long j;
        final int i2;
        ListenableFuture listenableFutureA;
        t10 t10Var = t10.a;
        mp1 mp1Var = (mp1) this.f;
        if (mp1Var.isDone()) {
            return mp1Var;
        }
        do {
            atomicLong = (AtomicLong) this.b;
            j = atomicLong.get();
            i2 = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) (((int) j) + 1)) & 4294967295L) | (((long) i2) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.d;
        mp1 mp1Var2 = new mp1();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(mp1Var2);
        if (listenableFuture == null) {
            rd2 rd2VarA = to3.a(new f6(this, i2, 12));
            h02 h02Var = new h02();
            h02Var.w = new g02(h02Var, rd2VarA);
            t10Var.execute(h02Var);
            listenableFutureA = h02Var;
        } else {
            bc bcVar = new bc() { // from class: wl3
                @Override // defpackage.bc
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.a.B(i2);
                }
            };
            int i3 = to3.a;
            listenableFutureA = dh0.a(listenableFuture, Throwable.class, new bg3(4, vm3.a(), bcVar), (wo1) this.e);
        }
        mp1Var2.n(listenableFutureA);
        am3 am3Var = new am3(this, i2);
        mp1Var2.a(new gc(this, mp1Var2, am3Var, 16, false), t10Var);
        return am3Var;
    }

    public Task o(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task taskContinueWithTask;
        if (str == null || str.isEmpty()) {
            str = "*";
        }
        Task taskW = w(str);
        if (bool.booleanValue() || taskW == null) {
            String str2 = str.isEmpty() ? "*" : str;
            if (bool.booleanValue() || (taskContinueWithTask = w(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.e;
                md2 md2Var = firebaseAuth.e;
                String str3 = firebaseAuth.i;
                md2Var.getClass();
                taskContinueWithTask = md2Var.m(new bl2(str3, 1)).continueWithTask(new vf3(this, str2));
            }
            taskW = taskContinueWithTask;
        }
        return taskW.continueWithTask(new gk1(this, recaptchaAction));
    }

    public yy2 p() throws GeneralSecurityException {
        if (((Integer) this.a) == null) {
            tv2.f("AES key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            tv2.f("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            tv2.f("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.d;
        if (num == null) {
            tv2.f("tag size is not set");
            return null;
        }
        if (((wy2) this.e) == null) {
            tv2.f("hash type is not set");
            return null;
        }
        if (((vy2) this.f) == null) {
            tv2.f("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        wy2 wy2Var = (wy2) this.e;
        if (wy2Var == wy2.c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (wy2Var == wy2.d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (wy2Var == wy2.e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (wy2Var == wy2.f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (wy2Var != wy2.i) {
                tv2.f("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new yy2(((Integer) this.a).intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (vy2) this.f, (wy2) this.e);
    }

    public n83 q() throws GeneralSecurityException {
        j83 j83Var = (j83) this.a;
        if (j83Var == null) {
            tv2.f("Elliptic curve type is not set");
            return null;
        }
        if (((i83) this.b) == null) {
            tv2.f("Hash type is not set");
            return null;
        }
        if (((dx2) this.d) == null) {
            tv2.f("DEM parameters are not set");
            return null;
        }
        if (((k83) this.e) == null) {
            tv2.f("Variant is not set");
            return null;
        }
        j83 j83Var2 = j83.e;
        if (j83Var != j83Var2 && ((l83) this.c) == null) {
            tv2.f("Point format is not set");
            return null;
        }
        if (j83Var != j83Var2 || ((l83) this.c) == null) {
            return new n83((j83) this.a, (i83) this.b, (l83) this.c, (dx2) this.d, (k83) this.e, (tr3) this.f);
        }
        tv2.f("For Curve25519 point format must not be set");
        return null;
    }

    public void r(int i2) {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.a = Integer.valueOf(i2);
    }

    @Override // defpackage.mn2
    public void s(an2 an2Var) {
        String str = (String) this.a;
        String str2 = (String) this.b;
        String str3 = (String) this.c;
        String str4 = (String) this.d;
        String str5 = ((zzahd) an2Var).b;
        bq2 bq2Var = new bq2();
        gu2.l(str);
        bq2Var.a = str;
        gu2.l(str2);
        bq2Var.b = str2;
        bq2Var.c = str3;
        bq2Var.d = str4;
        bq2Var.e = str5;
        ox1.w((ox1) this.f, (rd2) this.e, bq2Var, this);
    }

    public void t(dx2 dx2Var) throws GeneralSecurityException {
        if (!n83.g.contains(dx2Var)) {
            throw new GeneralSecurityException(ts.k("Invalid DEM parameters ", String.valueOf(dx2Var), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
        }
        this.d = dx2Var;
    }

    public void u(int i2) {
        if (i2 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i2)));
        }
        this.b = Integer.valueOf(i2);
    }

    public void v(String str) {
        sp0.M(sh3.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        sp0.M(!sh3.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public Task w(String str) {
        Task task;
        synchronized (this.a) {
            task = (Task) ((HashMap) this.b).get(str);
        }
        return task;
    }

    public void x(int i2) {
        if (i2 < 12 || i2 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i2)));
        }
        this.c = Integer.valueOf(i2);
    }

    public void y(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = sh3.a;
        this.e = str;
    }

    public Uri z() {
        String strL;
        String str = (String) this.b;
        String str2 = (String) this.c;
        Account account = oh3.a;
        Account account2 = (Account) this.d;
        sp0.M(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        sp0.M(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        sp0.M(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (oh3.a.equals(account2)) {
            strL = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strL = y00.l(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.e;
        StringBuilder sb = new StringBuilder(strL.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        ts.r(sb, "/", str, "/", str2);
        sb.append("/");
        sb.append(strL);
        sb.append("/");
        sb.append(str5);
        return new Uri.Builder().scheme("android").authority((String) this.a).path(sb.toString()).encodedFragment(mi3.a(((mo0) this.f).e())).build();
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((rd2) this.e).a(kv.m0(str));
    }

    public qp0(Context context) {
        this.b = "files";
        this.c = "common";
        this.d = sh3.b;
        this.e = BuildConfig.FLAVOR;
        no0 no0Var = ro0.b;
        this.f = new mo0(4);
        sp0.M(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public qp0(ac acVar) {
        this.b = new AtomicLong(-9223372034707292160L);
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
        t10 t10Var = t10.a;
        this.e = new wo1(t10Var);
        mp1 mp1Var = new mp1();
        this.f = mp1Var;
        z83 z83Var = new z83();
        z83Var.c = acVar;
        z83Var.b = t10Var;
        this.a = z83Var;
        mp1Var.a(z83Var, t10Var);
    }
}
