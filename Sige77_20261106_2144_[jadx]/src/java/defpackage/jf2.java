package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jf2 implements pa3, ea3, e40 {
    public static final jf2 c;
    public static final jf2 d;
    public static final jf2 e;
    public static final jf2 f;
    public static final jf2 i;
    public final /* synthetic */ int a;
    public int b;

    static {
        int i2 = 0;
        c = new jf2(1, i2);
        d = new jf2(2, i2);
        e = new jf2(-1, i2);
        f = new jf2(0, i2);
        i = new jf2(-2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:16:0x0061). Please report as a decompilation issue!!! */
    public jf2(String str) {
        this.a = 2;
        ?? r1 = 3;
        r1 = 3;
        r1 = 3;
        ?? r2 = 3;
        try {
            List listU = ox1.r().u(str);
            if (listU.size() == 1) {
                str = Integer.parseInt(str);
            } else if (listU.size() >= 3) {
                str = Integer.parseInt((String) listU.get(2)) + (Integer.parseInt((String) listU.get(1)) * 1000) + (Integer.parseInt((String) listU.get(0)) * 1000000);
            } else {
                str = -1;
                r1 = r2;
            }
        } catch (IllegalArgumentException e2) {
            boolean zIsLoggable = Log.isLoggable("LibraryVersionContainer", r1);
            r2 = zIsLoggable;
            if (zIsLoggable) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e2));
                r2 = "Version code parsing failed for: %s with exception %s.";
            }
        }
        this.b = str;
    }

    public static jf2 d() throws Throwable {
        InputStream resourceAsStream;
        String str;
        hw0 hw0Var = hw0.c;
        hw0Var.getClass();
        ia0 ia0Var = hw0.b;
        gu2.m("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = hw0Var.a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            inputStream = null;
            try {
                try {
                    resourceAsStream = hw0.class.getResourceAsStream("/firebase-auth.properties");
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty("version", null);
                            StringBuilder sb = new StringBuilder(25 + String.valueOf(property).length());
                            sb.append("firebase-auth version is ");
                            sb.append(property);
                            String string = sb.toString();
                            if (Log.isLoggable(ia0Var.a, 2)) {
                                String str2 = ia0Var.b;
                                if (str2 != null) {
                                    string = str2.concat(string);
                                }
                                Log.v("LibraryVersion", string);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(56);
                            sb2.append("Failed to get app version for libraryName: firebase-auth");
                            String string2 = sb2.toString();
                            if (Log.isLoggable(ia0Var.a, 5)) {
                                String str3 = ia0Var.b;
                                if (str3 != null) {
                                    string2 = str3.concat(string2);
                                }
                                Log.w("LibraryVersion", string2);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        inputStream = resourceAsStream;
                        StringBuilder sb3 = new StringBuilder(56);
                        sb3.append("Failed to get app version for libraryName: firebase-auth");
                        String string3 = sb3.toString();
                        if (Log.isLoggable(ia0Var.a, 6)) {
                            String str4 = ia0Var.b;
                            if (str4 != null) {
                                string3 = str4.concat(string3);
                            }
                            Log.e("LibraryVersion", string3, e);
                        }
                        resourceAsStream = inputStream;
                        property = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = resourceAsStream;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused2) {
                    }
                }
                if (property == null) {
                    if (Log.isLoggable(ia0Var.a, 3)) {
                        String str5 = ia0Var.b;
                        Log.d("LibraryVersion", str5 != null ? str5.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                    }
                    str = "UNKNOWN";
                } else {
                    str = property;
                }
                concurrentHashMap.put("firebase-auth", str);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (TextUtils.isEmpty(str) || str.equals("UNKNOWN")) {
            str = "-1";
        }
        return new jf2(str);
    }

    @Override // defpackage.pa3
    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != this.b) {
            throw new InvalidAlgorithmParameterException(ck1.r(bArr.length, "Unexpected key length: "));
        }
        if (!ck1.g(2)) {
            tv2.f("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKeySpecC = g33.c(bArr);
        if (bArr2.length != 12) {
            tv2.f("iv is wrong size");
            return null;
        }
        if (bArr3.length < i2 + 16) {
            tv2.f("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = g33.a(bArr2, 0, bArr2.length);
        Cipher cipherB = g33.b();
        cipherB.init(2, secretKeySpecC, algorithmParameterSpecA);
        if (bArr4.length != 0) {
            cipherB.updateAAD(bArr4);
        }
        return cipherB.doFinal(bArr3, i2, bArr3.length - i2);
    }

    @Override // defpackage.e40
    public int b(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.ea3
    public byte[] c(int i2, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length < i2) {
            tv2.f("ciphertext too short");
            return null;
        }
        if (bArr.length != this.b) {
            tv2.f("invalid key size");
            return null;
        }
        SecretKeySpec secretKeySpecC = g33.c(bArr);
        int i3 = i2 + 12;
        if (bArr2.length < i2 + 28) {
            tv2.f("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = g33.a(bArr2, i2, 12);
        Cipher cipherB = g33.b();
        cipherB.init(2, secretKeySpecC, algorithmParameterSpecA);
        return cipherB.doFinal(bArr2, i3, (bArr2.length - i2) - 12);
    }

    @Override // defpackage.e40
    public int e(Context context, String str) {
        return this.b;
    }

    public String f() {
        return ts.j("X", Integer.toString(this.b));
    }

    @Override // defpackage.pa3, defpackage.ea3
    public int zza() {
        switch (this.a) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
        }
        return this.b;
    }

    @Override // defpackage.pa3
    public byte[] zzc() throws GeneralSecurityException {
        int i2 = this.b;
        if (i2 == 16) {
            return lb3.i;
        }
        if (i2 == 32) {
            return lb3.j;
        }
        tv2.f("Could not determine HPKE AEAD ID");
        return null;
    }

    public /* synthetic */ jf2(int i2, int i3) {
        this.a = i3;
        this.b = i2;
    }

    public jf2(oz2 oz2Var) throws GeneralSecurityException {
        this.a = 4;
        if (oz2Var.b == 12) {
            if (oz2Var.c == 16) {
                if (oz2Var.d == nz2.e) {
                    this.b = oz2Var.a;
                    return;
                } else {
                    tv2.f("invalid variant");
                    throw null;
                }
            }
            tv2.f("invalid tag size");
            throw null;
        }
        tv2.f("invalid IV size");
        throw null;
    }

    public jf2(int i2) throws InvalidAlgorithmParameterException {
        this.a = 3;
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(ck1.r(i2, "Unsupported key length: "));
        }
        this.b = i2;
    }

    public /* synthetic */ jf2() {
        this.a = 1;
    }
}
