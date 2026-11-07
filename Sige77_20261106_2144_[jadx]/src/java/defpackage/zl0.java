package defpackage;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zl0 {
    public static final fc1 b = new fc1("fire-global");
    public static final fc1 c = new fc1("fire-count");
    public static final fc1 d = new fc1("last-used-date");
    public final ns0 a;

    public zl0(Context context, String str) {
        this.a = new ns0(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            ns0 ns0Var = this.a;
            ns0Var.getClass();
            for (Map.Entry entry : ((Map) qt.v(new r00(ns0Var, null, 1))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new qd(new ArrayList(hashSet), ((fc1) entry.getKey()).a));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new Function1() { // from class: yl0
                    public final Object invoke(Object obj) {
                        ((d61) obj).c(zl0.b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        Instant instant = new Date(j).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized fc1 c(d61 d61Var, String str) {
        for (Map.Entry entry : d61Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((fc1) entry.getKey()).a;
                        str2.getClass();
                        return new fc1(str2);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(d61 d61Var, String str) {
        fc1 fc1VarC = c(d61Var, str);
        if (fc1VarC == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) x91.v(d61Var, fc1VarC, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            d61Var.b();
            d61Var.a.remove(fc1VarC);
        } else {
            d61Var.d(fc1VarC, hashSet);
        }
    }

    public final synchronized boolean e(fc1 fc1Var, long j) {
        fs fsVar;
        long jLongValue;
        ns0 ns0Var = this.a;
        ns0Var.getClass();
        fc1Var.getClass();
        fsVar = null;
        jLongValue = ((Long) qt.v(new pw(ns0Var, fc1Var, fsVar, 4))).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j))) {
            return false;
        }
        ns0 ns0Var2 = this.a;
        Long lValueOf = Long.valueOf(j);
        ns0Var2.getClass();
        return true;
    }
}
