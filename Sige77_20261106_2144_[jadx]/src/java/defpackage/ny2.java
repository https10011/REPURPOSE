package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ny2 extends uz2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ b03 v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny2(b03 b03Var, zzdd zzddVar, String str, String str2) {
        super(b03Var, true);
        this.e = 2;
        this.w = zzddVar;
        this.f = str;
        this.i = str2;
        Objects.requireNonNull(b03Var);
        this.v = b03Var;
    }

    @Override // defpackage.uz2
    public final void a() {
        switch (this.e) {
            case 0:
                bx2 bx2Var = this.v.e;
                gu2.o(bx2Var);
                bx2Var.clearConditionalUserProperty(this.f, this.i, (Bundle) this.w);
                break;
            case 1:
                bx2 bx2Var2 = this.v.e;
                gu2.o(bx2Var2);
                bx2Var2.getConditionalUserProperties(this.f, this.i, (xw2) this.w);
                break;
            default:
                bx2 bx2Var3 = this.v.e;
                gu2.o(bx2Var3);
                bx2Var3.setCurrentScreenByScionActivityInfo((zzdd) this.w, this.f, this.i, this.a);
                break;
        }
    }

    @Override // defpackage.uz2
    public void b() {
        switch (this.e) {
            case 1:
                ((xw2) this.w).k(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny2(b03 b03Var, String str, String str2, Object obj, int i) {
        super(b03Var, true);
        this.e = i;
        this.f = str;
        this.i = str2;
        this.w = obj;
        this.v = b03Var;
    }
}
