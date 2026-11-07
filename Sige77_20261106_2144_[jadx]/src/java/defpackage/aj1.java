package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class aj1 {
    public static aj1 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public qp0 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final zi1 h = new zi1(6);

    public static synchronized aj1 b() {
        try {
            if (g == null) {
                g = new aj1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        zi1 zi1Var = h;
        zi1Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) zi1Var.b(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        LayerDrawable layerDrawableG;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            s01 s01Var = (s01) this.b.get(context);
            layerDrawableG = null;
            if (s01Var != null && (weakReference = (WeakReference) s01Var.d(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iE = jw.e(s01Var.d, j, s01Var.b);
                    if (iE >= 0) {
                        Object[] objArr = s01Var.c;
                        Object obj = objArr[iE];
                        Object obj2 = g93.c;
                        if (obj != obj2) {
                            objArr[iE] = obj2;
                            s01Var.a = true;
                        }
                    }
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null) {
            if (i == 2131230776) {
                layerDrawableG = new LayerDrawable(new Drawable[]{c(context, 2131230775), c(context, 2131230777)});
            } else if (i == 2131230811) {
                layerDrawableG = qp0.g(this, context, 2131165243);
            } else if (i == 2131230810) {
                layerDrawableG = qp0.g(this, context, 2131165244);
            } else if (i == 2131230812) {
                layerDrawableG = qp0.g(this, context, 2131165245);
            }
        }
        if (layerDrawableG == null) {
            return layerDrawableG;
        }
        layerDrawableG.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableG.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableG;
                }
                s01 s01Var2 = (s01) this.b.get(context);
                if (s01Var2 == null) {
                    s01Var2 = new s01();
                    this.b.put(context, s01Var2);
                }
                s01Var2.g(new WeakReference(constantState2), j);
                return layerDrawableG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable drawableA;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableC = c(context, 2131230838);
                if (drawableC == null || (!(drawableC instanceof w42) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = context.getDrawable(i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z, drawableA);
            }
            if (drawableA != null) {
                i30.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        ks1 ks1Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListI = null;
        colorStateList = (weakHashMap == null || (ks1Var = (ks1) weakHashMap.get(context)) == null) ? null : (ColorStateList) ks1Var.d(i);
        if (colorStateList == null) {
            qp0 qp0Var = this.e;
            if (qp0Var != null) {
                colorStateListI = qp0Var.i(context, i);
            }
            if (colorStateListI != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                ks1 ks1Var2 = (ks1) this.a.get(context);
                if (ks1Var2 == null) {
                    ks1Var2 = new ks1();
                    this.a.put(context, ks1Var2);
                }
                ks1Var2.c(i, colorStateListI);
            }
            colorStateList = colorStateListI;
        }
        return colorStateList;
    }

    public final Drawable g(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        ColorStateList colorStateListF = f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListF);
            if (this.e != null && i == 2131230825) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        int i2 = 2130968838;
        if (this.e != null) {
            if (i == 2131230820) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iC = gx1.c(context, 2130968838);
                PorterDuff.Mode mode2 = m8.b;
                qp0.l(drawableFindDrawableByLayerId, iC, mode2);
                qp0.l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), gx1.c(context, 2130968838), mode2);
                qp0.l(layerDrawable.findDrawableByLayerId(R.id.progress), gx1.c(context, 2130968836), mode2);
                return drawable;
            }
            if (i == 2131230811 || i == 2131230810 || i == 2131230812) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iB = gx1.b(context, 2130968838);
                PorterDuff.Mode mode3 = m8.b;
                qp0.l(drawableFindDrawableByLayerId2, iB, mode3);
                qp0.l(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), gx1.c(context, 2130968836), mode3);
                qp0.l(layerDrawable2.findDrawableByLayerId(R.id.progress), gx1.c(context, 2130968836), mode3);
                return drawable;
            }
        }
        qp0 qp0Var = this.e;
        boolean z3 = false;
        if (qp0Var != null) {
            PorterDuff.Mode mode4 = m8.b;
            if (qp0.b((int[]) qp0Var.a, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (qp0.b((int[]) qp0Var.c, i)) {
                    i2 = 2130968836;
                } else {
                    boolean zB = qp0.b((int[]) qp0Var.d, i);
                    i2 = R.attr.colorBackground;
                    if (zB) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230797) {
                        iRound = Math.round(40.8f);
                        i2 = R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != 2131230779) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(m8.c(gx1.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
