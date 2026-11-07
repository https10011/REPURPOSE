package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.crypto.Mac;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vf3 implements eg3, yj, gd0, m90, OnCompleteListener, Continuation, ya3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public vf3(Context context) {
        this.a = 9;
        String packageName = context.getPackageName();
        gu2.l(packageName);
        this.b = packageName;
        try {
            byte[] bArrK = ye1.k(context, packageName);
            if (bArrK != null) {
                this.c = gu2.g(bArrK);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + packageName);
            this.c = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + packageName);
            this.c = null;
        }
    }

    public static int b(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static vf3 d(wq3 wq3Var) throws GeneralSecurityException {
        int i = ob3.a[wq3Var.ordinal()];
        int i2 = 11;
        int i3 = 2;
        if (i == 1) {
            return new vf3(i2, new rz2("HmacSha256", i3), wq3.a);
        }
        if (i == 2) {
            return new vf3(i2, new rz2("HmacSha384", i3), wq3.b);
        }
        if (i == 3) {
            return new vf3(i2, new rz2("HmacSha512", i3), wq3.c);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(wq3Var)));
    }

    public static vf3 f(xn3 xn3Var) {
        return new vf3(0, xn3Var, kg3.c(xn3Var.B()));
    }

    @Override // defpackage.gd0
    public Object A(id0 id0Var, gs gsVar) {
        Object objA = ((f91) this.b).A(new qd0(new Ref.BooleanRef(), id0Var, (gx) this.c), gsVar);
        return objA == ft.a ? objA : Unit.a;
    }

    @Override // defpackage.ya3
    public byte[] a(byte[] bArr, yd2 yd2Var) throws GeneralSecurityException {
        wq3 wq3Var = (wq3) this.b;
        byte[] bArrB = ((tr3) yd2Var.b).b();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(xi0.E(bArrB), am2.b0(wq3Var));
        cr3 cr3Var = cr3.f;
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) cr3Var.a.zza("EC")).generatePrivate(eCPrivateKeySpec);
        ECParameterSpec eCParameterSpecB0 = am2.b0(wq3Var);
        byte[] bArrF0 = am2.f0(eCPrivateKey, (ECPublicKey) ((KeyFactory) cr3Var.a.zza("EC")).generatePublic(new ECPublicKeySpec(am2.c0(eCParameterSpecB0.getCurve(), zq3.a, bArr), eCParameterSpecB0)));
        byte[] bArrD0 = nj2.d0(bArr, ((tr3) yd2Var.c).b());
        byte[] bArrD1 = nj2.d0(lb3.m, zza());
        rz2 rz2Var = (rz2) this.c;
        int macLength = Mac.getInstance(rz2Var.b).getMacLength();
        byte[] bArr2 = lb3.o;
        Charset charset = kg3.a;
        return rz2Var.a(macLength, rz2Var.b(nj2.d0(bArr2, bArrD1, "eae_prk".getBytes(charset), bArrF0), null), nj2.d0(lb3.b(2, macLength), bArr2, bArrD1, "shared_secret".getBytes(charset), bArrD0));
    }

    public void c() {
        ((SparseIntArray) this.b).clear();
    }

    public void e(nf3 nf3Var) throws GeneralSecurityException {
        HashMap map = (HashMap) this.b;
        if (nf3Var == null) {
            uq1.h("primitive constructor must be non-null");
            return;
        }
        tf3 tf3Var = new tf3(nf3Var.a, nf3Var.b);
        if (!map.containsKey(tf3Var)) {
            map.put(tf3Var, nf3Var);
            return;
        }
        nf3 nf3Var2 = (nf3) map.get(tf3Var);
        if (!nf3Var2.equals(nf3Var) || nf3Var != nf3Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(tf3Var)));
        }
    }

    @Override // defpackage.yd1
    public Object get() {
        br0 br0Var = new br0(10);
        k42 k42Var = new k42(9);
        Object obj = ((yd1) this.b).get();
        yd1 yd1Var = (yd1) this.c;
        return new bl1(br0Var, k42Var, pd.f, (bm1) obj, yd1Var);
    }

    @Override // defpackage.yj
    public Type h() {
        return (Type) this.b;
    }

    @Override // defpackage.yj
    public Object l(l81 l81Var) {
        Executor executor = (Executor) this.c;
        return executor == null ? l81Var : new ny(executor, l81Var);
    }

    public void onComplete(Task task) {
        ((Map) ((md2) this.c).b).remove((TaskCompletionSource) this.b);
    }

    public Object then(Task task) {
        Bundle bundle;
        switch (this.a) {
            case 10:
                if (!task.isSuccessful()) {
                    Exception exception = task.getException();
                    gu2.o(exception);
                    String message = exception.getMessage();
                    gu2.o(message);
                    return Tasks.forException(new rv2(message));
                }
                kp2 kp2Var = (kp2) task.getResult();
                String str = kp2Var.a;
                if (str == null || str.isEmpty()) {
                    return Tasks.forException(new rv2(ts.j("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.b)));
                }
                p33 p33Var = new p33('/');
                m83 m83Var = new m83();
                m83Var.a = p33Var;
                List listU = new ox1(m83Var).u(str);
                String str2 = listU.size() != 4 ? null : (String) listU.get(3);
                if (TextUtils.isEmpty(str2)) {
                    return Tasks.forException(new Exception("Invalid siteKey format ".concat(str)));
                }
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.b));
                }
                qp0 qp0Var = (qp0) this.c;
                op0 op0Var = (op0) qp0Var.f;
                hc0 hc0Var = (hc0) qp0Var.d;
                hc0Var.a();
                Application application = (Application) hc0Var.a;
                op0Var.getClass();
                Task<RecaptchaTasksClient> taskFetchTaskClient = Recaptcha.fetchTaskClient(application, str2);
                qp0 qp0Var2 = (qp0) this.c;
                String str3 = (String) this.b;
                synchronized (qp0Var2.a) {
                    qp0Var2.c = kp2Var;
                    ((HashMap) qp0Var2.b).put(str3, taskFetchTaskClient);
                    break;
                }
                return taskFetchTaskClient;
            default:
                mk1 mk1Var = (mk1) this.b;
                Bundle bundle2 = (Bundle) this.c;
                mk1Var.getClass();
                return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? mk1Var.a(bundle2).onSuccessTask(iz2.c, vl0.c) : task;
        }
    }

    public String toString() {
        switch (this.a) {
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Bounds{lower=" + ((nq0) this.b) + " upper=" + ((nq0) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ya3
    public byte[] zza() throws GeneralSecurityException {
        int i = ob3.a[((wq3) this.b).ordinal()];
        if (i == 1) {
            return lb3.c;
        }
        if (i == 2) {
            return lb3.d;
        }
        if (i == 3) {
            return lb3.e;
        }
        tv2.f("Could not determine HPKE KEM ID");
        return null;
    }

    public /* synthetic */ vf3(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public vf3(md2 md2Var, TaskCompletionSource taskCompletionSource) {
        this.a = 8;
        this.b = taskCompletionSource;
        Objects.requireNonNull(md2Var);
        this.c = md2Var;
    }

    public /* synthetic */ vf3(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public vf3(ac2 ac2Var) {
        this.a = 5;
        ep1 ep1Var = new ep1(ac2Var);
        this.c = new wa(16);
        this.b = ep1Var;
    }

    public vf3(qp0 qp0Var, String str) {
        this.a = 10;
        this.b = str;
        Objects.requireNonNull(qp0Var);
        this.c = qp0Var;
    }

    public vf3(sf3 sf3Var) {
        this.a = 12;
        this.b = new HashMap(sf3Var.a);
        this.c = new HashMap(sf3Var.b);
    }

    public vf3(int i) {
        this.a = i;
        switch (i) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                break;
            case 12:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = new Rect();
                this.c = new Rect();
                break;
        }
    }
}
