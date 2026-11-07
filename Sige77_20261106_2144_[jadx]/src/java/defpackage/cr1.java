package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cr1 extends mv1 implements Function2 {
    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new cr1(2, fsVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cr1) create((id0) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        zi0.B(obj);
        return Unit.a;
    }
}
