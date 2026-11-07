package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.AccessToken;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.hjq.toast.BuildConfig;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class co implements m90, kq, nq {
    public static co X;
    public static co i;
    public static co w;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public static final mo1 f = new mo1(4);
    public static final xn v = new xn(3);
    public static final Object W = new Object();

    public co(int i2) {
        switch (i2) {
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a = new LinkedList();
                this.b = new LinkedList();
                this.c = new cg2();
                this.d = new HashMap();
                HashMap map = new HashMap();
                this.e = map;
                map.put(Object.class, new jb2(1));
                map.put(Collection.class, new jb2(10));
                map.put(List.class, new jb2(10));
                map.put(Set.class, new jb2(13));
                map.put(Map.class, new jb2(12));
                map.put(Integer.class, new jb2(8));
                map.put(Integer.TYPE, new jb2(8));
                map.put(Float.class, new jb2(7));
                map.put(Float.TYPE, new jb2(7));
                map.put(Double.class, new jb2(5));
                map.put(Double.TYPE, new jb2(5));
                map.put(Long.class, new jb2(11));
                map.put(Long.TYPE, new jb2(11));
                map.put(Byte.class, new jb2(3));
                map.put(Byte.TYPE, new jb2(3));
                map.put(Boolean.class, new jb2(2));
                map.put(Boolean.TYPE, new jb2(2));
                map.put(Character.class, new jb2(4));
                map.put(Character.TYPE, new jb2(4));
                map.put(Enum.class, new jb2(6));
                map.put(String.class, new jb2(14));
                map.put(Array.class, new jb2(0));
                map.put(wf2.class, new jb2(9));
                break;
            default:
                this.a = new Handler(Looper.getMainLooper());
                Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                setNewSetFromMap.getClass();
                this.b = setNewSetFromMap;
                this.c = new LinkedHashSet();
                this.d = new HashSet();
                this.e = new HashMap();
                break;
        }
    }

    public static co t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        co coVar = new co();
        coVar.d = new ArrayDeque();
        coVar.a = sharedPreferences;
        coVar.b = "topic_operation_queue";
        coVar.c = ",";
        coVar.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) coVar.d)) {
            try {
                ((ArrayDeque) coVar.d).clear();
                String string = ((SharedPreferences) coVar.a).getString((String) coVar.b, BuildConfig.FLAVOR);
                if (!TextUtils.isEmpty(string) && string.contains((String) coVar.c)) {
                    String[] strArrSplit = string.split((String) coVar.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) coVar.d).add(str);
                        }
                    }
                    return coVar;
                }
                return coVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static co x(Context context) {
        co coVar;
        synchronized (W) {
            try {
                if (X == null) {
                    X = new co(context.getApplicationContext());
                }
                coVar = X;
            } catch (Throwable th) {
                throw th;
            }
        }
        return coVar;
    }

    public s5 A(int i2, int i3, int i4) {
        s5 s5Var = (s5) ((zb1) this.a).h();
        if (s5Var != null) {
            s5Var.a = i2;
            s5Var.b = i3;
            s5Var.c = i4;
            return s5Var;
        }
        s5 s5Var2 = new s5();
        s5Var2.a = i2;
        s5Var2.b = i3;
        s5Var2.c = i4;
        return s5Var2;
    }

    public void B(s5 s5Var) {
        gk1 gk1Var = (gk1) this.d;
        ((ArrayList) this.c).add(s5Var);
        int i2 = s5Var.a;
        if (i2 == 1) {
            gk1Var.t(s5Var.b, s5Var.c);
            return;
        }
        if (i2 == 2) {
            int i3 = s5Var.b;
            int i4 = s5Var.c;
            RecyclerView recyclerView = (RecyclerView) gk1Var.b;
            recyclerView.O(i3, i4, false);
            recyclerView.T0 = true;
            return;
        }
        if (i2 == 4) {
            gk1Var.s(s5Var.b, s5Var.c);
        } else if (i2 == 8) {
            gk1Var.u(s5Var.b, s5Var.c);
        } else {
            ur.g(s5Var, "Unknown update op type for ");
        }
    }

    public void C(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s5 s5Var = (s5) arrayList.get(i2);
            s5Var.getClass();
            ((zb1) this.a).b(s5Var);
        }
        arrayList.clear();
    }

    public void D() {
        AccessToken accessToken = (AccessToken) this.c;
        if (accessToken == null) {
            return;
        }
        String str = accessToken.X;
        final int i2 = 0;
        final int i3 = 1;
        if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
            this.e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            e2 e2Var = new e2();
            final z1 z1Var = new z1(0, atomicBoolean, hashSet, hashSet2, hashSet3);
            final a2 a2Var = new a2(e2Var, i2);
            final b2 b2Var = new b2(e2Var, accessToken, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            String str2 = mk0.j;
            mk0 mk0VarO = vl0.o(accessToken, "me/permissions", z1Var);
            mk0VarO.d = bundle;
            nm0 nm0Var = nm0.a;
            mk0VarO.h = nm0Var;
            int i4 = 3;
            f2 op0Var = Intrinsics.areEqual(str == null ? "facebook" : str, "instagram") ? new op0(i4) : new ba0(i4);
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", op0Var.l());
            bundle2.putString("client_id", accessToken.v);
            bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            mk0 mk0VarO2 = vl0.o(accessToken, op0Var.f(), a2Var);
            mk0VarO2.d = bundle2;
            mk0VarO2.h = nm0Var;
            if (Intrinsics.areEqual(str, "gaming")) {
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                ik0 ik0Var = new ik0() { // from class: c2
                    @Override // defpackage.ik0
                    public final void a(pk0 pk0Var) {
                        int i5 = i2;
                        b2 b2Var2 = b2Var;
                        AtomicInteger atomicInteger2 = atomicInteger;
                        ik0 ik0Var2 = z1Var;
                        switch (i5) {
                            case 0:
                                pk0Var.getClass();
                                ((z1) ik0Var2).a(pk0Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    b2Var2.run();
                                }
                                break;
                            default:
                                pk0Var.getClass();
                                ((a2) ik0Var2).a(pk0Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    b2Var2.run();
                                }
                                break;
                        }
                    }
                };
                ik0 ik0Var2 = new ik0() { // from class: c2
                    @Override // defpackage.ik0
                    public final void a(pk0 pk0Var) {
                        int i5 = i3;
                        b2 b2Var2 = b2Var;
                        AtomicInteger atomicInteger2 = atomicInteger;
                        ik0 ik0Var3 = a2Var;
                        switch (i5) {
                            case 0:
                                pk0Var.getClass();
                                ((z1) ik0Var3).a(pk0Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    b2Var2.run();
                                }
                                break;
                            default:
                                pk0Var.getClass();
                                ((a2) ik0Var3).a(pk0Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    b2Var2.run();
                                }
                                break;
                        }
                    }
                };
                mk0VarO.j(ik0Var);
                mk0VarO2.j(ik0Var2);
                mk0VarO.d();
                mk0VarO2.d();
                return;
            }
            ok0 ok0Var = new ok0(mk0VarO, mk0VarO2);
            d2 d2Var = new d2(b2Var);
            ArrayList arrayList = ok0Var.d;
            if (!arrayList.contains(d2Var)) {
                arrayList.add(d2Var);
            }
            dw0.s(ok0Var);
            new nk0(ok0Var).executeOnExecutor(i90.c(), new Void[0]);
        }
    }

    public void E(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (((HashMap) this.e)) {
            try {
                oz0 oz0Var = new oz0(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) ((HashMap) this.e).get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    ((HashMap) this.e).put(broadcastReceiver, arrayList);
                }
                arrayList.add(oz0Var);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) ((HashMap) this.b).get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        ((HashMap) this.b).put(action, arrayList2);
                    }
                    arrayList2.add(oz0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void F(Activity activity) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new d90("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            ((Set) this.b).remove(activity);
            ((LinkedHashSet) this.c).clear();
            HashMap map = (HashMap) this.e;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = ((HashSet) this.d).clone();
            objClone.getClass();
            map.put(numValueOf, (HashSet) objClone);
            ((HashSet) this.d).clear();
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public boolean G(Intent intent) {
        String str;
        synchronized (((HashMap) this.e)) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.a).getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.b).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        oz0 oz0Var = (oz0) arrayList.get(i2);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + oz0Var.a);
                        }
                        if (oz0Var.c) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = oz0Var.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(oz0Var);
                                oz0Var.c = true;
                            } else {
                                arrayList = arrayList;
                                if (z) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i2++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((oz0) arrayList2.get(i3)).c = false;
                        }
                        ((ArrayList) this.c).add(new rc2(5, intent, arrayList2));
                        if (!((c6) this.d).hasMessages(1)) {
                            ((c6) this.d).sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void H(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(i90.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", (Parcelable) accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", (Parcelable) accessToken2);
        ((co) this.a).G(intent);
    }

    public void I(AccessToken accessToken, boolean z) {
        boolean zAreEqual;
        AccessToken accessToken2 = (AccessToken) this.c;
        String str = accessToken2 != null ? accessToken2.w : null;
        String str2 = accessToken != null ? accessToken.w : null;
        if (str != null && !Intrinsics.areEqual(str, str2)) {
            da.d(6);
        }
        this.c = accessToken;
        ((AtomicBoolean) this.d).set(false);
        this.e = new Date(0L);
        if (z) {
            SharedPreferences sharedPreferences = ((x1) this.b).a;
            if (accessToken != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                h42.c(i90.a());
            }
        }
        if (accessToken2 == null) {
            zAreEqual = accessToken == null;
        } else {
            zAreEqual = Intrinsics.areEqual(accessToken2, accessToken);
        }
        if (zAreEqual) {
            return;
        }
        H(accessToken2, accessToken);
        Context contextA = i90.a();
        Date date = AccessToken.Y;
        AccessToken accessTokenT = aj0.t();
        AlarmManager alarmManager = (AlarmManager) contextA.getSystemService("alarm");
        if (aj0.v()) {
            if ((accessTokenT != null ? accessTokenT.a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextA, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessTokenT.a.getTime(), PendingIntent.getBroadcast(contextA, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }

    public void J(BroadcastReceiver broadcastReceiver) {
        synchronized (((HashMap) this.e)) {
            try {
                ArrayList arrayList = (ArrayList) ((HashMap) this.e).remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    oz0 oz0Var = (oz0) arrayList.get(size);
                    oz0Var.d = true;
                    for (int i2 = 0; i2 < oz0Var.a.countActions(); i2++) {
                        String action = oz0Var.a.getAction(i2);
                        ArrayList arrayList2 = (ArrayList) ((HashMap) this.b).get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                oz0 oz0Var2 = (oz0) arrayList2.get(size2);
                                if (oz0Var2.b == broadcastReceiver) {
                                    oz0Var2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                ((HashMap) this.b).remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int K(int i2, int i3) {
        int i4;
        int i5;
        zb1 zb1Var = (zb1) this.a;
        ArrayList arrayList = (ArrayList) this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s5 s5Var = (s5) arrayList.get(size);
            int i6 = s5Var.a;
            int i7 = s5Var.b;
            if (i6 == 8) {
                int i8 = s5Var.c;
                if (i7 < i8) {
                    i5 = i8;
                    i4 = i7;
                } else {
                    i4 = i8;
                    i5 = i7;
                }
                if (i2 < i4 || i2 > i5) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            s5Var.b = i7 + 1;
                            s5Var.c = i8 + 1;
                        } else if (i3 == 2) {
                            s5Var.b = i7 - 1;
                            s5Var.c = i8 - 1;
                        }
                    }
                } else if (i4 == i7) {
                    if (i3 == 1) {
                        s5Var.c = i8 + 1;
                    } else if (i3 == 2) {
                        s5Var.c = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        s5Var.b = i7 + 1;
                    } else if (i3 == 2) {
                        s5Var.b = i7 - 1;
                    }
                    i2--;
                }
            } else if (i7 <= i2) {
                if (i6 == 1) {
                    i2 -= s5Var.c;
                } else if (i6 == 2) {
                    i2 += s5Var.c;
                }
            } else if (i3 == 1) {
                s5Var.b = i7 + 1;
            } else if (i3 == 2) {
                s5Var.b = i7 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            s5 s5Var2 = (s5) arrayList.get(size2);
            int i9 = s5Var2.a;
            int i10 = s5Var2.c;
            if (i9 == 8) {
                if (i10 == s5Var2.b || i10 < 0) {
                    arrayList.remove(size2);
                    zb1Var.b(s5Var2);
                }
            } else if (i10 <= 0) {
                arrayList.remove(size2);
                zb1Var.b(s5Var2);
            }
        }
        return i2;
    }

    @Override // defpackage.kq
    public Object a(Class cls) {
        if (!((Set) this.b).contains(je1.a(cls))) {
            sm0.v(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objA = ((kq) this.e).a(cls);
        if (!cls.equals(de1.class)) {
            return objA;
        }
        return new kj1();
    }

    @Override // defpackage.kq
    public zd1 b(je1 je1Var) {
        if (((Set) this.d).contains(je1Var)) {
            return ((kq) this.e).b(je1Var);
        }
        sm0.v(je1Var, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // defpackage.kq
    public Set c(je1 je1Var) {
        if (((Set) this.c).contains(je1Var)) {
            return ((kq) this.e).c(je1Var);
        }
        sm0.v(je1Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // defpackage.nq
    public Object d(co coVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((je1) this.a, (je1) this.b, (je1) this.c, (je1) this.d, (je1) this.e, coVar);
    }

    @Override // defpackage.kq
    public zd1 e(Class cls) {
        return f(je1.a(cls));
    }

    @Override // defpackage.kq
    public zd1 f(je1 je1Var) {
        if (((Set) this.a).contains(je1Var)) {
            return ((kq) this.e).f(je1Var);
        }
        sm0.v(je1Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // defpackage.kq
    public Object g(je1 je1Var) {
        if (((Set) this.b).contains(je1Var)) {
            return ((kq) this.e).g(je1Var);
        }
        sm0.v(je1Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.yd1
    public Object get() {
        return new tz((Executor) ((yd1) this.a).get(), (q41) ((yd1) this.b).get(), (ac2) ((p11) this.c).get(), (bl1) ((yd1) this.d).get(), (bl1) ((yd1) this.e).get());
    }

    public jb2 h(Class cls) {
        jb2 jb2Var = (jb2) ((HashMap) this.e).get(cls);
        if (jb2Var != null || cls == null) {
            return jb2Var;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            jb2 jb2VarH = h(cls2);
            if (jb2VarH != null) {
                return jb2VarH;
            }
        }
        if (cls.getSuperclass() != null) {
            return h(cls.getSuperclass());
        }
        return null;
    }

    public Class i(Type type) {
        if (type == null) {
            return null;
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.class;
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable)) {
            return null;
        }
        throw new xp(((cg2) this.c) + ":  Unknown type " + type, 7);
    }

    public Object j(Object obj, Type type) {
        cg2 cg2Var = (cg2) this.c;
        LinkedList linkedList = (LinkedList) this.b;
        linkedList.add(obj);
        if (obj == null) {
            linkedList.removeLast();
            return null;
        }
        try {
            Class clsQ = q(obj, i(type));
            jb2 jb2VarH = (jb2) ((HashMap) this.d).get(cg2Var);
            if (jb2VarH == null) {
                jb2VarH = (clsQ == null || !clsQ.isArray()) ? h(clsQ) : (jb2) ((HashMap) this.e).get(Array.class);
            }
            if (jb2VarH != null) {
                Object objA = jb2VarH.a(this, obj, type, clsQ);
                linkedList.removeLast();
                return objA;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cg2Var);
            sb.append(": + Could not find a suitable ObjectFactory for ");
            sb.append(clsQ);
            throw new xp(sb.toString(), 7);
        } catch (Throwable th) {
            linkedList.removeLast();
            throw th;
        }
    }

    public Object k(Map map, Object obj, Type type) {
        LinkedList linkedList = (LinkedList) this.a;
        cg2 cg2Var = (cg2) this.c;
        try {
            linkedList.add(obj);
            xd2 xd2VarA = xd2.a(obj.getClass());
            for (qe2 qe2Var : xd2VarA != null ? xd2VarA.b() : null) {
                String str = qe2Var.b;
                Field field = qe2Var.e;
                if (!map.containsKey(str)) {
                    String str2 = qe2Var.b;
                    if (!map.containsKey(Character.toUpperCase(str2.charAt(0)) + str2.substring(1))) {
                        continue;
                    }
                }
                Object obj2 = map.get(qe2Var.b);
                if (obj2 == null) {
                    String str3 = qe2Var.b;
                    obj2 = map.get(Character.toUpperCase(str3.charAt(0)) + str3.substring(1));
                }
                if (qe2Var.d() != null || (field != null && Modifier.isPublic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()))) {
                    cg2Var.a.add(qe2Var.a);
                    Method methodD = qe2Var.d();
                    if (methodD != null) {
                        Type[] genericParameterTypes = methodD.getGenericParameterTypes();
                        if (genericParameterTypes.length != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(cg2Var);
                            sb.append(":  Expected a single parameter for method ");
                            sb.append(obj.getClass().getName());
                            sb.append(".");
                            sb.append(methodD.getName());
                            sb.append(" but got ");
                            sb.append(genericParameterTypes.length);
                            throw new xp(sb.toString(), 7);
                        }
                        methodD.invoke(linkedList.getLast(), j(obj2, l(genericParameterTypes[0], type)));
                    } else if (field != null) {
                        field.setAccessible(true);
                        field.set(obj, j(obj2, field.getGenericType()));
                    }
                    cg2Var.a();
                }
            }
            return linkedList.removeLast();
        } catch (IllegalAccessException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cg2Var);
            String name = obj.getClass().getName();
            sb2.append(":  Could not access the no-arg constructor for ");
            sb2.append(name);
            throw new xp(7, sb2.toString(), e);
        } catch (InvocationTargetException e2) {
            throw new xp(7, cg2Var + ":  Exception while trying to invoke setter method.", e2);
        }
    }

    public Type l(Type type, Type type2) {
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            return type;
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return type2;
        }
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        throw new xp(((cg2) this.c) + ":  Unknown generic type " + type + ".", 7);
    }

    public void m(Collection collection, AbstractCollection abstractCollection, Type type) {
        cg2 cg2Var = (cg2) this.c;
        LinkedList linkedList = (LinkedList) this.a;
        LinkedList linkedList2 = (LinkedList) this.b;
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : null;
        linkedList2.add(collection);
        linkedList.add(abstractCollection);
        cg2Var.a.add("values");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            abstractCollection.add(j(it.next(), type2));
        }
        cg2Var.a();
        linkedList.removeLast();
        linkedList2.removeLast();
    }

    public void n(Map map, HashMap map2, Type type, Type type2) {
        cg2 cg2Var = (cg2) this.c;
        LinkedList linkedList = (LinkedList) this.b;
        linkedList.add(map);
        LinkedList linkedList2 = (LinkedList) this.a;
        linkedList2.add(map2);
        for (Object obj : map.keySet()) {
            cg2Var.a.add("keys");
            Object objJ = j(obj, type);
            cg2Var.a();
            cg2Var.a.add("values");
            Object objJ2 = j(map.get(obj), type2);
            cg2Var.a();
            map2.put(objJ, objJ2);
        }
        linkedList2.removeLast();
        linkedList.removeLast();
    }

    public void o(Activity activity) {
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new d90("Can't add activity to CodelessMatcher on non-UI thread");
            }
            ((Set) this.b).add(activity);
            ((HashSet) this.d).clear();
            HashSet hashSet = (HashSet) ((HashMap) this.e).get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.d = hashSet;
            }
            if (set.contains(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    z();
                } else {
                    ((Handler) this.a).post(new y1(this, 9));
                }
            } catch (Throwable th) {
                mt.a(this, th);
            }
        } catch (Throwable th2) {
            mt.a(this, th2);
        }
    }

    public xp p(Object obj, Class cls) {
        return new xp(((cg2) this.c) + ":  Can not convert " + obj.getClass().getName() + " into " + cls.getName(), 7);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [cg2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public Class q(Object obj, Class cls) {
        String str;
        ?? r0 = (HashMap) this.d;
        ?? LoadClass = (cg2) this.c;
        if (r0.containsKey(LoadClass)) {
            return null;
        }
        if (!(obj instanceof Map) || (str = (String) ((Map) obj).get("class")) == null) {
            LoadClass = 0;
        } else {
            try {
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                LoadClass = contextClassLoader != null ? contextClassLoader.loadClass(str) : Class.forName(str);
            } catch (ClassNotFoundException e) {
                throw new xp(7, LoadClass + ":  Could not load " + str, e);
            }
        }
        if (LoadClass == 0 || cls == 0) {
            if (cls == 0) {
                if (LoadClass != 0) {
                    cls = LoadClass;
                } else {
                    cls = 0;
                }
            }
        } else if (cls.isAssignableFrom(LoadClass)) {
            cls = LoadClass;
        }
        return cls == 0 ? obj.getClass() : cls;
    }

    public boolean r(int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            s5 s5Var = (s5) arrayList.get(i3);
            int i4 = s5Var.a;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = s5Var.b;
                    int i6 = s5Var.c + i5;
                    while (i5 < i6) {
                        if (w(i5, i3 + 1) == i2) {
                            return true;
                        }
                        i5++;
                    }
                } else {
                    continue;
                }
            } else {
                if (w(s5Var.c, i3 + 1) == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s() {
        gk1 gk1Var = (gk1) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((gk1) this.d).m((s5) arrayList.get(i2));
        }
        C(arrayList);
        ArrayList arrayList2 = (ArrayList) this.b;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            s5 s5Var = (s5) arrayList2.get(i3);
            int i4 = s5Var.a;
            if (i4 == 1) {
                gk1Var.m(s5Var);
                gk1Var.t(s5Var.b, s5Var.c);
            } else if (i4 == 2) {
                gk1Var.m(s5Var);
                int i5 = s5Var.b;
                int i6 = s5Var.c;
                RecyclerView recyclerView = (RecyclerView) gk1Var.b;
                recyclerView.O(i5, i6, true);
                recyclerView.T0 = true;
                recyclerView.Q0.c += i6;
            } else if (i4 == 4) {
                gk1Var.m(s5Var);
                gk1Var.s(s5Var.b, s5Var.c);
            } else if (i4 == 8) {
                gk1Var.m(s5Var);
                gk1Var.u(s5Var.b, s5Var.c);
            }
        }
        C(arrayList2);
    }

    public void u(s5 s5Var) {
        int i2;
        zb1 zb1Var = (zb1) this.a;
        int i3 = s5Var.a;
        if (i3 == 1 || i3 == 8) {
            e.g("should not dispatch add or move for pre layout");
            return;
        }
        int iK = K(s5Var.b, i3);
        int i4 = s5Var.b;
        int i5 = s5Var.a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                ur.g(s5Var, "op should be remove or update.");
                return;
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < s5Var.c; i7++) {
            int iK2 = K((i2 * i7) + s5Var.b, s5Var.a);
            int i8 = s5Var.a;
            if (i8 == 2 ? iK2 != iK : !(i8 == 4 && iK2 == iK + 1)) {
                s5 s5VarA = A(i8, iK, i6);
                v(s5VarA, i4);
                zb1Var.b(s5VarA);
                if (s5Var.a == 4) {
                    i4 += i6;
                }
                i6 = 1;
                iK = iK2;
            } else {
                i6++;
            }
        }
        zb1Var.b(s5Var);
        if (i6 > 0) {
            s5 s5VarA2 = A(s5Var.a, iK, i6);
            v(s5VarA2, i4);
            zb1Var.b(s5VarA2);
        }
    }

    public void v(s5 s5Var, int i2) {
        gk1 gk1Var = (gk1) this.d;
        gk1Var.m(s5Var);
        int i3 = s5Var.a;
        if (i3 != 2) {
            if (i3 == 4) {
                gk1Var.s(i2, s5Var.c);
                return;
            } else {
                e.g("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i4 = s5Var.c;
        RecyclerView recyclerView = (RecyclerView) gk1Var.b;
        recyclerView.O(i2, i4, true);
        recyclerView.T0 = true;
        recyclerView.Q0.c += i4;
    }

    public int w(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        while (i3 < size) {
            s5 s5Var = (s5) arrayList.get(i3);
            int i4 = s5Var.a;
            int i5 = s5Var.b;
            if (i4 == 8) {
                if (i5 == i2) {
                    i2 = s5Var.c;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (s5Var.c <= i2) {
                        i2++;
                    }
                }
            } else if (i5 > i2) {
                continue;
            } else if (i4 == 2) {
                int i6 = s5Var.c;
                if (i2 < i5 + i6) {
                    return -1;
                }
                i2 -= i6;
            } else if (i4 == 1) {
                i2 += s5Var.c;
            }
            i3++;
        }
        return i2;
    }

    public boolean y() {
        return ((ArrayList) this.b).size() > 0;
    }

    public void z() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            for (Activity activity : (Set) this.b) {
                if (activity != null) {
                    ((LinkedHashSet) this.c).add(new bo(ga.k(activity), (Handler) this.a, (HashSet) this.d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public co(Context context) {
        this.e = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        this.a = context;
        this.d = new c6(this, context.getMainLooper(), 3);
    }
}
