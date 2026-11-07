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
public final class yr2 {
    public static final yr2 b;
    public static final yr2 c;
    public static final yr2[] d;
    public static final /* synthetic */ yr2[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    yr2 EF0;

    static {
        ls2 ls2Var = ls2.e;
        yr2 yr2Var = new yr2("DOUBLE", 0, 0, 1, ls2Var);
        ls2 ls2Var2 = ls2.d;
        yr2 yr2Var2 = new yr2("FLOAT", 1, 1, 1, ls2Var2);
        ls2 ls2Var3 = ls2.c;
        yr2 yr2Var3 = new yr2("INT64", 2, 2, 1, ls2Var3);
        yr2 yr2Var4 = new yr2("UINT64", 3, 3, 1, ls2Var3);
        ls2 ls2Var4 = ls2.b;
        yr2 yr2Var5 = new yr2("INT32", 4, 4, 1, ls2Var4);
        yr2 yr2Var6 = new yr2("FIXED64", 5, 5, 1, ls2Var3);
        yr2 yr2Var7 = new yr2("FIXED32", 6, 6, 1, ls2Var4);
        ls2 ls2Var5 = ls2.f;
        yr2 yr2Var8 = new yr2("BOOL", 7, 7, 1, ls2Var5);
        ls2 ls2Var6 = ls2.i;
        yr2 yr2Var9 = new yr2("STRING", 8, 8, 1, ls2Var6);
        ls2 ls2Var7 = ls2.W;
        yr2 yr2Var10 = new yr2("MESSAGE", 9, 9, 1, ls2Var7);
        ls2 ls2Var8 = ls2.v;
        yr2 yr2Var11 = new yr2("BYTES", 10, 10, 1, ls2Var8);
        yr2 yr2Var12 = new yr2("UINT32", 11, 11, 1, ls2Var4);
        ls2 ls2Var9 = ls2.w;
        yr2 yr2Var13 = new yr2("ENUM", 12, 12, 1, ls2Var9);
        yr2 yr2Var14 = new yr2("SFIXED32", 13, 13, 1, ls2Var4);
        yr2 yr2Var15 = new yr2("SFIXED64", 14, 14, 1, ls2Var3);
        yr2 yr2Var16 = new yr2("SINT32", 15, 15, 1, ls2Var4);
        yr2 yr2Var17 = new yr2("SINT64", 16, 16, 1, ls2Var3);
        yr2 yr2Var18 = new yr2("GROUP", 17, 17, 1, ls2Var7);
        yr2 yr2Var19 = new yr2("DOUBLE_LIST", 18, 18, 2, ls2Var);
        yr2 yr2Var20 = new yr2("FLOAT_LIST", 19, 19, 2, ls2Var2);
        yr2 yr2Var21 = new yr2("INT64_LIST", 20, 20, 2, ls2Var3);
        yr2 yr2Var22 = new yr2("UINT64_LIST", 21, 21, 2, ls2Var3);
        yr2 yr2Var23 = new yr2("INT32_LIST", 22, 22, 2, ls2Var4);
        yr2 yr2Var24 = new yr2("FIXED64_LIST", 23, 23, 2, ls2Var3);
        yr2 yr2Var25 = new yr2("FIXED32_LIST", 24, 24, 2, ls2Var4);
        yr2 yr2Var26 = new yr2("BOOL_LIST", 25, 25, 2, ls2Var5);
        yr2 yr2Var27 = new yr2("STRING_LIST", 26, 26, 2, ls2Var6);
        yr2 yr2Var28 = new yr2("MESSAGE_LIST", 27, 27, 2, ls2Var7);
        yr2 yr2Var29 = new yr2("BYTES_LIST", 28, 28, 2, ls2Var8);
        yr2 yr2Var30 = new yr2("UINT32_LIST", 29, 29, 2, ls2Var4);
        yr2 yr2Var31 = new yr2("ENUM_LIST", 30, 30, 2, ls2Var9);
        yr2 yr2Var32 = new yr2("SFIXED32_LIST", 31, 31, 2, ls2Var4);
        yr2 yr2Var33 = new yr2("SFIXED64_LIST", 32, 32, 2, ls2Var3);
        yr2 yr2Var34 = new yr2("SINT32_LIST", 33, 33, 2, ls2Var4);
        yr2 yr2Var35 = new yr2("SINT64_LIST", 34, 34, 2, ls2Var3);
        yr2 yr2Var36 = new yr2("DOUBLE_LIST_PACKED", 35, 35, 3, ls2Var);
        b = yr2Var36;
        yr2 yr2Var37 = new yr2("FLOAT_LIST_PACKED", 36, 36, 3, ls2Var2);
        yr2 yr2Var38 = new yr2("INT64_LIST_PACKED", 37, 37, 3, ls2Var3);
        yr2 yr2Var39 = new yr2("UINT64_LIST_PACKED", 38, 38, 3, ls2Var3);
        yr2 yr2Var40 = new yr2("INT32_LIST_PACKED", 39, 39, 3, ls2Var4);
        yr2 yr2Var41 = new yr2("FIXED64_LIST_PACKED", 40, 40, 3, ls2Var3);
        yr2 yr2Var42 = new yr2("FIXED32_LIST_PACKED", 41, 41, 3, ls2Var4);
        yr2 yr2Var43 = new yr2("BOOL_LIST_PACKED", 42, 42, 3, ls2Var5);
        yr2 yr2Var44 = new yr2("UINT32_LIST_PACKED", 43, 43, 3, ls2Var4);
        yr2 yr2Var45 = new yr2("ENUM_LIST_PACKED", 44, 44, 3, ls2Var9);
        yr2 yr2Var46 = new yr2("SFIXED32_LIST_PACKED", 45, 45, 3, ls2Var4);
        yr2 yr2Var47 = new yr2("SFIXED64_LIST_PACKED", 46, 46, 3, ls2Var3);
        yr2 yr2Var48 = new yr2("SINT32_LIST_PACKED", 47, 47, 3, ls2Var4);
        yr2 yr2Var49 = new yr2("SINT64_LIST_PACKED", 48, 48, 3, ls2Var3);
        c = yr2Var49;
        e = new yr2[]{yr2Var, yr2Var2, yr2Var3, yr2Var4, yr2Var5, yr2Var6, yr2Var7, yr2Var8, yr2Var9, yr2Var10, yr2Var11, yr2Var12, yr2Var13, yr2Var14, yr2Var15, yr2Var16, yr2Var17, yr2Var18, yr2Var19, yr2Var20, yr2Var21, yr2Var22, yr2Var23, yr2Var24, yr2Var25, yr2Var26, yr2Var27, yr2Var28, yr2Var29, yr2Var30, yr2Var31, yr2Var32, yr2Var33, yr2Var34, yr2Var35, yr2Var36, yr2Var37, yr2Var38, yr2Var39, yr2Var40, yr2Var41, yr2Var42, yr2Var43, yr2Var44, yr2Var45, yr2Var46, yr2Var47, yr2Var48, yr2Var49, new yr2("GROUP_LIST", 49, 49, 2, ls2Var7), new yr2("MAP", 50, 50, 4, ls2.a)};
        yr2[] yr2VarArrValues = values();
        d = new yr2[yr2VarArrValues.length];
        for (yr2 yr2Var50 : yr2VarArrValues) {
            d[yr2Var50.a] = yr2Var50;
        }
    }

    public yr2(String str, int i, int i2, int i3, ls2 ls2Var) {
        super(str, i);
        this.a = i2;
        int iV = ts.v(i3);
        if (iV == 1 || iV == 3) {
            ls2Var.getClass();
        }
        if (i3 == 1) {
            int i4 = xr2.a[ls2Var.ordinal()];
        }
    }

    public static yr2[] values() {
        return (yr2[]) e.clone();
    }
}
