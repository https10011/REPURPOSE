package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class tw {
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008c -> B:25:0x0069). Please report as a decompilation issue!!! */
    public static final Object a(List list, eq0 eq0Var, gs gsVar) throws Throwable {
        qw qwVar;
        List list2;
        Ref.ObjectRef objectRef;
        Iterator it;
        Throwable th;
        Function1 function1;
        if (gsVar instanceof qw) {
            qwVar = (qw) gsVar;
            int i = qwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qwVar.d = i - Integer.MIN_VALUE;
            } else {
                qwVar = new qw(gsVar);
            }
        } else {
            qwVar = new qw(gsVar);
        }
        Object obj = qwVar.c;
        ft ftVar = ft.a;
        int i2 = qwVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                list2 = (List) qwVar.a;
                zi0.B(obj);
            } else {
                if (i2 != 2) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = qwVar.b;
                objectRef = (Ref.ObjectRef) qwVar.a;
                try {
                    zi0.B(obj);
                } catch (Throwable th2) {
                    Object obj2 = objectRef.element;
                    if (obj2 == null) {
                        objectRef.element = th2;
                    } else {
                        a80.a((Throwable) obj2, th2);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                qwVar.a = objectRef;
                qwVar.b = it;
                qwVar.d = 2;
                if (function1.invoke(qwVar) == ftVar) {
                    return ftVar;
                }
            }
            th = (Throwable) objectRef.element;
            if (th == null) {
                return Unit.a;
            }
            throw th;
        }
        zi0.B(obj);
        ArrayList arrayList = new ArrayList();
        sw swVar = new sw(list, arrayList, null);
        qwVar.a = arrayList;
        qwVar.d = 1;
        if (((bx) eq0Var).a(swVar, qwVar) == ftVar) {
            return ftVar;
        }
        list2 = arrayList;
        objectRef = new Ref.ObjectRef();
        it = list2.iterator();
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            qwVar.a = objectRef;
            qwVar.b = it;
            qwVar.d = 2;
            if (function1.invoke(qwVar) == ftVar) {
                return ftVar;
            }
        }
        th = (Throwable) objectRef.element;
        if (th == null) {
            return Unit.a;
        }
        throw th;
    }
}
