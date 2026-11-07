package defpackage;

import android.view.View;
import com.google.android.material.datepicker.m;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class l21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ l21(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                Iterator it = mVar.a1.iterator();
                if (!it.hasNext()) {
                    mVar.P(false, false);
                    return;
                } else if (it.next() != null) {
                    ur.a();
                    return;
                } else {
                    mVar.S().getClass();
                    throw null;
                }
            case 1:
                Iterator it2 = mVar.b1.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                mVar.P(false, false);
                return;
            default:
                mVar.A1.setEnabled(mVar.S().t());
                mVar.y1.toggle();
                mVar.n1 = mVar.n1 != 1 ? 1 : 0;
                mVar.W(mVar.y1);
                mVar.V();
                return;
        }
    }
}
