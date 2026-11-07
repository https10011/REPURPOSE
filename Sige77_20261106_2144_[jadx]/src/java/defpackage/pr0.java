package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pr0 extends gs {
    public int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ fs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(fs fsVar, CoroutineContext coroutineContext, Function2 function2, fs fsVar2) {
        super(fsVar, coroutineContext);
        this.b = function2;
        this.c = fsVar2;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.a = 1;
            zi0.B(obj);
            Function2 function2 = this.b;
            function2.getClass();
            return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(this.c, this);
        }
        if (i != 1) {
            uq1.q("This coroutine had already completed");
            return null;
        }
        this.a = 2;
        zi0.B(obj);
        return obj;
    }
}
