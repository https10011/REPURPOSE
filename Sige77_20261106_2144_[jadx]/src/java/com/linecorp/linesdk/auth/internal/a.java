package com.linecorp.linesdk.auth.internal;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import defpackage.ci;
import defpackage.dm1;
import defpackage.g93;
import defpackage.gk1;
import defpackage.ir1;
import defpackage.iu1;
import defpackage.kj0;
import defpackage.kx0;
import defpackage.ox0;
import defpackage.px0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a {
    public final LineAuthenticationStatus a;

    public a(LineAuthenticationStatus lineAuthenticationStatus) {
        this.a = lineAuthenticationStatus;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x019b  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0223  */
    /* JADX WARN: Code duplicated, block: B:66:0x01df A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0223, please report this as an issue */
    public final ir1 a(Context context, LineAuthenticationConfig lineAuthenticationConfig, PKCECode pKCECode, LineAuthenticationParams lineAuthenticationParams) {
        String str;
        Object obj;
        String strJoin;
        Bundle extras;
        ArrayList arrayList;
        int size;
        ci ciVar;
        Intent intent;
        String strA = iu1.a(16);
        LineAuthenticationStatus lineAuthenticationStatus = this.a;
        lineAuthenticationStatus.c = strA;
        List list = lineAuthenticationParams.a;
        String strA2 = lineAuthenticationParams.b;
        if (list.contains(dm1.d)) {
            if (TextUtils.isEmpty(strA2)) {
                strA2 = iu1.a(16);
            }
            str = strA2;
        } else {
            str = null;
        }
        lineAuthenticationStatus.d = str;
        String str2 = "intent://result#Intent;package=" + context.getPackageName() + ";scheme=lineauth;end";
        String str3 = lineAuthenticationConfig.a;
        String str4 = pKCECode.b;
        List list2 = lineAuthenticationParams.a;
        if (list2 == null || list2.isEmpty()) {
            obj = null;
            strJoin = null;
        } else {
            strJoin = TextUtils.join(" ", dm1.a(list2));
            obj = null;
        }
        LinkedHashMap linkedHashMapH = g93.h("response_type", "code", "client_id", str3, "state", strA, "code_challenge", str4, "code_challenge_method", "S256", "redirect_uri", str2, "sdk_ver", "5.12.0", "scope", strJoin);
        if (!TextUtils.isEmpty(str)) {
            linkedHashMapH.put("nonce", str);
        }
        ox0 ox0Var = lineAuthenticationParams.c;
        if (ox0Var != null) {
            linkedHashMapH.put("bot_prompt", ox0Var.name().toLowerCase());
        }
        String str5 = lineAuthenticationParams.e;
        if (str5 != null) {
            linkedHashMapH.put("prompt_bot_id", str5);
        }
        Uri.Builder builderBuildUpon = Uri.parse("/oauth2/v2.1/authorize/consent").buildUpon();
        g93.f(builderBuildUpon, linkedHashMapH);
        LinkedHashMap linkedHashMapH2 = g93.h("returnUri", builderBuildUpon.build().toString(), "loginChannelId", lineAuthenticationConfig.a);
        Locale locale = lineAuthenticationParams.d;
        if (locale != null) {
            linkedHashMapH2.put("ui_locales", locale.toString());
        }
        Uri uri = lineAuthenticationConfig.d;
        Uri.Builder builderBuildUpon2 = uri.buildUpon();
        if (lineAuthenticationParams.f == px0.a) {
            if (uri.getFragment() != null) {
                defpackage.e.b("Multiple fragment is not yet supported. Require review or report to developer.");
                return null;
            }
            builderBuildUpon2.encodedFragment("/qr");
        }
        g93.f(builderBuildUpon2, linkedHashMapH2);
        Uri uriBuild = builderBuildUpon2.build();
        boolean z = lineAuthenticationConfig.e;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        boolean z2 = false;
        gk1 gk1Var = new gk1(8, z2);
        gk1Var.b = Integer.valueOf(context.getColor(R.color.white) | (-16777216));
        if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent2.putExtras(bundle);
        }
        boolean z3 = true;
        intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Integer num = (Integer) gk1Var.b;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent2.putExtras(bundle2);
        intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        Intent data = ((Intent) new kj0(intent2, 9).b).setData(uriBuild);
        kx0 kx0VarA = kx0.a(context);
        if (z || kx0VarA == null) {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://")), 0);
            extras = data.getExtras();
            arrayList = new ArrayList(listQueryIntentActivities.size());
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setData(uriBuild);
                intent.setPackage(resolveInfo.activityInfo.packageName);
                if (extras != null) {
                    intent.putExtras(extras);
                }
                arrayList.add(intent);
            }
            size = arrayList.size();
            if (size != 0) {
                throw new ActivityNotFoundException("Activity for LINE log-in is not found. uri=" + uriBuild);
            }
            if (size == 1) {
                ciVar = new ci((Intent) arrayList.get(0), z2);
            } else {
                Intent intentCreateChooser = Intent.createChooser((Intent) arrayList.remove(0), null);
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                ciVar = new ci(intentCreateChooser, z2);
            }
        } else {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(uriBuild);
            intent3.setPackage("jp.naver.line.android");
            if (intent3.resolveActivity(context.getPackageManager()) != null) {
                ciVar = new ci(intent3, z3);
            } else {
                List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://")), 0);
                extras = data.getExtras();
                arrayList = new ArrayList(listQueryIntentActivities2.size());
                while (r0.hasNext()) {
                    intent = new Intent("android.intent.action.VIEW");
                    intent.setData(uriBuild);
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    if (extras != null) {
                        intent.putExtras(extras);
                    }
                    arrayList.add(intent);
                }
                size = arrayList.size();
                if (size != 0) {
                    throw new ActivityNotFoundException("Activity for LINE log-in is not found. uri=" + uriBuild);
                }
                if (size == 1) {
                    ciVar = new ci((Intent) arrayList.get(0), z2);
                } else {
                    Intent intentCreateChooser2 = Intent.createChooser((Intent) arrayList.remove(0), null);
                    intentCreateChooser2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    ciVar = new ci(intentCreateChooser2, z2);
                }
            }
        }
        return new ir1((Intent) ciVar.b, str2, ciVar.a);
    }
}
