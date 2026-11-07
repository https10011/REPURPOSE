package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import defpackage.ir1;
import defpackage.iu1;
import defpackage.jx0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineAuthenticationActivity extends Activity {
    public static final /* synthetic */ int d = 0;
    public boolean a = false;
    public LineAuthenticationStatus b;
    public d c;

    public final void a(LineLoginResult lineLoginResult) {
        LineAuthenticationStatus lineAuthenticationStatus = this.b;
        if (lineAuthenticationStatus == null) {
            finish();
            return;
        }
        int i = lineAuthenticationStatus.e;
        if ((i != 2 || this.a) && i != 4) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("authentication_result", lineLoginResult);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.b.e == 2) {
            d dVar = this.c;
            if (i != 3) {
                dVar.getClass();
            } else {
                if (dVar.h.e == 3) {
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new c(dVar), 1000L);
            }
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        LineAuthenticationStatus lineAuthenticationStatus;
        super.onCreate(bundle);
        setContentView(2131492925);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null && data.getScheme().equals("lineauth")) {
            d.i = intent;
            finish();
            return;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        LineAuthenticationParams lineAuthenticationParams = (LineAuthenticationParams) intent.getParcelableExtra("authentication_params");
        if (lineAuthenticationConfig == null || lineAuthenticationParams == null) {
            a(LineLoginResult.b("The requested parameter is illegal."));
            return;
        }
        if (bundle == null || (lineAuthenticationStatus = (LineAuthenticationStatus) bundle.getParcelable("authentication_status")) == null) {
            lineAuthenticationStatus = new LineAuthenticationStatus();
        }
        this.b = lineAuthenticationStatus;
        this.c = new d(this, lineAuthenticationConfig, lineAuthenticationStatus, lineAuthenticationParams);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.b.e == 2) {
            this.c.a(intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        int i = this.b.e;
        if (i == 1) {
            d dVar = this.c;
            LineAuthenticationActivity lineAuthenticationActivity = dVar.a;
            LineAuthenticationStatus lineAuthenticationStatus = dVar.h;
            lineAuthenticationStatus.e = 2;
            PKCECode pKCECode = new PKCECode(iu1.a(64));
            lineAuthenticationStatus.a = pKCECode;
            try {
                ir1 ir1VarA = dVar.e.a(lineAuthenticationActivity, dVar.b, pKCECode, dVar.g);
                Intent intent = (Intent) ir1VarA.c;
                if (ir1VarA.b) {
                    lineAuthenticationActivity.startActivity(intent, null);
                } else {
                    lineAuthenticationActivity.startActivityForResult(intent, 3, null);
                }
                lineAuthenticationStatus.b = (String) ir1VarA.d;
            } catch (ActivityNotFoundException e) {
                lineAuthenticationStatus.e = 4;
                lineAuthenticationActivity.a(LineLoginResult.a(jx0.f, new LineApiError(e, 1)));
            }
        } else if (i != 3) {
            d dVar2 = this.c;
            dVar2.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new c(dVar2), 1000L);
        }
        this.a = false;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authentication_status", this.b);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        this.a = true;
    }
}
