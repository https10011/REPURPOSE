package defpackage;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.m;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n21 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ n21(int i, Fragment fragment) {
        this.a = i;
        this.b = fragment;
    }

    public final void a() {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.A1.setEnabled(false);
                break;
            default:
                Iterator it = ((s21) mVar).K0.iterator();
                while (it.hasNext()) {
                    ((n21) it.next()).a();
                }
                break;
        }
    }

    public final void b(Object obj) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                m mVar2 = mVar;
                String strL = mVar2.S().l(mVar2.i());
                mVar2.x1.setContentDescription(mVar2.S().i(mVar2.J()));
                mVar2.x1.setText(strL);
                mVar2.A1.setEnabled(mVar2.S().t());
                break;
            default:
                Iterator it = ((s21) mVar).K0.iterator();
                while (it.hasNext()) {
                    ((n21) it.next()).b(obj);
                }
                break;
        }
    }
}
