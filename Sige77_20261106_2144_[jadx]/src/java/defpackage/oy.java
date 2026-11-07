package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oy extends xj {
    public final Executor a;

    public oy(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.xj
    public final yj a(Type type, Annotation[] annotationArr) {
        if (ta.m(type) != wj.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new vf3(2, ta.l(0, (ParameterizedType) type), ta.q(annotationArr, or1.class) ? null : this.a, false);
        }
        e.g("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
