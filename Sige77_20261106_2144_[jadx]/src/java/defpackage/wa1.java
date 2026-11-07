package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wa1 extends rq0 {
    public final /* synthetic */ int W;
    public final Method X;
    public final int Y;
    public final boolean Z;

    public /* synthetic */ wa1(Method method, int i, boolean z, int i2) {
        this.W = i2;
        this.X = method;
        this.Y = i;
        this.Z = z;
    }

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) {
        int i = this.W;
        boolean z = this.Z;
        Method method = this.X;
        int i2 = this.Y;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw ta.v(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw ta.v(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw ta.v(method, i2, ts.k("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw ta.v(method, i2, "Field map value '" + value + "' converted to null by " + vi.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    ai1Var.a(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw ta.v(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw ta.v(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw ta.v(method, i2, ts.k("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    ai1Var.b(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw ta.v(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw ta.v(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw ta.v(method, i2, ts.k("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw ta.v(method, i2, "Query map value '" + value3 + "' converted to null by " + vi.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    ai1Var.d(str3, string2, z);
                }
                return;
        }
    }
}
