package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nh implements pi1, bq0 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public nh(mh mhVar, Bitmap bitmap) {
        am2.p(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        am2.p(mhVar, "BitmapPool must not be null");
        this.c = mhVar;
    }

    public static nh c(mh mhVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new nh(mhVar, bitmap);
    }

    @Override // defpackage.bq0
    public final void a() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                pi1 pi1Var = (pi1) this.c;
                if (pi1Var instanceof bq0) {
                    ((bq0) pi1Var).a();
                }
                break;
        }
    }

    @Override // defpackage.pi1
    public final int b() {
        switch (this.a) {
            case 0:
                return d42.j((Bitmap) this.b);
            default:
                return ((pi1) this.c).b();
        }
    }

    @Override // defpackage.pi1
    public final Class d() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.pi1
    public final void e() {
        switch (this.a) {
            case 0:
                ((mh) this.c).c((Bitmap) this.b);
                break;
            default:
                ((pi1) this.c).e();
                break;
        }
    }

    @Override // defpackage.pi1
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((pi1) this.c).get());
        }
    }

    public nh(Resources resources, pi1 pi1Var) {
        am2.p(resources, "Argument must not be null");
        this.b = resources;
        am2.p(pi1Var, "Argument must not be null");
        this.c = pi1Var;
    }
}
