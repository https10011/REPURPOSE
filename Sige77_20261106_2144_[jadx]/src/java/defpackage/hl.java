package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hl extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return null;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return null;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return null;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return Float.valueOf(e72.a.n((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                kl klVar = (kl) obj;
                PointF pointF = (PointF) obj2;
                klVar.getClass();
                klVar.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                klVar.b = iRound;
                int i = klVar.f + 1;
                klVar.f = i;
                if (i == klVar.g) {
                    e72.a(klVar.e, klVar.a, iRound, klVar.c, klVar.d);
                    klVar.f = 0;
                    klVar.g = 0;
                }
                break;
            case 1:
                kl klVar2 = (kl) obj;
                PointF pointF2 = (PointF) obj2;
                klVar2.getClass();
                klVar2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                klVar2.d = iRound2;
                int i2 = klVar2.g + 1;
                klVar2.g = i2;
                if (klVar2.f == i2) {
                    e72.a(klVar2.e, klVar2.a, klVar2.b, klVar2.c, iRound2);
                    klVar2.f = 0;
                    klVar2.g = 0;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                e72.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                e72.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                e72.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                float fFloatValue = ((Float) obj2).floatValue();
                e72.a.w((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
