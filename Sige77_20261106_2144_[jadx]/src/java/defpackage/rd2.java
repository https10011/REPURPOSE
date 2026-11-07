package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rd2 implements s81, em2, OnCompleteListener, ph1, ac {
    public static rd2 d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public rd2(int i) {
        this.a = i;
        switch (i) {
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                break;
            default:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static rd2 d(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new rd2(2, channel, fileLockLock);
                } catch (IOException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // defpackage.em2
    public void a(Status status) {
        try {
            ((em2) this.b).a(status);
        } catch (RemoteException e) {
            ((h01) this.c).g("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        int i = u83.l;
        a83 a83Var = new a83((TaskCompletionSource) obj2);
        a93 a93Var = (a93) ((b93) obj).l();
        String[] strArr = (String[]) this.c;
        String str = (String) this.b;
        Parcel parcelF = a93Var.F();
        fv2.c(parcelF, a83Var);
        parcelF.writeString(str);
        parcelF.writeInt(0);
        parcelF.writeStringArray(strArr);
        parcelF.writeByteArray(null);
        a93Var.G(parcelF, 1);
    }

    public String b(String str) throws Exception {
        SharedPreferences sharedPreferences;
        Context context = (Context) this.c;
        if (context == null) {
            throw new Exception("context is null");
        }
        boolean z = false;
        if (((SharedPreferences) this.b) == null) {
            try {
                sharedPreferences = context.getSharedPreferences(nj2.t(context) + "_tcrypto", 0);
                this.b = sharedPreferences;
            } catch (Exception e) {
                cc2.c(Log.getStackTraceString(e));
                sharedPreferences = null;
            }
            this.b = sharedPreferences;
        }
        if (((SharedPreferences) this.b) == null) {
            throw new Exception("sp is null");
        }
        synchronized (nk1.class) {
        }
        if (!zi0.b.g()) {
            throw new Exception("keystore decrypt error");
        }
        String string = ((SharedPreferences) this.b).getString(str, BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string) || string.contains("_")) {
            return BuildConfig.FLAVOR;
        }
        String str2 = new String(new ep1(6, z).k(Base64.decode(string, 2)));
        if (TextUtils.isEmpty(str2)) {
            throw new Exception("rsaCrypter decrypt error");
        }
        return str2;
    }

    @Override // defpackage.em2
    public void c(ep1 ep1Var) {
        try {
            ((em2) this.b).c(ep1Var);
        } catch (RemoteException e) {
            ((h01) this.c).g("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        bo3 bo3Var = (bo3) this.b;
        zn3 zn3VarC = vm3.c();
        bo3 bo3VarB = vm3.b(zn3VarC, bo3Var);
        try {
            ListenableFuture listenableFutureCall = ((ac) this.c).call();
            vm3.b(zn3VarC, bo3VarB);
            listenableFutureCall.getClass();
            return listenableFutureCall;
        } catch (Throwable th) {
            try {
                pm3.a(th);
                throw th;
            } catch (Throwable th2) {
                vm3.b(zn3VarC, bo3VarB);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory e(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.b) == null) {
            Context context = (Context) this.c;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.b = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.b = map;
        }
        String str4 = (String) ((Map) this.b).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public void f() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override // defpackage.em2
    public void i(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            ((em2) this.b).i(status, phoneAuthCredential);
        } catch (RemoteException e) {
            ((h01) this.c).g("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    @Override // defpackage.em2
    public void j(zzahd zzahdVar, zo2 zo2Var) {
        try {
            ((em2) this.b).j(zzahdVar, zo2Var);
        } catch (RemoteException e) {
            ((h01) this.c).g("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    @Override // defpackage.s81
    public u92 k(View view, u92 u92Var) {
        ViewPager viewPager = (ViewPager) this.c;
        u92 u92VarI = x52.i(view, u92Var);
        if (u92VarI.a.q()) {
            return u92VarI;
        }
        Rect rect = (Rect) this.b;
        rect.left = u92VarI.b();
        rect.top = u92VarI.d();
        rect.right = u92VarI.c();
        rect.bottom = u92VarI.a();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            u92 u92VarB = x52.b(viewPager.getChildAt(i), u92VarI);
            rect.left = Math.min(u92VarB.b(), rect.left);
            rect.top = Math.min(u92VarB.d(), rect.top);
            rect.right = Math.min(u92VarB.c(), rect.right);
            rect.bottom = Math.min(u92VarB.a(), rect.bottom);
        }
        return u92VarI.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // defpackage.em2
    public void m(zzahd zzahdVar) {
        try {
            ((em2) this.b).m(zzahdVar);
        } catch (RemoteException e) {
            ((h01) this.c).g("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    @Override // defpackage.em2
    public void o(kp2 kp2Var) {
        try {
            ((em2) this.b).o(kp2Var);
        } catch (RemoteException e) {
            ((h01) this.c).g("RemoteException when sending get recaptcha config response.", e, new Object[0]);
        }
    }

    public void onComplete(Task task) {
        RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.b;
        String str = (String) this.c;
        tw2 tw2Var = RecaptchaActivity.o0;
        boolean z = false;
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            recaptchaActivity.h();
            return;
        }
        List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            recaptchaActivity.startActivity(intent);
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
        Intent intent3 = (Intent) new kj0(intent2, 9).b;
        intent3.addFlags(1073741824);
        intent3.addFlags(268435456);
        intent3.setData((Uri) task.getResult());
        recaptchaActivity.startActivity(intent3, null);
    }

    public String toString() {
        switch (this.a) {
            case 11:
                ac acVar = (ac) this.c;
                StringBuilder sb = new StringBuilder(acVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(acVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.em2
    public void z(p11 p11Var) {
        try {
            ((em2) this.b).z(p11Var);
        } catch (RemoteException e) {
            ((h01) this.c).g("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    public /* synthetic */ rd2(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public rd2(Context context, int i) {
        this.a = i;
        switch (i) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                this.b = null;
                this.c = context;
                break;
            default:
                this.c = context.getApplicationContext();
                break;
        }
    }

    public rd2(em2 em2Var, h01 h01Var) {
        this.a = 7;
        gu2.o(em2Var);
        this.b = em2Var;
        gu2.o(h01Var);
        this.c = h01Var;
    }

    public rd2(ExecutorService executorService) {
        this.a = 4;
        this.c = new mb(0);
        this.b = executorService;
    }

    public /* synthetic */ rd2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public rd2(ViewPager viewPager) {
        this.a = 5;
        this.c = viewPager;
        this.b = new Rect();
    }
}
