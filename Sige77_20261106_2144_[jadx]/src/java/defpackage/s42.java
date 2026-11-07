package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class s42 extends r42 {
    public lb1[] a;
    public String b;
    public int c;

    public s42(s42 s42Var) {
        this.a = null;
        this.c = 0;
        this.b = s42Var.b;
        lb1[] lb1VarArr = s42Var.a;
        lb1[] lb1VarArr2 = new lb1[lb1VarArr.length];
        for (int i = 0; i < lb1VarArr.length; i++) {
            lb1VarArr2[i] = new lb1(lb1VarArr[i]);
        }
        this.a = lb1VarArr2;
    }

    public lb1[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(lb1[] lb1VarArr) {
        lb1[] lb1VarArr2 = this.a;
        if (lb1VarArr2 != null && lb1VarArr != null && lb1VarArr2.length == lb1VarArr.length) {
            int i = 0;
            while (true) {
                if (i >= lb1VarArr2.length) {
                    lb1[] lb1VarArr3 = this.a;
                    for (int i2 = 0; i2 < lb1VarArr.length; i2++) {
                        lb1VarArr3[i2].a = lb1VarArr[i2].a;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = lb1VarArr[i2].b;
                            if (i3 < fArr.length) {
                                lb1VarArr3[i2].b[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                lb1 lb1Var = lb1VarArr2[i];
                char c = lb1Var.a;
                lb1 lb1Var2 = lb1VarArr[i];
                if (c != lb1Var2.a || lb1Var.b.length != lb1Var2.b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        lb1[] lb1VarArr4 = new lb1[lb1VarArr.length];
        for (int i4 = 0; i4 < lb1VarArr.length; i4++) {
            lb1VarArr4[i4] = new lb1(lb1VarArr[i4]);
        }
        this.a = lb1VarArr4;
    }

    public s42() {
        this.a = null;
        this.c = 0;
    }
}
