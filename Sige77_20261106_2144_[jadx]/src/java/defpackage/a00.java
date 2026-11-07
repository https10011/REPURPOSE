package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a00 extends os1 {
    @Override // defpackage.os1
    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        int i;
        a00 a00Var = this;
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList3.get(i2);
            i2++;
            ms1 ms1Var = (ms1) obj2;
            View view = ms1Var.c.t0;
            view.getClass();
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        e.g(ck1.r(visibility, "Unknown visibility "));
                        return;
                    }
                } else if (ms1Var.a != 2) {
                    break;
                }
            }
        }
        ms1 ms1Var2 = (ms1) obj2;
        ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            ms1 ms1Var3 = (ms1) objPrevious;
            View view2 = ms1Var3.c.t0;
            view2.getClass();
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    e.g(ck1.r(visibility2, "Unknown visibility "));
                    return;
                }
            }
            if (ms1Var3.a == 2) {
                obj = objPrevious;
                break;
            }
        }
        ms1 ms1Var4 = (ms1) obj;
        if (e.H(2)) {
            Log.v("FragmentManager", "Executing operations from " + ms1Var2 + " to " + ms1Var4);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList(arrayList3);
        Fragment fragment = ((ms1) CollectionsKt.t(arrayList3)).c;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            tf0 tf0Var = ((ms1) obj3).c.w0;
            tf0 tf0Var2 = fragment.w0;
            tf0Var.b = tf0Var2.b;
            tf0Var.c = tf0Var2.c;
            tf0Var.d = tf0Var2.d;
            tf0Var.e = tf0Var2.e;
        }
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj4 = arrayList3.get(i4);
            i4++;
            ms1 ms1Var5 = (ms1) obj4;
            rk rkVar = new rk();
            ms1Var5.d();
            LinkedHashSet linkedHashSet = ms1Var5.e;
            linkedHashSet.add(rkVar);
            arrayList4.add(new wz(ms1Var5, rkVar, z));
            rk rkVar2 = new rk();
            ms1Var5.d();
            linkedHashSet.add(rkVar2);
            boolean z2 = !z ? ms1Var5 != ms1Var4 : ms1Var5 != ms1Var2;
            xz xzVar = new xz(ms1Var5, rkVar2);
            Fragment fragment2 = ms1Var5.c;
            if (ms1Var5.a == 2) {
                if (z) {
                    tf0 tf0Var3 = fragment2.w0;
                } else {
                    fragment2.getClass();
                }
            } else if (z) {
                tf0 tf0Var4 = fragment2.w0;
            } else {
                fragment2.getClass();
            }
            if (ms1Var5.a == 2) {
                if (z) {
                    tf0 tf0Var5 = fragment2.w0;
                } else {
                    tf0 tf0Var6 = fragment2.w0;
                }
            }
            if (z2) {
                if (z) {
                    tf0 tf0Var7 = fragment2.w0;
                } else {
                    fragment2.getClass();
                }
            }
            arrayList5.add(xzVar);
            ms1Var5.d.add(new x4(arrayList6, ms1Var5, a00Var));
            arrayList3 = arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList7 = new ArrayList();
        int size4 = arrayList5.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj5 = arrayList5.get(i5);
            i5++;
            if (!((xz) obj5).m()) {
                arrayList7.add(obj5);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        int size5 = arrayList7.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj6 = arrayList7.get(i6);
            i6++;
            ((xz) obj6).getClass();
        }
        int size6 = arrayList8.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj7 = arrayList8.get(i7);
            i7++;
            ((xz) obj7).getClass();
        }
        int size7 = arrayList5.size();
        int i8 = 0;
        while (i8 < size7) {
            Object obj8 = arrayList5.get(i8);
            i8++;
            xz xzVar2 = (xz) obj8;
            linkedHashMap.put((ms1) xzVar2.a, Boolean.FALSE);
            xzVar2.h();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = a00Var.a;
        Context context = viewGroup.getContext();
        ArrayList arrayList9 = new ArrayList();
        int size8 = arrayList4.size();
        boolean z3 = false;
        int i9 = 0;
        while (i9 < size8) {
            i9++;
            wz wzVar = (wz) arrayList4.get(i9);
            if (wzVar.m()) {
                wzVar.h();
            } else {
                context.getClass();
                hs1 hs1VarU = wzVar.u(context);
                if (hs1VarU == null) {
                    wzVar.h();
                } else {
                    Animator animator = (Animator) hs1VarU.c;
                    if (animator == null) {
                        arrayList9.add(wzVar);
                    } else {
                        arrayList2 = arrayList9;
                        ms1 ms1Var6 = (ms1) wzVar.a;
                        Fragment fragment3 = ms1Var6.c;
                        i = size8;
                        if (Intrinsics.areEqual(linkedHashMap.get(ms1Var6), Boolean.TRUE)) {
                            if (e.H(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragment3 + " as this Fragment was involved in a Transition.");
                            }
                            wzVar.h();
                            a00Var = this;
                            arrayList9 = arrayList2;
                            size8 = i;
                            z3 = z3;
                        } else {
                            boolean z4 = ms1Var6.a == 3;
                            if (z4) {
                                arrayList6.remove(ms1Var6);
                            }
                            View view3 = fragment3.t0;
                            viewGroup.startViewTransition(view3);
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            ArrayList arrayList10 = arrayList4;
                            a00Var = this;
                            animator.addListener(new yz(a00Var, view3, z4, ms1Var6, wzVar));
                            animator.setTarget(view3);
                            animator.start();
                            if (e.H(2)) {
                                Log.v("FragmentManager", "Animator from operation " + ms1Var6 + " has started.");
                            }
                            ((rk) wzVar.b).a(new eg(5, animator, ms1Var6));
                            linkedHashMap = linkedHashMap2;
                            size8 = i;
                            arrayList9 = arrayList2;
                            arrayList4 = arrayList10;
                            z3 = true;
                        }
                    }
                }
            }
            arrayList2 = arrayList9;
            i = size8;
            a00Var = this;
            arrayList9 = arrayList2;
            size8 = i;
            z3 = z3;
        }
        ArrayList arrayList11 = arrayList9;
        boolean z5 = z3;
        int size9 = arrayList11.size();
        int i10 = 0;
        while (i10 < size9) {
            arrayList11 = arrayList11;
            Object obj9 = arrayList11.get(i10);
            i10++;
            wz wzVar2 = (wz) obj9;
            ms1 ms1Var7 = (ms1) wzVar2.a;
            Fragment fragment4 = ms1Var7.c;
            size9 = size9;
            if (zContainsValue) {
                if (e.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment4 + " as Animations cannot run alongside Transitions.");
                }
                wzVar2.h();
            } else if (z5) {
                if (e.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment4 + " as Animations cannot run alongside Animators.");
                }
                wzVar2.h();
            } else {
                View view4 = fragment4.t0;
                context.getClass();
                hs1 hs1VarU2 = wzVar2.u(context);
                if (hs1VarU2 == null) {
                    uq1.q("Required value was null.");
                    return;
                }
                Animation animation = (Animation) hs1VarU2.b;
                if (animation == null) {
                    uq1.q("Required value was null.");
                    return;
                }
                if (ms1Var7.a != 1) {
                    view4.startAnimation(animation);
                    wzVar2.h();
                } else {
                    viewGroup.startViewTransition(view4);
                    xf0 xf0Var = new xf0(animation, viewGroup, view4);
                    xf0Var.setAnimationListener(new zz(ms1Var7, a00Var, view4, wzVar2));
                    view4.startAnimation(xf0Var);
                    if (e.H(2)) {
                        Log.v("FragmentManager", "Animation from operation " + ms1Var7 + " has started.");
                    }
                }
                ((rk) wzVar2.b).a(new uu(view4, a00Var, wzVar2, ms1Var7));
                i10 = i10;
            }
        }
        int size10 = arrayList6.size();
        int i11 = 0;
        while (i11 < size10) {
            Object obj10 = arrayList6.get(i11);
            i11++;
            ms1 ms1Var8 = (ms1) obj10;
            View view5 = ms1Var8.c.t0;
            int i12 = ms1Var8.a;
            view5.getClass();
            ck1.c(view5, i12);
        }
        arrayList6.clear();
        if (e.H(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + ms1Var2 + " to " + ms1Var4);
        }
    }
}
