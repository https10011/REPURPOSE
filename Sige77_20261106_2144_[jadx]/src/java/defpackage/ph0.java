package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ph0 implements h41 {
    public static final ph0 b = new ph0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ph0(int i) {
        this.a = i;
    }

    @Override // defpackage.h41
    public final if1 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!sh0.class.isAssignableFrom(cls)) {
                    e.g("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (if1) sh0.d(cls.asSubclass(sh0.class)).c(3);
                } catch (Exception e) {
                    sm0.m("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.h41
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return sh0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
