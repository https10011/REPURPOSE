package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qk2 {
    public static final qk2 b = new qk2(0);
    public static final qk2 c = new qk2(1);
    public static final qk2 d = new qk2(2);
    public static final qk2 e = new qk2(3);
    public static final qk2 f = new qk2(4);
    public static final qk2 g = new qk2(5);
    public static final qk2 h = new qk2(6);
    public static final qk2 i = new qk2(7);
    public static final qk2 j = new qk2(8);
    public static final qk2 k = new qk2(9);
    public static final qk2 l = new qk2(10);
    public static final qk2 m = new qk2(11);
    public static final qk2 n = new qk2(12);
    public static final qk2 o = new qk2(13);
    public static final qk2 p = new qk2(14);
    public final /* synthetic */ int a;

    public /* synthetic */ qk2(int i2) {
        this.a = i2;
    }

    public final boolean a(int i2) {
        switch (this.a) {
            case 0:
                return rk2.a(i2) != null;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                switch (i2) {
                    case 0:
                    case 1:
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        return true;
                    default:
                        return false;
                }
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return gb2.J(i2) != 0;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1;
            case 10:
                return i2 == 1 || i2 == 2;
            case 11:
                return ck1.j(i2) != 0;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
