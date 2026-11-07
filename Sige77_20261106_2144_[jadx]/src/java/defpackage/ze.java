package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ze implements fs, gt, Serializable {
    private final fs<Object> completion;

    public ze(fs fsVar) {
        this.completion = fsVar;
    }

    public fs<Unit> create(fs<?> fsVar) {
        fsVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public gt getCallerFrame() {
        fs<Object> fsVar = this.completion;
        if (fsVar instanceof gt) {
            return (gt) fsVar;
        }
        return null;
    }

    public final fs<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        fy fyVar = (fy) getClass().getAnnotation(fy.class);
        String str = null;
        if (fyVar == null || fyVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? fyVar.l()[iIntValue] : -1;
        m51.a.getClass();
        l51 l51Var = m51.c;
        l51 l51Var2 = m51.b;
        if (l51Var == null) {
            try {
                l51 l51Var3 = new l51(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                m51.c = l51Var3;
                l51Var = l51Var3;
            } catch (Exception unused2) {
                m51.c = l51Var2;
                l51Var = l51Var2;
            }
        }
        if (l51Var != l51Var2 && (method = l51Var.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = l51Var.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = l51Var.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = fyVar.c();
        } else {
            strC = str + '/' + fyVar.c();
        }
        return new StackTraceElement(strC, fyVar.m(), fyVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.fs
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            ze zeVar = (ze) r2;
            fs<Object> fsVar = zeVar.completion;
            fsVar.getClass();
            try {
                obj = zeVar.invokeSuspend(obj);
                if (obj == ft.a) {
                    return;
                } else {
                    pj1 pj1Var = rj1.b;
                }
            } catch (Throwable th) {
                pj1 pj1Var2 = rj1.b;
                obj = new qj1(th);
            }
            zeVar.releaseIntercepted();
            if (!(fsVar instanceof ze)) {
                fsVar.resumeWith(obj);
                return;
            }
            r2 = fsVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public fs<Unit> create(Object obj, fs<?> fsVar) {
        fsVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
