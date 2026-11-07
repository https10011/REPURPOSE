package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jx implements id0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    @Override // defpackage.id0
    public final Object a(Object obj, fs fsVar) throws Throwable {
        ix ixVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (fsVar instanceof ix) {
                    ixVar = (ix) fsVar;
                    int i2 = ixVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ixVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        ixVar = new ix(this, fsVar);
                    }
                } else {
                    ixVar = new ix(this, fsVar);
                }
                Object obj3 = ixVar.a;
                ft ftVar = ft.a;
                int i3 = ixVar.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        zi0.B(obj3);
                        return Unit.a;
                    }
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zi0.B(obj3);
                id0 id0Var = (id0) obj2;
                kt1 kt1Var = (kt1) obj;
                if (kt1Var instanceof jf1) {
                    throw ((jf1) kt1Var).b;
                }
                if (!(kt1Var instanceof dw)) {
                    if (!(kt1Var instanceof xb0 ? true : kt1Var instanceof j22)) {
                        throw new e71();
                    }
                    uq1.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                Object obj4 = ((dw) kt1Var).b;
                ixVar.b = 1;
                if (id0Var.a(obj4, ixVar) == ftVar) {
                    return ftVar;
                }
                return Unit.a;
            case 1:
                yx yxVar = (yx) obj2;
                if (yxVar.v.a() instanceof xb0) {
                    return Unit.a;
                }
                Object objE = yx.e(yxVar, true, fsVar);
                return objE == ft.a ? objE : Unit.a;
            default:
                ((Ref.ObjectRef) obj2).element = obj;
                throw new u(this);
        }
    }
}
