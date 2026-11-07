package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class vs {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new uo(2))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new uo(2))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        g gVar = g.a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new uo(3));
        if (zBooleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(gVar, new uo(4));
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    public static final CoroutineContext b(et etVar, CoroutineContext coroutineContext) {
        sz szVarA = a(etVar.b(), coroutineContext, true);
        sz szVar = i20.a;
        return (szVarA == szVar || szVarA.get(d.M) != null) ? szVarA : szVarA.plus(szVar);
    }

    public static final m22 c(fs fsVar, CoroutineContext coroutineContext, Object obj) {
        m22 m22Var = null;
        if ((fsVar instanceof gt) && coroutineContext.get(n22.a) != null) {
            gt callerFrame = (gt) fsVar;
            while (!(callerFrame instanceof g20) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof m22) {
                    m22Var = (m22) callerFrame;
                    break;
                }
            }
            if (m22Var != null) {
                m22Var.Z(coroutineContext, obj);
            }
        }
        return m22Var;
    }
}
