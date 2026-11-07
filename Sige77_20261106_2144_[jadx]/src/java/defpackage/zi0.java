package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.Feature;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class zi0 {
    public static final d30 a = new d30(3);
    public static final nk1 b = new nk1(0);
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L);
        c = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        d = feature2;
        e = new Feature[]{feature, feature2};
    }

    public static final void B(Object obj) {
        if (obj instanceof qj1) {
            throw ((qj1) obj).a;
        }
    }

    public static final void C(String str, String str2) {
        File fileM = m();
        if (fileM == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static int D(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static byte[] G(byte[] bArr) {
        if (bArr.length != 16) {
            e.g("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b2 = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static void a(String str, String str2, Bundle bundle, v91 v91Var) {
        str.getClass();
        str2.getClass();
        int iV = ts.v(o(str));
        if (iV == 0) {
            bundle.putCharSequence(str, str2);
            return;
        }
        w91 w91Var = w91.a;
        if (iV == 1) {
            v91Var.a(w91Var, str, str2);
        } else {
            if (iV != 2) {
                return;
            }
            v91Var.a(w91Var, str, str2);
            bundle.putCharSequence(str, str2);
        }
    }

    public static Pair b(String str, String str2, Bundle bundle, v91 v91Var) {
        str.getClass();
        int iV = ts.v(o(str));
        if (iV != 0) {
            w91 w91Var = w91.a;
            if (iV == 1) {
                if (v91Var == null) {
                    v91Var = new v91();
                }
                v91Var.a(w91Var, str, str2);
            } else if (iV == 2) {
                if (v91Var == null) {
                    v91Var = new v91();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                v91Var.a(w91Var, str, str2);
                bundle.putCharSequence(str, str2);
            }
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence(str, str2);
        }
        return new Pair(bundle, v91Var);
    }

    public static int f(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static nh g(mh mhVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = hz1.b;
                    lock.lock();
                    Bitmap bitmapB = mhVar.b(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapB);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapB;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            mhVar = a;
        }
        return nh.c(mhVar, bitmap);
    }

    public static void h(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static final qj1 i(Throwable th) {
        th.getClass();
        return new qj1(th);
    }

    public static String j(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDecode = Base64.decode(str, 2);
        byte[] bArr = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr2, 0, length);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, new SecretKeySpec(str2.substring(0, 16).getBytes(StandardCharsets.UTF_8), "AES"), new GCMParameterSpec(128, bArr));
        return new String(cipher.doFinal(bArr2));
    }

    public static final void k(String str) {
        File fileM = m();
        if (fileM == null || str == null) {
            return;
        }
        new File(fileM, str).delete();
    }

    public static da0 l(int i) {
        for (da0 da0Var : da0.values()) {
            if (da0Var.a == i) {
                return da0Var;
            }
        }
        return da0.Unknown;
    }

    public static final File m() {
        File file = new File(i90.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public static Object n(String str, Bundle bundle, v91 v91Var) {
        Object obj;
        Map map;
        str.getClass();
        if (v91Var != null) {
            LinkedHashMap linkedHashMap = v91Var.a;
            w91 w91Var = w91.a;
            if (linkedHashMap.containsKey(w91Var) && (map = (Map) linkedHashMap.get(w91Var)) != null) {
                obj = map.get(str);
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        return obj == null ? bundle != null ? bundle.getCharSequence(str) : null : obj;
    }

    public static int o(String str) {
        str.getClass();
        Map map = v91.b;
        w91 w91Var = w91.a;
        Pair pair = (Pair) map.get(w91Var);
        Set set = pair != null ? (Set) pair.a : null;
        Pair pair2 = (Pair) map.get(w91Var);
        Set set2 = pair2 != null ? (Set) pair2.b : null;
        if (set == null || !set.contains(str)) {
            return (set2 == null || !set2.contains(str)) ? 1 : 3;
        }
        return 2;
    }

    public static final boolean q(StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        String className = stackTraceElement.getClassName();
        className.getClass();
        if (d.j(className, "com.facebook", false)) {
            return true;
        }
        String className2 = stackTraceElement.getClassName();
        className2.getClass();
        return d.j(className2, "com.meta", false);
    }

    public static final boolean r(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (q(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (!d.j(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = stackTraceElement.getClassName();
                        className2.getClass();
                        if (!d.j(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    methodName.getClass();
                    if (d.j(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        methodName2.getClass();
                        if (d.j(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            methodName3.getClass();
                            if (!d.j(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final JSONObject u(String str) {
        File fileM = m();
        if (fileM != null && str != null) {
            try {
                return new JSONObject(h42.F(new FileInputStream(new File(fileM, str))));
            } catch (Exception unused) {
                k(str);
            }
        }
        return null;
    }

    public static final String v(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final void w(String str, JSONArray jSONArray, ik0 ik0Var) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectN = h42.n();
            if (jSONObjectN != null) {
                Iterator<String> itKeys = jSONObjectN.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectN.get(next));
                }
            }
            String str2 = mk0.j;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vl0.p(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{i90.b()}, 1)), jSONObject, ik0Var).d();
        } catch (JSONException unused) {
        }
    }

    public abstract void A(int i);

    public abstract dx2 E();

    public abstract Integer F();

    public abstract boolean c(p1 p1Var, l1 l1Var, l1 l1Var2);

    public abstract boolean d(p1 p1Var, Object obj, Object obj2);

    public abstract boolean e(p1 p1Var, o1 o1Var, o1 o1Var2);

    public abstract void p(int i);

    public abstract void s(o1 o1Var, o1 o1Var2);

    public abstract void t(o1 o1Var, Thread thread);

    public abstract void y(boolean z);

    public abstract void z();

    public void x(boolean z) {
    }
}
