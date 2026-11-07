package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dx extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx(yx yxVar, int i) {
        super(0);
        this.a = i;
        this.b = yxVar;
    }

    public final Object invoke() throws IOException {
        switch (this.a) {
            case 0:
                return ((gb0) this.b.W.getValue()).b;
            default:
                db0 db0Var = this.b.a;
                File canonicalFile = ((File) db0Var.b.invoke()).getCanonicalFile();
                synchronized (db0.d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = db0.c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new gb0(canonicalFile, (dr1) db0Var.a.invoke(canonicalFile), new vt(canonicalFile, 1));
        }
    }
}
