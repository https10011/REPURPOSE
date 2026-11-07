package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class fu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                hu huVar = (hu) this.c;
                Context context = huVar.d;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (vu.a(cancellationSignal)) {
                    return Unit.a;
                }
                Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                ku.a(huVar.h, intent, "BEGIN_SIGN_IN");
                intent.putExtra("EXTRA_FLOW_PENDING_INTENT", beginSignInResult.a);
                try {
                    context.startActivity(intent);
                    break;
                } catch (Exception unused) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!vu.a(cancellationSignal)) {
                        huVar.e().execute(new y1(huVar, 13));
                        Unit unit = Unit.a;
                    }
                }
                return Unit.a;
            case 1:
                DiskLruCache diskLruCache = (DiskLruCache) this.b;
                DiskLruCache.Editor editor = (DiskLruCache.Editor) this.c;
                ((IOException) obj).getClass();
                synchronized (diskLruCache) {
                    editor.c();
                }
                return Unit.a;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                jl0 jl0Var = (jl0) this.b;
                jl0Var.c.removeCallbacks((bh0) this.c);
                return Unit.a;
            default:
                zl0 zl0Var = (zl0) this.b;
                String str = (String) this.c;
                d61 d61Var = (d61) obj;
                d61Var.c(zl0.d, str);
                zl0Var.d(d61Var, str);
                return null;
        }
    }
}
