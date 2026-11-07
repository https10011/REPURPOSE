package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Process;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.measurement.internal.zzbh;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a20 implements Callable {
    public final /* synthetic */ int a;
    public final Object b;

    public a20(View view) {
        this.a = 2;
        this.b = new WeakReference(view);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                synchronized (((d20) this.b)) {
                    try {
                        d20 d20Var = (d20) this.b;
                        if (d20Var.w != null) {
                            d20Var.x();
                            if (((d20) this.b).m()) {
                                ((d20) this.b).t();
                                ((d20) this.b).X = 0;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            case 1:
                cc ccVar = (cc) this.b;
                ccVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    ccVar.e.d();
                    Binder.flushPendingCommands();
                    ccVar.a(null);
                    return null;
                } catch (Throwable th2) {
                    try {
                        ccVar.c.set(true);
                        throw th2;
                    } catch (Throwable th3) {
                        ccVar.a(null);
                        throw th3;
                    }
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                View view = (View) ((WeakReference) this.b).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return BuildConfig.FLAVOR;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                bitmapCreateBitmap.getClass();
                view.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                strEncodeToString.getClass();
                return strEncodeToString;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((Context) this.b).getSharedPreferences("FM_config", 0);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new c83(((f53) this.b).Y);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                g73 g73Var = (g73) this.b;
                g73Var.a.V();
                o33 o33Var = g73Var.a.v;
                if3.T(o33Var);
                o33Var.D();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                md2 md2Var = (md2) this.b;
                synchronized (((tj3) md2Var.b).g) {
                    md2Var.a = null;
                    break;
                }
                return null;
        }
    }

    public a20(g73 g73Var, zzbh zzbhVar, String str) {
        this.a = 5;
        this.b = g73Var;
    }

    public /* synthetic */ a20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
