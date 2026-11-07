package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vc3 {
    public static final Logger c = Logger.getLogger(vc3.class.getName());
    public static final vc3 d;
    public ConcurrentHashMap a;
    public ConcurrentHashMap b;

    static {
        vc3 vc3Var = new vc3();
        vc3Var.a = new ConcurrentHashMap();
        vc3Var.b = new ConcurrentHashMap();
        d = vc3Var;
    }

    public final id3 a(String str) {
        id3 id3Var;
        synchronized (this) {
            if (!this.a.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
            }
            id3Var = (id3) this.a.get(str);
        }
        return id3Var;
    }

    public final synchronized void b(id3 id3Var, int i, boolean z) {
        try {
            if (!(i != 1 ? ck1.g(i) : ck1.i(i))) {
                throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
            }
            d(id3Var, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(id3 id3Var, boolean z) {
        b(id3Var, 1, z);
    }

    public final synchronized void d(id3 id3Var, boolean z) {
        try {
            String str = id3Var.a;
            if (z && this.b.containsKey(str) && !((Boolean) this.b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            id3 id3Var2 = (id3) this.a.get(str);
            if (id3Var2 != null && !id3Var2.getClass().equals(id3Var.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + id3Var2.getClass().getName() + ", cannot be re-registered with " + id3Var.getClass().getName());
            }
            this.a.putIfAbsent(str, id3Var);
            this.b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
