package defpackage;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mj1 extends lj1 implements FunctionBase {
    private final int a;

    public mj1(fs fsVar) {
        super(fsVar);
        this.a = 2;
    }

    public final int getArity() {
        return this.a;
    }

    @Override // defpackage.ze
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = Reflection.renderLambdaToString(this);
        strRenderLambdaToString.getClass();
        return strRenderLambdaToString;
    }
}
