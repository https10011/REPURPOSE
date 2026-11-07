package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class jq extends Activity implements ww0, iv0 {
    public final wq1 a = new wq1(0);
    public final a b = new a(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (nj2.u(decorView, keyEvent)) {
            return true;
        }
        return nj2.v(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (nj2.u(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends gq> T getExtraData(Class<T> cls) {
        cls.getClass();
        if (this.a.get(cls) == null) {
            return null;
        }
        ur.a();
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = wh1.b;
        uh1.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        a aVar = this.b;
        aVar.d("setCurrentState");
        aVar.f(lw0.c);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(gq gqVar) {
        throw null;
    }

    @Override // defpackage.iv0
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    public Context zza() {
        return getApplicationContext();
    }
}
