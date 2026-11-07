package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wq extends mi {
    public final ki c0;

    public wq(int i, ki kiVar) {
        super(i);
        this.c0 = kiVar;
        if (kiVar != ki.a) {
            if (i >= 1) {
                return;
            }
            e.d(ts.g(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(mi.class).getSimpleName() + " instead").toString());
    }

    public final Object K(Object obj, boolean z) {
        if (this.c0 != ki.c) {
            return G(obj);
        }
        Object objE = super.e(obj);
        return (!(objE instanceof tl) || (objE instanceof sl)) ? objE : Unit.a;
    }

    @Override // defpackage.mi, defpackage.jo1
    public final Object a(fs fsVar, Object obj) throws Throwable {
        if (K(obj, true) instanceof sl) {
            throw q();
        }
        return Unit.a;
    }

    @Override // defpackage.mi, defpackage.jo1
    public final Object e(Object obj) {
        return K(obj, false);
    }

    @Override // defpackage.mi
    public final boolean w() {
        return this.c0 == ki.b;
    }
}
