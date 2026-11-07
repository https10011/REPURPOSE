package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class na extends Lambda implements Function2 {
    public final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(List list) {
        super(2);
        this.a = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        try {
            i90.c().execute(new x4(7, (Integer) obj2, this.a));
        } catch (Exception unused) {
        }
        return Unit.a;
    }
}
