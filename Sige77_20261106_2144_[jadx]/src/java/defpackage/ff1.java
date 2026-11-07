package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.g;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ff1 extends g {
    public final /* synthetic */ TextInputLayout W;
    public final /* synthetic */ TextInputLayout X;
    public final /* synthetic */ n21 Y;
    public final /* synthetic */ RangeDateSelector Z;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff1(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, n21 n21Var, int i) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.w = i;
        this.Z = rangeDateSelector;
        this.W = textInputLayout2;
        this.X = textInputLayout3;
        this.Y = n21Var;
    }

    public final void a() {
        int i = this.w;
        n21 n21Var = this.Y;
        TextInputLayout textInputLayout = this.X;
        TextInputLayout textInputLayout2 = this.W;
        RangeDateSelector rangeDateSelector = this.Z;
        switch (i) {
            case 0:
                rangeDateSelector.d = null;
                RangeDateSelector.a(rangeDateSelector, textInputLayout2, textInputLayout, n21Var);
                break;
            default:
                rangeDateSelector.e = null;
                RangeDateSelector.a(rangeDateSelector, textInputLayout2, textInputLayout, n21Var);
                break;
        }
    }

    public final void b(Long l) {
        int i = this.w;
        n21 n21Var = this.Y;
        TextInputLayout textInputLayout = this.X;
        TextInputLayout textInputLayout2 = this.W;
        RangeDateSelector rangeDateSelector = this.Z;
        switch (i) {
            case 0:
                rangeDateSelector.d = l;
                RangeDateSelector.a(rangeDateSelector, textInputLayout2, textInputLayout, n21Var);
                break;
            default:
                rangeDateSelector.e = l;
                RangeDateSelector.a(rangeDateSelector, textInputLayout2, textInputLayout, n21Var);
                break;
        }
    }
}
