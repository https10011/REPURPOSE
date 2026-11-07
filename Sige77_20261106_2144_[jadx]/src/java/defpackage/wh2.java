package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wh2 extends pg2 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh2(yh2 yh2Var, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 1);
        this.c = taskCompletionSource;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    @Override // defpackage.pg2
    public final boolean F(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strE;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status statusA = ii2.a(parcel, Status.CREATOR);
                BeginSignInResult beginSignInResultA = ii2.a(parcel, BeginSignInResult.CREATOR);
                ii2.c(parcel);
                qt.w(statusA, beginSignInResultA, (TaskCompletionSource) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    H();
                    ri2.v(revocationBoundService).w();
                    return true;
                }
                H();
                yt1 yt1VarA = yt1.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = yt1VarA.b();
                GoogleSignInOptions googleSignInOptionsR = GoogleSignInOptions.X;
                if (googleSignInAccountB != null) {
                    String strE2 = yt1VarA.e("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strE2) || (strE = yt1VarA.e(yt1.f("googleSignInOptions", strE2))) == null) {
                        googleSignInOptionsR = null;
                    } else {
                        try {
                            googleSignInOptionsR = GoogleSignInOptions.R(strE);
                        } catch (JSONException unused) {
                            googleSignInOptionsR = null;
                        }
                    }
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsR;
                gu2.o(googleSignInOptions);
                jr0 jr0Var = new jr0(revocationBoundService, null, oc.a, googleSignInOptions, new oj0(new r41(3), Looper.getMainLooper()));
                int i3 = 10;
                Context context = jr0Var.a;
                ug2 ug2Var = jr0Var.i;
                if (googleSignInAccountB == null) {
                    boolean z = jr0Var.d() == 3;
                    qi2.a.f("Signing out", new Object[0]);
                    qi2.b(context);
                    if (z) {
                        wt1 wt1Var = new wt1(ug2Var);
                        wt1Var.e(Status.e);
                        basePendingResult = wt1Var;
                    } else {
                        oi2 oi2Var = new oi2(ug2Var, 0);
                        ug2Var.a(oi2Var);
                        basePendingResult = oi2Var;
                    }
                    k42 k42Var = new k42(i3);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    basePendingResult.a(new uh2(basePendingResult, taskCompletionSource, k42Var));
                    taskCompletionSource.getTask();
                    return true;
                }
                boolean z2 = jr0Var.d() == 3;
                qi2.a.f("Revoking access", new Object[0]);
                String strE3 = yt1.a(context).e("refreshToken");
                qi2.b(context);
                if (!z2) {
                    oi2 oi2Var2 = new oi2(ug2Var, 1);
                    ug2Var.a(oi2Var2);
                    basePendingResult2 = oi2Var2;
                } else if (strE3 == null) {
                    h01 h01Var = bi2.c;
                    Status status = new Status(4, (String) null, (PendingIntent) null, (ConnectionResult) null);
                    gu2.h("Status code must not be SUCCESS", !status.R());
                    dh2 dh2Var = new dh2(status);
                    dh2Var.e(status);
                    basePendingResult2 = dh2Var;
                } else {
                    bi2 bi2Var = new bi2(strE3);
                    new Thread(bi2Var).start();
                    basePendingResult2 = bi2Var.b;
                }
                k42 k42Var2 = new k42(i3);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                basePendingResult2.a(new uh2(basePendingResult2, taskCompletionSource2, k42Var2));
                taskCompletionSource2.getTask();
                return true;
        }
    }

    public void H() {
        if (gu2.y((RevocationBoundService) this.c, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    public wh2(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.c = revocationBoundService;
    }
}
