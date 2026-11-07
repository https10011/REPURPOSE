package defpackage;

import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.hjq.toast.BuildConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class u41 implements nq, ln2, m3, pj, f60, bx0, gd1, rs2, hv2, ed3, ze3, lv2 {
    public static u41 e;
    public final /* synthetic */ int a;
    public static final u41 b = new u41(0);
    public static final u41 c = new u41(1);
    public static final u41 d = new u41(2);
    public static final /* synthetic */ u41 f = new u41(12);
    public static final /* synthetic */ u41 i = new u41(13);
    public static final /* synthetic */ u41 v = new u41(14);
    public static final /* synthetic */ u41 w = new u41(15);
    public static final /* synthetic */ u41 W = new u41(16);
    public static final /* synthetic */ u41 X = new u41(17);

    public /* synthetic */ u41(int i2) {
        this.a = i2;
    }

    public static ce2 a(String str, String str2, byte[] bArr, HashMap map) throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str + "?" + str2).openConnection();
                try {
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setConnectTimeout(5000);
                    httpURLConnection2.setReadTimeout(5000);
                    if (bArr != null) {
                        httpURLConnection2.setFixedLengthStreamingMode(bArr.length);
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    httpURLConnection2.setRequestProperty("Connection", "close");
                    System.currentTimeMillis();
                    httpURLConnection2.connect();
                    if (bArr != null) {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    }
                    ce2 ce2VarC = c(httpURLConnection2);
                    httpURLConnection2.disconnect();
                    return ce2VarC;
                } catch (Exception e2) {
                    e = e2;
                    httpURLConnection = httpURLConnection2;
                    ae2 ae2Var = new ae2(e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return ae2Var;
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

    public static ce2 c(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection.getResponseCode() != 200) {
            httpURLConnection.getResponseCode();
            return new be2(httpURLConnection.getResponseMessage());
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), vb2.a));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
        }
        String string = sb.toString();
        bufferedReader.close();
        vd2 vd2Var = new vd2();
        JSONObject jSONObject = new JSONObject(string);
        if (jSONObject.has("code") && !jSONObject.isNull("code")) {
            vd2Var.a = jSONObject.optInt("code");
        }
        if (jSONObject.has("config") && !jSONObject.isNull("config")) {
            vd2Var.d = jSONObject.optString("config");
        }
        if (jSONObject.has("body") && !jSONObject.isNull("body")) {
            vd2Var.b = jSONObject.optString("body");
        }
        if (jSONObject.has("msg") && !jSONObject.isNull("msg")) {
            vd2Var.c = jSONObject.optString("msg");
        }
        return vd2Var;
    }

    public static String e(StringBuilder sb) {
        int length = sb.length();
        if (length == 0) {
            uq1.q("StringBuilder must not be empty");
            return null;
        }
        int iCharAt = (sb.charAt(0) << 18) + ((length >= 2 ? sb.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb.charAt(3) : (char) 0);
        char c2 = (char) ((iCharAt >> 16) & 255);
        char c3 = (char) ((iCharAt >> 8) & 255);
        char c4 = (char) (iCharAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c2);
        if (length >= 2) {
            sb2.append(c3);
        }
        if (length >= 3) {
            sb2.append(c4);
        }
        return sb2.toString();
    }

    public static final ArrayList f(View view) {
        if (mt.a.contains(u41.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(g62.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            int i2 = 0;
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    resourceName.getClass();
                    String[] strArr = (String[]) new Regex("/").d(resourceName).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                String str = (String) obj;
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            mt.a(u41.class, th);
            return null;
        }
    }

    public static final boolean n(ArrayList arrayList, ArrayList arrayList2) {
        if (!mt.a.contains(u41.class)) {
            try {
                arrayList.getClass();
                arrayList2.getClass();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str = (String) obj;
                    u41 u41Var = b;
                    if (!mt.a.contains(u41Var)) {
                        try {
                            int size2 = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj2 = arrayList2.get(i3);
                                i3++;
                                if (StringsKt.t(str, (String) obj2)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            mt.a(u41Var, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                mt.a(u41.class, th2);
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.pj
    public byte[] b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.nq
    public Object d(co coVar) {
        Object objG = coVar.g(new je1(qe.class, Executor.class));
        objG.getClass();
        return new h80((Executor) objG);
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) throws GeneralSecurityException {
        ip3 ip3Var;
        r03 r03Var = (r03) zi0Var;
        yo3 yo3VarW = ap3.w();
        ep3 ep3VarB = t03.b(r03Var.f);
        yo3VarW.f();
        ap3.v((ap3) yo3VarW.b, ep3VarB);
        nr2 nr2VarB = ((ap3) yo3VarW.d()).b();
        dz2 dz2Var = r03Var.f.a;
        if (dz2.f == dz2Var) {
            ip3Var = ip3.TINK;
        } else {
            if (dz2.i != dz2Var) {
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(dz2Var)));
            }
            ip3Var = ip3.RAW;
        }
        return wf3.d("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", nr2VarB, 5, ip3Var, r03Var.h);
    }

    public void h(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    @Override // defpackage.f60
    public void i(i60 i60Var) {
        boolean z;
        String str = i60Var.a;
        StringBuilder sb = i60Var.c;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            z = true;
            if (!i60Var.b()) {
                break;
            }
            char cA = i60Var.a();
            if (cA >= ' ' && cA <= '?') {
                sb2.append(cA);
            } else {
                if (cA < '@' || cA > '^') {
                    ga.m(cA);
                    throw null;
                }
                sb2.append((char) (cA - '@'));
            }
            i60Var.d++;
            if (sb2.length() >= 4) {
                sb.append(e(sb2));
                sb2.delete(0, 4);
                if (ga.u(str, i60Var.d, 4) != 4) {
                    i60Var.e = 0;
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length = sb2.length();
            if (length == 0) {
                i60Var.e = 0;
                return;
            }
            if (length == 1) {
                i60Var.c(sb.length());
                int length2 = i60Var.f.b - sb.length();
                int length3 = (str.length() - i60Var.g) - i60Var.d;
                if (length3 > length2) {
                    i60Var.c(sb.length() + 1);
                    length2 = i60Var.f.b - sb.length();
                }
                if (length3 <= length2 && length2 <= 2) {
                    i60Var.e = 0;
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i2 = length - 1;
            String strE = e(sb2);
            if (i60Var.b() || i2 > 2) {
                z = false;
            }
            if (i2 <= 2) {
                i60Var.c(sb.length() + i2);
                if (i60Var.f.b - sb.length() >= 3) {
                    i60Var.c(sb.length() + strE.length());
                    z = false;
                }
            }
            if (z) {
                i60Var.f = null;
                i60Var.d -= i2;
            } else {
                sb.append(strE);
            }
            i60Var.e = 0;
        } catch (Throwable th) {
            i60Var.e = 0;
            throw th;
        }
    }

    @Override // defpackage.gd1
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        switch (this.a) {
            case 19:
                xn3 xn3Var = (xn3) vf3Var.c;
                if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    e.g(ts.j("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", xn3Var.B()));
                    return null;
                }
                try {
                    mj3 mj3VarU = mj3.u(xn3Var.A(), wr2.b);
                    ud2 ud2VarB = fz2.b();
                    ud2VarB.w(mj3VarU.t());
                    ud2VarB.o(mj3VarU.y().t());
                    ud2VarB.A();
                    ud2VarB.d = t23.a(xn3Var.z());
                    return ud2VarB.n();
                } catch (ks2 e2) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
                }
            default:
                xn3 xn3Var2 = (xn3) vf3Var.c;
                if (!xn3Var2.B().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    e.g(ts.j("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", xn3Var2.B()));
                    return null;
                }
                try {
                    rp3 rp3VarU = rp3.u(xn3Var2.A(), wr2.b);
                    if (rp3VarU.t() == 0) {
                        return s13.b(h63.a(xn3Var2.z()), rp3VarU.x().t());
                    }
                    tv2.f("Only version 0 parameters are accepted");
                    return null;
                } catch (ks2 e3) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e3);
                }
        }
    }

    @Override // defpackage.gd1
    public void l(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = BuildConfig.FLAVOR;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public ArrayList m(View view) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                ArrayList arrayListB = g62.b(view);
                int size = arrayListB.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListB.get(i2);
                    i2++;
                    arrayList.addAll(m((View) obj));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 12:
                List list = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_conversions_per_day", 10000L, 68).get()).longValue());
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, 49).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.retry_time", 1800000L, 77).get();
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_event_parameter_value_length", 500L, 19).get()).longValue());
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.rb.attribution.max_retry_delay_seconds", 16L, 54).get()).longValue());
            default:
                List list6 = h13.a;
                return Integer.valueOf((int) ((Long) ap2.a.get()).longValue());
        }
    }

    @Override // defpackage.ln2
    public boolean zzb(Class cls) {
        switch (this.a) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return dm2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // defpackage.ln2
    public wn2 zzc(Class cls) {
        if (!dm2.class.isAssignableFrom(cls)) {
            e.g("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (wn2) dm2.n(cls.asSubclass(dm2.class)).s(3);
        } catch (Exception e2) {
            sm0.m("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.rs2
    public bt2 zza(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
