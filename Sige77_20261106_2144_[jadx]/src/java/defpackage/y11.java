package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y11 extends b1 {
    public final /* synthetic */ p11 b;

    public y11(p11 p11Var) {
        this.b = p11Var;
    }

    @Override // defpackage.d0
    public final int a() {
        return ((Matcher) this.b.b).groupCount() + 1;
    }

    @Override // defpackage.d0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // defpackage.b1, java.util.List
    public final Object get(int i) {
        String strGroup = ((Matcher) this.b.b).group(i);
        return strGroup == null ? BuildConfig.FLAVOR : strGroup;
    }

    @Override // defpackage.b1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // defpackage.b1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
