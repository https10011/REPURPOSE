package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class it1 extends LinearLayout {
    public boolean W;
    public final TextInputLayout a;
    public final AppCompatTextView b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public int i;
    public ImageView.ScaleType v;
    public View.OnLongClickListener w;

    public it1(TextInputLayout textInputLayout, p11 p11Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButtonInflate = LayoutInflater.from(getContext()).inflate(2131492918, (ViewGroup) this, false);
        this.d = checkableImageButtonInflate;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView;
        if (xi0.p(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButtonInflate.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.w;
        checkableImageButtonInflate.setOnClickListener(null);
        ia.n(checkableImageButtonInflate, onLongClickListener);
        this.w = null;
        checkableImageButtonInflate.setOnLongClickListener(null);
        ia.n(checkableImageButtonInflate, null);
        TypedArray typedArray = (TypedArray) p11Var.c;
        if (typedArray.hasValue(70)) {
            this.e = xi0.j(getContext(), p11Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f = qt.s(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(p11Var.f(67));
            if (typedArray.hasValue(66) && checkableImageButtonInflate.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButtonInflate.setContentDescription(text);
            }
            checkableImageButtonInflate.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(2131166138));
        if (dimensionPixelSize < 0) {
            e.g("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.i) {
            this.i = dimensionPixelSize;
            checkableImageButtonInflate.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonInflate.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeC = ia.c(typedArray.getInt(69, -1));
            this.v = scaleTypeC;
            checkableImageButtonInflate.setScaleType(scaleTypeC);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(2131296818);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(p11Var.e(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.c = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButtonInflate);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.e;
            PorterDuff.Mode mode = this.f;
            TextInputLayout textInputLayout = this.a;
            ia.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            ia.k(textInputLayout, checkableImageButton, this.e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.w;
        checkableImageButton.setOnClickListener(null);
        ia.n(checkableImageButton, onLongClickListener);
        this.w = null;
        checkableImageButton.setOnLongClickListener(null);
        ia.n(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.a.e;
        if (editText == null) {
            return;
        }
        this.b.setPaddingRelative(this.d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(2131166008), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.c == null || this.W) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.b.setVisibility(i);
        this.a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
