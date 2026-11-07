package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bo implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
    public final WeakReference a;
    public ArrayList b;
    public final HashSet c;
    public final String d;

    public bo(View view, Handler handler, HashSet hashSet, String str) {
        handler.getClass();
        hashSet.getClass();
        this.a = new WeakReference(view);
        this.c = hashSet;
        this.d = str;
        handler.postDelayed(this, 200L);
    }

    public final void a(ao aoVar, View view, n70 n70Var) {
        View viewA = aoVar.a();
        if (viewA == null) {
            return;
        }
        String str = aoVar.b;
        View.OnClickListener onClickListenerF = g62.f(viewA);
        boolean z = (onClickListenerF instanceof vn) && ((vn) onClickListenerF).e;
        HashSet hashSet = this.c;
        if (hashSet.contains(str) || z) {
            return;
        }
        vn vnVar = null;
        if (!mt.a.contains(xn.class)) {
            try {
                vn vnVar2 = new vn();
                vnVar2.a = n70Var;
                vnVar2.b = new WeakReference(viewA);
                vnVar2.c = new WeakReference(view);
                vnVar2.d = g62.f(viewA);
                vnVar2.e = true;
                vnVar = vnVar2;
            } catch (Throwable th) {
                mt.a(xn.class, th);
            }
        }
        viewA.setOnClickListener(vnVar);
        hashSet.add(str);
    }

    public final void b(ao aoVar, View view, n70 n70Var) {
        AdapterView adapterView = (AdapterView) aoVar.a();
        if (adapterView == null) {
            return;
        }
        String str = aoVar.b;
        AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
        boolean z = (onItemClickListener instanceof wn) && ((wn) onItemClickListener).e;
        HashSet hashSet = this.c;
        if (hashSet.contains(str) || z) {
            return;
        }
        wn wnVar = null;
        if (!mt.a.contains(xn.class)) {
            try {
                wn wnVar2 = new wn();
                wnVar2.a = n70Var;
                wnVar2.b = new WeakReference(adapterView);
                wnVar2.c = new WeakReference(view);
                wnVar2.d = adapterView.getOnItemClickListener();
                wnVar2.e = true;
                wnVar = wnVar2;
            } catch (Throwable th) {
                mt.a(xn.class, th);
            }
        }
        adapterView.setOnItemClickListener(wnVar);
        hashSet.add(str);
    }

    public final void c(ao aoVar, View view, n70 n70Var) {
        View viewA = aoVar.a();
        if (viewA == null) {
            return;
        }
        String str = aoVar.b;
        View.OnTouchListener onTouchListenerG = g62.g(viewA);
        boolean z = (onTouchListenerG instanceof xe1) && ((xe1) onTouchListenerG).e;
        HashSet hashSet = this.c;
        if (hashSet.contains(str) || z) {
            return;
        }
        xe1 xe1Var = null;
        if (!mt.a.contains(ye1.class)) {
            try {
                xe1Var = new xe1(n70Var, view, viewA);
            } catch (Throwable th) {
                mt.a(ye1.class, th);
            }
        }
        viewA.setOnTouchListener(xe1Var);
        hashSet.add(str);
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            WeakReference weakReference = this.a;
            if (weakReference.get() != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    n70 n70Var = (n70) arrayList.get(i);
                    View view = (View) weakReference.get();
                    if (n70Var != null) {
                        String str = n70Var.d;
                        if (view != null) {
                            String str2 = this.d;
                            if (str == null || str.length() == 0 || Intrinsics.areEqual(str, str2)) {
                                List listUnmodifiableList = Collections.unmodifiableList(n70Var.b);
                                listUnmodifiableList.getClass();
                                if (listUnmodifiableList.size() <= 25) {
                                    ArrayList arrayListV = am2.v(view, listUnmodifiableList, 0, -1, str2);
                                    int size2 = arrayListV.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        Object obj = arrayListV.get(i2);
                                        i2++;
                                        ao aoVar = (ao) obj;
                                        try {
                                            View viewA = aoVar.a();
                                            if (viewA != null) {
                                                View viewA2 = g62.a(viewA);
                                                if (viewA2 != null && g62.a.m(viewA, viewA2)) {
                                                    c(aoVar, view, n70Var);
                                                } else if (!d.j(viewA.getClass().getName(), "com.facebook.react", false)) {
                                                    if (!(viewA instanceof AdapterView)) {
                                                        a(aoVar, view, n70Var);
                                                    } else if (viewA instanceof ListView) {
                                                        b(aoVar, view, n70Var);
                                                    }
                                                }
                                            }
                                        } catch (Exception unused) {
                                            mt.a.contains(co.class);
                                            i90 i90Var = i90.a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            ja0 ja0VarB = ma0.b(i90.b());
            if (ja0VarB != null && ja0VarB.g) {
                JSONArray jSONArray = ja0VarB.h;
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null) {
                    try {
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            jSONObject.getClass();
                            arrayList.add(qt.k(jSONObject));
                        }
                    } catch (IllegalArgumentException | JSONException unused) {
                    }
                }
                this.b = arrayList;
                View view = (View) this.a.get();
                if (view == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                }
                d();
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
