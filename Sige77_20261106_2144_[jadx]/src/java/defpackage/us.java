package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.c;
import com.facebook.login.h;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class us extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us(int i, Object obj, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ek ekVar = (ek) obj3;
                if (th == null) {
                    Object objR = ((f00) obj2).r();
                    ekVar.d = true;
                    gk gkVar = ekVar.b;
                    if (gkVar != null && gkVar.b.j(objR)) {
                        ekVar.a = null;
                        ekVar.b = null;
                        ekVar.c = null;
                    }
                } else if (th instanceof CancellationException) {
                    ekVar.d = true;
                    gk gkVar2 = ekVar.b;
                    if (gkVar2 != null && gkVar2.b.cancel(true)) {
                        ekVar.a = null;
                        ekVar.b = null;
                        ekVar.c = null;
                    }
                } else {
                    ekVar.d = true;
                    gk gkVar3 = ekVar.b;
                    if (gkVar3 != null && gkVar3.b.k(th)) {
                        ekVar.a = null;
                        ekVar.b = null;
                        ekVar.c = null;
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i2 = activityResult.a;
                if (i2 == -1) {
                    ((h) obj3).P().j(ts.a(1), i2, activityResult.b);
                } else {
                    ((c) obj2).finish();
                }
                break;
            default:
                ((c31) obj3).j(((yg0) obj2).apply(obj));
                break;
        }
        return Unit.a;
    }
}
