package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class dq implements a91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ dq(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.a91
    public final void a() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                Bundle bundleA = cVar.getSavedStateRegistry().a("android:support:activity-result");
                if (bundleA != null) {
                    eq eqVar = ((ComponentActivity) cVar).Z;
                    HashMap map = ((a) eqVar).b;
                    HashMap map2 = ((a) eqVar).a;
                    Bundle bundle = ((a) eqVar).g;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ((a) eqVar).d = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                            String str = stringArrayList.get(i2);
                            if (map.containsKey(str)) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            map2.put(num2, str2);
                            ((a) eqVar).b.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                wf0 wf0Var = (wf0) cVar.h0.a;
                wf0Var.a0.b(wf0Var, wf0Var, (Fragment) null);
                break;
        }
    }
}
