package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sa0 implements si1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sa0(int i) {
        this.a = i;
    }

    @Override // defpackage.si1
    public final pi1 a(Object obj, int i, int i2, da1 da1Var) {
        switch (this.a) {
            case 0:
                return new u6((File) obj);
            case 1:
                return new u6((Bitmap) obj, 3);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new mi0(drawable, 1);
                }
                return null;
        }
    }

    @Override // defpackage.si1
    public final /* bridge */ /* synthetic */ boolean b(Object obj, da1 da1Var) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
