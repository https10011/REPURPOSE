package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class aa3 implements cv1 {
    public final Context a;

    public aa3(Context context, int i) {
        switch (i) {
            case 1:
                new ConcurrentHashMap();
                sp0.M(context != null, "Context cannot be null", new Object[0]);
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cv1
    public Object get() {
        Object obj = y93.j;
        qp0 qp0Var = new qp0();
        Context context = this.a;
        qp0Var.a = context;
        context.getClass();
        if (((cv1) qp0Var.b) == null) {
            qp0Var.b = y93.m;
        }
        boolean z = false;
        Object[] objArr = 0;
        if (((cv1) qp0Var.c) == null) {
            qp0Var.c = ia.j(new gr0(z, (Context) qp0Var.a));
        }
        if (((gk1) qp0Var.d) == null) {
            qp0Var.d = new gk1(qp0Var, 29);
        }
        if (((cv1) qp0Var.e) == null) {
            Context context2 = (Context) qp0Var.a;
            ArrayList arrayList = new ArrayList();
            ph3 ph3Var = new ph3(new aa3(context2, 1));
            new ConcurrentHashMap();
            Collections.addAll(arrayList, ph3Var, new vh3());
            qp0Var.e = ia.j(new lk0(arrayList));
        }
        if (((u93) qp0Var.f) == null) {
            qp0Var.f = new u93(qp0Var, objArr == true ? 1 : 0);
        }
        return new y93((Context) qp0Var.a, (cv1) qp0Var.b, (cv1) qp0Var.c, (gk1) qp0Var.d, (cv1) qp0Var.e, (u93) qp0Var.f);
    }
}
