package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zy2 extends uz2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy2(aa0 aa0Var, Activity activity, xw2 xw2Var) {
        super((b03) aa0Var.b, true);
        this.e = 4;
        this.i = activity;
        this.v = xw2Var;
        this.f = aa0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    @Override // defpackage.uz2
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle = null;
        bx2 bx2VarAsInterface = null;
        switch (this.e) {
            case 0:
                try {
                    Context context = (Context) this.i;
                    gu2.o(context);
                    String strN0 = r93.n0(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strN0)) {
                        strN0 = r93.n0(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strN0);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    b03 b03Var = (b03) this.f;
                    Object[] objArr = boolValueOf == null || !boolValueOf.booleanValue();
                    b03Var.getClass();
                    try {
                        bx2VarAsInterface = ax2.asInterface(h40.c(context, objArr != false ? h40.c : h40.b, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (d40 e) {
                        b03Var.b(e, true, false);
                    }
                    b03Var.e = bx2VarAsInterface;
                    if (b03Var.e != null) {
                        int iA = h40.a(context, "com.google.android.gms.measurement.dynamite");
                        int iD = h40.d(context, "com.google.android.gms.measurement.dynamite", false);
                        int iMax = Math.max(iA, iD);
                        boolean z = Boolean.TRUE.equals(boolValueOf) || iD < iA;
                        long j = iMax;
                        b03Var.f = j;
                        zzdb zzdbVar = new zzdb(161000L, j, z, (Bundle) this.v, r93.n0(context));
                        Object[] objArr2 = b03Var.f >= 169;
                        bx2 bx2Var = b03Var.e;
                        if (objArr2 != true) {
                            gu2.o(bx2Var);
                            bx2Var.initialize(new e81(context), zzdbVar, this.a);
                        } else {
                            gu2.o(bx2Var);
                            bx2Var.initializeWithElapsedTime(new e81(context), zzdbVar, this.a, this.b);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((b03) this.f).b(e2, true, false);
                    return;
                }
                break;
            case 1:
                bx2 bx2Var2 = ((b03) this.f).e;
                gu2.o(bx2Var2);
                bx2Var2.logHealthData(5, (String) this.i, new e81(this.v), new e81(null), new e81(null));
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                bx2 bx2Var3 = ((b03) this.f).e;
                gu2.o(bx2Var3);
                bx2Var3.getMaxUserProperties((String) this.i, (xw2) this.v);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Bundle bundle2 = (Bundle) this.v;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                bx2 bx2Var4 = ((b03) ((aa0) this.f).b).e;
                gu2.o(bx2Var4);
                bx2Var4.onActivityCreatedByScionActivityInfo(zzdd.R((Activity) this.i), bundle, this.b);
                break;
            default:
                bx2 bx2Var5 = ((b03) ((aa0) this.f).b).e;
                gu2.o(bx2Var5);
                bx2Var5.onActivitySaveInstanceStateByScionActivityInfo(zzdd.R((Activity) this.i), (xw2) this.v, this.b);
                break;
        }
    }

    @Override // defpackage.uz2
    public void b() {
        switch (this.e) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((xw2) this.v).k(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy2(b03 b03Var, Object obj, Object obj2, int i) {
        super(b03Var, true);
        this.e = i;
        this.i = obj;
        this.v = obj2;
        this.f = b03Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy2(aa0 aa0Var, Bundle bundle, Activity activity) {
        super((b03) aa0Var.b, true);
        this.e = 3;
        this.v = bundle;
        this.i = activity;
        this.f = aa0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy2(b03 b03Var, String str, Object obj) {
        super(b03Var, false);
        this.e = 1;
        this.i = str;
        this.v = obj;
        this.f = b03Var;
    }
}
