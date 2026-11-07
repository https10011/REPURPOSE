package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.g;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yq1 extends g {
    public final /* synthetic */ TextInputLayout W;
    public final /* synthetic */ SingleDateSelector X;
    public final /* synthetic */ n21 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq1(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, n21 n21Var, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.X = singleDateSelector;
        this.w = n21Var;
        this.W = textInputLayout2;
    }

    public final void a() {
        this.W.getError();
        this.w.a();
    }

    public final void b(Long l) {
        SingleDateSelector singleDateSelector = this.X;
        if (l == null) {
            singleDateSelector.a = null;
        } else {
            singleDateSelector.a = l;
        }
        this.w.b(singleDateSelector.a);
    }
}
