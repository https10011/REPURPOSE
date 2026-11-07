package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qr1 extends mj1 implements Function2 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ Iterator v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr1(Iterator it, fs fsVar) {
        super(fsVar);
        this.v = it;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        qr1 qr1Var = new qr1(this.v, fsVar);
        qr1Var.i = obj;
        return qr1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qr1) create((oo1) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        int i5;
        ek1 ek1Var;
        oo1 oo1Var = (oo1) this.i;
        ft ftVar = ft.a;
        int i6 = this.f;
        boolean z = true;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        i4 = this.e;
                        int i7 = this.d;
                        Iterator it2 = this.c;
                        ek1 ek1Var2 = (ek1) this.b;
                        zi0.B(obj);
                        ek1Var2.b();
                        while (true) {
                            int i8 = ek1Var2.c;
                            Object[] objArr = ek1Var2.b;
                            if (!it2.hasNext()) {
                                i5 = i7;
                                ek1Var = ek1Var2;
                                break;
                            }
                            Object next = it2.next();
                            boolean z2 = z;
                            if (ek1Var2.a() == i8) {
                                uq1.q("ring buffer is full");
                                return null;
                            }
                            int i9 = ek1Var2.d;
                            int i10 = ek1Var2.e;
                            objArr[(i9 + i10) % i8] = next;
                            ek1Var2.e = i10 + 1;
                            if (ek1Var2.a() == i8) {
                                if (ek1Var2.e >= 20) {
                                    ArrayList arrayList2 = new ArrayList(ek1Var2);
                                    this.i = oo1Var;
                                    this.b = ek1Var2;
                                    this.c = it2;
                                    this.d = i7;
                                    this.e = i4;
                                    this.f = 3;
                                    oo1Var.a(arrayList2, this);
                                    ft ftVar2 = ft.a;
                                    return ftVar;
                                }
                                int i11 = i8 + (i8 >> 1) + 1;
                                if (i11 > 20) {
                                    i11 = 20;
                                }
                                ek1Var2 = new ek1(ek1Var2.e, ek1Var2.d == 0 ? Arrays.copyOf(objArr, i11) : ek1Var2.toArray(new Object[i11]));
                            }
                            z = z2;
                        }
                    } else if (i6 == 4) {
                        i4 = this.e;
                        i5 = this.d;
                        ek1Var = (ek1) this.b;
                        zi0.B(obj);
                        ek1Var.b();
                    } else {
                        if (i6 != 5) {
                            uq1.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    if (ek1Var.e > 20) {
                        ArrayList arrayList3 = new ArrayList(ek1Var);
                        this.i = oo1Var;
                        this.b = ek1Var;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = 4;
                        oo1Var.a(arrayList3, this);
                        ft ftVar3 = ft.a;
                        return ftVar;
                    }
                    if (!ek1Var.isEmpty()) {
                        this.i = null;
                        this.b = null;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = 5;
                        oo1Var.a(ek1Var, this);
                        ft ftVar4 = ft.a;
                        return ftVar;
                    }
                }
                zi0.B(obj);
            } else {
                i = this.e;
                int i12 = this.d;
                Iterator it3 = this.c;
                zi0.B(obj);
                arrayList = new ArrayList(20);
                it = it3;
                i3 = i12;
                i2 = i;
            }
            return Unit.a;
        }
        zi0.B(obj);
        i = 0;
        i2 = 0;
        arrayList = new ArrayList(20);
        it = this.v;
        i3 = 20;
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i > 0) {
                i--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.i = oo1Var;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i3;
                    this.e = i2;
                    this.f = 1;
                    oo1Var.a(arrayList, this);
                    ft ftVar5 = ft.a;
                    return ftVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.i = null;
            this.b = null;
            this.c = null;
            this.d = i3;
            this.e = i2;
            this.f = 2;
            oo1Var.a(arrayList, this);
            ft ftVar6 = ft.a;
            return ftVar;
        }
        return Unit.a;
    }
}
