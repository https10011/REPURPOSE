package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.hjq.toast.BuildConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import org.json.JSONException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class sp0 {
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
    public static final int[] b = {-1, -1, -1, -3};
    public static final int[] c = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] d = {-1, -1, -1, -5, 1, 0, -4, 3};
    public static final Object e = new Object();
    public static volatile nc0 f;

    public static void A(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                e.g(ts.l(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof c) {
            ((c) activity).validateRequestPermissionsRequestCode(i);
        }
        activity.requestPermissions(strArr, i);
    }

    public static void B(HashMap map) {
        String[] strArr;
        List listD;
        ConcurrentHashMap concurrentHashMap = t32.e;
        t32 t32Var = t32.a;
        if (mt.a.contains(t32.class)) {
            return;
        }
        try {
            if (!t32.c.get()) {
                t32Var.b();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare(str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String strH = h42.H(t32Var.c(str, str2.subSequence(i, length + 1).toString()));
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (listD = new Regex(",").d(str3)) == null || (strArr = (String[]) listD.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(v11.a(objArrCopyOf.length));
                    wb.m(objArrCopyOf, linkedHashSet);
                    if (linkedHashSet.contains(strH)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(strH);
                    } else if (strArr.length < 5) {
                        sb.append(str3);
                        sb.append(",");
                        sb.append(strH);
                    } else {
                        for (int i2 = 1; i2 < 5; i2++) {
                            sb.append(strArr[i2]);
                            sb.append(",");
                        }
                        sb.append(strH);
                        linkedHashSet.remove(strArr[0]);
                    }
                    concurrentHashMap.put(str, sb.toString());
                } else {
                    concurrentHashMap.put(str, strH);
                }
            }
            String strB = h42.B(concurrentHashMap);
            if (mt.a.contains(t32Var)) {
                return;
            }
            try {
                i90.c().execute(new yn(strB, 2));
            } catch (Throwable th) {
                mt.a(t32Var, th);
            }
        } catch (Throwable th2) {
            mt.a(t32.class, th2);
        }
    }

    public static void C(rc2 rc2Var, float f2) {
        float f3;
        float f4;
        hk1 hk1Var = (hk1) rc2Var.b;
        CardView cardView = (CardView) rc2Var.c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != hk1Var.e || hk1Var.f != useCompatPadding || hk1Var.g != preventCornerOverlap) {
            hk1Var.e = f2;
            hk1Var.f = useCompatPadding;
            hk1Var.g = preventCornerOverlap;
            hk1Var.b(null);
            hk1Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            rc2Var.C(0, 0, 0, 0);
            return;
        }
        hk1 hk1Var2 = (hk1) rc2Var.b;
        float f5 = hk1Var2.e;
        float f6 = hk1Var2.a;
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - ik1.a) * ((double) f6)) + ((double) f5));
        } else {
            int i = ik1.b;
            f3 = f5;
        }
        int iCeil = (int) Math.ceil(f3);
        if (cardView.getPreventCornerOverlap()) {
            f4 = (float) (((1.0d - ik1.a) * ((double) f6)) + ((double) (f5 * 1.5f)));
        } else {
            f4 = f5 * 1.5f;
        }
        int iCeil2 = (int) Math.ceil(f4);
        rc2Var.C(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static void D(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            ry1.a(view, charSequence);
            return;
        }
        ty1 ty1Var = ty1.X;
        if (ty1Var != null && ty1Var.a == view) {
            ty1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ty1(view, charSequence);
            return;
        }
        ty1 ty1Var2 = ty1.Y;
        if (ty1Var2 != null && ty1Var2.a == view) {
            ty1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static boolean E(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void F(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        am2.S(iArr, iArr3);
        x(iArr3, iArr2);
    }

    public static void G(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        am2.S(iArr, iArr3);
        x(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            am2.S(iArr2, iArr3);
            x(iArr3, iArr2);
        }
    }

    public static gh H(gh ghVar, int i) {
        gh ghVar2 = new gh();
        int i2 = ghVar.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || ghVar.g(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                ghVar2.d(i8, i);
            } else {
                if (i8 == 0) {
                    ghVar2.d(i5 | 1, i);
                } else {
                    ghVar2.d(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return ghVar2;
    }

    public static void I(int[] iArr, int[] iArr2, int[] iArr3) {
        if (am2.V(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & ((long) iArr3[3])) - 2) + j2);
        }
    }

    public static dx2 J(byte[] bArr) {
        try {
            xn3 xn3VarU = xn3.u(bArr, wr2.b);
            te3 te3Var = te3.b;
            tr3 tr3VarA = kg3.a(xn3VarU.B());
            vf3 vf3Var = new vf3(0, xn3VarU, tr3VarA);
            cg3 cg3Var = (cg3) te3Var.a.get();
            cg3Var.getClass();
            return !cg3Var.d.containsKey(new fg3(vf3.class, tr3VarA)) ? new xd3(vf3Var) : te3Var.b(vf3Var);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static void K(String str, zm2 zm2Var, mn2 mn2Var, an2 an2Var, ep1 ep1Var) {
        try {
            gu2.o(zm2Var);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zm2Var.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            ep1Var.H(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                L(httpURLConnection, mn2Var, an2Var);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            mn2Var.zza("TIMEOUT");
        } catch (IOException e2) {
            e = e2;
            mn2Var.zza(e.getMessage());
        } catch (NullPointerException e3) {
            e = e3;
            mn2Var.zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            mn2Var.zza("<<Network Error>>");
        } catch (JSONException e4) {
            e = e4;
            mn2Var.zza(e.getMessage());
        }
    }

    public static void L(HttpURLConnection httpURLConnection, mn2 mn2Var, an2 an2Var) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                boolean z = false;
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (responseCode >= 200 && responseCode < 300) {
                    z = true;
                }
                if (z) {
                    mn2Var.s(aj0.W(string, an2Var));
                } else {
                    mn2Var.zza(aj0.V(string));
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                httpURLConnection.disconnect();
                throw th3;
            }
        } catch (SocketTimeoutException unused) {
            mn2Var.zza("TIMEOUT");
            httpURLConnection.disconnect();
        } catch (IOException e2) {
            e = e2;
            mn2Var.zza(e.getMessage());
            httpURLConnection.disconnect();
        } catch (sk2 e3) {
            e = e3;
            mn2Var.zza(e.getMessage());
            httpURLConnection.disconnect();
        }
    }

    public static void M(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static byte[] N(dx2 dx2Var) {
        return dx2Var instanceof xd3 ? ((xn3) ((xd3) dx2Var).a.c).c() : ((xn3) ((vf3) te3.b.d(dx2Var)).c).c();
    }

    public static es1 a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        } catch (Throwable unused) {
            if (g93.i) {
                g93.g("com.android.vending not found", new Object[0]);
            }
        }
        v5 v5Var = new v5(2);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, v5Var, 1)) {
            if (!g93.i) {
                return null;
            }
            g93.g("AdvertisingIdClient bindService failed", new Object[0]);
            return null;
        }
        try {
            if (v5Var.b) {
                throw new IllegalStateException();
            }
            v5Var.b = true;
            IBinder iBinder = (IBinder) v5Var.c.poll(3L, TimeUnit.SECONDS);
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                Parcel parcelObtain3 = Parcel.obtain();
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    try {
                        parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        parcelObtain3.writeInt(1);
                        iBinder.transact(2, parcelObtain3, parcelObtain4, 0);
                        parcelObtain4.readException();
                        boolean z = parcelObtain4.readInt() != 0;
                        parcelObtain4.recycle();
                        parcelObtain3.recycle();
                        es1 es1Var = new es1(1, string, z);
                        context.unbindService(v5Var);
                        return es1Var;
                    } catch (Throwable th) {
                        parcelObtain4.recycle();
                        parcelObtain3.recycle();
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        } catch (Throwable unused2) {
            if (g93.i) {
                g93.g("AdvertisingIdClient get AdInfo failed", new Object[0]);
            }
            return null;
        }
        context.unbindService(v5Var);
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        int i = (int) j4;
        iArr3[3] = i;
        if (((int) (j4 >>> 32)) != 0 || ((i >>> 1) >= 2147483646 && am2.B(iArr3, b))) {
            c(iArr3);
        }
    }

    public static void c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) ((4294967295L & ((long) iArr[3])) + 2 + j2);
    }

    public static int d(Context context, String str) {
        if (str == null) {
            uq1.h("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new p71(context).a.areNotificationsEnabled() ? 0 : -1;
    }

    public static boolean e() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            hc0.d();
            hc0 hc0VarD = hc0.d();
            hc0VarD.a();
            Context context = hc0VarD.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static SafeParcelable f(byte[] bArr, Parcelable.Creator creator) {
        gu2.o(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }

    public static void g(hh hhVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    hhVar.d(i5, i4);
                    hhVar.d(i5, i6);
                    hhVar.d(i4, i5);
                    hhVar.d(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        hhVar.d(i7, i7);
        int i8 = i7 + 1;
        hhVar.d(i8, i7);
        hhVar.d(i7, i8);
        int i9 = i + i2;
        hhVar.d(i9, i7);
        hhVar.d(i9, i8);
        hhVar.d(i9, i9 - 1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(gd0 gd0Var, gs gsVar) {
        ud0 ud0Var;
        Ref.ObjectRef objectRef;
        u e2;
        jx jxVar;
        if (gsVar instanceof ud0) {
            ud0Var = (ud0) gsVar;
            int i = ud0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ud0Var.d = i - Integer.MIN_VALUE;
            } else {
                ud0Var = new ud0(gsVar);
            }
        } else {
            ud0Var = new ud0(gsVar);
        }
        Object obj = ud0Var.c;
        Object obj2 = ft.a;
        int i2 = ud0Var.d;
        if (i2 == 0) {
            zi0.B(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            jx jxVar2 = new jx(objectRef2, 2);
            try {
                ud0Var.a = objectRef2;
                ud0Var.b = jxVar2;
                ud0Var.d = 1;
                if (gd0Var.A(jxVar2, ud0Var) == obj2) {
                    return obj2;
                }
                objectRef = objectRef2;
            } catch (u e3) {
                objectRef = objectRef2;
                e2 = e3;
                jxVar = jxVar2;
                if (e2.a != jxVar) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jxVar = ud0Var.b;
            objectRef = ud0Var.a;
            try {
                zi0.B(obj);
            } catch (u e4) {
                e2 = e4;
                if (e2.a != jxVar) {
                    throw e2;
                }
            }
        }
        return objectRef.element;
    }

    public static gh i(gh ghVar, int i, int i2) {
        uh0 uh0Var;
        int i3 = ghVar.b / i2;
        if (i2 == 4) {
            uh0Var = uh0.j;
        } else if (i2 == 6) {
            uh0Var = uh0.i;
        } else if (i2 == 8) {
            uh0Var = uh0.l;
        } else if (i2 == 10) {
            uh0Var = uh0.h;
        } else {
            if (i2 != 12) {
                e.g("Unsupported word size ".concat(String.valueOf(i2)));
                return null;
            }
            uh0Var = uh0.g;
        }
        md2 md2Var = new md2(uh0Var);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = ghVar.b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= ghVar.g((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        md2Var.e(iArr, i4 - i3);
        gh ghVar2 = new gh();
        ghVar2.d(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            ghVar2.d(iArr[i9], i2);
        }
        return ghVar2;
    }

    public static final Class j(String str) {
        if (mt.a.contains(sp0.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            mt.a(sp0.class, th);
            return null;
        }
    }

    public static ColorStateList k(Context context, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        cj1 cj1Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        dj1 dj1Var = new dj1(resources, theme);
        synchronized (ej1.c) {
            try {
                SparseArray sparseArray = (SparseArray) ej1.b.get(dj1Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (cj1Var = (cj1) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (cj1Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || cj1Var.c != 0) {
                            if (theme == null || cj1Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = cj1Var.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = ej1.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = ro.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (ej1.c) {
            try {
                WeakHashMap weakHashMap = ej1.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(dj1Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(dj1Var, sparseArray2);
                }
                sparseArray2.append(i, new cj1(colorStateListA, dj1Var.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static ra1 l(Long l, Long l2) {
        if (l == null && l2 == null) {
            return new ra1(null, null);
        }
        if (l == null) {
            return new ra1(null, m(l2.longValue()));
        }
        if (l2 == null) {
            return new ra1(m(l.longValue()), null);
        }
        Calendar calendarF = y32.f();
        Calendar calendarG = y32.g(null);
        calendarG.setTimeInMillis(l.longValue());
        Calendar calendarG2 = y32.g(null);
        calendarG2.setTimeInMillis(l2.longValue());
        if (calendarG.get(1) == calendarG2.get(1)) {
            return calendarG.get(1) == calendarF.get(1) ? new ra1(p(l.longValue(), Locale.getDefault()), p(l2.longValue(), Locale.getDefault())) : new ra1(p(l.longValue(), Locale.getDefault()), q(l2.longValue(), Locale.getDefault()));
        }
        return new ra1(q(l.longValue(), Locale.getDefault()), q(l2.longValue(), Locale.getDefault()));
    }

    public static String m(long j) {
        Calendar calendarF = y32.f();
        Calendar calendarG = y32.g(null);
        calendarG.setTimeInMillis(j);
        return calendarF.get(1) == calendarG.get(1) ? p(j, Locale.getDefault()) : q(j, Locale.getDefault());
    }

    public static final Method n(Class cls, String str, Class... clsArr) {
        if (!mt.a.contains(sp0.class)) {
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                mt.a(sp0.class, th);
            }
        }
        return null;
    }

    public static final Method o(Class cls, String str, Class... clsArr) {
        if (!mt.a.contains(sp0.class)) {
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                mt.a(sp0.class, th);
            }
        }
        return null;
    }

    public static String p(long j, Locale locale) {
        return y32.b("MMMd", locale).format(new Date(j));
    }

    public static String q(long j, Locale locale) {
        return y32.b("yMMMd", locale).format(new Date(j));
    }

    public static void r(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static final Object s(Class cls, Method method, Object obj, Object... objArr) {
        if (!mt.a.contains(sp0.class)) {
            try {
                cls.getClass();
                method.getClass();
                if (obj != null) {
                    obj = cls.cast(obj);
                }
                try {
                    return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            } catch (Throwable th) {
                mt.a(sp0.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0195  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:139:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[PHI: r6
      0x00db: PHI (r6v24 java.lang.String) = (r6v23 java.lang.String), (r6v36 java.lang.String) binds: [B:46:0x00c3, B:50:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void t(Intent intent) {
        int iIntValue;
        int i;
        String string;
        m41 m41Var;
        String string2;
        Object[] objArr;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j;
        long j2;
        hc0 hc0VarD;
        xc0 xc0Var;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (E(intent)) {
            u("_nr", intent.getExtras());
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : e()) {
            d02 d02Var = (d02) FirebaseMessaging.k.get();
            if (d02Var == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            o41 o41Var = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            i = 0;
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            hc0 hc0VarD2 = hc0.d();
                            try {
                                Object obj2 = qc0.m;
                                string = (String) Tasks.await(((qc0) hc0VarD2.b(rc0.class)).c());
                            } catch (InterruptedException e2) {
                                e = e2;
                                sm0.n(e);
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e3) {
                            e = e3;
                        }
                    }
                    String str10 = string;
                    hc0 hc0VarD3 = hc0.d();
                    hc0VarD3.a();
                    String packageName = hc0VarD3.a.getPackageName();
                    if (kj0.N(extras)) {
                        m41Var = m41.DISPLAY_NOTIFICATION;
                    } else {
                        m41Var = m41.DATA_MESSAGE;
                    }
                    m41 m41Var2 = m41Var;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        objArr = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    }
                    if (objArr == 2) {
                        i2 = 5;
                    } else if (objArr == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = BuildConfig.FLAVOR;
                    }
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = BuildConfig.FLAVOR;
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = BuildConfig.FLAVOR;
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = BuildConfig.FLAVOR;
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e4) {
                            Log.w("FirebaseMessaging", "error parsing project number", e4);
                            hc0VarD = hc0.d();
                            xc0Var = hc0VarD.c;
                            hc0VarD.a();
                            str6 = xc0Var.e;
                            if (str6 != null) {
                                try {
                                    j = Long.parseLong(str6);
                                } catch (NumberFormatException e5) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e5);
                                    hc0VarD.a();
                                    str7 = xc0Var.b;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length < 2) {
                                            j = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j = 0;
                                            } else {
                                                try {
                                                    j = Long.parseLong(str8);
                                                } catch (NumberFormatException e6) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e6);
                                                    j = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j = Long.parseLong(str7);
                                        } catch (NumberFormatException e7) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e7);
                                            j = 0;
                                        }
                                    }
                                }
                            } else {
                                hc0VarD.a();
                                str7 = xc0Var.b;
                                if (str7.startsWith("1:")) {
                                    j = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j = 0;
                                        } else {
                                            j = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        hc0VarD = hc0.d();
                        xc0Var = hc0VarD.c;
                        hc0VarD.a();
                        str6 = xc0Var.e;
                        if (str6 != null) {
                            j = Long.parseLong(str6);
                        } else {
                            hc0VarD.a();
                            str7 = xc0Var.b;
                            if (str7.startsWith("1:")) {
                                j = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    if (j > 0) {
                        j2 = j;
                    } else {
                        j2 = 0;
                    }
                    o41Var = new o41(j2, str, str10, m41Var2, packageName, str3, i3, i, str2, str4, str5);
                }
                i = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    hc0 hc0VarD4 = hc0.d();
                    Object obj3 = qc0.m;
                    string = (String) Tasks.await(((qc0) hc0VarD4.b(rc0.class)).c());
                }
                String str11 = string;
                hc0 hc0VarD5 = hc0.d();
                hc0VarD5.a();
                String packageName2 = hc0VarD5.a.getPackageName();
                if (kj0.N(extras)) {
                    m41Var = m41.DISPLAY_NOTIFICATION;
                } else {
                    m41Var = m41.DATA_MESSAGE;
                }
                m41 m41Var3 = m41Var;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i2 = 5;
                } else if (objArr == 1) {
                    i2 = 10;
                }
                int i4 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = BuildConfig.FLAVOR;
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = BuildConfig.FLAVOR;
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = BuildConfig.FLAVOR;
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = BuildConfig.FLAVOR;
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    hc0VarD = hc0.d();
                    xc0Var = hc0VarD.c;
                    hc0VarD.a();
                    str6 = xc0Var.e;
                    if (str6 != null) {
                        j = Long.parseLong(str6);
                    } else {
                        hc0VarD.a();
                        str7 = xc0Var.b;
                        if (str7.startsWith("1:")) {
                            j = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                if (j > 0) {
                    j2 = j;
                } else {
                    j2 = 0;
                }
                o41Var = new o41(j2, str, str11, m41Var3, packageName2, str3, i4, i, str2, str4, str5);
            }
            if (o41Var == null) {
                return;
            }
            try {
                be beVar = new be(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                k60 k60Var = new k60("proto");
                sm0 sm0Var = new sm0(13);
                e02 e02Var = (e02) d02Var;
                Set set = e02Var.a;
                if (!set.contains(k60Var)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", k60Var, set));
                }
                new p11(e02Var.b, k60Var, sm0Var, e02Var.c).o(new nd(new p41(o41Var), beVar));
            } catch (RuntimeException e8) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e8);
            }
        }
    }

    public static void u(String str, Bundle bundle) {
        try {
            hc0.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = kj0.N(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            i6 i6Var = (i6) hc0.d().b(i6.class);
            if (i6Var != null) {
                ((j6) i6Var).a(str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void v(int i, long j, byte[] bArr) {
        r(bArr, (int) (j >>> 32), i);
        r(bArr, (int) (j & 4294967295L), i + 4);
    }

    public static void w(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        am2.I(iArr, iArr2, iArr4);
        x(iArr4, iArr3);
    }

    public static void x(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = j4 + j8;
        long j10 = j7 + (j8 << 1);
        long j11 = j6 + (j10 << 1);
        long j12 = j2 + j11;
        long j13 = j5 + (j11 << 1);
        long j14 = j + j13;
        iArr2[0] = (int) j14;
        long j15 = j12 + (j14 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = j3 + j10 + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = j9 + (j13 << 1) + (j16 >>> 32);
        iArr2[3] = (int) j17;
        y(iArr2, (int) (j17 >>> 32));
    }

    public static void y(int[] iArr, int i) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[3])) + (j << 1) + j3;
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static void z(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            g7.g(context, broadcastReceiver, intentFilter);
        } else if (i >= 26) {
            g7.f(context, broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
