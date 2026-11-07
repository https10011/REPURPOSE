package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bw extends r implements Iterable {
    public Vector a;
    public int b;

    public bw(gk1 gk1Var) {
        Vector vector = (Vector) gk1Var.b;
        this.a = new Vector();
        for (int i = 0; i != vector.size(); i++) {
            this.a.addElement((p) vector.elementAt(i));
        }
        this.b = -1;
    }

    @Override // defpackage.r
    public final boolean b(r rVar) {
        if (!(rVar instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) rVar;
        if (this.a.size() != bwVar.a.size()) {
            return false;
        }
        Enumeration enumerationElements = this.a.elements();
        Enumeration enumerationElements2 = bwVar.a.elements();
        while (enumerationElements.hasMoreElements()) {
            p pVar = (p) enumerationElements.nextElement();
            p pVar2 = (p) enumerationElements2.nextElement();
            r rVarA = pVar.a();
            r rVarA2 = pVar2.a();
            if (rVarA != rVarA2 && !rVarA.equals(rVarA2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r
    public final void c(kj0 kj0Var) throws IOException {
        aw awVarC = kj0Var.C();
        int iF = f();
        kj0Var.R(48);
        kj0Var.S(iF);
        Enumeration enumerationElements = this.a.elements();
        while (enumerationElements.hasMoreElements()) {
            awVarC.T((p) enumerationElements.nextElement());
        }
    }

    @Override // defpackage.r
    public final int d() {
        int iF = f();
        return cu1.a(iF) + 1 + iF;
    }

    @Override // defpackage.r
    public final r e() {
        bw bwVar = new bw();
        bwVar.a = new Vector();
        bwVar.b = -1;
        bwVar.a = this.a;
        return bwVar;
    }

    public final int f() {
        if (this.b < 0) {
            Enumeration enumerationElements = this.a.elements();
            int iD = 0;
            while (enumerationElements.hasMoreElements()) {
                iD += ((p) enumerationElements.nextElement()).a().e().d();
            }
            this.b = iD;
        }
        return this.b;
    }

    @Override // defpackage.r, defpackage.p
    public final int hashCode() {
        Enumeration enumerationElements = this.a.elements();
        int size = this.a.size();
        while (enumerationElements.hasMoreElements()) {
            size = (size * 17) ^ ((p) enumerationElements.nextElement()).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        p[] pVarArr = new p[this.a.size()];
        for (int i = 0; i != this.a.size(); i++) {
            pVarArr[i] = (p) this.a.elementAt(i);
        }
        return new rb(pVarArr, 0);
    }

    public final String toString() {
        return this.a.toString();
    }
}
