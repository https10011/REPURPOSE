package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class zb1 implements yb1 {
    public final Object[] a;
    public int b;

    public zb1(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            e.g("The max pool size must be > 0");
            throw null;
        }
    }

    public void a(nb nbVar) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = nbVar;
            this.b = i + 1;
        }
    }

    @Override // defpackage.yb1
    public boolean b(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                uq1.q("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.yb1
    public Object h() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public zb1() {
        this.a = new Object[256];
    }
}
