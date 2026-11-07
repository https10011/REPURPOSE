package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ys extends a implements d {
    public static final xs b = new xs(d.M, new ws(0));

    public ys() {
        super(d.M);
    }

    public abstract void e(CoroutineContext coroutineContext, Runnable runnable);

    public final CoroutineContext.Element get(f fVar) {
        CoroutineContext.Element element;
        fVar.getClass();
        if (fVar instanceof b) {
            f fVar2 = (b) fVar;
            f fVar3 = ((a) this).a;
            fVar3.getClass();
            if ((fVar3 == fVar2 || ((b) fVar2).b == fVar3) && (element = (CoroutineContext.Element) ((b) fVar2).a.invoke(this)) != null) {
                return element;
            }
        } else if (d.M == fVar) {
            return this;
        }
        return null;
    }

    public boolean i(CoroutineContext coroutineContext) {
        return !(this instanceof k22);
    }

    public ys j(int i) {
        g93.l(i);
        return new ex0(this, i);
    }

    public final CoroutineContext minusKey(f fVar) {
        fVar.getClass();
        if (!(fVar instanceof b)) {
            return d.M == fVar ? g.a : this;
        }
        f fVar2 = (b) fVar;
        f fVar3 = ((a) this).a;
        fVar3.getClass();
        return ((fVar3 == fVar2 || ((b) fVar2).b == fVar3) && ((CoroutineContext.Element) ((b) fVar2).a.invoke(this)) != null) ? g.a : this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + qt.j(this);
    }
}
