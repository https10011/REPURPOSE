package defpackage;

import android.content.SharedPreferences;
import com.facebook.FacebookRequestError;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ha implements ik0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ha(int i) {
        this.a = i;
    }

    @Override // defpackage.ik0
    public final void a(pk0 pk0Var) {
        switch (this.a) {
            case 0:
                pk0Var.getClass();
                boolean z = ia.a;
                j01 j01Var = j01.a;
                FacebookRequestError facebookRequestError = pk0Var.c;
                boolean zBooleanValue = false;
                Object obj = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                LinkedHashMap linkedHashMap = null;
                if (facebookRequestError != null) {
                    gp1 gp1Var = i01.c;
                    facebookRequestError.toString();
                    String.valueOf(facebookRequestError.w);
                    synchronized (i90.b) {
                    }
                    if (!mt.a.contains(ia.class)) {
                        try {
                            SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                            if (sharedPreferences != null) {
                                String string = sharedPreferences.getString("dataset_id", null);
                                String string2 = sharedPreferences.getString("endpoint", null);
                                String string3 = sharedPreferences.getString("access_key", null);
                                if (string != null && !StringsKt.w(string) && string2 != null && !StringsKt.w(string2) && string3 != null && !StringsKt.w(string3)) {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("endpoint", string2);
                                    linkedHashMap2.put("dataset_id", string);
                                    linkedHashMap2.put("access_key", string3);
                                    linkedHashMap = linkedHashMap2;
                                }
                            }
                        } catch (Throwable th) {
                            mt.a(ia.class, th);
                        }
                    }
                    if (linkedHashMap != null) {
                        URL url = new URL(String.valueOf(linkedHashMap.get("endpoint")));
                        oa.c = new ma(String.valueOf(linkedHashMap.get("dataset_id")), url.getProtocol() + "://" + url.getHost(), String.valueOf(linkedHashMap.get("access_key")));
                        oa.d = new ArrayList();
                        ia.a = true;
                    }
                } else {
                    gp1 gp1Var2 = i01.c;
                    HashSet hashSet = i90.b;
                    synchronized (hashSet) {
                    }
                    JSONObject jSONObject = pk0Var.b;
                    if (jSONObject != null) {
                        try {
                            obj = jSONObject.get("data");
                        } catch (NullPointerException e) {
                            gp1 gp1Var3 = i01.c;
                            gp1.i(j01Var, "ia", "CloudBridge Settings API response is not a valid json: \n%s ", a80.b(e));
                            return;
                        } catch (JSONException e2) {
                            gp1 gp1Var4 = i01.c;
                            gp1.i(j01Var, "ia", "CloudBridge Settings API response is not a valid json: \n%s ", a80.b(e2));
                            return;
                        }
                    }
                    obj.getClass();
                    HashMap mapG = h42.g(new JSONObject((String) CollectionsKt.q(h42.f((JSONArray) obj))));
                    String str = (String) mapG.get("endpoint");
                    String str2 = (String) mapG.get("dataset_id");
                    String str3 = (String) mapG.get("access_key");
                    if (str == null || str2 == null || str3 == null) {
                        synchronized (hashSet) {
                        }
                    } else {
                        try {
                            oa.c = new ma(str2, str, str3);
                            oa.d = new ArrayList();
                            ia.o(mapG);
                            if (mapG.get("is_enabled") != null) {
                                Object obj2 = mapG.get("is_enabled");
                                obj2.getClass();
                                zBooleanValue = ((Boolean) obj2).booleanValue();
                            }
                            ia.a = zBooleanValue;
                        } catch (MalformedURLException e3) {
                            gp1 gp1Var5 = i01.c;
                            a80.b(e3);
                            synchronized (i90.b) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 1:
                pk0Var.getClass();
                break;
            default:
                pk0Var.getClass();
                gp1 gp1Var6 = i01.c;
                i62.a().getClass();
                synchronized (i90.b) {
                    break;
                }
                break;
        }
    }
}
