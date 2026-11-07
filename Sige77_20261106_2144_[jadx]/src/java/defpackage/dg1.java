package defpackage;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dg1 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public cg1 g;
    public final /* synthetic */ RecyclerView h;

    public dg1(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(kg1 kg1Var, boolean z) {
        RecyclerView.j(kg1Var);
        View view = kg1Var.a;
        RecyclerView recyclerView = this.h;
        mg1 mg1Var = recyclerView.X0;
        if (mg1Var != null) {
            lg1 lg1Var = mg1Var.e;
            x52.n(view, lg1Var != null ? (k2) lg1Var.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.c0;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                ur.a();
                return;
            } else if (recyclerView.Q0 != null) {
                recyclerView.f.i(kg1Var);
            }
        }
        kg1Var.s = null;
        kg1Var.r = null;
        cg1 cg1VarC = c();
        cg1VarC.getClass();
        int i = kg1Var.f;
        ArrayList arrayList2 = cg1VarC.a(i).a;
        if (((bg1) cg1VarC.a.get(i)).b <= arrayList2.size()) {
            return;
        }
        kg1Var.m();
        arrayList2.add(kg1Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        hg1 hg1Var = recyclerView.Q0;
        if (i >= 0 && i < hg1Var.b()) {
            return !hg1Var.g ? i : recyclerView.d.w(i, 0);
        }
        StringBuilder sbU = ck1.u(i, "invalid position ", ". State item count is ");
        sbU.append(hg1Var.b());
        sbU.append(recyclerView.y());
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public final cg1 c() {
        if (this.g == null) {
            cg1 cg1Var = new cg1();
            cg1Var.a = new SparseArray();
            cg1Var.b = 0;
            this.g = cg1Var;
        }
        return this.g;
    }

    public final View d(int i) {
        return j(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.j1;
        we weVar = this.h.P0;
        int[] iArr2 = (int[]) weVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        weVar.c = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.c;
        a((kg1) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        kg1 kg1VarI = RecyclerView.I(view);
        boolean zJ = kg1VarI.j();
        RecyclerView recyclerView = this.h;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (kg1VarI.i()) {
            kg1VarI.n.k(kg1VarI);
        } else if (kg1VarI.p()) {
            kg1VarI.j &= -33;
        }
        h(kg1VarI);
        if (recyclerView.y0 == null || kg1VarI.g()) {
            return;
        }
        recyclerView.y0.d(kg1VarI);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098 A[LOOP:2: B:43:0x008b->B:47:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x009b A[EDGE_INSN: B:74:0x009b->B:48:0x009b BREAK  A[LOOP:1: B:39:0x0076->B:46:0x0095], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x009b A[EDGE_INSN: B:75:0x009b->B:48:0x009b BREAK  A[LOOP:1: B:39:0x0076->B:46:0x0095, LOOP_LABEL: LOOP:1: B:39:0x0076->B:46:0x0095], SYNTHETIC] */
    public final void h(kg1 kg1Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.h;
        we weVar = recyclerView.P0;
        boolean zI = kg1Var.i();
        View view = kg1Var.a;
        boolean z3 = false;
        boolean z4 = true;
        if (zI || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(kg1Var.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (kg1Var.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + kg1Var + recyclerView.y());
        }
        if (kg1Var.o()) {
            e.g("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.y()));
            return;
        }
        if ((kg1Var.j & 16) == 0) {
            WeakHashMap weakHashMap = x52.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (kg1Var.g()) {
            if (this.f <= 0 || (kg1Var.j & 526) != 0) {
                z2 = false;
            } else {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                if (size >= this.f && size > 0) {
                    f(0);
                    size--;
                }
                int[] iArr = RecyclerView.j1;
                if (size > 0) {
                    int i5 = kg1Var.c;
                    if (((int[]) weVar.d) != null) {
                        int i6 = weVar.c * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((kg1) arrayList.get(i)).c;
                                    if (((int[]) weVar.d) != null) {
                                        break;
                                    }
                                    i3 = weVar.c * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (((int[]) weVar.d)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) weVar.d)[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((kg1) arrayList.get(i)).c;
                            if (((int[]) weVar.d) != null) {
                                break;
                                break;
                            }
                            i3 = weVar.c * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) weVar.d)[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, kg1Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(kg1Var, true);
            }
            z3 = z2;
        } else {
            z4 = false;
        }
        recyclerView.f.i(kg1Var);
        if (z3 || z4 || !z) {
            return;
        }
        kg1Var.s = null;
        kg1Var.r = null;
    }

    public final void i(View view) {
        uf1 uf1Var;
        kg1 kg1VarI = RecyclerView.I(view);
        int i = kg1VarI.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && kg1VarI.k() && (uf1Var = recyclerView.y0) != null) {
            mz mzVar = (mz) uf1Var;
            if (kg1VarI.c().isEmpty() && mzVar.g && !kg1VarI.f()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                kg1VarI.n = this;
                kg1VarI.o = true;
                this.b.add(kg1VarI);
                return;
            }
        }
        if (kg1VarI.f() && !kg1VarI.h() && !recyclerView.a0.b) {
            e.g("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.y()));
            return;
        }
        kg1VarI.n = this;
        kg1VarI.o = false;
        this.a.add(kg1VarI);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01be  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01de  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:127:0x0218  */
    /* JADX WARN: Code duplicated, block: B:130:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x022b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0235  */
    /* JADX WARN: Code duplicated, block: B:136:0x0240  */
    /* JADX WARN: Code duplicated, block: B:138:0x024c  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02db  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:177:0x030c A[LOOP:3: B:173:0x02f7->B:177:0x030c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x030f A[EDGE_INSN: B:178:0x030f->B:179:0x0310 BREAK  A[LOOP:3: B:173:0x02f7->B:177:0x030c]] */
    /* JADX WARN: Code duplicated, block: B:180:0x0312  */
    /* JADX WARN: Code duplicated, block: B:183:0x031a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0322  */
    /* JADX WARN: Code duplicated, block: B:195:0x034e A[Catch: all -> 0x0386, TRY_LEAVE, TryCatch #0 {all -> 0x0386, blocks: (B:193:0x033b, B:195:0x034e, B:204:0x037e, B:205:0x0385), top: B:307:0x033b }] */
    /* JADX WARN: Code duplicated, block: B:198:0x035b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0374  */
    /* JADX WARN: Code duplicated, block: B:204:0x037e A[Catch: all -> 0x0386, TRY_ENTER, TryCatch #0 {all -> 0x0386, blocks: (B:193:0x033b, B:195:0x034e, B:204:0x037e, B:205:0x0385), top: B:307:0x033b }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:218:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:220:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:226:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:228:0x0400  */
    /* JADX WARN: Code duplicated, block: B:235:0x0413  */
    /* JADX WARN: Code duplicated, block: B:237:0x0428  */
    /* JADX WARN: Code duplicated, block: B:239:0x0434  */
    /* JADX WARN: Code duplicated, block: B:243:0x0442  */
    /* JADX WARN: Code duplicated, block: B:244:0x0445  */
    /* JADX WARN: Code duplicated, block: B:246:0x0448  */
    /* JADX WARN: Code duplicated, block: B:248:0x044e  */
    /* JADX WARN: Code duplicated, block: B:252:0x046d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0471  */
    /* JADX WARN: Code duplicated, block: B:257:0x0482  */
    /* JADX WARN: Code duplicated, block: B:262:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:265:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:286:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:289:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:294:0x0505  */
    /* JADX WARN: Code duplicated, block: B:296:0x050b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0515  */
    /* JADX WARN: Code duplicated, block: B:300:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x051e  */
    /* JADX WARN: Code duplicated, block: B:314:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x013a A[EDGE_INSN: B:80:0x013a->B:98:0x0198 BREAK  A[LOOP:1: B:43:0x008e->B:55:0x00ba]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0149  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x016a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0170  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:99:0x019a  */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0149, please report this as an issue */
    public final kg1 j(int i, long j) {
        kg1 kg1VarD;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        long j2;
        long j3;
        View view;
        int iW;
        int i2;
        pf1 pf1Var;
        boolean z3;
        long nanoTime;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z4;
        boolean z5;
        k2 k2Var;
        ArrayList arrayList3;
        ViewGroup.LayoutParams layoutParams;
        long j5;
        ViewGroup.LayoutParams layoutParams2;
        yf1 yf1Var;
        int i3;
        int iW2;
        pf1 pf1Var2;
        long nanoTime2;
        View view2;
        RecyclerView recyclerViewD;
        long nanoTime3;
        long j6;
        long j7;
        bg1 bg1Var;
        kg1 kg1Var;
        ArrayList arrayList4;
        int size;
        long jB;
        int size2;
        int i4;
        int size3;
        kg1 kg1Var2;
        long j8;
        int size4;
        int i5;
        ArrayList arrayList5;
        int size5;
        int i6;
        View view3;
        int size6;
        int i7;
        kg1 kg1Var3;
        kg1 kg1VarI;
        ac2 ac2Var;
        jm jmVar;
        int iIndexOfChild;
        jm jmVar2;
        int iIndexOfChild2;
        int iB;
        kg1 kg1VarI2;
        int i8;
        pf1 pf1Var3;
        boolean z6;
        kg1 kg1Var4;
        int size7;
        int iW3;
        ViewGroup viewGroup = this.h;
        hg1 hg1Var = ((RecyclerView) viewGroup).Q0;
        if (i < 0 || i >= hg1Var.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + hg1Var.b() + viewGroup.y());
        }
        if (hg1Var.g) {
            ArrayList arrayList6 = this.b;
            if (arrayList6 != null && (size7 = arrayList6.size()) != 0) {
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        if (((RecyclerView) viewGroup).a0.b && (iW3 = ((RecyclerView) viewGroup).d.w(i, 0)) > 0 && iW3 < ((RecyclerView) viewGroup).a0.a()) {
                            long jB2 = ((RecyclerView) viewGroup).a0.b(iW3);
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size7) {
                                    kg1VarD = null;
                                    break;
                                }
                                kg1 kg1Var5 = (kg1) this.b.get(i10);
                                if (!kg1Var5.p() && kg1Var5.e == jB2) {
                                    kg1Var5.a(32);
                                    kg1VarD = kg1Var5;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            kg1VarD = null;
                            break;
                        }
                    } else {
                        kg1VarD = (kg1) this.b.get(i9);
                        if (!kg1VarD.p() && kg1VarD.b() == i) {
                            kg1VarD.a(32);
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                kg1VarD = null;
                break;
            }
            if (kg1VarD != null) {
                z = true;
            }
            arrayList = this.a;
            arrayList2 = this.c;
            if (kg1VarD == null) {
                size4 = arrayList.size();
                i5 = 0;
                while (true) {
                    if (i5 < size4) {
                        arrayList5 = (ArrayList) ((RecyclerView) viewGroup).e.d;
                        size5 = arrayList5.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size5) {
                                z2 = true;
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList5.get(i6);
                            kg1VarI2 = RecyclerView.I(view3);
                            z2 = true;
                            if (kg1VarI2.b() != i && !kg1VarI2.f() && !kg1VarI2.h()) {
                                break;
                            }
                            i6++;
                        }
                        if (view3 != null) {
                            size6 = arrayList2.size();
                            i7 = 0;
                            while (true) {
                                if (i7 < size6) {
                                    kg1VarD = null;
                                    break;
                                }
                                kg1Var3 = (kg1) arrayList2.get(i7);
                                if (kg1Var3.f() && kg1Var3.b() == i && !kg1Var3.d()) {
                                    arrayList2.remove(i7);
                                    kg1VarD = kg1Var3;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            kg1VarI = RecyclerView.I(view3);
                            ac2Var = ((RecyclerView) viewGroup).e;
                            jmVar = (jm) ac2Var.c;
                            iIndexOfChild = ((RecyclerView) ((wa) ac2Var.b).b).indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                ur.g(view3, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (jmVar.d(iIndexOfChild)) {
                                sm0.u(view3, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            jmVar.a(iIndexOfChild);
                            ac2Var.T(view3);
                            ac2 ac2Var2 = ((RecyclerView) viewGroup).e;
                            jmVar2 = (jm) ac2Var2.c;
                            iIndexOfChild2 = ((RecyclerView) ((wa) ac2Var2.b).b).indexOfChild(view3);
                            if (iIndexOfChild2 == -1 && !jmVar2.d(iIndexOfChild2)) {
                                iB = iIndexOfChild2 - jmVar2.b(iIndexOfChild2);
                            } else {
                                iB = -1;
                            }
                            if (iB != -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + kg1VarI + viewGroup.y());
                            }
                            ((RecyclerView) viewGroup).e.u(iB);
                            i(view3);
                            kg1VarI.a(8224);
                            kg1VarD = kg1VarI;
                            break;
                        }
                    } else {
                        kg1Var4 = (kg1) arrayList.get(i5);
                        if (kg1Var4.p() && kg1Var4.b() == i && !kg1Var4.f() && (hg1Var.g || !kg1Var4.h())) {
                            kg1Var4.a(32);
                            kg1VarD = kg1Var4;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (kg1VarD != null) {
                    if (!kg1VarD.h()) {
                        z6 = hg1Var.g;
                    } else {
                        i8 = kg1VarD.c;
                        if (i8 >= 0 || i8 >= ((RecyclerView) viewGroup).a0.a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + kg1VarD + viewGroup.y());
                        }
                        if (hg1Var.g) {
                            pf1Var3 = ((RecyclerView) viewGroup).a0;
                            if (pf1Var3.b) {
                            }
                            z6 = z2;
                        } else {
                            ((RecyclerView) viewGroup).a0.getClass();
                            if (kg1VarD.f != 0) {
                                z6 = false;
                            } else {
                                pf1Var3 = ((RecyclerView) viewGroup).a0;
                                if (pf1Var3.b || kg1VarD.e == pf1Var3.b(kg1VarD.c)) {
                                    z6 = z2;
                                } else {
                                    z6 = false;
                                }
                            }
                        }
                    }
                    if (z6) {
                        z = z2;
                    } else {
                        kg1VarD.a(4);
                        if (kg1VarD.i()) {
                            viewGroup.removeDetachedView(kg1VarD.a, false);
                            kg1VarD.n.k(kg1VarD);
                        } else if (kg1VarD.p()) {
                            kg1VarD.j &= -33;
                        }
                        h(kg1VarD);
                        kg1VarD = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (kg1VarD == null) {
                iW2 = ((RecyclerView) viewGroup).d.w(i, 0);
                if (iW2 >= 0) {
                    j2 = 3;
                    if (iW2 < ((RecyclerView) viewGroup).a0.a()) {
                        ((RecyclerView) viewGroup).a0.getClass();
                        pf1Var2 = ((RecyclerView) viewGroup).a0;
                        if (pf1Var2.b) {
                            jB = pf1Var2.b(iW2);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    i4 = iW2;
                                    j3 = 4;
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            kg1Var2 = (kg1) arrayList2.get(size3);
                                            if (kg1Var2.e == jB || kg1Var2.d()) {
                                                size3--;
                                            } else {
                                                if (kg1Var2.f == 0) {
                                                    arrayList2.remove(size3);
                                                    kg1VarD = kg1Var2;
                                                    break;
                                                }
                                                f(size3);
                                            }
                                        }
                                        kg1VarD = null;
                                        break;
                                    }
                                }
                                j3 = 4;
                                kg1 kg1Var6 = (kg1) arrayList.get(size2);
                                i4 = iW2;
                                j8 = kg1Var6.e;
                                View view4 = kg1Var6.a;
                                if (j8 != jB && !kg1Var6.p()) {
                                    if (kg1Var6.f == 0) {
                                        kg1Var6.a(32);
                                        if (kg1Var6.h() && !hg1Var.g) {
                                            kg1Var6.j = (kg1Var6.j & (-15)) | 2;
                                        }
                                        kg1VarD = kg1Var6;
                                        break;
                                    }
                                    arrayList.remove(size2);
                                    viewGroup.removeDetachedView(view4, false);
                                    kg1 kg1VarI3 = RecyclerView.I(view4);
                                    kg1VarI3.n = null;
                                    kg1VarI3.o = false;
                                    kg1VarI3.j &= -33;
                                    h(kg1VarI3);
                                }
                                size2--;
                                iW2 = i4;
                            }
                            if (kg1VarD != null) {
                                kg1VarD.c = i4;
                                z = z2;
                            }
                        } else {
                            j3 = 4;
                        }
                        if (kg1VarD == null) {
                            bg1Var = (bg1) c().a.get(0);
                            if (bg1Var != null) {
                                kg1Var = null;
                                break;
                            }
                            arrayList4 = bg1Var.a;
                            if (arrayList4.isEmpty()) {
                                size = arrayList4.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        kg1Var = null;
                                        break;
                                    }
                                    if (!((kg1) arrayList4.get(size)).d()) {
                                        kg1Var = (kg1) arrayList4.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                kg1Var = null;
                                break;
                            }
                            if (kg1Var != null) {
                                kg1Var.m();
                                int[] iArr = RecyclerView.j1;
                            }
                            kg1VarD = kg1Var;
                        }
                        if (kg1VarD == null) {
                            nanoTime2 = viewGroup.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.g.a(0).c;
                                if (j7 != 0 && j7 + nanoTime2 >= j) {
                                    return null;
                                }
                            }
                            pf1 pf1Var4 = ((RecyclerView) viewGroup).a0;
                            pf1Var4.getClass();
                            try {
                                int i11 = cz1.a;
                                Trace.beginSection("RV CreateView");
                                kg1VarD = pf1Var4.d(viewGroup);
                                view2 = kg1VarD.a;
                                if (view2.getParent() == null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                kg1VarD.f = 0;
                                Trace.endSection();
                                int[] iArr2 = RecyclerView.j1;
                                recyclerViewD = RecyclerView.D(view2);
                                if (recyclerViewD != null) {
                                    kg1VarD.b = new WeakReference(recyclerViewD);
                                }
                                nanoTime3 = viewGroup.getNanoTime() - nanoTime2;
                                bg1 bg1VarA = this.g.a(0);
                                j6 = bg1VarA.c;
                                if (j6 != 0) {
                                    nanoTime3 = (nanoTime3 / j3) + ((j6 / j3) * 3);
                                }
                                bg1VarA.c = nanoTime3;
                            } catch (Throwable th) {
                                int i12 = cz1.a;
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iW2 + ").state:" + hg1Var.b() + viewGroup.y());
            }
            j2 = 3;
            j3 = 4;
            view = kg1VarD.a;
            if (z && !hg1Var.g) {
                i3 = kg1VarD.j;
                if ((i3 & 8192) != 0) {
                    kg1VarD.j = i3 & (-8193);
                    if (hg1Var.j) {
                        uf1.b(kg1VarD);
                        uf1 uf1Var = ((RecyclerView) viewGroup).y0;
                        kg1VarD.c();
                        uf1Var.getClass();
                        u61 u61Var = new u61();
                        u61Var.a(kg1VarD);
                        viewGroup.U(kg1VarD, u61Var);
                    }
                }
            }
            if (hg1Var.g || !kg1VarD.e()) {
                if (kg1VarD.e() || (kg1VarD.j & 2) != 0 || kg1VarD.f()) {
                    iW = ((RecyclerView) viewGroup).d.w(i, 0);
                    kg1VarD.s = null;
                    kg1VarD.r = viewGroup;
                    i2 = kg1VarD.f;
                    long nanoTime4 = viewGroup.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.g.a(i2).d;
                        if (j5 != 0 || j5 + nanoTime4 < j) {
                        }
                    }
                    pf1Var = ((RecyclerView) viewGroup).a0;
                    pf1Var.getClass();
                    if (kg1VarD.s == null) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        kg1VarD.c = iW;
                        if (pf1Var.b) {
                            kg1VarD.e = pf1Var.b(iW);
                        }
                        kg1VarD.j = (kg1VarD.j & (-520)) | 1;
                        int i13 = cz1.a;
                        Trace.beginSection("RV OnBindView");
                    }
                    kg1VarD.s = pf1Var;
                    kg1VarD.c();
                    pf1Var.c(kg1VarD, iW);
                    if (z3) {
                        arrayList3 = kg1VarD.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        kg1VarD.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof yf1) {
                            ((yf1) layoutParams).c = z2;
                        }
                        int i14 = cz1.a;
                        Trace.endSection();
                    }
                    nanoTime = viewGroup.getNanoTime() - nanoTime4;
                    bg1 bg1VarA2 = this.g.a(kg1VarD.f);
                    j4 = bg1VarA2.d;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    bg1VarA2.d = nanoTime;
                    accessibilityManager = ((RecyclerView) viewGroup).o0;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        WeakHashMap weakHashMap = x52.a;
                        z4 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        mg1 mg1Var = ((RecyclerView) viewGroup).X0;
                        if (mg1Var != null) {
                            lg1 lg1Var = mg1Var.e;
                            if (lg1Var != null) {
                                View.AccessibilityDelegate accessibilityDelegateD = x52.d(view);
                                if (accessibilityDelegateD == null) {
                                    k2Var = null;
                                } else {
                                    k2Var = accessibilityDelegateD instanceof j2 ? ((j2) accessibilityDelegateD).a : new k2(accessibilityDelegateD);
                                }
                                if (k2Var != null && k2Var != lg1Var) {
                                    lg1Var.e.put(view, k2Var);
                                }
                            }
                            x52.n(view, lg1Var);
                        }
                    } else {
                        z4 = true;
                    }
                    if (hg1Var.g) {
                        kg1VarD.g = i;
                    }
                    z5 = z4;
                }
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    yf1Var = (yf1) viewGroup.generateDefaultLayoutParams();
                    view.setLayoutParams(yf1Var);
                } else if (viewGroup.checkLayoutParams(layoutParams2)) {
                    yf1Var = (yf1) layoutParams2;
                } else {
                    yf1Var = (yf1) viewGroup.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(yf1Var);
                }
                yf1Var.a = kg1VarD;
                if (z || !z5) {
                    z4 = false;
                }
                yf1Var.d = z4;
                return kg1VarD;
            }
            kg1VarD.g = i;
            z5 = false;
            z4 = z2;
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                yf1Var = (yf1) viewGroup.generateDefaultLayoutParams();
                view.setLayoutParams(yf1Var);
            } else if (viewGroup.checkLayoutParams(layoutParams2)) {
                yf1Var = (yf1) viewGroup.generateLayoutParams(layoutParams2);
                view.setLayoutParams(yf1Var);
            } else {
                yf1Var = (yf1) layoutParams2;
            }
            yf1Var.a = kg1VarD;
            if (z) {
                z4 = false;
            } else {
                z4 = false;
            }
            yf1Var.d = z4;
            return kg1VarD;
        }
        kg1VarD = null;
        z = false;
        arrayList = this.a;
        arrayList2 = this.c;
        if (kg1VarD == null) {
            size4 = arrayList.size();
            i5 = 0;
            while (true) {
                if (i5 < size4) {
                    arrayList5 = (ArrayList) ((RecyclerView) viewGroup).e.d;
                    size5 = arrayList5.size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size5) {
                            z2 = true;
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList5.get(i6);
                        kg1VarI2 = RecyclerView.I(view3);
                        z2 = true;
                        if (kg1VarI2.b() != i) {
                        }
                        i6++;
                    }
                    if (view3 != null) {
                        size6 = arrayList2.size();
                        i7 = 0;
                        while (true) {
                            if (i7 < size6) {
                                kg1VarD = null;
                                break;
                            }
                            kg1Var3 = (kg1) arrayList2.get(i7);
                            if (kg1Var3.f()) {
                            }
                            i7++;
                        }
                    } else {
                        kg1VarI = RecyclerView.I(view3);
                        ac2Var = ((RecyclerView) viewGroup).e;
                        jmVar = (jm) ac2Var.c;
                        iIndexOfChild = ((RecyclerView) ((wa) ac2Var.b).b).indexOfChild(view3);
                        if (iIndexOfChild >= 0) {
                            ur.g(view3, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (jmVar.d(iIndexOfChild)) {
                            sm0.u(view3, "trying to unhide a view that was not hidden");
                            return null;
                        }
                        jmVar.a(iIndexOfChild);
                        ac2Var.T(view3);
                        ac2 ac2Var3 = ((RecyclerView) viewGroup).e;
                        jmVar2 = (jm) ac2Var3.c;
                        iIndexOfChild2 = ((RecyclerView) ((wa) ac2Var3.b).b).indexOfChild(view3);
                        if (iIndexOfChild2 == -1) {
                            iB = -1;
                        } else {
                            iB = iIndexOfChild2 - jmVar2.b(iIndexOfChild2);
                        }
                        if (iB != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + kg1VarI + viewGroup.y());
                        }
                        ((RecyclerView) viewGroup).e.u(iB);
                        i(view3);
                        kg1VarI.a(8224);
                        kg1VarD = kg1VarI;
                        break;
                    }
                } else {
                    kg1Var4 = (kg1) arrayList.get(i5);
                    if (kg1Var4.p()) {
                    }
                    i5++;
                }
            }
            if (kg1VarD != null) {
                if (!kg1VarD.h()) {
                    i8 = kg1VarD.c;
                    if (i8 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + kg1VarD + viewGroup.y());
                }
                z6 = hg1Var.g;
                if (z6) {
                    kg1VarD.a(4);
                    if (kg1VarD.i()) {
                        viewGroup.removeDetachedView(kg1VarD.a, false);
                        kg1VarD.n.k(kg1VarD);
                    } else if (kg1VarD.p()) {
                        kg1VarD.j &= -33;
                    }
                    h(kg1VarD);
                    kg1VarD = null;
                } else {
                    z = z2;
                }
            }
        } else {
            z2 = true;
        }
        if (kg1VarD == null) {
            iW2 = ((RecyclerView) viewGroup).d.w(i, 0);
            if (iW2 >= 0) {
                j2 = 3;
                if (iW2 < ((RecyclerView) viewGroup).a0.a()) {
                    ((RecyclerView) viewGroup).a0.getClass();
                    pf1Var2 = ((RecyclerView) viewGroup).a0;
                    if (pf1Var2.b) {
                        jB = pf1Var2.b(iW2);
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                i4 = iW2;
                                j3 = 4;
                                size3 = arrayList2.size() - 1;
                                while (true) {
                                    if (size3 >= 0) {
                                        kg1Var2 = (kg1) arrayList2.get(size3);
                                        if (kg1Var2.e == jB) {
                                        }
                                        size3--;
                                    }
                                    kg1VarD = null;
                                    break;
                                }
                            }
                            j3 = 4;
                            kg1 kg1Var7 = (kg1) arrayList.get(size2);
                            i4 = iW2;
                            j8 = kg1Var7.e;
                            View view5 = kg1Var7.a;
                            if (j8 != jB) {
                            }
                            size2--;
                            iW2 = i4;
                        }
                        if (kg1VarD != null) {
                            kg1VarD.c = i4;
                            z = z2;
                        }
                    } else {
                        j3 = 4;
                    }
                    if (kg1VarD == null) {
                        bg1Var = (bg1) c().a.get(0);
                        if (bg1Var != null) {
                            kg1Var = null;
                            break;
                        }
                        arrayList4 = bg1Var.a;
                        if (arrayList4.isEmpty()) {
                            kg1Var = null;
                            break;
                        }
                        size = arrayList4.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                kg1Var = null;
                                break;
                            }
                            if (!((kg1) arrayList4.get(size)).d()) {
                                kg1Var = (kg1) arrayList4.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (kg1Var != null) {
                            kg1Var.m();
                            int[] iArr3 = RecyclerView.j1;
                        }
                        kg1VarD = kg1Var;
                    }
                    if (kg1VarD == null) {
                        nanoTime2 = viewGroup.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j7 = this.g.a(0).c;
                            if (j7 != 0) {
                                return null;
                            }
                        }
                        pf1 pf1Var5 = ((RecyclerView) viewGroup).a0;
                        pf1Var5.getClass();
                        int i15 = cz1.a;
                        Trace.beginSection("RV CreateView");
                        kg1VarD = pf1Var5.d(viewGroup);
                        view2 = kg1VarD.a;
                        if (view2.getParent() == null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        kg1VarD.f = 0;
                        Trace.endSection();
                        int[] iArr4 = RecyclerView.j1;
                        recyclerViewD = RecyclerView.D(view2);
                        if (recyclerViewD != null) {
                            kg1VarD.b = new WeakReference(recyclerViewD);
                        }
                        nanoTime3 = viewGroup.getNanoTime() - nanoTime2;
                        bg1 bg1VarA3 = this.g.a(0);
                        j6 = bg1VarA3.c;
                        if (j6 != 0) {
                            nanoTime3 = (nanoTime3 / j3) + ((j6 / j3) * 3);
                        }
                        bg1VarA3.c = nanoTime3;
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iW2 + ").state:" + hg1Var.b() + viewGroup.y());
        }
        j2 = 3;
        j3 = 4;
        view = kg1VarD.a;
        if (z) {
            i3 = kg1VarD.j;
            if ((i3 & 8192) != 0) {
                kg1VarD.j = i3 & (-8193);
                if (hg1Var.j) {
                    uf1.b(kg1VarD);
                    uf1 uf1Var2 = ((RecyclerView) viewGroup).y0;
                    kg1VarD.c();
                    uf1Var2.getClass();
                    u61 u61Var2 = new u61();
                    u61Var2.a(kg1VarD);
                    viewGroup.U(kg1VarD, u61Var2);
                }
            }
        }
        if (hg1Var.g) {
            if (kg1VarD.e()) {
                iW = ((RecyclerView) viewGroup).d.w(i, 0);
                kg1VarD.s = null;
                kg1VarD.r = viewGroup;
                i2 = kg1VarD.f;
                long nanoTime5 = viewGroup.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(i2).d;
                    if (j5 != 0) {
                    }
                }
                pf1Var = ((RecyclerView) viewGroup).a0;
                pf1Var.getClass();
                if (kg1VarD.s == null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                    kg1VarD.c = iW;
                    if (pf1Var.b) {
                        kg1VarD.e = pf1Var.b(iW);
                    }
                    kg1VarD.j = (kg1VarD.j & (-520)) | 1;
                    int i16 = cz1.a;
                    Trace.beginSection("RV OnBindView");
                }
                kg1VarD.s = pf1Var;
                kg1VarD.c();
                pf1Var.c(kg1VarD, iW);
                if (z3) {
                    arrayList3 = kg1VarD.k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    kg1VarD.j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof yf1) {
                        ((yf1) layoutParams).c = z2;
                    }
                    int i17 = cz1.a;
                    Trace.endSection();
                }
                nanoTime = viewGroup.getNanoTime() - nanoTime5;
                bg1 bg1VarA4 = this.g.a(kg1VarD.f);
                j4 = bg1VarA4.d;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                bg1VarA4.d = nanoTime;
                accessibilityManager = ((RecyclerView) viewGroup).o0;
                if (accessibilityManager == null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (hg1Var.g) {
                    kg1VarD.g = i;
                }
                z5 = z4;
            } else {
                iW = ((RecyclerView) viewGroup).d.w(i, 0);
                kg1VarD.s = null;
                kg1VarD.r = viewGroup;
                i2 = kg1VarD.f;
                long nanoTime6 = viewGroup.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(i2).d;
                    if (j5 != 0) {
                    }
                }
                pf1Var = ((RecyclerView) viewGroup).a0;
                pf1Var.getClass();
                if (kg1VarD.s == null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                    kg1VarD.c = iW;
                    if (pf1Var.b) {
                        kg1VarD.e = pf1Var.b(iW);
                    }
                    kg1VarD.j = (kg1VarD.j & (-520)) | 1;
                    int i18 = cz1.a;
                    Trace.beginSection("RV OnBindView");
                }
                kg1VarD.s = pf1Var;
                kg1VarD.c();
                pf1Var.c(kg1VarD, iW);
                if (z3) {
                    arrayList3 = kg1VarD.k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    kg1VarD.j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof yf1) {
                        ((yf1) layoutParams).c = z2;
                    }
                    int i19 = cz1.a;
                    Trace.endSection();
                }
                nanoTime = viewGroup.getNanoTime() - nanoTime6;
                bg1 bg1VarA5 = this.g.a(kg1VarD.f);
                j4 = bg1VarA5.d;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                bg1VarA5.d = nanoTime;
                accessibilityManager = ((RecyclerView) viewGroup).o0;
                if (accessibilityManager == null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (hg1Var.g) {
                    kg1VarD.g = i;
                }
                z5 = z4;
            }
        } else if (kg1VarD.e()) {
            iW = ((RecyclerView) viewGroup).d.w(i, 0);
            kg1VarD.s = null;
            kg1VarD.r = viewGroup;
            i2 = kg1VarD.f;
            long nanoTime7 = viewGroup.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.g.a(i2).d;
                if (j5 != 0) {
                }
            }
            pf1Var = ((RecyclerView) viewGroup).a0;
            pf1Var.getClass();
            if (kg1VarD.s == null) {
                z3 = z2;
            } else {
                z3 = false;
            }
            if (z3) {
                kg1VarD.c = iW;
                if (pf1Var.b) {
                    kg1VarD.e = pf1Var.b(iW);
                }
                kg1VarD.j = (kg1VarD.j & (-520)) | 1;
                int i110 = cz1.a;
                Trace.beginSection("RV OnBindView");
            }
            kg1VarD.s = pf1Var;
            kg1VarD.c();
            pf1Var.c(kg1VarD, iW);
            if (z3) {
                arrayList3 = kg1VarD.k;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                kg1VarD.j &= -1025;
                layoutParams = view.getLayoutParams();
                if (layoutParams instanceof yf1) {
                    ((yf1) layoutParams).c = z2;
                }
                int i111 = cz1.a;
                Trace.endSection();
            }
            nanoTime = viewGroup.getNanoTime() - nanoTime7;
            bg1 bg1VarA6 = this.g.a(kg1VarD.f);
            j4 = bg1VarA6.d;
            if (j4 != 0) {
                nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
            }
            bg1VarA6.d = nanoTime;
            accessibilityManager = ((RecyclerView) viewGroup).o0;
            if (accessibilityManager == null) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (hg1Var.g) {
                kg1VarD.g = i;
            }
            z5 = z4;
        } else {
            iW = ((RecyclerView) viewGroup).d.w(i, 0);
            kg1VarD.s = null;
            kg1VarD.r = viewGroup;
            i2 = kg1VarD.f;
            long nanoTime8 = viewGroup.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.g.a(i2).d;
                if (j5 != 0) {
                }
            }
            pf1Var = ((RecyclerView) viewGroup).a0;
            pf1Var.getClass();
            if (kg1VarD.s == null) {
                z3 = z2;
            } else {
                z3 = false;
            }
            if (z3) {
                kg1VarD.c = iW;
                if (pf1Var.b) {
                    kg1VarD.e = pf1Var.b(iW);
                }
                kg1VarD.j = (kg1VarD.j & (-520)) | 1;
                int i112 = cz1.a;
                Trace.beginSection("RV OnBindView");
            }
            kg1VarD.s = pf1Var;
            kg1VarD.c();
            pf1Var.c(kg1VarD, iW);
            if (z3) {
                arrayList3 = kg1VarD.k;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                kg1VarD.j &= -1025;
                layoutParams = view.getLayoutParams();
                if (layoutParams instanceof yf1) {
                    ((yf1) layoutParams).c = z2;
                }
                int i113 = cz1.a;
                Trace.endSection();
            }
            nanoTime = viewGroup.getNanoTime() - nanoTime8;
            bg1 bg1VarA7 = this.g.a(kg1VarD.f);
            j4 = bg1VarA7.d;
            if (j4 != 0) {
                nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
            }
            bg1VarA7.d = nanoTime;
            accessibilityManager = ((RecyclerView) viewGroup).o0;
            if (accessibilityManager == null) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (hg1Var.g) {
                kg1VarD.g = i;
            }
            z5 = z4;
        }
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            yf1Var = (yf1) viewGroup.generateDefaultLayoutParams();
            view.setLayoutParams(yf1Var);
        } else if (viewGroup.checkLayoutParams(layoutParams2)) {
            yf1Var = (yf1) viewGroup.generateLayoutParams(layoutParams2);
            view.setLayoutParams(yf1Var);
        } else {
            yf1Var = (yf1) layoutParams2;
        }
        yf1Var.a = kg1VarD;
        if (z) {
            z4 = false;
        } else {
            z4 = false;
        }
        yf1Var.d = z4;
        return kg1VarD;
    }

    public final void k(kg1 kg1Var) {
        if (kg1Var.o) {
            this.b.remove(kg1Var);
        } else {
            this.a.remove(kg1Var);
        }
        kg1Var.n = null;
        kg1Var.o = false;
        kg1Var.j &= -33;
    }

    public final void l() {
        xf1 xf1Var = this.h.b0;
        this.f = this.e + (xf1Var != null ? xf1Var.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            f(size);
        }
    }
}
