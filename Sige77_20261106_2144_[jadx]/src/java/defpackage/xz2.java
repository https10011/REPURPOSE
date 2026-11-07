package defpackage;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xz2 extends uz2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ aa0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(aa0 aa0Var, Activity activity, int i) {
        super((b03) aa0Var.b, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = activity;
                this.i = aa0Var;
                super((b03) aa0Var.b, true);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.f = activity;
                this.i = aa0Var;
                super((b03) aa0Var.b, true);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                this.f = activity;
                this.i = aa0Var;
                super((b03) aa0Var.b, true);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                this.f = activity;
                this.i = aa0Var;
                super((b03) aa0Var.b, true);
                break;
            default:
                this.f = activity;
                this.i = aa0Var;
                break;
        }
    }

    @Override // defpackage.uz2
    public final void a() {
        switch (this.e) {
            case 0:
                bx2 bx2Var = ((b03) this.i.b).e;
                gu2.o(bx2Var);
                bx2Var.onActivityStartedByScionActivityInfo(zzdd.R(this.f), this.b);
                break;
            case 1:
                bx2 bx2Var2 = ((b03) this.i.b).e;
                gu2.o(bx2Var2);
                bx2Var2.onActivityResumedByScionActivityInfo(zzdd.R(this.f), this.b);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                bx2 bx2Var3 = ((b03) this.i.b).e;
                gu2.o(bx2Var3);
                bx2Var3.onActivityPausedByScionActivityInfo(zzdd.R(this.f), this.b);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                bx2 bx2Var4 = ((b03) this.i.b).e;
                gu2.o(bx2Var4);
                bx2Var4.onActivityStoppedByScionActivityInfo(zzdd.R(this.f), this.b);
                break;
            default:
                bx2 bx2Var5 = ((b03) this.i.b).e;
                gu2.o(bx2Var5);
                bx2Var5.onActivityDestroyedByScionActivityInfo(zzdd.R(this.f), this.b);
                break;
        }
    }
}
