package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class z00 implements v00 {
    public final l82 d;
    public int f;
    public int g;
    public l82 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public s10 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public z00(l82 l82Var) {
        this.d = l82Var;
    }

    @Override // defpackage.v00
    public final void a(v00 v00Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((z00) obj).j) {
                return;
            }
        }
        this.c = true;
        l82 l82Var = this.a;
        if (l82Var != null) {
            l82Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        z00 z00Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            z00 z00Var2 = (z00) obj2;
            if (!(z00Var2 instanceof s10)) {
                i++;
                z00Var = z00Var2;
            }
        }
        if (z00Var != null && i == 1 && z00Var.j) {
            s10 s10Var = this.i;
            if (s10Var != null) {
                if (!s10Var.j) {
                    return;
                } else {
                    this.f = this.h * s10Var.g;
                }
            }
            d(z00Var.g + this.f);
        }
        l82 l82Var2 = this.a;
        if (l82Var2 != null) {
            l82Var2.a(this);
        }
    }

    public final void b(l82 l82Var) {
        this.k.add(l82Var);
        if (this.j) {
            l82Var.a(l82Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            v00 v00Var = (v00) obj;
            v00Var.a(v00Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                str = "HORIZONTAL_DIMENSION";
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                str = "VERTICAL_DIMENSION";
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                str = "LEFT";
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                str = "RIGHT";
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "TOP";
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "BOTTOM";
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
