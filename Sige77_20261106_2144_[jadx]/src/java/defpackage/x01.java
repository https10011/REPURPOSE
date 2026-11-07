package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x01 implements mh {
    public static final Bitmap.Config W = Bitmap.Config.ARGB_8888;
    public final nr1 a;
    public final Set b;
    public final j10 c;
    public final long d;
    public long e;
    public int f;
    public int i;
    public int v;
    public int w;

    public x01(long j) {
        nr1 nr1Var = new nr1();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.a = nr1Var;
        this.b = setUnmodifiableSet;
        this.c = new j10(7);
    }

    @Override // defpackage.mh
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG != null) {
            return bitmapG;
        }
        if (config == null) {
            config = W;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.mh
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG != null) {
            bitmapG.eraseColor(0);
            return bitmapG;
        }
        if (config == null) {
            config = W;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.mh
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.a.getClass();
                if (d42.j(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    this.a.getClass();
                    int iJ = d42.j(bitmap);
                    this.a.e(bitmap);
                    this.c.getClass();
                    this.v++;
                    this.e += (long) iJ;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(nr1.c(d42.j(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        e();
                    }
                    h(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.a.getClass();
                sb.append(nr1.c(d42.j(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.mh
    public final void d(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            f();
        } else if (i >= 20 || i == 15) {
            h(this.d / 2);
        }
    }

    public final void e() {
        Log.v("LruBitmapPool", "Hits=" + this.f + ", misses=" + this.i + ", puts=" + this.v + ", evictions=" + this.w + ", currentSize=" + this.e + ", maxSize=" + this.d + "\nStrategy=" + this.a);
    }

    @Override // defpackage.mh
    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    public final synchronized Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.a.b(i, i2, config != null ? config : W);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.a.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(nr1.c(d42.k(config) * i * i2, config)));
                }
                this.i++;
            } else {
                this.f++;
                long j = this.e;
                this.a.getClass();
                this.e = j - ((long) d42.j(bitmapB));
                this.c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(nr1.c(d42.k(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void h(long j) {
        while (this.e > j) {
            try {
                nr1 nr1Var = this.a;
                Bitmap bitmap = (Bitmap) nr1Var.b.m();
                if (bitmap != null) {
                    nr1Var.a(Integer.valueOf(d42.j(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        e();
                    }
                    this.e = 0L;
                    return;
                }
                this.c.getClass();
                long j2 = this.e;
                this.a.getClass();
                this.e = j2 - ((long) d42.j(bitmap));
                this.w++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.a.getClass();
                    sb.append(nr1.c(d42.j(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    e();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
