package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vx extends Lambda implements Function2 {
    public static final vx a = new vx(2);

    public final Object invoke(Object obj, Object obj2) {
        g41 g41Var = (g41) obj;
        Throwable cancellationException = (Throwable) obj2;
        g41Var.getClass();
        cp cpVar = g41Var.b;
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        cpVar.V(cancellationException);
        return Unit.a;
    }
}
