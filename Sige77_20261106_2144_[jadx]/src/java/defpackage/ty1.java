package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ty1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ty1 X;
    public static ty1 Y;
    public boolean W;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final sy1 d;
    public final sy1 e;
    public int f;
    public int i;
    public uy1 v;
    public boolean w;

    /* JADX WARN: Type inference failed for: r0v0, types: [sy1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [sy1] */
    public ty1(View view, CharSequence charSequence) {
        final int i = 0;
        this.d = new Runnable(this) { // from class: sy1
            public final /* synthetic */ ty1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ty1 ty1Var = this.b;
                switch (i2) {
                    case 0:
                        ty1Var.c(false);
                        break;
                    default:
                        ty1Var.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.e = new Runnable(this) { // from class: sy1
            public final /* synthetic */ ty1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ty1 ty1Var = this.b;
                switch (i3) {
                    case 0:
                        ty1Var.c(false);
                        break;
                    default:
                        ty1Var.a();
                        break;
                }
            }
        };
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = y52.a;
        this.c = Build.VERSION.SDK_INT >= 28 ? cs.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.W = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(ty1 ty1Var) {
        ty1 ty1Var2 = X;
        if (ty1Var2 != null) {
            ty1Var2.a.removeCallbacks(ty1Var2.d);
        }
        X = ty1Var;
        if (ty1Var != null) {
            ty1Var.a.postDelayed(ty1Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        ty1 ty1Var = Y;
        View view = this.a;
        if (ty1Var == this) {
            Y = null;
            uy1 uy1Var = this.v;
            if (uy1Var != null) {
                View view2 = (View) uy1Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) uy1Var.a).getSystemService("window")).removeView(view2);
                }
                this.v = null;
                this.W = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (X == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            ty1 ty1Var = Y;
            if (ty1Var != null) {
                ty1Var.a();
            }
            Y = this;
            this.w = z;
            Context context = view.getContext();
            uy1 uy1Var = new uy1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            uy1Var.d = layoutParams;
            uy1Var.e = new Rect();
            uy1Var.f = new int[2];
            uy1Var.i = new int[2];
            uy1Var.a = context;
            View viewInflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
            uy1Var.b = viewInflate;
            uy1Var.c = (TextView) viewInflate.findViewById(2131296598);
            layoutParams.setTitle(uy1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 2131951623;
            layoutParams.flags = 24;
            View view2 = (View) uy1Var.b;
            Context context2 = (Context) uy1Var.a;
            this.v = uy1Var;
            int width = this.f;
            int i4 = this.i;
            boolean z2 = this.w;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) uy1Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) uy1Var.c).setText(this.b);
            int[] iArr = (int[]) uy1Var.i;
            int[] iArr2 = (int[]) uy1Var.f;
            Rect rect = (Rect) uy1Var.e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(2131166236);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(2131166235);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z2 ? 2131166239 : 2131166238);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams2.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams2.y = i8;
                    } else {
                        layoutParams2.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams2.y = i9;
                } else {
                    layoutParams2.y = i8;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.w) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = x52.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            sy1 sy1Var = this.e;
            view.removeCallbacks(sy1Var);
            view.postDelayed(sy1Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.v == null || !this.w) {
            View view2 = this.a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.W = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.v == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.W) {
                        this.f = x;
                        this.i = y;
                        this.W = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.f);
                        int i = this.c;
                        if (iAbs > i || Math.abs(y - this.i) > i) {
                            this.f = x;
                            this.i = y;
                            this.W = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
