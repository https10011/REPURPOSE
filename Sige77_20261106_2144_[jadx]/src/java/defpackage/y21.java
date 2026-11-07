package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import com.hjq.toast.BuildConfig;
import io.jsonwebtoken.Header;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class y21 {
    public static final vy2 a;
    public static final vy2 b;
    public static final int[] c = {-21389, -2, -1, -1, -1};
    public static final int[] d = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] e = {-457489321, -42779, -2, -1, -1, 42777, 2};
    public static final /* synthetic */ int[] f = {1, 2, 3, 4, 5, 6, 7};
    public static Constructor g;
    public static SSLSocketFactory h;

    static {
        int i = 4;
        a = new vy2("REMOVED_TASK", i);
        b = new vy2("CLOSED_EMPTY", i);
    }

    public static boolean A(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = fx2.b;
            }
        } else {
            if (!(collection instanceof ww2)) {
                return false;
            }
            objComparator = ((ww2) collection).i;
        }
        return comparator.equals(objComparator);
    }

    public static int[] B() {
        return (int[]) f.clone();
    }

    public static String C(int i, int i2, String str) {
        if (i < 0) {
            return xi0.D("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return xi0.D("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        e.g(ck1.r(i2, "negative size: "));
        return null;
    }

    public static void D(int i, int i2) {
        if (i < 0 || i > i2) {
            e.c(C(i, i2, "index"));
        }
    }

    public static v61 a(String str, byte[] bArr, int i, List list, String str2, String str3) throws Throwable {
        byte[] bArrM;
        SSLContext sSLContextA;
        pb2 pb2Var = new pb2("sdk_error");
        v61 v61Var = new v61(2, pb2Var);
        HttpURLConnection httpURLConnection = null;
        nl1 nl1Var = null;
        httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                try {
                    if (httpURLConnection2 instanceof HttpsURLConnection) {
                        if (h == null && (sSLContextA = fd2.a()) != null) {
                            h = sSLContextA.getSocketFactory();
                        }
                        SSLSocketFactory sSLSocketFactory = h;
                        if (sSLSocketFactory != null) {
                            ((HttpsURLConnection) httpURLConnection2).setSSLSocketFactory(sSLSocketFactory);
                            ((HttpsURLConnection) httpURLConnection2).setHostnameVerifier(fd2.a);
                        }
                    }
                    httpURLConnection2.setReadTimeout(20000);
                    httpURLConnection2.setConnectTimeout(30000);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setInstanceFollowRedirects(true);
                    if (bArr.length > 2048) {
                        httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip, deflate");
                        httpURLConnection2.setRequestProperty(Header.COMPRESSION_ALGORITHM, "1");
                        bArrM = rq0.m(bArr);
                    } else {
                        httpURLConnection2.setRequestProperty("Accept-Encoding", "text/example");
                        httpURLConnection2.setRequestProperty(Header.COMPRESSION_ALGORITHM, "0");
                        bArrM = bArr;
                    }
                    httpURLConnection2.setRequestProperty("fixed", "1");
                    httpURLConnection2.setRequestProperty("count", String.valueOf(list.size()));
                    httpURLConnection2.setRequestProperty("appids", rq0.b(list, "_"));
                    httpURLConnection2.setRequestProperty("ver", "1.2.0.0-snowball");
                    httpURLConnection2.setRequestProperty("uuid", str2);
                    httpURLConnection2.setRequestProperty("dupid", str3);
                    Pair pairD = ld2.f().a.d();
                    byte[] bArr2 = (byte[]) pairD.second;
                    if (bArr2 != null) {
                        nl1Var = new nl1(bArr2);
                    }
                    if (nl1Var == null) {
                        pb2Var.d = "encrypt error";
                        httpURLConnection2.disconnect();
                        return v61Var;
                    }
                    byte[] bytes = Base64.encodeToString(nl1Var.e(bArrM), 2).getBytes();
                    if (bytes == null) {
                        cc2.c("requestByPost buffer is null");
                        pb2Var.d = "base64 error";
                        httpURLConnection2.disconnect();
                        return v61Var;
                    }
                    httpURLConnection2.setRequestProperty("encrypt-level", "3");
                    httpURLConnection2.setRequestProperty("encrypt-index", String.valueOf(((Integer) pairD.first).intValue() + 1));
                    httpURLConnection2.connect();
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                    dataOutputStream.write(bytes);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    if (httpURLConnection2.getResponseCode() != 200) {
                        v61 v61Var2 = new v61(-1, new pb2("rc_" + rq0.a(httpURLConnection2.getErrorStream())));
                        httpURLConnection2.disconnect();
                        return v61Var2;
                    }
                    String strA = rq0.a(httpURLConnection2.getInputStream());
                    if (TextUtils.isEmpty(strA)) {
                        v61 v61Var3 = new v61(-1, new pb2("rc_" + i));
                        httpURLConnection2.disconnect();
                        return v61Var3;
                    }
                    JSONObject jSONObject = new JSONObject(strA);
                    int iOptInt = jSONObject.optInt("code");
                    String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
                    pb2 pb2Var2 = new pb2();
                    pb2Var2.a = iOptInt;
                    pb2Var2.b = strOptString;
                    if (iOptInt != 0) {
                        pb2Var2.d = "rc_" + iOptInt;
                        v61 v61Var4 = new v61(-1, pb2Var2);
                        httpURLConnection2.disconnect();
                        return v61Var4;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("app");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            long j = jSONObjectOptJSONObject.getJSONObject(next).getLong("ver");
                            int i2 = jSONObjectOptJSONObject.getJSONObject(next).getInt("type");
                            if (i2 != 0) {
                                int i3 = Integer.parseInt(next);
                                ob2 ob2Var = new ob2();
                                ob2Var.a = i3;
                                ob2Var.b = i2;
                                ob2Var.c = j;
                                if (pb2Var2.c == null) {
                                    pb2Var2.c = new ArrayList();
                                }
                                pb2Var2.c.add(ob2Var);
                            }
                        }
                    }
                    v61 v61Var5 = new v61(0, pb2Var2);
                    httpURLConnection2.disconnect();
                    return v61Var5;
                } catch (Exception e2) {
                    e = e2;
                    httpURLConnection = httpURLConnection2;
                    cc2.c(e.getMessage());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return new v61(-1, new pb2());
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static boolean b(int i, Rect rect, Rect rect2, Rect rect3) {
        int iK;
        int i2;
        int i3;
        boolean zC = c(i, rect, rect2);
        if (!c(i, rect, rect3) && zC) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iK = k(i, rect, rect2);
                                if (i != 17) {
                                    i2 = rect.left;
                                    i3 = rect3.left;
                                } else if (i != 33) {
                                    i2 = rect.top;
                                    i3 = rect3.top;
                                } else if (i != 66) {
                                    i2 = rect3.right;
                                    i3 = rect.right;
                                } else {
                                    if (i == 130) {
                                        e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i2 = rect3.bottom;
                                    i3 = rect.bottom;
                                }
                                if (iK < Math.max(1, i2 - i3)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i != 17) {
                            iK = k(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iK < Math.max(1, i2 - i3)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i != 17) {
                        iK = k(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iK < Math.max(1, i2 - i3)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i != 17) {
                    iK = k(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iK < Math.max(1, i2 - i3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    public static boolean c(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static int d(hg1 hg1Var, c50 c50Var, View view, View view2, xf1 xf1Var, boolean z) {
        if (xf1Var.v() == 0 || hg1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(xf1.H(view) - xf1.H(view2)) + 1;
        }
        return Math.min(c50Var.l(), c50Var.b(view2) - c50Var.e(view));
    }

    public static int e(hg1 hg1Var, c50 c50Var, View view, View view2, xf1 xf1Var, boolean z, boolean z2) {
        if (xf1Var.v() == 0 || hg1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (hg1Var.b() - Math.max(xf1.H(view), xf1.H(view2))) - 1) : Math.max(0, Math.min(xf1.H(view), xf1.H(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(c50Var.b(view2) - c50Var.e(view)) / (Math.abs(xf1.H(view) - xf1.H(view2)) + 1))) + (c50Var.k() - c50Var.e(view)));
        }
        return iMax;
    }

    public static int f(hg1 hg1Var, c50 c50Var, View view, View view2, xf1 xf1Var, boolean z) {
        if (xf1Var.v() == 0 || hg1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return hg1Var.b();
        }
        return (int) (((c50Var.b(view2) - c50Var.e(view)) / (Math.abs(xf1.H(view) - xf1.H(view2)) + 1)) * hg1Var.b());
    }

    public static void g(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("k");
                String strOptString2 = jSONObjectOptJSONObject.optString("v");
                strOptString.getClass();
                if (strOptString.length() != 0) {
                    CopyOnWriteArraySet copyOnWriteArraySetA = w41.a();
                    next.getClass();
                    List listB = StringsKt.B(strOptString, new String[]{","}, 0, 6);
                    strOptString2.getClass();
                    copyOnWriteArraySetA.add(new w41(next, listB, strOptString2));
                }
            }
        }
    }

    public static vy2 h(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            uq1.q("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        v5 v5Var = new v5(1);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, v5Var, 1)) {
            uq1.o("Google Play connection failed");
            return null;
        }
        try {
            try {
                IBinder iBinderB = v5Var.b();
                w5 w5Var = new w5(1);
                w5Var.b = iBinderB;
                String strD = w5Var.D();
                w5Var.E();
                vy2 vy2Var = new vy2(strD, 2);
                context.unbindService(v5Var);
                return vy2Var;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th) {
            context.unbindService(v5Var);
            throw th;
        }
    }

    public static Object i(Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = g;
        if (declaredConstructor == null) {
            declaredConstructor = m2.k().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            g = declaredConstructor;
        }
        return m2.o(declaredConstructor.newInstance(wv1.class, -1)).unreflectSpecial(method, wv1.class).bindTo(obj).invokeWithArguments(objArr);
    }

    public static boolean j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static int k(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int l(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        gu2.B(iArr, iArr2, iArr4);
        p(iArr4, iArr3);
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((gu2.C(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && kv.C(10, iArr3, d))) && kv.h(7, e, iArr3) != 0) {
            kv.K(10, 7, iArr3);
        }
    }

    public static Date o(Parcel parcel) {
        long j = parcel.readLong();
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    public static void p(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = (21389 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[6]) & 4294967295L;
        long j4 = (21389 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[7]) & 4294967295L;
        long j6 = (21389 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[8]) & 4294967295L;
        long j8 = (21389 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[9]) & 4294967295L;
        long j10 = (21389 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = (j10 >>> 32) + j9;
        long j12 = j11 & 4294967295L;
        long j13 = (21389 * j12) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j13;
        long j14 = j11 >>> 32;
        long j15 = (21389 * j14) + j12 + (((long) i2) & 4294967295L) + (j13 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = j14 + (((long) i3) & 4294967295L) + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j17;
        if (((j17 >>> 32) == 0 ? 0 : kv.L(5, 4, iArr2)) != 0 || (iArr2[4] == -1 && gu2.w(iArr2, c))) {
            kv.d(5, 21389, iArr2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public static void q(int[] iArr, int i) {
        if (i == 0) {
            if (iArr[4] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = (21389 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? kv.L(5, 3, iArr) : 0) == 0) {
            if (iArr[4] == -1 || !gu2.w(iArr, c)) {
                return;
            }
        }
        kv.d(5, 21389, iArr);
    }

    public static void r(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        gu2.H(iArr, iArr3);
        p(iArr3, iArr2);
    }

    public static void s(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        gu2.H(iArr, iArr3);
        p(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            gu2.H(iArr2, iArr3);
            p(iArr3, iArr2);
        }
    }

    public static void t(int[] iArr, int[] iArr2, int[] iArr3) {
        if (gu2.J(iArr, iArr2, iArr3) != 0) {
            kv.g0(5, 21389, iArr3);
        }
    }

    public static ArrayList u(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static void v(int[] iArr, int[] iArr2) {
        if (kv.a0(5, 0, iArr, iArr2) != 0 || (iArr2[4] == -1 && gu2.w(iArr2, c))) {
            kv.d(5, 21389, iArr2);
        }
    }

    public static final Object w(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, fs fsVar) {
        Object objC = ix1.c(coroutineContext, obj2);
        try {
            zs1 zs1Var = new zs1(fsVar, coroutineContext);
            Object objC2 = function2 == null ? sr0.c(function2, obj, zs1Var) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, zs1Var);
            ix1.a(coroutineContext, objC);
            if (objC2 == ft.a) {
                fsVar.getClass();
            }
            return objC2;
        } catch (Throwable th) {
            ix1.a(coroutineContext, objC);
            throw th;
        }
    }

    public static String x(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void y(int i, int i2) {
        String strD;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strD = xi0.D("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    e.g(ck1.r(i2, "negative size: "));
                    return;
                }
                strD = xi0.D("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static void z(int i, int i2, int i3) {
        String strC;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strC = C(i, i3, "start index");
            } else {
                strC = (i2 < 0 || i2 > i3) ? C(i2, i3, "end index") : xi0.D("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }
}
