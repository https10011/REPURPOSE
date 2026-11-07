package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface hl0 {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
