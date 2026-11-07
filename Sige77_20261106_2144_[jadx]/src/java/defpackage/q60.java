package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q60 extends LinearLayout {
    public final LinkedHashSet W;
    public final TextInputLayout a;
    public ColorStateList a0;
    public final FrameLayout b;
    public PorterDuff.Mode b0;
    public final CheckableImageButton c;
    public int c0;
    public ColorStateList d;
    public ImageView.ScaleType d0;
    public PorterDuff.Mode e;
    public View.OnLongClickListener e0;
    public View.OnLongClickListener f;
    public CharSequence f0;
    public final AppCompatTextView g0;
    public boolean h0;
    public final CheckableImageButton i;
    public EditText i0;
    public final AccessibilityManager j0;
    public AccessibilityManager.TouchExplorationStateChangeListener k0;
    public final o60 l0;
    public final vl v;
    public int w;

    public q60(TextInputLayout textInputLayout, p11 p11Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.w = 0;
        this.W = new LinkedHashSet();
        this.l0 = new o60(this);
        p60 p60Var = new p60(this);
        this.j0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(2131296812, layoutInflaterFrom, this);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(2131296811, layoutInflaterFrom, frameLayout);
        this.i = checkableImageButtonA2;
        this.v = new vl(this, p11Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.g0 = appCompatTextView;
        TypedArray typedArray = (TypedArray) p11Var.c;
        if (typedArray.hasValue(38)) {
            this.d = xi0.j(getContext(), p11Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = qt.s(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(p11Var.f(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(2131886197));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.a0 = xi0.j(getContext(), p11Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.b0 = qt.s(typedArray.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.a0 = xi0.j(getContext(), p11Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.b0 = qt.s(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(2131166138));
        if (dimensionPixelSize < 0) {
            e.g("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.c0) {
            this.c0 = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeC = ia.c(typedArray.getInt(31, -1));
            this.d0 = scaleTypeC;
            checkableImageButtonA2.setScaleType(scaleTypeC);
            checkableImageButtonA.setScaleType(scaleTypeC);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(2131296819);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(p11Var.e(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.f0 = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.S0.add(p60Var);
        if (textInputLayout.e != null) {
            p60Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new xk(this, i));
    }

    public final CheckableImageButton a(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CheckableImageButton checkableImageButtonInflate = layoutInflater.inflate(2131492917, viewGroup, false);
        checkableImageButtonInflate.setId(i);
        if (xi0.p(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButtonInflate.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButtonInflate;
    }

    public final r60 b() {
        r60 evVar;
        int i = this.w;
        vl vlVar = this.v;
        SparseArray sparseArray = (SparseArray) vlVar.c;
        r60 r60Var = (r60) sparseArray.get(i);
        if (r60Var != null) {
            return r60Var;
        }
        q60 q60Var = (q60) vlVar.d;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                evVar = new ev(q60Var, i2);
            } else if (i == 1) {
                evVar = new hb1(q60Var, vlVar.b);
            } else if (i == 2) {
                evVar = new dn(q60Var);
            } else {
                if (i != 3) {
                    e.g(ck1.r(i, "Invalid end icon mode: "));
                    return null;
                }
                evVar = new v30(q60Var);
            }
        } else {
            evVar = new ev(q60Var, 0);
        }
        sparseArray.append(i, evVar);
        return evVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.i;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.g0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.i.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        r60 r60VarB = b();
        boolean zJ = r60VarB.j();
        CheckableImageButton checkableImageButton = this.i;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.d) == r60VarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(r60VarB instanceof v30) || (zIsActivated = checkableImageButton.isActivated()) == ((v30) r60VarB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            ia.k(this.a, checkableImageButton, this.a0);
        }
    }

    public final void g(int i) {
        if (this.w == i) {
            return;
        }
        r60 r60VarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.k0;
        AccessibilityManager accessibilityManager = this.j0;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.k0 = null;
        r60VarB.r();
        this.w = i;
        Iterator it = this.W.iterator();
        if (it.hasNext()) {
            throw y00.i(it);
        }
        h(i != 0);
        r60 r60VarB2 = b();
        int iD = this.v.a;
        if (iD == 0) {
            iD = r60VarB2.d();
        }
        Drawable drawableU = iD != 0 ? gu2.u(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawableU);
        TextInputLayout textInputLayout = this.a;
        if (drawableU != null) {
            ia.b(textInputLayout, checkableImageButton, this.a0, this.b0);
            ia.k(textInputLayout, checkableImageButton, this.a0);
        }
        int iC = r60VarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(r60VarB2.j());
        if (!r60VarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        r60VarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = r60VarB2.h();
        this.k0 = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.k0);
        }
        View.OnClickListener onClickListenerF = r60VarB2.f();
        View.OnLongClickListener onLongClickListener = this.e0;
        checkableImageButton.setOnClickListener(onClickListenerF);
        ia.n(checkableImageButton, onLongClickListener);
        EditText editText = this.i0;
        if (editText != null) {
            r60VarB2.l(editText);
            j(r60VarB2);
        }
        ia.b(textInputLayout, checkableImageButton, this.a0, this.b0);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.i.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        ia.b(this.a, checkableImageButton, this.d, this.e);
    }

    public final void j(r60 r60Var) {
        if (this.i0 == null) {
            return;
        }
        if (r60Var.e() != null) {
            this.i0.setOnFocusChangeListener(r60Var.e());
        }
        if (r60Var.g() != null) {
            this.i.setOnFocusChangeListener(r60Var.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.i.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f0 == null || this.h0) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.a0.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.w != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.e == null) {
            return;
        }
        this.g0.setPaddingRelative(getContext().getResources().getDimensionPixelSize(2131166008), textInputLayout.e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.e.getPaddingEnd(), textInputLayout.e.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.g0;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.f0 == null || this.h0) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.s();
    }
}
