package defpackage;

import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class iz1 implements g81, FunctionAdapter {
    public final /* synthetic */ us a;

    public iz1(us usVar) {
        this.a = usVar;
    }

    @Override // defpackage.g81
    public final /* synthetic */ void a(Object obj) {
        this.a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g81) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final wg0 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
