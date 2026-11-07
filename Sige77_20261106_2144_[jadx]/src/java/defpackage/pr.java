package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pr {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(xe xeVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = xeVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = ne1.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && xeVar.isInEditMode() && (xeVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout parent = xeVar.getParent();
                if (strTrim != null) {
                    HashMap map = parent.c0;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = parent.c0.get(strTrim);
                    }
                } else {
                    parent.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static kr d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        kr krVar = new kr();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? pe1.c : pe1.a);
        String[] strArr = aj0.a;
        nr nrVar = krVar.b;
        or orVar = krVar.e;
        mr mrVar = krVar.c;
        lr lrVar = krVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            jr jrVar = new jr();
            jrVar.a = new int[10];
            jrVar.b = new int[10];
            jrVar.c = 0;
            jrVar.d = new int[10];
            jrVar.e = new float[10];
            jrVar.f = 0;
            jrVar.g = new int[5];
            jrVar.h = new String[5];
            jrVar.i = 0;
            jrVar.j = new int[4];
            jrVar.k = new boolean[4];
            jrVar.l = 0;
            mrVar.getClass();
            lrVar.getClass();
            orVar.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        i2 = indexCount;
                        jrVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.H));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case BuildConfig.VERSION_CODE /* 88 */:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        i2 = indexCount;
                        jrVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = indexCount;
                        jrVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lrVar.B));
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        i2 = indexCount;
                        jrVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lrVar.C));
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        i2 = indexCount;
                        jrVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.I));
                        break;
                    case 11:
                        i2 = indexCount;
                        jrVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.O));
                        break;
                    case 12:
                        i2 = indexCount;
                        jrVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.P));
                        break;
                    case 13:
                        i2 = indexCount;
                        jrVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.L));
                        break;
                    case 14:
                        i2 = indexCount;
                        jrVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.N));
                        break;
                    case 15:
                        i2 = indexCount;
                        jrVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.Q));
                        break;
                    case 16:
                        i2 = indexCount;
                        jrVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.M));
                        break;
                    case 17:
                        i2 = indexCount;
                        jrVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lrVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        jrVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lrVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        jrVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, lrVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        jrVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, lrVar.v));
                        break;
                    case 21:
                        i2 = indexCount;
                        jrVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, lrVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        jrVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, nrVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        jrVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, lrVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        jrVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.E));
                        break;
                    case 27:
                        i2 = indexCount;
                        jrVar.b(27, typedArrayObtainStyledAttributes.getInt(index, lrVar.D));
                        break;
                    case 28:
                        i2 = indexCount;
                        jrVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.F));
                        break;
                    case 31:
                        i2 = indexCount;
                        jrVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.J));
                        break;
                    case 34:
                        i2 = indexCount;
                        jrVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.G));
                        break;
                    case 37:
                        i2 = indexCount;
                        jrVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, lrVar.w));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, krVar.a);
                        krVar.a = resourceId;
                        jrVar.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        jrVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, lrVar.T));
                        break;
                    case 40:
                        i2 = indexCount;
                        jrVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, lrVar.S));
                        break;
                    case 41:
                        i2 = indexCount;
                        jrVar.b(41, typedArrayObtainStyledAttributes.getInt(index, lrVar.U));
                        break;
                    case 42:
                        i2 = indexCount;
                        jrVar.b(42, typedArrayObtainStyledAttributes.getInt(index, lrVar.V));
                        break;
                    case 43:
                        i2 = indexCount;
                        jrVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, nrVar.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        jrVar.d(44, true);
                        jrVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, orVar.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        jrVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, orVar.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        jrVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, orVar.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        jrVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, orVar.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        jrVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, orVar.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        jrVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, orVar.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        jrVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, orVar.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        jrVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, orVar.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        jrVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, orVar.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        jrVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, orVar.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        jrVar.b(54, typedArrayObtainStyledAttributes.getInt(index, lrVar.W));
                        break;
                    case 55:
                        i2 = indexCount;
                        jrVar.b(55, typedArrayObtainStyledAttributes.getInt(index, lrVar.X));
                        break;
                    case 56:
                        i2 = indexCount;
                        jrVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.Y));
                        break;
                    case 57:
                        i2 = indexCount;
                        jrVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.Z));
                        break;
                    case 58:
                        i2 = indexCount;
                        jrVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.a0));
                        break;
                    case 59:
                        i2 = indexCount;
                        jrVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.b0));
                        break;
                    case 60:
                        i2 = indexCount;
                        jrVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, orVar.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        jrVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.z));
                        break;
                    case 63:
                        i2 = indexCount;
                        jrVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, lrVar.A));
                        break;
                    case 64:
                        i2 = indexCount;
                        jrVar.b(64, f(typedArrayObtainStyledAttributes, index, mrVar.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            jrVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            jrVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        jrVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        jrVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, mrVar.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        jrVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, nrVar.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        jrVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        jrVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        jrVar.b(72, typedArrayObtainStyledAttributes.getInt(index, lrVar.e0));
                        break;
                    case 73:
                        i2 = indexCount;
                        jrVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.f0));
                        break;
                    case 74:
                        i2 = indexCount;
                        jrVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        jrVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, lrVar.m0));
                        break;
                    case 76:
                        i2 = indexCount;
                        jrVar.b(76, typedArrayObtainStyledAttributes.getInt(index, mrVar.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        jrVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        jrVar.b(78, typedArrayObtainStyledAttributes.getInt(index, nrVar.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        jrVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, mrVar.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        jrVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, lrVar.k0));
                        break;
                    case 81:
                        i2 = indexCount;
                        jrVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, lrVar.l0));
                        break;
                    case 82:
                        i2 = indexCount;
                        jrVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, mrVar.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        jrVar.b(83, f(typedArrayObtainStyledAttributes, index, orVar.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        jrVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, mrVar.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        jrVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, mrVar.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            mrVar.i = resourceId2;
                            jrVar.b(89, resourceId2);
                            if (mrVar.i != -1) {
                                jrVar.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            mrVar.h = string;
                            jrVar.c(90, string);
                            if (mrVar.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                mrVar.i = resourceId3;
                                jrVar.b(89, resourceId3);
                                jrVar.b(88, -2);
                            } else {
                                jrVar.b(88, -1);
                            }
                        } else {
                            jrVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, mrVar.i));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        jrVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.K));
                        break;
                    case 94:
                        i2 = indexCount;
                        jrVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lrVar.R));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(jrVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(jrVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        jrVar.b(97, typedArrayObtainStyledAttributes.getInt(index, lrVar.n0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = r51.i0;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            krVar.a = typedArrayObtainStyledAttributes.getResourceId(index, krVar.a);
                        }
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        mrVar.getClass();
                        lrVar.getClass();
                        orVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        lrVar.o = f(typedArrayObtainStyledAttributes, index2, lrVar.o);
                        continue;
                        i7++;
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        i = indexCount2;
                        lrVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.H);
                        continue;
                        i7++;
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        i = indexCount2;
                        lrVar.n = f(typedArrayObtainStyledAttributes, index2, lrVar.n);
                        continue;
                        i7++;
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        i = indexCount2;
                        lrVar.m = f(typedArrayObtainStyledAttributes, index2, lrVar.m);
                        continue;
                        i7++;
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        i = indexCount2;
                        lrVar.x = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = indexCount2;
                        lrVar.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, lrVar.B);
                        continue;
                        i7++;
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = indexCount2;
                        lrVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, lrVar.C);
                        continue;
                        i7++;
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        i = indexCount2;
                        lrVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.I);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        lrVar.u = f(typedArrayObtainStyledAttributes, index2, lrVar.u);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        lrVar.t = f(typedArrayObtainStyledAttributes, index2, lrVar.t);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        lrVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.O);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        lrVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.P);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        lrVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.L);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        lrVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.N);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        lrVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.Q);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        lrVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.M);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        lrVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, lrVar.d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        lrVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, lrVar.e);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        lrVar.f = typedArrayObtainStyledAttributes.getFloat(index2, lrVar.f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        lrVar.v = typedArrayObtainStyledAttributes.getFloat(index2, lrVar.v);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        lrVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, lrVar.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, nrVar.a);
                        nrVar.a = i8;
                        nrVar.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        lrVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, lrVar.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        lrVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.E);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        lrVar.g = f(typedArrayObtainStyledAttributes, index2, lrVar.g);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        lrVar.h = f(typedArrayObtainStyledAttributes, index2, lrVar.h);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        lrVar.D = typedArrayObtainStyledAttributes.getInt(index2, lrVar.D);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        lrVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.F);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        lrVar.i = f(typedArrayObtainStyledAttributes, index2, lrVar.i);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        lrVar.j = f(typedArrayObtainStyledAttributes, index2, lrVar.j);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        lrVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.J);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        lrVar.r = f(typedArrayObtainStyledAttributes, index2, lrVar.r);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        lrVar.s = f(typedArrayObtainStyledAttributes, index2, lrVar.s);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        lrVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.G);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        lrVar.l = f(typedArrayObtainStyledAttributes, index2, lrVar.l);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        lrVar.k = f(typedArrayObtainStyledAttributes, index2, lrVar.k);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        lrVar.w = typedArrayObtainStyledAttributes.getFloat(index2, lrVar.w);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        krVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, krVar.a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        lrVar.T = typedArrayObtainStyledAttributes.getFloat(index2, lrVar.T);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        lrVar.S = typedArrayObtainStyledAttributes.getFloat(index2, lrVar.S);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        lrVar.U = typedArrayObtainStyledAttributes.getInt(index2, lrVar.U);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        lrVar.V = typedArrayObtainStyledAttributes.getInt(index2, lrVar.V);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        nrVar.c = typedArrayObtainStyledAttributes.getFloat(index2, nrVar.c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        orVar.l = true;
                        orVar.m = typedArrayObtainStyledAttributes.getDimension(index2, orVar.m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        orVar.b = typedArrayObtainStyledAttributes.getFloat(index2, orVar.b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        orVar.c = typedArrayObtainStyledAttributes.getFloat(index2, orVar.c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        orVar.d = typedArrayObtainStyledAttributes.getFloat(index2, orVar.d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        orVar.e = typedArrayObtainStyledAttributes.getFloat(index2, orVar.e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        orVar.f = typedArrayObtainStyledAttributes.getDimension(index2, orVar.f);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        orVar.g = typedArrayObtainStyledAttributes.getDimension(index2, orVar.g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        orVar.i = typedArrayObtainStyledAttributes.getDimension(index2, orVar.i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        orVar.j = typedArrayObtainStyledAttributes.getDimension(index2, orVar.j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        orVar.k = typedArrayObtainStyledAttributes.getDimension(index2, orVar.k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        lrVar.W = typedArrayObtainStyledAttributes.getInt(index2, lrVar.W);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        lrVar.X = typedArrayObtainStyledAttributes.getInt(index2, lrVar.X);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        lrVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.Y);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        lrVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.Z);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        lrVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.a0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        lrVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.b0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        orVar.a = typedArrayObtainStyledAttributes.getFloat(index2, orVar.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        lrVar.y = f(typedArrayObtainStyledAttributes, index2, lrVar.y);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        lrVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.z);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        lrVar.A = typedArrayObtainStyledAttributes.getFloat(index2, lrVar.A);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        mrVar.a = f(typedArrayObtainStyledAttributes, index2, mrVar.a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            mrVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            mrVar.getClass();
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        mrVar.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        mrVar.e = typedArrayObtainStyledAttributes.getFloat(index2, mrVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        nrVar.d = typedArrayObtainStyledAttributes.getFloat(index2, nrVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        lrVar.c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        lrVar.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        lrVar.e0 = typedArrayObtainStyledAttributes.getInt(index2, lrVar.e0);
                        break;
                    case 73:
                        i = indexCount2;
                        lrVar.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.f0);
                        break;
                    case 74:
                        i = indexCount2;
                        lrVar.i0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        lrVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, lrVar.m0);
                        break;
                    case 76:
                        i = indexCount2;
                        mrVar.c = typedArrayObtainStyledAttributes.getInt(index2, mrVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        lrVar.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        nrVar.b = typedArrayObtainStyledAttributes.getInt(index2, nrVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        mrVar.d = typedArrayObtainStyledAttributes.getFloat(index2, mrVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        lrVar.k0 = typedArrayObtainStyledAttributes.getBoolean(index2, lrVar.k0);
                        break;
                    case 81:
                        i = indexCount2;
                        lrVar.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, lrVar.l0);
                        break;
                    case 82:
                        i = indexCount2;
                        mrVar.b = typedArrayObtainStyledAttributes.getInteger(index2, mrVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        orVar.h = f(typedArrayObtainStyledAttributes, index2, orVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        mrVar.g = typedArrayObtainStyledAttributes.getInteger(index2, mrVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        mrVar.f = typedArrayObtainStyledAttributes.getFloat(index2, mrVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            mrVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            mrVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                mrVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, mrVar.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case BuildConfig.VERSION_CODE /* 88 */:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        lrVar.p = f(typedArrayObtainStyledAttributes, index2, lrVar.p);
                        break;
                    case 92:
                        i = indexCount2;
                        lrVar.q = f(typedArrayObtainStyledAttributes, index2, lrVar.q);
                        break;
                    case 93:
                        i = indexCount2;
                        lrVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.K);
                        break;
                    case 94:
                        i = indexCount2;
                        lrVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lrVar.R);
                        break;
                    case 95:
                        i = indexCount2;
                        g(lrVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        g(lrVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        lrVar.n0 = typedArrayObtainStyledAttributes.getInt(index2, lrVar.n0);
                        break;
                }
                i7++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return krVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        jr jrVar;
        lr lrVar;
        gr grVar;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof gr) {
                    grVar = (gr) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) grVar).width = i4;
                        grVar.V = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) grVar).height = i4;
                        grVar.W = z;
                        return;
                    }
                }
                if (obj instanceof lr) {
                    lrVar = (lr) obj;
                    if (i2 == 0) {
                        lrVar.b = i4;
                        lrVar.k0 = z;
                        return;
                    } else {
                        lrVar.c = i4;
                        lrVar.l0 = z;
                        return;
                    }
                }
                if (obj instanceof jr) {
                    jrVar = (jr) obj;
                    if (i2 == 0) {
                        jrVar.b(23, i4);
                        jrVar.d(80, z);
                        return;
                    } else {
                        jrVar.b(21, i4);
                        jrVar.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof gr) {
                grVar = (gr) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) grVar).width = i4;
                    grVar.V = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) grVar).height = i4;
                    grVar.W = z;
                    return;
                }
            }
            if (obj instanceof lr) {
                lrVar = (lr) obj;
                if (i2 == 0) {
                    lrVar.b = i4;
                    lrVar.k0 = z;
                    return;
                } else {
                    lrVar.c = i4;
                    lrVar.l0 = z;
                    return;
                }
            }
            if (obj instanceof jr) {
                jrVar = (jr) obj;
                if (i2 == 0) {
                    jrVar.b(23, i4);
                    jrVar.d(80, z);
                    return;
                } else {
                    jrVar.b(21, i4);
                    jrVar.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof gr) {
                    gr grVar2 = (gr) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) grVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) grVar2).height = 0;
                    }
                    h(grVar2, strTrim2);
                    return;
                }
                if (obj instanceof lr) {
                    ((lr) obj).x = strTrim2;
                    return;
                } else {
                    if (obj instanceof jr) {
                        ((jr) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof gr) {
                        gr grVar3 = (gr) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) grVar3).width = 0;
                            grVar3.G = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) grVar3).height = 0;
                            grVar3.H = f2;
                            return;
                        }
                    }
                    if (obj instanceof lr) {
                        lr lrVar2 = (lr) obj;
                        if (i2 == 0) {
                            lrVar2.b = 0;
                            lrVar2.T = f2;
                            return;
                        } else {
                            lrVar2.c = 0;
                            lrVar2.S = f2;
                            return;
                        }
                    }
                    if (obj instanceof jr) {
                        jr jrVar2 = (jr) obj;
                        if (i2 == 0) {
                            jrVar2.b(23, 0);
                            jrVar2.a(39, f2);
                            return;
                        } else {
                            jrVar2.b(21, 0);
                            jrVar2.a(40, f2);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof gr) {
                        gr grVar4 = (gr) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) grVar4).width = 0;
                            grVar4.Q = fMax;
                            grVar4.K = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) grVar4).height = 0;
                            grVar4.R = fMax;
                            grVar4.L = 2;
                            return;
                        }
                    }
                    if (obj instanceof lr) {
                        lr lrVar3 = (lr) obj;
                        if (i2 == 0) {
                            lrVar3.b = 0;
                            lrVar3.c0 = fMax;
                            lrVar3.W = 2;
                            return;
                        } else {
                            lrVar3.c = 0;
                            lrVar3.d0 = fMax;
                            lrVar3.X = 2;
                            return;
                        }
                    }
                    if (obj instanceof jr) {
                        jr jrVar3 = (jr) obj;
                        if (i2 == 0) {
                            jrVar3.b(23, 0);
                            jrVar3.b(54, 2);
                        } else {
                            jrVar3.b(21, 0);
                            jrVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(gr grVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        grVar.F = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        pr prVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = prVar.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (prVar.b && id == -1) {
                    uq1.m("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        kr krVar = (kr) map2.get(Integer.valueOf(id));
                        if (krVar != null) {
                            nr nrVar = krVar.b;
                            lr lrVar = krVar.d;
                            or orVar = krVar.e;
                            if (childAt instanceof xe) {
                                lrVar.g0 = 1;
                                xe xeVar = (xe) childAt;
                                xeVar.setId(id);
                                xeVar.setType(lrVar.e0);
                                xeVar.setMargin(lrVar.f0);
                                xeVar.setAllowsGoneWidget(lrVar.m0);
                                int[] iArr = lrVar.h0;
                                if (iArr != null) {
                                    xeVar.setReferencedIds(iArr);
                                } else {
                                    String str = lrVar.i0;
                                    if (str != null) {
                                        int[] iArrC = c(xeVar, str);
                                        lrVar.h0 = iArrC;
                                        xeVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            gr grVar = (gr) childAt.getLayoutParams();
                            grVar.a();
                            krVar.a(grVar);
                            HashMap map3 = krVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                dr drVar = (dr) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strJ = !drVar.a ? ts.j("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iV = ts.v(drVar.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iV) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strJ, cls3).invoke(childAt, Integer.valueOf(drVar.c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strJ, cls2).invoke(childAt, Float.valueOf(drVar.d));
                                            break;
                                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                            map = map3;
                                            cls.getMethod(strJ, cls3).invoke(childAt, Integer.valueOf(drVar.g));
                                            break;
                                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                            Method method = cls.getMethod(strJ, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(drVar.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbN = ts.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN.append(cls.getName());
                                                Log.e("TransitionLayout", sbN.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strJ);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbN2 = ts.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN2.append(cls.getName());
                                                Log.e("TransitionLayout", sbN2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                                            cls.getMethod(strJ, CharSequence.class).invoke(childAt, drVar.e);
                                            map = map3;
                                            break;
                                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                                            cls.getMethod(strJ, Boolean.TYPE).invoke(childAt, Boolean.valueOf(drVar.f));
                                            map = map3;
                                            break;
                                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                            cls.getMethod(strJ, cls2).invoke(childAt, Float.valueOf(drVar.d));
                                            map = map3;
                                            break;
                                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                            cls.getMethod(strJ, cls3).invoke(childAt, Integer.valueOf(drVar.c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(grVar);
                            if (nrVar.b == 0) {
                                childAt.setVisibility(nrVar.a);
                            }
                            childAt.setAlpha(nrVar.c);
                            childAt.setRotation(orVar.a);
                            childAt.setRotationX(orVar.b);
                            childAt.setRotationY(orVar.c);
                            childAt.setScaleX(orVar.d);
                            childAt.setScaleY(orVar.e);
                            if (orVar.h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(orVar.h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(orVar.f)) {
                                    childAt.setPivotX(orVar.f);
                                }
                                if (!Float.isNaN(orVar.g)) {
                                    childAt.setPivotY(orVar.g);
                                }
                            }
                            childAt.setTranslationX(orVar.i);
                            childAt.setTranslationY(orVar.j);
                            childAt.setTranslationZ(orVar.k);
                            if (orVar.l) {
                                childAt.setElevation(orVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                prVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            prVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            kr krVar2 = (kr) map2.get(num);
            if (krVar2 != null) {
                lr lrVar2 = krVar2.d;
                if (lrVar2.g0 == 1) {
                    Context context = constraintLayout.getContext();
                    xe xeVar2 = new xe(context);
                    xeVar2.a = new int[32];
                    xeVar2.i = new HashMap();
                    xeVar2.c = context;
                    ye yeVar = new ye();
                    yeVar.r0 = 0;
                    yeVar.s0 = true;
                    yeVar.t0 = 0;
                    yeVar.u0 = false;
                    xeVar2.W = yeVar;
                    xeVar2.d = yeVar;
                    xeVar2.i();
                    xeVar2.setVisibility(8);
                    xeVar2.setId(num.intValue());
                    int[] iArr2 = lrVar2.h0;
                    if (iArr2 != null) {
                        xeVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = lrVar2.i0;
                        if (str3 != null) {
                            int[] iArrC2 = c(xeVar2, str3);
                            lrVar2.h0 = iArrC2;
                            xeVar2.setReferencedIds(iArrC2);
                        }
                    }
                    xeVar2.setType(lrVar2.e0);
                    xeVar2.setMargin(lrVar2.f0);
                    gr grVarG = ConstraintLayout.g();
                    xeVar2.i();
                    krVar2.a(grVarG);
                    constraintLayout.addView(xeVar2, grVarG);
                }
                if (lrVar2.a) {
                    View bl0Var = new bl0(constraintLayout.getContext());
                    bl0Var.setId(num.intValue());
                    gr grVarG2 = ConstraintLayout.g();
                    krVar2.a(grVarG2);
                    constraintLayout.addView(bl0Var, grVarG2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof er) {
                ((er) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        pr prVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = prVar.c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            gr grVar = (gr) childAt.getLayoutParams();
            int id = childAt.getId();
            if (prVar.b && id == -1) {
                uq1.m("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new kr());
            }
            kr krVar = (kr) map3.get(Integer.valueOf(id));
            if (krVar == null) {
                i = childCount;
                map = map3;
            } else {
                nr nrVar = krVar.b;
                lr lrVar = krVar.d;
                or orVar = krVar.e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = prVar.a;
                for (String str : map5.keySet()) {
                    dr drVar = (dr) map5.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new dr(drVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new dr(drVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        map2 = map3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                krVar.f = map4;
                krVar.a = id;
                lrVar.g = grVar.d;
                lrVar.h = grVar.e;
                lrVar.i = grVar.f;
                lrVar.j = grVar.g;
                lrVar.k = grVar.h;
                lrVar.l = grVar.i;
                lrVar.m = grVar.j;
                lrVar.n = grVar.k;
                lrVar.o = grVar.l;
                lrVar.p = grVar.m;
                lrVar.q = grVar.n;
                lrVar.r = grVar.r;
                lrVar.s = grVar.s;
                lrVar.t = grVar.t;
                lrVar.u = grVar.u;
                lrVar.v = grVar.D;
                lrVar.w = grVar.E;
                lrVar.x = grVar.F;
                lrVar.y = grVar.o;
                lrVar.z = grVar.p;
                lrVar.A = grVar.q;
                lrVar.B = grVar.S;
                lrVar.C = grVar.T;
                lrVar.D = grVar.U;
                lrVar.f = grVar.c;
                lrVar.d = grVar.a;
                lrVar.e = grVar.b;
                lrVar.b = ((ViewGroup.MarginLayoutParams) grVar).width;
                lrVar.c = ((ViewGroup.MarginLayoutParams) grVar).height;
                lrVar.E = ((ViewGroup.MarginLayoutParams) grVar).leftMargin;
                lrVar.F = ((ViewGroup.MarginLayoutParams) grVar).rightMargin;
                lrVar.G = ((ViewGroup.MarginLayoutParams) grVar).topMargin;
                lrVar.H = ((ViewGroup.MarginLayoutParams) grVar).bottomMargin;
                lrVar.K = grVar.C;
                lrVar.S = grVar.H;
                lrVar.T = grVar.G;
                lrVar.V = grVar.J;
                lrVar.U = grVar.I;
                lrVar.k0 = grVar.V;
                lrVar.l0 = grVar.W;
                lrVar.W = grVar.K;
                lrVar.X = grVar.L;
                lrVar.Y = grVar.O;
                lrVar.Z = grVar.P;
                lrVar.a0 = grVar.M;
                lrVar.b0 = grVar.N;
                lrVar.c0 = grVar.Q;
                lrVar.d0 = grVar.R;
                lrVar.j0 = grVar.X;
                lrVar.M = grVar.w;
                lrVar.O = grVar.y;
                lrVar.L = grVar.v;
                lrVar.N = grVar.x;
                lrVar.Q = grVar.z;
                lrVar.P = grVar.A;
                lrVar.R = grVar.B;
                lrVar.n0 = grVar.Y;
                lrVar.I = grVar.getMarginEnd();
                lrVar.J = grVar.getMarginStart();
                nrVar.a = childAt.getVisibility();
                nrVar.c = childAt.getAlpha();
                orVar.a = childAt.getRotation();
                orVar.b = childAt.getRotationX();
                orVar.c = childAt.getRotationY();
                orVar.d = childAt.getScaleX();
                orVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    orVar.f = pivotX;
                    orVar.g = pivotY;
                }
                orVar.i = childAt.getTranslationX();
                orVar.j = childAt.getTranslationY();
                orVar.k = childAt.getTranslationZ();
                if (orVar.l) {
                    orVar.m = childAt.getElevation();
                }
                if (childAt instanceof xe) {
                    xe xeVar = (xe) childAt;
                    lrVar.m0 = xeVar.getAllowsGoneWidget();
                    lrVar.h0 = xeVar.getReferencedIds();
                    lrVar.e0 = xeVar.getType();
                    lrVar.f0 = xeVar.getMargin();
                }
            }
            i2++;
            prVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    kr krVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        krVarD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(krVarD.a), krVarD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
