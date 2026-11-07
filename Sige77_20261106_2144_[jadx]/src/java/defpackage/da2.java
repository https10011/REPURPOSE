package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at p61.o(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:133)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:46)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class da2 {
    public static final z92 c;
    public static final aa2 d;
    public static final ba2 e;
    public static final /* synthetic */ da2[] f;
    public final ea2 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    da2 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    da2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    da2 EF2;

    static {
        da2 da2Var = new da2("DOUBLE", 0, ea2.d, 1);
        da2 da2Var2 = new da2("FLOAT", 1, ea2.c, 5);
        ea2 ea2Var = ea2.b;
        da2 da2Var3 = new da2("INT64", 2, ea2Var, 0);
        da2 da2Var4 = new da2("UINT64", 3, ea2Var, 0);
        ea2 ea2Var2 = ea2.a;
        da2 da2Var5 = new da2("INT32", 4, ea2Var2, 0);
        da2 da2Var6 = new da2("FIXED64", 5, ea2Var, 1);
        da2 da2Var7 = new da2("FIXED32", 6, ea2Var2, 5);
        da2 da2Var8 = new da2("BOOL", 7, ea2.e, 0);
        z92 z92Var = new z92("STRING", 8, ea2.f, 2);
        c = z92Var;
        ea2 ea2Var3 = ea2.w;
        aa2 aa2Var = new aa2("GROUP", 9, ea2Var3, 3);
        d = aa2Var;
        ba2 ba2Var = new ba2("MESSAGE", 10, ea2Var3, 2);
        e = ba2Var;
        f = new da2[]{da2Var, da2Var2, da2Var3, da2Var4, da2Var5, da2Var6, da2Var7, da2Var8, z92Var, aa2Var, ba2Var, new ca2("BYTES", 11, ea2.i, 2), new da2("UINT32", 12, ea2Var2, 0), new da2("ENUM", 13, ea2.v, 0), new da2("SFIXED32", 14, ea2Var2, 5), new da2("SFIXED64", 15, ea2Var, 1), new da2("SINT32", 16, ea2Var2, 0), new da2("SINT64", 17, ea2Var, 0)};
    }

    public da2(String str, int i, ea2 ea2Var, int i2) {
        super(str, i);
        this.a = ea2Var;
        this.b = i2;
    }

    public static da2 valueOf(String str) {
        return (da2) Enum.valueOf(da2.class, str);
    }

    public static da2[] values() {
        return (da2[]) f.clone();
    }
}
