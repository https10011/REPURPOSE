package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f13 {
    public static final Object f = new Object();
    public final String a;
    public final hv2 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ f13(String str, Object obj, hv2 hv2Var) {
        this.a = str;
        this.c = obj;
        this.b = hv2Var;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (ye1.h == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (nk1.n()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (f13 f13Var : h13.a) {
                        if (nk1.n()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objMo5zza = null;
                        try {
                            hv2 hv2Var = f13Var.b;
                            if (hv2Var != null) {
                                objMo5zza = hv2Var.mo5zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            f13Var.e = objMo5zza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                hv2 hv2Var2 = this.b;
                if (hv2Var2 != null) {
                    try {
                        return hv2Var2.mo5zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
