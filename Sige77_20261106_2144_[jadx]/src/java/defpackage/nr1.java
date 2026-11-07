package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import com.hjq.toast.BuildConfig;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nr1 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final u01 a = new u01(1);
    public final f91 b = new f91(5);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strC = c(d42.j(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strC);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iK = d42.k(config) * i * i2;
        u01 u01Var = this.a;
        xb1 xb1VarF = (xb1) ((ArrayDeque) u01Var.a).poll();
        if (xb1VarF == null) {
            xb1VarF = u01Var.F();
        }
        mr1 mr1Var = (mr1) xb1VarF;
        mr1Var.b = iK;
        mr1Var.c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = lr1.a[config.ordinal()];
            if (i3 == 1) {
                configArr = d;
            } else if (i3 == 2) {
                configArr = f;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : h;
            } else {
                configArr = g;
            }
        } else {
            configArr = e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iK));
            if (num != null && num.intValue() <= iK * 8) {
                if (num.intValue() == iK && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                u01Var.q(mr1Var);
                int iIntValue = num.intValue();
                xb1 xb1VarF2 = (xb1) ((ArrayDeque) u01Var.a).poll();
                if (xb1VarF2 == null) {
                    xb1VarF2 = u01Var.F();
                }
                mr1Var = (mr1) xb1VarF2;
                mr1Var.b = iIntValue;
                mr1Var.c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.h(mr1Var);
        if (bitmap != null) {
            a(Integer.valueOf(mr1Var.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iJ = d42.j(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        u01 u01Var = this.a;
        xb1 xb1VarF = (xb1) ((ArrayDeque) u01Var.a).poll();
        if (xb1VarF == null) {
            xb1VarF = u01Var.F();
        }
        mr1 mr1Var = (mr1) xb1VarF;
        mr1Var.b = iJ;
        mr1Var.c = config;
        this.b.l(mr1Var, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(mr1Var.b));
        navigableMapD.put(Integer.valueOf(mr1Var.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbM = ts.m("SizeConfigStrategy{groupedMap=");
        sbM.append(this.b);
        sbM.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbM.append(entry.getKey());
            sbM.append('[');
            sbM.append(entry.getValue());
            sbM.append("], ");
        }
        if (!map.isEmpty()) {
            sbM.replace(sbM.length() - 2, sbM.length(), BuildConfig.FLAVOR);
        }
        sbM.append(")}");
        return sbM.toString();
    }
}
