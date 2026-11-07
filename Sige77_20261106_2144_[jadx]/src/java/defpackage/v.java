package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v implements a72 {
    public int a;
    public boolean b;
    public final Object c;

    public v(MessageDigest messageDigest, int i) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.a = i;
    }

    @Override // defpackage.a72
    public void a() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        ActionBarContextView.b(actionBarContextView, this.a);
    }

    @Override // defpackage.a72
    public void b() {
        this.b = true;
    }

    @Override // defpackage.a72
    public void c() {
        ActionBarContextView.a((ActionBarContextView) this.c);
        this.b = false;
    }

    public v(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.b = false;
    }
}
