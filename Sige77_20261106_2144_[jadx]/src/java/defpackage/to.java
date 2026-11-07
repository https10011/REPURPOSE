package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class to implements Function2 {
    public final /* synthetic */ CoroutineContext[] a;
    public final /* synthetic */ Ref.IntRef b;

    public /* synthetic */ to(CoroutineContext[] coroutineContextArr, Ref.IntRef intRef) {
        this.a = coroutineContextArr;
        this.b = intRef;
    }

    public final Object invoke(Object obj, Object obj2) {
        CoroutineContext coroutineContext = (CoroutineContext.Element) obj2;
        ((Unit) obj).getClass();
        coroutineContext.getClass();
        Ref.IntRef intRef = this.b;
        int i = intRef.element;
        intRef.element = i + 1;
        this.a[i] = coroutineContext;
        return Unit.a;
    }
}
