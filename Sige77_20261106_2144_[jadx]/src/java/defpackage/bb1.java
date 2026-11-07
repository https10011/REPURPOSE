package defpackage;

import okhttp3.MultipartBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bb1 extends rq0 {
    public static final bb1 W = new bb1();

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            MultipartBody.Builder builder = ai1Var.i;
            builder.getClass();
            builder.c.add(part);
        }
    }
}
