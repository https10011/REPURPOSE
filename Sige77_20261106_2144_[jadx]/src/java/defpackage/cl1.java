package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cl1 extends gs implements id0 {
    public final id0 a;
    public final CoroutineContext b;
    public final int c;
    public CoroutineContext d;
    public fs e;

    public cl1(id0 id0Var, CoroutineContext coroutineContext) {
        super(c71.a, g.a);
        this.a = id0Var;
        this.b = coroutineContext;
        this.c = ((Number) coroutineContext.fold(0, new uo(5))).intValue();
    }

    @Override // defpackage.id0
    public final Object a(Object obj, fs fsVar) {
        try {
            Object objB = b(fsVar, obj);
            return objB == ft.a ? objB : Unit.a;
        } catch (Throwable th) {
            this.d = new c30(th, fsVar.getContext());
            throw th;
        }
    }

    public final Object b(fs fsVar, Object obj) {
        CoroutineContext context = fsVar.getContext();
        ye1.h(context);
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext != context) {
            if (coroutineContext instanceof c30) {
                throw new IllegalStateException(c.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c30) coroutineContext).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Function2() { // from class: fl1
                /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj2).intValue();
                    CoroutineContext.Element element = (CoroutineContext.Element) obj3;
                    f key = element.getKey();
                    CoroutineContext.Element element2 = this.a.b.get(key);
                    if (key == k42.c) {
                        ws0 ws0Var = (ws0) element2;
                        ws0 parent = (ws0) element;
                        while (true) {
                            if (parent != null) {
                                if (parent == ws0Var || !(parent instanceof em1)) {
                                    break;
                                }
                                hm hmVarW = ((em1) parent).w();
                                parent = hmVarW != null ? hmVarW.getParent() : null;
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != ws0Var) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + ws0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (ws0Var != null) {
                            iIntValue++;
                        }
                    } else if (element != element2) {
                        iIntValue = Integer.MIN_VALUE;
                    } else {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = fsVar;
        xg0 xg0Var = el1.a;
        id0 id0Var = this.a;
        id0Var.getClass();
        Object objInvoke = xg0Var.invoke(id0Var, obj, this);
        if (!Intrinsics.areEqual(objInvoke, ft.a)) {
            this.e = null;
        }
        return objInvoke;
    }

    @Override // defpackage.ze, defpackage.gt
    public final gt getCallerFrame() {
        fs fsVar = this.e;
        if (fsVar instanceof gt) {
            return (gt) fsVar;
        }
        return null;
    }

    @Override // defpackage.gs, defpackage.fs
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.d;
        return coroutineContext == null ? g.a : coroutineContext;
    }

    @Override // defpackage.ze
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        Throwable thA = rj1.a(obj);
        if (thA != null) {
            this.d = new c30(thA, getContext());
        }
        fs fsVar = this.e;
        if (fsVar != null) {
            fsVar.resumeWith(obj);
        }
        return ft.a;
    }
}
