package defpackage;

import android.R;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.zzc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.KeyAgreement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class kj0 implements tb3, a41, vw, ak, zr, dz, gd0, h3, ff, mn2, em2 {
    public static volatile kj0 c;
    public static final ph0 d = new ph0(1);
    public static final byte[] e = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    public static final byte[] f = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    public final /* synthetic */ int a;
    public Object b;

    public kj0(int i) {
        h41 h41Var;
        this.a = i;
        switch (i) {
            case 1:
                td1 td1Var = td1.c;
                try {
                    h41Var = (h41) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    h41Var = d;
                }
                h41[] h41VarArr = {ph0.b, h41Var};
                g11 g11Var = new g11();
                g11Var.a = h41VarArr;
                Charset charset = dr0.a;
                this.b = g11Var;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                sharedPreferences.getClass();
                sharedPreferences.getClass();
                this.b = sharedPreferences;
                break;
            case 14:
                break;
            case 29:
                this.b = new AtomicBoolean(false);
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public static boolean N(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String Q(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static kj0 U() throws GeneralSecurityException {
        Provider providerB = ea.B();
        if (providerB == null) {
            tv2.f("Conscrypt is not available.");
            return null;
        }
        KeyFactory.getInstance("XDH", providerB);
        KeyAgreement.getInstance("XDH", providerB);
        kj0 kj0Var = new kj0(providerB, 2);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", providerB);
        keyPairGenerator.initialize(255);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            tv2.f("Invalid encoded private key length");
            return null;
        }
        if (!kg3.b(e, encoded)) {
            tv2.f("Invalid encoded private key prefix");
            return null;
        }
        Arrays.copyOfRange(encoded, 16, encoded.length);
        byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            tv2.f("Invalid encoded public key length");
            return null;
        }
        if (kg3.b(f, encoded2)) {
            Arrays.copyOfRange(encoded2, 12, encoded2.length);
            return kj0Var;
        }
        tv2.f("Invalid encoded public key prefix");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gd0
    public Object A(id0 id0Var, gs gsVar) throws Throwable {
        f0 f0Var;
        cl1 cl1Var;
        if (gsVar instanceof f0) {
            f0Var = (f0) gsVar;
            int i = f0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0Var.d = i - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, gsVar);
            }
        } else {
            f0Var = new f0(this, gsVar);
        }
        Object obj = f0Var.b;
        ft ftVar = ft.a;
        int i2 = f0Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cl1Var = f0Var.a;
            try {
                zi0.B(obj);
                cl1Var.releaseIntercepted();
                return Unit.a;
            } catch (Throwable th) {
                th = th;
                cl1Var.releaseIntercepted();
                throw th;
            }
        }
        zi0.B(obj);
        cl1 cl1Var2 = new cl1(id0Var, f0Var.getContext());
        try {
            f0Var.a = cl1Var2;
            f0Var.d = 1;
            try {
                Object objInvoke = ((Function2) this.b).invoke(cl1Var2, f0Var);
                if (objInvoke != ftVar) {
                    objInvoke = Unit.a;
                }
                if (objInvoke == ftVar) {
                    return ftVar;
                }
                cl1Var = cl1Var2;
                cl1Var.releaseIntercepted();
                return Unit.a;
            } catch (Throwable th2) {
                th = th2;
                cl1Var = cl1Var2;
                cl1Var.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean B(String str) {
        String strK = K(str);
        return "1".equals(strK) || Boolean.parseBoolean(strK);
    }

    public aw C() {
        return new aw((ByteArrayOutputStream) this.b, 3);
    }

    public Integer D(String str) {
        String strK = K(str);
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strK));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + Q(str) + "(" + strK + ") into an int");
            return null;
        }
    }

    public JSONArray E(String str) {
        String strK = K(str);
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        try {
            return new JSONArray(strK);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + Q(str) + ": " + strK + ", falling back to default");
            return null;
        }
    }

    public int[] F() {
        JSONArray jSONArrayE = E("gcm.n.light_settings");
        if (jSONArrayE == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayE.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayE.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayE.optInt(1);
            iArr[2] = jSONArrayE.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e2) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayE + ". " + e2.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayE + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] G(String str) {
        JSONArray jSONArrayE = E(str.concat("_loc_args"));
        if (jSONArrayE == null) {
            return null;
        }
        int length = jSONArrayE.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayE.optString(i);
        }
        return strArr;
    }

    public String H(String str) {
        return K(str.concat("_loc_key"));
    }

    public Long I() {
        String strK = K("gcm.n.event_time");
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strK));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + Q("gcm.n.event_time") + "(" + strK + ") into a long");
            return null;
        }
    }

    public String J(Resources resources, String str, String str2) {
        String strK = K(str2);
        if (!TextUtils.isEmpty(strK)) {
            return strK;
        }
        String strH = H(str2);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        int identifier = resources.getIdentifier(strH, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", Q(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrG = G(str2);
        if (objArrG == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrG);
        } catch (MissingFormatArgumentException e2) {
            Log.w("NotificationParams", "Missing format argument for " + Q(str2) + ": " + Arrays.toString(objArrG) + " Default value will be used.", e2);
            return null;
        }
    }

    public String K(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] L() {
        JSONArray jSONArrayE = E("gcm.n.vibrate_timings");
        if (jSONArrayE == null) {
            return null;
        }
        try {
            if (jSONArrayE.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayE.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayE.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayE + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void M() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public Bundle O() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void P() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new cy(viewFindViewById, 1));
    }

    public void R(int i) throws IOException {
        ((ByteArrayOutputStream) this.b).write(i);
    }

    public void S(int i) throws IOException {
        if (i <= 127) {
            R((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            } else {
                i3++;
            }
        }
        R((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            R((byte) (i >> i4));
        }
    }

    public void T(p pVar) throws IOException {
        if (pVar != null) {
            pVar.a().c(this);
        } else {
            uq1.o("null object detected");
        }
    }

    @Override // defpackage.em2
    public void a(Status status) {
        en2 en2Var = (en2) this.b;
        String str = status.b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, (String) null, (PendingIntent) null, (ConnectionResult) null);
            }
        }
        if (en2Var.a == 8) {
            en2Var.m = true;
            throw null;
        }
        cu2 cu2Var = en2Var.f;
        if (cu2Var != null) {
            cu2Var.a(status);
        }
        en2Var.c(status);
    }

    @Override // defpackage.zr
    public int b() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.em2
    public void c(ep1 ep1Var) {
        Status status = (Status) ep1Var.c;
        zzc zzcVar = (zzc) ep1Var.d;
        en2 en2Var = (en2) this.b;
        cu2 cu2Var = en2Var.f;
        if (cu2Var != null) {
            cu2Var.a(status);
        }
        en2Var.j = zzcVar;
        cu2 cu2Var2 = en2Var.f;
        if (cu2Var2 != null) {
            cu2Var2.a(status);
        }
        en2Var.c(status);
    }

    @Override // defpackage.ff
    public void d(int i) {
        ((sj0) this.b).d(i);
    }

    @Override // defpackage.ff
    public void e() {
        ((sj0) this.b).e();
    }

    @Override // defpackage.a41
    public void f(i31 i31Var, boolean z) {
        ((k8) this.b).s(i31Var);
    }

    @Override // defpackage.tb3
    public byte[] g(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        Provider provider = (Provider) this.b;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length != 32) {
            throw new InvalidKeyException("Invalid X25519 private key");
        }
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(nj2.d0(e, bArr)));
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(nj2.d0(f, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }

    @Override // defpackage.em2
    public void i(Status status, PhoneAuthCredential phoneAuthCredential) {
        en2 en2Var = (en2) this.b;
        int i = en2Var.a;
        gu2.q("Unexpected response type " + i, i == 2);
        cu2 cu2Var = en2Var.f;
        if (cu2Var != null) {
            cu2Var.a(status);
        }
        en2Var.j = phoneAuthCredential;
        cu2 cu2Var2 = en2Var.f;
        if (cu2Var2 != null) {
            cu2Var2.a(status);
        }
        en2Var.c(status);
    }

    @Override // defpackage.em2
    public void j(zzahd zzahdVar, zo2 zo2Var) {
        en2 en2Var = (en2) this.b;
        int i = en2Var.a;
        gu2.q("Unexpected response type: " + i, i == 2);
        en2Var.h = zzahdVar;
        en2Var.i = zo2Var;
        en2Var.e();
        gu2.q("no success or failure set on method implementation", en2Var.m);
    }

    @Override // defpackage.zr
    public ClipData k() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.h3
    public boolean l(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.b;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = x52.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // defpackage.em2
    public void m(zzahd zzahdVar) {
        en2 en2Var = (en2) this.b;
        int i = en2Var.a;
        gu2.q("Unexpected response type: " + i, i == 1);
        en2Var.h = zzahdVar;
        en2Var.e();
        gu2.q("no success or failure set on method implementation", en2Var.m);
    }

    @Override // defpackage.ak
    public void n(wj wjVar, gj1 gj1Var) {
        boolean z = gj1Var.a.d0;
        rp rpVar = (rp) this.b;
        if (z) {
            rpVar.complete(gj1Var.b);
        } else {
            rpVar.completeExceptionally(new xp(gj1Var));
        }
    }

    @Override // defpackage.em2
    public void o(kp2 kp2Var) {
        en2 en2Var = (en2) this.b;
        en2Var.l = kp2Var;
        en2Var.e();
        gu2.q("no success or failure set on method implementation", en2Var.m);
    }

    @Override // defpackage.dz
    public int p(byte[] bArr, int i) throws cz {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.b).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new cz();
        }
        return i2;
    }

    @Override // defpackage.dz
    public short q() throws IOException {
        int i = ((InputStream) this.b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new cz();
    }

    @Override // defpackage.ak
    public void r(wj wjVar, Throwable th) {
        ((rp) this.b).completeExceptionally(th);
    }

    @Override // defpackage.mn2
    public /* synthetic */ void s(an2 an2Var) {
        ((rd2) this.b).m((zzahd) an2Var);
    }

    @Override // defpackage.dz
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.b;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    @Override // defpackage.dz
    public int t() {
        return q() | (q() << 8);
    }

    public String toString() {
        switch (this.a) {
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vw
    public Object v() {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.zr
    public int w() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.zr
    public ContentInfo x() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.a41
    public boolean y(i31 i31Var) {
        Window.Callback callback = ((k8) this.b).Y.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, i31Var);
        return true;
    }

    @Override // defpackage.em2
    public void z(p11 p11Var) {
        en2 en2Var = (en2) this.b;
        en2Var.k = p11Var;
        en2Var.c(kv.m0("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((rd2) this.b).a(kv.m0(str));
    }

    @Override // defpackage.vw
    public void h() {
    }

    public kj0(ox1 ox1Var, rd2 rd2Var) {
        this.a = 25;
        this.b = rd2Var;
        Objects.requireNonNull(ox1Var);
    }

    public kj0(xw xwVar) {
        this.a = 13;
        this.b = Collections.unmodifiableMap(new HashMap(xwVar.a));
    }

    public /* synthetic */ kj0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public kj0(Bundle bundle) {
        this.a = 16;
        if (bundle != null) {
            this.b = new Bundle(bundle);
        } else {
            uq1.h("data");
            throw null;
        }
    }

    public kj0(EditText editText) {
        this.a = 11;
        dc2 dc2Var = new dc2();
        dc2Var.a = editText;
        s50 s50Var = new s50(editText);
        dc2Var.b = s50Var;
        editText.addTextChangedListener(s50Var);
        if (h50.b == null) {
            synchronized (h50.a) {
                try {
                    if (h50.b == null) {
                        h50 h50Var = new h50();
                        try {
                            h50.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, h50.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        h50.b = h50Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(h50.b);
        this.b = dc2Var;
    }

    public kj0(ContentInfo contentInfo) {
        this.a = 8;
        contentInfo.getClass();
        this.b = ef.n(contentInfo);
    }
}
