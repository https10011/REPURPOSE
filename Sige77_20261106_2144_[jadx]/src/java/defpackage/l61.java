package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l61 {
    public static final l61 a;
    public static final ArrayList b;
    public static final AtomicBoolean c;
    public static final Integer[] d;

    static {
        l61 l61Var = new l61();
        a = l61Var;
        b = l61Var.a();
        int i = 0;
        ArrayList arrayList = null;
        if (!mt.a.contains(l61Var)) {
            try {
                ArrayList arrayListC = jo.c(new k61(i));
                arrayListC.addAll(l61Var.a());
                arrayList = arrayListC;
            } catch (Throwable th) {
                mt.a(l61Var, th);
            }
        }
        l61 l61Var2 = a;
        if (!mt.a.contains(l61Var2)) {
            try {
                HashMap map = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new k61(3));
                ArrayList arrayList3 = b;
                map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                map.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th2) {
                mt.a(l61Var2, th2);
            }
        }
        c = new AtomicBoolean(false);
        d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet treeSet, int i, int[] iArr) {
        if (mt.a.contains(l61.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator itDescendingIterator = treeSet.descendingIterator();
                int iMax = -1;
                while (itDescendingIterator.hasNext()) {
                    Integer num = (Integer) itDescendingIterator.next();
                    num.getClass();
                    iMax = Math.max(iMax, num.intValue());
                    while (length >= 0 && iArr[length] > num.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (iArr[length] == num.intValue()) {
                        if (length % 2 != 0) {
                            break;
                        }
                        return Math.min(iMax, i);
                    }
                }
            } catch (Throwable th) {
                mt.a(l61.class, th);
                return 0;
            }
        }
        return -1;
    }

    public static final Intent d(Context context) {
        if (!mt.a.contains(l61.class)) {
            try {
                context.getClass();
                ArrayList arrayList = b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((k61) obj).b()).addCategory("android.intent.category.DEFAULT");
                    if (mt.a.contains(l61.class) || intentAddCategory == null) {
                        intentAddCategory = null;
                    } else {
                        try {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                            if (resolveInfoResolveService != null) {
                                String str = resolveInfoResolveService.serviceInfo.packageName;
                                str.getClass();
                                if (!k90.a(context, str)) {
                                }
                            }
                        } catch (Throwable th) {
                            mt.a(l61.class, th);
                        }
                        intentAddCategory = null;
                    }
                    if (intentAddCategory != null) {
                        return intentAddCategory;
                    }
                }
            } catch (Throwable th2) {
                mt.a(l61.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:5:0x000c, B:26:0x004b, B:28:0x0067, B:37:0x0092, B:36:0x008e, B:40:0x0098, B:42:0x009d, B:23:0x0044, B:9:0x001b, B:11:0x0025, B:13:0x002b, B:19:0x003c, B:21:0x0041, B:17:0x0034, B:31:0x0073, B:33:0x0085), top: B:47:0x000c, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {all -> 0x0096, blocks: (B:5:0x000c, B:26:0x004b, B:28:0x0067, B:37:0x0092, B:36:0x008e, B:40:0x0098, B:42:0x009d, B:23:0x0044, B:9:0x001b, B:11:0x0025, B:13:0x002b, B:19:0x003c, B:21:0x0041, B:17:0x0034, B:31:0x0073, B:33:0x0085), top: B:47:0x000c, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:31:0x0073, B:33:0x0085), top: B:51:0x0073, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {all -> 0x0096, blocks: (B:5:0x000c, B:26:0x004b, B:28:0x0067, B:37:0x0092, B:36:0x008e, B:40:0x0098, B:42:0x009d, B:23:0x0044, B:9:0x001b, B:11:0x0025, B:13:0x002b, B:19:0x003c, B:21:0x0041, B:17:0x0034, B:31:0x0073, B:33:0x0085), top: B:47:0x000c, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Intent e(Intent intent, Bundle bundle, d90 d90Var) {
        String stringExtra;
        UUID uuidFromString;
        Intent intent2;
        Bundle bundle2;
        Bundle bundle3;
        Set set = mt.a;
        if (!set.contains(l61.class)) {
            try {
                intent.getClass();
                if (set.contains(l61.class)) {
                    uuidFromString = null;
                    if (uuidFromString != null) {
                        intent2 = new Intent();
                        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", j(intent));
                        bundle2 = new Bundle();
                        bundle2.putString("action_id", uuidFromString.toString());
                        if (d90Var != null) {
                            if (mt.a.contains(l61.class)) {
                                bundle3 = null;
                                bundle2.putBundle("error", bundle3);
                            } else {
                                try {
                                    bundle3 = new Bundle();
                                    bundle3.putString("error_description", d90Var.toString());
                                    if (d90Var instanceof f90) {
                                        bundle3.putString("error_type", "UserCanceled");
                                    }
                                } catch (Throwable th) {
                                    mt.a(l61.class, th);
                                    bundle3 = null;
                                }
                                bundle2.putBundle("error", bundle3);
                            }
                        }
                        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                        if (bundle != null) {
                            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                        }
                        return intent2;
                    }
                } else {
                    try {
                        if (k(j(intent))) {
                            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                        } else {
                            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                        }
                        if (stringExtra != null) {
                            try {
                                uuidFromString = UUID.fromString(stringExtra);
                            } catch (IllegalArgumentException unused) {
                                i90 i90Var = i90.a;
                                uuidFromString = null;
                            }
                            if (uuidFromString != null) {
                                intent2 = new Intent();
                                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", j(intent));
                                bundle2 = new Bundle();
                                bundle2.putString("action_id", uuidFromString.toString());
                                if (d90Var != null) {
                                    if (mt.a.contains(l61.class)) {
                                        bundle3 = null;
                                        bundle2.putBundle("error", bundle3);
                                    } else {
                                        bundle3 = new Bundle();
                                        bundle3.putString("error_description", d90Var.toString());
                                        if (d90Var instanceof f90) {
                                            bundle3.putString("error_type", "UserCanceled");
                                        }
                                        bundle2.putBundle("error", bundle3);
                                    }
                                }
                                intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                                if (bundle != null) {
                                    intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                                }
                                return intent2;
                            }
                        } else {
                            uuidFromString = null;
                            if (uuidFromString != null) {
                                intent2 = new Intent();
                                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", j(intent));
                                bundle2 = new Bundle();
                                bundle2.putString("action_id", uuidFromString.toString());
                                if (d90Var != null) {
                                    if (mt.a.contains(l61.class)) {
                                        bundle3 = null;
                                        bundle2.putBundle("error", bundle3);
                                    } else {
                                        bundle3 = new Bundle();
                                        bundle3.putString("error_description", d90Var.toString());
                                        if (d90Var instanceof f90) {
                                            bundle3.putString("error_type", "UserCanceled");
                                        }
                                        bundle2.putBundle("error", bundle3);
                                    }
                                }
                                intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                                if (bundle != null) {
                                    intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                                }
                                return intent2;
                            }
                        }
                    } catch (Throwable th2) {
                        mt.a(l61.class, th2);
                    }
                }
            } catch (Throwable th3) {
                mt.a(l61.class, th3);
                return null;
            }
        }
        return null;
    }

    public static final int h() {
        if (mt.a.contains(l61.class)) {
            return 0;
        }
        try {
            return d[0].intValue();
        } catch (Throwable th) {
            mt.a(l61.class, th);
            return 0;
        }
    }

    public static final Bundle i(Intent intent) {
        if (mt.a.contains(l61.class)) {
            return null;
        }
        try {
            intent.getClass();
            return !k(j(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            mt.a(l61.class, th);
            return null;
        }
    }

    public static final int j(Intent intent) {
        if (mt.a.contains(l61.class)) {
            return 0;
        }
        try {
            intent.getClass();
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            mt.a(l61.class, th);
            return 0;
        }
    }

    public static final boolean k(int i) {
        if (mt.a.contains(l61.class)) {
            return false;
        }
        try {
            return wb.i(d, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            mt.a(l61.class, th);
            return false;
        }
    }

    public static final void l() {
        if (mt.a.contains(l61.class)) {
            return;
        }
        try {
            if (c.compareAndSet(false, true)) {
                i90.c().execute(new g(20));
            }
        } catch (Throwable th) {
            mt.a(l61.class, th);
        }
    }

    public final ArrayList a() {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            return jo.c(new k61(2), new k61(4));
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final Intent c(k61 k61Var, String str, Collection collection, String str2, boolean z, int i, String str3, String str4, boolean z2, String str5, boolean z3, int i2, boolean z4, boolean z5, String str6, String str7, String str8) {
        String str9;
        String strConcat;
        Set set = mt.a;
        if (!set.contains(this)) {
            try {
                String str10 = "com.facebook.katana.ProxyAuth";
                switch (k61Var.b) {
                    case 0:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        str10 = null;
                        break;
                    case 1:
                        str10 = "com.instagram.platform.AppAuthorizeActivity";
                        break;
                }
                if (str10 != null) {
                    Intent intentPutExtra = new Intent().setClassName(k61Var.b(), str10).putExtra("client_id", str);
                    intentPutExtra.getClass();
                    i90 i90Var = i90.a;
                    intentPutExtra.putExtra("facebook_sdk_version", "18.2.3");
                    if (!(collection == null || collection.isEmpty())) {
                        intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
                    }
                    if (!h42.x(str2)) {
                        intentPutExtra.putExtra("e2e", str2);
                    }
                    intentPutExtra.putExtra("state", str3);
                    switch (k61Var.b) {
                        case 1:
                            str9 = "token,signed_request,graph_domain,granted_scopes";
                            break;
                        default:
                            str9 = "id_token,token,signed_request,graph_domain";
                            break;
                    }
                    intentPutExtra.putExtra("response_type", str9);
                    intentPutExtra.putExtra("nonce", str6);
                    intentPutExtra.putExtra("return_scopes", "true");
                    if (z) {
                        intentPutExtra.putExtra("default_audience", ts.c(i));
                    }
                    intentPutExtra.putExtra("legacy_override", i90.d());
                    intentPutExtra.putExtra("auth_type", str4);
                    if (z2) {
                        intentPutExtra.putExtra("fail_on_logged_out", true);
                    }
                    intentPutExtra.putExtra("messenger_page_id", str5);
                    intentPutExtra.putExtra("reset_messenger_state", z3);
                    if (z4) {
                        intentPutExtra.putExtra("fx_app", y00.h(i2));
                    }
                    if (z5) {
                        intentPutExtra.putExtra("skip_dedupe", true);
                    }
                    if (str7 != null && str7.length() != 0) {
                        intentPutExtra.putExtra("https_redirect_uri", str7);
                        return intentPutExtra;
                    }
                    if (str8 != null && str8.length() != 0) {
                        if (set.contains(this)) {
                            strConcat = null;
                        } else {
                            try {
                                strConcat = "intent://".concat(str8);
                            } catch (Throwable th) {
                                mt.a(this, th);
                                strConcat = null;
                            }
                        }
                        intentPutExtra.putExtra("intent_uri_package_target", strConcat);
                    }
                    return intentPutExtra;
                }
            } catch (Throwable th2) {
                mt.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final TreeSet f(k61 k61Var) {
        Uri uri;
        Cursor cursorQuery;
        ProviderInfo providerInfoResolveContentProvider;
        Set set = mt.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = i90.a().getContentResolver();
            String[] strArr = {"version"};
            if (set.contains(this)) {
                uri = null;
            } else {
                try {
                    Uri uri2 = Uri.parse("content://" + k61Var.b() + ".provider.PlatformProvider/versions");
                    uri2.getClass();
                    uri = uri2;
                } catch (Throwable th) {
                    mt.a(this, th);
                    uri = null;
                }
            }
            try {
                try {
                    providerInfoResolveContentProvider = i90.a().getPackageManager().resolveContentProvider(k61Var.b().concat(".provider.PlatformProvider"), 0);
                } catch (RuntimeException e) {
                    Log.e("l61", "Failed to query content resolver.", e);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                        } catch (IllegalArgumentException unused) {
                            Log.e("l61", "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (NullPointerException unused2) {
                        Log.e("l61", "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (SecurityException unused3) {
                        Log.e("l61", "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursorQuery = null;
            }
        } catch (Throwable th4) {
            mt.a(this, th4);
            return null;
        }
    }

    public final jf2 g(List list, int[] iArr) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            l();
            if (list == null) {
                jf2 jf2Var = new jf2();
                jf2Var.b = -1;
                return jf2Var;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k61 k61Var = (k61) it.next();
                TreeSet treeSet = k61Var.a;
                if (treeSet == null || treeSet.isEmpty()) {
                    k61Var.a(false);
                }
                int iB = b(k61Var.a, h(), iArr);
                if (iB != -1) {
                    jf2 jf2Var2 = new jf2();
                    jf2Var2.b = iB;
                    return jf2Var2;
                }
            }
            jf2 jf2Var3 = new jf2();
            jf2Var3.b = -1;
            return jf2Var3;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }
}
