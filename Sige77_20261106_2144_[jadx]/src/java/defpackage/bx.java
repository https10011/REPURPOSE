package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bx implements eq0 {
    public final /* synthetic */ f61 a;
    public final /* synthetic */ Ref.BooleanRef b;
    public final /* synthetic */ Ref.ObjectRef c;
    public final /* synthetic */ yx d;

    public bx(f61 f61Var, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, yx yxVar) {
        this.a = f61Var;
        this.b = booleanRef;
        this.c = objectRef;
        this.d = yxVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b2 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00aa, B:37:0x00b2), top: B:53:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(sw swVar, gs gsVar) throws Throwable {
        ax axVar;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        yx yxVar;
        h61 h61Var;
        f61 f61Var;
        Function2 function2;
        f61 f61Var2;
        f61 f61Var3;
        Ref.ObjectRef objectRef2;
        Object obj;
        f61 f61Var4;
        if (gsVar instanceof ax) {
            axVar = (ax) gsVar;
            int i = axVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                axVar.v = i - Integer.MIN_VALUE;
            } else {
                axVar = new ax(this, gsVar);
            }
        } else {
            axVar = new ax(this, gsVar);
        }
        Object obj2 = axVar.f;
        ft ftVar = ft.a;
        int i2 = axVar.v;
        try {
            if (i2 == 0) {
                zi0.B(obj2);
                axVar.a = swVar;
                f61 f61Var5 = this.a;
                axVar.b = f61Var5;
                booleanRef = this.b;
                axVar.c = booleanRef;
                objectRef = this.c;
                axVar.d = objectRef;
                yxVar = this.d;
                axVar.e = yxVar;
                axVar.v = 1;
                h61Var = (h61) f61Var5;
                if (h61Var.d(axVar) != ftVar) {
                }
                function2 = swVar;
                f61Var = h61Var;
                return ftVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = axVar.c;
                    objectRef2 = (Ref.ObjectRef) axVar.b;
                    f61Var2 = (f61) axVar.a;
                    try {
                        zi0.B(obj2);
                        f61Var4 = f61Var2;
                        objectRef2.element = obj;
                        f61Var2 = f61Var4;
                        Object obj3 = objectRef2.element;
                        ((h61) f61Var2).g(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        ((h61) f61Var2).g(null);
                        throw th;
                    }
                }
                yxVar = (yx) axVar.c;
                objectRef2 = (Ref.ObjectRef) axVar.b;
                f61Var3 = (f61) axVar.a;
                try {
                    zi0.B(obj2);
                    f61Var3 = f61Var3;
                    if (!Intrinsics.areEqual(obj2, objectRef2.element)) {
                        axVar.a = f61Var3;
                        axVar.b = objectRef2;
                        axVar.c = obj2;
                        axVar.v = 3;
                        if (yxVar.k(obj2, false, axVar) != ftVar) {
                            obj = obj2;
                            f61Var4 = f61Var3;
                            objectRef2.element = obj;
                            f61Var2 = f61Var4;
                        }
                        function2 = swVar;
                        f61Var = h61Var;
                        return ftVar;
                    }
                    f61Var2 = f61Var3;
                    Object obj4 = objectRef2.element;
                    ((h61) f61Var2).g(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    f61Var2 = f61Var3;
                    ((h61) f61Var2).g(null);
                    throw th;
                }
            }
            yxVar = axVar.e;
            Ref.ObjectRef objectRef3 = axVar.d;
            booleanRef = (Ref.BooleanRef) axVar.c;
            f61 f61Var6 = (f61) axVar.b;
            Function2 function3 = (Function2) axVar.a;
            zi0.B(obj2);
            objectRef = objectRef3;
            function2 = function3;
            f61Var = f61Var6;
            function2 = swVar;
            f61Var = h61Var;
            if (booleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = objectRef.element;
            axVar.a = f61Var;
            axVar.b = objectRef;
            axVar.c = yxVar;
            axVar.d = null;
            axVar.e = null;
            axVar.v = 2;
            Object objInvoke = function2.invoke(obj5, axVar);
            if (objInvoke != ftVar) {
                f61Var3 = f61Var;
                obj2 = objInvoke;
                objectRef2 = objectRef;
                if (!Intrinsics.areEqual(obj2, objectRef2.element)) {
                    axVar.a = f61Var3;
                    axVar.b = objectRef2;
                    axVar.c = obj2;
                    axVar.v = 3;
                    if (yxVar.k(obj2, false, axVar) != ftVar) {
                        obj = obj2;
                        f61Var4 = f61Var3;
                        objectRef2.element = obj;
                        f61Var2 = f61Var4;
                    }
                } else {
                    f61Var2 = f61Var3;
                }
                Object obj6 = objectRef2.element;
                ((h61) f61Var2).g(null);
                return obj6;
            }
            function2 = swVar;
            f61Var = h61Var;
            return ftVar;
        } catch (Throwable th3) {
            th = th3;
            f61Var2 = f61Var;
            ((h61) f61Var2).g(null);
            throw th;
        }
    }
}
