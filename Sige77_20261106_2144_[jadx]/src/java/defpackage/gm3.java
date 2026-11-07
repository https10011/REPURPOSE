package defpackage;

import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class gm3 implements bo3 {
    public final gm3 a;
    public final UUID b;
    public final String c;
    public final String d;
    public Thread e;

    public gm3(String str, gm3 gm3Var, zn3 zn3Var) {
        this.d = str;
        this.a = gm3Var;
        this.b = gm3Var.b;
        this.c = gm3Var.c;
        this.e = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zn3 zn3VarC = vm3.c();
        bo3 bo3Var = zn3VarC.b;
        String str = this.d;
        if (bo3Var == null) {
            throw new nn(y00.l(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == bo3Var) {
            vm3.b(zn3VarC, ((gm3) bo3Var).a);
            this.e = null;
            return;
        }
        String str2 = ((gm3) bo3Var).d;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        ts.r(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new nn(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:76:0x0213  */
    public final String toString() {
        int i;
        int i2;
        f40 f40Var;
        Iterator it;
        tn3 tn3Var;
        int i3;
        wn3 wn3Var;
        AtomicReference atomicReference = vm3.a;
        gm3 gm3Var = this;
        int i4 = 0;
        int length = 0;
        while (gm3Var != null) {
            i4++;
            length += gm3Var.d.length();
            gm3Var = gm3Var.a;
            if (gm3Var != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            gm3 gm3Var2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = gm3Var2.d;
                gm3Var2 = gm3Var2.a;
            }
            q8 q8Var = new q8(4);
            int i6 = 1;
            bs0 bs0VarG = (i4 != 0 ? i4 != 1 ? wo0.i(i4, (Object[]) strArr.clone()) : new jr1(strArr[0]) : mh1.W).iterator();
            int i7 = 0;
            while (bs0VarG.hasNext()) {
                q8Var.h(bs0VarG.next(), Integer.valueOf(i7));
                i7++;
            }
            lh1 lh1VarC = q8Var.c(true);
            int i8 = lh1VarC.f;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                f40Var = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((Integer) lh1VarC.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                o50 o50Var = new o50(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    o50Var.d += i6;
                    int i14 = iArr[i12];
                    while (true) {
                        wn3 wn3Var2 = null;
                        while (true) {
                            if (o50Var.d <= 0) {
                                i3 = i6;
                                break;
                            }
                            int i15 = o50Var.c;
                            wn3Var = (wn3) o50Var.g;
                            i3 = i6;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((wn3) wn3Var.d.get(Integer.valueOf(iArr[o50Var.b]))).a;
                            int i17 = o50Var.c;
                            if (iArr[i16 + i17] == i14) {
                                if (wn3Var2 != null) {
                                    wn3Var2.c = (wn3) o50Var.g;
                                }
                                o50Var.c = i17 + 1;
                                o50Var.c();
                                break;
                            }
                            wn3 wn3Var3 = (wn3) ((wn3) o50Var.g).d.get(Integer.valueOf(iArr[o50Var.b]));
                            int i18 = wn3Var3.a;
                            int i19 = i13;
                            wn3 wn3Var4 = new wn3(i18, (o50Var.c + i18) - 1);
                            ((wn3) o50Var.g).d.put(Integer.valueOf(iArr[o50Var.b]), wn3Var4);
                            int i20 = wn3Var4.b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = wn3Var4.d;
                            map.put(numValueOf, wn3Var3);
                            wn3Var3.a = i20;
                            if (wn3Var2 != null) {
                                wn3Var2.c = wn3Var4;
                            }
                            map.put(Integer.valueOf(i14), new wn3(i12, 1073741824));
                            o50Var.d--;
                            o50Var.d();
                            wn3Var2 = wn3Var4;
                            i6 = i3;
                            i13 = i19;
                        }
                        HashMap map2 = wn3Var.d;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf2)) {
                            if (wn3Var2 != null) {
                                wn3Var2.c = (wn3) o50Var.g;
                            }
                            o50Var.b = i12;
                            o50Var.c++;
                            o50Var.c();
                            break;
                        }
                        ((wn3) o50Var.g).d.put(numValueOf2, new wn3(i12, 1073741824));
                        if (wn3Var2 != null) {
                            wn3Var2.c = (wn3) o50Var.g;
                        }
                        o50Var.d += i13;
                        o50Var.d();
                        i6 = i3;
                    }
                    i12++;
                    i6 = i3;
                }
                int i21 = i6;
                ArrayDeque arrayDeque = new ArrayDeque();
                wn3 wn3Var5 = (wn3) o50Var.f;
                tn3 tn3Var2 = new tn3(wn3Var5, 0, -1, -1);
                arrayDeque.push(tn3Var2);
                while (!arrayDeque.isEmpty()) {
                    tn3 tn3Var3 = (tn3) arrayDeque.pop();
                    Iterator it2 = tn3Var3.d.d.values().iterator();
                    while (it2.hasNext()) {
                        wn3 wn3Var6 = (wn3) it2.next();
                        int i22 = tn3Var3.b;
                        int i23 = tn3Var3.c;
                        int i24 = wn3Var6.a;
                        wn3 wn3Var7 = wn3Var5;
                        int i25 = wn3Var6.b;
                        if (o50Var.g(i22, i23, i24, i25)) {
                            it = it2;
                        } else {
                            if (wn3Var6.d.isEmpty()) {
                                int i26 = wn3Var6.a;
                                it = it2;
                                if (o50Var.g(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (tn3Var2.a < tn3Var.a) {
                                    tn3Var2 = tn3Var;
                                }
                                arrayDeque.push(tn3Var);
                                wn3Var5 = wn3Var7;
                                it2 = it;
                                i21 = 1;
                            } else {
                                it = it2;
                            }
                            tn3Var = new tn3(wn3Var6, i21, wn3Var6.a, i25);
                            if (tn3Var2.a < tn3Var.a) {
                                tn3Var2 = tn3Var;
                            }
                            arrayDeque.push(tn3Var);
                            wn3Var5 = wn3Var7;
                            it2 = it;
                            i21 = 1;
                        }
                        tn3Var = new tn3(wn3Var6, tn3Var3.a + i21, i22, i23);
                        if (tn3Var2.a < tn3Var.a) {
                            tn3Var2 = tn3Var;
                        }
                        arrayDeque.push(tn3Var);
                        wn3Var5 = wn3Var7;
                        it2 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, tn3Var2.c + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = tn3Var2.b;
                    i2 = iMin - i;
                    wn3Var5 = (wn3) wn3Var5.d.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (wn3Var5 == null) {
                        break;
                    }
                    for (int i28 = wn3Var5.a; i28 < wn3Var5.b + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                f40 f40Var2 = new f40();
                f40Var2.a = i;
                f40Var2.b = iMin;
                f40Var2.c = i29;
                if (i2 * i29 < i9) {
                    f40Var = null;
                } else {
                    f40Var = f40Var2;
                }
            }
            String strConcat = BuildConfig.FLAVOR;
            if (f40Var != null) {
                int i30 = f40Var.a;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : BuildConfig.FLAVOR;
                int i31 = f40Var.b;
                int i32 = f40Var.c;
                int i33 = ((i31 - i30) * i32) + i30;
                if (i33 < i4) {
                    strConcat = " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i4))));
                }
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        gm3 gm3Var3 = this;
        while (gm3Var3 != null) {
            String str = gm3Var3.d;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            gm3Var3 = gm3Var3.a;
            if (gm3Var3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public gm3(String str, UUID uuid, String str2, zn3 zn3Var) {
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        zn3Var.getClass();
        this.e = Thread.currentThread();
    }
}
