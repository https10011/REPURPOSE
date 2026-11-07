package defpackage;

import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wx extends gs {
    public Ref.IntRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yx c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(yx yxVar, gs gsVar) {
        super(gsVar);
        this.c = yxVar;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, false, this);
    }
}
