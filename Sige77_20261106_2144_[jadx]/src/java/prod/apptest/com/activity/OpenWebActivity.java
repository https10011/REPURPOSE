package prod.apptest.com.activity;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.bs1;
import defpackage.cs1;
import defpackage.yg;
import defpackage.zm;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class OpenWebActivity extends yg {
    public static final /* synthetic */ int U0 = 0;
    public cs1 T0;

    @Override // defpackage.yg
    public final boolean B() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(2131689472);
        imageView.setOnClickListener(new zm(this, 4));
        bs1 bs1Var = new bs1();
        bs1Var.a = this;
        bs1Var.d = 30;
        bs1Var.c = 190;
        bs1Var.b = 80;
        bs1Var.e = imageView;
        cs1 cs1Var = new cs1();
        cs1Var.w = false;
        cs1Var.a = bs1Var;
        if (!isDestroyed()) {
            if (((WindowManager) bs1Var.a.getSystemService("window")) != null) {
                DisplayMetrics displayMetrics = bs1Var.a.getResources().getDisplayMetrics();
                cs1Var.c = displayMetrics.widthPixels;
                cs1Var.d = displayMetrics.heightPixels;
            }
            Rect rect = new Rect();
            bs1Var.a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            cs1Var.b = i;
            if (i <= 0) {
                try {
                    Class<?> cls = Class.forName("com.android.internal.R$dimen");
                    cs1Var.b = bs1Var.a.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            int i2 = bs1Var.d;
            int i3 = cs1Var.b + bs1Var.c;
            int i4 = cs1Var.a.b;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i4);
            layoutParams.setMargins(i2, i3, 0, 0);
            ((FrameLayout) bs1Var.a.getWindow().getDecorView()).addView(bs1Var.e, layoutParams);
            bs1Var.e.setOnTouchListener(cs1Var);
        }
        this.T0 = cs1Var;
    }

    @Override // defpackage.yg
    public final int h() {
        return 2131492893;
    }

    @Override // defpackage.yg
    public final int i() {
        return 2131296507;
    }

    @Override // defpackage.yg
    public final boolean l() {
        return true;
    }

    @Override // defpackage.yg
    public final boolean m() {
        return false;
    }

    @Override // defpackage.yg
    public final boolean n() {
        return false;
    }

    @Override // defpackage.yg
    public final boolean o() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yg, defpackage.p7
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            getWindow().addFlags(1024);
        } else {
            getWindow().clearFlags(1024);
        }
        q();
        cs1 cs1Var = this.T0;
        if (cs1Var != null) {
            ((FrameLayout) cs1Var.a.a.getWindow().getDecorView()).removeView(this.T0.a.e);
        }
        C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        C();
        if (getResources().getConfiguration().orientation == 2) {
            getWindow().addFlags(1024);
        } else {
            getWindow().clearFlags(1024);
        }
        String stringExtra = getIntent().getStringExtra("Url");
        this.n0 = false;
        this.A0 = stringExtra;
        k();
    }

    @Override // defpackage.yg
    public final boolean u() {
        return true;
    }

    @Override // defpackage.yg
    public final boolean y() {
        return false;
    }
}
