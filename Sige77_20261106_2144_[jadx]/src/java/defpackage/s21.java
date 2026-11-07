package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s21<S> extends pb1 {
    public int L0;
    public DateSelector M0;
    public CalendarConstraints N0;

    public final void D(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.L0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.M0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.N0);
    }

    public final void v(Bundle bundle) {
        super.v(bundle);
        if (bundle == null) {
            bundle = ((Fragment) this).f;
        }
        this.L0 = bundle.getInt("THEME_RES_ID_KEY");
        this.M0 = bundle.getParcelable("DATE_SELECTOR_KEY");
        this.N0 = bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.M0.x(layoutInflater.cloneInContext(new ContextThemeWrapper(i(), this.L0)), viewGroup, this.N0, new n21(1, this));
    }
}
