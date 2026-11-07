package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uv1 implements vv0, Serializable {
    public Function0 a;
    public volatile Object b;
    public final Object c;

    public uv1(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        function0.getClass();
        this.a = function0;
        this.b = f22.a;
        this.c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new cq0(getValue());
    }

    @Override // defpackage.vv0
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        f22 f22Var = f22.a;
        if (obj != f22Var) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == f22Var) {
                Function0 function0 = this.a;
                function0.getClass();
                objInvoke = function0.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.b != f22.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
