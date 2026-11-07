package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class f21 extends LinearLayout {
    public boolean W;
    public final ArrayList a;
    public final ArrayList b;
    public final wa c;
    public final e21 d;
    public Integer[] e;
    public ot1 f;
    public qt1 i;
    public int v;
    public st1 w;

    /* JADX WARN: Type inference failed for: r12v5, types: [e21] */
    public f21(Context context, AttributeSet attributeSet) {
        ot1 ot1VarB;
        int next;
        st1 st1Var;
        int next2;
        super(r93.j0(context, attributeSet, 2130969397, 2131952653), attributeSet, 2130969397);
        this.a = new ArrayList();
        this.b = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.c = new wa(materialButtonToggleGroup, 15);
        this.d = new Comparator() { // from class: e21
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                View view = (MaterialButton) obj;
                View view2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(((MaterialButton) view).e0).compareTo(Boolean.valueOf(((MaterialButton) view2).e0));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(view.isPressed()).compareTo(Boolean.valueOf(view2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = materialButtonToggleGroup;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(view), materialButtonToggleGroup2.indexOfChild(view2));
            }
        };
        this.W = true;
        Context context2 = getContext();
        TypedArray typedArrayX = ga.x(context2, attributeSet, ue1.m, 2130969397, 2131952653, new int[0]);
        if (typedArrayX.hasValue(2)) {
            int resourceId = typedArrayX.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        st1Var = new st1();
                        st1Var.c = new int[10][];
                        st1Var.d = new pv2[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            st1Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    st1Var = null;
                }
            } else {
                st1Var = null;
            }
            this.w = st1Var;
        }
        if (typedArrayX.hasValue(4)) {
            qt1 qt1VarB = qt1.b(context2, typedArrayX, 4);
            this.i = qt1VarB;
            if (qt1VarB == null) {
                pt1 pt1Var = new pt1(op1.a(typedArrayX.getResourceId(4, 0), typedArrayX.getResourceId(5, 0), context2).c());
                this.i = pt1Var.a != 0 ? new qt1(pt1Var) : null;
            }
        }
        if (typedArrayX.hasValue(3)) {
            y yVar = new y(0.0f);
            int resourceId2 = typedArrayX.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        ot1VarB = new ot1();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            ot1VarB.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } catch (Throwable th3) {
                        if (xml2 == null) {
                            throw th3;
                        }
                        try {
                            xml2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    ot1VarB = ot1.b(yVar);
                }
            } else {
                ot1VarB = ot1.b(op1.d(typedArrayX, 3, yVar));
            }
            this.f = ot1VarB;
        }
        this.v = typedArrayX.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayX.getBoolean(0, true));
        typedArrayX.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton childAt = getChildAt(i);
            MaterialButton childAt2 = getChildAt(i - 1);
            if (this.v <= 0) {
                iMin = Math.min(childAt.getStrokeWidth(), childAt2.getStrokeWidth());
                childAt.setShouldDrawSurfaceColorStroke(true);
                childAt2.setShouldDrawSurfaceColorStroke(true);
            } else {
                childAt.setShouldDrawSurfaceColorStroke(false);
                childAt2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.v - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.v - iMin;
                layoutParams2.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.W = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        this.a.add(materialButton.getShapeAppearanceModel());
        this.b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.w == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                int iMin2 = 0;
                if (c(i) && this.w != null) {
                    MaterialButton childAt = getChildAt(i);
                    st1 st1Var = this.w;
                    int width = childAt.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < st1Var.a; i3++) {
                        rt1 rt1Var = (rt1) st1Var.d[i3].a;
                        int i4 = rt1Var.a;
                        float f = rt1Var.b;
                        if (i4 == 2) {
                            fMax = Math.max(i2, f);
                        } else {
                            if (i4 == 1) {
                                fMax = Math.max(i2, width * f);
                            }
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i5 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i5)) {
                                materialButton2 = (MaterialButton) getChildAt(i5);
                                break;
                            }
                            i5--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    for (int i6 = i + 1; i6 < childCount; i6++) {
                        if (c(i6)) {
                            materialButton = (MaterialButton) getChildAt(i6);
                            break;
                        }
                    }
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
        }
        int i7 = firstVisibleChildIndex;
        while (i7 <= lastVisibleChildIndex) {
            if (c(i7)) {
                getChildAt(i7).setSizeChange(this.w);
                getChildAt(i7).setWidthChangeMax((i7 == firstVisibleChildIndex || i7 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i7++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton childAt = getChildAt(i);
            LinearLayout.LayoutParams layoutParams = childAt.l0;
            if (layoutParams != null) {
                childAt.setLayoutParams(layoutParams);
                childAt.l0 = null;
                childAt.i0 = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        pt1 pt1Var;
        int i;
        if (!(this.f == null && this.i == null) && this.W) {
            this.W = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    qt1 qt1Var = this.i;
                    if (qt1Var == null || (!z && !z2)) {
                        qt1Var = (qt1) this.b.get(i2);
                    }
                    if (qt1Var == null) {
                        pt1Var = new pt1((op1) this.a.get(i2));
                    } else {
                        pt1 pt1Var2 = new pt1();
                        int i3 = qt1Var.a;
                        pt1Var2.a = i3;
                        pt1Var2.b = qt1Var.b;
                        int[][] iArr = qt1Var.c;
                        int[][] iArr2 = new int[iArr.length][];
                        pt1Var2.c = iArr2;
                        op1[] op1VarArr = qt1Var.d;
                        pt1Var2.d = new op1[op1VarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i3);
                        System.arraycopy(op1VarArr, 0, pt1Var2.d, 0, pt1Var2.a);
                        pt1Var2.e = qt1Var.e;
                        pt1Var2.f = qt1Var.f;
                        pt1Var2.g = qt1Var.g;
                        pt1Var2.h = qt1Var.h;
                        pt1Var = pt1Var2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    ot1 ot1Var = this.f;
                    if ((i4 | 1) == i4) {
                        pt1Var.e = ot1Var;
                    }
                    if ((i4 | 2) == i4) {
                        pt1Var.f = ot1Var;
                    }
                    if ((i4 | 4) == i4) {
                        pt1Var.g = ot1Var;
                    }
                    if ((i4 | 8) == i4) {
                        pt1Var.h = ot1Var;
                    }
                    qt1 qt1Var2 = pt1Var.a == 0 ? null : new qt1(pt1Var);
                    if (qt1Var2.d()) {
                        childAt.setStateListShapeAppearanceModel(qt1Var2);
                    } else {
                        childAt.setShapeAppearanceModel(qt1Var2.c());
                    }
                }
                i2++;
            }
        }
    }

    public st1 getButtonSizeChange() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public ss getInnerCornerSize() {
        return this.f.b;
    }

    public ot1 getInnerCornerSizeStateList() {
        return this.f;
    }

    public op1 getShapeAppearance() {
        qt1 qt1Var = this.i;
        if (qt1Var == null) {
            return null;
        }
        return qt1Var.c();
    }

    public int getSpacing() {
        return this.v;
    }

    public qt1 getStateListShapeAppearance() {
        return this.i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((d21) null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
            this.b.remove(iIndexOfChild);
        }
        this.W = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(st1 st1Var) {
        if (this.w != st1Var) {
            this.w = st1Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setInnerCornerSize(ss ssVar) {
        this.f = ot1.b(ssVar);
        this.W = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(ot1 ot1Var) {
        this.f = ot1Var;
        this.W = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.W = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(op1 op1Var) {
        pt1 pt1Var = new pt1(op1Var);
        this.i = pt1Var.a == 0 ? null : new qt1(pt1Var);
        this.W = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.v = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(qt1 qt1Var) {
        this.i = qt1Var;
        this.W = true;
        e();
        invalidate();
    }
}
