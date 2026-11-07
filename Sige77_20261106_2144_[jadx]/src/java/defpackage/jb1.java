package defpackage;

import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jb1 implements Comparable {
    public static final String b;
    public final rj a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public jb1(rj rjVar) {
        rjVar.getClass();
        this.a = rjVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = d.a(this);
        rj rjVar = this.a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < rjVar.d() && rjVar.i(iA) == 92) {
            iA++;
        }
        int iD = rjVar.d();
        int i = iA;
        while (iA < iD) {
            if (rjVar.i(iA) == 47 || rjVar.i(iA) == 92) {
                arrayList.add(rjVar.o(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < rjVar.d()) {
            arrayList.add(rjVar.o(i, rjVar.d()));
        }
        return arrayList;
    }

    public final jb1 b() {
        rj rjVar = d.d;
        rj rjVar2 = this.a;
        if (Intrinsics.areEqual(rjVar2, rjVar)) {
            return null;
        }
        rj rjVar3 = d.a;
        if (Intrinsics.areEqual(rjVar2, rjVar3)) {
            return null;
        }
        rj rjVar4 = d.b;
        if (Intrinsics.areEqual(rjVar2, rjVar4)) {
            return null;
        }
        rj rjVar5 = d.e;
        rjVar2.getClass();
        rjVar5.getClass();
        int iD = rjVar2.d();
        byte[] bArr = rjVar5.a;
        if (rjVar2.l(iD - bArr.length, rjVar5, bArr.length) && (rjVar2.d() == 2 || rjVar2.l(rjVar2.d() - 3, rjVar3, 1) || rjVar2.l(rjVar2.d() - 3, rjVar4, 1))) {
            return null;
        }
        int iK = rj.k(rjVar2, rjVar3);
        if (iK == -1) {
            iK = rj.k(rjVar2, rjVar4);
        }
        if (iK == 2 && e() != null) {
            if (rjVar2.d() == 3) {
                return null;
            }
            return new jb1(rj.p(rjVar2, 0, 3, 1));
        }
        if (iK == 1) {
            rjVar4.getClass();
            if (rjVar2.l(0, rjVar4, rjVar4.d())) {
                return null;
            }
        }
        if (iK != -1 || e() == null) {
            if (iK == -1) {
                return new jb1(rjVar);
            }
            return iK == 0 ? new jb1(rj.p(rjVar2, 0, 1, 1)) : new jb1(rj.p(rjVar2, 0, iK, 1));
        }
        if (rjVar2.d() == 2) {
            return null;
        }
        return new jb1(rj.p(rjVar2, 0, 2, 1));
    }

    public final jb1 c(jb1 jb1Var) {
        jb1Var.getClass();
        rj rjVar = jb1Var.a;
        int iA = d.a(this);
        rj rjVar2 = this.a;
        jb1 jb1Var2 = iA == -1 ? null : new jb1(rjVar2.o(0, iA));
        int iA2 = d.a(jb1Var);
        if (!Intrinsics.areEqual(jb1Var2, iA2 != -1 ? new jb1(rjVar.o(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + jb1Var).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = jb1Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && Intrinsics.areEqual(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && rjVar2.d() == rjVar.d()) {
            return br0.h(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(d.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + jb1Var).toString());
        }
        if (Intrinsics.areEqual(rjVar, d.d)) {
            return this;
        }
        ji jiVar = new ji();
        rj rjVarC = d.c(jb1Var);
        if (rjVarC == null && (rjVarC = d.c(this)) == null) {
            rjVarC = d.f(b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            jiVar.N(d.e);
            jiVar.N(rjVarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            jiVar.N((rj) arrayListA.get(i));
            jiVar.N(rjVarC);
            i++;
        }
        return d.d(jiVar, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jb1 jb1Var = (jb1) obj;
        jb1Var.getClass();
        return this.a.compareTo(jb1Var.a);
    }

    public final jb1 d(String str) {
        str.getClass();
        ji jiVar = new ji();
        jiVar.Y(str);
        return d.b(this, d.d(jiVar, false), false);
    }

    public final Character e() {
        rj rjVar = d.a;
        rj rjVar2 = this.a;
        if (rj.g(rjVar2, rjVar) != -1 || rjVar2.d() < 2 || rjVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) rjVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jb1) && Intrinsics.areEqual(((jb1) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.r());
    }

    public final String toString() {
        return this.a.r();
    }
}
