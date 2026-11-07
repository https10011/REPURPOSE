package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class at1 {
    public static final /* synthetic */ int a = 0;

    static {
        Object qj1Var;
        Object qj1Var2;
        Exception exc = new Exception();
        String simpleName = gb2.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            pj1 pj1Var = rj1.b;
            qj1Var = ze.class.getCanonicalName();
        } catch (Throwable th) {
            pj1 pj1Var2 = rj1.b;
            qj1Var = new qj1(th);
        }
        if (rj1.a(qj1Var) != null) {
            qj1Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            qj1Var2 = at1.class.getCanonicalName();
        } catch (Throwable th2) {
            pj1 pj1Var3 = rj1.b;
            qj1Var2 = new qj1(th2);
        }
        if (rj1.a(qj1Var2) != null) {
            qj1Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
