package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class wa implements g31, s81, bj1, qz1, n90, vw, ak, d21, my1, y91, ph1, rs2, Continuation, OnCompleteListener {
    public static volatile wa d;
    public final /* synthetic */ int a;
    public Object b;
    public static final sh1 c = new sh1(3);
    public static final xn e = new xn(11);
    public static final sp3 f = new sp3();

    public wa(String str, Bundle bundle) {
        Uri uriA;
        String str2;
        this.a = 8;
        bundle = bundle == null ? new Bundle() : bundle;
        int[] iArrA = ts.A(2);
        ArrayList arrayList = new ArrayList(iArrA.length);
        for (int i : iArrA) {
            if (i == 1) {
                str2 = "context_choose";
            } else {
                if (i != 2) {
                    throw null;
                }
                str2 = "join_tournament";
            }
            arrayList.add(str2);
        }
        if (arrayList.contains(str)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            i90 i90Var = i90.a;
            uriA = h42.a(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), "/dialog/".concat(str), bundle);
        } else {
            uriA = h42.a(yv2.y(), i90.d() + "/dialog/" + str, bundle);
        }
        this.b = uriA;
    }

    public static void q(String str, qp3 qp3Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(qp3Var.b / 1000000)));
        sb.append(": logging error [");
        iq3 iq3Var = qp3Var.d;
        if (iq3Var == null) {
            uq1.q("cannot request log site information prior to postProcess()");
            return;
        }
        yv2.Z(1, iq3Var, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public kt1 a() {
        return (kt1) ((mt1) this.b).b();
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        Object obj3 = this.b;
        switch (i) {
            case 23:
                yh2 yh2Var = (yh2) obj3;
                xh2 xh2Var = new xh2(yh2Var, taskCompletionSource);
                ti2 ti2Var = (ti2) ((zh2) obj).l();
                ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true), false);
                apiMetadata.c = false;
                String str = yh2Var.l;
                Parcel parcelD = ti2Var.d();
                int i2 = ii2.a;
                parcelD.writeStrongBinder(xh2Var);
                parcelD.writeString(str);
                ii2.b(parcelD, apiMetadata);
                ti2Var.e(parcelD, 2);
                return;
            default:
                ir0 ir0Var = new ir0(taskCompletionSource);
                dn0 dn0Var = (dn0) ((nn0) obj).l();
                ApiMetadata apiMetadata2 = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true), false);
                apiMetadata2.c = false;
                bn0 bn0Var = (bn0) dn0Var;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i3 = zv2.a;
                parcelObtain.writeStrongBinder(ir0Var);
                zv2.b(parcelObtain, (GetCredentialRequest) obj3);
                zv2.b(parcelObtain, apiMetadata2);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    bn0Var.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
        }
    }

    @Override // defpackage.qz1
    public oz1 b(int i) {
        int i2 = 5;
        if (i == 5) {
            return d71.a;
        }
        if (((r41) this.b) == null) {
            this.b = new r41(i2);
        }
        return (r41) this.b;
    }

    @Override // defpackage.g31
    public boolean c(i31 i31Var, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        c4 c4Var = ((ActionMenuView) this.b).q0;
        if (c4Var != null) {
            Toolbar toolbar = (Toolbar) ((ri2) c4Var).a;
            if (toolbar.w0.l()) {
                zOnMenuItemSelected = true;
            } else {
                my1 my1Var = toolbar.y0;
                zOnMenuItemSelected = my1Var != null ? ((ny1) ((wa) my1Var).b).b.onMenuItemSelected(0, menuItem) : false;
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    public SharedPreferences d() {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            Object value = ((uv1) this.b).getValue();
            value.getClass();
            return (SharedPreferences) value;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    @Override // defpackage.y91
    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.b)) {
            ((ByteBuffer) this.b).position(0);
            messageDigest.update(((ByteBuffer) this.b).putLong(l.longValue()).array());
        }
    }

    @Override // defpackage.bj1
    public pi1 f(pi1 pi1Var, da1 da1Var) {
        Resources resources = (Resources) this.b;
        if (pi1Var == null) {
            return null;
        }
        return new nh(resources, pi1Var);
    }

    @Override // defpackage.g31
    public void g(i31 i31Var) {
        g31 g31Var = ((ActionMenuView) this.b).l0;
        if (g31Var != null) {
            g31Var.g(i31Var);
        }
    }

    @Override // defpackage.vw
    public void h() {
        ((nf1) this.b).b();
    }

    public void i(Activity activity) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            activity.getClass();
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            intent.getClass();
            l(intent, data);
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    @Override // defpackage.n90
    public Object j() {
        q8 q8Var = (q8) this.b;
        return new jy((bk0) q8Var.b, (ac2) q8Var.c);
    }

    @Override // defpackage.s81
    public u92 k(View view, u92 u92Var) {
        boolean z;
        boolean z2;
        int iD = u92Var.d();
        k8 k8Var = (k8) this.b;
        Context context = k8Var.X;
        int iD2 = u92Var.d();
        ActionBarContextView actionBarContextView = k8Var.i0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k8Var.i0.getLayoutParams();
            boolean z3 = true;
            if (k8Var.i0.isShown()) {
                if (k8Var.P0 == null) {
                    k8Var.P0 = new Rect();
                    k8Var.Q0 = new Rect();
                }
                Rect rect = k8Var.P0;
                Rect rect2 = k8Var.Q0;
                rect.set(u92Var.b(), u92Var.d(), u92Var.c(), u92Var.a());
                ViewGroup viewGroup = k8Var.n0;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = f72.a;
                    d72.a(viewGroup, rect, rect2);
                } else {
                    if (!f72.a) {
                        f72.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            f72.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                f72.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = f72.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e2) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = k8Var.n0;
                WeakHashMap weakHashMap = x52.a;
                u92 u92VarA = q52.a(viewGroup2);
                int iB = u92VarA == null ? 0 : u92VarA.b();
                int iC = u92VarA == null ? 0 : u92VarA.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || k8Var.p0 != null) {
                    View view2 = k8Var.p0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            k8Var.p0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    k8Var.p0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    k8Var.n0.addView(k8Var.p0, -1, layoutParams);
                }
                View view4 = k8Var.p0;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = k8Var.p0;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(2131099654) : context.getColor(2131099653));
                }
                if (!k8Var.u0 && z3) {
                    iD2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                k8Var.i0.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = k8Var.p0;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return x52.i(view, iD != iD2 ? u92Var.f(u92Var.b(), iD2, u92Var.c(), u92Var.a()) : u92Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #2 {all -> 0x0067, blocks: (B:5:0x000a, B:20:0x003b, B:29:0x0051, B:32:0x0057, B:18:0x0035, B:23:0x0044, B:26:0x004b, B:9:0x001a, B:12:0x0021, B:16:0x002d), top: B:43:0x000a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:23:0x0044, B:26:0x004b), top: B:39:0x0044, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #2 {all -> 0x0067, blocks: (B:5:0x000a, B:20:0x003b, B:29:0x0051, B:32:0x0057, B:18:0x0035, B:23:0x0044, B:26:0x004b, B:9:0x001a, B:12:0x0021, B:16:0x002d), top: B:43:0x000a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public void l(Intent intent, Uri uri) {
        String string;
        Bundle bundleExtra;
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            intent.getClass();
            String string2 = null;
            if (set.contains(this)) {
                string = null;
            } else {
                try {
                    String queryParameter = uri.getQueryParameter("al_applink_data");
                    if (queryParameter == null) {
                        string = null;
                    } else {
                        try {
                            string = new JSONObject(queryParameter).getString("campaign_ids");
                        } catch (Exception unused) {
                            Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                            string = null;
                            if (string == null) {
                                if (!mt.a.contains(this)) {
                                    try {
                                        bundleExtra = intent.getBundleExtra("al_applink_data");
                                        if (bundleExtra == null) {
                                            string2 = bundleExtra.getString("campaign_ids");
                                        }
                                    } catch (Throwable th) {
                                        mt.a(this, th);
                                    }
                                }
                                string = string2;
                            }
                            if (string != null) {
                                d().edit().putString("campaign_ids", string).apply();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    mt.a(this, th2);
                    string = null;
                }
            }
            if (string == null) {
                if (!mt.a.contains(this)) {
                    bundleExtra = intent.getBundleExtra("al_applink_data");
                    if (bundleExtra == null) {
                        string2 = bundleExtra.getString("campaign_ids");
                    }
                }
                string = string2;
            }
            if (string != null) {
                d().edit().putString("campaign_ids", string).apply();
            }
        } catch (Throwable th3) {
            mt.a(this, th3);
        }
    }

    public void m(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // defpackage.ak
    public void n(wj wjVar, gj1 gj1Var) {
        boolean z = gj1Var.a.d0;
        pk pkVar = (pk) this.b;
        if (z) {
            pj1 pj1Var = rj1.b;
            pkVar.resumeWith(gj1Var.b);
        } else {
            pj1 pj1Var2 = rj1.b;
            pkVar.resumeWith(new qj1(new xp(gj1Var)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public void o(kt1 kt1Var) {
        Object objB;
        Object obj;
        kt1Var.getClass();
        mt1 mt1Var = (mt1) this.b;
        do {
            objB = mt1Var.b();
            kt1 kt1Var2 = (kt1) objB;
            if (kt1Var2 instanceof jf1 ? true : Intrinsics.areEqual(kt1Var2, j22.b)) {
                obj = kt1Var2;
                obj = kt1Var;
            } else if (kt1Var2 instanceof dw) {
                if (kt1Var.a > kt1Var2.a) {
                    obj = kt1Var2;
                    obj = kt1Var;
                }
            } else if (!(kt1Var2 instanceof xb0)) {
                obj = kt1Var2;
                throw new e71();
            }
            obj = kt1Var2;
            obj = kt1Var2;
            vy2 vy2Var = kv.b;
            if (objB == null) {
                objB = vy2Var;
            }
            if (obj == null) {
                obj = vy2Var;
            }
        } while (!mt1Var.c(objB, obj));
    }

    public void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    public void p(int i, Object obj, zl1 zl1Var) {
        un unVar = (un) this.b;
        unVar.B(i, 3);
        zl1Var.c((d1) obj, unVar.a);
        unVar.B(i, 4);
    }

    @Override // defpackage.ak
    public void r(wj wjVar, Throwable th) {
        pk pkVar = (pk) this.b;
        pj1 pj1Var = rj1.b;
        pkVar.resumeWith(new qj1(th));
    }

    public void s(int i, Object obj, yn2 yn2Var) {
        tl2 tl2Var = (tl2) this.b;
        wk2 wk2Var = (wk2) obj;
        tl2Var.d(i, 2);
        tl2Var.r(wk2Var.c(yn2Var));
        yn2Var.a(wk2Var, this);
    }

    public Object then(Task task) {
        yi0 yi0Var = (yi0) this.b;
        if (task.isSuccessful()) {
            return yi0Var.t((String) task.getResult());
        }
        Exception exception = task.getException();
        gu2.o(exception);
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception.getMessage() + "\n\n Failing open with a fake token.");
        return yi0Var.t("NO_RECAPTCHA");
    }

    @Override // defpackage.vw
    public Object v() {
        nf1 nf1Var = (nf1) this.b;
        nf1Var.reset();
        return nf1Var;
    }

    @Override // defpackage.rs2
    public bt2 zza(Class cls) {
        for (rs2 rs2Var : (rs2[]) this.b) {
            if (rs2Var.zzb(cls)) {
                return rs2Var.zza(cls);
            }
        }
        sm0.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.rs2
    public boolean zzb(Class cls) {
        for (rs2 rs2Var : (rs2[]) this.b) {
            if (rs2Var.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ wa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public wa(tl2 tl2Var) {
        this.a = 24;
        this.b = tl2Var;
        tl2Var.a = this;
    }

    public wa(ArrayList arrayList) {
        this.a = 25;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public wa(InputStream inputStream, v01 v01Var) {
        this.a = 12;
        nf1 nf1Var = new nf1(inputStream, v01Var);
        this.b = nf1Var;
        nf1Var.mark(5242880);
    }

    public wa(int i) {
        this.a = i;
        switch (i) {
            case 1:
                int i2 = yk2.a;
                this.b = new gk1(new ln2[]{u41.d, e}, 23);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                this.b = new AtomicInteger(0);
                break;
            case 9:
                this.b = new mt1(j22.b);
                break;
            case 16:
                this.b = new HashMap();
                break;
            case 21:
                this.b = ByteBuffer.allocate(8);
                break;
            default:
                this.b = aw0.a(va.b);
                break;
        }
    }

    public /* synthetic */ wa(int i, boolean z) {
        this.a = i;
    }

    public wa(un unVar) {
        this.a = 7;
        dr0.a(unVar, "output");
        this.b = unVar;
        unVar.a = this;
    }

    public wa(Context context) {
        boolean zIsEmpty;
        this.a = 19;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e2.getMessage());
            }
        }
    }
}
