package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.security.SignatureException;
import java.io.File;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class sm0 implements ca0, yg0, zk1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sm0(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void b(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(Object obj, int i, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void d(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void i(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void n(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void o(int i, String str) throws InvalidObjectException {
        throw new InvalidObjectException(str + i + JwtParser.SEPARATOR_CHAR);
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(String str, Object obj, Throwable th) {
        throw new SignatureException(str + obj, th);
    }

    public static /* synthetic */ void s(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* synthetic */ void t(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void v(Object obj, Object obj2, String str) {
        throw new xp(str + obj + obj2, 1);
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.yg0
    public Object apply(Object obj) {
        switch (this.a) {
            case 16:
                return Boolean.valueOf(((String) obj).length() > 0);
            case 17:
                return Boolean.valueOf(((String) obj).length() > 0);
            default:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    Cursor cursor = cursorRawQuery;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        ac2 ac2VarA = ge.a();
                        ac2VarA.O(cursor.getString(1));
                        ac2VarA.c = xc1.b(cursor.getInt(2));
                        String string = cursor.getString(3);
                        ac2VarA.b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(ac2VarA.r());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
        }
    }

    @Override // defpackage.ca0
    public void f(boolean z) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        int i = 2;
        int i2 = 1;
        switch (this.a) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (z) {
                    synchronized (lt.b) {
                        try {
                            i90 i90Var = i90.a;
                            if (x32.c()) {
                                k42.l();
                            }
                            if (lt.c != null) {
                                Log.w("lt", "Already enabled!");
                            } else {
                                lt ltVar = new lt(Thread.getDefaultUncaughtExceptionHandler());
                                lt.c = ltVar;
                                Thread.setDefaultUncaughtExceptionHandler(ltVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (fa0.b(da0.CrashShield)) {
                        xi0.d = true;
                        if (x32.c() && !h42.v()) {
                            File fileM = zi0.m();
                            if (fileM == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileM.listFiles(new l70(3));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                uq0 uq0VarN = yi0.n(file);
                                if (uq0VarN.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", uq0VarN.toString());
                                        String str = mk0.j;
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        arrayList.add(vl0.p(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{i90.b()}, 1)), jSONObject, new a2(uq0VarN, i)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                ok0 ok0Var = new ok0(arrayList);
                                String str2 = mk0.j;
                                dw0.s(ok0Var);
                                new nk0(ok0Var).executeOnExecutor(i90.c(), new Void[0]);
                            }
                        }
                        mt.b = true;
                    }
                    fa0.b(da0.ThreadCheck);
                    return;
                }
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (z) {
                    i90 i90Var2 = i90.a;
                    if (!x32.c() || h42.v()) {
                        return;
                    }
                    File fileM2 = zi0.m();
                    if (fileM2 == null) {
                        fileArrListFiles2 = new File[0];
                    } else {
                        fileArrListFiles2 = fileM2.listFiles(new l70(0));
                        fileArrListFiles2.getClass();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        file2.getClass();
                        k70 k70Var = new k70();
                        String name = file2.getName();
                        name.getClass();
                        k70Var.a = name;
                        JSONObject jSONObjectU = zi0.u(name);
                        if (jSONObjectU != null) {
                            k70Var.c = Long.valueOf(jSONObjectU.optLong("timestamp", 0L));
                            k70Var.b = jSONObjectU.optString("error_message", null);
                        }
                        if (k70Var.b != null && k70Var.c != null) {
                            arrayList2.add(k70Var);
                        }
                    }
                    i iVar = new i(i);
                    if (arrayList2.size() > 1) {
                        Collections.sort(arrayList2, iVar);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < arrayList2.size() && i3 < 1000; i3++) {
                        jSONArray.put(arrayList2.get(i3));
                    }
                    zi0.w("error_reports", jSONArray, new a2(arrayList2, i2));
                    return;
                }
                return;
            default:
                if (z) {
                    AtomicBoolean atomicBoolean = k.a;
                    synchronized (k.class) {
                        try {
                            Set set = mt.a;
                            if (set.contains(k.class)) {
                                return;
                            }
                            try {
                                if (k.a.getAndSet(true)) {
                                    return;
                                }
                                i90 i90Var3 = i90.a;
                                if (x32.c()) {
                                    k.a();
                                }
                                int i4 = h.a;
                                if (!set.contains(h.class)) {
                                    try {
                                        h.b.scheduleWithFixedDelay(h.d, 0L, 500L, TimeUnit.MILLISECONDS);
                                    } catch (Throwable th2) {
                                        mt.a(h.class, th2);
                                    }
                                }
                                break;
                            } catch (Throwable th3) {
                                mt.a(k.class, th3);
                            }
                            return;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }
}
