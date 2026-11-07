package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.c;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class d82 extends Dialog {
    public static volatile int Z;
    public boolean W;
    public boolean X;
    public WindowManager.LayoutParams Y;
    public String a;
    public String b;
    public y72 c;
    public c82 d;
    public ProgressDialog e;
    public ImageView f;
    public FrameLayout i;
    public final a82 v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d82(c cVar, String str, Bundle bundle, int i, y72 y72Var) {
        Uri uriA;
        super(cVar, Z);
        dw0.y();
        this.b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = h42.u(cVar) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", i90.b());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.2.3"}, 1)));
        this.c = y72Var;
        if (Intrinsics.areEqual(str, "share") && bundle.containsKey("media")) {
            this.v = new a82(this, str, bundle);
            return;
        }
        if (b82.a[ts.v(i)] == 1) {
            uriA = h42.a(yv2.A(), "oauth/authorize", bundle);
        } else {
            uriA = h42.a(yv2.y(), i90.d() + "/dialog/" + str, bundle);
        }
        this.a = uriA.toString();
    }

    public static int a(int i, float f, int i2, int i3) {
        double d;
        int i4 = (int) (i / f);
        if (i4 <= i2) {
            d = 1.0d;
        } else {
            d = i4 >= i3 ? 0.5d : ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i) * d);
    }

    public static final void b(c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = cVar.getPackageManager().getApplicationInfo(cVar.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && Z == 0) {
                int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    i = 2131952867;
                }
                Z = i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleC = h42.C(uri.getQuery());
        bundleC.putAll(h42.C(uri.getFragment()));
        return bundleC;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c == null || this.w) {
            return;
        }
        e(new f90());
    }

    public final void d() {
        Object systemService = getContext().getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int iMin = Math.min(a(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(a(i, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        c82 c82Var = this.d;
        if (c82Var != null) {
            c82Var.stopLoading();
        }
        if (!this.W && (progressDialog = this.e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.c == null || this.w) {
            return;
        }
        this.w = true;
        d90 d90Var = exc instanceof d90 ? (d90) exc : new d90(exc);
        y72 y72Var = this.c;
        if (y72Var != null) {
            y72Var.a(null, d90Var);
        }
        dismiss();
    }

    public final void f(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        c82 c82Var = new c82(getContext());
        this.d = c82Var;
        c82Var.setVerticalScrollBarEnabled(false);
        c82 c82Var2 = this.d;
        if (c82Var2 != null) {
            c82Var2.setHorizontalScrollBarEnabled(false);
        }
        c82 c82Var3 = this.d;
        int i2 = 1;
        if (c82Var3 != null) {
            c82Var3.setWebViewClient(new lg(this, i2));
        }
        c82 c82Var4 = this.d;
        WebSettings settings = c82Var4 != null ? c82Var4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        c82 c82Var5 = this.d;
        if (c82Var5 != null) {
            String str = this.a;
            if (str == null) {
                uq1.q("Required value was null.");
                return;
            }
            c82Var5.loadUrl(str);
        }
        c82 c82Var6 = this.d;
        if (c82Var6 != null) {
            c82Var6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        c82 c82Var7 = this.d;
        if (c82Var7 != null) {
            c82Var7.setVisibility(4);
        }
        c82 c82Var8 = this.d;
        WebSettings settings2 = c82Var8 != null ? c82Var8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        c82 c82Var9 = this.d;
        WebSettings settings3 = c82Var9 != null ? c82Var9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        c82 c82Var10 = this.d;
        if (c82Var10 != null) {
            c82Var10.setFocusable(true);
        }
        c82 c82Var11 = this.d;
        if (c82Var11 != null) {
            c82Var11.setFocusableInTouchMode(true);
        }
        c82 c82Var12 = this.d;
        if (c82Var12 != null) {
            c82Var12.setOnTouchListener(new x72());
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        AutofillManager autofillManagerE;
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.W = false;
        Context context = getContext();
        context.getClass();
        if (Build.VERSION.SDK_INT >= 26 && (autofillManagerE = w01.e(context.getSystemService(w01.f()))) != null && autofillManagerE.isAutofillSupported() && autofillManagerE.isEnabled() && (layoutParams = this.Y) != null && layoutParams.token == null) {
            Activity ownerActivity = getOwnerActivity();
            layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            WindowManager.LayoutParams layoutParams2 = this.Y;
            Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
            i90 i90Var = i90.a;
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(2131886151));
        }
        ProgressDialog progressDialog3 = this.e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new fg(this, 1));
        }
        requestWindowFeature(1);
        this.i = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f = imageView;
        imageView.setOnClickListener(new zm(this, 6));
        Drawable drawable = getContext().getResources().getDrawable(2131230866);
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.a != null) {
            ImageView imageView4 = this.f;
            if (imageView4 == null) {
                uq1.q("Required value was null.");
                return;
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.i;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            uq1.q("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.W = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 4) {
            c82 c82Var = this.d;
            if (c82Var != null && c82Var.canGoBack()) {
                c82 c82Var2 = this.d;
                if (c82Var2 != null) {
                    c82Var2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a82 a82Var = this.v;
        if (a82Var != null) {
            if ((a82Var != null ? a82Var.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (a82Var != null) {
                    a82Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        a82 a82Var = this.v;
        if (a82Var != null) {
            a82Var.cancel(true);
            ProgressDialog progressDialog = this.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        layoutParams.getClass();
        if (layoutParams.token == null) {
            this.Y = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d82(Context context, String str) {
        context.getClass();
        str.getClass();
        dw0.y();
        int i = Z;
        if (i == 0) {
            dw0.y();
            i = Z;
        }
        super(context, i);
        this.b = "fbconnect://success";
        this.a = str;
    }
}
