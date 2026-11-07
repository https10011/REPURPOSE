package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wi extends ks {
    public final /* synthetic */ int a;

    public /* synthetic */ wi(int i) {
        this.a = i;
    }

    @Override // defpackage.ks
    public ls a(Type type) {
        switch (this.a) {
            case 0:
                if (RequestBody.class.isAssignableFrom(ta.m(type))) {
                    return xn.c;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override // defpackage.ks
    public final ls b(Type type, Annotation[] annotationArr, yj1 yj1Var) {
        switch (this.a) {
            case 0:
                if (type == ResponseBody.class) {
                    return ta.q(annotationArr, du1.class) ? ba0.v : vi.c;
                }
                if (type == Void.class) {
                    return br0.e;
                }
                if (ta.d && type == Unit.class) {
                    return op0.c;
                }
                return null;
            default:
                if (ta.m(type) != Optional.class) {
                    return null;
                }
                return new pv2(yj1Var.d(ta.l(0, (ParameterizedType) type), annotationArr));
        }
    }
}
