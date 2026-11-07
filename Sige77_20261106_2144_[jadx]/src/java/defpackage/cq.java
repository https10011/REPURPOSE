package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class cq implements tl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ cq(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tl1
    public final Bundle a() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                eq eqVar = ((ComponentActivity) cVar).Z;
                eqVar.getClass();
                HashMap map = ((a) eqVar).b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(((a) eqVar).d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) ((a) eqVar).g.clone());
                return bundle;
        }
        while (c.f(cVar.getSupportFragmentManager())) {
        }
        cVar.i0.e(kw0.ON_STOP);
        return new Bundle();
    }
}
