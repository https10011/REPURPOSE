package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y31 extends o30 {
    public final int c0;
    public final int d0;
    public n31 e0;
    public o31 f0;

    public y31(boolean z, Context context) {
        super(z, context);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.c0 = 21;
            this.d0 = 22;
        } else {
            this.c0 = 22;
            this.d0 = 21;
        }
    }

    @Override // defpackage.o30, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        f31 f31Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.e0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                f31Var = (f31) headerViewListAdapter.getWrappedAdapter();
            } else {
                f31Var = (f31) adapter;
                headersCount = 0;
            }
            o31 o31VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= f31Var.getCount()) ? null : f31Var.getItem(i);
            o31 o31Var = this.f0;
            if (o31Var != o31VarB) {
                i31 i31Var = f31Var.a;
                if (o31Var != null) {
                    this.e0.e(i31Var, o31Var);
                }
                this.f0 = o31VarB;
                if (o31VarB != null) {
                    this.e0.j(i31Var, o31VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView selectedView = getSelectedView();
        if (selectedView != null && i == this.c0) {
            if (selectedView.isEnabled() && selectedView.getItemData().hasSubMenu()) {
                performItemClick(selectedView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (selectedView == null || i != this.d0) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (f31) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (f31) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(n31 n31Var) {
        this.e0 = n31Var;
    }

    @Override // defpackage.o30, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
