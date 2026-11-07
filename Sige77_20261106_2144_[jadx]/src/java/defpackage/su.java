package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class su implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ cu c;

    public /* synthetic */ su(Executor executor, cu cuVar, int i) {
        this.a = i;
        this.b = executor;
        this.c = cuVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return CredentialProviderPlayServicesImpl.$r8$lambda$deaEx7cFJz8WB4dww9fPUSax2YE(this.b, this.c);
            case 1:
                return CredentialProviderPlayServicesImpl.$r8$lambda$VsxIaY9CMEklHrOXk5cdkiRsqcE(this.b, this.c);
            default:
                return CredentialProviderPlayServicesImpl.$r8$lambda$mCecmz7sSDa7vQZdPoDQHAX0H3U(this.b, this.c);
        }
    }
}
