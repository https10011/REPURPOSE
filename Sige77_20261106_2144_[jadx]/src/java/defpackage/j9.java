package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public j9(TextView textView, Typeface typeface, int i) {
        this.a = 0;
        this.c = textView;
        this.d = typeface;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h5 h5Var;
        int i = this.a;
        Object obj = this.c;
        int i2 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((TextView) obj).setTypeface((Typeface) obj2, i2);
                break;
            case 1:
                ((BottomSheetBehavior) obj2).F((View) obj, i2, false);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                eq eqVar = (eq) obj2;
                Object obj3 = ((i5) obj).a;
                String str = (String) ((a) eqVar).a.get(Integer.valueOf(i2));
                if (str != null) {
                    n5 n5Var = (n5) ((a) eqVar).e.get(str);
                    if (n5Var == null || (h5Var = n5Var.a) == null) {
                        ((a) eqVar).g.remove(str);
                        ((a) eqVar).f.put(str, obj3);
                    } else if (((a) eqVar).d.remove(str)) {
                        h5Var.b(obj3);
                    }
                    break;
                }
                break;
            default:
                ((eq) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
        }
    }

    public /* synthetic */ j9(eq eqVar, int i, Object obj, int i2) {
        this.a = i2;
        this.d = eqVar;
        this.b = i;
        this.c = obj;
    }

    public j9(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 1;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }
}
