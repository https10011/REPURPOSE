package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mt1 extends q1 implements e61, gd0, ah0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(mt1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long f = fe3.a.objectFieldOffset(mt1.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public mt1(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:0: B:75:0x011e->B:111:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0125 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:53:0x00bd, B:55:0x00c5, B:58:0x00cc, B:59:0x00d0, B:61:0x00d3, B:71:0x00f4, B:74:0x0104, B:75:0x011e, B:81:0x0132, B:84:0x013b, B:78:0x0125, B:80:0x012b, B:63:0x00d9, B:67:0x00e0, B:21:0x004d), top: B:100:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [nt1] */
    /* JADX WARN: Type inference failed for: r2v17, types: [nt1] */
    /* JADX WARN: Type inference failed for: r2v18, types: [nt1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, nt1] */
    /* JADX WARN: Type inference failed for: r2v20, types: [nt1] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0103 -> B:53:0x00bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
        	at jadx.core.utils.ErrorsCounter.error(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        */
    @Override // defpackage.gd0
    public final java.lang.Object A(defpackage.id0 r14, defpackage.gs r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt1.A(id0, gs):java.lang.Object");
    }

    @Override // defpackage.id0
    public final Object a(Object obj, fs fsVar) {
        if (obj == null) {
            obj = kv.b;
        }
        c(null, obj);
        return Unit.a;
    }

    public final Object b() {
        vy2 vy2Var = kv.b;
        e.getClass();
        Object objectVolatile = fe3.a.getObjectVolatile(this, f);
        if (objectVolatile == vy2Var) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean c(Object obj, Object obj2) {
        int i;
        nt1[] nt1VarArr;
        vy2 vy2Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.d;
            if ((i2 & 1) != 0) {
                this.d = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.d = i3;
            nt1[] nt1VarArr2 = this.a;
            Unit unit = Unit.a;
            while (true) {
                if (nt1VarArr2 != null) {
                    for (nt1 nt1Var : nt1VarArr2) {
                        if (nt1Var != null) {
                            AtomicReference atomicReference = nt1Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (vy2Var = ea.d)) {
                                    break;
                                }
                                vy2 vy2Var2 = ea.c;
                                if (obj4 != vy2Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, vy2Var2)) {
                                            pj1 pj1Var = rj1.b;
                                            ((pk) obj4).resumeWith(Unit.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, vy2Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                        return true;
                    }
                    nt1VarArr = this.a;
                    Unit unit2 = Unit.a;
                }
                nt1VarArr2 = nt1VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.ah0
    public final gd0 u(CoroutineContext coroutineContext, int i, ki kiVar) {
        return ((((i < 0 || i >= 2) && i != -2) || kiVar != ki.b) && !((i == 0 || i == -3) && kiVar == ki.a)) ? new ql(this, coroutineContext, i, kiVar) : this;
    }
}
