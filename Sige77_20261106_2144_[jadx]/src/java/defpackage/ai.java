package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ai implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ai(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                throw null;
            default:
                SearchView searchView = (SearchView) this.b;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f0;
                View view2 = searchView.n0;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.h0.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = f72.a;
                    boolean z2 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.C0 ? resources.getDimensionPixelSize(2131165226) + resources.getDimensionPixelSize(2131165225) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i9 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(z2 ? -i9 : paddingLeft - (i9 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
