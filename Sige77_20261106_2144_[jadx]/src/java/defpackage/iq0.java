package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class iq0 implements jq0 {
    public final InputContentInfo a;

    public iq0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.jq0
    public final ClipDescription a() {
        return this.a.getDescription();
    }

    @Override // defpackage.jq0
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.jq0
    public final Uri d() {
        return this.a.getContentUri();
    }

    @Override // defpackage.jq0
    public final void e() {
        this.a.requestPermission();
    }

    @Override // defpackage.jq0
    public final Uri g() {
        return this.a.getLinkUri();
    }

    public iq0(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
