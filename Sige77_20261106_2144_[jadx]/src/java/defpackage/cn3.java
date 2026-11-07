package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class cn3 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ cn3(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                nc0 nc0Var = fn3.i;
                throw null;
            default:
                obj.getClass();
                throw new ClassCastException();
        }
    }
}
