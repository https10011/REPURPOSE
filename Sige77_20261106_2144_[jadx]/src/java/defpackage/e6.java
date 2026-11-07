package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e6 {
    public final int A;
    public final int B;
    public final boolean C;
    public final c6 D;
    public final Context a;
    public final g6 b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public AlertController.RecycleListView f;
    public Button g;
    public CharSequence h;
    public Message i;
    public Button j;
    public CharSequence k;
    public Message l;
    public Button m;
    public CharSequence n;
    public Message o;
    public NestedScrollView p;
    public Drawable r;
    public ImageView s;
    public TextView t;
    public TextView u;
    public View v;
    public ListAdapter w;
    public final int y;
    public final int z;
    public int q = 0;
    public int x = -1;
    public final l3 E = new l3(this, 1);

    public e6(Context context, g6 g6Var, Window window) {
        this.a = context;
        this.b = g6Var;
        this.c = window;
        c6 c6Var = new c6(0);
        c6Var.b = new WeakReference(g6Var);
        this.D = c6Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, we1.e, 2130968620, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.C = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        g6Var.d().i(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.D.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.n = charSequence;
            this.o = messageObtainMessage;
        } else if (i == -2) {
            this.k = charSequence;
            this.l = messageObtainMessage;
        } else if (i != -1) {
            e.g("Button does not exist");
        } else {
            this.h = charSequence;
            this.i = messageObtainMessage;
        }
    }
}
