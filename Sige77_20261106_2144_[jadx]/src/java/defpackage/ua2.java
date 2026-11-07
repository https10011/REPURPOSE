package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ua2 extends p implements ya2 {
    public final /* synthetic */ int a = 0;
    public m40 b;
    public Object c;
    public Object d;

    public ua2(m40 m40Var, byte[] bArr) {
        byte[] bArr2;
        this.b = m40Var;
        if (bArr == null) {
            bArr2 = null;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            bArr2 = bArr3;
        }
        this.c = new zv(bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    @Override // defpackage.p
    public final r a() {
        byte[] bArr;
        int iV;
        byte[] byteArray;
        byte[] bArr2;
        byte[] bArr3;
        int iV2;
        byte[] byteArray2;
        byte[] bArr4;
        switch (this.a) {
            case 0:
                m40 m40Var = this.b;
                gk1 gk1Var = new gk1(2);
                if (((q) this.d).equals(ya2.j)) {
                    r93 r93Var = m40Var.b;
                    int iV3 = (r93Var.v() + 7) / 8;
                    byte[] byteArray3 = r93Var.g0().toByteArray();
                    if (iV3 < byteArray3.length) {
                        bArr3 = new byte[iV3];
                        System.arraycopy(byteArray3, byteArray3.length - iV3, bArr3, 0, iV3);
                    } else {
                        if (iV3 > byteArray3.length) {
                            bArr3 = new byte[iV3];
                            System.arraycopy(byteArray3, 0, bArr3, iV3 - byteArray3.length, byteArray3.length);
                        }
                        gk1Var.k(new zv(byteArray3));
                        r93 r93Var2 = m40Var.c;
                        iV2 = (r93Var2.v() + 7) / 8;
                        byteArray2 = r93Var2.g0().toByteArray();
                        if (iV2 < byteArray2.length) {
                            bArr4 = new byte[iV2];
                            System.arraycopy(byteArray2, byteArray2.length - iV2, bArr4, 0, iV2);
                        } else {
                            if (iV2 > byteArray2.length) {
                                bArr4 = new byte[iV2];
                                System.arraycopy(byteArray2, 0, bArr4, iV2 - byteArray2.length, byteArray2.length);
                            }
                            gk1Var.k(new zv(byteArray2));
                        }
                        byteArray2 = bArr4;
                        gk1Var.k(new zv(byteArray2));
                    }
                    byteArray3 = bArr3;
                    gk1Var.k(new zv(byteArray3));
                    r93 r93Var3 = m40Var.c;
                    iV2 = (r93Var3.v() + 7) / 8;
                    byteArray2 = r93Var3.g0().toByteArray();
                    if (iV2 < byteArray2.length) {
                        bArr4 = new byte[iV2];
                        System.arraycopy(byteArray2, byteArray2.length - iV2, bArr4, 0, iV2);
                    } else {
                        if (iV2 > byteArray2.length) {
                            bArr4 = new byte[iV2];
                            System.arraycopy(byteArray2, 0, bArr4, iV2 - byteArray2.length, byteArray2.length);
                        }
                        gk1Var.k(new zv(byteArray2));
                    }
                    byteArray2 = bArr4;
                    gk1Var.k(new zv(byteArray2));
                } else if (((q) this.d).equals(ya2.k)) {
                    r93 r93Var4 = m40Var.b;
                    int iV4 = (r93Var4.v() + 7) / 8;
                    byte[] byteArray4 = r93Var4.g0().toByteArray();
                    if (iV4 < byteArray4.length) {
                        bArr = new byte[iV4];
                        System.arraycopy(byteArray4, byteArray4.length - iV4, bArr, 0, iV4);
                    } else {
                        if (iV4 > byteArray4.length) {
                            bArr = new byte[iV4];
                            System.arraycopy(byteArray4, 0, bArr, iV4 - byteArray4.length, byteArray4.length);
                        }
                        gk1Var.k(new zv(byteArray4));
                        r93 r93Var5 = m40Var.c;
                        iV = (r93Var5.v() + 7) / 8;
                        byteArray = r93Var5.g0().toByteArray();
                        if (iV < byteArray.length) {
                            bArr2 = new byte[iV];
                            System.arraycopy(byteArray, byteArray.length - iV, bArr2, 0, iV);
                        } else {
                            if (iV > byteArray.length) {
                                bArr2 = new byte[iV];
                                System.arraycopy(byteArray, 0, bArr2, iV - byteArray.length, byteArray.length);
                            }
                            gk1Var.k(new zv(byteArray));
                        }
                        byteArray = bArr2;
                        gk1Var.k(new zv(byteArray));
                    }
                    byteArray4 = bArr;
                    gk1Var.k(new zv(byteArray4));
                    r93 r93Var6 = m40Var.c;
                    iV = (r93Var6.v() + 7) / 8;
                    byteArray = r93Var6.g0().toByteArray();
                    if (iV < byteArray.length) {
                        bArr2 = new byte[iV];
                        System.arraycopy(byteArray, byteArray.length - iV, bArr2, 0, iV);
                    } else {
                        if (iV > byteArray.length) {
                            bArr2 = new byte[iV];
                            System.arraycopy(byteArray, 0, bArr2, iV - byteArray.length, byteArray.length);
                        }
                        gk1Var.k(new zv(byteArray));
                    }
                    byteArray = bArr2;
                    gk1Var.k(new zv(byteArray));
                }
                byte[] bArr5 = (byte[]) this.c;
                if (bArr5 != null) {
                    gk1Var.k(new yv(bArr5));
                }
                return new bw(gk1Var);
            default:
                return (zv) this.c;
        }
    }

    public /* synthetic */ ua2() {
    }
}
