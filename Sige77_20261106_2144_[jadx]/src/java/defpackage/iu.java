package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class iu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Ref.ObjectRef c;

    public /* synthetic */ iu(Function1 function1, Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = function1;
        this.c = objectRef;
    }

    public final Object invoke() {
        int i = this.a;
        Ref.ObjectRef objectRef = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(objectRef.element);
                break;
            default:
                function1.invoke(objectRef.element);
                break;
        }
        return Unit.a;
    }
}
