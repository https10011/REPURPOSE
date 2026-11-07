package defpackage;

import androidx.activity.a;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t81 extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t81(a aVar, int i) {
        super(1);
        this.a = i;
        this.b = aVar;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = null;
        a aVar = this.b;
        switch (i) {
            case 0:
                ((oe) obj).getClass();
                fb fbVar = aVar.b;
                ListIterator listIterator = fbVar.listIterator(fbVar.a());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((cg0) objPrevious).a) {
                        obj2 = objPrevious;
                        aVar.c = (cg0) obj2;
                        break;
                    }
                }
                aVar.c = (cg0) obj2;
                break;
            default:
                ((oe) obj).getClass();
                fb fbVar2 = aVar.b;
                ListIterator listIterator2 = fbVar2.listIterator(fbVar2.a());
                while (listIterator2.hasPrevious()) {
                    Object objPrevious2 = listIterator2.previous();
                    if (((cg0) objPrevious2).a) {
                        obj2 = objPrevious2;
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
