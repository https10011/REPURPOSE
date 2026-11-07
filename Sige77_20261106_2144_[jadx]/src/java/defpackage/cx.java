package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cx extends mv1 implements Function1 {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public int i;
    public final /* synthetic */ yx v;
    public final /* synthetic */ ud2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(yx yxVar, ud2 ud2Var, fs fsVar) {
        super(1, fsVar);
        this.v = yxVar;
        this.w = ud2Var;
    }

    @Override // defpackage.ze
    public final fs create(fs fsVar) {
        return new cx(this.v, this.w, fsVar);
    }

    public final Object invoke(Object obj) {
        return ((cx) create((fs) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00a3->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        f61 h61Var;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Iterator it;
        f61 f61Var;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef3;
        bx bxVar;
        h61 h61Var2;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef3;
        Function2 function2;
        f61 f61Var2;
        Object obj2;
        int iHashCode;
        Integer numA;
        Object obj3;
        int i;
        ft ftVar = ft.a;
        int i2 = this.i;
        ud2 ud2Var = this.w;
        yx yxVar = this.v;
        if (i2 == 0) {
            zi0.B(obj);
            h61Var = new h61();
            booleanRef = new Ref.BooleanRef();
            objectRef = new Ref.ObjectRef();
            this.a = h61Var;
            this.b = booleanRef;
            this.c = objectRef;
            this.d = objectRef;
            this.i = 1;
            obj = yx.g(yxVar, true, this);
            if (obj != ftVar) {
                objectRef2 = objectRef;
            }
            return ftVar;
        }
        if (i2 == 1) {
            objectRef = (Ref.ObjectRef) this.d;
            objectRef2 = (Ref.ObjectRef) this.c;
            booleanRef = (Ref.BooleanRef) this.b;
            h61Var = (f61) this.a;
            zi0.B(obj);
        } else {
            if (i2 == 2) {
                it = this.e;
                bxVar = (bx) this.d;
                objectRef3 = (Ref.ObjectRef) this.c;
                booleanRef2 = (Ref.BooleanRef) this.b;
                f61Var = (f61) this.a;
                zi0.B(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.a = f61Var;
                    this.b = booleanRef2;
                    this.c = objectRef3;
                    this.d = bxVar;
                    this.e = it;
                    this.i = 2;
                    if (function2.invoke(bxVar, this) == ftVar) {
                        return ftVar;
                    }
                }
                objectRef2 = objectRef3;
                booleanRef = booleanRef2;
                h61Var = f61Var;
                ud2Var.c = null;
                this.a = booleanRef;
                this.b = objectRef2;
                this.c = h61Var;
                this.d = null;
                this.e = null;
                this.i = 3;
                h61Var2 = (h61) h61Var;
                if (h61Var2.d(this) != ftVar) {
                    objectRef4 = objectRef2;
                    booleanRef3 = booleanRef;
                    f61Var2 = h61Var2;
                    booleanRef3.element = true;
                    Unit unit = Unit.a;
                    ((h61) f61Var2).g(null);
                    obj2 = objectRef4.element;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    dr1 dr1VarH = yxVar.h();
                    this.a = obj2;
                    this.b = null;
                    this.c = null;
                    this.f = iHashCode;
                    this.i = 4;
                    numA = dr1VarH.a();
                    if (numA != ftVar) {
                        obj = numA;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                }
                return ftVar;
            }
            if (i2 == 3) {
                f61 f61Var3 = (f61) this.c;
                objectRef4 = (Ref.ObjectRef) this.b;
                booleanRef3 = (Ref.BooleanRef) this.a;
                zi0.B(obj);
                f61Var2 = f61Var3;
                try {
                    booleanRef3.element = true;
                    Unit unit2 = Unit.a;
                    ((h61) f61Var2).g(null);
                    obj2 = objectRef4.element;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    dr1 dr1VarH2 = yxVar.h();
                    this.a = obj2;
                    this.b = null;
                    this.c = null;
                    this.f = iHashCode;
                    this.i = 4;
                    numA = dr1VarH2.a();
                    if (numA != ftVar) {
                        obj = numA;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                    return ftVar;
                } catch (Throwable th) {
                    ((h61) f61Var2).g(null);
                    throw th;
                }
            }
            if (i2 != 4) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f;
            obj3 = this.a;
            zi0.B(obj);
        }
        return new dw(obj3, i, ((Number) obj).intValue());
        objectRef.element = ((dw) obj).b;
        bx bxVar2 = new bx(h61Var, booleanRef, objectRef2, yxVar);
        List list = (List) ud2Var.c;
        if (list != null) {
            it = list.iterator();
            f61Var = h61Var;
            booleanRef2 = booleanRef;
            objectRef3 = objectRef2;
            bxVar = bxVar2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.a = f61Var;
                this.b = booleanRef2;
                this.c = objectRef3;
                this.d = bxVar;
                this.e = it;
                this.i = 2;
                if (function2.invoke(bxVar, this) == ftVar) {
                }
            }
            objectRef2 = objectRef3;
            booleanRef = booleanRef2;
            h61Var = f61Var;
            ud2Var.c = null;
            this.a = booleanRef;
            this.b = objectRef2;
            this.c = h61Var;
            this.d = null;
            this.e = null;
            this.i = 3;
            h61Var2 = (h61) h61Var;
            if (h61Var2.d(this) != ftVar) {
                objectRef4 = objectRef2;
                booleanRef3 = booleanRef;
                f61Var2 = h61Var2;
                booleanRef3.element = true;
                Unit unit3 = Unit.a;
                ((h61) f61Var2).g(null);
                obj2 = objectRef4.element;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                dr1 dr1VarH3 = yxVar.h();
                this.a = obj2;
                this.b = null;
                this.c = null;
                this.f = iHashCode;
                this.i = 4;
                numA = dr1VarH3.a();
                if (numA != ftVar) {
                    obj = numA;
                    obj3 = obj2;
                    i = iHashCode;
                    return new dw(obj3, i, ((Number) obj).intValue());
                }
            }
        } else {
            ud2Var.c = null;
            this.a = booleanRef;
            this.b = objectRef2;
            this.c = h61Var;
            this.d = null;
            this.e = null;
            this.i = 3;
            h61Var2 = (h61) h61Var;
            if (h61Var2.d(this) != ftVar) {
                objectRef4 = objectRef2;
                booleanRef3 = booleanRef;
                f61Var2 = h61Var2;
                booleanRef3.element = true;
                Unit unit4 = Unit.a;
                ((h61) f61Var2).g(null);
                obj2 = objectRef4.element;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                dr1 dr1VarH4 = yxVar.h();
                this.a = obj2;
                this.b = null;
                this.c = null;
                this.f = iHashCode;
                this.i = 4;
                numA = dr1VarH4.a();
                if (numA != ftVar) {
                    obj = numA;
                    obj3 = obj2;
                    i = iHashCode;
                    return new dw(obj3, i, ((Number) obj).intValue());
                }
            }
        }
        return ftVar;
    }
}
