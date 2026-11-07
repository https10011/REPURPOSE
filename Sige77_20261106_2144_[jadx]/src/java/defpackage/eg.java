package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.hjq.toast.BuildConfig;
import com.linecorp.linesdk.LineApiError;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class eg implements OnCompleteListener, nq, OnFailureListener, qk, gx0, h5, ua0, Continuation, zk1, tv1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tv1
    public Object a() {
        int i = this.a;
        Object obj = this.c;
        ue2 ue2Var = (ue2) this.b;
        switch (i) {
            case 14:
                Iterable iterable = (Iterable) obj;
                bl1 bl1Var = (bl1) ue2Var.c;
                bl1Var.getClass();
                if (iterable.iterator().hasNext()) {
                    bl1Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(bl1.m(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((bl1) ue2Var.i).j(((Integer) entry.getValue()).intValue(), a01.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.zk1
    public Object apply(Object obj) {
        bl1 bl1Var = (bl1) this.b;
        ge geVar = (ge) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        pd pdVar = bl1Var.d;
        ArrayList arrayListI = bl1Var.i(sQLiteDatabase, geVar, pdVar.b);
        for (uc1 uc1Var : uc1.values()) {
            if (uc1Var != geVar.c) {
                int size = pdVar.b - arrayListI.size();
                if (size <= 0) {
                    break;
                }
                ac2 ac2VarA = ge.a();
                ac2VarA.O(geVar.a);
                if (uc1Var == null) {
                    uq1.h("Null priority");
                    return null;
                }
                ac2VarA.c = uc1Var;
                ac2VarA.b = geVar.b;
                arrayListI.addAll(bl1Var.i(sQLiteDatabase, ac2VarA.r(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListI.size(); i++) {
            sb.append(((yd) arrayListI.get(i)).a);
            if (i < arrayListI.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new al1(cursor.getString(1), cursor.getString(2)));
            }
            cursorQuery.close();
            ListIterator listIterator = arrayListI.listIterator();
            while (listIterator.hasNext()) {
                yd ydVar = (yd) listIterator.next();
                long j2 = ydVar.a;
                if (map.containsKey(Long.valueOf(j2))) {
                    qp0 qp0VarC = ydVar.c.c();
                    for (al1 al1Var : (Set) map.get(Long.valueOf(j2))) {
                        qp0VarC.a(al1Var.a, al1Var.b);
                    }
                    listIterator.set(new yd(j2, ydVar.b, qp0VarC.c()));
                }
            }
            return arrayListI;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // defpackage.h5
    public void b(Object obj) {
        ck ckVar;
        md2 md2Var = (md2) this.b;
        ri2 ri2Var = (ri2) this.c;
        Pair pair = (Pair) obj;
        dk dkVar = (dk) md2Var.b;
        int iA = ts.a(1);
        Object obj2 = pair.first;
        obj2.getClass();
        int iIntValue = ((Number) obj2).intValue();
        Intent intent = (Intent) pair.second;
        ck ckVar2 = (ck) dkVar.a.get(Integer.valueOf(iA));
        if (ckVar2 != null) {
            ckVar2.a(intent, iIntValue);
        } else {
            synchronized (dk.b) {
                ckVar = (ck) dk.c.get(Integer.valueOf(iA));
            }
            if (ckVar != null) {
                ckVar.a(intent, iIntValue);
            }
        }
        m5 m5Var = (m5) ri2Var.a;
        if (m5Var != null) {
            m5Var.b();
        }
        ri2Var.a = null;
    }

    @Override // defpackage.gx0
    public ix0 c(er0 er0Var) {
        String string;
        ix0 ix0VarA;
        hx0 hx0Var = (hx0) this.b;
        nx0 nx0Var = (nx0) this.c;
        jw1 jw1Var = hx0Var.c;
        Uri uriI = g93.i(jw1Var.a, "openchat/v1", "openchats");
        vl vlVar = jw1Var.b;
        LinkedHashMap linkedHashMapA = jw1.a(er0Var);
        nx0Var.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (String) nx0Var.a);
            jSONObject.put("description", (String) nx0Var.c);
            jSONObject.put("creatorDisplayName", (String) nx0Var.d);
            jSONObject.put("category", ((h91) nx0Var.e).a);
            jSONObject.put("allowSearch", nx0Var.b);
            string = jSONObject.toString();
            string.getClass();
        } catch (JSONException unused) {
            string = "{}";
        }
        ks0 ks0Var = jw1.e;
        vlVar.getClass();
        byte[] bytes = string.getBytes();
        HttpURLConnection httpURLConnectionD = null;
        try {
            try {
                httpURLConnectionD = vlVar.d(uriI, bytes.length);
                vl.i(httpURLConnectionD, linkedHashMapA);
                httpURLConnectionD.connect();
                OutputStream outputStream = httpURLConnectionD.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                ix0VarA = vl.b(httpURLConnectionD, ks0Var, (r41) vlVar.d);
            } catch (IOException e) {
                ix0VarA = ix0.a(jx0.c, new LineApiError(e));
                if (httpURLConnectionD != null) {
                }
                return ix0VarA;
            }
            httpURLConnectionD.disconnect();
            return ix0VarA;
        } catch (Throwable th) {
            if (httpURLConnectionD != null) {
                httpURLConnectionD.disconnect();
            }
            throw th;
        }
    }

    @Override // defpackage.nq
    public Object d(co coVar) {
        int i = this.a;
        Object obj = this.c;
        String str = (String) this.b;
        switch (i) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                aq aqVar = (aq) obj;
                try {
                    Trace.beginSection(str);
                    return aqVar.f.d(coVar);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) coVar.a(Context.class);
                int i2 = ((ur) obj).a;
                String strValueOf = BuildConfig.FLAVOR;
                switch (i2) {
                    case 18:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 19:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 20:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new td(str, strValueOf);
        }
    }

    @Override // defpackage.ua0
    public void e(File file) {
        i51 i51Var = (i51) this.b;
        a51 a51Var = (a51) this.c;
        file.getClass();
        i51Var.g = a51Var;
        i51Var.f = file;
        Runnable runnable = i51Var.h;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    public void f() {
        boolean z;
        boolean zA;
        ja0 ja0Var = (ja0) this.b;
        String str = (String) this.c;
        Set set = mt.a;
        if (set.contains(zn.class)) {
            return;
        }
        int i = 0;
        if (ja0Var != null) {
            try {
                if (ja0Var.g) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                mt.a(zn.class, th);
            }
        } else {
            z = false;
        }
        i90 i90Var = i90.a;
        x32 x32Var = x32.a;
        if (set.contains(x32.class)) {
            zA = false;
        } else {
            try {
                x32.a.e();
                zA = x32.g.a();
            } catch (Throwable th2) {
                mt.a(x32.class, th2);
                zA = false;
            }
        }
        if (z && zA) {
            zn znVar = zn.a;
            if (mt.a.contains(znVar)) {
                return;
            }
            try {
                if (zn.h) {
                    return;
                }
                zn.h = true;
                i90.c().execute(new yn(str, i));
                return;
            } catch (Throwable th3) {
                mt.a(znVar, th3);
                return;
            }
            mt.a(zn.class, th);
        }
    }

    @Override // defpackage.qk
    public void onCancel() {
        Animator animator = (Animator) this.b;
        ms1 ms1Var = (ms1) this.c;
        animator.end();
        if (e.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + ms1Var + " has been canceled.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Activity, yg] */
    public void onComplete(Task task) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ?? r2 = (yg) obj2;
                FirebaseAuth firebaseAuth = (FirebaseAuth) obj;
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                if (!task.isSuccessful()) {
                    task.getException();
                    r2.w("Failure: " + task.getException());
                } else {
                    FirebaseUser firebaseUser = firebaseAuth.f;
                    if (firebaseUser != null) {
                        Task taskB = FirebaseAuth.getInstance(firebaseUser.W()).b(firebaseUser);
                        taskB.addOnCompleteListener((Activity) r2, new ag(r2, taskB, 2));
                    } else {
                        r2.w("Failure: Facebook Sign-In user null");
                    }
                }
                break;
            case 1:
                yg ygVar = (yg) obj2;
                String str = (String) obj;
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                if (!task.isSuccessful()) {
                    task.getException();
                    ygVar.v(String.format("Failure: %s", task.getException()), str);
                } else {
                    ygVar.v((String) task.getResult(), str);
                }
                break;
            default:
                ((z60) obj2).a((Intent) obj);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    public void onFailure(Exception exc) {
        zh0 zh0Var;
        hu huVar = (hu) this.b;
        CancellationSignal cancellationSignal = (CancellationSignal) this.c;
        exc.getClass();
        String str = ((exc instanceof i7) && ku.b.contains(Integer.valueOf(((i7) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        String str2 = "During begin sign in, failure response from one tap: " + exc.getMessage();
        int iHashCode = str.hashCode();
        int i = 0;
        if (iHashCode != -1567968963) {
            if (iHashCode != -154594663) {
                if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                    zh0Var = new zh0(str2, 6);
                } else {
                    zh0Var = new zh0(str2, 4);
                }
            } else if (str.equals("GET_INTERRUPTED")) {
                zh0Var = new zh0(str2, 2);
            } else {
                zh0Var = new zh0(str2, 4);
            }
        } else if (str.equals("GET_CANCELED_TAG")) {
            zh0Var = new zh0(str2, 0);
        } else {
            zh0Var = new zh0(str2, 4);
        }
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (vu.a(cancellationSignal)) {
            return;
        }
        huVar.e().execute(new gu(huVar, zh0Var, i));
        Unit unit = Unit.a;
    }

    public Object then(Task task) {
        rd2 rd2Var = (rd2) this.b;
        String str = (String) this.c;
        synchronized (rd2Var) {
            ((mb) rd2Var.c).remove(str);
        }
        return task;
    }
}
