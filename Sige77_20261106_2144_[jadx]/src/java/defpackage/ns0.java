package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.a;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ns0 {
    public static final /* synthetic */ bv0[] d = {Reflection.property2(new PropertyReference2Impl(ns0.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    public final String a;
    public final ThreadLocal b;
    public final gk1 c;

    public ns0(Context context, String str) {
        gk1 gk1Var;
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        int i = 0;
        wa waVar = new wa(new ls0(this, i), 18);
        ls0 ls0Var = new ls0(this, 1);
        sz szVar = i20.a;
        fz fzVar = fz.c;
        av1 av1Var = new av1();
        fzVar.getClass();
        ds dsVarA = ta.a(e.c(fzVar, av1Var));
        ec1 ec1Var = new ec1(str, waVar, ls0Var, dsVarA);
        d[0].getClass();
        gk1 gk1Var2 = (gk1) ec1Var.b;
        if (gk1Var2 == null) {
            synchronized (ec1Var.a) {
                try {
                    if (((gk1) ec1Var.b) == null) {
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        List list = (List) ls0Var.invoke(applicationContext);
                        dc1 dc1Var = new dc1(applicationContext, ec1Var, 0);
                        list.getClass();
                        int i2 = 15;
                        ec1Var.b = new gk1(new gk1(new yx(new db0(new vt(dc1Var, 2)), a.a(new pw(list, null, i)), waVar, dsVarA), i2), i2);
                    }
                    gk1Var = (gk1) ec1Var.b;
                    gk1Var.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            gk1Var2 = gk1Var;
        }
        this.c = gk1Var2;
    }

    public final void a(Function1 function1) {
    }
}
