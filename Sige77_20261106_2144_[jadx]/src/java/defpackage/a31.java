package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a31 implements e51 {
    public final /* synthetic */ int a;
    public final Context b;

    public a31(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.e51
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return aj0.w((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return aj0.w(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return aj0.w(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // defpackage.e51
    public final d51 b(Object obj, int i, int i2, da1 da1Var) {
        Long l;
        int i3 = this.a;
        Context context = this.b;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new d51(new y71(uri), new z21(0, context, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new d51(new y71(uri2), ya0.b(context, uri2, new ox1(context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) da1Var.c(h52.d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new d51(new y71(uri3), ya0.b(context, uri3, new ri2(context.getContentResolver())));
        }
    }
}
