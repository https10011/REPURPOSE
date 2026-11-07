package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.google.android.gms.common.Feature;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class aj0 {
    public static final String[] a = {"standard", "accelerate", "decelerate", "linear"};
    public static final int[] b = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int[] c = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", -1, 9L, true);
        Feature feature2 = new Feature("auth_api_credentials_sign_out", -1, 2L, true);
        d = feature2;
        e = new Feature[]{feature, feature2, new Feature("auth_api_credentials_authorize", -1, 1L, true), new Feature("auth_api_credentials_revoke_access", -1, 1L, true), new Feature("auth_api_credentials_clear_token", -1, 1L, true), new Feature("auth_api_credentials_save_password", -1, 4L, true), new Feature("auth_api_credentials_get_sign_in_intent", -1, 6L, true), new Feature("auth_api_credentials_save_account_linking_token", -1, 3L, true), new Feature("auth_api_credentials_get_phone_number_hint_intent", -1, 3L, true), new Feature("auth_api_credentials_verify_with_google", -1, 1L, true), new Feature("auth_api_credentials_credential_provider", -1, 1L, true), new Feature("auth_api_credentials_save_webauthn_credential_specifics", -1, 1L, true), new Feature("auth_api_credentials_delete_webauthn_credential_specifics", -1, 1L, false), new Feature("auth_api_credentials_list_webauthn_credential_specifics", -1, 1L, true), new Feature("auth_api_credentials_get_google_passkey_for_export", -1, 2L, true), new Feature("auth_api_credentials_get_authentication_intent", -1, 1L, true), new Feature("auth_api_credentials_get_registration_intent", -1, 1L, true), new Feature("auth_api_credentials_check_key_availability", -1, 1L, true), new Feature("auth_api_credentials_has_discoverable_key", -1, 1L, true), new Feature("auth_api_credentials_validate_calling_browser", -1, 1L, true), new Feature("auth_api_credentials_validate_rp_id_and_calling_package", -1, 1L, true), new Feature("auth_api_credentials_get_credential_list_for_browser", -1, 1L, true), new Feature("auth_api_credentials_update_webauthn_credential_specifics", -1, 1L, true)};
    }

    public static ca1 A(rj... rjVarArr) {
        int i;
        if (rjVarArr.length == 0) {
            return new ca1(new rj[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new db(rjVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(-1);
        }
        int length = rjVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            rj rjVar = rjVarArr[i3];
            int i5 = i4 + 1;
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            if (size2 < 0) {
                e.g(ts.g(size2, "fromIndex (0) is greater than toIndex (", ")."));
                return null;
            }
            if (size2 > size3) {
                sm0.i("toIndex (", size2, ") is greater than size (", size3);
                return null;
            }
            int i6 = size2 - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                int iA = ap.a((Comparable) arrayList.get(i), rjVar);
                if (iA >= 0) {
                    if (iA <= 0) {
                        break;
                    }
                    i6 = i - 1;
                } else {
                    i7 = i + 1;
                }
            }
            arrayList2.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((rj) arrayList.get(0)).d() <= 0) {
            e.g("the empty byte string is not a supported option");
            return null;
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            rj rjVar2 = (rj) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                rj rjVar3 = (rj) arrayList.get(i10);
                rjVar3.getClass();
                rjVar2.getClass();
                if (!rjVar3.l(0, rjVar2, rjVar2.d())) {
                    break;
                }
                if (rjVar3.d() == rjVar2.d()) {
                    throw new IllegalArgumentException(("duplicate option: " + rjVar3).toString());
                }
                if (((Number) arrayList2.get(i10)).intValue() > ((Number) arrayList2.get(i8)).intValue()) {
                    arrayList.remove(i10);
                    ((Number) arrayList2.remove(i10)).intValue();
                } else {
                    i10++;
                }
            }
            i8 = i9;
        }
        ji jiVar = new ji();
        d(0L, jiVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i11 = (int) (jiVar.b / 4);
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = jiVar.readInt();
        }
        return new ca1((rj[]) Arrays.copyOf(rjVarArr, rjVarArr.length), iArr);
    }

    public static void B() {
        yd2 yd2Var;
        ac2 ac2Var;
        jv.d.lock();
        if (jv.c == null && (yd2Var = jv.b) != null) {
            xm0 xm0Var = (xm0) yd2Var.b;
            mv mvVar = new mv();
            mvVar.attachInterface(mvVar, "android.support.customtabs.ICustomTabsCallback");
            new Handler(Looper.getMainLooper());
            try {
                ac2Var = !((vm0) xm0Var).d(mvVar) ? null : new ac2(xm0Var, mvVar, (ComponentName) yd2Var.c, 15);
            } catch (RemoteException unused) {
            }
            jv.c = ac2Var;
        }
        jv.d.unlock();
    }

    public static boolean C(Parcel parcel, int i) {
        X(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean D(Parcel parcel, int i) {
        int iK = K(parcel, i);
        if (iK == 0) {
            return null;
        }
        Z(parcel, iK, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double E(Parcel parcel, int i) {
        int iK = K(parcel, i);
        if (iK == 0) {
            return null;
        }
        Z(parcel, iK, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static IBinder F(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iK);
        return strongBinder;
    }

    public static int G(Parcel parcel, int i) {
        X(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer H(Parcel parcel, int i) {
        int iK = K(parcel, i);
        if (iK == 0) {
            return null;
        }
        Z(parcel, iK, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long I(Parcel parcel, int i) {
        X(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long J(Parcel parcel, int i) {
        int iK = K(parcel, i);
        if (iK == 0) {
            return null;
        }
        Z(parcel, iK, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int K(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void L(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = (((long) iArr[0]) & 4294967295L) + j13 + j6 + j7 + j8;
        iArr2[0] = (int) j14;
        long j15 = (((((long) iArr[1]) & 4294967295L) + j13) - j) + j7 + j8 + (j14 >> 32);
        iArr2[1] = (int) j15;
        long j16 = ((((long) iArr[2]) & 4294967295L) - j12) + (j15 >> 32);
        iArr2[2] = (int) j16;
        long j17 = ((((((long) iArr[3]) & 4294967295L) + j13) - j2) - j3) + j6 + (j16 >> 32);
        iArr2[3] = (int) j17;
        long j18 = ((((((long) iArr[4]) & 4294967295L) + j13) - j9) - j) + j7 + (j17 >> 32);
        iArr2[4] = (int) j18;
        long j19 = (((long) iArr[5]) & 4294967295L) + j11 + j3 + (j18 >> 32);
        iArr2[5] = (int) j19;
        long j20 = (((long) iArr[6]) & 4294967295L) + j4 + j7 + j8 + (j19 >> 32);
        iArr2[6] = (int) j20;
        long j21 = (((long) iArr[7]) & 4294967295L) + j13 + j11 + j5 + (j20 >> 32);
        iArr2[7] = (int) j21;
        M(iArr2, (int) (j21 >> 32));
    }

    public static void M(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = ((((long) iArr[2]) & 4294967295L) - j2) + j4;
            iArr[2] = (int) j6;
            long j7 = (((long) iArr[3]) & 4294967295L) + j2 + (j6 >> 32);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = (4294967295L & ((long) iArr[7])) + j2 + j8;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && r93.x(iArr, b))) {
            c(iArr);
        }
    }

    public static void N(AccessToken accessToken) {
        co.v.n().I(accessToken, true);
    }

    public static void O(TextView textView, String str) {
        CharSequence text = textView.getText();
        if (str != text) {
            if (str == null && text.length() == 0) {
                return;
            }
            if (!(str instanceof Spanned)) {
                if ((str == null) == (text == null)) {
                    if (str == null) {
                        return;
                    }
                    int length = str.length();
                    if (length == text.length()) {
                        for (int i = 0; i < length; i++) {
                            if (str.charAt(i) == text.charAt(i)) {
                            }
                        }
                        return;
                    }
                }
            } else if (str.equals(text)) {
                return;
            }
            textView.setText(str);
        }
    }

    public static void P(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + K(parcel, i));
    }

    public static void Q(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        r93.Y(iArr, iArr3);
        L(iArr3, iArr2);
    }

    public static void R(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        r93.Y(iArr, iArr3);
        L(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            r93.Y(iArr2, iArr3);
            L(iArr3, iArr2);
        }
    }

    public static void S(int[] iArr, int[] iArr2, int[] iArr3) {
        if (r93.b0(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = (((long) iArr3[2]) & 4294967295L) + 1 + j2;
            iArr3[2] = (int) j4;
            long j5 = ((((long) iArr3[3]) & 4294967295L) - 1) + (j4 >> 32);
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j8;
                long j9 = (j8 >> 32) + (((long) iArr3[6]) & 4294967295L);
                iArr3[6] = (int) j9;
                j6 = j9 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & ((long) iArr3[7])) - 1) + j6);
        }
    }

    public static int T(Parcel parcel) {
        int i = parcel.readInt();
        int iK = K(parcel, i);
        char c2 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new ml1("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iK + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new ml1(sb.toString(), parcel);
    }

    public static File U(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        uq1.q("getFilesDir returned null twice.");
        return null;
    }

    public static String V(String str) throws sk2 {
        if (str.isEmpty()) {
            return null;
        }
        try {
            vy2 vy2Var = new vy2();
            vy2Var.zza(str);
            if (TextUtils.isEmpty(vy2Var.b)) {
                throw new sk2("No error message: ".concat(str));
            }
            return vy2Var.b;
        } catch (Exception e2) {
            throw new sk2(ts.j("Json conversion failed! ", e2.getMessage()), e2);
        }
    }

    public static an2 W(String str, an2 an2Var) throws sk2 {
        try {
            return an2Var.zza(str);
        } catch (Exception e2) {
            throw new sk2(ts.j("Json conversion failed! ", e2.getMessage()), e2);
        }
    }

    public static void X(Parcel parcel, int i, int i2) {
        int iK = K(parcel, i);
        if (iK == i2) {
            return;
        }
        String hexString = Integer.toHexString(iK);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iK).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iK);
        throw new ml1(y00.l(sb, " (0x", hexString, ")"), parcel);
    }

    public static void Y(Object obj, Object obj2) {
        if (obj == null) {
            uq1.h("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            uq1.h(ts.k("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static void Z(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new ml1(y00.l(sb, " (0x", hexString, ")"), parcel);
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append("/");
        return ts.l(sb, Environment.DIRECTORY_DOCUMENTS, "/.sys_id.dat");
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (r93.c(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && r93.x(iArr3, b))) {
            c(iArr3);
        }
    }

    public static void c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = ((((long) iArr[2]) & 4294967295L) - 1) + j2;
        iArr[2] = (int) j4;
        long j5 = (((long) iArr[3]) & 4294967295L) + 1 + (j4 >> 32);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + j6);
    }

    public static void d(long j, ji jiVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            e.g("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((rj) arrayList4.get(i8)).d() < i7) {
                e.g("Failed requirement.");
                return;
            }
        }
        rj rjVar = (rj) arrayList.get(i2);
        rj rjVar2 = (rj) arrayList4.get(i3 - 1);
        if (i7 == rjVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            rj rjVar3 = (rj) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            rjVar = rjVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (rjVar.i(i7) == rjVar2.i(i7)) {
            int iMin = Math.min(rjVar.d(), rjVar2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && rjVar.i(i11) == rjVar2.i(i11); i11++) {
                i10++;
            }
            long j3 = (jiVar.b / 4) + j + 2 + ((long) i10) + 1;
            jiVar.V(-i10);
            jiVar.V(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                jiVar.V(rjVar.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((rj) arrayList4.get(i4)).d()) {
                    jiVar.V(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    uq1.q("Check failed.");
                    return;
                }
            }
            ji jiVar2 = new ji();
            jiVar.V(((int) ((jiVar2.b / 4) + j3)) * (-1));
            d(j3, jiVar2, i12, arrayList4, i4, i3, arrayList5);
            jiVar.R(jiVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((rj) arrayList4.get(i14 - 1)).i(i7) != ((rj) arrayList4.get(i14)).i(i7)) {
                i13++;
            }
        }
        long j4 = (jiVar.b / 4) + j + 2 + ((long) (i13 * 2));
        jiVar.V(i13);
        jiVar.V(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int i16 = ((rj) arrayList4.get(i15)).i(i7);
            if (i15 == i4 || i16 != ((rj) arrayList4.get(i15 - 1)).i(i7)) {
                jiVar.V(i16 & 255);
            }
        }
        ji jiVar3 = new ji();
        int i17 = i4;
        while (i17 < i3) {
            byte bI = ((rj) arrayList4.get(i17)).i(i7);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i19 = i3;
                    break;
                } else if (bI != ((rj) arrayList4.get(i19)).i(i7)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i7 + 1 == ((rj) arrayList4.get(i17)).d()) {
                jiVar.V(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
            } else {
                jiVar.V(((int) ((jiVar3.b / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
                d(j2, jiVar3, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        jiVar.R(jiVar3);
    }

    public static BigDecimal e(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iK);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static Bundle f(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iK);
        return bundle;
    }

    public static byte[] g(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iK);
        return bArrCreateByteArray;
    }

    public static byte[][] h(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iK);
        return bArr;
    }

    public static AccessToken i(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") > 1) {
            throw new d90("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        String string2 = jSONObject.getString("source");
        string2.getClass();
        g2 g2VarValueOf = g2.valueOf(string2);
        String string3 = jSONObject.getString("application_id");
        String string4 = jSONObject.getString("user_id");
        Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
        String strOptString = jSONObject.optString("graph_domain", null);
        string.getClass();
        string3.getClass();
        string4.getClass();
        jSONArray.getClass();
        ArrayList arrayListZ = h42.z(jSONArray);
        jSONArray2.getClass();
        return new AccessToken(string, string3, string4, arrayListZ, h42.z(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : h42.z(jSONArrayOptJSONArray), g2VarValueOf, date, date2, date3, strOptString);
    }

    public static int[] j(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iK);
        return iArrCreateIntArray;
    }

    public static Parcelable k(Parcel parcel, int i, Parcelable.Creator creator) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iK);
        return parcelable;
    }

    public static void l(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Unable to create parent directories of ");
        sb.append(strValueOf);
        throw new IOException(sb.toString());
    }

    public static String m(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iK);
        return string;
    }

    public static String[] n(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iK);
        return strArrCreateStringArray;
    }

    public static ArrayList o(Parcel parcel, int i) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iK);
        return arrayListCreateStringArrayList;
    }

    public static Object[] p(Parcel parcel, int i, Parcelable.Creator creator) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iK);
        return objArrCreateTypedArray;
    }

    public static ArrayList q(Parcel parcel, int i, Parcelable.Creator creator) {
        int iK = K(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iK);
        return arrayListCreateTypedArrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r4 < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(int r4, int r5) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r0.getClass()
            if (r5 == 0) goto L4c
            int r1 = r4 / r5
            int r2 = r5 * r1
            int r2 = r4 - r2
            if (r2 != 0) goto L10
            goto L43
        L10:
            r4 = r4 ^ r5
            int r4 = r4 >> 31
            r4 = r4 | 1
            int[] r3 = defpackage.xq0.a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L26:
            int r0 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 - r0
            int r0 = r0 - r5
            if (r0 != 0) goto L37
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
            goto L43
        L37:
            if (r0 <= 0) goto L43
            goto L3f
        L3a:
            if (r4 <= 0) goto L43
            goto L3f
        L3d:
            if (r4 >= 0) goto L43
        L3f:
            int r1 = r1 + r4
            return r1
        L41:
            if (r2 != 0) goto L44
        L43:
            return r1
        L44:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r5)
            throw r4
        L4c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "/ by zero"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj0.r(int, int):int");
    }

    public static void s(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ml1(ck1.s(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static AccessToken t() {
        return (AccessToken) co.v.n().c;
    }

    public static final pk u(fs fsVar) {
        if (!(fsVar instanceof f20)) {
            return new pk(1, fsVar);
        }
        pk pkVarL = ((f20) fsVar).l();
        if (pkVarL != null) {
            if (!pkVarL.C()) {
                pkVarL = null;
            }
            if (pkVarL != null) {
                return pkVarL;
            }
        }
        return new pk(2, fsVar);
    }

    public static boolean v() {
        AccessToken accessToken = (AccessToken) co.v.n().c;
        return (accessToken == null || new Date().after(accessToken.a)) ? false : true;
    }

    public static boolean w(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static int x(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("x (");
            sb.append(i);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }
        switch (xq0.a[roundingMode.ordinal()]) {
            case 1:
                if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static void y(Uri uri) {
        uri.getClass();
        B();
        jv.d.lock();
        ac2 ac2Var = jv.c;
        if (ac2Var != null) {
            Bundle bundle = new Bundle();
            try {
                ((vm0) ((xm0) ac2Var.b)).a((mv) ac2Var.c, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        jv.d.unlock();
    }

    public static void z(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        r93.L(iArr, iArr2, iArr4);
        L(iArr4, iArr3);
    }
}
