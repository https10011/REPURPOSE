package defpackage;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mv1 extends gs implements FunctionBase {
    private final int arity;

    public mv1(int i, fs fsVar) {
        super(fsVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.ze
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = Reflection.renderLambdaToString(this);
        strRenderLambdaToString.getClass();
        return strRenderLambdaToString;
    }
}
