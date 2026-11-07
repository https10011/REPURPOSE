package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o52 implements View.OnApplyWindowInsetsListener {
    public u92 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ s81 c;

    public o52(View view, s81 s81Var) {
        this.b = view;
        this.c = s81Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        u92 u92VarH = u92.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        s81 s81Var = this.c;
        if (i < 30) {
            p52.a(windowInsets, this.b);
            if (u92VarH.equals(this.a)) {
                return s81Var.k(view, u92VarH).g();
            }
        }
        this.a = u92VarH;
        u92 u92VarK = s81Var.k(view, u92VarH);
        if (i >= 30) {
            return u92VarK.g();
        }
        WeakHashMap weakHashMap = x52.a;
        view.requestApplyInsets();
        return u92VarK.g();
    }
}
