package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at p61.o(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:133)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:46)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yl2 {
    public static final yl2 b;
    public static final yl2 c;
    public static final yl2[] d;
    public static final /* synthetic */ yl2[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    yl2 EF0;

    static {
        ym2 ym2Var = ym2.e;
        yl2 yl2Var = new yl2("DOUBLE", 0, 0, 1, ym2Var);
        ym2 ym2Var2 = ym2.d;
        yl2 yl2Var2 = new yl2("FLOAT", 1, 1, 1, ym2Var2);
        ym2 ym2Var3 = ym2.c;
        yl2 yl2Var3 = new yl2("INT64", 2, 2, 1, ym2Var3);
        yl2 yl2Var4 = new yl2("UINT64", 3, 3, 1, ym2Var3);
        ym2 ym2Var4 = ym2.b;
        yl2 yl2Var5 = new yl2("INT32", 4, 4, 1, ym2Var4);
        yl2 yl2Var6 = new yl2("FIXED64", 5, 5, 1, ym2Var3);
        yl2 yl2Var7 = new yl2("FIXED32", 6, 6, 1, ym2Var4);
        ym2 ym2Var5 = ym2.f;
        yl2 yl2Var8 = new yl2("BOOL", 7, 7, 1, ym2Var5);
        ym2 ym2Var6 = ym2.i;
        yl2 yl2Var9 = new yl2("STRING", 8, 8, 1, ym2Var6);
        ym2 ym2Var7 = ym2.W;
        yl2 yl2Var10 = new yl2("MESSAGE", 9, 9, 1, ym2Var7);
        ym2 ym2Var8 = ym2.v;
        yl2 yl2Var11 = new yl2("BYTES", 10, 10, 1, ym2Var8);
        yl2 yl2Var12 = new yl2("UINT32", 11, 11, 1, ym2Var4);
        ym2 ym2Var9 = ym2.w;
        yl2 yl2Var13 = new yl2("ENUM", 12, 12, 1, ym2Var9);
        yl2 yl2Var14 = new yl2("SFIXED32", 13, 13, 1, ym2Var4);
        yl2 yl2Var15 = new yl2("SFIXED64", 14, 14, 1, ym2Var3);
        yl2 yl2Var16 = new yl2("SINT32", 15, 15, 1, ym2Var4);
        yl2 yl2Var17 = new yl2("SINT64", 16, 16, 1, ym2Var3);
        yl2 yl2Var18 = new yl2("GROUP", 17, 17, 1, ym2Var7);
        yl2 yl2Var19 = new yl2("DOUBLE_LIST", 18, 18, 2, ym2Var);
        yl2 yl2Var20 = new yl2("FLOAT_LIST", 19, 19, 2, ym2Var2);
        yl2 yl2Var21 = new yl2("INT64_LIST", 20, 20, 2, ym2Var3);
        yl2 yl2Var22 = new yl2("UINT64_LIST", 21, 21, 2, ym2Var3);
        yl2 yl2Var23 = new yl2("INT32_LIST", 22, 22, 2, ym2Var4);
        yl2 yl2Var24 = new yl2("FIXED64_LIST", 23, 23, 2, ym2Var3);
        yl2 yl2Var25 = new yl2("FIXED32_LIST", 24, 24, 2, ym2Var4);
        yl2 yl2Var26 = new yl2("BOOL_LIST", 25, 25, 2, ym2Var5);
        yl2 yl2Var27 = new yl2("STRING_LIST", 26, 26, 2, ym2Var6);
        yl2 yl2Var28 = new yl2("MESSAGE_LIST", 27, 27, 2, ym2Var7);
        yl2 yl2Var29 = new yl2("BYTES_LIST", 28, 28, 2, ym2Var8);
        yl2 yl2Var30 = new yl2("UINT32_LIST", 29, 29, 2, ym2Var4);
        yl2 yl2Var31 = new yl2("ENUM_LIST", 30, 30, 2, ym2Var9);
        yl2 yl2Var32 = new yl2("SFIXED32_LIST", 31, 31, 2, ym2Var4);
        yl2 yl2Var33 = new yl2("SFIXED64_LIST", 32, 32, 2, ym2Var3);
        yl2 yl2Var34 = new yl2("SINT32_LIST", 33, 33, 2, ym2Var4);
        yl2 yl2Var35 = new yl2("SINT64_LIST", 34, 34, 2, ym2Var3);
        yl2 yl2Var36 = new yl2("DOUBLE_LIST_PACKED", 35, 35, 3, ym2Var);
        b = yl2Var36;
        yl2 yl2Var37 = new yl2("FLOAT_LIST_PACKED", 36, 36, 3, ym2Var2);
        yl2 yl2Var38 = new yl2("INT64_LIST_PACKED", 37, 37, 3, ym2Var3);
        yl2 yl2Var39 = new yl2("UINT64_LIST_PACKED", 38, 38, 3, ym2Var3);
        yl2 yl2Var40 = new yl2("INT32_LIST_PACKED", 39, 39, 3, ym2Var4);
        yl2 yl2Var41 = new yl2("FIXED64_LIST_PACKED", 40, 40, 3, ym2Var3);
        yl2 yl2Var42 = new yl2("FIXED32_LIST_PACKED", 41, 41, 3, ym2Var4);
        yl2 yl2Var43 = new yl2("BOOL_LIST_PACKED", 42, 42, 3, ym2Var5);
        yl2 yl2Var44 = new yl2("UINT32_LIST_PACKED", 43, 43, 3, ym2Var4);
        yl2 yl2Var45 = new yl2("ENUM_LIST_PACKED", 44, 44, 3, ym2Var9);
        yl2 yl2Var46 = new yl2("SFIXED32_LIST_PACKED", 45, 45, 3, ym2Var4);
        yl2 yl2Var47 = new yl2("SFIXED64_LIST_PACKED", 46, 46, 3, ym2Var3);
        yl2 yl2Var48 = new yl2("SINT32_LIST_PACKED", 47, 47, 3, ym2Var4);
        yl2 yl2Var49 = new yl2("SINT64_LIST_PACKED", 48, 48, 3, ym2Var3);
        c = yl2Var49;
        e = new yl2[]{yl2Var, yl2Var2, yl2Var3, yl2Var4, yl2Var5, yl2Var6, yl2Var7, yl2Var8, yl2Var9, yl2Var10, yl2Var11, yl2Var12, yl2Var13, yl2Var14, yl2Var15, yl2Var16, yl2Var17, yl2Var18, yl2Var19, yl2Var20, yl2Var21, yl2Var22, yl2Var23, yl2Var24, yl2Var25, yl2Var26, yl2Var27, yl2Var28, yl2Var29, yl2Var30, yl2Var31, yl2Var32, yl2Var33, yl2Var34, yl2Var35, yl2Var36, yl2Var37, yl2Var38, yl2Var39, yl2Var40, yl2Var41, yl2Var42, yl2Var43, yl2Var44, yl2Var45, yl2Var46, yl2Var47, yl2Var48, yl2Var49, new yl2("GROUP_LIST", 49, 49, 2, ym2Var7), new yl2("MAP", 50, 50, 4, ym2.a)};
        yl2[] yl2VarArrValues = values();
        d = new yl2[yl2VarArrValues.length];
        for (yl2 yl2Var50 : yl2VarArrValues) {
            d[yl2Var50.a] = yl2Var50;
        }
    }

    public yl2(String str, int i, int i2, int i3, ym2 ym2Var) {
        super(str, i);
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            ym2Var.getClass();
        }
        if (i3 == 1) {
            ym2 ym2Var2 = ym2.a;
            ym2Var.ordinal();
        }
    }

    public static yl2[] values() {
        return (yl2[]) e.clone();
    }
}
