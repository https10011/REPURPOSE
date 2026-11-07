package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzx;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bl2 extends en2 {
    public final /* synthetic */ int n;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl2(String str, int i) {
        super(1);
        this.n = i;
        switch (i) {
            case 1:
                super(10);
                gu2.l("RECAPTCHA_ENTERPRISE");
                this.o = new qv2(str, 5);
                break;
            default:
                gu2.m(str, "refresh token cannot be null");
                this.o = str;
                break;
        }
    }

    @Override // defpackage.en2
    public final String a() {
        switch (this.n) {
            case 0:
                return "getAccessToken";
            case 1:
                return "getRecaptchaConfig";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "linkPhoneAuthCredential";
            default:
                return "linkEmailAuthCredential";
        }
    }

    @Override // defpackage.en2
    public final void d(TaskCompletionSource taskCompletionSource, gm2 gm2Var) {
        int i = this.n;
        kj0 kj0Var = this.b;
        Object obj = this.o;
        int i2 = 9;
        switch (i) {
            case 0:
                this.g = new yd2(i2, this, taskCompletionSource);
                String str = (String) obj;
                gm2Var.getClass();
                gu2.l(str);
                gu2.o(kj0Var);
                ox1 ox1Var = gm2Var.a;
                rd2 rd2Var = new rd2(kj0Var, gm2.b);
                ox1Var.getClass();
                gu2.l(str);
                wy2 wy2Var = new wy2(str);
                qq qqVar = (qq) ox1Var.a;
                kj0 kj0Var2 = new kj0(ox1Var, rd2Var);
                wm2 wm2Var = (wm2) qqVar.c;
                sp0.K(wm2Var.q("/token", (String) qqVar.f), wy2Var, kj0Var2, new zzahd(), (ep1) wm2Var.b);
                break;
            case 1:
                this.g = new yd2(i2, this, taskCompletionSource);
                qv2 qv2Var = (qv2) obj;
                gm2Var.getClass();
                gu2.o(qv2Var);
                ox1 ox1Var2 = gm2Var.a;
                rd2 rd2Var2 = new rd2(kj0Var, gm2.b);
                ox1Var2.getClass();
                qq qqVar2 = (qq) ox1Var2.a;
                ri2 ri2Var = new ri2();
                ri2Var.a = rd2Var2;
                Objects.requireNonNull(ox1Var2);
                qqVar2.getClass();
                wm2 wm2Var2 = (wm2) qqVar2.b;
                String strConcat = wm2Var2.q("/recaptchaConfig", (String) qqVar2.f).concat("&clientType=CLIENT_TYPE_ANDROID&version=RECAPTCHA_ENTERPRISE");
                String str2 = qv2Var.b;
                if (str2 != null && !str2.isEmpty()) {
                    strConcat = strConcat + "&tenantId=" + str2;
                }
                kp2 kp2Var = new kp2();
                ep1 ep1Var = (ep1) wm2Var2.b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strConcat).openConnection();
                    httpURLConnection.setConnectTimeout(60000);
                    ep1Var.H(httpURLConnection);
                    sp0.L(httpURLConnection, ri2Var, kp2Var);
                } catch (SocketTimeoutException unused) {
                    ri2Var.zza("TIMEOUT");
                    return;
                } catch (UnknownHostException unused2) {
                    ri2Var.zza("<<Network Error>>");
                    return;
                } catch (IOException e) {
                    ri2Var.zza(e.getMessage());
                    return;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.g = new yd2(i2, this, taskCompletionSource);
                String strE0 = this.d.e0();
                tg2 tg2VarG = rq0.G((PhoneAuthCredential) obj);
                gu2.l(strE0);
                gm2Var.getClass();
                gu2.o(kj0Var);
                gu2.l(strE0);
                ox1 ox1Var3 = gm2Var.a;
                rd2 rd2Var3 = new rd2(kj0Var, gm2.b);
                ox1Var3.getClass();
                gu2.l(strE0);
                ox1Var3.A(strE0, new p11(ox1Var3, tg2VarG, rd2Var3));
                break;
            default:
                this.g = new yd2(i2, this, taskCompletionSource);
                EmailAuthCredential emailAuthCredential = (EmailAuthCredential) obj;
                FirebaseUser firebaseUser = this.d;
                emailAuthCredential.getClass();
                emailAuthCredential.d = firebaseUser.e0();
                emailAuthCredential.e = true;
                gm2Var.b(new mo2(emailAuthCredential, null, null), kj0Var);
                break;
        }
    }

    @Override // defpackage.en2
    public final void e() {
        switch (this.n) {
            case 0:
                if (TextUtils.isEmpty(this.h.a)) {
                    zzahd zzahdVar = this.h;
                    String str = (String) this.o;
                    zzahdVar.getClass();
                    gu2.l(str);
                    zzahdVar.a = str;
                }
                this.e.b(this.h, this.d);
                f(yu2.a(this.h.b));
                break;
            case 1:
                f(this.l);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                FirebaseUser firebaseUserN = md2.n(this.c, this.i);
                this.e.b(this.h, firebaseUserN);
                f(new zzx(firebaseUserN));
                break;
            default:
                FirebaseUser firebaseUserN2 = md2.n(this.c, this.i);
                this.e.b(this.h, firebaseUserN2);
                f(new zzx(firebaseUserN2));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl2(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.n = 2;
        gu2.p(phoneAuthCredential, "credential cannot be null");
        this.o = phoneAuthCredential;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl2(EmailAuthCredential emailAuthCredential) {
        super(2);
        this.n = 3;
        gu2.p(emailAuthCredential, "credential cannot be null");
        this.o = emailAuthCredential;
    }
}
