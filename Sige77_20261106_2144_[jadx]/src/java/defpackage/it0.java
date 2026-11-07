package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class it0 extends FunctionReferenceImpl implements xg0 {
    public static final it0 a = new it0(3, lt0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.xg0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objX;
        lt0 lt0Var = (lt0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lt0.a;
        do {
            objX = lt0Var.x();
            if (!(objX instanceof up0)) {
                throw null;
            }
        } while (lt0Var.O(objX) < 0);
        ye1.q(lt0Var, true, new ft0(lt0Var));
        throw null;
    }
}
