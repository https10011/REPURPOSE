package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class u12 {
    public static final gb2 a;
    public static final a11 b;
    public static Paint c;

    static {
        rq0.n("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new a22();
        } else if (i >= 29) {
            a = new z12();
        } else if (i >= 28) {
            a = new y12();
        } else if (i >= 26) {
            a = new x12();
        } else {
            Method method = w12.Z;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new w12();
            } else {
                a = new v12();
            }
        }
        b = new a11(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, ie0 ie0Var, Resources resources, int i, String str, int i2, int i3, xi0 xi0Var, boolean z) {
        Typeface typefaceJ;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 3;
        int i5 = -3;
        if (ie0Var instanceof le0) {
            le0 le0Var = (le0) ie0Var;
            String str2 = le0Var.d;
            typefaceJ = null;
            int i6 = 1;
            int i7 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = le0Var.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderC = null;
                                int i9 = 0;
                                while (true) {
                                    if (i9 < arrayList.size()) {
                                        be0 be0Var = (be0) arrayList.get(i9);
                                        if (i9 == arrayList.size() - 1 && TextUtils.isEmpty(be0Var.f)) {
                                            customFallbackBuilderC.setSystemFallback(be0Var.e);
                                        } else {
                                            String str3 = be0Var.e;
                                            String str4 = be0Var.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + be0Var.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = n2.x(fontD).build();
                                                } else {
                                                    try {
                                                        t12.k();
                                                        t12.t();
                                                        fontFamilyBuild = n2.f(ef.h(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilderC == null) {
                                                    customFallbackBuilderC = n2.c(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderC.addCustomFallback(fontFamilyBuild);
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderC.build();
                                    break;
                                }
                            }
                            if (c(((be0) arrayList.get(i8)).e) != null) {
                                i8++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((be0) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (xi0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new zs0(i4, xi0Var, typefaceBuild));
                }
                b.c(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z2 = !z ? xi0Var != null : le0Var.c != 0;
            int i10 = z ? le0Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            ri2 ri2Var = new ri2();
            ri2Var.a = xi0Var;
            ArrayList arrayList2 = le0Var.a;
            int i11 = 2;
            r6 r6Var = new r6(handler, 2);
            dc2 dc2Var = new dc2(ri2Var, r6Var);
            int i12 = 6;
            if (!z2) {
                String strA = he0.a(i3, arrayList2);
                Typeface typeface = (Typeface) he0.a.b(strA);
                if (typeface != null) {
                    r6Var.execute(new bh0(i12, ri2Var, typeface));
                    typefaceJ = typeface;
                } else {
                    fe0 fe0Var = new fe0(dc2Var, i7);
                    synchronized (he0.c) {
                        try {
                            wq1 wq1Var = he0.d;
                            ArrayList arrayList3 = (ArrayList) wq1Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(fe0Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fe0Var);
                                wq1Var.put(strA, arrayList4);
                                ee0 ee0Var = new ee0(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = he0.b;
                                fe0 fe0Var2 = new fe0(strA, i6);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                gc gcVar = new gc(i11);
                                gcVar.c = ee0Var;
                                gcVar.d = fe0Var2;
                                gcVar.b = handler2;
                                threadPoolExecutor.execute(gcVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    e.g("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                be0 be0Var2 = (be0) arrayList2.get(0);
                a11 a11Var = he0.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{be0Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = he0.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) he0.a.b(strA2);
                if (typeface2 != null) {
                    r6Var.execute(new bh0(i12, ri2Var, typeface2));
                    typefaceJ = typeface2;
                } else if (i10 == -1) {
                    Object[] objArr = {be0Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    ge0 ge0VarB = he0.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    dc2Var.J(ge0VarB);
                    typefaceJ = ge0VarB.a;
                } else {
                    try {
                        try {
                            try {
                                ge0 ge0Var = (ge0) he0.b.submit(new ee0(strA2, context, be0Var2, i3, 0)).get(i10, TimeUnit.MILLISECONDS);
                                dc2Var.J(ge0Var);
                                typefaceJ = ge0Var.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((r6) dc2Var.b).execute(new hk((ri2) dc2Var.a, i5, i7));
                    }
                }
            }
        } else {
            typefaceJ = a.j(context, (je0) ie0Var, resources, i3);
            if (xi0Var != null) {
                if (typefaceJ != null) {
                    new Handler(Looper.getMainLooper()).post(new zs0(i4, xi0Var, typefaceJ));
                } else {
                    xi0Var.a(-3);
                }
            }
        }
        if (typefaceJ != null) {
            b.c(b(resources, i, str, i2, i3), typefaceJ);
        }
        return typefaceJ;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
