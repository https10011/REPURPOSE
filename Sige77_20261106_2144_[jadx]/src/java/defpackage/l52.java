package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l52 extends k11 {
    public final /* synthetic */ int e;

    public l52(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.k11
    public final Object c(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(s52.c(view));
            case 1:
                return s52.a(view);
            default:
                return Boolean.valueOf(s52.b(view));
        }
    }

    @Override // defpackage.k11
    public final void d(View view, Object obj) {
        switch (this.e) {
            case 0:
                s52.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                s52.e(view, (CharSequence) obj);
                break;
            default:
                s52.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.k11
    public final boolean g(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
