package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResult;
import com.appsflyer.internal.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.auth.LineLoginResult;
import java.text.MessageFormat;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class yf implements h5, OnSuccessListener, OnFailureListener, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg b;

    public /* synthetic */ yf(yg ygVar, int i) {
        this.a = i;
        this.b = ygVar;
    }

    @Override // defpackage.h5
    public void b(Object obj) {
        LineLoginResult lineLoginResultB;
        String str;
        int i = this.a;
        yg ygVar = this.b;
        switch (i) {
            case 0:
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                if (!((Boolean) obj).booleanValue()) {
                    new Handler(Looper.getMainLooper()).postDelayed(new sf(ygVar, 15), 1000L);
                } else {
                    kv.E("Get permissions for push");
                }
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                Intent intent = ((ActivityResult) obj).b;
                if (intent == null) {
                    lineLoginResultB = LineLoginResult.b("Callback intent is null");
                } else {
                    lineLoginResultB = (LineLoginResult) intent.getParcelableExtra("authentication_result");
                    if (lineLoginResultB == null) {
                        lineLoginResultB = LineLoginResult.b("Authentication result is not found.");
                    }
                }
                LineApiError lineApiError = lineLoginResultB.i;
                int iOrdinal = lineLoginResultB.a.ordinal();
                if (iOrdinal == 0) {
                    LineCredential lineCredential = lineLoginResultB.f;
                    if (lineCredential != null) {
                        ygVar.o0.loadUrl(d.a("javascript:window.", ygVar.H0, "('", lineCredential.a.a, "')"));
                    } else {
                        lineApiError.toString();
                        ygVar.o0.loadUrl("javascript:window." + ygVar.H0 + "('Failure: LineCredential is null')");
                    }
                } else if (iOrdinal != 1) {
                    lineApiError.toString();
                    ygVar.o0.loadUrl(String.format("javascript:window.%s('Failure: %s')", ygVar.H0, lineApiError));
                }
                break;
            default:
                ActivityResult activityResult = (ActivityResult) obj;
                int i4 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                int i5 = activityResult.a;
                Intent intent2 = activityResult.b;
                int statusCode = -1;
                if (i5 != -1 || intent2 == null) {
                    if (intent2 != null) {
                        Task taskW = r93.w(intent2);
                        if (!taskW.isSuccessful()) {
                            Exception exception = taskW.getException();
                            if (exception instanceof i7) {
                                statusCode = ((i7) exception).getStatusCode();
                            }
                        }
                    }
                    ygVar.w("Failure: Google Sign-In canceled or failed. (" + statusCode + ")");
                } else {
                    try {
                        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) r93.w(intent2).getResult(i7.class);
                        if (googleSignInAccount == null || (str = googleSignInAccount.b) == null) {
                            ygVar.w("Failure: Google Sign-In returned null");
                        } else {
                            ygVar.z(str);
                        }
                    } catch (i7 e) {
                        ygVar.w(MessageFormat.format("Failure: Google Sign-In failed: {0} statusCode={1}", e.getMessage(), Integer.valueOf(e.getStatusCode())));
                        return;
                    }
                }
                break;
        }
    }

    public void onComplete(Task task) {
        int i = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
        boolean zIsSuccessful = task.isSuccessful();
        yg ygVar = this.b;
        if (!zIsSuccessful) {
            ygVar.w("Failure: " + task.getException());
        } else {
            FirebaseUser firebaseUser = FirebaseAuth.getInstance().f;
            if (firebaseUser == null) {
                ygVar.w("Failure: Google Sign-In user null");
            } else {
                FirebaseAuth.getInstance(firebaseUser.W()).b(firebaseUser).addOnSuccessListener(new yf(ygVar, 7));
            }
        }
    }

    public void onFailure(Exception exc) {
        int i = this.a;
        yg ygVar = this.b;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ygVar.w("Failure: " + exc.getMessage());
                break;
            default:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ygVar.w("Failure: " + exc.getMessage());
                break;
        }
    }

    public void onSuccess(Object obj) {
        int i = this.a;
        yg ygVar = this.b;
        switch (i) {
            case 1:
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                zzad zzadVarC = ((AuthResult) obj).C();
                if (zzadVarC != null) {
                    Task taskB = FirebaseAuth.getInstance(zzadVarC.W()).b(zzadVarC);
                    taskB.addOnCompleteListener(new ag(ygVar, taskB, 0));
                } else {
                    ygVar.w("Failure: Sign-In user null");
                }
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                zzad zzadVarC2 = ((AuthResult) obj).C();
                if (zzadVarC2 != null) {
                    Task taskB2 = FirebaseAuth.getInstance(zzadVarC2.W()).b(zzadVarC2);
                    taskB2.addOnCompleteListener(new ag(ygVar, taskB2, 1));
                } else {
                    ygVar.w("Failure: Sign-In user null");
                }
                break;
            default:
                int i4 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ygVar.w(((ki0) obj).a);
                break;
        }
    }
}
