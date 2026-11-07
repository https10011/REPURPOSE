package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.fm.openinstall.Configuration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.appbar.AppBarLayout;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.attribution.ReferrerTask;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.Unit;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Reflection;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pv2 implements a41, s81, n31, yj, gd0, ak, ls, InstallReferrerStateListener, g31, na2, ph1, mn2, ba3 {
    public static volatile pv2 b;
    public static pv2 c;
    public static final Object d = new Object();
    public Object a;

    public pv2(Context context, int i) {
        boolean z = false;
        switch (i) {
            case 12:
                this.a = new gr0(z, context);
                break;
            default:
                ue2 ue2Var = ue2.j;
                if (((Configuration) ue2Var.d) == null) {
                    ue2Var.d = Configuration.getDefault();
                }
                if (!((Configuration) ue2Var.d).isStorageDisabled() && z32.a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    this.a = Build.VERSION.SDK_INT >= 29 ? new kg2(context, 0) : new kg2(context, 1);
                } else {
                    this.a = new gp1(10);
                }
                break;
        }
    }

    public static pv2 z(String str) {
        return new pv2((TextUtils.isEmpty(str) || str.length() > 1) ? l73.UNINITIALIZED : p73.e(str.charAt(0)));
    }

    @Override // defpackage.gd0
    public Object A(id0 id0Var, gs gsVar) {
        Object objA = ((vf3) this.a).A(new jx(id0Var, 0), gsVar);
        return objA == ft.a ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // defpackage.ba3
    public void a(int i, Throwable th, byte[] bArr) {
        c33 c33Var;
        c33 c33Var2;
        int i2 = i;
        y53 y53Var = (y53) this.a;
        c33 c33Var3 = y53Var.f;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                h43 h43Var = y53Var.e;
                y53.j(h43Var);
                h43Var.g0.b(true);
                if (bArr != null || bArr.length == 0) {
                    y53.l(c33Var3);
                    c33Var3.Z.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                    if (TextUtils.isEmpty(strOptString)) {
                        y53.l(c33Var3);
                        c33Var3.Z.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                    String strOptString3 = jSONObject.optString("gbraid", BuildConfig.FLAVOR);
                    String strOptString4 = jSONObject.optString("gad_source", BuildConfig.FLAVOR);
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    qf3 qf3Var = y53Var.w;
                    y53.j(qf3Var);
                    y53 y53Var2 = (y53) qf3Var.a;
                    if (TextUtils.isEmpty(strOptString)) {
                        c33Var2 = c33Var3;
                    } else {
                        Context context = y53Var2.a;
                        c33Var2 = c33Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                y53Var.Z.L("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = y53Var2.a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    c33 c33Var4 = ((y53) qf3Var.a).f;
                                    y53.l(c33Var4);
                                    c33Var4.f.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            c33Var = c33Var2;
                            y53.l(c33Var);
                            c33Var.f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    y53.l(c33Var2);
                    c33Var = c33Var2;
                    try {
                        c33Var.w.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        y53.l(c33Var);
                        c33Var.f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    c33Var = c33Var3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                h43 h43Var2 = y53Var.e;
                y53.j(h43Var2);
                h43Var2.g0.b(true);
                if (bArr != null) {
                }
                y53.l(c33Var3);
                c33Var3.Z.a("Deferred Deep Link response empty.");
                return;
            }
        }
        y53.l(c33Var3);
        c33Var3.w.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        qh2 qh2Var = (qh2) ((vh2) obj).l();
        TelemetryData telemetryData = (TelemetryData) this.a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(qh2Var.c);
        int i = yg2.a;
        if (telemetryData == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            telemetryData.writeToParcel(parcelObtain, 0);
        }
        try {
            qh2Var.b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            taskCompletionSource.setResult((Object) null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public String b(String str) {
        try {
            return ((SharedPreferences) ((FutureTask) this.a).get()).getString(str, BuildConfig.FLAVOR);
        } catch (InterruptedException | ExecutionException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    @Override // defpackage.g31
    public boolean c(i31 i31Var, MenuItem menuItem) {
        return false;
    }

    public void d(h01 h01Var) {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((FutureTask) this.a).get()).edit();
            editorEdit.putString("FM_pb_data", h01Var == null ? BuildConfig.FLAVOR : h01Var.d());
            editorEdit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.n31
    public void e(i31 i31Var, MenuItem menuItem) {
        ((al) this.a).f.removeCallbacksAndMessages(i31Var);
    }

    @Override // defpackage.a41
    public void f(i31 i31Var, boolean z) {
        if (i31Var instanceof tu1) {
            ((tu1) i31Var).z.k().c(false);
        }
        a41 a41Var = ((z3) this.a).e;
        if (a41Var != null) {
            a41Var.f(i31Var, z);
        }
    }

    @Override // defpackage.g31
    public void g(i31 i31Var) {
        Toolbar toolbar = (Toolbar) this.a;
        z3 z3Var = toolbar.a.j0;
        if (z3Var == null || !z3Var.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.w0.c).iterator();
            while (it.hasNext()) {
                ((dg0) ((c41) it.next())).a.s();
            }
        }
        gk1 gk1Var = toolbar.E0;
        if (gk1Var != null) {
            gk1Var.g(i31Var);
        }
    }

    @Override // defpackage.yj
    public Type h() {
        return (Type) this.a;
    }

    @Override // defpackage.ls
    public Object i(Object obj) {
        return Optional.ofNullable(((ls) this.a).i((ResponseBody) obj));
    }

    @Override // defpackage.n31
    public void j(i31 i31Var, o31 o31Var) {
        al alVar = (al) this.a;
        Handler handler = alVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = alVar.v;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (i31Var == ((zk) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new yk(0, this, i2 < arrayList.size() ? (zk) arrayList.get(i2) : null, o31Var, i31Var), i31Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.s81
    public u92 k(View view, u92 u92Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.a;
        u92 u92Var2 = appBarLayout.getFitsSystemWindows() ? u92Var : null;
        if (!Objects.equals(appBarLayout.i, u92Var2)) {
            appBarLayout.i = u92Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.m0 != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return u92Var;
    }

    @Override // defpackage.yj
    public Object l(l81 l81Var) {
        rp rpVar = new rp(l81Var);
        l81Var.w(new ri2(rpVar));
        return rpVar;
    }

    @Override // defpackage.na2
    public hh m(String str, int i, EnumMap enumMap) {
        if (i == 15) {
            return ((j40) this.a).m("0".concat(String.valueOf(str)), 8, enumMap);
        }
        e.g("Can only encode UPC-A, but got ".concat(ts.w(i)));
        return null;
    }

    @Override // defpackage.ak
    public void n(wj wjVar, gj1 gj1Var) {
        pk pkVar = (pk) this.a;
        if (!gj1Var.a.d0) {
            pj1 pj1Var = rj1.b;
            pkVar.resumeWith(new qj1(new xp(gj1Var)));
            return;
        }
        Object obj = gj1Var.b;
        if (obj != null) {
            pj1 pj1Var2 = rj1.b;
            pkVar.resumeWith(obj);
            return;
        }
        Request requestB = wjVar.b();
        requestB.getClass();
        ClassBasedDeclarationContainer orCreateKotlinClass = Reflection.getOrCreateKotlinClass(wr0.class);
        orCreateKotlinClass.getClass();
        Class jClass = orCreateKotlinClass.getJClass();
        jClass.getClass();
        Object objCast = jClass.cast(requestB.e.a(orCreateKotlinClass));
        objCast.getClass();
        pv0 pv0Var = new pv0("Response from " + wv1.class.getName() + JwtParser.SEPARATOR_CHAR + ((wr0) objCast).b.getName() + " was null but response body type was declared as non-null");
        pj1 pj1Var3 = rj1.b;
        pkVar.resumeWith(new qj1(pv0Var));
    }

    public void o(lf2 lf2Var) {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((FutureTask) this.a).get()).edit();
            editorEdit.putString("FM_config_data", lf2Var.d());
            editorEdit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public void onInstallReferrerServiceDisconnected() {
        InstallReferrerClient installReferrerClient = ((ReferrerTask) this.a).c;
        if (installReferrerClient != null) {
            installReferrerClient.endConnection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public void onInstallReferrerSetupFinished(int i) {
        InstallReferrerClient installReferrerClient;
        ReferrerTask referrerTask = (ReferrerTask) this.a;
        try {
            if (i == 0) {
                dw0.c("InstallReferrerResponse.OK");
                ReferrerTask.a(referrerTask, referrerTask.c.getInstallReferrer());
                referrerTask.d();
            } else {
                if (i != 1) {
                    if (i == 2) {
                        dw0.c("InstallReferrerResponse.FEATURE_NOT_SUPPORTED");
                    }
                    installReferrerClient = referrerTask.c;
                    if (installReferrerClient != null) {
                        installReferrerClient.endConnection();
                    }
                }
                dw0.c("InstallReferrerResponse.SERVICE_UNAVAILABLE");
            }
            installReferrerClient = referrerTask.c;
            if (installReferrerClient != null) {
                installReferrerClient.endConnection();
            }
        } catch (Exception e) {
            dw0.v(e);
        } finally {
            InstallReferrerClient installReferrerClient2 = referrerTask.c;
            if (installReferrerClient2 != null) {
                installReferrerClient2.endConnection();
            }
        }
    }

    public void p(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((FutureTask) this.a).get()).edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public jf2 q(String str) {
        try {
            int i = ((SharedPreferences) ((FutureTask) this.a).get()).getInt(str, 1);
            if (i == -2) {
                return jf2.i;
            }
            if (i == -1) {
                return jf2.e;
            }
            if (i != 0) {
                return i != 2 ? jf2.c : jf2.d;
            }
            return jf2.f;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.ak
    public void r(wj wjVar, Throwable th) {
        pk pkVar = (pk) this.a;
        pj1 pj1Var = rj1.b;
        pkVar.resumeWith(new qj1(th));
    }

    @Override // defpackage.mn2
    public /* synthetic */ void s(an2 an2Var) {
        ((mn2) this.a).s((zzahd) an2Var);
    }

    public void t() {
        ((wf0) this.a).a0.N();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void v(kg1 kg1Var, u61 u61Var, u61 u61Var2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.a;
        kg1Var.n(false);
        mz mzVar = (mz) recyclerView.y0;
        if (u61Var != null) {
            mzVar.getClass();
            int i = u61Var.a;
            int i2 = u61Var2.a;
            if (i == i2 && u61Var.b == u61Var2.b) {
                mzVar.l(kg1Var);
                kg1Var.a.setAlpha(0.0f);
                mzVar.i.add(kg1Var);
                zG = true;
            } else {
                zG = mzVar.g(kg1Var, i, u61Var.b, i2, u61Var2.b);
            }
        } else {
            mzVar.l(kg1Var);
            kg1Var.a.setAlpha(0.0f);
            mzVar.i.add(kg1Var);
            zG = true;
        }
        if (zG) {
            recyclerView.S();
        }
    }

    public void w(kg1 kg1Var, u61 u61Var, u61 u61Var2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.b.k(kg1Var);
        recyclerView.f(kg1Var);
        kg1Var.n(false);
        mz mzVar = (mz) recyclerView.y0;
        mzVar.getClass();
        int i = u61Var.a;
        int i2 = u61Var.b;
        View view = kg1Var.a;
        int left = u61Var2 == null ? view.getLeft() : u61Var2.a;
        int top = u61Var2 == null ? view.getTop() : u61Var2.b;
        if (kg1Var.h() || (i == left && i2 == top)) {
            mzVar.l(kg1Var);
            mzVar.h.add(kg1Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = mzVar.g(kg1Var, i, i2, left, top);
        }
        if (zG) {
            recyclerView.S();
        }
    }

    public void x(int i, Object obj, ct2 ct2Var) {
        yq2 yq2Var = (yq2) obj;
        tr2 tr2Var = (tr2) this.a;
        tr2Var.p(i, 2);
        tr2Var.o(yq2Var.a(ct2Var));
        ct2Var.d(yq2Var, this);
    }

    @Override // defpackage.a41
    public boolean y(i31 i31Var) {
        z3 z3Var = (z3) this.a;
        if (i31Var == z3Var.c) {
            return false;
        }
        ((tu1) i31Var).A.getClass();
        a41 a41Var = z3Var.e;
        if (a41Var != null) {
            return a41Var.y(i31Var);
        }
        return false;
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((mn2) this.a).zza(str);
    }

    public /* synthetic */ pv2(Object obj) {
        this.a = obj;
    }

    public pv2(int i) {
        switch (i) {
            case 9:
                this.a = new ArrayList();
                break;
            case 14:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 15:
                this.a = new b51(500L);
                break;
            case 21:
                this.a = new j40(0);
                break;
            default:
                this.a = new CopyOnWriteArrayList();
                break;
        }
    }
}
