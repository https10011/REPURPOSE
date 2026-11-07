package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class nl1 implements ls, kw, OnSuccessListener, ya3 {
    public static nl1 c;
    public static final Object d = new Object();
    public static ha2 e;
    public Object a;
    public Object b;

    public nl1(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.b = cipher;
            cipher.init(1, secretKeySpec, new IvParameterSpec(ze2.n));
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr, "AES");
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.a = cipher2;
            cipher2.init(2, secretKeySpec2, new IvParameterSpec(ze2.n));
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
        }
    }

    public static Task f(Context context, Intent intent, boolean z) {
        ha2 ha2Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (d) {
            try {
                if (e == null) {
                    e = new ha2(context);
                }
                ha2Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return ha2Var.b(intent).continueWith(new w21(), new ur(16));
        }
        if (ep1.t().w(context)) {
            synchronized (qt.j) {
                try {
                    qt.d(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        qt.k.a();
                    }
                    ha2Var.b(intent).addOnCompleteListener(new ab(intent, 20));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            ha2Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public static synchronized nl1 g(Context context) {
        try {
            if (c == null) {
                nl1 nl1Var = new nl1();
                nl1Var.a = context.getApplicationContext();
                c = nl1Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    @Override // defpackage.ya3
    public byte[] a(byte[] bArr, yd2 yd2Var) {
        byte[] bArrG = ((tb3) this.a).g(((tr3) yd2Var.b).b(), bArr);
        byte[] bArrD0 = nj2.d0(bArr, ((tr3) yd2Var.c).b());
        byte[] bArrD1 = nj2.d0(lb3.m, lb3.b);
        rz2 rz2Var = (rz2) this.b;
        int macLength = Mac.getInstance(rz2Var.b).getMacLength();
        byte[] bArr2 = lb3.o;
        Charset charset = kg3.a;
        return rz2Var.a(macLength, rz2Var.b(nj2.d0(bArr2, bArrD1, "eae_prk".getBytes(charset), bArrG), null), nj2.d0(lb3.b(2, macLength), bArr2, bArrD1, "shared_secret".getBytes(charset), bArrD0));
    }

    @Override // defpackage.kw
    public void b(Exception exc) {
        fs1 fs1Var = (fs1) this.a;
        d51 d51Var = (d51) this.b;
        d51 d51Var2 = fs1Var.f;
        if (d51Var2 == null || d51Var2 != d51Var) {
            return;
        }
        fs1 fs1Var2 = (fs1) this.a;
        d51 d51Var3 = (d51) this.b;
        jy jyVar = fs1Var2.b;
        hw hwVar = fs1Var2.i;
        lw lwVar = d51Var3.c;
        jyVar.a(hwVar, exc, lwVar, lwVar.j());
    }

    @Override // defpackage.kw
    public void c(Object obj) {
        fs1 fs1Var = (fs1) this.a;
        d51 d51Var = (d51) this.b;
        d51 d51Var2 = fs1Var.f;
        if (d51Var2 == null || d51Var2 != d51Var) {
            return;
        }
        fs1 fs1Var2 = (fs1) this.a;
        d51 d51Var3 = (d51) this.b;
        x10 x10Var = fs1Var2.a.p;
        if (obj == null || !x10Var.a(d51Var3.c.j())) {
            jy jyVar = fs1Var2.b;
            hv0 hv0Var = d51Var3.a;
            lw lwVar = d51Var3.c;
            jyVar.b(hv0Var, obj, lwVar, lwVar.j(), fs1Var2.i);
            return;
        }
        fs1Var2.e = obj;
        jy jyVar2 = fs1Var2.b;
        jyVar2.s0 = 2;
        w60 w60Var = jyVar2.c0;
        (w60Var.Z ? w60Var.w : w60Var.v).execute(jyVar2);
    }

    public byte[] d(byte[] bArr) {
        Cipher cipher = (Cipher) this.a;
        if (cipher == null) {
            return null;
        }
        try {
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
            return null;
        }
    }

    public byte[] e(byte[] bArr) {
        Cipher cipher = (Cipher) this.b;
        if (cipher == null) {
            return null;
        }
        try {
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
            return null;
        }
    }

    public KeyListener h(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((dc2) ((kj0) this.a).b).getClass();
        if (keyListener instanceof m50) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new m50(keyListener);
    }

    @Override // defpackage.ls
    public Object i(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        uk0 uk0Var = (uk0) this.b;
        ResponseBody.BomAwareReader bomAwareReader = responseBody.a;
        if (bomAwareReader == null) {
            bomAwareReader = new ResponseBody.BomAwareReader(responseBody.e(), Internal.a(responseBody.b()));
            responseBody.a = bomAwareReader;
        }
        au0 au0Var = new au0(bomAwareReader);
        int i = uk0Var.h;
        if (i == 0) {
            i = 2;
        }
        if (i == 0) {
            throw null;
        }
        au0Var.b0 = i;
        try {
            Object objB = ((l02) this.a).b(au0Var);
            if (au0Var.R() != 10) {
                throw new wt0("JSON document was not fully consumed.", 4);
            }
            responseBody.close();
            return objB;
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }

    public void j(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, we1.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public j50 k(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        kj0 kj0Var = (kj0) this.a;
        if (inputConnection == null) {
            kj0Var.getClass();
            inputConnection2 = null;
        } else {
            dc2 dc2Var = (dc2) kj0Var.b;
            dc2Var.getClass();
            if (!(inputConnection instanceof j50)) {
                inputConnection = new j50(editorInfo, inputConnection, (EditText) dc2Var.a);
            }
            inputConnection2 = inputConnection;
        }
        return (j50) inputConnection2;
    }

    public Task l(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        int i = 0;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.a;
        w21 w21Var = (w21) this.b;
        boolean z = nj2.H() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? Tasks.call(w21Var, new y90(i, context, intent)).continueWithTask(w21Var, new Continuation() { // from class: z90
            public final Object then(Task task) {
                return (nj2.H() && ((Integer) task.getResult()).intValue() == 402) ? nl1.f(context, intent, z2).continueWith(new w21(), new ur(15)) : task;
            }
        }) : f(context, intent, z2);
    }

    public void m(boolean z) {
        s50 s50Var = (s50) ((dc2) ((kj0) this.a).b).b;
        if (s50Var.c != z) {
            if (s50Var.b != null) {
                f50 f50VarA = f50.a();
                r50 r50Var = s50Var.b;
                f50VarA.getClass();
                r93.n(r50Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = f50VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    f50VarA.b.remove(r50Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            s50Var.c = z;
            if (z) {
                s50.a(s50Var.a, f50.a().b());
            }
        }
    }

    public sz2 n() {
        Integer num = (Integer) this.b;
        if (num == null) {
            tv2.f("Key size is not set");
            return null;
        }
        if (((rz2) this.a) != null) {
            return new sz2(num.intValue(), (rz2) this.a);
        }
        tv2.f("Variant is not set");
        return null;
    }

    public void o(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public /* synthetic */ void onSuccess(Object obj) {
        ((TaskCompletionSource) this.b).setResult((AuthResult) obj);
        ci.e((Context) this.a);
    }

    @Override // defpackage.ya3
    public byte[] zza() throws GeneralSecurityException {
        byte[] bArr;
        switch (((rz2) this.b).b) {
            case "HmacSha256":
                bArr = lb3.f;
                break;
            case "HmacSha384":
                bArr = lb3.g;
                break;
            case "HmacSha512":
                bArr = lb3.h;
                break;
            default:
                tv2.f("Could not determine HPKE KDF ID");
                return null;
        }
        if (Arrays.equals(bArr, lb3.f)) {
            return lb3.b;
        }
        tv2.f("Could not determine HPKE KEM ID");
        return null;
    }

    public nl1(gg3 gg3Var, mg3 mg3Var) {
        Objects.requireNonNull(gg3Var);
        this.a = gg3Var;
        this.b = mg3Var;
    }

    public /* synthetic */ nl1(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public nl1(EditText editText) {
        this.b = editText;
        this.a = new kj0(editText);
    }

    public nl1(Context context) {
        this.a = context;
        this.b = new w21();
    }
}
