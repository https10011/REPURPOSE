package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u6 implements pi1 {
    public final /* synthetic */ int a;
    public final Object b;

    public u6(byte[] bArr) {
        this.a = 1;
        am2.p(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // defpackage.pi1
    public final int b() {
        switch (this.a) {
            case 0:
                return d42.k(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.b).getIntrinsicHeight() * ((AnimatedImageDrawable) this.b).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.b).length;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return 1;
            default:
                return d42.j((Bitmap) this.b);
        }
    }

    @Override // defpackage.pi1
    public final Class d() {
        switch (this.a) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return ((File) this.b).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.pi1
    public final void e() {
        switch (this.a) {
            case 0:
                ((AnimatedImageDrawable) this.b).stop();
                ((AnimatedImageDrawable) this.b).clearAnimationCallbacks();
                break;
        }
    }

    @Override // defpackage.pi1
    public final Object get() {
        switch (this.a) {
            case 0:
                return (AnimatedImageDrawable) this.b;
            case 1:
                return (byte[]) this.b;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return (File) this.b;
            default:
                return (Bitmap) this.b;
        }
    }

    public /* synthetic */ u6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public u6(File file) {
        this.a = 2;
        am2.p(file, "Argument must not be null");
        this.b = file;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }
}
