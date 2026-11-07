package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.hjq.toast.BuildConfig;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mk0 {
    public static final String j;
    public static final Pattern k;
    public static volatile String l;
    public final AccessToken a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public String e;
    public final String f;
    public ik0 g;
    public nm0 h;
    public boolean i;

    static {
        char[] cArr = {'-', '_', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(cArr[secureRandom.nextInt(64)]);
        }
        j = sb.toString();
        k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public mk0(AccessToken accessToken, String str, Bundle bundle, nm0 nm0Var, ik0 ik0Var) {
        this.a = accessToken;
        this.b = str;
        this.f = null;
        j(ik0Var);
        this.h = nm0Var == null ? nm0.a : nm0Var;
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        this.f = i90.d();
    }

    public static String f() {
        String strB = i90.b();
        dw0.y();
        String str = i90.h;
        if (str == null) {
            throw new d90("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        if (strB.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return strB + '|' + str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public final void a() {
        Bundle bundle = this.d;
        String strE = e();
        boolean zT = strE != null ? StringsKt.t(strE, "|") : false;
        if (strE == null || !d.j(strE, "IG", false) || zT || !i()) {
            if ((Intrinsics.areEqual(i90.e(), "instagram.com") ? true ^ i() : true) || zT) {
                String strE2 = e();
                if (strE2 != null) {
                    bundle.putString("access_token", strE2);
                }
            } else {
                bundle.putString("access_token", f());
            }
        } else {
            bundle.putString("access_token", f());
        }
        if (!bundle.containsKey("access_token")) {
            i90 i90Var = i90.a;
            dw0.y();
            String str = i90.h;
            if (str == null) {
                throw new d90("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            }
            if (h42.x(str)) {
                Log.w("mk0", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        HashSet hashSet = i90.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
    }

    public final String b(String str, boolean z) {
        if (!z && this.h == nm0.b) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.d.keySet()) {
            Object obj = this.d.get(str2);
            if (obj == null) {
                obj = BuildConfig.FLAVOR;
            }
            if (vl0.n(obj)) {
                builderBuildUpon.appendQueryParameter(str2, vl0.f(obj).toString());
            } else if (this.h != nm0.a) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                e.g(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    public final pk0 c() {
        List listO = wb.o(new mk0[]{this});
        listO.getClass();
        ArrayList arrayListK = vl0.k(new ok0(listO));
        if (arrayListK.size() == 1) {
            return (pk0) arrayListK.get(0);
        }
        throw new d90("invalid state: expected a single response");
    }

    public final nk0 d() {
        List listO = wb.o(new mk0[]{this});
        listO.getClass();
        ok0 ok0Var = new ok0(listO);
        dw0.s(ok0Var);
        nk0 nk0Var = new nk0(ok0Var);
        nk0Var.executeOnExecutor(i90.c(), new Void[0]);
        return nk0Var;
    }

    public final String e() {
        Bundle bundle = this.d;
        AccessToken accessToken = this.a;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String str = accessToken.e;
                i01.c.p(str);
                return str;
            }
        } else if (!bundle.containsKey("access_token")) {
            return f();
        }
        return this.d.getString("access_token");
    }

    public final String g() {
        String str;
        String str2;
        if (this.h == nm0.b && (str2 = this.b) != null && d.d(str2, "/videos", false)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{i90.e()}, 1));
        } else {
            String strE = i90.e();
            strE.getClass();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{strE}, 1));
        }
        String strH = h(str);
        a();
        return b(strH, false);
    }

    public final String h(String str) {
        if (!(!Intrinsics.areEqual(i90.e(), "instagram.com") ? true : !i())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{i90.s}, 1));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Pattern pattern = k;
        String str2 = this.b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(i90.b());
        sb.append("/?.*");
        return this.i || Pattern.matches(sb.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void j(ik0 ik0Var) {
        HashSet hashSet = i90.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        this.g = ik0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        String str = this.a;
        if (str == null) {
            str = "null";
        }
        sb.append((Object) str);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.h);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
