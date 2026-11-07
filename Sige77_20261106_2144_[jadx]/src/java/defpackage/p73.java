package defpackage;

import android.os.Bundle;
import com.hjq.toast.BuildConfig;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p73 {
    public static final p73 c = new p73(100);
    public final EnumMap a;
    public final int b;

    public p73(int i) {
        EnumMap enumMap = new EnumMap(n73.class);
        this.a = enumMap;
        n73 n73Var = n73.AD_STORAGE;
        l73 l73Var = l73.UNINITIALIZED;
        enumMap.put(n73Var, l73Var);
        enumMap.put(n73.ANALYTICS_STORAGE, l73Var);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static p73 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new p73(i);
        }
        EnumMap enumMap = new EnumMap(n73.class);
        for (n73 n73Var : m73.STORAGE.a) {
            enumMap.put(n73Var, d(bundle.getString(n73Var.a)));
        }
        return new p73(enumMap, i);
    }

    public static p73 c(int i, String str) {
        EnumMap enumMap = new EnumMap(n73.class);
        n73[] n73VarArr = m73.STORAGE.a;
        for (int i2 = 0; i2 < n73VarArr.length; i2++) {
            String str2 = str == null ? BuildConfig.FLAVOR : str;
            n73 n73Var = n73VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(n73Var, e(str2.charAt(i3)));
            } else {
                enumMap.put(n73Var, l73.UNINITIALIZED);
            }
        }
        return new p73(enumMap, i);
    }

    public static l73 d(String str) {
        l73 l73Var = l73.UNINITIALIZED;
        if (str == null) {
            return l73Var;
        }
        if (str.equals("granted")) {
            return l73.GRANTED;
        }
        return str.equals("denied") ? l73.DENIED : l73Var;
    }

    public static l73 e(char c2) {
        if (c2 == '+') {
            return l73.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? l73.UNINITIALIZED : l73.GRANTED;
        }
        return l73.DENIED;
    }

    public static char h(l73 l73Var) {
        if (l73Var == null) {
            return '-';
        }
        int iOrdinal = l73Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p73) {
            p73 p73Var = (p73) obj;
            for (n73 n73Var : m73.STORAGE.a) {
                if (this.a.get(n73Var) == p73Var.a.get(n73Var)) {
                }
            }
            if (this.b == p73Var.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (n73 n73Var : m73.STORAGE.a) {
            l73 l73Var = (l73) this.a.get(n73Var);
            char c2 = '-';
            if (l73Var != null && (iOrdinal = l73Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (n73 n73Var : m73.STORAGE.a) {
            sb.append(h((l73) this.a.get(n73Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((l73) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(n73 n73Var) {
        return ((l73) this.a.get(n73Var)) != l73.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final p73 j(p73 p73Var) {
        EnumMap enumMap = new EnumMap(n73.class);
        for (n73 n73Var : m73.STORAGE.a) {
            l73 l73Var = (l73) this.a.get(n73Var);
            l73 l73Var2 = (l73) p73Var.a.get(n73Var);
            if (l73Var == null) {
                l73Var = l73Var2;
            } else if (l73Var2 != null) {
                l73 l73Var3 = l73.UNINITIALIZED;
                if (l73Var == l73Var3) {
                    l73Var = l73Var2;
                } else if (l73Var2 != l73Var3) {
                    l73 l73Var4 = l73.POLICY;
                    if (l73Var == l73Var4) {
                        l73Var = l73Var2;
                    } else if (l73Var2 != l73Var4) {
                        l73 l73Var5 = l73.DENIED;
                        l73Var = (l73Var == l73Var5 || l73Var2 == l73Var5) ? l73Var5 : l73.GRANTED;
                    }
                }
            }
            if (l73Var != null) {
                enumMap.put(n73Var, l73Var);
            }
        }
        return new p73(enumMap, 100);
    }

    public final p73 k(p73 p73Var) {
        EnumMap enumMap = new EnumMap(n73.class);
        for (n73 n73Var : m73.STORAGE.a) {
            l73 l73Var = (l73) this.a.get(n73Var);
            if (l73Var == l73.UNINITIALIZED) {
                l73Var = (l73) p73Var.a.get(n73Var);
            }
            if (l73Var != null) {
                enumMap.put(n73Var, l73Var);
            }
        }
        return new p73(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (n73 n73Var : m73.STORAGE.a) {
            sb.append(",");
            sb.append(n73Var.a);
            sb.append("=");
            l73 l73Var = (l73) this.a.get(n73Var);
            if (l73Var == null) {
                l73Var = l73.UNINITIALIZED;
            }
            sb.append(l73Var);
        }
        return sb.toString();
    }

    public p73(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(n73.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
