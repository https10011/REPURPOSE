package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.hjq.toast.BuildConfig;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ai0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ai0(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                ci0 ci0Var = (ci0) this.c;
                Context context = ci0Var.d;
                Executor executor = (Executor) this.d;
                final cu cuVar = (cu) this.e;
                PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (vu.a(cancellationSignal)) {
                    return Unit.a;
                }
                Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                ku.a(ci0Var.h, intent, "BEGIN_SIGN_IN");
                intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingGetCredentialHandle.a);
                try {
                    context.startActivity(intent);
                    break;
                } catch (Exception unused) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!vu.a(cancellationSignal)) {
                        final int i = 7;
                        executor.execute(new Runnable() { // from class: ru
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        CredentialProviderPlayServicesImpl.$r8$lambda$hCjUIdJpkFZZ_R4jPEVDfW9xTXk(cuVar);
                                        break;
                                    case 1:
                                        CredentialProviderPlayServicesImpl.$r8$lambda$eKxW_gs1lUPICybr1syVFaQsVp0(cuVar);
                                        break;
                                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                        CredentialProviderPlayServicesImpl.$r8$lambda$v5kLi_w59Ybz8Cu6DmJc3hm3YW4(cuVar);
                                        break;
                                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                        CredentialProviderPlayServicesImpl.$r8$lambda$ZmeORH0b9a1FJ17DY04w0WU6DDE(cuVar);
                                        break;
                                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                                        CredentialProviderPlayServicesImpl.$r8$lambda$27hAKj8hhFiHQnNA1lTKsiG-Oxw(cuVar);
                                        break;
                                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                                        CredentialProviderPlayServicesImpl.$r8$lambda$e26-TJ45BetGQtJZIcAQ5s9rm3c(cuVar);
                                        break;
                                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                        CredentialProviderPlayServicesImpl.$r8$lambda$v2_cK85gsZZQw32xnN1qU13GbKQ(cuVar);
                                        break;
                                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                        ((gg) cuVar).a(new zh0("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 4));
                                        break;
                                    default:
                                        ((gg) cuVar).a(new zh0("No provider data returned.", 4));
                                        break;
                                }
                            }
                        });
                        Unit unit = Unit.a;
                    }
                }
                return Unit.a;
            default:
                zl0 zl0Var = (zl0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                fc1 fc1Var = (fc1) this.e;
                d61 d61Var = (d61) obj;
                if (((String) x91.v(d61Var, zl0.d, BuildConfig.FLAVOR)).equals(str)) {
                    fc1 fc1VarC = zl0Var.c(d61Var, str);
                    if (fc1VarC != null && !fc1VarC.a.equals(str2)) {
                        synchronized (zl0Var) {
                            zl0Var.d(d61Var, str);
                            HashSet hashSet = new HashSet((Collection) x91.v(d61Var, fc1Var, new HashSet()));
                            hashSet.add(str);
                            d61Var.d(fc1Var, hashSet);
                        }
                    }
                    return null;
                }
                fc1 fc1Var2 = zl0.c;
                long jLongValue = ((Long) x91.v(d61Var, fc1Var2, 0L)).longValue();
                if (jLongValue + 1 == 30) {
                    synchronized (zl0Var) {
                        try {
                            long jLongValue2 = ((Long) x91.v(d61Var, fc1Var2, 0L)).longValue();
                            String str3 = BuildConfig.FLAVOR;
                            Set hashSet2 = new HashSet();
                            String str4 = null;
                            for (Map.Entry entry : d61Var.a().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str5 : set) {
                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                            str3 = ((fc1) entry.getKey()).a;
                                            str4 = str5;
                                            hashSet2 = set;
                                        }
                                    }
                                }
                            }
                            obj2 = null;
                            HashSet hashSet3 = new HashSet(hashSet2);
                            hashSet3.remove(str4);
                            str3.getClass();
                            d61Var.d(new fc1(str3), hashSet3);
                            jLongValue = jLongValue2 - 1;
                            d61Var.c(zl0.c, Long.valueOf(jLongValue));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) x91.v(d61Var, fc1Var, new HashSet()));
                hashSet4.add(str);
                d61Var.d(fc1Var, hashSet4);
                d61Var.c(zl0.c, Long.valueOf(jLongValue + 1));
                d61Var.c(zl0.d, str);
                return obj2;
        }
    }
}
