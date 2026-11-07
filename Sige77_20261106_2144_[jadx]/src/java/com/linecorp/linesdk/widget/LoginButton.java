package com.linecorp.linesdk.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.linecorp.linesdk.LoginDelegate;
import com.linecorp.linesdk.LoginListener;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.linecorp.linesdk.internal.FragmentWrapper;
import com.linecorp.linesdk.internal.LoginHandler;
import defpackage.dm1;
import defpackage.i4;
import defpackage.kj0;
import defpackage.n60;
import defpackage.nx0;
import defpackage.uq1;
import defpackage.zm;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LoginButton extends AppCompatTextView {
    private LineAuthenticationParams authenticationParams;
    private String channelId;
    private FragmentWrapper fragmentWrapper;
    private View.OnClickListener internalListener;
    private boolean isLineAppAuthEnabled;
    private LoginDelegate loginDelegate;
    private LoginHandler loginHandler;

    public LoginButton(Context context) {
        super(context, (AttributeSet) null);
        this.isLineAppAuthEnabled = true;
        kj0 kj0Var = new kj0(14);
        kj0Var.b = Arrays.asList(dm1.c);
        this.authenticationParams = new LineAuthenticationParams(kj0Var);
        this.loginHandler = new LoginHandler();
        this.internalListener = new zm(this, 3);
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Activity getActivity() {
        Context context = getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        uq1.m("Cannot find an Activity");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setAllCaps(false);
        setGravity(17);
        setText(2131886129);
        setTextColor(getContext().getColor(2131100648));
        setBackgroundResource(2131230844);
        super/*android.view.View*/.setOnClickListener(this.internalListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        String str = this.channelId;
        if (str == null) {
            uq1.m("Channel id should be set.");
            return;
        }
        if (str.isEmpty()) {
            uq1.m("Channel id should not be empty.");
            return;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        String str2 = this.channelId;
        if (fragmentWrapper != null) {
            performLoginWithFragment(str2, fragmentWrapper);
        } else {
            performLoginWithActivity(str2, getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$1(View.OnClickListener onClickListener, View view) {
        this.internalListener.onClick(view);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void performLoginWithActivity(String str, Activity activity) {
        Intent intent;
        LoginHandler loginHandler = this.loginHandler;
        boolean z = this.isLineAppAuthEnabled;
        LineAuthenticationParams lineAuthenticationParams = this.authenticationParams;
        loginHandler.getClass();
        int i = 7;
        if (z) {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new nx0(activity, str));
            if (!n60.b) {
                n60.b = true;
                Executors.newSingleThreadExecutor().execute(new i4(activity.getApplicationContext(), i));
            }
            int i2 = LineAuthenticationActivity.d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        } else {
            nx0 nx0Var = new nx0(activity, str);
            nx0Var.b = true;
            LineAuthenticationConfig lineAuthenticationConfig2 = new LineAuthenticationConfig(nx0Var);
            if (!n60.b) {
                n60.b = true;
                Executors.newSingleThreadExecutor().execute(new i4(activity.getApplicationContext(), i));
            }
            int i3 = LineAuthenticationActivity.d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig2);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        }
        activity.startActivityForResult(intent, 1);
    }

    private void performLoginWithFragment(String str, FragmentWrapper fragmentWrapper) {
        Intent intent;
        LoginHandler loginHandler = this.loginHandler;
        Activity activity = getActivity();
        boolean z = this.isLineAppAuthEnabled;
        LineAuthenticationParams lineAuthenticationParams = this.authenticationParams;
        loginHandler.getClass();
        int i = 7;
        if (z) {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new nx0(activity, str));
            if (!n60.b) {
                n60.b = true;
                Executors.newSingleThreadExecutor().execute(new i4(activity.getApplicationContext(), i));
            }
            int i2 = LineAuthenticationActivity.d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        } else {
            nx0 nx0Var = new nx0(activity, str);
            nx0Var.b = true;
            LineAuthenticationConfig lineAuthenticationConfig2 = new LineAuthenticationConfig(nx0Var);
            if (!n60.b) {
                n60.b = true;
                Executors.newSingleThreadExecutor().execute(new i4(activity.getApplicationContext(), i));
            }
            int i3 = LineAuthenticationActivity.d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig2);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        }
        Fragment fragment = fragmentWrapper.a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = fragmentWrapper.b;
        if (fragment2 != null) {
            fragment2.O(intent, 1, (Bundle) null);
        }
    }

    public void addLoginListener(LoginListener loginListener) {
        if (this.loginDelegate != null) {
            this.loginHandler.a.add(loginListener);
        } else {
            uq1.m("You must set LoginDelegate through setLoginDelegate()  first");
        }
    }

    public void enableLineAppAuthentication(boolean z) {
        this.isLineAppAuthEnabled = z;
    }

    public void removeLoginListener(LoginListener loginListener) {
        this.loginHandler.a.remove(loginListener);
    }

    public void setAuthenticationParams(LineAuthenticationParams lineAuthenticationParams) {
        this.authenticationParams = lineAuthenticationParams;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setFragment(Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper();
        fragmentWrapper.a = fragment;
        this.fragmentWrapper = fragmentWrapper;
    }

    public void setLoginDelegate(LoginDelegate loginDelegate) {
        throw new RuntimeException("Unexpected LoginDelegate, please use the provided Factory to create the instance");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        super/*android.view.View*/.setOnClickListener(new View.OnClickListener() { // from class: k01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setOnClickListener$1(onClickListener, view);
            }
        });
    }

    public void setFragment(androidx.fragment.app.Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper();
        fragmentWrapper.b = fragment;
        this.fragmentWrapper = fragmentWrapper;
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLineAppAuthEnabled = true;
        kj0 kj0Var = new kj0(14);
        kj0Var.b = Arrays.asList(dm1.c);
        this.authenticationParams = new LineAuthenticationParams(kj0Var);
        this.loginHandler = new LoginHandler();
        this.internalListener = new zm(this, 3);
        init();
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLineAppAuthEnabled = true;
        kj0 kj0Var = new kj0(14);
        kj0Var.b = Arrays.asList(dm1.c);
        this.authenticationParams = new LineAuthenticationParams(kj0Var);
        this.loginHandler = new LoginHandler();
        this.internalListener = new zm(this, 3);
        init();
    }
}
