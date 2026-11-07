package defpackage;

import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ax extends gs {
    public Object a;
    public Object b;
    public Object c;
    public Ref.ObjectRef d;
    public yx e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bx i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(bx bxVar, gs gsVar) {
        super(gsVar);
        this.i = bxVar;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
