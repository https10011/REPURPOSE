package defpackage;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class n72 extends RuntimeException {
    public final Fragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n72(Fragment fragment, String str) {
        super(str);
        fragment.getClass();
        this.a = fragment;
    }
}
