package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class et0 implements up0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(et0.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(et0.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final f71 a;

    static {
        Unsafe unsafe = fe3.a;
        f = unsafe.objectFieldOffset(et0.class.getDeclaredField("_rootCause$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(et0.class, Object.class, "_exceptionsHolder$volatile");
        e = unsafe.objectFieldOffset(et0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public et0(f71 f71Var, Throwable th) {
        this.a = f71Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            h(th);
            return;
        }
        if (th == thD) {
            return;
        }
        Object objB = b();
        if (objB == null) {
            g(th);
            return;
        }
        if (!(objB instanceof Throwable)) {
            if (objB instanceof ArrayList) {
                ((ArrayList) objB).add(th);
                return;
            } else {
                sm0.g(objB, "State is ");
                return;
            }
        }
        if (th == objB) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objB);
        arrayList.add(th);
        g(arrayList);
    }

    public final Object b() {
        d.getClass();
        return fe3.a.getObjectVolatile(this, e);
    }

    @Override // defpackage.up0
    public final f71 c() {
        return this.a;
    }

    public final Throwable d() {
        c.getClass();
        return (Throwable) fe3.a.getObjectVolatile(this, f);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Object objB = b();
        if (objB == null) {
            arrayList = new ArrayList(4);
        } else if (objB instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objB);
            arrayList = arrayList2;
        } else {
            if (!(objB instanceof ArrayList)) {
                sm0.g(objB, "State is ");
                return null;
            }
            arrayList = (ArrayList) objB;
        }
        Throwable thD = d();
        if (thD != null) {
            arrayList.add(0, thD);
        }
        if (th != null && !Intrinsics.areEqual(th, thD)) {
            arrayList.add(th);
        }
        g(yv2.e);
        return arrayList;
    }

    public final void g(Object obj) {
        d.getClass();
        fe3.a.putObjectVolatile(this, e, obj);
    }

    public final void h(Throwable th) {
        c.getClass();
        fe3.a.putObjectVolatile(this, f, th);
    }

    @Override // defpackage.up0
    public final boolean isActive() {
        return d() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(b.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(b());
        sb.append(", list=");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
