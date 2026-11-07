package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h50 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile h50 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new js1(cls, charSequence) : super.newEditable(charSequence);
    }
}
