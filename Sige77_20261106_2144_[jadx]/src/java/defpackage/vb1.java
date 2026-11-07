package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.d;
import com.facebook.login.e;
import com.facebook.login.h;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class vb1 implements ServiceConnection {
    public final int W;
    public final String X;
    public final Context a;
    public final c6 b;
    public eg c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int i;
    public final String v;
    public final String w;

    public vb1(Context context, String str, String str2, String str3) {
        str.getClass();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.f = 65536;
        this.i = 65537;
        this.v = str;
        this.w = str2;
        this.W = 20121101;
        this.X = str3;
        this.b = new c6(this, 4);
    }

    public final void a(Bundle bundle) {
        if (this.d) {
            this.d = false;
            eg egVar = this.c;
            if (egVar != null) {
                GetTokenLoginMethodHandler getTokenLoginMethodHandler = (GetTokenLoginMethodHandler) egVar.b;
                LoginClient.Request request = (LoginClient.Request) egVar.c;
                request.getClass();
                d dVar = getTokenLoginMethodHandler.c;
                View view = null;
                if (dVar != null) {
                    dVar.c = null;
                }
                getTokenLoginMethodHandler.c = null;
                ox1 ox1Var = getTokenLoginMethodHandler.d().e;
                if (ox1Var != null) {
                    View view2 = ((h) ox1Var.a).O0;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                        view2 = null;
                    }
                    view2.setVisibility(8);
                }
                if (bundle != null) {
                    List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = x50.a;
                    }
                    Set<String> set = request.b;
                    if (set == null) {
                        set = a60.a;
                    }
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains("openid") && (string == null || string.length() == 0)) {
                        getTokenLoginMethodHandler.d().k();
                        return;
                    }
                    if (stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            getTokenLoginMethodHandler.o(bundle, request);
                            return;
                        }
                        ox1 ox1Var2 = getTokenLoginMethodHandler.d().e;
                        if (ox1Var2 != null) {
                            View view3 = ((h) ox1Var2.a).O0;
                            if (view3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                            } else {
                                view = view3;
                            }
                            view.setVisibility(0);
                        }
                        String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 != null) {
                            h42.o(new e(bundle, getTokenLoginMethodHandler, request), string3);
                            return;
                        } else {
                            uq1.q("Required value was null.");
                            return;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        getTokenLoginMethodHandler.a("new_permissions", TextUtils.join(",", hashSet));
                    }
                    request.b = hashSet;
                }
                getTokenLoginMethodHandler.d().k();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        this.e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.v);
        String str = this.X;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.w;
        if (str2 != null) {
            bundle.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        Message messageObtain = Message.obtain((Handler) null, this.f);
        messageObtain.arg1 = this.W;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
