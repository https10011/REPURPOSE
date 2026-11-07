package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Objects;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gk1 implements wr, xr, e50, n90, InstallReferrerStateListener, ak, yw, g60, g31, ln2, Continuation, ph1, cv1 {
    public static gk1 c;
    public static final RootTelemetryConfiguration d = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public static final u41 e = new u41(11);
    public final /* synthetic */ int a;
    public Object b;

    public gk1(int i) {
        this.a = i;
        boolean z = false;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.b = new Vector();
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                this.b = new ArrayDeque(0);
                break;
            case 17:
                this.b = new ArrayList();
                break;
            case 25:
                this.b = new EnumMap(n73.class);
                break;
            default:
                rs2[] rs2VarArr = {sh1.e, e};
                wa waVar = new wa(26, z);
                waVar.b = rs2VarArr;
                byte[] bArr = ds2.a;
                this.b = waVar;
                break;
        }
    }

    public static synchronized gk1 q() {
        try {
            if (c == null) {
                c = new gk1(0, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    @Override // defpackage.yw
    public Object a(Function2 function2, mv1 mv1Var) {
        return ((yw) this.b).a(new cc1(function2, null, 0), mv1Var);
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        int i = u83.l;
        a83 a83Var = new a83((TaskCompletionSource) obj2);
        a93 a93Var = (a93) ((b93) obj).l();
        byte[] bArrA = ((ab3) this.b).a();
        Parcel parcelF = a93Var.F();
        fv2.c(parcelF, a83Var);
        parcelF.writeByteArray(bArrA);
        a93Var.G(parcelF, 31);
    }

    @Override // defpackage.g60
    public boolean b(Object obj, File file, da1 da1Var) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        v01 v01Var = (v01) this.b;
        byte[] bArr = (byte[]) v01Var.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        v01Var.g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        v01Var.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                v01Var.g(bArr);
                return true;
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.xr
    public as build() {
        return new as(new kj0(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.g31
    public boolean c(i31 i31Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.e50
    public void d(kv kvVar) {
        rq rqVar = new rq("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), rqVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new dg(this, kvVar, threadPoolExecutor, 6));
    }

    @Override // defpackage.xr
    public void e(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.yw
    public gd0 f() {
        return ((yw) this.b).f();
    }

    @Override // defpackage.g31
    public void g(i31 i31Var) {
        ny1 ny1Var = (ny1) this.b;
        boolean zP = ny1Var.a.a.p();
        Window.Callback callback = ny1Var.b;
        if (zP) {
            callback.onPanelClosed(108, i31Var);
        } else if (callback.onPreparePanel(0, null, i31Var)) {
            callback.onMenuOpened(108, i31Var);
        }
    }

    @Override // defpackage.cv1
    public Object get() {
        return new sc1(new ig3((cv1) ((qp0) this.b).b));
    }

    @Override // defpackage.xr
    public void i(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.n90
    public Object j() {
        qq qqVar = (qq) this.b;
        return new w60((hj0) qqVar.a, (hj0) qqVar.b, (hj0) qqVar.c, (hj0) qqVar.d, (s60) qqVar.e, (s60) qqVar.f, (ac2) qqVar.i);
    }

    public void k(p pVar) {
        ((Vector) this.b).addElement(pVar);
    }

    public ss l(ss ssVar) {
        return ssVar instanceof oh1 ? ssVar : new u5(-((r21) this.b).i(), ssVar);
    }

    public void m(s5 s5Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i = s5Var.a;
        if (i == 1) {
            recyclerView.b0.X(s5Var.b, s5Var.c);
            return;
        }
        if (i == 2) {
            recyclerView.b0.a0(s5Var.b, s5Var.c);
        } else if (i == 4) {
            recyclerView.b0.b0(s5Var.b, s5Var.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.b0.Z(s5Var.b, s5Var.c);
        }
    }

    @Override // defpackage.ak
    public void n(wj wjVar, gj1 gj1Var) {
        pk pkVar = (pk) this.b;
        pj1 pj1Var = rj1.b;
        pkVar.resumeWith(gj1Var);
    }

    public kg1 o(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iG = recyclerView.e.G();
        kg1 kg1Var = null;
        for (int i2 = 0; i2 < iG; i2++) {
            kg1 kg1VarI = RecyclerView.I(recyclerView.e.F(i2));
            if (kg1VarI != null && !kg1VarI.h() && kg1VarI.c == i) {
                if (!((ArrayList) recyclerView.e.d).contains(kg1VarI.a)) {
                    kg1Var = kg1VarI;
                    break;
                }
                kg1Var = kg1VarI;
            }
        }
        if (kg1Var != null) {
            if (!((ArrayList) recyclerView.e.d).contains(kg1Var.a)) {
                return kg1Var;
            }
        }
        return null;
    }

    public void onInstallReferrerSetupFinished(int i) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.b;
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    installReferrer.getClass();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (StringsKt.t(installReferrer2, "fb") || StringsKt.t(installReferrer2, "facebook"))) {
                        if (!set.contains(pa.class)) {
                            try {
                                i90.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installReferrer2).apply();
                            } catch (Throwable th) {
                                mt.a(pa.class, th);
                            }
                        }
                    }
                    i90.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i == 2) {
                i90.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            installReferrerClient.endConnection();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mt.a(this, th3);
            }
        }
    }

    public synchronized vi1 p(Class cls) {
        int size = ((ArrayList) this.b).size();
        for (int i = 0; i < size; i++) {
            wi1 wi1Var = (wi1) ((ArrayList) this.b).get(i);
            if (wi1Var.a.isAssignableFrom(cls)) {
                return wi1Var.b;
            }
        }
        return null;
    }

    @Override // defpackage.ak
    public void r(wj wjVar, Throwable th) {
        pk pkVar = (pk) this.b;
        pj1 pj1Var = rj1.b;
        pkVar.resumeWith(new qj1(th));
    }

    public void s(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iG = recyclerView.e.G();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iG; i6++) {
            View viewF = recyclerView.e.F(i6);
            kg1 kg1VarI = RecyclerView.I(viewF);
            if (kg1VarI != null && !kg1VarI.o() && (i4 = kg1VarI.c) >= i && i4 < i5) {
                kg1VarI.a(2);
                kg1VarI.a(1024);
                ((yf1) viewF.getLayoutParams()).c = true;
            }
        }
        dg1 dg1Var = recyclerView.b;
        ArrayList arrayList = dg1Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kg1 kg1Var = (kg1) arrayList.get(size);
            if (kg1Var != null && (i3 = kg1Var.c) >= i && i3 < i5) {
                kg1Var.a(2);
                dg1Var.f(size);
            }
        }
        recyclerView.U0 = true;
    }

    @Override // defpackage.xr
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public void t(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iG = recyclerView.e.G();
        for (int i3 = 0; i3 < iG; i3++) {
            kg1 kg1VarI = RecyclerView.I(recyclerView.e.F(i3));
            if (kg1VarI != null && !kg1VarI.o() && kg1VarI.c >= i) {
                kg1VarI.l(i2, false);
                recyclerView.Q0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.b.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            kg1 kg1Var = (kg1) arrayList.get(i4);
            if (kg1Var != null && kg1Var.c >= i) {
                kg1Var.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.T0 = true;
    }

    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.b);
        }
        Exception exception = task.getException();
        gu2.o(exception);
        if (!(exception instanceof rv2)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception.getMessage());
        }
        return Tasks.forResult(BuildConfig.FLAVOR);
    }

    public String toString() {
        switch (this.a) {
            case 25:
                StringBuilder sb = new StringBuilder("1");
                for (n73 n73Var : n73.values()) {
                    ts2 ts2Var = (ts2) ((EnumMap) this.b).get(n73Var);
                    if (ts2Var == null) {
                        ts2Var = ts2.UNSET;
                    }
                    sb.append(ts2Var.a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iG = recyclerView.e.G();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iG; i11++) {
            kg1 kg1VarI = RecyclerView.I(recyclerView.e.F(i11));
            if (kg1VarI != null && (i9 = kg1VarI.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    kg1VarI.l(i2 - i, false);
                } else {
                    kg1VarI.l(i5, false);
                }
                recyclerView.Q0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.b.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            kg1 kg1Var = (kg1) arrayList.get(i12);
            if (kg1Var != null && (i8 = kg1Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    kg1Var.l(i2 - i, false);
                } else {
                    kg1Var.l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.T0 = true;
    }

    public synchronized void v(ti0 ti0Var) {
        ti0Var.b = null;
        ti0Var.c = null;
        ((ArrayDeque) this.b).offer(ti0Var);
    }

    public boolean w() {
        y53 y53Var = (y53) this.b;
        try {
            na1 na1VarA = la2.a(y53Var.a);
            if (na1VarA != null) {
                return na1VarA.b(128, "com.android.vending").versionCode >= 80837300;
            }
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.a0.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e2) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.a0.b(e2, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void x(n73 n73Var, int i) {
        ts2 ts2Var;
        if (i == -30) {
            ts2Var = ts2.TCF;
        } else if (i == -20) {
            ts2Var = ts2.API;
        } else if (i == -10) {
            ts2Var = ts2.MANIFEST;
        } else if (i != 0) {
            ts2Var = i != 30 ? ts2.UNSET : ts2.INITIALIZATION;
        } else {
            ts2Var = ts2.API;
        }
        ((EnumMap) this.b).put(n73Var, ts2Var);
    }

    public void y(n73 n73Var, ts2 ts2Var) {
        ((EnumMap) this.b).put(n73Var, ts2Var);
    }

    @Override // defpackage.ln2
    public boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((ln2[]) this.b)[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ln2
    public wn2 zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            ln2 ln2Var = ((ln2[]) this.b)[i];
            if (ln2Var.zzb(cls)) {
                return ln2Var.zzc(cls);
            }
        }
        sm0.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public void onInstallReferrerServiceDisconnected() {
    }

    public /* synthetic */ gk1(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ gk1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public gk1(if3 if3Var) {
        this.a = 27;
        this.b = if3Var.Y;
    }

    public gk1(byte[] bArr) {
        this.a = 20;
        byte[] bytes = "abcdefghijk1mnop".getBytes();
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.b = cipher;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bytes));
            Cipher.getInstance("AES/CBC/PKCS5Padding").init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bytes));
        } catch (Exception e2) {
            am2.l(Log.getStackTraceString(e2));
        }
    }

    public gk1(EnumMap enumMap) {
        this.a = 25;
        EnumMap enumMap2 = new EnumMap(n73.class);
        this.b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public gk1(qp0 qp0Var, RecaptchaAction recaptchaAction) {
        this.a = 26;
        this.b = recaptchaAction;
        Objects.requireNonNull(qp0Var);
    }

    public /* synthetic */ gk1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public gk1(Context context) {
        this.a = 9;
        this.b = context.getApplicationContext();
    }

    public gk1(ClipData clipData, int i) {
        this.a = 7;
        this.b = ef.l(clipData, i);
    }
}
