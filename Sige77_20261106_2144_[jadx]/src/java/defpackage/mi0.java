package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mi0 implements pi1, bq0 {
    public final Drawable a;
    public final /* synthetic */ int b;

    public mi0(Drawable drawable, int i) {
        this.b = i;
        am2.p(drawable, "Argument must not be null");
        this.a = drawable;
    }

    @Override // defpackage.bq0
    public void a() {
        int i = this.b;
        Drawable drawable = this.a;
        switch (i) {
            case 0:
                ((ri0) ((li0) drawable).a.b).l.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof li0) {
                    ((ri0) ((li0) drawable).a.b).l.prepareToDraw();
                }
                break;
        }
    }

    @Override // defpackage.pi1
    public final int b() {
        int i = this.b;
        Drawable drawable = this.a;
        switch (i) {
            case 0:
                ri0 ri0Var = (ri0) ((li0) drawable).a.b;
                gt1 gt1Var = ri0Var.a;
                return (gt1Var.j.length * 4) + gt1Var.d.limit() + gt1Var.i.length + ri0Var.n;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // defpackage.pi1
    public final Class d() {
        switch (this.b) {
            case 0:
                return li0.class;
            default:
                return this.a.getClass();
        }
    }

    @Override // defpackage.pi1
    public final void e() {
        v01 v01Var;
        v01 v01Var2;
        v01 v01Var3;
        switch (this.b) {
            case 0:
                li0 li0Var = (li0) this.a;
                li0Var.stop();
                li0Var.d = true;
                ri0 ri0Var = (ri0) li0Var.a.b;
                ii1 ii1Var = ri0Var.d;
                ri0Var.c.clear();
                Bitmap bitmap = ri0Var.l;
                if (bitmap != null) {
                    ri0Var.e.c(bitmap);
                    ri0Var.l = null;
                }
                ri0Var.f = false;
                pi0 pi0Var = ri0Var.i;
                if (pi0Var != null) {
                    ii1Var.l(pi0Var);
                    ri0Var.i = null;
                }
                pi0 pi0Var2 = ri0Var.k;
                if (pi0Var2 != null) {
                    ii1Var.l(pi0Var2);
                    ri0Var.k = null;
                }
                pi0 pi0Var3 = ri0Var.m;
                if (pi0Var3 != null) {
                    ii1Var.l(pi0Var3);
                    ri0Var.m = null;
                }
                gt1 gt1Var = ri0Var.a;
                md2 md2Var = gt1Var.c;
                gt1Var.l = null;
                byte[] bArr = gt1Var.i;
                if (bArr != null && (v01Var3 = (v01) md2Var.b) != null) {
                    v01Var3.g(bArr);
                }
                int[] iArr = gt1Var.j;
                if (iArr != null && (v01Var2 = (v01) md2Var.b) != null) {
                    v01Var2.g(iArr);
                }
                Bitmap bitmap2 = gt1Var.m;
                if (bitmap2 != null) {
                    ((mh) md2Var.a).c(bitmap2);
                }
                gt1Var.m = null;
                gt1Var.d = null;
                gt1Var.s = null;
                byte[] bArr2 = gt1Var.e;
                if (bArr2 != null && (v01Var = (v01) md2Var.b) != null) {
                    v01Var.g(bArr2);
                }
                ri0Var.j = true;
                break;
        }
    }

    @Override // defpackage.pi1
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    private final void c() {
    }
}
