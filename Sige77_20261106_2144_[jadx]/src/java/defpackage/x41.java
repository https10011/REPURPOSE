package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.hjq.toast.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x41 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final HashMap e = new HashMap();
    public final WeakReference c;
    public final LinkedHashSet a = new LinkedHashSet();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean d = new AtomicBoolean(false);

    public x41(Activity activity) {
        this.c = new WeakReference(activity);
    }

    /* JADX INFO: Removed unreachable split cross block B:23:0x0033 */
    public final void a(View view) {
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            zs0 zs0Var = new zs0(2, view, this);
            if (!set.contains(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        zs0Var.run();
                    } else {
                        this.b.post(zs0Var);
                    }
                } catch (Throwable th) {
                    mt.a(this, th);
                }
            }
        } catch (Throwable th2) {
            mt.a(this, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00d0 A[SYNTHETIC] */
    public final void b(View view) {
        String str;
        String str2;
        boolean zC;
        LinkedHashSet linkedHashSet = this.a;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            String lowerCase = StringsKt.F(((EditText) view).getText().toString()).toString().toLowerCase();
            lowerCase.getClass();
            if (lowerCase.length() != 0 && !linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                linkedHashSet.add(lowerCase);
                HashMap map = new HashMap();
                ArrayList arrayListF = u41.f(view);
                CopyOnWriteArraySet copyOnWriteArraySet = w41.d;
                ArrayList arrayList = null;
                for (w41 w41Var : new HashSet(w41.a())) {
                    String strReplace = Intrinsics.areEqual("r2", w41Var.c()) ? new Regex("[^\\d.]").replace(lowerCase, BuildConfig.FLAVOR) : lowerCase;
                    if (mt.a.contains(w41Var)) {
                        str = null;
                    } else {
                        try {
                            str = w41Var.b;
                        } catch (Throwable th) {
                            mt.a(w41Var, th);
                            str = null;
                        }
                    }
                    int i = 0;
                    if (str.length() > 0) {
                        if (mt.a.contains(w41Var)) {
                            str2 = null;
                            if (mt.a.contains(u41.class)) {
                                zC = false;
                                if (!zC) {
                                }
                            } else {
                                try {
                                    strReplace.getClass();
                                    str2.getClass();
                                    zC = new Regex(str2).c(strReplace);
                                } catch (Throwable th2) {
                                    mt.a(u41.class, th2);
                                    zC = false;
                                }
                                if (!zC) {
                                }
                            }
                        } else {
                            try {
                                str2 = w41Var.b;
                            } catch (Throwable th3) {
                                mt.a(w41Var, th3);
                                str2 = null;
                            }
                            if (mt.a.contains(u41.class)) {
                                zC = false;
                                if (!zC) {
                                }
                            } else {
                                strReplace.getClass();
                                str2.getClass();
                                zC = new Regex(str2).c(strReplace);
                                if (!zC) {
                                }
                            }
                        }
                    }
                    if (u41.n(arrayListF, w41Var.b())) {
                        vl0.h(map, w41Var.c(), strReplace);
                    } else {
                        if (arrayList == null) {
                            if (mt.a.contains(u41.class)) {
                                arrayList = null;
                            } else {
                                try {
                                    arrayList = new ArrayList();
                                    ViewGroup viewGroupI = g62.i(view);
                                    if (viewGroupI != null) {
                                        ArrayList arrayListB = g62.b(viewGroupI);
                                        int size = arrayListB.size();
                                        while (i < size) {
                                            Object obj = arrayListB.get(i);
                                            i++;
                                            View view2 = (View) obj;
                                            if (view != view2) {
                                                arrayList.addAll(u41.b.m(view2));
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    mt.a(u41.class, th4);
                                    arrayList = null;
                                }
                            }
                        }
                        if (u41.n(arrayList, w41Var.b())) {
                            vl0.h(map, w41Var.c(), strReplace);
                        }
                    }
                }
                sp0.B(map);
            }
        } catch (Throwable th5) {
            mt.a(this, th5);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (mt.a.contains(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th) {
                mt.a(this, th);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
