package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.hjq.toast.BuildConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t32 {
    public static SharedPreferences b;
    public static final t32 a = new t32();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    public final HashMap a() {
        ConcurrentHashMap concurrentHashMap = e;
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = w41.d;
            HashSet hashSet = new HashSet();
            Iterator it = w41.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((w41) it.next()).c());
            }
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    map.put(str, concurrentHashMap.get(str));
                }
            }
            return map;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final synchronized void b() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(i90.a());
            defaultSharedPreferences.getClass();
            b = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", BuildConfig.FLAVOR);
            if (string == null) {
                string = BuildConfig.FLAVOR;
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences = null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", BuildConfig.FLAVOR);
            if (string2 == null) {
                string2 = BuildConfig.FLAVOR;
            }
            d.putAll(h42.A(string));
            e.putAll(h42.A(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final String c(String str, String str2) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String lowerCase = str2.subSequence(i, length + 1).toString().toLowerCase();
            lowerCase.getClass();
            if (Intrinsics.areEqual("em", str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e("t32", "Setting email failure: this is not a valid email address");
                    return BuildConfig.FLAVOR;
                }
            } else {
                if (Intrinsics.areEqual("ph", str)) {
                    return new Regex("[^0-9]").replace(lowerCase, BuildConfig.FLAVOR);
                }
                if (Intrinsics.areEqual("ge", str)) {
                    String strSubstring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : BuildConfig.FLAVOR;
                    if (!Intrinsics.areEqual("f", strSubstring) && !Intrinsics.areEqual("m", strSubstring)) {
                        Log.e("t32", "Setting gender failure: the supported value for gender is f or m");
                        return BuildConfig.FLAVOR;
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }
}
