package defpackage;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class re0 implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe0 b;

    public /* synthetic */ re0(xe0 xe0Var, int i) {
        this.a = i;
        this.b = xe0Var;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.a;
        xe0 xe0Var = this.b;
        switch (i) {
            case 0:
                return new ff0(xe0Var, ClassLoader.getSystemClassLoader());
            default:
                return new ef0(xe0Var, ClassLoader.getSystemClassLoader(), ef0.c, ef0.d);
        }
    }
}
