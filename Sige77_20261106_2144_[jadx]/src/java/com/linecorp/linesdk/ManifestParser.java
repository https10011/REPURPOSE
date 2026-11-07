package com.linecorp.linesdk;

import android.content.Context;
import android.os.Bundle;
import com.hjq.toast.BuildConfig;
import com.linecorp.linesdk.api.LineEnvConfig;
import defpackage.oc1;
import defpackage.pj1;
import defpackage.qj1;
import defpackage.rj1;
import defpackage.sm0;
import kotlin.Metadata;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/linecorp/linesdk/ManifestParser;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/linecorp/linesdk/api/LineEnvConfig;", "parse", "(Landroid/content/Context;)Lcom/linecorp/linesdk/api/LineEnvConfig;", "line-sdk_release"}, k = 1, mv = {1, oc1.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
public final class ManifestParser {
    public final LineEnvConfig parse(Context context) {
        Object qj1Var;
        String string;
        context.getClass();
        try {
            pj1 pj1Var = rj1.b;
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || (string = bundle.getString("LineEnvConfig")) == null) {
                qj1Var = null;
            } else {
                try {
                    Class<?> cls = Class.forName(string);
                    try {
                        Object objNewInstance = cls.newInstance();
                        objNewInstance.getClass();
                        if (objNewInstance instanceof LineEnvConfig) {
                            qj1Var = (LineEnvConfig) objNewInstance;
                        } else {
                            sm0.u(objNewInstance, "Expected instanceof LineEnvConfig, but found: ");
                            qj1Var = null;
                        }
                    } catch (ReflectiveOperationException e) {
                        sm0.l("Unable to instantiate LineEnvConfig implementation for ", cls, e);
                    }
                } catch (ClassNotFoundException e2) {
                    throw new IllegalArgumentException("Unable to find LineEnvConfig implementation", e2);
                }
            }
        } catch (Throwable th) {
            pj1 pj1Var2 = rj1.b;
            qj1Var = new qj1(th);
        }
        return (LineEnvConfig) (qj1Var instanceof qj1 ? null : qj1Var);
    }
}
