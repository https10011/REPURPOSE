package defpackage;

import java.net.URL;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bl {
    public long a;
    public int b;
    public final Object c;

    public bl() {
        if (u41.e == null) {
            Pattern pattern = i42.b;
            u41.e = new u41(9);
        }
        u41 u41Var = u41.e;
        if (i42.c == null) {
            i42.c = new i42(u41Var);
        }
        this.c = i42.c;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public synchronized boolean a() {
        boolean z;
        if (this.b != 0) {
            ((i42) this.c).a.getClass();
            if (System.currentTimeMillis() > this.a) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.b = 0;
            }
            return;
        }
        this.b++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.b);
                ((i42) this.c).getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            } else {
                jMin = 86400000;
            }
            ((i42) this.c).a.getClass();
            this.a = System.currentTimeMillis() + jMin;
        }
        return;
        throw th;
    }

    public bl(int i, URL url, long j) {
        this.b = i;
        this.c = url;
        this.a = j;
    }
}
