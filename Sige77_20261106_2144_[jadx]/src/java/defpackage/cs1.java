package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cs1 implements View.OnTouchListener {
    public bs1 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int i;
    public int v;
    public boolean w;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.w = false;
            int rawX = (int) motionEvent.getRawX();
            this.i = rawX;
            this.e = rawX;
            int rawY = (int) motionEvent.getRawY();
            this.v = rawY;
            this.f = rawY;
        } else if (action == 1) {
            int left = view.getLeft();
            int top = view.getTop();
            int i = this.a.b;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.setMargins(left, top, 0, 0);
            view.setLayoutParams(layoutParams);
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.e) > 5.0f || Math.abs(rawY2 - this.f) > 5.0f) {
                this.w = true;
            }
        } else if (action == 2) {
            int rawX3 = ((int) motionEvent.getRawX()) - this.i;
            int rawY3 = ((int) motionEvent.getRawY()) - this.v;
            int left2 = view.getLeft() + rawX3;
            int width = left2 >= 0 ? left2 : 0;
            int width2 = view.getWidth() + width;
            int i2 = this.c;
            if (width2 > i2) {
                width = i2 - view.getWidth();
                width2 = i2;
            }
            int top2 = view.getTop() + rawY3;
            int i3 = this.b + 2;
            if (top2 < i3) {
                top2 = i3;
            }
            int height = view.getHeight() + top2;
            int i4 = this.d;
            if (height > i4) {
                top2 = i4 - view.getHeight();
                height = i4;
            }
            view.layout(width, top2, width2, height);
            this.i = (int) motionEvent.getRawX();
            this.v = (int) motionEvent.getRawY();
        }
        return this.w;
    }
}
