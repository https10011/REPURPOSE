package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k5 extends j5 {
    public final /* synthetic */ int a;

    public /* synthetic */ k5(int i) {
        this.a = i;
    }

    @Override // defpackage.j5
    public final Intent a(c cVar, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 1:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Parcelable intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = ((IntentSenderRequest) intentSenderRequest).b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = ((IntentSenderRequest) intentSenderRequest).a;
                        intentSender.getClass();
                        intentSenderRequest = new IntentSenderRequest(intentSender, (Intent) null, ((IntentSenderRequest) intentSenderRequest).c, ((IntentSenderRequest) intentSenderRequest).d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (e.H(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
            default:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
        }
    }

    @Override // defpackage.j5
    public i5 b(c cVar, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    y50 y50Var = y50.a;
                    y50Var.getClass();
                    return new i5(y50Var);
                }
                for (String str : strArr) {
                    if (sp0.d(cVar, str) != 0) {
                        return null;
                    }
                }
                int iA = v11.a(strArr.length);
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new i5(linkedHashMap);
            case 1:
                String str3 = (String) obj;
                str3.getClass();
                if (sp0.d(cVar, str3) == 0) {
                    return new i5(Boolean.TRUE);
                }
                return null;
            default:
                return super.b(cVar, obj);
        }
    }

    @Override // defpackage.j5
    public final Object c(Intent intent, int i) {
        boolean z = false;
        switch (this.a) {
            case 0:
                if (i != -1) {
                    y50 y50Var = y50.a;
                    y50Var.getClass();
                    return y50Var;
                }
                if (intent == null) {
                    y50 y50Var2 = y50.a;
                    y50Var2.getClass();
                    return y50Var2;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    y50 y50Var3 = y50.a;
                    y50Var3.getClass();
                    return y50Var3;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayListJ = wb.j(stringArrayExtra);
                Iterator it = arrayListJ.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(ko.h(arrayListJ), ko.h(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new Pair(it.next(), it2.next()));
                }
                return w11.g(arrayList2);
            case 1:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i3 : intArrayExtra2) {
                        if (i3 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ActivityResult(intent, i);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new ActivityResult(intent, i);
            default:
                android.util.Pair pairCreate = android.util.Pair.create(Integer.valueOf(i), intent);
                pairCreate.getClass();
                return pairCreate;
        }
    }
}
