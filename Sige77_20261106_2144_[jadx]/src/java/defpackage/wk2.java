package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class wk2 {
    protected transient int zza;

    public static void d(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof bn2) {
            List listZza = ((bn2) iterable).zza();
            bn2 bn2Var = (bn2) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = bn2Var.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = bn2Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            uq1.h(string);
                            return;
                        }
                        bn2Var.remove(size3);
                    }
                } else if (obj instanceof hl2) {
                    bn2Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    hl2.h(bArr, 0, bArr.length);
                    bn2Var.zzb();
                } else {
                    bn2Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof tn2) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof vn2) {
                vn2 vn2Var = (vn2) list;
                int i = vn2Var.c + size4;
                int length = vn2Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = ck1.p(length, 3, 2, 1, 10);
                        }
                        vn2Var.b = Arrays.copyOf(vn2Var.b, length);
                    } else {
                        vn2Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    bm2.c(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                bm2.c(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final byte[] a() {
        try {
            dm2 dm2Var = (dm2) this;
            int iM = dm2Var.m();
            byte[] bArr = new byte[iM];
            boolean z = tl2.b;
            nl2 nl2Var = new nl2(bArr, iM);
            dm2Var.f(nl2Var);
            if (nl2Var.x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (nl2Var.x() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            sm0.m(y00.l(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final void b(OutputStream outputStream) {
        dm2 dm2Var = (dm2) this;
        int iM = dm2Var.m();
        boolean z = tl2.b;
        if (iM > 4096) {
            iM = 4096;
        }
        pl2 pl2Var = new pl2(outputStream, iM);
        dm2Var.f(pl2Var);
        if (pl2Var.e > 0) {
            pl2Var.B();
        }
    }

    public abstract int c(yn2 yn2Var);
}
