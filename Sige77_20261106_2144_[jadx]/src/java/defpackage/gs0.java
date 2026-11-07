package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.d;
import com.fm.openinstall.OpenInstall;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.hjq.toast.BuildConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import prod.apptest.com.AppTestApp;
import prod.apptest.com.activity.OpenWebActivity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class gs0 {
    public final Activity a;
    public final FirebaseAnalytics b;

    public class a extends s12<Map<String, Object>> {
    }

    public gs0(Activity activity) {
        this.a = activity;
        this.b = FirebaseAnalytics.getInstance(activity);
    }

    public static Bundle a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                } else {
                    Log.w("window.Android", "Value for key " + next + " not one of [String, Integer, Double]");
                }
            }
            return bundle;
        } catch (JSONException e) {
            Log.w("window.Android", "Failed to parse JSON, returning empty Bundle.", e);
            return new Bundle();
        }
    }

    @JavascriptInterface
    public void appFlyerLogEvent(String str, String str2) {
        AppsFlyerLib.getInstance().logEvent(this.a.getApplicationContext(), str, (Map) new uk0().a(str2, new a().b), new op0(7));
    }

    @JavascriptInterface
    public boolean canSendPushNotifications() {
        Log.d("window.Android", "call: window.Android.canSendPushNotifications()");
        int i = Build.VERSION.SDK_INT;
        Activity activity = this.a;
        if (i >= 33) {
            return sp0.d(activity, "android.permission.POST_NOTIFICATIONS") == 0;
        }
        return new p71(activity).a.areNotificationsEnabled();
    }

    @JavascriptInterface
    public void closeApp() {
        Activity activity = this.a;
        Log.d("window.Android", "call: window.Android.closeApp()");
        try {
            activity.finishAffinity();
            activity.moveTaskToBack(true);
        } catch (Exception e) {
            Log.e("window.Android", "window.Android.closeApp() failure", e);
        }
    }

    @JavascriptInterface
    public void closeWebView() {
        Log.d("window.Android", "call: window.Android.closeWebView()");
        try {
            this.a.finish();
        } catch (Exception e) {
            Log.e("window.Android", "closeWebView failure", e);
        }
    }

    @JavascriptInterface
    public void copyToClipboard(String str) {
        Log.d("window.Android", "call: window.Android.copyToClipboard(...)");
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", str));
    }

    @JavascriptInterface
    public void eventTracker(String str, String str2) {
        Log.d("window.Android", d.a("call: window.Android.eventTracker('", str, "', '", str2, "')"));
        try {
            this.b.logEvent(str, a(str2));
        } catch (Exception e) {
            Log.w("window.Android", "eventTracker firebase failure", e);
        }
        try {
            appFlyerLogEvent(str, str2);
        } catch (Exception e2) {
            Log.w("window.Android", "eventTracker AF failure", e2);
        }
        if (str.equals("register") && !"0".equals(AppTestApp.g0)) {
            OpenInstall.reportRegister();
        }
        if (ea.o(AppTestApp.k0)) {
            return;
        }
        try {
            Map map = (Map) new uk0().a(str2, new hs0().b);
            int iHashCode = str.hashCode();
            if (iHashCode != -1583364140) {
                if (iHashCode != -690213213) {
                    if (iHashCode == 1554454174 && str.equals("deposit")) {
                        Bundle bundle = new Bundle();
                        bundle.putString("amount", Objects.toString(map.get("value")));
                        ic icVar = new ic("payment", Integer.parseInt(AppTestApp.k0));
                        icVar.d(bundle);
                        icVar.c();
                        Log.d("window.Android", "snowball event, eventName=" + str + " done");
                    }
                } else if (str.equals("register")) {
                    new ic("register", Integer.parseInt(AppTestApp.k0)).c();
                    Log.d("window.Android", "snowball event, eventName=" + str + " done");
                }
            } else if (str.equals("startTrial")) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("amount", Objects.toString(map.get("value")));
                ic icVar2 = new ic("first_payment", Integer.parseInt(AppTestApp.k0));
                icVar2.d(bundle2);
                icVar2.c();
                Log.d("window.Android", "snowball event, eventName=" + str + " done");
            }
        } catch (Exception e3) {
            Log.w("window.Android", "snowball event failed, eventName=".concat(str), e3);
        }
    }

    @JavascriptInterface
    public void facebookLogin(String str) {
        Log.d("window.Android", "call: window.Android.facebookLogin('" + str + "')");
        try {
            ((yg) this.a).facebookLogin(str);
        } catch (Exception e) {
            Log.e("window.Android", "window.Android.facebookLogin failure", e);
        }
    }

    @JavascriptInterface
    public void generateFcmToken(String str) {
        Log.d("window.Android", "call: window.Android.generateFcmToken('" + str + "')");
        try {
            ((yg) this.a).generateFcmToken(str);
        } catch (Exception e) {
            Log.e("window.Android", "generateFcmToken failure", e);
        }
    }

    @JavascriptInterface
    public void getFcmToken(String str) {
        Object obj = this.a;
        Log.d("window.Android", "call: window.Android.getFcmToken('" + str + "')");
        try {
            ((yg) obj).generateFcmToken(str);
            ((yg) obj).requestPushPermission(3000L, false);
        } catch (Exception e) {
            Log.e("window.Android", "generateFcmToken failure", e);
        }
    }

    @JavascriptInterface
    public String getVersion() {
        Log.d("window.Android", "call: window.Android.getVersion()");
        return AppTestApp.a0;
    }

    @JavascriptInterface
    public void lineSdkLogin(String str, String str2) {
        Log.d("window.Android", "call: window.Android.lineSdkLogin('" + str2 + "')");
        try {
            ((yg) this.a).lineSdkLoginAction(str, str2);
        } catch (Exception e) {
            Log.e("window.Android", "window.Android.lineSdkLoginAction failure", e);
        }
    }

    @JavascriptInterface
    public void nativeShare(String str, String str2) {
        Intent intent = new Intent();
        intent.setType("text/plain");
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TITLE", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        this.a.startActivity(Intent.createChooser(intent, str), null);
    }

    @JavascriptInterface
    public void oauthLogin(String str, String str2) {
        Log.d("window.Android", d.a("call: window.Android.oauthLogin(", str, ":", str2, ")"));
        try {
            ((yg) this.a).oauthLogin(str, str2);
        } catch (Exception e) {
            Log.e("window.Android", "window.Android.oauthLogin failure", e);
        }
    }

    @JavascriptInterface
    public void openAndroid(String str) {
        Log.d("window.Android", "call: window.Android.openAndroid(" + str + ")");
        try {
            Intent uri = Intent.parseUri(str, 1);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            this.a.startActivity(uri);
        } catch (Exception e) {
            Log.e("window.Android", "openAndroid failure", e);
        }
    }

    @JavascriptInterface
    public void openWebView(String str) {
        Activity activity = this.a;
        Log.d("window.Android", "call: window.Android.openWebView(" + str + ")");
        try {
            Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) OpenWebActivity.class);
            intent.putExtra("Url", str);
            activity.startActivity(intent);
        } catch (Exception e) {
            Log.e("window.Android", "openWebView failure", e);
        }
    }

    @JavascriptInterface
    public String pasteFromClipboard() {
        CharSequence text;
        Log.d("window.Android", "call: window.Android.pasteFromClipboard()");
        ClipboardManager clipboardManager = (ClipboardManager) this.a.getSystemService("clipboard");
        return (!clipboardManager.hasPrimaryClip() || clipboardManager.getPrimaryClip().getItemCount() <= 0 || (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) == null) ? BuildConfig.FLAVOR : text.toString();
    }

    @JavascriptInterface
    public void receiveBase64FromBlob(String str) {
        Log.d("window.Android", "call: window.Android.receiveBase64FromBlob('" + str + "')");
        try {
            boolean zContains = str.contains("image");
            Object obj = this.a;
            if (zContains) {
                ((yg) obj).savePictureBase64Action(str);
                Log.d("window.Android", "call: window.Android.receiveBase64FromBlob download image");
            } else {
                ((yg) obj).downloadTextFileAction(str);
                Log.d("window.Android", "call: window.Android.receiveBase64FromBlob download text");
            }
        } catch (Exception e) {
            Log.e("window.Android", "window.Android.receiveBase64FromBlob failure", e);
        }
    }

    @JavascriptInterface
    public void requestPushPermission() {
        Log.d("window.Android", "call: window.Android.requestPushPermission()");
        try {
            ((yg) this.a).requestPushPermission(0L, true);
        } catch (Exception e) {
            Log.e("window.Android", "requestPushPermission failure", e);
        }
    }

    @JavascriptInterface
    public String storageGetItem(String str) {
        Log.d("window.Android", "call: window.Android.storageGetItem(" + str + ")");
        Activity activity = this.a;
        return activity.getApplicationContext().getSharedPreferences(activity.getString(2131886122), 0).getString("JS_" + str, BuildConfig.FLAVOR);
    }

    @JavascriptInterface
    public void storageRemoveItem(String str) {
        Log.d("window.Android", "call: window.Android.storageRemoveItem(" + str + ")");
        Activity activity = this.a;
        activity.getApplicationContext().getSharedPreferences(activity.getString(2131886122), 0).edit().remove("JS_" + str).apply();
    }

    @JavascriptInterface
    public void storageSetItem(String str, String str2) {
        Log.d("window.Android", d.a("call: window.Android.storageSetItem(", str, ", ", str2, ")"));
        Activity activity = this.a;
        activity.getApplicationContext().getSharedPreferences(activity.getString(2131886122), 0).edit().putString("JS_" + str, str2).apply();
    }

    @JavascriptInterface
    public boolean supportFCM() {
        Log.d("window.Android", "call: window.Android.supportFCM()");
        try {
            synchronized (FirebaseMessaging.class) {
                FirebaseMessaging.getInstance(hc0.d());
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
