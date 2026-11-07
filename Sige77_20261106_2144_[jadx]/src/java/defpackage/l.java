package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l extends wa2 {
    public final /* synthetic */ int b;

    private final va2 c() {
        int i;
        BigInteger bigInteger = new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16);
        new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16);
        BigInteger[] bigIntegerArr = {new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)};
        BigInteger[] bigIntegerArr2 = {new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)};
        new BigInteger("9162fbe73984472a0a9d0590", 16);
        new BigInteger("96341f1138933bc2f503fd44", 16);
        nj2.p(bigIntegerArr, "v1");
        nj2.p(bigIntegerArr2, "v2");
        m40 sm1Var = new sm1();
        synchronized (sm1Var) {
            i = sm1Var.f;
        }
        sm1Var.f(bigInteger);
        if (!sm1Var.j(i)) {
            uq1.q("unsupported coordinate system");
            return null;
        }
        m40 m40VarA = sm1Var.a();
        if (m40VarA == sm1Var) {
            uq1.q("implementation returned current curve");
            return null;
        }
        synchronized (m40VarA) {
            m40VarA.f = i;
        }
        return new va2(m40VarA, new ua2(m40VarA, cm0.a("043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE")), m40VarA.d, m40VarA.e, null);
    }

    @Override // defpackage.wa2
    public final va2 a() {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                BigInteger bigInteger = new BigInteger(1, cm0.a("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03"));
                BigInteger bigInteger2 = new BigInteger(1, cm0.a("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00"));
                BigInteger bigInteger3 = new BigInteger(1, cm0.a("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F"));
                BigInteger bigInteger4 = new BigInteger(1, cm0.a("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1"));
                BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
                o40 o40Var = new o40(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigIntegerValueOf);
                return new va2(o40Var, new ua2(o40Var, cm0.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigInteger4, bigIntegerValueOf, null);
            case 1:
                BigInteger bigInteger5 = new BigInteger("7ae96a2b657c07106e64479eac3434e99cf0497512f58995c1396c28719501ee", 16);
                new BigInteger("5363ad4cc05c30e0a5261c028812645a122e22ea20816678df02967c1b23bd72", 16);
                BigInteger[] bigIntegerArr = {new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16), new BigInteger("-e4437ed6010e88286f547fa90abfe4c3", 16)};
                BigInteger[] bigIntegerArr2 = {new BigInteger("114ca50f7a8e2f3f657c1108d9d44cfd8", 16), new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16)};
                new BigInteger("3086d221a7d46bcde86c90e49284eb153dab", 16);
                new BigInteger("e4437ed6010e88286f547fa90abfe4c42212", 16);
                nj2.p(bigIntegerArr, "v1");
                nj2.p(bigIntegerArr2, "v2");
                m40 fn1Var = new fn1();
                synchronized (fn1Var) {
                    i = fn1Var.f;
                }
                fn1Var.f(bigInteger5);
                if (!fn1Var.j(i)) {
                    uq1.q("unsupported coordinate system");
                    return null;
                }
                m40 m40VarA = fn1Var.a();
                if (m40VarA == fn1Var) {
                    uq1.q("implementation returned current curve");
                    return null;
                }
                synchronized (m40VarA) {
                    m40VarA.f = i;
                    break;
                }
                return new va2(m40VarA, new ua2(m40VarA, cm0.a("0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8")), m40VarA.d, m40VarA.e, null);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                byte[] bArrA = cm0.a("C49D360886E704936A6678E1139D26B7819F7E90");
                hn1 hn1Var = new hn1();
                return new va2(hn1Var, new ua2(hn1Var, cm0.a("046B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C2964FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5")), hn1Var.d, hn1Var.e, bArrA);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                byte[] bArrA2 = cm0.a("A335926AA319A27A1D00896A6773A4827ACDAC73");
                jn1 jn1Var = new jn1();
                return new va2(jn1Var, new ua2(jn1Var, cm0.a("04AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB73617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F")), jn1Var.d, jn1Var.e, bArrA2);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                byte[] bArrA3 = cm0.a("D09E8800291CB85396CC6717393284AAA0DA64BA");
                ln1 ln1Var = new ln1();
                return new va2(ln1Var, new ua2(ln1Var, cm0.a("0400C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650")), ln1Var.d, ln1Var.e, bArrA3);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArrA4 = cm0.a("10E723AB14D696E6768756151756FEBF8FCB49A9");
                on1 on1Var = new on1(0);
                return new va2(on1Var, new ua2(on1Var, cm0.a("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886")), on1Var.d, on1Var.e, bArrA4);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                byte[] bArrA5 = cm0.a("10C0FB15760860DEF1EEF4D696E676875615175D");
                on1 on1Var2 = new on1(1);
                return new va2(on1Var2, new ua2(on1Var2, cm0.a("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D")), on1Var2.d, on1Var2.e, bArrA5);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArrA6 = cm0.a("4D696E676875615175985BD3ADBADA21B43A97E2");
                on1 on1Var3 = new on1(2);
                return new va2(on1Var3, new ua2(on1Var3, cm0.a("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150")), on1Var3.d, on1Var3.e, bArrA6);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                byte[] bArrA7 = cm0.a("985BD3ADBAD4D696E676875615175A21B43A97E3");
                on1 on1Var4 = new on1(3);
                return new va2(on1Var4, new ua2(on1Var4, cm0.a("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F")), on1Var4.d, on1Var4.e, bArrA7);
            case 9:
                on1 on1Var5 = new on1(4);
                return new va2(on1Var5, new ua2(on1Var5, cm0.a("0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9")), on1Var5.d, on1Var5.e, null);
            case 10:
                byte[] bArrA8 = cm0.a("24B7B137C8A14D696E6768756151756FD0DA2E5C");
                on1 on1Var6 = new on1(5);
                return new va2(on1Var6, new ua2(on1Var6, cm0.a("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883")), on1Var6.d, on1Var6.e, bArrA8);
            case 11:
                av avVar = new av();
                return new va2(avVar, new ua2(avVar, cm0.a("042AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD245A20AE19A1B8A086B4E01EDD2C7748D14C923D4D7E6D7C61B229E9C5A27ECED3D9")), avVar.d, avVar.e, null);
            case 12:
                byte[] bArrA9 = cm0.a("85E25BFE5C86226CDB12016F7553F9D0E693A268");
                on1 on1Var7 = new on1(6);
                return new va2(on1Var7, new ua2(on1Var7, cm0.a("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1")), on1Var7.d, on1Var7.e, bArrA9);
            case 13:
                byte[] bArrA10 = cm0.a("103FAEC74D696E676875615175777FC5B191EF30");
                on1 on1Var8 = new on1(7);
                return new va2(on1Var8, new ua2(on1Var8, cm0.a("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05")), on1Var8.d, on1Var8.e, bArrA10);
            case 14:
                byte[] bArrA11 = cm0.a("10B7B4D696E676875615175137C8A16FD0DA2211");
                on1 on1Var9 = new on1(8);
                return new va2(on1Var9, new ua2(on1Var9, cm0.a("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C")), on1Var9.d, on1Var9.e, bArrA11);
            case 15:
                on1 on1Var10 = new on1(9);
                return new va2(on1Var10, new ua2(on1Var10, cm0.a("04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3")), on1Var10.d, on1Var10.e, null);
            case 16:
                byte[] bArrA12 = cm0.a("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
                on1 on1Var11 = new on1(10);
                return new va2(on1Var11, new ua2(on1Var11, cm0.a("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052")), on1Var11.d, on1Var11.e, bArrA12);
            case 17:
                on1 on1Var12 = new on1(11);
                return new va2(on1Var12, new ua2(on1Var12, cm0.a("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA")), on1Var12.d, on1Var12.e, null);
            case 18:
                on1 on1Var13 = new on1(12);
                return new va2(on1Var13, new ua2(on1Var13, cm0.a("040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259")), on1Var13.d, on1Var13.e, null);
            case 19:
                byte[] bArrA13 = cm0.a("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
                on1 on1Var14 = new on1(13);
                return new va2(on1Var14, new ua2(on1Var14, cm0.a("0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4")), on1Var14.d, on1Var14.e, bArrA13);
            case 20:
                on1 on1Var15 = new on1(14);
                return new va2(on1Var15, new ua2(on1Var15, cm0.a("040060F05F658F49C1AD3AB1890F7184210EFD0987E307C84C27ACCFB8F9F67CC2C460189EB5AAAA62EE222EB1B35540CFE902374601E369050B7C4E42ACBA1DACBF04299C3460782F918EA427E6325165E9EA10E3DA5F6C42E9C55215AA9CA27A5863EC48D8E0286B")), on1Var15.d, on1Var15.e, null);
            case 21:
                byte[] bArrA14 = cm0.a("4099B5A457F9D69F79213D094C4BCD4D4262210B");
                on1 on1Var16 = new on1(15);
                return new va2(on1Var16, new ua2(on1Var16, cm0.a("04015D4860D088DDB3496B0C6064756260441CDE4AF1771D4DB01FFE5B34E59703DC255A868A1180515603AEAB60794E54BB7996A70061B1CFAB6BE5F32BBFA78324ED106A7636B9C5A7BD198D0158AA4F5488D08F38514F1FDF4B4F40D2181B3681C364BA0273C706")), on1Var16.d, on1Var16.e, bArrA14);
            case 22:
                byte[] bArrA15 = cm0.a("000E0D4D696E6768756151750CC03A4473D03679");
                qm1 qm1Var = new qm1();
                return new va2(qm1Var, new ua2(qm1Var, cm0.a("04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83")), qm1Var.d, qm1Var.e, bArrA15);
            case 23:
                on1 on1Var17 = new on1(16);
                return new va2(on1Var17, new ua2(on1Var17, cm0.a("04026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C89720349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3")), on1Var17.d, on1Var17.e, null);
            case 24:
                byte[] bArrA16 = cm0.a("2AA058F73A0E33AB486B0F610410C53A7F132310");
                xn1 xn1Var = new xn1();
                return new va2(xn1Var, new ua2(xn1Var, cm0.a("040303001D34B856296C16C0D40D3CD7750A93D1D2955FA80AA5F40FC8DB7B2ABDBDE53950F4C0D293CDD711A35B67FB1499AE60038614F1394ABFA3B4C850D927E1E7769C8EEC2D19037BF27342DA639B6DCCFFFEB73D69D78C6C27A6009CBBCA1980F8533921E8A684423E43BAB08A576291AF8F461BB2A8B3531D2F0485C19B16E2F1516E23DD3C1A4827AF1B8AC15B")), xn1Var.d, xn1Var.e, bArrA16);
            case 25:
                uk1 uk1Var = new uk1();
                return new va2(uk1Var, new ua2(uk1Var, cm0.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), uk1Var.d, uk1Var.e, null);
            case 26:
                return c();
            case 27:
                byte[] bArrA17 = cm0.a("1053CDE42C14D696E67687561517533BF3F83345");
                tm1 tm1Var = new tm1();
                return new va2(tm1Var, new ua2(tm1Var, cm0.a("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32")), tm1Var.d, tm1Var.e, bArrA17);
            case 28:
                byte[] bArrA18 = cm0.a("B99B99B099B323E02709A4D696E6768756151751");
                vm1 vm1Var = new vm1();
                return new va2(vm1Var, new ua2(vm1Var, cm0.a("0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E")), vm1Var.d, vm1Var.e, bArrA18);
            default:
                BigInteger bigInteger6 = new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16);
                new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16);
                BigInteger[] bigIntegerArr3 = {new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)};
                BigInteger[] bigIntegerArr4 = {new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)};
                new BigInteger("71169be7330b3038edb025f1d0f9", 16);
                new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16);
                nj2.p(bigIntegerArr3, "v1");
                nj2.p(bigIntegerArr4, "v2");
                m40 xm1Var = new xm1();
                synchronized (xm1Var) {
                    i2 = xm1Var.f;
                }
                xm1Var.f(bigInteger6);
                if (!xm1Var.j(i2)) {
                    uq1.q("unsupported coordinate system");
                    return null;
                }
                m40 m40VarA2 = xm1Var.a();
                if (m40VarA2 == xm1Var) {
                    uq1.q("implementation returned current curve");
                    return null;
                }
                synchronized (m40VarA2) {
                    m40VarA2.f = i2;
                    break;
                }
                return new va2(m40VarA2, new ua2(m40VarA2, cm0.a("04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D")), m40VarA2.d, m40VarA2.e, null);
        }
    }
}
