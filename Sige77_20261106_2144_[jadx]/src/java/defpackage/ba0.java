package defpackage;

import android.util.Patterns;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ba0 implements ls, f, f2, bj, p90, y91, o62, hv2, ed3, yc3, ze3, ff3 {
    public static ba0 W;
    public static Map c;
    public static Map d;
    public static Map e;
    public static JSONObject f;
    public static boolean i;
    public final /* synthetic */ int a;
    public static final ba0 b = new ba0(0);
    public static final ba0 v = new ba0(1);
    public static final ba0 w = new ba0(2);
    public static final /* synthetic */ ba0 X = new ba0(12);
    public static final /* synthetic */ ba0 Y = new ba0(13);
    public static final /* synthetic */ ba0 Z = new ba0(14);
    public static final /* synthetic */ ba0 a0 = new ba0(15);
    public static final /* synthetic */ ba0 b0 = new ba0(16);
    public static final /* synthetic */ ba0 c0 = new ba0(17);
    public static final /* synthetic */ ba0 d0 = new ba0(18);
    public static final /* synthetic */ ba0 e0 = new ba0(19);

    public /* synthetic */ ba0(int i2) {
        this.a = i2;
    }

    public static final gn2 A(Object obj, Object obj2) {
        gn2 gn2VarC = (gn2) obj;
        gn2 gn2Var = (gn2) obj2;
        if (!gn2Var.isEmpty()) {
            if (!gn2VarC.a) {
                gn2VarC = gn2VarC.c();
            }
            gn2VarC.f();
            if (!gn2Var.isEmpty()) {
                gn2VarC.putAll(gn2Var);
            }
        }
        return gn2VarC;
    }

    public static qp0 m() {
        Class clsJ = sp0.j("com.android.billingclient.api.SkuDetailsParams");
        Class clsJ2 = sp0.j("com.android.billingclient.api.SkuDetailsParams$Builder");
        if (clsJ == null || clsJ2 == null) {
            return null;
        }
        Method methodO = sp0.o(clsJ, "newBuilder", new Class[0]);
        Method methodO2 = sp0.o(clsJ2, "setType", String.class);
        Method methodO3 = sp0.o(clsJ2, "setSkusList", List.class);
        Method methodO4 = sp0.o(clsJ2, "build", new Class[0]);
        if (methodO == null || methodO2 == null || methodO3 == null || methodO4 == null) {
            return null;
        }
        qp0 qp0Var = new qp0();
        qp0Var.a = clsJ;
        qp0Var.b = clsJ2;
        qp0Var.c = methodO;
        qp0Var.d = methodO2;
        qp0Var.e = methodO3;
        qp0Var.f = methodO4;
        if (!mt.a.contains(qp0.class)) {
            try {
                qp0.v = qp0Var;
            } catch (Throwable th) {
                mt.a(qp0.class, th);
            }
        }
        if (mt.a.contains(qp0.class)) {
            return null;
        }
        try {
            return qp0.v;
        } catch (Throwable th2) {
            mt.a(qp0.class, th2);
            return null;
        }
    }

    public static final float[] n(String str, JSONObject jSONObject) {
        if (!mt.a.contains(ba0.class)) {
            try {
                str.getClass();
                if (i) {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    try {
                        String lowerCase = str.toLowerCase();
                        lowerCase.getClass();
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                        String strOptString = jSONObject.optString("screenname");
                        JSONArray jSONArray = new JSONArray();
                        ba0 ba0Var = b;
                        ba0Var.v(jSONObject2, jSONArray);
                        ba0Var.y(fArr, ba0Var.u(jSONObject2));
                        JSONObject jSONObjectP = ba0Var.p(jSONObject2);
                        if (jSONObjectP != null) {
                            strOptString.getClass();
                            String string = jSONObject2.toString();
                            string.getClass();
                            ba0Var.y(fArr, ba0Var.t(jSONObjectP, jSONArray, strOptString, string, lowerCase));
                            return fArr;
                        }
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                mt.a(ba0.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String q(String str, String str2, String str3) {
        if (mt.a.contains(ba0.class)) {
            return null;
        }
        try {
            str.getClass();
            str2.getClass();
            str3.getClass();
            String lowerCase = (str3 + " | " + str2 + ", " + str).toLowerCase();
            lowerCase.getClass();
            return lowerCase;
        } catch (Throwable th) {
            mt.a(ba0.class, th);
            return null;
        }
    }

    public static final void r(File file) {
        if (mt.a.contains(ba0.class)) {
            return;
        }
        try {
            try {
                f = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f = new JSONObject(new String(bArr, Charsets.UTF_8));
                c = w11.d(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                d = w11.d(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                e = w11.d(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                i = true;
            } catch (Throwable th) {
                mt.a(ba0.class, th);
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.bj
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.o62
    public l62 b(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (l62) objNewInstance;
        } catch (IllegalAccessException e2) {
            sm0.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            sm0.l("Cannot create an instance of ", cls, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            sm0.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) {
        ah3 ah3Var = (ah3) dx2Var;
        vn3 vn3VarT = xn3.t();
        vn3VarT.i("type.googleapis.com/google.crypto.tink.HmacKey");
        em3 em3VarY = fm3.y();
        im3 im3VarX = km3.x();
        int i2 = ah3Var.b;
        im3VarX.f();
        ((km3) im3VarX.b).zzf = i2;
        bm3 bm3Var = (bm3) mh3.b.E(ah3Var.d);
        im3VarX.f();
        ((km3) im3VarX.b).zze = bm3Var.zza();
        km3 km3Var = (km3) im3VarX.d();
        em3VarY.f();
        fm3.w((fm3) em3VarY.b, km3Var);
        int i3 = ah3Var.a;
        em3VarY.f();
        ((fm3) em3VarY.b).zzg = i3;
        vn3VarT.j(((fm3) em3VarY.d()).b());
        vn3VarT.h((ip3) mh3.a.E(ah3Var.c));
        return vf3.f((xn3) vn3VarT.d());
    }

    @Override // defpackage.f2
    public String f() {
        return "oauth/access_token";
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) {
        pz2 pz2Var = (pz2) zi0Var;
        zj3 zj3VarW = ak3.w();
        byte[] bArrB = ((tr3) pz2Var.g.a).b();
        nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
        zj3VarW.f();
        ak3.v((ak3) zj3VarW.b, nr2VarE);
        return wf3.d("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((ak3) zj3VarW.d()).b(), 2, c43.b(pz2Var.f.b), pz2Var.i);
    }

    @Override // defpackage.ls
    public Object i(Object obj) {
        return (ResponseBody) obj;
    }

    @Override // defpackage.bj
    public Object j(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        xn3 xn3Var = (xn3) vf3Var.c;
        if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            e.g(ts.j("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", xn3Var.B()));
            return null;
        }
        try {
            return ha3.b(xn3Var.z(), al3.u(xn3Var.A(), wr2.b).w());
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
        }
    }

    @Override // defpackage.f2
    public String l() {
        return "fb_extend_sso_token";
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            e.g("Wrong type URL in call to AesSivParameters.parseParameters");
            return null;
        }
        try {
            jk3 jk3VarU = jk3.u((jr2) wf3Var.e, wr2.b);
            if (jk3VarU.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            rc2 rc2VarB = r73.b();
            rc2VarB.H(jk3VarU.x().b());
            rc2VarB.c = y73.a((ip3) wf3Var.f);
            r73 r73VarG = rc2VarB.G();
            u23 u23Var = new u23(1);
            u23Var.c = null;
            u23Var.d = null;
            u23Var.b = r73VarG;
            u23Var.c = new ox1(tr3.a(jk3VarU.x().o()));
            u23Var.d = (Integer) wf3Var.i;
            return u23Var.e();
        } catch (ks2 unused) {
            tv2.f("Parsing AesSivKey failed");
            return null;
        }
    }

    public JSONObject p(JSONObject jSONObject) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                jSONObject2.getClass();
                JSONObject jSONObjectP = p(jSONObject2);
                if (jSONObjectP != null) {
                    return jSONObjectP;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            mt.a(this, th);
        }
        return null;
    }

    public boolean s(String[] strArr, String[] strArr2) {
        if (!mt.a.contains(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (StringsKt.t(str2, str)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:86:0x015f  */
    public float[] t(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr;
        String str4;
        String string;
        String string2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float[] fArr2 = null;
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= 30) {
                    break;
                }
                fArr3[i3] = 0.0f;
                i3++;
                mt.a(this, th);
                return fArr;
            }
            int length = jSONArray.length();
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                while (i2 < length2) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    fArr = fArr2;
                    try {
                        try {
                            if (!mt.a.contains(this)) {
                                try {
                                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                        fArr3[9] = fArr3[9] + 1.0f;
                                    }
                                } catch (Throwable th) {
                                    mt.a(this, th);
                                }
                            }
                            i2++;
                            fArr2 = fArr;
                        } catch (JSONException unused) {
                            fArr3[13] = -1.0f;
                            fArr3[14] = -1.0f;
                            str4 = str + '|' + str3;
                            StringBuilder sb = new StringBuilder();
                            StringBuilder sb2 = new StringBuilder();
                            z(jSONObject, sb2, sb);
                            string = sb.toString();
                            string2 = sb2.toString();
                            if (x("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                                f2 = 1.0f;
                            } else {
                                f2 = 0.0f;
                            }
                            fArr3[15] = f2;
                            if (x("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            fArr3[16] = f3;
                            if (x("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            fArr3[17] = f4;
                            if (StringsKt.t(str2, "password")) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.0f;
                            }
                            fArr3[18] = f5;
                            if (w("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                                f6 = 1.0f;
                            } else {
                                f6 = 0.0f;
                            }
                            fArr3[19] = f6;
                            if (w("(?i)(sign in)|login|signIn", str2)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fArr3[20] = f7;
                            if (w("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            fArr3[21] = f8;
                            if (x("PURCHASE", "BUTTON_TEXT", string2)) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            fArr3[22] = f9;
                            if (x("PURCHASE", "PAGE_TITLE", str4)) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fArr3[24] = f10;
                            if (w("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            fArr3[25] = f11;
                            if (w("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            fArr3[27] = f12;
                            if (x("LEAD", "BUTTON_TEXT", string2)) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.0f;
                            }
                            fArr3[28] = f13;
                            fArr3[29] = x("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
                            return fArr3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            str4 = str + '|' + str3;
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            z(jSONObject, sb4, sb3);
            string = sb3.toString();
            string2 = sb4.toString();
            if (x("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr3[15] = f2;
            if (x("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr3[16] = f3;
            if (x("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr3[17] = f4;
            if (StringsKt.t(str2, "password")) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            fArr3[18] = f5;
            if (w("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr3[19] = f6;
            if (w("(?i)(sign in)|login|signIn", str2)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fArr3[20] = f7;
            if (w("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            fArr3[21] = f8;
            if (x("PURCHASE", "BUTTON_TEXT", string2)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr3[22] = f9;
            if (x("PURCHASE", "PAGE_TITLE", str4)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr3[24] = f10;
            if (w("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr3[25] = f11;
            if (w("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr3[27] = f12;
            if (x("LEAD", "BUTTON_TEXT", string2)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr3[28] = f13;
            fArr3[29] = x("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr3;
        } catch (Throwable th3) {
            th = th3;
            fArr = fArr2;
        }
    }

    public float[] u(JSONObject jSONObject) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            strOptString.getClass();
            String lowerCase = strOptString.toLowerCase();
            lowerCase.getClass();
            String strOptString2 = jSONObject.optString("hint");
            strOptString2.getClass();
            String lowerCase2 = strOptString2.toLowerCase();
            lowerCase2.getClass();
            String strOptString3 = jSONObject.optString("classname");
            strOptString3.getClass();
            String lowerCase3 = strOptString3.toLowerCase();
            lowerCase3.getClass();
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (s(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (s(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (s(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (s(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.t(lowerCase3, "checkbox")) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (s(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.t(lowerCase3, "radio") && StringsKt.t(lowerCase3, "button")) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    jSONObject2.getClass();
                    y(fArr, u(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public boolean v(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (!mt.a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (jSONArrayOptJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                boolean z2 = z;
                JSONArray jSONArray2 = new JSONArray();
                if (z) {
                    int length2 = jSONArrayOptJSONArray.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i3));
                    }
                    return z2;
                }
                int length3 = jSONArrayOptJSONArray.length();
                for (int i4 = 0; i4 < length3; i4++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i4);
                    jSONObject2.getClass();
                    if (v(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z2;
            } catch (JSONException unused) {
            } catch (Throwable th) {
                mt.a(this, th);
            }
        }
        return false;
    }

    public boolean w(String str, String str2) {
        if (mt.a.contains(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            mt.a(this, th);
            return false;
        }
    }

    public boolean x(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (!mt.a.contains(this)) {
            try {
                JSONObject jSONObject = f;
                String strOptString = null;
                Map map = null;
                strOptString = null;
                strOptString = null;
                strOptString = null;
                strOptString = null;
                if (jSONObject == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rules");
                    jSONObject = null;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (jSONObjectOptJSONObject3 != null) {
                    Map map2 = c;
                    if (map2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                        map2 = null;
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) map2.get("ENGLISH"));
                    if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        Map map3 = d;
                        if (map3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                            map3 = null;
                        }
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) map3.get(str));
                        if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                            Map map4 = e;
                            if (map4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                            } else {
                                map = map4;
                            }
                            strOptString = jSONObjectOptJSONObject2.optString((String) map.get(str2));
                        }
                    }
                }
                if (strOptString != null) {
                    return w(strOptString, str3);
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return false;
            }
        }
        return false;
    }

    public void y(float[] fArr, float[] fArr2) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = fArr[i2] + fArr2[i2];
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public void z(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", BuildConfig.FLAVOR);
            strOptString.getClass();
            String lowerCase = strOptString.toLowerCase();
            lowerCase.getClass();
            String strOptString2 = jSONObject.optString("hint", BuildConfig.FLAVOR);
            strOptString2.getClass();
            String lowerCase2 = strOptString2.toLowerCase();
            lowerCase2.getClass();
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    z(jSONObject2, sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 12:
                List list = h13.a;
                return (String) lp2.b.get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sgtm.batch.retry_max_wait", 21600000L, 43).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 34).get();
            case 15:
                List list4 = h13.a;
                fq2.b.get();
                return (Long) gq2.a.z("measurement.test.cached_long_flag", -1L, 1).get();
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 17:
                List list6 = h13.a;
                return (Boolean) tp2.c.get();
            case 18:
                List list7 = h13.a;
                hq2.b.get();
                return (Boolean) iq2.a.r(8, "measurement.rb.attribution.uuid_generation", true).get();
            default:
                return new Boolean(((Boolean) wq2.a.get()).booleanValue());
        }
    }

    @Override // defpackage.p90
    public void d(Object obj) {
    }

    @Override // defpackage.y91
    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
