package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ mz c;

    public /* synthetic */ gz(mz mzVar, ArrayList arrayList, int i) {
        this.a = i;
        this.c = mzVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        int i = this.a;
        int i2 = 0;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    mz mzVar = this.c;
                    if (i2 >= size) {
                        arrayList.clear();
                        mzVar.m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        lz lzVar = (lz) obj;
                        kg1 kg1Var = lzVar.a;
                        int i3 = lzVar.b;
                        int i4 = lzVar.c;
                        int i5 = lzVar.d;
                        int i6 = lzVar.e;
                        mzVar.getClass();
                        View view = kg1Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        mzVar.p.add(kg1Var);
                        viewPropertyAnimatorAnimate.setDuration(mzVar.e).setListener(new iz(mzVar, kg1Var, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    mz mzVar2 = this.c;
                    if (i2 >= size2) {
                        arrayList.clear();
                        mzVar2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        kz kzVar = (kz) obj2;
                        ArrayList arrayList2 = mzVar2.r;
                        long j = mzVar2.f;
                        kg1 kg1Var2 = kzVar.a;
                        View view2 = kg1Var2 == null ? null : kg1Var2.a;
                        kg1 kg1Var3 = kzVar.b;
                        View view3 = kg1Var3 != null ? kg1Var3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(kzVar.a);
                            duration.translationX(kzVar.e - kzVar.c);
                            duration.translationY(kzVar.f - kzVar.d);
                            duration.alpha(0.0f).setListener(new jz(mzVar2, kzVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(kzVar.b);
                            c = 0;
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new jz(mzVar2, kzVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
                break;
            default:
                int size3 = arrayList.size();
                while (true) {
                    mz mzVar3 = this.c;
                    if (i2 >= size3) {
                        arrayList.clear();
                        mzVar3.l.remove(arrayList);
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        kg1 kg1Var4 = (kg1) obj3;
                        mzVar3.getClass();
                        View view4 = kg1Var4.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        mzVar3.o.add(kg1Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(mzVar3.c).setListener(new hz(mzVar3, kg1Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
