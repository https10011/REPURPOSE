package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class bt0 extends uz0 implements n20, up0 {
    public lt0 i;

    @Override // defpackage.n20
    public final void a() {
        p().M(this);
    }

    @Override // defpackage.up0
    public final f71 c() {
        return null;
    }

    public ws0 getParent() {
        return p();
    }

    @Override // defpackage.up0
    public final boolean isActive() {
        return true;
    }

    public final lt0 p() {
        lt0 lt0Var = this.i;
        if (lt0Var != null) {
            return lt0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract boolean q();

    public abstract void r(Throwable th);

    @Override // defpackage.uz0
    public final String toString() {
        return getClass().getSimpleName() + '@' + qt.j(this) + "[job@" + qt.j(p()) + ']';
    }
}
