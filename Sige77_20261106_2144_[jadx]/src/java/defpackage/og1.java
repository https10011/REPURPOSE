package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class og1 extends k42 {
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og1(int i) {
        super(8);
        this.Z = i;
    }

    @Override // defpackage.k42
    public String d(Method method, int i) {
        switch (this.Z) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    return super.d(method, i);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.d(method, i);
        }
    }

    @Override // defpackage.k42
    public final Object i(Object obj, Method method, Object[] objArr) {
        switch (this.Z) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return y21.i(obj, method, objArr);
                }
                sm0.h("Calling default methods on API 24 and 25 is not supported");
                return null;
            default:
                return y21.i(obj, method, objArr);
        }
    }

    @Override // defpackage.k42
    public final boolean j(Method method) {
        switch (this.Z) {
            case 0:
                break;
        }
        return method.isDefault();
    }
}
