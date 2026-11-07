package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.preference.PreferenceManager;
import android.widget.TextView;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wf3 implements eg3 {
    public final /* synthetic */ int a = 3;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;

    public wf3(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, op1 op1Var, Rect rect) {
        r93.m(rect.left);
        r93.m(rect.top);
        r93.m(rect.right);
        r93.m(rect.bottom);
        this.c = rect;
        this.d = colorStateList2;
        this.e = colorStateList;
        this.f = colorStateList3;
        this.b = i;
        this.i = op1Var;
    }

    public static wf3 a(Context context, int i) {
        r93.l("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ue1.p);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListK = xi0.k(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListK2 = xi0.k(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListK3 = xi0.k(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        op1 op1VarC = op1.a(typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), context).c();
        typedArrayObtainStyledAttributes.recycle();
        return new wf3(colorStateListK, colorStateListK2, colorStateListK3, dimensionPixelSize, op1VarC, rect);
    }

    public static wf3 d(String str, jr2 jr2Var, int i, ip3 ip3Var, Integer num) throws GeneralSecurityException {
        if (ip3Var == ip3.RAW) {
            if (num != null) {
                tv2.f("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            tv2.f("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new wf3(str, kg3.a(str), jr2Var, i, ip3Var, num);
    }

    public void b(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.d;
        r21 r21Var = new r21();
        r21 r21Var2 = new r21();
        op1 op1Var = (op1) this.i;
        r21Var.setShapeAppearanceModel(op1Var);
        r21Var2.setShapeAppearanceModel(op1Var);
        r21Var.n((ColorStateList) this.e);
        float f = this.b;
        ColorStateList colorStateList2 = (ColorStateList) this.f;
        r21Var.b.k = f;
        r21Var.invalidateSelf();
        p21 p21Var = r21Var.b;
        if (p21Var.e != colorStateList2) {
            p21Var.e = colorStateList2;
            r21Var.onStateChange(r21Var.getState());
        }
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), r21Var, r21Var2);
        Rect rect = (Rect) this.c;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public void c() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(i90.a()).edit();
        Long l = (Long) this.c;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l2 = (Long) this.d;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.b);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID) this.e).toString());
        editorEdit.apply();
        es1 es1Var = (es1) this.i;
        if (es1Var == null || es1Var == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(i90.a()).edit();
        editorEdit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", es1Var.b);
        editorEdit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", es1Var.c);
        editorEdit2.apply();
    }

    public String toString() {
        switch (this.a) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder("UploadEventsRequest{host='");
                sb.append((String) this.c);
                sb.append("', data=");
                sb.append(Arrays.toString((byte[]) this.d));
                sb.append(", lineNumber=");
                sb.append(this.b);
                sb.append(", appidList=");
                sb.append((List) this.e);
                sb.append(", packetUid='");
                sb.append((String) this.f);
                sb.append("', dupid='");
                return ts.l(sb, (String) this.i, "'}");
            default:
                return super.toString();
        }
    }

    public wf3(String str, tr3 tr3Var, jr2 jr2Var, int i, ip3 ip3Var, Integer num) {
        this.c = str;
        this.d = tr3Var;
        this.e = jr2Var;
        this.b = i;
        this.f = ip3Var;
        this.i = num;
    }

    public wf3(Long l, Long l2) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.c = l;
        this.d = l2;
        this.e = uuidRandomUUID;
    }

    public /* synthetic */ wf3() {
    }
}
