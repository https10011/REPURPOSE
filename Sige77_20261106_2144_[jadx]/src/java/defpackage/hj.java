package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hj implements uw {
    public final /* synthetic */ int a;

    public /* synthetic */ hj(int i) {
        this.a = i;
    }

    @Override // defpackage.uw
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // defpackage.uw
    public final vw b(Object obj) {
        switch (this.a) {
            case 0:
                return new kj0((ByteBuffer) obj, 6);
            case 1:
                return new ww(obj);
            default:
                return new a((ParcelFileDescriptor) obj);
        }
    }
}
