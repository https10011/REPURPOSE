package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import com.appsflyer.internal.d;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class xi0 implements h60 {
    public static final ah a = new ah();
    public static final qt0 b = new qt0(2);
    public static final byte[] c = new byte[0];
    public static boolean d = false;
    public static boolean e = true;
    public static Field f;
    public static boolean g;

    public static void A(int i, qr qrVar, hr hrVar, qr qrVar2) {
        float f2 = qrVar2.d0;
        cr crVar = qrVar2.I;
        int iE = crVar.e() + crVar.f.d();
        cr crVar2 = qrVar2.K;
        int iD = crVar2.f.d() - crVar2.e();
        if (iD >= iE) {
            int iK = qrVar2.k();
            if (qrVar2.f0 != 8) {
                int i2 = qrVar2.r;
                if (i2 == 2) {
                    iK = (int) (f2 * 0.5f * (qrVar instanceof rr ? qrVar.k() : qrVar.S.k()));
                } else if (i2 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(qrVar2.w, iK);
                int i3 = qrVar2.x;
                if (i3 > 0) {
                    iK = Math.min(i3, iK);
                }
            }
            int i4 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            qrVar2.F(i4, iK + i4);
            B(i + 1, hrVar, qrVar2);
        }
    }

    public static void B(int i, hr hrVar, qr qrVar) {
        cr crVar;
        cr crVar2;
        float f2;
        cr crVar3;
        cr crVar4;
        cr crVar5;
        if (qrVar.m) {
            return;
        }
        if (!(qrVar instanceof rr) && qrVar.w() && b(qrVar)) {
            rr.Q(qrVar, hrVar, new ah());
        }
        cr crVarI = qrVar.i(3);
        cr crVarI2 = qrVar.i(5);
        int iD = crVarI.d();
        int iD2 = crVarI2.d();
        HashSet<cr> hashSet = crVarI.a;
        if (hashSet != null && crVarI.c) {
            for (cr crVar6 : hashSet) {
                qr qrVar2 = crVar6.d;
                int i2 = i + 1;
                boolean zB = b(qrVar2);
                cr crVar7 = qrVar2.I;
                cr crVar8 = qrVar2.K;
                if (qrVar2.w() && zB) {
                    f2 = 0.0f;
                    rr.Q(qrVar2, hrVar, new ah());
                } else {
                    f2 = 0.0f;
                }
                int i3 = qrVar2.o0[1];
                if (i3 != 3 || zB) {
                    if (!qrVar2.w()) {
                        if (crVar6 == crVar7 && crVar8.f == null) {
                            int iE = crVar7.e() + iD;
                            qrVar2.F(iE, qrVar2.k() + iE);
                            B(i2, hrVar, qrVar2);
                        } else if (crVar6 == crVar8 && crVar8.f == null) {
                            int iE2 = iD - crVar8.e();
                            qrVar2.F(iE2 - qrVar2.k(), iE2);
                            B(i2, hrVar, qrVar2);
                        } else if (crVar6 == crVar7 && (crVar3 = crVar8.f) != null && crVar3.c) {
                            z(i2, hrVar, qrVar2);
                        }
                    }
                } else if (i3 == 3 && qrVar2.x >= 0 && qrVar2.w >= 0 && (qrVar2.f0 == 8 || (qrVar2.r == 0 && qrVar2.V == f2))) {
                    if (!qrVar2.v() && !qrVar2.E && ((crVar6 == crVar7 && (crVar5 = crVar8.f) != null && crVar5.c) || (crVar6 == crVar8 && (crVar4 = crVar7.f) != null && crVar4.c))) {
                        if (!qrVar2.v()) {
                            A(i2, qrVar, hrVar, qrVar2);
                        }
                    }
                }
            }
        }
        if (qrVar instanceof cl0) {
            return;
        }
        HashSet<cr> hashSet2 = crVarI2.a;
        if (hashSet2 != null && crVarI2.c) {
            for (cr crVar9 : hashSet2) {
                qr qrVar3 = crVar9.d;
                int i4 = i + 1;
                boolean zB2 = b(qrVar3);
                cr crVar10 = qrVar3.I;
                cr crVar11 = qrVar3.K;
                if (qrVar3.w() && zB2) {
                    rr.Q(qrVar3, hrVar, new ah());
                }
                boolean z = (crVar9 == crVar10 && (crVar2 = crVar11.f) != null && crVar2.c) || (crVar9 == crVar11 && (crVar = crVar10.f) != null && crVar.c);
                int i5 = qrVar3.o0[1];
                if (i5 != 3 || zB2) {
                    if (!qrVar3.w()) {
                        if (crVar9 == crVar10 && crVar11.f == null) {
                            int iE3 = crVar10.e() + iD2;
                            qrVar3.F(iE3, qrVar3.k() + iE3);
                            B(i4, hrVar, qrVar3);
                        } else if (crVar9 == crVar11 && crVar10.f == null) {
                            int iE4 = iD2 - crVar11.e();
                            qrVar3.F(iE4 - qrVar3.k(), iE4);
                            B(i4, hrVar, qrVar3);
                        } else if (z && !qrVar3.v()) {
                            z(i4, hrVar, qrVar3);
                        }
                    }
                } else if (i5 == 3 && qrVar3.x >= 0 && qrVar3.w >= 0 && (qrVar3.f0 == 8 || (qrVar3.r == 0 && qrVar3.V == 0.0f))) {
                    if (!qrVar3.v() && !qrVar3.E && z && !qrVar3.v()) {
                        A(i4, qrVar, hrVar, qrVar3);
                    }
                }
            }
        }
        cr crVarI3 = qrVar.i(6);
        if (crVarI3.a != null && crVarI3.c) {
            int iD3 = crVarI3.d();
            for (cr crVar12 : crVarI3.a) {
                qr qrVar4 = crVar12.d;
                int i6 = i + 1;
                boolean zB3 = b(qrVar4);
                cr crVar13 = qrVar4.L;
                if (qrVar4.w() && zB3) {
                    rr.Q(qrVar4, hrVar, new ah());
                }
                if (qrVar4.o0[1] != 3 || zB3) {
                    if (!qrVar4.w() && crVar12 == crVar13) {
                        int iE5 = crVar12.e() + iD3;
                        if (qrVar4.D) {
                            int i7 = iE5 - qrVar4.Z;
                            int i8 = qrVar4.U + i7;
                            qrVar4.Y = i7;
                            qrVar4.I.l(i7);
                            qrVar4.K.l(i8);
                            crVar13.l(iE5);
                            qrVar4.k = true;
                        }
                        B(i6, hrVar, qrVar4);
                    }
                }
            }
        }
        qrVar.m = true;
    }

    public static String C(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e2);
            return d.a("<", str, " threw ", e2.getClass().getName(), ">");
        }
    }

    public static String D(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(C(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(C(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static BigInteger E(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] F(int i, BigInteger bigInteger) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            e.g("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            tv2.f("integer too large");
            return null;
        }
        if (byteArray.length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        tv2.f("integer too large");
        return null;
    }

    public static byte[] G(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        e.g("n must not be negative");
        return null;
    }

    public static String H(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strA;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strA = "null";
            } else {
                try {
                    strA = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    strA = d.a("<", str2, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i2] = strA;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean b(qr qrVar) {
        int[] iArr = qrVar.o0;
        int i = iArr[0];
        int i2 = iArr[1];
        qr qrVar2 = qrVar.S;
        rr rrVar = qrVar2 != null ? (rr) qrVar2 : null;
        if (rrVar != null) {
            int i3 = rrVar.o0[0];
        }
        if (rrVar != null) {
            int i4 = rrVar.o0[1];
        }
        boolean z = i == 1 || qrVar.x() || i == 2 || (i == 3 && qrVar.q == 0 && qrVar.V == 0.0f && qrVar.q(0)) || (i == 3 && qrVar.q == 1 && qrVar.r(0, qrVar.n()));
        boolean z2 = i2 == 1 || qrVar.y() || i2 == 2 || (i2 == 3 && qrVar.r == 0 && qrVar.V == 0.0f && qrVar.q(1)) || (i == 3 && qrVar.r == 1 && qrVar.r(1, qrVar.k()));
        return (qrVar.V > 0.0f && (z || z2)) || (z && z2);
    }

    public static ot f(String str, String str2) {
        Exception excB;
        str.getClass();
        try {
            yt ytVar = new yt(new t(26), null);
            if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excB = gu2.b(new t(0), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excB = gu2.b(new t(1), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excB = gu2.b(new t(2), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excB = gu2.b(new t(3), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excB = gu2.b(new t(4), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excB = gu2.b(new t(5), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excB = gu2.b(new t(6), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excB = gu2.b(new t(7), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excB = gu2.b(new t(8), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excB = gu2.b(new t(9), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excB = gu2.b(new t(10), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excB = gu2.b(new t(11), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excB = gu2.b(new t(12), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excB = gu2.b(new t(13), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excB = gu2.b(new t(14), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excB = gu2.b(new t(15), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excB = gu2.b(new t(16), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excB = gu2.b(new t(17), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excB = gu2.b(new t(18), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excB = gu2.b(new t(19), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excB = gu2.b(new t(20), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excB = gu2.b(new t(21), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excB = gu2.b(new t(22), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excB = gu2.b(new t(23), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excB = gu2.b(new t(24), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excB = gu2.b(new t(25), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excB = gu2.b(new t(26), str2, ytVar);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excB = gu2.b(new t(27), str2, ytVar);
            } else {
                if (!Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new tg0();
                }
                excB = gu2.b(new t(28), str2, ytVar);
            }
            return (ot) excB;
        } catch (tg0 unused) {
            return new nt(str2, str);
        }
    }

    public static final void g(Throwable th) {
        HashMap map;
        da0 da0Var;
        if (!d || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            synchronized (fa0.a) {
                map = fa0.b;
                if (map.isEmpty()) {
                    map.put(da0.AAM, new String[]{"com.facebook.appevents.aam."});
                    map.put(da0.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                    map.put(da0.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                    map.put(da0.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                    map.put(da0.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                    map.put(da0.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                    map.put(da0.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                    map.put(da0.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                    map.put(da0.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                    map.put(da0.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                    map.put(da0.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                    map.put(da0.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                    map.put(da0.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                    map.put(da0.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                    map.put(da0.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                    map.put(da0.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                    map.put(da0.IapLogging, new String[]{"com.facebook.appevents.iap."});
                    map.put(da0.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    map.put(da0.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                    map.put(da0.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                    map.put(da0.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                }
            }
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    da0Var = da0.Unknown;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                da0Var = (da0) entry.getKey();
                for (String str : (String[]) entry.getValue()) {
                    if (kotlin.text.d.j(className, str, false)) {
                        break;
                    }
                }
            }
            if (da0Var != da0.Unknown) {
                da0Var.getClass();
                i90.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + da0Var, "18.2.3").apply();
                hashSet.add(da0Var.toString());
            }
        }
        i90 i90Var = i90.a;
        if (!x32.c() || hashSet.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray((Collection) hashSet);
        uq0 uq0Var = new uq0();
        uq0Var.b = sq0.b;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        uq0Var.g = lValueOf;
        uq0Var.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        uq0Var.a = string;
        uq0Var.b();
    }

    public static ColorStateList j(Context context, p11 p11Var, int i) {
        int resourceId;
        ColorStateList colorStateListK;
        TypedArray typedArray = (TypedArray) p11Var.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListK = sp0.k(context, resourceId)) == null) ? p11Var.e(i) : colorStateListK;
    }

    public static ColorStateList k(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListK;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListK = sp0.k(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListK;
    }

    public static Drawable l(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableU;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableU = gu2.u(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableU;
    }

    public static Object m(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return t2.a(bundle);
        }
        Parcelable parcelable = bundle.getParcelable("RESULT_DATA");
        if (Intent.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static void o(int i, hr hrVar, qr qrVar, boolean z) {
        cr crVar;
        cr crVar2;
        char c2;
        cr crVar3;
        cr crVar4;
        cr crVar5;
        if (qrVar.l) {
            return;
        }
        if (!(qrVar instanceof rr) && qrVar.w() && b(qrVar)) {
            rr.Q(qrVar, hrVar, new ah());
        }
        cr crVarI = qrVar.i(2);
        cr crVarI2 = qrVar.i(4);
        int iD = crVarI.d();
        int iD2 = crVarI2.d();
        HashSet<cr> hashSet = crVarI.a;
        if (hashSet != null && crVarI.c) {
            for (cr crVar6 : hashSet) {
                qr qrVar2 = crVar6.d;
                int i2 = i + 1;
                boolean zB = b(qrVar2);
                cr crVar7 = qrVar2.H;
                cr crVar8 = qrVar2.J;
                if (qrVar2.w() && zB) {
                    c2 = 0;
                    rr.Q(qrVar2, hrVar, new ah());
                } else {
                    c2 = 0;
                }
                int i3 = qrVar2.o0[c2];
                if (i3 != 3 || zB) {
                    if (!qrVar2.w()) {
                        if (crVar6 == crVar7 && crVar8.f == null) {
                            int iE = crVar7.e() + iD;
                            qrVar2.E(iE, qrVar2.n() + iE);
                            o(i2, hrVar, qrVar2, z);
                        } else if (crVar6 == crVar8 && crVar7.f == null) {
                            int iE2 = iD - crVar8.e();
                            qrVar2.E(iE2 - qrVar2.n(), iE2);
                            o(i2, hrVar, qrVar2, z);
                        } else if (crVar6 == crVar7 && (crVar3 = crVar8.f) != null && crVar3.c && !qrVar2.u()) {
                            x(i2, hrVar, qrVar2, z);
                        }
                    }
                } else if (i3 == 3 && qrVar2.u >= 0 && qrVar2.t >= 0 && (qrVar2.f0 == 8 || (qrVar2.q == 0 && qrVar2.V == 0.0f))) {
                    if (!qrVar2.u() && !qrVar2.E && ((crVar6 == crVar7 && (crVar5 = crVar8.f) != null && crVar5.c) || (crVar6 == crVar8 && (crVar4 = crVar7.f) != null && crVar4.c))) {
                        if (!qrVar2.u()) {
                            y(i2, qrVar, hrVar, qrVar2, z);
                        }
                    }
                }
            }
        }
        if (qrVar instanceof cl0) {
            return;
        }
        HashSet<cr> hashSet2 = crVarI2.a;
        if (hashSet2 != null && crVarI2.c) {
            for (cr crVar9 : hashSet2) {
                qr qrVar3 = crVar9.d;
                int i4 = i + 1;
                boolean zB2 = b(qrVar3);
                cr crVar10 = qrVar3.H;
                cr crVar11 = qrVar3.J;
                if (qrVar3.w() && zB2) {
                    rr.Q(qrVar3, hrVar, new ah());
                }
                boolean z2 = (crVar9 == crVar10 && (crVar2 = crVar11.f) != null && crVar2.c) || (crVar9 == crVar11 && (crVar = crVar10.f) != null && crVar.c);
                int i5 = qrVar3.o0[0];
                if (i5 != 3 || zB2) {
                    if (!qrVar3.w()) {
                        if (crVar9 == crVar10 && crVar11.f == null) {
                            int iE3 = crVar10.e() + iD2;
                            qrVar3.E(iE3, qrVar3.n() + iE3);
                            o(i4, hrVar, qrVar3, z);
                        } else if (crVar9 == crVar11 && crVar10.f == null) {
                            int iE4 = iD2 - crVar11.e();
                            qrVar3.E(iE4 - qrVar3.n(), iE4);
                            o(i4, hrVar, qrVar3, z);
                        } else if (z2 && !qrVar3.u()) {
                            x(i4, hrVar, qrVar3, z);
                        }
                    }
                } else if (i5 == 3 && qrVar3.u >= 0 && qrVar3.t >= 0 && (qrVar3.f0 == 8 || (qrVar3.q == 0 && qrVar3.V == 0.0f))) {
                    if (!qrVar3.u() && !qrVar3.E && z2 && !qrVar3.u()) {
                        y(i4, qrVar, hrVar, qrVar3, z);
                    }
                }
            }
        }
        qrVar.l = true;
    }

    public static boolean p(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final Object t(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void x(int i, hr hrVar, qr qrVar, boolean z) {
        float f2 = qrVar.c0;
        cr crVar = qrVar.H;
        int iD = crVar.f.d();
        cr crVar2 = qrVar.J;
        int iD2 = crVar2.f.d();
        int iE = crVar.e() + iD;
        int iE2 = iD2 - crVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = qrVar.n();
        int i2 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i2 = (iD - iD2) - iN;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + iD;
        int i4 = i3 + iN;
        if (iD > iD2) {
            i4 = i3 - iN;
        }
        qrVar.E(i3, i4);
        o(i + 1, hrVar, qrVar, z);
    }

    public static void y(int i, qr qrVar, hr hrVar, qr qrVar2, boolean z) {
        float f2 = qrVar2.c0;
        cr crVar = qrVar2.H;
        int iE = crVar.e() + crVar.f.d();
        cr crVar2 = qrVar2.J;
        int iD = crVar2.f.d() - crVar2.e();
        if (iD >= iE) {
            int iN = qrVar2.n();
            if (qrVar2.f0 != 8) {
                int i2 = qrVar2.q;
                if (i2 == 2) {
                    iN = (int) (qrVar2.c0 * 0.5f * (qrVar instanceof rr ? qrVar.n() : qrVar.S.n()));
                } else if (i2 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(qrVar2.t, iN);
                int i3 = qrVar2.u;
                if (i3 > 0) {
                    iN = Math.min(i3, iN);
                }
            }
            int i4 = iE + ((int) ((f2 * ((iD - iE) - iN)) + 0.5f));
            qrVar2.E(i4, iN + i4);
            o(i + 1, hrVar, qrVar2, z);
        }
    }

    public static void z(int i, hr hrVar, qr qrVar) {
        float f2 = qrVar.d0;
        cr crVar = qrVar.I;
        int iD = crVar.f.d();
        cr crVar2 = qrVar.K;
        int iD2 = crVar2.f.d();
        int iE = crVar.e() + iD;
        int iE2 = iD2 - crVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = qrVar.k();
        int i2 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i2 = (iD - iD2) - iK;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = iD + i3;
        int i5 = i4 + iK;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iK;
        }
        qrVar.F(i4, i5);
        B(i + 1, hrVar, qrVar);
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new w20(this, i, 1));
    }

    public abstract boolean c(v0 v0Var, j0 j0Var, j0 j0Var2);

    public abstract boolean d(v0 v0Var, Object obj, Object obj2);

    public abstract boolean e(v0 v0Var, u0 u0Var, u0 u0Var2);

    public abstract j0 h(v0 v0Var);

    public abstract u0 i(v0 v0Var);

    public float n(View view) {
        if (e) {
            try {
                return g72.a(view);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void q(int i);

    public abstract void r(Typeface typeface);

    public abstract void s(Typeface typeface, boolean z);

    public abstract void u(u0 u0Var, u0 u0Var2);

    public abstract void v(u0 u0Var, Thread thread);

    public void w(View view, float f2) {
        if (e) {
            try {
                g72.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f2);
    }
}
