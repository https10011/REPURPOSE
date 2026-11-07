package defpackage;

import java.io.FileInputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bb0 extends gs {
    public Object a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cb0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(cb0 cb0Var, gs gsVar) {
        super(gsVar);
        this.d = cb0Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return cb0.a(this.d, this);
    }
}
