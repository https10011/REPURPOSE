package defpackage;

import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class sr0 {
    public static fs a(fs fsVar, fs fsVar2, Function2 function2) {
        function2.getClass();
        if (function2 instanceof ze) {
            return ((ze) function2).create(fsVar, fsVar2);
        }
        g context = fsVar2.getContext();
        return context == g.a ? new or0(fsVar2, fsVar, function2) : new pr0(fsVar2, context, function2, fsVar);
    }

    public static fs b(fs fsVar) {
        fs<Object> fsVarIntercepted;
        fsVar.getClass();
        gs gsVar = fsVar instanceof gs ? (gs) fsVar : null;
        return (gsVar == null || (fsVarIntercepted = gsVar.intercepted()) == null) ? fsVar : fsVarIntercepted;
    }

    public static Object c(Function2 function2, Object obj, fs fsVar) {
        function2.getClass();
        g context = fsVar.getContext();
        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, context == g.a ? new qr0(fsVar) : new rr0(fsVar, context));
    }
}
