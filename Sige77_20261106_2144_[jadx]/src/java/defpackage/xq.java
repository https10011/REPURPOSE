package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class xq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xq(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int i2 = ConnectPlan.j0;
                CertificateChainCleaner certificateChainCleaner = ((CertificatePinner) obj3).b;
                certificateChainCleaner.getClass();
                return certificateChainCleaner.a(((Address) obj).h.d, ((Handshake) obj2).a());
            case 1:
                return CredentialProviderPlayServicesImpl.$r8$lambda$_y5WH3MEXM44F4UiflADvlnUoCA((Executor) obj3, (cu) obj2, (Ref.ObjectRef) obj);
            default:
                return CredentialProviderPlayServicesImpl.$r8$lambda$I96JcpYfaG8OJdM-2J7UmFIJHiE((Exception) obj3, (Executor) obj2, (cu) obj);
        }
    }
}
