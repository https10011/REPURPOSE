package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class qt0 implements w71 {
    public final /* synthetic */ int a;

    public /* synthetic */ qt0(int i) {
        this.a = i;
    }

    @Override // defpackage.e60
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new l60("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                x71 x71Var = (x71) obj2;
                x71Var.a(vd1.g, entry.getKey());
                x71Var.a(vd1.h, entry.getValue());
                return;
            default:
                throw new l60("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
