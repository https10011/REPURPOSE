package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class f10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f10(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((g10) obj2).b.l(i2, obj);
                return;
            default:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj2;
                Context context = (Context) obj;
                if (mt.a.contains(ep0.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    context.getClass();
                    ((fp0) objectRef.element).a(rp0.SUBS, new dp0(i2, 1, context));
                    return;
                } catch (Throwable th) {
                    mt.a(ep0.class, th);
                    return;
                }
        }
    }
}
