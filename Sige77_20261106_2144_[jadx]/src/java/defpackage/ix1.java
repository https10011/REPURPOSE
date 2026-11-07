package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ix1 {
    public static final vy2 a = new vy2("NO_THREAD_ELEMENTS", 4);
    public static final uo b = new uo(6);
    public static final uo c = new uo(7);
    public static final uo d = new uo(8);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof lx1)) {
            coroutineContext.fold((Object) null, c).getClass();
            ur.a();
            return;
        }
        hx1[] hx1VarArr = ((lx1) obj).c;
        int length = hx1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        hx1 hx1Var = hx1VarArr[length];
        throw null;
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new lx1(((Number) obj).intValue(), coroutineContext), d);
        }
        ur.a();
        return null;
    }
}
