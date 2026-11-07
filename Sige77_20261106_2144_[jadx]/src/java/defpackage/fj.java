package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fj implements lw {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lw
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // defpackage.lw
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.lw
    public final void h() {
        int i = this.a;
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    kwVar.c(kj.a((File) obj));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    kwVar.b(e);
                    return;
                }
                break;
            default:
                kwVar.c(obj);
                break;
        }
    }

    @Override // defpackage.lw
    public final int j() {
        switch (this.a) {
        }
        return 1;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
