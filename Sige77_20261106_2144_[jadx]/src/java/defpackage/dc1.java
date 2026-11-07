package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dc1 extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc1(Context context, Object obj, int i) {
        super(0);
        this.a = i;
        this.b = context;
        this.c = obj;
    }

    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                context.getClass();
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(((String) ((ec1) obj).c).concat(".preferences_pb")));
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
