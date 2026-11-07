package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e10 implements Runnable {
    public static final /* synthetic */ e10 b = new e10(3);
    public static final /* synthetic */ e10 c = new e10(4);
    public static final /* synthetic */ e10 d = new e10(5);
    public final /* synthetic */ int a;

    public /* synthetic */ e10(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ye1.g = y21.h(kv.w()).b;
                    f01.a("advertisingId is " + ye1.g);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 1:
                try {
                    int i = cz1.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (f50.k != null) {
                        f50.a().c();
                        break;
                    }
                    return;
                } finally {
                    int i2 = cz1.a;
                    Trace.endSection();
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }
}
