package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import java.net.URLEncoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ux extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux(Object obj, int i) {
        super(1);
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        r91 r91Var = null;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                yx yxVar = (yx) this.b;
                if (th != null) {
                    yxVar.v.o(new xb0(th));
                }
                if (yxVar.W.b != f22.a) {
                    ((gb0) yxVar.W.getValue()).close();
                }
                return Unit.a;
            case 1:
                String str = (String) obj;
                Object objOpt = ((JSONObject) this.b).opt(str);
                if (objOpt == null) {
                    return null;
                }
                try {
                    return URLEncoder.encode(str, "UTF-8") + '=' + URLEncoder.encode(objOpt.toString(), "UTF-8");
                } catch (Exception unused) {
                    return null;
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((Context) obj).getClass();
                Context context = (Context) this.b;
                context.getClass();
                MeasurementManager measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                return new u21(measurementManager);
            default:
                String str2 = (String) obj;
                str2.getClass();
                r91 r91Var2 = ((cd1) this.b).L0;
                if (r91Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    r91Var = r91Var2;
                }
                r91Var.g.j(str2);
                return Unit.a;
        }
    }
}
