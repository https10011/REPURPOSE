package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.login.i;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class k42 implements f, bj1, hn, hv2, yc3, g40, ed3, cv1, kr3 {
    public final /* synthetic */ int a;
    public static final k42 b = new k42(0);
    public static final /* synthetic */ k42 c = new k42(1);
    public static final k42 d = new k42(2);
    public static final /* synthetic */ k42 e = new k42(11);
    public static final /* synthetic */ k42 f = new k42(12);
    public static final /* synthetic */ k42 i = new k42(13);
    public static final /* synthetic */ k42 v = new k42(14);
    public static final /* synthetic */ k42 w = new k42(15);
    public static final /* synthetic */ k42 W = new k42(16);
    public static final /* synthetic */ k42 X = new k42(17);
    public static final /* synthetic */ k42 Y = new k42(22);

    public /* synthetic */ k42(int i2) {
        this.a = i2;
    }

    public static final Bundle c(String str) {
        ScheduledExecutorService scheduledExecutorService = i.d;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", BuildConfig.FLAVOR);
        bundle.putString("2_result", BuildConfig.FLAVOR);
        bundle.putString("5_error_message", BuildConfig.FLAVOR);
        bundle.putString("4_error_code", BuildConfig.FLAVOR);
        bundle.putString("6_extras", BuildConfig.FLAVOR);
        return bundle;
    }

    public static final File h() {
        if (mt.a.contains(k42.class)) {
            return null;
        }
        try {
            File file = new File(i90.a().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            mt.a(k42.class, th);
            return null;
        }
    }

    public static void l() {
        File[] fileArrListFiles;
        if (h42.v()) {
            return;
        }
        File fileM = zi0.m();
        int i2 = 1;
        if (fileM == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileM.listFiles(new l70(1));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(yi0.n(file));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((uq0) obj).a()) {
                arrayList2.add(obj);
            }
        }
        List listX = CollectionsKt.x(arrayList2, new i(1));
        JSONArray jSONArray = new JSONArray();
        Iterator it = hf1.b(0, Math.min(listX.size(), 5)).iterator();
        while (((zq0) it).c) {
            jSONArray.put(listX.get(((wq0) it).nextInt()));
        }
        zi0.w("crash_reports", jSONArray, new j(i2, listX));
    }

    public static SharedPreferences n(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void p(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    @Override // defpackage.kr3
    public /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // defpackage.hn
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public String d(Method method, int i2) {
        return "parameter #" + (i2 + 1);
    }

    @Override // defpackage.g40
    public f40 e(Context context, String str, e40 e40Var) {
        f40 f40Var = new f40();
        int iE = e40Var.e(context, str);
        f40Var.a = iE;
        if (iE != 0) {
            f40Var.c = -1;
            return f40Var;
        }
        int iB = e40Var.b(context, str, true);
        f40Var.b = iB;
        if (iB != 0) {
            f40Var.c = 1;
        }
        return f40Var;
    }

    @Override // defpackage.bj1
    public pi1 f(pi1 pi1Var, da1 da1Var) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((ri0) ((li0) pi1Var.get()).a.b).a.d.asReadOnlyBuffer();
        AtomicReference atomicReference = kj.a;
        jj jjVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new jj(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (jjVar != null && jjVar.b == 0 && jjVar.c == ((byte[]) jjVar.d).length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new u6(bArrArray);
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) {
        z13 z13Var = (z13) zi0Var;
        yp3 yp3VarW = zp3.w();
        byte[] bArrB = ((tr3) z13Var.g.a).b();
        nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
        yp3VarW.f();
        zp3.v((zp3) yp3VarW.b, nr2VarE);
        return wf3.d("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zp3) yp3VarW.d()).b(), 2, q63.b(z13Var.f.a), z13Var.i);
    }

    @Override // defpackage.cv1
    public /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i2 = runningAppProcessInfo.importance;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 17);
            sb.append("Memory state is: ");
            sb.append(i2);
            Log.i("PhenotypeProcessReaper", sb.toString());
            if (runningAppProcessInfo.importance >= 400) {
                z = true;
            }
        } catch (RuntimeException e2) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e2);
        }
        return new Boolean(z);
    }

    public Object i(Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean j(Method method) {
        return false;
    }

    public String k(String str) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare(str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            String strJoin = TextUtils.join(" ", (String[]) new Regex("\\s+").d(str.subSequence(i2, length + 1).toString()).toArray(new String[0]));
            strJoin.getClass();
            return strJoin;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public int[] m(String str) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int[] iArr = new int[128];
            String strK = k(str);
            Charset charsetForName = Charset.forName("UTF-8");
            charsetForName.getClass();
            byte[] bytes = strK.getBytes(charsetForName);
            bytes.getClass();
            for (int i2 = 0; i2 < 128; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & 255;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        switch (this.a) {
            case 18:
                if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    e.g("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    ap3 ap3VarU = ap3.u((jr2) wf3Var.e, wr2.b);
                    if (ap3VarU.t() == 0) {
                        return r03.I(t03.a(ap3VarU.x(), (ip3) wf3Var.f), (Integer) wf3Var.i);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(ap3VarU)));
                } catch (ks2 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            default:
                String str = (String) wf3Var.c;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    e.g(ts.j("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", str));
                    return null;
                }
                try {
                    ln3 ln3VarU = ln3.u((jr2) wf3Var.e, wr2.b);
                    if (ln3VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    v83 v83VarA = y83.a((ip3) wf3Var.f, ln3VarU.y());
                    return d93.I(v83VarA, y83.c(v83VarA.a, ln3VarU.B().o()), (Integer) wf3Var.i);
                } catch (ks2 unused) {
                    tv2.f("Parsing HpkePublicKey failed");
                    return null;
                }
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                return new Boolean(((Boolean) ip2.a.get()).booleanValue());
            case 12:
                List list = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(44, "measurement.sgtm.service_upload_apps_list", BuildConfig.FLAVOR).get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.window_interval", 3600000L, 79).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.audience.filter_result_max_count", 200L, 22).get()).longValue());
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.rb.attribution.client.min_ad_services_version", 7L, 26).get()).longValue());
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return (Boolean) xo2.a.r(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
            default:
                List list6 = h13.a;
                return (Boolean) uq2.a.get();
        }
    }
}
