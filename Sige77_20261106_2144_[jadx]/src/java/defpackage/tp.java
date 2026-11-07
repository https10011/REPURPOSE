package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tp {
    public final Object a;
    public final kk b;
    public final xg0 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ tp(Object obj, kk kkVar, xg0 xg0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : kkVar, (i & 4) != 0 ? null : xg0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static tp a(tp tpVar, kk kkVar, Throwable th, int i) {
        Object obj = tpVar.a;
        if ((i & 2) != 0) {
            kkVar = tpVar.b;
        }
        kk kkVar2 = kkVar;
        xg0 xg0Var = tpVar.c;
        Object obj2 = tpVar.d;
        if ((i & 16) != 0) {
            th = tpVar.e;
        }
        return new tp(obj, kkVar2, xg0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return Intrinsics.areEqual(this.a, tpVar.a) && Intrinsics.areEqual(this.b, tpVar.b) && Intrinsics.areEqual(this.c, tpVar.c) && Intrinsics.areEqual(this.d, tpVar.d) && Intrinsics.areEqual(this.e, tpVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        kk kkVar = this.b;
        int iHashCode2 = (iHashCode + (kkVar == null ? 0 : kkVar.hashCode())) * 31;
        xg0 xg0Var = this.c;
        int iHashCode3 = (iHashCode2 + (xg0Var == null ? 0 : xg0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public tp(Object obj, kk kkVar, xg0 xg0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kkVar;
        this.c = xg0Var;
        this.d = obj2;
        this.e = th;
    }
}
