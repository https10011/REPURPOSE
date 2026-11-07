package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v10 implements lw {
    public final Resources.Theme a;
    public final Resources b;
    public final u10 c;
    public final int d;
    public Object e;

    public v10(Resources.Theme theme, Resources resources, u10 u10Var, int i) {
        this.a = theme;
        this.b = resources;
        this.c = u10Var;
        this.d = i;
    }

    @Override // defpackage.lw
    public final Class a() {
        switch (this.c.a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.lw
    public final void h() {
        Object obj = this.e;
        if (obj != null) {
            try {
                switch (this.c.a) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) {
        Object objOpenRawResourceFd;
        try {
            u10 u10Var = this.c;
            Resources.Theme theme = this.a;
            Resources resources = this.b;
            int i = this.d;
            switch (u10Var.a) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = u10Var.b;
                    objOpenRawResourceFd = yv2.z(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.e = objOpenRawResourceFd;
            kwVar.c(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            kwVar.b(e);
        }
    }

    @Override // defpackage.lw
    public final int j() {
        return 1;
    }

    @Override // defpackage.lw
    public final void cancel() {
    }
}
