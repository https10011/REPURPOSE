package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class lq extends Dialog implements ww0, vl1 {
    public a a;
    public final ir1 b;
    public final androidx.activity.a c;

    public lq(Context context, int i) {
        super(context, i);
        this.b = new ir1(this);
        this.c = new androidx.activity.a(new y1(this, 12));
    }

    public static void a(lq lqVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(2131296853, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131296854, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131296855, this);
    }

    @Override // defpackage.ww0
    public final nw0 getLifecycle() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.a = aVar2;
        return aVar2;
    }

    @Override // defpackage.vl1
    public final ul1 getSavedStateRegistry() {
        return (ul1) this.b.d;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            androidx.activity.a aVar = this.c;
            aVar.getClass();
            aVar.e = onBackInvokedDispatcher;
            aVar.c(aVar.g);
        }
        this.b.g(bundle);
        a aVar2 = this.a;
        if (aVar2 == null) {
            aVar2 = new a(this);
            this.a = aVar2;
        }
        aVar2.e(kw0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.h(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a aVar = this.a;
        if (aVar == null) {
            aVar = new a(this);
            this.a = aVar;
        }
        aVar.e(kw0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a aVar = this.a;
        if (aVar == null) {
            aVar = new a(this);
            this.a = aVar;
        }
        aVar.e(kw0.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.setContentView(view, layoutParams);
    }
}
