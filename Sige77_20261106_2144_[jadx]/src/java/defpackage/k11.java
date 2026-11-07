package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class k11 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public k11() {
        if (j10.f == null) {
            j10.f = new j10(9);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((l11) this.d).v != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.a;
            l11 l11Var = (l11) this.d;
            if (i >= l11Var.f || l11Var.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            d(view, obj);
            return;
        }
        k2 k2Var = null;
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = x52.d(view);
            if (accessibilityDelegateD != null) {
                k2Var = accessibilityDelegateD instanceof j2 ? ((j2) accessibilityDelegateD).a : new k2(accessibilityDelegateD);
            }
            if (k2Var == null) {
                k2Var = new k2();
            }
            x52.n(view, k2Var);
            view.setTag(this.a, obj);
            x52.h(view, this.c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((l11) this.d).f;
    }

    public void remove() {
        l11 l11Var = (l11) this.d;
        b();
        if (this.b == -1) {
            uq1.q("Call next() before removing element from the iterator.");
            return;
        }
        l11Var.b();
        l11Var.j(this.b);
        this.b = -1;
        this.c = l11Var.v;
    }
}
