package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import prod.apptest.com.AppTestApp;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qt {
    public static final int[] a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final byte[] c = {48, 49, 53, 0};
    public static final byte[] d = {48, 49, 48, 0};
    public static final byte[] e = {48, 48, 57, 0};
    public static final byte[] f = {48, 48, 53, 0};
    public static final byte[] g = {48, 48, 49, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 50, 0};
    public static final Object j = new Object();
    public static u72 k;

    public qt(String str, Bundle bundle) {
        this("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, false);
        str.getClass();
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        e.g("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public static void A(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j2;
        long jK = j2 >> 32;
        if (jK != 0) {
            jK = kv.K(7, 1, iArr);
        }
        iArr[7] = (int) (((((long) iArr[7]) & 4294967295L) - 2147483648L) + jK);
    }

    public static void B(int[] iArr, int[] iArr2, int[] iArr3) {
        if (r93.b0(iArr, iArr2, iArr3) != 0) {
            long j2 = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j2;
            long jM = j2 >> 32;
            if (jM != 0) {
                jM = kv.m(7, 1, iArr3);
            }
            iArr3[7] = (int) ((4294967295L & ((long) iArr3[7])) + 2147483648L + jM);
        }
    }

    public static final String C(fs fsVar) {
        Object qj1Var;
        if (fsVar instanceof f20) {
            return ((f20) fsVar).toString();
        }
        try {
            pj1 pj1Var = rj1.b;
            qj1Var = fsVar + '@' + j(fsVar);
        } catch (Throwable th) {
            pj1 pj1Var2 = rj1.b;
            qj1Var = new qj1(th);
        }
        if (rj1.a(qj1Var) != null) {
            qj1Var = fsVar.getClass().getName() + '@' + j(fsVar);
        }
        return (String) qj1Var;
    }

    public static void D(int[] iArr, int[] iArr2) {
        kv.a0(8, 0, iArr, iArr2);
        if (r93.x(iArr2, a)) {
            A(iArr2);
        }
    }

    public static final Object E(CoroutineContext coroutineContext, Function2 function2, fs fsVar) throws Throwable {
        Object objW;
        CoroutineContext context = fsVar.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new uo(2))).booleanValue() ? context.plus(coroutineContext) : vs.a(context, coroutineContext, false);
        ye1.h(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            em1 em1Var = new em1(fsVar, coroutineContextPlus);
            objW = yv2.P(em1Var, em1Var, function2);
        } else {
            hs hsVar = d.M;
            if (Intrinsics.areEqual(coroutineContextPlus.get(hsVar), context.get(hsVar))) {
                m22 m22Var = new m22(fsVar, coroutineContextPlus);
                CoroutineContext coroutineContext2 = m22Var.e;
                Object objC = ix1.c(coroutineContext2, null);
                try {
                    Object objP = yv2.P(m22Var, m22Var, function2);
                    ix1.a(coroutineContext2, objC);
                    objW = objP;
                } catch (Throwable th) {
                    ix1.a(coroutineContext2, objC);
                    throw th;
                }
            } else {
                g20 g20Var = new g20(fsVar, coroutineContextPlus);
                bj0.t(function2, g20Var, g20Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g20.i;
                do {
                    int i2 = atomicIntegerFieldUpdater.get(g20Var);
                    if (i2 != 0) {
                        if (i2 != 2) {
                            uq1.q("Already suspended");
                            return null;
                        }
                        objW = yv2.W(g20Var.x());
                        if (objW instanceof vp) {
                            throw ((vp) objW).a;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(g20Var, 0, 1));
                objW = ft.a;
            }
        }
        ft ftVar = ft.a;
        return objW;
    }

    public static rz2 F(r83 r83Var) {
        int i2 = 2;
        if (r83Var == r83.d) {
            return new rz2("HmacSha256", i2);
        }
        if (r83Var == r83.e) {
            return new rz2("HmacSha384", i2);
        }
        if (r83Var == r83.f) {
            return new rz2("HmacSha512", i2);
        }
        e.g("Unrecognized HPKE KDF identifier");
        return null;
    }

    public static pa3 G(q83 q83Var) {
        if (q83Var == q83.d) {
            return new jf2(16);
        }
        if (q83Var == q83.e) {
            return new jf2(32);
        }
        if (q83Var == q83.f) {
            return new vl0(21);
        }
        e.g("Unrecognized HPKE AEAD identifier");
        return null;
    }

    public static ya3 H(t83 t83Var) {
        Object qh1Var;
        if (t83Var == t83.g) {
            rz2 rz2Var = new rz2("HmacSha256", 2);
            nl1 nl1Var = new nl1();
            nl1Var.b = rz2Var;
            try {
                qh1Var = kj0.U();
            } catch (GeneralSecurityException unused) {
                qh1Var = new qh1(22);
            }
            nl1Var.a = qh1Var;
            return nl1Var;
        }
        if (t83Var == t83.d) {
            return vf3.d(wq3.a);
        }
        if (t83Var == t83.e) {
            return vf3.d(wq3.b);
        }
        if (t83Var == t83.f) {
            return vf3.d(wq3.c);
        }
        e.g("Unrecognized HPKE KEM identifier");
        return null;
    }

    public static void I(int i2, int i3) {
        String strH;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strH = xi0.H("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    e.g(ck1.r(i3, "negative size: "));
                    return;
                }
                strH = xi0.H("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static void J(Object obj, String str) {
        if (obj != null) {
            return;
        }
        uq1.h(str.concat(" must not be null"));
    }

    public static void K(int i2, int i3, int i4) {
        String strL;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strL = L(i2, i4, "start index");
            } else {
                strL = (i3 < 0 || i3 > i4) ? L(i3, i4, "end index") : xi0.H("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static String L(int i2, int i3, String str) {
        if (i2 < 0) {
            return xi0.H("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return xi0.H("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        e.g(ck1.r(i3, "negative size: "));
        return null;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static f00 b(et etVar, Function2 function2) {
        g gVar = g.a;
        ht htVar = ht.a;
        CoroutineContext coroutineContextB = vs.b(etVar, gVar);
        ht htVar2 = ht.a;
        f00 f00Var = new f00(coroutineContextB, true);
        f00Var.X(htVar, f00Var, function2);
        return f00Var;
    }

    public static final mf1 c(ds1 ds1Var) {
        ds1Var.getClass();
        return new mf1(ds1Var);
    }

    public static void d(Context context) {
        if (k == null) {
            u72 u72Var = new u72(context);
            k = u72Var;
            synchronized (u72Var.a) {
                u72Var.g = true;
            }
        }
    }

    public static void e(Intent intent) {
        synchronized (j) {
            try {
                if (k != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    k.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static float f(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static int g(int i2, int i3, Context context) {
        Integer numI = i(context, i2);
        return numI != null ? numI.intValue() : i3;
    }

    public static int h(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueV = jw.v(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = typedValueV.resourceId;
        return i3 != 0 ? context.getColor(i3) : typedValueV.data;
    }

    public static Integer i(Context context, int i2) {
        TypedValue typedValueT = jw.t(context, i2);
        if (typedValueT == null) {
            return null;
        }
        int i3 = typedValueT.resourceId;
        return Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueT.data);
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1 A[LOOP:0: B:28:0x009f->B:29:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce A[LOOP:1: B:33:0x00cc->B:34:0x00ce, LOOP_END] */
    public static n70 k(JSONObject jSONObject) throws JSONException {
        int i2;
        String upperCase;
        JSONArray jSONArray;
        ArrayList arrayList;
        int length;
        int i3;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList2;
        int length2;
        jSONObject.getClass();
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        string2.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        int i4 = 2;
        if (upperCase2 != null) {
            if (upperCase2.equals("MANUAL")) {
                i2 = 1;
            } else if (upperCase2.equals("INFERENCE")) {
                i2 = 2;
            } else {
                e.g("No enum constant com.facebook.appevents.codeless.internal.EventBinding.MappingMethod.".concat(upperCase2));
            }
            String string3 = jSONObject.getString("event_type");
            string3.getClass();
            upperCase = string3.toUpperCase(locale);
            upperCase.getClass();
            if (upperCase != null) {
                if (upperCase.equals("CLICK")) {
                    i4 = 1;
                } else if (!upperCase.equals("SELECTED")) {
                    if (upperCase.equals("TEXT_CHANGED")) {
                        i4 = 3;
                    } else {
                        e.g("No enum constant com.facebook.appevents.codeless.internal.EventBinding.ActionType.".concat(upperCase));
                    }
                }
                String string4 = jSONObject.getString("app_version");
                jSONArray = jSONObject.getJSONArray("path");
                arrayList = new ArrayList();
                length = jSONArray.length();
                for (i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    jSONObject2.getClass();
                    arrayList.add(new kb1(jSONObject2));
                }
                String strOptString = jSONObject.optString("path_type", "absolute");
                jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
                arrayList2 = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    length2 = jSONArrayOptJSONArray.length();
                    for (int i5 = 0; i5 < length2; i5++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i5);
                        jSONObject3.getClass();
                        arrayList2.add(new sa1(jSONObject3));
                    }
                }
                String strOptString2 = jSONObject.optString("component_id");
                String strOptString3 = jSONObject.optString("activity_name");
                string.getClass();
                string4.getClass();
                strOptString2.getClass();
                strOptString.getClass();
                strOptString3.getClass();
                return new n70(string, i2, i4, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
            }
            uq1.h("Name is null");
            i4 = 0;
            String string5 = jSONObject.getString("app_version");
            jSONArray = jSONObject.getJSONArray("path");
            arrayList = new ArrayList();
            length = jSONArray.length();
            while (i3 < length) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                jSONObject4.getClass();
                arrayList.add(new kb1(jSONObject4));
            }
            String strOptString4 = jSONObject.optString("path_type", "absolute");
            jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                length2 = jSONArrayOptJSONArray.length();
                while (i5 < length2) {
                    JSONObject jSONObject5 = jSONArrayOptJSONArray.getJSONObject(i5);
                    jSONObject5.getClass();
                    arrayList2.add(new sa1(jSONObject5));
                }
            }
            String strOptString5 = jSONObject.optString("component_id");
            String strOptString6 = jSONObject.optString("activity_name");
            string.getClass();
            string5.getClass();
            strOptString5.getClass();
            strOptString4.getClass();
            strOptString6.getClass();
            return new n70(string, i2, i4, string5, arrayList, arrayList2, strOptString5, strOptString4, strOptString6);
        }
        uq1.h("Name is null");
        i2 = 0;
        String string6 = jSONObject.getString("event_type");
        string6.getClass();
        upperCase = string6.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase != null) {
            if (upperCase.equals("CLICK")) {
                i4 = 1;
            } else if (!upperCase.equals("SELECTED")) {
                if (upperCase.equals("TEXT_CHANGED")) {
                    i4 = 3;
                } else {
                    e.g("No enum constant com.facebook.appevents.codeless.internal.EventBinding.ActionType.".concat(upperCase));
                }
            }
            String string7 = jSONObject.getString("app_version");
            jSONArray = jSONObject.getJSONArray("path");
            arrayList = new ArrayList();
            length = jSONArray.length();
            while (i3 < length) {
                JSONObject jSONObject6 = jSONArray.getJSONObject(i3);
                jSONObject6.getClass();
                arrayList.add(new kb1(jSONObject6));
            }
            String strOptString7 = jSONObject.optString("path_type", "absolute");
            jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                length2 = jSONArrayOptJSONArray.length();
                while (i5 < length2) {
                    JSONObject jSONObject7 = jSONArrayOptJSONArray.getJSONObject(i5);
                    jSONObject7.getClass();
                    arrayList2.add(new sa1(jSONObject7));
                }
            }
            String strOptString8 = jSONObject.optString("component_id");
            String strOptString9 = jSONObject.optString("activity_name");
            string.getClass();
            string7.getClass();
            strOptString8.getClass();
            strOptString7.getClass();
            strOptString9.getClass();
            return new n70(string, i2, i4, string7, arrayList, arrayList2, strOptString8, strOptString7, strOptString9);
        }
        uq1.h("Name is null");
        i4 = 0;
        String string8 = jSONObject.getString("app_version");
        jSONArray = jSONObject.getJSONArray("path");
        arrayList = new ArrayList();
        length = jSONArray.length();
        while (i3 < length) {
            JSONObject jSONObject8 = jSONArray.getJSONObject(i3);
            jSONObject8.getClass();
            arrayList.add(new kb1(jSONObject8));
        }
        String strOptString10 = jSONObject.optString("path_type", "absolute");
        jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            length2 = jSONArrayOptJSONArray.length();
            while (i5 < length2) {
                JSONObject jSONObject9 = jSONArrayOptJSONArray.getJSONObject(i5);
                jSONObject9.getClass();
                arrayList2.add(new sa1(jSONObject9));
            }
        }
        String strOptString11 = jSONObject.optString("component_id");
        String strOptString12 = jSONObject.optString("activity_name");
        string.getClass();
        string8.getClass();
        strOptString11.getClass();
        strOptString10.getClass();
        strOptString12.getClass();
        return new n70(string, i2, i4, string8, arrayList, arrayList2, strOptString11, strOptString10, strOptString12);
    }

    public static int l(List list, InputStream inputStream, v01 v01Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new nf1(inputStream, v01Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                int iB = ((rn0) list.get(i2)).b(inputStream, v01Var);
                inputStream.reset();
                if (iB != -1) {
                    return iB;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType m(List list, InputStream inputStream, v01 v01Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new nf1(inputStream, v01Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser.ImageType imageTypeF = ((rn0) list.get(i2)).f(inputStream);
                inputStream.reset();
                if (imageTypeF != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeF;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType n(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser.ImageType imageTypeA = ((rn0) list.get(i2)).a(byteBuffer);
                AtomicReference atomicReference = kj.a;
                if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = kj.a;
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ft1 o(et etVar, Function2 function2) {
        g gVar = g.a;
        ht htVar = ht.a;
        CoroutineContext coroutineContextB = vs.b(etVar, gVar);
        ht htVar2 = ht.a;
        ft1 ft1Var = new ft1(coroutineContextB, true);
        ft1Var.X(htVar, ft1Var, function2);
        return ft1Var;
    }

    public static int p(float f2, int i2, int i3) {
        return so.c(so.e(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static final void q(String str) {
        Collection collectionY;
        str.getClass();
        String str2 = AppTestApp.b0;
        if (str2 == null) {
            uq1.q("Required value was null.");
            return;
        }
        List listD = new Regex("\\s*,[,\\s]*").d(str2);
        if (listD.isEmpty()) {
            collectionY = x50.a;
        } else {
            ListIterator listIterator = listD.listIterator(listD.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionY = CollectionsKt.y(listD, listIterator.nextIndex() + 1);
                }
            }
            collectionY = x50.a;
        }
        ((wv1) ak1.b(((String[]) collectionY.toArray(new String[0]))[0]).b()).a(Collections.singletonMap("message", "[APP] ".concat(str))).w(new j10(8));
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        r93.L(iArr, iArr2, iArr4);
        t(iArr4, iArr3);
    }

    public static PorterDuff.Mode s(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void t(int[] iArr, int[] iArr2) {
        int i2 = iArr[7];
        int i3 = i2;
        int i4 = 0;
        while (i4 < 8) {
            int i5 = iArr[8 + i4];
            iArr2[i4] = (i3 >>> 31) | (i5 << 1);
            i4++;
            i3 = i5;
        }
        long j2 = ((((long) iArr2[0]) & 4294967295L) * 19) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((((long) iArr2[1]) & 4294967295L) * 19) + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((((long) iArr2[2]) & 4294967295L) * 19) + (((long) iArr[2]) & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((((long) iArr2[3]) & 4294967295L) * 19) + (((long) iArr[3]) & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((((long) iArr2[4]) & 4294967295L) * 19) + (((long) iArr[4]) & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((((long) iArr2[5]) & 4294967295L) * 19) + (((long) iArr[5]) & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = ((((long) iArr2[6]) & 4294967295L) * 19) + (((long) iArr[6]) & 4294967295L) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        long j9 = (19 * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7])) + (j8 >>> 32);
        int i6 = (int) j9;
        iArr2[7] = i6;
        iArr2[7] = kv.j(7, (((i6 >>> 31) - (i2 >>> 31)) + (((int) (j9 >>> 32)) << 1)) * 19, iArr2) + (Integer.MAX_VALUE & i6);
        if (r93.x(iArr2, a)) {
            A(iArr2);
        }
    }

    public static void u(int[] iArr, int i2) {
        int i3 = iArr[7];
        iArr[7] = kv.j(7, ((i2 << 1) | (i3 >>> 31)) * 19, iArr) + (i3 & Integer.MAX_VALUE);
        if (r93.x(iArr, a)) {
            A(iArr);
        }
    }

    public static Object v(Function2 function2) throws Throwable {
        g gVar = g.a;
        Thread threadCurrentThread = Thread.currentThread();
        hs hsVar = d.M;
        gVar.getClass();
        hsVar.getClass();
        s70 s70VarA = jx1.a();
        CoroutineContext coroutineContextA = vs.a(gVar, s70VarA, true);
        CoroutineContext coroutineContext = i20.a;
        if (coroutineContextA != coroutineContext && coroutineContextA.get(hsVar) == null) {
            coroutineContextA = coroutineContextA.plus(coroutineContext);
        }
        sh shVar = new sh(coroutineContextA, threadCurrentThread, s70VarA);
        shVar.X(ht.a, shVar, function2);
        s70 s70Var = shVar.i;
        if (s70Var != null) {
            int i2 = s70.f;
            s70Var.m(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jN = s70Var != null ? s70Var.n() : Long.MAX_VALUE;
                if (!(shVar.x() instanceof up0)) {
                    if (s70Var != null) {
                        int i3 = s70.f;
                        s70Var.l(false);
                    }
                    Object objW = yv2.W(shVar.x());
                    vp vpVar = objW instanceof vp ? (vp) objW : null;
                    if (vpVar == null) {
                        return objW;
                    }
                    throw vpVar.a;
                }
                LockSupport.parkNanos(shVar, jN);
            } catch (Throwable th) {
                if (s70Var != null) {
                    int i4 = s70.f;
                    s70Var.l(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        shVar.j(interruptedException);
        throw interruptedException;
    }

    public static void w(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.R()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(nj2.y(status));
        }
    }

    public static void x(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        r93.Y(iArr, iArr3);
        t(iArr3, iArr2);
    }

    public static void y(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        r93.Y(iArr, iArr3);
        t(iArr3, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            r93.Y(iArr2, iArr3);
            t(iArr3, iArr2);
        }
    }

    public static ComponentName z(Context context, Intent intent) {
        synchronized (j) {
            try {
                d(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    k.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public qt(String str, Bundle bundle, boolean z) {
        str.getClass();
        bundle.getClass();
    }
}
