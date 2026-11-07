package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ej1 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, xi0 xi0Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            a11 a11Var = u12.b;
            Typeface typeface = (Typeface) a11Var.b(u12.b(resources, i, string, i3, i2));
            int i4 = 3;
            if (typeface != null) {
                if (xi0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new zs0(i4, xi0Var, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        ie0 ie0VarF = x91.F(resources.getXml(i), resources);
                        if (ie0VarF == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (xi0Var != null) {
                                xi0Var.a(-3);
                            }
                        } else {
                            typefaceA = u12.a(context, ie0VarF, resources, i, string, typedValue.assetCookie, i2, xi0Var, z);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceM = u12.a.m(context, resources, i, string, i2);
                        if (typefaceM != null) {
                            a11Var.c(u12.b(resources, i, string, i5, i2), typefaceM);
                        }
                        if (xi0Var != null) {
                            if (typefaceM != null) {
                                new Handler(Looper.getMainLooper()).post(new zs0(i4, xi0Var, typefaceM));
                            } else {
                                xi0Var.a(-3);
                            }
                        }
                        typefaceA = typefaceM;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (xi0Var != null) {
                        xi0Var.a(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (xi0Var != null) {
                        xi0Var.a(-3);
                    }
                }
            }
        } else if (xi0Var != null) {
            xi0Var.a(-3);
        }
        if (typefaceA != null || xi0Var != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
