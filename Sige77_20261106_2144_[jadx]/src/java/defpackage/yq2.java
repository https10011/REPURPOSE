package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class yq2 {
    protected transient int zza;

    public abstract int a(ct2 ct2Var);

    public final nr2 b() {
        try {
            int iA = ((cs2) this).a(null);
            nr2 nr2Var = jr2.b;
            byte[] bArr = new byte[iA];
            boolean z = tr2.b;
            sr2 sr2Var = new sr2(bArr, iA);
            ((cs2) this).k(sr2Var);
            if (sr2Var.u() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (sr2Var.u() >= 0) {
                return new nr2(bArr);
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            sm0.m(ts.k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] c() {
        try {
            int iA = ((cs2) this).a(null);
            byte[] bArr = new byte[iA];
            boolean z = tr2.b;
            sr2 sr2Var = new sr2(bArr, iA);
            ((cs2) this).k(sr2Var);
            if (sr2Var.u() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (sr2Var.u() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            sm0.m(ts.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
