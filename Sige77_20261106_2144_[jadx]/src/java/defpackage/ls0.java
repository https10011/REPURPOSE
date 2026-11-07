package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ls0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns0 b;

    public /* synthetic */ ls0(ns0 ns0Var, int i) {
        this.a = i;
        this.b = ns0Var;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        ns0 ns0Var = this.b;
        switch (i) {
            case 0:
                kt ktVar = (kt) obj;
                ktVar.getClass();
                Log.w(Reflection.getOrCreateKotlinClass(ns0.class).getSimpleName(), "CorruptionException in " + ns0Var.a + " DataStore running in process " + Process.myPid(), ktVar);
                return new d61(true);
            default:
                Context context = (Context) obj;
                context.getClass();
                String str = ns0Var.a;
                LinkedHashSet linkedHashSet = iq1.a;
                linkedHashSet.getClass();
                return a.a(new gq1(context, str, jq1.a, new gx(linkedHashSet, (fs) null, 4), new hq1(3, null)));
        }
    }
}
