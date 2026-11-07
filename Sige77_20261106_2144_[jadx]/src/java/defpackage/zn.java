package defpackage;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zn {
    public static SensorManager c;
    public static i62 d;
    public static String e;
    public static volatile boolean h;
    public static final zn a = new zn();
    public static final j62 b = new j62();
    public static final AtomicBoolean f = new AtomicBoolean(true);
    public static final AtomicBoolean g = new AtomicBoolean(false);

    public static final String a() {
        if (mt.a.contains(zn.class)) {
            return null;
        }
        try {
            if (e == null) {
                e = UUID.randomUUID().toString();
            }
            String str = e;
            str.getClass();
            return str;
        } catch (Throwable th) {
            mt.a(zn.class, th);
            return null;
        }
    }
}
