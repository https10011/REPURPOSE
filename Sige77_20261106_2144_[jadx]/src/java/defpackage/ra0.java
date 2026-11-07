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
public final class ra0 {
    public static final ra0 b;
    public static final ra0 c;
    public static final ra0[] d;
    public static final /* synthetic */ ra0[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    ra0 EF0;

    static {
        us0 us0Var = us0.e;
        ra0 ra0Var = new ra0("DOUBLE", 0, 0, 1, us0Var);
        us0 us0Var2 = us0.d;
        ra0 ra0Var2 = new ra0("FLOAT", 1, 1, 1, us0Var2);
        us0 us0Var3 = us0.c;
        ra0 ra0Var3 = new ra0("INT64", 2, 2, 1, us0Var3);
        ra0 ra0Var4 = new ra0("UINT64", 3, 3, 1, us0Var3);
        us0 us0Var4 = us0.b;
        ra0 ra0Var5 = new ra0("INT32", 4, 4, 1, us0Var4);
        ra0 ra0Var6 = new ra0("FIXED64", 5, 5, 1, us0Var3);
        ra0 ra0Var7 = new ra0("FIXED32", 6, 6, 1, us0Var4);
        us0 us0Var5 = us0.f;
        ra0 ra0Var8 = new ra0("BOOL", 7, 7, 1, us0Var5);
        us0 us0Var6 = us0.i;
        ra0 ra0Var9 = new ra0("STRING", 8, 8, 1, us0Var6);
        us0 us0Var7 = us0.W;
        ra0 ra0Var10 = new ra0("MESSAGE", 9, 9, 1, us0Var7);
        us0 us0Var8 = us0.v;
        ra0 ra0Var11 = new ra0("BYTES", 10, 10, 1, us0Var8);
        ra0 ra0Var12 = new ra0("UINT32", 11, 11, 1, us0Var4);
        us0 us0Var9 = us0.w;
        ra0 ra0Var13 = new ra0("ENUM", 12, 12, 1, us0Var9);
        ra0 ra0Var14 = new ra0("SFIXED32", 13, 13, 1, us0Var4);
        ra0 ra0Var15 = new ra0("SFIXED64", 14, 14, 1, us0Var3);
        ra0 ra0Var16 = new ra0("SINT32", 15, 15, 1, us0Var4);
        ra0 ra0Var17 = new ra0("SINT64", 16, 16, 1, us0Var3);
        ra0 ra0Var18 = new ra0("GROUP", 17, 17, 1, us0Var7);
        ra0 ra0Var19 = new ra0("DOUBLE_LIST", 18, 18, 2, us0Var);
        ra0 ra0Var20 = new ra0("FLOAT_LIST", 19, 19, 2, us0Var2);
        ra0 ra0Var21 = new ra0("INT64_LIST", 20, 20, 2, us0Var3);
        ra0 ra0Var22 = new ra0("UINT64_LIST", 21, 21, 2, us0Var3);
        ra0 ra0Var23 = new ra0("INT32_LIST", 22, 22, 2, us0Var4);
        ra0 ra0Var24 = new ra0("FIXED64_LIST", 23, 23, 2, us0Var3);
        ra0 ra0Var25 = new ra0("FIXED32_LIST", 24, 24, 2, us0Var4);
        ra0 ra0Var26 = new ra0("BOOL_LIST", 25, 25, 2, us0Var5);
        ra0 ra0Var27 = new ra0("STRING_LIST", 26, 26, 2, us0Var6);
        ra0 ra0Var28 = new ra0("MESSAGE_LIST", 27, 27, 2, us0Var7);
        ra0 ra0Var29 = new ra0("BYTES_LIST", 28, 28, 2, us0Var8);
        ra0 ra0Var30 = new ra0("UINT32_LIST", 29, 29, 2, us0Var4);
        ra0 ra0Var31 = new ra0("ENUM_LIST", 30, 30, 2, us0Var9);
        ra0 ra0Var32 = new ra0("SFIXED32_LIST", 31, 31, 2, us0Var4);
        ra0 ra0Var33 = new ra0("SFIXED64_LIST", 32, 32, 2, us0Var3);
        ra0 ra0Var34 = new ra0("SINT32_LIST", 33, 33, 2, us0Var4);
        ra0 ra0Var35 = new ra0("SINT64_LIST", 34, 34, 2, us0Var3);
        ra0 ra0Var36 = new ra0("DOUBLE_LIST_PACKED", 35, 35, 3, us0Var);
        b = ra0Var36;
        ra0 ra0Var37 = new ra0("FLOAT_LIST_PACKED", 36, 36, 3, us0Var2);
        ra0 ra0Var38 = new ra0("INT64_LIST_PACKED", 37, 37, 3, us0Var3);
        ra0 ra0Var39 = new ra0("UINT64_LIST_PACKED", 38, 38, 3, us0Var3);
        ra0 ra0Var40 = new ra0("INT32_LIST_PACKED", 39, 39, 3, us0Var4);
        ra0 ra0Var41 = new ra0("FIXED64_LIST_PACKED", 40, 40, 3, us0Var3);
        ra0 ra0Var42 = new ra0("FIXED32_LIST_PACKED", 41, 41, 3, us0Var4);
        ra0 ra0Var43 = new ra0("BOOL_LIST_PACKED", 42, 42, 3, us0Var5);
        ra0 ra0Var44 = new ra0("UINT32_LIST_PACKED", 43, 43, 3, us0Var4);
        ra0 ra0Var45 = new ra0("ENUM_LIST_PACKED", 44, 44, 3, us0Var9);
        ra0 ra0Var46 = new ra0("SFIXED32_LIST_PACKED", 45, 45, 3, us0Var4);
        ra0 ra0Var47 = new ra0("SFIXED64_LIST_PACKED", 46, 46, 3, us0Var3);
        ra0 ra0Var48 = new ra0("SINT32_LIST_PACKED", 47, 47, 3, us0Var4);
        ra0 ra0Var49 = new ra0("SINT64_LIST_PACKED", 48, 48, 3, us0Var3);
        c = ra0Var49;
        e = new ra0[]{ra0Var, ra0Var2, ra0Var3, ra0Var4, ra0Var5, ra0Var6, ra0Var7, ra0Var8, ra0Var9, ra0Var10, ra0Var11, ra0Var12, ra0Var13, ra0Var14, ra0Var15, ra0Var16, ra0Var17, ra0Var18, ra0Var19, ra0Var20, ra0Var21, ra0Var22, ra0Var23, ra0Var24, ra0Var25, ra0Var26, ra0Var27, ra0Var28, ra0Var29, ra0Var30, ra0Var31, ra0Var32, ra0Var33, ra0Var34, ra0Var35, ra0Var36, ra0Var37, ra0Var38, ra0Var39, ra0Var40, ra0Var41, ra0Var42, ra0Var43, ra0Var44, ra0Var45, ra0Var46, ra0Var47, ra0Var48, ra0Var49, new ra0("GROUP_LIST", 49, 49, 2, us0Var7), new ra0("MAP", 50, 50, 4, us0.a)};
        ra0[] ra0VarArrValues = values();
        d = new ra0[ra0VarArrValues.length];
        for (ra0 ra0Var50 : ra0VarArrValues) {
            d[ra0Var50.a] = ra0Var50;
        }
    }

    public ra0(String str, int i, int i2, int i3, us0 us0Var) {
        super(str, i);
        this.a = i2;
        int iV = ts.v(i3);
        if (iV == 1 || iV == 3) {
            us0Var.getClass();
        }
        if (i3 == 1) {
            us0Var.ordinal();
        }
    }

    public static ra0 valueOf(String str) {
        return (ra0) Enum.valueOf(ra0.class, str);
    }

    public static ra0[] values() {
        return (ra0[]) e.clone();
    }
}
