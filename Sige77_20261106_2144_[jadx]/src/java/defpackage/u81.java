package defpackage;

import androidx.activity.a;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u81 extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u81(a aVar, int i) {
        super(0);
        this.a = i;
        this.b = aVar;
    }

    public final Object invoke() {
        Object objPrevious;
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.b();
                break;
            case 1:
                fb fbVar = aVar.b;
                ListIterator listIterator = fbVar.listIterator(fbVar.a());
                while (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (((cg0) objPrevious).a) {
                        aVar.c = null;
                        break;
                    }
                }
                objPrevious = null;
                aVar.c = null;
                break;
            default:
                aVar.b();
                break;
        }
        return Unit.a;
    }
}
