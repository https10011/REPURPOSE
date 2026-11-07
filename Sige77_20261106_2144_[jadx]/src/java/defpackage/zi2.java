package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zi2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ xx2 d;

    public /* synthetic */ zi2(xx2 xx2Var, String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = xx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        String str = this.b;
        xx2 xx2Var = this.d;
        switch (i) {
            case 0:
                xx2Var.D();
                gu2.l(str);
                mb mbVar = xx2Var.c;
                if (mbVar.isEmpty()) {
                    xx2Var.d = j;
                }
                Integer num = (Integer) mbVar.get(str);
                if (num != null) {
                    mbVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (mbVar.c < 100) {
                    mbVar.put(str, 1);
                    xx2Var.b.put(str, Long.valueOf(j));
                } else {
                    c33 c33Var = ((y53) xx2Var.a).f;
                    y53.l(c33Var);
                    c33Var.w.a("Too many ads visible");
                }
                break;
            default:
                xx2Var.D();
                gu2.l(str);
                mb mbVar2 = xx2Var.c;
                Integer num2 = (Integer) mbVar2.get(str);
                y53 y53Var = (y53) xx2Var.a;
                if (num2 == null) {
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.f.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    ua3 ua3Var = y53Var.Y;
                    c33 c33Var3 = y53Var.f;
                    y53.k(ua3Var);
                    ja3 ja3VarI = ua3Var.I(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        mbVar2.put(str, Integer.valueOf(iIntValue));
                    } else {
                        mbVar2.remove(str);
                        mb mbVar3 = xx2Var.b;
                        Long l = (Long) mbVar3.get(str);
                        if (l == null) {
                            y53.l(c33Var3);
                            c33Var3.f.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            mbVar3.remove(str);
                            xx2Var.J(str, jLongValue, ja3VarI);
                        }
                        if (mbVar2.isEmpty()) {
                            long j2 = xx2Var.d;
                            if (j2 != 0) {
                                xx2Var.I(j - j2, ja3VarI);
                                xx2Var.d = 0L;
                            } else {
                                y53.l(c33Var3);
                                c33Var3.f.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
