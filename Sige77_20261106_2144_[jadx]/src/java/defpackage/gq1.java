package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gq1 {
    public final gx a;
    public final hq1 b;
    public final Context c;
    public final String d;
    public final uv1 e;
    public final LinkedHashSet f;

    public gq1(Context context, String str, Set set, gx gxVar, hq1 hq1Var) {
        context.getClass();
        set.getClass();
        dc1 dc1Var = new dc1(context, str, 1);
        this.a = gxVar;
        this.b = hq1Var;
        this.c = context;
        this.d = str;
        this.e = aw0.a(dc1Var);
        this.f = set == jq1.a ? null : CollectionsKt.E(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, gs gsVar) {
        fq1 fq1Var;
        if (gsVar instanceof fq1) {
            fq1Var = (fq1) gsVar;
            int i = fq1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fq1Var.d = i - Integer.MIN_VALUE;
            } else {
                fq1Var = new fq1(this, gsVar);
            }
        } else {
            fq1Var = new fq1(this, gsVar);
        }
        Object objInvoke = fq1Var.b;
        ft ftVar = ft.a;
        int i2 = fq1Var.d;
        boolean z = true;
        if (i2 == 0) {
            zi0.B(objInvoke);
            fq1Var.a = this;
            fq1Var.d = 1;
            objInvoke = this.a.invoke(obj, fq1Var);
            if (objInvoke == ftVar) {
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = fq1Var.a;
            zi0.B(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = this.f;
        uv1 uv1Var = this.e;
        if (linkedHashSet == null) {
            Map<String, ?> all = ((SharedPreferences) uv1Var.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) uv1Var.getValue();
            if (linkedHashSet.isEmpty()) {
                z = false;
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
