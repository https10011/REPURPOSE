package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.a;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.hjq.toast.BuildConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        ea0 ea0Var = (ea0) this.b;
        ea0Var.a.f(fa0.b(ea0Var.b));
    }

    private final void b() {
        ce0 ce0Var = (ce0) this.b;
        synchronized (ce0Var.d) {
            try {
                if (ce0Var.v == null) {
                    return;
                }
                try {
                    me0 me0VarB = ce0Var.b();
                    int i = me0VarB.f;
                    if (i == 2) {
                        synchronized (ce0Var.d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i2 = cz1.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        qh1 qh1Var = ce0Var.c;
                        Context context = ce0Var.a;
                        qh1Var.getClass();
                        me0[] me0VarArr = {me0VarB};
                        gb2 gb2Var = u12.a;
                        rq0.n("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceK = u12.a.k(context, me0VarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferK = nj2.K(ce0Var.a, me0VarB.a);
                            if (mappedByteBufferK == null || typefaceK == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                ud2 ud2Var = new ud2(typefaceK, rq0.z(mappedByteBufferK));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (ce0Var.d) {
                                    try {
                                        kv kvVar = ce0Var.v;
                                        if (kvVar != null) {
                                            kvVar.V(ud2Var);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                ce0Var.a();
                            } catch (Throwable th2) {
                                int i3 = cz1.a;
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        int i4 = cz1.a;
                        Trace.endSection();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    synchronized (ce0Var.d) {
                        try {
                            kv kvVar2 = ce0Var.v;
                            if (kvVar2 != null) {
                                kvVar2.U(th5);
                            }
                            ce0Var.a();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    private final void c() {
        Fragment fragment = (Fragment) this.b;
        rg0 rg0Var = fragment.C0;
        rg0Var.f.g(fragment.d);
        fragment.d = null;
    }

    private final void d() {
        MaterialButton.a((MaterialButton) this.b);
    }

    private final void e() {
        ad1 ad1Var = (ad1) this.b;
        a aVar = ad1Var.f;
        if (ad1Var.b == 0) {
            ad1Var.c = true;
            aVar.e(kw0.ON_PAUSE);
        }
        if (ad1Var.a == 0 && ad1Var.c) {
            aVar.e(kw0.ON_STOP);
            ad1Var.d = true;
        }
    }

    private final void f() {
        ((af1) this.b).m();
    }

    private final void g() {
        co coVar = (co) this.b;
        synchronized (((ArrayDeque) coVar.d)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) coVar.a).edit();
            String str = (String) coVar.b;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) coVar.d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) coVar.c);
            }
            editorEdit.putString(str, sb.toString()).apply();
        }
    }

    private final void h() {
        ei eiVar = (ei) this.b;
        eiVar.c = false;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eiVar.e;
        c62 c62Var = sideSheetBehavior.i;
        if (c62Var != null && c62Var.f()) {
            eiVar.c(eiVar.b);
        } else if (sideSheetBehavior.h == 2) {
            sideSheetBehavior.s(eiVar.b);
        }
    }

    private final void i() {
        ((TextInputLayout) this.b).e.requestLayout();
    }

    private final void j() {
        r62 r62Var = (r62) this.b;
        if (mt.a.contains(r62.class)) {
            return;
        }
        try {
            WeakReference weakReference = r62Var.a;
            View viewK = ga.k((Activity) weakReference.get());
            Activity activity = (Activity) weakReference.get();
            if (viewK != null && activity != null) {
                ArrayList arrayListA = vu1.a(viewK);
                int size = arrayListA.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListA.get(i);
                    i++;
                    View view = (View) obj;
                    if (!mo1.o(view)) {
                        String strD = vu1.d(view);
                        if (strD.length() > 0 && strD.length() <= 300) {
                            HashSet hashSet = t62.e;
                            String localClassName = activity.getLocalClassName();
                            localClassName.getClass();
                            op0.p(view, viewK, localClassName);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            mt.a(r62.class, th);
        }
    }

    private final void k() {
        ga2 ga2Var = (ga2) this.b;
        Log.w("FirebaseMessaging", "Service took too long to process intent: " + ga2Var.a.getAction() + " finishing.");
        ga2Var.b.trySetResult((Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:256:0x051d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0539  */
    /* JADX WARN: Code duplicated, block: B:260:0x0544 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x0546  */
    /* JADX WARN: Code duplicated, block: B:262:0x054c  */
    /* JADX WARN: Code duplicated, block: B:264:0x0550  */
    /* JADX WARN: Code duplicated, block: B:266:0x055a  */
    /* JADX WARN: Code duplicated, block: B:267:0x055e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0561  */
    /* JADX WARN: Code duplicated, block: B:271:0x0565  */
    /* JADX WARN: Code duplicated, block: B:272:0x056c  */
    /* JADX WARN: Code duplicated, block: B:274:0x0576  */
    /* JADX WARN: Code duplicated, block: B:277:0x0580 A[LOOP:2: B:275:0x057a->B:277:0x0580, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x058b  */
    /* JADX WARN: Code duplicated, block: B:282:0x0593  */
    /* JADX WARN: Code duplicated, block: B:284:0x059c  */
    /* JADX WARN: Code duplicated, block: B:286:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:288:0x05a8 A[LOOP:3: B:287:0x05a6->B:288:0x05a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:289:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:292:0x05be A[LOOP:4: B:290:0x05b8->B:292:0x05be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:294:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:304:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:307:0x0629  */
    /* JADX WARN: Code duplicated, block: B:308:0x062c  */
    /* JADX WARN: Code duplicated, block: B:312:0x065d  */
    /* JADX WARN: Code duplicated, block: B:321:0x06a9 A[Catch: IOException -> 0x06b9, UnknownHostException -> 0x06be, LOOP:6: B:319:0x06a3->B:321:0x06a9, LOOP_END, TryCatch #15 {UnknownHostException -> 0x06be, IOException -> 0x06b9, blocks: (B:314:0x0686, B:316:0x0699, B:318:0x069f, B:319:0x06a3, B:321:0x06a9, B:326:0x06c5, B:328:0x06cf, B:333:0x06df, B:335:0x071c, B:342:0x0739, B:346:0x073f, B:347:0x0742, B:348:0x0743, B:336:0x072a, B:338:0x0730, B:341:0x0737, B:344:0x073d), top: B:505:0x0686, inners: #9, #13 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x06de  */
    /* JADX WARN: Code duplicated, block: B:335:0x071c A[Catch: IOException -> 0x06b9, UnknownHostException -> 0x06be, TRY_LEAVE, TryCatch #15 {UnknownHostException -> 0x06be, IOException -> 0x06b9, blocks: (B:314:0x0686, B:316:0x0699, B:318:0x069f, B:319:0x06a3, B:321:0x06a9, B:326:0x06c5, B:328:0x06cf, B:333:0x06df, B:335:0x071c, B:342:0x0739, B:346:0x073f, B:347:0x0742, B:348:0x0743, B:336:0x072a, B:338:0x0730, B:341:0x0737, B:344:0x073d), top: B:505:0x0686, inners: #9, #13 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x0730 A[Catch: all -> 0x0734, LOOP:7: B:495:0x072a->B:338:0x0730, LOOP_END, TryCatch #9 {all -> 0x0734, blocks: (B:336:0x072a, B:338:0x0730, B:341:0x0737), top: B:495:0x072a, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:376:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:377:0x0803  */
    /* JADX WARN: Code duplicated, block: B:379:0x0812  */
    /* JADX WARN: Code duplicated, block: B:381:0x0818  */
    /* JADX WARN: Code duplicated, block: B:384:0x0828  */
    /* JADX WARN: Code duplicated, block: B:386:0x082c  */
    /* JADX WARN: Code duplicated, block: B:387:0x0836  */
    /* JADX WARN: Code duplicated, block: B:390:0x0847  */
    /* JADX WARN: Code duplicated, block: B:392:0x0853  */
    /* JADX WARN: Code duplicated, block: B:393:0x0885  */
    /* JADX WARN: Code duplicated, block: B:402:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:404:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:408:0x090f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0915 A[LOOP:16: B:406:0x0909->B:410:0x0915, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:414:0x092d  */
    /* JADX WARN: Code duplicated, block: B:416:0x0933  */
    /* JADX WARN: Code duplicated, block: B:514:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x05de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0737 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x0918 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0939 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0936 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r5;
        ?? r3;
        int i;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        ss1 ss1Var;
        float f3;
        float f4;
        float f5;
        ss1 ss1Var2;
        boolean z2;
        ArrayList arrayList;
        c7 c7VarB;
        ArrayList arrayList2;
        int iIndexOf;
        int i2;
        int size;
        j01 j01Var;
        j01 j01Var2;
        ma maVar;
        String str;
        ?? A;
        int iMax;
        List listA;
        IntRange intRange;
        List listB;
        ma maVar2;
        Map mapB;
        String str2;
        j01 j01Var3;
        HttpURLConnection httpURLConnection;
        boolean z3;
        StringBuilder sb;
        BufferedReader bufferedReader;
        String line;
        Set<String> setKeySet;
        List listA2;
        ArrayList arrayList3;
        int i3;
        Object objF;
        int size2;
        ListIterator listIterator;
        List list;
        int size3;
        Iterator it;
        Object next;
        Object objT;
        fa faVar;
        j01 j01Var4;
        char c;
        int i4;
        String str3;
        ArrayList arrayList4;
        fv fvVar;
        String str4;
        int i5;
        int i6;
        ka kaVar;
        int i7;
        int i8 = 3;
        int i9 = 4;
        switch (this.a) {
            case 0:
                ((co) this.b).D();
                return;
            case 1:
                Activity activity = (Activity) this.b;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = g5.g;
                Method method = g5.f;
                Application application = Build.VERSION.SDK_INT;
                if (application >= 28) {
                    activity.recreate();
                    return;
                }
                if (((application != 26 && application != 27) || method != null) && (g5.e != null || g5.d != null)) {
                    try {
                        Object obj2 = g5.c.get(activity);
                        if (obj2 != null && (obj = g5.b.get(activity)) != null) {
                            application = activity.getApplication();
                            f5 f5Var = new f5(activity);
                            application.registerActivityLifecycleCallbacks(f5Var);
                            handler.post(new bh0(3, f5Var, obj2));
                            f5Var = (application == 26 || application == 27) ? 1 : 0;
                            try {
                                if (f5Var != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = application;
                                        r5 = f5Var;
                                        handler.post(new bh0(i9, (Object) r3, (Object) r5));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new bh0(i9, application, f5Var));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = application;
                                r5 = f5Var;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                c7 c7Var = (c7) ((c7) this.b).c.a;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList5 = c7Var.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList5.size()) {
                    rs1 rs1Var = (rs1) arrayList5.get(i10);
                    if (rs1Var == null) {
                        jUptimeMillis = jUptimeMillis;
                    } else {
                        wq1 wq1Var = c7Var.a;
                        Long l = (Long) wq1Var.get(rs1Var);
                        if (l == null) {
                            j = rs1Var.f;
                            if (j == 0) {
                                rs1Var.f = jUptimeMillis;
                                rs1Var.c(rs1Var.b);
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                rs1Var.f = jUptimeMillis;
                                f = rs1.b().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = rs1Var.l;
                                f2 = rs1Var.k;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        rs1Var.j.i = f2;
                                        rs1Var.k = Float.MAX_VALUE;
                                    }
                                    rs1Var.b = (float) rs1Var.j.i;
                                    rs1Var.a = 0.0f;
                                    rs1Var.l = false;
                                } else {
                                    jUptimeMillis = jUptimeMillis;
                                    ss1Var = rs1Var.j;
                                    f3 = rs1Var.b;
                                    f4 = rs1Var.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j5 = j4 / 2;
                                        b40 b40VarA = ss1Var.a(f3, f4, j5);
                                        ss1 ss1Var3 = rs1Var.j;
                                        ss1Var3.i = rs1Var.k;
                                        rs1Var.k = Float.MAX_VALUE;
                                        b40 b40VarA2 = ss1Var3.a(b40VarA.a, b40VarA.b, j5);
                                        rs1Var.b = b40VarA2.a;
                                        rs1Var.a = b40VarA2.b;
                                    } else {
                                        b40 b40VarA3 = ss1Var.a(f3, f4, j4);
                                        rs1Var.b = b40VarA3.a;
                                        rs1Var.a = b40VarA3.b;
                                    }
                                    float fMax = Math.max(rs1Var.b, -3.4028235E38f);
                                    rs1Var.b = fMax;
                                    float fMin = Math.min(fMax, Float.MAX_VALUE);
                                    rs1Var.b = fMin;
                                    f5 = rs1Var.a;
                                    ss1Var2 = rs1Var.j;
                                    ss1Var2.getClass();
                                    if (Math.abs(f5) < ss1Var2.e) {
                                    }
                                    z2 = false;
                                    float fMin2 = Math.min(rs1Var.b, Float.MAX_VALUE);
                                    rs1Var.b = fMin2;
                                    float fMax2 = Math.max(fMin2, -3.4028235E38f);
                                    rs1Var.b = fMax2;
                                    rs1Var.c(fMax2);
                                    if (z2) {
                                        arrayList = rs1Var.h;
                                        rs1Var.e = false;
                                        c7VarB = rs1.b();
                                        c7VarB.a.remove(rs1Var);
                                        arrayList2 = c7VarB.b;
                                        iIndexOf = arrayList2.indexOf(rs1Var);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            c7VarB.f = true;
                                        }
                                        rs1Var.f = 0L;
                                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                                            if (arrayList.get(i2) == null) {
                                                arrayList.get(i2).getClass();
                                                ur.a();
                                                return;
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z2 = true;
                                float fMin3 = Math.min(rs1Var.b, Float.MAX_VALUE);
                                rs1Var.b = fMin3;
                                float fMax3 = Math.max(fMin3, -3.4028235E38f);
                                rs1Var.b = fMax3;
                                rs1Var.c(fMax3);
                                if (z2) {
                                    arrayList = rs1Var.h;
                                    rs1Var.e = false;
                                    c7VarB = rs1.b();
                                    c7VarB.a.remove(rs1Var);
                                    arrayList2 = c7VarB.b;
                                    iIndexOf = arrayList2.indexOf(rs1Var);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        c7VarB.f = true;
                                    }
                                    rs1Var.f = 0L;
                                    while (i2 < arrayList.size()) {
                                        if (arrayList.get(i2) == null) {
                                            arrayList.get(i2).getClass();
                                            ur.a();
                                            return;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            wq1Var.remove(rs1Var);
                            j = rs1Var.f;
                            if (j == 0) {
                                rs1Var.f = jUptimeMillis;
                                rs1Var.c(rs1Var.b);
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                rs1Var.f = jUptimeMillis;
                                f = rs1.b().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = rs1Var.l;
                                f2 = rs1Var.k;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        rs1Var.j.i = f2;
                                        rs1Var.k = Float.MAX_VALUE;
                                    }
                                    rs1Var.b = (float) rs1Var.j.i;
                                    rs1Var.a = 0.0f;
                                    rs1Var.l = false;
                                } else {
                                    jUptimeMillis = jUptimeMillis;
                                    ss1Var = rs1Var.j;
                                    f3 = rs1Var.b;
                                    f4 = rs1Var.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j6 = j4 / 2;
                                        b40 b40VarA4 = ss1Var.a(f3, f4, j6);
                                        ss1 ss1Var4 = rs1Var.j;
                                        ss1Var4.i = rs1Var.k;
                                        rs1Var.k = Float.MAX_VALUE;
                                        b40 b40VarA5 = ss1Var4.a(b40VarA4.a, b40VarA4.b, j6);
                                        rs1Var.b = b40VarA5.a;
                                        rs1Var.a = b40VarA5.b;
                                    } else {
                                        b40 b40VarA6 = ss1Var.a(f3, f4, j4);
                                        rs1Var.b = b40VarA6.a;
                                        rs1Var.a = b40VarA6.b;
                                    }
                                    float fMax4 = Math.max(rs1Var.b, -3.4028235E38f);
                                    rs1Var.b = fMax4;
                                    float fMin4 = Math.min(fMax4, Float.MAX_VALUE);
                                    rs1Var.b = fMin4;
                                    f5 = rs1Var.a;
                                    ss1Var2 = rs1Var.j;
                                    ss1Var2.getClass();
                                    if (Math.abs(f5) < ss1Var2.e || Math.abs(fMin4 - ((float) ss1Var2.i)) >= ss1Var2.d) {
                                        z2 = false;
                                    } else {
                                        rs1Var.b = (float) rs1Var.j.i;
                                        rs1Var.a = 0.0f;
                                    }
                                    float fMin5 = Math.min(rs1Var.b, Float.MAX_VALUE);
                                    rs1Var.b = fMin5;
                                    float fMax5 = Math.max(fMin5, -3.4028235E38f);
                                    rs1Var.b = fMax5;
                                    rs1Var.c(fMax5);
                                    if (z2) {
                                        arrayList = rs1Var.h;
                                        rs1Var.e = false;
                                        c7VarB = rs1.b();
                                        c7VarB.a.remove(rs1Var);
                                        arrayList2 = c7VarB.b;
                                        iIndexOf = arrayList2.indexOf(rs1Var);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            c7VarB.f = true;
                                        }
                                        rs1Var.f = 0L;
                                        while (i2 < arrayList.size()) {
                                            if (arrayList.get(i2) == null) {
                                                arrayList.get(i2).getClass();
                                                ur.a();
                                                return;
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z2 = true;
                                float fMin6 = Math.min(rs1Var.b, Float.MAX_VALUE);
                                rs1Var.b = fMin6;
                                float fMax6 = Math.max(fMin6, -3.4028235E38f);
                                rs1Var.b = fMax6;
                                rs1Var.c(fMax6);
                                if (z2) {
                                    arrayList = rs1Var.h;
                                    rs1Var.e = false;
                                    c7VarB = rs1.b();
                                    c7VarB.a.remove(rs1Var);
                                    arrayList2 = c7VarB.b;
                                    iIndexOf = arrayList2.indexOf(rs1Var);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        c7VarB.f = true;
                                    }
                                    rs1Var.f = 0L;
                                    while (i2 < arrayList.size()) {
                                        if (arrayList.get(i2) == null) {
                                            arrayList.get(i2).getClass();
                                            ur.a();
                                            return;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            jUptimeMillis = jUptimeMillis;
                        }
                    }
                    i10++;
                    jUptimeMillis = jUptimeMillis;
                }
                if (c7Var.f) {
                    for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                        if (arrayList5.get(size4) == null) {
                            arrayList5.remove(size4);
                        }
                    }
                    if (arrayList5.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        md2 md2Var = c7Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((a7) md2Var.a);
                        md2Var.a = null;
                    }
                    i = 0;
                    c7Var.f = false;
                } else {
                    i = 0;
                }
                if (arrayList5.size() > 0) {
                    ((Choreographer) c7Var.e.b).postFrameCallback(new b7(c7Var.d, i));
                    return;
                }
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                mk0 mk0Var = (mk0) this.b;
                j01 j01Var5 = j01.a;
                j01 j01Var6 = j01.b;
                HashSet hashSet = oa.a;
                String str5 = "CAPITransformerWebRequests";
                String str6 = mk0Var.b;
                List listB2 = str6 != null ? StringsKt.B(str6, new String[]{"/"}, 0, 6) : null;
                if (listB2 == null || listB2.size() != 2) {
                    gp1 gp1Var = i01.c;
                    gp1.i(j01Var6, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", mk0Var);
                    return;
                }
                try {
                    ma maVar3 = oa.c;
                    if (maVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("credentials");
                        maVar3 = null;
                    }
                    String str7 = maVar3.b;
                    ma maVar4 = oa.c;
                    if (maVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("credentials");
                        maVar4 = null;
                    }
                    String str8 = str7 + "/capi/" + maVar4.a + "/events";
                    String str9 = "custom_events";
                    JSONObject jSONObject = mk0Var.c;
                    if (jSONObject != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h42.g(jSONObject));
                        String str10 = mk0Var.e;
                        str10.getClass();
                        linkedHashMap.put("custom_events", str10);
                        StringBuilder sb2 = new StringBuilder();
                        for (String str11 : linkedHashMap.keySet()) {
                            sb2.append(str11);
                            sb2.append(" : ");
                            sb2.append(linkedHashMap.get(str11));
                            sb2.append(System.getProperty("line.separator"));
                        }
                        gp1 gp1Var2 = i01.c;
                        synchronized (i90.b) {
                        }
                        Map map = la.a;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        ArrayList arrayList6 = new ArrayList();
                        maVar = null;
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        Object obj3 = linkedHashMap.get("event");
                        obj3.getClass();
                        String str12 = (String) obj3;
                        int i11 = Intrinsics.areEqual(str12, "MOBILE_APP_INSTALL") ? 1 : Intrinsics.areEqual(str12, "CUSTOM_APP_EVENTS") ? 2 : 3;
                        if (i11 != 3) {
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                String str13 = (String) entry.getKey();
                                Object value = entry.getValue();
                                str13.getClass();
                                fa[] faVarArrValues = fa.values();
                                int length = faVarArrValues.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 < length) {
                                        int i13 = length;
                                        faVar = faVarArrValues[i12];
                                        int i14 = i12;
                                        if (!Intrinsics.areEqual(faVar.a, str13)) {
                                            i12 = i14 + 1;
                                            length = i13;
                                        }
                                    } else {
                                        faVar = null;
                                    }
                                }
                                if (faVar != null) {
                                    value.getClass();
                                    Map map2 = la.a;
                                    ka kaVar2 = (ka) map2.get(faVar);
                                    if (kaVar2 == null || (i5 = kaVar2.a) == 0) {
                                        j01Var4 = j01Var6;
                                    } else {
                                        int iV = ts.v(i5);
                                        if (iV != 0) {
                                            j01Var4 = j01Var6;
                                            if (iV == 1 && (kaVar = (ka) map2.get(faVar)) != null && (i7 = kaVar.b) != 0) {
                                                linkedHashMap3.put(ts.e(i7), value);
                                            }
                                        } else {
                                            j01Var4 = j01Var6;
                                            if (faVar == fa.USER_DATA) {
                                                try {
                                                    linkedHashMap2.putAll(h42.g(new JSONObject((String) value)));
                                                    break;
                                                } catch (JSONException unused2) {
                                                    gp1 gp1Var3 = i01.c;
                                                    synchronized (i90.b) {
                                                    }
                                                }
                                            } else {
                                                ka kaVar3 = (ka) map2.get(faVar);
                                                if (kaVar3 != null && (i6 = kaVar3.b) != 0) {
                                                    linkedHashMap2.put(ts.e(i6), value);
                                                }
                                            }
                                        }
                                    }
                                    j01Var5 = j01Var5;
                                    str5 = str5;
                                    str9 = str9;
                                } else {
                                    j01Var4 = j01Var6;
                                    boolean zAreEqual = Intrinsics.areEqual(str13, str9);
                                    boolean z4 = value instanceof String;
                                    if (i11 == 2 && zAreEqual && z4) {
                                        String str14 = (String) value;
                                        ArrayList arrayList7 = new ArrayList();
                                        try {
                                            ArrayList arrayListF = h42.f(new JSONArray(str14));
                                            int size5 = arrayListF.size();
                                            int i15 = 0;
                                            while (i15 < size5) {
                                                Object obj4 = arrayListF.get(i15);
                                                i15++;
                                                ArrayList arrayList8 = arrayListF;
                                                arrayList7.add(h42.g(new JSONObject((String) obj4)));
                                                arrayListF = arrayList8;
                                            }
                                            if (arrayList7.isEmpty()) {
                                                arrayList4 = null;
                                            } else {
                                                arrayList4 = new ArrayList();
                                                int size6 = arrayList7.size();
                                                int i16 = 0;
                                                while (i16 < size6) {
                                                    int i17 = i16 + 1;
                                                    Map map3 = (Map) arrayList7.get(i16);
                                                    ArrayList arrayList9 = arrayList7;
                                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                                    int i18 = size6;
                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                    for (String str15 : map3.keySet()) {
                                                        str15.getClass();
                                                        String str16 = str9;
                                                        fv[] fvVarArrValues = fv.values();
                                                        j01 j01Var7 = j01Var5;
                                                        int length2 = fvVarArrValues.length;
                                                        int i19 = 0;
                                                        while (true) {
                                                            if (i19 < length2) {
                                                                int i20 = length2;
                                                                fvVar = fvVarArrValues[i19];
                                                                int i21 = i19;
                                                                if (!Intrinsics.areEqual(fvVar.a, str15)) {
                                                                    i19 = i21 + 1;
                                                                    length2 = i20;
                                                                }
                                                            } else {
                                                                fvVar = null;
                                                            }
                                                        }
                                                        ja jaVar = (ja) la.b.get(fvVar);
                                                        if (fvVar == null || jaVar == null) {
                                                            str4 = str5;
                                                        } else {
                                                            str4 = str5;
                                                            int i22 = jaVar.b;
                                                            int i23 = jaVar.a;
                                                            if (i23 == 0) {
                                                                try {
                                                                    String strD = ts.d(i22);
                                                                    if (fvVar == fv.EVENT_NAME && ((String) map3.get(str15)) != null) {
                                                                        Object obj5 = map3.get(str15);
                                                                        obj5.getClass();
                                                                        String str17 = (String) obj5;
                                                                        Map map4 = la.c;
                                                                        if (map4.containsKey(str17)) {
                                                                            js jsVar = (js) map4.get(str17);
                                                                            str17 = jsVar != null ? jsVar.a : BuildConfig.FLAVOR;
                                                                        }
                                                                        linkedHashMap6.put(strD, str17);
                                                                    } else if (fvVar == fv.EVENT_TIME && ((Integer) map3.get(str15)) != null) {
                                                                        Object obj6 = map3.get(str15);
                                                                        obj6.getClass();
                                                                        Object objA = la.a(obj6, str15);
                                                                        objA.getClass();
                                                                        linkedHashMap6.put(strD, objA);
                                                                    }
                                                                } catch (ClassCastException e) {
                                                                    gp1 gp1Var4 = i01.c;
                                                                    a80.b(e);
                                                                    synchronized (i90.b) {
                                                                    }
                                                                }
                                                            } else if (i23 == 3) {
                                                                String strD2 = ts.d(i22);
                                                                Object obj7 = map3.get(str15);
                                                                obj7.getClass();
                                                                Object objA2 = la.a(obj7, str15);
                                                                objA2.getClass();
                                                                linkedHashMap5.put(strD2, objA2);
                                                            }
                                                        }
                                                        str9 = str16;
                                                        j01Var5 = j01Var7;
                                                        str5 = str4;
                                                    }
                                                    j01 j01Var8 = j01Var5;
                                                    String str18 = str5;
                                                    String str19 = str9;
                                                    if (!linkedHashMap5.isEmpty()) {
                                                        linkedHashMap6.put("custom_data", linkedHashMap5);
                                                    }
                                                    arrayList4.add(linkedHashMap6);
                                                    i16 = i17;
                                                    arrayList7 = arrayList9;
                                                    size6 = i18;
                                                    str9 = str19;
                                                    j01Var5 = j01Var8;
                                                    str5 = str18;
                                                }
                                                j01Var5 = j01Var5;
                                                str5 = str5;
                                                str9 = str9;
                                            }
                                        } catch (JSONException unused3) {
                                            gp1 gp1Var5 = i01.c;
                                            synchronized (i90.b) {
                                            }
                                        }
                                        if (arrayList4 != null) {
                                            arrayList6.addAll(arrayList4);
                                        }
                                    } else {
                                        j01Var5 = j01Var5;
                                        str5 = str5;
                                        str9 = str9;
                                        int i24 = 3;
                                        int[] iArrA = ts.A(3);
                                        int length3 = iArrA.length;
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 >= length3) {
                                                c = 2;
                                                i4 = 0;
                                            } else {
                                                i4 = iArrA[i25];
                                                if (i4 != 1) {
                                                    c = 2;
                                                    if (i4 == 2) {
                                                        str3 = "data_processing_options_country";
                                                    } else {
                                                        if (i4 != i24) {
                                                            throw null;
                                                        }
                                                        str3 = "data_processing_options_state";
                                                    }
                                                } else {
                                                    c = 2;
                                                    str3 = "data_processing_options";
                                                }
                                                if (!Intrinsics.areEqual(str3, str13)) {
                                                    i25++;
                                                    i24 = 3;
                                                }
                                            }
                                        }
                                        if (i4 != 0) {
                                            linkedHashMap4.put(str13, value);
                                        }
                                    }
                                    j01Var6 = j01Var4;
                                    str9 = str9;
                                    j01Var5 = j01Var5;
                                    str5 = str5;
                                    i8 = 3;
                                }
                                c = 2;
                                j01Var6 = j01Var4;
                                str9 = str9;
                                j01Var5 = j01Var5;
                                str5 = str5;
                                i8 = 3;
                            }
                        }
                        j01Var = j01Var5;
                        j01Var2 = j01Var6;
                        str = str5;
                        if (i11 != i8) {
                            Object obj8 = linkedHashMap.get("install_timestamp");
                            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                            linkedHashMap7.put("action_source", "app");
                            linkedHashMap7.put("user_data", linkedHashMap2);
                            linkedHashMap7.put("app_data", linkedHashMap3);
                            linkedHashMap7.putAll(linkedHashMap4);
                            int iV2 = ts.v(i11);
                            if (iV2 != 0) {
                                if (iV2 == 1 && !arrayList6.isEmpty()) {
                                    A = new ArrayList();
                                    int size7 = arrayList6.size();
                                    int i26 = 0;
                                    while (i26 < size7) {
                                        Object obj9 = arrayList6.get(i26);
                                        i26++;
                                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                        linkedHashMap8.putAll(linkedHashMap7);
                                        linkedHashMap8.putAll((Map) obj9);
                                        A.add(linkedHashMap8);
                                    }
                                }
                            } else if (obj8 != null) {
                                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                                linkedHashMap9.putAll(linkedHashMap7);
                                linkedHashMap9.put("event_name", "MobileAppInstall");
                                linkedHashMap9.put("event_time", obj8);
                                A = kotlin.collections.a.a(linkedHashMap9);
                            }
                        }
                        if (A == 0) {
                            return;
                        }
                        oa.a().addAll((Collection) A);
                        iMax = Math.max(0, oa.a().size() - 1000);
                        if (iMax > 0) {
                            listA2 = oa.a();
                            listA2.getClass();
                            if (iMax >= 0) {
                                e.d(ts.g(iMax, "Requested element count ", " is less than zero."));
                                return;
                            }
                            if (iMax == 0) {
                                objF = CollectionsKt.B(listA2);
                            } else {
                                if (listA2 instanceof Collection) {
                                    size2 = listA2.size() - iMax;
                                    if (size2 <= 0) {
                                        objF = x50.a;
                                    } else if (size2 == 1) {
                                        if (listA2 instanceof List) {
                                            objT = CollectionsKt.t(listA2);
                                        } else {
                                            it = listA2.iterator();
                                            if (it.hasNext()) {
                                                throw new NoSuchElementException("Collection is empty.");
                                            }
                                            next = it.next();
                                            while (it.hasNext()) {
                                                next = it.next();
                                            }
                                            objT = next;
                                        }
                                        objF = kotlin.collections.a.a(objT);
                                    } else {
                                        arrayList3 = new ArrayList(size2);
                                        if (listA2 instanceof List) {
                                            if (listA2 instanceof RandomAccess) {
                                                list = listA2;
                                                size3 = list.size();
                                                while (iMax < size3) {
                                                    arrayList3.add(list.get(iMax));
                                                    iMax++;
                                                }
                                            } else {
                                                listIterator = listA2.listIterator(iMax);
                                                while (listIterator.hasNext()) {
                                                    arrayList3.add(listIterator.next());
                                                }
                                            }
                                            objF = arrayList3;
                                        }
                                    }
                                } else {
                                    arrayList3 = new ArrayList();
                                }
                                i3 = 0;
                                for (Object obj10 : listA2) {
                                    if (i3 >= iMax) {
                                        arrayList3.add(obj10);
                                    } else {
                                        i3++;
                                    }
                                }
                                objF = jo.f(arrayList3);
                            }
                            objF.getClass();
                            List listAsMutableList = TypeIntrinsics.asMutableList(objF);
                            listAsMutableList.getClass();
                            oa.d = listAsMutableList;
                        }
                        int iMin = Math.min(oa.a().size(), 10);
                        listA = oa.a();
                        intRange = new IntRange(0, iMin - 1, 1);
                        listA.getClass();
                        if (intRange.isEmpty()) {
                            listB = x50.a;
                        } else {
                            listB = CollectionsKt.B(listA.subList(0, ((kotlin.ranges.a) intRange).b + 1));
                        }
                        oa.a().subList(0, iMin).clear();
                        JSONArray jSONArray = new JSONArray((Collection) listB);
                        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                        linkedHashMap10.put("data", jSONArray);
                        maVar2 = oa.c;
                        if (maVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("credentials");
                            maVar2 = maVar;
                        }
                        linkedHashMap10.put("accessKey", maVar2.c);
                        String string = new JSONObject(linkedHashMap10).toString();
                        mapB = v11.b(new Pair("Content-Type", "application/json"));
                        na naVar = new na(listB);
                        try {
                            URLConnection uRLConnectionOpenConnection = new URL(str8).openConnection();
                            uRLConnectionOpenConnection.getClass();
                            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                            httpURLConnection.setRequestMethod("POST");
                            if (mapB != null && (setKeySet = mapB.keySet()) != null) {
                                for (String str20 : setKeySet) {
                                    httpURLConnection.setRequestProperty(str20, (String) mapB.get(str20));
                                }
                            }
                            if (!httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT")) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            httpURLConnection.setDoOutput(z3);
                            httpURLConnection.setConnectTimeout(60000);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                            bufferedWriter.write(string);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            bufferedOutputStream.close();
                            sb = new StringBuilder();
                            if (oa.a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                while (true) {
                                    try {
                                        line = bufferedReader.readLine();
                                        if (line != null) {
                                            sb.append(line);
                                        } else {
                                            Unit unit = Unit.a;
                                            bufferedReader.close();
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            nj2.q(bufferedReader, th3);
                                            throw th4;
                                        }
                                    }
                                }
                            }
                            String string2 = sb.toString();
                            gp1 gp1Var6 = i01.c;
                            j01Var3 = j01Var;
                            str2 = str;
                            try {
                                gp1.i(j01Var3, str2, "\nResponse Received: \n%s\n%s", string2, Integer.valueOf(httpURLConnection.getResponseCode()));
                                naVar.invoke(string2, Integer.valueOf(httpURLConnection.getResponseCode()));
                                return;
                            } catch (UnknownHostException e2) {
                                e = e2;
                            } catch (IOException e3) {
                                e = e3;
                                gp1 gp1Var7 = i01.c;
                                gp1.i(j01Var2, str2, "Send to server failed: \n%s", e.toString());
                                return;
                            }
                        } catch (UnknownHostException e4) {
                            e = e4;
                            j01Var3 = j01Var;
                            str2 = str;
                        } catch (IOException e5) {
                            e = e5;
                            str2 = str;
                            gp1 gp1Var8 = i01.c;
                            gp1.i(j01Var2, str2, "Send to server failed: \n%s", e.toString());
                            return;
                        }
                    } else {
                        j01Var = j01Var5;
                        j01Var2 = j01Var6;
                        maVar = null;
                        str = "CAPITransformerWebRequests";
                    }
                    A = maVar;
                    if (A == 0) {
                        return;
                    }
                    oa.a().addAll((Collection) A);
                    iMax = Math.max(0, oa.a().size() - 1000);
                    if (iMax > 0) {
                        listA2 = oa.a();
                        listA2.getClass();
                        if (iMax >= 0) {
                            e.d(ts.g(iMax, "Requested element count ", " is less than zero."));
                            return;
                        }
                        if (iMax == 0) {
                            objF = CollectionsKt.B(listA2);
                        } else {
                            if (listA2 instanceof Collection) {
                                size2 = listA2.size() - iMax;
                                if (size2 <= 0) {
                                    objF = x50.a;
                                } else if (size2 == 1) {
                                    if (listA2 instanceof List) {
                                        objT = CollectionsKt.t(listA2);
                                    } else {
                                        it = listA2.iterator();
                                        if (it.hasNext()) {
                                            throw new NoSuchElementException("Collection is empty.");
                                        }
                                        next = it.next();
                                        while (it.hasNext()) {
                                            next = it.next();
                                        }
                                        objT = next;
                                    }
                                    objF = kotlin.collections.a.a(objT);
                                } else {
                                    arrayList3 = new ArrayList(size2);
                                    if (listA2 instanceof List) {
                                        if (listA2 instanceof RandomAccess) {
                                            list = listA2;
                                            size3 = list.size();
                                            while (iMax < size3) {
                                                arrayList3.add(list.get(iMax));
                                                iMax++;
                                            }
                                        } else {
                                            listIterator = listA2.listIterator(iMax);
                                            while (listIterator.hasNext()) {
                                                arrayList3.add(listIterator.next());
                                            }
                                        }
                                        objF = arrayList3;
                                    }
                                }
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            i3 = 0;
                            while (r2.hasNext()) {
                                if (i3 >= iMax) {
                                    arrayList3.add(obj10);
                                } else {
                                    i3++;
                                }
                            }
                            objF = jo.f(arrayList3);
                        }
                        objF.getClass();
                        List listAsMutableList2 = TypeIntrinsics.asMutableList(objF);
                        listAsMutableList2.getClass();
                        oa.d = listAsMutableList2;
                    }
                    int iMin2 = Math.min(oa.a().size(), 10);
                    listA = oa.a();
                    intRange = new IntRange(0, iMin2 - 1, 1);
                    listA.getClass();
                    if (intRange.isEmpty()) {
                        listB = x50.a;
                    } else {
                        listB = CollectionsKt.B(listA.subList(0, ((kotlin.ranges.a) intRange).b + 1));
                    }
                    oa.a().subList(0, iMin2).clear();
                    JSONArray jSONArray2 = new JSONArray((Collection) listB);
                    LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                    linkedHashMap11.put("data", jSONArray2);
                    maVar2 = oa.c;
                    if (maVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("credentials");
                        maVar2 = maVar;
                    }
                    linkedHashMap11.put("accessKey", maVar2.c);
                    String string3 = new JSONObject(linkedHashMap11).toString();
                    mapB = v11.b(new Pair("Content-Type", "application/json"));
                    na naVar2 = new na(listB);
                    URLConnection uRLConnectionOpenConnection2 = new URL(str8).openConnection();
                    uRLConnectionOpenConnection2.getClass();
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection.setRequestMethod("POST");
                    if (mapB != null) {
                        while (r6.hasNext()) {
                            httpURLConnection.setRequestProperty(str20, (String) mapB.get(str20));
                        }
                    }
                    if (httpURLConnection.getRequestMethod().equals("POST")) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    httpURLConnection.setDoOutput(z3);
                    httpURLConnection.setConnectTimeout(60000);
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
                    bufferedWriter2.write(string3);
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                    bufferedOutputStream2.close();
                    sb = new StringBuilder();
                    if (oa.a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                            } else {
                                Unit unit2 = Unit.a;
                                bufferedReader.close();
                            }
                            e = e4;
                            j01Var3 = j01Var;
                            str2 = str;
                            gp1 gp1Var9 = i01.c;
                            gp1.i(j01Var3, str2, "Connection failed, retrying: \n%s", e.toString());
                            naVar2.invoke(maVar, 503);
                            return;
                        }
                    }
                    String string4 = sb.toString();
                    gp1 gp1Var10 = i01.c;
                    j01Var3 = j01Var;
                    str2 = str;
                    gp1.i(j01Var3, str2, "\nResponse Received: \n%s\n%s", string4, Integer.valueOf(httpURLConnection.getResponseCode()));
                    naVar2.invoke(string4, Integer.valueOf(httpURLConnection.getResponseCode()));
                    return;
                } catch (p22 e6) {
                    gp1 gp1Var11 = i01.c;
                    gp1.i(j01Var6, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e6);
                    return;
                }
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                h8 h8Var = (h8) this.b;
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction("android.location.PROVIDERS_CHANGED");
                    if (Build.VERSION.SDK_INT >= 33) {
                        hc.h.registerReceiver(new tc2(0), intentFilter, null, (Handler) h8Var.b, 4);
                    } else {
                        hc.h.registerReceiver(new tc2(0), intentFilter, null, (Handler) h8Var.b);
                    }
                    return;
                } catch (Exception e7) {
                    cc2.c(Log.getStackTraceString(e7));
                    return;
                }
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                yg ygVar = ((mg) this.b).a;
                if (ygVar.D0.getVisibility() != 8) {
                    ygVar.D0.setVisibility(8);
                    ygVar.y0.cancel();
                    return;
                }
                return;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                yg ygVar2 = ((ug) this.b).a;
                ygVar2.D0.setVisibility(0);
                ygVar2.y0.show();
                return;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                ((CarouselLayoutManager) this.b).m0();
                return;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                ((dn) this.b).s(true);
                return;
            case 9:
                co coVar = (co) this.b;
                if (mt.a.contains(co.class)) {
                    return;
                }
                try {
                    coVar.getClass();
                    coVar.z();
                    return;
                } catch (Throwable th5) {
                    mt.a(co.class, th5);
                    return;
                }
            case 10:
                ((c) this.b).invalidateMenu();
                return;
            case 11:
                iq iqVar = (iq) this.b;
                Runnable runnable = iqVar.b;
                if (runnable != null) {
                    runnable.run();
                    iqVar.b = null;
                    return;
                }
                return;
            case 12:
                lq.a((lq) this.b);
                return;
            case 13:
                ((gg) ((hu) this.b).d()).a(new zh0("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 4));
                return;
            case 14:
                ((DeviceAuthDialog) this.b).X();
                return;
            case 15:
                v30 v30Var = (v30) this.b;
                boolean zIsPopupShowing = v30Var.h.isPopupShowing();
                v30Var.s(zIsPopupShowing);
                v30Var.m = zIsPopupShowing;
                return;
            case 16:
                l90.g((l90) this.b);
                return;
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            case 19:
                c();
                return;
            case 20:
                d();
                return;
            case 21:
                e();
                return;
            case 22:
                f();
                return;
            case 23:
                g();
                return;
            case 24:
                h();
                return;
            case 25:
                i();
                return;
            case 26:
                j();
                return;
            case 27:
                k();
                return;
            default:
                ep1 ep1Var = (ep1) this.b;
                ((bl1) ep1Var.e).l(new ab(ep1Var, 23));
                return;
        }
    }
}
