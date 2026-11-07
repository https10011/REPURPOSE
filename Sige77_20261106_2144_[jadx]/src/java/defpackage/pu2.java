package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pu2 {
    public static final pu2 f = new pu2((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public pu2(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(n73.class);
        this.e = enumMap;
        enumMap.put(n73.AD_USER_DATA, bool == null ? l73.UNINITIALIZED : bool.booleanValue() ? l73.GRANTED : l73.DENIED);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static pu2 b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(n73.class);
        n73[] n73VarArr = m73.DMA.a;
        int length = n73VarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(n73VarArr[i3], p73.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new pu2(enumMap, i, (Boolean) null, (String) null);
    }

    public static pu2 c(int i, Bundle bundle) {
        if (bundle == null) {
            return new pu2((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(n73.class);
        for (n73 n73Var : m73.DMA.a) {
            enumMap.put(n73Var, p73.d(bundle.getString(n73Var.a)));
        }
        return new pu2(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final l73 a() {
        l73 l73Var = (l73) this.e.get(n73.AD_USER_DATA);
        return l73Var == null ? l73.UNINITIALIZED : l73Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (n73 n73Var : m73.DMA.a) {
            sb.append(":");
            sb.append(p73.h((l73) this.e.get(n73Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pu2)) {
            return false;
        }
        pu2 pu2Var = (pu2) obj;
        if (this.b.equalsIgnoreCase(pu2Var.b) && Objects.equals(this.c, pu2Var.c)) {
            return Objects.equals(this.d, pu2Var.d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(p73.a(this.a));
        for (n73 n73Var : m73.DMA.a) {
            sb.append(",");
            sb.append(n73Var.a);
            sb.append("=");
            l73 l73Var = (l73) this.e.get(n73Var);
            if (l73Var == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = l73Var.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public pu2(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(n73.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
