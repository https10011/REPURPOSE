package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jh implements vi1 {
    public static final z91 b = z91.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final z91 c = new z91("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, z91.e);
    public final v01 a;

    public jh(v01 v01Var) {
        this.a = v01Var;
    }

    @Override // defpackage.g60
    public final boolean b(Object obj, File file, da1 da1Var) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((pi1) obj).get();
        z91 z91Var = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) da1Var.c(z91Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = e01.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) da1Var.c(b)).intValue();
        OutputStream piVar = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    v01 v01Var = this.a;
                    if (v01Var != null) {
                        try {
                            piVar = new pi(fileOutputStream, v01Var);
                        } catch (IOException e) {
                            e = e;
                            piVar = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (piVar != null) {
                                try {
                                    piVar.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            piVar = fileOutputStream;
                            if (piVar != null) {
                                try {
                                    piVar.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        piVar = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, piVar);
                    piVar.close();
                    try {
                        piVar.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + d42.j(bitmap) + " in " + e01.a(jElapsedRealtimeNanos) + ", options format: " + da1Var.c(z91Var) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // defpackage.vi1
    public final int h(da1 da1Var) {
        return 2;
    }
}
