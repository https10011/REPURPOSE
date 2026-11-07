package defpackage;

import android.util.Log;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class z1 implements ik0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z1(int i, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = serializable;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    @Override // defpackage.ik0
    public final void a(pk0 pk0Var) {
        JSONArray jSONArrayOptJSONArray;
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) serializable;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                HashSet hashSet3 = (HashSet) obj;
                pk0Var.getClass();
                JSONObject jSONObject = pk0Var.d;
                if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                    atomicBoolean.set(true);
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("permission");
                            String strOptString2 = jSONObjectOptJSONObject.optString("status");
                            if (!h42.x(strOptString) && !h42.x(strOptString2)) {
                                strOptString2.getClass();
                                Locale locale = Locale.US;
                                locale.getClass();
                                String lowerCase = strOptString2.toLowerCase(locale);
                                lowerCase.getClass();
                                int iHashCode = lowerCase.hashCode();
                                if (iHashCode != -1309235419) {
                                    if (iHashCode != 280295099) {
                                        if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                            hashSet2.add(strOptString);
                                        } else {
                                            Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                                        }
                                    } else if (lowerCase.equals("granted")) {
                                        hashSet.add(strOptString);
                                    } else {
                                        Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                                    }
                                } else if (lowerCase.equals("expired")) {
                                    hashSet3.add(strOptString);
                                } else {
                                    Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                                }
                            }
                        }
                    }
                }
                break;
            default:
                w1 w1Var = (w1) serializable;
                mk0 mk0Var = (mk0) obj3;
                fp1 fp1Var = (fp1) obj2;
                f6 f6Var = (f6) obj;
                if (!mt.a.contains(da.class)) {
                    try {
                        pk0Var.getClass();
                        da.e(w1Var, mk0Var, pk0Var, fp1Var, f6Var);
                    } catch (Throwable th) {
                        mt.a(da.class, th);
                    }
                    break;
                }
                break;
        }
    }
}
