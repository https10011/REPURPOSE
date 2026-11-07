package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class db2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ mf1 c;
    public final /* synthetic */ Ref.ObjectRef d;
    public final /* synthetic */ Ref.ObjectRef e;

    public /* synthetic */ db2(mf1 mf1Var, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.c = mf1Var;
        this.b = objectRef;
        this.d = objectRef2;
        this.e = objectRef3;
    }

    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.a;
        Ref.ObjectRef objectRef = this.e;
        Ref.ObjectRef objectRef2 = this.d;
        mf1 mf1Var = this.c;
        Ref.ObjectRef objectRef3 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        uq1.o("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    byte b = mf1Var.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        uq1.o("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    if (z) {
                        objectRef3.element = Integer.valueOf(mf1Var.b());
                    }
                    if (z2) {
                        objectRef2.element = Integer.valueOf(mf1Var.b());
                    }
                    if (z3) {
                        objectRef.element = Integer.valueOf(mf1Var.b());
                    }
                }
                return Unit.a;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 == 1) {
                    if (objectRef3.element != null) {
                        uq1.o("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        return null;
                    }
                    if (jLongValue2 != 24) {
                        uq1.o("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        return null;
                    }
                    objectRef3.element = Long.valueOf(mf1Var.e());
                    objectRef2.element = Long.valueOf(mf1Var.e());
                    objectRef.element = Long.valueOf(mf1Var.e());
                }
                return Unit.a;
        }
    }

    public /* synthetic */ db2(Ref.ObjectRef objectRef, mf1 mf1Var, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.b = objectRef;
        this.c = mf1Var;
        this.d = objectRef2;
        this.e = objectRef3;
    }
}
