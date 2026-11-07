package defpackage;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiasuhuei321.loadingdialog.view.LVCircularRing;
import com.xiasuhuei321.loadingdialog.view.LoadCircleView;
import com.xiasuhuei321.loadingdialog.view.RightDiaView;
import com.xiasuhuei321.loadingdialog.view.WrongDiaView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mz0 implements yb0 {
    public static su1 n;
    public LVCircularRing a;
    public d10 b;
    public LinearLayout c;
    public TextView d;
    public RightDiaView e;
    public WrongDiaView f;
    public String g;
    public ArrayList h;
    public boolean i;
    public long j;
    public int k;
    public LoadCircleView l;
    public c6 m;

    static {
        su1 su1Var = new su1();
        su1Var.a = true;
        su1Var.b = 1000L;
        n = su1Var;
    }

    public final void a() {
        this.m.removeCallbacksAndMessages(null);
        d10 d10Var = this.b;
        if (d10Var != null) {
            this.a.a();
            d10Var.dismiss();
        }
    }

    public final void b(View view) {
        boolean z = view instanceof WrongDiaView;
        c6 c6Var = this.m;
        long j = this.j;
        if (z) {
            c6Var.sendEmptyMessageDelayed(2, j);
        } else {
            c6Var.sendEmptyMessageDelayed(1, j);
        }
    }

    public final void c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view.getVisibility() != 8) {
                view.setVisibility(8);
            }
        }
    }

    public final void d() {
        d10 d10Var = this.b;
        c();
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                this.l.setVisibility(0);
                this.a.setVisibility(8);
                d10Var.show();
                Log.i("show", "style_line");
                return;
            }
            return;
        }
        this.a.setVisibility(0);
        this.l.setVisibility(8);
        d10Var.show();
        LVCircularRing lVCircularRing = this.a;
        lVCircularRing.a();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        lVCircularRing.i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        lVCircularRing.i.setInterpolator(new LinearInterpolator());
        lVCircularRing.i.setRepeatCount(-1);
        lVCircularRing.i.setRepeatMode(1);
        lVCircularRing.i.addUpdateListener(new bi(lVCircularRing, 2));
        lVCircularRing.i.addListener(new in(1));
        if (!lVCircularRing.i.isRunning()) {
            lVCircularRing.i.start();
        }
        Log.i("show", "style_ring");
    }
}
