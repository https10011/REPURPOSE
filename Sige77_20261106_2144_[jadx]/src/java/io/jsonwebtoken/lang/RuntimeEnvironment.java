package io.jsonwebtoken.lang;

import java.security.Provider;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class RuntimeEnvironment {
    private static final AtomicBoolean bcLoaded = new AtomicBoolean(false);
    private static final String BC_PROVIDER_CLASS_NAME = "org.bouncycastle.jce.provider.BouncyCastleProvider";
    public static final boolean BOUNCY_CASTLE_AVAILABLE = Classes.isAvailable(BC_PROVIDER_CLASS_NAME);

    static {
        enableBouncyCastleIfPossible();
    }

    private RuntimeEnvironment() {
    }

    public static void enableBouncyCastleIfPossible() {
        if (!BOUNCY_CASTLE_AVAILABLE || bcLoaded.get()) {
            return;
        }
        try {
            Class clsForName = Classes.forName(BC_PROVIDER_CLASS_NAME);
            for (Provider provider : Security.getProviders()) {
                if (clsForName.isInstance(provider)) {
                    bcLoaded.set(true);
                    return;
                }
            }
            Security.addProvider((Provider) Classes.newInstance(clsForName));
            bcLoaded.set(true);
        } catch (UnknownClassException unused) {
        }
    }
}
