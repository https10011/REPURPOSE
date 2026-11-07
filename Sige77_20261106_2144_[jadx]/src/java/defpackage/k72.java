package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class k72 extends xi0 {
    public static boolean h = true;
    public static boolean i = true;
    public static boolean j = true;
    public static boolean k = true;

    public void I(View view, int i2, int i3, int i4, int i5) {
        if (j) {
            try {
                i72.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void J(View view, int i2) {
        if (Build.VERSION.SDK_INT != 28) {
            if (k) {
                try {
                    j72.a(view, i2);
                    return;
                } catch (NoSuchMethodError unused) {
                    k = false;
                    return;
                }
            }
            return;
        }
        if (!xi0.g) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                xi0.f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            xi0.g = true;
        }
        Field field = xi0.f;
        if (field != null) {
            try {
                xi0.f.setInt(view, (field.getInt(view) & (-13)) | i2);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void K(View view, Matrix matrix) {
        if (h) {
            try {
                h72.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public void L(ViewGroup viewGroup, Matrix matrix) {
        if (i) {
            try {
                h72.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
