package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.WeakHashMap;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xv1 extends ThreadLocal {
    public final /* synthetic */ int a;

    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.a) {
            case 0:
                return new yv1();
            case 1:
                return Boolean.FALSE;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                mk2 mk2Var = new mk2();
                mk2Var.a = 0;
                return mk2Var;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
                simpleDateFormat.setCalendar(gregorianCalendar);
                return simpleDateFormat;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return 0L;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                try {
                    return (Cipher) cr3.b.a.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    Cipher cipher = (Cipher) cr3.b.a.zza("AES/GCM-SIV/NoPadding");
                    if (y33.a(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                Provider providerB = ea.B();
                if (providerB == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerB);
                    } catch (GeneralSecurityException unused) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    return (Cipher) cr3.b.a.zza("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 9:
                ta.N(Thread.currentThread());
                zn3 zn3Var = new zn3();
                zn3Var.a = false;
                zn3Var.b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = vm3.c;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, zn3Var);
                    break;
                }
                return zn3Var;
            case 10:
                try {
                    return (Cipher) cr3.b.a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 11:
                try {
                    return (Cipher) cr3.b.a.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 12:
                try {
                    return (Cipher) cr3.b.a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            default:
                return new Random();
        }
    }
}
