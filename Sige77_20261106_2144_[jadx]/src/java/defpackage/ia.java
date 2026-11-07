package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.firebase-auth-api.zzaih;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ia {
    public static boolean a;
    public static final vy2 b = new vy2("RESUME_TOKEN", 4);
    public static final fs0 c = new fs0();
    public static final rs d = new rs(6);
    public static final int[] e = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] f = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] i = {67108863, 33554431};
    public static final int[] v = {26, 25};

    public static void B(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        G(jArr4, jArr2, jArr3);
        E(jArr4);
        z(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static void E(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static void F(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * 2;
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long j5 = jArr2[3];
        long j6 = jArr2[4];
        long j7 = jArr2[5];
        long j8 = jArr2[6];
        long j9 = jArr2[7];
        long j10 = jArr2[8];
        long j11 = jArr2[9];
        long[] jArr3 = {j * j, j2 * j3, ((j * j4) + (j3 * j3)) * 2, ((j * j5) + (j3 * j4)) * 2, (j2 * j6) + (j3 * 4 * j5) + (j4 * j4), ((j * j7) + (j3 * j6) + (j4 * j5)) * 2, ((j3 * 2 * j7) + (j * j8) + (j4 * j6) + (j5 * j5)) * 2, ((j * j9) + (j3 * j8) + (j4 * j7) + (j5 * j6)) * 2, (((((j5 * j7) + (j3 * j9)) * 2) + (j * j10) + (j4 * j8)) * 2) + (j6 * j6), ((j * j11) + (j3 * j10) + (j4 * j9) + (j5 * j8) + (j6 * j7)) * 2, ((((j3 * j11) + (j5 * j9)) * 2) + (j4 * j10) + (j6 * j8) + (j7 * j7)) * 2, ((j4 * j11) + (j5 * j10) + (j6 * j9) + (j7 * j8)) * 2, (((((j5 * j11) + (j7 * j9)) * 2) + (j6 * j10)) * 2) + (j8 * j8), ((j6 * j11) + (j7 * j10) + (j8 * j9)) * 2, ((j7 * 2 * j11) + (j8 * j10) + (j9 * j9)) * 2, ((j8 * j11) + (j9 * j10)) * 2, (j9 * 4 * j11) + (j10 * j10), j10 * 2 * j11, 2 * j11 * j11};
        E(jArr3);
        z(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void G(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr3[1] * j;
        long j3 = jArr2[1];
        long j4 = jArr3[0];
        jArr[1] = (j3 * j4) + j2;
        long j5 = jArr2[1];
        long j6 = jArr3[1];
        jArr[2] = (jArr2[2] * j4) + (jArr3[2] * j) + (j5 * 2 * j6);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        jArr[3] = (jArr2[3] * j4) + (jArr3[3] * j) + (j8 * j6) + (j5 * j7);
        long j9 = jArr3[3];
        long j10 = jArr2[3];
        jArr[4] = (jArr2[4] * j4) + (jArr3[4] * j) + (((j10 * j6) + (j5 * j9)) * 2) + (j8 * j7);
        long j11 = jArr3[4];
        long j12 = (j5 * j11) + (j10 * j7) + (j8 * j9);
        long j13 = jArr2[4];
        jArr[5] = (jArr2[5] * j4) + (jArr3[5] * j) + (j13 * j6) + j12;
        long j14 = jArr3[5];
        long j15 = jArr2[5];
        jArr[6] = (jArr2[6] * j4) + (jArr3[6] * j) + (j13 * j7) + (j8 * j11) + (((j15 * j6) + (j5 * j14) + (j10 * j9)) * 2);
        long j16 = (j15 * j7) + (j8 * j14) + (j13 * j9) + (j10 * j11);
        long j17 = jArr3[6];
        long j18 = (j5 * j17) + j16;
        long j19 = jArr2[6];
        jArr[7] = (jArr2[7] * j4) + (jArr3[7] * j) + (j19 * j6) + j18;
        long j20 = jArr3[7];
        long j21 = (j5 * j20) + (j15 * j9) + (j10 * j14);
        long j22 = jArr2[7];
        long j23 = (((j22 * j6) + j21) * 2) + (j13 * j11);
        jArr[8] = (jArr2[8] * j4) + (jArr3[8] * j) + (j19 * j7) + (j8 * j17) + j23;
        long j24 = (j22 * j7) + (j8 * j20) + (j19 * j9) + (j10 * j17) + (j15 * j11) + (j13 * j14);
        long j25 = jArr3[8];
        long j26 = (j5 * j25) + j24;
        long j27 = jArr2[8];
        jArr[9] = (jArr2[9] * j4) + (j * jArr3[9]) + (j27 * j6) + j26;
        long j28 = (j22 * j9) + (j10 * j20) + (j15 * j14);
        long j29 = jArr3[9];
        long j30 = jArr2[9];
        long j31 = j13 * j17;
        jArr[10] = (j27 * j7) + (j8 * j25) + (j19 * j11) + j31 + (((j6 * j30) + (j5 * j29) + j28) * 2);
        long j32 = j8 * j29;
        long j33 = j7 * j30;
        jArr[11] = j33 + j32 + (j27 * j9) + (j10 * j25) + (j22 * j11) + (j13 * j20) + (j19 * j14) + (j15 * j17);
        long j34 = j10 * j29;
        long j35 = j9 * j30;
        long j36 = j27 * j11;
        jArr[12] = j36 + (j13 * j25) + ((j35 + j34 + (j22 * j14) + (j15 * j20)) * 2) + (j19 * j17);
        long j37 = j13 * j29;
        long j38 = j11 * j30;
        jArr[13] = j38 + j37 + (j27 * j14) + (j15 * j25) + (j22 * j17) + (j19 * j20);
        long j39 = j14 * j30;
        long j40 = j27 * j17;
        jArr[14] = j40 + (j19 * j25) + ((j39 + (j15 * j29) + (j22 * j20)) * 2);
        long j41 = j19 * j29;
        long j42 = j17 * j30;
        jArr[15] = j42 + j41 + (j27 * j20) + (j22 * j25);
        jArr[16] = (((j20 * j30) + (j22 * j29)) * 2) + (j27 * j25);
        jArr[17] = (j25 * j30) + (j27 * j29);
        jArr[18] = j30 * 2 * j29;
    }

    public static String H(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            String str2 = strArr[i2];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i2];
            }
        }
        return null;
    }

    public static void J(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static byte[] K(long[] jArr) {
        long j;
        int[] iArr;
        int i2;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = 19;
            iArr = v;
            if (i4 >= 2) {
                break;
            }
            int i5 = 0;
            while (i5 < 9) {
                long j2 = jArrCopyOf[i5];
                int i6 = iArr[i5 & 1];
                int i7 = -((int) (((j2 >> 31) & j2) >> i6));
                jArrCopyOf[i5] = j2 + ((long) (i7 << i6));
                i5++;
                jArrCopyOf[i5] = jArrCopyOf[i5] - ((long) i7);
            }
            long j3 = jArrCopyOf[9];
            int i8 = -((int) (((j3 >> 31) & j3) >> 25));
            jArrCopyOf[9] = j3 + ((long) (i8 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i8) * 19);
            i4++;
        }
        long j4 = jArrCopyOf[0];
        int i9 = -((int) (((j4 >> 31) & j4) >> 26));
        jArrCopyOf[0] = j4 + ((long) (i9 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i9);
        int i10 = 0;
        while (true) {
            iArr2 = i;
            if (i10 >= 2) {
                break;
            }
            int i11 = i3;
            while (i11 < 9) {
                long j5 = jArrCopyOf[i11];
                int i12 = i11 & 1;
                int i13 = i3;
                int i14 = i10;
                int i15 = (int) (j5 >> iArr[i12]);
                jArrCopyOf[i11] = j5 & ((long) iArr2[i12]);
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] + ((long) i15);
                i3 = i13;
                j = j;
                i10 = i14;
            }
            i10++;
        }
        int i16 = i3;
        long j6 = jArrCopyOf[9];
        jArrCopyOf[9] = j6 & 33554431;
        long j7 = (((long) ((int) (j6 >> 25))) * j) + jArrCopyOf[i16];
        jArrCopyOf[i16] = j7;
        int i17 = ~((((int) j7) - 67108845) >> 31);
        for (int i18 = 1; i18 < 10; i18++) {
            int i19 = ~(((int) jArrCopyOf[i18]) ^ iArr2[i18 & 1]);
            int i20 = i19 & (i19 << 16);
            int i21 = i20 & (i20 << 8);
            int i22 = i21 & (i21 << 4);
            int i23 = i22 & (i22 << 2);
            i17 &= (i23 & (i23 << 1)) >> 31;
        }
        jArrCopyOf[i16] = jArrCopyOf[i16] - ((long) (67108845 & i17));
        long j8 = 33554431 & i17;
        jArrCopyOf[1] = jArrCopyOf[1] - j8;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - ((long) (67108863 & i17));
            int i24 = i2 + 1;
            jArrCopyOf[i24] = jArrCopyOf[i24] - j8;
        }
        for (int i25 = i16; i25 < 10; i25++) {
            jArrCopyOf[i25] = jArrCopyOf[i25] << f[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = i16; i26 < 10; i26++) {
            int i27 = e[i26];
            long j9 = bArr[i27];
            long j10 = jArrCopyOf[i26];
            bArr[i27] = (byte) (j9 | (j10 & 255));
            int i28 = i27 + 1;
            bArr[i28] = (byte) (((long) bArr[i28]) | ((j10 >> 8) & 255));
            int i29 = i27 + 2;
            bArr[i29] = (byte) (((long) bArr[i29]) | ((j10 >> 16) & 255));
            int i30 = i27 + 3;
            bArr[i30] = (byte) (((long) bArr[i30]) | ((j10 >> 24) & 255));
        }
        return bArr;
    }

    public static void L(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType c(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 != 5) {
            return i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void e(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw y00.i(it);
        }
    }

    public static ArrayList f(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final et g(r91 r91Var) {
        Object obj;
        Object obj2;
        HashMap map = r91Var.a;
        if (map == null) {
            obj2 = null;
        } else {
            synchronized (map) {
                obj = r91Var.a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        et etVar = (et) obj2;
        if (etVar != null) {
            return etVar;
        }
        av1 av1Var = new av1();
        sz szVar = i20.a;
        return (et) r91Var.c(new ln(e.c(av1Var, e11.a.e)), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static final void h(Throwable th, CoroutineContext coroutineContext) {
        try {
            zs zsVar = (zs) coroutineContext.get(c11.f);
            if (zsVar != null) {
                ((q6) zsVar).e(th);
            } else {
                ga.l(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                a80.a(runtimeException, th);
                th = runtimeException;
            }
            ga.l(th, coroutineContext);
        }
    }

    public static cv1 j(cv1 cv1Var) {
        if ((cv1Var instanceof ev1) || (cv1Var instanceof dv1)) {
            return cv1Var;
        }
        if (cv1Var instanceof Serializable) {
            return new dv1(cv1Var);
        }
        ev1 ev1Var = new ev1();
        cv1Var.getClass();
        ev1Var.a = cv1Var;
        return ev1Var;
    }

    public static void k(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void n(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void o(HashMap map) {
        SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = map.get("dataset_id");
        Object obj2 = map.get("endpoint");
        Object obj3 = map.get("access_key");
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("dataset_id", obj.toString());
        editorEdit.putString("endpoint", obj2.toString());
        editorEdit.putString("access_key", obj3.toString());
        editorEdit.apply();
        gp1 gp1Var = i01.c;
        "ia".toString().getClass();
        synchronized (i90.b) {
        }
    }

    public static void r(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            ts.q(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                ts.q(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }

    public static void s(int i2, int i3) {
        String strK;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strK = ta.K("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    e.g(ck1.s(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
                    return;
                }
                strK = ta.K("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strK);
        }
    }

    public static void u(int i2, int i3, int i4) {
        String strV;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strV = v(i2, i4, "start index");
            } else {
                strV = (i3 < 0 || i3 > i4) ? v(i3, i4, "end index") : ta.K("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strV);
        }
    }

    public static String v(int i2, int i3, String str) {
        if (i2 < 0) {
            return ta.K("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return ta.K("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        e.g(ck1.s(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
        return null;
    }

    public static String w(Context context, String str) {
        gu2.o(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = r93.n0(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static ArrayList y(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qp2 qp2Var = (qp2) it.next();
            PhoneMultiFactorInfo totpMultiFactorInfo = null;
            if (qp2Var != null) {
                if (TextUtils.isEmpty(qp2Var.a)) {
                    zzaih zzaihVar = qp2Var.e;
                    if (zzaihVar != null) {
                        totpMultiFactorInfo = new TotpMultiFactorInfo(qp2Var.b, qp2Var.c, qp2Var.d, zzaihVar);
                    }
                } else {
                    String str = qp2Var.b;
                    String str2 = qp2Var.c;
                    long j = qp2Var.d;
                    String str3 = qp2Var.a;
                    gu2.l(str3);
                    totpMultiFactorInfo = new PhoneMultiFactorInfo(j, str, str2, str3);
                }
            }
            if (totpMultiFactorInfo != null) {
                arrayList.add(totpMultiFactorInfo);
            }
        }
        return arrayList;
    }

    public static void z(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j = jArr[i2];
            long j2 = j / 67108864;
            jArr[i2] = j - (j2 << 26);
            int i3 = i2 + 1;
            long j3 = jArr[i3] + j2;
            jArr[i3] = j3;
            long j4 = j3 / 33554432;
            jArr[i3] = j3 - (j4 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }
}
