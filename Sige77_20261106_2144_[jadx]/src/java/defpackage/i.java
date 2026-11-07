package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class i implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                uq0 uq0Var = (uq0) obj;
                uq0 uq0Var2 = (uq0) obj2;
                if (mt.a.contains(k.class)) {
                    return 0;
                }
                try {
                    uq0Var2.getClass();
                    uq0Var.getClass();
                    Long l = uq0Var.g;
                    if (l == null) {
                        return -1;
                    }
                    long jLongValue = l.longValue();
                    Long l2 = uq0Var2.g;
                    if (l2 != null) {
                        return Intrinsics.compare(l2.longValue(), jLongValue);
                    }
                    return 1;
                } catch (Throwable th) {
                    mt.a(k.class, th);
                    return 0;
                }
            case 1:
                uq0 uq0Var3 = (uq0) obj;
                uq0 uq0Var4 = (uq0) obj2;
                uq0Var4.getClass();
                uq0Var3.getClass();
                Long l3 = uq0Var3.g;
                if (l3 == null) {
                    return -1;
                }
                long jLongValue2 = l3.longValue();
                Long l4 = uq0Var4.g;
                if (l4 != null) {
                    return Intrinsics.compare(l4.longValue(), jLongValue2);
                }
                return 1;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                k70 k70Var = (k70) obj;
                k70 k70Var2 = (k70) obj2;
                k70Var2.getClass();
                k70Var.getClass();
                Long l5 = k70Var.c;
                if (l5 == null) {
                    return -1;
                }
                long jLongValue3 = l5.longValue();
                Long l6 = k70Var2.c;
                if (l6 != null) {
                    return Intrinsics.compare(l6.longValue(), jLongValue3);
                }
                return 1;
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
        }
    }
}
