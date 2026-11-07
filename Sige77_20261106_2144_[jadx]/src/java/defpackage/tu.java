package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class tu implements Function1 {
    public final /* synthetic */ CancellationSignal a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ cu c;

    public /* synthetic */ tu(CancellationSignal cancellationSignal, Executor executor, cu cuVar) {
        this.a = cancellationSignal;
        this.b = executor;
        this.c = cuVar;
    }

    public final Object invoke(Object obj) {
        return CredentialProviderPlayServicesImpl.$r8$lambda$CkXA6uyZF5r3Uy4uE_kF2MrG3TY(this.a, this.b, this.c, (Void) obj);
    }
}
