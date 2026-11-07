package defpackage;

import android.R;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.adjust.sdk.ActivityHandler;
import com.appsflyer.internal.d;
import com.bumptech.glide.a;
import com.facebook.AccessToken;
import com.facebook.login.k;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import com.hjq.toast.BuildConfig;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.xiasuhuei321.loadingdialog.view.LVCircularRing;
import com.xiasuhuei321.loadingdialog.view.LoadCircleView;
import com.xiasuhuei321.loadingdialog.view.RightDiaView;
import com.xiasuhuei321.loadingdialog.view.WrongDiaView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import prod.apptest.com.AppTestApp;
import prod.apptest.com.webview.WebViewCacheInterceptorInst;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class yg extends p7 {
    public static final int MODE_SONIC_WITH_OFFLINE_CACHE = 2;
    public static final HashSet Q0 = new HashSet();
    public static boolean R0 = false;
    public static long S0 = 0;
    public static boolean openCheck2;
    public final int B0;
    public yg C0;
    public RelativeLayout D0;
    public c6 E0;
    public boolean F0;
    public String G0;
    public String H0;
    public j10 I0;
    public gi0 J0;
    public l5 K0;
    public l5 L0;
    public dk M0;
    public final l5 N0;
    public View O0;
    public WebChromeClient.CustomViewCallback P0;
    public WebView o0;
    public ViewGroup p0;
    public ImageView q0;
    public ValueCallback r0;
    public String s0;
    public String t0;
    public g6 v0;
    public WebSettings x0;
    public nz0 y0;
    public mz0 z0;
    public boolean n0 = false;
    public final ExecutorService u0 = Executors.newFixedThreadPool(3);
    public long w0 = 0;
    public String A0 = BuildConfig.FLAVOR;

    public yg() {
        new Handler();
        this.B0 = Build.VERSION.SDK_INT;
        new OkHttpClient();
        this.N0 = registerForActivityResult(new k5(1), new yf(this, 0));
    }

    public static String decodeBase64(String str) {
        try {
            return new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.content.Context, yg] */
    public static void g(yg ygVar, String str) {
        du duVarC;
        du duVar;
        ygVar.G0 = str;
        ArrayList arrayList = new ArrayList();
        gi0 gi0Var = ygVar.J0;
        gi0Var.getClass();
        arrayList.add(gi0Var);
        List<gi0> listB = CollectionsKt.B(arrayList);
        ei0 ei0Var = new ei0(listB);
        j10 j10Var = ygVar.I0;
        CancellationSignal cancellationSignal = new CancellationSignal();
        Executor executorC = Build.VERSION.SDK_INT >= 28 ? cs.c(ygVar) : new r6(new Handler(ygVar.getMainLooper()), 1);
        gg ggVar = new gg(ygVar);
        j10Var.getClass();
        executorC.getClass();
        gg ggVar2 = new gg(ygVar);
        if (Intrinsics.areEqual(ei0Var, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            duVarC = ggVar2.c();
        } else {
            for (gi0 gi0Var2 : listB) {
            }
            ?? r9 = ggVar2.a;
            if (r9.getPackageManager().hasSystemFeature("android.software.leanback") || r9.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                duVarC = ggVar2.c();
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i < 34) {
                    if (i <= 33) {
                        duVarC = ggVar2.c();
                    } else {
                        duVar = null;
                    }
                    if (duVar == null) {
                        ggVar.a(new zh0("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 3));
                    } else {
                        duVar.onGetCredential(ygVar, ei0Var, cancellationSignal, executorC, ggVar);
                    }
                }
                pu puVar = new pu(r9);
                duVarC = puVar.isAvailableOnDevice() ? puVar : null;
                if (duVarC == null) {
                    duVarC = ggVar2.c();
                }
            }
        }
        duVar = duVarC;
        if (duVar == null) {
            ggVar.a(new zh0("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 3));
        } else {
            duVar.onGetCredential(ygVar, ei0Var, cancellationSignal, executorC, ggVar);
        }
    }

    public static void x(Button button) {
        if (button != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.weight = 1.0f;
            layoutParams.width = 0;
            button.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), UUID.randomUUID() + "_upload.png");
        intent.setFlags(1);
        intent.putExtra("output", FileProvider.d(this, "prod.app_sige7tlbf5.com.fileProvider", file));
        this.s0 = file.getAbsolutePath();
        startActivityForResult(intent, 2);
    }

    public abstract boolean B();

    public void downloadTextFileAction(String str) {
        this.u0.execute(new zf(this, str, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void facebookLogin(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - S0 < 1000) {
            w("Failure: Too many requests, please try again later");
            return;
        }
        S0 = jCurrentTimeMillis;
        this.G0 = str;
        Date date = AccessToken.Y;
        AccessToken accessTokenT = aj0.t();
        if (accessTokenT != null && !new Date().after(accessTokenT.a)) {
            co.v.n().I(null, true);
        }
        runOnUiThread(new sf(this, 20));
    }

    public void generateFcmToken(String str) {
        FirebaseMessaging firebaseMessaging;
        try {
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(hc0.d());
            }
            firebaseMessaging.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            firebaseMessaging.f.execute(new x4(26, firebaseMessaging, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener(new eg(1, this, str));
        } catch (Exception e) {
            v("Failure: " + e.getMessage(), str);
        }
    }

    public abstract int h();

    public abstract int i();

    public final void j() {
        if (R0) {
            return;
        }
        try {
            this.M0 = new dk();
            final k kVarA = k.a();
            dk dkVar = this.M0;
            final ri2 ri2Var = new ri2(this);
            kVarA.getClass();
            if (dkVar == null) {
                throw new d90("Unexpected CallbackManager, please use the provided Factory.");
            }
            int iA = ts.a(1);
            ck ckVar = new ck() { // from class: m01
                @Override // defpackage.ck
                public final void a(Intent intent, int i) {
                    kVarA.d(i, intent, ri2Var);
                }
            };
            dkVar.a.put(Integer.valueOf(iA), ckVar);
            R0 = true;
            kv.E("Facebook login initialized successfully");
        } catch (Exception e) {
            kv.o("Facebook login initialization failed", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        getIntent();
        this.o0.addJavascriptInterface(new qg(this), "JSInterface");
        this.o0.addJavascriptInterface(new gs0(this.C0), "Android");
        this.o0.addJavascriptInterface(new ug(this), "LaunchOpen");
        this.o0.addJavascriptInterface(new tg(this), "LaunchClose");
        this.o0.addJavascriptInterface(new rg(this), "Color");
        this.o0.addJavascriptInterface(new wg(this), "LogOpen");
        this.o0.addJavascriptInterface(new vg(this), "LogClose");
        this.o0.addJavascriptInterface(new xg(this), "LogTest");
        this.o0.setDownloadListener(new DownloadListener() { // from class: wf
            /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, java.lang.Object, yg] */
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                ?? r0 = this.a;
                ExecutorService executorService = r0.u0;
                String lowerCase = str.toLowerCase();
                String strGuessFileName = URLUtil.guessFileName(str, str3, str4);
                if (str.startsWith("blob:")) {
                    r0.o0.evaluateJavascript(ts.k("(function() {  fetch('", str, "')    .then(response => response.blob())    .then(blob => {      const reader = new FileReader();      reader.onload = function() {        window.Android.receiveBase64FromBlob(reader.result);      };      reader.readAsDataURL(blob);    })    .catch(err => window.Android.receiveBase64FromBlob(err.message));})()"), null);
                    return;
                }
                if (lowerCase.startsWith("data:image") || (str4 != null && str4.startsWith("image/"))) {
                    if (lowerCase.startsWith("data:")) {
                        executorService.execute(new zf(r0, str, 2));
                        return;
                    } else {
                        executorService.execute(new zf(r0, str, 3));
                        return;
                    }
                }
                if (!lowerCase.endsWith(".apk")) {
                    executorService.execute(new cg(r0, str, strGuessFileName, 1));
                    return;
                }
                ProgressDialog progressDialog = new ProgressDialog(r0);
                progressDialog.setProgressStyle(1);
                progressDialog.setProgressNumberFormat("%1d MB / %2d MB");
                progressDialog.setCancelable(false);
                progressDialog.show();
                executorService.execute(new dg((Object) r0, progressDialog, str, 0));
            }
        });
        if (!getString(2131886225).startsWith("${")) {
            this.o0.addJavascriptInterface(new ig(this, this.C0), "Android");
        }
        this.o0.setOnLongClickListener(new View.OnLongClickListener() { // from class: xf
            /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context, yg] */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ?? r4 = this.a;
                WebView.HitTestResult hitTestResult = r4.o0.getHitTestResult();
                int type = hitTestResult.getType();
                int i = 0;
                if (type != 5 && type != 8) {
                    return false;
                }
                String extra = hitTestResult.getExtra();
                String[] strArr = {r4.getString(2131886371), r4.getString(2131886138)};
                f6 f6Var = new f6((Context) r4);
                bg bgVar = new bg(r4, extra, i);
                b6 b6Var = (b6) f6Var.c;
                b6Var.r = strArr;
                b6Var.t = bgVar;
                f6Var.a().show();
                return true;
            }
        });
        if ((getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        this.o0.setWebViewClient(new jg(this, y()));
        this.o0.setWebChromeClient(new mg(this));
        this.o0.removeJavascriptInterface("searchBoxJavaBridge_");
        this.o0.getSettings().setUserAgentString(ak1.a);
        WebSettings settings = this.o0.getSettings();
        this.x0 = settings;
        settings.setJavaScriptEnabled(true);
        if (o()) {
            this.x0.setSupportZoom(true);
            this.x0.setBuiltInZoomControls(true);
        }
        this.x0.setDisplayZoomControls(false);
        this.x0.setTextZoom(100);
        this.x0.setBlockNetworkImage(true);
        this.x0.setAllowContentAccess(true);
        this.x0.setAllowFileAccess(true);
        this.x0.setDatabaseEnabled(true);
        this.x0.setDomStorageEnabled(true);
        this.x0.setSavePassword(false);
        this.x0.setSaveFormData(false);
        this.x0.setUseWideViewPort(true);
        this.x0.setLoadWithOverviewMode(true);
        this.x0.setJavaScriptCanOpenWindowsAutomatically(true);
        this.x0.setSupportMultipleWindows(true);
        this.x0.setMediaPlaybackRequiresUserGesture(false);
        this.x0.setCacheMode(-1);
        this.x0.setMinimumFontSize(1);
        this.x0.setMinimumLogicalFontSize(1);
        this.x0.setMixedContentMode(0);
        this.o0.loadUrl(this.A0);
        WebViewCacheInterceptorInst.getInstance().loadUrl(this.A0, this.o0.getSettings().getUserAgentString());
    }

    public abstract boolean l();

    /* JADX WARN: Multi-variable type inference failed */
    public void lineSdkLoginAction(String str, String str2) {
        try {
            kj0 kj0Var = new kj0(14);
            kj0Var.b = Arrays.asList(dm1.c, dm1.d);
            LineAuthenticationParams lineAuthenticationParams = new LineAuthenticationParams(kj0Var);
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new nx0((Context) this, str));
            if (!n60.b) {
                n60.b = true;
                Executors.newSingleThreadExecutor().execute(new i4(getApplicationContext(), 7));
            }
            Intent intent = new Intent((Context) this, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("authentication_params", lineAuthenticationParams);
            this.H0 = str2;
            this.L0.a(intent);
        } catch (Exception e) {
            kv.o("line:launch failure", e);
            this.o0.loadUrl(d.a("javascript:window.", str2, "('Failure: ", e.getMessage(), "')"));
        }
    }

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    /* JADX WARN: Multi-variable type inference failed */
    public void oauthLogin(String str, String str2) {
        String str3;
        Task taskForException;
        this.G0 = str2;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        gu2.l(str);
        gu2.o(firebaseAuth);
        hc0 hc0Var = firebaseAuth.a;
        if ("facebook.com".equals(str)) {
            mb mbVar = co2.a;
            hc0Var.a();
            if (!mbVar.containsKey(hc0Var.c.a)) {
                e.g("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
                return;
            }
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        hc0Var.a();
        bundle.putString("com.google.firebase.auth.KEY_API_KEY", hc0Var.c.a);
        bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
        bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
        bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", jf2.d().f());
        synchronized (firebaseAuth.h) {
            str3 = firebaseAuth.i;
        }
        bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", str3);
        hc0Var.a();
        bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", hc0Var.b);
        bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", null);
        FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance();
        ev2 ev2Var = firebaseAuth2.o.a;
        ev2Var.getClass();
        Task task = System.currentTimeMillis() - ev2Var.b < 3600000 ? ev2Var.a : null;
        int i = 1;
        if (task != null) {
            task.addOnSuccessListener(new yf(this, i)).addOnFailureListener(new yf(this, 2));
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ci ciVar = firebaseAuth2.o.b;
        if (ciVar.a) {
            taskForException = Tasks.forException(jm2.a(new Status(17057, (String) null, (PendingIntent) null, (ConnectionResult) null)));
        } else {
            wu2 wu2Var = new wu2(ciVar, this, taskCompletionSource, firebaseAuth2);
            ciVar.b = wu2Var;
            co.x(this).E(wu2Var, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
            ciVar.a = true;
            Context applicationContext = getApplicationContext();
            gu2.o(applicationContext);
            SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            hc0 hc0Var2 = firebaseAuth2.a;
            hc0Var2.a();
            editorEdit.putString("firebaseAppName", hc0Var2.b);
            editorEdit.commit();
            Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
            intent.setClass(this, GenericIdpActivity.class);
            intent.setPackage(getPackageName());
            intent.putExtras(bundle);
            startActivity(intent);
            taskForException = taskCompletionSource.getTask();
        }
        taskForException.addOnSuccessListener(new yf(this, 6)).addOnFailureListener(new yf(this, 8));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, Intent intent) {
        ValueCallback valueCallback;
        Uri data;
        super.onActivityResult(i, i2, intent);
        if ((i == 1 || i == 2) && (valueCallback = this.r0) != null) {
            if (i2 != -1 && valueCallback != null) {
                valueCallback.onReceiveValue(null);
                this.r0 = null;
            }
            if (i2 == -1) {
                if (i != 1) {
                    if (i == 2 && !TextUtils.isEmpty(this.s0)) {
                        File file = new File(this.s0);
                        sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
                        data = Uri.fromFile(file);
                        this.t0 = this.s0;
                    } else {
                        data = null;
                    }
                } else if (intent != null) {
                    data = intent.getData();
                } else {
                    data = null;
                }
                ValueCallback valueCallback2 = this.r0;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(new Uri[]{data});
                    this.r0 = null;
                }
            }
        }
    }

    @Override // defpackage.p7
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            this.F0 = true;
        } else {
            this.F0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        nf nfVarL;
        kw1 lhVar;
        super.onCreate(bundle);
        String str = ak1.a;
        HashSet hashSet = Q0;
        if (hashSet == null || hashSet.isEmpty()) {
            try {
                String[] list = getAssets().list("offline");
                if (list != null) {
                    Collections.addAll(hashSet, list);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if ((getIntent().getFlags() & 4194304) != 0) {
            finish();
        }
        this.w0 = System.currentTimeMillis();
        this.C0 = this;
        getWindow().setSoftInputMode(18);
        getWindow().addFlags(16777216);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        setContentView(h());
        boolean z = false;
        getWindow().getDecorView().post(new sf(this, 0));
        File file = null;
        getResources().getColor(2131099703, null);
        int i = 1;
        if (Build.VERSION.SDK_INT < 35) {
            final n6 n6Var = new n6();
            n6Var.e = true;
            View childAt = ((FrameLayout) findViewById(R.id.content)).getChildAt(0);
            n6Var.a = childAt;
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: m6
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    n6 n6Var2 = n6Var;
                    View view = n6Var2.a;
                    if (n6Var2.e) {
                        n6Var2.d = view.getHeight();
                        n6Var2.e = false;
                    }
                    Rect rect = new Rect();
                    this.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    int i2 = rect.top;
                    Rect rect2 = new Rect();
                    view.getWindowVisibleDisplayFrame(rect2);
                    int i3 = (rect2.bottom - rect2.top) + i2;
                    if (i3 != n6Var2.b) {
                        int height = view.getRootView().getHeight();
                        int i4 = height - i3;
                        int i5 = height / 4;
                        FrameLayout.LayoutParams layoutParams = n6Var2.c;
                        if (i4 > i5) {
                            layoutParams.height = height - i4;
                        } else {
                            layoutParams.height = n6Var2.d;
                        }
                        view.requestLayout();
                        n6Var2.b = i3;
                    }
                }
            });
            n6Var.c = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            Window window = getWindow();
            View decorView = window.getDecorView();
            int statusBarColor = window.getStatusBarColor();
            if (so.b(statusBarColor) >= 0.5d) {
                decorView.setSystemUiVisibility(8192);
                window.setStatusBarColor(statusBarColor);
            }
        }
        this.y0 = new nz0(this);
        this.o0 = (WebView) findViewById(2131296841);
        this.p0 = (ViewGroup) findViewById(i());
        this.D0 = (RelativeLayout) findViewById(2131296565);
        this.q0 = (ImageView) findViewById(2131296566);
        AppTestApp.w.d = this.o0;
        int i2 = 2;
        if (B()) {
            mz0 mz0Var = new mz0();
            mz0Var.i = true;
            mz0Var.j = 1000L;
            mz0Var.k = 0;
            mz0Var.m = new c6(mz0Var, Looper.getMainLooper(), i2);
            View viewInflate = LayoutInflater.from(this).inflate(2131492927, (ViewGroup) null);
            mz0Var.c = (LinearLayout) viewInflate.findViewById(2131296447);
            mz0Var.a = (LVCircularRing) viewInflate.findViewById(2131296568);
            mz0Var.d = (TextView) viewInflate.findViewById(2131296567);
            mz0Var.e = (RightDiaView) viewInflate.findViewById(2131296703);
            mz0Var.f = (WrongDiaView) viewInflate.findViewById(2131296870);
            mz0Var.l = (LoadCircleView) viewInflate.findViewById(2131296554);
            ArrayList arrayList = new ArrayList();
            mz0Var.h = arrayList;
            arrayList.add(mz0Var.a);
            mz0Var.h.add(mz0Var.e);
            mz0Var.h.add(mz0Var.f);
            mz0Var.h.add(mz0Var.l);
            mz0Var.e.setOnDrawFinishListener(mz0Var);
            mz0Var.f.setOnDrawFinishListener(mz0Var);
            d10 d10Var = new d10(mz0Var, this);
            mz0Var.b = d10Var;
            d10Var.setCancelable(false);
            d10Var.setContentView(mz0Var.c, new LinearLayout.LayoutParams(-2, -2));
            d10Var.setOnDismissListener(new lz0());
            WindowManager.LayoutParams attributes = d10Var.getWindow().getAttributes();
            attributes.gravity = 80;
            attributes.y = 300;
            d10Var.getWindow().setAttributes(attributes);
            if (mz0.n != null) {
                d10Var.setCancelable(false);
                mz0.n.getClass();
                mz0Var.f.setRepeatTime(0);
                mz0Var.e.setRepeatTime(0);
                mz0.n.getClass();
                mz0.n.getClass();
                su1 su1Var = mz0.n;
                long j = su1Var.b;
                if (j >= 0) {
                    mz0Var.j = j;
                }
                if (!su1Var.a) {
                    mz0Var.i = false;
                }
                mz0Var.d.setVisibility(0);
                mz0Var.d.setText("加载中...");
                mz0.n.getClass();
                mz0Var.g = "加载成功";
                mz0Var.k = 0;
            }
            this.z0 = mz0Var;
            String str2 = (String) getResources().getText(2131886270);
            TextView textView = mz0Var.d;
            if (str2 != null) {
                textView.setVisibility(0);
                mz0Var.d.setText(str2);
            } else {
                textView.setVisibility(8);
            }
            mz0Var.k = 1;
            mz0Var.d();
        }
        if (ea.q(AppTestApp.w.d()) && this.q0 != null) {
            String strD = AppTestApp.w.d();
            if (TextUtils.isEmpty(strD) || !strD.startsWith("http")) {
                this.q0.setImageResource(2131230932);
            } else {
                try {
                    File file2 = new File(getCacheDir(), "image_manager_disk_cache");
                    if (file2.exists()) {
                        String strI = new f91(7).i(new jj0(strD));
                        File file3 = new File(file2, strI.concat(".0"));
                        if (file3.exists()) {
                            file = file3;
                        } else {
                            File file4 = new File(file2, strI.concat(".1"));
                            if (file4.exists()) {
                                file = file4;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (file != null && file.exists()) {
                    kv.E("Splash load from DISK cache: " + file.getAbsolutePath());
                    ii1 ii1VarC = a.a(this).e.c(this);
                    ii1VarC.getClass();
                    bi1 bi1Var = (bi1) ((bi1) new bi1(ii1VarC.a, ii1VarC, Drawable.class, ii1VarC.b).D(file).n()).i();
                    f30 f30Var = new f30();
                    f30Var.a = new wa(10, z);
                    bi1 bi1Var2 = (bi1) bi1Var.E(f30Var).h();
                    ImageView imageView = this.q0;
                    bi1Var2.getClass();
                    d42.b();
                    am2.o(imageView);
                    if (!nf.k(bi1Var2.a, 2048) && bi1Var2.X && imageView.getScaleType() != null) {
                        switch (yh1.a[imageView.getScaleType().ordinal()]) {
                            case 1:
                                nfVarL = bi1Var2.clone().l(y20.d, new dl());
                                break;
                            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                nfVarL = bi1Var2.clone().l(y20.c, new el());
                                nfVarL.d0 = true;
                                break;
                            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            case oc1.LONG_FIELD_NUMBER /* 4 */:
                            case oc1.STRING_FIELD_NUMBER /* 5 */:
                                nfVarL = bi1Var2.clone().l(y20.b, new ad0());
                                nfVarL.d0 = true;
                                break;
                            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                nfVarL = bi1Var2.clone().l(y20.c, new el());
                                nfVarL.d0 = true;
                                break;
                            default:
                                nfVarL = bi1Var2;
                                break;
                        }
                    } else {
                        nfVarL = bi1Var2;
                    }
                    cj0 cj0Var = bi1Var2.i0;
                    Class cls = bi1Var2.h0;
                    cj0Var.c.getClass();
                    if (Bitmap.class.equals(cls)) {
                        lhVar = new lh(imageView, 0);
                    } else {
                        if (!Drawable.class.isAssignableFrom(cls)) {
                            uq1.e(cls, ", try .as*(Class).transcode(ResourceTranscoder)", "Unhandled class: ");
                            return;
                        }
                        lhVar = new lh(imageView, 1);
                    }
                    bi1Var2.C(lhVar, nfVarL);
                }
            }
        }
        c6 c6Var = new c6(i);
        c6Var.b = this;
        this.E0 = c6Var;
        j();
        int i3 = 4;
        this.I0 = new j10(i3);
        String string = getString(2131886225);
        string.getClass();
        if (string.length() <= 0) {
            e.g("serverClientId should not be empty");
            return;
        }
        this.J0 = new gi0(string);
        this.L0 = registerForActivityResult(new k5(i2), new yf(this, 3));
        setScreenSleepOrAwake();
        this.K0 = registerForActivityResult(new k5(i2), new yf(this, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p7
    public void onDestroy() {
        if (this.M0 != null) {
            this.M0 = null;
        }
        if (this.q0 != null) {
            Context applicationContext = getApplicationContext();
            am2.p(applicationContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
            ii1 ii1VarB = a.a(applicationContext).e.b(applicationContext);
            ImageView imageView = this.q0;
            ii1VarB.getClass();
            ii1VarB.l(new gi1(imageView));
            this.q0.setImageDrawable(null);
            this.q0 = null;
        }
        WebView webView = this.o0;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.o0);
            }
            this.o0.getSettings().setJavaScriptEnabled(false);
            this.o0.clearHistory();
            this.o0.clearView();
            this.o0.removeAllViews();
            this.o0.destroy();
            getWindow().clearFlags(128);
        }
        this.E0 = null;
        super.onDestroy();
        ExecutorService executorService = this.u0;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        executorService.shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p7
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!ea.o(this.o0.getUrl())) {
            this.o0.getUrl();
        }
        if (i == 4 && this.o0.canGoBack()) {
            this.o0.goBack();
            return true;
        }
        if (isFinishing()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 25 || i == 24 || i == 164) {
            return super.onKeyDown(i, keyEvent);
        }
        f6 f6Var = new f6((Context) this);
        b6 b6Var = (b6) f6Var.c;
        b6Var.e = getResources().getString(2131886112);
        b6Var.g = getResources().getString(2131886113);
        String string = getResources().getString(2131886114);
        vf vfVar = new vf(0);
        b6Var.l = string;
        b6Var.m = vfVar;
        String string2 = getResources().getString(2131886115);
        tf tfVar = new tf(this, 3);
        b6Var.h = string2;
        b6Var.i = tfVar;
        g6 g6VarA = f6Var.a();
        this.v0 = g6VarA;
        g6VarA.setCancelable(false);
        this.v0.show();
        return super.onKeyDown(i, keyEvent);
    }

    public final void onPause() {
        super.onPause();
        WebView webView = this.o0;
        if (webView != null) {
            webView.onPause();
            this.o0.pauseTimers();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length != 0 && i == 3) {
            if (iArr[0] == 0) {
                A();
                return;
            }
            f6 f6Var = new f6((Context) this);
            b6 b6Var = (b6) f6Var.c;
            b6Var.e = getResources().getString(2131886080);
            b6Var.g = getResources().getString(2131886081);
            b6Var.j = getResources().getString(2131886082);
            b6Var.k = null;
            String string = getResources().getString(2131886083);
            hg hgVar = new hg(this);
            b6Var.h = string;
            b6Var.i = hgVar;
            f6Var.a().show();
        }
    }

    public final void onResume() {
        super.onResume();
        WebView webView = this.o0;
        if (webView != null) {
            webView.onResume();
            this.o0.resumeTimers();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        int i;
        WindowInsets rootWindowInsets;
        int identifier = getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        int iIntValue = 0;
        int dimensionPixelSize = identifier > 0 ? getApplicationContext().getResources().getDimensionPixelSize(identifier) : 0;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        if (this.F0) {
            i = displayMetrics.heightPixels;
        } else {
            if ("Xiaomi".equals(Build.MANUFACTURER)) {
                try {
                    Class<?> clsLoadClass = getClassLoader().loadClass("android.os.SystemProperties");
                    iIntValue = ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, "ro.miui.notch", 0)).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (iIntValue == 1 || getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
                i = displayMetrics.heightPixels - 10;
            } else {
                View decorView = getWindow().getDecorView();
                if (((decorView == null || Build.VERSION.SDK_INT < 28 || (rootWindowInsets = decorView.getRootWindowInsets()) == null) ? null : rootWindowInsets.getDisplayCutout()) != null) {
                    i = displayMetrics.heightPixels - 10;
                } else {
                    i = displayMetrics.heightPixels - dimensionPixelSize;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = this.o0.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i;
        this.o0.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 29 && sp0.d(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            sp0.A(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1001);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb.append(str);
        sb.append(Environment.DIRECTORY_DCIM);
        sb.append(str);
        sb.append("Camera");
        sb.append(str);
        String string = sb.toString();
        File file = new File(string);
        if (!file.exists() && !file.mkdirs()) {
            runOnUiThread(new sf(this, 13));
            return;
        }
        File file2 = new File(string, System.currentTimeMillis() + ".jpg");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                runOnUiThread(new x4(10, this, file2));
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            runOnUiThread(new sf(this, 14));
        }
    }

    public void requestPushPermission(long j, final boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            final int i = 9;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l4
                /* JADX WARN: Type inference failed for: r5v11, types: [android.app.Activity, android.content.Context, yg] */
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    boolean z2 = z;
                    Object obj = this;
                    switch (i2) {
                        case 0:
                            ActivityHandler.k((ActivityHandler) obj, z2);
                            break;
                        case 1:
                            ActivityHandler.l((ActivityHandler) obj, z2);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            ActivityHandler.n((ActivityHandler) obj, z2);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            ActivityHandler.p((ActivityHandler) obj, z2);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            ActivityHandler.c((ActivityHandler) obj, z2);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            ActivityHandler.T((ActivityHandler) obj, z2);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            ActivityHandler.R((ActivityHandler) obj, z2);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            ActivityHandler.Z((ActivityHandler) obj, z2);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            ActivityHandler.e((ActivityHandler) obj, z2);
                            break;
                        default:
                            ?? r5 = (yg) obj;
                            int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                            if (sp0.d(r5, "android.permission.POST_NOTIFICATIONS") != 0) {
                                if (!r5.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                                    r5.N0.a("android.permission.POST_NOTIFICATIONS");
                                } else {
                                    new Handler(Looper.getMainLooper()).postDelayed(new sf(r5, 15), 1000L);
                                    if (z2) {
                                        Intent intent = new Intent();
                                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                        intent.setData(Uri.fromParts("package", r5.getPackageName(), null));
                                        r5.startActivity(intent);
                                    }
                                }
                                break;
                            }
                            break;
                    }
                }
            }, j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(Bitmap bitmap, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/AppDownload");
        ContentResolver contentResolver = getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            runOnUiThread(new sf(this, 3));
            return;
        }
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            try {
                if (bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream)) {
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    contentResolver.update(uriInsert, contentValues, null, null);
                    runOnUiThread(new sf(this, 4));
                } else {
                    runOnUiThread(new sf(this, 5));
                }
                if (outputStreamOpenOutputStream != null) {
                    outputStreamOpenOutputStream.close();
                }
            } catch (Throwable th) {
                if (outputStreamOpenOutputStream != null) {
                    try {
                        outputStreamOpenOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            runOnUiThread(new sf(this, 6));
        }
    }

    public void savePictureBase64Action(String str) {
        this.u0.execute(new zf(this, str, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScreenSleepOrAwake() {
        try {
            if (u()) {
                getWindow().addFlags(128);
            } else {
                getWindow().clearFlags(128);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 && sp0.d(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            sp0.A(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1001);
            return;
        }
        try {
            if (str.startsWith("data:image")) {
                String strSubstring = str.substring(5, str.indexOf(";"));
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(strSubstring);
                if (extensionFromMimeType == null) {
                    extensionFromMimeType = "png";
                }
                byte[] bArrDecode = Base64.decode(str.substring(str.indexOf(",") + 1), 0);
                String str2 = "img_" + System.currentTimeMillis() + "." + extensionFromMimeType;
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str2);
                contentValues.put("mime_type", strSubstring);
                if (i < 29) {
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES + "/AppDownload");
                    if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                        runOnUiThread(new sf(this, 7));
                        return;
                    }
                    File file = new File(externalStoragePublicDirectory, str2);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(bArrDecode);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        MediaScannerConnection.scanFile(this, new String[]{file.getAbsolutePath()}, null, null);
                        runOnUiThread(new sf(this, 8));
                        return;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/AppDownload");
                ContentResolver contentResolver = getContentResolver();
                Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert == null) {
                    runOnUiThread(new sf(this, 11));
                    return;
                }
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                try {
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.write(bArrDecode);
                        outputStreamOpenOutputStream.flush();
                        runOnUiThread(new sf(this, 9));
                    } else {
                        runOnUiThread(new sf(this, 10));
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
                runOnUiThread(new sf(this, 12));
            }
        } catch (Exception unused) {
            runOnUiThread(new sf(this, 12));
        }
    }

    public abstract boolean u();

    /* JADX WARN: Multi-variable type inference failed */
    public void uploadPicture() {
        f6 f6Var = new f6((Context) this);
        String string = getResources().getString(2131886434);
        b6 b6Var = (b6) f6Var.c;
        b6Var.e = string;
        b6Var.o = new fg(this, 0);
        String string2 = getResources().getString(2131886137);
        tf tfVar = new tf(this, 0);
        b6Var.h = string2;
        b6Var.i = tfVar;
        String string3 = getResources().getString(2131886111);
        tf tfVar2 = new tf(this, 1);
        b6Var.j = string3;
        b6Var.k = tfVar2;
        String string4 = getResources().getString(2131886208);
        tf tfVar3 = new tf(this, 2);
        b6Var.l = string4;
        b6Var.m = tfVar3;
        final g6 g6VarA = f6Var.a();
        g6VarA.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: uf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                g6 g6Var = g6VarA;
                Button buttonC = g6Var.c(-1);
                Button buttonC2 = g6Var.c(-2);
                Button buttonC3 = g6Var.c(-3);
                yg.x(buttonC);
                yg.x(buttonC2);
                yg.x(buttonC3);
            }
        });
        g6VarA.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void url2bitmap(String str) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            int contentLength = ((HttpURLConnection) uRLConnectionOpenConnection).getContentLength();
            uRLConnectionOpenConnection.connect();
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, contentLength);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                    if (bitmapDecodeStream != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            s(bitmapDecodeStream, System.currentTimeMillis() + ".jpg");
                        } else {
                            r(bitmapDecodeStream);
                        }
                    }
                    bufferedInputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Exception unused) {
            runOnUiThread(new sf(this, 19));
        }
    }

    public final void v(String str, String str2) {
        new Handler(Looper.getMainLooper()).postDelayed(new cg(this, str2, str, 0), 0L);
    }

    public final void w(String str) {
        v(str, this.G0);
    }

    public abstract boolean y();

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(String str) {
        FirebaseAuth.getInstance().a(new GoogleAuthCredential(str, (String) null)).addOnCompleteListener(this, new yf(this, 5));
    }

    public void p(boolean z) {
    }
}
