package defpackage;

import androidx.lifecycle.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class at0 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ at0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((bt0) ((CallableReference) this).receiver).r((Throwable) obj);
                break;
            case 1:
                ((b) ((CallableReference) this).receiver).j((String) obj);
                break;
            default:
                ((b) ((CallableReference) this).receiver).j((String) obj);
                break;
        }
        return Unit.a;
    }
}
