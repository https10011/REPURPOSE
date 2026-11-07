package defpackage;

import android.view.View;
import com.hjq.toast.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t62 implements View.OnClickListener {
    public static final HashSet e = new HashSet();
    public final View.OnClickListener a;
    public final WeakReference b;
    public final WeakReference c;
    public final String d;

    public t62(View view, View view2, String str) {
        this.a = g62.f(view);
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        this.d = d.g(lowerCase, "activity", BuildConfig.FLAVOR);
    }

    public final void a() {
        t62 t62Var;
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            View view = (View) this.b.get();
            View view2 = (View) this.c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strD = vu1.d(view2);
                String strB = bc1.b(view2, strD);
                if (strB != null && !op0.n(strB, strD)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", vu1.b(view, view2));
                    jSONObject.put("screenname", this.d);
                    if (!set.contains(this)) {
                        try {
                            t62Var = this;
                            try {
                                i90.c().execute(new gp0(2, strB, jSONObject, strD, t62Var));
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    mt.a(t62Var, th);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            t62Var = this;
                        }
                    }
                }
                return;
            } catch (Exception unused) {
                return;
            }
        } catch (Throwable th4) {
            th = th4;
            t62Var = this;
        }
        mt.a(t62Var, th);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            view.getClass();
            View.OnClickListener onClickListener = this.a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
