package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q32 implements e51 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final p32 a;

    public q32(p32 p32Var) {
        this.a = p32Var;
    }

    @Override // defpackage.e51
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.e51
    public final d51 b(Object obj, int i, int i2, da1 da1Var) {
        lw xbVar;
        Uri uri = (Uri) obj;
        y71 y71Var = new y71(uri);
        p32 p32Var = this.a;
        switch (p32Var.a) {
            case 0:
                xbVar = new xb(p32Var.b, uri, p32Var.c, 0);
                break;
            case 1:
                xbVar = new xb(p32Var.b, uri, p32Var.c, 1);
                break;
            default:
                xbVar = new bu1(p32Var.b, uri, p32Var.c);
                break;
        }
        return new d51(y71Var, xbVar);
    }
}
