package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sp extends xj {
    @Override // defpackage.xj
    public final yj a(Type type, Annotation[] annotationArr) {
        if (ta.m(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            uq1.q("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeL = ta.l(0, (ParameterizedType) type);
        if (ta.m(typeL) != gj1.class) {
            return new ox1(typeL);
        }
        if (typeL instanceof ParameterizedType) {
            return new pv2(ta.l(0, (ParameterizedType) typeL));
        }
        uq1.q("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
