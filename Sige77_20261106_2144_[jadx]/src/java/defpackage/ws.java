package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class ws implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ws(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ys ysVar = (CoroutineContext.Element) obj;
                if (ysVar instanceof ys) {
                    return ysVar;
                }
                return null;
            case 1:
                ((ot) obj).getClass();
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((ot) obj).getClass();
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((ot) obj).getClass();
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ((ot) obj).getClass();
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
