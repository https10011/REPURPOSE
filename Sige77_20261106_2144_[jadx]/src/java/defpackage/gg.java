package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.c;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gg implements cu {
    public final yg a;

    public /* synthetic */ gg(yg ygVar) {
        this.a = ygVar;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [android.app.Activity, android.content.Context, yg] */
    public void a(Object obj) {
        Intent intentA;
        int i = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.X;
        new HashSet();
        new HashMap();
        gu2.o(googleSignInOptions);
        HashSet hashSet = new HashSet(googleSignInOptions.b);
        boolean z = googleSignInOptions.e;
        boolean z2 = googleSignInOptions.f;
        String str = googleSignInOptions.i;
        Account account = googleSignInOptions.c;
        String str2 = googleSignInOptions.v;
        HashMap mapS = GoogleSignInOptions.S(googleSignInOptions.w);
        String str3 = googleSignInOptions.W;
        ?? r15 = this.a;
        String string = r15.getString(2131886225);
        gu2.l(string);
        gu2.h("two different server client ids provided", str == null || str.equals(string));
        hashSet.add(GoogleSignInOptions.Y);
        if (hashSet.contains(GoogleSignInOptions.b0)) {
            Scope scope = GoogleSignInOptions.a0;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (account == null || !hashSet.isEmpty()) {
            hashSet.add(GoogleSignInOptions.Z);
        }
        GoogleSignInOptions googleSignInOptions2 = new GoogleSignInOptions(3, new ArrayList(hashSet), account, true, z, z2, string, str2, mapS, str3);
        r41 r41Var = new r41(3);
        Looper mainLooper = r15.getMainLooper();
        gu2.p(mainLooper, "Looper must not be null.");
        jr0 jr0Var = new jr0(r15, r15, oc.a, googleSignInOptions2, new oj0(r41Var, mainLooper));
        int iD = jr0Var.d();
        int i2 = iD - 1;
        if (iD == 0) {
            throw null;
        }
        GoogleSignInOptions googleSignInOptions3 = jr0Var.e;
        Context context = jr0Var.a;
        if (i2 == 2) {
            qi2.a.f("getFallbackSignInIntent()", new Object[0]);
            intentA = qi2.a(context, googleSignInOptions3);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        } else if (i2 != 3) {
            qi2.a.f("getNoImplementationSignInIntent()", new Object[0]);
            intentA = qi2.a(context, googleSignInOptions3);
            intentA.setAction("com.google.android.gms.auth.NO_IMPL");
        } else {
            intentA = qi2.a(context, googleSignInOptions3);
        }
        r15.K0.a(intentA);
    }

    public void b(Object obj) {
        h8 h8Var = ((fi0) obj).a;
        boolean z = h8Var instanceof vj0;
        yg ygVar = this.a;
        if (z) {
            String str = ((vj0) h8Var).c;
            int i = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
            ygVar.z(str);
            return;
        }
        if (!((String) h8Var.a).equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
            ygVar.w("Failure: Unexpected credential type");
            return;
        }
        Bundle bundle = (Bundle) h8Var.b;
        bundle.getClass();
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            vj0 vj0Var = new vj0(string, string2, string3, string4, string5, uri, string6);
            int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
            ygVar.z(vj0Var.c);
        } catch (Exception e) {
            throw new nc0(e);
        }
    }

    public du c() {
        String string;
        c cVar = this.a;
        PackageInfo packageInfo = cVar.getPackageManager().getPackageInfo(cVar.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listB = CollectionsKt.B(arrayList);
        if (listB.isEmpty()) {
            return null;
        }
        Iterator it = listB.iterator();
        du duVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(cVar);
                objNewInstance.getClass();
                du duVar2 = (du) objNewInstance;
                if (!duVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (duVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    duVar = duVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return duVar;
    }
}
