package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class nj3 implements bc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bg3 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ nj3(bg3 bg3Var, int i, ArrayList arrayList) {
        this.b = bg3Var;
        this.d = i;
        this.c = arrayList;
    }

    @Override // defpackage.bc
    public final ListenableFuture apply(Object obj) {
        int i = this.a;
        int i2 = this.d;
        ArrayList arrayList = this.c;
        bg3 bg3Var = this.b;
        int i3 = 0;
        switch (i) {
            case 0:
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i4 = 0; i4 < i2; i4++) {
                    if (((Boolean) dh0.b((Future) arrayList.get(i4))).booleanValue()) {
                        ((List) bg3Var.b).get(i4).getClass();
                        ur.a();
                        return null;
                    }
                }
                ro0 ro0VarI = ro0.i(arrayList2);
                zj zjVar = new zj(i3);
                yo yoVar = new yo(ro0VarI, true);
                yoVar.a0 = new xo(yoVar, zjVar);
                yoVar.s();
                return yoVar;
            default:
                ro0 ro0VarI2 = ro0.i(arrayList);
                rd2 rd2VarA = to3.a(new ll3(bg3Var, (wk2) obj, i2, arrayList));
                Executor executor = (Executor) bg3Var.c;
                yo yoVar2 = new yo(ro0VarI2, false);
                yoVar2.a0 = new xo(yoVar2, rd2VarA, executor);
                yoVar2.s();
                return yoVar2;
        }
    }

    public /* synthetic */ nj3(bg3 bg3Var, ArrayList arrayList, int i) {
        this.b = bg3Var;
        this.c = arrayList;
        this.d = i;
    }
}
