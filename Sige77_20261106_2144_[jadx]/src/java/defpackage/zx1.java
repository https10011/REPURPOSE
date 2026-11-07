package defpackage;

import com.google.firebase.Timestamp;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class zx1 extends PropertyReference1Impl {
    public static final zx1 a = new zx1(Timestamp.class, "seconds", "getSeconds()J", 0);

    public final Object get(Object obj) {
        return Long.valueOf(((Timestamp) obj).a);
    }
}
