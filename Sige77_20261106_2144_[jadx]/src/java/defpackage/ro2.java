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
public final class ro2 {
    public static final ro2 c;
    public static final ro2 d;
    public static final ro2 e;
    public static final /* synthetic */ ro2[] f;
    public final so2 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    ro2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ro2 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    ro2 EF0;

    static {
        ro2 ro2Var = new ro2("DOUBLE", 0, so2.d, 1);
        ro2 ro2Var2 = new ro2("FLOAT", 1, so2.c, 5);
        so2 so2Var = so2.b;
        ro2 ro2Var3 = new ro2("INT64", 2, so2Var, 0);
        ro2 ro2Var4 = new ro2("UINT64", 3, so2Var, 0);
        so2 so2Var2 = so2.a;
        ro2 ro2Var5 = new ro2("INT32", 4, so2Var2, 0);
        ro2 ro2Var6 = new ro2("FIXED64", 5, so2Var, 1);
        ro2 ro2Var7 = new ro2("FIXED32", 6, so2Var2, 5);
        ro2 ro2Var8 = new ro2("BOOL", 7, so2.e, 0);
        ro2 ro2Var9 = new ro2("STRING", 8, so2.f, 2);
        c = ro2Var9;
        so2 so2Var3 = so2.w;
        ro2 ro2Var10 = new ro2("GROUP", 9, so2Var3, 3);
        d = ro2Var10;
        ro2 ro2Var11 = new ro2("MESSAGE", 10, so2Var3, 2);
        e = ro2Var11;
        f = new ro2[]{ro2Var, ro2Var2, ro2Var3, ro2Var4, ro2Var5, ro2Var6, ro2Var7, ro2Var8, ro2Var9, ro2Var10, ro2Var11, new ro2("BYTES", 11, so2.i, 2), new ro2("UINT32", 12, so2Var2, 0), new ro2("ENUM", 13, so2.v, 0), new ro2("SFIXED32", 14, so2Var2, 5), new ro2("SFIXED64", 15, so2Var, 1), new ro2("SINT32", 16, so2Var2, 0), new ro2("SINT64", 17, so2Var, 0)};
    }

    public ro2(String str, int i, so2 so2Var, int i2) {
        super(str, i);
        this.a = so2Var;
        this.b = i2;
    }

    public static ro2[] values() {
        return (ro2[]) f.clone();
    }
}
