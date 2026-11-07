package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fy0 extends AbstractMap implements Serializable {
    public static final rs w = new rs(4);
    public final boolean b;
    public ey0 c;
    public final ey0 f;
    public dy0 i;
    public dy0 v;
    public int d = 0;
    public int e = 0;
    public final Comparator a = w;

    public fy0(boolean z) {
        this.b = z;
        this.f = new ey0(z);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final ey0 a(Object obj, boolean z) {
        int iCompareTo;
        ey0 ey0Var;
        ey0 ey0Var2 = this.c;
        rs rsVar = w;
        Comparator comparator = this.a;
        if (ey0Var2 != null) {
            Comparable comparable = comparator == rsVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = ey0Var2.f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return ey0Var2;
                }
                ey0 ey0Var3 = iCompareTo < 0 ? ey0Var2.b : ey0Var2.c;
                if (ey0Var3 == null) {
                    break;
                }
                ey0Var2 = ey0Var3;
            }
        } else {
            iCompareTo = 0;
        }
        ey0 ey0Var4 = ey0Var2;
        if (!z) {
            return null;
        }
        ey0 ey0Var5 = this.f;
        if (ey0Var4 != null) {
            ey0Var = new ey0(this.b, ey0Var4, obj, ey0Var5, ey0Var5.e);
            if (iCompareTo < 0) {
                ey0Var4.b = ey0Var;
            } else {
                ey0Var4.c = ey0Var;
            }
            b(ey0Var4, true);
        } else {
            if (comparator == rsVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            ey0Var = new ey0(this.b, ey0Var4, obj, ey0Var5, ey0Var5.e);
            this.c = ey0Var;
        }
        this.d++;
        this.e++;
        return ey0Var;
    }

    public final void b(ey0 ey0Var, boolean z) {
        while (ey0Var != null) {
            ey0 ey0Var2 = ey0Var.b;
            ey0 ey0Var3 = ey0Var.c;
            int i = ey0Var2 != null ? ey0Var2.w : 0;
            int i2 = ey0Var3 != null ? ey0Var3.w : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                ey0 ey0Var4 = ey0Var3.b;
                ey0 ey0Var5 = ey0Var3.c;
                int i4 = (ey0Var4 != null ? ey0Var4.w : 0) - (ey0Var5 != null ? ey0Var5.w : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(ey0Var);
                } else {
                    f(ey0Var3);
                    e(ey0Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                ey0 ey0Var6 = ey0Var2.b;
                ey0 ey0Var7 = ey0Var2.c;
                int i5 = (ey0Var6 != null ? ey0Var6.w : 0) - (ey0Var7 != null ? ey0Var7.w : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(ey0Var);
                } else {
                    e(ey0Var2);
                    f(ey0Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                ey0Var.w = i + 1;
                if (z) {
                    return;
                }
            } else {
                ey0Var.w = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            ey0Var = ey0Var.a;
        }
    }

    public final void c(ey0 ey0Var, boolean z) {
        ey0 ey0Var2;
        ey0 ey0Var3;
        int i;
        if (z) {
            ey0 ey0Var4 = ey0Var.e;
            ey0Var4.d = ey0Var.d;
            ey0Var.d.e = ey0Var4;
        }
        ey0 ey0Var5 = ey0Var.b;
        ey0 ey0Var6 = ey0Var.c;
        ey0 ey0Var7 = ey0Var.a;
        int i2 = 0;
        if (ey0Var5 == null || ey0Var6 == null) {
            if (ey0Var5 != null) {
                d(ey0Var, ey0Var5);
                ey0Var.b = null;
            } else if (ey0Var6 != null) {
                d(ey0Var, ey0Var6);
                ey0Var.c = null;
            } else {
                d(ey0Var, null);
            }
            b(ey0Var7, false);
            this.d--;
            this.e++;
            return;
        }
        if (ey0Var5.w > ey0Var6.w) {
            ey0 ey0Var8 = ey0Var5.c;
            while (true) {
                ey0 ey0Var9 = ey0Var8;
                ey0Var3 = ey0Var5;
                ey0Var5 = ey0Var9;
                if (ey0Var5 == null) {
                    break;
                } else {
                    ey0Var8 = ey0Var5.c;
                }
            }
        } else {
            ey0 ey0Var10 = ey0Var6.b;
            while (true) {
                ey0Var2 = ey0Var6;
                ey0Var6 = ey0Var10;
                if (ey0Var6 == null) {
                    break;
                } else {
                    ey0Var10 = ey0Var6.b;
                }
            }
            ey0Var3 = ey0Var2;
        }
        c(ey0Var3, false);
        ey0 ey0Var11 = ey0Var.b;
        if (ey0Var11 != null) {
            i = ey0Var11.w;
            ey0Var3.b = ey0Var11;
            ey0Var11.a = ey0Var3;
            ey0Var.b = null;
        } else {
            i = 0;
        }
        ey0 ey0Var12 = ey0Var.c;
        if (ey0Var12 != null) {
            i2 = ey0Var12.w;
            ey0Var3.c = ey0Var12;
            ey0Var12.a = ey0Var3;
            ey0Var.c = null;
        }
        ey0Var3.w = Math.max(i, i2) + 1;
        d(ey0Var, ey0Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        ey0 ey0Var = this.f;
        ey0Var.e = ey0Var;
        ey0Var.d = ey0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        ey0 ey0VarA = null;
        if (obj != null) {
            try {
                ey0VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return ey0VarA != null;
    }

    public final void d(ey0 ey0Var, ey0 ey0Var2) {
        ey0 ey0Var3 = ey0Var.a;
        ey0Var.a = null;
        if (ey0Var2 != null) {
            ey0Var2.a = ey0Var3;
        }
        if (ey0Var3 == null) {
            this.c = ey0Var2;
        } else if (ey0Var3.b == ey0Var) {
            ey0Var3.b = ey0Var2;
        } else {
            ey0Var3.c = ey0Var2;
        }
    }

    public final void e(ey0 ey0Var) {
        ey0 ey0Var2 = ey0Var.b;
        ey0 ey0Var3 = ey0Var.c;
        ey0 ey0Var4 = ey0Var3.b;
        ey0 ey0Var5 = ey0Var3.c;
        ey0Var.c = ey0Var4;
        if (ey0Var4 != null) {
            ey0Var4.a = ey0Var;
        }
        d(ey0Var, ey0Var3);
        ey0Var3.b = ey0Var;
        ey0Var.a = ey0Var3;
        int iMax = Math.max(ey0Var2 != null ? ey0Var2.w : 0, ey0Var4 != null ? ey0Var4.w : 0) + 1;
        ey0Var.w = iMax;
        ey0Var3.w = Math.max(iMax, ey0Var5 != null ? ey0Var5.w : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        dy0 dy0Var = this.i;
        if (dy0Var != null) {
            return dy0Var;
        }
        dy0 dy0Var2 = new dy0(this, 0);
        this.i = dy0Var2;
        return dy0Var2;
    }

    public final void f(ey0 ey0Var) {
        ey0 ey0Var2 = ey0Var.b;
        ey0 ey0Var3 = ey0Var.c;
        ey0 ey0Var4 = ey0Var2.b;
        ey0 ey0Var5 = ey0Var2.c;
        ey0Var.b = ey0Var5;
        if (ey0Var5 != null) {
            ey0Var5.a = ey0Var;
        }
        d(ey0Var, ey0Var2);
        ey0Var2.c = ey0Var;
        ey0Var.a = ey0Var2;
        int iMax = Math.max(ey0Var3 != null ? ey0Var3.w : 0, ey0Var5 != null ? ey0Var5.w : 0) + 1;
        ey0Var.w = iMax;
        ey0Var2.w = Math.max(iMax, ey0Var4 != null ? ey0Var4.w : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        ey0 ey0VarA;
        if (obj != null) {
            try {
                ey0VarA = a(obj, false);
            } catch (ClassCastException unused) {
                ey0VarA = null;
            }
        } else {
            ey0VarA = null;
        }
        if (ey0VarA != null) {
            return ey0VarA.v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        dy0 dy0Var = this.v;
        if (dy0Var != null) {
            return dy0Var;
        }
        dy0 dy0Var2 = new dy0(this, 1);
        this.v = dy0Var2;
        return dy0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            uq1.h("key == null");
            return null;
        }
        if (obj2 == null && !this.b) {
            uq1.h("value == null");
            return null;
        }
        ey0 ey0VarA = a(obj, true);
        Object obj3 = ey0VarA.v;
        ey0VarA.v = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        ey0 ey0VarA;
        if (obj != null) {
            try {
                ey0VarA = a(obj, false);
            } catch (ClassCastException unused) {
                ey0VarA = null;
            }
        } else {
            ey0VarA = null;
        }
        if (ey0VarA != null) {
            c(ey0VarA, true);
        }
        if (ey0VarA != null) {
            return ey0VarA.v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
