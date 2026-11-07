package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class os1 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public os1(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final os1 f(ViewGroup viewGroup, e eVar) {
        viewGroup.getClass();
        eVar.getClass();
        eVar.F().getClass();
        Object tag = viewGroup.getTag(2131296760);
        if (tag instanceof os1) {
            return (os1) tag;
        }
        a00 a00Var = new a00(viewGroup);
        viewGroup.setTag(2131296760, a00Var);
        return a00Var;
    }

    public final void a(int i, int i2, f fVar) {
        synchronized (this.b) {
            rk rkVar = new rk();
            Fragment fragment = fVar.c;
            fragment.getClass();
            ms1 ms1VarD = d(fragment);
            if (ms1VarD != null) {
                ms1VarD.c(i, i2);
                return;
            }
            final ms1 ms1Var = new ms1(i, i2, fVar, rkVar);
            this.b.add(ms1Var);
            final int i3 = 0;
            ms1Var.d.add(new Runnable(this) { // from class: ls1
                public final /* synthetic */ os1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    ms1 ms1Var2 = ms1Var;
                    os1 os1Var = this.b;
                    switch (i4) {
                        case 0:
                            if (os1Var.b.contains(ms1Var2)) {
                                int i5 = ms1Var2.a;
                                View view = ms1Var2.c.t0;
                                view.getClass();
                                ck1.c(view, i5);
                            }
                            break;
                        default:
                            os1Var.b.remove(ms1Var2);
                            os1Var.c.remove(ms1Var2);
                            break;
                    }
                }
            });
            final int i4 = 1;
            ms1Var.d.add(new Runnable(this) { // from class: ls1
                public final /* synthetic */ os1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i4;
                    ms1 ms1Var2 = ms1Var;
                    os1 os1Var = this.b;
                    switch (i5) {
                        case 0:
                            if (os1Var.b.contains(ms1Var2)) {
                                int i6 = ms1Var2.a;
                                View view = ms1Var2.c.t0;
                                view.getClass();
                                ck1.c(view, i6);
                            }
                            break;
                        default:
                            os1Var.b.remove(ms1Var2);
                            os1Var.c.remove(ms1Var2);
                            break;
                    }
                }
            });
            Unit unit = Unit.a;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z);

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = x52.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayListD = CollectionsKt.D(this.c);
                    this.c.clear();
                    int size = arrayListD.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListD.get(i);
                        i++;
                        ms1 ms1Var = (ms1) obj;
                        if (e.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + ms1Var);
                        }
                        ms1Var.a();
                        if (!ms1Var.g) {
                            this.c.add(ms1Var);
                        }
                    }
                    g();
                    ArrayList arrayListD2 = CollectionsKt.D(this.b);
                    this.b.clear();
                    this.c.addAll(arrayListD2);
                    if (e.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayListD2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayListD2.get(i2);
                        i2++;
                        ((ms1) obj2).d();
                    }
                    b(arrayListD2, this.d);
                    this.d = false;
                    if (e.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ms1 d(Fragment fragment) {
        Object obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            ms1 ms1Var = (ms1) obj;
            if (Intrinsics.areEqual(ms1Var.c, fragment) && !ms1Var.f) {
                return (ms1) obj;
            }
        }
        obj = null;
        return (ms1) obj;
    }

    public final void e() {
        String str;
        String str2;
        if (e.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = x52.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((ms1) obj).d();
                }
                ArrayList arrayListD = CollectionsKt.D(this.c);
                int size2 = arrayListD.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayListD.get(i3);
                    i3++;
                    ms1 ms1Var = (ms1) obj2;
                    if (e.H(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = BuildConfig.FLAVOR;
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + ms1Var);
                    }
                    ms1Var.a();
                }
                ArrayList arrayListD2 = CollectionsKt.D(this.b);
                int size3 = arrayListD2.size();
                while (i < size3) {
                    Object obj3 = arrayListD2.get(i);
                    i++;
                    ms1 ms1Var2 = (ms1) obj3;
                    if (e.H(2)) {
                        if (zIsAttachedToWindow) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + ms1Var2);
                    }
                    ms1Var2.a();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ms1 ms1Var = (ms1) obj;
            int i2 = 2;
            if (ms1Var.b == 2) {
                int visibility = ms1Var.c.K().getVisibility();
                if (visibility != 0) {
                    i2 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            e.g(ck1.r(visibility, "Unknown visibility "));
                            return;
                        }
                        i2 = 3;
                    }
                }
                ms1Var.c(i2, 1);
            }
        }
    }
}
